package com.alibaba.android.split.core.splitinstall;

import android.os.RemoteException;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.core.internal.AbstractTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public final class a extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f2461a;
    private com.alibaba.android.split.core.tasks.m b;
    private k c;

    static {
        kge.a(-851147443);
    }

    public a(k kVar, com.alibaba.android.split.core.tasks.m mVar, List<String> list, com.alibaba.android.split.core.tasks.m mVar2) {
        super(mVar);
        this.c = kVar;
        this.f2461a = list;
        this.b = mVar2;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            ((ISplitInstallService) this.c.f2474a.getIInterface()).deferredInstall(k.a(this.c), k.a((Collection<String>) this.f2461a), k.a(this.silence), new SplitInstallDeferredInstallCallback(this.c, this.b));
        } catch (RemoteException e) {
            k.b().a(e, "deferredInstall(%s)", this.f2461a);
            this.b.a((Exception) new RuntimeException(e));
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DeferredInstallTask{moduleNames=" + this.f2461a + '}';
    }
}
