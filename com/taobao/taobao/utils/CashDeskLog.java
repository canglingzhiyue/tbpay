package com.taobao.taobao.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class CashDeskLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f21301a = true;
    private static boolean b = true;
    private static LogEnable c = LogEnable.DebugEnable;
    private static final Map<String, LogEnable> d = new HashMap(5);
    private static volatile LogAdapter e = null;

    /* loaded from: classes8.dex */
    public interface LogAdapter {
        public static final int D = 2;
        public static final int E = 16;
        public static final int I = 4;
        public static final int N = 32;
        public static final int V = 1;
        public static final int W = 8;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes8.dex */
        public @interface Definition {
        }

        String a();
    }

    /* loaded from: classes8.dex */
    public enum LogEnable {
        VerboseEnable("V"),
        DebugEnable(TLogTracker.LEVEL_DEBUG),
        InfoEnable(TLogTracker.LEVEL_INFO),
        WarnEnable("W"),
        ErrorEnable("E"),
        NoneEnable("L");
        
        private final String logEnable;

        LogEnable(String str) {
            this.logEnable = str;
        }

        public String getLogEnable() {
            return this.logEnable;
        }
    }

    static {
        LogEnable[] values;
        for (LogEnable logEnable : LogEnable.values()) {
            d.put(logEnable.getLogEnable(), logEnable);
        }
    }

    public static void a(LogEnable logEnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bace17ca", new Object[]{logEnable});
        } else if (logEnable == null) {
        } else {
            c = logEnable;
            String str = "[setLogEnable] logEnable=" + logEnable;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, null, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (!b(LogEnable.DebugEnable)) {
        } else {
            if (b) {
                if (e == null) {
                    return;
                }
                a(str2, str3);
            } else if (!f21301a) {
            } else {
                a(str2, str3);
            }
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            b(str, null, str2);
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else if (!b(LogEnable.ErrorEnable)) {
        } else {
            if (b) {
                if (e == null) {
                    return;
                }
                a(str2, str3);
            } else if (!f21301a) {
            } else {
                Log.e(str, a(str2, str3));
            }
        }
    }

    private static String a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e7f4c93", new Object[]{str, strArr});
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("[seq:");
            sb.append(str);
            sb.append("]|");
        }
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i < strArr.length - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static boolean b(LogEnable logEnable) {
        LogAdapter logAdapter;
        LogEnable logEnable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a6b22d", new Object[]{logEnable})).booleanValue();
        }
        if (b && (logAdapter = e) != null && (logEnable2 = d.get(logAdapter.a())) != null && c.ordinal() != logEnable2.ordinal()) {
            a(logEnable2);
        }
        return logEnable.ordinal() >= c.ordinal();
    }
}
