package com.taobao.avplayer.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWNetworkAdapter;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.ad;
import com.taobao.avplayer.ai;
import com.taobao.avplayer.ak;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.component.h5.DWWVUCWebView;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.h;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.a;
import com.taobao.media.MediaAdapteManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.taobaoavsdk.cache.library.p;
import com.taobao.taobaoavsdk.widget.media.c;
import com.taobao.weex.utils.WXViewUtils;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;
import tb.kcj;
import tb.kck;
import tb.kcl;
import tb.kge;
import tb.kxd;
import tb.sku;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes6.dex */
public class DWVideoPlayerApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bk mDWInstance;

    /* renamed from: com.taobao.avplayer.plugin.DWVideoPlayerApiPlugin$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16606a = new int[DWVideoScreenType.values().length];

        static {
            try {
                f16606a[DWVideoScreenType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16606a[DWVideoScreenType.PORTRAIT_FULL_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16606a[DWVideoScreenType.LANDSCAPE_FULL_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-1552428902);
    }

    public static /* synthetic */ Object ipc$super(DWVideoPlayerApiPlugin dWVideoPlayerApiPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ bk access$000(DWVideoPlayerApiPlugin dWVideoPlayerApiPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("146c1206", new Object[]{dWVideoPlayerApiPlugin}) : dWVideoPlayerApiPlugin.mDWInstance;
    }

    public static /* synthetic */ bk access$002(DWVideoPlayerApiPlugin dWVideoPlayerApiPlugin, bk bkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bk) ipChange.ipc$dispatch("443c8ec8", new Object[]{dWVideoPlayerApiPlugin, bkVar});
        }
        dWVideoPlayerApiPlugin.mDWInstance = bkVar;
        return bkVar;
    }

    public static /* synthetic */ Context access$100(DWVideoPlayerApiPlugin dWVideoPlayerApiPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8b3930e7", new Object[]{dWVideoPlayerApiPlugin}) : dWVideoPlayerApiPlugin.mContext;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (wVCallBackContext == null) {
            return false;
        }
        if ("openInteractVideo".equals(str)) {
            return openVideoPlayer(str2, wVCallBackContext);
        }
        if ("closeInteractVideo".equals(str)) {
            return closeVideoLayer();
        }
        if ("closeWebViewLayer".equals(str)) {
            return closeWebViewLayer();
        }
        if (kxd.GET_CONFIG_PREFIX.equals(str)) {
            return getConfig(wVCallBackContext);
        }
        if ("getJsData".equals(str)) {
            return getJsData(wVCallBackContext);
        }
        if ("syncData".equals(str)) {
            return syncData(str2);
        }
        if ("setPenetrateAlpha".equals(str)) {
            return setPenetrateAlpha(str2);
        }
        if ("getUTParams".equals(str)) {
            return getUTParams(wVCallBackContext);
        }
        if ("utExpose".equals(str)) {
            return utExpose(str2);
        }
        if ("commitAlarm".equals(str)) {
            return commitAlarm(str2);
        }
        if ("getProxyVideoSrc".equals(str)) {
            return getProxyVideoSrc(str2, wVCallBackContext);
        }
        try {
            if ("debugTbMediaPlayer".equals(str)) {
                try {
                    SharedPreferences.Editor edit = this.mContext.getSharedPreferences("PLAYERINFO", 0).edit();
                    JSONObject jSONObject = (JSONObject) JSONObject.parse(str2);
                    boolean parseBoolean = (jSONObject == null || jSONObject.get("isShowDWPlayerDebugView") == null) ? false : Boolean.parseBoolean(jSONObject.get("isShowDWPlayerDebugView").toString());
                    boolean parseBoolean2 = (jSONObject == null || jSONObject.get("cleanDWLastFreeFlowTipTime") == null) ? false : Boolean.parseBoolean(jSONObject.get("cleanDWLastFreeFlowTipTime").toString());
                    edit.putBoolean("OPENDEBUG", parseBoolean);
                    edit.putBoolean("cleanDWLastFreeFlowTipTime", parseBoolean2);
                    edit.apply();
                    wVCallBackContext.success();
                    return true;
                } catch (Exception unused) {
                    wVCallBackContext.error();
                }
            }
            return false;
        } catch (Exception unused2) {
            wVCallBackContext.error();
            return false;
        }
    }

    private boolean getProxyVideoSrc(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e8b3e53", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (TextUtils.isEmpty(str) || wVCallBackContext == null || this.mContext == null) {
            wVCallBackContext.error();
            return false;
        }
        try {
            HashMap hashMap = (HashMap) JSONObject.parseObject(str, HashMap.class);
            String str2 = null;
            String obj = hashMap.get("videoUrl") == null ? null : hashMap.get("videoUrl").toString();
            if (TextUtils.isEmpty(obj)) {
                wVCallBackContext.error("video url is empty");
                return false;
            }
            if (hashMap.get("cacheKey") != null) {
                str2 = hashMap.get("cacheKey").toString();
            }
            c cVar = new c("DWVideo_H5");
            com.taobao.avplayer.c cVar2 = new com.taobao.avplayer.c();
            cVar.o = cVar2.g() && MediaAdapteManager.mABTestAdapter != null && "useTBNet".equals(MediaAdapteManager.mABTestAdapter.getBucket("dwinstance_proxynet_component", "dwinstance_proxynet_module"));
            if (TextUtils.isEmpty(str2)) {
                str2 = p.e(obj);
            }
            cVar.r = str2;
            cVar.t = kcj.a(new ai().b());
            if (cVar2.a() && !obj.contains(".m3u8") && !TextUtils.isEmpty(cVar.r) && obj.startsWith("http") && "h5UseCache".equals(MediaAdapteManager.mABTestAdapter.getBucket("h5UseCacheComponent", "h5UseCacheModule"))) {
                String proxyVideoUrl = MonitorMediaPlayer.getProxyVideoUrl(this.mContext, cVar, obj);
                if (TextUtils.isEmpty(proxyVideoUrl)) {
                    wVCallBackContext.error("getProxyUrl error");
                    return false;
                }
                r rVar = new r();
                rVar.a("proxyVideoSrc", proxyVideoUrl);
                wVCallBackContext.success(rVar);
                return true;
            }
            wVCallBackContext.error("getProxyUrl error");
            return false;
        } catch (Exception unused) {
            wVCallBackContext.error("getProxyUrl error");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Map] */
    public boolean utExpose(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e9a7198", new Object[]{this, str})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = null;
        HashMap hashMap = new HashMap();
        try {
            HashMap hashMap2 = (HashMap) JSONObject.parseObject(str, HashMap.class);
            Object obj = hashMap2.get("page");
            if (obj != null) {
                str2 = obj.toString();
            }
            Object obj2 = hashMap2.get("args");
            if (obj2 instanceof JSONObject) {
                hashMap = (Map) JSONObject.parseObject(((JSONObject) obj2).toJSONString(), HashMap.class);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
        uTCustomHitBuilder.setEventPage(str2);
        uTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        return true;
    }

    public boolean setPenetrateAlpha(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea685b6d", new Object[]{this, str})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.mWebView instanceof DWWVUCWebView) {
            DWWVUCWebView dWWVUCWebView = (DWWVUCWebView) this.mWebView;
            Object obj = ((HashMap) JSONObject.parseObject(str, HashMap.class)).get("alpha");
            if (obj != null) {
                dWWVUCWebView.setPenetrateAlpha(obj.toString());
            }
        }
        return true;
    }

    public boolean syncData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30e109ba", new Object[]{this, str})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.mWebView instanceof DWWVUCWebView) {
            DWWVUCWebView dWWVUCWebView = (DWWVUCWebView) this.mWebView;
            dWWVUCWebView.getDWContext();
            DWComponent dWComponent = dWWVUCWebView.getDWComponent();
            int i = AnonymousClass2.f16606a[dWComponent.screenType().ordinal()];
            if (i == 1) {
                DWComponent a2 = ((DWWVUCWebView) this.mWebView).getDWContext().getDWComponentManager().a(dWComponent.getDWComponentInstance(), DWVideoScreenType.NORMAL, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                if (a2 != null) {
                    a2.refreshComponent(str);
                }
                DWComponent a3 = ((DWWVUCWebView) this.mWebView).getDWContext().getDWComponentManager().a(dWComponent.getDWComponentInstance(), DWVideoScreenType.NORMAL, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                if (a3 != null) {
                    a3.refreshComponent(str);
                }
            } else if (i == 2) {
                DWComponent a4 = ((DWWVUCWebView) this.mWebView).getDWContext().getDWComponentManager().a(dWComponent.getDWComponentInstance(), DWVideoScreenType.PORTRAIT_FULL_SCREEN, DWVideoScreenType.NORMAL);
                if (a4 != null) {
                    a4.refreshComponent(str);
                }
                DWComponent a5 = ((DWWVUCWebView) this.mWebView).getDWContext().getDWComponentManager().a(dWComponent.getDWComponentInstance(), DWVideoScreenType.PORTRAIT_FULL_SCREEN, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                if (a5 != null) {
                    a5.refreshComponent(str);
                }
            } else if (i == 3) {
                DWComponent a6 = ((DWWVUCWebView) this.mWebView).getDWContext().getDWComponentManager().a(dWComponent.getDWComponentInstance(), DWVideoScreenType.LANDSCAPE_FULL_SCREEN, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                if (a6 != null) {
                    a6.refreshComponent(str);
                }
                DWComponent a7 = ((DWWVUCWebView) this.mWebView).getDWContext().getDWComponentManager().a(dWComponent.getDWComponentInstance(), DWVideoScreenType.LANDSCAPE_FULL_SCREEN, DWVideoScreenType.NORMAL);
                if (a7 != null) {
                    a7.refreshComponent(str);
                }
            }
        }
        return true;
    }

    public boolean getJsData(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a41ed1", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (wVCallBackContext == null) {
            return false;
        }
        if (this.mWebView instanceof DWWVUCWebView) {
            DWComponent dWComponent = ((DWWVUCWebView) this.mWebView).getDWComponent();
            if (dWComponent == null) {
                wVCallBackContext.error("component == null");
                return false;
            }
            r rVar = new r();
            rVar.a("jsData", dWComponent.getInteractiveObject().getJsData());
            wVCallBackContext.success(rVar);
        }
        return true;
    }

    public boolean getConfig(WVCallBackContext wVCallBackContext) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd8d2480", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (wVCallBackContext == null) {
            return false;
        }
        r rVar = new r();
        rVar.a("sdkVersion", h.f16513a);
        if (this.mWebView != null) {
            DWComponent dWComponent = ((DWWVUCWebView) this.mWebView).getDWComponent();
            float f = this.mWebView.getContext().getResources().getDisplayMetrics().density;
            rVar.a("width", Integer.toString((int) (kcl.c() / f)));
            rVar.a("height", Integer.toString((int) (kcl.d() / f)));
            DWVideoScreenType screenType = dWComponent.screenType();
            DWContext dWContext = dWComponent.getDWContext();
            int g = dWContext.getVideo().g();
            int h = dWContext.getVideo().h();
            if (screenType == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                i = kcl.b(dWContext.getActivity());
                i2 = kcl.b((Context) dWContext.getActivity());
            } else if (screenType == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                i = kcl.b((Context) dWContext.getActivity());
                i2 = kcl.b(dWContext.getActivity());
            } else {
                i = dWContext.isFloating() ? dWContext.mNormalWidth : dWContext.mWidth;
                i2 = dWContext.isFloating() ? dWContext.mNormalHeight : dWContext.mHeight;
            }
            float f2 = g / h;
            float f3 = i;
            float f4 = i2;
            float f5 = f3 / f4;
            if (dWContext.screenType() != screenType) {
                if (f2 > f5) {
                    h = (int) (f3 / f2);
                    g = i;
                } else {
                    g = (int) (f2 * f4);
                    h = i2;
                }
            }
            rVar.a("videoWidth", Integer.toString((int) (g / f)));
            rVar.a("videoHeight", Integer.toString((int) (h / f)));
            rVar.a("webViewWidth", Integer.toString((int) (f3 / f)));
            rVar.a("webViewHeight", Integer.toString((int) (f4 / f)));
            if (kck.a()) {
                AVSDKLog.d("DW_getConfig", "screenType:" + screenType + "  videoWidth:" + Integer.toString(i3) + "  videoHeight:" + Integer.toString(i4) + "  webViewWidth:" + Integer.toString(i5) + "  webViewHeight:" + Integer.toString(i6));
            }
        }
        wVCallBackContext.success(rVar);
        return true;
    }

    public boolean getUTParams(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c2cfa3", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        if (this.mWebView instanceof DWWVUCWebView) {
            r rVar = new r();
            Map<String, String> uTParams = ((DWWVUCWebView) this.mWebView).getDWContext().getUTParams();
            if (uTParams != null && uTParams.size() > 0) {
                for (Map.Entry<String, String> entry : uTParams.entrySet()) {
                    rVar.a(entry.getKey(), entry.getValue());
                }
            }
            wVCallBackContext.success(rVar);
        }
        return true;
    }

    private boolean closeWebViewLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("204ef75b", new Object[]{this})).booleanValue();
        }
        if (this.mWebView == null) {
            return false;
        }
        if (this.mWebView instanceof DWWVUCWebView) {
            ((DWWVUCWebView) this.mWebView).onDestroy();
        }
        return true;
    }

    private boolean openVideoPlayer(String str, WVCallBackContext wVCallBackContext) {
        String obj;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3d0af64", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        if (TextUtils.isEmpty(str) || this.mDWInstance != null || this.mContext == null) {
            wVCallBackContext.error();
            return false;
        }
        HashMap hashMap = (HashMap) JSONObject.parseObject(str, HashMap.class);
        String str2 = "";
        String obj2 = hashMap.get("videoUrl") == null ? str2 : hashMap.get("videoUrl").toString();
        String obj3 = hashMap.get("interactiveVideoId") == null ? str2 : hashMap.get("interactiveVideoId").toString();
        int b = kcl.b();
        Object obj4 = hashMap.get("height");
        if (obj4 != null && (obj4 instanceof String) && !TextUtils.isEmpty(String.valueOf(obj4))) {
            b = (int) Float.parseFloat(String.valueOf(obj4));
            if ((this.mContext instanceof Activity) && b >= kcl.a((Activity) this.mContext)) {
                b = kcl.a((Activity) this.mContext);
            } else if (b >= kcl.d()) {
                b = kcl.b();
            }
        }
        int screenWidth = WXViewUtils.getScreenWidth();
        Object obj5 = hashMap.get("width");
        if (obj5 != null && (obj5 instanceof String) && !TextUtils.isEmpty(String.valueOf(obj5)) && (screenWidth = (int) Float.parseFloat(String.valueOf(obj5))) >= kcl.a()) {
            screenWidth = kcl.a();
        }
        Object obj6 = hashMap.get("topMargin");
        int parseFloat = (obj6 == null || !(obj6 instanceof String) || TextUtils.isEmpty(String.valueOf(obj6))) ? 0 : (int) Float.parseFloat(String.valueOf(obj6));
        String obj7 = hashMap.get("from") == null ? "DWVideo" : hashMap.get("from").toString();
        String obj8 = hashMap.get("thumbnailSrc") == null ? str2 : hashMap.get("thumbnailSrc").toString();
        if (hashMap.get("userId") != null) {
            str2 = hashMap.get("userId").toString();
        }
        String obj9 = hashMap.get(sku.KEY_VIDEO_SOURCE) == null ? null : hashMap.get(sku.KEY_VIDEO_SOURCE).toString();
        String obj10 = hashMap.get(com.etao.feimagesearch.util.h.KEY_VIDEO_ID) == null ? null : hashMap.get(com.etao.feimagesearch.util.h.KEY_VIDEO_ID).toString();
        if (hashMap.get("contentId") == null) {
            i = parseFloat;
            obj = null;
        } else {
            obj = hashMap.get("contentId").toString();
            i = parseFloat;
        }
        String obj11 = hashMap.get("showFullScreenButton") == null ? null : hashMap.get("showFullScreenButton").toString();
        String obj12 = hashMap.get("showCloseBtn") == null ? null : hashMap.get("showCloseBtn").toString();
        String str3 = obj8;
        boolean equals = hashMap.get("showDanmakuBtn") == null ? false : "true".equals(hashMap.get("showDanmakuBtn").toString());
        boolean equals2 = hashMap.get("showLikeBtn") == null ? false : "true".equals(hashMap.get("showLikeBtn").toString());
        boolean equals3 = hashMap.get("showReportBtn") == null ? false : "true".equals(hashMap.get("showReportBtn").toString());
        boolean equals4 = hashMap.get("showGoodsListBtn") == null ? false : "true".equals(hashMap.get("showGoodsListBtn").toString());
        HashMap<String, String> hashMap2 = new HashMap<>();
        boolean z = equals4;
        hashMap2.put("interactId", obj3);
        hashMap2.put("videoUrl", obj2);
        hashMap2.put("height", String.valueOf(b));
        hashMap2.put("width", String.valueOf(screenWidth));
        if (!TextUtils.isEmpty(obj7)) {
            hashMap2.put("page", obj7.toLowerCase());
        }
        try {
            hashMap2.putAll((Map) hashMap.get("utParams"));
        } catch (Exception unused) {
        }
        bk.a aVar = new bk.a((Activity) this.mContext);
        aVar.a(obj2);
        if (TextUtils.isEmpty(obj3)) {
            obj3 = "0";
        }
        aVar.a(Long.parseLong(obj3));
        if (!TextUtils.isEmpty(str2)) {
            aVar.b(Long.parseLong(str2));
        }
        aVar.e(obj7);
        aVar.c(screenWidth);
        aVar.d(b);
        aVar.f(false);
        aVar.g(true);
        aVar.a(new DWNetworkAdapter());
        aVar.a(new ak());
        aVar.a(hashMap2);
        aVar.i(false);
        aVar.c(obj9);
        aVar.b(obj10);
        aVar.h(obj);
        aVar.E(equals);
        aVar.G(equals3);
        aVar.F(equals2);
        aVar.p(z);
        if (!TextUtils.isEmpty(str3)) {
            aVar.i(true);
            a aVar2 = new a();
            aVar2.a(new DWFrontCoverBean(0L, null, str3));
            aVar.a(aVar2);
        }
        aVar.n(!"false".equals(obj11));
        if (hashMap.get(HttpConstant.REFERER) != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(HttpConstant.REFERER, hashMap.get(HttpConstant.REFERER).toString());
            aVar.b(hashMap3);
        }
        this.mDWInstance = aVar.c();
        if (this.mDWInstance == null) {
            wVCallBackContext.error();
            return false;
        }
        if ("false".equals(obj12)) {
            this.mDWInstance.hideCloseView();
        }
        this.mDWInstance.setVideoLifecycleListener(new av() { // from class: com.taobao.avplayer.plugin.DWVideoPlayerApiPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj13, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj13, new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj13, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b7a5aed", new Object[]{this, obj13, new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z2)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj13) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3faee61c", new Object[]{this, obj13});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2b2d56d", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("24db3403", new Object[]{this});
                } else if (DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this) == null || DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView() == null || DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView().getParent() == null) {
                } else {
                    ((ViewGroup) DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView().getParent()).removeView(DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView());
                    DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).destroy();
                    DWVideoPlayerApiPlugin.access$002(DWVideoPlayerApiPlugin.this, null);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5dcccbde", new Object[]{this});
                } else if (DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this) == null || DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView() == null) {
                } else {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView().getLayoutParams();
                    layoutParams.topMargin = 0;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff4b0936", new Object[]{this});
                } else if (DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this) == null || DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView() == null) {
                } else {
                    ((FrameLayout.LayoutParams) DWVideoPlayerApiPlugin.access$000(DWVideoPlayerApiPlugin.this).getView().getLayoutParams()).topMargin = kcl.a(DWVideoPlayerApiPlugin.access$100(DWVideoPlayerApiPlugin.this));
                }
            }
        });
        if (this.mContext instanceof Activity) {
            ViewGroup viewGroup = (ViewGroup) ((Activity) this.mContext).getWindow().getDecorView();
            if (this.mDWInstance.getView() != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mDWInstance.getView().getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    this.mDWInstance.getView().setLayoutParams(layoutParams);
                }
                int c = kcl.c((Activity) this.mContext);
                if (c == 0) {
                    c = kcl.a(this.mContext);
                }
                layoutParams.topMargin = c + i;
                viewGroup.addView(this.mDWInstance.getView());
                this.mDWInstance.start();
                wVCallBackContext.success();
                return true;
            }
        }
        wVCallBackContext.error();
        return false;
    }

    private boolean closeVideoLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac0f0739", new Object[]{this})).booleanValue();
        }
        bk bkVar = this.mDWInstance;
        if (bkVar == null) {
            return false;
        }
        if (bkVar.getView() != null && this.mDWInstance.getView().getParent() != null) {
            ((ViewGroup) this.mDWInstance.getView().getParent()).removeView(this.mDWInstance.getView());
        }
        this.mDWInstance.destroy();
        this.mDWInstance = null;
        return true;
    }

    public boolean commitAlarm(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab4666f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            HashMap hashMap = (HashMap) JSONObject.parseObject(str, HashMap.class);
            Object obj = hashMap.get("success");
            if (obj != null) {
                z = Boolean.parseBoolean(obj.toString());
            }
            String str2 = "";
            String obj2 = hashMap.get("module") == null ? str2 : hashMap.get("module").toString();
            String obj3 = hashMap.get("monitorPoint") == null ? str2 : hashMap.get("monitorPoint").toString();
            String obj4 = hashMap.get("errMsg") == null ? str2 : hashMap.get("errMsg").toString();
            if (hashMap.get("errCode") != null) {
                str2 = hashMap.get("errCode").toString();
            }
            String str3 = str2;
            if (!z) {
                ad.a(this.mContext, obj2, obj3, false, obj4, str3);
            } else {
                ad.a(this.mContext, obj2, obj3, true, null, null);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPlayerApiPlugin);
        bk bkVar = this.mDWInstance;
        if (bkVar != null) {
            if (bkVar.getView() != null && this.mDWInstance.getView().getParent() != null) {
                ((ViewGroup) this.mDWInstance.getView().getParent()).removeView(this.mDWInstance.getView());
            }
            this.mDWInstance.destroy();
            this.mDWInstance = null;
        }
        super.onDestroy();
    }
}
