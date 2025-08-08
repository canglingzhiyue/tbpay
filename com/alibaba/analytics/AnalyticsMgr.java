package com.alibaba.analytics;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.IAnalytics;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.any;
import tb.apg;
import tb.apr;
import tb.aqc;
import tb.aqj;
import tb.fia;
import tb.fih;
import tb.kge;
import tb.xlj;
import tb.xlk;

/* loaded from: classes.dex */
public class AnalyticsMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ServiceConnection A;
    private static int B;

    /* renamed from: a  reason: collision with root package name */
    public static IAnalytics f2031a;
    @Deprecated
    public static d b;
    public static volatile boolean c;
    public static RunMode d;
    public static boolean e;
    private static Application f;
    public static fia g;
    private static final Object h;
    private static final Object i;
    private static boolean j;
    private static String k;
    private static String l;
    private static String m;
    public static final List<a> mRegisterList;
    private static boolean n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;
    private static boolean s;
    private static Map<String, String> t;
    private static Map<String, String> u;
    private static Map<String, String> v;
    private static boolean w;
    private static boolean x;
    private static String y;
    private static int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum RunMode {
        Local,
        Service
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f2043a;
        public String b;
        public MeasureSet c;
        public DimensionSet d;
        public boolean e;

        static {
            kge.a(-1258959221);
        }
    }

    public static /* synthetic */ Runnable G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("fd7d4d86", new Object[0]) : x();
    }

    public static /* synthetic */ boolean a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z2)})).booleanValue();
        }
        j = z2;
        return z2;
    }

    public static /* synthetic */ boolean b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z2)})).booleanValue();
        }
        w = z2;
        return z2;
    }

    public static /* synthetic */ ServiceConnection n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("e9f06b69", new Object[0]) : A;
    }

    public static /* synthetic */ Object o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("18843c7c", new Object[0]) : h;
    }

    public static /* synthetic */ void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[0]);
        } else {
            v();
        }
    }

    public static /* synthetic */ Application q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("8e204047", new Object[0]) : f;
    }

    public static /* synthetic */ Object r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ac156c59", new Object[0]) : i;
    }

    public static /* synthetic */ boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : w;
    }

    public static /* synthetic */ int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[0])).intValue() : E();
    }

    public static /* synthetic */ boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : w();
    }

    static {
        kge.a(-1844093156);
        f = null;
        h = new Object();
        i = new Object();
        c = false;
        d = RunMode.Service;
        j = false;
        k = null;
        l = null;
        m = null;
        n = false;
        o = null;
        p = null;
        q = null;
        r = null;
        e = false;
        s = false;
        t = null;
        u = null;
        mRegisterList = Collections.synchronizedList(new ArrayList());
        v = new ConcurrentHashMap();
        w = false;
        x = false;
        y = null;
        B = 5;
        z = 5;
        A = new ServiceConnection() { // from class: com.alibaba.analytics.AnalyticsMgr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    return;
                }
                apr.b("AnalyticsMgr", "+++onServiceConnected mConnection+++", AnalyticsMgr.n());
                if (RunMode.Service == AnalyticsMgr.d) {
                    AnalyticsMgr.f2031a = IAnalytics.Stub.asInterface(iBinder);
                    apr.d("AnalyticsMgr", "onServiceConnected iAnalytics", AnalyticsMgr.f2031a);
                }
                synchronized (AnalyticsMgr.o()) {
                    AnalyticsMgr.o().notifyAll();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    return;
                }
                apr.b("AnalyticsMgr", "[onServiceDisconnected]");
                synchronized (AnalyticsMgr.o()) {
                    AnalyticsMgr.o().notifyAll();
                }
                AnalyticsMgr.a(true);
            }
        };
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else if (i2 < 0 || i2 > 30) {
        } else {
            z = i2;
        }
    }

    public static synchronized void a(Application application) {
        synchronized (AnalyticsMgr.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75c56f77", new Object[]{application});
                return;
            }
            if (!c) {
                apr.d("AnalyticsMgr", "[init] start sdk_version", aqj.a().b());
                f = application;
                fih b2 = fih.b();
                g = b2;
                b2.a();
                F();
                try {
                    g.a(new c());
                } catch (Throwable th) {
                    apr.e("AnalyticsMgr", "4", th);
                }
                c = true;
                apr.b("AnalyticsMgr", "外面init完成");
            }
            apr.c("AnalyticsMgr", "isInit", Boolean.valueOf(c), "sdk_version", aqj.a().b());
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : q;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            synchronized (i) {
                i.notifyAll();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!i()) {
        } else {
            g.a(f(str));
            l = str;
        }
    }

    public static void a(boolean z2, boolean z3, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6de2dfc", new Object[]{new Boolean(z2), new Boolean(z3), str, str2});
        } else if (!i()) {
        } else {
            g.a(b(z2, z3, str, str2));
            n = z2;
            k = str;
            m = str2;
            x = z3;
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (!i()) {
        } else {
            g.a(d(map));
            u = map;
            s = true;
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!i()) {
        } else {
            g.a(y());
            s = false;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        apr.d("AnalyticsMgr", "aAppVersion", str);
        if (!i()) {
            return;
        }
        g.a(g(str));
        o = str;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        apr.d("AnalyticsMgr", "turnOnDebug");
        if (!i()) {
            return;
        }
        g.a(z());
        e = true;
        apr.a(true);
    }

    @Deprecated
    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a(str, str2, str3, (String) null);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        apr.d("AnalyticsMgr", "userNick", str, "userId", str2, "openId", str3, "userSite", str4);
        if (!i()) {
            return;
        }
        g.a(b(str, str2, str3, str4));
        c(str, str2, str3, str4);
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else if (!i()) {
        } else {
            g.a(e(map));
            t = map;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        IAnalytics iAnalytics = f2031a;
        if (iAnalytics == null) {
            return null;
        }
        try {
            return iAnalytics.getValue(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
        } else if (!i()) {
        } else {
            g.a(f(map));
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (!i()) {
        } else {
            g.a(B());
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else if (!i()) {
        } else {
            g.a(C());
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else if (!i()) {
        } else {
            g.a(D());
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else if (!i()) {
        } else {
            g.a(a(any.d().j()));
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        if (!c) {
            apr.b("AnalyticsMgr", "Please call init() before call other method");
        }
        return c;
    }

    private static void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[0]);
            return;
        }
        d = RunMode.Local;
        f2031a = new AnalyticsImp(f);
        apr.c("AnalyticsMgr", "Analytics Service run in local Mode...");
    }

    private static boolean w() {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        if (f == null) {
            return false;
        }
        if (d == RunMode.Service) {
            xlj uTService = xlk.getUTService();
            if (uTService != null) {
                apr.d("AnalyticsMgr", "+++UTService bindService+++");
                z2 = uTService.bindService(new Intent(f.getApplicationContext(), AnalyticsService.class), A, 1);
            } else {
                apr.d("AnalyticsMgr", "+++ApplicationService bindService+++");
                z2 = f.getApplicationContext().bindService(new Intent(f.getApplicationContext(), AnalyticsService.class), A, 1);
            }
            if (!z2) {
                v();
            }
        } else {
            v();
            z2 = false;
        }
        apr.d("AnalyticsMgr", "bindSuccess", Boolean.valueOf(z2));
        return z2;
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
        } else if (!i()) {
        } else {
            g.a(A());
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
        } else if (!i()) {
        } else {
            g.a(m());
        }
    }

    private static Runnable x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("39c9a635", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                apr.d("AnalyticsMgr", "---call Remote init start---");
                try {
                    AnalyticsMgr.f2031a.initUT();
                } catch (Throwable th) {
                    apr.e("AnalyticsMgr", "initut error", th);
                    AnalyticsMgr.p();
                    try {
                        AnalyticsMgr.f2031a.initUT();
                    } catch (Throwable th2) {
                        apr.e("AnalyticsMgr", "initut error", th2);
                    }
                }
                try {
                    any.d().k();
                } catch (Exception unused) {
                }
                apr.d("AnalyticsMgr", "---call Remote init end---");
            }
        };
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
            return;
        }
        apr.b("AnalyticsMgr", "[restart]");
        try {
            if (!j) {
                return;
            }
            j = false;
            v();
            x().run();
            b(n, x, k, m).run();
            f(l).run();
            g(o).run();
            b(p, q, y, r).run();
            e(t).run();
            if (e) {
                z().run();
            }
            if (s && u != null) {
                f(u).run();
            } else if (s) {
                y().run();
            }
            List synchronizedList = Collections.synchronizedList(new ArrayList());
            synchronized (mRegisterList) {
                synchronizedList.addAll(mRegisterList);
            }
            for (int i2 = 0; i2 < synchronizedList.size(); i2++) {
                a aVar = (a) synchronizedList.get(i2);
                if (aVar != null) {
                    a(aVar.f2043a, aVar.b, aVar.c, aVar.d, aVar.e).run();
                }
            }
            for (Map.Entry<String, String> entry : v.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        } catch (Throwable th) {
            apr.e("AnalyticsMgr", "[restart]", th);
        }
    }

    private static Runnable d(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("8e4b821a", new Object[]{map}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.turnOnRealTimeDebug(map);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    private static Runnable y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("35cb3514", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.turnOffRealTimeDebug();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    private static Runnable b(final boolean z2, final boolean z3, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("2500cdb7", new Object[]{new Boolean(z2), new Boolean(z3), str, str2}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.setRequestAuthInfo(z2, z3, str, str2);
                } catch (Throwable unused) {
                }
            }
        };
    }

    private static Runnable f(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("8736c1bd", new Object[]{str}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.setChannel(str);
                } catch (Throwable unused) {
                }
            }
        };
    }

    private static Runnable a(final String str, final String str2, final MeasureSet measureSet, final DimensionSet dimensionSet, final boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("882a8e44", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z2)}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    apr.b("register stat event", "module", str, " monitorPoint: ", str2);
                    AnalyticsMgr.f2031a.register4(str, str2, measureSet, dimensionSet, z2);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    private static Runnable g(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("8e9bf6dc", new Object[]{str}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.setAppVersion(str);
                } catch (Throwable unused) {
                }
            }
        };
    }

    private static Runnable z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("31ccc3f3", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.turnOnDebug();
                } catch (Throwable unused) {
                }
            }
        };
    }

    private static Runnable b(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("5285cee3", new Object[]{str, str2, str3, str4}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.updateUserAccount(str, str2, str3, str4);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
    }

    private static Runnable e(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("574c795b", new Object[]{map}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.updateSessionProperties(map);
                } catch (Throwable unused) {
                }
            }
        };
    }

    private static Runnable A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("1573f44c", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.dispatchLocalHits();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    public static Runnable m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("65b882a0", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.saveCacheDataToLocal();
                } catch (RemoteException e2) {
                    apr.a("AnalyticsMgr", e2, new Object[0]);
                }
            }
        };
    }

    private static Runnable f(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("204d709c", new Object[]{map}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.setSessionProperties(map);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    private static Runnable B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("1175832b", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.sessionTimeout();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    private static Runnable C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("d77120a", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    apr.b("AnalyticsMgr", "onBackground");
                    AnalyticsMgr.f2031a.onBackground();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    private static Runnable D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("978a0e9", new Object[0]) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    apr.b("AnalyticsMgr", "onForeground");
                    AnalyticsMgr.f2031a.onForeground();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    public static void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{exc});
            return;
        }
        apr.a("AnalyticsMgr", exc, new Object[0]);
        if (!(exc instanceof DeadObjectException)) {
            return;
        }
        l();
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2001641297);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                apr.d("AnalyticsMgr", "---延时启动任务开始---");
                String f = apg.f(AnalyticsMgr.q().getApplicationContext());
                boolean z = f != null && f.endsWith(":channel");
                synchronized (AnalyticsMgr.r()) {
                    int t = AnalyticsMgr.t();
                    if (t > 0) {
                        if (z) {
                            t = 3;
                        }
                        apr.d("AnalyticsMgr", "delay " + t + " second to start service,waiting...");
                        try {
                            AnalyticsMgr.r().wait(t * 1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (z) {
                    AnalyticsMgr.p();
                } else {
                    AnalyticsMgr.b(AnalyticsMgr.u());
                }
                new b().run();
                apr.d("AnalyticsMgr", "---延时启动任务结束---");
            } catch (Throwable th) {
                apr.e("AnalyticsMgr", "6", th);
            }
        }
    }

    private static int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[0])).intValue();
        }
        String a2 = apg.a(f.getApplicationContext(), "UTANALYTICS_REMOTE_SERVICE_DELAY_SECOND");
        int i2 = B;
        int i3 = z;
        if (i3 >= 0 && i3 <= 30) {
            i2 = i3;
        }
        if (StringUtils.isEmpty(a2)) {
            return i2;
        }
        try {
            int intValue = Integer.valueOf(a2).intValue();
            return (intValue < 0 || intValue > 30) ? i2 : intValue;
        } catch (Throwable unused) {
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(633941807);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (AnalyticsMgr.s()) {
                    apr.d("AnalyticsMgr", "delay 30 sec to wait the Remote service connected,waiting...");
                    synchronized (AnalyticsMgr.o()) {
                        try {
                            AnalyticsMgr.o().wait(30000L);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (AnalyticsMgr.f2031a == null) {
                    apr.d("AnalyticsMgr", "cannot get remote analytics object,new local object");
                    AnalyticsMgr.p();
                }
                AnalyticsMgr.G().run();
            } catch (Throwable th) {
                apr.e("AnalyticsMgr", "7", th);
            }
        }
    }

    private static void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107fb192", new Object[]{str, str2, str3, str4});
            return;
        }
        p = str;
        if (StringUtils.isEmpty(str2)) {
            q = null;
            y = null;
        } else if (!StringUtils.isEmpty(str3) || !str2.equals(q)) {
            q = str2;
            y = str3;
        }
        r = str4;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!i()) {
        } else {
            if (aqc.e(str) || str2 == null) {
                apr.e("AnalyticsMgr", "setGlobalProperty", "key is null or key is empty or value is null,please check it!");
                return;
            }
            v.put(str, str2);
            g.a(b(str, str2));
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (!i() || aqc.e(str) || !v.containsKey(str)) {
        } else {
            v.remove(str);
            g.a(h(str));
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        if (!i() || str == null) {
            return null;
        }
        return v.get(str);
    }

    private static Runnable b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("db4599f7", new Object[]{str, str2}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.setGlobalProperty(str, str2);
                } catch (RemoteException e2) {
                    AnalyticsMgr.a(e2);
                }
            }
        };
    }

    private static Runnable h(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("96012bfb", new Object[]{str}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.removeGlobalProperty(str);
                } catch (RemoteException e2) {
                    AnalyticsMgr.a(e2);
                }
            }
        };
    }

    private static Runnable a(final long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("983cb8b8", new Object[]{new Long(j2)}) : new Runnable() { // from class: com.alibaba.analytics.AnalyticsMgr.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    apr.b("AnalyticsMgr", "startMainProcess");
                    AnalyticsMgr.f2031a.startMainProcess(j2);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    @Deprecated
    private static void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[0]);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("Analytics_Client_Deprecated");
        try {
            handlerThread.start();
        } catch (Throwable th) {
            apr.e("AnalyticsMgr", "1", th);
        }
        Looper looper = null;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                looper = handlerThread.getLooper();
                if (looper != null) {
                    break;
                }
                Thread.sleep(10L);
            } catch (Throwable th2) {
                apr.e("AnalyticsMgr", "3", th2);
            }
        }
        b = new d(looper);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-761865499);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                if (message.obj != null && (message.obj instanceof Runnable)) {
                    ((Runnable) message.obj).run();
                }
            } catch (Throwable th) {
                apr.b("AnalyticsMgr", th, new Object[0]);
            }
            super.handleMessage(message);
        }
    }
}
