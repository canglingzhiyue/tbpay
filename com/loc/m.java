package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.utils.MspSwitchUtil;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.etao.feimagesearch.nn.NetConfig;
import com.loc.br;
import com.loc.bt;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {
    private static volatile boolean D = false;

    /* renamed from: a  reason: collision with root package name */
    public static int f7825a = -1;
    public static String b = "";
    public static Context c = null;
    private static String k = "6";
    private static String l = "4";
    private static String m = "9";
    private static String n = "8";
    private static volatile boolean o = true;
    private static Vector<e> p = new Vector<>();
    private static Map<String, Integer> q = new HashMap();
    private static String r = null;
    private static long s = 0;
    public static volatile boolean d = false;
    private static volatile ConcurrentHashMap<String, g> t = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, Long> u = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, d> v = new ConcurrentHashMap<>(8);
    private static boolean w = false;
    private static boolean x = false;
    public static int e = 5000;
    public static boolean f = true;
    public static boolean g = false;
    private static int y = 3;
    public static boolean h = true;
    public static boolean i = false;
    private static int z = 3;
    public static boolean j = false;
    private static ConcurrentHashMap<String, Boolean> A = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Boolean> B = new ConcurrentHashMap<>();
    private static ArrayList<br.a> C = new ArrayList<>();
    private static Queue<br.c> E = new LinkedList();

    /* loaded from: classes4.dex */
    public interface a {
        void a(b bVar);
    }

    /* loaded from: classes4.dex */
    public static class b {
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f7827a;
        @Deprecated
        public JSONObject b;
        public String c;
        public int d = -1;
        public long e = 0;
        public JSONObject f;
        public a g;
        public C0271b h;
        private boolean i;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f7828a;
            public boolean b;
            public JSONObject c;
        }

        /* renamed from: com.loc.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0271b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f7829a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class c extends bp {
        private String d;
        private Map<String, String> e;
        private String f;
        private String g;
        private String h;

        c(Context context, w wVar, String str, String str2, String str3, String str4) {
            super(context, wVar);
            this.d = str;
            this.e = null;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            a(bt.c.HTTPS);
            a(bt.a.FIX);
        }

        private static String a(String str, String str2) {
            try {
                return !TextUtils.isEmpty(str2) ? Uri.parse(str).buildUpon().encodedAuthority(str2).build().toString() : str;
            } catch (Throwable unused) {
                return str;
            }
        }

        @Override // com.loc.bt
        public final Map<String, String> a() {
            if (!TextUtils.isEmpty(this.h)) {
                HashMap hashMap = new HashMap();
                hashMap.put("host", this.h);
                return hashMap;
            }
            return null;
        }

        @Override // com.loc.bp
        public final byte[] a_() {
            return null;
        }

        @Override // com.loc.bt
        public final String b() {
            return a("https://restsdk.amap.com/v3/iasdkauth", this.f);
        }

        @Override // com.loc.bp
        public final byte[] b_() {
            String p = o.p(this.f7691a);
            if (!TextUtils.isEmpty(p)) {
                p = s.a(new StringBuilder(p).reverse().toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("authkey", TextUtils.isEmpty(this.d) ? "" : this.d);
            hashMap.put("plattype", "android");
            hashMap.put("ccver", "1");
            hashMap.put(DraftMediaHelper.DraftType.PRODUCT, this.b.a());
            hashMap.put("version", this.b.b());
            hashMap.put(NetConfig.OUPUT_KEY, "json");
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            hashMap.put("androidversion", sb.toString());
            hashMap.put("deviceId", p);
            hashMap.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map = this.e;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(this.e);
            }
            hashMap.put("abitype", x.a(this.f7691a));
            hashMap.put("ext", this.b.d());
            return x.a(x.a(hashMap));
        }

        @Override // com.loc.r, com.loc.bt
        public final String c() {
            return a("https://dualstack-arestapi.amap.com/v3/iasdkauth", this.g);
        }

        @Override // com.loc.bp
        protected final String f() {
            return "3.0";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.loc.bt
        public final String g() {
            return !TextUtils.isEmpty(this.h) ? this.h : super.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        w f7830a;
        String b;
        a c;

        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private String f7831a;
        private String b;
        private AtomicInteger c;

        public e(String str, String str2, int i) {
            this.f7831a = str;
            this.b = str2;
            this.c = new AtomicInteger(i);
        }

        public static e b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new e(jSONObject.optString("a"), jSONObject.optString("f"), jSONObject.optInt("h"));
            } catch (Throwable unused) {
                return null;
            }
        }

        public final int a() {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger == null) {
                return 0;
            }
            return atomicInteger.get();
        }

        public final void a(String str) {
            this.b = str;
        }

        public final String b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("a", this.f7831a);
                jSONObject.put("f", this.b);
                jSONObject.put("h", this.c.get());
                return jSONObject.toString();
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f7832a = true;
        public static boolean b = false;
        public static boolean c = true;
        public static int d = 0;
        public static boolean e = false;
        public static int f;
    }

    /* loaded from: classes4.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public long f7833a;
        public String b;

        g(Long l, String str) {
            this.f7833a = 0L;
            this.b = "";
            this.f7833a = l.longValue();
            this.b = str;
        }
    }

    public static long a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() <= 0) {
                    return 0L;
                }
                String str = list.get(0);
                if (TextUtils.isEmpty(str)) {
                    return 0L;
                }
                return Long.valueOf(str).longValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public static b a(Context context, w wVar, String str, String str2, String str3, String str4) {
        return b(context, wVar, str, str2, str3, str4);
    }

    private static synchronized e a(Context context, String str, String str2) {
        e eVar;
        synchronized (m.class) {
            if (!TextUtils.isEmpty(str)) {
                for (int i2 = 0; i2 < p.size(); i2++) {
                    eVar = p.get(i2);
                    if (eVar != null && str.equals(eVar.f7831a)) {
                        break;
                    }
                }
            }
            eVar = null;
            if (eVar != null) {
                return eVar;
            }
            if (context == null) {
                return null;
            }
            e b2 = e.b(bd.b(context, str2, str, ""));
            String a2 = x.a(System.currentTimeMillis(), "yyyyMMdd");
            if (b2 == null) {
                b2 = new e(str, a2, 0);
            }
            if (!a2.equals(b2.b)) {
                b2.a(a2);
                b2.c.set(0);
            }
            p.add(b2);
            return b2;
        }
    }

    public static String a(String str) {
        d dVar;
        if (!v.containsKey(str) || (dVar = v.get(str)) == null) {
            return null;
        }
        return dVar.b;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getApplicationContext();
        }
    }

    private static void a(Context context, w wVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("amap_sdk_auth_fail", "1");
        hashMap.put("amap_sdk_auth_fail_type", str);
        hashMap.put("amap_sdk_name", wVar.a());
        hashMap.put("amap_sdk_version", wVar.c());
        String jSONObject = new JSONObject(hashMap).toString();
        if (TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            bz bzVar = new bz(context, "core", "2.0", "O001");
            bzVar.a(jSONObject);
            ca.a(bzVar, context);
        } catch (k unused) {
        }
    }

    public static synchronized void a(Context context, w wVar, String str, a aVar) {
        synchronized (m.class) {
            if (context == null || wVar == null) {
                return;
            }
            try {
                if (c == null) {
                    c = context.getApplicationContext();
                }
                String a2 = wVar.a();
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                a(wVar);
                if (v == null) {
                    v = new ConcurrentHashMap<>(8);
                }
                if (u == null) {
                    u = new ConcurrentHashMap<>(8);
                }
                if (t == null) {
                    t = new ConcurrentHashMap<>(8);
                }
                if (!v.containsKey(a2)) {
                    d dVar = new d((byte) 0);
                    dVar.f7830a = wVar;
                    dVar.b = str;
                    dVar.c = aVar;
                    v.put(a2, dVar);
                    long a3 = bd.a(c, "open_common", a2, 0L);
                    Context context2 = c;
                    t.put(a2, new g(Long.valueOf(a3), bd.b(context2, "open_common", a2 + "lct-info", "")));
                    d(c);
                    e(c);
                }
            } catch (Throwable th) {
                as.a(th, "at", "rglc");
            }
        }
    }

    private static void a(Context context, w wVar, String str, b bVar, JSONObject jSONObject) throws JSONException {
        boolean a2;
        b.a aVar = new b.a();
        aVar.f7828a = false;
        aVar.b = false;
        bVar.g = aVar;
        try {
            String[] split = str.split(";");
            if (split != null && split.length > 0) {
                for (String str2 : split) {
                    if (jSONObject.has(str2)) {
                        bVar.f.putOpt(str2, jSONObject.get(str2));
                    }
                }
            }
        } catch (Throwable th) {
            as.a(th, "at", "co");
        }
        if (x.a(jSONObject, "16H")) {
            try {
                bVar.i = a(jSONObject.getJSONObject("16H").optString("able"), false);
            } catch (Throwable th2) {
                as.a(th2, "AuthConfigManager", "load 16H");
            }
        }
        if (x.a(jSONObject, "11K")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("11K");
                aVar.f7828a = a(jSONObject2.getString("able"), false);
                if (jSONObject2.has("off")) {
                    aVar.c = jSONObject2.getJSONObject("off");
                }
            } catch (Throwable th3) {
                as.a(th3, "AuthConfigManager", "load 11K");
            }
        }
        if (x.a(jSONObject, "145")) {
            try {
                bVar.f7827a = jSONObject.getJSONObject("145");
            } catch (Throwable th4) {
                as.a(th4, "AuthConfigManager", "load 145");
            }
        }
        if (x.a(jSONObject, "14D")) {
            try {
                bVar.b = jSONObject.getJSONObject("14D");
            } catch (Throwable th5) {
                as.a(th5, "AuthConfigManager", "load 14D");
            }
        }
        if (x.a(jSONObject, "151")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("151");
                b.C0271b c0271b = new b.C0271b();
                if (jSONObject3 != null) {
                    c0271b.f7829a = a(jSONObject3.optString("able"), false);
                }
                bVar.h = c0271b;
            } catch (Throwable th6) {
                as.a(th6, "AuthConfigManager", "load 151");
            }
        }
        if (x.a(jSONObject, "17S")) {
            try {
                JSONObject jSONObject4 = jSONObject.getJSONObject("17S");
                if (jSONObject4 != null && (a2 = a(jSONObject4.optString("able"), false)) != o) {
                    o = a2;
                    if (context != null) {
                        SharedPreferences.Editor a3 = bd.a(context, "open_common");
                        bd.a(a3, "a2", a2);
                        bd.a(a3);
                    }
                }
                if (jSONObject4 != null) {
                    boolean a4 = a(jSONObject4.optString("static_enable"), true);
                    boolean a5 = a(jSONObject4.optString("static_ip_direct_enable"), false);
                    int optInt = jSONObject4.optInt("static_timeout", 5) * 1000;
                    int optInt2 = jSONObject4.optInt("static_retry", 3);
                    boolean a6 = a(jSONObject4.optString("bgp_enable"), true);
                    boolean a7 = a(jSONObject4.optString("bgp_ip_direct_enable"), false);
                    int optInt3 = jSONObject4.optInt("bgp_retry", 3);
                    boolean a8 = a(jSONObject4.optString("perf_data_upload_enable"), false);
                    if (a4 != f || a5 != g || optInt != e || optInt2 != y || a6 != h || a7 != i || optInt3 != z || a8 != j) {
                        f = a4;
                        g = a5;
                        e = optInt;
                        y = optInt2;
                        h = a6;
                        i = a7;
                        z = optInt3;
                        j = a8;
                        if (context != null) {
                            SharedPreferences.Editor a9 = bd.a(context, "open_common");
                            bd.a(a9, "a13", a4);
                            bd.a(a9, "a6", a6);
                            bd.a(a9, "a7", a5);
                            bd.a(a9, "a8", optInt);
                            bd.a(a9, "a9", optInt2);
                            bd.a(a9, "a10", a7);
                            bd.a(a9, MspSwitchUtil.DEFAULT_MSP_BYTES, optInt3);
                            bd.a(a9, "a12", a8);
                            bd.a(a9);
                        }
                    }
                    new StringBuilder("static_enable=").append(f);
                    br.a();
                    new StringBuilder("bgp_enable=").append(h);
                    br.a();
                    new StringBuilder("static_ip_direct_enable=").append(g);
                    br.a();
                    new StringBuilder("bgp_ip_direct_enable=").append(i);
                    br.a();
                    new StringBuilder("perf_data_upload_enable=").append(j);
                    br.a();
                }
            } catch (Throwable th7) {
                as.a(th7, "AuthConfigManager", "load 17S");
            }
        }
        if (x.a(jSONObject, "15K")) {
            try {
                JSONObject jSONObject5 = jSONObject.getJSONObject("15K");
                if (jSONObject5 != null) {
                    boolean a10 = a(jSONObject5.optString("ucf"), f.f7832a);
                    boolean a11 = a(jSONObject5.optString("fsv2"), f.b);
                    boolean a12 = a(jSONObject5.optString("usc"), f.c);
                    int optInt4 = jSONObject5.optInt("umv", f.d);
                    boolean a13 = a(jSONObject5.optString("ust"), f.e);
                    int optInt5 = jSONObject5.optInt("ustv", f.f);
                    if (a10 != f.f7832a || a11 != f.b || a12 != f.c || optInt4 != f.d || a13 != f.e || optInt5 != f.d) {
                        f.f7832a = a10;
                        f.b = a11;
                        f.c = a12;
                        f.d = optInt4;
                        f.e = a13;
                        f.f = optInt5;
                        try {
                            SharedPreferences.Editor a14 = bd.a(context, "open_common");
                            bd.a(a14, "ucf", f.f7832a);
                            bd.a(a14, "fsv2", f.b);
                            bd.a(a14, "usc", f.c);
                            bd.a(a14, "umv", f.d);
                            bd.a(a14, "ust", f.e);
                            bd.a(a14, "ustv", f.f);
                            bd.a(a14);
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable th8) {
                as.a(th8, "AuthConfigManager", "load 15K");
            }
        }
        if (x.a(jSONObject, "183")) {
            try {
                bq.a(wVar, jSONObject.getJSONObject("183"));
            } catch (Throwable th9) {
                as.a(th9, "AuthConfigManager", "load 183");
            }
        }
        if (x.a(jSONObject, "17I")) {
            try {
                JSONObject jSONObject6 = jSONObject.getJSONObject("17I");
                boolean a15 = a(jSONObject6.optString("na"), false);
                boolean a16 = a(jSONObject6.optString("aa"), false);
                ag.d = a15;
                ag.e = a16;
                SharedPreferences.Editor a17 = bd.a(context, "open_common");
                bd.a(a17, DnsUtil.DOMAIN_GROUP, a15);
                bd.a(a17, "a5", a16);
                bd.a(a17);
            } catch (Throwable th10) {
                as.a(th10, "AuthConfigManager", "load 17I");
            }
        }
        if (x.a(jSONObject, "1A4")) {
            try {
                JSONObject jSONObject7 = jSONObject.getJSONObject("1A4");
                String optString = jSONObject7.optString("ada");
                boolean a18 = a(optString, z.c);
                long optLong = jSONObject7.optLong("iv", z.f7859a);
                z.d = a18;
                z.b = optLong;
                SharedPreferences.Editor a19 = bd.a(context, "open_common");
                bd.a(a19, "a16", optString);
                bd.a(a19, "a17", optLong);
                bd.a(a19);
            } catch (Throwable th11) {
                as.a(th11, "AuthConfigManager", "load 1A4");
            }
        }
    }

    private static void a(Context context, w wVar, Throwable th) {
        a(context, wVar, th.getMessage());
    }

    public static void a(Context context, String str) {
        l.a(context, str);
    }

    private static void a(Context context, String str, String str2, e eVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.f7831a)) {
            return;
        }
        String b2 = eVar.b();
        if (TextUtils.isEmpty(b2) || context == null) {
            return;
        }
        SharedPreferences.Editor a2 = bd.a(context, str2);
        a2.putString(str, b2);
        bd.a(a2);
    }

    public static void a(br.c cVar) {
        if (cVar == null || c == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("serverip", cVar.c);
        hashMap.put("hostname", cVar.e);
        hashMap.put("path", cVar.d);
        hashMap.put("csid", cVar.f7699a);
        hashMap.put("degrade", String.valueOf(cVar.b.a()));
        hashMap.put("errorcode", String.valueOf(cVar.m));
        hashMap.put("errorsubcode", String.valueOf(cVar.n));
        hashMap.put("connecttime", String.valueOf(cVar.h));
        hashMap.put("writetime", String.valueOf(cVar.i));
        hashMap.put("readtime", String.valueOf(cVar.j));
        hashMap.put("datasize", String.valueOf(cVar.l));
        hashMap.put("totaltime", String.valueOf(cVar.f));
        String jSONObject = new JSONObject(hashMap).toString();
        "--埋点--".concat(String.valueOf(jSONObject));
        br.a();
        if (TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            bz bzVar = new bz(c, "core", "2.0", "O008");
            bzVar.a(jSONObject);
            ca.a(bzVar, c);
        } catch (k unused) {
        }
    }

    private static void a(w wVar) {
        if (wVar != null) {
            try {
                if (TextUtils.isEmpty(wVar.a())) {
                    return;
                }
                String c2 = wVar.c();
                if (TextUtils.isEmpty(c2)) {
                    c2 = wVar.b();
                }
                if (TextUtils.isEmpty(c2)) {
                    return;
                }
                ag.a(wVar.a(), c2);
            } catch (Throwable unused) {
            }
        }
    }

    private static synchronized void a(String str, long j2, String str2) {
        synchronized (m.class) {
            try {
                if (v != null && v.containsKey(str)) {
                    if (t == null) {
                        t = new ConcurrentHashMap<>(8);
                    }
                    t.put(str, new g(Long.valueOf(j2), str2));
                    if (c != null) {
                        SharedPreferences.Editor a2 = bd.a(c, "open_common");
                        bd.a(a2, str, j2);
                        bd.a(a2, str + "lct-info", str2);
                        bd.a(a2);
                    }
                }
            } catch (Throwable th) {
                as.a(th, "at", "ucut");
            }
        }
    }

    private static void a(String str, String str2) {
        e a2 = a(c, str, str2);
        String a3 = x.a(System.currentTimeMillis(), "yyyyMMdd");
        if (!a3.equals(a2.b)) {
            a2.a(a3);
            a2.c.set(0);
        }
        a2.c.incrementAndGet();
        a(c, str, str2, a2);
    }

    public static synchronized void a(final String str, boolean z2, final String str2, final String str3, final String str4) {
        synchronized (m.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (u == null) {
                    u = new ConcurrentHashMap<>(8);
                }
                u.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                if (v == null) {
                    return;
                }
                if (!v.containsKey(str)) {
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (z2) {
                    bq.a(true, str);
                }
                cr.a().b(new cs() { // from class: com.loc.m.1
                    @Override // com.loc.cs
                    public final void a() {
                        d dVar = (d) m.v.get(str);
                        if (dVar == null) {
                            return;
                        }
                        a aVar = dVar.c;
                        b a2 = m.a(m.c, dVar.f7830a, dVar.b, str2, str3, str4);
                        if (a2 == null || aVar == null) {
                            return;
                        }
                        aVar.a(a2);
                    }
                });
            } catch (Throwable th) {
                as.a(th, "at", "lca");
            }
        }
    }

    public static void a(String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || c == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("downLevel", String.valueOf(z2));
        String str2 = "0";
        hashMap.put("ant", o.j(c) == 0 ? str2 : "1");
        hashMap.put("type", z4 ? z2 ? m : n : z2 ? k : l);
        if (!z3) {
            str2 = "1";
        }
        hashMap.put("status", str2);
        String jSONObject = new JSONObject(hashMap).toString();
        if (TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            bz bzVar = new bz(c, "core", "2.0", "O002");
            bzVar.a(jSONObject);
            ca.a(bzVar, c);
        } catch (k unused) {
        }
    }

    public static void a(boolean z2, br.a aVar) {
        if (!D || aVar == null) {
            return;
        }
        synchronized (C) {
            if (z2) {
                Iterator<br.a> it = C.iterator();
                while (it.hasNext()) {
                    br.a next = it.next();
                    if (next.b.equals(aVar.b) && next.e.equals(aVar.e) && next.f == aVar.f) {
                        if (next.j == aVar.j) {
                            it.remove();
                        } else {
                            next.j.set(next.j.get() - aVar.j.get());
                        }
                        br.a();
                    }
                }
            }
            D = false;
            Iterator<br.a> it2 = C.iterator();
            while (true) {
                br.a();
                if (it2.hasNext()) {
                    br.a next2 = it2.next();
                    StringBuilder sb = new StringBuilder("----path=");
                    sb.append(next2.e);
                    sb.append("-counts=");
                    sb.append(next2.j);
                    sb.append("-code=");
                    sb.append(next2.f);
                    sb.append("----");
                } else {
                    br.a();
                }
            }
        }
    }

    public static void a(boolean z2, String str) {
        try {
            "--markHostNameFailed---hostname=".concat(String.valueOf(str));
            br.a();
            if (!f && !z2) {
                return;
            }
            if ((!i && z2) || TextUtils.isEmpty(str)) {
                return;
            }
            if (!z2) {
                if (A.get(str) != null) {
                    return;
                }
                A.put(str, Boolean.TRUE);
                a(b(str, "a14"), "open_common");
            } else if (B.get(str) != null) {
            } else {
                B.put(str, Boolean.TRUE);
                a(b(str, "a15"), "open_common");
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a() {
        e a2;
        if (c != null) {
            i();
            if (!c()) {
                return false;
            }
            if (b()) {
                return true;
            }
        }
        return o && (a2 = a(c, "IPV6_CONFIG_NAME", "open_common")) != null && a2.a() < 5;
    }

    public static synchronized boolean a(String str, long j2) {
        synchronized (m.class) {
            boolean z2 = false;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            g f2 = f(str);
            long j3 = 0;
            if (j2 != (f2 != null ? f2.f7833a : 0L)) {
                if (u != null && u.containsKey(str)) {
                    j3 = u.get(str).longValue();
                }
                if (SystemClock.elapsedRealtime() - j3 > 30000) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    public static boolean a(String str, boolean z2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z2;
            }
            String[] split = URLDecoder.decode(str).split("/");
            return split[split.length - 1].charAt(4) % 2 == 1;
        } catch (Throwable unused) {
            return z2;
        }
    }

    private static boolean a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.loc.m$b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.loc.m.b b(android.content.Context r22, com.loc.w r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.m.b(android.content.Context, com.loc.w, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.loc.m$b");
    }

    public static w b(String str) {
        d dVar = v.get(str);
        if (dVar != null) {
            return dVar.f7830a;
        }
        return null;
    }

    private static String b(String str, String str2) {
        String a2 = s.a(str.getBytes());
        return str2 + "_" + a2;
    }

    private static String b(List<String> list) {
        if (list != null) {
            try {
                if (list.size() <= 0) {
                    return "";
                }
                String str = list.get(0);
                return !TextUtils.isEmpty(str) ? str : "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        o = bd.a(context, "open_common", "a2", true);
    }

    public static void b(br.c cVar) {
        synchronized (C) {
            boolean z2 = false;
            for (int i2 = 0; i2 < C.size(); i2++) {
                br.a aVar = C.get(i2);
                if (cVar.c.equals(aVar.b) && cVar.d.equals(aVar.e) && cVar.m == aVar.f) {
                    if (aVar.f == 1) {
                        aVar.i = ((aVar.j.get() * aVar.i) + cVar.f) / (aVar.j.get() + 1);
                    }
                    aVar.j.getAndIncrement();
                    z2 = true;
                }
            }
            if (!z2) {
                C.add(new br.a(cVar));
            }
            br.a();
        }
    }

    public static synchronized void b(String str, boolean z2) {
        synchronized (m.class) {
            a(str, z2, (String) null, (String) null, (String) null);
        }
    }

    public static boolean b() {
        Integer num;
        Context context = c;
        if (context == null) {
            return false;
        }
        String o2 = o.o(context);
        return !TextUtils.isEmpty(o2) && (num = q.get(o2.toUpperCase())) != null && num.intValue() == 2;
    }

    public static String c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str + ";15K;16H;17I;1A4;17S;183";
        }
        return str;
    }

    private static void c(Context context) {
        if (context == null) {
            return;
        }
        f = bd.a(context, "open_common", "a13", true);
        h = bd.a(context, "open_common", "a6", true);
        g = bd.a(context, "open_common", "a7", false);
        e = bd.a(context, "open_common", "a8", 5000);
        y = bd.a(context, "open_common", "a9", 3);
        i = bd.a(context, "open_common", "a10", false);
        z = bd.a(context, "open_common", MspSwitchUtil.DEFAULT_MSP_BYTES, 3);
        j = bd.a(context, "open_common", "a12", false);
    }

    public static void c(br.c cVar) {
        if (cVar != null && j) {
            synchronized (E) {
                E.offer(cVar);
                br.a();
            }
        }
    }

    public static boolean c() {
        Integer num;
        Context context = c;
        if (context == null) {
            return false;
        }
        String o2 = o.o(context);
        return !TextUtils.isEmpty(o2) && (num = q.get(o2.toUpperCase())) != null && num.intValue() >= 2;
    }

    public static void d() {
        try {
            e a2 = a(c, "IPV6_CONFIG_NAME", "open_common");
            String a3 = x.a(System.currentTimeMillis(), "yyyyMMdd");
            if (!a3.equals(a2.b)) {
                a2.a(a3);
                a2.c.set(0);
            }
            a2.c.incrementAndGet();
            a(c, "IPV6_CONFIG_NAME", "open_common", a2);
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            if (w) {
                return;
            }
            ag.d = bd.a(context, "open_common", DnsUtil.DOMAIN_GROUP, true);
            ag.e = bd.a(context, "open_common", "a5", true);
            w = true;
        } catch (Throwable unused) {
        }
    }

    public static synchronized boolean d(String str) {
        synchronized (m.class) {
            try {
            } finally {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (v == null) {
                return false;
            }
            if (u == null) {
                u = new ConcurrentHashMap<>(8);
            }
            if (v.containsKey(str) && !u.containsKey(str)) {
                u.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                return true;
            }
            return false;
        }
    }

    public static void e() {
        if (d) {
            return;
        }
        try {
            Context context = c;
            if (context == null) {
                return;
            }
            d = true;
            q.a().a(context);
            b(context);
            c(context);
            f.f7832a = bd.a(context, "open_common", "ucf", f.f7832a);
            f.b = bd.a(context, "open_common", "fsv2", f.b);
            f.c = bd.a(context, "open_common", "usc", f.c);
            f.d = bd.a(context, "open_common", "umv", f.d);
            f.e = bd.a(context, "open_common", "ust", f.e);
            f.f = bd.a(context, "open_common", "ustv", f.f);
        } catch (Throwable unused) {
        }
    }

    private static void e(Context context) {
        try {
            if (x) {
                return;
            }
            z.d = a(bd.b(context, "open_common", "a16", ""), true);
            z.b = bd.a(context, "open_common", "a17", z.f7859a);
            x = true;
        } catch (Throwable unused) {
        }
    }

    public static synchronized void e(String str) {
        synchronized (m.class) {
            if (u == null) {
                return;
            }
            if (u.containsKey(str)) {
                u.remove(str);
            }
        }
    }

    public static br.a f() {
        if (D) {
            return null;
        }
        synchronized (C) {
            if (D) {
                return null;
            }
            Collections.sort(C);
            if (C.size() <= 0) {
                return null;
            }
            br.a clone = C.get(0).clone();
            D = true;
            return clone;
        }
    }

    public static synchronized g f(String str) {
        synchronized (m.class) {
            try {
                if (t == null) {
                    t = new ConcurrentHashMap<>(8);
                }
                if (t.containsKey(str)) {
                    return t.get(str);
                }
                return new g(0L, "");
            }
        }
    }

    public static br.c g() {
        synchronized (E) {
            br.c poll = E.poll();
            if (poll != null) {
                return poll;
            }
            return null;
        }
    }

    public static boolean g(String str) {
        e a2;
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (!f) {
                return false;
            }
            if (!(A.get(str) == null)) {
                return false;
            }
            if (c == null || (a2 = a(c, b(str, "a14"), "open_common")) == null) {
                return true;
            }
            return a2.a() < y;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean h(String str) {
        e a2;
        if (!TextUtils.isEmpty(str) && i) {
            if (!(B.get(str) == null)) {
                return false;
            }
            if (c == null || (a2 = a(c, b(str, "a15"), "open_common")) == null) {
                return true;
            }
            return a2.a() < z;
        }
        return false;
    }

    private static void i() {
        Map<String, Integer> map;
        String str;
        Integer valueOf;
        try {
            if (c != null) {
                String o2 = o.o(c);
                if (!TextUtils.isEmpty(r) && !TextUtils.isEmpty(o2) && r.equals(o2) && System.currentTimeMillis() - s < 60000) {
                    return;
                }
                if (!TextUtils.isEmpty(o2)) {
                    r = o2;
                }
            } else if (System.currentTimeMillis() - s < 10000) {
                return;
            }
            s = System.currentTimeMillis();
            q.clear();
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                    String displayName = networkInterface.getDisplayName();
                    int i2 = 0;
                    for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                        InetAddress address = interfaceAddress.getAddress();
                        if (address instanceof Inet6Address) {
                            if (!a((Inet6Address) address)) {
                                i2 |= 2;
                            }
                        } else if (address instanceof Inet4Address) {
                            Inet4Address inet4Address = (Inet4Address) address;
                            if (!a(inet4Address) && !inet4Address.getHostAddress().startsWith(x.c("FMTkyLjE2OC40My4"))) {
                                i2 |= 1;
                            }
                        }
                    }
                    if (i2 != 0) {
                        if (displayName != null && displayName.startsWith("wlan")) {
                            map = q;
                            str = "WIFI";
                            valueOf = Integer.valueOf(i2);
                        } else if (displayName != null && displayName.startsWith("rmnet")) {
                            map = q;
                            str = "MOBILE";
                            valueOf = Integer.valueOf(i2);
                        }
                        map.put(str, valueOf);
                    }
                }
            }
        } catch (Throwable th) {
            as.a(th, "at", "ipstack");
        }
    }
}
