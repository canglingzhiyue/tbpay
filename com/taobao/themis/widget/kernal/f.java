package com.taobao.themis.widget.kernal;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.o;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.hui;
import tb.jty;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/widget/kernal/WidgetEngineStep;", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "getName", "", "onAfterExecute", "", "onBeforeExecute", "onExecuting", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1935895563);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "WidgetEngineStep";
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.taobao.themis.kernel.f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        com.taobao.android.weex.c a2;
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        if (!q.a((Object) k.D(mInstance), (Object) "3.0-vue")) {
            a(new com.taobao.themis.kernel.e("TMS_ERR_INVALID_RUNTIME_TYPE", "not supported widget version", ""));
            return;
        }
        try {
            a2 = com.taobao.android.weex.e.a();
            IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
            applicationContext = iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null;
        } catch (Throwable th) {
            TMSLogger.a("WidgetEngineStep", th);
        }
        if (applicationContext == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        a2.a(applicationContext);
        com.taobao.themis.kernel.f mInstance2 = this.f22538a;
        q.b(mInstance2, "mInstance");
        if (o.j(mInstance2) && !MUSEngine.hasJSBindingPlugin("mnn")) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            TMSLogger.d("TRWidget", "need download remote mnn plugin!");
            hui.a(new a(countDownLatch));
            try {
                countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                TMSLogger.a("TRWidget", th2);
                countDownLatch.countDown();
            }
            if (!MUSEngine.hasJSBindingPlugin("mnn")) {
                a(new com.taobao.themis.kernel.e("MNN_INIT_FAIL", "mnn plugin init fail", ""));
                TMSLogger.d("TRWidget", "remote mnn plugin load timeout!");
                return;
            }
        }
        com.taobao.themis.kernel.f mInstance3 = this.f22538a;
        q.b(mInstance3, "mInstance");
        if (o.j(mInstance3) && !MUSEngine.hasJSBindingPlugin("wasm_binding")) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            TMSLogger.d("TRWidget", "need download remote wasm plugin!");
            jty.a(new b(countDownLatch2));
            try {
                countDownLatch2.await(3000L, TimeUnit.MILLISECONDS);
            } catch (Throwable th3) {
                TMSLogger.a("TRWidget", th3);
                countDownLatch2.countDown();
            }
            if (!MUSEngine.hasJSBindingPlugin("wasm_binding")) {
                a(new com.taobao.themis.kernel.e("WASM_INIT_FAIL", "wasm plugin init fail", ""));
                TMSLogger.d("TRWidget", "remote wasm plugin load timeout!");
                return;
            }
        }
        c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/widget/kernal/WidgetEngineStep$onExecuting$1", "Lcom/taobao/android/mnn/miniapp/RemoteSoLoader$MiniMNNLoadCallback;", "fail", "", "success", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements hui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f22942a;

        public a(CountDownLatch countDownLatch) {
            this.f22942a = countDownLatch;
        }

        @Override // tb.hui.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TMSLogger.d("TRWidget", "remote mnn plugin load success!");
            this.f22942a.countDown();
        }

        @Override // tb.hui.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TMSLogger.d("TRWidget", "remote mnn plugin load failed!");
            this.f22942a.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/widget/kernal/WidgetEngineStep$onExecuting$2", "Lcom/taobao/android/wasmruntime/WasmRuntimeLoader$Callback;", "onFail", "", "onSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements jty.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f22943a;

        public b(CountDownLatch countDownLatch) {
            this.f22943a = countDownLatch;
        }

        @Override // tb.jty.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TMSLogger.d("TRWidget", "remote wasm plugin load success!");
            this.f22943a.countDown();
        }

        @Override // tb.jty.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TMSLogger.d("TRWidget", "remote wasm plugin load failed!");
            this.f22943a.countDown();
        }
    }
}
