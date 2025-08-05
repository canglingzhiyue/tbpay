package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.core.tasks.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class TaskProxy extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AbstractTask mAbstractTask;
    private ServiceManager mServiceManager;

    static {
        kge.a(-1309240495);
    }

    public TaskProxy(ServiceManager serviceManager, m mVar, AbstractTask abstractTask) {
        super(mVar);
        this.mServiceManager = serviceManager;
        this.mAbstractTask = abstractTask;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            ServiceManager.execute(this.mServiceManager, this.mAbstractTask);
        }
    }
}
