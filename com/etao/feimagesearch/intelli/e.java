package com.etao.feimagesearch.intelli;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.nn.j;
import com.etao.feimagesearch.nn.optimize.OptimizeOutput;
import com.etao.feimagesearch.util.ak;
import com.etao.feimagesearch.util.p;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cot;
import tb.coy;
import tb.cqi;
import tb.ctf;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class e extends d implements cqi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "planB_";
    private ak e;
    public volatile int f;
    public volatile int g;
    public volatile int h;
    public volatile int i;
    public volatile boolean j;
    public a l;
    public e n;
    public volatile com.etao.feimagesearch.structure.capture.e q;
    private final String r;
    private final Context s;
    private com.etao.feimagesearch.intelli.a v;
    private final FrameLayout x;
    private final int t = com.etao.feimagesearch.config.b.ae();
    private volatile boolean u = true;
    public long k = Long.MAX_VALUE;
    private int w = 0;
    private final AtomicBoolean y = new AtomicBoolean(true);
    public final AtomicBoolean m = new AtomicBoolean(false);
    private long z = System.currentTimeMillis();
    private long A = com.etao.feimagesearch.config.b.aT();
    public volatile boolean o = false;
    private final long B = com.etao.feimagesearch.config.b.aa();
    private boolean C = false;
    public final Handler p = new Handler(Looper.getMainLooper()) { // from class: com.etao.feimagesearch.intelli.e.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 5) {
                if (e.a(e.this) >= e.b(e.this)) {
                    if (e.this.q != null) {
                    }
                    return;
                }
                e.c(e.this);
                k.f("AutoDetect", "no region retry", new Object[0]);
                e.this.b(false);
            } else if (i != 6) {
            } else {
                cot.a("AutoDetect", e.d(e.this), "change SilenceStatus false");
                e.a(e.this, false);
                com.etao.feimagesearch.structure.capture.e eVar = e.this.q;
                if (eVar == null) {
                    return;
                }
                eVar.g();
            }
        }
    };
    private final AtomicBoolean D = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public interface a<INPUT, OUTPUT> extends j<INPUT, OUTPUT> {
        void a();
    }

    static {
        kge.a(1224649132);
        kge.a(-514659404);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
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

    public abstract void a(byte[] bArr, int i, int i2, boolean z, int i3, com.etao.feimagesearch.structure.capture.e eVar);

    public abstract ak g();

    public abstract void h();

    public abstract float i();

    public abstract long j();

    public abstract long k();

    public static /* synthetic */ int a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eebf6fb0", new Object[]{eVar})).intValue() : eVar.w;
    }

    public static /* synthetic */ ak a(e eVar, ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ak) ipChange.ipc$dispatch("57fe5499", new Object[]{eVar, akVar});
        }
        eVar.e = akVar;
        return akVar;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e92f3abb", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.C = z;
        return z;
    }

    public static /* synthetic */ int b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7c066f1", new Object[]{eVar})).intValue() : eVar.t;
    }

    public static /* synthetic */ int c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80c15e32", new Object[]{eVar})).intValue();
        }
        int i = eVar.w;
        eVar.w = i + 1;
        return i;
    }

    public static /* synthetic */ String d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34bd4f20", new Object[]{eVar}) : eVar.r;
    }

    public e(Context context, final String str) {
        this.s = context;
        this.r = str;
        VExecutors.defaultSharedThreadPool().submit(new Runnable() { // from class: com.etao.feimagesearch.intelli.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e eVar = e.this;
                e.a(eVar, eVar.g());
                e.this.h();
            }
        });
        this.v = new com.etao.feimagesearch.intelli.a(context, this);
        this.x = new FrameLayout(context);
        this.x.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.x.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.etao.feimagesearch.intelli.e.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                cot.c(str, "onLayoutChange");
                e.this.b(view.getWidth(), view.getHeight());
            }
        });
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.y.set(z);
        e eVar = this.n;
        if (eVar == null) {
            return;
        }
        eVar.b(z);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(byte[] bArr, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acc2fe", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (!this.f6696a) {
            l();
        }
        if (this.o && m()) {
            this.n.a(bArr, z, i, i2, i3);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.z;
        if (j < j()) {
            String str = this.r;
            cot.d(str, "interval = " + j);
            return;
        }
        this.z = currentTimeMillis;
        com.etao.feimagesearch.structure.capture.e eVar = this.q;
        if (eVar == null || this.D.get()) {
            cot.d(this.r, "flow is null ");
        } else if (!this.m.get()) {
            cot.d(this.r, "not build success yet");
        } else if (this.d) {
            cot.d(this.r, "stoped");
        } else {
            if (p.a(bArr, i, i2, i()) != 1) {
                z2 = false;
            }
            if (z2) {
                eVar.f();
            } else {
                eVar.e();
            }
            if (z2 && eVar.a()) {
                k.f(this.r, "当前帧亮度太低，检测结束", new Object[0]);
                b(false);
                this.k = Long.MAX_VALUE;
            } else if (!this.u || this.f == 0 || this.g == 0) {
                String str2 = this.r;
                k.f(str2, "focused = " + this.u + ", viewWidth = " + this.f + ", viewHeight = " + this.g, new Object[0]);
            } else if (o()) {
                cot.d(this.r, "drop frame");
            } else if (this.f * this.g == 0) {
                String str3 = this.r;
                cot.d(str3, "viewWidth = " + this.f + ", viewHeight");
            } else if (p()) {
                k.f(this.r, "模型任务未完成，检测结束", new Object[0]);
            } else {
                long currentTimeMillis2 = System.currentTimeMillis() - this.k;
                if (!this.j || currentTimeMillis2 < k()) {
                    String str4 = this.r;
                    cot.d(str4, "autoDetectProcess: not stable enough time " + currentTimeMillis2 + ", deviceStable " + this.j);
                } else if (a(bArr, i, i2) != 3) {
                } else {
                    a(bArr, i, i2, z, i3, eVar);
                }
            }
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        e eVar = this.n;
        return eVar != null && eVar.m.get();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.f6696a = true;
        this.A = com.etao.feimagesearch.util.c.a(this.s);
        long j = this.A;
        if (j > 0) {
            this.C = true;
            this.p.sendEmptyMessageDelayed(6, j);
        } else {
            this.p.sendEmptyMessage(6);
        }
        this.b = Long.valueOf(System.currentTimeMillis());
        String str = this.r;
        cot.c(str, "onReceiveFirstFrame-----silenceTime = " + this.A);
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "pltFirstCameraFrameIn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "object_detect");
        cot.a("AutoDetect", "pltFirstCameraFrameIn", "taskName: object_detect");
        e eVar = this.n;
        if (eVar == null) {
            return;
        }
        eVar.l();
    }

    public void a(OptimizeOutput optimizeOutput, ctf ctfVar, ClientModelType clientModelType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5fe28e6", new Object[]{this, optimizeOutput, ctfVar, clientModelType});
            return;
        }
        cot.d(this.r, "onFindObject");
        com.etao.feimagesearch.structure.capture.e eVar = this.q;
        if (optimizeOutput == null || eVar == null) {
            b(false);
        } else if (optimizeOutput.j != null && optimizeOutput.d != null) {
            HashMap<String, String> hashMap = new HashMap<>(5);
            if (clientModelType != null) {
                hashMap.put(ClientModelType.KEY_CLIENT_MODEL_TYPE, clientModelType.getType());
            }
            eVar.a(PhotoFrom.Values.AUTO_DETECT, ctfVar, optimizeOutput.d, optimizeOutput.j, hashMap);
        } else if (!com.etao.feimagesearch.config.b.ab()) {
        } else {
            this.p.sendEmptyMessageDelayed(5, this.B);
        }
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return this.C;
        }
        return true;
    }

    private int a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c2", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        ak akVar = this.e;
        return (akVar != null && akVar.a(bArr, i, i2)) ? 3 : 4;
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.y.get();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(com.etao.feimagesearch.structure.capture.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9c6ec6", new Object[]{this, eVar});
            return;
        }
        this.D.set(true);
        this.q = eVar;
        q();
        this.D.set(false);
        e eVar2 = this.n;
        if (eVar2 == null) {
            return;
        }
        eVar2.a(eVar);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        b(false);
        this.p.removeMessages(5);
        this.w = 0;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        e eVar = this.n;
        if (eVar != null) {
            eVar.a();
        }
        if (this.v != null) {
            return;
        }
        this.v = new com.etao.feimagesearch.intelli.a(this.s, this);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        cot.d(this.r, "stop");
        this.p.removeMessages(6);
        this.f6696a = false;
        if (this.A > 0) {
            this.C = true;
        }
        com.etao.feimagesearch.intelli.a aVar = this.v;
        if (aVar != null) {
            aVar.a();
            this.v = null;
        }
        e eVar = this.n;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        cot.d(this.r, "destroy");
        com.etao.feimagesearch.intelli.a aVar = this.v;
        if (aVar != null) {
            aVar.a();
        }
        ak akVar = this.e;
        if (akVar != null) {
            akVar.a();
        }
        this.p.removeCallbacksAndMessages(null);
        this.f6696a = false;
        n();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        e eVar = this.n;
        if (eVar == null) {
            return;
        }
        eVar.c();
        this.n = null;
    }

    public void onDeviceMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c6e40d", new Object[]{this});
        } else if (this.o || this.d) {
        } else {
            q();
            com.etao.feimagesearch.structure.capture.e eVar = this.q;
            if (eVar != null) {
                eVar.d();
            }
            this.j = false;
            this.k = Long.MAX_VALUE;
        }
    }

    public void onDeviceStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ab3537", new Object[]{this});
        } else if (this.o || this.d) {
        } else {
            this.j = true;
            this.k = System.currentTimeMillis();
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.h = i;
        this.i = i2;
        e eVar = this.n;
        if (eVar == null) {
            return;
        }
        eVar.a(i, i2);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public FrameLayout d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this}) : this.x;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.u = z;
        e eVar = this.n;
        if (eVar == null) {
            return;
        }
        eVar.a(z);
    }

    @Override // com.etao.feimagesearch.intelli.d
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        String str = this.r;
        cot.c(str, "setRootViewSize: width=" + i + ", height=" + i2);
        this.f = i;
        this.g = i2;
        e eVar = this.n;
        if (eVar == null) {
            return;
        }
        eVar.b(i, i2);
    }
}
