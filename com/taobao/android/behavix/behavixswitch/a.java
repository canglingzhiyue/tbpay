package com.taobao.android.behavix.behavixswitch;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.e;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.tmall.android.dai.DAIKVStoreage;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.dro;
import tb.dsb;
import tb.kge;
import tb.kgo;
import tb.mto;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INIT_FAST_GROUP_NAME = "behavix_init";
    public static final String K_ENABLE_BEHAVIR = "behaviREnable";
    public static final String K_NEW_TABLE_WRITE = "new_table_write";
    public static final String ORANGE_GROUP_NAME = "behavix";

    /* renamed from: a  reason: collision with root package name */
    private static String f9168a;
    private static int b;
    private static int c;
    private static boolean d;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static boolean j;

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : f9168a;
    }

    public static /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else {
            l();
        }
    }

    public static /* synthetic */ boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : j;
    }

    static {
        kge.a(-1085430798);
        f9168a = "__NULL__";
        b = 500;
        c = 50;
        d = false;
        e = true;
        f = true;
        g = true;
        h = true;
        i = false;
        j = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : i;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!i) {
            k();
        }
        return e && !j;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : j;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            j = z;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (!i) {
            k();
        }
        return f;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (!i) {
            k();
        }
        return g;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        if (!i) {
            k();
        }
        return h;
    }

    private static synchronized void k() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f95772", new Object[0]);
            } else if (i) {
            } else {
                try {
                    OrangeConfig.getInstance().getConfigs(ORANGE_GROUP_NAME);
                    OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME}, new c(), true);
                    m();
                    i = true;
                } catch (Exception e2) {
                    dsb.a("BehaviX_switch_init_error", null, null, e2);
                }
            }
        }
    }

    @Deprecated
    private static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
            return;
        }
        d = d.a(true);
        e = d.b(true);
        f = d.a("enable_expose_area", true, true);
        g = d.a(K_NEW_TABLE_WRITE, com.taobao.android.behavix.adapter.a.b(K_NEW_TABLE_WRITE), true);
        h = d.a(K_ENABLE_BEHAVIR, true, true);
        b = d.a("behaviRHistoryEventCount", 200, true);
        c = d.a("behaviRHistoryEventClearCount", 50, true);
        String str = "true";
        d.a(d ? str : "false");
        d.b(e ? str : "false");
        d.c(f ? str : "false");
        if (!g) {
            str = "false";
        }
        C0354a.b(ORANGE_GROUP_NAME, K_NEW_TABLE_WRITE, str);
        b.t();
    }

    private static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[0]);
            return;
        }
        d = d.a(false);
        e = d.b(false);
        f = d.a("enable_expose_area", true, false);
        g = d.a(K_NEW_TABLE_WRITE, com.taobao.android.behavix.adapter.a.b(K_NEW_TABLE_WRITE), false);
        h = d.a(K_ENABLE_BEHAVIR, true, false);
        b = d.a("behaviRHistoryEventCount", 200, false);
        c = d.a("behaviRHistoryEventClearCount", 50, false);
        b.t();
    }

    /* loaded from: classes.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1022997445);
        }

        public static /* synthetic */ void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                d(str);
            }
        }

        public static /* synthetic */ boolean a(boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue() : c(z);
        }

        public static /* synthetic */ void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            } else {
                e(str);
            }
        }

        public static /* synthetic */ boolean b(boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue() : d(z);
        }

        public static /* synthetic */ void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            } else {
                f(str);
            }
        }

        private static boolean c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
            }
            String a2 = a("enableUserActionUpload", "false", z);
            return !StringUtils.isEmpty(a2) && a2.equalsIgnoreCase("true");
        }

        private static void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            } else {
                C0354a.b(a.ORANGE_GROUP_NAME, "enableUserActionUpload", str);
            }
        }

        private static boolean d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{new Boolean(z)})).booleanValue();
            }
            String a2 = a("enable_user_track", "true", z);
            return !StringUtils.isEmpty(a2) && a2.equalsIgnoreCase("true");
        }

        private static void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            } else {
                C0354a.b(a.ORANGE_GROUP_NAME, "enable_user_track", str);
            }
        }

        private static void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("669e4a77", new Object[]{str});
            } else {
                C0354a.b(a.ORANGE_GROUP_NAME, "enable_expose_area", str);
            }
        }

        public static String a(String str, String str2, boolean z) {
            String a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{str, str2, new Boolean(z)});
            }
            try {
                if (z) {
                    a2 = OrangeConfig.getInstance().getConfig(a.ORANGE_GROUP_NAME, str, str2);
                } else {
                    a2 = a(a.ORANGE_GROUP_NAME, str, str2);
                }
                TLog.logd("BehaviXSwitch", str + "=" + a2);
                return a2;
            } catch (Exception e) {
                dsb.a("getBehaviXConfigException", null, null, e);
                return str2;
            }
        }

        public static boolean a(String str, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a35a6236", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue();
            }
            try {
                return Boolean.valueOf(a(str, z + "", z2)).booleanValue();
            } catch (Throwable unused) {
                return z;
            }
        }

        public static int a(String str, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a352a7d6", new Object[]{str, new Integer(i), new Boolean(z)})).intValue();
            }
            try {
                return Integer.valueOf(a(str, i + "", z)).intValue();
            } catch (Throwable unused) {
                return i;
            }
        }

        private static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
            }
            String a2 = C0354a.a(str, str2, str3);
            return StringUtils.equals(a2, a.h()) ? str3 : a2;
        }
    }

    /* renamed from: com.taobao.android.behavix.behavixswitch.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0354a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static Context f9169a;

        static {
            kge.a(408176132);
        }

        public static /* synthetic */ void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            } else {
                d(str, str2, str3);
            }
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : c(str, str2, str3);
        }

        private static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
            }
            if (f9169a == null) {
                f9169a = com.taobao.android.behavix.d.b();
            }
            Context context = f9169a;
            if (context == null) {
                return null;
            }
            return kgo.a(context, str, 0);
        }

        private static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            return a2 != null ? a2.getString(str2, str3) : str3;
        }

        private static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 == null) {
                return;
            }
            a2.edit().putString(str2, str3).apply();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements com.taobao.orange.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(637198303);
            kge.a(-1209827241);
        }

        private c() {
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(a.ORANGE_GROUP_NAME);
                e.a().a(a.ORANGE_GROUP_NAME, configs);
                e.a().a(configs);
                a.i();
                com.taobao.android.behavix.behavixswitch.b.a().b();
                LogUtils.a();
                dro.l();
            } catch (Exception e) {
                dsb.a("onConfigUpdate", null, null, e);
            }
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            return e.a().a(ORANGE_GROUP_NAME, str, str2);
        } catch (Exception e2) {
            TLog.loge("behavix_track", "BehaviXSwitch", e2);
            return str2;
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str, z + "");
        return StringUtils.isEmpty(a2) ? z : a2.trim().toLowerCase().equals("true");
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        e a2 = e.a();
        String a3 = a2.a(INIT_FAST_GROUP_NAME, str, z + "");
        return StringUtils.isEmpty(a3) ? z : a3.trim().toLowerCase().equals("true");
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        e a2 = e.a();
        String a3 = a2.a(INIT_FAST_GROUP_NAME, str, str2 + "");
        return StringUtils.isEmpty(a3) ? str2 : a3;
    }

    public static int a(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i2)})).intValue();
        }
        try {
            return Integer.valueOf(a(str, i2 + "")).intValue();
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static double a(String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81239a3a", new Object[]{str, new Double(d2)})).doubleValue();
        }
        try {
            return Double.valueOf(a(str, d2 + "")).doubleValue();
        } catch (Throwable unused) {
            return d2;
        }
    }

    public static Map<String, String> g() {
        Map<String, ?> all;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[0]);
        }
        SharedPreferences a2 = e.a.a(ORANGE_GROUP_NAME);
        HashMap hashMap = new HashMap();
        if (a2 == null || (all = a2.getAll()) == null) {
            return hashMap;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (!f9168a.equals(entry.getValue())) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Boolean A;
        private static Set<String> B;

        /* renamed from: a  reason: collision with root package name */
        private static boolean f9170a;
        private static boolean b;
        private static Map<Integer, Boolean> c;
        private static String d;
        private static int e;
        private static Set<String> f;
        private static Set<String> g;
        private static boolean h;
        private static boolean i;
        private static boolean j;
        private static boolean k;
        private static boolean l;
        private static final int[] m;
        private static int[] n;
        private static String o;
        private static JSONObject p;
        private static JSONObject q;
        private static boolean r;
        private static boolean s;
        private static boolean t;
        private static boolean u;
        private static double v;
        private static double w;
        private static double x;
        private static boolean y;
        private static boolean z;

        static {
            kge.a(-1101271257);
            f9170a = true;
            b = false;
            c = null;
            e = 10;
            f = null;
            g = null;
            h = false;
            i = true;
            j = true;
            k = true;
            l = true;
            int[] iArr = {2101, 2201, 2202, 19999, 2001, 2601};
            m = iArr;
            n = iArr;
            o = "{\"custom\":[19999],\"pv\":[2001],\"tap\":[2101],\"scroll\":[2601],\"expose\":[2201, 2202]}";
            r = true;
            s = true;
            t = true;
            u = false;
            v = mto.a.GEO_NOT_SUPPORT;
            w = mto.a.GEO_NOT_SUPPORT;
            x = mto.a.GEO_NOT_SUPPORT;
            y = false;
            z = false;
        }

        public static int[] b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[0]);
            }
            int[] iArr = n;
            return (iArr == null || iArr.length == 0) ? m : iArr;
        }

        public static JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[0]);
            }
            if (p == null) {
                p = JSON.parseObject(o);
            }
            return p;
        }

        public static boolean m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : z;
        }

        public static boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : u;
        }

        public static boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : t;
        }

        public static boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : s;
        }

        public static boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : j;
        }

        public static boolean h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : b;
        }

        public static String i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : d;
        }

        public static int j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : e;
        }

        public static boolean k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : h && !a.j();
        }

        public static boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
            }
            if (A == null) {
                A = Boolean.valueOf(dro.a(Double.parseDouble(e.a().a(a.ORANGE_GROUP_NAME, "slideGestureSample", "0.1")), true));
            }
            return A.booleanValue();
        }

        public static Set<String> u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("b167156b", new Object[0]);
            }
            if (B == null) {
                String a2 = e.a().a(a.ORANGE_GROUP_NAME, "slideGestureScenesV2", "[\"com.taobao.tao.TBMainActivity\",\"com.taobao.tao.welcome.Welcome\",\"com.taobao.search.sf.MainSearchResultActivity\"]");
                HashSet hashSet = new HashSet();
                if (!StringUtils.isEmpty(a2)) {
                    try {
                        JSONArray parseArray = JSON.parseArray(a2);
                        for (int i2 = 0; i2 < parseArray.size(); i2++) {
                            hashSet.add(parseArray.getString(i2));
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (hashSet.size() > 0) {
                    B = hashSet;
                }
            }
            return B;
        }

        public static boolean n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : i;
        }

        public static boolean o() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : dro.a(x);
        }

        public static boolean p() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : dro.a(v);
        }

        public static boolean q() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : dro.a(w);
        }

        public static void a(boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z2)});
            } else {
                y = z2;
            }
        }

        public static boolean s() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : k;
        }

        public static boolean r() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : l;
        }

        public static void t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6782afb", new Object[0]);
                return;
            }
            f9170a = a.a("enableUppFailedPostNotification", true);
            d = a.a("supportDeviceLevels", "l,m,h,unknow");
            com.taobao.android.behavix.utils.c.b();
            b = a.b(j.b.K_ENABLE_ALL_DATA, "taobao".equals(com.taobao.android.behavix.d.c()) && com.taobao.android.testutils.b.a().b());
            e = a.a("uppTrackSampling", 100);
            a(a.a("uppFailedPostErrorCodeBalckList", ""));
            DAIKVStoreage.put("BehaviX", j.b.K_ENABLE_ALL_DATA, b + "");
            f = b(a.a("brTaskBlackIds", ""));
            h = a.b(j.b.K_ENABLE_CHANGE_UTLISTENER, false);
            g = c(a.a("ucpConvertProtocolSchemeIds", "Page_Detail_float_view,Page_MyTaobao_10_icon,Page_Home_10_icon"));
            i = a.a("isChangeUTCustomNum", true);
            j = a.a("enableBHXCXXBUFS", true);
            r = a.a("enableAllLogs2", true);
            s = a.a("enableLocalFeature", true);
            t = a.a("enableExpFocusDur", true);
            z = a.a("bhx_android_closeBizArgs", true);
            u = a.a("isExpUpdateSupportScroll", false);
            A = Boolean.valueOf(dro.a(a.a("slideGestureSample", 0.1d), true));
            d(a.a(j.a.K_UT_LISTEN_EVENT_IDS, ""));
            x = a.a("decodeReplaceSample", 0.5d);
            v = a.a("bxNativeTaskMonitorSample", com.taobao.android.behavix.utils.d.b() ? 0.001d : 1.0E-5d);
            w = a.a("useUTMapSample", 0.5d);
            k = a.a("enableCrashReport", true);
            l = a.a("enableCpuMonitor", true);
            q = JSONObject.parseObject(a.a("completedOptSwitchMap", "{\"ucp_cold_start_opt_new\":true}"));
        }

        private static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else if (!StringUtils.isEmpty(str)) {
                String[] split = str.split(",");
                HashMap hashMap = new HashMap(split.length);
                for (String str2 : split) {
                    try {
                        hashMap.put(Integer.valueOf(Integer.parseInt(str2)), true);
                    } catch (Exception unused) {
                    }
                }
                c = hashMap;
            }
        }

        private static Set<String> b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("d2e8bc22", new Object[]{str});
            }
            if (StringUtils.isEmpty(str)) {
                return new HashSet();
            }
            return new HashSet(Arrays.asList(str.split(",")));
        }

        private static Set<String> c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("e6908fa3", new Object[]{str});
            }
            if (str != null) {
                String[] split = str.split(",");
                HashSet hashSet = new HashSet(split.length);
                hashSet.addAll(Arrays.asList(split));
                return hashSet;
            }
            return Collections.emptySet();
        }

        private static void d(String str) {
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
                return;
            }
            try {
                if (StringUtils.isEmpty(str) || StringUtils.equals(str, o) || (parseObject = JSON.parseObject(str)) == null) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    jSONArray.addAll((JSONArray) entry.getValue());
                }
                int[] iArr = new int[jSONArray.size()];
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    iArr[i2] = jSONArray.getIntValue(i2);
                }
                n = iArr;
                p = parseObject;
                o = str;
            } catch (Exception e2) {
                dsb.a("UtEventListener.changeUtAttentionEventIds", "", null, e2);
            }
        }
    }
}
