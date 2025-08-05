package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class dtl extends asf implements arp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USERDATA_KEY_STATUS_MANAGER = "userdata.status.manager";

    /* renamed from: a  reason: collision with root package name */
    private static final Object f26965a;
    private AURANextRPCEndpoint b;
    private Boolean c;

    public static /* synthetic */ Object ipc$super(dtl dtlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 366218828) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b((AURANextRPCEndpoint) objArr[0]);
            return null;
        }
    }

    @Override // tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
        }
    }

    public abstract void i();

    public abstract void j();

    public static /* synthetic */ void a(dtl dtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ce4b7c", new Object[]{dtlVar});
        } else {
            dtlVar.m();
        }
    }

    static {
        kge.a(2021050130);
        kge.a(-1795775593);
        f26965a = new Object();
    }

    @Override // tb.asf, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            this.c = (Boolean) c().a("enableAsyncThread", Boolean.class, false);
        }
        Boolean bool = this.c;
        return bool != null && bool.booleanValue();
    }

    @Override // tb.asf, tb.asg
    public void b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d40e4c", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        super.b(aURANextRPCEndpoint);
        this.b = aURANextRPCEndpoint;
        i();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        AURANextRPCEndpoint aURANextRPCEndpoint = this.b;
        if (aURANextRPCEndpoint != null) {
            return "mtop.trade.order.build".equals(aURANextRPCEndpoint.getApi());
        }
        return false;
    }

    @Override // tb.arp
    public void afterServiceExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
        } else if ((!p() || !com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE.equals(aVar.c())) && !asw.RENDER_SERVICE_CODE.equals(aVar.c())) {
        } else {
            l();
        }
    }

    @Override // tb.arp
    public void afterFlowExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
        } else {
            l();
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) c().a("aliBuyPreload", AtomicBoolean.class);
        return atomicBoolean != null && atomicBoolean.get();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            bbh.a(new Runnable() { // from class: tb.dtl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    dtl.this.j();
                    dtl.a(dtl.this);
                }
            }, 0L);
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        AURAGlobalData e = e();
        if (e == null) {
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        e.update("globalDataAliBuyLoadingTask", runnable);
        e.update("globalDataAliBuyLoadingHandle", handler);
        handler.postDelayed(runnable, 3000L);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        AURAGlobalData e = e();
        if (e == null) {
            return;
        }
        Runnable runnable = (Runnable) e.get("globalDataAliBuyLoadingTask", Runnable.class);
        Handler handler = (Handler) e.get("globalDataAliBuyLoadingHandle", Handler.class);
        if (runnable == null || handler == null) {
            return;
        }
        arc.a().b("removeTask");
        handler.removeCallbacks(runnable);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        synchronized (f26965a) {
            AURAFlowData f = f();
            if (f == null) {
                return false;
            }
            return "true".equals((String) f.get("flowDataAliBuyLoadingFinish", String.class));
        }
    }

    private synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        synchronized (f26965a) {
            AURAFlowData f = f();
            if (f != null) {
                f.update("flowDataAliBuyLoadingFinish", "true");
            }
        }
    }

    public com.taobao.android.buy.internal.status.f k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.buy.internal.status.f) ipChange.ipc$dispatch("15eef154", new Object[]{this}) : (com.taobao.android.buy.internal.status.f) c().a(USERDATA_KEY_STATUS_MANAGER, com.taobao.android.buy.internal.status.f.class);
    }
}
