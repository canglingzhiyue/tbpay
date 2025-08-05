package com.taobao.taobao.setting.network;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import mtopsdk.mtop.domain.MtopRequest;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static MtopRequest a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("c1e7e88b", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", (Object) Login.getUserId());
        jSONObject.put("newSettingOpen", (Object) true);
        try {
            jSONObject.put("envData", (Object) VerifyIdentityEngine.getInstance(context).getEnvData(null));
        } catch (Exception unused) {
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.payment.list.get");
        mtopRequest.setVersion("1.1");
        mtopRequest.setData(JSONObject.toJSONString(jSONObject));
        return mtopRequest;
    }
}
