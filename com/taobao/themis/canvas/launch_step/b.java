package com.taobao.themis.canvas.launch_step;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpp;
import tb.qpr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0014J\b\u0010\u0011\u001a\u00020\nH\u0014J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002¨\u0006\u0017"}, d2 = {"Lcom/taobao/themis/canvas/launch_step/TMSDowngradeOn32Step;", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "do32DeviceAction", "", "getName", "", "is64BitSupported", "", "onAfterExecute", "onBeforeExecute", "onExecuting", LoginConstants.SHOW_TOAST, "activity", "Landroid/app/Activity;", "content", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.canvas.launch_step.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class RunnableC0929b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22345a;
        public final /* synthetic */ String b;

        public RunnableC0929b(Activity activity, String str) {
            this.f22345a = activity;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f22345a, this.b, 1).show();
            }
        }
    }

    static {
        kge.a(-583433731);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "DowngradeOn32";
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

    public b(com.taobao.themis.kernel.f fVar, qpr qprVar, qpp qppVar) {
        super(fVar, qprVar, qppVar);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            f();
        } catch (Throwable th) {
            try {
                TMSLogger.b("TMSDowngradeOn32Step", "32位设备降级", th);
            } finally {
                c();
            }
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        String g = mInstance.g();
        com.taobao.themis.kernel.f mInstance2 = this.f22538a;
        q.b(mInstance2, "mInstance");
        Activity o = mInstance2.o();
        if (g == null || o == null) {
            return;
        }
        Uri targetUri = Uri.parse(g);
        q.b(targetUri, "targetUri");
        if (!TMSSwitchUtils.downgradeOn32(targetUri)) {
            return;
        }
        TMSLogger.d("TMSDowngradeOn32Step", "32位设备降级");
        if (g() && n.ax()) {
            a(o, "当前淘宝为32位包，运行时可能出现卡顿、闪退等问题，请检查是否有更新");
        } else if (n.af()) {
            a(o, "当前淘宝为32位包，运行时可能出现卡顿、闪退等问题");
        } else if (com.taobao.themis.utils.f.a(o)) {
            a(o, "32位设备降级");
        }
        com.taobao.themis.kernel.f mInstance3 = this.f22538a;
        q.b(mInstance3, "mInstance");
        mInstance3.b().b();
    }

    private final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        q.b(strArr, "Build.SUPPORTED_64_BIT_ABIS");
        return !(strArr.length == 0);
    }

    private final void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
        } else {
            com.taobao.themis.kernel.utils.a.a(new RunnableC0929b(activity, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/launch_step/TMSDowngradeOn32Step$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1268831493);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
