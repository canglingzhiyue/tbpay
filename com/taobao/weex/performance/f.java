package com.taobao.weex.performance;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXPerformance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;
import tb.mto;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PAGE_ANIM_BACK_NUM = "wxAnimationInBackCount";
    public static final String KEY_PAGE_PROPERTIES_BIZ_ID = "wxBizID";
    public static final String KEY_PAGE_PROPERTIES_BUBDLE_URL = "wxBundleUrl";
    public static final String KEY_PAGE_PROPERTIES_BUNDLE_TYPE = "wxBundleType";
    public static final String KEY_PAGE_PROPERTIES_CACHE_INFO = "wxZCacheInfo";
    public static final String KEY_PAGE_PROPERTIES_CACHE_TYPE = "wxCacheType";
    public static final String KEY_PAGE_PROPERTIES_CONTAINER_NAME = "wxContainerName";
    public static final String KEY_PAGE_PROPERTIES_INSTANCE_TYPE = "wxInstanceType";
    public static final String KEY_PAGE_PROPERTIES_JSLIB_VERSION = "wxJSLibVersion";
    public static final String KEY_PAGE_PROPERTIES_JS_FM_INI = "wxJsFrameworkInit";
    public static final String KEY_PAGE_PROPERTIES_PARENT_PAGE = "wxParentPage";
    public static final String KEY_PAGE_PROPERTIES_RENDER_TYPE = "wxRenderType";
    public static final String KEY_PAGE_PROPERTIES_REQUEST_TYPE = "wxRequestType";
    public static final String KEY_PAGE_PROPERTIES_UIKIT_TYPE = "wxUIKitType";
    public static final String KEY_PAGE_PROPERTIES_WEEX_VERSION = "wxSDKVersion";
    public static final String KEY_PAGE_STAGES_CONTAINER_READY = "wxContainerReady";
    public static final String KEY_PAGE_STAGES_CREATE_FINISH = "wxJSBundleCreateFinish";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_END = "wxCreateInstanceEnd";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_START = "wxCreateInstanceStart";
    public static final String KEY_PAGE_STAGES_CUSTOM_PREPROCESS_END = "wxCustomPreprocessEnd";
    public static final String KEY_PAGE_STAGES_CUSTOM_PREPROCESS_START = "wxCustomPreprocessStart";
    public static final String KEY_PAGE_STAGES_DESTROY = "wxDestroy";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_END = "wxEndDownLoadBundle";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_START = "wxStartDownLoadBundle";
    public static final String KEY_PAGE_STAGES_END_EXCUTE_BUNDLE = "wxEndExecuteBundle";
    public static final String KEY_PAGE_STAGES_FIRST_INTERACTION_VIEW = "wxFirstInteractionView";
    public static final String KEY_PAGE_STAGES_FSRENDER = "wxFsRender";
    public static final String KEY_PAGE_STAGES_INTERACTION = "wxInteraction";
    public static final String KEY_PAGE_STAGES_INTERACTION_TM = "wxInteractionTimeStamp";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_END = "wxEndLoadBundle";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_START = "wxStartLoadBundle";
    public static final String KEY_PAGE_STAGES_NEW_FSRENDER = "wxNewFsRender";
    public static final String KEY_PAGE_STAGES_REMOTE_INSTALL_END = "wxRemoteInstallEnd";
    public static final String KEY_PAGE_STAGES_REMOTE_INSTALL_START = "wxRemoteInstallStart";
    public static final String KEY_PAGE_STAGES_RENDER_ORGIGIN = "wxRenderTimeOrigin";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_END = "wxUnicornEngineInitEnd";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_START = "wxUnicornEngineInitStart";
    public static final String KEY_PAGE_STATS_ACTUAL_DOWNLOAD_TIME = "wxActualNetworkTime";
    public static final String KEY_PAGE_STATS_API_USE_QJS_BYTE_CODE = "wxApiUseQJSByteCode";
    public static final String KEY_PAGE_STATS_BODY_RATIO = "wxBodyRatio";
    public static final String KEY_PAGE_STATS_BUNDLE_SIZE = "wxBundleSize";
    public static final String KEY_PAGE_STATS_CELL_DATA_UN_RECYCLE_NUM = "wxCellDataUnRecycleCount";
    public static final String KEY_PAGE_STATS_CELL_EXCEED_NUM = "wxCellExceedNum";
    public static final String KEY_PAGE_STATS_CELL_UN_RE_USE_NUM = "wxCellUnReUseCount";
    public static final String KEY_PAGE_STATS_COMPONENT_CREATE_COST = "wxComponentCost";
    public static final String KEY_PAGE_STATS_EMBED_COUNT = "wxEmbedCount";
    public static final String KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST = "wxExecJsCallBack";
    public static final String KEY_PAGE_STATS_FS_CALL_EVENT_NUM = "wxFSCallEventTotalNum";
    public static final String KEY_PAGE_STATS_FS_CALL_JS_NUM = "wxFSCallJsTotalNum";
    public static final String KEY_PAGE_STATS_FS_CALL_JS_TIME = "wxFSCallJsTotalTime";
    public static final String KEY_PAGE_STATS_FS_CALL_NATIVE_NUM = "wxFSCallNativeTotalNum";
    public static final String KEY_PAGE_STATS_FS_CALL_NATIVE_TIME = "wxFSCallNativeTotalTime";
    public static final String KEY_PAGE_STATS_FS_REQUEST_NUM = "wxFSRequestNum";
    public static final String KEY_PAGE_STATS_FS_TIMER_NUM = "wxFSTimerCount";
    public static final String KEY_PAGE_STATS_IMG_LOAD_FAIL_NUM = "wxImgLoadFailCount";
    public static final String KEY_PAGE_STATS_IMG_LOAD_NUM = "wxImgLoadCount";
    public static final String KEY_PAGE_STATS_IMG_LOAD_SUCCESS_NUM = "wxImgLoadSuccessCount";
    public static final String KEY_PAGE_STATS_IMG_UN_RECYCLE_NUM = "wxImgUnRecycleCount";
    public static final String KEY_PAGE_STATS_I_ALL_VIEW_COUNT = "wxInteractionAllViewCount";
    public static final String KEY_PAGE_STATS_I_COMPONENT_CREATE_COUNT = "wxInteractionComponentCreateCount";
    public static final String KEY_PAGE_STATS_I_SCREEN_VIEW_COUNT = "wxInteractionScreenViewCount";
    public static final String KEY_PAGE_STATS_JSLIB_INIT_TIME = "wxJSLibInitTime";
    public static final String KEY_PAGE_STATS_LARGE_IMG_COUNT = "wxLargeImgMaxCount";
    public static final String KEY_PAGE_STATS_LAYOUT_TIME = "wxLayoutTime";
    public static final String KEY_PAGE_STATS_MAX_COMPONENT_NUM = "wxMaxComponentCount";
    public static final String KEY_PAGE_STATS_MAX_DEEP_DOM = "wxMaxDeepVDomLayer";
    public static final String KEY_PAGE_STATS_MAX_DEEP_VIEW = "wxMaxDeepViewLayer";
    public static final String KEY_PAGE_STATS_NET_FAIL_NUM = "wxNetworkRequestFailCount";
    public static final String KEY_PAGE_STATS_NET_NUM = "wxNetworkRequestCount";
    public static final String KEY_PAGE_STATS_NET_SUCCESS_NUM = "wxNetworkRequestSuccessCount";
    public static final String KEY_PAGE_STATS_SCRIPT_USE_QJS_BYTE_CODE = "wxScriptUseQJSByteCode";
    public static final String KEY_PAGE_STATS_SCROLLER_NUM = "wxScrollerCount";
    public static final String KEY_PAGE_STATS_SDK_INIT_TASK_TIME = "wxSDKInitTaskTime";
    public static final String KEY_PAGE_STATS_SDK_INIT_TOTAL_TIME = "wxSDKInitTotalTime";
    public static final String KEY_PAGE_STATS_VIEW_CREATE_COST = "wxViewCost";
    public static final String KEY_PAGE_STATS_WAIT_INIT_TIME = "wxWaitInitTime";
    public static final String KEY_PAGE_STATS_WRONG_IMG_SIZE_COUNT = "wxWrongImgSizeCount";
    public static final String KEY_PAGE_TIMER_BACK_NUM = "wxTimerInBackCount";
    public static final String KEY_PROPERTIES_ERROR_CODE = "wxErrorCode";
    public static final String VALUE_BUNDLE_LOAD_LENGTH = "wxLoadedLength";
    public static final String VALUE_ERROR_CODE_DEFAULT = "0";
    public static final String WEEX_FIRSTSCREENPAINT = "Weex_firstScreenPaint";
    public static final String WEEX_PAGE_TOPIC = "weex_page";
    public Rect d;
    public String e;
    public boolean g;
    public long i;
    public long j;
    private String l;
    private c m;
    private boolean p;
    private double u;
    private long v;
    private long w;
    private long x;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    public boolean c = false;
    public boolean f = false;
    public Set<String> h = new CopyOnWriteArraySet();
    private boolean y = false;
    private boolean z = false;
    public volatile boolean k = true;
    private Runnable A = new Runnable() { // from class: com.taobao.weex.performance.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.this.l();
            }
        }
    };
    private Runnable B = new Runnable() { // from class: com.taobao.weex.performance.f.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.this.i();
            }
        }
    };
    private long C = 0;
    public final Map<String, Object> b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f23517a = new ConcurrentHashMap();
    private Handler t = new Handler(Looper.getMainLooper());
    private Map<String, Double> n = new ConcurrentHashMap();
    private Map<String, Object> o = new ConcurrentHashMap();

    static {
        kge.a(-336819602);
    }

    public f(String str) {
        this.l = str;
        a apmGenerater = WXSDKManager.getInstance().getApmGenerater();
        if (apmGenerater != null) {
            this.m = apmGenerater.a("weex_page");
            c cVar = this.m;
            if (cVar == null) {
                return;
            }
            cVar.a(this.l);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = true;
        if (z) {
            a("wxStartDownLoadBundle");
        }
        b();
        for (Map.Entry<String, Long> entry : this.f23517a.entrySet()) {
            b(entry.getKey(), entry.getValue().longValue());
        }
        for (Map.Entry<String, Double> entry2 : this.n.entrySet()) {
            e(entry2.getKey(), entry2.getValue().doubleValue());
        }
        for (Map.Entry<String, Object> entry3 : this.o.entrySet()) {
            b(entry3.getKey(), entry3.getValue());
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, WXUtils.getFixUnixTime());
        }
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (this.r || str == null) {
        } else {
            this.f23517a.put(str, Long.valueOf(j));
            if (!this.k) {
                return;
            }
            b(str, j);
        }
    }

    private void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
            return;
        }
        if (e.f23516a) {
            e.a(this.l, "stage", str, Long.valueOf(j));
        }
        if ("wxRenderTimeOrigin".equalsIgnoreCase(str)) {
            this.t.postDelayed(this.A, 8000L);
        }
        c cVar = this.m;
        if (cVar == null) {
            return;
        }
        cVar.a(str, j);
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (this.r || str == null || obj == null) {
        } else {
            this.o.put(str, obj);
            if (!this.k) {
                return;
            }
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
            return;
        }
        if (e.f23516a) {
            e.a(this.l, "properties", str, obj);
        }
        c cVar = this.m;
        if (cVar == null) {
            return;
        }
        cVar.a(str, obj);
    }

    public void a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81239a4c", new Object[]{this, str, new Double(d)});
        } else if (this.r || str == null) {
        } else {
            this.n.put(str, Double.valueOf(d));
            if (!this.k) {
                return;
            }
            e(str, d);
        }
    }

    private void e(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7129d5c8", new Object[]{this, str, new Double(d)});
            return;
        }
        if (e.f23516a) {
            e.a(this.l, "stats", str, Double.valueOf(d));
        }
        c cVar = this.m;
        if (cVar == null) {
            return;
        }
        cVar.a(str, d);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.q;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.k && !this.q) {
            this.q = true;
            c cVar = this.m;
            if (cVar == null) {
                return;
            }
            cVar.a(this.l);
            WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.l);
            a("wxBundleUrl", wXSDKInstance == null ? "unKnowUrl" : wXSDKInstance.ak());
            a("wxErrorCode", "0");
            a(KEY_PAGE_PROPERTIES_JSLIB_VERSION, WXEnvironment.JS_LIB_SDK_VERSION);
            a(KEY_PAGE_PROPERTIES_WEEX_VERSION, WXEnvironment.WXSDK_VERSION);
            a(KEY_PAGE_PROPERTIES_WEEX_VERSION, WXEnvironment.WXSDK_VERSION);
            if (wXSDKInstance != null) {
                a(KEY_PAGE_PROPERTIES_UIKIT_TYPE, wXSDKInstance.aA());
            }
            a("wxUseRuntimeApi", Boolean.valueOf(WXEnvironment.sUseRunTimeApi));
            if (wXSDKInstance != null && (wXSDKInstance.L() == WXRenderStrategy.DATA_RENDER_BINARY || wXSDKInstance.L() == WXRenderStrategy.DATA_RENDER)) {
                a("wxRenderType", WXEnvironment.EAGLE);
            }
            if (wXSDKInstance == null) {
                return;
            }
            for (Map.Entry<String, String> entry : wXSDKInstance.F().entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    public void b(String str) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str) && (wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.l)) != null) {
            str = wXSDKInstance.F().get("wxContainerName");
        }
        c cVar = this.m;
        if (cVar != null) {
            str = cVar.b(str);
        }
        this.e = str;
        this.e = StringUtils.isEmpty(this.e) ? "emptyPageName" : this.e;
        a("wxBizID", this.e);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.m;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.m;
        if (cVar == null) {
            return;
        }
        cVar.c();
    }

    public void e() {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.m == null || this.r) {
        } else {
            new Handler(Looper.getMainLooper()).removeCallbacks(this.B);
            i();
            this.h.clear();
            this.t.removeCallbacks(this.A);
            a("wxDestroy");
            if (this.q && (cVar = this.m) != null) {
                cVar.a();
            }
            this.r = true;
            n();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(this.B, 8000L);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        Long l = this.f23517a.get("wxStartDownLoadBundle");
        Long l2 = this.f23517a.get("wxEndDownLoadBundle");
        Long l3 = this.f23517a.get("wxInteraction");
        Long l4 = this.f23517a.get(KEY_PAGE_STAGES_CONTAINER_READY);
        Long l5 = this.f23517a.get("wxEndLoadBundle");
        Long l6 = this.f23517a.get("wxEndExecuteBundle");
        Long l7 = this.f23517a.get(KEY_PAGE_STAGES_INTERACTION_TM);
        Double d = this.n.get(KEY_PAGE_STATS_SCRIPT_USE_QJS_BYTE_CODE);
        Double d2 = this.n.get(KEY_PAGE_STATS_API_USE_QJS_BYTE_CODE);
        if (l2 != null && l != null) {
            WXLogUtils.e("test->", "downLoadTime: " + (l2.longValue() - l.longValue()));
        }
        if (l5 != null && l6 != null) {
            WXLogUtils.e("test->", "bundleExecuteTime:" + (l6.longValue() - l5.longValue()));
        }
        if (l2 != null && l3 != null) {
            WXLogUtils.e("test->", "renderTime: " + (l3.longValue() - l2.longValue()));
        }
        if (l4 != null && l3 != null) {
            WXLogUtils.e("test->", "showTime: " + (l3.longValue() - l4.longValue()));
        }
        if (l4 != null && l7 != null) {
            WXLogUtils.e("test->", "showTimeTM: " + (l7.longValue() - l4.longValue()));
        }
        if (d != null) {
            WXLogUtils.e("test->", "scriptUseQJSByteCode: " + d);
        }
        if (d2 == null) {
            return;
        }
        WXLogUtils.e("test->", "apiUseQJSByteCode: " + d2);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.m == null) {
        } else {
            a(KEY_PAGE_STAGES_NEW_FSRENDER);
            a(WEEX_FIRSTSCREENPAINT);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.m == null) {
        } else {
            this.p = true;
            a(KEY_PAGE_STAGES_FSRENDER);
        }
    }

    public void a(WXComponent wXComponent) {
        WXPerformance aq;
        WXSDKInstance sDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972b2f4d", new Object[]{this, wXComponent});
        } else if (this.m == null || wXComponent == null || wXComponent.getInstance() == null) {
        } else {
            if (e.f23516a) {
                e.a(wXComponent);
            }
            if (this.m == null || (aq = wXComponent.getInstance().aq()) == null) {
                return;
            }
            long fixUnixTime = WXUtils.getFixUnixTime();
            long currentTimeMillis = System.currentTimeMillis();
            if (e.a()) {
                r0 = "[client][wxinteraction]" + wXComponent.getInstance().N() + "," + wXComponent.getComponentType() + "," + wXComponent.getRef() + "," + wXComponent.getStyles() + "," + wXComponent.getAttrs();
            }
            if (!this.s) {
                a(KEY_PAGE_STAGES_FIRST_INTERACTION_VIEW);
                this.s = true;
            }
            if (this.c) {
                return;
            }
            long fixUnixTime2 = WXUtils.getFixUnixTime();
            if (fixUnixTime2 - this.C > 50) {
                IWXBridgeManager wXBridgeManager = WXSDKManager.getInstance().getWXBridgeManager();
                if (wXBridgeManager != null) {
                    wXBridgeManager.onInteractionTimeUpdate(this.l);
                }
                this.C = fixUnixTime2;
            }
            this.v = this.i;
            this.w = this.j;
            Double d = this.n.get(KEY_PAGE_STATS_LAYOUT_TIME);
            this.u = d == null ? mto.a.GEO_NOT_SUPPORT : d.doubleValue();
            aq.interactionTime = fixUnixTime - aq.renderUnixTimeOrigin;
            aq.interactionRealUnixTime = System.currentTimeMillis();
            a("wxInteraction", fixUnixTime);
            a(KEY_PAGE_STAGES_INTERACTION_TM, currentTimeMillis);
            c(KEY_PAGE_STATS_I_SCREEN_VIEW_COUNT, 1.0d);
            d(KEY_PAGE_STATS_I_ALL_VIEW_COUNT, aq.localInteractionViewAddCount);
            if (WXSDKManager.getInstance().getSDKInstance(this.l) == null) {
                return;
            }
            d(KEY_PAGE_STATS_I_COMPONENT_CREATE_COUNT, sDKInstance.aq().componentCount);
        }
    }

    public void b(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d25292b", new Object[]{this, str, new Double(d)});
        } else if (this.m == null || this.p) {
        } else {
            c(str, d);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.y) {
        } else {
            this.y = true;
            a(KEY_PAGE_STATS_VIEW_CREATE_COST, this.w);
            a(KEY_PAGE_STATS_COMPONENT_CREATE_COST, this.v);
            a(KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST, this.x);
            a(KEY_PAGE_STATS_LAYOUT_TIME, this.u);
        }
    }

    public void c(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926b80a", new Object[]{this, str, new Double(d)});
        } else if (this.m == null) {
        } else {
            Double valueOf = Double.valueOf(this.n.containsKey(str) ? this.n.get(str).doubleValue() : mto.a.GEO_NOT_SUPPORT);
            if (valueOf == null) {
                WXErrorCode wXErrorCode = WXErrorCode.WX_ERR_HASH_MAP_TMP;
                WXExceptionUtils.commitCriticalExceptionRT("", wXErrorCode, "updateDiffStats", "key : " + str, null);
                return;
            }
            a(str, valueOf.doubleValue() + d);
        }
    }

    public void d(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752846e9", new Object[]{this, str, new Double(d)});
        } else if (this.m == null) {
        } else {
            Double valueOf = Double.valueOf(this.n.containsKey(str) ? this.n.get(str).doubleValue() : mto.a.GEO_NOT_SUPPORT);
            if (valueOf == null) {
                WXErrorCode wXErrorCode = WXErrorCode.WX_ERR_HASH_MAP_TMP;
                WXExceptionUtils.commitCriticalExceptionRT("", wXErrorCode, "updateMaxStats", "key : " + str, null);
            } else if (valueOf.doubleValue() >= d) {
            } else {
                a(str, Double.valueOf(d).doubleValue());
            }
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.m == null || map == null) {
        } else {
            a("wxRequestType", "wxRequestType", map);
            a(WXPerformance.CACHE_TYPE, KEY_PAGE_PROPERTIES_CACHE_TYPE, map);
            a("zCacheInfo", "wxZCacheInfo", map);
            a(KEY_PAGE_STATS_JSLIB_INIT_TIME, WXEnvironment.sJSLibInitTime);
            if (WXEnvironment.sNEWSDKInitTime != 0) {
                a(KEY_PAGE_STATS_SDK_INIT_TOTAL_TIME, WXEnvironment.sNEWSDKInitTime);
            }
            if (WXEnvironment.sSDKInitTaskTime != 0) {
                a(KEY_PAGE_STATS_SDK_INIT_TASK_TIME, WXEnvironment.sSDKInitTaskTime);
            }
            a(KEY_PAGE_PROPERTIES_JS_FM_INI, Boolean.valueOf(WXEnvironment.JsFrameworkInit));
            Object obj = map.get("actualNetworkTime");
            if (!(obj instanceof Long)) {
                return;
            }
            c(KEY_PAGE_STATS_ACTUAL_DOWNLOAD_TIME, ((Long) obj).doubleValue());
        }
    }

    private void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        Object obj = map.get(str);
        if (!(obj instanceof String)) {
            return;
        }
        a(str2, obj);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (!this.p) {
            b(KEY_PAGE_STATS_FS_REQUEST_NUM, 1.0d);
        }
        c(KEY_PAGE_STATS_NET_NUM, 1.0d);
    }

    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            c(KEY_PAGE_STATS_NET_SUCCESS_NUM, 1.0d);
        } else {
            c(KEY_PAGE_STATS_NET_FAIL_NUM, 1.0d);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            c(KEY_PAGE_STATS_IMG_LOAD_NUM, 1.0d);
        }
    }

    public void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31b0915", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            c(KEY_PAGE_STATS_IMG_LOAD_SUCCESS_NUM, 1.0d);
        } else {
            c(KEY_PAGE_STATS_IMG_LOAD_FAIL_NUM, 1.0d);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.z) {
        } else {
            this.z = true;
            WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.l);
            if (wXSDKInstance == null) {
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("wxBizID", this.e);
            hashMap.put("wxBundleUrl", wXSDKInstance.ak());
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("wxInteraction", Long.valueOf(wXSDKInstance.aq().interactionRealUnixTime));
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("stage", hashMap2);
            hashMap3.put("properties", hashMap);
            wXSDKInstance.a("wx_apm", (Map<String, Object>) hashMap3);
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        Long l = this.f23517a.get("wxRenderTimeOrigin");
        Long l2 = this.f23517a.get("wxInteraction");
        Long l3 = this.f23517a.get(KEY_PAGE_STAGES_NEW_FSRENDER);
        StringBuilder sb = new StringBuilder();
        if (l != null && l2 != null) {
            sb.append("interactiveTime " + (l2.longValue() - l.longValue()) + "ms");
        }
        if (l3 != null) {
            sb.append(" wxNewFsRender " + l3 + "ms");
        }
        return sb.toString();
    }

    public void b(Map<String, String> map) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    d = Double.valueOf(entry.getValue()).doubleValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    d = -1.0d;
                }
                if (d != -1.0d) {
                    this.n.put(entry.getKey(), Double.valueOf(d));
                }
            }
        }
    }
}
