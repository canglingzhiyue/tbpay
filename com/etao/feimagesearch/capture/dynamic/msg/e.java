package com.etao.feimagesearch.capture.dynamic.msg;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6569a;

    static {
        kge.a(-398167856);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "cameraRefreshUrl";
    }

    public e(String str) {
        this.f6569a = str;
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "url", StringUtils.isEmpty(this.f6569a) ? "" : this.f6569a);
        return jSONObject;
    }
}
