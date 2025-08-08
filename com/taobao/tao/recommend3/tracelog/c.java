package com.taobao.tao.recommend3.tracelog;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.application.common.d;
import com.taobao.homepage.utils.n;
import com.taobao.monitor.impl.util.g;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.mnd;
import tb.oqc;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f20953a;
    private static long b;
    private static AtomicBoolean c;

    static {
        kge.a(594868774);
        f20953a = -1L;
        b = Long.MIN_VALUE;
        c = new AtomicBoolean(false);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : b;
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            b = j;
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        try {
            if (mnd.m > 0) {
                return mnd.m;
            }
            if (f20953a > 0) {
                return f20953a;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                f20953a = Process.getStartUptimeMillis();
            } else {
                long a2 = g.a();
                f20953a = SystemClock.uptimeMillis() - (a2 != SystemClock.uptimeMillis() ? System.currentTimeMillis() - a2 : Process.getElapsedCpuTime());
            }
            return f20953a;
        } catch (Throwable unused) {
            return SystemClock.uptimeMillis();
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        d a2 = com.taobao.application.common.c.a();
        return a2 == null ? z : a2.a(str, z);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        d a2 = com.taobao.application.common.c.a();
        return a2 == null ? str2 : a2.a(str, str2);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : l.f(Globals.getApplication()) && LauncherRuntime.k == 0 && StringUtils.equals(str, oqc.a().m());
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c.get();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            c.set(true);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        return str + "_data";
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        return str + "_result";
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (n.d()) {
            Log.e("home.GlobalTrace", str);
        } else {
            TLog.loge("home", "GlobalTrace", str);
        }
    }
}
