package com.alipay.mobile.common.transport.utils;

import com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager;
import com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerFactory;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class LogCatUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{str, str2});
            return;
        }
        LoggerManager a2 = a();
        a2.info("mynet_" + str, str2);
    }

    public static final void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{str, str2});
            return;
        }
        LoggerManager a2 = a();
        a2.verbose("mynet_" + str, str2);
    }

    public static final void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{str, str2});
            return;
        }
        LoggerManager a2 = a();
        a2.debug("mynet_" + str, str2);
    }

    public static final void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{str, str2});
            return;
        }
        LoggerManager a2 = a();
        a2.warn("mynet_" + str, str2);
    }

    public static final void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{str, th});
            return;
        }
        LoggerManager a2 = a();
        a2.warn("mynet_" + str, th);
    }

    public static final void warn(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c808bbf4", new Object[]{str, str2, th});
            return;
        }
        LoggerManager a2 = a();
        a2.warn("mynet_" + str, str2, th);
    }

    public static final void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
            return;
        }
        LoggerManager a2 = a();
        a2.error("mynet_" + str, str2);
    }

    public static final void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{str, th});
            return;
        }
        LoggerManager a2 = a();
        a2.error("mynet_" + str, th);
    }

    public static final void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{str, str2, th});
            return;
        }
        LoggerManager a2 = a();
        a2.error("mynet_" + str, str2, th);
    }

    public static final void printInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94d816", new Object[]{str, str2});
            return;
        }
        LoggerManager a2 = a();
        a2.printInfo("mynet_" + str, str2);
    }

    public static final void printError(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6fc9", new Object[]{str, th});
            return;
        }
        LoggerManager a2 = a();
        a2.printError("mynet_" + str, th);
    }

    public static final void debugOrLose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ed32e6", new Object[]{str, str2});
        } else if (TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.LOG_PRIO_SWITCH) > 3) {
            LoggerManager a2 = a();
            a2.debug("mynet_" + str, str2);
        } else {
            LoggerManager a3 = a();
            a3.printInfo("mynet_" + str, str2);
        }
    }

    private static LoggerManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggerManager) ipChange.ipc$dispatch("81f46428", new Object[0]) : LoggerManagerFactory.getInstance().getDefaultBean();
    }
}
