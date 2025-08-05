package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes2.dex */
public final class a implements Executor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(716508910);
        kge.a(2095468555);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            runnable.run();
        }
    }
}
