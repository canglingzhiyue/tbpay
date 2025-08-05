package com.taobao.android.launcher.biz.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gvj;

/* loaded from: classes5.dex */
public abstract class e extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 66977321) {
            return super.R_();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
    @Override // com.taobao.android.launcher.biz.task.j, com.taobao.android.job.core.task.e
    public /* synthetic */ Void execute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5c5e0536", new Object[]{this}) : R_();
    }

    public e(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public Void R_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("3fdfe29", new Object[]{this});
        }
        gvj.a("defer", getId());
        Void R_ = super.R_();
        gvj.b("defer", getId());
        return R_;
    }
}
