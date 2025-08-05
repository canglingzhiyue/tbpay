package com.alipay.mobile.verifyidentity.alipay.listener;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class H5PluginListenerByVid extends H5PluginListener implements VIListenerByVerifyId {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public H5PluginListenerByVid(WVCallBackContext wVCallBackContext) {
        super(wVCallBackContext);
    }

    @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
    public void onVerifyResult(String str, String str2, String str3, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9841f2", new Object[]{this, str, str2, str3, verifyIdentityResult});
        } else {
            pluginCallBack(str, str2, str3, verifyIdentityResult);
        }
    }
}
