package android.taobao.windvane.extra.uc;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.q;
import android.taobao.windvane.d;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.devtools.DevTools;
import android.taobao.windvane.extra.jsbridge.DefaultAsyncApiProxy;
import android.taobao.windvane.extra.jsbridge.JSAPIManager;
import android.taobao.windvane.extra.jsbridge.WVMega;
import android.taobao.windvane.extra.jsbridge.WVMegaBridge;
import android.taobao.windvane.extra.performance.WVErrorManager;
import android.taobao.windvane.extra.performance.WVH5PPManager;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.extra.performance2.WVFSPManager;
import android.taobao.windvane.extra.performance2.WVPageTracker;
import android.taobao.windvane.extra.performance2.WVPerformance;
import android.taobao.windvane.extra.performance2.WVWPData;
import android.taobao.windvane.extra.performance2.WVWPManager;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.ha.UCHAManager;
import android.taobao.windvane.jsbridge.WVAppEvent;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVFalco;
import android.taobao.windvane.jsbridge.api.WVFullTrace;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.p;
import android.taobao.windvane.jsbridge.s;
import android.taobao.windvane.jsbridge.t;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.runtimepermission.b;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.h;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.WindVaneError;
import android.taobao.windvane.webview.a;
import android.taobao.windvane.webview.c;
import android.taobao.windvane.webview.e;
import android.taobao.windvane.webview.g;
import android.taobao.windvane.webview.i;
import android.taobao.windvane.webview.k;
import android.taobao.windvane.webview.m;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.widget.Toast;
import com.ali.user.mobile.exception.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.runtimepermission.f;
import com.taobao.themis.kernel.utils.v;
import com.taobao.uc.UCSoSettings;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.export.ServiceWorkerController;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import com.uc.webview.export.extension.ExtImageDecoder;
import com.uc.webview.export.extension.INetworkDelegate;
import com.uc.webview.export.extension.INetworkHostingService;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.StorageUtils;
import com.uc.webview.export.extension.UCExtension;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.adi;
import tb.adj;
import tb.adl;
import tb.adm;
import tb.ado;
import tb.adr;
import tb.aem;
import tb.alr;
import tb.alu;
import tb.dqm;
import tb.dqn;
import tb.hux;
import tb.hvw;
import tb.kge;
import tb.oxv;
import tb.qfu;
import tb.qgm;
import tb.qgo;
import tb.riy;

