package com.taobao.themis.canvas.launch_step;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.themis.graphics.TMSGraphicsLibraryInit;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.n;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/canvas/launch_step/TMSCanvasInitStep;", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "getName", "", "onAfterExecute", "", "onBeforeExecute", "onExecuting", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.canvas.launch_step.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class RunnableC0928a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;

        public RunnableC0928a(long j, boolean z) {
            this.b = j;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.weex.c a2 = com.taobao.android.weex.e.a();
            com.taobao.themis.kernel.f mInstance = a.this.f22538a;
            q.b(mInstance, "mInstance");
            Activity o = mInstance.o();
            q.b(o, "mInstance.activity");
            a2.a(o.getApplication());
            if (TMSGraphicsLibraryInit.b()) {
                a.b(a.this);
            } else {
                a.a(a.this, com.taobao.themis.kernel.e.c);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            com.taobao.themis.kernel.f mInstance2 = a.this.f22538a;
            q.b(mInstance2, "mInstance");
            mInstance2.k().a("remoteGfxLoadTime", String.valueOf(currentTimeMillis));
            com.taobao.themis.kernel.f mInstance3 = a.this.f22538a;
            q.b(mInstance3, "mInstance");
            mInstance3.k().a("remoteGfxFromNetwork", String.valueOf(this.c));
        }
    }

    static {
        kge.a(-1436894154);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TMSCanvasInitStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    public static final /* synthetic */ void a(a aVar, com.taobao.themis.kernel.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919ce454", new Object[]{aVar, eVar});
        } else {
            aVar.a(eVar);
        }
    }

    public static final /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f47e26f", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.taobao.themis.kernel.f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (n.R()) {
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            Executor executor = iExecutorService != null ? iExecutorService.getExecutor(ExecutorType.URGENT) : null;
            if (executor == null) {
                a(com.taobao.themis.kernel.e.c);
            } else {
                executor.execute(new RunnableC0928a(System.currentTimeMillis(), TMSGraphicsLibraryInit.e()));
            }
        } else {
            c();
        }
    }
}
