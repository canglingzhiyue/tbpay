package com.taobao.themis.widget.kernal;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.ljl;
import tb.qpp;
import tb.qpr;
import tb.qqg;
import tb.sud;
import tb.tlm;
import tb.tln;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/widget/kernal/WidgetFrameworkSolution;", "Lcom/taobao/themis/kernel/solution/TMSBaseSolution;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "createLaunchListener", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "createLauncher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", "createRenderFactory", "Lcom/taobao/themis/kernel/render_factory/ITMSRenderFactory;", "generateContainerModel", "Lcom/taobao/themis/kernel/container/ContainerModel;", "generateSplashView", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "splashViewContainer", "Landroid/view/ViewGroup;", "getInstanceExtension", "", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "getSolutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class WidgetFrameworkSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.themis.kernel.f instance;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/widget/kernal/WidgetFrameworkSolution$createLauncher$1", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", "start", "", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a extends qpr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(com.taobao.themis.kernel.f fVar) {
            super(fVar);
        }

        @Override // tb.qpq
        public void a(qpp qppVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbc6bf07", new Object[]{this, qppVar});
                return;
            }
            a aVar = this;
            tlm tlmVar = new tlm(WidgetFrameworkSolution.this.getInstance(), aVar, qppVar);
            tlmVar.a(new tln(WidgetFrameworkSolution.this.getInstance(), aVar, qppVar));
            tlmVar.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/widget/kernal/WidgetFrameworkSolution$createLaunchListener$1", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "beforeLaunch", "", "onAppInfoSuccess", "onLaunchSuccess", ljl.RENDER_SUCCESS_TIME, "onResourceSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements f.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.f.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.f.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.f.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.f.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }
    }

    static {
        kge.a(743291674);
    }

    public static /* synthetic */ Object ipc$super(WidgetFrameworkSolution widgetFrameworkSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qqg createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqg) ipChange.ipc$dispatch("405c48c0", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public com.taobao.themis.kernel.container.a generateContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("e8d42c4a", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup splashViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, splashViewContainer});
        }
        q.d(splashViewContainer, "splashViewContainer");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetFrameworkSolution(com.taobao.themis.kernel.f instance) {
        super(instance);
        q.d(instance, "instance");
        this.instance = instance;
    }

    public final com.taobao.themis.kernel.f getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("ec12e349", new Object[]{this}) : this.instance;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qpr createLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("2f6c2610", new Object[]{this}) : new a(this.instance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public List<sud> getInstanceExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e7cabec", new Object[]{this});
        }
        ArrayList instanceExtension = super.getInstanceExtension();
        if (instanceExtension == null) {
            instanceExtension = new ArrayList();
        }
        instanceExtension.add(new com.taobao.themis.open.resource.d(this.mInstance));
        instanceExtension.add(new com.taobao.themis.open.packages.a(this.mInstance));
        instanceExtension.add(new e(this.mInstance));
        instanceExtension.add(new g(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public f.a createLaunchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("35fba214", new Object[]{this}) : new b();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this}) : TMSSolutionType.CLUSTER_WIDGET;
    }
}
