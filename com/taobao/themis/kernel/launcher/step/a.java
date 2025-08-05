package com.taobao.themis.kernel.launcher.step;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.qpt;

/* loaded from: classes9.dex */
public abstract class a extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<AbstractC0945a> d;
    private boolean e;
    private final f j;
    private final qpp k;

    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbstractC0945a f22540a;

        public b(AbstractC0945a abstractC0945a) {
            this.f22540a = abstractC0945a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f22540a.b();
            }
        }
    }

    static {
        kge.a(-206791028);
    }

    public abstract void b(AbstractC0945a abstractC0945a);

    public final f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("fbc4a98e", new Object[]{this}) : this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
        this.j = instance;
        this.k = listener;
        this.d = new ArrayList();
    }

    public final void a(AbstractC0945a step) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7220969", new Object[]{this, step});
            return;
        }
        q.d(step, "step");
        this.d.remove(step);
        b(step);
        if (!this.d.isEmpty() || this.h != null) {
            return;
        }
        c();
    }

    public final void c(AbstractC0945a step) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6353d6b", new Object[]{this, step});
            return;
        }
        q.d(step, "step");
        if (this.e) {
            TMSLogger.d("ConcurrentStepGroup", "cannot add steps after executing");
            return;
        }
        TMSLogger.d("ConcurrentStepGroup", "add step : " + step.a());
        this.d.add(step);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = true;
        if (this.d.isEmpty()) {
            c();
            return;
        }
        for (AbstractC0945a abstractC0945a : p.g((Iterable) this.d)) {
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) != null) {
                executor.execute(new b(abstractC0945a));
            }
        }
    }

    /* renamed from: com.taobao.themis.kernel.launcher.step.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static abstract class AbstractC0945a extends TMSBaseLaunchStep {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final a d;

        static {
            kge.a(-1100324261);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0945a(f instance, qpr launcher, qpp listener, a group) {
            super(instance, launcher, listener);
            q.d(instance, "instance");
            q.d(launcher, "launcher");
            q.d(listener, "listener");
            q.d(group, "group");
            this.d = group;
            this.f = this.d.c;
            String mParentTraceId = this.f;
            q.b(mParentTraceId, "mParentTraceId");
            this.c = com.taobao.themis.kernel.logger.a.a(mParentTraceId);
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.d.a(this);
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0cb15ce", new Object[]{this, eVar});
                return;
            }
            this.d.a(eVar);
            this.d.a(this);
        }
    }
}
