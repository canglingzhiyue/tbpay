package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;

/* loaded from: classes5.dex */
public class som implements sok, tbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f<sok> f33772a = new f<>();

    static {
        kge.a(1567659628);
        kge.a(491973367);
        kge.a(-1766620920);
    }

    @Override // tb.tbn
    public void a(sok sokVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2012e9", new Object[]{this, sokVar});
        } else if (sokVar == null) {
        } else {
            this.f33772a.a(sokVar);
        }
    }

    @Override // tb.tbn
    public void b(sok sokVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda3196a", new Object[]{this, sokVar});
        } else if (sokVar == null) {
        } else {
            this.f33772a.c(sokVar);
        }
    }

    @Override // tb.sok
    public void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4f7ae", new Object[]{this, fluidContext, str, str2});
            return;
        }
        for (sok sokVar : this.f33772a.a()) {
            try {
                sokVar.a(fluidContext, str, str2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(null, sokVar, "", e);
            }
        }
    }
}
