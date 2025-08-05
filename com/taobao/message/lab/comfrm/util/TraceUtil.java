package com.taobao.message.lab.comfrm.util;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import tb.kge;

/* loaded from: classes7.dex */
public class TraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean ENABLE_TRACE;
    private static Class cTrace;

    static {
        kge.a(1057987596);
        ENABLE_TRACE = false;
    }

    public static void beginSection(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb3d417", new Object[]{str, str2});
        } else if (!ENABLE_TRACE || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.beginSection(str + str2);
        }
    }

    public static void beginSection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else if (!ENABLE_TRACE || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.beginSection(str);
        }
    }

    public static void endTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1296a8b1", new Object[0]);
        } else if (!ENABLE_TRACE || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.endSection();
        }
    }

    public static void asyncTraceBegin(String str, int i) {
        if (ENABLE_TRACE) {
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.beginAsyncSection(str, i);
                return;
            }
            try {
                if (cTrace == null) {
                    return;
                }
                cTrace.getDeclaredMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE).invoke(null, Long.valueOf((long) ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF), str, Integer.valueOf(i));
            } catch (Throwable unused) {
            }
        }
    }

    public static void asyncTraceEnd(String str, int i) {
        if (ENABLE_TRACE) {
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection(str, i);
                return;
            }
            try {
                if (cTrace == null) {
                    return;
                }
                cTrace.getDeclaredMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE).invoke(null, Long.valueOf((long) ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF), str, Integer.valueOf(i));
            } catch (Throwable unused) {
            }
        }
    }

    public static void setEnableTrace(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ea076d", new Object[]{new Boolean(z)});
            return;
        }
        ENABLE_TRACE = z;
        try {
            cTrace = Class.forName("android.os.Trace");
        } catch (Throwable unused) {
        }
    }

    public static boolean isEnableTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d54a3a83", new Object[0])).booleanValue() : ENABLE_TRACE;
    }
}
