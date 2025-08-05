package com.ut.mini;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTHitBuilders;
import tb.apg;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f24145a;

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    static {
        kge.a(-1630538601);
        f24145a = false;
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        synchronized (p.class) {
            if (f24145a) {
                return;
            }
            f24145a = true;
            aqe.a().a(new Runnable() { // from class: com.ut.mini.p.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context2 = context;
                    if (context2 == null || !apg.e(context2)) {
                        return;
                    }
                    p.a();
                    try {
                        Thread.sleep(500L);
                        AnalyticsMgr.k();
                        Thread.sleep(500L);
                        AnalyticsMgr.j();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("BootTime");
        uTCustomHitBuilder.setProperty("bootTime", "" + currentTimeMillis);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
