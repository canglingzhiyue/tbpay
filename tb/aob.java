package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.analytics.core.config.a;
import com.alibaba.analytics.core.config.b;
import com.alibaba.analytics.core.config.c;
import com.alibaba.analytics.core.config.d;
import com.alibaba.analytics.core.config.f;
import com.alibaba.analytics.core.config.g;
import com.alibaba.analytics.core.config.h;
import com.alibaba.analytics.core.config.i;
import com.alibaba.analytics.core.config.l;
import com.alibaba.analytics.core.config.o;
import com.alibaba.analytics.core.config.p;
import com.alibaba.analytics.core.config.q;
import com.alibaba.analytics.core.config.t;
import com.alibaba.analytics.core.config.u;
import com.alibaba.analytics.core.config.v;
import com.alibaba.analytics.core.logbuilder.GoogleAdvertisingIdClient;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.analytics.core.sync.UploadMode;
import com.alibaba.analytics.core.sync.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.e;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class aob {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aob s_instance;

    /* renamed from: a  reason: collision with root package name */
    private String f25461a;
    private Context b = null;
    private String c = null;
    private String d = null;
    private volatile rpw e = null;
    private String f = null;
    private String g = null;
    private String h = null;
    private String i = null;
    private String j = null;
    private String k = null;
    private String l = null;
    private String m = null;
    private boolean n = false;
    private String o = null;
    private Map<String, String> p = null;
    private boolean q = false;
    private String r = null;
    private volatile boolean s = false;
    private aoe t = null;
    private g u = null;
    private volatile boolean v = false;
    private volatile String w = null;
    private volatile boolean x = false;
    private String y = "";
    private String K = "";
    private long z = 0;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = true;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private String I = null;
    private boolean J = false;

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Context a(aob aobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b10f335c", new Object[]{aobVar}) : aobVar.b;
    }

    public static /* synthetic */ String a(aob aobVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("797d9d32", new Object[]{aobVar, str});
        }
        aobVar.y = str;
        return str;
    }

    public static /* synthetic */ String b(aob aobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f096345b", new Object[]{aobVar}) : aobVar.y;
    }

    public static /* synthetic */ String b(aob aobVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3483f11", new Object[]{aobVar, str});
        }
        aobVar.K = str;
        return str;
    }

    public static /* synthetic */ String c(aob aobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f142dffa", new Object[]{aobVar}) : aobVar.K;
    }

    public static /* synthetic */ void d(aob aobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abedd3e7", new Object[]{aobVar});
        } else {
            aobVar.N();
        }
    }

    static {
        kge.a(-1913103695);
        s_instance = new aob();
    }

    public static aob a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aob) ipChange.ipc$dispatch("f0269aa", new Object[0]) : s_instance;
    }

    @Deprecated
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.v = true;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.E = true;
        }
    }

    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public synchronized void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public synchronized boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public synchronized void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public synchronized boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.D;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.w == null) {
            return null;
        }
        return "" + this.w.hashCode();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.w;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [tb.aob$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [tb.aob$2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [tb.aob$3] */
    public synchronized void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.b = application.getApplicationContext();
        if (this.b == null) {
            apr.c("Variables", "AnalyticsImp init failed, context is null");
            return;
        }
        apr.d("Variables", "init", Boolean.valueOf(this.s));
        if (!this.s) {
            new Thread("UtOaid") { // from class: tb.aob.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String a2 = bzj.a(aob.a(aob.this));
                        if (!TextUtils.isEmpty(a2) && TextUtils.isEmpty(aob.b(aob.this))) {
                            aob.a(aob.this, a2);
                        }
                        apr.b("Variables", "getOAID", aob.b(aob.this));
                    } catch (Throwable unused) {
                    }
                }
            }.start();
            new Thread("UtOaid2") { // from class: tb.aob.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String b = bzj.b(aob.a(aob.this));
                        if (!TextUtils.isEmpty(b) && TextUtils.isEmpty(aob.c(aob.this))) {
                            aob.b(aob.this, b);
                        }
                        apr.b("Variables", "getOAID2", aob.c(aob.this));
                    } catch (Throwable unused) {
                    }
                }
            }.start();
            new Thread("UtGaid") { // from class: tb.aob.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        GoogleAdvertisingIdClient.a(aob.a(aob.this));
                        apr.b("Variables", "initAdvertisingIdInfo");
                    } catch (Throwable unused) {
                    }
                }
            }.start();
            Class<?> cls = null;
            m.a().a(this.b);
            aos.a().b();
            aov.a();
            O();
            new aog(this.b, "ut.db").a();
            this.t = new aoe(this.b, "ut.db");
            NetworkUtil.g(this.b);
            try {
                cls = Class.forName("com.taobao.orange.OrangeConfig");
            } catch (Throwable unused) {
            }
            if (cls != null) {
                this.u = new o();
            } else {
                this.u = new l();
            }
            this.u.a(q.a());
            this.u.a(new h());
            this.u.a(bti.a());
            this.u.a(p.a());
            try {
                this.u.a(f.a());
                aor.a().b();
                f.a().a(b.KEY, new b());
                f.a().a(a.KEY, new a());
                f.a().a(t.KEY, new t());
                f.a().a(c.KEY, new c());
                f.a().a(d.KEY, new d());
                f.a().a(com.alibaba.analytics.core.config.m.KEY, com.alibaba.analytics.core.config.m.a());
                f.a().a(v.KEY, v.a());
                f.a().a(u.KEY, u.a());
                apb.a().b();
            } catch (Throwable unused2) {
            }
            this.u.d();
            com.alibaba.analytics.core.logbuilder.g.a().b();
            bsw.a(application);
            e.getInstance().initUT(application);
            P();
            com.alibaba.analytics.core.sync.p.a().a(this.b);
            aqe.a().a(new Runnable() { // from class: tb.aob.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aob.d(aob.this);
                    }
                }
            });
            this.s = true;
            apr.d("Variables", "init", Boolean.valueOf(this.s));
            return;
        }
        i.a();
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        try {
            Map<String, String> c = apg.c(this.b);
            if (c == null || c.size() <= 0) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(LogField.EVENTID.toString(), "1021");
            hashMap.putAll(c);
            e.getInstance().transferLog(hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public g j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a164b062", new Object[]{this}) : this.u;
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("UTCommon", 0);
        String string = sharedPreferences.getString("_lun", "");
        if (!aqc.e(string)) {
            try {
                this.i = new String(aph.a(string.getBytes(), 2), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String string2 = sharedPreferences.getString("_luid", "");
        if (!aqc.e(string2)) {
            try {
                this.k = new String(aph.a(string2.getBytes(), 2), "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        String string3 = sharedPreferences.getString("_openid", "");
        if (!aqc.e(string3)) {
            try {
                this.f25461a = new String(aph.a(string3.getBytes(), 2), "UTF-8");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String string4 = sharedPreferences.getString("_usersite", "");
        if (aqc.e(string4)) {
            return;
        }
        try {
            this.m = new String(aph.a(string4.getBytes(), 2), "UTF-8");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public Context k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("12b3006a", new Object[]{this}) : this.b;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.c;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String m() {
        Map<String, String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g) && (b = aqf.b(k())) != null) {
            this.g = b.get(LogField.APPVERSION);
        }
        return this.g;
    }

    public void a(rpw rpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7ec63f", new Object[]{this, rpwVar});
            return;
        }
        this.e = rpwVar;
        if (rpwVar == null) {
            return;
        }
        this.c = rpwVar.getAppkey();
    }

    public rpw n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rpw) ipChange.ipc$dispatch("730f9018", new Object[]{this}) : this.e;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            e(true);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        apr.b((String) null, str, str);
        this.f = str;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.i;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.k;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.m;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f)) {
            String a2 = aqb.a(k(), "channel");
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return this.f;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : this.h;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.j;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.l;
    }

    public String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.f25461a;
    }

    @Deprecated
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        e(str);
        a(str2, str3);
        f(str);
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        e(str);
        i(str4);
        a(str2, str3);
        f(str);
        j(str4);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            g(null);
            k(null);
        } else if (TextUtils.isEmpty(str2) && str.equals(this.j)) {
        } else {
            g(str);
            k(str2);
            h(str);
            l(str2);
        }
    }

    public synchronized void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        this.q = true;
        bsw.f26115a = true;
    }

    public synchronized boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        } else if (c.a()) {
            return false;
        } else {
            return this.q;
        }
    }

    public synchronized void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.p = map;
        }
    }

    public synchronized Map<String, String> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5b83476", new Object[]{this});
        }
        return this.p;
    }

    public synchronized void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public synchronized String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this});
        }
        return this.o;
    }

    public synchronized boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public synchronized void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.n = true;
        }
    }

    public synchronized void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            this.n = false;
        }
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.x;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        D();
        d((String) null);
        com.alibaba.analytics.core.sync.p.a().a(UploadMode.INTERVAL);
        d((Map<String, String>) null);
        this.x = false;
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        c(map);
        d(map);
    }

    private void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        apr.c();
        if ("0".equalsIgnoreCase(f.a().a("real_time_debug"))) {
            apr.c("Variables", "Server Config turn off RealTimeDebug Mode!");
        } else if (c.a()) {
            apr.c("Variables", "Server Config(disable_ut_debug) turn off RealTimeDebug Mode!");
        } else if (map == null) {
        } else {
            if ((a().B() && map.containsKey("debug_normal")) || !map.containsKey("debug_api_url") || !map.containsKey("debug_key")) {
                return;
            }
            String str = map.get("debug_key");
            if (!aqc.e(map.get("debug_api_url")) && !aqc.e(str)) {
                C();
                d(str);
            }
            if (map.containsKey("debug_sampling_option")) {
                x();
            }
            if (map.containsKey("debug_normal")) {
                return;
            }
            e(true);
            com.alibaba.analytics.core.sync.p.a().a(UploadMode.REALTIME);
        }
    }

    private void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else if (this.b == null) {
        } else {
            apr.a("", map);
            SharedPreferences.Editor edit = this.b.getSharedPreferences("UTRealTimeDebug", 0).edit();
            if (map != null && map.containsKey("debug_store")) {
                edit.putString("debug_api_url", map.get("debug_api_url"));
                edit.putString("debug_key", map.get("debug_key"));
                edit.putLong("debug_date", System.currentTimeMillis());
            } else {
                edit.putLong("debug_date", 0L);
            }
            edit.commit();
        }
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        Context context = this.b;
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("UTRealTimeDebug", 0);
        long j = sharedPreferences.getLong("debug_date", 0L);
        apr.b("", "debugDate", Long.valueOf(j));
        if (System.currentTimeMillis() - j > 14400000) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("debug_api_url", sharedPreferences.getString("debug_api_url", ""));
        hashMap.put("debug_key", sharedPreferences.getString("debug_key", ""));
        c(hashMap);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            apr.a(z);
        }
    }

    public aoe G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aoe) ipChange.ipc$dispatch("46f79e61", new Object[]{this}) : this.t;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.s;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        if (this.H) {
            return this.G;
        }
        Context k = k();
        if (k == null) {
            return false;
        }
        if ("1".equalsIgnoreCase(apg.a(k, "package_type"))) {
            this.G = true;
            this.H = true;
        }
        return this.G;
    }

    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2078db8e", new Object[]{this});
        }
        if (this.J) {
            return this.I;
        }
        Context k = k();
        if (k == null) {
            return null;
        }
        this.I = apg.a(k, "build_id");
        this.J = true;
        return this.I;
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        this.h = str;
        if (aqc.e(str)) {
            return;
        }
        this.i = str;
    }

    private void f(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (aqc.e(str) || (context = this.b) == null) {
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_lun", new String(aph.c(str.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        this.j = str;
        if (aqc.e(str)) {
            return;
        }
        this.k = str;
    }

    private void h(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else if (aqc.e(str) || (context = this.b) == null) {
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_luid", new String(aph.c(str.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    private void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        this.l = str;
        if (aqc.e(str)) {
            return;
        }
        this.m = str;
    }

    private void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        Context context = this.b;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
            if (TextUtils.isEmpty(str)) {
                edit.putString("_usersite", null);
            } else {
                edit.putString("_usersite", new String(aph.c(str.getBytes("UTF-8"), 2)));
            }
            edit.commit();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            this.f25461a = str;
        }
    }

    private void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
            return;
        }
        Context context = this.b;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
            if (TextUtils.isEmpty(str)) {
                edit.putString("_openid", null);
            } else {
                edit.putString("_openid", new String(aph.c(str.getBytes("UTF-8"), 2)));
            }
            edit.commit();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6fe962d", new Object[]{this}) : this.y;
    }

    public String Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("479b3b48", new Object[]{this}) : this.K;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.z = j;
        }
    }

    public long M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4529648", new Object[]{this})).longValue() : this.z;
    }
}
