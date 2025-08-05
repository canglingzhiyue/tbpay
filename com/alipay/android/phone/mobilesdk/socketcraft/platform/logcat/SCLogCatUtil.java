package com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class SCLogCatUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{str, str2});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.info("WS_" + str, str2);
    }

    public static final void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{str, str2});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.verbose("WS_" + str, str2);
    }

    public static final void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{str, str2});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.debug("WS_" + str, str2);
    }

    public static final void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{str, str2});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.warn("WS_" + str, str2);
    }

    public static final void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{str, th});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.warn("WS_" + str, th);
    }

    public static final void warn(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c808bbf4", new Object[]{str, str2, th});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.warn("WS_" + str, str2, th);
    }

    public static final void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.error("WS_" + str, str2);
    }

    public static final void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{str, th});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.error("WS_" + str, th);
    }

    public static final void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{str, str2, th});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.error("WS_" + str, str2, th);
    }

    public static final void printInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94d816", new Object[]{str, str2});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.printInfo("WS_" + str, str2);
    }

    public static final void printError(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6fc9", new Object[]{str, th});
            return;
        }
        SCLogCatInterface a2 = a();
        a2.printError("WS_" + str, th);
    }

    private static SCLogCatInterface a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SCLogCatInterface) ipChange.ipc$dispatch("f509b1d8", new Object[0]) : SCLogCatFactory.getSCLog();
    }
}
