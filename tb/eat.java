package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.ultronengine.g;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class eat extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TAG = "xTap";

    static {
        kge.a(705237018);
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c001722", new Object[]{this, view, obj, obj2});
        }
    }

    public eat() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.eventhandler.DetailDinamicEventHandler");
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
        } else if (obj3 instanceof b) {
            try {
                if (obj instanceof ArrayList) {
                    jSONArray = (JSONArray) ((ArrayList) obj).get(0);
                } else {
                    jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
                }
                if (jSONArray != null && jSONArray.size() != 0) {
                    b bVar = (b) obj3;
                    Context b = fpz.b(view.getContext());
                    ArrayList<Event> arrayList = new ArrayList();
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) next;
                            if (!"false".equalsIgnoreCase(jSONObject.getString(com.taobao.android.weex_framework.util.a.ATOM_EXT_inline)) && !"false".equalsIgnoreCase(jSONObject.getString("native"))) {
                                ActionModel actionModel = new ActionModel(jSONObject);
                                HashMap hashMap = new HashMap();
                                hashMap.put(ehs.EVENT_EXTRA_VIEWMODEL, bVar);
                                hashMap.put(ehs.EVENT_EXTRA_EVENT_SRC, jSONArray);
                                Event a2 = ehs.a(b, actionModel, bVar.mNodeBundle, null, hashMap);
                                arrayList.add(a2);
                                if (view != null && bVar != null && bVar.dmComponent != null) {
                                    ecg.d(view.getContext(), actionModel.type, bVar.dmComponent.getKey(), "touch", actionModel.params);
                                }
                                if (a2 == null) {
                                    g.a(b, actionModel, bVar);
                                }
                            }
                            arrayList.add(new edq(jSONObject.getString("key")));
                        }
                    }
                    for (Event event : arrayList) {
                        f.a(b, event);
                    }
                    epx.a(b, emx.c(b), bVar);
                }
            } catch (Throwable unused) {
                i.b("detail_dinamic", "handle dinamic tab event onFailure!");
            }
        }
    }
}
