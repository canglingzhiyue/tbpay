package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;

/* loaded from: classes5.dex */
public class pln implements psv, shs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f32754a;
    private final f<shs> b = new f<>();

    static {
        kge.a(904045974);
        kge.a(1822390441);
        kge.a(-58582805);
    }

    public pln(FluidContext fluidContext) {
        this.f32754a = fluidContext;
    }

    @Override // tb.psv
    public void addBackEventListener(shs shsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f10a9f", new Object[]{this, shsVar});
        } else if (shsVar == null) {
        } else {
            this.b.a(shsVar);
        }
    }

    public void a(shs shsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec1115a", new Object[]{this, shsVar});
        } else if (shsVar == null) {
        } else {
            this.b.c(shsVar);
        }
    }

    @Override // tb.shs
    public void onBackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce9d949", new Object[]{this});
            return;
        }
        for (shs shsVar : this.b.a()) {
            try {
                shsVar.onBackClick();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f32754a, shsVar, "onBackClick", e);
            }
        }
    }
}
