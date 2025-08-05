package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.core.tasks.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class AbstractTask<TResult> implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean silence;
    private m<TResult> taskResultSender;

    static {
        kge.a(842718303);
        kge.a(-1390502639);
    }

    public abstract void execute();

    public AbstractTask() {
        this.taskResultSender = null;
    }

    public AbstractTask(m<TResult> mVar) {
        this.taskResultSender = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            execute();
        } catch (Exception e) {
            m<TResult> mVar = this.taskResultSender;
            if (mVar == null) {
                return;
            }
            mVar.a(e);
        }
    }

    public final m getTaskWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("fd07b434", new Object[]{this}) : this.taskResultSender;
    }
}
