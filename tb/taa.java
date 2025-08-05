package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.a;
import com.taobao.android.detail.core.aura.observer.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class taa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33977a;
    private eyx b;

    static {
        kge.a(1374379039);
    }

    public static /* synthetic */ void a(taa taaVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63300cac", new Object[]{taaVar, jSONObject});
        } else {
            taaVar.a(jSONObject);
        }
    }

    public taa(Context context, eyx eyxVar) {
        this.f33977a = context;
        this.b = eyxVar;
        this.b.e().a(d.KEY_PRICE_MODEL, new tac() { // from class: tb.taa.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tac
            public void a(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                } else {
                    taa.a(taa.this, obj2 != null ? JSON.parseObject(obj2.toString()) : null);
                }
            }
        });
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : jSONObject.keySet()) {
                if (!iok.KEY_PRICE_SECTION.equals(str) && !a.KEY_PROP_PATH.equals(str) && !"skuId".equals(str)) {
                    arrayList.add(str);
                }
            }
            for (Map.Entry<String, List<com.taobao.android.detail.ttdetail.component.module.d>> entry : a(arrayList).entrySet()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(entry.getKey());
                for (com.taobao.android.detail.ttdetail.component.module.d dVar : entry.getValue()) {
                    JSONObject d = dVar.getComponentData().d();
                    if (d != null) {
                        d.putAll(jSONObject2);
                        dVar.updateComponent();
                    }
                }
            }
        }
    }

    private Map<String, List<com.taobao.android.detail.ttdetail.component.module.d>> a(List<String> list) {
        qpk h;
        com.taobao.android.detail.ttdetail.component.module.d a2;
        com.taobao.android.detail.ttdetail.component.module.d a3;
        String o;
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        HashMap hashMap = null;
        if (list != null && !list.isEmpty()) {
            pir pirVar = (pir) this.b.a().a(pkw.PARSER_ID);
            if (pirVar == null || (h = pirVar.h()) == null) {
                return null;
            }
            hashMap = new HashMap();
            ptl f = h.f();
            if (f != null && f.b() > 0) {
                int b = f.b();
                for (int i = 0; i < b; i++) {
                    qms a4 = f.a(i);
                    if (a4 != null && (a3 = a4.a(this.b.d())) != null && (o = a3.getComponentData().o()) != null && (parseArray = JSONArray.parseArray(o)) != null && !parseArray.isEmpty()) {
                        for (String str : list) {
                            if (parseArray.contains(str)) {
                                List list2 = (List) hashMap.get(str);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    hashMap.put(str, list2);
                                }
                                if (!list2.contains(a3)) {
                                    list2.add(a3);
                                }
                            }
                        }
                    }
                }
            }
            tpd i2 = h.i();
            if (i2 != null && (a2 = i2.a(this.b.d())) != null && a(a2.getComponentData().d(), list)) {
                List list3 = (List) hashMap.get("bottomBar");
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put("bottomBar", list3);
                }
                if (!list3.contains(a2)) {
                    list3.add(a2);
                }
            }
        }
        return hashMap;
    }

    private boolean a(JSONObject jSONObject, List<String> list) {
        Object obj;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("883d787d", new Object[]{this, jSONObject, list})).booleanValue() : jSONObject != null && list.contains("bottomBar") && (obj = jSONObject.get(dwy.KEY_DETAIL)) != null && Boolean.parseBoolean(String.valueOf(obj));
    }
}
