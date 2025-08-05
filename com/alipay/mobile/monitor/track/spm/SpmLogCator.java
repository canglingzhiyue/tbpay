package com.alipay.mobile.monitor.track.spm;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class SpmLogCator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{str, str2});
        } else {
            LoggerFactory.getTraceLogger().verbose(a(str), str2);
        }
    }

    public static void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{str, str2});
        } else {
            LoggerFactory.getTraceLogger().debug(a(str), str2);
        }
    }

    public static void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{str, str2});
        } else {
            LoggerFactory.getTraceLogger().info(a(str), str2);
        }
    }

    public static void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{str, str2});
        } else {
            LoggerFactory.getTraceLogger().warn(a(str), str2);
        }
    }

    public static void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{str, th});
        } else {
            LoggerFactory.getTraceLogger().warn(a(str), th);
        }
    }

    public static void warn(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c808bbf4", new Object[]{str, str2, th});
        } else {
            LoggerFactory.getTraceLogger().warn(a(str), str2, th);
        }
    }

    public static void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
        } else {
            LoggerFactory.getTraceLogger().error(a(str), str2);
        }
    }

    public static void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{str, th});
        } else {
            LoggerFactory.getTraceLogger().error(a(str), th);
        }
    }

    public static void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{str, str2, th});
        } else {
            LoggerFactory.getTraceLogger().error(a(str), str2, th);
        }
    }

    public static void print(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20a03c8", new Object[]{str, str2});
        } else {
            LoggerFactory.getTraceLogger().print(a(str), str2);
        }
    }

    public static void print(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cbf137", new Object[]{str, th});
        } else {
            LoggerFactory.getTraceLogger().print(a(str), th);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : "SpmLogCator.".concat(String.valueOf(str));
    }
}
