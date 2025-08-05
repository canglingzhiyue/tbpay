package com.alipay.mobile.common.logging.util.crash;

import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class CrashConstants {
    public static final int CRASH_TYPE_HARDWARE_ACCELERATE = 100;
    public static final int CRASH_TYPE_UNKNOWN = 0;
    public static final String SP_KEY_CRASH_TYPES = "crashTypes";
    public static final String SP_NAME = "logging_crash_analysis";
    public static long sCrashDefWaitTime;
}
