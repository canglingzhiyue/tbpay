package com.taobao.analysis.flow;

import android.os.Build;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.stat.BgFlowReportStatistic;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mto;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile int o = 60;
    private static boolean p = true;
    private static volatile c r;

    /* renamed from: a  reason: collision with root package name */
    private String f8545a;
    private String b;
    private boolean c = false;
    private final HashMap<String, Integer> d = new HashMap<>();
    private long e = -1;
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private long i = System.currentTimeMillis();
    private double j = mto.a.GEO_NOT_SUPPORT;
    private double k = mto.a.GEO_NOT_SUPPORT;
    private double l = mto.a.GEO_NOT_SUPPORT;
    private long m = 0;
    private int n = 0;
    private final ThreadPoolExecutor q = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactory() { // from class: com.taobao.analysis.flow.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "falco.BackgroundFlowReport");
        }
    });

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5e9395", new Object[]{cVar});
        } else {
            cVar.e();
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z, String str, long j, long j2, long j3, long j4) throws URISyntaxException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18671669", new Object[]{cVar, new Boolean(z), str, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else {
            cVar.b(z, str, j, j2, j3, j4);
        }
    }

    public static /* synthetic */ HashMap b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3a510b79", new Object[]{cVar}) : cVar.d;
    }

    private c() {
        if (Build.VERSION.SDK_INT > 8) {
            this.q.allowCoreThreadTimeOut(true);
        }
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("48e9ad9b", new Object[0]);
        }
        if (r == null) {
            synchronized (c.class) {
                if (r == null) {
                    r = new c();
                }
            }
        }
        return r;
    }

    public void a(final boolean z, final String str, final long j, final long j2, final long j3, final long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f0036", new Object[]{this, new Boolean(z), str, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.q;
        if (threadPoolExecutor == null) {
            return;
        }
        threadPoolExecutor.submit(new Runnable() { // from class: com.taobao.analysis.flow.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    c.a(c.this, z, str, j, j2, j3, j4);
                } catch (Throwable th) {
                    ALog.e("falco.BackgroundFlowReport", "run commitBackgroundFlowReport failed", null, th, new Object[0]);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(boolean r17, java.lang.String r18, long r19, long r21, long r23, long r25) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.flow.c.b(boolean, java.lang.String, long, long, long, long):void");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j = mto.a.GEO_NOT_SUPPORT;
        this.l = mto.a.GEO_NOT_SUPPORT;
        this.b = null;
        this.d.clear();
        this.k = mto.a.GEO_NOT_SUPPORT;
        this.i = System.currentTimeMillis();
        this.m = 0L;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.q.submit(new Runnable() { // from class: com.taobao.analysis.flow.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this);
                    }
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.j != mto.a.GEO_NOT_SUPPORT) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Integer> entry : this.d.entrySet()) {
                    if (entry.getKey() != null) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    } else {
                        jSONObject.put("unknown", entry.getValue());
                    }
                }
                AppMonitor.getInstance().commitStat(new BgFlowReportStatistic(jSONObject.toString(), this.b, this.j, this.l / 1000.0d, this.n, f()));
                d();
            } catch (JSONException unused) {
                ALog.e("falco.BackgroundFlowReport", "commitNetworkInfoBg JSONObject failed", null, new Object[0]);
            }
        }
    }

    private int f() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        for (Map.Entry<String, Integer> entry : this.d.entrySet()) {
            i += entry.getValue().intValue();
        }
        return i;
    }

    public void a(String str, String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            this.q.submit(new Runnable() { // from class: com.taobao.analysis.flow.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        Iterator it = c.b(c.this).entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((String) entry.getKey()).equals(str3)) {
                                entry.setValue(Integer.valueOf(((Integer) entry.getValue()).intValue() + 1));
                                atomicInteger.set(1);
                                break;
                            }
                        }
                        if (atomicInteger.get() != 0) {
                            return;
                        }
                        c.b(c.this).put(str3, 1);
                    } catch (Throwable th) {
                        ALog.e("falco.BackgroundFlowReport", "createConnectCount failed", null, th, new Object[0]);
                    }
                }
            });
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            o = i;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            p = z;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : p;
    }
}
