package com.taobao.android.trade.component.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f15609a;

    static {
        kge.a(-1828578052);
    }

    public d(a aVar) {
        this.f15609a = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c b = this.f15609a.b();
        b.g = b.e.getJSONArray("request");
        b.h = b.e.getJSONArray("input");
        if (b.g == null) {
            b.g = new JSONArray(4);
        }
        Iterator<Object> it = b.g.iterator();
        while (it.hasNext()) {
            Component component = b.j.get((String) it.next());
            if (component != null) {
                component.a(Component.LinkageType.REQUEST);
            }
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        c cVar = this.f15609a.f15607a;
        String str = "Linkage Before Replacing: \n" + cVar.e;
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (StringUtils.equals(entry.getKey(), "common")) {
                    JSONObject jSONObject3 = (JSONObject) entry.getValue();
                    if (jSONObject3 != null) {
                        JSONObject jSONObject4 = cVar.f;
                        if (jSONObject4 != null) {
                            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                                jSONObject4.put(entry2.getKey(), entry2.getValue());
                            }
                        } else {
                            cVar.f = jSONObject3;
                        }
                    }
                } else {
                    cVar.e.put(entry.getKey(), entry.getValue());
                }
            }
        }
        r0 = "Linkage After Replacing: \n" + cVar.e;
        a();
    }
}
