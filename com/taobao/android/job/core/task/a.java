package com.taobao.android.job.core.task;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class a<T, R> extends e<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private e<T, R> task;

    public a(e<T, R> eVar) {
        this.task = eVar;
    }

    public e<T, R> getTargetTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("bbd502ec", new Object[]{this}) : this.task;
    }

    @Override // com.taobao.android.job.core.task.e
    public void runDeffer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda99ef4", new Object[]{this, new Boolean(z)});
        } else {
            this.task.runDeffer(z);
        }
    }

    @Override // com.taobao.android.job.core.task.e
    public void setId(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c136d200", new Object[]{this, t});
        } else {
            this.task.setId(t);
        }
    }

    @Override // com.taobao.android.job.core.task.e
    public T getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8f1d7b1a", new Object[]{this}) : this.task.getId();
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean shouldRunImmediately() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9c79391", new Object[]{this})).booleanValue() : this.task.shouldRunImmediately();
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(c<T, R> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue() : this.task.intercept(cVar);
    }
}
