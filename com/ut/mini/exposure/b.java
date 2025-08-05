package com.ut.mini.exposure;

import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import tb.any;
import tb.aqb;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f24110a;
    public static double dimThreshold;
    public static int maxTimeThreshold;
    public static boolean notClearTagAfterDisAppear;
    public static int timeThreshold;
    public static boolean trackerExposureOpen;

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    static {
        kge.a(-1061237859);
        trackerExposureOpen = true;
        timeThreshold = 500;
        maxTimeThreshold = 3600000;
        dimThreshold = 0.5d;
        f24110a = null;
        notClearTagAfterDisAppear = false;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            aqe.a().a(new Runnable() { // from class: com.ut.mini.exposure.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        b.a(aqb.a(any.d().e(), "autoExposure"));
                        e.getInstance().getThreadHandle().postDelayed(new Runnable() { // from class: com.ut.mini.exposure.b.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    b.updateExposureConfig();
                                }
                            }
                        }, 15000L);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public static void updateExposureConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3847d9", new Object[0]);
            return;
        }
        try {
            b(AnalyticsMgr.c("autoExposure"));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r10.equalsIgnoreCase(com.ut.mini.exposure.b.f24110a) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.exposure.b.b(java.lang.String):void");
    }
}
