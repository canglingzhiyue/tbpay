package com.taobao.android.detail.ttdetail.bizmessage;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.kge;

/* loaded from: classes4.dex */
public class h extends com.taobao.android.detail.ttdetail.communication.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f10505a;
    private String b;
    private JSONObject c;
    private RuntimeAbilityParam[] d;

    static {
        kge.a(883952497);
    }

    public h(String str, JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        this.b = str;
        this.c = jSONObject;
        this.d = runtimeAbilityParamArr;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.a
    public JSONObject bZ_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("72b9874e", new Object[]{this}) : this.f10505a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        JSONObject jSONObject = this.f10505a;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("type");
        return TextUtils.isEmpty(string) ? this.f10505a.getString("key") : string;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = this.f10505a;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
        return jSONObject3 == null ? this.f10505a.getJSONObject("params") : jSONObject3;
    }

    public RuntimeAbilityParam[] e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RuntimeAbilityParam[]) ipChange.ipc$dispatch("2a2f1cb2", new Object[]{this}) : this.d;
    }
}
