package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.c;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.t;
import android.taobao.windvane.util.a;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.webkit.ValueCallback;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.b;
import com.taobao.android.riverlogger.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVPageTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String RVLOG_NETWORK_MODEL = null;
    public static String RVLOG_PAGE_MODEL = null;
    public static final int WVZCacheStateHitZCache = 2;
    public static final int WVZCacheStateNotHitZCache = 1;
    public static final int WVZCacheStateNotUseZCache = 0;
    public static final int WVZNSRFail = 2;
    public static final int WVZNSRSkip = 0;
    public static final int WVZNSRSuccess = 1;
    private static String customizedStageIndentifier;
    private static int pageIdentifier;
    public static List<PageStatusCallback> pageStatusCallbacks;
    private int jsErrorTimes;
    private String mLastPageUniqueIdentifier;
    private String mPageUniqueIdentifier;
    private String mWebViewUniqueIdentifier;
    private IPerformance performance;
    private long redirectCounts;
    private long redirectEntrance;
    private long redirectExport;
    private String url;
    private IWVWebView webView;
    private long mReceiveFirstPaintElapse = 0;
    private long mNavigationStartTS = 0;
    private int[][] stateMachine = {new int[]{1, 1, -1, -1, -1}, new int[]{-1, 1, 2, 3, -1}, new int[]{-1, 1, 2, 3, 4}, new int[]{-1, 1, 2, 3, -1}, new int[]{-1, -1, -1, 3, -1}};
    private String[] stages = {"initStart", "initEnd", "loadRequest", "interceptStart", "interceptEnd", "startLoad", "navigationStart", "fetchStart", "responseEnd", "domContentLoadedEventStart", "loadEventStart", "loadEventEnd", "finishLoad", "firstPaint", "firstScreenPaint", "timeToInteractive", "T1", "T2", "dealloc", "creatActivity", "attachToWindow", "firstScreenPaintCustomize"};
    private WVPageState state = WVPageState.WVPageStateInit;
    private ArrayList<WVResource> resources = new ArrayList<>();
    private HashMap<String, WVResource> resourcesMap = new HashMap<>();
    private ArrayList<Integer> events = new ArrayList<>();
    private long tti = 0;
    private Object lock_event = new Object();
    private Object lock_resource = new Object();

    /* loaded from: classes2.dex */
    public interface PageStatusCallback {
        void onPageFinish(String str);

        void onRedirect(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum WVPageState {
        WVPageStateError(-1),
        WVPageStateInit(0),
        WVPageStateLoadURL(1),
        WVPageStateStartLoad(2),
        WVPageStateFinishLoad(3),
        WVPageStateErrorOccurred(4);
        
        private int state;

        WVPageState(int i) {
            this.state = i;
        }

        public static WVPageState valueOf(int i) {
            if (i != -1) {
                if (i == 0) {
                    return WVPageStateInit;
                }
                if (i == 1) {
                    return WVPageStateLoadURL;
                }
                if (i == 2) {
                    return WVPageStateStartLoad;
                }
                if (i == 3) {
                    return WVPageStateFinishLoad;
                }
                if (i == 4) {
                    return WVPageStateErrorOccurred;
                }
                return null;
            }
            return WVPageStateError;
        }

        public int value() {
            return this.state;
        }
    }

    /* loaded from: classes2.dex */
    public class WVResource implements Serializable {
        public int dataSize;
        public boolean isHTML;
        public long loadingEndTime;
        public long loadingStartTime;
        public int statusCode;
        public String url;
        public String zcacheInfo;
        public int zcacheState;

        static {
            kge.a(1688595985);
            kge.a(1028243835);
        }

        public WVResource() {
        }
    }

    public static /* synthetic */ String access$000(WVPageTracker wVPageTracker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("17f38dda", new Object[]{wVPageTracker}) : wVPageTracker.mPageUniqueIdentifier;
    }

    public static /* synthetic */ long access$100(WVPageTracker wVPageTracker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4ec9b7b", new Object[]{wVPageTracker})).longValue() : wVPageTracker.mReceiveFirstPaintElapse;
    }

    public static /* synthetic */ long access$202(WVPageTracker wVPageTracker, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f98dbee", new Object[]{wVPageTracker, new Long(j)})).longValue();
        }
        wVPageTracker.mNavigationStartTS = j;
        return j;
    }

    public static /* synthetic */ String[] access$300(WVPageTracker wVPageTracker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("557cef18", new Object[]{wVPageTracker}) : wVPageTracker.stages;
    }

    public static /* synthetic */ void access$400(WVPageTracker wVPageTracker, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc963270", new Object[]{wVPageTracker, str, new Long(j)});
        } else {
            wVPageTracker.onApmStaged(str, j);
        }
    }

    static {
        kge.a(-1905810144);
        RVLOG_PAGE_MODEL = "WindVane/Page";
        RVLOG_NETWORK_MODEL = "WindVane/Network";
        pageStatusCallbacks = new CopyOnWriteArrayList();
        customizedStageIndentifier = "CSI";
        pageIdentifier = 0;
    }

    public static void registerH5LifeCallback(PageStatusCallback pageStatusCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c0a5bf", new Object[]{pageStatusCallback});
        } else if (pageStatusCallback == null || pageStatusCallbacks.contains(pageStatusCallback)) {
        } else {
            pageStatusCallbacks.add(pageStatusCallback);
        }
    }

    public static void removeH5LifeCallback(PageStatusCallback pageStatusCallback) {
        List<PageStatusCallback> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9167be", new Object[]{pageStatusCallback});
        } else if (pageStatusCallback == null || (list = pageStatusCallbacks) == null) {
        } else {
            list.remove(pageStatusCallback);
        }
    }

    public WVPageTracker() {
        if (!usable()) {
        }
    }

    public void initStart(IPerformance iPerformance, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7219601b", new Object[]{this, iPerformance, iWVWebView});
        } else if (!usable()) {
        } else {
            this.performance = iPerformance;
            this.webView = iWVWebView;
            updatePageIdentifier();
            long currentTime = currentTime();
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("initStart", this.mPageUniqueIdentifier).a(currentTime).a();
            onApmStarted();
            onApmStaged(this.stages[0], currentTime);
            onApmAddedProperty("processName", a.c(android.taobao.windvane.config.a.f));
        }
    }

    public void initEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecf88b2", new Object[]{this});
        } else if (!usable()) {
        } else {
            long currentTime = currentTime();
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("initEnd", this.mPageUniqueIdentifier).a(currentTime).a();
            onApmStaged(this.stages[1], currentTime);
        }
    }

    public void blockURLStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bc8067", new Object[]{this});
        } else if (!usable()) {
        } else {
            long currentTime = currentTime();
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("interceptStart", this.mPageUniqueIdentifier).a(currentTime).a();
            onApmStaged(this.stages[3], currentTime);
        }
    }

    public void blockURLEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42a67e0", new Object[]{this});
        } else if (!usable()) {
        } else {
            long currentTime = currentTime();
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("interceptEnd", this.mPageUniqueIdentifier).a(currentTime).a();
            onApmStaged(this.stages[4], currentTime);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!usable()) {
        } else {
            onApmAddedResidue();
            onApmStaged(this.stages[18], currentTime());
            onApmFinished();
        }
    }

    public void attachToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b23837", new Object[]{this});
        } else if (!usable()) {
        } else {
            onApmStaged(this.stages[20], currentTime());
        }
    }

    public void creatActivity(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4245c765", new Object[]{this, new Long(j)});
        } else if (!usable()) {
        } else {
            onApmStaged(this.stages[19], j);
        }
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (!usable()) {
        } else {
            this.url = str;
            recordRedirectEntrance();
            long currentTime = currentTime();
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("loadRequest", this.mPageUniqueIdentifier).a("url", (Object) str).a(currentTime).a();
            onStateChanged(0);
            onApmStaged(this.stages[2], currentTime);
            IWVWebView iWVWebView = this.webView;
            if (iWVWebView == null || iWVWebView.getUserAgentString() == null || this.webView.getUserAgentString().indexOf("Triver") == -1) {
                return;
            }
            onApmAddedProperty("triver", 1);
        }
    }

    public void shouldOverrideUrlLoading(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6e8481", new Object[]{this, iWVWebView, str});
        } else if (!usable()) {
        } else {
            this.url = str;
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("redirect", this.mPageUniqueIdentifier).a("url", (Object) str).a(currentTime()).a();
            if (this.state == WVPageState.WVPageStateFinishLoad || this.state == WVPageState.WVPageStateInit) {
                updatePageIdentifier();
                onApmAddedResidue();
                onApmFinished();
                onApmStarted();
                recordRedirectEntrance();
            }
            onStateChanged(1);
        }
    }

    public void onPageStarted(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2ae988", new Object[]{this, iWVWebView, str});
        } else if (!usable()) {
        } else {
            if (this.state == WVPageState.WVPageStateFinishLoad) {
                updatePageIdentifier();
                onApmAddedResidue();
                onApmFinished();
                onApmStarted();
                recordRedirectEntrance();
            }
            long currentTime = currentTime();
            if (j.commonConfig.bL) {
                b a2 = e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("startLoad", this.mPageUniqueIdentifier).a("url", (Object) str).a(currentTime);
                a2.a("contentType", Integer.valueOf(t.k(str)));
                a2.a();
            }
            onStateChanged(2);
            onApmStaged(this.stages[5], currentTime);
        }
    }

    public void onPageFinished(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224b7655", new Object[]{this, iWVWebView, str});
        } else if (usable()) {
            List<PageStatusCallback> list = pageStatusCallbacks;
            if (list != null) {
                for (PageStatusCallback pageStatusCallback : list) {
                    try {
                        pageStatusCallback.onPageFinish(str);
                    } catch (Throwable unused) {
                    }
                }
            }
            onStateChanged(3);
            if (checkoutHash(str)) {
                return;
            }
            recordRedirectExport();
            long currentTime = currentTime();
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("finishLoad", this.mPageUniqueIdentifier).a("url", (Object) str).a(currentTime).a();
            onApmStaged(this.stages[12], currentTime);
            onApmAddedProperty("isFinished", new Integer(1));
            onApmAddedProperty(MonitorItemConstants.KEY_URL, str);
            onApmAddedStatistic("jsErrorTimes", this.jsErrorTimes);
            onPageReceivedPerformanceTiming(iWVWebView);
            analyzeStates();
            onStateRecovered();
            onPropertyRecovered();
        }
    }

    public void onPageReceivedError(IWVWebView iWVWebView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613afa15", new Object[]{this, iWVWebView, str, new Integer(i)});
        } else if (!usable()) {
        } else {
            onStateChanged(4);
            onApmAddedProperty("errorCode", new Integer(i));
            onApmAddedProperty("errorMsg", str);
        }
    }

    public void onPageReceivedPerformanceTiming(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54729ef6", new Object[]{this, iWVWebView});
        } else {
            iWVWebView.evaluateJavascript("(function(performance){var timing=performance&&performance.timing;return timing&&JSON.stringify({ns:timing.navigationStart,fs:timing.fetchStart,rs:timing.requestStart,re:timing.responseEnd,ds:timing.domContentLoadedEventStart,dc:timing.domComplete,ls:timing.loadEventStart,le:timing.loadEventEnd})})(window.performance)", new ValueCallback<String>() { // from class: android.taobao.windvane.extra.performance2.WVPageTracker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    String str2 = StringUtils.isEmpty(str) ? "{}" : str;
                    if (str2.startsWith("\"") && str2.endsWith("\"")) {
                        str2 = str2.substring(1, str2.length() - 1);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2.replace("\\", ""));
                        long optLong = jSONObject.optLong(NotificationStyle.NOTIFICATION_STYLE);
                        long optLong2 = jSONObject.optLong("rs");
                        long optLong3 = jSONObject.optLong("re");
                        long optLong4 = jSONObject.optLong("ds");
                        long optLong5 = jSONObject.optLong("dc");
                        long optLong6 = jSONObject.optLong(RVStartParams.KEY_LANDSCAPE_SHORT);
                        long optLong7 = jSONObject.optLong("le");
                        e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("navigationStart", WVPageTracker.access$000(WVPageTracker.this)).a(optLong).a();
                        e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("requestStart", WVPageTracker.access$000(WVPageTracker.this)).a(optLong2).a();
                        e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("responseEnd", WVPageTracker.access$000(WVPageTracker.this)).a(optLong3).a();
                        e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("domComplete", WVPageTracker.access$000(WVPageTracker.this)).a(optLong5).a();
                        e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("domContentLoadedEventStart", WVPageTracker.access$000(WVPageTracker.this)).a(optLong4).a();
                        e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("loadEventStart", WVPageTracker.access$000(WVPageTracker.this)).a(optLong6).a();
                        e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("loadEventEnd", WVPageTracker.access$000(WVPageTracker.this)).a(optLong7).a();
                        if (WVPageTracker.access$100(WVPageTracker.this) > 0) {
                            e.a(RVLLevel.Info, WVPageTracker.RVLOG_PAGE_MODEL).a("firstPaint", WVPageTracker.access$000(WVPageTracker.this)).a(WVPageTracker.access$100(WVPageTracker.this) + optLong).a();
                        } else {
                            WVPageTracker.access$202(WVPageTracker.this, optLong);
                        }
                        WVPageTracker.access$400(WVPageTracker.this, WVPageTracker.access$300(WVPageTracker.this)[6], optLong);
                        WVPageTracker.access$400(WVPageTracker.this, WVPageTracker.access$300(WVPageTracker.this)[7], jSONObject.optLong(RVStartParams.KEY_FULLSCREEN_SHORT));
                        WVPageTracker.access$400(WVPageTracker.this, WVPageTracker.access$300(WVPageTracker.this)[8], optLong3);
                        WVPageTracker.access$400(WVPageTracker.this, WVPageTracker.access$300(WVPageTracker.this)[9], jSONObject.optLong("ds"));
                        WVPageTracker.access$400(WVPageTracker.this, WVPageTracker.access$300(WVPageTracker.this)[10], jSONObject.optLong(RVStartParams.KEY_LANDSCAPE_SHORT));
                        WVPageTracker.access$400(WVPageTracker.this, WVPageTracker.access$300(WVPageTracker.this)[11], jSONObject.optLong("le"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void onPageReceivedFP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c812ca4", new Object[]{this, new Long(j)});
        } else if (!usable()) {
        } else {
            if (this.mNavigationStartTS > 0) {
                e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("firstPaint", this.mPageUniqueIdentifier).a(this.mNavigationStartTS + j).a();
            } else {
                this.mReceiveFirstPaintElapse = j;
            }
            onApmStaged(this.stages[13], j);
        }
    }

    public void onPageReceivedFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca16de9", new Object[]{this, new Long(j)});
        } else if (!usable()) {
        } else {
            onApmStaged(this.stages[14], j);
        }
    }

    public void onPageReceivedCustomizedFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef790eca", new Object[]{this, new Long(j)});
        } else if (!usable()) {
        } else {
            onApmStaged(this.stages[21], j);
        }
    }

    public void onPageReceivedCustomizedStage(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778659f9", new Object[]{this, new Long(j), str});
        } else if (!usable()) {
        } else {
            onApmStaged(customizedStageIndentifier + "-" + str, j);
        }
    }

    public void onPageReceivedTTI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e63103", new Object[]{this, new Long(j)});
        } else if (!usable() || j - this.tti > 5000) {
        } else {
            this.tti = j;
        }
    }

    public void onPageReceivedT1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc322ef1", new Object[]{this, new Long(j)});
        } else if (!usable()) {
        } else {
            onApmStaged(this.stages[16], j);
        }
    }

    public void onPageReceivedT2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde70790", new Object[]{this, new Long(j)});
        } else if (!usable()) {
        } else {
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("T2", this.mPageUniqueIdentifier).a(j).a();
        }
    }

    public void onPageReceivedJSError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcaded7", new Object[]{this});
        } else if (!usable()) {
        } else {
            this.jsErrorTimes++;
        }
    }

    public void onPageReceiveProperty(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9cd3ed", new Object[]{this, jSONObject});
        } else {
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a("properties", this.mPageUniqueIdentifier).a(jSONObject).a();
        }
    }

    public void onPageReceiveStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c4dfda", new Object[]{this, str});
        } else {
            e.a(RVLLevel.Info, RVLOG_PAGE_MODEL).a(str, this.mPageUniqueIdentifier).a(currentTime()).a();
        }
    }

    public void onPageRenderProcessTerminate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b3f727", new Object[]{this, str});
        } else {
            e.a(RVLLevel.Warn, RVLOG_PAGE_MODEL).a("processTerminate", this.mPageUniqueIdentifier).a(currentTime()).a();
        }
    }

    public void onWebViewNSREvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c2f115", new Object[]{this, new Integer(i)});
        } else if (!usable()) {
        } else {
            onApmAddedProperty("nativeSideRendering", Integer.valueOf(i));
        }
    }

    public void onResourceStarted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd45445", new Object[]{this, str});
        } else if (!usable()) {
        } else {
            WVResource wVResource = new WVResource();
            wVResource.loadingStartTime = currentTime();
            wVResource.url = str;
            if (isPage(str)) {
                wVResource.isHTML = true;
            }
            addResource(str, wVResource);
            IPerformance iPerformance = this.performance;
            if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
                return;
            }
            this.performance.getPerformanceDelegate().onResourceStarted(str);
        }
    }

    public void onResourceReceivedZCacheState(String str, int i) {
        WVResource takeResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb346d7", new Object[]{this, str, new Integer(i)});
        } else if (!usable() || (takeResource = takeResource(str)) == null) {
        } else {
            takeResource.zcacheState = i;
        }
    }

    public void onResourceReceivedZCacheInfo(String str, String str2) {
        WVResource takeResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c348bf", new Object[]{this, str, str2});
        } else if (!usable() || (takeResource = takeResource(str)) == null) {
        } else {
            takeResource.zcacheInfo = str2;
        }
    }

    public void onResourceReceivedStatusCode(String str, String str2, int i) {
        WVResource takeResource;
        List<PageStatusCallback> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f34973b", new Object[]{this, str, str2, new Integer(i)});
        } else if (usable() && (takeResource = takeResource(str)) != null) {
            if (i == 302 && takeResource.isHTML && (list = pageStatusCallbacks) != null) {
                for (PageStatusCallback pageStatusCallback : list) {
                    try {
                        pageStatusCallback.onRedirect(str, str2);
                    } catch (Throwable unused) {
                    }
                }
            }
            takeResource.statusCode = i;
            IPerformance iPerformance = this.performance;
            if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
                return;
            }
            this.performance.getPerformanceDelegate().onResourceReceivedStatusCode(str, i);
        }
    }

    public void onResourceFinished(String str, int i) {
        WVResource takeResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab24d913", new Object[]{this, str, new Integer(i)});
        } else if (!usable() || (takeResource = takeResource(str)) == null) {
        } else {
            takeResource.loadingEndTime = currentTime();
            takeResource.dataSize = i;
            IPerformance iPerformance = this.performance;
            if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
                return;
            }
            this.performance.getPerformanceDelegate().onResourceFinished(str, i);
        }
    }

    private void addResource(String str, WVResource wVResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832bda70", new Object[]{this, str, wVResource});
        } else if (str == null) {
        } else {
            synchronized (this.lock_resource) {
                if (this.resourcesMap.get(str) != null) {
                    return;
                }
                this.resources.add(wVResource);
                this.resourcesMap.put(str, wVResource);
            }
        }
    }

    private WVResource takeResource(String str) {
        WVResource wVResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVResource) ipChange.ipc$dispatch("553e10c6", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        synchronized (this.lock_resource) {
            wVResource = this.resourcesMap.get(str);
        }
        return wVResource;
    }

    private void clearResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfd9082", new Object[]{this});
            return;
        }
        synchronized (this.lock_resource) {
            this.resources.clear();
            this.resourcesMap.clear();
        }
    }

    private void onResourceRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bca1fd", new Object[]{this});
        } else {
            clearResource();
        }
    }

    private boolean isPage(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b06ae0ae", new Object[]{this, str})).booleanValue() : str.equals(this.url);
    }

    private void analyzeResources() {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e777640", new Object[]{this});
            return;
        }
        String str = "";
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        while (i < this.resources.size()) {
            WVResource wVResource = this.resources.get(i);
            if (wVResource == null) {
                m.e("WVPageTracker", " analyzeResources : resource为空！");
                j = j6;
                i2 = i2;
            } else {
                int i3 = i2;
                long j9 = j7;
                j = j6;
                if (wVResource.loadingStartTime < wVResource.loadingEndTime) {
                    j5 += wVResource.loadingEndTime - wVResource.loadingStartTime;
                    j4++;
                }
                String valueOf = String.valueOf(wVResource.statusCode);
                if (valueOf.startsWith("2")) {
                    j8++;
                } else if (valueOf.startsWith("4") || valueOf.startsWith("5")) {
                    j3++;
                }
                if (wVResource.isHTML) {
                    i2 = wVResource.zcacheState;
                    if (wVResource.zcacheInfo != null) {
                        str = wVResource.zcacheInfo;
                    }
                    j7 = j9;
                } else {
                    if (wVResource.zcacheState == 1) {
                        j2 = j + 1;
                    } else {
                        if (wVResource.zcacheState == 2) {
                            j2 = j + 1;
                            j9++;
                        }
                        i2 = i3;
                        j7 = j9;
                        i++;
                        j6 = j;
                    }
                    j = j2;
                    i2 = i3;
                    j7 = j9;
                    i++;
                    j6 = j;
                }
            }
            i++;
            j6 = j;
        }
        int i4 = i2;
        long j10 = j6;
        long j11 = j7;
        long j12 = 0;
        if (j4 > 0) {
            j12 = j5 / j4;
        }
        onApmAddedStatistic("resourceTotalCount", this.resources.size());
        onApmAddedStatistic("resourceSuccessfulCount", j8);
        onApmAddedStatistic("resourceFailedCount", j3);
        onApmAddedStatistic("resourceAverageTime", j12);
        onApmAddedStatistic("zcacheUsageCount", j10);
        onApmAddedStatistic("zcacheHitCount", j11);
        onApmAddedProperty("htmlZCacheState", Integer.valueOf(i4));
        onApmAddedProperty("htmlZCacheInfo", str);
    }

    private void onStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c60403a", new Object[]{this, new Integer(i)});
            return;
        }
        addEvent(i);
        if (this.state == WVPageState.WVPageStateError) {
            return;
        }
        if (this.state == WVPageState.WVPageStateStartLoad) {
            this.redirectCounts++;
        }
        this.state = WVPageState.valueOf(this.stateMachine[this.state.value()][i]);
        if (this.state != WVPageState.WVPageStateError) {
            return;
        }
        onApmAddedProperty("errorProcess", 1);
    }

    private void onStateRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6088b38", new Object[]{this});
        } else if (this.state != WVPageState.WVPageStateError) {
        } else {
            this.state = WVPageState.WVPageStateInit;
        }
    }

    private void analyzeStates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ca8bf5", new Object[]{this});
            return;
        }
        onApmAddedStatistic("redirectCounts", this.redirectCounts - 1);
        long j = this.redirectExport;
        long j2 = this.redirectEntrance;
        long j3 = 0;
        if (j - j2 > 0) {
            j3 = j - j2;
        }
        onApmAddedStatistic("redirectTime", j3);
    }

    private void addEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39085c83", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.lock_event) {
            this.events.add(new Integer(i));
        }
    }

    private void clearEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbd4a54", new Object[]{this});
            return;
        }
        synchronized (this.lock_event) {
            this.events.clear();
        }
    }

    private void analyzeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa073b8c", new Object[]{this});
            return;
        }
        synchronized (this.lock_event) {
            String str = "";
            for (int i = 0; i < this.events.size(); i++) {
                str = str + this.events.get(i);
            }
            onApmAddedProperty("routingEvent", str);
        }
    }

    public void setWebViewIdentifier(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0219fc", new Object[]{this, new Integer(i)});
            return;
        }
        this.mWebViewUniqueIdentifier = "WV_" + i;
        this.mPageUniqueIdentifier = this.mWebViewUniqueIdentifier + "-" + pageIdentifier;
    }

    public String getPageIdentifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e709422b", new Object[]{this}) : this.mPageUniqueIdentifier;
    }

    private void updatePageIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225a71c8", new Object[]{this});
            return;
        }
        this.mLastPageUniqueIdentifier = this.mPageUniqueIdentifier;
        pageIdentifier++;
        this.mPageUniqueIdentifier = this.mWebViewUniqueIdentifier + "-" + pageIdentifier;
    }

    private void recoverPageIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab595a3", new Object[]{this});
            return;
        }
        String str = this.mLastPageUniqueIdentifier;
        if (str == null) {
            return;
        }
        this.mPageUniqueIdentifier = str;
        this.mLastPageUniqueIdentifier = null;
    }

    private void onApmStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b19349", new Object[]{this});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
            return;
        }
        this.performance.getPerformanceDelegate().start();
    }

    private void onApmFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37c9d58", new Object[]{this});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
            return;
        }
        this.performance.getPerformanceDelegate().end();
    }

    private void onApmStaged(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d12aeee", new Object[]{this, str, new Long(j)});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
            return;
        }
        this.performance.getPerformanceDelegate().recordStage(str, j);
    }

    private void onApmAddedProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963a47a3", new Object[]{this, str, obj});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
            return;
        }
        this.performance.getPerformanceDelegate().recordProperties(str, obj);
    }

    private void onApmAddedStatistic(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10597a4", new Object[]{this, str, new Long(j)});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance == null || iPerformance.getPerformanceDelegate() == null) {
            return;
        }
        this.performance.getPerformanceDelegate().recordStatistics(str, j);
    }

    private void onApmAddedResidue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cb151", new Object[]{this});
            return;
        }
        onApmStaged(this.stages[15], this.tti);
        analyzeResources();
        analyzeEvents();
        onResidueRecovered();
    }

    private void onPropertyRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df2e396", new Object[]{this});
            return;
        }
        this.jsErrorTimes = 0;
        this.redirectCounts = 0L;
        this.redirectEntrance = 0L;
    }

    private void onResidueRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ebf8be", new Object[]{this});
            return;
        }
        onResourceRecovered();
        clearEvent();
        this.tti = 0L;
    }

    private void recordRedirectEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5a742a", new Object[]{this});
        } else if (this.redirectEntrance != 0) {
        } else {
            this.redirectEntrance = currentTime();
        }
    }

    private void recordRedirectExport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba56568", new Object[]{this});
        } else if (this.redirectExport != 0) {
        } else {
            this.redirectExport = currentTime();
        }
    }

    private long currentTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6d4161", new Object[]{this})).longValue() : System.currentTimeMillis();
    }

    private boolean checkoutHash(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9930db09", new Object[]{this, str})).booleanValue() : str != null && (str2 = this.url) != null && !str.equals(str2) && urlWithoutFragment(str).equals(urlWithoutFragment(this.url));
    }

    private String urlWithoutFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c3a0846", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("#");
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    private boolean usable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ab36d83", new Object[]{this})).booleanValue() : c.a().b().d();
    }
}
