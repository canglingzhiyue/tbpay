package tb;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.analytics.core.selfmonitor.exception.AppMonitorException;
import com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.event.e;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class bsw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26115a;
    public static volatile boolean b;
    private static Application c;
    private static Map<String, String> d;

    static {
        kge.a(975220979);
        f26115a = false;
        b = false;
        d = new ConcurrentHashMap();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!com.alibaba.analytics.core.config.c.a()) {
            return f26115a;
        }
        return false;
    }

    public static synchronized void a(Application application) {
        synchronized (bsw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75c56f77", new Object[]{application});
                return;
            }
            apr.b("AppMonitorDelegate", "start init");
            if (!b) {
                c = application;
                bsy.a();
                bsz.a();
                bsx.a();
                b = true;
            }
        }
    }

    public static synchronized void b() {
        synchronized (bsw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            apr.b("AppMonitorDelegate", "start destory");
            if (b) {
                bsz.c();
                bsz.b();
                bsy.b();
                if (c != null) {
                    NetworkUtil.h(c.getApplicationContext());
                }
                b = false;
            }
        }
    }

    public static synchronized void c() {
        synchronized (bsw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[0]);
                return;
            }
            apr.b("AppMonitorDelegate", "triggerUpload");
            if (b && aob.H()) {
                bsz.c();
            }
        }
    }

    public static void a(int i) {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        for (EventType eventType : EventType.values()) {
            eventType.setStatisticsInterval(i);
            a(eventType, i);
        }
    }

    public static void b(int i) {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            return;
        }
        apr.b("AppMonitorDelegate", "[setSampling]");
        for (EventType eventType : EventType.values()) {
            eventType.setDefaultSampling(i);
            bti.a().a(eventType, i);
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        apr.b("AppMonitorDelegate", "[enableLog]");
        apr.a(z);
    }

    public static void a(String str, String str2, MeasureSet measureSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a0fab0", new Object[]{str, str2, measureSet});
        } else {
            a(str, str2, measureSet, (DimensionSet) null);
        }
    }

    public static void a(String str, String str2, MeasureSet measureSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37f0e24", new Object[]{str, str2, measureSet, new Boolean(z)});
        } else {
            a(str, str2, measureSet, null, z);
        }
    }

    public static void a(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fb7e04", new Object[]{str, str2, measureSet, dimensionSet});
        } else {
            a(str, str2, measureSet, dimensionSet, false);
        }
    }

    public static void a(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a74f550", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z)});
            return;
        }
        try {
            if (!b) {
                return;
            }
            if (!aqc.d(str) && !aqc.d(str2)) {
                com.alibaba.appmonitor.model.a aVar = new com.alibaba.appmonitor.model.a(str, str2, measureSet, dimensionSet, z);
                com.alibaba.appmonitor.model.b.a().a(aVar);
                btf.a().a(aVar);
                return;
            }
            apr.b("AppMonitorDelegate", "register stat event. module: ", str, " monitorPoint: ", str2);
            if (a()) {
                throw new AppMonitorException("register error. module and monitorPoint can't be null");
            }
        } catch (Throwable th) {
            ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }

    public static void a(String str, String str2, String str3, double d2, double d3, double d4) {
        com.alibaba.appmonitor.model.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f485278", new Object[]{str, str2, str3, new Double(d2), new Double(d3), new Double(d4)});
            return;
        }
        apr.b("AppMonitorDelegate", "[updateMeasure]");
        try {
            if (!b || aqc.d(str) || aqc.d(str2) || (a2 = com.alibaba.appmonitor.model.b.a().a(str, str2)) == null || a2.h() == null) {
                return;
            }
            a2.h().upateMeasure(new Measure(str3, Double.valueOf(d4), Double.valueOf(d2), Double.valueOf(d3)));
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-493097152);
        }

        public static void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
                return;
            }
            EventType.ALARM.setStatisticsInterval(i);
            bsw.a(EventType.ALARM, i);
        }

        public static void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            } else {
                bti.a().a(EventType.ALARM, i);
            }
        }

        @Deprecated
        public static boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : bti.a().a(str, str2, (Boolean) true, (Map<String, String>) null);
        }

        public static void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            } else {
                a(str, str2, null);
            }
        }

        public static void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
                return;
            }
            try {
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                    if (!bsw.b || !aob.H() || !EventType.ALARM.isOpen() || (!bsw.a() && !bti.a().a(str, str2, (Boolean) true, (Map<String, String>) null))) {
                        apr.a("log discard !", "module", str, "monitorPoint", str2, IWXUserTrackAdapter.MONITOR_ARG, str3);
                        return;
                    }
                    apr.b("commitSuccess", "module", str, "monitorPoint", str2, IWXUserTrackAdapter.MONITOR_ARG, str3);
                    if (bti.a().b(EventType.ALARM, str, str2)) {
                        Context k = aob.a().k();
                        btf.a().a(EventType.ALARM, new btc(str, str2, str3, null, null, true, NetworkUtil.c(k), NetworkUtil.d(k)));
                        return;
                    }
                    e.a().a(EventType.ALARM.getEventId(), str, str2, str3);
                    return;
                }
                apr.c("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }

        public static void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            } else {
                a(str, str2, null, str3, str4);
            }
        }

        public static void a(String str, String str2, String str3, String str4, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
                return;
            }
            try {
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("_status", "0");
                    if (!bsw.b || !aob.H() || !EventType.ALARM.isOpen() || (!bsw.a() && !bti.a().a(str, str2, (Boolean) false, (Map<String, String>) hashMap))) {
                        apr.a("log discard !", "module", str, "monitorPoint", str2, "errorCode:", str4, "errorMsg:", str5);
                        return;
                    }
                    apr.b("commitFail ", "module", str, "monitorPoint", str2, "errorCode:", str4, "errorMsg:", str5);
                    if (bti.a().b(EventType.ALARM, str, str2)) {
                        Context k = aob.a().k();
                        btf.a().a(EventType.ALARM, new btc(str, str2, str3, str4, str5, false, NetworkUtil.c(k), NetworkUtil.d(k)));
                        return;
                    }
                    e.a().a(EventType.ALARM.getEventId(), str, str2, str3, str4, str5);
                    return;
                }
                apr.c("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(459295531);
        }

        public static void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
                return;
            }
            EventType.COUNTER.setStatisticsInterval(i);
            bsw.a(EventType.COUNTER, i);
        }

        public static void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            } else {
                bti.a().a(EventType.COUNTER, i);
            }
        }

        @Deprecated
        public static boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : bti.a().a(EventType.COUNTER, str, str2);
        }

        public static void a(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dba8242", new Object[]{str, str2, new Double(d)});
            } else {
                a(str, str2, null, d);
            }
        }

        public static void a(String str, String str2, String str3, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d)});
                return;
            }
            try {
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                    if (!bsw.b || !aob.H() || !EventType.COUNTER.isOpen() || (!bsw.a() && !bti.a().a(EventType.COUNTER, str, str2))) {
                        apr.a("log discard !", "module", str, "monitorPoint", str2, "args", str3, "value", Double.valueOf(d));
                        return;
                    }
                    apr.b("commitCount", "module", str, "monitorPoint", str2, "args", str3, "value", Double.valueOf(d));
                    if (bti.a().b(EventType.COUNTER, str, str2)) {
                        Context k = aob.a().k();
                        btf.a().a(EventType.COUNTER, new btd(str, str2, str3, d, NetworkUtil.c(k), NetworkUtil.d(k)));
                        return;
                    }
                    e.a().a(EventType.COUNTER.getEventId(), str, str2, str3, d);
                    return;
                }
                apr.c("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-893756822);
        }

        public static void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
                return;
            }
            EventType.COUNTER.setStatisticsInterval(i);
            bsw.a(EventType.COUNTER, i);
        }

        public static void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            } else {
                bti.a().a(EventType.COUNTER, i);
            }
        }

        @Deprecated
        public static boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : bti.a().a(EventType.COUNTER, str, str2);
        }

        public static void a(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dba8242", new Object[]{str, str2, new Double(d)});
                return;
            }
            try {
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                    if (!bsw.b || !aob.H() || !EventType.COUNTER.isOpen() || (!bsw.a() && !bti.a().a(EventType.COUNTER, str, str2))) {
                        apr.a("log discard !", "module", str, "monitorPoint", str2);
                        return;
                    }
                    apr.b("commitOffLineCount", "module", str, "monitorPoint", str2, "value", Double.valueOf(d));
                    e.a().a(EventType.COUNTER.getEventId(), str, str2, (String) null, d);
                    return;
                }
                apr.c("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(261732229);
        }

        public static void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
                return;
            }
            EventType.STAT.setStatisticsInterval(i);
            bsw.a(EventType.STAT, i);
        }

        public static void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            } else {
                bti.a().a(EventType.STAT, i);
            }
        }

        @Deprecated
        public static boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : bti.a().a(EventType.STAT, str, str2);
        }

        public static void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
                return;
            }
            try {
                if (!bsw.b || !aob.H() || !EventType.STAT.isOpen() || (!bsw.a() && !bti.a().a(EventType.STAT, str, str2))) {
                    apr.a("log discard !", "module", str, "monitorPoint", str2);
                    return;
                }
                apr.b("AppMonitorDelegate", "statEvent begin. module: ", str, " monitorPoint: ", str2, " measureName: ", str3);
                e.a().a(Integer.valueOf(EventType.STAT.getEventId()), str, str2, str3);
            } catch (Throwable th) {
                ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }

        public static void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
                return;
            }
            try {
                if (!bsw.b || !aob.H() || !EventType.STAT.isOpen() || (!bsw.a() && !bti.a().a(EventType.STAT, str, str2))) {
                    apr.a("log discard !", " module ", str, "monitorPoint", str2, " measureName", str3);
                    return;
                }
                apr.b("statEvent end. module: ", str, " monitorPoint: ", str2, " measureName: ", str3);
                e.a().a(str, str2, str3);
            } catch (Throwable th) {
                ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }

        public static void a(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dba8242", new Object[]{str, str2, new Double(d)});
            } else {
                a(str, str2, (DimensionValueSet) null, d);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
            if (tb.bti.a().a(com.alibaba.appmonitor.event.EventType.STAT, r8, r9, r10 != null ? r10.getMap() : null) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(java.lang.String r8, java.lang.String r9, com.alibaba.mtl.appmonitor.model.DimensionValueSet r10, double r11) {
            /*
                com.android.alibaba.ip.runtime.IpChange r0 = tb.bsw.d.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 3
                r3 = 2
                r4 = 4
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L20
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r6] = r8
                r1[r5] = r9
                r1[r3] = r10
                java.lang.Double r8 = new java.lang.Double
                r8.<init>(r11)
                r1[r2] = r8
                java.lang.String r8 = "7c6b0839"
                r0.ipc$dispatch(r8, r1)
                return
            L20:
                boolean r0 = tb.bsw.b     // Catch: java.lang.Throwable -> Laf
                if (r0 == 0) goto L98
                boolean r0 = tb.aob.H()     // Catch: java.lang.Throwable -> Laf
                if (r0 == 0) goto L98
                com.alibaba.appmonitor.event.EventType r0 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: java.lang.Throwable -> Laf
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Laf
                if (r0 == 0) goto L98
                boolean r0 = tb.bsw.a()     // Catch: java.lang.Throwable -> Laf
                if (r0 != 0) goto L4c
                tb.bti r0 = tb.bti.a()     // Catch: java.lang.Throwable -> Laf
                com.alibaba.appmonitor.event.EventType r1 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: java.lang.Throwable -> Laf
                if (r10 == 0) goto L45
                java.util.Map r7 = r10.getMap()     // Catch: java.lang.Throwable -> Laf
                goto L46
            L45:
                r7 = 0
            L46:
                boolean r0 = r0.a(r1, r8, r9, r7)     // Catch: java.lang.Throwable -> Laf
                if (r0 == 0) goto L98
            L4c:
                java.lang.String r0 = "AppMonitorDelegate"
                java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Laf
                java.lang.String r4 = "statEvent commit. module: "
                r1[r6] = r4     // Catch: java.lang.Throwable -> Laf
                r1[r5] = r8     // Catch: java.lang.Throwable -> Laf
                java.lang.String r4 = " monitorPoint: "
                r1[r3] = r4     // Catch: java.lang.Throwable -> Laf
                r1[r2] = r9     // Catch: java.lang.Throwable -> Laf
                tb.apr.b(r0, r1)     // Catch: java.lang.Throwable -> Laf
                com.alibaba.appmonitor.model.b r0 = com.alibaba.appmonitor.model.b.a()     // Catch: java.lang.Throwable -> Laf
                com.alibaba.appmonitor.model.a r0 = r0.a(r8, r9)     // Catch: java.lang.Throwable -> Laf
                if (r0 == 0) goto Lb5
                com.alibaba.mtl.appmonitor.model.MeasureSet r0 = r0.h()     // Catch: java.lang.Throwable -> Laf
                java.util.List r0 = r0.getMeasures()     // Catch: java.lang.Throwable -> Laf
                int r1 = r0.size()     // Catch: java.lang.Throwable -> Laf
                if (r1 != r5) goto Lb5
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> Laf
                com.alibaba.mtl.appmonitor.model.Measure r0 = (com.alibaba.mtl.appmonitor.model.Measure) r0     // Catch: java.lang.Throwable -> Laf
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Laf
                com.alibaba.appmonitor.pool.a r1 = com.alibaba.appmonitor.pool.a.a()     // Catch: java.lang.Throwable -> Laf
                java.lang.Class<com.alibaba.mtl.appmonitor.model.MeasureValueSet> r2 = com.alibaba.mtl.appmonitor.model.MeasureValueSet.class
                java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Laf
                com.alibaba.appmonitor.pool.b r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> Laf
                com.alibaba.mtl.appmonitor.model.MeasureValueSet r1 = (com.alibaba.mtl.appmonitor.model.MeasureValueSet) r1     // Catch: java.lang.Throwable -> Laf
                com.alibaba.mtl.appmonitor.model.MeasureValueSet r11 = r1.setValue(r0, r11)     // Catch: java.lang.Throwable -> Laf
                a(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Laf
                goto Lb5
            L98:
                java.lang.String r10 = "log discard !"
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Laf
                java.lang.String r12 = "module"
                r11[r6] = r12     // Catch: java.lang.Throwable -> Laf
                r11[r5] = r8     // Catch: java.lang.Throwable -> Laf
                java.lang.String r8 = "monitorPoint"
                r11[r3] = r8     // Catch: java.lang.Throwable -> Laf
                r11[r2] = r9     // Catch: java.lang.Throwable -> Laf
                tb.apr.a(r10, r11)     // Catch: java.lang.Throwable -> Laf
                return
            Laf:
                r8 = move-exception
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder$ExceptionType r9 = com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.ExceptionType.AP
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.a(r9, r8)
            Lb5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.bsw.d.a(java.lang.String, java.lang.String, com.alibaba.mtl.appmonitor.model.DimensionValueSet, double):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
            if (tb.bti.a().a(com.alibaba.appmonitor.event.EventType.STAT, r11, r12, r13 != null ? r13.getMap() : null) != false) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(java.lang.String r11, java.lang.String r12, com.alibaba.mtl.appmonitor.model.DimensionValueSet r13, com.alibaba.mtl.appmonitor.model.MeasureValueSet r14) {
            /*
                com.android.alibaba.ip.runtime.IpChange r0 = tb.bsw.d.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = 4
                if (r1 == 0) goto L1b
                java.lang.Object[] r1 = new java.lang.Object[r6]
                r1[r5] = r11
                r1[r4] = r12
                r1[r3] = r13
                r1[r2] = r14
                java.lang.String r11 = "4b92d996"
                r0.ipc$dispatch(r11, r1)
                return
            L1b:
                boolean r0 = tb.bsw.b     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r1 = "monitorPoint"
                java.lang.String r7 = "module"
                if (r0 == 0) goto L9f
                boolean r0 = tb.aob.H()     // Catch: java.lang.Throwable -> Lb0
                if (r0 == 0) goto L9f
                com.alibaba.appmonitor.event.EventType r0 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: java.lang.Throwable -> Lb0
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Lb0
                if (r0 == 0) goto L9f
                boolean r0 = tb.bsw.a()     // Catch: java.lang.Throwable -> Lb0
                if (r0 != 0) goto L4d
                tb.bti r0 = tb.bti.a()     // Catch: java.lang.Throwable -> Lb0
                com.alibaba.appmonitor.event.EventType r8 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: java.lang.Throwable -> Lb0
                if (r13 == 0) goto L46
                java.util.Map r9 = r13.getMap()     // Catch: java.lang.Throwable -> Lb0
                goto L47
            L46:
                r9 = 0
            L47:
                boolean r0 = r0.a(r8, r11, r12, r9)     // Catch: java.lang.Throwable -> Lb0
                if (r0 == 0) goto L9f
            L4d:
                java.lang.String r0 = "statEvent commit"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb0
                r6[r5] = r7     // Catch: java.lang.Throwable -> Lb0
                r6[r4] = r11     // Catch: java.lang.Throwable -> Lb0
                r6[r3] = r1     // Catch: java.lang.Throwable -> Lb0
                r6[r2] = r12     // Catch: java.lang.Throwable -> Lb0
                tb.apr.b(r0, r6)     // Catch: java.lang.Throwable -> Lb0
                tb.bti r0 = tb.bti.a()     // Catch: java.lang.Throwable -> Lb0
                com.alibaba.appmonitor.event.EventType r1 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: java.lang.Throwable -> Lb0
                boolean r0 = r0.b(r1, r11, r12)     // Catch: java.lang.Throwable -> Lb0
                if (r0 == 0) goto L8d
                tb.aob r0 = tb.aob.a()     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r0 = r0.k()     // Catch: java.lang.Throwable -> Lb0
                tb.btf r1 = tb.btf.a()     // Catch: java.lang.Throwable -> Lb0
                com.alibaba.appmonitor.event.EventType r2 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: java.lang.Throwable -> Lb0
                tb.btg r10 = new tb.btg     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r8 = com.alibaba.analytics.core.network.NetworkUtil.c(r0)     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r9 = com.alibaba.analytics.core.network.NetworkUtil.d(r0)     // Catch: java.lang.Throwable -> Lb0
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb0
                r1.a(r2, r10)     // Catch: java.lang.Throwable -> Lb0
                goto Lb6
            L8d:
                com.alibaba.appmonitor.event.e r0 = com.alibaba.appmonitor.event.e.a()     // Catch: java.lang.Throwable -> Lb0
                com.alibaba.appmonitor.event.EventType r1 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: java.lang.Throwable -> Lb0
                int r1 = r1.getEventId()     // Catch: java.lang.Throwable -> Lb0
                r2 = r11
                r3 = r12
                r4 = r14
                r5 = r13
                r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb0
                goto Lb6
            L9f:
                java.lang.String r13 = "log discard !"
                java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb0
                r14[r5] = r7     // Catch: java.lang.Throwable -> Lb0
                r14[r4] = r11     // Catch: java.lang.Throwable -> Lb0
                r14[r3] = r1     // Catch: java.lang.Throwable -> Lb0
                r14[r2] = r12     // Catch: java.lang.Throwable -> Lb0
                tb.apr.a(r13, r14)     // Catch: java.lang.Throwable -> Lb0
                return
            Lb0:
                r11 = move-exception
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder$ExceptionType r12 = com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.ExceptionType.AP
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.a(r12, r11)
            Lb6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.bsw.d.a(java.lang.String, java.lang.String, com.alibaba.mtl.appmonitor.model.DimensionValueSet, com.alibaba.mtl.appmonitor.model.MeasureValueSet):void");
        }
    }

    public static void a(EventType eventType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc18c56", new Object[]{eventType, new Integer(i)});
            return;
        }
        try {
            if (!b || eventType == null) {
                return;
            }
            bsz.a(eventType.getEventId(), i);
            if (i > 0) {
                eventType.setOpen(true);
            } else {
                eventType.setOpen(false);
            }
        } catch (Throwable th) {
            ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }

    public static void a(boolean z, boolean z2, String str, String str2) {
        rpw rpyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6de2dfc", new Object[]{new Boolean(z), new Boolean(z2), str, str2});
            return;
        }
        if (z) {
            rpyVar = new rqa(str, str2);
        } else {
            rpyVar = new rpy(str, str2, z2);
        }
        aob.a().a(rpyVar);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (aqc.e(str) || str2 == null) {
        } else {
            d.put(str, str2);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            d.remove(str);
        }
    }

    public static Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[0]) : d;
    }
}
