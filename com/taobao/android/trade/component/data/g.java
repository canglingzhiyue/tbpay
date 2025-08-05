package com.taobao.android.trade.component.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f15611a;

    static {
        kge.a(-338140199);
    }

    public g(a aVar) {
        this.f15611a = aVar;
    }

    public JSONObject a() {
        HashMap<String, Component> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        c b = this.f15611a.b();
        if (b == null || (hashMap = b.j) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Component component : hashMap.values()) {
            if (component.j()) {
                arrayList.add(component);
            }
        }
        return a(arrayList, null);
    }

    private JSONObject a(Collection<?> collection, Component component) {
        String string;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4567f700", new Object[]{this, collection, component});
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            Component component2 = (Component) it.next();
            if (component == null) {
                a2 = component2.b();
            } else {
                a2 = component2.a();
            }
            if (a2 != null) {
                jSONObject.put(component2.i(), (Object) a2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        c b = this.f15611a.b();
        JSONObject jSONObject3 = b.f;
        if (jSONObject3 != null) {
            JSONObject jSONObject4 = new JSONObject();
            String string2 = jSONObject3.getString("validateParams");
            boolean booleanValue = jSONObject3.getBooleanValue("compress");
            if (component == null) {
                String string3 = jSONObject3.getString("submitParams");
                if (string3 != null || string2 != null) {
                    if (string3 != null && !string3.isEmpty()) {
                        jSONObject4.put("submitParams", (Object) string3);
                    }
                    if (string2 != null && !string2.isEmpty()) {
                        jSONObject4.put("validateParams", (Object) string2);
                    }
                    jSONObject4.put("compress", (Object) Boolean.valueOf(booleanValue));
                    jSONObject3 = jSONObject4;
                }
                jSONObject2.put("common", (Object) jSONObject3);
            } else {
                String string4 = jSONObject3.getString("queryParams");
                if (string4 != null || string2 != null) {
                    if (string4 != null && !string4.isEmpty()) {
                        jSONObject4.put("queryParams", (Object) string4);
                    }
                    if (string2 != null && !string2.isEmpty()) {
                        jSONObject4.put("validateParams", (Object) string2);
                    }
                    jSONObject4.put("compress", (Object) Boolean.valueOf(booleanValue));
                    jSONObject3 = jSONObject4;
                }
                jSONObject2.put("common", (Object) jSONObject3);
            }
        }
        if (b.e != null && (string = b.e.getString(SimpleProfile.KEY_SIGNATURE)) != null && !string.isEmpty()) {
            jSONObject2.put(SimpleProfile.KEY_SIGNATURE, (Object) string);
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("structure", (Object) b.c);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("data", (Object) jSONObject);
        jSONObject6.put("linkage", (Object) jSONObject2);
        jSONObject6.put("hierarchy", (Object) jSONObject5);
        if (component != null) {
            jSONObject6.put("operator", (Object) component.i());
        }
        return jSONObject6;
    }
}
