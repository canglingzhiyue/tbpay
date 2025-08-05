package com.alibaba.android.umbrella.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            WXSDKEngine.registerModule("umbrella-weex", UmbrellaWeexModule.class);
        } catch (Throwable th) {
            TLog.loge("UmbrellaWeexLauncher", "launchUmbrella", th);
        }
    }
}
