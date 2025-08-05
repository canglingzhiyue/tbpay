package com.taobao.themis.uniapp.solution;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.ljl;
import tb.qos;
import tb.qpp;
import tb.qpr;
import tb.qpt;
import tb.qqp;
import tb.sud;
import tb.suh;
import tb.tei;
import tb.tmb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/uniapp/solution/TMSBaseUniAppSolution;", "Lcom/taobao/themis/kernel/solution/TMSBaseSolution;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "createLaunchListener", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "createLauncher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", "createPageFactory", "Lcom/taobao/themis/kernel/page/ITMSPageFactory;", "generateContainerModel", "Lcom/taobao/themis/kernel/container/ContainerModel;", "generateSplashView", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "splashViewContainer", "Landroid/view/ViewGroup;", "getInstanceExtension", "", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "getSolutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "reload", "", "renderOptions", "Lcom/taobao/themis/kernel/runtime/TMSRenderOptions;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class TMSBaseUniAppSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/uniapp/solution/TMSBaseUniAppSolution$createLauncher$1", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", "start", "", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b extends qpr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(f fVar) {
            super(fVar);
        }

        @Override // tb.qpq
        public void a(qpp listener) {
            com.taobao.themis.web.solution.d dVar;
            tei D;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbc6bf07", new Object[]{this, listener});
                return;
            }
            q.d(listener, "listener");
            f mInstance = this.f33024a;
            q.b(mInstance, "mInstance");
            b bVar = this;
            com.taobao.themis.uniapp.solution.a aVar = new com.taobao.themis.uniapp.solution.a(mInstance, bVar, listener);
            IBizLaunchAdapter iBizLaunchAdapter = (IBizLaunchAdapter) qpt.b(IBizLaunchAdapter.class);
            if (iBizLaunchAdapter != null) {
                f mInstance2 = this.f33024a;
                q.b(mInstance2, "mInstance");
                dVar = iBizLaunchAdapter.createBizLaunchStep(mInstance2, bVar, listener);
            } else {
                dVar = null;
            }
            com.taobao.themis.uniapp.solution.a aVar2 = aVar;
            if (dVar != null) {
                aVar2.a(dVar);
            } else {
                dVar = aVar2;
            }
            boolean bI = n.bI();
            if (bI) {
                com.taobao.themis.web.solution.d dVar2 = new com.taobao.themis.web.solution.d(this.f33024a, bVar, listener);
                dVar.a(dVar2);
                dVar = dVar2;
            }
            TMSLogger.a("TMSLauncher", "enableWaitWebReady: " + bI);
            f mInstance3 = this.f33024a;
            q.b(mInstance3, "mInstance");
            dVar.a(new tmb(mInstance3, bVar, listener));
            aVar.b();
            f fVar = this.f33024a;
            if (fVar == null || (D = fVar.D()) == null) {
                return;
            }
            f mInstance4 = this.f33024a;
            q.b(mInstance4, "mInstance");
            D.a("enableUniAppNavPrefetchAB", t.a(mInstance4.o(), "enableUniAppNavPrefetchABV1", "[0,49],[50,99]").a());
        }
    }

    static {
        kge.a(560181415);
    }

    public static /* synthetic */ Object ipc$super(TMSBaseUniAppSolution tMSBaseUniAppSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBaseUniAppSolution(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    public static final /* synthetic */ f access$getMInstance$p(TMSBaseUniAppSolution tMSBaseUniAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("66ae8620", new Object[]{tMSBaseUniAppSolution}) : tMSBaseUniAppSolution.mInstance;
    }

    public static final /* synthetic */ ISplashView access$getMSplashView$p(TMSBaseUniAppSolution tMSBaseUniAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("fd0da6a3", new Object[]{tMSBaseUniAppSolution}) : tMSBaseUniAppSolution.mSplashView;
    }

    public static final /* synthetic */ void access$setMSplashView$p(TMSBaseUniAppSolution tMSBaseUniAppSolution, ISplashView iSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e62b61", new Object[]{tMSBaseUniAppSolution, iSplashView});
        } else {
            tMSBaseUniAppSolution.mSplashView = iSplashView;
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qpr createLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("2f6c2610", new Object[]{this}) : new b(this.mInstance);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/uniapp/solution/TMSBaseUniAppSolution$createLaunchListener$1", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "beforeLaunch", "", "onAppInfoSuccess", "onLaunchSuccess", ljl.RENDER_SUCCESS_TIME, "onResourceSuccess", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements f.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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

        public a() {
        }

        @Override // com.taobao.themis.kernel.f.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (n.by()) {
                Activity o = TMSBaseUniAppSolution.access$getMInstance$p(TMSBaseUniAppSolution.this).o();
                q.b(o, "mInstance.activity");
                com.taobao.themis.utils.b.c(o, false);
            } else {
                Activity o2 = TMSBaseUniAppSolution.access$getMInstance$p(TMSBaseUniAppSolution.this).o();
                q.b(o2, "mInstance.activity");
                com.taobao.themis.utils.b.a(o2, false, true, false, 8, null);
            }
            ISplashView access$getMSplashView$p = TMSBaseUniAppSolution.access$getMSplashView$p(TMSBaseUniAppSolution.this);
            if (access$getMSplashView$p == null) {
                return;
            }
            access$getMSplashView$p.c();
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public f.a createLaunchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("35fba214", new Object[]{this}) : new a();
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
        instanceExtension.add(new suh(this.mInstance));
        instanceExtension.add(new com.taobao.themis.container.app.page.swiper.b(this.mInstance));
        instanceExtension.add(new com.taobao.themis.uniapp.solution.extension.instance.c(this.mInstance));
        instanceExtension.add(new com.taobao.themis.uniapp.solution.extension.instance.b(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public com.taobao.themis.kernel.container.a generateContainerModel() {
        AppManifest v;
        ArrayList arrayList;
        List<AppManifest.Page> pages;
        JSONObject window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("e8d42c4a", new Object[]{this});
        }
        TMSMetaInfoWrapper v2 = this.mInstance.v();
        TabBar tabBar = null;
        if (v2 == null || (v = v2.v()) == null) {
            return null;
        }
        AppManifest.Container container = v.getContainer();
        AppManifest.Performance performance = container != null ? container.getPerformance() : null;
        AppManifest.Container container2 = v.getContainer();
        Window a2 = (container2 == null || (window = container2.getWindow()) == null) ? null : new Window.a().a(window, TMSMetaInfoWrapper.Type.Manifest);
        AppManifest.Container container3 = v.getContainer();
        if (container3 == null || (pages = container3.getPages()) == null) {
            arrayList = null;
        } else {
            List<AppManifest.Page> list = pages;
            ArrayList arrayList2 = new ArrayList(p.a((Iterable) list, 10));
            for (AppManifest.Page page : list) {
                String id = page.getId();
                String url = page.getUrl();
                String version = page.getVersion();
                String renderer = page.getRenderer();
                boolean external = page.getExternal();
                boolean autofocus = page.getAutofocus();
                JSONObject window2 = page.getWindow();
                arrayList2.add(new com.taobao.themis.kernel.container.b(id, url, version, renderer, external, window2 != null ? new Window.a().a(window2, TMSMetaInfoWrapper.Type.Manifest) : null, page.getQueryPass(), autofocus, page.getPageType(), page.getChildren(), page.getGroupConfig()));
            }
            arrayList = arrayList2;
        }
        AppManifest.Container container4 = v.getContainer();
        if (container4 != null) {
            tabBar = container4.getTabBar();
        }
        return new com.taobao.themis.kernel.container.a(arrayList, performance, a2, tabBar);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup splashViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, splashViewContainer});
        }
        q.d(splashViewContainer, "splashViewContainer");
        return new com.taobao.themis.container.splash.a(this.mInstance, splashViewContainer);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public boolean reload(qqp qqpVar) {
        String url;
        qos qosVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d80f43c4", new Object[]{this, qqpVar})).booleanValue();
        }
        f fVar = this.mInstance;
        if (fVar == null) {
            return false;
        }
        if (qqpVar == null || (url = qqpVar.f33036a) == null) {
            url = fVar.g();
        }
        f fVar2 = this.mInstance;
        if (fVar2 != null && (qosVar = (qos) fVar2.a(qos.class)) != null) {
            q.b(url, "url");
            qosVar.c(url, new JSONObject());
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this}) : TMSSolutionType.UNIAPP;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ITMSPageFactory createPageFactory(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPageFactory) ipChange.ipc$dispatch("c996e0f6", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        return new c(instance);
    }
}
