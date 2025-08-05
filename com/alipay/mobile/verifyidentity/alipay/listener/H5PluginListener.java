package com.alipay.mobile.verifyidentity.alipay.listener;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class H5PluginListener implements VerifyIdentityListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f5855a;

    public H5PluginListener(WVCallBackContext wVCallBackContext) {
        this.f5855a = wVCallBackContext;
    }

    public void pluginCallBack(String str, String str2, String str3, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8774f5", new Object[]{this, str, str2, str3, verifyIdentityResult});
            return;
        }
        try {
            r rVar = new r();
            if (verifyIdentityResult != null && !TextUtils.isEmpty(verifyIdentityResult.getMessage())) {
                rVar.a("message", verifyIdentityResult.getMessage());
            }
            if (verifyIdentityResult != null && verifyIdentityResult.getExtInfo() != null) {
                rVar.a("extInfo", verifyIdentityResult.getExtInfo());
            }
            if (verifyIdentityResult != null && verifyIdentityResult.getExtInfo() != null) {
                for (Map.Entry<String, Object> entry : verifyIdentityResult.getExtInfo().entrySet()) {
                    rVar.a(entry.getKey(), entry.getValue());
                }
            }
            rVar.a(Constants.VI_ENGINE_VERIFYID, str);
            rVar.a("token", str2);
            rVar.a("bizName", str3);
            rVar.a(Constants.VI_ENGINE_FAST_BIZ_RES_DATA, verifyIdentityResult.getBizResponseData());
            if (verifyIdentityResult != null && !TextUtils.isEmpty(verifyIdentityResult.getCode())) {
                rVar.a("code", verifyIdentityResult.getCode());
            } else {
                rVar.a("code", "2002");
            }
            this.f5855a.success(rVar);
        } catch (JSONException unused) {
            this.f5855a.error();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener
    public void onVerifyResult(String str, String str2, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f017728", new Object[]{this, str, str2, verifyIdentityResult});
        } else {
            pluginCallBack("", str, str2, verifyIdentityResult);
        }
    }
}
