package com.alibaba.ut.abtest.internal.util;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ability.impl.log.LogAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.cex;
import tb.cfa;
import tb.kge;

/* loaded from: classes.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4197a;

    static {
        kge.a(1341306517);
        f4197a = true;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(TLogTracker.LEVEL_DEBUG, str, str2, null);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        a(TLogTracker.LEVEL_DEBUG, str, str2, null);
        a("debug", "base", str, str2, null);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            a("W", str, str2, null);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        a("W", str, str2, null);
        a(LogAbility.API_WARN, "base", str, str2, null);
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            a("W", str, str2, th);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
            return;
        }
        a("W", str, str2, th);
        a(LogAbility.API_WARN, "base", str, str2, th);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            a("E", str, str2, null);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{str, str2});
            return;
        }
        a("E", str, str2, null);
        a("error", "base", str, str2, null);
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecadcb37", new Object[]{str, str2, th});
        } else {
            a("E", str, str2, th);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{str, str2, th});
            return;
        }
        a("E", str, str2, th);
        a("error", "base", str, str2, th);
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f88f82", new Object[]{str, str2});
            return;
        }
        a("E", str, str2, null);
        a("debug", "result", str, str2, null);
    }

    private static void a(String str, String str2, String str3, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76502b6f", new Object[]{str, str2, str3, th});
        } else if (StringUtils.equals(str, "V")) {
            if (b()) {
                a(str2);
            } else if (!AdapterForTLog.isValid() || !f4197a) {
            } else {
                AdapterForTLog.logv(a(str2), str3);
            }
        } else if (StringUtils.equals(str, TLogTracker.LEVEL_DEBUG)) {
            if (b()) {
                a(str2);
            } else if (!AdapterForTLog.isValid() || !f4197a) {
            } else {
                AdapterForTLog.logd(a(str2), str3);
            }
        } else if (StringUtils.equals(str, TLogTracker.LEVEL_INFO)) {
            if (b()) {
                a(str2);
            } else if (!AdapterForTLog.isValid() || !f4197a) {
            } else {
                AdapterForTLog.logi(a(str2), str3);
            }
        } else if (StringUtils.equals(str, "W")) {
            if (b()) {
                a(str2);
            } else if (!AdapterForTLog.isValid() || !f4197a) {
            } else {
                AdapterForTLog.logw(a(str2), str3, th);
            }
        } else if (!StringUtils.equals(str, "E")) {
        } else {
            if (b()) {
                Log.e(a(str2), str3, th);
            } else if (!AdapterForTLog.isValid() || !f4197a) {
            } else {
                AdapterForTLog.loge(a(str2), str3, th);
            }
        }
    }

    private static void a(String str, String str2, String str3, String str4, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3946b965", new Object[]{str, str2, str3, str4, th});
        } else if (th != null) {
            cfa q = cex.a().q();
            q.a(str, str2, str3, str4 + "\n" + Log.getStackTraceString(th));
        } else {
            cex.a().q().a(str, str2, str3, str4);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "EVO." + str;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : cex.a().d() || cex.a().e();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (b()) {
            return true;
        }
        String logLevel = AdapterForTLog.getLogLevel("EVO");
        return !StringUtils.equals("L", logLevel) && !StringUtils.equals("V", logLevel);
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f4197a = z;
        }
    }
}
