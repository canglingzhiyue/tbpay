package com.taobao.accs.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import anet.channel.Constants;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.heartbeat.IHeartbeat;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.data.Message;
import com.taobao.accs.ut.monitor.HeartbeatMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.m;
import com.taobao.aranger.exception.IPCException;
import com.taobao.weex.common.Constants;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class g implements IHeartbeat, AccsConnectStateListener, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BACKGROUND_FREQ_INTERVAL = 220000;
    public static final int BACKGROUND_INTERVAL = 270000;
    public static final int DEFAULT_MAX_INTERVAL_IN_SECS = 600;
    public static final int DEFAULT_MIN_INTERVAL_IN_SECS = 60;
    public static final int FOREGROUND_INTERVAL = 45000;
    private Session b;
    private long c;
    private Future e;
    private final e f;
    private Context j;
    private long k;
    private volatile int n;
    private volatile long p;
    private long q;
    private volatile int d = 0;
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private final AtomicBoolean i = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    private boolean f8281a = false;
    private volatile long l = -1;
    private volatile Long m = null;
    private boolean r = true;
    private final IHeartBeat s = new IHeartBeat() { // from class: com.taobao.accs.net.g.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.accs.IHeartBeat
        public void onPingSuccess(String str) throws IPCException {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("290e2be3", new Object[]{this, str});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (g.a(g.this) != null) {
                j = elapsedRealtime - g.a(g.this).longValue();
                long j2 = j / 1000;
                ALog.e("SmartHeartbeatImpl", "onPingSuccess diff", "isBg", Boolean.valueOf(g.b(g.this)), "diff", Long.valueOf(j2));
                if (g.b(g.this) && UtilityImpl.isAppKeepAlive()) {
                    HeartbeatMonitor heartbeatMonitor = new HeartbeatMonitor("back", j2);
                    heartbeatMonitor.setBucketId(UtilityImpl.getAppKeepAliveBucketId(g.c(g.this)));
                    heartbeatMonitor.setNetType(g.d(g.this));
                    AppMonitor.getInstance().commitStat(heartbeatMonitor);
                }
            } else {
                j = 0;
            }
            g.a(g.this, Long.valueOf(elapsedRealtime));
            if (!m.r()) {
                g.this.reSchedule();
            } else if (!g.b(g.this)) {
            } else {
                g.e(g.this);
                if (g.f(g.this) == 1 && g.g(g.this) >= 3 && g.h(g.this)) {
                    ALog.e("SmartHeartbeatImpl", "onPingSuccess, try to detect", new Object[0]);
                    g.a(g.this, 0);
                }
                if (g.f(g.this) != 1 && g.f(g.this) != 3 && j > 0 && Math.abs(j - g.i(g.this)) < 10000) {
                    ALog.e("SmartHeartbeatImpl", "onPingSuccess, upgrade", new Object[0]);
                    g.j(g.this).incrementAndGet();
                }
                g.k(g.this).set(0);
                g.l(g.this);
            }
        }

        @Override // com.taobao.accs.IHeartBeat
        public void onPingTimeout(String str) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b586bec1", new Object[]{this, str});
            } else if (!m.r() || !g.b(g.this)) {
            } else {
                ALog.e("SmartHeartbeatImpl", "onPingTimeout", new Object[0]);
                g.a(g.this, 0L);
                if (SystemClock.elapsedRealtime() - g.m(g.this) >= 12000) {
                    return;
                }
                if (g.f(g.this) != 2) {
                    ALog.e("SmartHeartbeatImpl", "degrade", new Object[0]);
                    if (g.h(g.this) && g.n(g.this) > 0 && g.n(g.this) == g.o(g.this)) {
                        ALog.e("SmartHeartbeatImpl", "degrade, never try to upgrade", "lastTimeout", Long.valueOf(g.n(g.this)));
                        g.a(g.this, false);
                    }
                    g gVar = g.this;
                    g.b(gVar, g.o(gVar));
                    g.j(g.this).decrementAndGet();
                }
                g.a(g.this, 1);
                ALog.e("SmartHeartbeatImpl", "state = STABLE", new Object[0]);
            }
        }
    };
    private String o = h();

    static {
        kge.a(-265204657);
        kge.a(-1681044795);
        kge.a(-1390502639);
        kge.a(417624225);
    }

    public static /* synthetic */ int a(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("667601a8", new Object[]{gVar, new Integer(i)})).intValue();
        }
        gVar.d = i;
        return i;
    }

    public static /* synthetic */ long a(g gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6676056a", new Object[]{gVar, new Long(j)})).longValue();
        }
        gVar.q = j;
        return j;
    }

    public static /* synthetic */ Long a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("4cfae847", new Object[]{gVar}) : gVar.m;
    }

    public static /* synthetic */ Long a(g gVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("d18a628", new Object[]{gVar, l});
        }
        gVar.m = l;
        return l;
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6676418a", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.r = z;
        return z;
    }

    public static /* synthetic */ long b(g gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fc5e9eb", new Object[]{gVar, new Long(j)})).longValue();
        }
        gVar.p = j;
        return j;
    }

    public static /* synthetic */ boolean b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ef5da71", new Object[]{gVar})).booleanValue() : gVar.f();
    }

    public static /* synthetic */ Context c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("77fd9cc4", new Object[]{gVar}) : gVar.j;
    }

    public static /* synthetic */ String d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44d226d5", new Object[]{gVar}) : gVar.o;
    }

    public static /* synthetic */ long e(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2168f07e", new Object[]{gVar})).longValue();
        }
        long j = gVar.q;
        gVar.q = 1 + j;
        return j;
    }

    public static /* synthetic */ int f(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1239f7dc", new Object[]{gVar})).intValue() : gVar.d;
    }

    public static /* synthetic */ long g(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30aff3c", new Object[]{gVar})).longValue() : gVar.q;
    }

    public static /* synthetic */ boolean h(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3dc06ab", new Object[]{gVar})).booleanValue() : gVar.r;
    }

    public static /* synthetic */ long i(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4ad0dfa", new Object[]{gVar})).longValue() : gVar.c;
    }

    public static /* synthetic */ AtomicInteger j(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("a1848a0f", new Object[]{gVar}) : gVar.g;
    }

    public static /* synthetic */ AtomicInteger k(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("da64eaae", new Object[]{gVar}) : gVar.h;
    }

    public static /* synthetic */ void l(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7202423", new Object[]{gVar});
        } else {
            gVar.g();
        }
    }

    public static /* synthetic */ long m(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7f12b76", new Object[]{gVar})).longValue() : gVar.k;
    }

    public static /* synthetic */ long n(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98c232d5", new Object[]{gVar})).longValue() : gVar.p;
    }

    public static /* synthetic */ long o(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("89933a34", new Object[]{gVar})).longValue() : gVar.l;
    }

    public g(e eVar, int i) {
        this.j = eVar.d;
        this.f = eVar;
        this.n = i;
        ALog.e("SmartHeartbeatImpl", "init", "lastNetType", this.o);
        eVar.a(this);
        eVar.a(this.s);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.n == i) {
        } else {
            ALog.e("SmartHeartbeatImpl", "setAppState", "old", Integer.valueOf(this.n), "new", Integer.valueOf(i));
            this.n = i;
            if (m.r()) {
                return;
            }
            if (this.n == 1) {
                d();
                reSchedule();
            }
            this.q = 0L;
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.n == 0;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        boolean z = this.n == 0;
        if (z) {
            if (m.r()) {
                long q = m.q();
                long p = m.p();
                long min = Math.min(Math.max((this.g.get() * 60000) + 270000, q), p);
                if (this.d == 0) {
                    if (min == p) {
                        this.d = 3;
                        ALog.e("SmartHeartbeatImpl", "state = MAX_LIMIT", new Object[0]);
                    } else if (min == q) {
                        this.d = 2;
                        ALog.e("SmartHeartbeatImpl", "state = MIN_LIMIT", new Object[0]);
                    }
                } else if ((this.d == 3 && min != p) || (this.d == 2 && min != q)) {
                    this.d = 0;
                    ALog.e("SmartHeartbeatImpl", "config changed, state = DETECT", new Object[0]);
                }
                this.c = min;
            } else if (this.f8281a) {
                this.c = 220000L;
            } else {
                this.c = 270000L;
            }
        } else {
            this.c = Constants.MAX_SESSION_IDLE_TIME;
        }
        ALog.e("SmartHeartbeatImpl", "setInterval", Constants.Name.INTERVAL, Long.valueOf(this.c / 1000), "step", Integer.valueOf(this.g.get()), "background", Boolean.valueOf(z));
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af21441", new Object[]{this, session});
        } else if (session == null) {
            throw new NullPointerException("session is null");
        } else {
            d.a(GlobalClientInfo.getContext()).b();
            this.b = session;
            d();
            a(this.c);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Future future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        ALog.i("SmartHeartbeatImpl", "heartbeat stop", this.b.mSeq, MspGlobalDefine.SESSION, this.b);
        if (this.b == null || (future = this.e) == null) {
            return;
        }
        future.cancel(true);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd73a171", new Object[]{this});
            return;
        }
        this.m = Long.valueOf(SystemClock.elapsedRealtime());
        if (!TimeMeter.a(TimeMeter.TAG_HB_RESCHEDULE, m.r() ? 5000L : 1000L)) {
            ALog.d("SmartHeartbeatImpl", "reSchedule freq", new Object[0]);
        } else {
            g();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.m = Long.valueOf(SystemClock.elapsedRealtime());
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ALog.e("SmartHeartbeatImpl", "reScheduleImpl", new Object[0]);
        d();
        b();
        if (m.r()) {
            b(false);
            d.a(this.j).b((int) (this.c + 5000));
        } else if (m.j()) {
            d.a(GlobalClientInfo.getContext()).b((int) this.c);
        } else {
            d.a(GlobalClientInfo.getContext()).b();
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f8281a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean a2 = TimeMeter.a(TimeMeter.TAG_HB_RECOVER, android.taobao.windvane.util.b.DEFAULT_MAX_AGE);
        if (z) {
            this.f8281a = true;
        } else if (!a2) {
        } else {
            this.f8281a = false;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(this.c);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.f.o)) {
            ALog.e("SmartHeartbeatImpl", "smart ping not allowed", new Object[0]);
        } else {
            ALog.e("SmartHeartbeatImpl", "ping ", new Object[0]);
            try {
                this.b = a.b(SessionCenter.getInstance(this.f.k()), this.f.c((String) null), 0L, this.f.o);
                if (this.b != null) {
                    if (m.k()) {
                        a.a(this.b, new Integer[0]);
                    } else {
                        this.b.ping(true);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    e.q = elapsedRealtime;
                    this.k = elapsedRealtime;
                } else {
                    ALog.e("SmartHeartbeatImpl", "empty session!", new Object[0]);
                }
            } catch (Exception e) {
                ALog.e("SmartHeartbeatImpl", "get session null", e, new Object[0]);
            }
            g();
        }
    }

    public void b(boolean z) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (!com.taobao.accs.utl.c.a(this.j) || !UtilityImpl.isChannelProcess(this.j) || !UtilityImpl.isAppKeepAlive()) {
                return;
            }
            if (m.r()) {
                if (!f()) {
                    return;
                }
                if (z) {
                    d();
                }
                j = this.c;
                j2 = 5000;
            } else {
                j = (!a() || !m.j()) ? 270000L : 220000L;
                j2 = 10000;
            }
            long j3 = j - j2;
            if (this.l == j3) {
                ALog.e("SmartHeartbeatImpl", "same ping sent", "pingInterval", Long.valueOf(j3));
                return;
            }
            this.l = j3;
            this.f.a(Message.buildAServerPingControl(this.f.c((String) null), j3), true);
        } catch (Throwable th) {
            ALog.e("SmartHeartbeatImpl", "sendServerPingSignal err", th, new Object[0]);
        }
    }

    private synchronized void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        try {
            ALog.d("SmartHeartbeatImpl", "submit ping current delay: " + (j / 1000) + "s", new Object[0]);
            if (this.e != null) {
                this.e.cancel(false);
                this.e = null;
            }
            this.e = com.taobao.accs.common.a.c().schedule(this, j + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.e("SmartHeartbeatImpl", "Submit heartbeat task failed.", this.b.mSeq, e);
        }
    }

    @Override // com.taobao.accs.base.AccsConnectStateListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
            return;
        }
        this.i.set(true);
        this.m = Long.valueOf(SystemClock.elapsedRealtime());
        this.q = 0L;
        String h = h();
        boolean z = !StringUtils.isEmpty(this.o) && !StringUtils.isEmpty(h) && !this.o.equals(h);
        ALog.e("SmartHeartbeatImpl", "onConnected", "lastNetType", this.o, "newType", h, "changed", Boolean.valueOf(z));
        if (z) {
            this.g.set(0);
            this.h.set(0);
            this.o = h;
            this.d = 0;
            this.r = true;
            ALog.e("SmartHeartbeatImpl", "state = DETECT", new Object[0]);
        }
        g();
    }

    @Override // com.taobao.accs.base.AccsConnectStateListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        } else if (!this.i.getAndSet(false)) {
            ALog.e("SmartHeartbeatImpl", "onDisconnected, not connected", new Object[0]);
        } else {
            this.l = -1L;
            if (!f()) {
                ALog.e("SmartHeartbeatImpl", "onDisconnected, no bg state", new Object[0]);
            } else if (!UtilityImpl.isNetworkConnected(this.j)) {
                ALog.e("SmartHeartbeatImpl", "onDisconnected, no network", new Object[0]);
            } else {
                ALog.e("SmartHeartbeatImpl", "onDisconnected", new Object[0]);
                if (SystemClock.elapsedRealtime() - this.k >= 1000 || this.h.incrementAndGet() < 3) {
                    return;
                }
                ALog.e("SmartHeartbeatImpl", "onDisconnected, degrade step", new Object[0]);
                if (this.d != 2) {
                    this.g.decrementAndGet();
                }
                this.h.set(0);
            }
        }
    }

    private String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.d.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            return activeNetworkInfo.getTypeName();
        } catch (Throwable th) {
            ALog.e("SmartHeartbeatImpl", "getNetType err", th, new Object[0]);
            return null;
        }
    }
}
