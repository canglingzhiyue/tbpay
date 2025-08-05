package com.etao.feimagesearch.intelli;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.f;
import com.etao.feimagesearch.nn.j;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.p;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cpe;
import tb.csw;
import tb.csx;
import tb.jqt;
import tb.kge;
import tb.qgt;
import tb.rul;

/* loaded from: classes3.dex */
public final class h extends com.etao.feimagesearch.intelli.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private final boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final e E;
    private final Handler F;
    private boolean G;
    private final Context H;
    private final CaptureManager I;
    private final com.etao.feimagesearch.nn.g e;
    private volatile boolean f;
    private volatile int g;
    private volatile int h;
    private volatile int i;
    private volatile int j;
    private b k;
    private int l;
    private FrameLayout m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;
    private volatile com.etao.feimagesearch.structure.capture.e p;
    private final AtomicBoolean q;
    private final AtomicBoolean r;
    private long s;
    private boolean t;
    private final AtomicBoolean u;
    private com.etao.feimagesearch.intelli.e v;
    private final NetConfig w;
    private final long x;
    private long y;
    private final csx z;

    /* loaded from: classes3.dex */
    public static final class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, msg});
                return;
            }
            q.c(msg, "msg");
            cot.c("SmartAutoDetector", "received message " + msg.what);
            if (msg.what != 6) {
                return;
            }
            cot.a("AutoDetect", "SmartAutoDetector", "change SilenceStatus false");
            h.b(h.this, false);
            com.etao.feimagesearch.structure.capture.e e = h.e(h.this);
            if (e == null) {
                return;
            }
            e.g();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.nn.f.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                h.n(h.this);
            }
        }
    }

    static {
        kge.a(426954195);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    public static final /* synthetic */ int a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eec0cccd", new Object[]{hVar})).intValue() : hVar.g;
    }

    public static final /* synthetic */ void a(h hVar, com.etao.feimagesearch.intelli.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978133af", new Object[]{hVar, eVar});
        } else {
            hVar.v = eVar;
        }
    }

    public static final /* synthetic */ void a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e959813a", new Object[]{hVar, new Boolean(z)});
        } else {
            hVar.b(z);
        }
    }

    public static final /* synthetic */ int b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7c1c40e", new Object[]{hVar})).intValue() : hVar.h;
    }

    public static final /* synthetic */ void b(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40777219", new Object[]{hVar, new Boolean(z)});
        } else {
            hVar.t = z;
        }
    }

    public static final /* synthetic */ int c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("80c2bb4f", new Object[]{hVar})).intValue() : hVar.i;
    }

    public static final /* synthetic */ int d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49c3b290", new Object[]{hVar})).intValue() : hVar.j;
    }

    public static final /* synthetic */ com.etao.feimagesearch.structure.capture.e e(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.structure.capture.e) ipChange.ipc$dispatch("156bcfd6", new Object[]{hVar}) : hVar.p;
    }

    public static final /* synthetic */ AtomicBoolean f(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4d503f9f", new Object[]{hVar}) : hVar.r;
    }

    public static final /* synthetic */ csx g(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (csx) ipChange.ipc$dispatch("cb16511e", new Object[]{hVar}) : hVar.z;
    }

    public static final /* synthetic */ boolean h(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6dc78fa5", new Object[]{hVar})).booleanValue() : hVar.D;
    }

    public static final /* synthetic */ boolean i(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36c886e6", new Object[]{hVar})).booleanValue() : hVar.C;
    }

    public static final /* synthetic */ void j(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc97e23", new Object[]{hVar});
        } else {
            hVar.l();
        }
    }

    public static final /* synthetic */ AtomicBoolean k(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("afaeeda4", new Object[]{hVar}) : hVar.o;
    }

    public static final /* synthetic */ AtomicBoolean l(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("902843a5", new Object[]{hVar}) : hVar.u;
    }

    public static final /* synthetic */ com.etao.feimagesearch.intelli.e m(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.intelli.e) ipChange.ipc$dispatch("611059c5", new Object[]{hVar}) : hVar.v;
    }

    public static final /* synthetic */ void n(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23cd5b27", new Object[]{hVar});
        } else {
            hVar.h();
        }
    }

    public final CaptureManager g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CaptureManager) ipChange.ipc$dispatch("e3f23ba4", new Object[]{this}) : this.I;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-869937829);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public h(Context context, CaptureManager captureManager) {
        q.c(context, "context");
        q.c(captureManager, "captureManager");
        this.H = context;
        this.I = captureManager;
        this.f = true;
        this.n = new AtomicBoolean(true);
        this.o = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
        this.s = com.etao.feimagesearch.config.b.aT();
        this.u = new AtomicBoolean(true);
        this.w = new NetConfig();
        this.x = System.currentTimeMillis();
        this.y = System.currentTimeMillis();
        this.z = new csx();
        this.A = com.etao.feimagesearch.config.b.dG();
        this.C = true;
        this.D = true;
        this.E = new e();
        this.F = new d(Looper.getMainLooper());
        NetConfig netConfig = this.w;
        netConfig.name = "plt_smart_camera";
        netConfig.type = "plt_smart_camera";
        com.etao.feimagesearch.mnn.h.a("plt_smart_camera", new com.etao.feimagesearch.mnn.f<com.etao.feimagesearch.mnn.autodetect.a, com.etao.feimagesearch.mnn.autodetect.b>() { // from class: com.etao.feimagesearch.intelli.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.mnn.f
            public com.etao.feimagesearch.mnn.e<com.etao.feimagesearch.mnn.autodetect.a, com.etao.feimagesearch.mnn.autodetect.b> a(NetConfig netConfig2) {
                Object a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    a2 = ipChange.ipc$dispatch("e1347497", new Object[]{this, netConfig2});
                } else {
                    q.c(netConfig2, "netConfig");
                    a2 = com.etao.feimagesearch.mnn.autodetect.c.Companion.a();
                }
                return (com.etao.feimagesearch.mnn.e) a2;
            }
        });
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "needCallPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
        cot.a("AutoDetect", "needCallPrepare", "taskName:plt_smart_camera");
        this.e = new com.etao.feimagesearch.nn.g("plt_smart_camera", String.valueOf(this.H.hashCode()));
        com.etao.feimagesearch.nn.f.Companion.a().a("plt_smart_camera", this.E);
        this.m = new FrameLayout(this.H);
        this.m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.m.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.etao.feimagesearch.intelli.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, v, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                h hVar = h.this;
                q.a((Object) v, "v");
                hVar.b(v.getWidth(), v.getHeight());
            }
        });
        this.v = new com.etao.feimagesearch.intelli.c(this.H, this.I);
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.x;
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera", HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(currentTimeMillis));
        cot.a("AutoDetect", "callPrepare", "mnnStatus:" + BaseMnnRunUnit.KEY_TASK_NAME + ":plt_smart_camera," + HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME + ":" + currentTimeMillis);
        this.e.a(this.w, new c(System.currentTimeMillis()));
    }

    /* loaded from: classes3.dex */
    public static final class c implements com.etao.feimagesearch.nn.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;

        public c(long j) {
            this.b = j;
        }

        @Override // com.etao.feimagesearch.nn.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.a("AutoDetect", "SmartAutoDetector", "mnnNetWorker onBuildSucceed");
            if (com.a() && com.etao.feimagesearch.config.b.cB()) {
                cot.b("SmartAutoDetector", "Mock MNN build failed");
                c();
                return;
            }
            h.k(h.this).set(true);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "prepareSuccess_plt_smart_camera", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
            h.l(h.this).set(false);
            h.a(h.this, false);
            com.etao.feimagesearch.intelli.e m = h.m(h.this);
            if (m != null) {
                m.c();
            }
            h.a(h.this, (com.etao.feimagesearch.intelli.e) null);
        }

        @Override // com.etao.feimagesearch.nn.e
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                cot.c("SmartAutoDetector", "mnnNetWorker onMainBuildSucceed");
            }
        }

        @Override // com.etao.feimagesearch.nn.e
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            cot.a("AutoDetect", "SmartAutoDetector", "mnnNetWorker onBuildFailed");
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "prepareFailed_plt_smart_camera", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
            h.l(h.this).set(true);
            h.a(h.this, false);
        }

        @Override // com.etao.feimagesearch.nn.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                cot.b("SmartAutoDetector", "mnnNetWorker onMainBuildFailed");
            }
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(com.etao.feimagesearch.structure.capture.e flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9c6ec6", new Object[]{this, flow});
            return;
        }
        q.c(flow, "flow");
        this.q.set(true);
        this.p = flow;
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar != null) {
            eVar.a(flow);
        }
        i();
        this.q.set(false);
    }

    private final void i() {
        com.etao.feimagesearch.structure.capture.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        cot.c("SmartAutoDetector", "resetDetect");
        b bVar = this.k;
        if (bVar != null) {
            bVar.a();
        }
        b(false);
        this.l = 0;
        if (this.t || (eVar = this.p) == null) {
            return;
        }
        eVar.g();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cot.c("SmartAutoDetector", "stop");
        super.b();
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar != null) {
            eVar.b();
        }
        this.F.removeMessages(6);
        if (this.s > 0) {
            this.t = true;
        }
        this.f6696a = false;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.r.set(false);
        this.e.b();
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar != null) {
            eVar.c();
        }
        this.v = null;
        com.etao.feimagesearch.nn.f.Companion.a().a(this.E);
        this.F.removeMessages(6);
        this.t = false;
        this.f6696a = false;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.i = i;
        this.j = i2;
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar == null) {
            return;
        }
        eVar.a(i, i2);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public FrameLayout d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this}) : this.m;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar == null) {
            return;
        }
        eVar.a(z);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(byte[] yuvData, boolean z, int i, int i2, int i3) {
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acc2fe", new Object[]{this, yuvData, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        q.c(yuvData, "yuvData");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.f6696a) {
            qgt.a(Long.valueOf(elapsedRealtime));
            this.f6696a = true;
            this.G = true;
            j();
            if (this.B) {
                this.C = false;
                this.D = false;
            } else {
                this.B = true;
                if (!cpe.Companion.a()) {
                    this.D = true;
                    cpe.Companion.a(true);
                } else {
                    this.D = false;
                }
                if (cpe.Companion.b()) {
                    this.C = true;
                    cpe.Companion.b(false);
                } else {
                    this.C = false;
                }
            }
            z2 = true;
        } else {
            this.z.a(System.currentTimeMillis() - this.y);
            z2 = false;
        }
        this.y = System.currentTimeMillis();
        com.etao.feimagesearch.structure.capture.e eVar = this.p;
        if (eVar == null || this.q.get()) {
            StringBuilder sb = new StringBuilder();
            sb.append("flow is null ");
            if (eVar != null) {
                z3 = false;
            }
            sb.append(z3);
            k.f("SmartAutoDetector", sb.toString(), new Object[0]);
            return;
        }
        if (this.u.get()) {
            if (z2) {
                qgt.a((Integer) 0);
            }
            qgt.a(this.G, false, elapsedRealtime);
            this.G = false;
            com.etao.feimagesearch.intelli.e eVar2 = this.v;
            if (eVar2 != null) {
                eVar2.a(yuvData, z, i, i2, i3);
                return;
            }
        }
        if (this.t || !this.o.get() || this.d || k()) {
            return;
        }
        if (p.a(yuvData, i, i2, 40) == 1) {
            eVar.f();
        } else {
            eVar.e();
        }
        if (this.g == 0 || this.h == 0) {
            k.f("SmartAutoDetector", "长宽未初始化", new Object[0]);
        } else if (!this.f) {
        } else {
            if (z2) {
                qgt.a((Integer) 1);
            }
            qgt.a(this.G, true, elapsedRealtime);
            this.G = false;
            a(yuvData, i, i2, z, i3, eVar);
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        cot.a("AutoDetect", "SmartAutoDetector", "resetAlgorithm");
        this.r.set(true);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public ClientModelType f() {
        ClientModelType f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientModelType) ipChange.ipc$dispatch("3c5a970b", new Object[]{this});
        }
        if (this.t) {
            return ClientModelType.SILENT;
        }
        com.etao.feimagesearch.intelli.e eVar = this.v;
        return (eVar == null || (f = eVar.f()) == null) ? ClientModelType.MNN : f;
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.s = com.etao.feimagesearch.util.c.a(this.H);
        cot.c("SmartAutoDetector", "onReceiveFirstFrame-----silenceTime = " + this.s);
        if (this.s > 0) {
            this.t = true;
            this.F.removeMessages(6);
            this.F.sendEmptyMessageDelayed(6, this.s);
        } else {
            this.F.removeMessages(6);
            this.F.sendEmptyMessage(6);
        }
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar != null) {
            eVar.l();
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "pltFirstCameraFrameIn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
        cot.a("AutoDetect", "pltFirstCameraFrameIn", "taskName: plt_smart_camera");
    }

    private final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.n.get();
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n.set(z);
        if (z) {
            return;
        }
        this.e.a();
    }

    @Override // com.etao.feimagesearch.intelli.d
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.g = i;
        this.h = i2;
        com.etao.feimagesearch.intelli.e eVar = this.v;
        if (eVar == null) {
            return;
        }
        eVar.b(i, i2);
    }

    private final void a(byte[] bArr, int i, int i2, boolean z, int i3, com.etao.feimagesearch.structure.capture.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1396741c", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), eVar});
        } else if (!this.o.get()) {
        } else {
            SystemClock.elapsedRealtime();
            eVar.b();
            b(true);
            b bVar = new b(this, bArr, i, i2, z, i3);
            this.e.a("plt_smart_camera", "detectFrame", (Object) null, bVar);
            this.k = bVar;
            eVar.c();
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements j<com.etao.feimagesearch.mnn.autodetect.a, com.etao.feimagesearch.mnn.autodetect.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f6700a;
        private final AtomicBoolean b;
        private final byte[] c;
        private final int d;
        private final int e;
        private final boolean f;
        private final int g;

        static {
            kge.a(-446527719);
            kge.a(12920176);
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* bridge */ /* synthetic */ void b(com.etao.feimagesearch.mnn.autodetect.b bVar) {
        }

        public com.etao.feimagesearch.mnn.autodetect.b g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.mnn.autodetect.b) ipChange.ipc$dispatch("3c6d3a29", new Object[]{this});
            }
            return null;
        }

        public b(h hVar, byte[] yuvData, int i, int i2, boolean z, int i3) {
            q.c(yuvData, "yuvData");
            this.f6700a = hVar;
            this.c = yuvData;
            this.d = i;
            this.e = i2;
            this.f = z;
            this.g = i3;
            this.b = new AtomicBoolean(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.mnn.autodetect.a, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.mnn.autodetect.a b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : e();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.mnn.autodetect.b, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.mnn.autodetect.b f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : g();
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b.set(true);
            }
        }

        public com.etao.feimagesearch.mnn.autodetect.a e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.mnn.autodetect.a) ipChange.ipc$dispatch("72bb508", new Object[]{this});
            }
            com.etao.feimagesearch.mnn.autodetect.a aVar = new com.etao.feimagesearch.mnn.autodetect.a();
            aVar.a(new byte[this.c.length]);
            System.arraycopy(this.c, 0, aVar.a(), 0, this.c.length);
            aVar.a(this.d);
            aVar.b(this.e);
            aVar.c(h.a(this.f6700a));
            aVar.d(h.b(this.f6700a));
            aVar.e(h.c(this.f6700a));
            aVar.f(h.d(this.f6700a));
            aVar.a(this.f);
            aVar.g(this.g);
            aVar.b(this.f6700a.g().O());
            com.etao.feimagesearch.structure.capture.e e = h.e(this.f6700a);
            aVar.c(e == null || e.j());
            if (h.f(this.f6700a).getAndSet(false)) {
                cot.c("SmartAutoDetector", "reset algorithm");
                aVar.d(true);
            }
            return aVar;
        }

        @Override // com.etao.feimagesearch.nn.j
        public void a(com.etao.feimagesearch.mnn.autodetect.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("618b5163", new Object[]{this, bVar});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f6700a.c) {
                this.f6700a.c = true;
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "pltFirstObjectDetect", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
                cot.a("AutoDetect", "pltFirstObjectDetect", "taskName: plt_smart_camera");
            }
            if (this.b.get()) {
                return;
            }
            com.etao.feimagesearch.structure.capture.e e = h.e(this.f6700a);
            if (bVar == null || e == null) {
                h.a(this.f6700a, false);
                return;
            }
            jqt T = this.f6700a.g().T();
            if (T != null) {
                T.a(bVar);
            }
            long e2 = elapsedRealtime - qgt.INSTANCE.e();
            csx g = h.g(this.f6700a);
            Long d = bVar.d();
            g.b(d != null ? d.longValue() : 0L);
            bVar.b(Long.valueOf(e2));
            TLogTracker.b("SmartLens", "DetectEnd", bVar.toString());
            if (!bVar.o()) {
                qgt.INSTANCE.a(MnnOnceDetectRecord.Companion.a(e2, bVar.r(), false));
                h.a(this.f6700a, false);
                return;
            }
            e.a(bVar, new a(bVar, e2));
        }

        /* loaded from: classes3.dex */
        public static final class a implements rul<Boolean, t> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ com.etao.feimagesearch.mnn.autodetect.b b;
            public final /* synthetic */ long c;

            public a(com.etao.feimagesearch.mnn.autodetect.b bVar, long j) {
                this.b = bVar;
                this.c = j;
            }

            /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
            @Override // tb.rul
            /* renamed from: invoke */
            public /* synthetic */ t mo2421invoke(Boolean bool) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("c9923577", new Object[]{this, bool});
                }
                a(bool.booleanValue());
                return t.INSTANCE;
            }

            public void a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (this.b.p()) {
                    qgt.INSTANCE.a(MnnOnceDetectRecord.Companion.a(this.c, this.b.r(), true));
                    qgt.a(h.h(b.this.f6700a), h.i(b.this.f6700a), true, SystemClock.elapsedRealtime());
                    h.j(b.this.f6700a);
                    if (!com.etao.feimagesearch.config.b.de()) {
                        return;
                    }
                    h.a(b.this.f6700a, false);
                } else {
                    qgt.INSTANCE.a(MnnOnceDetectRecord.Companion.a(this.c, this.b.r(), false));
                    h.a(b.this.f6700a, false);
                }
            }
        }

        @Override // com.etao.feimagesearch.nn.j
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            cot.b("SmartAutoDetector", "onError");
            h.a(this.f6700a, false);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                cot.b("SmartAutoDetector", "onErrorMain");
            }
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.A) {
        } else {
            csw.a(this.z.b(), this.z.c());
            this.z.a();
        }
    }
}
