package com.taobao.android.job.core.task;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class e<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private T id;
    private boolean runDeffer;
    private boolean considerExecutionError = true;
    private boolean shouldRunImmediately = false;

    public abstract R execute();

    public boolean intercept(c<T, R> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        return true;
    }

    public void runDeffer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda99ef4", new Object[]{this, new Boolean(z)});
        } else {
            this.runDeffer = z;
        }
    }

    public void setId(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c136d200", new Object[]{this, t});
        } else {
            this.id = t;
        }
    }

    public T getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8f1d7b1a", new Object[]{this}) : this.id;
    }

    public void shouldRunImmediately(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2b90e7", new Object[]{this, new Boolean(z)});
        } else {
            this.shouldRunImmediately = z;
        }
    }

    public boolean shouldRunImmediately() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9c79391", new Object[]{this})).booleanValue() : this.shouldRunImmediately;
    }
}
