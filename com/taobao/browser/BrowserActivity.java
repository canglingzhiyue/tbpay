package com.taobao.browser;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.taobao.TBActionBar;
import android.support.v7.widget.Toolbar;
import android.taobao.windvane.config.n;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver;
import com.taobao.browser.fragment.SplashFragment;
import com.taobao.browser.jsbridge.ui.ActionBarMenuItem;
import com.taobao.browser.urlFilter.BrowserUrlFilter;
import com.taobao.browser.urlFilter.UrlpreLoadFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.k;
import com.taobao.browser.view.FlowBar;
import com.taobao.browser.view.TabBar;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.login4android.api.Login;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.monitor.procedure.s;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.TrackBuried;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.NavUrls;
import com.taobao.tao.util.StringUtil;
import com.taobao.tao.util.UrlFormator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.UTPageStatus;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import tb.aei;
import tb.aem;
import tb.aex;
import tb.cjm;
import tb.hyt;
import tb.kev;
import tb.kez;
import tb.kfb;
import tb.kfc;
import tb.kge;
import tb.mbn;
import tb.odv;
import tb.orq;
import tb.riy;
import tb.tfu;

/* loaded from: classes6.dex */
public class BrowserActivity extends BaseActivity implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_SAVE_FORMAT_DATA = "SAVE_FORMAT_DATA";
    public static final String KEY_IMAGE_LIST = "imagelist";
    private static final String MONITOR_POINT_AFC_NAV_FAIL = "afcNavFail";
    private static final String MONITOR_POINT_TIME_OUT_GO_TO_HOME = "timeoutGoToHome";
    private static final int MSG_FINISH = 900;
    public static final int MYTAOBAO_BIND_CARD = 1001;
    public static final int MYTAOXIAOPU_BIND_CARD = 1003;
    private static final String TAG = "BrowserActivity";
    private static final String TAG_FAV = "Favorite";
    private static final String URI_HOMEPAGE = "http://m.taobao.com/index.htm";
    private static int browserActivityID = 0;
    private static final String nextPageAnimationParam = "nextPageAnimation=false";
    private Uri _uri;
    private boolean alloweWebViewHistoryBack;
    private Bitmap bitmap;
    private BrowserHybridWebView browserWebView;
    private com.taobao.analysis.v3.g businessSpan;
    private String className;
    private long creatActivityTimeStamp;
    public boolean enableUCVisibility;
    private BrowserUrlFilter filter;
    private HashMap<String, RelativeLayout> flowBarMap;
    public boolean forceWebView;
    private boolean hasCustomButton;
    private boolean hideShareItem;
    private boolean hideUserHelperItem;
    private boolean invalidateOnce;
    private boolean isAfcMergeOpenH5;
    private boolean isAutoResetMenu;
    private boolean isBkpg;
    private boolean isHideTitle;
    private boolean isHookNativeBack;
    private boolean isHookNativeBackByJs;
    private boolean isIntentSetAfcH5Url;
    private boolean isPostUrl;
    private boolean isRefundOrderUrl;
    private boolean isUCCorePreparedCallback;
    private boolean isWaitUCReady;
    private boolean isaddDesktop;
    private boolean loaded;
    private String mActivityHashCode;
    private boolean mAppLinkIsNewIntent;
    private boolean mAutoShowNavbar;
    private String mFavorIcon;
    private String mFavorText;
    public android.taobao.util.i mHandle;
    private RelativeLayout mTabBarLayout;
    private String mYyzUrl;
    private List<ActionBarMenuItem> menuItemList;
    private ActionBarMenuItem menuItemRight;
    private ActionBarMenuItem menuItemSecondRight;
    private ActionBarMenuItem menuItemTitle;
    private String mlinkhref;
    private String mlinkonclick;
    private String navAfcMergeUrl;
    private String noMetaPageList;
    private long onCreateTime;
    private Map<String, String> openTracingContextMap;
    private String orderId;
    private String originalurl;
    private TBProgressBar progressbar;
    private String quitWebViewDirectlyUrls;
    private boolean readTitle;
    private boolean saveFormatData;
    private Bitmap shortcut_bitmap;
    private String shortcut_buttonText;
    private String shortcut_icon;
    private String shortcut_title;
    private String shortcut_url;
    private long start;
    private boolean statusImmersive;
    public String url;
    private String useDounble11Style;
    @Deprecated
    private a webOrange;
    private long webViewStart;
    private WVCallBackContext wvContext;

    /* renamed from: com.taobao.browser.BrowserActivity$10  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass10 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                BrowserActivity.access$400(BrowserActivity.this).evaluateJavascript("(function() { return (!!document.body.innerHTML);})()", new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity$5$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        } else if (BrowserActivity.this.mHandle == null) {
                        } else {
                            if (BrowserActivity.this.mHandle.hasMessages(1105)) {
                                BrowserActivity.this.mHandle.removeMessages(1105);
                            }
                            if (!"false".equalsIgnoreCase(str)) {
                                return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1105;
                            BrowserActivity.this.mHandle.dispatchMessage(obtain);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.taobao.browser.BrowserActivity$13  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass13 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16736a = new int[FavType.values().length];

        static {
            try {
                f16736a[FavType.AddFavorite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16736a[FavType.DeleteFavorite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16736a[FavType.IsFavorite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum FavType {
        IsFavorite,
        AddFavorite,
        DeleteFavorite
    }

    public static void hideLoadingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395c4f09", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(BrowserActivity browserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public BrowserActivity() {
        com.taobao.android.launcher.bootstrap.tao.f.a("null", "com.taobao.browser.BrowserActivity");
        this.progressbar = null;
        this.flowBarMap = new HashMap<>();
        this.mTabBarLayout = null;
        this.mAppLinkIsNewIntent = false;
        this.mAutoShowNavbar = true;
        this.saveFormatData = true;
        this.invalidateOnce = false;
        this.isRefundOrderUrl = false;
        this.isaddDesktop = false;
        this.isHookNativeBackByJs = false;
        this.isHookNativeBack = false;
        this.isAutoResetMenu = true;
        this.readTitle = true;
        this.alloweWebViewHistoryBack = true;
        this.mlinkhref = null;
        this.mlinkonclick = null;
        this.bitmap = null;
        this.shortcut_title = null;
        this.shortcut_icon = null;
        this.shortcut_url = null;
        this.shortcut_buttonText = null;
        this.shortcut_bitmap = null;
        this.mFavorIcon = null;
        this.mFavorText = "收藏";
        this.menuItemRight = null;
        this.menuItemSecondRight = null;
        this.menuItemTitle = null;
        this.menuItemList = null;
        this.className = BrowserActivity.class.getName();
        this.forceWebView = false;
        this.hasCustomButton = false;
        this.hideUserHelperItem = false;
        this.hideShareItem = false;
        this.useDounble11Style = "festivalWithRainbowLine";
        this.enableUCVisibility = true;
        this.noMetaPageList = "";
        this.quitWebViewDirectlyUrls = "";
        this.webOrange = null;
        this.statusImmersive = false;
        this.mActivityHashCode = "";
    }

    public static /* synthetic */ void access$000(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b55449", new Object[]{browserActivity});
        } else {
            browserActivity.updateOrangeConfigs();
        }
    }

    public static /* synthetic */ String access$100(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9af466d6", new Object[]{browserActivity}) : browserActivity.originalurl;
    }

    public static /* synthetic */ String access$1002(BrowserActivity browserActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2dd99dc", new Object[]{browserActivity, str});
        }
        browserActivity.mFavorIcon = str;
        return str;
    }

    public static /* synthetic */ void access$1100(BrowserActivity browserActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d5d243", new Object[]{browserActivity, str});
        } else {
            browserActivity.checkFavoriteState(str);
        }
    }

    public static /* synthetic */ String access$1202(BrowserActivity browserActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e03d1a", new Object[]{browserActivity, str});
        }
        browserActivity.mFavorText = str;
        return str;
    }

    public static /* synthetic */ boolean access$200(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b3831cf", new Object[]{browserActivity})).booleanValue() : browserActivity.isUCCorePreparedCallback;
    }

    public static /* synthetic */ boolean access$202(BrowserActivity browserActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a9924ab", new Object[]{browserActivity, new Boolean(z)})).booleanValue();
        }
        browserActivity.isUCCorePreparedCallback = z;
        return z;
    }

    public static /* synthetic */ void access$300(BrowserActivity browserActivity, com.taobao.monitor.procedure.g gVar, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dacbb5c", new Object[]{browserActivity, gVar, bundle});
        } else {
            browserActivity.doOnCreateLater(gVar, bundle);
        }
    }

    public static /* synthetic */ BrowserHybridWebView access$400(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BrowserHybridWebView) ipChange.ipc$dispatch("a7460dcf", new Object[]{browserActivity}) : browserActivity.browserWebView;
    }

    public static /* synthetic */ Bitmap access$500(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("ee7302ec", new Object[]{browserActivity}) : browserActivity.bitmap;
    }

    public static /* synthetic */ Bitmap access$502(BrowserActivity browserActivity, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fe2e4cfc", new Object[]{browserActivity, bitmap});
        }
        browserActivity.bitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ boolean access$602(BrowserActivity browserActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("364aca27", new Object[]{browserActivity, new Boolean(z)})).booleanValue();
        }
        browserActivity.isHookNativeBackByJs = z;
        return z;
    }

    public static /* synthetic */ ActionBarMenuItem access$700(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionBarMenuItem) ipChange.ipc$dispatch("a848101e", new Object[]{browserActivity}) : browserActivity.menuItemTitle;
    }

    public static /* synthetic */ WVCallBackContext access$800(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("fd7fc822", new Object[]{browserActivity}) : browserActivity.wvContext;
    }

    public static /* synthetic */ boolean access$900(BrowserActivity browserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90023916", new Object[]{browserActivity})).booleanValue() : browserActivity.mAutoShowNavbar;
    }

    @Deprecated
    /* loaded from: classes6.dex */
    public static class a implements com.taobao.orange.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Context> f16745a;

        static {
            kge.a(-1138467749);
            kge.a(-498751155);
        }

        public a(Context context) {
            if (context != null) {
                this.f16745a = new WeakReference<>(context);
            }
        }

        @Override // com.taobao.orange.g
        public void onConfigUpdate(String str, boolean z) {
            BrowserActivity browserActivity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (StringUtils.isEmpty(str)) {
                TLog.logd(BrowserActivity.TAG, "the groupName is empty!");
            } else if (!str.equalsIgnoreCase("WindVane") || (browserActivity = (BrowserActivity) this.f16745a.get()) == null) {
            } else {
                BrowserActivity.access$000(browserActivity);
            }
        }
    }

    @Deprecated
    public android.taobao.util.i getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.taobao.util.i) ipChange.ipc$dispatch("f2ff20af", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String a2 = BrowserUtil.a(Thread.currentThread().getStackTrace());
        if (!StringUtils.isEmpty(a2)) {
            hashMap.put("call_stack", a2);
        }
        BrowserUtil.a(TAG, "getHandler", null, this.url, hashMap);
        return this.mHandle;
    }

    static {
        kge.a(25595325);
        kge.a(-1043440182);
        browserActivityID = 0;
    }

    private static String getID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b12904a8", new Object[0]);
        }
        return "BA_" + browserActivityID;
    }

    private static void updateID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420462b", new Object[0]);
        } else {
            browserActivityID++;
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        boolean z;
        com.taobao.monitor.procedure.g d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (com.taobao.browser.config.a.commonConfig.s && ABGlobal.isFeatureOpened(this, "disable_fragment_restore") && bundle != null && intent != null && intent.getBooleanExtra("afc_nav_merge", false) && bundle.getParcelable("android:support:fragments") != null) {
            BrowserUtil.a(TAG, BrowserUtil.b, "disable_fragment_restore", this.originalurl, null);
            bundle.remove("android:support:fragments");
        }
        this.onCreateTime = System.currentTimeMillis();
        this.start = this.onCreateTime;
        if (com.taobao.browser.config.a.commonConfig.x && (d = s.f18233a.d()) != null && d.c()) {
            d.a("H5_containerStart", SystemClock.uptimeMillis());
        }
        r rVar = FalcoGlobalTracer.get();
        if (rVar != null) {
            this.businessSpan = rVar.a(TAG, "H5display").c();
            this.openTracingContextMap = rVar.a(this.businessSpan.h());
        }
        android.taobao.windvane.util.f.b(this.businessSpan, "H5_initContainer");
        kfc.a("exchain.FullTrace", "BrowserActivity.onCreate start time: " + this.onCreateTime);
        updateID();
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, TAG).a("H5_initContainer", getID()).a(this.onCreateTime).a();
        com.taobao.browser.prefetch.a.a().a(getClass().getName());
        kez.a();
        com.taobao.browser.config.a.a().b();
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(this, UTPageStatus.UT_H5_IN_WebView);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String str = BrowserUtil.b;
        this.originalurl = intent.getDataString();
        if (StringUtils.isEmpty(this.originalurl)) {
            BrowserUtil.a(TAG, str, "intent_url_empty", null, null);
            try {
                this.originalurl = getIntent().getStringExtra("myBrowserUrl");
                if (this.originalurl != null) {
                    BrowserUtil.a(TAG, str, "intent_has_myborwser_url", this.originalurl, null);
                }
            } catch (Exception unused) {
                m.e(TAG, "fail to get intent data");
            }
        }
        try {
            AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "PageCreate", this.originalurl, 1.0d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (StringUtils.isEmpty(this.originalurl)) {
            super.onCreate(bundle);
            m.d(TAG, "originalurl is null, and finish activity.");
            finish();
            return;
        }
        this.originalurl = this.originalurl.trim();
        String str2 = this.originalurl;
        this.url = str2;
        String urlReferer = getUrlReferer(str2, intent);
        if (urlReferer != null) {
            this.originalurl = urlReferer;
        }
        this._uri = Uri.parse(this.originalurl);
        if (!n.a().d()) {
            kez.a();
            n.a().c();
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.dealURL cost time: " + (System.currentTimeMillis() - this.start));
        this.start = System.currentTimeMillis();
        try {
            bundle2 = intent.getExtras();
        } catch (Exception unused2) {
            m.e(TAG, "fail to get intent extras");
            bundle2 = null;
        }
        this.isHideTitle = false;
        this.isPostUrl = false;
        if (bundle2 != null) {
            this.isHideTitle = bundle2.getBoolean(Constants.MYBROWSERHIDETITLE, false);
            this.isRefundOrderUrl = bundle2.getBoolean("is_refund_order_url", false);
            if (this.isRefundOrderUrl) {
                BrowserUtil.a(TAG, str, "bundle_isRefundOrderUrl", this.originalurl, null);
            }
            this.orderId = bundle2.getString(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
            if (!StringUtils.isEmpty(this.orderId)) {
                HashMap hashMap = new HashMap();
                hashMap.put("orderId", this.orderId);
                BrowserUtil.a(TAG, str, "bundle_has_orderId", this.originalurl, hashMap);
            }
            this.alloweWebViewHistoryBack = bundle2.getBoolean("alloweWebViewHistoryBack", true);
            if (!this.alloweWebViewHistoryBack) {
                BrowserUtil.a(TAG, str, "bundle_not_alloweWebViewHistoryBack", this.originalurl, null);
            }
            this.saveFormatData = bundle2.getBoolean("SAVE_FORMAT_DATA", true);
            if (!this.saveFormatData) {
                BrowserUtil.a(TAG, str, "bundle_not_SAVE_FORMAT_DATA", this.originalurl, null);
            }
            this.isPostUrl = bundle2.getBoolean("isPostUrl", false);
            if (this.isPostUrl) {
                BrowserUtil.a(TAG, str, "bundle_isPostUrl", this.originalurl, null);
            }
        }
        Uri uri = this._uri;
        if (uri != null && uri.isHierarchical()) {
            if (!this.isHideTitle) {
                this.isHideTitle = BrowserUtil.e(this._uri);
            }
            String queryParameter = this._uri.getQueryParameter("hasCustomButton");
            if (queryParameter != null && "true".equals(queryParameter.trim())) {
                BrowserUtil.a(TAG, str, "query_hasCustomButton", this.originalurl, null);
                this.hasCustomButton = true;
            }
            this.statusImmersive = this._uri.getBooleanQueryParameter("status_bar_transparent", false);
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.dealBundle cost time: " + (System.currentTimeMillis() - this.start));
        this.start = System.currentTimeMillis();
        kez.a();
        setTheme(R.style.Theme_BrowserActivity);
        super.onCreate(bundle);
        kfc.a("exchain.FullTrace", "BrowserActivity.superOnCreate cost time: " + (System.currentTimeMillis() - this.start));
        this.start = System.currentTimeMillis();
        getAllowOpenClientFlag();
        getQuitWebViewDirectlyList();
        getNoMetaPageList();
        getThirdMiddleJumpRegex();
        kfc.a("exchain.FullTrace", "BrowserActivity.ObtainOrange cost time: " + (System.currentTimeMillis() - this.start));
        kez.a();
        this.start = System.currentTimeMillis();
        getWindow().setFormat(-3);
        kfc.a("exchain.FullTrace", "BrowserActivity.InflateLayout cost time: " + (System.currentTimeMillis() - this.start));
        this.webViewStart = System.currentTimeMillis();
        this.mHandle = new android.taobao.util.i(this, this);
        boolean z2 = android.taobao.windvane.config.j.commonConfig.o;
        if (BrowserUtil.b(this._uri)) {
            BrowserUtil.a(TAG, str, "query_wvUseSystemWebView", this.originalurl, null);
            android.taobao.windvane.monitor.a.commitFail("wvUseSysWebView", 1, "wvUseSysWebView", this.originalurl);
            z = true;
        } else {
            z = z2;
        }
        WVUCWebView.setUseSystemWebView(z);
        if (this.originalurl.contains("waitUCPrepared=true")) {
            BrowserUtil.a(TAG, str, "query_waitUCPrepare", this.originalurl, null);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            aem.a().a(new aei() { // from class: com.taobao.browser.BrowserActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                    if (str3.hashCode() == 90991720) {
                        super.a();
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                }

                @Override // tb.aei
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    super.a();
                    m.c("WVUCWebView", "countDown");
                    countDownLatch.countDown();
                }
            });
            if (!z && !WVCore.getInstance().isUCSupport()) {
                m.c("WVUCWebView", "need wait");
                try {
                    countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            } else {
                m.c("WVUCWebView", "need not wait");
            }
        }
        kfc.a("exchain.FullTrace", "init webveiw start: " + this.webViewStart);
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, TAG).a("H5_initWebview", getID()).a(this.webViewStart).a();
        kez.a();
        TLog.logi("WVUCWebView", "use uc core = [" + WVCore.getInstance().isUCSupport() + riy.ARRAY_END_STR);
        this.loaded = false;
        final com.taobao.monitor.procedure.g b = s.f18233a.b(this);
        b.a("containerInit", aex.a(this.onCreateTime), aex.a(System.currentTimeMillis()));
        b.a("webviewInit");
        android.taobao.windvane.util.f.b(this.businessSpan, "H5_initWebview");
        if (WVCore.getInstance().isUCSupport()) {
            try {
                this.browserWebView = g.a().getPreRender(this.originalurl, this);
            } catch (Throwable unused3) {
            }
            if (this.browserWebView != null) {
                this.loaded = true;
                m.e(g.TAG, "getPreRender by key=[" + this.originalurl + "] success");
            } else if (!z) {
                this.browserWebView = g.a().getPreWeb();
                g.a();
                g.a(this);
                m.e(g.TAG, "getPreRender by key=[" + this.originalurl + "] failed");
            }
        }
        if (intent.hasExtra("BizId")) {
            try {
                String stringExtra = intent.getStringExtra("BizId");
                WVUCWebView.setBizCode(stringExtra);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("BizId", stringExtra);
                BrowserUtil.a(TAG, str, "intent_has_bizId", this.originalurl, hashMap2);
            } catch (Exception e3) {
                m.e(TAG, e3.getMessage());
            }
        }
        this.isAfcMergeOpenH5 = false;
        if (intent.getBooleanExtra("afc_nav_merge", false) && com.taobao.browser.config.a.commonConfig.p && ABGlobal.isFeatureOpened(this, "browser_webview_init_async_v2")) {
            this.isAfcMergeOpenH5 = isH5UrlFromAfc(intent);
        }
        if (this.browserWebView != null) {
            m.e(g.TAG, "browserWebView != null");
            this.browserWebView.setOuterContext(this);
            if (!this.loaded) {
                this.browserWebView.init();
                g.a().clear();
            }
            doOnCreateLater(b, bundle2);
        } else if (this.isAfcMergeOpenH5 && !z && !WVCore.getInstance().isUCSupport() && WVUCRemoteFetcher.hasUCRemoteLocal()) {
            this.isWaitUCReady = true;
            SplashFragment.show(getSupportFragmentManager());
            kfc.b("exchain.FullTrace", "Wait UC Core ready");
            TimerTask timerTask = new TimerTask() { // from class: com.taobao.browser.BrowserActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    kfc.b("exchain.FullTrace", "UC Core init timeout,  Back to Home");
                    if (BrowserActivity.this.mHandle != null) {
                        BrowserActivity.this.mHandle.sendEmptyMessage(com.taobao.browser.utils.i.GO_TO_HOME);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", (Object) BrowserActivity.access$100(BrowserActivity.this));
                    AppMonitor.Alarm.commitFail(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "WebViewInitAsync", "UCCoreTimeout", jSONObject.toJSONString());
                }
            };
            final Timer timer = new Timer();
            this.isUCCorePreparedCallback = false;
            final long uptimeMillis = SystemClock.uptimeMillis();
            final Bundle bundle3 = bundle2;
            WVCore.getInstance().initUCCore(this, new android.taobao.windvane.webview.a() { // from class: com.taobao.browser.BrowserActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 anonymousClass7, String str3, Object... objArr) {
                    if (str3.hashCode() == 1847240272) {
                        super.onUCCorePrepared();
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                }

                @Override // android.taobao.windvane.webview.a
                public void onUCCorePrepared() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                        return;
                    }
                    super.onUCCorePrepared();
                    if (BrowserActivity.access$200(BrowserActivity.this)) {
                        return;
                    }
                    BrowserActivity.access$202(BrowserActivity.this, true);
                    kfc.b("exchain.FullTrace", "UC Core is ready now, wait time:" + (SystemClock.uptimeMillis() - uptimeMillis));
                    if (BrowserActivity.this.mHandle != null) {
                        BrowserActivity.this.mHandle.removeMessages(com.taobao.browser.utils.i.GO_TO_HOME);
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.browser.BrowserActivity.7.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            timer.cancel();
                            kfc.b("exchain.FullTrace", "Timer cancel");
                            BrowserActivity.access$300(BrowserActivity.this, b, bundle3);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", (Object) BrowserActivity.access$100(BrowserActivity.this));
                            AppMonitor.Alarm.commitSuccess(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "WebViewInitAsync", jSONObject.toJSONString());
                        }
                    });
                }
            });
            timer.schedule(timerTask, orq.FRAME_CHECK_TIMEOUT);
            kfc.b("exchain.FullTrace", "Timer start");
        } else {
            kfc.b("exchain.FullTrace", "UC is Ready, new BrowserHybridWebView");
            doOnCreateLater(b, bundle2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:71|(1:73)(1:191)|74|(3:76|(2:78|(2:80|(1:82)(1:163))(1:164))(1:165)|83)(2:166|(2:168|(3:170|(1:183)(2:178|(1:180)(1:182))|181)(1:184))(16:185|(6:187|(1:189)|190|(1:87)|88|(10:110|(2:116|(8:118|119|(2:121|(1:125))|126|127|128|129|(1:131)(15:132|(1:134)|135|(1:137)|138|(1:140)(1:159)|141|142|143|144|(1:146)(3:152|(1:154)|155)|147|(1:149)|150|151)))|162|119|(0)|126|127|128|129|(0)(0))(6:98|(2:107|(3:109|104|105))|101|(1:103)(1:106)|104|105))|85|(0)|88|(1:90)|110|(4:112|114|116|(0))|162|119|(0)|126|127|128|129|(0)(0)))|84|85|(0)|88|(0)|110|(0)|162|119|(0)|126|127|128|129|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x06cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doOnCreateLater(com.taobao.monitor.procedure.g r38, android.os.Bundle r39) {
        /*
            Method dump skipped, instructions count: 2165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.BrowserActivity.doOnCreateLater(com.taobao.monitor.procedure.g, android.os.Bundle):void");
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : this.statusImmersive;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        TBProgressBar tBProgressBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        super.onAttachedToWindow();
        if (this.browserWebView == null) {
            return;
        }
        enableH5Progress();
        if (this.browserWebView.isPreRender() && (tBProgressBar = this.progressbar) != null) {
            tBProgressBar.setCurrentProgress(this.browserWebView.getProgress());
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.onAttachedToWindow end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.enableUCVisibility = StringUtils.equals("true", OrangeConfig.getInstance().getConfig("group_common_browser", com.taobao.browser.utils.i.KEY_ORANGE_CONFIG_ENABLE_UC_VISIBILITY, "false"));
        long currentTimeMillis = System.currentTimeMillis();
        TBS.Page.enter(this.className);
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !StringUtils.isEmpty(browserHybridWebView.getCurrentUrl())) {
            Properties properties = new Properties();
            properties.put("url", this.browserWebView.getCurrentUrl());
            TBS.EasyTrace.updateEasyTraceActivityProperties(this, properties);
        }
        m.b(TAG, "onResume.");
        super.onResume();
        kfc.a("exchain.FullTrace", "BrowserActivity.onResume after supper: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        android.taobao.util.i iVar = this.mHandle;
        if (iVar != null && iVar.hasMessages(1105)) {
            this.mHandle.removeMessages(1105);
        }
        BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
        if (browserHybridWebView2 != null) {
            browserHybridWebView2.resume();
            this.browserWebView.setVisibility(0);
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.onResume after resume webview: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        if (com.taobao.browser.utils.i.d) {
            com.taobao.browser.utils.i.d = false;
            this.browserWebView.getWVCallBackContext().fireEvent("WindVane.fromWebViewPop", "{}");
        }
        try {
            getMetaInfo(this.mYyzUrl);
            kev.wv_currentStatus = "2";
        } catch (Throwable unused) {
        }
        BrowserUtil.a(this, this.browserWebView);
        kfc.a("exchain.FullTrace", "BrowserActivity.onResume end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(TrackBuried.list_Type)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "kpv");
            if (!StringUtils.isEmpty(this.mYyzUrl)) {
                hashMap.put("url", this.mYyzUrl);
            }
            TrackBuried.effectupdatePageProperties(this.className, hashMap);
        }
        m.b(TAG, "onRestart.");
        super.onRestart();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView == null) {
            return;
        }
        browserHybridWebView.onLowMemory();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !this.isBkpg) {
            browserHybridWebView.ObtainRenderType();
        }
        com.taobao.browser.utils.i.e = null;
        d.a().b(this);
        LoginBroadcastReceiver.a(this);
        m.b(TAG, "onDestroy.");
        TBProgressBar tBProgressBar = this.progressbar;
        if (tBProgressBar != null) {
            if (tBProgressBar.getParent() != null && (this.progressbar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.progressbar.getParent()).removeView(this.progressbar);
            }
            this.progressbar = null;
        }
        android.taobao.util.i iVar = this.mHandle;
        if (iVar != null) {
            iVar.a();
            this.mHandle = null;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmap = null;
        }
        ActionBarMenuItem actionBarMenuItem = this.menuItemTitle;
        if (actionBarMenuItem != null && actionBarMenuItem.iconBitemap != null) {
            this.menuItemTitle.iconBitemap.recycle();
            this.menuItemTitle = null;
        }
        ActionBarMenuItem actionBarMenuItem2 = this.menuItemRight;
        if (actionBarMenuItem2 != null && actionBarMenuItem2.iconBitemap != null) {
            this.menuItemRight.iconBitemap.recycle();
            this.menuItemRight = null;
        }
        ActionBarMenuItem actionBarMenuItem3 = this.menuItemSecondRight;
        if (actionBarMenuItem3 != null && actionBarMenuItem3.iconBitemap != null) {
            this.menuItemSecondRight.iconBitemap.recycle();
            this.menuItemSecondRight = null;
        }
        List<ActionBarMenuItem> list = this.menuItemList;
        if (list != null && list.size() > 0) {
            for (ActionBarMenuItem actionBarMenuItem4 : this.menuItemList) {
                if (actionBarMenuItem4.iconBitemap != null) {
                    actionBarMenuItem4.iconBitemap.recycle();
                }
            }
            this.menuItemList = null;
        }
        super.onDestroy();
        BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
        if (browserHybridWebView2 != null) {
            browserHybridWebView2.setFilter(null);
            this.browserWebView.setOutHandler(null);
            this.browserWebView.setVisibility(8);
            this.browserWebView.removeAllViews();
            if (com.taobao.browser.config.a.commonConfig.z) {
                ViewParent parent = this.browserWebView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.browserWebView);
                }
                this.browserWebView.destroy();
            } else {
                this.browserWebView.coreDestroy();
            }
            this.browserWebView = null;
        }
        TBS.Page.destroy(this.className);
        this.isHookNativeBack = false;
        odv.a(this).a();
        try {
            kev.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        if (this.webOrange != null) {
            OrangeConfig.getInstance().unregisterListener(new String[]{"WindVane"});
        }
        com.taobao.analysis.v3.g gVar = this.businessSpan;
        if (gVar == null) {
            return;
        }
        gVar.c();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null) {
            browserHybridWebView.pause();
            android.taobao.util.i iVar = this.mHandle;
            if (iVar == null) {
                return;
            }
            iVar.postDelayed(new AnonymousClass10(), 3000L);
        }
        m.b(TAG, "onPause.");
        TBS.Page.leave(this.className);
        if (this.browserWebView != null) {
            kfb.a().a(this.mActivityHashCode, this.browserWebView.getOriginalUrl(), isFinishing());
            if (!StringUtils.isEmpty(this.browserWebView.getCurrentUrl())) {
                Properties properties = new Properties();
                properties.put("url", this.browserWebView.getCurrentUrl());
                TBS.EasyTrace.updateEasyTraceActivityProperties(this, properties);
            }
        }
        try {
            kev.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        super.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        if (disableTransition()) {
            overridePendingTransition(0, 0);
        }
        try {
            super.onStart();
        } catch (Throwable unused) {
        }
        if (!this.enableUCVisibility || (browserHybridWebView = this.browserWebView) == null) {
            return;
        }
        browserHybridWebView.setVisibility(0);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (!this.enableUCVisibility || (browserHybridWebView = this.browserWebView) == null) {
            return;
        }
        browserHybridWebView.setVisibility(4);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        BrowserHybridWebView browserHybridWebView;
        String str;
        String queryParameter;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 59) {
            AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.HANDLER_WHAT_FILTERURLSID", 1.0d);
            this.browserWebView.loadUrl((String) message.obj);
        } else if (i == 88) {
            Intent intent = getIntent();
            intent.putExtra("data", (String) message.obj);
            setResult(-1, intent);
            if (!this.browserWebView.back()) {
                finish();
                overridePendingTransition(R.anim.activity_push_right_in, R.anim.push_right_out);
            }
        } else if (i == 136) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj)));
            } catch (ActivityNotFoundException unused) {
                Toast makeText = Toast.makeText(this, "对不起，您的设备找不到相应程序", 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        } else if (i == 900) {
            finish();
            if (!disableTransition()) {
                overridePendingTransition(R.anim.activity_push_right_in, R.anim.push_right_out);
            }
        } else if (i == 1001) {
            AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOBAO_BIND_CARD", 1.0d);
            Intent intent2 = new Intent();
            intent2.setAction("com.taobao.tao.mytaobao.bindcard");
            intent2.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
            intent2.setPackage("com.taobao.taobao");
            Bundle bundle = new Bundle();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(message.getData().getString("data"));
                bundle.putInt("fromSource", Integer.valueOf(jSONObject.getString("fromSource")).intValue());
                bundle.putBoolean("bind_card_switch", jSONObject.getBoolean("bind_card_switch"));
                bundle.putString("user_id", jSONObject.getString("user_id"));
            } catch (Exception unused2) {
            }
            intent2.putExtras(bundle);
            try {
                startActivityForResult(intent2, 1001);
            } catch (Exception e) {
                m.c(TAG, "start BindCardActivity failed: " + e.toString());
            }
        } else if (i != 1003) {
            Bundle bundle2 = null;
            switch (i) {
                case 400:
                    kfc.a("exchain.FullTrace", "BrowserActivity.NOTIFY_PAGE_START: " + System.currentTimeMillis());
                    TBProgressBar tBProgressBar = this.progressbar;
                    if (tBProgressBar != null) {
                        tBProgressBar.resetProgress();
                    }
                    this.hideShareItem = false;
                    this.hideUserHelperItem = false;
                    if (this.isAutoResetMenu) {
                        togglePublicMenu(true);
                        this.isAutoResetMenu = false;
                    }
                    this.useDounble11Style = com.taobao.browser.utils.f.a("android_windvane_config", "defaultFestivalStyle", "festivalWithRainbowLine");
                    this.mFavorIcon = null;
                    this.mFavorText = "收藏";
                    android.taobao.windvane.webview.h.a().c();
                    break;
                case 401:
                    this.mYyzUrl = (String) message.obj;
                    String str2 = this.className;
                    String str3 = this.mYyzUrl;
                    com.taobao.browser.utils.m.a(str2, str3, str3);
                    TBProgressBar tBProgressBar2 = this.progressbar;
                    if (tBProgressBar2 != null) {
                        tBProgressBar2.setCurrentProgress(100);
                    }
                    getMetaInfo(this.mYyzUrl);
                    Intent intent3 = getIntent();
                    intent3.putExtra("ActivityName", "BrowserActivity:" + p.d(this.mYyzUrl));
                    break;
                case 402:
                    TBProgressBar tBProgressBar3 = this.progressbar;
                    if (tBProgressBar3 != null) {
                        tBProgressBar3.setCurrentProgress(100);
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case 1102:
                            if (getIntent().hasExtra("isfrompushMsg")) {
                                Nav.from(getApplicationContext()).toUri("http://m.taobao.com/index.htm");
                            } else {
                                finish();
                            }
                            if (!disableTransition()) {
                                overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                                break;
                            }
                            break;
                        case 1103:
                            BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
                            if (browserHybridWebView2 != null && this.hasCustomButton) {
                                browserHybridWebView2.loadUrl(com.taobao.browser.utils.i.f16846a);
                            }
                            BrowserUtil.a(this, this.browserWebView);
                            this.noMetaPageList = getNoMetaPageList();
                            if (!StringUtils.isEmpty(this.noMetaPageList) && (browserHybridWebView = this.browserWebView) != null && k.a(this.noMetaPageList, browserHybridWebView.getCurrentUrl())) {
                                this.browserWebView.loadUrl(com.taobao.browser.utils.i.b);
                                break;
                            }
                            break;
                        case 1104:
                            BrowserUtil.a(TAG, "handleMessage", "get_title", null, null);
                            ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem();
                            if (message.obj instanceof Bundle) {
                                bundle2 = (Bundle) message.obj;
                                str = bundle2.getString("title");
                            } else {
                                str = (String) message.obj;
                            }
                            BrowserHybridWebView browserHybridWebView3 = this.browserWebView;
                            if (browserHybridWebView3 != null && browserHybridWebView3.getUrl() != null) {
                                Uri parse = Uri.parse(this.browserWebView.getUrl());
                                if (parse.isHierarchical() && (queryParameter = parse.getQueryParameter("customtitle")) != null && !queryParameter.isEmpty()) {
                                    str = queryParameter;
                                }
                            }
                            if (!this.readTitle && message.arg1 != 111) {
                                str = " ";
                            }
                            if (!StringUtils.isEmpty(str)) {
                                actionBarMenuItem.setTitle(str);
                                this.menuItemTitle = actionBarMenuItem;
                                supportInvalidateOptionsMenu();
                                break;
                            } else if (bundle2 == null || !bundle2.containsKey("icon")) {
                                actionBarMenuItem.setTitle(" ");
                                this.menuItemTitle = actionBarMenuItem;
                                break;
                            } else {
                                Boolean bool = false;
                                String string = bundle2.getString("icon");
                                String string2 = bundle2.getString("iconType");
                                if (!StringUtils.isEmpty(string2) && !StringUtils.isEmpty(string)) {
                                    actionBarMenuItem.stretch = bundle2.getBoolean("stretch");
                                    if (string2.equals("IconFont")) {
                                        if (actionBarMenuItem.setIconFontId(string) >= 0) {
                                            z = true;
                                        }
                                        bool = Boolean.valueOf(z);
                                    } else if (string2.equals("Native")) {
                                        if (actionBarMenuItem.setIconResId(string) >= 0) {
                                            z = true;
                                        }
                                        bool = Boolean.valueOf(z);
                                    } else if (string2.equals("Base64")) {
                                        bool = Boolean.valueOf(actionBarMenuItem.setIconBitmap(string, BrowserUtil.a((Context) this)));
                                    } else if (string2.equals(MonitorItemConstants.KEY_URL)) {
                                        actionBarMenuItem.href = string;
                                        bool = true;
                                    }
                                    if (bool.booleanValue()) {
                                        this.menuItemTitle = actionBarMenuItem;
                                        supportInvalidateOptionsMenu();
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1105:
                            if (this.mAppLinkIsNewIntent) {
                                this.mAppLinkIsNewIntent = false;
                                break;
                            } else {
                                Bundle data = message.getData();
                                if (data != null && data.getString("result") != null) {
                                    String string3 = data.getString("result");
                                    Intent intent4 = new Intent();
                                    intent4.setAction("Broadcast_Activity");
                                    intent4.putExtra("result", string3);
                                    intent4.setPackage(getPackageName());
                                    getApplicationContext().sendBroadcast(intent4);
                                }
                                finish(!AfcLifeCycleCenter.isLauncherStart);
                                if (!disableTransition()) {
                                    overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                                    break;
                                }
                            }
                            break;
                        default:
                            switch (i) {
                                case 1108:
                                    Bundle bundle3 = (Bundle) message.obj;
                                    this.mlinkhref = bundle3.getString("linkhref");
                                    this.mlinkonclick = bundle3.getString("linkonclick");
                                    if (!StringUtils.isEmpty(this.mlinkhref) || !StringUtils.isEmpty(this.mlinkonclick)) {
                                        try {
                                            com.taobao.phenix.intf.b.h().a(this.mlinkhref).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.browser.BrowserActivity.11
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // com.taobao.phenix.intf.event.a
                                                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                                                    IpChange ipChange2 = $ipChange;
                                                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                                                }

                                                public boolean a(SuccPhenixEvent succPhenixEvent) {
                                                    IpChange ipChange2 = $ipChange;
                                                    if (ipChange2 instanceof IpChange) {
                                                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                                                    }
                                                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                                                        BrowserActivity.access$502(BrowserActivity.this, succPhenixEvent.getDrawable().getBitmap());
                                                        if (BrowserActivity.access$500(BrowserActivity.this) != null) {
                                                            BrowserActivity.this.supportInvalidateOptionsMenu();
                                                        }
                                                    }
                                                    return true;
                                                }
                                            }).fetch();
                                        } catch (Exception unused3) {
                                            break;
                                        }
                                    }
                                    break;
                                case 1109:
                                    Intent intent5 = new Intent();
                                    intent5.putExtra("data", (String) message.obj);
                                    setResult(1, intent5);
                                    finish();
                                    break;
                                case com.taobao.browser.utils.i.ACTIONBAR_MENU_RIGHT /* 1110 */:
                                    Bundle bundle4 = (Bundle) message.obj;
                                    ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem();
                                    if (bundle4.getBoolean(com.taobao.browser.utils.i.ACTION_BAR_ITEM_HIDE, false)) {
                                        this.menuItemRight = null;
                                        supportInvalidateOptionsMenu();
                                        break;
                                    } else {
                                        String string4 = bundle4.getString("title");
                                        if (!StringUtils.isEmpty(string4)) {
                                            actionBarMenuItem2.setTitle(string4);
                                            this.menuItemRight = actionBarMenuItem2;
                                            supportInvalidateOptionsMenu();
                                            break;
                                        } else {
                                            String string5 = bundle4.getString("icon");
                                            if (bundle4.getBoolean("fromNative")) {
                                                if (!bundle4.getBoolean("iconFont") ? actionBarMenuItem2.setIconResId(string5) >= 0 : actionBarMenuItem2.setIconFontId(string5) >= 0) {
                                                    z = true;
                                                }
                                            } else {
                                                z = actionBarMenuItem2.setIconBitmap(string5, BrowserUtil.a((Context) this));
                                            }
                                            if (z) {
                                                this.menuItemRight = actionBarMenuItem2;
                                                supportInvalidateOptionsMenu();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case com.taobao.browser.utils.i.ACTIONBAR_MENU_LIST /* 1111 */:
                                    List<ActionBarMenuItem> list = this.menuItemList;
                                    if (list == null) {
                                        this.menuItemList = new ArrayList();
                                    } else {
                                        list.clear();
                                    }
                                    Bundle bundle5 = (Bundle) message.obj;
                                    if (!bundle5.getBoolean(com.taobao.browser.utils.i.ACTION_BAR_ITEM_HIDE, false)) {
                                        String string6 = bundle5.getString("param");
                                        try {
                                            JSONArray optJSONArray = new org.json.JSONObject(string6).optJSONArray("items");
                                            if (optJSONArray != null) {
                                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                                    ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem();
                                                    String optString = optJSONObject.optString("text");
                                                    if (!StringUtils.isEmpty(optString)) {
                                                        actionBarMenuItem3.title = optString;
                                                        boolean optBoolean = optJSONObject.optBoolean("fromNative", false);
                                                        boolean optBoolean2 = optJSONObject.optBoolean("iconFont", false);
                                                        String optString2 = optJSONObject.optString("icon");
                                                        if (!optBoolean) {
                                                            actionBarMenuItem3.setIconBitmap(optString2, BrowserUtil.a((Context) this));
                                                        } else if (optBoolean2) {
                                                            actionBarMenuItem3.setIconFontId(optString2);
                                                        } else {
                                                            actionBarMenuItem3.setIconResId(optString2);
                                                        }
                                                        actionBarMenuItem3.data = new Intent();
                                                        actionBarMenuItem3.data.putExtra("index", i2);
                                                        this.menuItemList.add(actionBarMenuItem3);
                                                    }
                                                }
                                            }
                                        } catch (JSONException unused4) {
                                            m.e(TAG, "actionbar_menu_list parse param error, param: " + string6);
                                            break;
                                        }
                                    }
                                    supportInvalidateOptionsMenu();
                                    break;
                                case com.taobao.browser.utils.i.ACTIONBAR_ADDTODESKTOP /* 1112 */:
                                    Bundle bundle6 = (Bundle) message.obj;
                                    if (bundle6.getBoolean(com.taobao.browser.utils.i.ACTION_BAR_ITEM_HIDE, false)) {
                                        this.isaddDesktop = false;
                                    } else {
                                        this.shortcut_title = bundle6.getString("title");
                                        this.shortcut_icon = bundle6.getString("icon");
                                        this.shortcut_url = bundle6.getString("url");
                                        this.shortcut_buttonText = bundle6.getString("buttonText");
                                        byte[] byteArray = bundle6.getByteArray(IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
                                        this.shortcut_bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                                        this.isaddDesktop = true;
                                    }
                                    supportInvalidateOptionsMenu();
                                    break;
                                default:
                                    switch (i) {
                                        case com.taobao.browser.utils.i.TRADE_SETINFO /* 1114 */:
                                            Intent intent6 = new Intent();
                                            intent6.putExtra("data", (String) message.obj);
                                            setResult(1, intent6);
                                            finish();
                                            break;
                                        case com.taobao.browser.utils.i.SHOW_FLOWBAR /* 1115 */:
                                            Bundle data2 = message.getData();
                                            if (data2 != null && data2.getString("params") != null) {
                                                showFlowBar(data2.getString("params"));
                                                break;
                                            }
                                            break;
                                        case com.taobao.browser.utils.i.SHOW_TABBAR /* 1116 */:
                                            Bundle data3 = message.getData();
                                            if (data3 != null && data3.getString("params") != null) {
                                                showTabBar(data3.getString("params"));
                                                break;
                                            }
                                            break;
                                        case com.taobao.browser.utils.i.HIDDEN_FLOWBAR /* 1117 */:
                                            Bundle data4 = message.getData();
                                            if (data4 != null && data4.getString("params") != null) {
                                                hiddenFlowBar(data4.getString("params"));
                                                break;
                                            }
                                            break;
                                        case com.taobao.browser.utils.i.HIDDEN_TABBAR /* 1118 */:
                                            hiddenTabBar();
                                            break;
                                        case com.taobao.browser.utils.i.FULL_SCREEN /* 1119 */:
                                            if (((Boolean) message.obj).booleanValue()) {
                                                com.taobao.browser.utils.e.a(this, Uri.parse(this.browserWebView.getUrl()), false);
                                                break;
                                            }
                                            break;
                                        case com.taobao.browser.utils.i.HIDDEN_NAVBAR /* 1120 */:
                                            String str4 = (String) message.obj;
                                            if (getSupportActionBar() != null) {
                                                if ("1".equals(str4)) {
                                                    getSupportActionBar().e();
                                                    this.mAutoShowNavbar = false;
                                                    break;
                                                } else if ("2".equals(str4)) {
                                                    getSupportActionBar().e();
                                                    break;
                                                } else {
                                                    getSupportActionBar().d();
                                                    this.mAutoShowNavbar = true;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 1121:
                                            this.isHookNativeBack = true;
                                            break;
                                        case com.taobao.browser.utils.i.TRADE_SELFPICKUP /* 1122 */:
                                            Intent intent7 = new Intent();
                                            intent7.putExtra("data", (String) message.obj);
                                            setResult(9876, intent7);
                                            finish();
                                            break;
                                        case com.taobao.browser.utils.i.HIDE_DEAFAULT_MORE_ITEM /* 1123 */:
                                            if (((Bundle) message.obj).getBoolean(com.taobao.browser.utils.i.ACTION_BAR_ITEM_USER_HELPER_HIDE, false)) {
                                                this.hideUserHelperItem = true;
                                                supportInvalidateOptionsMenu();
                                                break;
                                            }
                                            break;
                                        case com.taobao.browser.utils.i.FESTIVAL_STYLE /* 1124 */:
                                            this.useDounble11Style = (String) message.obj;
                                            supportInvalidateOptionsMenu();
                                            break;
                                        default:
                                            switch (i) {
                                                case com.taobao.browser.utils.i.WEBVIEW_PROGRESS_CHANGE /* 1126 */:
                                                    TBProgressBar tBProgressBar4 = this.progressbar;
                                                    if (tBProgressBar4 != null) {
                                                        tBProgressBar4.setCurrentProgress(message.arg1);
                                                        break;
                                                    }
                                                    break;
                                                case com.taobao.browser.utils.i.ACTIONBAR_MENU_SECOND_RIGHT /* 1127 */:
                                                    Bundle bundle7 = (Bundle) message.obj;
                                                    ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem();
                                                    if (bundle7.getBoolean(com.taobao.browser.utils.i.ACTION_BAR_ITEM_HIDE, false)) {
                                                        this.menuItemSecondRight = null;
                                                        supportInvalidateOptionsMenu();
                                                        break;
                                                    } else {
                                                        String string7 = bundle7.getString("title");
                                                        if (!StringUtils.isEmpty(string7)) {
                                                            actionBarMenuItem4.setTitle(string7);
                                                            this.menuItemSecondRight = actionBarMenuItem4;
                                                            supportInvalidateOptionsMenu();
                                                            break;
                                                        } else {
                                                            String string8 = bundle7.getString("icon");
                                                            if (bundle7.getBoolean("fromNative")) {
                                                                if (!bundle7.getBoolean("iconFont") ? actionBarMenuItem4.setIconResId(string8) >= 0 : actionBarMenuItem4.setIconFontId(string8) >= 0) {
                                                                    z = true;
                                                                }
                                                            } else {
                                                                z = actionBarMenuItem4.setIconBitmap(string8, BrowserUtil.a((Context) this));
                                                            }
                                                            if (z) {
                                                                this.menuItemSecondRight = actionBarMenuItem4;
                                                                supportInvalidateOptionsMenu();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case com.taobao.browser.utils.i.ACTIONBAR_HAS_MENU /* 1128 */:
                                                    Bundle bundle8 = (Bundle) message.obj;
                                                    if (bundle8 != null) {
                                                        boolean z2 = bundle8.getBoolean("hasMenu");
                                                        this.isAutoResetMenu = bundle8.getBoolean("autoReset");
                                                        togglePublicMenu(z2);
                                                        supportInvalidateOptionsMenu();
                                                        break;
                                                    }
                                                    break;
                                                case com.taobao.browser.utils.i.SPLASH_HIDE /* 1129 */:
                                                    m.b(TAG, "splash hide");
                                                    try {
                                                        SplashFragment.dismiss(getSupportFragmentManager());
                                                        break;
                                                    } catch (Throwable th) {
                                                        th.printStackTrace();
                                                        break;
                                                    }
                                                case com.taobao.browser.utils.i.GO_TO_HOME /* 1130 */:
                                                    m.b(TAG, "go to home");
                                                    try {
                                                        SplashFragment.dismiss(getSupportFragmentManager());
                                                        Nav.from(this).withExtras(null).disableTransition().withFlags(67108864).toUri("http://m.taobao.com/index.htm");
                                                        android.taobao.windvane.monitor.a.commitFail(MONITOR_POINT_TIME_OUT_GO_TO_HOME, 1, "TIMEOUT,go to home", this.url);
                                                        if (com.taobao.browser.config.a.commonConfig.f) {
                                                            finish(true);
                                                            break;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th2.printStackTrace();
                                                        break;
                                                    }
                                                    break;
                                                case com.taobao.browser.utils.i.HIDE_LOADING_DIALOG /* 1131 */:
                                                    hideLoadingDialog();
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOIAOPU_BIND_CARD", 1.0d);
            Intent intent8 = new Intent();
            intent8.setAction("com.taobao.tao.mytaobao.bindcard");
            intent8.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
            Bundle bundle9 = new Bundle();
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(message.getData().getString("data"));
                bundle9.putInt("fromSource", Integer.valueOf(jSONObject2.getString("fromSource")).intValue());
                bundle9.putBoolean("bind_card_switch", jSONObject2.getBoolean("bind_card_switch"));
                bundle9.putString("user_id", jSONObject2.getString("user_id"));
                bundle9.putString("tb_user_id", jSONObject2.getString("tb_user_id"));
            } catch (Exception unused5) {
            }
            intent8.putExtras(bundle9);
            try {
                startActivityForResult(intent8, 1003);
            } catch (Exception e2) {
                m.c(TAG, "start BindCardActivity failed: " + e2.toString());
            }
        }
        return true;
    }

    private String preBrowserFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6595bcb2", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            m.d(TAG, "originalurl is null, and finish activity.");
            android.taobao.util.i iVar = this.mHandle;
            if (iVar != null) {
                iVar.sendEmptyMessage(900);
            }
            return null;
        }
        UrlpreLoadFilter urlpreLoadFilter = new UrlpreLoadFilter(this, getIntent(), this.mHandle, this.browserWebView);
        String preloadURL = urlpreLoadFilter.preloadURL(str, getIntent());
        if (preloadURL == null) {
            this.browserWebView.loadUrl(str);
            m.d(TAG, "UrlpreLoadFilter result is null, and call superLoadUrl.");
            return null;
        } else if (!urlpreLoadFilter.filtrate(preloadURL)) {
            return preloadURL;
        } else {
            return null;
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        String str;
        String minimalistStartupUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        TLog.loge(TAG, "onNewIntent.");
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    this.mAppLinkIsNewIntent = intent.getExtras().getBoolean("AppLinkISOnNewIntent");
                }
            } catch (Exception unused) {
            }
            String str2 = null;
            try {
                str2 = intent.getStringExtra("myBrowserUrl");
                if (StringUtils.isEmpty(str2)) {
                    str2 = intent.getDataString();
                }
                String urlReferer = getUrlReferer(str2, intent);
                if (urlReferer != null) {
                    str2 = urlReferer;
                }
                str = preBrowserFilter(str2);
            } catch (Exception unused2) {
                TLog.loge(TAG, "fail to get intent extras");
                str = str2;
            }
            if (this.browserWebView != null && (minimalistStartupUrl = getMinimalistStartupUrl(intent, str)) != null) {
                m.b(android.taobao.util.k.TAOBAO_TAG, "Browser : onNewIntent 2:" + minimalistStartupUrl);
                reSetActionbarDefault();
                if (!com.taobao.browser.config.a.commonConfig.w || !isFinishing()) {
                    this.browserWebView.resume();
                    this.browserWebView.loadUrl(UrlFormator.formatUrl(minimalistStartupUrl));
                    this.browserWebView.wpData.timeLoadurl = System.currentTimeMillis();
                }
                android.taobao.util.i iVar = this.mHandle;
                if (iVar != null && iVar.hasMessages(1105)) {
                    this.mHandle.removeMessages(1105);
                }
                if (isFinishing()) {
                    Nav.from(this).withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(minimalistStartupUrl);
                }
                Intent intent2 = getIntent();
                intent2.putExtra("ActivityName", "BrowserActivity:" + p.d(minimalistStartupUrl));
            }
        }
        super.onNewIntent(intent);
    }

    private String getMinimalistStartupUrl(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98f6b9e1", new Object[]{this, intent, str});
        }
        boolean booleanExtra = intent.getBooleanExtra("cold_startup_h5", false);
        boolean booleanExtra2 = intent.getBooleanExtra("afc_nav_merge", false);
        boolean booleanExtra3 = intent.getBooleanExtra("afc_nav_native", false);
        if (booleanExtra && booleanExtra2) {
            String finalUrlFromAfc = getFinalUrlFromAfc(intent);
            if (StringUtils.equals(finalUrlFromAfc, this.navAfcMergeUrl)) {
                finalUrlFromAfc = null;
            }
            String str2 = finalUrlFromAfc;
            getIntent().putExtra("cold_startup_h5", true);
            getIntent().putExtra("afc_nav_merge", true);
            return str2;
        } else if (!booleanExtra || !booleanExtra3) {
            return str;
        } else {
            String h5UrlFromAfc = getH5UrlFromAfc(intent);
            if (!StringUtils.isEmpty(h5UrlFromAfc)) {
                if (Nav.from(this).withExtras(intent.getExtras()).toUri(h5UrlFromAfc)) {
                    NotifyApm.a().a(this);
                    com.taobao.browser.config.a.a();
                    if (com.taobao.browser.config.a.commonConfig.b) {
                        m.e(TAG, "fixAfcBug onNewIntent");
                        finish(true);
                        return str;
                    }
                    com.taobao.browser.config.a.a();
                    if (com.taobao.browser.config.a.commonConfig.d) {
                        m.e(TAG, "fixAfcBug onNewIntent2");
                        finish(true);
                        return str;
                    }
                    m.e(TAG, "not fixAfcBug onNewIntent");
                    finish();
                    return str;
                }
                m.e(TAG, "onNewIntent afcNavNative failed, nav cannot handle it");
                android.taobao.windvane.monitor.a.commitFail(MONITOR_POINT_AFC_NAV_FAIL, 4, "onNewIntent afcNavNative failed, nav cannot handle it", h5UrlFromAfc);
                return str;
            }
            m.e(TAG, "onNewIntent afcNavNative failed, there is no h5Url");
            android.taobao.windvane.monitor.a.commitFail(MONITOR_POINT_AFC_NAV_FAIL, 5, "onNewIntent afcNavNative failed, there is no h5Url", h5UrlFromAfc);
            return str;
        }
    }

    private String getH5UrlFromAfc(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719ec354", new Object[]{this, intent});
        }
        String str = null;
        try {
            if (this.mHandle != null) {
                this.mHandle.removeMessages(com.taobao.browser.utils.i.GO_TO_HOME);
            }
            str = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            m.b(TAG, "getH5UrlFromAfc url=" + str);
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    private Uri getH5UriFromAfc(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a9e484e6", new Object[]{this, intent});
        }
        try {
            String queryParameter = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            String queryParameter2 = Uri.parse(queryParameter).getQueryParameter(RVStartParams.KEY_URL_SHORT);
            if (!StringUtils.isEmpty(queryParameter2) && Uri.parse(queryParameter2).isHierarchical()) {
                queryParameter = queryParameter2;
            }
            return Uri.parse(queryParameter);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private boolean isH5UrlFromAfc(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10f4bca4", new Object[]{this, intent})).booleanValue();
        }
        try {
            String queryParameter = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            String queryParameter2 = Uri.parse(queryParameter).getQueryParameter(RVStartParams.KEY_URL_SHORT);
            if (!StringUtils.isEmpty(queryParameter2) && Uri.parse(queryParameter2).isHierarchical()) {
                queryParameter = queryParameter2;
            }
            return !StringUtils.isEmpty(queryParameter);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private String getFinalUrlFromAfc(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8737ddb7", new Object[]{this, intent});
        }
        String str = null;
        try {
            if (this.mHandle != null) {
                this.mHandle.removeMessages(com.taobao.browser.utils.i.GO_TO_HOME);
            }
            str = Uri.parse(intent.getDataString()).getQueryParameter("h5Url");
            m.e(TAG, "afc_nav_merge url=" + str);
            String queryParameter = Uri.parse(str).getQueryParameter(RVStartParams.KEY_URL_SHORT);
            if (!StringUtils.isEmpty(queryParameter) && Uri.parse(queryParameter).isHierarchical()) {
                try {
                    m.e(TAG, "afc_nav_merge parsedU=" + queryParameter);
                    str = queryParameter;
                } catch (Throwable th) {
                    th = th;
                    str = queryParameter;
                    th.printStackTrace();
                    return str;
                }
            }
            if (!this.isIntentSetAfcH5Url) {
                this.isIntentSetAfcH5Url = true;
                intent.setData(Uri.parse(str));
            }
            if ((this.browserWebView != null && this.browserWebView.getUCExtension() == null) || !com.taobao.browser.utils.f.a()) {
                SplashFragment.dismiss(getSupportFragmentManager());
            } else if (!this.isWaitUCReady && this.mHandle != null) {
                this.mHandle.removeMessages(com.taobao.browser.utils.i.SPLASH_HIDE);
                android.taobao.util.i iVar = this.mHandle;
                android.taobao.windvane.config.j.a();
                iVar.sendEmptyMessageDelayed(com.taobao.browser.utils.i.SPLASH_HIDE, android.taobao.windvane.config.j.commonConfig.aP);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return str;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            BrowserHybridWebView browserHybridWebView = this.browserWebView;
            if (browserHybridWebView == null) {
                return false;
            }
            if (this.isHookNativeBack && !this.isHookNativeBackByJs) {
                browserHybridWebView.evaluateJavascript(RPWebViewActivity.j, new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = false;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        } else if (BrowserActivity.access$400(BrowserActivity.this) == null) {
                        } else {
                            if (!StringUtils.isEmpty(str)) {
                                z = !"false".equals(str.replace("\"", "").replace("'", ""));
                            }
                            if (z) {
                                BrowserActivity.access$400(BrowserActivity.this).getWVCallBackContext().fireEvent(RPWebViewActivity.l, "{}");
                                BrowserUtil.a(BrowserActivity.TAG, "backControl", "true", BrowserActivity.access$400(BrowserActivity.this).getCurrentUrl(), null);
                                return;
                            }
                            try {
                                Runtime.getRuntime().exec("input keyevent 4");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            BrowserActivity.access$602(BrowserActivity.this, true);
                            BrowserUtil.a(BrowserActivity.TAG, "backControl", "false", BrowserActivity.access$400(BrowserActivity.this).getCurrentUrl(), null);
                        }
                    }
                });
                return true;
            }
            this.isHookNativeBackByJs = false;
            this.browserWebView.getWVCallBackContext().fireEvent("WV.Event.Key.Back", "{}");
            if (o.getPerformanceMonitor() != null) {
                o.getPerformanceMonitor().didExitAtTime(this.browserWebView.getUrl(), System.currentTimeMillis());
            }
            TBProgressBar tBProgressBar = this.progressbar;
            if (tBProgressBar != null && tBProgressBar.isShown()) {
                this.browserWebView.stopLoading();
            }
            String url = this.browserWebView.getUrl();
            this.quitWebViewDirectlyUrls = getQuitWebViewDirectlyList();
            if (!StringUtils.isEmpty(url)) {
                try {
                    Uri parse = Uri.parse(url);
                    if (parse != null && "true".equals(parse.getQueryParameter("disallowback"))) {
                        this.alloweWebViewHistoryBack = false;
                    }
                    if (!StringUtils.isEmpty(this.quitWebViewDirectlyUrls) && k.a(this.quitWebViewDirectlyUrls, url)) {
                        this.alloweWebViewHistoryBack = false;
                    }
                } catch (Exception unused) {
                }
            }
            if (!this.alloweWebViewHistoryBack) {
                finish();
                return true;
            }
            return this.browserWebView.back();
        }
        return super.onPanelKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.browserWebView.onActivityResult(i, i2, intent);
        if (i != 7000 || intent == null) {
            return;
        }
        try {
            this.browserWebView.setDataOnActive(intent.getStringExtra("data"));
        } catch (Exception unused) {
        }
    }

    public void reSetActionbarDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988317ba", new Object[]{this});
            return;
        }
        this.isRefundOrderUrl = false;
        this.isaddDesktop = false;
        this.mlinkhref = null;
        this.menuItemRight = null;
        this.menuItemSecondRight = null;
        this.menuItemList = null;
        if (this.isAutoResetMenu) {
            togglePublicMenu(true);
            this.isAutoResetMenu = false;
        }
        supportInvalidateOptionsMenu();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && this.browserWebView != null) {
            kfb.a().c(this.mActivityHashCode, this.browserWebView.getOriginalUrl());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = FestivalMgr.a().a("global");
        if (!StringUtils.isEmpty(this.useDounble11Style) && a2) {
            setDounble11Style(this.useDounble11Style);
        } else {
            resetStyle();
        }
        org.json.JSONObject b = android.taobao.windvane.webview.h.a().b();
        if (!(b != null ? b.optBoolean("WV.Meta.DisableRefresh", false) : false)) {
            getMenuInflater().inflate(R.menu.browser_refresh_menu, menu);
        }
        if (this.isRefundOrderUrl && !StringUtil.isEmpty(this.orderId)) {
            AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "BrowserActivity.onCreateOptionsMenu.refund", 1.0d);
            int i = R.id.browser_menu_order_detail;
            MenuItemCompat.setShowAsAction(menu.add(0, i, 0, getString(R.string.uik_icon_form_light) + ":订单详情"), 0);
        }
        if (!StringUtils.isEmpty(this.mlinkhref) && this.bitmap != null) {
            getMenuInflater().inflate(R.menu.browser_custom_menu, menu);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.bitmap);
            MenuItem item = menu.getItem(R.id.browser_menu_custom);
            if (item != null) {
                item.setIcon(bitmapDrawable);
            }
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null) {
            this.wvContext = browserHybridWebView.getWVCallBackContext();
        }
        if (this.menuItemSecondRight != null) {
            MenuItem add = menu.add(0, R.id.browser_menu_second_right_item, 0, "");
            MenuItemCompat.setShowAsAction(add, 2);
            if (!StringUtils.isEmpty(this.menuItemSecondRight.title)) {
                add.setTitle(this.menuItemSecondRight.title);
            } else if (this.menuItemSecondRight.iconResId > 0) {
                add.setIcon(this.menuItemSecondRight.iconResId);
            } else if (this.menuItemSecondRight.iconFontId > 0) {
                add.setTitle(getResources().getString(this.menuItemSecondRight.iconFontId) + ":");
            } else if (this.menuItemSecondRight.iconBitemap != null && !this.menuItemSecondRight.iconBitemap.isRecycled()) {
                add.setIcon(new BitmapDrawable(getResources(), this.menuItemSecondRight.iconBitemap));
            }
        }
        if (this.menuItemRight != null) {
            MenuItem add2 = menu.add(0, R.id.browser_menu_right_item, 0, "");
            MenuItemCompat.setShowAsAction(add2, 2);
            if (!StringUtils.isEmpty(this.menuItemRight.title)) {
                add2.setTitle(this.menuItemRight.title);
            } else if (this.menuItemRight.iconResId > 0) {
                add2.setIcon(this.menuItemRight.iconResId);
            } else if (this.menuItemRight.iconFontId > 0) {
                add2.setTitle(getResources().getString(this.menuItemRight.iconFontId) + ":");
            } else if (this.menuItemRight.iconBitemap != null && !this.menuItemRight.iconBitemap.isRecycled()) {
                add2.setIcon(new BitmapDrawable(getResources(), this.menuItemRight.iconBitemap));
            }
        } else if ((b != null ? !b.optBoolean("WV.Meta.Share.Disabled", false) : false) && !this.hideShareItem) {
            int i2 = R.id.browser_menu_share;
            MenuItemCompat.setShowAsAction(menu.add(0, i2, 0, getString(R.string.uik_icon_share_light) + ":分享"), 2);
        }
        if (this.menuItemTitle != null) {
            final ActionBar supportActionBar = getSupportActionBar();
            if (StringUtils.isEmpty(this.menuItemTitle.title)) {
                if (supportActionBar != null) {
                    supportActionBar.d(false);
                }
                final ImageView imageView = new ImageView(this);
                if (this.menuItemTitle.iconResId > 0) {
                    imageView.setImageResource(this.menuItemTitle.iconResId);
                } else if (this.menuItemTitle.iconFontId > 0) {
                    imageView.setImageDrawable(getIconFontDrawable(this.menuItemTitle.iconFontId));
                } else if (this.menuItemTitle.iconBitemap != null && !this.menuItemTitle.iconBitemap.isRecycled()) {
                    imageView.setImageDrawable(new BitmapDrawable(getResources(), this.menuItemTitle.iconBitemap));
                } else if (!StringUtils.isEmpty(this.menuItemTitle.href)) {
                    com.taobao.phenix.intf.b.h().a(this.menuItemTitle.href).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.browser.BrowserActivity.15
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.intf.event.a
                        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                        }

                        public boolean a(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            int i3 = 0;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                            }
                            BitmapDrawable drawable = succPhenixEvent.getDrawable();
                            if (drawable == null) {
                                return false;
                            }
                            imageView.setImageDrawable(drawable);
                            ActionBar actionBar = supportActionBar;
                            if (actionBar != null) {
                                i3 = (int) (actionBar.c() * 0.6d);
                            }
                            if (BrowserActivity.access$700(BrowserActivity.this).stretch) {
                                imageView.setLayoutParams(new Toolbar.LayoutParams(-1, i3));
                                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            } else {
                                Bitmap bitmap = drawable.getBitmap();
                                imageView.setLayoutParams(new Toolbar.LayoutParams((int) ((i3 / bitmap.getHeight()) * bitmap.getWidth()), i3));
                            }
                            return true;
                        }
                    }).fetch();
                }
                imageView.setClickable(true);
                if (supportActionBar != null) {
                    supportActionBar.a(imageView);
                    supportActionBar.e(true);
                    supportActionBar.b(true);
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.BrowserActivity.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            BrowserActivity.access$800(BrowserActivity.this).fireEvent("TBNaviBar.titleItem.clicked", "{}");
                        }
                    }
                });
            } else if (supportActionBar != null) {
                supportActionBar.d(true);
                supportActionBar.e(false);
                supportActionBar.a(this.menuItemTitle.title);
            }
        }
        View findViewById = findViewById(R.id.uik_action_overflow);
        if (!(b != null ? b.optBoolean("WV.Meta.Nav.HideMoreItem", false) : false)) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            List<ActionBarMenuItem> list = this.menuItemList;
            if (list != null && !list.isEmpty()) {
                for (ActionBarMenuItem actionBarMenuItem : this.menuItemList) {
                    MenuItem add3 = menu.add(actionBarMenuItem.title);
                    if (actionBarMenuItem.iconResId > 0) {
                        add3.setIcon(actionBarMenuItem.iconResId);
                    } else if (actionBarMenuItem.iconFontId > 0) {
                        add3.setTitle(getResources().getString(actionBarMenuItem.iconFontId) + ":" + actionBarMenuItem.title);
                    } else if (actionBarMenuItem.iconBitemap != null && !actionBarMenuItem.iconBitemap.isRecycled()) {
                        add3.setIcon(new BitmapDrawable(getResources(), actionBarMenuItem.iconBitemap));
                    }
                    add3.setIntent(actionBarMenuItem.data);
                    MenuItemCompat.setShowAsAction(add3, 8);
                    add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.browser.BrowserActivity.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            int i3 = -1;
                            if (menuItem.getIntent() != null) {
                                try {
                                    i3 = menuItem.getIntent().getIntExtra("index", -1);
                                } catch (Exception unused) {
                                }
                            }
                            if (i3 >= 0) {
                                try {
                                    jSONObject.put("index", i3);
                                } catch (JSONException unused2) {
                                }
                            }
                            if (BrowserActivity.access$800(BrowserActivity.this) != null) {
                                BrowserActivity.access$800(BrowserActivity.this).fireEvent("TBNaviBar.moreItem.clicked", jSONObject.toString());
                            }
                            return true;
                        }
                    });
                }
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (this.isaddDesktop) {
            if (StringUtils.isEmpty(this.shortcut_buttonText)) {
                this.shortcut_buttonText = "添加到桌面";
            }
            int i3 = R.id.browser_menu_desktop;
            MenuItemCompat.setShowAsAction(menu.add(0, i3, 0, getString(R.string.uik_icon_down_light) + ":" + this.shortcut_buttonText), 0);
        }
        if (b != null && b.has("WV.Meta.Favorite.Image") && !StringUtils.isEmpty(this.mFavorIcon)) {
            int i4 = R.id.browser_menu_favor;
            MenuItemCompat.setShowAsAction(menu.add(0, i4, 0, getString(R.string.uik_icon_favor_light) + ":" + this.mFavorText), 0);
        }
        if (this.hideUserHelperItem) {
            TBPublicMenu.removePublicMenu(R.id.uik_menu_service);
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.onCreateOptionsMenu end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.browser_menu_refresh) {
            TBProgressBar tBProgressBar = this.progressbar;
            if (tBProgressBar != null && (tBProgressBar.getProgress() == 100 || this.progressbar.getProgress() == 0)) {
                TBS.Adv.ctrlClickedOnPage(this.className, CT.Button, "RefreshWebView");
                BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
                if (browserHybridWebView2 != null) {
                    browserHybridWebView2.getWVCallBackContext().fireEvent("WV.Event.Page.Refresh");
                    this.browserWebView.reload();
                }
                return true;
            }
        } else if (itemId == R.id.browser_menu_order_detail) {
            Bundle bundle = new Bundle();
            bundle.putString(CoreConstants.IN_PARAM_BIZ_ORDER_ID, this.orderId);
            Nav.from(Globals.getApplication()).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_DETAIL);
            finish();
            return true;
        } else if (itemId == R.id.browser_menu_custom) {
            if (!StringUtils.isEmpty(this.mlinkonclick) && (browserHybridWebView = this.browserWebView) != null) {
                browserHybridWebView.loadUrl("javascript:" + this.mlinkonclick);
                return true;
            }
        } else if (itemId == R.id.browser_menu_right_item) {
            WVCallBackContext wVCallBackContext = this.wvContext;
            if (wVCallBackContext != null) {
                wVCallBackContext.fireEvent("TBNaviBar.rightItem.clicked", "{}");
            }
            return true;
        } else if (itemId == R.id.browser_menu_second_right_item) {
            WVCallBackContext wVCallBackContext2 = this.wvContext;
            if (wVCallBackContext2 != null) {
                wVCallBackContext2.fireEvent("TBNaviBar.secondRightItem.clicked", "{}");
            }
            return true;
        } else if (itemId == R.id.browser_menu_share) {
            showShareModule();
            return true;
        } else if (itemId == R.id.browser_menu_desktop) {
            BrowserUtil.a(this, this.shortcut_url, this.shortcut_title, this.shortcut_bitmap);
            return true;
        } else if (itemId == R.id.browser_menu_favor) {
            org.json.JSONObject b = android.taobao.windvane.webview.h.a().b();
            if (StringUtils.equals(tfu.FAVOR, this.mFavorIcon)) {
                int optInt = b.optInt("WV.Meta.Favorite.BizId", 11);
                String optString = b.optString("WV.Meta.Favorite.Url", this.mYyzUrl);
                String optString2 = b.optString("WV.Meta.Favorite.Title", this.browserWebView.getTitle());
                String optString3 = b.optString("WV.Meta.Favorite.Image");
                String optString4 = b.optString("WV.Meta.Favorite.Summary");
                m.b("Favorite", "bizId:" + optInt + " feedId:0 contentUrl:" + optString + " title:" + optString2 + " picUrl:" + optString3 + " summary:" + optString4 + " showToast:true");
                odv.a(this).a(optInt, 0L, optString, optString2, optString3, optString4, true, new FavContentCallBack(optString, FavType.AddFavorite));
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders.UTControlHitBuilder("Page_Webview", "Button-addfav").build());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (StringUtils.equals("favor_fill", this.mFavorIcon)) {
                int optInt2 = b.optInt("WV.Meta.Favorite.BizId", 11);
                String optString5 = b.optString("WV.Meta.Favorite.Url", this.mYyzUrl);
                m.b("Favorite", "bizId:" + optInt2 + " feedId:0 contentUrl:" + optString5 + " showToast:true");
                odv.a(this).a(optInt2, 0L, optString5, true, new FavContentCallBack(optString5, FavType.DeleteFavorite));
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders.UTControlHitBuilder("Page_Webview", "Button-cancelfav").build());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (Build.MANUFACTURER == null || !Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") || this.invalidateOnce) {
            return;
        }
        supportInvalidateOptionsMenu();
        this.invalidateOnce = true;
    }

    private void showFlowBar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e5f6d9", new Object[]{this, str});
            return;
        }
        FlowBar flowBar = new FlowBar(this);
        String init = flowBar.init(str);
        if (this.flowBarMap.containsKey(init)) {
            hiddenFlowBar(init);
        }
        RelativeLayout createLayout = flowBar.createLayout();
        ((ViewGroup) findViewById(16908290)).addView(createLayout);
        this.flowBarMap.put(init, createLayout);
    }

    private void hiddenFlowBar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6c6f4c", new Object[]{this, str});
            return;
        }
        RelativeLayout relativeLayout = this.flowBarMap.get(str);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        if (this.flowBarMap.containsKey(str)) {
            this.flowBarMap.remove(str);
        }
        if (relativeLayout == null || relativeLayout.getParent() == null) {
            return;
        }
        viewGroup.removeView(relativeLayout);
    }

    private void showTabBar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9ec", new Object[]{this, str});
        } else if (this.mTabBarLayout != null) {
        } else {
            TabBar tabBar = new TabBar(this);
            tabBar.init(str, this.wvContext);
            this.mTabBarLayout = tabBar.createLayout();
            ((ViewGroup) findViewById(16908290)).addView(this.mTabBarLayout);
        }
    }

    private void hiddenTabBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e4c30f", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        RelativeLayout relativeLayout = this.mTabBarLayout;
        if (relativeLayout == null || relativeLayout.getParent() == null) {
            return;
        }
        viewGroup.removeView(this.mTabBarLayout);
        this.mTabBarLayout = null;
    }

    private BitmapDrawable getIconFontDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("db44474b", new Object[]{this, new Integer(i)});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this);
        tIconFontTextView.setText(i);
        tIconFontTextView.setTextSize(24.0f);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        if (!StringUtils.isEmpty(this.useDounble11Style) && (this.useDounble11Style.equals("festivalWithRainbowLine") || this.useDounble11Style.equals("festival"))) {
            tIconFontTextView.setTextColor(FestivalMgr.a().a("actionbarTextColor", getResources().getColor(R.color.abc_title_color)));
        } else {
            tIconFontTextView.setTextColor(getResources().getColor(R.color.abc_title_color));
        }
        try {
            tIconFontTextView.setTypeface(Typeface.createFromAsset(getAssets(), "uik_iconfont.ttf"));
            return new BitmapDrawable(getResources(), BrowserUtil.a(tIconFontTextView));
        } catch (Throwable unused) {
            return new BitmapDrawable();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getUrlReferer(java.lang.String r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "weex_original_url"
            java.lang.String r1 = "BrowserActivity"
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.browser.BrowserActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L20
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r6
            r1 = 1
            r0[r1] = r7
            r7 = 2
            r0[r7] = r8
            java.lang.String r7 = "df2dbde"
            java.lang.Object r7 = r2.ipc$dispatch(r7, r0)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L20:
            java.lang.String r2 = "getUrlReferer"
            r3 = 0
            android.os.Bundle r4 = r8.getExtras()     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L57
            boolean r4 = r8.hasExtra(r0)     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L3f
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L59
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Exception -> L59
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = "bundle_has_weex_origin_url"
            com.taobao.browser.utils.BrowserUtil.a(r1, r2, r0, r8, r3)     // Catch: java.lang.Exception -> L5a
            goto L5f
        L3f:
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = "URL_REFERER_ORIGIN"
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Exception -> L59
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L59
            boolean r0 = android.text.StringUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5f
            java.lang.String r0 = "bundle_has_referer_origin_url"
            com.taobao.browser.utils.BrowserUtil.a(r1, r2, r0, r8, r3)     // Catch: java.lang.Exception -> L5a
            goto L5f
        L57:
            r8 = r3
            goto L5f
        L59:
            r8 = r3
        L5a:
            java.lang.String r0 = "error extras"
            com.taobao.tao.log.TLog.loge(r1, r0)
        L5f:
            if (r8 != 0) goto L62
            goto L63
        L62:
            r7 = r8
        L63:
            android.taobao.windvane.webview.k r8 = android.taobao.windvane.webview.j.a()
            if (r8 != 0) goto L71
            android.taobao.windvane.extra.WVSchemeProcessor r8 = new android.taobao.windvane.extra.WVSchemeProcessor
            r8.<init>()
            android.taobao.windvane.webview.j.a(r8)
        L71:
            java.lang.String r0 = r8.dealUrlScheme(r7)
            if (r7 == 0) goto L93
            boolean r3 = r7.equals(r0)
            if (r3 != 0) goto L93
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r0 == 0) goto L86
            r4 = r0
            goto L88
        L86:
            java.lang.String r4 = ""
        L88:
            java.lang.String r5 = "new_url"
            r3.put(r5, r4)
            java.lang.String r4 = "wvscheme_url_not_equal"
            com.taobao.browser.utils.BrowserUtil.a(r1, r2, r4, r7, r3)
        L93:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "intercepted by ["
            r2.append(r3)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r2.append(r8)
            java.lang.String r8 = "],origin_url=["
            r2.append(r8)
            r2.append(r7)
            java.lang.String r7 = "], new_url=["
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = "]"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.taobao.tao.log.TLog.loge(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.BrowserActivity.getUrlReferer(java.lang.String, android.content.Intent):java.lang.String");
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        if (this.browserWebView == null) {
            return null;
        }
        BrowserUtil.a(TAG, "pageUserInfo", "pageUserInfo", null, null);
        String data2H5 = this.browserWebView.getData2H5();
        Bundle bundle = new Bundle();
        if (StringUtils.isEmpty(data2H5)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", this.browserWebView.getUrl());
            bundle.putParcelable(hyt.ZZB_BUNDLE_KEY, bundle2);
        } else {
            bundle.putParcelable(hyt.ZZB_BUNDLE_KEY, BrowserUtil.c(data2H5));
        }
        return bundle;
    }

    private void setDounble11Style(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d57bad", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (!str.equals("festivalWithRainbowLine")) {
                if (!str.equals("festival")) {
                    resetStyle();
                    return;
                }
                z = false;
            }
            useDounble11Style(z);
        }
    }

    private void useDounble11Style(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bdf854c", new Object[]{this, new Boolean(z)});
        } else {
            FestivalMgr.a().a((Context) this, TBActionBar.ActionBarStyle.NORMAL, false);
        }
    }

    private void resetStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75beed29", new Object[]{this});
        } else {
            FestivalMgr.a().a((Context) this, TBActionBar.ActionBarStyle.NORMAL, true);
        }
    }

    private void getMetaInfo(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe96f9a", new Object[]{this, str});
            return;
        }
        String c = BrowserUtil.c();
        if (c == null) {
            return;
        }
        this.hideShareItem = BrowserUtil.b(str);
        final WeakReference weakReference = new WeakReference(this);
        this.browserWebView.evaluateJavascript("(function(){var e=document.getElementsByName('unique-bizid')[0];return (e&&e.getAttribute('content'))||''})()", new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                    return;
                }
                try {
                    if (StringUtils.isEmpty(str2)) {
                        return;
                    }
                    if (str2.startsWith("\"") && str2.endsWith("\"")) {
                        str2 = str2.substring(1, str2.length() - 1);
                    }
                    if (StringUtils.isEmpty(str2)) {
                        return;
                    }
                    com.taobao.browser.utils.e.b(str2, weakReference);
                    com.taobao.browser.utils.e.a(str2, weakReference);
                } catch (Exception e) {
                    m.e(BrowserActivity.TAG, "uniqueMeta parse error : " + e.getMessage());
                }
            }
        });
        this.browserWebView.evaluateJavascript(c, new ValueCallback<String>() { // from class: com.taobao.browser.BrowserActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                    return;
                }
                android.taobao.windvane.webview.h.a().a(str2);
                org.json.JSONObject b = android.taobao.windvane.webview.h.a().b();
                if (b == null) {
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("metaData", b.toString());
                    BrowserUtil.a(BrowserActivity.TAG, cjm.ZIM_IDENTIFY_GET_META_INFO, null, str, hashMap);
                } catch (Exception unused) {
                }
                boolean z2 = BrowserActivity.this.getSupportActionBar() != null && BrowserActivity.this.getSupportActionBar().f();
                if (b.has("WV.Meta.Nav.HideNavBar")) {
                    String optString = b.optString("WV.Meta.Nav.HideNavBar", "false");
                    if (!"true".equals(optString) && !"HideStatusBar".equals(optString)) {
                        z = false;
                    }
                    if (z && z2) {
                        BrowserActivity.this.getSupportActionBar().e();
                    } else if (!z2 && !z && BrowserActivity.this.getSupportActionBar() != null) {
                        BrowserActivity.this.getSupportActionBar().d();
                    }
                } else if (!z2 && BrowserActivity.access$900(BrowserActivity.this)) {
                    try {
                        Uri parse = Uri.parse(str);
                        if (parse != null && !BrowserUtil.e(parse) && BrowserActivity.this.getSupportActionBar() != null) {
                            BrowserActivity.this.getSupportActionBar().d();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                BrowserActivity.access$1002(BrowserActivity.this, tfu.FAVOR);
                BrowserActivity.access$1100(BrowserActivity.this, str);
                BrowserActivity.this.supportInvalidateOptionsMenu();
                if (b.has("WV.Meta.StopSaveImage") && "true".equalsIgnoreCase(b.optString("WV.Meta.StopSaveImage"))) {
                    if (BrowserActivity.access$400(BrowserActivity.this) == null) {
                        return;
                    }
                    BrowserActivity.access$400(BrowserActivity.this).setOnLongClickListener(null);
                    m.b(BrowserActivity.TAG, "StopSaveImage");
                    return;
                }
                try {
                    View.OnLongClickListener longClickListener = BrowserActivity.access$400(BrowserActivity.this).getLongClickListener();
                    if (BrowserActivity.access$400(BrowserActivity.this) == null) {
                        return;
                    }
                    BrowserActivity.access$400(BrowserActivity.this).setOnLongClickListener(longClickListener);
                    m.b(BrowserActivity.TAG, "reset SaveImage");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void checkFavoriteState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e58efe", new Object[]{this, str});
            return;
        }
        org.json.JSONObject b = android.taobao.windvane.webview.h.a().b();
        if (!Login.checkSessionValid() || !b.has("WV.Meta.Favorite.Image")) {
            m.b("Favorite", "未登录或者不包含Image Meta");
            this.mFavorIcon = tfu.FAVOR;
            return;
        }
        int optInt = b.optInt("WV.Meta.Favorite.BizId", 11);
        odv.a(this).b(optInt, 0L, str, true, new FavContentCallBack(str, FavType.IsFavorite));
        m.b("Favorite", "into--[checkFavoriteState] bizId:" + optInt + " feedId:0 contentUrl:" + str + " showToast:true");
    }

    private void showShareModule() {
        String url;
        String title;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55e1975", new Object[]{this});
            return;
        }
        ShareContent shareContent = new ShareContent();
        org.json.JSONObject b = android.taobao.windvane.webview.h.a().b();
        shareContent.businessId = "windvane";
        String str3 = "wxfriend,qq,contacts";
        String str4 = "";
        if (b != null) {
            String optString = b.optString("WV.Meta.Share.Title", str4);
            String optString2 = b.optString("WV.Meta.Share.Image", str4);
            url = b.optString("WV.Meta.Share.Url", this.browserWebView.getUrl());
            ActionBarMenuItem actionBarMenuItem = this.menuItemTitle;
            if (actionBarMenuItem != null && StringUtils.isEmpty(actionBarMenuItem.title)) {
                str = b.optString("WV.Meta.Share.Text", this.menuItemTitle.title);
            } else {
                str = b.optString("WV.Meta.Share.Text", this.browserWebView.getTitle());
            }
            str3 = b.optString("WV.Meta.Share.Targets", str3);
            shareContent.businessId = b.optString("WV.Meta.Share.BizId", "windvane");
            str2 = optString2;
            str4 = optString;
        } else {
            url = this.browserWebView.getUrl();
            ActionBarMenuItem actionBarMenuItem2 = this.menuItemTitle;
            if (actionBarMenuItem2 != null && StringUtils.isEmpty(actionBarMenuItem2.title)) {
                title = this.menuItemTitle.title;
            } else {
                title = this.browserWebView.getTitle();
            }
            str = title;
            str2 = str4;
        }
        if (StringUtils.isEmpty(str)) {
            str = "我分享给你了一个淘宝页面，快来看看吧";
        }
        shareContent.title = str4;
        shareContent.imageUrl = str2;
        shareContent.url = url;
        shareContent.description = str;
        if (str3.equals("all")) {
            ShareBusiness.share(this, shareContent);
            return;
        }
        String[] split = str3.split(",");
        if (split == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str5 : split) {
            arrayList.add(str5);
        }
        ShareBusiness.share(this, arrayList, shareContent);
    }

    public String getAllowOpenClientFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a68d0745", new Object[]{this}) : OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_ALLOW_OPEN_CLIENT, "0");
    }

    public String getQuitWebViewDirectlyList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4481f51", new Object[]{this}) : OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_QUIT_WEBVIEW_DIRECTLY_LIST, "");
    }

    public String getNoMetaPageList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a6ac450", new Object[]{this}) : OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_NO_META_PAGE_LIST, "");
    }

    public String getThirdMiddleJumpRegex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9c7a226", new Object[]{this}) : OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_THIRD_MIDDLE_JUMP_REGEX, "");
    }

    private void updateOrangeConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d54a1", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_ALLOW_OPEN_CLIENT, "0");
        OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_QUIT_WEBVIEW_DIRECTLY_LIST, "");
        OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_NO_META_PAGE_LIST, "");
        OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_THIRD_MIDDLE_JUMP_REGEX, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class FavContentCallBack implements IFavContentCallBack {
        private String b;
        private FavType c;

        static {
            kge.a(980478410);
            kge.a(81551680);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        public FavContentCallBack(String str, FavType favType) {
            this.b = str;
            this.c = favType;
        }

        @Override // com.taobao.tao.favorite.aidl.IFavContentCallBack
        public void onResult(Map map) throws RemoteException {
            m.e("Favorite", "into--[onResult] map:" + map.toString());
            if (StringUtils.equals((String) map.get("com.taobao.tao.mytaobao.favContent.contentUrl"), this.b)) {
                int i = AnonymousClass13.f16736a[this.c.ordinal()];
                String str = "取消收藏";
                String str2 = "favor_fill_light";
                if (i == 1) {
                    boolean equals = StringUtils.equals((CharSequence) map.get("com.taobao.tao.mytaobao.favContent.result"), "success");
                    BrowserActivity browserActivity = BrowserActivity.this;
                    if (!equals) {
                        str2 = "favor_light";
                    }
                    BrowserActivity.access$1002(browserActivity, str2);
                    BrowserActivity browserActivity2 = BrowserActivity.this;
                    if (!equals) {
                        str = "收藏";
                    }
                    BrowserActivity.access$1202(browserActivity2, str);
                } else if (i == 2) {
                    boolean equals2 = StringUtils.equals((CharSequence) map.get("com.taobao.tao.mytaobao.favContent.result"), "success");
                    BrowserActivity browserActivity3 = BrowserActivity.this;
                    if (equals2) {
                        str2 = "favor_light";
                    }
                    BrowserActivity.access$1002(browserActivity3, str2);
                    BrowserActivity browserActivity4 = BrowserActivity.this;
                    if (equals2) {
                        str = "收藏";
                    }
                    BrowserActivity.access$1202(browserActivity4, str);
                } else if (i == 3) {
                    boolean z = false;
                    if (StringUtils.equals((CharSequence) map.get("com.taobao.tao.mytaobao.favContent.result"), "success") && ((String) map.get("com.taobao.tao.mytaobao.favContent.data")).equals("true")) {
                        z = true;
                    }
                    BrowserActivity browserActivity5 = BrowserActivity.this;
                    if (!z) {
                        str2 = "favor_light";
                    }
                    BrowserActivity.access$1002(browserActivity5, str2);
                    BrowserActivity browserActivity6 = BrowserActivity.this;
                    if (!z) {
                        str = "收藏";
                    }
                    BrowserActivity.access$1202(browserActivity6, str);
                }
                BrowserActivity.this.supportInvalidateOptionsMenu();
            }
        }
    }

    public void enableH5Progress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7778e04", new Object[]{this});
            return;
        }
        this.progressbar = (TBProgressBar) findViewById(R.id.uik_page_progressbar);
        if (this.progressbar != null) {
            TLog.loge(TAG, "progress bar has a parent already.");
            return;
        }
        this.progressbar = new TBProgressBar(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(16908290);
        if (frameLayout == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            layoutParams.height = (int) (displayMetrics.density * 1.0f);
        }
        layoutParams.gravity = 48;
        this.progressbar.setId(R.id.uik_page_progressbar);
        frameLayout.addView(this.progressbar, layoutParams);
        this.progressbar.setCurrentProgress(0);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (!disableTransition()) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    private boolean disableTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96d9f868", new Object[]{this})).booleanValue();
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        return (browserHybridWebView == null || browserHybridWebView.getCurrentUrl() == null || !this.browserWebView.getCurrentUrl().contains(nextPageAnimationParam)) ? false : true;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        try {
            if (this.browserWebView == null) {
                return;
            }
            this.browserWebView.onRequestPermissionsResult(i, strArr, iArr);
        } catch (Throwable th) {
            m.e(TAG, th.toString());
            th.printStackTrace();
        }
    }
}
