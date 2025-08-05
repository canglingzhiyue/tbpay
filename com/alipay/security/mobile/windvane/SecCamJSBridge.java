package com.alipay.security.mobile.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.b;

/* loaded from: classes3.dex */
public class SecCamJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SecCamJSBridge";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("1001".equals(str)) {
            return b.a().a(str2, wVCallBackContext);
        }
        if ("1002".equals(str)) {
            return b.a().a(wVCallBackContext);
        }
        if ("1003".equals(str)) {
            return b.a().b(wVCallBackContext);
        }
        if (!"1004".equals(str)) {
            return false;
        }
        return b.a().b(str2, wVCallBackContext);
    }
}
