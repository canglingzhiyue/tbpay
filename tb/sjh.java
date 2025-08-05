package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;

/* loaded from: classes5.dex */
public class sjh implements sje {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33622a;
    private final f<sjd> b = new f<>();
    private boolean c = false;

    static {
        kge.a(1711936749);
        kge.a(356273848);
    }

    public sjh(FluidContext fluidContext) {
        this.f33622a = fluidContext;
    }

    @Override // tb.sjf
    public void a(sjd sjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed66ecb", new Object[]{this, sjdVar});
        } else if (sjdVar == null) {
        } else {
            this.b.a(sjdVar);
        }
    }

    @Override // tb.sje
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // tb.sjd
    public void cM_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbe4f5c", new Object[]{this});
            return;
        }
        this.c = true;
        spz.c("LandscapeListenerManager", "onScreenLandscape, mIsLandscape: " + this.c + ", observers size: " + this.b.b());
        for (sjd sjdVar : this.b.a()) {
            try {
                sjdVar.cM_();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33622a, sjdVar, "onScreenLandscape", e);
            }
        }
    }

    @Override // tb.sjd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = false;
        spz.c("LandscapeListenerManager", "onScreenNormal, mIsLandscape: " + this.c + ", observers size: " + this.b.b());
        for (sjd sjdVar : this.b.a()) {
            try {
                sjdVar.b();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33622a, sjdVar, "onScreenNormal", e);
            }
        }
    }
}
