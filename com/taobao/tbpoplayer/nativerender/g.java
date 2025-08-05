package com.taobao.tbpoplayer.nativerender;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.EventActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.EventModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1189381572);
    }

    public static void a(e eVar, StateBaseModel stateBaseModel, JSONObject jSONObject) {
        EventModel eventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4414f282", new Object[]{eVar, stateBaseModel, jSONObject});
        } else if (eVar == null || stateBaseModel == null || jSONObject == null) {
        } else {
            try {
                String string = jSONObject.getString("sourceName");
                String string2 = jSONObject.getString("event");
                JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && jSONObject2 != null) {
                    EventActionModel eventActionModel = null;
                    EventModel eventModel2 = stateBaseModel.event;
                    if (eventModel2 != null && eventModel2.isValid()) {
                        Iterator<EventActionModel> it = eventModel2.action.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                EventActionModel next = it.next();
                                if (next != null && next.isValid() && next.sourceName.equals(string) && next.eventName.equals(string2)) {
                                    eventActionModel = next;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (eventActionModel == null && (eventModel = eVar.a().e().event) != null && eventModel.isValid()) {
                        Iterator<EventActionModel> it2 = eventModel.action.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                EventActionModel next2 = it2.next();
                                if (next2 != null && next2.isValid() && next2.sourceName.equals(string) && next2.eventName.equals(string2)) {
                                    eventActionModel = next2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (eventActionModel == null) {
                        return;
                    }
                    a(eVar, stateBaseModel, eventActionModel, string, string2, jSONObject2);
                    com.alibaba.poplayer.utils.c.a("EventHandler.eventInfo=%s.handleEvent=%s.", jSONObject, eventActionModel);
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("EventHandler.handleEvent.error", th);
            }
        }
    }

    public static void a(e eVar, StateBaseModel stateBaseModel, EventActionModel eventActionModel, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e62b08", new Object[]{eVar, stateBaseModel, eventActionModel, str, str2, jSONObject});
            return;
        }
        try {
            if (eventActionModel.listenTimes > 0 && eventActionModel.costTimes >= eventActionModel.listenTimes) {
                com.alibaba.poplayer.utils.c.a("EventHandler.handleSceneEvent.listenTimes.IsMax.return.listenTimes=%s.costTimes=%s", Long.valueOf(eventActionModel.listenTimes), Integer.valueOf(eventActionModel.costTimes));
                return;
            }
            List<EventActionModel.ConditionHandleModel> list = eventActionModel.onEvent;
            eVar.a(str, str2, jSONObject);
            if (list != null && !list.isEmpty()) {
                for (EventActionModel.ConditionHandleModel conditionHandleModel : list) {
                    if (conditionHandleModel != null && conditionHandleModel.isValid()) {
                        boolean a2 = b.a(conditionHandleModel.condition, eVar, false);
                        com.alibaba.poplayer.utils.c.a("EventHandler.handleSceneEvent.conditionHandleModel=%s.checkResult=%s", conditionHandleModel, Boolean.valueOf(a2));
                        if (a2) {
                            eventActionModel.costTimes++;
                            if ("click".equals(conditionHandleModel.action.type)) {
                                conditionHandleModel.action.type = "scene";
                            }
                            eVar.a(stateBaseModel, "scene", conditionHandleModel.action, conditionHandleModel.actions);
                            return;
                        }
                    }
                }
                return;
            }
            eventActionModel.costTimes++;
            if ("click".equals(eventActionModel.action.type)) {
                eventActionModel.action.type = "scene";
            }
            eVar.a(stateBaseModel, "scene", eventActionModel.action, eventActionModel.actions);
            com.alibaba.poplayer.utils.c.a("EventHandler.handleSceneEvent.conditionHandle.IsEmpty.sceneEventModel=%s.", eventActionModel);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("EventHandler.handleSceneEvent.error", th);
        }
    }
}
