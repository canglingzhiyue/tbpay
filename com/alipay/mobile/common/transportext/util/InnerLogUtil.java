package com.alipay.mobile.common.transportext.util;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class InnerLogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALTS_CORE_LOG = "ATLS_CORE_LOG";
    public static final String ALTS_EX_LOG = "ATLS_EX_LOG";
    public static final String ALTS_TEST_LOG = "ATLS_TEST_LOG";
    public static final boolean LOG_DEBUG = false;
    public static final String MONITOR_TIMEOUT_TAG = "MONITOR_TIMEOUT_TAG";
    public static final String MWALLET_SPDY_TAG = "MWALLET_SPDY_LOG";

    public static void log4AtlsEx(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3efae", new Object[]{str});
        }
    }

    public static void log4AtlsTest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cade3cd", new Object[]{str});
        }
    }

    public static void logError4AtlsTest(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e53828", new Object[]{str, th});
        }
    }
}
