package com.etao.feimagesearch.intelli;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.f;
import com.etao.feimagesearch.nn.j;
import com.etao.feimagesearch.nn.optimize.OptimizeOutput;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.p;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.searchbaseframe.util.k;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cpe;
import tb.cqx;
import tb.csw;
import tb.csx;
import tb.ctf;
import tb.kge;
import tb.qgt;

/* loaded from: classes3.dex */
public final class b extends com.etao.feimagesearch.intelli.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private long A;
    private final csx B;
    private final boolean C;
    private final e D;
    private final Handler E;
    private final Context F;
    private boolean G;
    private boolean H;
    private final CaptureManager I;
    private final com.etao.feimagesearch.nn.g e;
    private volatile boolean f;
    private volatile int g;
    private volatile int h;
    private volatile int i;
    private volatile int j;
    private C0225b k;
    private int l;
    private FrameLayout m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;
    private volatile com.etao.feimagesearch.structure.capture.e p;
    private final AtomicBoolean q;
    private final AtomicBoolean r;
    private long s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final AtomicBoolean w;
    private com.etao.feimagesearch.intelli.e x;
    private final cqx y;
    private final long z;

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
            cot.c("AdvanceObjectDetector", "received message " + msg.what);
            if (msg.what != 6) {
                return;
            }
            cot.a("AutoDetect", "AdvanceObjectDetector", "change SilenceStatus false");
            b.b(b.this, false);
            com.etao.feimagesearch.structure.capture.e e = b.e(b.this);
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
                b.l(b.this);
            }
        }
    }

    static {
        kge.a(-697272932);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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

    public static final /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eebe1293", new Object[]{bVar})).intValue() : bVar.g;
    }

    public static final /* synthetic */ void a(b bVar, com.etao.feimagesearch.intelli.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9187f5", new Object[]{bVar, eVar});
        } else {
            bVar.x = eVar;
        }
    }

    public static final /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e904f434", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.b(z);
        }
    }

    public static final /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7bf09d4", new Object[]{bVar})).intValue() : bVar.h;
    }

    public static final /* synthetic */ void b(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4022e513", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.t = z;
        }
    }

    public static final /* synthetic */ int c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("80c00115", new Object[]{bVar})).intValue() : bVar.i;
    }

    public static final /* synthetic */ int d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49c0f856", new Object[]{bVar})).intValue() : bVar.j;
    }

    public static final /* synthetic */ com.etao.feimagesearch.structure.capture.e e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.structure.capture.e) ipChange.ipc$dispatch("548eea50", new Object[]{bVar}) : bVar.p;
    }

    public static final /* synthetic */ AtomicBoolean f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("f482ede5", new Object[]{bVar}) : bVar.r;
    }

    public static final /* synthetic */ csx g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (csx) ipChange.ipc$dispatch("4dba2098", new Object[]{bVar}) : bVar.B;
    }

    public static final /* synthetic */ void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc4d567", new Object[]{bVar});
        } else {
            bVar.l();
        }
    }

    public static final /* synthetic */ AtomicBoolean i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("95eeefe8", new Object[]{bVar}) : bVar.o;
    }

    public static final /* synthetic */ AtomicBoolean j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("766845e9", new Object[]{bVar}) : bVar.w;
    }

    public static final /* synthetic */ com.etao.feimagesearch.intelli.e k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.intelli.e) ipChange.ipc$dispatch("e68bfb01", new Object[]{bVar}) : bVar.x;
    }

    public static final /* synthetic */ void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c8b26b", new Object[]{bVar});
        } else {
            bVar.g();
        }
    }

    public static final /* synthetic */ boolean m(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ac9a9b0", new Object[]{bVar})).booleanValue() : bVar.G;
    }

    public static final /* synthetic */ boolean n(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23caa0f1", new Object[]{bVar})).booleanValue() : bVar.v;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(1225723364);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public b(Context context, CaptureManager captureManager) {
        q.c(context, "context");
        q.c(captureManager, "captureManager");
        this.F = context;
        this.I = captureManager;
        this.f = true;
        this.n = new AtomicBoolean(true);
        this.o = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
        this.s = com.etao.feimagesearch.config.b.aT();
        this.w = new AtomicBoolean(true);
        this.y = new cqx();
        this.z = System.currentTimeMillis();
        this.A = System.currentTimeMillis();
        this.B = new csx();
        this.C = com.etao.feimagesearch.config.b.dG();
        this.v = true;
        this.G = true;
        this.D = new e();
        this.E = new d(Looper.getMainLooper());
        cqx cqxVar = this.y;
        cqxVar.name = "plt_autodetect";
        cqxVar.type = "plt_autodetect";
        com.etao.feimagesearch.mnn.h.a(cqxVar.name, new com.etao.feimagesearch.mnn.f<com.etao.feimagesearch.nn.optimize.a, OptimizeOutput>() { // from class: com.etao.feimagesearch.intelli.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.mnn.f
            public com.etao.feimagesearch.mnn.e<com.etao.feimagesearch.nn.optimize.a, OptimizeOutput> a(NetConfig netConfig) {
                Object a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    a2 = ipChange.ipc$dispatch("e1347497", new Object[]{this, netConfig});
                } else {
                    q.c(netConfig, "netConfig");
                    a2 = com.etao.feimagesearch.mnn.a.Companion.a();
                }
                return (com.etao.feimagesearch.mnn.e) a2;
            }
        });
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "needCallPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
        cot.a("AutoDetect", "needCallPrepare", "taskName:plt_autodetect");
        this.e = new com.etao.feimagesearch.nn.g(this.y.name, String.valueOf(this.F.hashCode()));
        com.etao.feimagesearch.nn.f.Companion.a().a("plt_autodetect", this.D);
        this.m = new FrameLayout(this.F);
        this.m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.m.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.etao.feimagesearch.intelli.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, v, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                b bVar = b.this;
                q.a((Object) v, "v");
                bVar.b(v.getWidth(), v.getHeight());
            }
        });
        this.x = new com.etao.feimagesearch.intelli.c(this.F, this.I);
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.z;
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect", HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(currentTimeMillis));
        cot.a("AutoDetect", "callPrepare", "mnnStatus:" + BaseMnnRunUnit.KEY_TASK_NAME + ":plt_autodetect," + HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME + ":" + currentTimeMillis);
        this.e.a(this.y, new c(System.currentTimeMillis()));
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
            cot.a("AutoDetect", "AdvanceObjectDetector", "mnnNetWorker onBuildSucceed");
            if (com.a() && com.etao.feimagesearch.config.b.cB()) {
                cot.b("AdvanceObjectDetector", "Mock MNN build failed");
                c();
                return;
            }
            b.i(b.this).set(true);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "prepareSuccess_plt_autodetect", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
            b.j(b.this).set(false);
            b.a(b.this, false);
            com.etao.feimagesearch.intelli.e k = b.k(b.this);
            if (k != null) {
                k.c();
            }
            b.a(b.this, (com.etao.feimagesearch.intelli.e) null);
        }

        @Override // com.etao.feimagesearch.nn.e
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                cot.c("AdvanceObjectDetector", "mnnNetWorker onMainBuildSucceed");
            }
        }

        @Override // com.etao.feimagesearch.nn.e
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            cot.a("AutoDetect", "AdvanceObjectDetector", "mnnNetWorker onBuildFailed");
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "prepareFailed_plt_autodetect", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
            b.j(b.this).set(true);
            b.a(b.this, false);
        }

        @Override // com.etao.feimagesearch.nn.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                cot.b("AdvanceObjectDetector", "mnnNetWorker onMainBuildFailed");
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
        com.etao.feimagesearch.intelli.e eVar = this.x;
        if (eVar != null) {
            eVar.a(flow);
        }
        h();
        this.q.set(false);
    }

    private final void h() {
        com.etao.feimagesearch.structure.capture.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        cot.c("AdvanceObjectDetector", "resetDetect");
        C0225b c0225b = this.k;
        if (c0225b != null) {
            c0225b.a();
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
        com.etao.feimagesearch.intelli.e eVar = this.x;
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
        cot.c("AdvanceObjectDetector", "stop");
        super.b();
        com.etao.feimagesearch.intelli.e eVar = this.x;
        if (eVar != null) {
            eVar.b();
        }
        this.E.removeMessages(6);
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
        com.etao.feimagesearch.intelli.e eVar = this.x;
        if (eVar != null) {
            eVar.c();
        }
        this.x = null;
        com.etao.feimagesearch.nn.f.Companion.a().a(this.D);
        this.E.removeMessages(6);
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
        com.etao.feimagesearch.intelli.e eVar = this.x;
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
        com.etao.feimagesearch.intelli.e eVar = this.x;
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
            this.H = true;
            i();
            if (this.u) {
                this.v = false;
                this.G = false;
            } else {
                this.u = true;
                if (!cpe.Companion.a()) {
                    this.G = true;
                    cpe.Companion.a(true);
                } else {
                    this.G = false;
                }
                if (cpe.Companion.b()) {
                    this.v = true;
                    cpe.Companion.b(false);
                } else {
                    this.v = false;
                }
            }
            z2 = true;
        } else {
            this.B.a(System.currentTimeMillis() - this.A);
            z2 = false;
        }
        this.A = System.currentTimeMillis();
        com.etao.feimagesearch.structure.capture.e eVar = this.p;
        if (eVar == null || this.q.get()) {
            StringBuilder sb = new StringBuilder();
            sb.append("flow is null ");
            if (eVar != null) {
                z3 = false;
            }
            sb.append(z3);
            k.f("AdvanceObjectDetector", sb.toString(), new Object[0]);
            return;
        }
        if (this.w.get()) {
            if (z2) {
                qgt.a((Integer) 0);
            }
            qgt.a(this.H, false, elapsedRealtime);
            this.H = false;
            com.etao.feimagesearch.intelli.e eVar2 = this.x;
            if (eVar2 != null) {
                eVar2.a(yuvData, z, i, i2, i3);
                return;
            }
        }
        if (z2) {
            qgt.a((Integer) 1);
        }
        if (this.t || !this.o.get() || this.d || k()) {
            return;
        }
        if (p.a(yuvData, i, i2, this.I.M()) == 1) {
            eVar.f();
        } else {
            eVar.e();
        }
        if (this.g == 0 || this.h == 0) {
            k.f("AdvanceObjectDetector", "长宽未初始化", new Object[0]);
        } else if (!this.f) {
        } else {
            qgt.a(this.H, true, elapsedRealtime);
            this.H = false;
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
        cot.a("AutoDetect", "AdvanceObjectDetector", "resetAlgorithm");
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
        com.etao.feimagesearch.intelli.e eVar = this.x;
        return (eVar == null || (f = eVar.f()) == null) ? ClientModelType.MNN : f;
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.s = com.etao.feimagesearch.util.c.a(this.F);
        cot.c("AdvanceObjectDetector", "onReceiveFirstFrame-----silenceTime = " + this.s);
        if (this.s > 0) {
            this.t = true;
            this.E.removeMessages(6);
            this.E.sendEmptyMessageDelayed(6, this.s);
        } else {
            this.E.removeMessages(6);
            this.E.sendEmptyMessage(6);
        }
        com.etao.feimagesearch.intelli.e eVar = this.x;
        if (eVar != null) {
            eVar.l();
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "pltFirstCameraFrameIn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
        cot.a("AutoDetect", "pltFirstCameraFrameIn", "taskName: plt_autodetect");
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
        com.etao.feimagesearch.intelli.e eVar = this.x;
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
            C0225b c0225b = new C0225b(this, bArr, i, i2, z, i3);
            this.e.a("plt_autodetect", "detectFrame", (Object) null, c0225b);
            this.k = c0225b;
            eVar.c();
        }
    }

    /* renamed from: com.etao.feimagesearch.intelli.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0225b implements j<com.etao.feimagesearch.nn.optimize.a, OptimizeOutput> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f6690a;
        private final AtomicBoolean b;
        private final byte[] c;
        private final int d;
        private final int e;
        private final boolean f;
        private final int g;

        static {
            kge.a(839463984);
            kge.a(12920176);
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* bridge */ /* synthetic */ void b(OptimizeOutput optimizeOutput) {
        }

        public OptimizeOutput g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OptimizeOutput) ipChange.ipc$dispatch("57392f", new Object[]{this});
            }
            return null;
        }

        public C0225b(b bVar, byte[] yuvData, int i, int i2, boolean z, int i3) {
            q.c(yuvData, "yuvData");
            this.f6690a = bVar;
            this.c = yuvData;
            this.d = i;
            this.e = i2;
            this.f = z;
            this.g = i3;
            this.b = new AtomicBoolean(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.etao.feimagesearch.nn.optimize.a] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.nn.optimize.a b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : e();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.etao.feimagesearch.nn.optimize.OptimizeOutput] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ OptimizeOutput f() {
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

        public com.etao.feimagesearch.nn.optimize.a e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.nn.optimize.a) ipChange.ipc$dispatch("56c904ea", new Object[]{this});
            }
            com.etao.feimagesearch.nn.optimize.a aVar = new com.etao.feimagesearch.nn.optimize.a();
            byte[] bArr = this.c;
            aVar.f6920a = new byte[bArr.length];
            System.arraycopy(bArr, 0, aVar.f6920a, 0, this.c.length);
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.e = b.a(this.f6690a);
            aVar.f = b.b(this.f6690a);
            aVar.g = b.c(this.f6690a);
            aVar.h = b.d(this.f6690a);
            aVar.b = this.f;
            aVar.v = this.g;
            com.etao.feimagesearch.structure.capture.e e = b.e(this.f6690a);
            aVar.t = e == null || e.j();
            if (b.f(this.f6690a).getAndSet(false)) {
                cot.c("AdvanceObjectDetector", "reset algorithm");
                aVar.u = true;
            }
            return aVar;
        }

        @Override // com.etao.feimagesearch.nn.j
        public void a(OptimizeOutput optimizeOutput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("448f12a9", new Object[]{this, optimizeOutput});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f6690a.c) {
                this.f6690a.c = true;
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "pltFirstObjectDetect", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
                cot.a("AutoDetect", "pltFirstObjectDetect", "taskName: plt_autodetect");
            }
            if (this.b.get()) {
                return;
            }
            long e = elapsedRealtime - qgt.INSTANCE.e();
            com.etao.feimagesearch.structure.capture.e e2 = b.e(this.f6690a);
            if (optimizeOutput == null || e2 == null) {
                qgt.INSTANCE.a(MnnOnceDetectRecord.Companion.a(e, null, false));
                b.a(this.f6690a, false);
                return;
            }
            b.g(this.f6690a).b(optimizeOutput.e);
            String str = optimizeOutput.l;
            if (str == null) {
                str = "";
            }
            if (optimizeOutput.j != null) {
                List<RectF> list = optimizeOutput.j;
                q.a((Object) list, "optimizeOutput.multiParts");
                if (!list.isEmpty()) {
                    b.f(this.f6690a).set(true);
                    coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "Advance_Object_Mnn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, optimizeOutput.m, BaseMnnRunUnit.KEY_TASK_CID, optimizeOutput.n);
                    HashMap<String, String> hashMap = new HashMap<>(10);
                    HashMap<String, String> hashMap2 = hashMap;
                    String type = ClientModelType.MNN.getType();
                    q.a((Object) type, "ClientModelType.MNN.type");
                    hashMap2.put(ClientModelType.KEY_CLIENT_MODEL_TYPE, type);
                    if (!StringUtils.isEmpty(str)) {
                        hashMap2.put(com.etao.feimagesearch.mnn.b.EXTRA_INFO_KEY, str);
                    }
                    String ch = com.etao.feimagesearch.config.b.ch();
                    q.a((Object) ch, "ConfigModel.getTrustTerminalAlgoConfig()");
                    e2.a(PhotoFrom.Values.AUTO_DETECT, new ctf("plt_autodetect", ch), optimizeOutput.d, optimizeOutput.j, hashMap);
                    qgt.INSTANCE.a(MnnOnceDetectRecord.Companion.a(e, optimizeOutput.q, true));
                    qgt.a(b.m(this.f6690a), b.n(this.f6690a), false, SystemClock.elapsedRealtime());
                    b.h(this.f6690a);
                    return;
                }
            }
            qgt.INSTANCE.a(MnnOnceDetectRecord.Companion.a(e, optimizeOutput.q, false));
            b.a(this.f6690a, false);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            cot.b("AdvanceObjectDetector", "onError");
            b.a(this.f6690a, false);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                cot.b("AdvanceObjectDetector", "onErrorMain");
            }
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.C) {
        } else {
            csw.a(this.B.b(), this.B.c());
            this.B.a();
        }
    }
}
