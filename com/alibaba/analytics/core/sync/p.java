package com.alibaba.analytics.core.sync;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.sync.UploadLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import tb.aob;
import tb.apc;
import tb.apf;
import tb.apg;
import tb.apr;
import tb.aqe;
import tb.aqg;
import tb.cew;
import tb.kge;

/* loaded from: classes.dex */
public class p implements aqg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static p f2108a;
    private ScheduledFuture d;
    private apc e;
    private long b = 30000;
    private UploadMode c = null;
    private r f = new r();
    private UploadLog.NetworkStatus g = UploadLog.NetworkStatus.ALL;
    private boolean h = false;
    private final Object i = new Object();
    private boolean j = false;
    private long k = 0;

    /* renamed from: com.alibaba.analytics.core.sync.p$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2112a = new int[UploadMode.values().length];

        static {
            try {
                f2112a[UploadMode.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static /* synthetic */ long a(p pVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf0017a1", new Object[]{pVar, new Long(j)})).longValue();
        }
        pVar.b = j;
        return j;
    }

    public static /* synthetic */ UploadLog.NetworkStatus a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UploadLog.NetworkStatus) ipChange.ipc$dispatch("c785237", new Object[]{pVar}) : pVar.g;
    }

    public static /* synthetic */ ScheduledFuture a(p pVar, ScheduledFuture scheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("e3a28e9f", new Object[]{pVar, scheduledFuture});
        }
        pVar.d = scheduledFuture;
        return scheduledFuture;
    }

    public static /* synthetic */ Object b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("265cf1c", new Object[]{pVar}) : pVar.i;
    }

    public static /* synthetic */ apc c(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (apc) ipChange.ipc$dispatch("dccdf99d", new Object[]{pVar}) : pVar.e;
    }

    public static /* synthetic */ UploadMode d(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UploadMode) ipChange.ipc$dispatch("93ccea7f", new Object[]{pVar}) : pVar.c;
    }

    public static /* synthetic */ r e(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("66216d00", new Object[]{pVar}) : pVar.f;
    }

    public static /* synthetic */ long f(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1519d246", new Object[]{pVar})).longValue() : pVar.i();
    }

    public static /* synthetic */ long g(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c37c325", new Object[]{pVar})).longValue() : pVar.b;
    }

    public static /* synthetic */ ScheduledFuture h(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("74e86c5d", new Object[]{pVar}) : pVar.d;
    }

    static {
        kge.a(1479547049);
        kge.a(1945812401);
        f2108a = new p();
    }

    private p() {
        aqg.a(this);
    }

    public static p a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("165efa77", new Object[0]) : f2108a;
    }

    public synchronized void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.h = !apg.a(context);
        apr.b("UploadMgr", "init mIsAppOnBackground", Boolean.valueOf(this.h));
        b();
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        apr.b();
        f();
        q.a().b();
        n.b().a(this.g);
        n.b().a(new f() { // from class: com.alibaba.analytics.core.sync.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.analytics.core.sync.f
            public void a(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                } else {
                    n.b().a(p.a(p.this));
                }
            }
        });
        if (this.c == null) {
            this.c = UploadMode.INTERVAL;
        }
        if (this.d != null) {
            this.d.cancel(true);
        }
        b(this.c);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String a2 = apg.a(aob.a().k(), "UTANALYTICS_UPLOAD_ALLOWED_NETWORK_STATUS");
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        if ("ALL".equalsIgnoreCase(a2)) {
            this.g = UploadLog.NetworkStatus.ALL;
        } else if ("2G".equalsIgnoreCase(a2)) {
            this.g = UploadLog.NetworkStatus.TWO_GENERATION;
        } else if ("3G".equalsIgnoreCase(a2)) {
            this.g = UploadLog.NetworkStatus.THRID_GENERATION;
        } else if ("4G".equalsIgnoreCase(a2)) {
            this.g = UploadLog.NetworkStatus.FOUR_GENERATION;
        } else if (!"WIFI".equalsIgnoreCase(a2)) {
        } else {
            this.g = UploadLog.NetworkStatus.WIFI;
        }
    }

    public void a(UploadMode uploadMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e25a25", new Object[]{this, uploadMode});
        } else if (uploadMode == null || this.c == uploadMode) {
        } else {
            this.c = uploadMode;
            b();
        }
    }

    private synchronized void b(UploadMode uploadMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86bf426", new Object[]{this, uploadMode});
            return;
        }
        apr.b("startMode", "mode", uploadMode);
        if (AnonymousClass4.f2112a[uploadMode.ordinal()] == 1) {
            g();
        } else {
            h();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.e != null) {
            apf.a().b(this.e);
        }
        this.e = new apc() { // from class: com.alibaba.analytics.core.sync.p.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.apc
            public void a(long j, long j2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
                } else if (com.alibaba.analytics.core.config.c.a()) {
                    synchronized (p.b(p.this)) {
                        if (p.c(p.this) != null) {
                            apf.a().b(p.c(p.this));
                        }
                        aob.a().F();
                    }
                } else {
                    apr.b("RealTimeMode", "count", Long.valueOf(j), "dbSize", Long.valueOf(j2));
                    if (j <= 0 || j2 <= 0 || UploadMode.REALTIME != p.d(p.this)) {
                        return;
                    }
                    p.a(p.this, aqe.a().a(null, p.e(p.this), 0L));
                }
            }
        };
        apf.a().a(this.e);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        apr.b("UploadMgr", "startIntervalMode CurrentUploadInterval", Long.valueOf(this.b));
        o.b().a(new f() { // from class: com.alibaba.analytics.core.sync.p.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.analytics.core.sync.f
            public void a(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                    return;
                }
                p pVar = p.this;
                p.a(pVar, p.f(pVar));
                apr.b("UploadMgr", "CurrentUploadInterval", Long.valueOf(p.g(p.this)));
                o.b().a(p.a(p.this));
                p.a(p.this, aqe.a().a(p.h(p.this), p.e(p.this), p.g(p.this)));
            }
        });
        this.d = aqe.a().a(this.d, this.f, 3000L);
    }

    private long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue();
        }
        if (this.h) {
            return j() ? m() : l();
        }
        this.j = false;
        long k = k();
        if (k != 0) {
            return k;
        }
        return 30000L;
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.k > 60000) {
            this.k = elapsedRealtime;
            this.j = apg.b(aob.a().k());
            apr.b("UploadMgr", "isMainProcessDeadExtend", Boolean.valueOf(this.j));
        } else {
            apr.b("UploadMgr", "time limit. isMainProcessDeadExtend", Boolean.valueOf(this.j));
        }
        return this.j;
    }

    private long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue();
        }
        long b = com.alibaba.analytics.core.config.u.a().b() * 1000;
        if (b > 0) {
            return b;
        }
        return 30000L;
    }

    private long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue();
        }
        long b = com.alibaba.analytics.core.config.f.a().b("bu") * 1000;
        if (b > 0) {
            return b;
        }
        return 300000L;
    }

    private long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        long b = com.alibaba.analytics.core.config.f.a().b("bu2") * 1000;
        return b <= 0 ? cew.a.CONFIG_TRACK_1022_INTERVAL_TIME : b;
    }

    @Override // tb.aqg.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        apr.b("UploadMgr", "onBackground", true);
        c();
        if (UploadMode.INTERVAL != this.c) {
            return;
        }
        this.h = true;
        long i = i();
        if (this.b == i) {
            return;
        }
        this.b = i;
        b();
    }

    @Override // tb.aqg.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        apr.b("UploadMgr", "onForeground", true);
        c();
        if (UploadMode.INTERVAL != this.c) {
            return;
        }
        this.h = false;
        long i = i();
        if (this.b == i) {
            return;
        }
        this.b = i;
        b();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        apr.c();
        aqe.a().a(this.f);
    }
}
