package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.core.tasks.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class TriggerStartSuccessTask<TResult> extends AbstractTask<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TResult result;

    static {
        kge.a(-1082246746);
    }

    public TriggerStartSuccessTask(m<TResult> mVar, TResult tresult) {
        super(mVar);
        this.result = tresult;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            getTaskWrapper().a((m) this.result);
        }
    }
}
