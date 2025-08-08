package com.taobao.tao.log;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Process;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.utils.a;
import com.taobao.taolive.room.utils.aw;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int A;
    public static boolean B;
    public static boolean C;
    public static int D;
    public static boolean E;
    public static boolean F;
    public static boolean G;
    public static int H;
    public static long I;
    public static long J;
    public static boolean K;
    private static int L;

    /* renamed from: a  reason: collision with root package name */
    public static String f20685a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    public static boolean i;
    public static boolean j;
    public static int k;
    public static LogLevel l;
    public static String m;
    public static String n;
    public static long o;
    public static boolean p;
    public static boolean q;
    public static int r;
    public static boolean s;
    public static long t;
    public static long u;
    public static long v;
    public static boolean w;
    public static int x;
    public static String y;
    public static int z;

    static {
        kge.a(850468573);
        K = false;
        L = 0;
        f20685a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "bbbbbbbbbbbbbbbbb";
        g = "-";
        h = "";
        i = false;
        j = false;
        m = null;
        k = 9;
        l = LogLevel.E;
        q = false;
        n = aw.BIZCODE_TAOBAO;
        o = 600L;
        r = 7;
        s = true;
        t = 5L;
        u = 400L;
        v = 50L;
        w = true;
        x = 7;
        y = "";
        z = 4000;
        A = 2000;
        B = true;
        C = false;
        D = 0;
        E = false;
        F = false;
        H = 0;
        I = 0L;
        J = Process.myPid();
    }

    public static void a(Context context) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            if (defaultSharedPreferences.contains(EnvironmentSwitcher.TLOG_VERSION)) {
                String string = defaultSharedPreferences.getString(EnvironmentSwitcher.TLOG_VERSION, null);
                if (string != null && string.equals(e)) {
                    z2 = false;
                    C = z2;
                }
                z2 = true;
                C = z2;
            } else {
                C = true;
            }
            if (defaultSharedPreferences.contains(EnvironmentSwitcher.TLOG_LEVEL) && !C) {
                l = g.b(defaultSharedPreferences.getString(EnvironmentSwitcher.TLOG_LEVEL, "ERROR"));
                e.a().b(l);
            }
            if (defaultSharedPreferences.contains("tlog_module") && !C) {
                e.a().a(g.a(defaultSharedPreferences.getString("tlog_module", null)));
            }
            if (defaultSharedPreferences.contains("tlog_isDebug")) {
                i = defaultSharedPreferences.getBoolean("tlog_isDebug", false);
            }
            if (defaultSharedPreferences.contains("tlog_file_size")) {
                v = defaultSharedPreferences.getLong("tlog_file_size", 50L);
            }
            if (defaultSharedPreferences.contains("tlog_statistics_sample")) {
                z = defaultSharedPreferences.getInt("tlog_statistics_sample", 4000);
            }
            if (defaultSharedPreferences.contains("tlog_file_statistics_sample")) {
                A = defaultSharedPreferences.getInt("tlog_file_statistics_sample", 2000);
            }
            if (!p && defaultSharedPreferences.contains("tlog_buffer_size")) {
                o = defaultSharedPreferences.getLong("tlog_buffer_size", 600L);
            }
            if (defaultSharedPreferences.contains("tlog_scan_upload")) {
                B = defaultSharedPreferences.getBoolean("tlog_scan_upload", true);
            }
            if (defaultSharedPreferences.contains("tlog_use_zstd")) {
                w = defaultSharedPreferences.getBoolean("tlog_use_zstd", true);
            }
            if (defaultSharedPreferences.contains("tlog_slice_config")) {
                String string2 = defaultSharedPreferences.getString("tlog_slice_config", "");
                if (!StringUtils.isEmpty(string2)) {
                    String[] split = string2.split(":");
                    if (split.length == 5) {
                        try {
                            s = Boolean.parseBoolean(split[0]);
                            t = Integer.parseInt(split[1]);
                            u = Integer.parseInt(split[2]);
                            r = Integer.parseInt(split[3]);
                            D = Integer.parseInt(split[4]);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (defaultSharedPreferences.getBoolean("tlog_main_opt", true)) {
                I = Looper.getMainLooper().getThread().getId();
                TLog.loge("tlog", "", "main opt is enable. mainThreadJavaID=" + I);
            }
            K = defaultSharedPreferences.getBoolean("tlog_threadpool_anr_opt", false);
            L = defaultSharedPreferences.getInt("tlog_mini_blocks", 0);
            v = ((Long) a(5L, 100L, Long.valueOf(v))).longValue();
            o = ((Long) a(100L, 3000L, Long.valueOf(o))).longValue();
            t = ((Long) a(2L, Long.valueOf(v), Long.valueOf(t))).longValue();
            u = ((Long) a(10L, 1000L, Long.valueOf(u))).longValue();
            r = ((Integer) a(1, 30, Integer.valueOf(r))).intValue();
            D = ((Integer) a(1, 24, Integer.valueOf(D))).intValue();
            G = g.c(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static <T extends Comparable<T>> T a(T t2, T t3, T t4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8aec40c", new Object[]{t2, t3, t4}) : t4.compareTo(t2) < 0 ? t2 : t4.compareTo(t3) > 0 ? t3 : t4;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        Object[] objArr = new Object[16];
        objArr[0] = Integer.valueOf(k);
        objArr[1] = Boolean.valueOf(j || i);
        objArr[2] = l.getName();
        objArr[3] = Long.valueOf(o);
        objArr[4] = Long.valueOf(v);
        objArr[5] = Boolean.valueOf(s);
        objArr[6] = Long.valueOf(t);
        objArr[7] = Long.valueOf(u);
        objArr[8] = Integer.valueOf(D);
        objArr[9] = Integer.valueOf(r);
        objArr[10] = Boolean.valueOf(w);
        objArr[11] = Integer.valueOf(x);
        objArr[12] = Boolean.valueOf(f());
        objArr[13] = a.a().getAbsolutePath();
        if (I != 0) {
            z2 = true;
        }
        objArr[14] = Boolean.valueOf(z2);
        objArr[15] = y;
        return String.format("TLogVer: %s, Debuggable: %b, LogLevel: %s, CacheSize: %dK, LogMaxSize: %dM,UseSlice: %b, SliceSize: %dM, TotalSlice: %dM, SliceScope: %dH, MaxLogDay: %d, UseZstd: %b, ZstdLevel: %d, MainProcess: %b, CacheDir: %s, mainProcessOpt: %b, zstdPath: %s", objArr);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : k;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : q;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : s;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : D * 3600000;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : StringUtils.equals(c, d);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : E;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : F;
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue() : r;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : G;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : j;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : Thread.currentThread().getId() == I;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : K;
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[0])).intValue() : L;
    }
}
