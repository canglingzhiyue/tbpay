package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.ultronengine.g;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.android.weex_framework.util.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ebb extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Long EVENT_IDENTIFY;
    public static final String EVENT_TAG = "xTap";

    static {
        kge.a(-451198228);
        EVENT_IDENTIFY = 39313124529L;
    }

    public ebb() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.eventhandler.DetailDinamicEventHandlerV3");
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                b bVar = (b) dXRuntimeContext.a();
                Context m = dXRuntimeContext.m();
                DetailCoreActivity detailCoreActivity = (DetailCoreActivity) m;
                JSONArray jSONArray = (JSONArray) objArr[0];
                ArrayList<Event> arrayList = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) next;
                        if (!"false".equalsIgnoreCase(jSONObject.getString(a.ATOM_EXT_inline)) && !"false".equalsIgnoreCase(jSONObject.getString("native"))) {
                            ActionModel actionModel = new ActionModel(jSONObject);
                            HashMap hashMap = new HashMap();
                            hashMap.put(ehs.EVENT_EXTRA_VIEWMODEL, bVar);
                            hashMap.put(ehs.EVENT_EXTRA_EVENT_SRC, jSONArray);
                            Event a2 = ehs.a(detailCoreActivity, actionModel, detailCoreActivity.y().t.f10055a, null, hashMap);
                            arrayList.add(a2);
                            if (dXRuntimeContext != null && bVar != null && bVar.dmComponent != null) {
                                ecg.d(dXRuntimeContext.m(), actionModel.type, bVar.dmComponent.getKey(), "touch", actionModel.params);
                            }
                            if (a2 == null) {
                                g.a(m, actionModel, bVar);
                            }
                        }
                        arrayList.add(new edq(jSONObject.getString("key")));
                    }
                }
                for (Event event : arrayList) {
                    f.a(detailCoreActivity, event);
                }
                epx.a(m, emx.c(detailCoreActivity), bVar);
            } catch (Exception unused) {
                i.b("detail_dinamic", "handle dinamic tab event onFailure!");
            }
        }
    }
}
