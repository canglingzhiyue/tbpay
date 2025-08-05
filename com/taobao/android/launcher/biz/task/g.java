package com.taobao.android.launcher.biz.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class g extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f13057a;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -222138312) {
            if (hashCode != 66977321) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.R_();
        }
        return new Boolean(super.intercept((c) objArr[0]));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
    @Override // com.taobao.android.launcher.biz.task.j, com.taobao.android.job.core.task.e
    public /* synthetic */ Void execute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5c5e0536", new Object[]{this}) : R_();
    }

    public g(String str) {
        super(str);
        this.f13057a = new AtomicBoolean(false);
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public Void R_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("3fdfe29", new Object[]{this});
        }
        if (!this.f13057a.compareAndSet(false, true)) {
            return null;
        }
        return super.R_();
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        return intercept ? !this.f13057a.get() : intercept;
    }
}
