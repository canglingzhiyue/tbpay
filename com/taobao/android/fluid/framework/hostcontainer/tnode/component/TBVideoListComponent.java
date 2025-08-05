package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.TrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.h;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.preload.launcher.TBGuangPickPreloadModule;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.s;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.obu;
import tb.obw;
import tb.oeb;
import tb.oec;
import tb.ogl;
import tb.ogv;
import tb.ohd;
import tb.pio;
import tb.sjt;
import tb.smf;
import tb.smk;
import tb.son;
import tb.sor;
import tb.sov;
import tb.spj;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class TBVideoListComponent extends Component<View, a> implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONFIG_EXTPARAMS = "extParams";
    private static final String CONFIG_LAUNCH = "sLaunch";
    private static final String CONFIG_TABID = "tabid";
    public static final String INVOKE_METHOD_MESSAGE_CHANNEL_FOR_BASEGG = "messageChannelForBaseGG";
    private static final String KEY_QUERY = "query";
    private static final String TAG = "TBVideoListComponent";
    private static final String URL_SOURCE_COMMUNITY = "&source=guangguang_community";
    private static final String URL_SOURCE_PICK = "&source=guangguang_pick";
    private IContainerService mContainerService;
    private Context mContext;
    private FluidInstance mFluidInstance;
    private boolean mHadAppEnterBackground;
    private boolean mIgnoreAttrUpdate;
    private Map mInitExtParams;
    private boolean mIsCurrentAppear;
    private boolean mPageAppear;
    private ISceneConfigService mSceneConfigService;
    private boolean mSizeChanged;
    public Map mTab3ExtraParams;
    private boolean mHasInit = false;
    private boolean mHasInitVideoController = false;
    private boolean mQuickRender = false;
    private final a.InterfaceC0836a changedCallback = new a.InterfaceC0836a() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a.InterfaceC0836a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                spz.c(TBVideoListComponent.TAG, "PickPreloadController,引擎前后台切换方法调用--前台");
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a.InterfaceC0836a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TBVideoListComponent.access$002(TBVideoListComponent.this, true);
            spz.c(TBVideoListComponent.TAG, "PickPreloadController,引擎前后台切换方法调用--后台");
            pio.a(pio.GG_VIDEOTAB_VIDEO_APP_ENTER_BACKGROUND);
            if (TBVideoListComponent.access$100(TBVideoListComponent.this) != null && TBVideoListComponent.access$100(TBVideoListComponent.this).getService(IUsePreloadService.class) != null) {
                ((IUsePreloadService) TBVideoListComponent.access$100(TBVideoListComponent.this).getService(IUsePreloadService.class)).preloadDetailDataInBackground();
            }
            pio.b(pio.GG_VIDEOTAB_VIDEO_APP_ENTER_BACKGROUND);
        }
    };
    private int mDisappearNum = 0;
    private com.taobao.tao.flexbox.layoutmanager.core.c globalParamsHandler = new c.a<View, a>() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(f fVar, View view, a aVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19abecb8", new Object[]{this, fVar, view, aVar, dVar});
            } else if (TBVideoListComponent.access$200(TBVideoListComponent.this) == null) {
            } else {
                TBVideoListComponent.access$200(TBVideoListComponent.this).updateGlobalParams(aVar.h);
            }
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.c extraParams = new c.a<View, a>() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(f fVar, View view, a aVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19abecb8", new Object[]{this, fVar, view, aVar, dVar});
            } else {
                TBVideoListComponent.access$300(TBVideoListComponent.this, aVar);
            }
        }
    };

    static {
        kge.a(-1757433028);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(TBVideoListComponent tBVideoListComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((TBVideoListComponent) ((View) objArr[0]), (View) ((ogl) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1227079444:
                super.onRender((Context) objArr[0]);
                return null;
            case 112483626:
                super.onCreate((aa) objArr[0]);
                return null;
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$002(TBVideoListComponent tBVideoListComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da15f8ac", new Object[]{tBVideoListComponent, new Boolean(z)})).booleanValue();
        }
        tBVideoListComponent.mHadAppEnterBackground = z;
        return z;
    }

    public static /* synthetic */ FluidInstance access$100(TBVideoListComponent tBVideoListComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidInstance) ipChange.ipc$dispatch("69b6a8f7", new Object[]{tBVideoListComponent}) : tBVideoListComponent.mFluidInstance;
    }

    public static /* synthetic */ ISceneConfigService access$200(TBVideoListComponent tBVideoListComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISceneConfigService) ipChange.ipc$dispatch("c07b55d5", new Object[]{tBVideoListComponent}) : tBVideoListComponent.mSceneConfigService;
    }

    public static /* synthetic */ void access$300(TBVideoListComponent tBVideoListComponent, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556247bd", new Object[]{tBVideoListComponent, aVar});
        } else {
            tBVideoListComponent.handleExtParamsUpdated(aVar);
        }
    }

    public static /* synthetic */ Context access$400(TBVideoListComponent tBVideoListComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d353a062", new Object[]{tBVideoListComponent}) : tBVideoListComponent.mContext;
    }

    public static /* synthetic */ boolean access$500(TBVideoListComponent tBVideoListComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f674930d", new Object[]{tBVideoListComponent})).booleanValue() : tBVideoListComponent.isAppear();
    }

    public static /* synthetic */ aa access$600(TBVideoListComponent tBVideoListComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("46dffc16", new Object[]{tBVideoListComponent}) : tBVideoListComponent.node;
    }

    public static /* synthetic */ String access$700(TBVideoListComponent tBVideoListComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d50df139", new Object[]{tBVideoListComponent}) : tBVideoListComponent.getTabType();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if ("globalParams".equals(str)) {
            return this.globalParamsHandler;
        }
        if ("extraParams".equals(str) && enableNewAttrHandle()) {
            return this.extraParams;
        }
        return super.getAttributeHandler(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ec141b", new Object[]{this, view, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView((TBVideoListComponent) view, (View) aVar, map, z);
        pio.a(pio.TRACE_VIDEOTAB_TABLIST_APPLYATTRFORVIEW);
        if (z && this.mFluidInstance != null && isVideoTab()) {
            String pageUrl = getPageUrl();
            JSONObject initExtParams = getInitExtParams(pageUrl, ((a) this.viewParams).i);
            spz.c(TAG, "applyAttrForView, url:" + pageUrl + "  InitExtParams:" + initExtParams);
            this.mInitExtParams = initExtParams;
            Pair<String, String> a2 = sov.a(initExtParams);
            if (a2 != null) {
                ((IUsePreloadService) this.mFluidInstance.getService(IUsePreloadService.class)).getConfig().a(a2);
            }
            sor preloadedVideo = ((IPreloadService) this.mFluidInstance.getService(IPreloadService.class)).getPreloadedVideo(this.mFluidInstance);
            movePreloadVideoDataToInternal(preloadedVideo);
            moveVideoToList(preloadedVideo, initExtParams);
            ISceneConfigService iSceneConfigService = this.mSceneConfigService;
            if (iSceneConfigService != null) {
                iSceneConfigService.mergeTab3ExtParams(initExtParams);
            }
        } else if (!enableNewAttrHandle()) {
            handleExtParamsUpdated(aVar);
        }
        if (com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.b()) {
            TBGuangPickPreloadModule.resetPickPreloadArgs();
        }
        pio.b(pio.TRACE_VIDEOTAB_TABLIST_APPLYATTRFORVIEW);
    }

    private boolean enableNewAttrHandle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51e8ea01", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableNewAttrHandle", true);
    }

    private void handleExtParamsUpdated(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149d2a05", new Object[]{this, aVar});
        } else if (this.mFluidInstance == null || aVar.g == null || !canExecuteRefreshWithExtParams(this, this.mTab3ExtraParams, aVar.g)) {
        } else {
            this.mTab3ExtraParams = aVar.g;
            if (this.mIgnoreAttrUpdate) {
                this.mIgnoreAttrUpdate = false;
                if (b.a(aVar.g, this.mInitExtParams)) {
                    spz.c(TAG, "applyAttrForView, ignoreAttrUpdate return, extParams:" + aVar.g);
                    return;
                }
            }
            spz.c(TAG, "applyAttrForView, refresh with extraParams:" + aVar.g);
            IContainerService iContainerService = this.mContainerService;
            if (iContainerService != null) {
                iContainerService.refresh(aVar.g, true);
            }
            ISceneConfigService iSceneConfigService = this.mSceneConfigService;
            if (iSceneConfigService == null) {
                return;
            }
            iSceneConfigService.mergeTab3ExtParams(aVar.g);
        }
    }

    private void moveVideoToList(sor sorVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b1bcc", new Object[]{this, sorVar, jSONObject});
            return;
        }
        IUsePreloadService iUsePreloadService = (IUsePreloadService) this.mFluidInstance.getService(IUsePreloadService.class);
        if (sorVar != null && sorVar.c(this.mContext) && sorVar.a() == 0) {
            this.mIgnoreAttrUpdate = true;
            iUsePreloadService.moveVideoToList(sorVar);
        }
        if (!this.mIgnoreAttrUpdate && this.mQuickRender) {
            this.mIgnoreAttrUpdate = true;
        }
        if (!this.mIgnoreAttrUpdate) {
            return;
        }
        iUsePreloadService.quickRenderFetchContentDetail(jSONObject);
    }

    private void movePreloadVideoDataToInternal(sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1ebe06", new Object[]{this, sorVar});
            return;
        }
        ((IUsePreloadService) this.mFluidInstance.getService(IUsePreloadService.class)).getConfig().a(sorVar);
        if (sorVar == null) {
            return;
        }
        ((IPreloadService) this.mFluidInstance.getService(IPreloadService.class)).clearMemoryData();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("41ef9fbf", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        triggerDisAppearIfNeeded();
        super.detach(z);
        destroyInternal();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onCreate(aa aaVar) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b45d2a", new Object[]{this, aaVar});
            return;
        }
        super.onCreate(aaVar);
        if (!(aaVar.N() instanceof Application) || (f = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().f()) == null) {
            return;
        }
        initVideoControllerNew(f.getContext(), true);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRender(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dc40ec", new Object[]{this, context});
            return;
        }
        super.onRender(context);
        checkInit(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        pio.a(pio.TRACE_VIDEOTAB_TABLIST_ONCREATEVIEW);
        spz.c(TAG, "onCreateView start");
        if (this.viewParams == 0 || !b.a(((a) this.viewParams).f12579a)) {
            z = false;
        }
        if (com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.a(z)) {
            spz.c("PickPreloadController", "onCreateView——提前创建tab3非UI逻辑,默认tab3，开关打开，命中AB");
            if (!this.mHasInitVideoController) {
                initVideoControllerNew(context, false);
            }
            setPreRequestOnPageCreate(z, spj.g(this.mFluidInstance), spj.f(this.mFluidInstance));
            IContainerService iContainerService = this.mContainerService;
            if (iContainerService != null) {
                iContainerService.renderContainer(context);
            }
        } else {
            initVideoControllerOld(context);
            IContainerService iContainerService2 = this.mContainerService;
            if (iContainerService2 != null && iContainerService2.getContentView() == null) {
                this.mContainerService.renderContainer(context);
            }
        }
        IContainerService iContainerService3 = this.mContainerService;
        if (iContainerService3 != null) {
            iContainerService3.setContainerSize(this.measureResult.f20361a, this.measureResult.b);
        }
        pio.b(pio.TRACE_VIDEOTAB_TABLIST_ONCREATEVIEW);
        spz.c(TAG, "onCreateView end");
        return this.mContainerService.getContentView();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this});
        }
        if (sjt.u() || this.viewParams == 0 || !com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.a(((a) this.viewParams).e, ((a) this.viewParams).k)) {
            return null;
        }
        return new YogaMeasureFunction() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.facebook.yoga.YogaMeasureFunction
            public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("15b3ebfa", new Object[]{this, yogaNode, new Float(f), yogaMeasureMode, new Float(f2), yogaMeasureMode2})).longValue();
                }
                int g = ohd.g(TBVideoListComponent.access$400(TBVideoListComponent.this)) - ohd.h(TBVideoListComponent.access$400(TBVideoListComponent.this));
                if (com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.c()) {
                    int c = obu.c();
                    spz.c(TBVideoListComponent.TAG, "PickPreloadControllerNew,测量组件宽高时适配底部虚拟导航栏，tabBarParentHeight：" + c);
                    if (c > 0) {
                        g = c - ohd.h(TBVideoListComponent.access$400(TBVideoListComponent.this));
                    } else {
                        spz.c(TBVideoListComponent.TAG, TBVideoListComponent.this.getFlexBoxNode() + "--温启动时序问题，架构组tabBar高度返回为零");
                    }
                }
                spz.c(TBVideoListComponent.TAG, "PickPreloadControllerNew,测量组件宽高结果，availableHeight：" + g);
                return YogaMeasureOutput.make(f, g);
            }
        };
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        this.mSizeChanged = false;
        super.onLayoutComplete();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        this.mSizeChanged = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        spz.a(TAG, "TBVideoListComponent invoke, name: " + str);
        if (!str.equals(INVOKE_METHOD_MESSAGE_CHANNEL_FOR_BASEGG) || this.mFluidInstance == null || jSONObject == null) {
            z = false;
        } else {
            smf.a(this.mFluidInstance, cVar, spy.BIZ_TNODE_HOME, spy.FROM_GG_HOME, jSONObject.getString("name"), jSONObject.getJSONObject("args"));
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (str.equals("onpageappear")) {
            spz.a(TAG, m.PAGE_APPEAR);
            this.mPageAppear = true;
            if (!this.mIsCurrentAppear) {
                this.mIsCurrentAppear = true;
                onAppear();
            }
        } else if (str.equals("onpagedisappear")) {
            spz.a(TAG, "pageDisAppear");
            this.mPageAppear = false;
            if (this.mIsCurrentAppear) {
                this.mIsCurrentAppear = false;
                onDisAppear();
            }
        } else if (str.equals("onforcerefresh")) {
            spz.a(TAG, "refresh");
            normalRefresh();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        String str = eVar.c;
        String str2 = null;
        if (eVar.d == null || this.mFluidInstance == null) {
            z = false;
        } else {
            String a2 = oec.a(eVar.d.get("type"), (String) null);
            ((ILifecycleService) this.mFluidInstance.getService(ILifecycleService.class)).getConfig().a(a2);
            boolean z2 = TextUtils.equals(a2, "tab") || TextUtils.equals(a2, "page");
            z = oeb.a("ShortVideo.fixVideoListAppearType", true) ? TextUtils.equals(a2, "add") | z2 : z2;
        }
        boolean a3 = oeb.a("ShortVideo.fixVideoListPageAppear", false);
        if ((str.equals("onwillappear") && z) || (a3 && str.equals("onpageappear"))) {
            spz.a(TAG, m.PAGE_APPEAR);
            this.mPageAppear = true;
            if (!this.mIsCurrentAppear) {
                this.mIsCurrentAppear = true;
                onAppear();
            }
        } else if ((str.equals("onwilldisappear") && z) || (a3 && str.equals("onpagedisappear"))) {
            spz.a(TAG, "pageDisAppear");
            this.mPageAppear = false;
            if (this.mIsCurrentAppear) {
                this.mIsCurrentAppear = false;
                onDisAppear();
            }
        } else if (str.equals("onforcerefresh")) {
            spz.a(TAG, "refresh");
            if (eVar.d != null) {
                str2 = oec.a(eVar.d.get("type"), (String) null);
            }
            if (str2 == null) {
                str2 = "clickicon";
            }
            IContainerService iContainerService = this.mContainerService;
            if (iContainerService != null) {
                iContainerService.getConfig().a(str2);
            }
            normalRefresh();
        } else if ("ondestroy".equals(str)) {
            if (oeb.bt()) {
                triggerDisAppearIfNeeded();
                destroyInternal();
            }
        } else if (str.equals("onbackclick") && this.node.o() && this.mFluidInstance != null) {
            boolean onBackPress = onBackPress();
            if (spj.i(this.mFluidInstance) && !com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().g() && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a() == getNode().N()) {
                eVar.d.put("handled", true);
                if (!onBackPress) {
                    smk.a(this.mFluidInstance, "2", null, null, null, null);
                }
            }
        }
        return false;
    }

    private boolean canExecuteRefreshWithExtParams(TBVideoListComponent tBVideoListComponent, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cedac237", new Object[]{this, tBVideoListComponent, map, map2})).booleanValue();
        }
        if (!oeb.a("ShortVideo.enableTab3FilterSameExtParams", true)) {
            return true;
        }
        boolean a2 = b.a(map, map2);
        spz.c(TAG, "applyAttrForView, canExecuteRefreshWithExtParams,same:" + a2 + ",sizeChanged:" + tBVideoListComponent.mSizeChanged);
        return !a2 || !tBVideoListComponent.mSizeChanged;
    }

    private void checkInit(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d32de9", new Object[]{this, context});
        } else if (this.mHasInit) {
        } else {
            this.mHasInit = true;
        }
    }

    private void destroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4671de", new Object[]{this});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null) {
            return;
        }
        try {
            fluidInstance.cI_();
            setAppForegroundChangedCallback(false);
        } catch (Throwable th) {
            spz.c(TAG, "mMultiTabVideoController destroy:" + th.getMessage());
            FluidException.throwException((FluidContext) null, FluidInstance.INSTANCE_DESTROY_INSTANCE_ERROR, th);
        }
        this.mFluidInstance = null;
        this.mHasInitVideoController = false;
    }

    private boolean fromIconStreamByPreloadModuleArgs() {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bcf93a3", new Object[]{this})).booleanValue();
        }
        try {
            if (!isEnableIconStreamUsePrefetch()) {
                return false;
            }
            JSONObject pickPreloadArgs = TBGuangPickPreloadModule.getPickPreloadArgs();
            if (ogv.a(pickPreloadArgs) || oec.a(pickPreloadArgs.get("type"), 0) != 3) {
                return false;
            }
            String a2 = oec.a(pickPreloadArgs.get("url"), (String) null);
            if (TextUtils.isEmpty(a2) || (parse = Uri.parse(a2)) == null) {
                return false;
            }
            return !TextUtils.isEmpty(parse.getQueryParameter("extParams"));
        } catch (Throwable th) {
            spz.a(TAG, "", th);
            FluidException.throwException((FluidContext) null, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, th);
            return false;
        }
    }

    private boolean fromLauncherByParseNodeUrlAndSetConfig() {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6391be33", new Object[]{this})).booleanValue();
        }
        try {
            if (this.node != null && !ogv.a(this.node.C())) {
                String pageUrl = getPageUrl();
                if (TextUtils.isEmpty(pageUrl) || (parse = Uri.parse(pageUrl)) == null) {
                    return false;
                }
                return isVideoColdLaunchParams(parse.getQueryParameter("sLaunch"), parse.getQueryParameter(CONFIG_TABID));
            }
            return false;
        } catch (Throwable th) {
            spz.a(TAG, "", th);
            FluidException.throwException((FluidContext) null, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, th);
            return false;
        }
    }

    private JSONObject getExtParamsByQuery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c59acad1", new Object[]{this, str});
        }
        Map query = getQuery();
        if (!ogv.a(query) && isCurrentContractTab(str, query)) {
            return sov.a(oec.a(query.get("extParams"), (String) null));
        }
        return null;
    }

    private JSONObject getInitExtParams(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2014445c", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = null;
        if (this.node.d("query")) {
            jSONObject = getExtParamsByQuery(str2);
        } else {
            d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (b != null && b.a(this.mContext)) {
                jSONObject = TBGuangPickPreloadModule.getPickPreloadExtParams();
                if (ogv.a(jSONObject) && !TextUtils.isEmpty(str)) {
                    jSONObject = sov.a(Uri.parse(str));
                }
            } else if (!TextUtils.isEmpty(str)) {
                jSONObject = sov.a(Uri.parse(str));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PickPreloadControllerNew，getInitExtParams:");
        if (jSONObject != null) {
            str3 = "1" + jSONObject.toJSONString();
        } else {
            str3 = "0";
        }
        sb.append(str3);
        spz.c(TAG, sb.toString());
        return jSONObject;
    }

    private String getPageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        String str = (String) this.node.C().get("url");
        if (!spj.d() || c.a(str, oec.a(this.node.e("tab-id"), (String) null))) {
            return str;
        }
        return null;
    }

    private Map getQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("117b7d0e", new Object[]{this});
        }
        if (this.node == null) {
            return null;
        }
        Object e = this.node.e("query");
        if (!(e instanceof Map)) {
            return null;
        }
        return (Map) e;
    }

    private String getTabType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93d21060", new Object[]{this}) : TextUtils.isEmpty(((a) this.viewParams).i) ? "video" : ((a) this.viewParams).i;
    }

    private void createFluidInstance(Context context, boolean z, boolean z2, int i, String str, String str2, int i2, int i3, String str3, String str4, boolean z3, boolean z4) {
        String str5;
        boolean fromLauncherByParseNodeUrlAndSetConfig;
        boolean a2;
        boolean z5;
        String replaceSourceForLauncher;
        h hVar;
        String str6;
        int i4 = i;
        String str7 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ef3d2d", new Object[]{this, context, new Boolean(z), new Boolean(z2), new Integer(i4), str7, str2, new Integer(i2), new Integer(i3), str3, str4, new Boolean(z3), new Boolean(z4)});
            return;
        }
        checkInit(context);
        if (this.mFluidInstance != null) {
            return;
        }
        this.mContext = context;
        spz.c(TAG, "isFullscreen" + z + ",GUANGGUANG_TYPE:" + str3 + ",source:" + str4 + ",tabType=" + str7);
        if (i4 == -1) {
            i4 = 3;
        }
        try {
            fromLauncherByParseNodeUrlAndSetConfig = fromLauncherByParseNodeUrlAndSetConfig();
            a2 = b.a(str2);
            z5 = a2 && fromIconStreamByPreloadModuleArgs();
            spz.c(TAG, "PickPreloadControllerNew,createFluidInstance preloadFromIconStream=" + z5 + " fromLauncherByParseNodeUrl=" + fromLauncherByParseNodeUrlAndSetConfig + ",isDefaultTab3=" + a2);
            replaceSourceForLauncher = replaceSourceForLauncher(str2, fromLauncherByParseNodeUrlAndSetConfig);
            hVar = new h() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.core.h
                public void a(Map map, Map map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
                    } else if (!TBVideoListComponent.access$500(TBVideoListComponent.this) || map == null) {
                    } else {
                        if (!son.i()) {
                            map2 = map;
                        }
                        if (map2 != null) {
                            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(TBVideoListComponent.access$600(TBVideoListComponent.this), map2);
                        }
                        com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().a(TBVideoListComponent.access$700(TBVideoListComponent.this), map);
                    }
                }
            };
            if (!oeb.ai() || getNode() == null || getNode().k() == null) {
                str5 = TAG;
                str6 = null;
            } else {
                str6 = getNode().k().U();
                str5 = TAG;
            }
        } catch (Throwable th) {
            th = th;
            str5 = TAG;
        }
        try {
            FluidInstanceConfig.a a3 = FluidInstanceConfig.a.a().a(context).a(this).a(Boolean.valueOf(z4)).m(true).a(hVar).a(new FrameLayout(context)).a("shortvideo").e("videoFullScreen").e((Boolean) true).l(Boolean.valueOf(z)).c(FluidInstanceConfig.CONTAINER_NAME_GG_TAG3).b(FluidInstanceConfig.appendBizName(FluidInstanceConfig.CONTAINER_NAME_GG_TAG3, str7, str6)).g(obw.f31903a).d(TextUtils.isEmpty(str3) ? FluidInstanceConfig.GG_TYPE_NAME_COMMUNITY : str3).h(Boolean.valueOf(z2)).i(str4).a(Integer.valueOf(i4));
            if (TextUtils.isEmpty(str)) {
                str7 = "video";
            }
            this.mFluidInstance = FluidSDK.createFluidInstance(a3.h(str7).b(Integer.valueOf(i2)).c(Integer.valueOf(i3)).k(Boolean.valueOf(fromLauncherByParseNodeUrlAndSetConfig)).j(Boolean.valueOf(z5)).a(str2, Uri.parse(replaceSourceForLauncher)).a(new com.taobao.android.fluid.framework.c()).b());
            this.mContainerService = (IContainerService) this.mFluidInstance.getService(IContainerService.class);
            this.mSceneConfigService = (ISceneConfigService) this.mFluidInstance.getService(ISceneConfigService.class);
            if (z3) {
                setPreRequestOnPageCreate(a2, z5, fromLauncherByParseNodeUrlAndSetConfig);
            }
            this.mFluidInstance.onCreate();
            this.mContainerService.renderContainerOnCreate(context);
        } catch (Throwable th2) {
            th = th2;
            spz.a(str5, "创建 FluidInstance 失败: ", th);
            FluidException.throwException(null, FluidInstance.INSTANCE_CREATE_INSTANCE_ERROR, th.getMessage(), th);
        }
    }

    private void initVideoControllerNew(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447808ec", new Object[]{this, context, new Boolean(z)});
            return;
        }
        spz.c("PickPreloadControllerNew", "initVideoControllerNew——mHasInitVideoController：" + this.mHasInitVideoController);
        if (this.mHasInitVideoController) {
            return;
        }
        String a2 = oec.a(this.node.e("url"), (String) null);
        if (!com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.a(b.a(a2))) {
            return;
        }
        pio.a(pio.TRACE_VIDEOTAB_TABLIST_INITVIDEOCONTROLLERNEW);
        spz.c(TAG, "initVideoControllerNew——提前创建tab3非UI逻辑,默认tab3，开关打开，命中AB");
        createFluidInstance(context, oec.a(this.node.e("is-fullscreen"), false), oec.a(this.node.e("disableCache"), false), oec.a(this.node.e("mute-tips-count"), -1), oec.a(this.node.e("tab-id"), (String) null), a2, oec.a(this.node.e("topbarHeight"), 0), oec.a(this.node.e("topbarTopY"), 0), oec.a(this.node.e("ggType"), (String) null), oec.a(this.node.e("source"), (String) null), false, z);
        this.mHasInitVideoController = true;
        pio.b(pio.TRACE_VIDEOTAB_TABLIST_INITVIDEOCONTROLLERNEW);
    }

    private void initVideoControllerOld(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207683c1", new Object[]{this, context});
        } else {
            createFluidInstance(context, ((a) this.viewParams).e, ((a) this.viewParams).f, ((a) this.viewParams).b, ((a) this.viewParams).i, ((a) this.viewParams).f12579a, ((a) this.viewParams).c, ((a) this.viewParams).d, ((a) this.viewParams).j, ((a) this.viewParams).k, true, false);
        }
    }

    private boolean isAppear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue() : this.mPageAppear;
    }

    private boolean isCurrentContractTab(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d4560a4", new Object[]{this, str, map})).booleanValue();
        }
        if (ogv.a(map)) {
            return false;
        }
        String a2 = oec.a(map.get(CONFIG_TABID), (String) null);
        boolean equals = TextUtils.equals(str, a2);
        spz.c(TAG, "PickPreloadControllerNew，isCurrentTab，queryTabType：" + a2 + "，tabType：" + str + "，是否需要承接：" + equals);
        return equals;
    }

    private boolean isEnableIconStreamUsePrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("942da4c3", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableIconStreamUsePrefetch", true);
    }

    private boolean isVideoColdLaunchParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("109c83cd", new Object[]{this, str, str2})).booleanValue() : TextUtils.equals(str, "0") && TextUtils.equals(str2, "video");
    }

    private boolean isVideoTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d2cf6ef", new Object[]{this})).booleanValue() : TextUtils.equals(((a) this.viewParams).i, "video");
    }

    private void normalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559ed67b", new Object[]{this});
        } else if (this.mFluidInstance == null) {
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("isRefresh", "true");
            spz.a(TAG, "PickPreloadController，收到刷新消息刷新");
            IContainerService iContainerService = this.mContainerService;
            if (iContainerService == null) {
                return;
            }
            iContainerService.refresh(hashMap, false);
        }
    }

    private void onAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
        } else if (this.mFluidInstance == null) {
        } else {
            spz.c(TAG, "onAppear start");
            this.mFluidInstance.onStart();
            setAppForegroundChangedCallback(true);
            this.mFluidInstance.onResume();
            ((ILifecycleService) this.mFluidInstance.getService(ILifecycleService.class)).getConfig().a(true);
            if (this.mHadAppEnterBackground) {
                this.mHadAppEnterBackground = false;
                spz.c(TAG, "PickPreloadController,onAppear推后台再进来");
                com.taobao.android.fluid.framework.mute.helper.f.h(this.mFluidInstance);
            }
            setEnableTabBarPullIntercept(true);
            spz.c(TAG, "onAppear end");
        }
    }

    private void setEnableTabBarPullIntercept(boolean z) {
        TabBarControllerComponent tabBarControllerComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35480fd3", new Object[]{this, new Boolean(z)});
            return;
        }
        aa a2 = this.node.a(TabBarControllerComponent.class, (aa.c) null, true);
        if (a2 == null || (tabBarControllerComponent = (TabBarControllerComponent) a2.I()) == null) {
            return;
        }
        tabBarControllerComponent.b(z);
    }

    private boolean onBackPress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bcfe288", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.android.fluid.framework.card.cards.web.a.ch_()) {
            return false;
        }
        ((IBackEventService) this.mFluidInstance.getService(IBackEventService.class)).onBackClick();
        return true;
    }

    private void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
        } else if (this.mFluidInstance == null) {
        } else {
            this.mSizeChanged = false;
            this.mDisappearNum++;
            TrackService.sTab3ColdDisAppearTimes++;
            ((ITrackService) this.mFluidInstance.getService(ITrackService.class)).setTab3ComponentDisappearTimes(this.mDisappearNum);
            Map<String, String> pageUTProperties = ((ITrackService) this.mFluidInstance.getService(ITrackService.class)).getPageUTProperties();
            String tabType = getTabType();
            JSONArray a2 = com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().a(tabType);
            if (a2 != null && a2.size() > 0 && pageUTProperties != null) {
                try {
                    pageUTProperties.put("subtasks", a2.toJSONString());
                } catch (Throwable unused) {
                }
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(this.node, "Page_videointeract");
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(this.node, pageUTProperties);
            this.mFluidInstance.onPause();
            this.mFluidInstance.onStop();
            com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().a(tabType, pageUTProperties);
            com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().b(tabType);
            ((ILifecycleService) this.mFluidInstance.getService(ILifecycleService.class)).getConfig().a(false);
            setEnableTabBarPullIntercept(false);
        }
    }

    private void reLayoutForVirtualNavigationBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c8f307", new Object[]{this});
        } else if (getFlexBoxNode() == null || !com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.d()) {
        } else {
            spz.c(TAG, "执行了Relayout");
            getFlexBoxNode().e();
        }
    }

    private String replaceSourceForLauncher(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1d8deb7", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!z || !str.contains(URL_SOURCE_COMMUNITY)) {
            return str;
        }
        String replace = str.replace(URL_SOURCE_COMMUNITY, URL_SOURCE_PICK);
        spz.c(TAG, "oldUrl:" + str + "\n newUrl:" + replace);
        return replace;
    }

    private void sendImmersiveVideoMsg(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b3945", new Object[]{this, map});
            return;
        }
        spz.c(TAG, "PickPreloadController,发送给Node节点消息");
        if (this.node != null && this.node.k() != null && !ogv.a(map)) {
            sendMessage(this.node, "onvideolistmsg", null, map, null);
        }
        reLayoutForVirtualNavigationBar();
    }

    private void sendWenCardToRootMsg(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4215f762", new Object[]{this, map});
            return;
        }
        spz.c(TAG, "[webcomponent],发送给Node节点消息");
        if (this.node != null && this.node.k() != null && !ogv.a(map)) {
            sendMessage(this.node, "ongame", null, map, null);
        }
        reLayoutForVirtualNavigationBar();
    }

    private void setAppForegroundChangedCallback(boolean z) {
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e601dfd6", new Object[]{this, new Boolean(z)});
        } else if (!com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.a() || (n = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n()) == null) {
        } else {
            if (z) {
                pio.a(pio.GG_VIDEOTAB_VIDEO_APP_FOREGROUND_CHANGED);
                spz.c(TAG, "PickPreloadController,注册前后台切换回调");
                n.a(this.changedCallback);
                return;
            }
            spz.c(TAG, "PickPreloadController,解注册前后台切换回调");
            n.b(this.changedCallback);
            pio.b(pio.GG_VIDEOTAB_VIDEO_APP_FOREGROUND_CHANGED);
        }
    }

    private void setPreRequestOnPageCreate(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1010bc35", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        spz.c(TAG, "PickPreloadControllerNew isDefaultTab3:" + z);
        if (!TextUtils.equals(((a) this.viewParams).i, "video")) {
            return;
        }
        if (!z && !z2 && !z3) {
            return;
        }
        this.mQuickRender = true;
        IContainerService iContainerService = this.mContainerService;
        if (iContainerService == null) {
            return;
        }
        iContainerService.getConfig().c(true);
    }

    private void triggerDisAppearIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ab7344", new Object[]{this});
        } else if (!this.mIsCurrentAppear || !oeb.a("ShortVideo.fixDisappearLifeCycle", true)) {
        } else {
            spz.c(TAG, "triggerDisAppearIfNeeded");
            this.mIsCurrentAppear = false;
            this.mPageAppear = false;
            onDisAppear();
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12579a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public boolean f;
        public Map g;
        public Map h;
        public String i = "video";
        public String j;
        public String k;

        static {
            kge.a(-103921764);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            this.g = null;
            this.h = null;
            super.a(context, hashMap);
            if (sjt.u()) {
                this.am = ohd.h(context);
            } else if (!com.taobao.android.fluid.framework.hostcontainer.tnode.component.a.a(this.e, this.k)) {
            } else {
                this.ar = 0.0f;
                this.am = ohd.h(context);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            if (r9.equals("topbarTopY") != false) goto L11;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent.a.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
