package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tao.reactivex.k;
import tb.jdz;
import tb.jeq;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public class e extends k.c implements jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f25159a;
    private final ScheduledExecutorService b;

    static {
        kge.a(1964949471);
        kge.a(1964944663);
    }

    public e(ThreadFactory threadFactory) {
        this.b = j.a(threadFactory);
    }

    public i a(Runnable runnable, long j, TimeUnit timeUnit, jeq jeqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("2c44a422", new Object[]{this, runnable, new Long(j), timeUnit, jeqVar});
        }
        i iVar = new i(runnable, jeqVar);
        if (jeqVar != null && !jeqVar.a(iVar)) {
            return iVar;
        }
        try {
            iVar.a(j <= 0 ? this.b.submit((Callable) iVar) : this.b.schedule((Callable) iVar, j, timeUnit));
        } catch (RejectedExecutionException e) {
            if (jeqVar != null) {
                jeqVar.b(iVar);
            }
            mux.a(e);
        }
        return iVar;
    }

    @Override // tao.reactivex.k.c
    public jdz a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("c44f0a60", new Object[]{this, runnable}) : a(runnable, 0L, null);
    }

    public jdz a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdz) ipChange.ipc$dispatch("5ec52e34", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (j2 <= 0) {
            c cVar = new c(runnable, this.b);
            try {
                cVar.a(j <= 0 ? this.b.submit(cVar) : this.b.schedule(cVar, j, timeUnit));
                return cVar;
            } catch (RejectedExecutionException e) {
                mux.a(e);
                return tao.reactivex.d.a.b.INSTANCE;
            }
        }
        g gVar = new g(runnable);
        try {
            gVar.a(this.b.scheduleAtFixedRate(gVar, j, j2, timeUnit));
            return gVar;
        } catch (RejectedExecutionException e2) {
            mux.a(e2);
            return tao.reactivex.d.a.b.INSTANCE;
        }
    }

    @Override // tao.reactivex.k.c
    public jdz a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("50795aec", new Object[]{this, runnable, new Long(j), timeUnit}) : this.f25159a ? tao.reactivex.d.a.b.INSTANCE : a(runnable, j, timeUnit, (jeq) null);
    }

    public jdz b(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdz) ipChange.ipc$dispatch("ceda5ecb", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        h hVar = new h(runnable);
        try {
            hVar.a(j <= 0 ? this.b.submit(hVar) : this.b.schedule(hVar, j, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e) {
            mux.a(e);
            return tao.reactivex.d.a.b.INSTANCE;
        }
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f25159a;
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else if (this.f25159a) {
        } else {
            this.f25159a = true;
            this.b.shutdownNow();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f25159a) {
        } else {
            this.f25159a = true;
            this.b.shutdown();
        }
    }
}
