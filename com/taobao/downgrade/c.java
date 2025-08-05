package com.taobao.downgrade;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import tb.aks;
import tb.aku;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f17070a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static Context f;
    private static int g;
    private static int h;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final List<String> f17071a = Arrays.asList("10", "1", "0.1", "50", "10");
    }

    public static float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de5", new Object[0])).floatValue();
        }
        return -1.0f;
    }

    private static String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[0]) : c;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : e;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            e = str;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : d;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            f17070a = str;
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            f = context;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : f17070a;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : com.taobao.application.common.c.a().a("deviceLevel", -1);
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue();
        }
        int a2 = (int) com.taobao.application.common.c.a().a(com.taobao.tbdeviceevaluator.c.KEY_NEW_SCORE, -1.0f);
        if (a2 > 0) {
            return a2;
        }
        return 100;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        return e.f17072a.format(new Date(System.currentTimeMillis()));
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : com.taobao.application.common.c.a().a("mobileModel", Build.MODEL);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : Build.BRAND;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : Build.VERSION.RELEASE;
    }

    public static float j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[0])).floatValue() : com.taobao.application.common.c.a().a("coldLaunchTime", -1.0f);
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95766", new Object[0])).longValue();
        }
        long[] s = s();
        return s[0] - s[1];
    }

    public static float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee3", new Object[0])).floatValue();
        }
        long[] s = s();
        long j = s[0];
        if (j > 0) {
            return ((float) s[1]) / ((float) j);
        }
        return 0.0f;
    }

    public static float a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821d35c", new Object[]{new Boolean(z)})).floatValue();
        }
        if (!z) {
            return 0.0f;
        }
        float f2 = aks.a().e().d;
        if (f2 >= 0.0f) {
            return f2;
        }
        return 0.0f;
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]);
        }
        Activity b2 = com.taobao.application.common.c.b();
        if (b2 == null) {
            return null;
        }
        return b2.getIntent().getDataString();
    }

    public static float a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7052949", new Object[]{list})).floatValue() : a(list, a(true) * 100.0f);
    }

    public static float b(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d39e1eca", new Object[]{list})).floatValue() : a(list, l() * 100.0f);
    }

    public static float c(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e037144b", new Object[]{list})).floatValue() : a(list, j());
    }

    public static int a(Map<String, Integer> map, float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("993dab90", new Object[]{map, new Float(f2), new Float(f3), new Float(f4), new Float(f5)})).intValue() : (int) (((f2 * map.get(e.COLD_LAUNCH).intValue()) / 100.0f) + ((f3 * map.get(e.RUNTIME_CPU).intValue()) / 100.0f) + ((f4 * map.get(e.RUNTIME_MEM).intValue()) / 100.0f) + ((f5 * map.get(e.HARDWARE).intValue()) / 100.0f));
    }

    public static float a(List<String> list, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a06977", new Object[]{list, new Float(f2)})).floatValue();
        }
        if (list == null) {
            list = a.f17071a;
        }
        if (list.size() < 5) {
            return -1.0f;
        }
        return ((float) (10.0d - (h.a(list.get(0), 10.0f) / (h.a(list.get(1), 1.0f) + Math.pow(2.7182817f, (-h.a(list.get(2), 0.1f)) * (f2 - h.a(list.get(3), 50.0f))))))) * h.a(list.get(4), 10.0f);
    }

    public static float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b566", new Object[0])).floatValue();
        }
        if (r() == null) {
            return 0.0f;
        }
        return (float) ((Math.abs(r().hashCode()) % 10000) / 10000.0d);
    }

    private static long[] s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("c6d85cab", new Object[0]);
        }
        long[] t = t();
        return new long[]{t[0], t[0] - ((t[1] + t[2]) + t[3])};
    }

    private static long[] t() {
        long[] jArr = {-1, -1, -1, -1};
        try {
            Method method = Process.class.getMethod("readProcLines", String.class, String[].class, long[].class);
            String[] strArr = {"MemTotal:", "MemFree:", "Buffers:", "Cached:"};
            long[] jArr2 = new long[strArr.length];
            jArr2[0] = 30;
            jArr2[1] = -30;
            if (method != null) {
                method.invoke(null, "/proc/meminfo", strArr, jArr2);
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            }
            return jArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return jArr;
        }
    }

    public static int p() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[0])).intValue();
        }
        if (g == 0 && (context = f) != null) {
            g = f(context.getApplicationInfo().nativeLibraryDir);
        }
        return g;
    }

    private static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return -1;
        }
        return (Build.VERSION.SDK_INT < 21 || !file.getName().toLowerCase().startsWith("arm64")) ? 7 : 8;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[0])).intValue();
        }
        if (h == 0) {
            HardWareInfo b2 = aku.b();
            if (b2 != null) {
                h = b2.l();
            } else {
                h = -1;
            }
        }
        return h;
    }
}
