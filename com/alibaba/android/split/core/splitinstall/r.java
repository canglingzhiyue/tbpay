package com.alibaba.android.split.core.splitinstall;

import android.os.RemoteException;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.core.internal.AbstractTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import tb.kge;

/* loaded from: classes.dex */
public final class r extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Collection f2477a;
    private final Collection b;
    private final com.alibaba.android.split.core.tasks.m c;
    private final k d;

    static {
        kge.a(779982482);
    }

    public r(k kVar, com.alibaba.android.split.core.tasks.m mVar, Collection collection, Collection collection2, com.alibaba.android.split.core.tasks.m mVar2) {
        this(kVar, mVar, collection, collection2, mVar2, false);
    }

    public r(k kVar, com.alibaba.android.split.core.tasks.m mVar, Collection collection, Collection collection2, com.alibaba.android.split.core.tasks.m mVar2, boolean z) {
        super(mVar);
        this.d = kVar;
        this.f2477a = collection;
        this.b = collection2;
        this.c = mVar2;
        this.silence = z;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            ((ISplitInstallService) this.d.f2474a.getIInterface()).startInstall(k.a(this.d), k.a(this.f2477a), k.a(this.silence), new SplitInstallStartInstallCallback(this.d, this.c));
        } catch (RemoteException e) {
            k.b().a(e, "startInstall(%s,%s)", this.f2477a, this.b);
            this.c.a((Exception) new RuntimeException(e));
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StartInstallTask{requestMoudles=" + this.f2477a + '}';
    }
}
