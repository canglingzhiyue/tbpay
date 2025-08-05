package com.etao.feimagesearch.intelli.realtime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.d;
import com.etao.feimagesearch.intelli.realtime.a;
import com.etao.feimagesearch.mnn.realtime.m;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.f;
import com.etao.feimagesearch.nn.g;
import com.etao.feimagesearch.nn.j;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.e;
import com.etao.feimagesearch.util.p;
import com.taobao.android.searchbaseframe.util.k;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cot;
import tb.ctf;
import tb.kge;

/* loaded from: classes3.dex */
public class c extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context f;
    private final g g;
    private volatile int i;
    private volatile int j;
    private volatile int k;
    private volatile int l;
    private a m;
    private final FrameLayout o;
    private volatile e u;
    private final b w;
    private final CaptureManager y;
    private final int e = com.etao.feimagesearch.config.b.ae();
    private volatile boolean h = true;
    private int n = 0;
    private final AtomicBoolean p = new AtomicBoolean(true);
    private final AtomicBoolean q = new AtomicBoolean(false);
    private final LinkedBlockingQueue<a.C0227a> r = new LinkedBlockingQueue<>();
    private final com.etao.feimagesearch.intelli.realtime.a s = com.etao.feimagesearch.intelli.realtime.a.Companion.a();
    private final Handler t = new Handler(Looper.getMainLooper()) { // from class: com.etao.feimagesearch.intelli.realtime.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i != 5) {
                if (i != 6 || !(message.obj instanceof Boolean)) {
                    return;
                }
                c.a(c.this, ((Boolean) message.obj).booleanValue());
            } else if (c.a(c.this) >= c.b(c.this)) {
                if (c.c(c.this) != null) {
                }
            } else {
                c.d(c.this);
                k.f("realtime_RealTimeObjectDetector", "没检测到主体，开始重试", new Object[0]);
                c.a(c.this, false);
            }
        }
    };
    private final AtomicBoolean v = new AtomicBoolean(false);
    private boolean x = false;

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        kge.a(2008057353);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a0bd762", new Object[]{cVar})).intValue() : cVar.n;
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76f8967", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.i = i;
        return i;
    }

    public static /* synthetic */ void a(c cVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a8b7e", new Object[]{cVar, bool});
        } else {
            cVar.a(bool);
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76fc945", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.b(z);
        }
    }

    public static /* synthetic */ int b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93d67941", new Object[]{cVar})).intValue() : cVar.e;
    }

    public static /* synthetic */ int b(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6f92368", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.j = i;
        return i;
    }

    public static /* synthetic */ e c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2a874327", new Object[]{cVar}) : cVar.u;
    }

    public static /* synthetic */ int d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76bbcff", new Object[]{cVar})).intValue();
        }
        int i = cVar.n;
        cVar.n = i + 1;
        return i;
    }

    public static /* synthetic */ int e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41365ede", new Object[]{cVar})).intValue() : cVar.i;
    }

    public static /* synthetic */ int f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b0100bd", new Object[]{cVar})).intValue() : cVar.j;
    }

    public static /* synthetic */ com.etao.feimagesearch.intelli.realtime.a g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.intelli.realtime.a) ipChange.ipc$dispatch("90f5e9b2", new Object[]{cVar}) : cVar.s;
    }

    public static /* synthetic */ AtomicBoolean h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("8d7b8fc8", new Object[]{cVar}) : cVar.q;
    }

    public static /* synthetic */ b i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("29700270", new Object[]{cVar}) : cVar.w;
    }

    public static /* synthetic */ void j(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622b8846", new Object[]{cVar});
        } else {
            cVar.g();
        }
    }

    public static /* synthetic */ int k(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bf62a18", new Object[]{cVar})).intValue() : cVar.k;
    }

    public static /* synthetic */ int l(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d5c0cbf7", new Object[]{cVar})).intValue() : cVar.l;
    }

    public c(Context context, b bVar, CaptureManager captureManager) {
        this.f = context;
        this.w = bVar;
        this.y = captureManager;
        this.g = new g("plt_search", String.valueOf(context.hashCode()));
        this.o = new FrameLayout(context);
        this.o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.o.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.etao.feimagesearch.intelli.realtime.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                c.a(c.this, view.getWidth());
                c.b(c.this, view.getHeight());
                cot.c("realtime_RealTimeObjectDetector", "onLayoutChange viewWidth: " + c.e(c.this) + ", viewHeight: " + c.f(c.this));
            }
        });
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        NetConfig netConfig = new NetConfig();
        netConfig.name = "plt_search";
        netConfig.type = "plt_search";
        this.g.a(netConfig, new com.etao.feimagesearch.nn.e() { // from class: com.etao.feimagesearch.intelli.realtime.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.nn.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                cot.c("realtime_RealTimeObjectDetector", "onBuildSucceed");
                c.g(c.this).a(c.this);
            }

            @Override // com.etao.feimagesearch.nn.e
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                c.h(c.this).set(true);
                c.a(c.this, (Boolean) false);
                cot.c("realtime_RealTimeObjectDetector", "post RealtimeAlgoModelReady");
                c.i(c.this).a();
            }

            @Override // com.etao.feimagesearch.nn.e
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                } else {
                    cot.b("realtime_RealTimeObjectDetector", "onBuildFailed");
                }
            }

            @Override // com.etao.feimagesearch.nn.e
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                cot.b("realtime_RealTimeObjectDetector", "onMainBuildFailed");
                c.i(c.this).b();
            }
        });
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9c6ec6", new Object[]{this, eVar});
            return;
        }
        this.v.set(true);
        this.u = eVar;
        h();
        this.v.set(false);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        cot.c("realtime_RealTimeObjectDetector", "resetDetect");
        a aVar = this.m;
        if (aVar != null) {
            a.a(aVar);
        }
        a((Boolean) false);
        this.t.removeMessages(5);
        this.n = 0;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.x) {
            return;
        }
        this.x = true;
        f.Companion.a().a("plt_search", new f.b() { // from class: com.etao.feimagesearch.intelli.realtime.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.nn.f.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                cot.d("realtime_RealTimeObjectDetector", "cv task ready");
                c.j(c.this);
            }
        });
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        cot.c("realtime_RealTimeObjectDetector", "call destroy");
        this.r.clear();
        this.s.a();
        this.g.b();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.k = i;
        this.l = i2;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public FrameLayout d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this}) : this.o;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(byte[] bArr, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acc2fe", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        e eVar = this.u;
        if (eVar == null || this.v.get()) {
            StringBuilder sb = new StringBuilder();
            sb.append("flow is null ");
            if (eVar != null) {
                z2 = false;
            }
            sb.append(z2);
            k.f("realtime_RealTimeObjectDetector", sb.toString(), new Object[0]);
        } else if (this.d) {
            cot.c("realtime_RealTimeObjectDetector", "stoped");
        } else {
            boolean z3 = p.a(bArr, i, i2, this.y.M()) == 1;
            if (z3) {
                eVar.f();
            } else {
                eVar.e();
            }
            if (this.i * this.j == 0) {
                cot.c("realtime_RealTimeObjectDetector", "viewWidth is zero");
            } else {
                a(bArr, z, i, i2, i3, z3, eVar);
            }
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.p.get();
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.p.set(z);
        if (z) {
            return;
        }
        this.g.a();
        j();
    }

    private void a(byte[] bArr, boolean z, int i, int i2, int i3, boolean z2, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6c4f4", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z2), eVar});
        } else if (!this.q.get()) {
            cot.c("realtime_RealTimeObjectDetector", "autoDetectProcess: " + this.q.get());
        } else if (i()) {
            cot.c("realtime_RealTimeObjectDetector", "Detecting");
        } else {
            eVar.b();
            this.t.removeMessages(5);
            a((Boolean) true);
            a aVar = new a(bArr, z, i, i2, i3);
            this.g.a("plt_search", "detectFrame", (Object) null, aVar);
            this.m = aVar;
            eVar.c();
        }
    }

    /* loaded from: classes3.dex */
    public class a implements j<com.etao.feimagesearch.mnn.realtime.j, m> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final byte[] b;
        private final boolean c;
        private final int d;
        private final int e;
        private final AtomicBoolean f;
        private final a.C0227a g;
        private final int h;

        static {
            kge.a(297966627);
            kge.a(12920176);
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* bridge */ /* synthetic */ void b(m mVar) {
        }

        public m e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m) ipChange.ipc$dispatch("e7334bc3", new Object[]{this});
            }
            return null;
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("548afd2", new Object[]{aVar});
            } else {
                aVar.g();
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.mnn.realtime.j, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.mnn.realtime.j b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.mnn.realtime.m, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ m f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : e();
        }

        public a(byte[] bArr, boolean z, int i, int i2, int i3) {
            this.f = new AtomicBoolean(false);
            this.b = bArr;
            this.c = z;
            this.d = i;
            this.e = i2;
            this.h = i3;
            this.g = null;
        }

        public a(a.C0227a c0227a) {
            this.f = new AtomicBoolean(false);
            this.b = null;
            this.c = false;
            this.d = 0;
            this.e = 0;
            this.h = 0;
            this.g = c0227a;
        }

        private void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            } else {
                this.f.set(true);
            }
        }

        public com.etao.feimagesearch.mnn.realtime.j a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.mnn.realtime.j) ipChange.ipc$dispatch("522d9062", new Object[]{this});
            }
            a.C0227a c0227a = this.g;
            if (c0227a != null) {
                return new com.etao.feimagesearch.mnn.realtime.j(null, new com.etao.feimagesearch.mnn.realtime.a(c0227a.a()), null);
            }
            byte[] bArr = this.b;
            if (bArr != null) {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                e c = c.c(c.this);
                return new com.etao.feimagesearch.mnn.realtime.j(new com.etao.feimagesearch.mnn.realtime.g(bArr2, this.c, this.d, this.e, c.e(c.this), c.f(c.this), c.k(c.this), c.l(c.this), this.h, c == null || c.j()), null, null);
            }
            return new com.etao.feimagesearch.mnn.realtime.j(null, null, null);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("135f10bf", new Object[]{this, mVar});
            } else if (this.f.get()) {
            } else {
                cot.d("realtime_RealTimeObjectDetector", "onFinish");
                if (mVar == null || c.c(c.this) == null) {
                    c.a(c.this, false);
                } else {
                    b2(mVar);
                }
            }
        }

        /* renamed from: b  reason: avoid collision after fix types in other method */
        private void b2(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d64b7a1e", new Object[]{this, mVar});
                return;
            }
            if (mVar == null) {
                cot.b("realtime_RealTimeObjectDetector", "optimizeOutput is null");
            } else if (mVar.a() != null && mVar.a().a() != null) {
                c.g(c.this).a(mVar.a());
            } else if (this.g != null) {
                if (mVar.b() != null) {
                    this.g.b().a(mVar.b());
                } else {
                    this.g.b().a();
                }
            } else {
                cot.d("realtime_RealTimeObjectDetector", "optimizeOutput.getObjects() is null");
            }
            c.a(c.this, (Boolean) false);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            cot.b("realtime_RealTimeObjectDetector", "onError");
            c.a(c.this, false);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                cot.b("realtime_RealTimeObjectDetector", "onErrorMain");
            }
        }
    }

    private void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else if (Thread.currentThread().isDaemon()) {
            Message obtainMessage = this.t.obtainMessage();
            obtainMessage.what = 6;
            obtainMessage.obj = bool;
            this.t.sendMessage(obtainMessage);
        } else {
            b(bool.booleanValue());
        }
    }

    public void a(a.C0227a c0227a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1defe94", new Object[]{this, c0227a});
            return;
        }
        if (this.r.size() > 100) {
            this.r.poll();
        }
        cot.c("realtime_RealTimeObjectDetector", "addAlgoMsg ");
        this.r.add(c0227a);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        a.C0227a poll = this.r.poll();
        if (poll == null) {
            return;
        }
        a((Boolean) true);
        b(poll);
    }

    private void b(a.C0227a c0227a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f388a4b3", new Object[]{this, c0227a});
            return;
        }
        a aVar = new a(c0227a);
        cot.c("realtime_RealTimeObjectDetector", "processAlgoMsg");
        com.etao.feimagesearch.mnn.realtime.k.Companion.c();
        this.g.a("plt_search", "inputAlgo", (Object) null, aVar);
        this.m = aVar;
    }

    public void a(Bitmap bitmap, List<RectF> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b77dc1", new Object[]{this, bitmap, list, str});
            return;
        }
        cot.c("realtime_RealTimeObjectDetector", "onDetectFinish");
        e eVar = this.u;
        if (eVar == null || this.d) {
            return;
        }
        eVar.a(PhotoFrom.Values.META_SIGHT, new ctf("plt_search", ""), bitmap, list, new HashMap<>(5));
        this.d = true;
    }
}
