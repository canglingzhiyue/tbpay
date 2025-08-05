package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.List;
import tb.shm;

/* loaded from: classes5.dex */
public class shl implements shn, sho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33583a;
    private final f<shm> b = new f<>();

    static {
        kge.a(-1676126506);
        kge.a(-1325548774);
        kge.a(693841943);
    }

    public shl(FluidContext fluidContext) {
        this.f33583a = fluidContext;
    }

    public void a(shm shmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febe5720", new Object[]{this, shmVar});
        } else if (shmVar == null) {
        } else {
            this.b.a(shmVar);
        }
    }

    public void b(shm shmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed415da1", new Object[]{this, shmVar});
        } else if (shmVar == null) {
        } else {
            this.b.c(shmVar);
        }
    }

    @Override // tb.sho
    public void addCardLifecycleListener(shm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cc24cf", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.a(aVar);
        }
    }

    public void removeCardLifecycleListener(shm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e9420c", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.c(aVar);
        }
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onCreateView(pswVar, snpVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onCreateView", e);
            }
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onBindData(pswVar, aVar, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onBindData", e);
            }
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onBindData(pswVar, aVar, i, list);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onBindDataPayloads", e);
            }
        }
    }

    @Override // tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onAppear(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onAppear", e);
            }
        }
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onDisAppear(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onDisAppear", e);
            }
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onWillActive(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onWillActive", e);
            }
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onWillDisActive(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onWillDisActive", e);
            }
        }
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onActive(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onActive", e);
            }
        }
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onDisActive(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onDisActive", e);
            }
        }
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            return;
        }
        for (shm shmVar : this.b.a()) {
            try {
                shmVar.onRecycle(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33583a, shmVar, "onRecycle", e);
            }
        }
    }
}
