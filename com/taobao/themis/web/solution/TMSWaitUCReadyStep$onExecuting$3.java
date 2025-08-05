package com.taobao.themis.web.solution;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes9.dex */
public final class TMSWaitUCReadyStep$onExecuting$3 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Runnable $task;
    public final /* synthetic */ AtomicBoolean $taskHasRun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWaitUCReadyStep$onExecuting$3(AtomicBoolean atomicBoolean, Runnable runnable) {
        super(0);
        this.$taskHasRun = atomicBoolean;
        this.$task = runnable;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (!this.$taskHasRun.get()) {
            com.taobao.themis.kernel.utils.a.b(this.$task);
            TMSLogger.d("TMSWaitUCReadyStep", "wait UC timeout, create page directly");
        }
        this.$task.run();
    }
}
