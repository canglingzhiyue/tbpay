package com.taobao.monitor;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.data.battery.SensorManager;
import com.taobao.monitor.impl.data.savemode.SaveModeMonitor;
import com.taobao.monitor.impl.data.thread.LooperMonitor;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.MemoryDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.c;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.i;
import com.taobao.monitor.impl.trace.j;
import com.taobao.monitor.impl.trace.l;
import com.taobao.monitor.impl.trace.n;
import com.taobao.monitor.impl.trace.o;
import com.taobao.monitor.impl.trace.p;
import com.taobao.monitor.impl.trace.q;
import com.taobao.monitor.impl.trace.r;
import com.taobao.monitor.impl.trace.s;
import com.taobao.monitor.impl.util.g;
import com.taobao.monitor.impl.util.h;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import tb.jzs;
import tb.mnd;
import tb.mnz;
import tb.moa;
import tb.mob;
import tb.mof;
import tb.mom;
import tb.moy;
import tb.moz;
import tb.mpa;
import tb.mpf;
import tb.mpy;
import tb.mqe;
import tb.myj;
import tb.myk;
import tb.njh;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    public static List<Observer> f18124a = new ArrayList();
    private static final jzs c = new jzs();

    public static /* synthetic */ jzs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jzs) ipChange.ipc$dispatch("f06ac5b", new Object[0]) : c;
    }

    public static /* synthetic */ void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            d(application);
        }
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            k();
        }
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            i();
        }
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            g();
        }
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            h();
        }
    }

    public static void a(Application application, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eeaf2e", new Object[]{application, map});
        } else if (b) {
        } else {
            b = true;
            b(application, map);
            f();
            j();
            c(application);
            b(application);
            a(f18124a);
            com.taobao.application.common.b.a();
            l();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(android.app.Application r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.monitor.a.b(android.app.Application, java.util.Map):void");
    }

    private static String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map != null) {
            mnd.l = mqe.a(map.get("appVersion"), "unknown");
            Object obj = map.get("deviceId");
            if (obj instanceof String) {
                String str = (String) obj;
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                } catch (Exception unused) {
                }
                return "ALI_APM/" + str + "/monitor/procedure";
            }
        }
        return "ALI_APM/device-id/monitor/procedure";
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.monitor.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    if (mnd.j == 0) {
                        mpa.f31181a = mpa.WARM;
                        mpa.b = true;
                        a.a().a(mpa.WARM);
                    }
                    return false;
                }
            });
        }
    }

    private static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
            return;
        }
        mob mobVar = new mob(application);
        application.registerActivityLifecycleCallbacks(mobVar);
        f18124a.add(mobVar);
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else if (!d.g) {
        } else {
            mpy.b().a(new mpf());
        }
    }

    private static void a(final List<Observer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else if (Build.VERSION.SDK_INT > 28 && ("212200".equals(e.a().g()) || Build.VERSION.SDK_INT > 30)) {
        } else {
            a(new Runnable() { // from class: com.taobao.monitor.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.monitor.impl.common.b.a(list);
                    }
                }
            });
        }
    }

    private static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            e.a().j().postAtFrontOfQueue(runnable);
        }
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            mnd.m = Process.getStartUptimeMillis();
            c.b(System.currentTimeMillis() - (SystemClock.uptimeMillis() - mnd.m));
        } else {
            long a2 = g.a();
            c.b(a2);
            if (a2 != -1) {
                mnd.m = h.a() - (System.currentTimeMillis() - a2);
            } else {
                mnd.m = h.a() - Process.getElapsedCpuTime();
            }
        }
        c.c(mnd.m);
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else {
            mnd.q = System.getProperty("oppoCPUResource", "false");
        }
    }

    private static void c(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771ec6b5", new Object[]{application});
        } else {
            e.a().d().post(new Runnable() { // from class: com.taobao.monitor.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (d.f18153a) {
                        a.b();
                        a.a(application);
                    }
                    a.c();
                    a.d();
                    a.e();
                    if (!d.O) {
                        return;
                    }
                    LooperMonitor.a(Looper.getMainLooper());
                }
            });
        }
    }

    private static void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cb7254", new Object[]{application});
            return;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("apm_record", 0);
        String string = sharedPreferences.getString("LAST_TOP_ACTIVITY", "");
        mnd.g = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        sharedPreferences.edit().putString("LAST_TOP_ACTIVITY", "").apply();
    }

    private static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        f.a(com.taobao.monitor.impl.common.a.APPLICATION_LOW_MEMORY_DISPATCHER, new c());
        ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher = new ApplicationBackgroundChangedDispatcher();
        f.a(com.taobao.monitor.impl.common.a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER, applicationBackgroundChangedDispatcher);
        f.a(com.taobao.monitor.impl.common.a.PAGE_FIRST_FRAME_DISPATCHER, new i());
        f.a(com.taobao.monitor.impl.common.a.ACTIVITY_FPS_DISPATCHER, new com.taobao.monitor.impl.trace.h());
        f.a(com.taobao.monitor.impl.common.a.ACTIVITY_SCROLL_HITCH_RATE_V2_DISPATCHER, new s());
        f.a(com.taobao.monitor.impl.common.a.WINDOW_EVENT_DISPATCHER, new r());
        f.a(com.taobao.monitor.impl.common.a.PAGE_RENDER_DISPATCHER, new q());
        f.a(com.taobao.monitor.impl.common.a.PAGE_LEAVE_DISPATCHER, new PageLeaveDispatcher());
        com.taobao.monitor.impl.trace.b bVar = new com.taobao.monitor.impl.trace.b();
        bVar.a((com.taobao.monitor.impl.trace.b) new moz());
        f.a(com.taobao.monitor.impl.common.a.ACTIVITY_LIFECYCLE_DISPATCHER, bVar);
        f.a(com.taobao.monitor.impl.common.a.FRAGMENT_LIFECYCLE_DISPATCHER, new l());
        f.a(com.taobao.monitor.impl.common.a.FRAGMENT_LIFECYCLE_FUNCTION_DISPATCHER, new j());
        com.taobao.monitor.impl.trace.e eVar = new com.taobao.monitor.impl.trace.e();
        eVar.a((com.taobao.monitor.impl.trace.e) new moa());
        eVar.a((com.taobao.monitor.impl.trace.e) new mom());
        f.a(com.taobao.monitor.impl.common.a.CUSTOM_PAGE_LIFECYCLE_DISPATCHER, eVar);
        f.a(com.taobao.monitor.impl.common.a.IMAGE_STAGE_DISPATCHER, new n());
        njh.a().a(new mnz());
        f.a(com.taobao.monitor.impl.common.a.NETWORK_STAGE_DISPATCHER, new p());
        myk.a().a(new mof());
        myj.a().a(new mof());
        f.a(com.taobao.monitor.impl.common.a.LOOPER_HEAVY_MSG_DISPATCHER, new o());
        if (!d.f18153a) {
            k();
        }
        com.taobao.monitor.impl.trace.d dVar = new com.taobao.monitor.impl.trace.d();
        f.a(com.taobao.monitor.impl.common.a.BATTERY_DISPATCHER, dVar);
        SensorManager.setBatteryDispatcher(dVar);
        moy moyVar = new moy();
        applicationBackgroundChangedDispatcher.a((ApplicationBackgroundChangedDispatcher) moyVar);
        eVar.a((com.taobao.monitor.impl.trace.e) moyVar);
        dVar.a((com.taobao.monitor.impl.trace.d) moyVar);
    }

    private static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
            return;
        }
        if (d.ae) {
            f.a(com.taobao.monitor.impl.common.a.CLOCKED_MEMORY_DISPATCHER, new MemoryDispatcher());
        }
        new SaveModeMonitor();
    }

    private static void l() {
        if ((Build.VERSION.SDK_INT < 29 || !d.ad) && !new File("/data/local/tmp/.apm/.looperObserverInit").exists()) {
            return;
        }
        try {
            Class.forName("com.taobao.monitor.impl.data.thread.LooperObserver").getDeclaredMethod("init", new Class[0]).invoke(null, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
