package com.taobao.themis.canvas;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.u;
import com.taobao.themis.open.extension.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.iwh;
import tb.kge;
import tb.ljl;
import tb.qpr;
import tb.qqg;
import tb.qqp;
import tb.sud;
import tb.tnu;
import tb.xph;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/canvas/TMSGameSolution;", "Lcom/taobao/themis/kernel/solution/TMSBaseSolution;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "createLaunchListener", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "createLauncher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", "createPageFactory", "Lcom/taobao/themis/kernel/page/ITMSPageFactory;", "createRenderFactory", "Lcom/taobao/themis/kernel/render_factory/ITMSRenderFactory;", "generateContainerModel", "Lcom/taobao/themis/kernel/container/ContainerModel;", "generateSplashView", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "splashViewContainer", "Landroid/view/ViewGroup;", "getInstanceExtension", "", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "getSolutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "reload", "", "renderOptions", "Lcom/taobao/themis/kernel/runtime/TMSRenderOptions;", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSGameSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String TAG = "TMSGameSolution";

    static {
        kge.a(1838050692);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(TMSGameSolution tMSGameSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public boolean reload(qqp qqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d80f43c4", new Object[]{this, qqpVar})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSGameSolution(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    public static final /* synthetic */ f access$getMInstance$p(TMSGameSolution tMSGameSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1c2d1b31", new Object[]{tMSGameSolution}) : tMSGameSolution.mInstance;
    }

    public static final /* synthetic */ ISplashView access$getMSplashView$p(TMSGameSolution tMSGameSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("9eb1f826", new Object[]{tMSGameSolution}) : tMSGameSolution.mSplashView;
    }

    public static final /* synthetic */ void access$setMSplashView$p(TMSGameSolution tMSGameSolution, ISplashView iSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bc45a6", new Object[]{tMSGameSolution, iSplashView});
        } else {
            tMSGameSolution.mSplashView = iSplashView;
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qqg createRenderFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqg) ipChange.ipc$dispatch("405c48c0", new Object[]{this}) : new TMSGameRenderFactory(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qpr createLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("2f6c2610", new Object[]{this}) : new c(this.mInstance);
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
        instanceExtension.add(new xph(this.mInstance));
        instanceExtension.add(new tnu(this.mInstance));
        instanceExtension.add(new com.taobao.themis.open.resource.d(this.mInstance));
        instanceExtension.add(new com.taobao.themis.open.packages.a(this.mInstance));
        instanceExtension.add(new iwh(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this}) : TMSSolutionType.MINIGAME;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/canvas/TMSGameSolution$createLaunchListener$1", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "beforeLaunch", "", "onAppInfoSuccess", "onLaunchSuccess", ljl.RENDER_SUCCESS_TIME, "onResourceSuccess", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements f.a {
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
                } else if (TMSGameSolution.access$getMInstance$p(TMSGameSolution.this) == null) {
                } else {
                    if (q.a((Object) "landscape", (Object) k.n(TMSGameSolution.access$getMInstance$p(TMSGameSolution.this)))) {
                        Activity o = TMSGameSolution.access$getMInstance$p(TMSGameSolution.this).o();
                        q.b(o, "mInstance.activity");
                        o.setRequestedOrientation(0);
                        return;
                    }
                    Activity o2 = TMSGameSolution.access$getMInstance$p(TMSGameSolution.this).o();
                    q.b(o2, "mInstance.activity");
                    o2.setRequestedOrientation(1);
                }
            }
        }

        @Override // com.taobao.themis.kernel.f.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public b() {
        }

        @Override // com.taobao.themis.kernel.f.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (TMSGameSolution.access$getMInstance$p(TMSGameSolution.this) == null) {
            } else {
                if (n.G()) {
                    Activity o = TMSGameSolution.access$getMInstance$p(TMSGameSolution.this).o();
                    q.b(o, "mInstance.activity");
                    com.taobao.themis.utils.b.a(o, false);
                }
                u.e(TMSGameSolution.access$getMInstance$p(TMSGameSolution.this));
            }
        }

        @Override // com.taobao.themis.kernel.f.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            if (TMSGameSolution.access$getMSplashView$p(TMSGameSolution.this) != null) {
                ISplashView access$getMSplashView$p = TMSGameSolution.access$getMSplashView$p(TMSGameSolution.this);
                q.a(access$getMSplashView$p);
                access$getMSplashView$p.b();
            }
            com.taobao.themis.kernel.utils.a.a(new a());
        }

        @Override // com.taobao.themis.kernel.f.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (TMSGameSolution.access$getMSplashView$p(TMSGameSolution.this) == null) {
            } else {
                ISplashView access$getMSplashView$p = TMSGameSolution.access$getMSplashView$p(TMSGameSolution.this);
                q.a(access$getMSplashView$p);
                access$getMSplashView$p.c();
            }
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public f.a createLaunchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("35fba214", new Object[]{this}) : new b();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public com.taobao.themis.kernel.container.a generateContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("e8d42c4a", new Object[]{this});
        }
        e eVar = (e) this.mInstance.b(e.class);
        if (eVar == null) {
            TMSLogger.d(TAG, "can't get resourceManagerExtension");
            return null;
        }
        com.taobao.themis.open.resource.c a2 = eVar.a(RVConstants.FILE_APP_CONFIG);
        if (a2 == null) {
            TMSLogger.d(TAG, "can't get game.json resource");
            return null;
        }
        byte[] a3 = a2.a();
        if (a3 == null) {
            TMSLogger.d(TAG, "game.json content is null");
            return null;
        }
        try {
            AppConfigModel parseFromJSON = AppConfigModel.parseFromJSON(a3);
            if (parseFromJSON == null) {
                return null;
            }
            q.b(parseFromJSON, "AppConfigModel.parseFrom…jsonBytes) ?: return null");
            TMSMetaInfoWrapper v = this.mInstance.v();
            q.a(v);
            JSONObject m = v.m();
            q.a(m);
            String string = m.getString("deviceOrientation");
            JSONObject appLaunchParams = parseFromJSON.getAppLaunchParams();
            if (appLaunchParams == null) {
                appLaunchParams = new JSONObject();
            }
            appLaunchParams.put((JSONObject) "deviceOrientation", string);
            if (!appLaunchParams.containsKey("aspectFitOrientation")) {
                appLaunchParams.put((JSONObject) "aspectFitOrientation", "all");
            }
            if (!appLaunchParams.containsKey("statusBarHide")) {
                appLaunchParams.put((JSONObject) "statusBarHide", (String) true);
            }
            if (!appLaunchParams.containsKey("hideHomeIndicator")) {
                appLaunchParams.put((JSONObject) "hideHomeIndicator", (String) true);
            }
            com.taobao.themis.kernel.container.a aVar = new com.taobao.themis.kernel.container.a(null, null, new Window.a().a(appLaunchParams, TMSMetaInfoWrapper.Type.AppInfo), null);
            aVar.f().put((JSONObject) "enableMixPlayer", (String) Boolean.valueOf(q.a((Object) "true", (Object) appLaunchParams.getString("enableMixPlayer"))));
            return aVar;
        } catch (Exception unused) {
            TMSLogger.d(TAG, "game.json parse error");
            return null;
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup splashViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, splashViewContainer});
        }
        q.d(splashViewContainer, "splashViewContainer");
        return new com.taobao.themis.container.splash.b(this.mInstance, splashViewContainer);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ITMSPageFactory createPageFactory(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPageFactory) ipChange.ipc$dispatch("c996e0f6", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        return new com.taobao.themis.canvas.b(instance);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/TMSGameSolution$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-140098612);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
