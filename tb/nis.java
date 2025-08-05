package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.j;
import com.taobao.phenix.loader.network.c;
import com.taobao.phenix.request.b;
import com.taobao.rxm.schedule.k;

/* loaded from: classes7.dex */
public class nis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nna<nje, b> f31491a;
    private k b;
    private final nif c;

    static {
        kge.a(-847393490);
        kge.a(-1328282791);
    }

    public nis(nif nifVar) {
        com.taobao.tcommon.core.b.a(nifVar, "ChainBuilders cannot be NULL when DrawableChainProducerSupplier constructed");
        this.c = nifVar;
    }

    public k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("b23c38cb", new Object[]{this}) : this.b;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.f31491a == null) {
            this.b = this.c.e().a();
            this.f31491a = nmp.a(new nnc(nje.class), this.c.g()).a(new j(this.c.b().a()).a(this.b.a()).b(this.b.a())).a(new c(this.c.c().a()).a(this.b.b()).b(this.b.b())).a();
        }
    }

    public synchronized nna<nje, b> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nna) ipChange.ipc$dispatch("1e6b995b", new Object[]{this});
        }
        return this.f31491a;
    }
}
