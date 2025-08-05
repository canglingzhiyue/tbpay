package com.taobao.android.jarviswe.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class LoadTaskPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "TBJWLoadTaskBridge";

    static {
        kge.a(-113148206);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("taskInfos".equals(str)) {
            a.a().a(str2, wVCallBackContext);
        } else if ("getOrange".equals(str)) {
            a.a().b(str2, wVCallBackContext);
        } else if ("gzipDecode".equals(str)) {
            a.a().c(str2, wVCallBackContext);
        } else if ("getSelectSceneTask".equals(str)) {
            a.a().d(str2, wVCallBackContext);
        } else if ("setSelectSceneTask".equals(str)) {
            a.a().e(str2, wVCallBackContext);
        } else if ("getBetaSwitchEnabled".equals(str)) {
            a.a().h(str2, wVCallBackContext);
        } else if ("betaSwitch".equals(str)) {
            a.a().i(str2, wVCallBackContext);
        } else if ("getFeatureUploadAllSwitch".equals(str)) {
            a.a().g(str2, wVCallBackContext);
        } else if (!"setFeatureUploadAllSwitch".equals(str)) {
            return false;
        } else {
            a.a().f(str2, wVCallBackContext);
        }
        return true;
    }
}
