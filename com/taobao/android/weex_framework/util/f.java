package com.taobao.android.weex_framework.util;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile Map<String, String> f16084a;
    private volatile Map<String, String> b;
    private volatile Map<String, String> c;
    private volatile Map<String, String> d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final SharedPreferences h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String n;
    private String o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private volatile Map<String, String> u;
    private volatile Map<String, String> v;
    private int w;
    private boolean x;
    private String y;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static f f16088a;

        static {
            kge.a(-94022321);
            f16088a = new f();
        }
    }

    static {
        kge.a(548424662);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(f fVar, Map map, Map map2, Map map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81704f83", new Object[]{fVar, map, map2, map3});
        } else {
            fVar.a(map, map2, map3);
        }
    }

    private static f p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2ec22a39", new Object[0]) : a.f16088a;
    }

    private f() {
        this.f16084a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.u = new HashMap();
        this.v = new HashMap();
        Application b = com.taobao.android.weex_framework.m.b();
        if (b == null) {
            g.d("GetPreference without application");
            b = com.taobao.android.weex.d.c();
        }
        if (b != null) {
            this.h = b.getSharedPreferences("weex_2_preference", 0);
        } else {
            this.h = null;
        }
        final com.taobao.android.weex_framework.adapter.k s = com.taobao.android.weex_framework.l.a().s();
        if (s != null) {
            s.a("weexv2_option_abconfig", new k.a() { // from class: com.taobao.android.weex_framework.util.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.adapter.k.a
                public void a(Map<String, String> map) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else {
                        f.a(f.this, map, s.a(MUSDKInstance.UNICORN_WHITE_SCREEN_CONFIG_GROUP), s.a("qking_so_ab_config"));
                    }
                }
            });
            s.a(MUSDKInstance.UNICORN_WHITE_SCREEN_CONFIG_GROUP, new k.a() { // from class: com.taobao.android.weex_framework.util.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.adapter.k.a
                public void a(Map<String, String> map) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else {
                        f.a(f.this, s.a("weexv2_option_abconfig"), map, s.a("qking_so_ab_config"));
                    }
                }
            });
            s.a("qking_so_ab_config", new k.a() { // from class: com.taobao.android.weex_framework.util.f.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.adapter.k.a
                public void a(Map<String, String> map) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else {
                        f.a(f.this, s.a("weexv2_option_abconfig"), s.a(MUSDKInstance.UNICORN_WHITE_SCREEN_CONFIG_GROUP), map);
                    }
                }
            });
            a(s.a("weexv2_option_abconfig"), s.a(MUSDKInstance.UNICORN_WHITE_SCREEN_CONFIG_GROUP), s.a("qking_so_ab_config"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x00aa, TryCatch #0 {, blocks: (B:8:0x001e, B:11:0x0025, B:13:0x0032, B:15:0x003c, B:18:0x0043, B:20:0x0050, B:22:0x005a, B:25:0x0061, B:27:0x006e, B:28:0x0076, B:26:0x0068, B:19:0x004a, B:12:0x002c), top: B:34:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.Map<java.lang.String, java.lang.String> r4, java.util.Map<java.lang.String, java.lang.String> r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_framework.util.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            java.lang.String r4 = "64ac26bd"
            r0.ipc$dispatch(r4, r1)
            return
        L1b:
            monitor-enter(r3)
            if (r4 == 0) goto L2c
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L25
            goto L2c
        L25:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)     // Catch: java.lang.Throwable -> Laa
            r3.b = r4     // Catch: java.lang.Throwable -> Laa
            goto L32
        L2c:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Laa
            r3.b = r4     // Catch: java.lang.Throwable -> Laa
        L32:
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.b     // Catch: java.lang.Throwable -> Laa
            java.util.Map r4 = r3.b(r4)     // Catch: java.lang.Throwable -> Laa
            r3.f16084a = r4     // Catch: java.lang.Throwable -> Laa
            if (r5 == 0) goto L4a
            boolean r4 = r5.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L43
            goto L4a
        L43:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r5)     // Catch: java.lang.Throwable -> Laa
            r3.d = r4     // Catch: java.lang.Throwable -> Laa
            goto L50
        L4a:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Laa
            r3.d = r4     // Catch: java.lang.Throwable -> Laa
        L50:
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.d     // Catch: java.lang.Throwable -> Laa
            java.util.Map r4 = r3.c(r4)     // Catch: java.lang.Throwable -> Laa
            r3.c = r4     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L68
            boolean r4 = r6.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L61
            goto L68
        L61:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r6)     // Catch: java.lang.Throwable -> Laa
            r3.v = r4     // Catch: java.lang.Throwable -> Laa
            goto L6e
        L68:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Laa
            r3.v = r4     // Catch: java.lang.Throwable -> Laa
        L6e:
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.v     // Catch: java.lang.Throwable -> Laa
            java.util.Map r4 = r3.d(r4)     // Catch: java.lang.Throwable -> Laa
            r3.u = r4     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "updateConfig raw config: "
            r4.append(r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "WeexConfig"
            com.taobao.android.weex_framework.util.g.f(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "updateConfig raw qking result: "
            r4.append(r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.v
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "WeexConfig"
            com.taobao.android.weex_framework.util.g.f(r5, r4)
            return
        Laa:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Laa
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.util.f.a(java.util.Map, java.util.Map, java.util.Map):void");
    }

    private Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ce771b1", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        this.f = b(hashMap, map, "enable-system-font-mapped-area", true);
        this.g = a(hashMap, map, "enable_check_white_screen_with_platform_view", true, true);
        this.t = a(hashMap, map, "enable-texture-opt", true, true);
        this.m = a(hashMap, map, "enable-fix-surface-change-hybrid", true, true);
        this.e = a(hashMap, map, "enable-fix-platform-life-cycle", true, true);
        this.l = a(hashMap, map, "enable-engine-reuse5", true, true);
        this.p = a(hashMap, map, "monitor_report_sample_rate", 1000);
        this.w = a(hashMap, map, "exception_report_sample_rate", 100);
        this.q = a(hashMap, map, "thread-count", 1);
        this.r = a(hashMap, map, "key_report_tlog_same_pixel_count", 90);
        this.n = a(hashMap, map, "screenshot-pixel-check-duration", "3000");
        this.o = a(hashMap, map, "exception-sampling", "");
        this.i = a(hashMap, map, "enable-low-device-image-recycle", true, true);
        this.y = a(hashMap, map, "click-event-log-report", "meta.m.taobao.com/app/detail-project/simple-sku/home");
        this.k = a(hashMap, map, "enable-apm-first-screen-info-in-c3", true, false);
        this.j = a(hashMap, map, "enable-apm-use-async-api", true, false);
        return Collections.unmodifiableMap(hashMap);
    }

    private Map<String, String> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca0735d0", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        this.s = a(hashMap, map, "default", 98);
        return Collections.unmodifiableMap(hashMap);
    }

    private Map<String, String> d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("726f9ef", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        this.x = b(hashMap, map, "enable-java-new-download", false);
        return Collections.unmodifiableMap(hashMap);
    }

    private boolean a(Map<String, String> map, Map<String, String> map2, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd243196", new Object[]{this, map, map2, str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String str2 = "false";
        if (map2.isEmpty()) {
            if (z2) {
                str2 = "true";
            }
            map.put(str, str2);
            return z2;
        }
        String str3 = map2.get(str);
        if (str3 != null) {
            if ("true".equals(str3)) {
                map.put(str, "true");
                return true;
            } else if (str2.equals(str3)) {
                map.put(str, str2);
                return false;
            }
        }
        map.put(str, String.valueOf(z));
        return z;
    }

    private boolean b(Map<String, String> map, Map<String, String> map2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("834e3025", new Object[]{this, map, map2, str, new Boolean(z)})).booleanValue();
        }
        String str2 = map2.get(str);
        if (str2 != null) {
            if ("true".equals(str2)) {
                map.put(str, "true");
                a(str, true);
                return true;
            } else if ("false".equals(str2)) {
                map.put(str, "false");
                a(str, false);
                return false;
            }
        }
        if (str2 != null) {
            map.put(str, String.valueOf(z));
            a(str, z);
            return z;
        }
        try {
            if (this.h != null) {
                boolean z2 = this.h.getBoolean(str, z);
                g.f("WeexConfig", "updateConfig use SP: " + str + ResponseProtocolType.COMMENT + z2);
                map.put(str, String.valueOf(z2));
                return z2;
            }
        } catch (Exception e) {
            g.a(e);
        }
        map.put(str, String.valueOf(z));
        return z;
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            if (this.h == null) {
                return;
            }
            this.h.edit().putBoolean(str, z).apply();
        } catch (Exception e) {
            g.a(e);
        }
    }

    private int a(Map<String, String> map, Map<String, String> map2, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("693271a4", new Object[]{this, map, map2, str, new Integer(i)})).intValue();
        }
        String str2 = map2.get(str);
        if (str2 != null) {
            try {
                int parseInt = Integer.parseInt(str2);
                map.put(str, str2);
                return parseInt;
            } catch (NumberFormatException e) {
                g.a("WeexConfig", "int format error for: " + str, e);
            }
        }
        map.put(str, String.valueOf(i));
        return i;
    }

    private String a(Map<String, String> map, Map<String, String> map2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53ed2b44", new Object[]{this, map, map2, str, str2});
        }
        String str3 = map2.get(str);
        if (str3 != null) {
            map.put(str, str3);
            return str3;
        }
        map.put(str, str2);
        return str2;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : p().d.get(str);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : p().b.get(str);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        Map<String, String> map = p().b;
        if (map.isEmpty()) {
            return str3;
        }
        String str4 = map.get(str);
        return str4 == null ? str2 : str4;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : p().f;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : p().n;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : p().q;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : p().g;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : p().o;
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : p().r;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : p().t;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : p().i;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : p().k;
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[0])).intValue() : p().p;
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[0])).intValue() : p().w;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : p().m;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : p().e;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : p().l;
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue() : p().s;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : p().j;
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[0]) : p().y;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : p().x;
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        int o = o();
        if (StringUtils.isEmpty(str)) {
            return o;
        }
        try {
            String a2 = a(Uri.parse(str).buildUpon().clearQuery().fragment("").scheme("").build().toString().replaceFirst("^(/|://|:/|//)", ""));
            return StringUtils.isEmpty(a2) ? o : Integer.parseInt(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return o;
        }
    }

    public static ArrayList<String> a(Map<String, Boolean> map) {
        String[] strArr;
        String[] strArr2;
        String b;
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c1c3c577", new Object[]{map});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : d.UNICORN_TRUE_CONFIGS) {
            if (map != null && map.get(str) != null) {
                b2 = String.valueOf(map.get(str));
            } else {
                b2 = b(str);
                if (b2 == null) {
                    b2 = "true";
                }
            }
            arrayList.add("--" + str + "=" + b2);
        }
        for (String str2 : d.UNICORN_FALSE_CONFIGS) {
            if (map != null && map.get(str2) != null) {
                b = String.valueOf(map.get(str2));
            } else {
                b = b(str2);
                if (b == null) {
                    b = "false";
                }
            }
            arrayList.add("--" + str2 + "=" + b);
        }
        return arrayList;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            VariationSet activate = UTABTest.activate("AB_", str);
            if (activate == null) {
                g.f("WeexABTest", "variationSet is null, ratio false");
                return null;
            }
            Variation variation = activate.getVariation(str2);
            if (variation == null) {
                g.f("WeexABTest", "variation is null, ratio false");
                return null;
            }
            return variation.getValueAsString("");
        } catch (Throwable th) {
            g.c("WeexABTest", "UTABTest exception, ratio false", th);
            return null;
        }
    }
}
