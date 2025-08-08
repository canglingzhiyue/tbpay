package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.spb;

/* loaded from: classes5.dex */
public final class skg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33647a;
    private final IContainerService b;
    private final IFeedsListService c;
    private final IDataService d;
    private final IUsePreloadService e;
    private final ISceneConfigService f;
    private final ISharePlayerService g;
    private final sjw h;
    private final iys i;
    private final IIntelligenceService k;
    private final IQuickOpenService l;
    private boolean m;
    private int n;
    private int o;
    private Integer p;
    private String q;
    private boolean r;
    private skf s;
    private Runnable t;
    private RotateAnimation u;
    @Deprecated
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z = true;
    private final spc j = N();

    static {
        kge.a(1451571608);
    }

    public static /* synthetic */ sjw a(skg skgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjw) ipChange.ipc$dispatch("3f2e5dfd", new Object[]{skgVar}) : skgVar.h;
    }

    public static /* synthetic */ FluidContext b(skg skgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("67d43e1e", new Object[]{skgVar}) : skgVar.f33647a;
    }

    public static /* synthetic */ IDataService c(skg skgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDataService) ipChange.ipc$dispatch("6ee3815c", new Object[]{skgVar}) : skgVar.d;
    }

    public static /* synthetic */ IQuickOpenService d(skg skgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IQuickOpenService) ipChange.ipc$dispatch("bf867eb3", new Object[]{skgVar}) : skgVar.l;
    }

    public static /* synthetic */ ISharePlayerService e(skg skgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISharePlayerService) ipChange.ipc$dispatch("558b47f2", new Object[]{skgVar}) : skgVar.g;
    }

    public skg(FluidContext fluidContext, iys iysVar, sjw sjwVar) {
        this.f33647a = fluidContext;
        this.i = iysVar;
        this.b = (IContainerService) this.f33647a.getService(IContainerService.class);
        this.c = (IFeedsListService) this.f33647a.getService(IFeedsListService.class);
        this.d = (IDataService) fluidContext.getService(IDataService.class);
        this.e = (IUsePreloadService) this.f33647a.getService(IUsePreloadService.class);
        this.f = (ISceneConfigService) this.f33647a.getService(ISceneConfigService.class);
        this.g = (ISharePlayerService) this.f33647a.getService(ISharePlayerService.class);
        this.k = (IIntelligenceService) this.f33647a.getService(IIntelligenceService.class);
        this.l = (IQuickOpenService) this.f33647a.getService(IQuickOpenService.class);
        this.h = sjwVar;
        this.n = ohd.f(this.f33647a.getContext());
        this.o = obu.a(this.f33647a.getContext(), spj.d(this.f33647a));
        spz.c("ContainerRenderManager", "[画幅]ContainerRenderManager mWindowHeight=" + this.o);
    }

    @Deprecated
    public int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            return ohd.a(this.f33647a.getContext(), soi.b(this.f33647a));
        }
        return ohd.a(this.f33647a.getContext(), soi.a(this.f33647a));
    }

    public void a() {
        skf skfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (!this.d.isDetailLoading() && !spj.h(this.f33647a) && !spj.f(this.f33647a) && !spj.g(this.f33647a)) {
            spz.c("ContainerRenderManager", "PickPreloadControllerNew，进入视频全屏页resume(),请求detail");
            this.d.fetchContentDetail(null, false, false);
        }
        E();
        if (spi.c()) {
            this.u = this.j.a();
        }
        RotateAnimation rotateAnimation = this.u;
        if (rotateAnimation == null || (skfVar = this.s) == null) {
            return;
        }
        skfVar.a(rotateAnimation);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.w;
    }

    @Deprecated
    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.v;
    }

    public ViewStub c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("c79299e", new Object[]{this});
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return null;
        }
        return skfVar.a();
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.s == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return -1;
        }
        spz.c("ContainerRenderManager", "Native 顶部view隐藏,visibility," + i);
        return this.s.a(i);
    }

    public ViewGroup d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5ee44eca", new Object[]{this});
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return null;
        }
        return skfVar.b();
    }

    public skf e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skf) ipChange.ipc$dispatch("2dd11f4c", new Object[]{this}) : this.s;
    }

    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this});
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return null;
        }
        return skfVar.c();
    }

    public ViewStub g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("f1bd6ca2", new Object[]{this});
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return null;
        }
        return skfVar.e();
    }

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this});
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return null;
        }
        return skfVar.f();
    }

    public DefaultGestureCollectorDelegateLayout i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultGestureCollectorDelegateLayout) ipChange.ipc$dispatch("28651c2a", new Object[]{this});
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return null;
        }
        return skfVar.g();
    }

    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
            return null;
        }
        return skfVar.h();
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.q;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.o;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.n;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!a(this.f33647a)) {
        } else {
            spz.c("ContainerRenderManager", "PickPreloadControllerNew,隐藏loading");
            this.d.setTab3CacheDataRefreshShowLoading(false);
            this.b.showTab3CacheHadExposedLoading(false);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            skfVar.k();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            skfVar.l();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.s == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            spz.c("ContainerRenderManager", "hideLoading");
            this.s.m();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            skfVar.n();
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.d.isDetailMTopSuccess();
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.m;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.x;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.d.isDetailLoading();
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.y;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        E();
        this.m = true;
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            a((Map) null, false);
        }
    }

    public void a(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
            return;
        }
        b(map, z);
        StringBuilder sb = new StringBuilder();
        sb.append("PickPreloadControllerNew，refresh(),请求detail，");
        sb.append(z ? "小红点" : "正常刷新");
        spz.c("ContainerRenderManager", sb.toString());
        this.d.fetchContentDetail(map, z, true);
    }

    public void a(Map map, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716f8517", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            this.d.fetchContentDetail(map, z, z2, z3, null);
        }
    }

    public void a(skd skdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee4864c", new Object[]{this, skdVar});
            return;
        }
        spz.c("ContainerRenderManager", "PickPreloadControllerNew，下拉刷新,请求detail");
        this.d.fetchContentDetail(null, false, false, true, skdVar);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ogh.a("renderContainer");
        pio.a(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_ONRENDER);
        I();
        P();
        this.j.b(this.f33647a);
        c(context);
        K();
        if (spj.f(this.f33647a)) {
            pio.a(pio.GG_VIDEOTAB_VIDEO_LEAVE_UT);
        }
        J();
        pio.b(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_ONRENDER);
        ogh.b();
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        boolean a2 = soi.a(sjv.b(this.f33647a), this.n, this.o);
        this.x = a2;
        if (sjt.u()) {
            this.w = sjs.b(this.f33647a.getContext(), spj.l(this.f33647a));
        } else if (sjv.b(this.f33647a) || this.p.intValue() == 0) {
            this.w = a(a2);
        }
        if (!sjv.b(this.f33647a) && this.p.intValue() != 0) {
            return;
        }
        this.v = a(a2);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.n = i;
            this.o = i2;
            spz.c("ContainerRenderManager", "[画幅]setContainerSize mWindowHeight=" + this.o);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            skfVar.a(z);
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.t = runnable;
        }
    }

    public void a(RotateAnimation rotateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f24f23", new Object[]{this, rotateAnimation});
        } else {
            this.u = rotateAnimation;
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            skfVar.o();
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        skf skfVar = this.s;
        if (skfVar == null) {
            spz.c("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            skfVar.a(obj);
        }
    }

    public void a(boolean z, List<a> list) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab4085d", new Object[]{this, new Boolean(z), list});
            return;
        }
        ogh.a("updateView");
        f.a(this.f33647a);
        if (!C()) {
            ((IInteractionService) this.f33647a.getService(IInteractionService.class)).initCollectionPoplayer();
        }
        obo.a(this.f33647a);
        spz.c("ContainerRenderManager", "PickPreloadControllerNew VideoProcess DefaultFluidInstance updateView()");
        pio.a(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_UPDATEVIEW);
        pil.a(this.f33647a.getContext(), spj.j(this.f33647a), "gg_videoMutiTab_ui2VideoPlay");
        a(list);
        boolean isDetailRequestSuccess = this.d.isDetailRequestSuccess();
        boolean isTransitionAnimEnd = this.l.isTransitionAnimEnd();
        if (isDetailRequestSuccess && isTransitionAnimEnd) {
            spz.c("ContainerRenderManager", "updateView,detailSuccess && animationEnd_hideLoading");
            q();
            a(list, false);
        } else {
            this.d.onDetailRequestSuccess();
            if (this.e.ismTab3QuickRender()) {
                a(list, false);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PickPreloadControllerNew，需要启动监听：");
        if (!isDetailRequestSuccess || !isTransitionAnimEnd) {
            z2 = true;
        }
        sb.append(z2);
        spz.c("ContainerRenderManager", sb.toString());
        skl G = G();
        if (spj.d(this.f33647a) && obu.b(this.f33647a.getContext()) && G != null && G.al) {
            this.y = true;
            A();
        }
        H();
        pio.b(pio.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_UPDATEVIEW);
        this.h.d();
        ogh.b();
    }

    public void a(List<a> list, boolean z) {
        skf skfVar;
        skf skfVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        a a2 = a.a(list);
        a(a2);
        spz.c("ContainerRenderManager", "PickPreloadControllerNew 更新UI");
        if (!G().p) {
            this.f.getSlidePageLockConfigure().a(false, true);
        }
        skl G = G();
        if (G != null && !G.S && (skfVar2 = this.s) != null) {
            skfVar2.a(G.ak);
        }
        if (G != null && !StringUtils.isEmpty(G.t) && (skfVar = this.s) != null) {
            skfVar.p();
        }
        R();
        this.j.a(this.f33647a, list, z);
        if (G != null && !StringUtils.isEmpty(G.m) && !sjv.c(this.f33647a)) {
            ((IInteractionService) this.f33647a.getService(IInteractionService.class)).initGlobalH5MessageHandler(a2);
        }
        b(a2);
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue() : this.z;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    private boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{this, fluidContext})).booleanValue() : ((IDataService) fluidContext.getService(IDataService.class)).isTab3CacheDataRefreshShowLoading();
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.r = this.f33647a.getInstanceConfig().isDynamicProfileMode();
        spc spcVar = this.j;
        FluidContext fluidContext = this.f33647a;
        spcVar.a(fluidContext, context, ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface(), this.b.getContentView(), this.r);
    }

    private boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableDxLoadBeforeDetial", true);
    }

    private boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableRemoveFirstFrameViewForPreload", true);
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        Runnable runnable = this.t;
        if (runnable == null) {
            return;
        }
        runnable.run();
        this.t = null;
    }

    private String F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fdc3673", new Object[]{this}) : this.f33647a.getInstanceConfig().getPreCoverKey();
    }

    private skl G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skl) ipChange.ipc$dispatch("46ffbee4", new Object[]{this}) : this.d.getConfig().j();
    }

    private void a(a aVar) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e800264", new Object[]{this, aVar});
            return;
        }
        sps sessionParams = this.f.getSessionParams();
        if (sessionParams == null || aVar == null || (a2 = aVar.a()) == null || !skw.FAKE_CONTENT_ID.equals(sessionParams.d)) {
            return;
        }
        this.q = sessionParams.d;
        sessionParams.d = a2.g();
    }

    private void b(a aVar) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6d1983", new Object[]{this, aVar});
        } else if (!sjv.a(this.f33647a) || aVar == null || (a2 = aVar.a()) == null || a2.w()) {
        } else {
            p();
            snu.a(this.f33647a);
        }
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else {
            oec.a(new Runnable() { // from class: tb.skg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    spz.c("ContainerRenderManager", "PickPreloadControllerNew,3s后强制隐藏loading");
                    skg.this.n();
                }
            }, 3000L);
        }
    }

    private void a(List<a> list) {
        snv a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        String F = F();
        boolean a3 = b.a().a(F);
        boolean e = spv.a().e(F);
        if (!a3 && !e) {
            z = false;
        }
        a a4 = a.a(list);
        if (!z && M()) {
            FluidContext fluidContext = this.f33647a;
            snv a5 = snu.a(fluidContext, fluidContext.getContext(), a4.a().E(), ody.a().a(F).d());
            if (a5 == null) {
                return;
            }
            ((ISharePlayerService) this.f33647a.getService(ISharePlayerService.class)).setDWInstance(a5);
        } else if (b(list) || z) {
        } else {
            try {
                if (sns.c() || ((ISharePlayerService) this.f33647a.getService(ISharePlayerService.class)).isHasCreateDWInstance() || (a2 = snu.a(this.f33647a, this.f33647a.getContext(), a4.a().E(), null)) == null) {
                    return;
                }
                ((ISharePlayerService) this.f33647a.getService(ISharePlayerService.class)).setDWInstance(a2);
                spz.c("ContainerRenderManager", "VideoProcess updateView() 接口回来提前创建播放器 new idwInstance = " + a2);
            } catch (Exception e2) {
                spz.a("ContainerRenderManager", "get share player error", e2);
            }
        }
    }

    private void I() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (this.d.isDetailLoading() || !this.f33647a.getInstanceConfig().isOnCreateToRequest() || spj.f(this.f33647a)) {
        } else {
            sps sessionParams = this.f.getSessionParams();
            if (sessionParams == null || skw.FAKE_CONTENT_ID.equals(sessionParams.d) || M() || this.g.isEnableSharePlayer() || !skk.e()) {
                z = false;
            } else {
                this.d.fetchVideoInfoAndPrecreateDwInstance();
                z = true;
            }
            spz.c("ContainerRenderManager", "PickPreloadControllerNew，进入视频全屏页onRender,请求detail");
            this.d.fetchContentDetail(null, false, z, false, null);
        }
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        if (C()) {
            ((IInteractionService) this.f33647a.getService(IInteractionService.class)).initCollectionPoplayer();
        }
        this.k.getBehaviorManager().a(new jck(this.s.d(), this.f33647a));
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        View contentView = this.c.getContentView();
        if (contentView == null || contentView.getParent() != null) {
            return;
        }
        this.s.a(contentView);
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        ogh.a("initContainerView");
        long currentTimeMillis = System.currentTimeMillis();
        this.s = new skf(this.f33647a);
        this.c.renderList(context);
        R();
        this.i.a();
        this.s.c().setHorizontalSlideCallback(new sjz() { // from class: tb.skg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sjz
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    skg.a(skg.this).b();
                }
            }
        });
        this.s.c().setSizeChangedCallback(new ske() { // from class: tb.skg.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ske
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                } else if (i == 0 || i2 == 0) {
                } else {
                    if (skg.b(skg.this).getInstanceConfig().isFullscreenDisplay()) {
                        i2 = skg.this.i().getMeasuredHeight();
                    }
                    skg.this.a(i, i2);
                    skg.this.A();
                    skg.a(skg.this).a(i, i2);
                }
            }
        });
        spz.a("ContainerRenderManager", "generateLayout, inflateTime=" + (System.currentTimeMillis() - currentTimeMillis));
        b(context);
        O();
        this.p = Integer.valueOf(this.b.getActionBarHeight());
        if (snf.b(this.f33647a) && !sop.a().b().l) {
            this.b.showTab3CacheHadExposedLoading(true);
        }
        ogh.b();
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        a a2 = this.j.a(this.f33647a);
        if (a2 == null) {
            return;
        }
        ((IQuickOpenService) this.f33647a.getService(IQuickOpenService.class)).setQuickOpenMode(true);
        ((IInteractionService) this.f33647a.getService(IInteractionService.class)).initGlobalInteractHandler();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        a((List<a>) arrayList, true);
    }

    private boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableUseFirstFrameRenderObserve", true);
    }

    private boolean M() {
        odz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        String F = F();
        return !StringUtils.isEmpty(F) && (a2 = ody.a().a(F)) != null && a2.d() != null && a2.d().startsWith("file://");
    }

    private spc N() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (spc) ipChange.ipc$dispatch("7cdb562b", new Object[]{this});
        }
        String F = F();
        boolean z2 = oeb.bc() && b.a().l(F) && !spj.d(this.f33647a);
        boolean z3 = iqw.f() && b.a().j(F) != null && !StringUtils.isEmpty(oec.a(b.a().j(this.f33647a.getInstanceConfig().getPreCoverKey()).get("openWeexDSLV2"), (String) null));
        IQuickOpenService iQuickOpenService = (IQuickOpenService) this.f33647a.getService(IQuickOpenService.class);
        if (z2 && !z3) {
            z = true;
        }
        iQuickOpenService.setInQuickOpenMode(z);
        spz.c("ContainerRenderManager", "瞬开模式是否开启：" + z2 + "，开关是否打开：" + oeb.bc() + ", 是否有weex:" + z3);
        if (z2 && !z3) {
            return new spe();
        }
        return new spd();
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else if (!L()) {
        } else {
            final boolean a2 = sjv.a(this.f33647a);
            this.b.addFirstCardRenderListener(new ska() { // from class: tb.skg.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ska
                public void onFirstCardRenderFailed(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9d76177", new Object[]{this, pswVar});
                    }
                }

                @Override // tb.ska
                public void onFirstCardRenderSuccess(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7ed75eef", new Object[]{this, pswVar});
                        return;
                    }
                    spz.c("ContainerRenderManager", "PickPreloadController，Muti,收到首帧回调,updateGraymaskVisible:");
                    if (!a2) {
                        return;
                    }
                    skg.this.p();
                }
            });
        }
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        final Runnable runnable = new Runnable() { // from class: tb.skg.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean isDetailRequestSuccess = skg.c(skg.this).isDetailRequestSuccess();
                boolean isTransitionAnimEnd = skg.d(skg.this).isTransitionAnimEnd();
                if (!isDetailRequestSuccess || !isTransitionAnimEnd) {
                    return;
                }
                boolean isStillShareVideo = skg.e(skg.this).isStillShareVideo();
                if (sjv.a(skg.b(skg.this)) || isStillShareVideo) {
                    z = false;
                }
                if (z) {
                    spz.c("ContainerRenderManager", "observeListener,onAnimationEnd_hideLoading");
                    skg.this.q();
                }
                skg skgVar = skg.this;
                skgVar.a(skg.c(skgVar).getDetailMediaSetDataList(), false);
            }
        };
        ((IQuickOpenService) this.f33647a.getService(IQuickOpenService.class)).addTransitionAnimListener(new spb.a() { // from class: tb.skg.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.spb.a, tb.spb
            public void onAnimationEnd() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c281bbd", new Object[]{this});
                } else {
                    runnable.run();
                }
            }
        });
        this.d.addDetailRequestSuccessListener(new skt() { // from class: tb.skg.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.skt
            public void onDetailRequestSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91cae82b", new Object[]{this});
                } else {
                    runnable.run();
                }
            }
        });
    }

    private boolean b(List<a> list) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
        }
        sor i = ((IUsePreloadService) this.f33647a.getService(IUsePreloadService.class)).getConfig().i();
        a a2 = a.a(list);
        if (a2 != null) {
            a.c a3 = a2.a();
            if (a2 == null || !a3.z()) {
                z = false;
            } else {
                spz.c("ContainerRenderManager", "视频场景不需要移除预创建播放器");
                z = true;
            }
            if (!z || i == null) {
                z2 = false;
            } else {
                String str = null;
                if (a2.a() != null) {
                    str = a2.a().g();
                }
                z2 = !StringUtils.equals(str, i.b);
                snv snvVar = i.f33778a;
                spz.c("ContainerRenderManager", "PickPreloadControllerNew,tryUsePreDWInstanceFromLauncher:" + snvVar + ",needDestoryDW:" + z2);
                if (!z2 && snvVar != null) {
                    spz.c("ContainerRenderManager", "PickPreloadControllerNew,VideoProcess usePreDWInstanceFromLauncher 使用预加载播放器 cachePreloadDWInstance=" + snvVar);
                    ((IMediaService) this.f33647a.getService(IMediaService.class)).setUseDefaultValueCreateDW(true);
                    ((ISharePlayerService) this.f33647a.getService(ISharePlayerService.class)).setDWInstance(snvVar);
                    d.d(this.f33647a, "1");
                    if (D() && i != null) {
                        i.b();
                    }
                    return true;
                }
            }
            if (!z || z2) {
                ((IUsePreloadService) this.f33647a.getService(IUsePreloadService.class)).removePreAttachedDWInstance(true);
                return true;
            }
        }
        return false;
    }

    private void b(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa99d9d8", new Object[]{this, map, new Boolean(z)});
        } else if (!this.e.enableTab3UseCacheData() || !ogv.b(map)) {
        } else {
            if (z) {
                d.b(this.f33647a, spj.g(this.f33647a) ? "3" : "2");
            } else if (!oec.a(map.get("isRefresh"), false)) {
            } else {
                d.b(this.f33647a, "1");
            }
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (!sjt.u() || !spj.l(this.f33647a)) {
        } else {
            IHostTNodeService iHostTNodeService = (IHostTNodeService) this.f33647a.getService(IHostTNodeService.class);
            spz.c("ContainerRenderManager", "向 TAB2 首页发送消息tabbar相关被过滤");
            if (iHostTNodeService == null) {
                return;
            }
            iHostTNodeService.sendMessage(jcj.MSG_ON_FULLPAGE_VIDEO_MESSAGE, null, new spy(spy.MSG_SHOW_TABBAR, "-1", null).a(), null);
        }
    }
}
