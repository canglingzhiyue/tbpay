package tb;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.media.IMediaService;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class psy extends psw implements snz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final fgc f32871a;
    private ese b;
    public final Handler t;
    public final sob u;
    public final sod v;
    public final IMediaService w;
    public boolean x;

    static {
        kge.a(1430084856);
        kge.a(854340662);
    }

    public static /* synthetic */ Object ipc$super(psy psyVar, String str, Object... objArr) {
        if (str.hashCode() == 504096288) {
            super.onBindData((psw) objArr[0], (a) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$ER0jU1dBjzS1W3BqiLfsikjj2-E */
    public static /* synthetic */ void m2474lambda$ER0jU1dBjzS1W3BqiLfsikjj2E(psy psyVar) {
        psyVar.i();
    }

    /* renamed from: lambda$Q-FmdTr6rVDBVG-8Rg1bFPT3IUY */
    public static /* synthetic */ void m2475lambda$QFmdTr6rVDBVG8Rg1bFPT3IUY(psy psyVar) {
        psyVar.g();
    }

    public static /* synthetic */ void lambda$T2cnE7JLkEBX87v8rHRZxG9toGw(psy psyVar) {
        psyVar.e();
    }

    public static /* synthetic */ void lambda$whgsKFzMeeGwpuN3e_p5KQ4mvMo(psy psyVar) {
        psyVar.h();
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        }
    }

    public void a(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c4f948", new Object[]{this, bool, bool2});
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    public psy(FluidContext fluidContext) {
        super(fluidContext);
        this.t = new Handler(Looper.getMainLooper());
        this.x = false;
        this.u = new sob(fluidContext);
        this.v = new sod(fluidContext);
        this.w = (IMediaService) fluidContext.getService(IMediaService.class);
        this.f32871a = new fgc(fluidContext, this);
        this.b = new ese(fluidContext, this);
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (!this.r) {
        } else {
            R();
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else if (!H() || !this.r) {
        } else {
            c(true);
        }
    }

    public sob O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sob) ipChange.ipc$dispatch("848cf7aa", new Object[]{this}) : this.u;
    }

    public sod P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sod) ipChange.ipc$dispatch("8c3e9d47", new Object[]{this}) : this.v;
    }

    public IMediaService Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaService) ipChange.ipc$dispatch("95039d87", new Object[]{this}) : this.w;
    }

    @Override // tb.psw, tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        super.onBindData(pswVar, aVar, i);
        if (!((IDataService) this.e.getService(IDataService.class)).getConfig().j().aj) {
            return;
        }
        a((Boolean) true, (Boolean) false);
    }

    @Override // tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
            return;
        }
        spz.c("MediaCard", "onDataUpdate - " + C());
        this.u.onDataUpdate(pswVar);
        this.w.onDataUpdate(pswVar);
    }

    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
            return;
        }
        this.u.onPauseMedia(pswVar);
        this.w.onPauseMedia(pswVar);
    }

    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        this.u.onRecyclePlayer(pswVar, z);
        this.w.onRecyclePlayer(pswVar, z);
    }

    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
            return;
        }
        this.u.onRequestMediaPlayer(pswVar);
        this.w.onRequestMediaPlayer(pswVar);
    }

    @Override // tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
            return;
        }
        this.u.onShowCover(pswVar);
        this.w.onShowCover(pswVar);
    }

    @Override // tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        this.u.onShowFirstCover(pswVar, i, i2, drawable, str);
        this.w.onShowFirstCover(pswVar, i, i2, drawable, str);
    }

    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.u.onStartMedia(pswVar, z, z2);
        this.w.onStartMedia(pswVar, z, z2);
    }

    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
            return;
        }
        this.u.onStopMedia(pswVar);
        this.w.onStopMedia(pswVar);
    }

    @Override // tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
            return;
        }
        this.u.onUTPairsUpdate(pswVar);
        this.w.onUTPairsUpdate(pswVar);
    }

    @Override // tb.psw
    public void aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd3f8b7", new Object[]{this});
        } else {
            S();
        }
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            onPauseMedia(this);
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else {
            a(new Runnable() { // from class: tb.-$$Lambda$psy$ER0jU1dBjzS1W3BqiLfsikjj2-E
                @Override // java.lang.Runnable
                public final void run() {
                    psy.m2474lambda$ER0jU1dBjzS1W3BqiLfsikjj2E(psy.this);
                }
            });
        }
    }

    public final void b_(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dad110", new Object[]{this, new Boolean(z)});
            return;
        }
        onRecyclePlayer(this, z);
        this.x = false;
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else {
            a(new Runnable() { // from class: tb.-$$Lambda$psy$whgsKFzMeeGwpuN3e_p5KQ4mvMo
                @Override // java.lang.Runnable
                public final void run() {
                    psy.lambda$whgsKFzMeeGwpuN3e_p5KQ4mvMo(psy.this);
                }
            });
        }
    }

    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.x) {
        } else {
            this.x = true;
            onRequestMediaPlayer(this);
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.t.post(runnable);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else {
            onShowCover(this);
        }
    }

    public final void a(int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5309b8b6", new Object[]{this, new Integer(i), new Integer(i2), drawable, str});
        } else {
            onShowFirstCover(this, i, i2, drawable, str);
        }
    }

    public final void a(final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            a(new Runnable() { // from class: tb.psy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    psy.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (!psy.this.x) {
                        psy psyVar = psy.this;
                        psyVar.x = true;
                        psyVar.onRequestMediaPlayer(psyVar);
                    }
                    psy psyVar2 = psy.this;
                    psyVar2.onStartMedia(psyVar2, z, z2);
                }
            });
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            a(z, false);
        }
    }

    public /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            onStopMedia(this);
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
        } else {
            a(new Runnable() { // from class: tb.-$$Lambda$psy$Q-FmdTr6rVDBVG-8Rg1bFPT3IUY
                @Override // java.lang.Runnable
                public final void run() {
                    psy.m2475lambda$QFmdTr6rVDBVG8Rg1bFPT3IUY(psy.this);
                }
            });
        }
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            onUTPairsUpdate(this);
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else {
            a(new Runnable() { // from class: tb.-$$Lambda$psy$T2cnE7JLkEBX87v8rHRZxG9toGw
                @Override // java.lang.Runnable
                public final void run() {
                    psy.lambda$T2cnE7JLkEBX87v8rHRZxG9toGw(psy.this);
                }
            });
        }
    }
}
