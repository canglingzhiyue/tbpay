package com.alipay.mobile.common.logging.strategy;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogLengthConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static LogLengthConfig b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5453a = true;

    public static synchronized LogLengthConfig a() {
        synchronized (LogLengthConfig.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogLengthConfig) ipChange.ipc$dispatch("dcce182b", new Object[0]);
            }
            if (b == null) {
                b = new LogLengthConfig();
            }
            return b;
        }
    }
}
