package com.taobao.themis.canvas.launch_step;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.utils.o;
import com.taobao.themis.utils.q;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.Metadata;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/canvas/launch_step/TMSHotPatchJSFrameWorkStep;", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "getName", "", "onAfterExecute", "", "onBeforeExecute", "onExecuting", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String a2 = q.a(URLDecoder.decode(this.b, "utf-8"));
                com.taobao.themis.open.extension.e eVar = (com.taobao.themis.open.extension.e) e.this.f22538a.b(com.taobao.themis.open.extension.e.class);
                if (eVar != null) {
                    eVar.d(a2);
                }
            } catch (UnsupportedEncodingException unused) {
            }
            e.a(e.this);
        }
    }

    static {
        kge.a(1593894244);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TMSHotPatchJSFrameWorkStep";
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

    public static final /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a8f16a", new Object[]{eVar});
        } else {
            eVar.c();
        }
    }

    public e(com.taobao.themis.kernel.f fVar, qpr qprVar, qpp qppVar) {
        super(fVar, qprVar, qppVar);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f22538a == null) {
        } else {
            com.taobao.themis.kernel.f mInstance = this.f22538a;
            kotlin.jvm.internal.q.b(mInstance, "mInstance");
            if (mInstance.s()) {
                return;
            }
            if (TMSSwitchUtils.useDevJSFramework()) {
                a2 = "https://unpkg.alibaba-inc.com/@ali/tb-widget-jsapi@1.0.48-beta.2/build/gm.fm.dev.js";
            } else {
                com.taobao.themis.kernel.f mInstance2 = this.f22538a;
                kotlin.jvm.internal.q.b(mInstance2, "mInstance");
                a2 = o.a(mInstance2.g(), "jsfm");
            }
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (!TextUtils.isEmpty(a2) && iExecutorService != null) {
                iExecutorService.getExecutor(ExecutorType.NETWORK).execute(new a(a2));
            } else {
                c();
            }
        }
    }
}
