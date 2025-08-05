package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.utils.c;

/* loaded from: classes.dex */
public class maz implements koa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1711545360);
        kge.a(1325357161);
    }

    @Override // tb.koa
    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9b6d99", new Object[]{this, aVar})).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(aVar.K, "taobao", "tbspeed", "link_async_router_opt");
            c.a("linkx", "RouterStrategyImp === shouldUseAsyncRouterStrategy ===  " + a2);
            return a2;
        } catch (Throwable unused) {
            c.b("linkx", "RouterStrategyImp === shouldUseAsyncRouterStrategy === error");
            return true;
        }
    }

    @Override // tb.koa
    public boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43742d5a", new Object[]{this, aVar})).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(aVar.K, "taobao", "tbspeed", "afc_new_link_info_opt");
            c.a("linkx", "RouterStrategyImp === shouldUseNewLinkInfoMTOP ===  " + a2);
            return a2;
        } catch (Throwable unused) {
            c.b("linkx", "RouterStrategyImp === shouldUseNewLinkInfoMTOP === error");
            return false;
        }
    }

    @Override // tb.koa
    public boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa4ced1b", new Object[]{this, aVar})).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(aVar.K, "taobao", "tbspeed", "link_opt_open_julang");
            c.a("linkx", "RouterStrategyImp === shouldUseSSROpt ===  " + a2);
            return a2;
        } catch (Throwable unused) {
            c.b("linkx", "RouterStrategyImp === shouldUseSSROpt === error");
            return false;
        }
    }

    @Override // tb.koa
    public boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1125acdc", new Object[]{this, aVar})).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(aVar.K, "taobao", "tbspeed", "avoidreq");
            c.a("linkx", "RouterStrategyImp === shouldRouterLocal ===  " + a2);
            return a2;
        } catch (Throwable unused) {
            c.b("linkx", "RouterStrategyImp === shouldUseSSROpt === error");
            return false;
        }
    }

    @Override // tb.koa
    public boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77fe6c9d", new Object[]{this, aVar})).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(aVar.K, "taobao", "tbspeed", "link_route_local");
            c.a("linkx", "RouterStrategyImp === shouldNewRouterLocal ===  " + a2);
            return a2;
        } catch (Throwable unused) {
            c.b("linkx", "RouterStrategyImp === shouldNewRouterLocal === error");
            return false;
        }
    }
}
