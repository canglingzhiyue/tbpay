package com.etao.feimagesearch.intelli;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.YuvDiffCheckerConfig;
import com.etao.feimagesearch.intelli.e;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.optimize.OptimizeOutput;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ak;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cqx;
import tb.ctf;
import tb.kge;

/* loaded from: classes3.dex */
public class c extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CaptureManager e;
    private com.etao.feimagesearch.nn.c r;

    static {
        kge.a(855925048);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1862824439:
                super.b(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1481951945:
                super.onDeviceStable();
                return null;
            case -1474178196:
                super.a(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1465072898:
                super.a((byte[]) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -551298290:
                return super.d();
            case -358846778:
                super.a((com.etao.feimagesearch.structure.capture.e) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 101150451:
                super.l();
                return null;
            case 365356045:
                super.onDeviceMove();
                return null;
            case 1544639176:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.etao.feimagesearch.intelli.e
    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // com.etao.feimagesearch.intelli.e
    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(int i, int i2) {
        super.a(i, i2);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(com.etao.feimagesearch.structure.capture.e eVar) {
        super.a(eVar);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(byte[] bArr, boolean z, int i, int i2, int i3) {
        super.a(bArr, z, i, i2, i3);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d
    public /* bridge */ /* synthetic */ void b(int i, int i2) {
        super.b(i, i2);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ FrameLayout d() {
        return super.d();
    }

    @Override // com.etao.feimagesearch.intelli.e
    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.etao.feimagesearch.intelli.e, tb.cqi
    public /* bridge */ /* synthetic */ void onDeviceMove() {
        super.onDeviceMove();
    }

    @Override // com.etao.feimagesearch.intelli.e, tb.cqi
    public /* bridge */ /* synthetic */ void onDeviceStable() {
        super.onDeviceStable();
    }

    public c(Context context, CaptureManager captureManager) {
        super(context, "planB_AliNNObjectDetector");
        this.e = captureManager;
        this.n = new g(context);
    }

    @Override // com.etao.feimagesearch.intelli.e
    public ak g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ak) ipChange.ipc$dispatch("8ee0fe8f", new Object[]{this});
        }
        YuvDiffCheckerConfig d = com.etao.feimagesearch.config.b.d();
        return new ak(d.graySize, 10, d.frameCountThreshold, d.timeThreshold);
    }

    @Override // com.etao.feimagesearch.intelli.e
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        cqx cqxVar = new cqx();
        cqxVar.name = "festival_intelli";
        cqxVar.type = "Object";
        a(cqxVar);
        if (this.n == null) {
            return;
        }
        this.n.h();
    }

    private void a(NetConfig netConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde2eaba", new Object[]{this, netConfig});
            return;
        }
        this.r = new com.etao.feimagesearch.nn.c(netConfig.type);
        this.r.a(netConfig, new com.etao.feimagesearch.nn.e() { // from class: com.etao.feimagesearch.intelli.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.nn.e
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // com.etao.feimagesearch.nn.e
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                }
            }

            @Override // com.etao.feimagesearch.nn.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                cot.a("AutoDetect", "planB_AliNNObjectDetector", "buildAlinnNetwork: onMainBuildSucceed");
                if (com.a() && com.etao.feimagesearch.config.b.df()) {
                    cot.b("planB_AliNNObjectDetector", "mock alinn not build failed");
                    c();
                    return;
                }
                c.this.m.set(true);
                c.this.n();
            }

            @Override // com.etao.feimagesearch.nn.e
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                cot.a("AutoDetect", "planB_AliNNObjectDetector", "buildAlinnNetwork: onBuildFailed");
                c.this.m.set(false);
                c.this.o = true;
            }
        });
    }

    @Override // com.etao.feimagesearch.intelli.e
    public void a(byte[] bArr, int i, int i2, boolean z, int i3, com.etao.feimagesearch.structure.capture.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1396741c", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), eVar});
        } else if (this.r == null) {
        } else {
            this.p.removeMessages(5);
            b(true);
            a aVar = new a(bArr, i, i2, z, i3);
            this.r.a("festival_intelli", "detectFrame", null, aVar);
            this.l = aVar;
            eVar.c();
        }
    }

    @Override // com.etao.feimagesearch.intelli.e
    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.e.M();
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        com.etao.feimagesearch.nn.c cVar = this.r;
        if (cVar == null) {
            return;
        }
        cVar.b();
        this.r = null;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public ClientModelType f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientModelType) ipChange.ipc$dispatch("3c5a970b", new Object[]{this});
        }
        if (this.o && this.n != null) {
            return this.n.f();
        }
        return ClientModelType.ALINN;
    }

    /* loaded from: classes3.dex */
    public class a implements e.a<com.etao.feimagesearch.nn.optimize.a, OptimizeOutput> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final byte[] b;
        private final int c;
        private final int d;
        private final boolean e;
        private final AtomicBoolean f = new AtomicBoolean(false);
        private final int g;

        static {
            kge.a(413474068);
            kge.a(-1508851393);
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // com.etao.feimagesearch.nn.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }

        public OptimizeOutput g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OptimizeOutput) ipChange.ipc$dispatch("57392f", new Object[]{this});
            }
            return null;
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ Object b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : e();
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ Object f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : g();
        }

        public a(byte[] bArr, int i, int i2, boolean z, int i3) {
            this.b = bArr;
            this.c = i;
            this.d = i2;
            this.e = z;
            this.g = i3;
        }

        @Override // com.etao.feimagesearch.intelli.e.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f.set(true);
            }
        }

        public com.etao.feimagesearch.nn.optimize.a e() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.nn.optimize.a) ipChange.ipc$dispatch("56c904ea", new Object[]{this});
            }
            com.etao.feimagesearch.nn.optimize.a aVar = new com.etao.feimagesearch.nn.optimize.a();
            byte[] bArr = this.b;
            aVar.f6920a = new byte[bArr.length];
            System.arraycopy(bArr, 0, aVar.f6920a, 0, this.b.length);
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = c.this.f;
            aVar.f = c.this.g;
            aVar.g = c.this.h;
            aVar.h = c.this.i;
            aVar.b = this.e;
            aVar.v = this.g;
            com.etao.feimagesearch.structure.capture.e eVar = c.this.q;
            if (eVar != null && !eVar.j()) {
                z = false;
            }
            aVar.t = z;
            return aVar;
        }

        @Override // com.etao.feimagesearch.nn.j
        public void a(OptimizeOutput optimizeOutput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("448f12a9", new Object[]{this, optimizeOutput});
                return;
            }
            if (!c.this.c) {
                c.this.c = true;
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "pltFirstObjectDetect", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "object_detect");
                cot.a("AutoDetect", "pltFirstObjectDetect", "taskName: object_detect");
            }
            if (this.f.get()) {
                return;
            }
            c.this.a(optimizeOutput, new ctf("object_detect", ""), ClientModelType.ALINN);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                c.this.b(false);
            }
        }
    }
}