/* loaded from: classes2.dex */
public class WVUCWebView extends WebView implements Handler.Callback, IPerformance, IWVWebView, e, g, adm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCWebView";
    private static String UC_CORE_REMOTE_SO_PATH = null;
    public static String UC_CORE_URL = null;
    public static String UC_CORE_URL_32 = null;
    public static String UC_CORE_URL_64 = null;
    private static String UC_CORE_URL_DEBUG_32 = null;
    private static String UC_CORE_URL_DEBUG_64 = null;
    private static String UC_CORE_URL_DEBUG_X86 = null;
    private static String UC_PLAYER_URL = null;
    public static final String WINDVANE = "windvane";
    public static String bizId;
    private static a coreEventCallback;
    private static boolean evaluateJavascriptSupported;
    private static int fromType;
    private static boolean initedJSBridge;
    public static boolean isStop;
    private static boolean mDegradeAliNetwork;
    private static boolean mUseAliNetwork;
    private static boolean mUseSystemWebView;
    private static boolean mUseSystemWebViewOnce;
    private static Pattern pattern;
    private static volatile boolean sCoreFailed;
    private static volatile int sCoreFailedCode;
    private static volatile String sCoreFailedMsg;
    private static final AtomicBoolean sCoreInitialized;
    private static final boolean sEnableSystemWebView;
    private static volatile int sFetchFailCode;
    private static volatile String sFetchFailMsg;
    private static volatile boolean sFetchFailed;
    private static boolean sForegroundInitUC;
    public static boolean sIsSetHttpCacheSize;
    private static final AtomicBoolean sNetworkDelegateSet;
    private static final AtomicBoolean sStaticBlockedInitialized;
    private static boolean sWebViewFirstAttached;
    private static final AtomicBoolean shouldUCLibInit;
    public static int webviewIndentifier;
    private alu abilityHubAdapter;
    private AliNetworkAdapterNew aliRequestAdapter;
    private s asyncApiProxy;
    public String bizCode;
    private String cachedUrl;
    private n containerSpan;
    public Context context;
    private String currentUrl;
    private String dataOnActive;
    private Paint debugPaint;
    public float dx;
    public float dy;
    public p entryManager;
    public boolean firstTimeLoad;
    private boolean flag4commit;
    public UCExtension.InjectJSProvider injectJSProvider;
    public final StringBuilder injectJs;
    private boolean isLive;
    private boolean isPreCreated;
    private boolean isPreInit;
    private boolean isRealDestroyed;
    public boolean isUser;
    private adr jsPatchListener;
    private boolean longPressSaveImage;
    private alr mAbilityEnv;
    private boolean mAllowAllOpen;
    public SparseArray<MotionEvent> mEventSparseArray;
    private volatile Map<String, Object> mExternalContext;
    private Hashtable<String, Hashtable<String, String>> mH5MonitorCache;
    public Handler mHandler;
    private String mImageUrl;
    private boolean mIsCoreDestroy;
    private boolean mIsStaticWebView;
    private View.OnLongClickListener mLongClickListener;
    private boolean mNeedReloadWhenOnResume;
    private int mPageLoadedCount;
    public long mPageStart;
    private android.taobao.windvane.view.a mPopupController;
    private String[] mPopupMenuTags;
    private android.taobao.windvane.export.network.g mPrefetchInfo;
    private final adj mSpanWrapper;
    private TouchEventHandler mTouchEventHandler;
    private boolean mUseGlobalUrlConfig;
    private final hvw mWebViewContext;
    private boolean mWebViewPaused;
    private int mWvNativeCallbackId;
    private long onErrorTime;
    private Map<String, String> openTracingContextMap;
    public String overrideBizId;
    public WVPageTracker pageTracker;
    private WVPerformance performanceDelegate;
    private String pid;
    private View.OnClickListener popupClickListener;
    private boolean reportedFSP;
    private boolean statusBarImmersive;
    public boolean supportDownload;
    public List<Runnable> taskQueue;
    private String ucParam;
    private String uid;
    private boolean useUrlConfig;
    public WVUCWebChromeClient webChromeClient;
    public WVUCWebViewClient webViewClient;
    public WVWPData wpData;
    public WVErrorManager wvErrorManager;
    private adi wvSecurityFilter;
    private m wvUIModel;
    public WVFSPManager wvfspManager;
    public WVH5PPManager wvh5PPManager;

    /* loaded from: classes2.dex */
    public static class TouchEventHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(590294585);
        }

        public void coreDispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b54da590", new Object[]{this, motionEvent});
            }
        }

        public void coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8929bd6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface whiteScreenCallback {
        void isPageEmpty(String str);
    }

    public static /* synthetic */ Object ipc$super(WVUCWebView wVUCWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2075640349:
                return super.getCoreView();
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1955206122:
                super.loadHtmlData((String) objArr[0], (String) objArr[1]);
                return null;
            case -1888728565:
                return new Float(super.getScale());
            case -1512649357:
                super.onResume();
                return null;
            case -1384276246:
                return new Boolean(super.canGoBack());
            case -1312899459:
                super.evaluateJavascript((String) objArr[0], (ValueCallback) objArr[1]);
                return null;
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -1247571552:
                super.reload();
                return null;
            case -1185152872:
                super.addJavascriptInterface(objArr[0], (String) objArr[1]);
                return null;
            case -853109733:
                super.coreDraw((Canvas) objArr[0]);
                return null;
            case -788773096:
                super.clearCache(((Boolean) objArr[0]).booleanValue());
                return null;
            case -736275871:
                super.stopLoading();
                return null;
            case -610146718:
                super.coreDestroy();
                return null;
            case -597752619:
                super.loadData((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case -561052064:
                return super.getUrl();
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -148357436:
                return new Integer(super.getContentHeight());
            case 143264892:
                super.coreOnVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 490249163:
                super.loadUrl((String) objArr[0], (Map) objArr[1]);
                return null;
            case 522121505:
                super.loadDataWithBaseURL((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
                return null;
            case 658380796:
                super.setWebChromeClient((WebChromeClient) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 928790192:
                super.coreOnScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1118518886:
                super.setWebViewClient((WebViewClient) objArr[0]);
                return null;
            case 1248879303:
                super.postUrl((String) objArr[0], (byte[]) objArr[1]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$1001(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5642ce48", new Object[]{wVUCWebView});
        } else {
            super.coreDestroy();
        }
    }

    public static /* synthetic */ boolean access$1102(WVUCWebView wVUCWebView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba0bc68e", new Object[]{wVUCWebView, new Boolean(z)})).booleanValue();
        }
        wVUCWebView.mIsCoreDestroy = z;
        return z;
    }

    public static /* synthetic */ boolean access$1200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afb76b2c", new Object[0])).booleanValue() : sEnableSystemWebView;
    }

    public static /* synthetic */ AtomicBoolean access$1300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("543c0869", new Object[0]) : sStaticBlockedInitialized;
    }

    public static /* synthetic */ String[] access$200(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("b69881e9", new Object[]{wVUCWebView}) : wVUCWebView.mPopupMenuTags;
    }

    public static /* synthetic */ String access$300(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11967be5", new Object[]{wVUCWebView}) : wVUCWebView.mImageUrl;
    }

    public static /* synthetic */ String access$302(WVUCWebView wVUCWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e7ffd59", new Object[]{wVUCWebView, str});
        }
        wVUCWebView.mImageUrl = str;
        return str;
    }

    public static /* synthetic */ android.taobao.windvane.view.a access$400(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.taobao.windvane.view.a) ipChange.ipc$dispatch("2efae18e", new Object[]{wVUCWebView}) : wVUCWebView.mPopupController;
    }

    public static /* synthetic */ android.taobao.windvane.view.a access$402(WVUCWebView wVUCWebView, android.taobao.windvane.view.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.taobao.windvane.view.a) ipChange.ipc$dispatch("749baeb8", new Object[]{wVUCWebView, aVar});
        }
        wVUCWebView.mPopupController = aVar;
        return aVar;
    }

    public static /* synthetic */ void access$500(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdec6286", new Object[]{str});
        } else {
            onRemoteFetchSuccess(str);
        }
    }

    public static /* synthetic */ void access$600(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8c3918", new Object[]{th});
        } else {
            onRemoteFetchFail(th);
        }
    }

    public static /* synthetic */ void access$700() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f21a63e", new Object[0]);
        } else {
            initServiceWorkerClient();
        }
    }

    public static /* synthetic */ boolean access$800(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa209a4", new Object[]{wVUCWebView})).booleanValue() : wVUCWebView.longPressSaveImage;
    }

    public static /* synthetic */ View.OnClickListener access$900(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("4b21664a", new Object[]{wVUCWebView}) : wVUCWebView.popupClickListener;
    }

    static {
        kge.a(965153102);
        kge.a(-1043440182);
        kge.a(-1113217877);
        kge.a(-496979567);
        kge.a(1616078155);
        kge.a(338107928);
        kge.a(-612708281);
        webviewIndentifier = 0;
        UC_CORE_REMOTE_SO_PATH = null;
        bizId = "windvane";
        pattern = null;
        isStop = false;
        fromType = 70;
        sStaticBlockedInitialized = new AtomicBoolean(false);
        sCoreInitialized = new AtomicBoolean(false);
        shouldUCLibInit = new AtomicBoolean(false);
        sForegroundInitUC = false;
        UC_CORE_URL_DEBUG_X86 = UCSoSettings.getInstance().UC_CORE_URL_DEBUG_X86;
        UC_CORE_URL_DEBUG_32 = UCSoSettings.getInstance().UC_CORE_URL_DEBUG_32;
        UC_CORE_URL_DEBUG_64 = UCSoSettings.getInstance().UC_CORE_URL_DEBUG_64;
        UC_CORE_URL_32 = UCSoSettings.getInstance().UC_CORE_URL_32;
        UC_CORE_URL_64 = UCSoSettings.getInstance().UC_CORE_URL_64;
        UC_CORE_URL = UC_CORE_URL_32;
        UC_PLAYER_URL = UCSoSettings.getInstance().UC_PLAYER_URL;
        mUseAliNetwork = true;
        mUseSystemWebView = false;
        mUseSystemWebViewOnce = false;
        mDegradeAliNetwork = false;
        evaluateJavascriptSupported = Build.VERSION.SDK_INT >= 19;
        coreEventCallback = null;
        sCoreFailed = false;
        sCoreFailedCode = -1;
        sCoreFailedMsg = null;
        sFetchFailed = false;
        sFetchFailCode = -1;
        sFetchFailMsg = null;
        initedJSBridge = false;
        boolean z = j.commonConfig.ci;
        sEnableSystemWebView = z;
        if (!z && !sStaticBlockedInitialized.get()) {
            android.taobao.windvane.util.m.e(TAG, "call staticInitializeOnce in static block");
            staticInitializeOnce();
        }
        sNetworkDelegateSet = new AtomicBoolean(false);
        sWebViewFirstAttached = true;
        sIsSetHttpCacheSize = false;
    }

    @Override // com.uc.webview.export.WebView
    public int getContentHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue() : (int) (super.getContentHeight() * super.getScale());
    }

    public void setTouchEventHandler(TouchEventHandler touchEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b376bca", new Object[]{this, touchEventHandler});
        } else {
            this.mTouchEventHandler = touchEventHandler;
        }
    }

    public WVUCWebView(Builder builder) {
        super(Builder.access$000(builder), Builder.access$100(builder) != 3);
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new adj();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (j.commonConfig.bO) {
                            f.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).b("windvane").b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).a(true).a("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").a();
                        } else {
                            b.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) == null) {
                    return;
                }
                WVUCWebView.access$400(WVUCWebView.this).b();
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = Builder.access$000(builder);
        init();
    }

    public boolean isPreCreated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd46d89a", new Object[]{this})).booleanValue() : this.isPreCreated;
    }

    public void setPreCreated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9807e6c6", new Object[]{this, new Boolean(z)});
        } else {
            this.isPreCreated = z;
        }
    }

    public alu getAbilityHubAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alu) ipChange.ipc$dispatch("edca5a47", new Object[]{this}) : this.abilityHubAdapter;
    }

    public hvw getWebViewContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hvw) ipChange.ipc$dispatch("b59584a", new Object[]{this}) : this.mWebViewContext;
    }

    public void setFspCallback(WVFSPManager.FSPCallback fSPCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a179d", new Object[]{this, fSPCallback});
        } else {
            this.wvfspManager.setFspCallback(fSPCallback);
        }
    }

    public static void initUCCore(android.taobao.windvane.webview.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7287db15", new Object[]{bVar});
        } else if (android.taobao.windvane.util.a.a() && Build.VERSION.SDK_INT == android.taobao.windvane.config.a.d) {
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(bVar, c.a(2, "Android Q暂时先通过开关屏蔽"));
            android.taobao.windvane.util.m.e(TAG, "Android Q暂时先通过开关屏蔽");
        } else if (android.taobao.windvane.config.a.a().j() == null) {
            new AndroidRuntimeException("WVUCWebView: can not init uc core for uc key is null").printStackTrace();
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(bVar, c.a(1, "uc key is null"));
        } else if (android.taobao.windvane.config.a.f == null) {
            new AndroidRuntimeException("WVUCWebView: can not init uc core for context is nulll").printStackTrace();
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(bVar, c.a(1, "uc context is null"));
        } else {
            android.taobao.windvane.util.m.c(TAG, "init uc core");
            if (!j.a().c()) {
                j.a().b();
                android.taobao.windvane.util.m.c(TAG, "init WVCommonConfig params before init core");
            }
            if (!q.a().c()) {
                q.a().b();
                android.taobao.windvane.util.m.c(TAG, "init WVUCCoreConfig params before init core");
            }
            if (!android.taobao.windvane.config.m.a().c()) {
                android.taobao.windvane.config.m.a().b();
            }
            if (sCoreInitialized.compareAndSet(false, true)) {
                fetchRemoteUCCore();
            } else {
                android.taobao.windvane.util.m.b(TAG, "uc core has been initialized");
            }
        }
    }

    public static void initUCCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fd9e64", new Object[0]);
        } else {
            initUCCore(null);
        }
    }

    private static void handleInitUCCore() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b6f2ac", new Object[0]);
            return;
        }
        try {
            is64Bit = WVUCUtils.is64Bit();
        } catch (Exception unused) {
            sCoreInitialized.set(false);
        }
        if (!is64Bit && WVUCUtils.isArchContains("x86")) {
            UC_CORE_URL = UC_CORE_URL_DEBUG_X86;
            android.taobao.windvane.util.m.c(TAG, "x86 arch, need not init uc core");
            sCoreInitialized.set(true);
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(c.a(4, "x86 arch, need not init uc core"));
            return;
        }
        if (android.taobao.windvane.util.e.b()) {
            UC_CORE_URL = is64Bit ? UC_CORE_URL_DEBUG_64 : UC_CORE_URL_DEBUG_32;
            android.taobao.windvane.util.m.c(TAG, "use 5.0 debug core, use 64bit = [" + is64Bit + riy.ARRAY_END_STR);
        } else {
            android.taobao.windvane.util.m.c(TAG, "use 5.0 release core, use 64bit = [" + is64Bit + riy.ARRAY_END_STR);
            UC_CORE_URL = is64Bit ? UC_CORE_URL_64 : UC_CORE_URL_32;
        }
        try {
            shouldUCLibInit.set(true);
            android.taobao.windvane.config.a a2 = android.taobao.windvane.config.a.a();
            if (a2 != null) {
                initUCLIb(a2.j(), android.taobao.windvane.config.a.f);
            } else {
                initUCLIb(null, android.taobao.windvane.config.a.f);
            }
        } catch (Throwable unused2) {
            sCoreInitialized.set(false);
            initUCLIb(android.taobao.windvane.config.a.f);
        }
    }

    private static void fetchRemoteUCCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9bcf4", new Object[0]);
            return;
        }
        android.taobao.windvane.util.m.e(TAG, "start fetch uc core");
        WVUCRemoteFetcher.fetchUCRemote(new WVUCRemoteFetcher.WVUCFetcherCallback() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher.WVUCFetcherCallback
            public void onFetchSuccess(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e41973f9", new Object[]{this, str});
                } else {
                    WVUCWebView.access$500(str);
                }
            }

            @Override // android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher.WVUCFetcherCallback
            public void onFetchFail(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("249e4e15", new Object[]{this, th});
                } else {
                    WVUCWebView.access$600(th);
                }
            }
        });
    }

    private static void onRemoteFetchSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58556b9f", new Object[]{str});
            return;
        }
        sFetchFailed = false;
        sFetchFailCode = 0;
        sFetchFailMsg = null;
        UC_CORE_REMOTE_SO_PATH = str;
        android.taobao.windvane.util.m.e(TAG, "uc core remote fetch success:" + str);
        handleInitUCCore();
    }

    private static void onRemoteFetchFail(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98da45bb", new Object[]{th});
            return;
        }
        sCoreInitialized.set(false);
        sFetchFailed = true;
        if (th instanceof RSoException) {
            RSoException rSoException = (RSoException) th;
            sFetchFailCode = rSoException.getErrorCode();
            sFetchFailMsg = rSoException.getErrorMsg();
        }
        WVCoreSettings wVCoreSettings = WVCoreSettings.getInstance();
        wVCoreSettings.notifyCoreEventCallback2Fail(c.a(3, sFetchFailCode + "_" + sFetchFailMsg));
        android.taobao.windvane.util.m.b(TAG, "uc core remote fetch fail:", th, new Object[0]);
    }

    private static boolean isUseSystemWebView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cdef258", new Object[]{context})).booleanValue();
        }
        if (mUseSystemWebViewOnce) {
            mUseSystemWebViewOnce = false;
            return true;
        }
        if (j.commonConfig.aO) {
            if (j.commonConfig.o) {
                setUseSystemWebView(true);
            }
        } else {
            setUseSystemWebView(j.commonConfig.o);
        }
        boolean z = mUseSystemWebView;
        if (!z) {
            try {
                String config = OrangeConfig.getInstance().getConfig("WindVane", "useSysWebViewBizList", "");
                if (!TextUtils.isEmpty(config)) {
                    String[] split = config.split(";");
                    String name = context.getClass().getName();
                    boolean z2 = z;
                    for (String str : split) {
                        try {
                            if (name.equals(str)) {
                                z2 = true;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    z = z2;
                }
            } catch (Throwable unused2) {
            }
        }
        if (j.commonConfig.p) {
            try {
                if (ABGlobal.isFeatureOpened(context, "windvane_uc_init_opt_v2")) {
                    android.taobao.windvane.util.m.e(TAG, "enter windvane_uc_init_opt");
                    if (!WVCore.getInstance().isUCSupport()) {
                        android.taobao.windvane.util.m.e(TAG, "windvane_uc_init_opt hit");
                        return true;
                    }
                }
            } catch (Throwable th) {
                android.taobao.windvane.util.m.b(TAG, "ucInitOpt fail", th, new Object[0]);
            }
        }
        if (sEnableSystemWebView && !z && !sStaticBlockedInitialized.get()) {
            android.taobao.windvane.util.m.e(TAG, "call staticInitializeOnce in isUseSystemWebView");
            staticInitializeOnce();
        }
        return z;
    }

    public WVUCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new adj();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (j.commonConfig.bO) {
                            f.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).b("windvane").b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).a(true).a("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").a();
                        } else {
                            b.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) == null) {
                    return;
                }
                WVUCWebView.access$400(WVUCWebView.this).b();
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        init();
    }

    public WVUCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new adj();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (j.commonConfig.bO) {
                            f.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).b("windvane").b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).a(true).a("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").a();
                        } else {
                            b.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) == null) {
                    return;
                }
                WVUCWebView.access$400(WVUCWebView.this).b();
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        init();
    }

    public WVUCWebView(Context context) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new adj();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (j.commonConfig.bO) {
                            f.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).b("windvane").b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).a(true).a("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").a();
                        } else {
                            b.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) == null) {
                    return;
                }
                WVUCWebView.access$400(WVUCWebView.this).b();
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        init();
    }

    public WVUCWebView(Context context, Map<String, String> map) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new adj();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (j.commonConfig.bO) {
                            f.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).b("windvane").b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).a(true).a("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").a();
                        } else {
                            b.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) == null) {
                    return;
                }
                WVUCWebView.access$400(WVUCWebView.this).b();
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        this.openTracingContextMap = map;
        init();
    }

    public static void staticInitializeOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49e2546", new Object[0]);
        } else if (!sStaticBlockedInitialized.compareAndSet(false, true)) {
        } else {
            android.taobao.windvane.util.m.e(TAG, "staticInitializeOnce");
            UCCoreStartup.getInstance().initPreprocess();
            if (android.taobao.windvane.config.a.a().m()) {
                return;
            }
            initUCCore();
        }
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }

    public WVUCWebView(Context context, String str) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new adj();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (j.commonConfig.bO) {
                            f.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).b("windvane").b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).a(true).a("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").a();
                        } else {
                            b.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) == null) {
                    return;
                }
                WVUCWebView.access$400(WVUCWebView.this).b();
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        if (!TextUtils.isEmpty(str)) {
            this.pid = str;
        }
        this.context = context;
        init();
    }

    public void setPrefetchInfo(android.taobao.windvane.export.network.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26aa3ee", new Object[]{this, gVar});
        } else {
            this.mPrefetchInfo = gVar;
        }
    }

    public android.taobao.windvane.export.network.g getPrefetchInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.taobao.windvane.export.network.g) ipChange.ipc$dispatch("e387074", new Object[]{this}) : this.mPrefetchInfo;
    }

    public void setLongPressSaveImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e90054", new Object[]{this, new Boolean(z)});
        } else {
            this.longPressSaveImage = z;
        }
    }

    @Override // android.taobao.windvane.webview.e
    public Map<String, String> getOpenTracingContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("be9386a9", new Object[]{this}) : this.openTracingContextMap;
    }

    public void setOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21064005", new Object[]{this, map});
        } else {
            this.openTracingContextMap = map;
        }
    }

    @Override // android.taobao.windvane.webview.e
    public n getFalcoSpan() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("cc8908b1", new Object[]{this}) : this.containerSpan;
    }

    @Override // android.taobao.windvane.webview.e
    public void setFalcoSpan(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2175ff", new Object[]{this, nVar});
            return;
        }
        this.containerSpan = nVar;
        UCLog.getInstance().getSpanWrapper().a(nVar);
        this.mSpanWrapper.a(nVar);
    }

    @Override // android.taobao.windvane.webview.e
    public adj getSpanWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (adj) ipChange.ipc$dispatch("7c5935c5", new Object[]{this}) : this.mSpanWrapper;
    }

    public void setPerformanceDelegate(WVPerformance wVPerformance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958e2782", new Object[]{this, wVPerformance});
        } else {
            this.performanceDelegate = wVPerformance;
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public WVPerformance getPerformanceDelegate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVPerformance) ipChange.ipc$dispatch("dd667958", new Object[]{this}) : this.performanceDelegate;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38219a8", new Object[]{this, new Long(j)});
            return;
        }
        this.wvfspManager.receiveJSMessage(j);
        this.pageTracker.onPageReceivedFSP(j);
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForCustomizedFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386157c9", new Object[]{this, new Long(j)});
        } else {
            this.pageTracker.onPageReceivedCustomizedFSP(j);
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForCustomizedStage(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd72d78", new Object[]{this, new Long(j), str});
        } else {
            this.pageTracker.onPageReceivedCustomizedStage(j, str);
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForFP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70c8d05", new Object[]{this, new Long(j)});
            return;
        }
        this.wvh5PPManager.receiveFPTime(j);
        this.pageTracker.onPageReceivedFP(j);
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveJSMessageForTTI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac6dcc2", new Object[]{this, new Long(j)});
            return;
        }
        this.wvh5PPManager.receiveTTITime(j);
        this.pageTracker.onPageReceivedTTI(j);
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveOnProperty(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28dbf60", new Object[]{this, jSONObject});
        } else {
            this.pageTracker.onPageReceiveProperty(jSONObject);
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void receiveOnStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0dc1d8d", new Object[]{this, str});
        } else {
            this.pageTracker.onPageReceiveStage(str);
        }
    }

    public boolean isLive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("252586c1", new Object[]{this})).booleanValue() : this.isLive;
    }

    public static void setUcCoreUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1356731", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            UC_CORE_URL = str;
        }
    }

    public static int getFromType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a805aaf4", new Object[0])).intValue();
        }
        fromType = 70;
        if (WVCore.getInstance().isUCSupport()) {
            fromType = getUseTaobaoNetwork() ? 6 : 5;
        } else if (!mUseSystemWebView) {
            fromType = 71;
        }
        return fromType;
    }

    @Deprecated
    public static boolean getUCSDKSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb055c4", new Object[0])).booleanValue() : WVCore.getInstance().isUCSupport();
    }

    public static void setUseSystemWebView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f78128", new Object[]{new Boolean(z)});
            return;
        }
        mUseSystemWebView = z;
        fromType = 70;
    }

    public static void setUseSystemWebViewOnce(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6541f5a7", new Object[]{new Boolean(z)});
        } else {
            mUseSystemWebViewOnce = z;
        }
    }

    public static void setDegradeAliNetwork(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a426a9", new Object[]{new Boolean(z)});
        } else {
            mDegradeAliNetwork = z;
        }
    }

    public static boolean getDegradeAliNetwork() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3d18b1b", new Object[0])).booleanValue() : mDegradeAliNetwork;
    }

    public static boolean getUseTaobaoNetwork() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e3eeb5a", new Object[0])).booleanValue() : WVCore.getInstance().isUCSupport() && mUseAliNetwork;
    }

    public static void setUseTaobaoNetwork(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b1e4b2", new Object[]{new Boolean(z)});
        } else {
            mUseAliNetwork = z;
        }
    }

    @Deprecated
    public static void setCoreEventCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e11c95", new Object[]{aVar});
        } else {
            coreEventCallback = aVar;
        }
    }

    public static void onUCMCoreInitFailed(UCKnownException uCKnownException) {
        String str;
        Throwable rootCause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c7cfb3", new Object[]{uCKnownException});
            return;
        }
        sCoreFailed = true;
        if (uCKnownException != null) {
            sCoreFailedCode = uCKnownException.errCode();
            str = uCKnownException.getMessage();
            sCoreFailedMsg = str;
            if (TextUtils.isEmpty(str) && (rootCause = uCKnownException.getRootCause()) != null) {
                str = rootCause.getMessage();
            }
        } else {
            str = "";
        }
        android.taobao.windvane.util.m.e(TAG, "onUCMCoreInitFailed,code:" + sCoreFailedCode + ",msg:" + sCoreFailedMsg);
        WVCoreSettings wVCoreSettings = WVCoreSettings.getInstance();
        wVCoreSettings.notifyCoreEventCallback2Fail(c.a(3, "uc core init failed, code:" + sCoreFailedCode + ", msg:" + str));
    }

    public static void onUCMCoreDownloadIntercepted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3fab41", new Object[0]);
            return;
        }
        android.taobao.windvane.util.m.c(TAG, "UCSDK init onUCMCoreDownloadIntercepted");
        sCoreInitialized.set(false);
        shouldUCLibInit.set(false);
        WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(c.a(3, "uc core download intercepted"));
    }

    public static void onUCMCoreSwitched(Context context, long j, IRunningCoreInfo iRunningCoreInfo) {
        android.taobao.windvane.monitor.n wvMonitorInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd41567f", new Object[]{context, new Long(j), iRunningCoreInfo});
            return;
        }
        android.taobao.windvane.util.m.c(TAG, "UCSDK init onUCMCoreSwitched: " + getCoreType());
        if (WVCore.getInstance().isUCSupport() || getCoreType() != 3) {
            return;
        }
        android.taobao.windvane.util.m.c(TAG, "CorePreparedCallback   isUCSDKSupport = true");
        WVCore.getInstance().setUCSupport(true);
        if (mUseAliNetwork) {
            INetworkHostingService.Instance.set(new AliNetworkHostingService(context));
        }
        sCoreFailed = false;
        sCoreFailedCode = 0;
        sCoreFailedMsg = null;
        if (coreEventCallback != null) {
            WVCoreSettings.getInstance().setCoreEventCallback(coreEventCallback);
        }
        if (WVCoreSettings.getInstance().coreEventCallbacks != null) {
            for (a aVar : WVCoreSettings.getInstance().coreEventCallbacks) {
                aVar.onUCCorePrepared();
            }
        }
        WVCoreSettings.getInstance().notifyCoreEventCallback2Success();
        j.a();
        if (j.commonConfig.bh) {
            UCCoreController.registerThreadANRCallback(UCLog.getInstance().getSpanWrapper());
        }
        new UCHAManager().initHAParam(android.taobao.windvane.config.a.a().r());
        android.taobao.windvane.util.m.e(TAG, "onUCMCoreSwitched init ExtImgDecoder");
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        Application application = (Application) context;
        if (j.commonConfig.cg && !sNetworkDelegateSet.get() && application != null && sNetworkDelegateSet.compareAndSet(false, true)) {
            android.taobao.windvane.util.m.e(TAG, "set WVNetworkDelegate");
            INetworkDelegate.Instance.set(1, new WVNetworkDelegate(application));
        }
        ExtImgDecoder.getInstance().init(android.taobao.windvane.config.a.f);
        if (j.commonConfig.cq && (wvMonitorInterface = o.getWvMonitorInterface()) != null) {
            wvMonitorInterface.commitCoreInitTime(System.currentTimeMillis() - j, String.valueOf(j.commonConfig.R));
        }
        aem.a().a(ErrorCode.SERVER_DATA_ERROR);
        if (!android.taobao.windvane.config.a.a().q()) {
            WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVUCWebView.access$700();
                    }
                }
            });
        }
        UCSetupService.initUCPlayerByDownload(android.taobao.windvane.config.a.f, UC_PLAYER_URL);
        commitUCCoreReuseInfo(iRunningCoreInfo);
        addUCCoreInfoToMotu(iRunningCoreInfo);
    }

    private static void commitUCCoreReuseInfo(IRunningCoreInfo iRunningCoreInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda7032f", new Object[]{iRunningCoreInfo});
        } else if (iRunningCoreInfo == null) {
        } else {
            String version = iRunningCoreInfo.coreVersion() != null ? iRunningCoreInfo.coreVersion().version() : null;
            if (iRunningCoreInfo.isReUsed()) {
                android.taobao.windvane.monitor.a.commitSuccess(android.taobao.windvane.monitor.a.MONITOR_POINT_CORE_REUSE, version);
            } else {
                android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_CORE_REUSE, -1, version, null);
            }
        }
    }

    private static void addUCCoreInfoToMotu(IRunningCoreInfo iRunningCoreInfo) {
        qfu qfuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce7c4ab", new Object[]{iRunningCoreInfo});
            return;
        }
        try {
            if (!j.commonConfig.cp || (qfuVar = (qfu) qgm.a().a(qfu.class)) == null) {
                return;
            }
            qfuVar.a("uc_core_first_used", String.valueOf(iRunningCoreInfo.isFirstUsed()));
            qfuVar.a("uc_core_is_reused", String.valueOf(iRunningCoreInfo.isReUsed()));
            qfuVar.a("uc_core_path", iRunningCoreInfo.path());
            qfuVar.a("uc_core_lib_path", iRunningCoreInfo.libPath());
        } catch (Throwable th) {
            android.taobao.windvane.util.m.b(TAG, "add uc core info to motu fail", th, new Object[0]);
        }
    }

    public static boolean initUCLIb(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3a4945e", new Object[]{context})).booleanValue();
        }
        if (shouldUCLibInit.get()) {
            if (context != null) {
                return initUCLIb(null, context.getApplicationContext());
            }
            return false;
        }
        RuntimeException runtimeException = new RuntimeException("init uclib outer");
        runtimeException.fillInStackTrace();
        android.taobao.windvane.util.m.e(TAG, runtimeException.getStackTrace()[0].toString() + "\n" + runtimeException.getStackTrace()[1].toString() + "\n" + runtimeException.getStackTrace()[2].toString());
        return false;
    }

    public static boolean initUCLIb(String[] strArr, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca2131bb", new Object[]{strArr, context})).booleanValue();
        }
        UCLog.getInstance().init(j.commonConfig.ab);
        setUseSystemWebView(j.commonConfig.o);
        android.taobao.windvane.util.m.b(TAG, "UCSDK initUCLib UseSystemWebView " + mUseSystemWebView);
        if (WVCore.getInstance().isUCSupport()) {
            return true;
        }
        try {
            setUcCoreUrl(j.commonConfig.r);
            if (strArr == null && android.taobao.windvane.util.e.d()) {
                strArr = d.TB_UC_SDK_APP_KEY_SEC;
            }
            if (UCSetupService.isU4MultiProcess(context)) {
                WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(c.a(5, "uc core process no need init"));
                return false;
            }
            UCSetupService.configInitSettings(context);
            String str = UCSoSettings.getInstance().UC_CORE_TYPE;
            Object[] objArr = new Object[2];
            objArr[0] = "thick".equals(str) ? "厚" : "thin".equals(str) ? "薄" : "海外薄";
            objArr[1] = "true".equals(UCSoSettings.getInstance().UC_DEBUGGABLE) ? "" : "不";
            String format = String.format("%s集成、%s可调试内核", objArr);
            if (WVCore.getInstance().innerSo(context)) {
                android.taobao.windvane.util.m.e(TAG, "当前内置" + format);
                UCSetupService.initU4ByCompressedLib(context, strArr, UCCoreStartup.ucCore7ZFilePath(context));
                return !mUseSystemWebView;
            }
            String k = android.taobao.windvane.config.a.a().k();
            if (!TextUtils.isEmpty(k)) {
                android.taobao.windvane.util.m.e(TAG, "当前已解压" + format);
                UCSetupService.initU4ByExtractedDir(context, strArr, k);
                return !mUseSystemWebView;
            }
            String str2 = UC_CORE_REMOTE_SO_PATH;
            if (!TextUtils.isEmpty(str2)) {
                android.taobao.windvane.util.m.e(TAG, "当前远程化SO" + format);
                android.taobao.windvane.util.m.e(TAG, "当前远程化SO路径：" + str2);
                File file = new File(str2);
                if (file.isFile()) {
                    android.taobao.windvane.util.m.e(TAG, "kernel file, " + format + ", localPath=" + str2);
                    UCSetupService.initU4ByCompressedLib(context, strArr, str2);
                } else if (file.isDirectory()) {
                    android.taobao.windvane.util.m.e(TAG, "kernel dir, " + format + ", localPath=" + str2);
                    UCSetupService.initU4ByExtractedDir(context, strArr, str2);
                }
                return !mUseSystemWebView;
            } else if (TextUtils.isEmpty(UC_CORE_URL)) {
                new AndroidRuntimeException("neither inner so, remote so, nor download so").printStackTrace();
                if (WVUCUtils.is64Bit()) {
                    sCoreFailedCode = 300764;
                } else {
                    sCoreFailedCode = 300732;
                }
                WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(c.a(6, "neither inner so, remote so, nor download so"));
                return false;
            } else {
                android.taobao.windvane.util.m.e(TAG, "当前下载" + format);
                UCSetupService.initU4ByDownload(context, strArr, UC_CORE_URL);
                return !mUseSystemWebView;
            }
        } catch (Exception e) {
            android.taobao.windvane.util.m.e(TAG, "UCCore init fail " + e.getMessage());
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(c.a(8, e.getMessage()));
            return false;
        }
    }

    public boolean isCurrentU4() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b98d39", new Object[]{this})).booleanValue() : getCurrentViewCoreType() == 3;
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        TouchEventHandler touchEventHandler = this.mTouchEventHandler;
        if (touchEventHandler != null) {
            touchEventHandler.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
        } else if (TextUtils.isEmpty(this.uid)) {
            this.uid = "" + id.addAndGet(1);
        } else {
            this.uid += "_" + subId.addAndGet(1);
        }
    }

    @Override // tb.adm
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        if (j.commonConfig.bL) {
            return this.pageTracker.getPageIdentifier();
        }
        return "WVUC_" + this.uid;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this}) : this.pid;
    }

    public static boolean isNeedCookie(String str) {
        Matcher matcher;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27270af9", new Object[]{str})).booleanValue();
        }
        try {
            if (pattern == null || (matcher = pattern.matcher(str)) == null) {
                return true;
            }
            return !matcher.matches();
        } catch (Exception e) {
            android.taobao.windvane.util.m.e(TAG, "Pattern complile Exception" + e.getMessage());
            return true;
        }
    }

    public WVUCWebView(Context context, boolean z) {
        super(context, isUseSystemWebView(context));
        this.asyncApiProxy = null;
        this.bizCode = "";
        this.overrideBizId = null;
        this.flag4commit = false;
        this.isLive = false;
        this.mIsCoreDestroy = false;
        this.isRealDestroyed = false;
        this.aliRequestAdapter = null;
        this.taskQueue = new ArrayList();
        this.wpData = new WVWPData(this);
        this.statusBarImmersive = false;
        this.reportedFSP = false;
        this.mSpanWrapper = new adj();
        this.mExternalContext = null;
        this.mPrefetchInfo = null;
        this.mTouchEventHandler = null;
        this.mWebViewContext = new WebViewContext(this);
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mHandler = null;
        this.supportDownload = true;
        this.mWvNativeCallbackId = 1000;
        this.dataOnActive = null;
        this.longPressSaveImage = true;
        this.ucParam = "";
        this.currentUrl = null;
        this.cachedUrl = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mLongClickListener = null;
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.isPreCreated = false;
        this.mWebViewPaused = false;
        this.mNeedReloadWhenOnResume = false;
        this.popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVUCWebView.access$200(WVUCWebView.this) != null && WVUCWebView.access$200(WVUCWebView.this).length > 0 && WVUCWebView.access$200(WVUCWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                        } else if (j.commonConfig.bO) {
                            f.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).b("windvane").b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).a(true).a("“手机淘宝”想访问您的手机存储，为了把图片等资源保存到您的手机").a();
                        } else {
                            b.a(WVUCWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (WVUCWebView.this.context == null) {
                                    } else {
                                        h.a(WVUCWebView.this.context.getApplicationContext(), WVUCWebView.access$300(WVUCWebView.this), WVUCWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVUCWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVUCWebView.access$400(WVUCWebView.this) == null) {
                    return;
                }
                WVUCWebView.access$400(WVUCWebView.this).b();
            }
        };
        this.wvUIModel = null;
        this.onErrorTime = 0L;
        this.wvfspManager = new WVFSPManager();
        this.wvh5PPManager = new WVH5PPManager(this);
        this.wvErrorManager = new WVErrorManager();
        this.pageTracker = new WVPageTracker();
        this.pid = "";
        this.uid = "";
        this.mIsStaticWebView = false;
        this.firstTimeLoad = true;
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.mH5MonitorCache = null;
        this.mPageStart = 0L;
        this.injectJs = new StringBuilder("javascript:");
        this.isPreInit = false;
        this.context = context;
        this.mIsStaticWebView = z;
        if (o.getWvMonitorInterface() != null) {
            o.getWvMonitorInterface().WebViewWrapType(context.getClass().getSimpleName());
        }
        if (z) {
            setWebViewClient(new WVUCWebViewClient(context));
            setWebChromeClient(new WVUCWebChromeClient(context));
            UCExtension uCExtension = getUCExtension();
            if (uCExtension == null) {
                return;
            }
            uCExtension.setClient(new WVUCClient(this));
            return;
        }
        init();
    }

    public boolean isStaticWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f9d94cc", new Object[]{this})).booleanValue() : this.mIsStaticWebView;
    }

    public static boolean isWebViewMultiProcessEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f66e9e7", new Object[0])).booleanValue() : q.configData.f1570a > 0;
    }

    public Context getCurrentContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("51c1976b", new Object[]{this}) : _getContext();
    }

    @Override // com.uc.webview.export.WebView
    public void postUrl(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7062c7", new Object[]{this, str, bArr});
        } else if (str == null) {
        } else {
            if (android.taobao.windvane.util.p.b(str) && android.taobao.windvane.config.p.c(str, this)) {
                String b = android.taobao.windvane.config.s.a().b();
                if (TextUtils.isEmpty(b)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "POST_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    loadUrl(b);
                } catch (Exception e) {
                    android.taobao.windvane.util.m.e(TAG, e.getMessage());
                }
            } else if (android.taobao.windvane.webview.n.a(str, this.context, this)) {
                android.taobao.windvane.util.m.e(TAG, "postUrl filter url=" + str);
                android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_URL_CONFIG_FILTER_TYPE, 2, "WVUCWebView.loadUrl", str);
            } else {
                k a2 = android.taobao.windvane.webview.j.a();
                if (a2 != null) {
                    str = a2.dealUrlScheme(str);
                }
                this.wpData.setPageCurrentStatus("postUrl");
                try {
                    UCNetworkDelegate.getInstance().onUrlChange(this, str);
                    android.taobao.windvane.util.m.c(TAG, "postUrl : " + str);
                    commitLoadUrl(str, 3);
                    super.postUrl(str, bArr);
                } catch (Exception e2) {
                    android.taobao.windvane.util.m.e(TAG, e2.getMessage());
                }
                setCachedUrl(str);
            }
        }
    }

    @Override // com.uc.webview.export.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ef121", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        WVGlobalState.markLoadUrl();
        if (android.taobao.windvane.util.m.a()) {
            android.taobao.windvane.util.m.e(TAG, "loadDataWithBaseURL: baseUrl=" + str);
        }
        alr alrVar = this.mAbilityEnv;
        if (alrVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                alrVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (str == null) {
        } else {
            alr alrVar = this.mAbilityEnv;
            if (alrVar != null) {
                Context context = this.context;
                if (context instanceof MutableContextWrapper) {
                    alrVar.a(((MutableContextWrapper) context).getBaseContext());
                }
            }
            adj adjVar = this.mSpanWrapper;
            adjVar.b("loadUrl: " + str);
            this.wpData.timeLoadurl = System.currentTimeMillis();
            if (this.mIsCoreDestroy) {
                j.a();
                if (j.commonConfig.bc) {
                    android.taobao.windvane.monitor.a.commitFail("callAfterDestroy", 1, android.taobao.windvane.util.a.a(new Exception().fillInStackTrace()), str);
                    android.taobao.windvane.util.m.e(TAG, "callAfterDestroy forbid");
                    return;
                }
            }
            j.a();
            if (!TextUtils.isEmpty(j.commonConfig.be)) {
                j.a();
                if (str.matches(j.commonConfig.be)) {
                    if (this.overrideBizId == null) {
                        setOverrideBizCode("meeting");
                    } else {
                        setOverrideBizCode(this.overrideBizId + "&meeting");
                    }
                }
            }
            if (android.taobao.windvane.util.p.b(str)) {
                if (android.taobao.windvane.config.p.c(str, this)) {
                    String b = android.taobao.windvane.config.n.a().b();
                    if (TextUtils.isEmpty(b)) {
                        HashMap hashMap = new HashMap(2);
                        hashMap.put("cause", "GET_ACCESS_FORBIDDEN");
                        hashMap.put("url", str);
                        onMessage(402, hashMap);
                        return;
                    }
                    try {
                        super.loadUrl(b);
                        return;
                    } catch (Exception e) {
                        android.taobao.windvane.util.m.e(TAG, e.getMessage());
                        return;
                    }
                } else if (android.taobao.windvane.webview.n.a(str, this.context, this)) {
                    android.taobao.windvane.util.m.e(TAG, "loadUrl filter url=" + str);
                    android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_URL_CONFIG_FILTER_TYPE, 1, "WVUCWebView.loadUrl", str);
                    return;
                } else {
                    try {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("userAgent", getUserAgentString());
                        String a2 = com.taobao.weaver.prefetch.e.a().a(str, hashMap2);
                        if (!TextUtils.isEmpty(a2)) {
                            str = a2;
                        }
                    } catch (Throwable th) {
                        android.taobao.windvane.util.m.e(TAG, "failed to call prefetch: " + th.getMessage());
                        th.getStackTrace();
                    }
                    if (getCurrentViewCoreType() == 3) {
                        tryPrcacheDocument(str);
                    }
                }
            } else if (!TextUtils.isEmpty(str) && !str.startsWith("javascript:") && !str.startsWith("about:")) {
                android.taobao.windvane.monitor.a.commitFail("NoHttpLoad", 1, null, str);
            }
            String handleUrlSchema = handleUrlSchema(str);
            if (!TextUtils.isEmpty(handleUrlSchema) && !handleUrlSchema.startsWith("javascript:") && !handleUrlSchema.startsWith("about:")) {
                if (this.firstTimeLoad && !handleUrlSchema.contains(BasePreInitManager.PRE_RENDER_URL_ADDITION_JUDGE)) {
                    this.wvh5PPManager.pageDidLoadRequest();
                    android.taobao.windvane.util.m.b(TAG, "pageDidLoadRequest " + getCurId() + " this=" + this + " loadUrl::" + handleUrlSchema);
                    this.firstTimeLoad = false;
                }
                this.wvh5PPManager.receiveHtmlUrl(handleUrlSchema);
                this.pageTracker.loadUrl(handleUrlSchema);
                this.wpData.setPageCurrentStatus("loadUrl");
                try {
                    String queryParameter = Uri.parse(handleUrlSchema).getQueryParameter("_wvPgName");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        setFalcoPageName(queryParameter);
                    }
                } catch (Throwable th2) {
                    android.taobao.windvane.util.m.e(TAG, android.taobao.windvane.util.a.a(th2));
                }
            }
            try {
                UCNetworkDelegate.getInstance().onUrlChange(this, handleUrlSchema);
                android.taobao.windvane.util.m.b(TAG, getCurId() + " this=" + this + " loadUrl:: " + handleUrlSchema);
                if (j.commonConfig.bG) {
                    this.currentUrl = handleUrlSchema;
                }
                commitLoadUrl(handleUrlSchema, 1);
                WVGlobalState.markLoadUrl();
                super.loadUrl(handleUrlSchema);
            } catch (Exception e2) {
                android.taobao.windvane.util.m.e(TAG, e2.getMessage());
            }
            setCachedUrl(handleUrlSchema);
        }
    }

    @Override // com.uc.webview.export.WebView
    public void loadUrl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d389bcb", new Object[]{this, str, map});
            return;
        }
        alr alrVar = this.mAbilityEnv;
        if (alrVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                alrVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        String handleUrlSchema = handleUrlSchema(str);
        commitLoadUrl(handleUrlSchema, 2);
        WVGlobalState.markLoadUrl();
        super.loadUrl(handleUrlSchema, map);
        setCachedUrl(handleUrlSchema);
    }

    @Override // com.uc.webview.export.WebView
    public void loadData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5f04d5", new Object[]{this, str, str2, str3});
            return;
        }
        alr alrVar = this.mAbilityEnv;
        if (alrVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                alrVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        super.loadData(str, str2, str3);
    }

    @Override // com.uc.webview.export.WebView
    public void loadHtmlData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b75ec16", new Object[]{this, str, str2});
            return;
        }
        alr alrVar = this.mAbilityEnv;
        if (alrVar != null) {
            Context context = this.context;
            if (context instanceof MutableContextWrapper) {
                alrVar.a(((MutableContextWrapper) context).getBaseContext());
            }
        }
        super.loadHtmlData(str, str2);
    }

    private String handleUrlSchema(String str) {
        k a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ff6a87", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.startsWith("javascript:") || str.startsWith("about:") || str.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX)) {
            return str;
        }
        boolean isInHttpUrlWhiteList = isInHttpUrlWhiteList(str);
        if (isInHttpUrlWhiteList && str.startsWith(ado.URL_SEPARATOR)) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "WindVane/Page").a("invalid_scheme").a("url", (Object) str).a();
            return str.replaceFirst(ado.URL_SEPARATOR, com.taobao.search.common.util.k.HTTP_PREFIX);
        } else if (!j.commonConfig.cm || isInHttpUrlWhiteList || (a2 = android.taobao.windvane.webview.j.a()) == null) {
            return str;
        } else {
            String dealUrlScheme = a2.dealUrlScheme(str);
            if (TextUtils.equals(str, dealUrlScheme)) {
                return str;
            }
            android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_DEAL_URL_SCHEME, 0, str, dealUrlScheme);
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "WindVane/Page").a("url_scheme_changed").a("url", (Object) str).a("new_url", (Object) dealUrlScheme).a();
            return dealUrlScheme;
        }
    }

    private boolean isInHttpUrlWhiteList(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a439b3c4", new Object[]{this, str})).booleanValue();
        }
        String str2 = j.commonConfig.cl;
        if (!TextUtils.isEmpty(str2) && (split = str2.split(",")) != null && split.length != 0) {
            try {
                for (String str3 : split) {
                    if (str.startsWith(ado.URL_SEPARATOR + str3)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                android.taobao.windvane.util.m.b(TAG, "url parse fail", e, new Object[0]);
            }
        }
        return false;
    }

    private void commitLoadUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb980e0", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (j.commonConfig.ce && str != null && (str.startsWith(ado.URL_SEPARATOR) || str.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX))) {
            android.taobao.windvane.monitor.a.commitFail("loadHttpUrl", i, getContextName(), str);
        }
        if (!j.commonConfig.cf || str == null) {
            return;
        }
        android.taobao.windvane.monitor.a.commitFail("loadUrl", i, getContextName(), str);
    }

    private String getContextName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17dfa1d5", new Object[]{this});
        }
        Context _getContext = _getContext();
        return _getContext != null ? _getContext.getClass().getName() : "";
    }

    private void tryPrcacheDocument(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a599b51", new Object[]{this, str});
        } else if (!WVUCPrecacheManager.getInstance().canPrecacheDoc(str) || this.webViewClient == null) {
        } else {
            WebResourceResponse shouldInterceptRequest = this.webViewClient.shouldInterceptRequest(this, new WebResourceRequest(str, new HashMap()));
            if (shouldInterceptRequest != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(str, shouldInterceptRequest);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("maxAge", "10");
                hashMap2.put("ignoreQuery", "0");
                StorageUtils.precacheResources(hashMap, hashMap2);
                return;
            }
            WVUCPrecacheManager.getInstance().addPrecacheDoc(str);
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            reload();
        }
    }

    public void refreshWhenForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24164c5f", new Object[]{this});
        } else if (j.commonConfig.cV) {
            if (this.mWebViewPaused) {
                this.mNeedReloadWhenOnResume = true;
            } else {
                reload();
            }
        } else {
            reload();
        }
    }

    private void refreshIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535bc934", new Object[]{this});
        } else if (!this.mNeedReloadWhenOnResume) {
        } else {
            reload();
            this.mNeedReloadWhenOnResume = false;
        }
    }

    @Override // com.uc.webview.export.WebView
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("userAgent", getUserAgentString());
            com.taobao.weaver.prefetch.e.a().a(getCurrentUrl(), hashMap);
        } catch (Throwable th) {
            android.taobao.windvane.util.m.e(TAG, "failed to call prefetch: " + th.getMessage());
            th.printStackTrace();
        }
        super.reload();
    }

    @Override // com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : getCurrentUrl();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (!canGoBack()) {
            return false;
        }
        String url = getUrl();
        adl a2 = adl.a();
        if (!TextUtils.isEmpty(url) && a2 != null) {
            a2.a(url);
        }
        goBack();
        int i = this.mPageLoadedCount;
        if (i > 0) {
            this.mPageLoadedCount = i - 1;
        } else {
            android.taobao.windvane.util.m.e(TAG, "back pressed, mPageLoadedCount=" + this.mPageLoadedCount);
        }
        return true;
    }

    private void init() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        updateCurId();
        android.taobao.windvane.util.m.e(TAG, "uc webview init ");
        JSAPIManager.getInstance().register();
        android.taobao.windvane.embed.b.a();
        this.containerSpan = android.taobao.windvane.util.f.a("windvanePage", "H5Page", this.isPreInit ? null : getOpenTracingContext());
        setFalcoSpan(this.containerSpan);
        try {
            oxv oxvVar = (oxv) qgm.a().a(oxv.class);
            if (oxvVar != null) {
                setTag(oxvVar.a(), oxvVar.c());
                setTag(oxvVar.b(), true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        webviewIndentifier++;
        this.pageTracker.setWebViewIdentifier(webviewIndentifier);
        this.wvh5PPManager.webViewDidStartInit();
        this.pageTracker.initStart(this, this);
        if (!sCoreInitialized.get()) {
            android.taobao.windvane.util.m.e(TAG, "uc compensation initialization");
            sForegroundInitUC = true;
            initUCCore();
        }
        if (o.getWvMonitorInterface() != null) {
            o.getWvMonitorInterface().WebViewWrapType(_getContext().getClass().getSimpleName());
        }
        this.mIsCoreDestroy = false;
        setContentDescription(TAG);
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        if (TextUtils.equals("true", UCSoSettings.getInstance().UC_DEBUGGABLE)) {
            try {
                if (WVCore.getInstance().isUCStartInit()) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    android.webkit.WebView.setWebContentsDebuggingEnabled(true);
                }
            } catch (Exception e) {
                android.taobao.windvane.util.m.e(TAG, "WebView.setWebContentsDebuggingEnabled failed", e, new Object[0]);
            }
        }
        this.isLive = true;
        j.a();
        setUseTaobaoNetwork(!mDegradeAliNetwork && j.commonConfig.m > Math.random());
        android.taobao.windvane.util.m.b(TAG, "Webview init setUseTaobaoNetwork =" + getUseTaobaoNetwork());
        try {
            j.a();
            if (!TextUtils.isEmpty(j.commonConfig.q)) {
                pattern = Pattern.compile(j.commonConfig.q);
            }
        } catch (Exception e2) {
            android.taobao.windvane.util.m.e(TAG, "Pattern complile Exception" + e2.getMessage());
        }
        i.a(this.context);
        configSettings();
        if (getCurrentViewCoreType() == 3) {
            android.taobao.windvane.util.m.e(TAG, "core type: U4");
            WVCore.getInstance().setUCSupport(true);
            UCSetupService.configGlobalSettings();
            if (j.commonConfig.bT && !sIsSetHttpCacheSize && Looper.myLooper() == Looper.getMainLooper()) {
                StorageUtils.setHttpCacheMaxSize(j.commonConfig.bU, null);
                sIsSetHttpCacheSize = true;
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, "WindVane/Cache", "Set HttpCache Max Size:" + j.commonConfig.bU);
            }
            if (android.taobao.windvane.util.e.b()) {
                StorageUtils.computeHttpCacheSize(new ValueCallback<Long>() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Long l) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2bfdf613", new Object[]{this, l});
                            return;
                        }
                        RVLLevel rVLLevel = RVLLevel.Info;
                        com.taobao.android.riverlogger.e.a(rVLLevel, "WindVane/Cache", "GetHttpCacheSize:" + l);
                    }
                });
            }
            android.taobao.windvane.monitor.a.commitSuccess(android.taobao.windvane.monitor.a.MONITOR_POINT_WEB_CORE_TYPE, null);
        } else {
            android.taobao.windvane.util.m.e(TAG, "core type: Android");
            if (j.commonConfig.o) {
                str = "forceSystem";
            } else if (WVCore.getInstance().isUCSupport()) {
                str = "successInit";
            } else if (sCoreFailed) {
                str = "core_" + sCoreFailedCode;
            } else if (WVUCRemoteFetcher.hasUCRemoteLocal()) {
                str = "notDoUCInitOrUCIniting";
            } else if (sFetchFailed) {
                str = "fetchFail_" + sFetchFailCode;
            } else {
                str = sCoreInitialized.get() ? "notDownloaded" : "coreNotInit";
            }
            android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_WEB_CORE_TYPE, getCurrentViewCoreType(), str, android.taobao.windvane.util.a.c(this.context));
            android.taobao.windvane.util.m.e(TAG, "WebViewCoreTypeByPV coreType=" + getCurrentViewCoreType() + " errorMsg=" + str + " process=" + android.taobao.windvane.util.a.c(this.context));
        }
        if (getCurrentViewCoreType() == 3) {
            ExtImgDecoder.getInstance().init(this.context);
        }
        WVWPManager.getInstance().onViewInit(hashCode(), this.wpData);
        setWebViewClient(new WVUCWebViewClient(this.context));
        setWebChromeClient(new WVUCWebChromeClient(this.context));
        UCExtension uCExtension = getUCExtension();
        if (uCExtension != null) {
            uCExtension.setClient(new WVUCClient(this));
        }
        this.wvUIModel = new m(_getContext(), this);
        l.b().c();
        this.entryManager = new p(this.context, this, this);
        WVAppEvent wVAppEvent = new WVAppEvent();
        wVAppEvent.initialize(_getContext(), this);
        addJsObject("AppEvent", wVAppEvent);
        if (!initedJSBridge) {
            android.taobao.windvane.jsbridge.q.a("WVFullTrace", (Class<? extends android.taobao.windvane.jsbridge.e>) WVFullTrace.class);
            android.taobao.windvane.jsbridge.q.a("WVFalco", (Class<? extends android.taobao.windvane.jsbridge.e>) WVFalco.class);
            if (j.commonConfig.bR) {
                android.taobao.windvane.jsbridge.q.a("WVMega", (Class<? extends android.taobao.windvane.jsbridge.e>) WVMega.class);
            }
            initedJSBridge = true;
        }
        this.wvSecurityFilter = new adi();
        aem.a().a(this.wvSecurityFilter, aem.f25291a);
        this.jsPatchListener = new adr(this);
        aem.a().a(this.jsPatchListener, aem.c);
        if (Build.VERSION.SDK_INT > 10 && Build.VERSION.SDK_INT < 17) {
            try {
                removeJavascriptInterface("searchBoxJavaBridge_");
                removeJavascriptInterface("accessibility");
                removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th2) {
                android.taobao.windvane.util.m.b(TAG, "removeJavascriptInterface " + th2.getMessage());
            }
        }
        this.mLongClickListener = new View.OnLongClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                try {
                    WebView.HitTestResult hitTestResult = WVUCWebView.this.getHitTestResult();
                    if (hitTestResult == null || !WVUCWebView.access$800(WVUCWebView.this)) {
                        return false;
                    }
                    if (android.taobao.windvane.util.m.a()) {
                        android.taobao.windvane.util.m.b(WVUCWebView.TAG, "Long click on WebView, " + hitTestResult.getExtra());
                    }
                    if (hitTestResult.getType() != 8 && hitTestResult.getType() != 5) {
                        return false;
                    }
                    WVUCWebView.access$302(WVUCWebView.this, hitTestResult.getExtra());
                    WVUCWebView wVUCWebView = WVUCWebView.this;
                    Context _getContext = wVUCWebView._getContext();
                    WVUCWebView wVUCWebView2 = WVUCWebView.this;
                    WVUCWebView.access$402(wVUCWebView, new android.taobao.windvane.view.a(_getContext, wVUCWebView2, WVUCWebView.access$200(wVUCWebView2), WVUCWebView.access$900(WVUCWebView.this)));
                    WVUCWebView.access$400(WVUCWebView.this).a();
                    return true;
                } catch (Exception e3) {
                    android.taobao.windvane.util.m.e(WVUCWebView.TAG, "getHitTestResult error:" + e3.getMessage());
                    return false;
                }
            }
        };
        setOnLongClickListener(this.mLongClickListener);
        if (android.taobao.windvane.c.a().b().c()) {
            injectJsEarly(this.wvh5PPManager.jsCodeForUserPP());
        }
        if (android.taobao.windvane.c.a().b().a()) {
            setOnTouchListener(new View.OnTouchListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getAction() == 0) {
                        WVUCWebView.this.wvfspManager.unitDidFinish(new WVFSPManager.CompletionHandler() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.taobao.windvane.extra.performance2.WVFSPManager.CompletionHandler
                            public void stopObserving() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("65e141fe", new Object[]{this});
                                } else {
                                    WVUCWebView.this.fireEvent(WVUCWebView.this.wvfspManager.eventForFSPStop());
                                }
                            }

                            @Override // android.taobao.windvane.extra.performance2.WVFSPManager.CompletionHandler
                            public void uploadFSPInfo(String str2, long j) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("2c485503", new Object[]{this, str2, new Long(j)});
                                } else {
                                    WVUCWebView.this.wvh5PPManager.recordFSP(j);
                                }
                            }
                        });
                    }
                    return false;
                }
            });
        }
        if (o.getPackageMonitorInterface() != null) {
            o.getPerformanceMonitor().didWebViewInitAtTime(System.currentTimeMillis());
        }
        if (Build.VERSION.SDK_INT >= 11 && i.a()) {
            try {
                setLayerType(1, null);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            CookieManager.getInstance().setAcceptCookie(true);
        } catch (Throwable unused) {
        }
        setAcceptThirdPartyCookies();
        addJavascriptInterface(new WVBridgeEngine(this, this), "__windvane__");
        if (j.commonConfig.bR) {
            if (j.commonConfig.cU) {
                this.mAbilityEnv = new alr(bizId, "WindVane");
                this.mAbilityEnv.a(this.context);
                this.abilityHubAdapter = new alu(this.mAbilityEnv);
            } else {
                this.abilityHubAdapter = new alu(new alr(bizId, "WindVane").a(this.context));
            }
            addJavascriptInterface(new WVMegaBridge(this, this.abilityHubAdapter), "__sync_mega__");
        }
        if (!j.commonConfig.af) {
            injectJsEarly(WVBridgeEngine.WINDVANE_CORE_JS);
        }
        if (ExtImgDecoder.getInstance().canExtImgDecoder()) {
            injectJsEarly("javascript:window.__windvane__.heic_supported=true");
        } else {
            injectJsEarly("javascript:window.__windvane__.heic_supported=false");
        }
        try {
            ArrayList<String> a2 = android.taobao.windvane.embed.a.a();
            for (String str2 : j.commonConfig.j) {
                a2.remove(str2);
            }
            StringBuilder sb = new StringBuilder("window.__mix_view_environment__={availableTypes:{");
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(":");
                sb.append(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                sb.append(",");
            }
            if (sb.toString().contains(",")) {
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
            sb.append("},matchType:'name',isForAppX:'no'}");
            injectJsEarly(sb.toString());
        } catch (Throwable unused2) {
        }
        if (!android.taobao.windvane.config.s.a().d()) {
            android.taobao.windvane.config.s.a().c();
            android.taobao.windvane.util.m.e(TAG, "init url config before init");
        }
        if (!android.taobao.windvane.config.n.a().d()) {
            android.taobao.windvane.config.n.a().c();
            android.taobao.windvane.util.m.e(TAG, "init domain config before init");
        }
        this.wvh5PPManager.webViewDidFinishInit();
        this.pageTracker.initEnd();
    }

    public void openAsyncAPIChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601ba482", new Object[]{this});
        } else if (this.asyncApiProxy != null) {
        } else {
            try {
                this.asyncApiProxy = new DefaultAsyncApiProxy();
                this.asyncApiProxy.setUCWebView(this);
                this.asyncApiProxy.injectAsyncApiEvn();
            } catch (Throwable th) {
                android.taobao.windvane.util.m.e(TAG, "create async api channel failed :" + th.getMessage());
            }
        }
    }

    public s getAsyncApiProxy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("4837b6ca", new Object[]{this}) : this.asyncApiProxy;
    }

    private void configSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6d7b8c", new Object[]{this});
            return;
        }
        WebSettings settings = getSettings();
        if (getCurrentViewCoreType() == 2 && Build.VERSION.SDK_INT >= 21 && settings != null) {
            settings.setMixedContentMode(0);
        }
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT < 18) {
            settings.setSavePassword(false);
        }
        settings.setDatabaseEnabled(false);
        settings.setDatabasePath(this.context.getApplicationInfo().dataDir + "/localstorage");
        settings.setGeolocationEnabled(true);
        String h = android.taobao.windvane.config.a.a().h();
        String i = android.taobao.windvane.config.a.a().i();
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(i)) {
                userAgentString = userAgentString + " AliApp(" + h + "/" + i + riy.BRACKET_END_STR;
            }
            if (!userAgentString.contains("UCBS/") && getCurrentViewCoreType() == 3) {
                userAgentString = userAgentString + " UCBS/2.11.1.1";
            }
            if (!userAgentString.contains("TTID/") && !TextUtils.isEmpty(android.taobao.windvane.config.a.a().b())) {
                userAgentString = userAgentString + " TTID/" + android.taobao.windvane.config.a.a().b();
            }
        }
        settings.setUserAgentString(userAgentString + android.taobao.windvane.config.a.DEFAULT_UA);
        settings.setCacheMode(-1);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 14) {
            settings.setTextZoom(WebSettings.TextSize.NORMAL.value);
        }
        j.a();
        if (j.commonConfig.bu && Build.VERSION.SDK_INT <= 18) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        j.a();
        if (!j.commonConfig.bv) {
            return;
        }
        settings.setAllowFileAccess(false);
    }

    public void setStatusBarImmersive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89501bb1", new Object[]{this, new Boolean(z)});
        } else {
            this.statusBarImmersive = z;
        }
    }

    public boolean isStatusBarImmersive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1703924f", new Object[]{this})).booleanValue() : this.statusBarImmersive;
    }

    @Override // com.uc.webview.export.WebView
    public void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        } else if ("accessibility".equals(str) || "accessibilityTraversal".equals(str)) {
        } else {
            super.addJavascriptInterface(obj, str);
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
        } else if (str == null) {
        } else {
            if (isDestroied()) {
                android.taobao.windvane.util.m.e(TAG, "evaluateJavascriptNew after destroy : " + str);
                return;
            }
            if (str.length() > 10 && str.regionMatches(true, 0, "javascript:", 0, 11)) {
                str = str.substring(11);
            }
            try {
                super.evaluateJavascript(str, valueCallback);
            } catch (Exception e) {
                android.taobao.windvane.util.m.e(TAG, "evaluateJavascriptNew error : " + e.getMessage());
                if (valueCallback == null) {
                    loadUrl("javascript:" + str);
                    return;
                }
                script2NativeCallback(str, valueCallback);
            }
        }
    }

    public void script2NativeCallback(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5868cd3a", new Object[]{this, str, valueCallback});
            return;
        }
        int i = this.mWvNativeCallbackId + 1;
        this.mWvNativeCallbackId = i;
        android.taobao.windvane.util.o.a(String.valueOf(i), valueCallback);
        loadUrl("javascript:console.log('wvNativeCallback/" + i + "/'+function(){var s = " + str + "; return (typeof s === 'object' ? JSON.stringify(s) : typeof s === 'string' ? '\"' + s + '\"' : s);}())");
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void addJsObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
            return;
        }
        p pVar = this.entryManager;
        if (pVar == null) {
            return;
        }
        pVar.a(str, obj);
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Object getJsObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
        }
        p pVar = this.entryManager;
        if (pVar != null) {
            return pVar.a(str);
        }
        return null;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Context _getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this});
        }
        Context context = getContext();
        return context instanceof MutableContextWrapper ? ((MutableContextWrapper) context).getBaseContext() : context;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 15 && this.webChromeClient.mFilePathCallback != null) {
            this.webChromeClient.mFilePathCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
            this.webChromeClient.mFilePathCallback = null;
        }
        p pVar = this.entryManager;
        if (pVar == null) {
            return;
        }
        pVar.a(i, i2, intent);
    }

    @Override // com.uc.webview.export.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ab3e66", new Object[]{this, webViewClient});
        } else if (webViewClient instanceof WVUCWebViewClient) {
            this.webViewClient = (WVUCWebViewClient) webViewClient;
            super.setWebViewClient(webViewClient);
        } else {
            throw new WindVaneError("Your WebViewClient must be extended from WVUCWebViewClient");
        }
    }

    @Override // com.uc.webview.export.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273e17fc", new Object[]{this, webChromeClient});
        } else if (webChromeClient instanceof WVUCWebChromeClient) {
            this.webChromeClient = (WVUCWebChromeClient) webChromeClient;
            this.webChromeClient.mWebView = this;
            super.setWebChromeClient(webChromeClient);
        } else {
            throw new WindVaneError("Your WebChromeClient must be extended from WVUCWebChromeClient");
        }
    }

    @Override // com.uc.webview.export.WebView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        android.taobao.windvane.util.m.c("test", "onWindowVisibilityChanged  = [" + i + riy.ARRAY_END_STR);
        if (i == 0 && Build.VERSION.SDK_INT > 18) {
            Context _getContext = _getContext();
            if ((_getContext instanceof Activity) && (window = ((Activity) _getContext).getWindow()) != null) {
                final View decorView = window.getDecorView();
                decorView.postDelayed(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            decorView.requestLayout();
                        }
                    }
                }, 100L);
            }
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreOnVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a0c7c", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.coreOnVisibilityChanged(view, i);
        android.taobao.windvane.util.m.c("test", "coreOnVisibilityChanged = [" + i + riy.ARRAY_END_STR);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void coreDestroy() {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebView.coreDestroy():void");
    }

    @Override // com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        if (!j.commonConfig.ct || this.abilityHubAdapter == null) {
            return;
        }
        android.taobao.windvane.util.m.e(TAG, "destroy abilityHubAdapterV1");
        this.abilityHubAdapter.a();
    }

    @Override // com.uc.webview.export.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.mWebViewPaused = true;
        try {
            if (getCurrentViewCoreType() == 3) {
                ExtImageDecoder.requestExtImageDecoderResult();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        p pVar = this.entryManager;
        if (pVar != null) {
            pVar.b();
        }
        if (Build.VERSION.SDK_INT >= 11) {
            super.onPause();
        }
        if (j.commonConfig.bL) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "WindVane/Page").a("disappear", this.pageTracker.getPageIdentifier()).a("url", (Object) getCurrentUrl());
        }
        if (Build.VERSION.SDK_INT >= 21 && j.commonConfig.aK) {
            if (j.commonConfig.cO) {
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            android.taobao.windvane.util.a.c();
                        }
                    }
                });
            } else {
                android.taobao.windvane.util.a.c();
            }
        }
        aem.a().a(3001);
    }

    public void OnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a8092f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        p pVar = this.entryManager;
        if (pVar != null) {
            pVar.a(i, i2, i3, i4);
        }
        try {
            super.onScrollChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375c36b0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        OnScrollChanged(i, i2, i3, i4);
        super.coreOnScrollChanged(i, i2, i3, i4);
    }

    @Override // com.uc.webview.export.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.mWebViewPaused = false;
        refreshIfNeeded();
        p pVar = this.entryManager;
        if (pVar != null) {
            pVar.c();
        }
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                super.onResume();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (j.commonConfig.bL) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "WindVane/Page").a("appear", this.pageTracker.getPageIdentifier()).a("url", (Object) getCurrentUrl());
        }
        aem.a().a(3002, this, getUrl(), new Object[0]);
        this.isLive = true;
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd26941b", new Object[]{this, canvas});
            return;
        }
        super.coreDraw(canvas);
        drawDebugFlag(canvas);
    }

    private void drawDebugFlag(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a661923", new Object[]{this, canvas});
        } else if (!android.taobao.windvane.util.e.b()) {
        } else {
            try {
                String str = getCurrentViewCoreType() == 3 ? "U4" : "Sys";
                canvas.drawText("内核:" + str, 100.0f, 100.0f, getDebugPaint());
            } catch (Throwable th) {
                android.taobao.windvane.util.m.b(TAG, "draw debug fail", th, new Object[0]);
            }
        }
    }

    private Paint getDebugPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("cfd690a3", new Object[]{this});
        }
        if (this.debugPaint == null) {
            this.debugPaint = new Paint();
            this.debugPaint.setTextSize(40.0f);
            this.debugPaint.setColor(-65536);
        }
        return this.debugPaint;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public String getCachedUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0783522", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.cachedUrl)) {
            return null;
        }
        return this.cachedUrl;
    }

    public void setCachedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cc2afc", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || str.startsWith("javascript:") || str.startsWith("about:")) {
        } else {
            this.cachedUrl = str;
        }
    }

    public String getCurrentUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        String str = null;
        try {
            str = super.getUrl();
        } catch (Exception unused) {
            android.taobao.windvane.util.m.d(TAG, "WebView had destroyed,forbid to be called getUrl. currentUrl : " + this.currentUrl);
        }
        if (str == null) {
            android.taobao.windvane.util.m.a(TAG, "getUrl by currentUrl: " + this.currentUrl);
            return this.currentUrl;
        }
        android.taobao.windvane.util.m.a(TAG, "getUrl by webview: " + str);
        return str;
    }

    public void setCurrentUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770a2153", new Object[]{this, str, str2});
            return;
        }
        this.currentUrl = str;
        android.taobao.windvane.util.m.a(TAG, "setCurrentUrl: " + str + " state : " + str2);
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getDataOnActive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b602214", new Object[]{this}) : this.dataOnActive;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setDataOnActive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714294e2", new Object[]{this, str});
        } else {
            this.dataOnActive = str;
        }
    }

    public void fireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b21d95", new Object[]{this, str});
        } else {
            getWVCallBackContext().fireEvent(str, "{}");
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void fireEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
        } else {
            getWVCallBackContext().fireEvent(str, str2);
        }
    }

    public WVCallBackContext getWVCallBackContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("587cc277", new Object[]{this}) : new WVCallBackContext(this);
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : super.getCoreView();
    }

    public m getWvUIModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("742f11c5", new Object[]{this}) : this.wvUIModel;
    }

    public void setWvUIModel(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0c8b3", new Object[]{this, mVar});
        } else {
            this.wvUIModel = mVar;
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
            return;
        }
        m mVar = this.wvUIModel;
        if (mVar == null) {
            return;
        }
        mVar.showLoadingView();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void hideLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7409c66", new Object[]{this});
            return;
        }
        m mVar = this.wvUIModel;
        if (mVar == null) {
            return;
        }
        mVar.hideLoadingView();
    }

    @Override // com.uc.webview.export.WebView
    public void stopLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41d5261", new Object[]{this});
            return;
        }
        isStop = true;
        super.stopLoading();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            super.clearCache(true);
        }
    }

    public void setSupportDownload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f90f98", new Object[]{this, new Boolean(z)});
        } else {
            this.supportDownload = z;
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getUserAgentString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a06231a4", new Object[]{this}) : getSettings().getUserAgentString();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setUserAgentString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260bd7ba", new Object[]{this, str});
        } else {
            getSettings().setUserAgentString(str);
        }
    }

    @Override // android.taobao.windvane.webview.g
    public boolean canUseUrlConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("240f7b45", new Object[]{this})).booleanValue() : this.useUrlConfig;
    }

    public void setUrlConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99261aa", new Object[]{this, new Boolean(z)});
        } else {
            this.useUrlConfig = z;
        }
    }

    @Override // android.taobao.windvane.webview.g
    public boolean canUseGlobalUrlConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eaf245a2", new Object[]{this})).booleanValue() : this.mUseGlobalUrlConfig;
    }

    public void setGlobalUrlConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d3406d", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseGlobalUrlConfig = z;
        }
    }

    @Override // android.taobao.windvane.webview.g
    public int getPageLoadedCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("311abdbf", new Object[]{this})).intValue() : this.mPageLoadedCount;
    }

    @Override // android.taobao.windvane.webview.g
    public boolean allowAllOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f86a6f8d", new Object[]{this})).booleanValue() : this.mAllowAllOpen;
    }

    @Override // android.taobao.windvane.webview.g
    public void setAllowAllOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aec829", new Object[]{this, new Boolean(z)});
        } else {
            this.mAllowAllOpen = z;
        }
    }

    public void onMessage(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf50210", new Object[]{this, new Integer(i), obj});
        } else if (this.mHandler == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            this.mHandler.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 400:
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.showLoadingView();
                    this.wvUIModel.switchNaviBar(1);
                }
                this.mPageLoadedCount++;
                android.taobao.windvane.util.m.b(TAG, "NOTIFY_PAGE_START mPageLoadedCount=" + this.mPageLoadedCount);
                return true;
            case 401:
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.hideLoadingView();
                    this.wvUIModel.resetNaviBar();
                }
                if (this.onErrorTime != 0 && System.currentTimeMillis() - this.onErrorTime > 3000) {
                    this.wvUIModel.hideErrorPage();
                }
                return true;
            case 402:
                m mVar = this.wvUIModel;
                if (mVar != null) {
                    mVar.loadErrorPage();
                }
                this.onErrorTime = System.currentTimeMillis();
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 403:
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 404:
                try {
                    Toast.makeText(_getContext(), hux.a(ILocalizationService.IMAGE_SAVED_SUCCESS), 1).show();
                } catch (Exception e) {
                    android.taobao.windvane.util.m.e(TAG, "NOTIFY_SAVE_IMAGE_SUCCESS fail " + e.getMessage());
                }
                return true;
            case 405:
                try {
                    Toast.makeText(_getContext(), hux.a(ILocalizationService.IMAGE_SAVED_FAIL), 1).show();
                } catch (Exception e2) {
                    android.taobao.windvane.util.m.e(TAG, "NOTIFY_SAVE_IMAGE_FAIL fail " + e2.getMessage());
                }
                return true;
            default:
                return false;
        }
    }

    @Override // com.uc.webview.export.WebView
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (isDestroied() || aem.a().a(3004).f25290a) {
            return false;
        }
        return super.canGoBack();
    }

    private void setAcceptThirdPartyCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a8f26d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 21 || getCurrentViewCoreType() == 1 || getCurrentViewCoreType() == 3) {
        } else {
            try {
                View view = getView();
                if (view == null || !(view instanceof android.webkit.WebView)) {
                    return;
                }
                CookieManager.getInstance().setAcceptThirdPartyCookies((android.webkit.WebView) view, true);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        TouchEventHandler touchEventHandler = this.mTouchEventHandler;
        if (touchEventHandler != null) {
            touchEventHandler.coreDispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        int actionIndex = motionEvent.getActionIndex();
        if (actionIndex >= motionEvent.getPointerCount()) {
            j.a();
            if (j.commonConfig.bB) {
                return super.coreDispatchTouchEvent(motionEvent);
            }
        }
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (action == 0) {
            this.dx = motionEvent.getX();
            this.dy = motionEvent.getY();
            if (!this.isUser) {
                this.mEventSparseArray.put(pointerId, MotionEvent.obtain(motionEvent));
                return true;
            }
        } else if (action == 2) {
            if (!this.isUser && Math.abs(motionEvent.getY() - this.dy) > 5.0f) {
                return true;
            }
        } else if (action == 1) {
            if (!this.isUser && Math.abs(motionEvent.getY() - this.dy) > 5.0f) {
                this.isUser = true;
                return true;
            }
            MotionEvent motionEvent2 = this.mEventSparseArray.get(pointerId);
            if (motionEvent2 != null) {
                super.coreDispatchTouchEvent(motionEvent2);
                motionEvent2.recycle();
                this.mEventSparseArray.remove(pointerId);
            }
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    private static void initServiceWorkerClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da4c695", new Object[0]);
            return;
        }
        try {
            android.taobao.windvane.util.m.e(TAG, "start to set ServiceWorker client");
            ServiceWorkerController.getInstance().setServiceWorkerClient(new WVUCServiceWorkerClient());
        } catch (Throwable th) {
            android.taobao.windvane.util.m.b(TAG, "failed to set ServiceWorker client", th, new Object[0]);
        }
    }

    public void insertH5MonitorData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6d1883", new Object[]{this, str, str2, str3});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.mH5MonitorCache == null) {
                this.mH5MonitorCache = new Hashtable<>();
            }
            Hashtable<String, String> hashtable = this.mH5MonitorCache.get(str);
            if (hashtable == null) {
                hashtable = new Hashtable<>();
                this.mH5MonitorCache.put(str, hashtable);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            hashtable.put(str2, str3);
        }
    }

    public String getH5MonitorData(String str, String str2) {
        Hashtable<String, String> hashtable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("352185a4", new Object[]{this, str, str2});
        }
        Hashtable<String, Hashtable<String, String>> hashtable2 = this.mH5MonitorCache;
        if (hashtable2 != null && (hashtable = hashtable2.get(str)) != null) {
            return hashtable.get(str2);
        }
        return null;
    }

    public JSONObject getH5MonitorDatas() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("95767927", new Object[]{this});
        }
        if (this.mH5MonitorCache == null) {
            return new JSONObject();
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : this.mH5MonitorCache.keySet()) {
            Hashtable<String, String> hashtable = this.mH5MonitorCache.get(str);
            JSONObject jSONObject = new JSONObject();
            Enumeration<String> keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                String nextElement = keys.nextElement();
                jSONObject.put(nextElement, hashtable.get(nextElement));
            }
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("resources", jSONArray);
        return jSONObject2;
    }

    public void clearH5MonitorData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547db51", new Object[]{this});
            return;
        }
        Hashtable<String, Hashtable<String, String>> hashtable = this.mH5MonitorCache;
        if (hashtable == null) {
            return;
        }
        hashtable.clear();
    }

    public boolean containsH5MonitorData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1d951cd", new Object[]{this, str})).booleanValue();
        }
        Hashtable<String, Hashtable<String, String>> hashtable = this.mH5MonitorCache;
        if (hashtable != null) {
            return hashtable.containsKey(str);
        }
        return false;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean _post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32066a08", new Object[]{this, runnable})).booleanValue();
        }
        if (!isAttachedToWindow() && Build.VERSION.SDK_INT < 24) {
            android.taobao.windvane.util.m.b(TAG, " wait webview attach to window");
            this.taskQueue.add(runnable);
            return true;
        }
        return post(runnable);
    }

    @Override // com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("webPageFirstLoad", Boolean.valueOf(sWebViewFirstAttached));
            getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("TMS_globalContainerOptimization", Boolean.valueOf(com.taobao.themis.kernel.utils.c.a(this.context)));
            sWebViewFirstAttached = false;
            v b = qgo.b();
            if (b != null) {
                getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("optimizeJSTScriptAB", b.a());
            }
            v expDetail = ImageExperiment.getExpDetail();
            if (expDetail != null) {
                getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("imageOptimizeAB", expDetail.a());
            }
            v groupDetail = WVLaunchTaskOptAB.getInstance().getGroupDetail();
            if (groupDetail != null) {
                getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("wvLaunchTaskOptAB", groupDetail.a());
            }
        } catch (Exception unused) {
        }
        this.pageTracker.attachToWindow();
        android.taobao.windvane.util.m.b(TAG, " webview attach to window, and execute remain task");
        for (Runnable runnable : this.taskQueue) {
            runnable.run();
        }
        this.taskQueue.clear();
        super.onAttachedToWindow();
    }

    @Override // com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        UCNetworkDelegate.getInstance().removeWebview(this);
        if (this.taskQueue.size() == 0) {
            return;
        }
        this.taskQueue.clear();
    }

    public void setOnErrorTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941a389", new Object[]{this, new Long(j)});
        } else {
            this.onErrorTime = j;
        }
    }

    public static void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{str});
        } else {
            bizId = str;
        }
    }

    public void setOverrideBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66966083", new Object[]{this, str});
            return;
        }
        j.a();
        if (!j.commonConfig.bf) {
            return;
        }
        this.overrideBizId = str;
        synchronized (this) {
            if (this.aliRequestAdapter != null) {
                this.aliRequestAdapter.setBizCode(str);
            }
        }
    }

    public WVUCWebViewClient getWebViewClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebViewClient) ipChange.ipc$dispatch("624d37b7", new Object[]{this}) : this.webViewClient;
    }

    /* loaded from: classes2.dex */
    public static class WVValueCallback implements ValueCallback<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1116931297);
            kge.a(2046855177);
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("138ac29e", new Object[]{this, str});
                return;
            }
            android.taobao.windvane.util.m.c(WVUCWebView.TAG, "support : " + WVCore.getInstance().isUCSupport() + " UC SDK Callback : " + str);
            try {
                android.taobao.windvane.monitor.b.commitEvent(android.taobao.windvane.monitor.b.EVENTID_PA_UCSDK, String.valueOf(WVCore.getInstance().isUCSupport()), String.valueOf(WVUCWebView.getUseTaobaoNetwork()), str);
            } catch (Throwable th) {
                android.taobao.windvane.util.m.e(WVUCWebView.TAG, "UC commitEvent failed : " + th.getMessage());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class WVDownLoadListener implements DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1511214481);
            kge.a(-2124823223);
        }

        public WVDownLoadListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
                return;
            }
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.b(WVUCWebView.TAG, "Download start, url: " + str + " contentDisposition: " + str3 + " mimetype: " + str4 + " contentLength: " + j);
            }
            if (!WVUCWebView.this.supportDownload) {
                android.taobao.windvane.util.m.d(WVUCWebView.TAG, "DownloadListener is not support for webview.");
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            try {
                WVUCWebView.this.context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(WVUCWebView.this._getContext(), android.taobao.windvane.util.e.c() ? "对不起，您的设备找不到相应的程序" : "Can not find the corresponding application", 1).show();
                android.taobao.windvane.util.m.b(WVUCWebView.TAG, "DownloadListener not found activity to open this url.", e, new Object[0]);
            }
        }
    }

    public void injectJsEarly(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4c69a", new Object[]{this, str});
            return;
        }
        if (str.startsWith("javascript:")) {
            str = str.replace("javascript:", "");
        }
        StringBuilder sb = this.injectJs;
        sb.append(str);
        sb.append(";\n");
        if (this.injectJSProvider == null) {
            this.injectJSProvider = new UCExtension.InjectJSProvider() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uc.webview.export.extension.UCExtension.InjectJSProvider
                public String getJS(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("3f660b59", new Object[]{this, new Integer(i), str2}) : WVUCWebView.this.injectJs.toString();
                }
            };
        }
        if (getUCExtension() == null) {
            return;
        }
        getUCExtension().setInjectJSProvider(this.injectJSProvider, 1);
    }

    public String getInjectJS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27c608e9", new Object[]{this});
        }
        try {
            return this.injectJs.substring(11);
        } catch (Exception unused) {
            return "";
        }
    }

    public void setOuterContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec406ab", new Object[]{this, context});
            return;
        }
        Context context2 = this.context;
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        } else {
            this.context = context;
        }
        if (!WVCore.getInstance().isUCSupport() || !(getContext() instanceof MutableContextWrapper)) {
            return;
        }
        ((MutableContextWrapper) getContext()).setBaseContext(context);
    }

    public void isPageEmpty(final whiteScreenCallback whitescreencallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a05f26", new Object[]{this, whitescreencallback});
        } else {
            evaluateJavascript("(function(d){var filteredTagNames={'IFRAME':1,'STYLE':1,'HTML':1,'BODY':1,'HEAD':1,'SCRIPT':1,'TITLE':1};if(d.body){for(var nodes=d.body.childNodes,i=0;i<nodes.length;i++){var node=nodes[i];if(node!=undefined){if(node.nodeType==1&&filteredTagNames[node.tagName]!=1&&node.style.display!='none'){return'0'}else if(node.nodeType==3&&node.nodeValue.trim().length>0){return'0'}}}}return'1'}(document))", new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebView.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    whiteScreenCallback whitescreencallback2 = whitescreencallback;
                    if (whitescreencallback2 == null) {
                        return;
                    }
                    whitescreencallback2.isPageEmpty(str);
                }
            });
        }
    }

    public View.OnLongClickListener getLongClickListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("ee750356", new Object[]{this}) : this.mLongClickListener;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public boolean isReportedFSP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("197c5571", new Object[]{this})).booleanValue() : this.reportedFSP;
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void setReportedFSP(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fb4a3f", new Object[]{this, new Boolean(z)});
        } else {
            this.reportedFSP = z;
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public void setPreInitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1693ad", new Object[]{this, new Boolean(z)});
        } else {
            this.isPreInit = z;
        }
    }

    @Override // android.taobao.windvane.extra.performance2.IPerformance
    public boolean isPreInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b7f41d4", new Object[]{this})).booleanValue() : this.isPreInit;
    }

    public void putExternalContext(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca009382", new Object[]{this, str, obj});
            return;
        }
        if (this.mExternalContext == null) {
            synchronized (this) {
                if (this.mExternalContext == null) {
                    this.mExternalContext = new HashMap();
                }
            }
        }
        this.mExternalContext.put(str, obj);
    }

    public Object getExternalContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79cae7d3", new Object[]{this, str});
        }
        if (this.mExternalContext != null) {
            return this.mExternalContext.get(str);
        }
        return null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        p pVar = this.entryManager;
        if (pVar == null) {
            return;
        }
        pVar.a(i, strArr, iArr);
    }

    public void setFalcoPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeccbfa6", new Object[]{this, str});
            return;
        }
        try {
            ((WVFalco) getJsObject("WVFalco")).setPageName(str);
        } catch (Exception e) {
            android.taobao.windvane.util.m.e(TAG, "setPageName fail " + e);
        }
    }

    public void setAliNetwork(AliNetworkAdapterNew aliNetworkAdapterNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9840e9", new Object[]{this, aliNetworkAdapterNew});
            return;
        }
        synchronized (this) {
            this.aliRequestAdapter = aliNetworkAdapterNew;
        }
    }

    public AliNetworkAdapterNew getAliNetwork() {
        AliNetworkAdapterNew aliNetworkAdapterNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNetworkAdapterNew) ipChange.ipc$dispatch("38d8ba9f", new Object[]{this});
        }
        synchronized (this) {
            aliNetworkAdapterNew = this.aliRequestAdapter;
        }
        return aliNetworkAdapterNew;
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final long TIMESTAMP_DELTA;
        private Context mContext;
        private int mCoreType;
        private boolean mEnablePreCreate = false;
        private TouchEventHandler mTouchEventHandler = null;
        private boolean enablePrerender = false;
        private String realUrl = null;
        private boolean mEnableReportAPM = true;
        private dqn mWebViewPageModel = null;

        /* loaded from: classes2.dex */
        public @interface CoreType {
            public static final int System = 2;
            public static final int U4 = 3;
        }

        public static /* synthetic */ Context access$000(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c1405f59", new Object[]{builder}) : builder.mContext;
        }

        public static /* synthetic */ int access$100(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52e573d5", new Object[]{builder})).intValue() : builder.mCoreType;
        }

        static {
            kge.a(-2023310811);
            TIMESTAMP_DELTA = System.currentTimeMillis() - SystemClock.uptimeMillis();
        }

        public Builder setCoreType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("dfc9e4df", new Object[]{this, new Integer(i)});
            }
            this.mCoreType = i;
            return this;
        }

        public Builder setContext(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f43383ac", new Object[]{this, context});
            }
            this.mContext = context;
            return this;
        }

        public Builder setEnablePreCreate(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("13eff16d", new Object[]{this, new Boolean(z)});
            }
            this.mEnablePreCreate = z;
            return this;
        }

        public Builder setTouchEventHandler(TouchEventHandler touchEventHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7124f6f6", new Object[]{this, touchEventHandler});
            }
            this.mTouchEventHandler = touchEventHandler;
            return this;
        }

        public Builder setEnablePrerender(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ce0b3967", new Object[]{this, new Boolean(z)});
            }
            this.enablePrerender = z;
            return this;
        }

        public Builder setRealUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ba10fb00", new Object[]{this, str});
            }
            this.realUrl = str;
            return this;
        }

        public Builder setEnableReportAPM(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6e508078", new Object[]{this, new Boolean(z)});
            }
            this.mEnableReportAPM = z;
            return this;
        }

        public Builder setWebViewPageModel(dqm dqmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("88f53086", new Object[]{this, dqmVar});
            }
            this.mWebViewPageModel = dqmVar;
            return this;
        }

        public WVUCWebView build() {
            WVUCWebView a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVUCWebView) ipChange.ipc$dispatch("6f296a2", new Object[]{this});
            }
            if (this.mContext == null) {
                throw new IllegalStateException("create WVUCWebView with null context");
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (WVUCWebView.access$1200() && !WVUCWebView.access$1300().get() && this.mCoreType == 3) {
                android.taobao.windvane.util.m.e(WVUCWebView.TAG, "call staticInitializeOnce in WVUCWebView.Builder.build");
                WVUCWebView.staticInitializeOnce();
            }
            if (this.enablePrerender && !TextUtils.isEmpty(this.realUrl) && (a2 = android.taobao.windvane.export.prerender.d.INSTANCE.a(new android.taobao.windvane.export.prerender.c(this.mContext, this.realUrl, 1))) != null) {
                return a2;
            }
            WVUCWebView wVUCWebView = null;
            if (j.commonConfig.cH && this.mEnablePreCreate && this.mCoreType == 3) {
                if (this.mContext != null && this.realUrl != null) {
                    wVUCWebView = android.taobao.windvane.export.prerender.d.INSTANCE.a(new android.taobao.windvane.export.prerender.c(this.mContext, this.realUrl, 2));
                }
                if (wVUCWebView == null) {
                    wVUCWebView = WebViewPool.acquirePreCreateWebView(this.mContext);
                }
            }
            if (wVUCWebView == null) {
                wVUCWebView = new WVUCWebView(this);
            }
            wVUCWebView.setTouchEventHandler(this.mTouchEventHandler);
            if (!this.mEnableReportAPM) {
                t.a(wVUCWebView, false);
            }
            if (this.mWebViewPageModel != null) {
                wVUCWebView.getWebViewContext().addWebViewPageModel(this.mWebViewPageModel);
            }
            if (j.commonConfig.cM) {
                String str = DevTools.BACK_END_JS;
                if (!TextUtils.isEmpty(str)) {
                    wVUCWebView.injectJsEarly(str);
                }
                String str2 = DevTools.INJECTED_JS;
                if (!TextUtils.isEmpty(str2)) {
                    wVUCWebView.injectJsEarly(str2);
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            try {
                wVUCWebView.getWebViewContext().getWebViewPageModel().onStage("H5_webViewCreateStart", uptimeMillis);
                wVUCWebView.getWebViewContext().getWebViewPageModel().onStage("H5_webViewCreateEnd", uptimeMillis2);
                wVUCWebView.getWebViewContext().getWebViewPageModel().onProperty("H5_timestampDelta", Long.valueOf(TIMESTAMP_DELTA));
            } catch (Exception unused) {
            }
            return wVUCWebView;
        }
    }
}
