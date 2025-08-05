package com.alipay.mobile.verifyidentity.log;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LoggerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static VITraceLogger getTraceLogger() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VITraceLogger) ipChange.ipc$dispatch("81308fea", new Object[0]) : VITraceLogger.getInstance();
    }
}
