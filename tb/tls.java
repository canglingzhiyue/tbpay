package tb;

import android.app.Activity;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.d;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge;
import com.taobao.themis.mix.h5_render.TMSTinyH5EventBridge;
import com.taobao.themis.mix.weex_render.TMSWeexAPIBridge;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.utils.h;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/pub/task/TMSPubConfigStep;", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "getName", "", "onAfterExecute", "", "onBeforeExecute", "onExecuting", "registerTinyAppPlugin", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tls extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IAccountAdapter iAccountAdapter = (IAccountAdapter) qpt.b(IAccountAdapter.class);
            if (iAccountAdapter != null && iAccountAdapter.isLogin()) {
                f mInstance = tls.this.f22538a;
                q.b(mInstance, "mInstance");
                com.taobao.themis.pub_kit.foot.a.a(mInstance.h());
            }
            qre qreVar = (qre) tls.this.f22538a.a(qre.class);
            if (qreVar == null) {
                return;
            }
            q.b(qreVar, "mInstance.getData(PubHom….java) ?: return@Runnable");
            qreVar.a();
            boolean f = h.INSTANCE.f(qreVar.b());
            qrd qrdVar = (qrd) tls.this.f22538a.a(qrd.class);
            if (qrdVar == null) {
                return;
            }
            q.b(qrdVar, "mInstance.getData(PubCon….java) ?: return@Runnable");
            qrdVar.a(true, f);
        }
    }

    static {
        kge.a(558074003);
    }

    public static /* synthetic */ Object ipc$super(tls tlsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TMSPubConfigStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tls(f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        if (!o.f(mInstance)) {
            c();
            return;
        }
        d dVar = d.INSTANCE;
        f fVar = this.f22538a;
        f mInstance2 = this.f22538a;
        q.b(mInstance2, "mInstance");
        String h = mInstance2.h();
        q.b(h, "mInstance.appId");
        f mInstance3 = this.f22538a;
        q.b(mInstance3, "mInstance");
        Activity o = mInstance3.o();
        q.b(o, "mInstance.activity");
        String mLogTraceId = this.c;
        q.b(mLogTraceId, "mLogTraceId");
        fVar.a((Class<Class>) qre.class, (Class) new qre(h, o, mLogTraceId));
        d dVar2 = d.INSTANCE;
        f fVar2 = this.f22538a;
        f mInstance4 = this.f22538a;
        q.b(mInstance4, "mInstance");
        String h2 = mInstance4.h();
        q.b(h2, "mInstance.appId");
        f mInstance5 = this.f22538a;
        q.b(mInstance5, "mInstance");
        String sourceChannel = mInstance5.q().getSourceChannel();
        String mLogTraceId2 = this.c;
        q.b(mLogTraceId2, "mLogTraceId");
        fVar2.a((Class<Class>) qrd.class, (Class) new qrd(h2, sourceChannel, mLogTraceId2));
        d dVar3 = d.INSTANCE;
        this.f22538a.a((Class<Class>) PubContainerContext.class, (Class) new PubContainerContext());
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new a());
        }
        c();
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            f();
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        android.taobao.windvane.jsbridge.q.a("Triver", (Class<? extends e>) TMSTinyH5APIBridge.class);
        android.taobao.windvane.jsbridge.q.a("TriverEvent", (Class<? extends e>) TMSTinyH5EventBridge.class);
        MUSEngine.registerModule("openApi", TMSWeexAPIBridge.class);
        try {
            Class<?> cls = Class.forName("com.taobao.accs.windvane.TBACCS");
            if (cls != null) {
                android.taobao.windvane.jsbridge.q.a("WVACCS", (Class<? extends e>) cls, true);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.taobao.windvane.jsbridge.WVApiPlugin?>");
        } catch (ClassNotFoundException e) {
            TMSLogger.d("TMSUniAppPageRenderFactory", "Register WVACCS Module Faild: " + e.getMessage());
        }
    }
}
