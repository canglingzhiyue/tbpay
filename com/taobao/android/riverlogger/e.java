package com.taobao.android.riverlogger;

import android.content.Context;
import android.content.pm.PackageManager;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.http.RequestMethodConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.a;
import com.taobao.android.riverlogger.internal.RVLWVPlugin;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<f> f14903a;
    private static final AtomicBoolean b;
    private static final AtomicBoolean c;
    private static RVLLevel d;
    private static final AtomicLong e;

    static {
        kge.a(364370562);
        f14903a = new ConcurrentLinkedQueue<>();
        b = new AtomicBoolean(false);
        c = new AtomicBoolean(false);
        d = RVLLevel.Info;
        e = new AtomicLong(1L);
        f14903a.add(c.instance);
    }

    public static RVLLevel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RVLLevel) ipChange.ipc$dispatch("bc18a397", new Object[0]) : d;
    }

    public static void a(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64defcd7", new Object[]{rVLLevel});
        } else {
            c.instance.a(rVLLevel);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        RVLLevel rVLLevel = RVLLevel.Off;
        Iterator<f> it = f14903a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RVLLevel a2 = it.next().a();
            if (a2.value > rVLLevel.value) {
                if (a2 == RVLLevel.Verbose) {
                    rVLLevel = a2;
                    break;
                }
                rVLLevel = a2;
            }
        }
        if (rVLLevel == d) {
            return;
        }
        d = rVLLevel;
        NativeAdaptor.setLogLevel(rVLLevel.value);
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f33997", new Object[]{fVar});
        } else if (fVar == null) {
        } else {
            f14903a.add(fVar);
            b();
        }
    }

    public static void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf430d8", new Object[]{fVar});
            return;
        }
        f14903a.remove(fVar);
        b();
    }

    public static void a(RVLLevel rVLLevel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d466d26b", new Object[]{rVLLevel, str, str2});
        } else if (rVLLevel == null || rVLLevel.value > d.value || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            d dVar = new d(rVLLevel, str, System.currentTimeMillis());
            dVar.i = str2;
            a(dVar);
        }
    }

    public static b a(RVLLevel rVLLevel, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fc008208", new Object[]{rVLLevel, str}) : new b(rVLLevel, str);
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f250d9", new Object[]{dVar});
            return;
        }
        Iterator<f> it = f14903a.iterator();
        while (it.hasNext()) {
            it.next().a(dVar);
        }
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue() : e.getAndIncrement();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null || str.length() == 0) {
            str = RequestMethodConstants.TRACE_METHOD;
        }
        return str + "_" + d();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        if (context != null && c.compareAndSet(false, true)) {
            a.a("os", "Android");
            a.a("AppInfo", b(context));
            com.taobao.android.riverlogger.inspector.e.a(context.getSharedPreferences(com.taobao.android.riverlogger.inspector.g.RVLModuleName, 0));
            com.taobao.android.riverlogger.internal.b.a(context);
        }
        if (!b.compareAndSet(false, true)) {
            return;
        }
        g.a();
        try {
            q.a(com.taobao.android.riverlogger.inspector.g.RVLModuleName, (Class<? extends android.taobao.windvane.jsbridge.e>) RVLWVPlugin.class);
        } catch (Exception | NoClassDefFoundError unused) {
        }
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String charSequence = packageManager.getApplicationLabel(context.getApplicationInfo()).toString();
            String str = packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            return charSequence + "/" + str;
        } catch (Exception unused) {
            return "UnknownApp";
        }
    }

    @Deprecated
    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            j.a(str, str2, str3);
        }
    }

    @Deprecated
    public static void a(i iVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764ab9a1", new Object[]{iVar, hVar});
        } else if (iVar == null) {
            if (hVar == null) {
                return;
            }
            hVar.a(false, "Invalid parameter");
        } else if (iVar.c()) {
            hVar.a(false, "Not supported");
        } else {
            j.a(iVar.a(), iVar.b(), hVar);
        }
    }

    @Deprecated
    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            com.taobao.android.riverlogger.inspector.e.a("user close");
        }
    }
}
