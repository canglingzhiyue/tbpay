package com.taobao.dai.realtimedebug;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class WVRealtimeDebugPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVRealtimeDebugPlugin";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.mrt.utils.a.b(TAG, "action=" + str + ", param=" + str2 + ", callback=" + wVCallBackContext);
        boolean a2 = a.a(str, str2);
        if (wVCallBackContext != null) {
            if (a2) {
                wVCallBackContext.error();
            } else {
                wVCallBackContext.success();
            }
        }
        return a2;
    }
}
