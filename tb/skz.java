package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.remote.a;
import java.util.concurrent.Future;
import tb.skv;
import tb.sla;

/* loaded from: classes5.dex */
public class skz implements sla.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33675a;
    private final skv b;
    private final int c;
    private final a.C0494a d;
    private final skv.a e;

    static {
        kge.a(-2106273550);
        kge.a(510043781);
    }

    public skz(FluidContext fluidContext, skv skvVar, int i, a.C0494a c0494a, skv.a aVar) {
        this.f33675a = fluidContext;
        this.b = skvVar;
        this.c = i;
        this.d = c0494a;
        this.e = aVar;
    }

    @Override // tb.sla.a
    public skv.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skv.a) ipChange.ipc$dispatch("76965163", new Object[]{this}) : this.e;
    }

    @Override // tb.sla.a
    public a.C0494a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.C0494a) ipChange.ipc$dispatch("9e8d444b", new Object[]{this}) : this.d;
    }

    @Override // tb.sla.a
    public Future a(a.C0494a c0494a, skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b16e5df1", new Object[]{this, c0494a, aVar});
        }
        if (this.c >= this.b.b().a()) {
            FluidException.throwException(this.f33675a, IDataService.DATA_ERROR_INTERCEPTOR_CHAIN_OUT_OF_INDEX);
        }
        return this.b.b().a(this.c).a(new skz(this.f33675a, this.b, this.c + 1, c0494a, aVar));
    }
}
