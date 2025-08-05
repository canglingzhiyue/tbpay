package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = axn.CODE)
/* loaded from: classes2.dex */
public final class axn extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.event.routerEvent";
    public static final String EVENT_TYPE = "routerEvent";

    /* renamed from: a  reason: collision with root package name */
    private List<AURARenderComponent> f25674a;

    static {
        kge.a(-1514796651);
    }

    public static /* synthetic */ Object ipc$super(axn axnVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f25674a = (List) aURAGlobalData.get("render_view_item_models", List.class);
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, List<Event>> map;
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            arc.a().b("AURARouterEventExtension", "innerHandleEvent", "eventsFields is null!");
            return;
        }
        String string = c.getString(fin.EVENT_KEY);
        String string2 = c.getString("target");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            arc.a().b("AURARouterEventExtension", "innerHandleEvent", "eventKey or target is null!");
            return;
        }
        List<AURARenderComponent> list2 = this.f25674a;
        if (list2 == null) {
            arc.a().b("AURARouterEventExtension", "innerHandleEvent", "globalData auraRenderComponents is null!");
            return;
        }
        for (AURARenderComponent aURARenderComponent : list2) {
            if (string2.equals(aURARenderComponent.key) && (aURARenderComponentData = aURARenderComponent.data) != null && (map = aURARenderComponentData.events) != null && (list = map.get(string)) != null) {
                a(aURARenderComponent, a(list, c), eventModel.e());
            }
        }
    }

    private void a(AURARenderComponent aURARenderComponent, List<Event> list, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc841ed", new Object[]{this, aURARenderComponent, list, objArr});
            return;
        }
        for (Event event : list) {
            d dVar = new d();
            dVar.a(event.getId());
            dVar.a(aURARenderComponent);
            dVar.a(objArr);
            dVar.b(event.getTag());
            dVar.a(event.getFields());
            c.a(b().b(), event.getType(), dVar);
        }
    }

    private List<Event> a(List<Event> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ea20cb0", new Object[]{this, list, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("prependActions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("appendActions");
        JSONArray jSONArray3 = jSONObject.getJSONArray("replaceActions");
        if (jSONArray3 == null && jSONArray == null && jSONArray2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Event event : list) {
            try {
                arrayList.add(event.m150clone());
            } catch (Throwable th) {
                ard a2 = arc.a();
                a2.a("clone exception " + th.getMessage());
                return list;
            }
        }
        if (jSONArray3 != null) {
            a(arrayList, new JSONArray(new ArrayList(jSONArray3)));
        }
        if (jSONArray != null) {
            b(arrayList, jSONArray);
        }
        if (jSONArray2 != null) {
            c(arrayList, jSONArray2);
        }
        return arrayList;
    }

    private void a(List<Event> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55f5e81", new Object[]{this, list, jSONArray});
            return;
        }
        for (Event event : list) {
            if (event.getType() != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) next;
                            if (event.getType().equals(jSONObject.getString("type"))) {
                                event.setFields(jSONObject.getJSONObject("fields"));
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(List<Event> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829a1002", new Object[]{this, list, jSONArray});
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        for (int i = 0; i < jSONArray.size(); i++) {
            Event a2 = a(jSONArray.get(i));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        list.addAll(0, arrayList);
    }

    private void c(List<Event> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4c183", new Object[]{this, list, jSONArray});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Event a2 = a(jSONArray.get(i));
            if (a2 != null) {
                list.add(a2);
            }
        }
    }

    private Event a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("318dcf", new Object[]{this, obj});
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Event event = new Event();
        event.setFields(jSONObject.getJSONObject("fields"));
        event.type = jSONObject.getString("type");
        return event;
    }
}
