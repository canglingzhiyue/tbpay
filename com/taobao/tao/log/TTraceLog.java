package com.taobao.tao.log;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class TTraceLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLICK_EVENT = 1;
    public static final int COMMON_EVENT = 0;
    public static final String EVENT_CODE_OK = "0";
    public static final int NET_EVENT = 2;
    private static final String TAG = "TTraceLog";

    static {
        kge.a(-1521277528);
    }

    public static void event(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5713fe", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else {
            eventInternal(LogLevel.I, str, str2, str3, str4, "", j, str5, str6, str7, i, str8, str9);
        }
    }

    public static void event(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33abcf34", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8});
        } else {
            event(str, str2, str3, str4, j, str5, str6, str7, i, "", str8);
        }
    }

    public static void event(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc3d88d", new Object[]{str, str2, str3, new Long(j), str4, str5, str6, str7});
        } else {
            event(str, str2, str3, "", j, str4, str5, str6, 0, str7);
        }
    }

    public static void debugEvent(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f859086b", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else {
            eventInternal(LogLevel.D, str, str2, str3, str4, "", j, str5, str6, str7, i, str8, str9);
        }
    }

    public static void debugEvent(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a8f4e1", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8});
        } else {
            debugEvent(str, str2, str3, str4, j, str5, str6, str7, i, "", str8);
        }
    }

    public static void debugEvent(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59dea000", new Object[]{str, str2, str3, new Long(j), str4, str5, str6, str7});
        } else {
            debugEvent(str, str2, str3, "", j, str4, str5, str6, 0, str7);
        }
    }

    public static void event(LogLevel logLevel, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd12712", new Object[]{logLevel, str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else {
            eventInternal(logLevel, str, str2, str3, str4, "", j, str5, str6, str7, i, str8, str9);
        }
    }

    private static void eventInternal(final LogLevel logLevel, final String str, final String str2, final String str3, final String str4, final String str5, final long j, final String str6, final String str7, final String str8, final int i, final String str9, final String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cf1f", new Object[]{logLevel, str, str2, str3, str4, str5, new Long(j), str6, str7, str8, new Integer(i), str9, str10});
            return;
        }
        try {
            if (d.l()) {
                com.taobao.tao.log.utils.d.a().b(new Runnable() { // from class: com.taobao.tao.log.-$$Lambda$TTraceLog$7d0JuBIGQSolEt1hVPGRTA3utRk
                    @Override // java.lang.Runnable
                    public final void run() {
                        TTraceLog.lambda$eventInternal$0(LogLevel.this, str3, str4, str, str2, str5, j, str6, str7, str8, i, str9, str10);
                    }
                });
            } else {
                TLogNative.writeTraceLog(logLevel, str3, str4, str, str2, str5, j, str6, str7, str8, i, str9, str10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void lambda$eventInternal$0(LogLevel logLevel, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, int i, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717e9e50", new Object[]{logLevel, str, str2, str3, str4, str5, new Long(j), str6, str7, str8, new Integer(i), str9, str10});
        } else {
            TLogNative.writeTraceLog(logLevel, str, str2, str3, str4, str5, j, str6, str7, str8, i, str9, str10);
        }
    }
}
