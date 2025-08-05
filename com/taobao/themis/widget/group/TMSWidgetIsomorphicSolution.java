package com.taobao.themis.widget.group;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.widget.group.c;
import com.taobao.themis.widget.kernal.d;
import com.taobao.themis.widget.kernal.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.ljl;
import tb.nfc;
import tb.qpr;
import tb.qqg;
import tb.qqh;
import tb.qqq;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/widget/group/TMSWidgetIsomorphicSolution;", "Lcom/taobao/themis/kernel/solution/TMSBaseSolution;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "createLaunchListener", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "createLauncher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", "createRenderFactory", "Lcom/taobao/themis/kernel/render_factory/ITMSRenderFactory;", "generateContainerModel", "Lcom/taobao/themis/kernel/container/ContainerModel;", "generateSplashView", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "splashViewContainer", "Landroid/view/ViewGroup;", "getInstanceExtension", "", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "getSolutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWidgetIsomorphicSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/widget/group/TMSWidgetIsomorphicSolution$createLaunchListener$1", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "beforeLaunch", "", "onAppInfoSuccess", "onLaunchSuccess", ljl.RENDER_SUCCESS_TIME, "onResourceSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements f.a {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/widget/group/TMSWidgetIsomorphicSolution$createRenderFactory$1", "Lcom/taobao/themis/kernel/render_factory/TMSBaseRenderFactory;", nfc.PHA_MONITOR_MODULE_POINT_CREATE_RENDER, "Lcom/taobao/themis/kernel/runtime/TMSRenderProtocol;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b extends qqh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(f fVar) {
            super(fVar);
        }

        @Override // tb.qqg
        public qqq createRender(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qqq) ipChange.ipc$dispatch("877603f1", new Object[]{this, page});
            }
            q.d(page, "page");
            return new com.taobao.themis.widget.group.b(page);
        }
    }

    static {
        kge.a(-298734193);
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetIsomorphicSolution tMSWidgetIsomorphicSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public com.taobao.themis.kernel.container.a generateContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("e8d42c4a", new Object[]{this});
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWidgetIsomorphicSolution(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    public static final /* synthetic */ f access$getMInstance$p(TMSWidgetIsomorphicSolution tMSWidgetIsomorphicSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("7993337c", new Object[]{tMSWidgetIsomorphicSolution}) : tMSWidgetIsomorphicSolution.mInstance;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qqg createRenderFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqg) ipChange.ipc$dispatch("405c48c0", new Object[]{this}) : new b(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qpr createLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("2f6c2610", new Object[]{this}) : new d(this.mInstance);
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
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public f.a createLaunchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("35fba214", new Object[]{this}) : new a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016¨\u0006\u0011"}, d2 = {"com/taobao/themis/widget/group/TMSWidgetIsomorphicSolution$generateSplashView$1", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "backPressed", "", "exit", "", "getStatus", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView$Status;", "onLaunchError", "error", "Lcom/taobao/themis/kernel/TMSError;", "extras", "", "", "showLaunch", "showLoading", "updateLoadingInfo", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements ISplashView {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public c() {
        }

        @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
        public void a(com.taobao.themis.kernel.e error, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2baaff7", new Object[]{this, error, map});
                return;
            }
            q.d(error, "error");
            c.a aVar = (c.a) TMSWidgetIsomorphicSolution.access$getMInstance$p(TMSWidgetIsomorphicSolution.this).a(c.a.class);
            if (aVar == null) {
                return;
            }
            String str = error.d;
            q.b(str, "error.errorCode");
            String str2 = error.e;
            q.b(str2, "error.errorMsg");
            aVar.a(str, str2);
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup splashViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, splashViewContainer});
        }
        q.d(splashViewContainer, "splashViewContainer");
        return new c();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this}) : TMSSolutionType.CLUSTER_WIDGET;
    }
}
