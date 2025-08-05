package com.alipay.mobile.common.transport.utils;

import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public final class MonitorErrorLogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int D = 2;
    public static final int E = 5;
    public static final int I = 3;
    public static final int V = 1;
    public static final int W = 4;

    /* renamed from: a  reason: collision with root package name */
    private static int f5626a = -1;

    public static final void log(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c62840", new Object[]{str, th});
            return;
        }
        MonitorInfoUtil.recordException(th);
        LogCatUtil.error(str, th);
    }

    public static final void logExt(int i, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6913ae4c", new Object[]{new Integer(i), str, th});
            return;
        }
        if (f5626a == -1) {
            f5626a = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.ERROR_LOG_LEVEL);
        }
        LogCatUtil.debug("MonitorErrorLogHelper", "CONFIG_LOG_LEVEL=[" + f5626a + riy.ARRAY_END_STR);
        if (i < f5626a) {
            return;
        }
        log(str, th);
    }

    public static final void verbose(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5521742", new Object[]{str, th});
        } else {
            logExt(1, str, th);
        }
    }

    public static final void debug(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273781d1", new Object[]{str, th});
        } else {
            logExt(2, str, th);
        }
    }

    public static final void info(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238b6896", new Object[]{str, th});
        } else {
            logExt(3, str, th);
        }
    }

    public static final void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{str, th});
        } else {
            logExt(4, str, th);
        }
    }

    public static final void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{str, th});
        } else {
            logExt(5, str, th);
        }
    }
}
