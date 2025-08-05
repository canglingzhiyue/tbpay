package com.etao.feimagesearch.capture.dynamic.msg;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-9039138);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "cameraShowMetaSight";
    }

    public f(String str, String str2) {
        super(str, str2);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", (Object) a());
        jSONObject.put("state", (Object) b());
        return jSONObject;
    }
}
