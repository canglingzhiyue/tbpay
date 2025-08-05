package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import tb.skv;

/* loaded from: classes5.dex */
public class sko implements jul, skp, sks, skt, skv.a, skv.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33659a;
    private final f<skv.a> f = new f<>();
    private final f<skt> b = new f<>();
    private final f<skp> c = new f<>();
    private final f<jul> e = new f<>();
    private boolean d = false;

    static {
        kge.a(-261441904);
        kge.a(-1877040053);
        kge.a(-89214167);
        kge.a(-556274636);
        kge.a(-1608905997);
        kge.a(2120165008);
        kge.a(-427258723);
    }

    @Override // tb.skv.b
    public void onResult(d<Pair<a, MediaMixContentDetail>> dVar, d<Pair<a, MediaMixContentDetail>> dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e8df43", new Object[]{this, dVar, dVar2});
        }
    }

    @Override // tb.skv.b
    public void onStartRequest(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a52f90", new Object[]{this, new Integer(i)});
        }
    }

    public sko(FluidContext fluidContext) {
        this.f33659a = fluidContext;
    }

    public void addDataChangeListener(skp skpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4064aae", new Object[]{this, skpVar});
        } else if (skpVar == null) {
        } else {
            this.c.a(skpVar);
        }
    }

    @Override // tb.sks
    public void addDetailRequestListener(skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad4efed", new Object[]{this, aVar});
            return;
        }
        spz.a("DataListenerManager", "addDetailRequestListener ");
        if (aVar == null) {
            return;
        }
        this.f.a(aVar);
    }

    @Override // tb.jul
    public void onServerConfigChanged(skl sklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5711093", new Object[]{this, sklVar});
            return;
        }
        for (jul julVar : this.e.a()) {
            try {
                julVar.onServerConfigChanged(sklVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33659a, julVar, "onServerConfigChanged", e);
            }
        }
    }

    @Override // tb.sks
    public void addDetailRequestSuccessListener(skt sktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f47c95", new Object[]{this, sktVar});
        } else if (sktVar == null) {
        } else {
            this.b.a(sktVar);
        }
    }

    @Override // tb.sks
    public void addServerConfigChangeListener(jul julVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7a62a0", new Object[]{this, julVar});
        } else if (julVar == null) {
        } else {
            this.e.a(julVar);
        }
    }

    public void a(jul julVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01976b7", new Object[]{this, julVar});
        } else if (julVar == null) {
        } else {
            this.e.c(julVar);
        }
    }

    @Override // tb.sks
    public boolean isDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ba4767a", new Object[]{this})).booleanValue() : this.d;
    }

    public void removeDataChangeListener(skp skpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc511b51", new Object[]{this, skpVar});
        } else if (skpVar == null) {
        } else {
            this.c.c(skpVar);
        }
    }

    public void removeDetailRequestSuccessListener(skt sktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac991d78", new Object[]{this, sktVar});
        } else if (sktVar == null) {
        } else {
            this.b.c(sktVar);
        }
    }

    public void notifyContentDetailCallback(skv.a aVar, d<Pair<a, MediaMixContentDetail>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae2eb39", new Object[]{this, aVar, dVar});
            return;
        }
        spz.c("DataListenerManager", "notifyContentDetailCallback");
        if (aVar != null) {
            aVar.onResult(dVar);
        }
        skl j = ((IDataService) this.f33659a.getService(IDataService.class)).getConfig().j();
        boolean equalsIgnoreCase = "video".equalsIgnoreCase(this.f33659a.getInstanceConfig().getTab3CardType());
        if (j == null || !equalsIgnoreCase) {
            return;
        }
        ohh.b("tab2FrameworkRefactor", Boolean.valueOf(j.al));
    }

    @Override // tb.skp
    public void onDataChanged(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f85ba", new Object[]{this, aVar});
            return;
        }
        for (skp skpVar : this.c.a()) {
            try {
                skpVar.onDataChanged(aVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33659a, skpVar, "onDataChanged", e);
            }
        }
    }

    @Override // tb.skt
    public void onDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cae82b", new Object[]{this});
            return;
        }
        this.d = true;
        for (skt sktVar : this.b.a()) {
            try {
                sktVar.onDetailRequestSuccess();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33659a, sktVar, "onDetailRequestSuccess", e);
            }
        }
    }

    @Override // tb.skv.a
    public void onResult(d<Pair<a, MediaMixContentDetail>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1227a278", new Object[]{this, dVar});
            return;
        }
        spz.c("DataListenerManager", "onResult ");
        for (skv.a aVar : this.f.a()) {
            try {
                aVar.onResult(dVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33659a, aVar, "onStartRequest", e);
            }
        }
    }

    @Override // tb.skv.a
    public void onStartRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
            return;
        }
        spz.c("DataListenerManager", "onStartRequest ");
        for (skv.a aVar : this.f.a()) {
            try {
                aVar.onStartRequest();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33659a, aVar, "onStartRequest", e);
            }
        }
    }
}
