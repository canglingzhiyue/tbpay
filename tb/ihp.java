package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.assets.a;
import com.taobao.android.remoteso.index.b;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.index.g;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.f;
import com.taobao.android.remoteso.resolver2.h;
import com.taobao.android.remoteso.resolver2.i;
import com.taobao.android.remoteso.resolver2.m;
import com.taobao.android.remoteso.status.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ihp implements nhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ihr b;
    private volatile ihx c = ihm.f29029a;
    private volatile iia d = ihn.f29030a;

    /* renamed from: a  reason: collision with root package name */
    private volatile a f29031a = nho.INSTANCE;
    private final AtomicReference<ijd> g = new AtomicReference<>(kpp.EMPTY_CONFIG);
    private final com.taobao.android.remoteso.status.a e = new com.taobao.android.remoteso.status.a();
    private final List<ijy> f = new ArrayList();

    public ihp(ihr ihrVar) {
        this.b = ihrVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RSoLog.c("RSoCoreImpl, init, enter");
        Application a2 = this.b.f29033a.a();
        iju ijuVar = this.b.f29033a;
        ije ijeVar = new ije(this.b.b);
        ijeVar.a();
        ijv ijvVar = new ijv(a2, ijuVar);
        b bVar = new b(a2, ijuVar, ijeVar, ijvVar);
        this.f.add(bVar);
        c cVar = new c(a2, ijeVar, ijuVar, bVar);
        cVar.b();
        ijh ijhVar = new ijh(ijuVar, ijvVar);
        this.g.set(ijeVar);
        ihl ihlVar = new ihl(ijeVar, cVar, ijvVar, ijhVar, ijuVar, this.e);
        cVar.a((g) this.b.a(g.class).a(ihlVar));
        ijr a3 = a(ihlVar, this.b);
        this.f.add(new ijg(ijeVar, cVar, a3, this.b.g));
        this.f.add(new ijf(ijuVar, ijeVar, cVar, ijhVar, a3, this.b.f.a(ihlVar), this.b.k.a(ihlVar)));
        iib iibVar = new iib();
        this.f.add(new iic(ijeVar, cVar, ijvVar, ijuVar, a3, iibVar));
        ijl ijlVar = new ijl(new ijj(new ijs(new nvg(new ijq(ijeVar, cVar, a3), ijuVar, cVar), iibVar), ijeVar));
        this.c = new iko(this.b.h.a(ihlVar, new iig(ijeVar, cVar, new nvh(ijlVar, ikn.POINT_PULLER, nvh.FETCH_FROM_BUSI_CALL))));
        this.d = new ikp(this.b.i.a(ihlVar, new ija(new iiz(ijeVar, ijuVar, new nvh(ijlVar, ikn.POINT_PULLER, "load"), e.a(ijeVar)))));
        this.f29031a = new nub(new nhv(cVar, new nvh(new ijj(new ijs(new obn(ijeVar, cVar, a3), iibVar), ijeVar), ikn.POINT_PULLER_ASSETS, "")));
        RSoLog.c("RSoCoreImpl, init, finished");
    }

    private static ijr a(ihl ihlVar, ihr ihrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijr) ipChange.ipc$dispatch("815aa44d", new Object[]{ihlVar, ihrVar});
        }
        ijv ijvVar = ihlVar.d;
        ijd ijdVar = ihlVar.b;
        iju ijuVar = ihrVar.f29033a;
        Application a2 = ihrVar.f29033a.a();
        iik iikVar = ihrVar.c;
        iiq iiqVar = ihrVar.d;
        iit iitVar = ihrVar.e;
        com.taobao.android.remoteso.status.a aVar = ihlVar.g;
        com.taobao.android.remoteso.status.c a3 = e.a(ijdVar);
        iio iioVar = new iio(iikVar, aVar);
        iis iisVar = new iis(a2, ijuVar, iiqVar);
        f fVar = new f(ijuVar, ijvVar);
        com.taobao.android.remoteso.resolver2.b bVar = new com.taobao.android.remoteso.resolver2.b(iisVar, ijvVar);
        com.taobao.android.remoteso.resolver2.e eVar = new com.taobao.android.remoteso.resolver2.e(ijuVar, ijvVar, iitVar, ijdVar);
        i iVar = new i(ijuVar, iioVar, ijvVar, iitVar, ijdVar);
        com.taobao.android.remoteso.resolver2.c[] cVarArr = {fVar, bVar, new RemoteResolver(ijdVar, ijvVar, iioVar, eVar, iVar, new h(ijdVar, iioVar, iisVar, ijvVar)), new com.taobao.android.remoteso.resolver2.g(ijdVar, eVar, iVar)};
        HashMap hashMap = new HashMap(cVarArr.length);
        for (com.taobao.android.remoteso.resolver2.c cVar : cVarArr) {
            hashMap.put(cVar.a(), cVar);
        }
        return new ijr(ijuVar, ijdVar, hashMap, a3, new m(ijvVar, ihrVar.j.a(ihlVar, new com.taobao.android.remoteso.resolver2.a(ijvVar))));
    }

    public static ihp by_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihp) ipChange.ipc$dispatch("3277eb26", new Object[0]) : (ihp) ihq.c();
    }

    public com.taobao.android.remoteso.status.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.remoteso.status.a) ipChange.ipc$dispatch("4b0d773d", new Object[]{this}) : this.e;
    }

    public ijd d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijd) ipChange.ipc$dispatch("261aea38", new Object[]{this}) : this.g.get();
    }

    @Override // tb.nhq
    public iia bz_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iia) ipChange.ipc$dispatch("20faf397", new Object[]{this}) : this.d;
    }

    @Override // tb.nhq
    public ihx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihx) ipChange.ipc$dispatch("16b79a64", new Object[]{this}) : this.c;
    }

    @Override // tb.nhq
    public a bA_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7e4c8ba", new Object[]{this}) : this.f29031a;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        RSoLog.c("RSoCoreImpl, startIdleTask(), enter ");
        for (ijy ijyVar : this.f) {
            try {
                ijyVar.a();
            } catch (Throwable th) {
                ikq.a("startIdleTask", th);
            }
        }
        RSoLog.c("RSoCoreImpl, startIdleTask(), done ");
    }
}
