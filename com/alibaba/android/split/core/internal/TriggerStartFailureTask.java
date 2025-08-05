package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.core.tasks.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class TriggerStartFailureTask extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Exception exception;

    static {
        kge.a(-2037182547);
    }

    public TriggerStartFailureTask(m mVar, Exception exc) {
        super(mVar);
        this.exception = exc;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            getTaskWrapper().a(this.exception);
        }
    }
}
