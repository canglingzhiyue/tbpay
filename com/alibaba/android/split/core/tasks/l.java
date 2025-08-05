package com.alibaba.android.split.core.tasks;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes2.dex */
public final class l {
    public static final Executor MAIN_THREAD;

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f2485a;

    static {
        kge.a(-436618240);
        MAIN_THREAD = new a();
        f2485a = new com.alibaba.android.split.core.tasks.a();
    }

    /* loaded from: classes2.dex */
    public static final class a implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Handler f2486a = new Handler(Looper.getMainLooper());

        static {
            kge.a(967498330);
            kge.a(2095468555);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                this.f2486a.post(runnable);
            }
        }
    }
}
