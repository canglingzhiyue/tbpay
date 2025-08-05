package com.taobao.android.ultron.datamodel.imp;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f15781a = new e();
    private f b = new f();

    static {
        kge.a(949185245);
        kge.a(-754751866);
    }

    public void a(b bVar, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246f1747", new Object[]{this, bVar, jSONObject, map});
        } else if (jSONObject == null || bVar == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
            if (jSONObject2.containsKey("delta") && jSONObject2.get("delta") != null) {
                this.f15781a.b(bVar, jSONObject);
            } else {
                this.b.a(bVar, jSONObject);
            }
        }
    }
}
