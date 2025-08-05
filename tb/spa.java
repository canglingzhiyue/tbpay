package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import tb.spb;

/* loaded from: classes5.dex */
public class spa implements soz, spb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33801a;
    private final f<spb> b = new f<>();
    private boolean c = false;

    static {
        kge.a(-22273267);
        kge.a(405171032);
        kge.a(883776025);
    }

    public spa(FluidContext fluidContext) {
        this.f33801a = fluidContext;
    }

    public void a(spb spbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2a1313", new Object[]{this, spbVar});
        } else if (spbVar == null) {
        } else {
            this.b.a(spbVar);
        }
    }

    public void b(spb spbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edad1994", new Object[]{this, spbVar});
        } else if (spbVar == null) {
        } else {
            this.b.c(spbVar);
        }
    }

    @Override // tb.soz
    public void addTransitionAnimListener(spb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4bae70", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.a(aVar);
        }
    }

    public void a(spb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc69276", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.c(aVar);
        }
    }

    @Override // tb.soz
    public boolean isTransitionAnimEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3281bcf6", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // tb.spb
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            return;
        }
        this.c = true;
        for (spb spbVar : this.b.a()) {
            try {
                spbVar.onAnimationEnd();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33801a, spbVar, "onAnimationEnd", e);
            }
        }
    }

    @Override // tb.spb
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
            return;
        }
        for (spb spbVar : this.b.a()) {
            try {
                spbVar.onAnimationStart();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33801a, spbVar, "onAnimationStart", e);
            }
        }
    }
}
