package com.taobao.android.trade.component.data;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f15610a;

    static {
        kge.a(-1318396630);
    }

    public e(a aVar) {
        this.f15610a = aVar;
    }

    public List<Component> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.getBooleanValue("reload")) {
                b(jSONObject);
            } else {
                c(jSONObject);
            }
            return this.f15610a.f15607a.i;
        } catch (Throwable th) {
            Log.e("ParseModule", "parse exception: ", th);
            return null;
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.f15610a.d();
            c b = this.f15610a.b();
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            JSONObject jSONObject4 = jSONObject.getJSONObject("linkage");
            if (jSONObject2 == null || jSONObject3 == null || jSONObject4 == null) {
                return;
            }
            b.f15608a = jSONObject;
            b.d = jSONObject2;
            b.b = jSONObject3;
            b.e = jSONObject4;
            JSONObject jSONObject5 = jSONObject3.getJSONObject("structure");
            JSONObject jSONObject6 = jSONObject4.getJSONObject("common");
            if (jSONObject5 == null) {
                return;
            }
            b.c = jSONObject5;
            b.f = jSONObject6;
            String string = jSONObject3.getString("root");
            if (string == null || string.isEmpty()) {
                return;
            }
            try {
                b.i = a(string, null);
            } catch (Throwable unused) {
            }
            if (b.i == null || b.i.isEmpty()) {
                return;
            }
            this.f15610a.e();
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        c b = this.f15610a.b();
        HashMap<String, Component> hashMap = b.j;
        if (jSONObject == null || hashMap == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            JSONObject jSONObject3 = (JSONObject) entry.getValue();
            Component component = hashMap.get(entry.getKey());
            if (component != null) {
                try {
                    component.a(jSONObject3);
                } catch (Throwable unused) {
                }
            }
        }
        b.l = null;
        this.f15610a.b(jSONObject);
    }

    private List<Component> a(String str, Component component) {
        List<Component> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21ab040", new Object[]{this, str, component});
        }
        Component component2 = null;
        if (str == null || str.isEmpty()) {
            return null;
        }
        c b = this.f15610a.b();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = b.d;
        JSONObject jSONObject2 = b.c;
        HashMap<String, Component> hashMap = b.j;
        try {
            component2 = this.f15610a.f.a(jSONObject.getJSONObject(str), this.f15610a);
        } catch (Throwable unused) {
        }
        if (component2 != null) {
            component2.a(component);
            arrayList.add(component2);
            hashMap.put(str, component2);
        }
        JSONArray jSONArray = jSONObject2.getJSONArray(str);
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                List<Component> a3 = a((String) it.next(), component2);
                if (a3 != null) {
                    arrayList.addAll(a3);
                }
            }
        }
        return (component2 == null || (a2 = this.f15610a.f.a(component2, arrayList)) == null) ? arrayList : a2;
    }
}
