package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.d;
import com.taobao.phenix.cache.disk.f;
import com.taobao.phenix.cache.memory.MemoryCacheProducer;
import com.taobao.phenix.cache.memory.e;
import com.taobao.phenix.decode.a;
import com.taobao.phenix.loader.file.c;
import com.taobao.phenix.request.b;
import com.taobao.rxm.schedule.k;

/* loaded from: classes.dex */
public class nip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nna<e, b> f31487a;
    private nna<e, b> b;
    private k c;
    private final nif d;
    private boolean e = false;
    private boolean f = true;

    static {
        kge.a(-430984770);
        kge.a(-1328282791);
    }

    public nip(nif nifVar) {
        com.taobao.tcommon.core.b.a(nifVar, "ChainBuilders cannot be NULL when DrawableChainProducerSupplier constructed");
        this.d = nifVar;
    }

    public k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("b23c38cb", new Object[]{this}) : this.c;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.c = this.d.e().a(this.e).b(this.f).a();
            boolean g = this.d.g();
            if (this.e) {
                this.b = nmp.a(new MemoryCacheProducer(this.d.a().b()), g).a(new nnc(njb.class)).a(new f(this.d.b().a(), this.d.f().a())).a(new nhz()).a((nmy) new a().b(this.c.c())).a((nmy) new c(this.d.d().a()).a(this.c.d())).a(new d(this.d.b().a(), this.d.f().a())).a(new com.taobao.phenix.loader.network.c(this.d.c().a())).a();
            } else {
                this.b = nmp.a(new MemoryCacheProducer(this.d.a().b()), g).a(new nnc(njb.class)).a((nmy) new f(this.d.b().a(), this.d.f().a()).b(this.c.a())).a((nmy) new nhz().b(this.c.d())).a((nmy) new a().b(this.c.c())).a((nmy) new c(this.d.d().a()).a(this.c.a())).a(new d(this.d.b().a(), this.d.f().a())).a(new com.taobao.phenix.loader.network.c(this.d.c().a()).a(this.c.b()).b(this.c.b())).a();
            }
            this.f31487a = null;
        }
    }

    public synchronized nna<e, b> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nna) ipChange.ipc$dispatch("1e6b995b", new Object[]{this});
        } else if (this.b != null) {
            return this.b;
        } else {
            if (this.f31487a == null) {
                this.c = new nin(null, 0, 6, 8, 5, 1500, 3, 5, 2, -1, this.e);
                if (this.e) {
                    this.f31487a = nmp.a(new MemoryCacheProducer(new com.taobao.phenix.cache.memory.d()), this.d.g()).a(new nnc(njb.class)).a((nmy) new a().b(this.c.c())).a((nmy) new c(new com.taobao.phenix.loader.file.a()).a(this.c.d())).a(new com.taobao.phenix.loader.network.c(new com.taobao.phenix.loader.network.a())).a();
                } else {
                    this.f31487a = nmp.a(new MemoryCacheProducer(new com.taobao.phenix.cache.memory.d()), this.d.g()).a(new nnc(njb.class)).a((nmy) new a().b(this.c.c())).a((nmy) new c(new com.taobao.phenix.loader.file.a()).a(this.c.a())).a(new com.taobao.phenix.loader.network.c(new com.taobao.phenix.loader.network.a()).a(this.c.b()).b(this.c.b())).a();
                }
            }
            niw.c("NormalChain", "use temporary chain producer before Phenix.instance().build() calling", new Object[0]);
            return this.f31487a;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}
