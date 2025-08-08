package com.alibaba.triver.triver_shop.weexview;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.extra.uc.WVUCWebView;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.kit.api.appmonitor.LaunchMonitorData;
import com.alibaba.triver.kit.api.utils.TRiverUrlUtils;
import com.alibaba.triver.miniapp.downgrade.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.view.listview.WXRecyclerView;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import com.taobao.weex.ui.view.refresh.wrapper.BounceRecyclerView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import tb.cbc;
import tb.ccx;
import tb.cda;
import tb.kge;

/* loaded from: classes3.dex */
public class EmbedWeexView extends BaseEmbedView implements AppDestroyPoint, AppStartPoint, WXSDKInstance.g, d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "weex-view";
    private RenderContainer b;
    private Context c;
    private TRNestedRenderContainer d;
    private ViewTreeObserver e;
    private ViewTreeObserver.OnGlobalLayoutListener f;

    /* renamed from: a  reason: collision with root package name */
    private WXSDKInstance f4152a = null;
    private List<WXSwipeLayout> g = new ArrayList();
    private FrameLayout h = null;
    private String i = "";
    private String j = "";
    private boolean k = false;
    private String l = "";
    private boolean m = false;
    private boolean n = false;
    private int o = 0;
    private int p = 0;
    private int q = 0;
    private boolean r = false;
    private Timer s = null;

    static {
        kge.a(-1893179170);
        kge.a(-1968005700);
        kge.a(2033524132);
        kge.a(-748561575);
        kge.a(-1448598136);
    }

    public static /* synthetic */ Object ipc$super(EmbedWeexView embedWeexView, String str, Object... objArr) {
        if (str.hashCode() == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : TYPE;
    }

    @Override // com.taobao.weex.WXSDKInstance.g
    public void onCreateNestInstance(WXSDKInstance wXSDKInstance, NestedContainer nestedContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e5a76", new Object[]{this, wXSDKInstance, nestedContainer});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        }
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
        }
    }

    public static /* synthetic */ int access$000(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dcd6fff", new Object[]{embedWeexView})).intValue() : embedWeexView.p;
    }

    public static /* synthetic */ int access$012(EmbedWeexView embedWeexView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("850ab50b", new Object[]{embedWeexView, new Integer(i)})).intValue();
        }
        int i2 = embedWeexView.p + i;
        embedWeexView.p = i2;
        return i2;
    }

    public static /* synthetic */ int access$100(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d20bdf9e", new Object[]{embedWeexView})).intValue() : embedWeexView.q;
    }

    public static /* synthetic */ int access$102(EmbedWeexView embedWeexView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e45bc9ad", new Object[]{embedWeexView, new Integer(i)})).intValue();
        }
        embedWeexView.q = i;
        return i;
    }

    public static /* synthetic */ Context access$200(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a60ff042", new Object[]{embedWeexView}) : embedWeexView.c;
    }

    public static /* synthetic */ String access$300(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de4bc4d7", new Object[]{embedWeexView}) : embedWeexView.l;
    }

    public static /* synthetic */ TRNestedRenderContainer access$400(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TRNestedRenderContainer) ipChange.ipc$dispatch("36dff9a4", new Object[]{embedWeexView}) : embedWeexView.d;
    }

    public static /* synthetic */ void access$500(EmbedWeexView embedWeexView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4290034b", new Object[]{embedWeexView, view});
        } else {
            embedWeexView.a(view);
        }
    }

    public static /* synthetic */ int access$600(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7440db9", new Object[]{embedWeexView})).intValue() : embedWeexView.o;
    }

    public static /* synthetic */ int access$602(EmbedWeexView embedWeexView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6295ef2", new Object[]{embedWeexView, new Integer(i)})).intValue();
        }
        embedWeexView.o = i;
        return i;
    }

    public static /* synthetic */ FrameLayout access$700(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("f1c75454", new Object[]{embedWeexView}) : embedWeexView.h;
    }

    public static /* synthetic */ Timer access$800(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timer) ipChange.ipc$dispatch("c2c6b4f0", new Object[]{embedWeexView}) : embedWeexView.s;
    }

    public static /* synthetic */ void access$900(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff5ca3", new Object[]{embedWeexView});
        } else {
            embedWeexView.g();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        try {
            RVLogger.d("EmbedWeexView", "onAppStart");
            a();
            if (this.mOuterApp.getStartParams().containsKey("appFirstWeexPage")) {
                this.n = true;
                this.mOuterApp.getStartParams().remove("appFirstWeexPage");
            }
            if (WXBridgeManager.getInstance().isJSFrameworkInit() || !ccx.q()) {
                return;
            }
            c.a(this.mOuterApp, (String) null);
        } catch (Exception e) {
            RVLogger.w(Log.getStackTraceString(e));
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = this.mOuterApp.getAppContext().getContext();
        }
        Context context = this.c;
        if (context == null || this.d != null) {
            return;
        }
        this.d = new TRNestedRenderContainer(context);
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        try {
            if (map.containsKey("url")) {
                this.i = map.get("url");
            }
            if (map.containsKey("wxData")) {
                this.j = map.get("wxData");
            }
            if (map.containsKey("snapshot")) {
                this.m = Boolean.parseBoolean(map.get("snapshot"));
            }
            if (map.containsKey("weexViewId")) {
                this.l = map.get("weexViewId");
            }
            if (!map.containsKey("isWeb")) {
                return;
            }
            this.k = Boolean.parseBoolean(map.get("isWeb"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject.containsKey("url")) {
                this.i = jSONObject.getString("url");
            }
            if (jSONObject.containsKey("wxData")) {
                this.j = jSONObject.getString("wxData");
            }
            if (jSONObject.containsKey("weexViewId")) {
                this.l = jSONObject.getString("weexViewId");
            }
            if (!jSONObject.containsKey("isWeb")) {
                return;
            }
            this.k = Boolean.parseBoolean(String.valueOf(jSONObject.get("isWeb")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        RVLogger.d("EmbedWeexView", "getView");
        a();
        a(map);
        if (this.c == null) {
            return null;
        }
        if (this.k) {
            e();
        } else {
            RVLogger.d("EmbedWeexView", "getView is snapshot");
            this.f4152a = b.a();
            WXSDKInstance wXSDKInstance = this.f4152a;
            if (wXSDKInstance != null && !this.m && !StringUtils.equals(this.i, wXSDKInstance.ak())) {
                this.f4152a = null;
            }
            if (this.f4152a != null) {
                try {
                    LaunchMonitorData d = com.alibaba.triver.kit.api.appmonitor.a.d(this.mOuterApp);
                    if (this.m && d != null) {
                        d.addPoint("weexSnapshotHit");
                    }
                    RVLogger.e(DXMonitorConstant.DX_MONITOR_RENDER, "template version miss , will not use preload webView");
                    Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
                    if (applicationContext != null && com.alibaba.triver.kit.api.utils.c.a(applicationContext)) {
                        Toast.makeText(applicationContext, "weex-view 命中Snapshot", 1).show();
                    }
                } catch (Throwable unused) {
                }
                this.f4152a.am().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.i = this.f4152a.ak();
                this.d.removeAllViews();
                this.d.addView(this.f4152a.am());
                b();
                f();
                RVLogger.e("EmbedWeexView", "weex-view命中Snapshot，url is：" + this.i);
            } else {
                b(map);
            }
        }
        this.d.setWeexViewID(this.l);
        this.d.setRender(getOuterPage().getRender());
        return this.d;
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        RVLogger.e("EmbedWeexView", "getView snapshot false，url is " + this.i);
        this.b = new RenderContainer(this.c);
        this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f4152a = new WXSDKInstance(this.c);
        this.f4152a.a(this.b);
        this.f4152a.c(true);
        this.f4152a.a((d) this);
        this.d.removeAllViews();
        this.d.addView(this.b);
        Page outerPage = getOuterPage();
        if (outerPage != null) {
            this.f4152a.ar().b.put(com.alibaba.triver.triver_shop.adapter.c.MINIAPP_ORI_URL_KEY, outerPage.getApp().getStartParams().getString("ori_url"));
        }
        this.f4152a.a(com.alibaba.triver.triver_shop.adapter.c.a());
        d();
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.f4152a == null) {
                return;
            }
            this.f4152a.a(new OnWXScrollListener() { // from class: com.alibaba.triver.triver_shop.weexview.EmbedWeexView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.common.OnWXScrollListener
                public void onScrollStateChanged(View view, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b177cda7", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }

                @Override // com.taobao.weex.common.OnWXScrollListener
                public void onScrolled(View view, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f253d1c0", new Object[]{this, view, new Integer(i), new Integer(i2)});
                        return;
                    }
                    try {
                        EmbedWeexView.access$012(EmbedWeexView.this, i2);
                        if (Math.abs(EmbedWeexView.access$100(EmbedWeexView.this) - EmbedWeexView.access$000(EmbedWeexView.this)) > 200) {
                            EmbedWeexView.access$102(EmbedWeexView.this, EmbedWeexView.access$000(EmbedWeexView.this));
                            if (EmbedWeexView.access$200(EmbedWeexView.this) != null && EmbedWeexView.this.getOuterPage() != null && EmbedWeexView.this.getOuterPage().getRender() != null && (EmbedWeexView.this.getOuterPage().getRender() instanceof cda)) {
                                if (StringUtils.isEmpty(EmbedWeexView.access$300(EmbedWeexView.this))) {
                                    EmbedWeexView.this.getOuterPage().getRender().a("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window.__WEEX_SCROLL__(" + cbc.b(EmbedWeexView.access$200(EmbedWeexView.this), EmbedWeexView.access$000(EmbedWeexView.this)) + ")}");
                                } else {
                                    EmbedWeexView.this.getOuterPage().getRender().a("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(" + EmbedWeexView.access$300(EmbedWeexView.this) + ")__'](" + cbc.b(EmbedWeexView.access$200(EmbedWeexView.this), EmbedWeexView.access$000(EmbedWeexView.this)) + ")}");
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            this.f4152a.a((WXSDKInstance.g) this);
            this.f4152a.a((d) this);
            View decorView = this.mOuterPage.getRender().getActivity().getWindow().getDecorView();
            if (decorView == null) {
                return;
            }
            this.e = decorView.getViewTreeObserver();
            this.f = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.alibaba.triver.triver_shop.weexview.EmbedWeexView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    EmbedWeexView embedWeexView = EmbedWeexView.this;
                    EmbedWeexView.access$500(embedWeexView, EmbedWeexView.access$400(embedWeexView));
                }
            };
            this.e.addOnGlobalLayoutListener(this.f);
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (this.f4152a == null) {
                return;
            }
            if (this.e != null) {
                this.e.removeGlobalOnLayoutListener(this.f);
            }
            this.f = null;
            this.e = null;
            this.f4152a.a((d) null);
            this.f4152a.a((WXSDKInstance.g) null);
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        try {
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof BounceRecyclerView) && ((BounceRecyclerView) childAt).getInnerView() != null) {
                    if (this.d != null) {
                        this.d.setRecyclerView((RecyclerView) ((BounceRecyclerView) childAt).getInnerView());
                        this.d.setUrl(this.i);
                    }
                    ((WXRecyclerView) ((BounceRecyclerView) childAt).getInnerView()).addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.alibaba.triver.triver_shop.weexview.EmbedWeexView.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                            if (str.hashCode() == 806944192) {
                                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                                return;
                            }
                            super.onScrolled(recyclerView, i2, i3);
                            if (recyclerView == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() != 0 || EmbedWeexView.access$400(EmbedWeexView.this) == null) {
                                return;
                            }
                            EmbedWeexView.access$400(EmbedWeexView.this).setScrollOnTop(true);
                        }
                    });
                }
                if (childAt instanceof WXSwipeLayout) {
                    WXSwipeLayout wXSwipeLayout = (WXSwipeLayout) childAt;
                    if (!this.g.contains(wXSwipeLayout)) {
                        this.g.add(wXSwipeLayout);
                        if (StringUtils.indexOf(this.i, "isNestCategory=true") > 0) {
                            this.h = (FrameLayout) wXSwipeLayout.getParent().getParent().getParent().getParent().getParent().getParent().getParent();
                        }
                        wXSwipeLayout.addOnRefreshOffsetChangedListener(new WXSwipeLayout.OnRefreshOffsetChangedListener() { // from class: com.alibaba.triver.triver_shop.weexview.EmbedWeexView.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.OnRefreshOffsetChangedListener
                            public void onOffsetChanged(int i2) {
                                cda render;
                                StringBuilder sb;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("25f4d19a", new Object[]{this, new Integer(i2)});
                                    return;
                                }
                                try {
                                    if (i2 != EmbedWeexView.access$600(EmbedWeexView.this) && EmbedWeexView.this.getOuterPage() != null && EmbedWeexView.this.getOuterPage().getRender() != null && (EmbedWeexView.this.getOuterPage().getRender() instanceof cda)) {
                                        if (EmbedWeexView.access$700(EmbedWeexView.this) != null) {
                                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) EmbedWeexView.access$700(EmbedWeexView.this).getLayoutParams();
                                            layoutParams.topMargin = i2;
                                            EmbedWeexView.access$700(EmbedWeexView.this).setLayoutParams(layoutParams);
                                        }
                                        if (StringUtils.isEmpty(EmbedWeexView.access$300(EmbedWeexView.this))) {
                                            render = (cda) EmbedWeexView.this.getOuterPage().getRender();
                                            sb = new StringBuilder();
                                            sb.append("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window.__WEEX_SCROLL__(");
                                            sb.append(cbc.b(EmbedWeexView.access$200(EmbedWeexView.this), -i2));
                                            sb.append(")}");
                                        } else {
                                            render = EmbedWeexView.this.getOuterPage().getRender();
                                            sb = new StringBuilder();
                                            sb.append("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(");
                                            sb.append(EmbedWeexView.access$300(EmbedWeexView.this));
                                            sb.append(")__'](");
                                            sb.append(cbc.b(EmbedWeexView.access$200(EmbedWeexView.this), -i2));
                                            sb.append(")}");
                                        }
                                        render.a(sb.toString());
                                        EmbedWeexView.access$602(EmbedWeexView.this, i2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                } else {
                    a(childAt);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f4152a != null) {
            RVLogger.d("EmbedWeexView", "renderWeexPage url is: " + this.i);
            this.g.clear();
            HashMap hashMap = new HashMap();
            hashMap.put("bundleUrl", this.i);
            this.f4152a.c("WeexEmbedView", this.i, hashMap, this.j, WXRenderStrategy.APPEND_ASYNC);
        } else {
            RVLogger.d("EmbedWeexView", "renderWeexPage instance is null");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "onAttachedToWebView");
        WXSDKInstance wXSDKInstance = this.f4152a;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityResume();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "onDetachedToWebView");
        WXSDKInstance wXSDKInstance = this.f4152a;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityStop();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        try {
            if (jSONObject.getBoolean("triggerRefreshHide").booleanValue()) {
                for (final WXSwipeLayout wXSwipeLayout : this.g) {
                    if (wXSwipeLayout != null) {
                        ((RVExecutorService) RVProxy.get(RVExecutorService.class)).getExecutor(ExecutorType.UI).execute(new Runnable() { // from class: com.alibaba.triver.triver_shop.weexview.EmbedWeexView.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                WXSwipeLayout wXSwipeLayout2 = wXSwipeLayout;
                                if (wXSwipeLayout2 == null) {
                                    return;
                                }
                                wXSwipeLayout2.finishPullRefresh();
                            }
                        });
                    }
                }
            }
        } catch (Exception e) {
            RVLogger.w(Log.getStackTraceString(e));
        }
        RVLogger.d("EmbedWeexView", jSONObject.toJSONString());
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
            return;
        }
        RVLogger.d("EmbedWeexView", "onRecivedRender : " + jSONObject);
        a(jSONObject);
        if (this.f4152a == null || !this.m || StringUtils.isEmpty(this.i) || !StringUtils.isEmpty(this.f4152a.ak())) {
            return;
        }
        d();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "resume");
        WXSDKInstance wXSDKInstance = this.f4152a;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResume();
        }
        if (this.d == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.d.invalidate();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "pause");
        WXSDKInstance wXSDKInstance = this.f4152a;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityPause();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onWeexView visibility changed : ");
        sb.append(i == 0 ? "visible" : "invisible");
        RVLogger.d("EmbedWeexView", sb.toString());
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else {
            f();
        }
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
        } else if (!WeexPageFragment.shouldDegrade(wXSDKInstance, str, str2)) {
        } else {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            if (this.c == null || this.d == null) {
                return;
            }
            if (!StringUtils.isEmpty(this.i) && this.i.indexOf("ignore2006=1") >= 0 && this.mOuterApp != null && (this.mOuterApp.getAppContext().getContext() instanceof Activity)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(this.mOuterApp.getAppContext().getContext(), UTPageStatus.UT_H5_IN_WebView);
            }
            WVUCWebView wVUCWebView = new WVUCWebView(this.c);
            wVUCWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            wVUCWebView.loadUrl(this.i);
            this.d.removeAllViews();
            this.d.addView(wVUCWebView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "destroy");
        try {
            if (this.f4152a != null) {
                this.f4152a.onActivityDestroy();
                this.f4152a = null;
            }
            if (this.s != null) {
                this.s.cancel();
            }
            this.g.clear();
            c();
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
        try {
            if (this.d == null) {
                return;
            }
            this.d.destroy();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (!this.n || this.r) {
                return;
            }
            if (this.s != null) {
                this.s.cancel();
            } else {
                this.s = new Timer();
            }
            this.s.schedule(new TimerTask() { // from class: com.alibaba.triver.triver_shop.weexview.EmbedWeexView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private long b = 0;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (this.b == 0) {
                            this.b = System.currentTimeMillis();
                        }
                        if (System.currentTimeMillis() - this.b >= 5000 && EmbedWeexView.access$800(EmbedWeexView.this) != null) {
                            EmbedWeexView.access$800(EmbedWeexView.this).cancel();
                        }
                        EmbedWeexView.access$900(EmbedWeexView.this);
                    } catch (Throwable unused) {
                    }
                }
            }, 100L, 100L);
            this.r = true;
        } catch (Exception e) {
            RVLogger.w(Log.getStackTraceString(e));
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            if (!this.f4152a.ar().f23517a.containsKey("wxInteraction")) {
                return;
            }
            this.f4152a.ar().f23517a.get("wxInteraction").longValue();
        } catch (Exception e) {
            RVLogger.w(Log.getStackTraceString(e));
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppDestroyPoint
    public void onAppDestroy(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffc9373", new Object[]{this, app});
            return;
        }
        RVLogger.d("EmbedWeexView", "onAppDestroy");
        b.b();
        List<WXSwipeLayout> list = this.g;
        if (list == null) {
            return;
        }
        list.clear();
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppStartPoint
    public void onAppStart(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a9c35b", new Object[]{this, app});
            return;
        }
        try {
            if (!TRiverUrlUtils.l(app)) {
                return;
            }
            app.getStartParams().putBoolean("appFirstWeexPage", true);
        } catch (Exception e) {
            RVLogger.w(Log.getStackTraceString(e));
        }
    }
}
