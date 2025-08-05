package com.taobao.browser.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.taobao.util.i;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.n;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import android.taobao.windvane.webview.h;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver;
import com.taobao.browser.jsbridge.JsApiManager;
import com.taobao.browser.jsbridge.ui.ActionBarMenuItem;
import com.taobao.browser.nav.b;
import com.taobao.browser.prefetch.a;
import com.taobao.browser.urlFilter.BrowserUrlFilter;
import com.taobao.browser.urlFilter.UrlpreLoadFilter;
import com.taobao.browser.ut.FragmentWVUserTrack;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.f;
import com.taobao.browser.utils.k;
import com.taobao.browser.utils.l;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.StringUtil;
import com.taobao.tao.util.UrlFormator;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.ut.mini.UTAnalytics;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aei;
import tb.aem;
import tb.alj;
import tb.ept;
import tb.guc;
import tb.kev;
import tb.kez;
import tb.kfb;
import tb.kfc;
import tb.kge;
import tb.mbn;
import tb.riy;

/* loaded from: classes6.dex */
public class BrowserFragment extends SupportSecondaryBaseFragment implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_SAVE_FORMAT_DATA = "SAVE_FORMAT_DATA";
    public static final String KEY_IMAGE_LIST = "imagelist";
    private static final String MONITOR_POINT_AFC_NAV_FAIL = "afcNavFail";
    private static final String MONITOR_POINT_TIME_OUT_GO_TO_HOME = "timeoutGoToHome";
    private static final int MSG_FINISH = 900;
    public static final int MYTAOBAO_BIND_CARD = 1001;
    public static final int MYTAOXIAOPU_BIND_CARD = 1003;
    private static String TAG = null;
    private static final String TAG_FAV = "Favorite";
    private static final String URI_HOMEPAGE = "http://m.taobao.com/index.htm";
    private static int browserActivityID;
    private static String mUTPageName;
    private BrowserHybridWebView browserWebView;
    private long creatActivityTimeStamp;
    private BrowserUrlFilter filter;
    private boolean isBkpg;
    public i mHandle;
    private SurfaceView mSurfaceView;
    private String mYyzUrl;
    private String orderId;
    public String url;
    private WVCallBackContext wvContext;
    private TBProgressBar progressbar = null;
    private HashMap<String, RelativeLayout> flowBarMap = new HashMap<>();
    private RelativeLayout mTabBarLayout = null;
    private boolean mAppLinkIsNewIntent = false;
    private boolean mAutoShowNavbar = true;
    private boolean saveFormatData = true;
    private boolean invalidateOnce = false;
    private boolean isRefundOrderUrl = false;
    private boolean isaddDesktop = false;
    private boolean isHookNativeBackByJs = false;
    private boolean isHookNativeBack = false;
    private boolean isAutoResetMenu = true;
    private boolean readTitle = true;
    private boolean alloweWebViewHistoryBack = true;
    private String mlinkhref = null;
    private String mlinkonclick = null;
    private Bitmap bitmap = null;
    private String shortcut_title = null;
    private String shortcut_icon = null;
    private String shortcut_url = null;
    private String shortcut_buttonText = null;
    private Bitmap shortcut_bitmap = null;
    private String mFavorIcon = null;
    private String mFavorText = "收藏";
    private ActionBarMenuItem menuItemRight = null;
    private ActionBarMenuItem menuItemSecondRight = null;
    private ActionBarMenuItem menuItemTitle = null;
    private List<ActionBarMenuItem> menuItemList = null;
    private String className = BrowserActivity.class.getName();
    public boolean forceWebView = false;
    private boolean hasCustomButton = false;
    private boolean hideUserHelperItem = false;
    private boolean hideShareItem = false;
    private String useDounble11Style = "festivalWithRainbowLine";
    private boolean mHasCollectData = false;
    public boolean enableUCVisibility = true;
    private String noMetaPageList = "";
    private String quitWebViewDirectlyUrls = "";
    private boolean statusImmersive = false;
    private String mActivityHashCode = "";

    public static void hideLoadingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395c4f09", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(BrowserFragment browserFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -512593800:
                return super.getContext();
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "BrowserFragment";
    }

    public static /* synthetic */ BrowserHybridWebView access$000(BrowserFragment browserFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BrowserHybridWebView) ipChange.ipc$dispatch("f4580d9", new Object[]{browserFragment}) : browserFragment.browserWebView;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    public static /* synthetic */ boolean access$202(BrowserFragment browserFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("516507e5", new Object[]{browserFragment, new Boolean(z)})).booleanValue();
        }
        browserFragment.isHookNativeBackByJs = z;
        return z;
    }

    static {
        kge.a(1973754611);
        kge.a(-1043440182);
        TAG = BrowserFragment.class.getSimpleName();
        browserActivityID = 0;
        mUTPageName = "BrowserFragment";
    }

    @Deprecated
    public BrowserFragment() {
        m.e(TAG, "BrowserFragment()");
    }

    public Intent getOriginIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("56cdf9d4", new Object[]{this});
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        return (Intent) arguments.getParcelable("originActivityIntent");
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        if (!BrowserUtil.b(getActivityOrContext())) {
            return;
        }
        Toast.makeText(getActivityOrContext(), "BrowserFragment!", 0).show();
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView == null || !browserHybridWebView.canGoBack()) {
            return false;
        }
        this.browserWebView.goBack();
        return true;
    }

    public i getHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("f2ff20af", new Object[]{this}) : this.mHandle;
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

    private void finishSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75de7b86", new Object[]{this});
        } else if (onBackPressed()) {
        } else {
            finish();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        b.a();
        super.onCreate(bundle);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        Bundle bundle3;
        boolean z5;
        Uri parse;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        long currentTimeMillis = System.currentTimeMillis();
        g b = s.f18233a.b(this);
        b.a("containerInit");
        kfc.a("exchain.FullTrace", "BrowserActivity.onCreate start time: " + currentTimeMillis);
        updateID();
        e.a(RVLLevel.Error, "BrowserFragment").a("H5_initContainer", getID()).a(currentTimeMillis).a();
        a.a().a(getClass().getName());
        kez.a();
        com.taobao.browser.config.a.a().b();
        Intent originIntent = getOriginIntent();
        String dataString = originIntent.getDataString();
        String str = TAG;
        m.e(str, "mUrl=" + dataString);
        android.taobao.windvane.monitor.a.commitFail("BrowserFragment", 1, ept.SUB_CREATE_VIEW, dataString);
        if (TextUtils.isEmpty(dataString)) {
            super.onCreate(bundle);
            m.e(TAG, "originalurl is null, finishSelf");
            finishSelf();
            return null;
        }
        String trim = dataString.trim();
        this.url = trim;
        String urlReferer = getUrlReferer(trim, originIntent);
        if (urlReferer != null) {
            trim = urlReferer;
        }
        Uri parse2 = Uri.parse(trim);
        if (!n.a().d()) {
            kez.a();
            n.a().c();
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.dealURL cost time: " + (System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            bundle2 = originIntent.getExtras();
        } catch (Exception unused) {
            m.e(TAG, "fail to get intent extras");
            bundle2 = null;
        }
        if (bundle2 != null) {
            z2 = bundle2.getBoolean(Constants.MYBROWSERHIDETITLE, false);
            this.isRefundOrderUrl = bundle2.getBoolean("is_refund_order_url", false);
            this.orderId = bundle2.getString(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
            this.alloweWebViewHistoryBack = bundle2.getBoolean("alloweWebViewHistoryBack", true);
            this.saveFormatData = bundle2.getBoolean("SAVE_FORMAT_DATA", true);
            z = bundle2.getBoolean("isPostUrl", false);
        } else {
            z = false;
            z2 = false;
        }
        if (parse2 != null && parse2.isHierarchical()) {
            if (!z2) {
                BrowserUtil.e(parse2);
            }
            String queryParameter2 = parse2.getQueryParameter("hasCustomButton");
            if (queryParameter2 != null && "true".equals(queryParameter2.trim())) {
                this.hasCustomButton = true;
            }
            this.statusImmersive = parse2.getBooleanQueryParameter("status_bar_transparent", false);
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.dealBundle cost time: " + (System.currentTimeMillis() - currentTimeMillis2));
        long currentTimeMillis3 = System.currentTimeMillis();
        kez.a();
        super.onCreate(bundle);
        kfc.a("exchain.FullTrace", "BrowserActivity.superOnCreate cost time: " + (System.currentTimeMillis() - currentTimeMillis3));
        long currentTimeMillis4 = System.currentTimeMillis();
        kfc.a("exchain.FullTrace", "BrowserActivity.ObtainOrange cost time: " + (System.currentTimeMillis() - currentTimeMillis4));
        kez.a();
        long currentTimeMillis5 = System.currentTimeMillis();
        kfc.a("exchain.FullTrace", "BrowserActivity.InflateLayout cost time: " + (System.currentTimeMillis() - currentTimeMillis5));
        long currentTimeMillis6 = System.currentTimeMillis();
        this.mHandle = new i(getActivity(), this);
        boolean z6 = j.commonConfig.o;
        if (BrowserUtil.b(parse2)) {
            android.taobao.windvane.monitor.a.commitFail("wvUseSysWebView", 1, "wvUseSysWebView", trim);
            z3 = true;
        } else {
            z3 = z6;
        }
        WVUCWebView.setUseSystemWebView(z3);
        if (trim.contains("waitUCPrepared=true")) {
            bundle3 = bundle2;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            z4 = z;
            aem.a().a(new aei() { // from class: com.taobao.browser.fragment.BrowserFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                    if (str2.hashCode() == 90991720) {
                        super.a();
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
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
            if (!z3 && WVUCWebView.getCoreType() != 3) {
                m.c("WVUCWebView", "need wait");
                j = currentTimeMillis;
                try {
                    countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                j = currentTimeMillis;
                m.c("WVUCWebView", "need not wait");
            }
        } else {
            j = currentTimeMillis;
            z4 = z;
            bundle3 = bundle2;
        }
        kfc.a("exchain.FullTrace", "init webveiw start: " + currentTimeMillis6);
        e.a(RVLLevel.Error, "BrowserFragment").a("H5_initWebview", getID()).a(currentTimeMillis6).a();
        kez.a();
        TLog.logi("WVUCWebView", "use uc core = [" + WVCore.getInstance().isUCSupport() + riy.ARRAY_END_STR);
        b.e("containerInit", null);
        b.a("webviewInit");
        if (WVCore.getInstance().isUCSupport()) {
            try {
                this.browserWebView = com.taobao.browser.g.a().getPreRender(trim, getActivity());
            } catch (Throwable unused2) {
            }
            if (this.browserWebView == null) {
                if (!z3) {
                    this.browserWebView = com.taobao.browser.g.a().getPreWeb();
                    com.taobao.browser.g.a();
                    com.taobao.browser.g.a(getActivity());
                    m.e(com.taobao.browser.g.TAG, "getPreRender by key=[" + trim + "] failed");
                }
                z5 = false;
            } else {
                m.e(com.taobao.browser.g.TAG, "getPreRender by key=[" + trim + "] success");
                z5 = true;
            }
            if (!com.taobao.browser.ipc.a.a(getContext())) {
                WVUCWebView.setBizCode(com.taobao.browser.utils.i.WINDVANE_MULTI_BIZ_ID);
                BrowserUtil.a(TAG, "onCreateView", "set_multi_biz", this.url, null);
            } else if (originIntent.hasExtra("BizId")) {
                try {
                    WVUCWebView.setBizCode(originIntent.getStringExtra("BizId"));
                } catch (Exception e2) {
                    m.e(TAG, e2.getMessage());
                }
            }
        } else {
            z5 = false;
        }
        if (this.browserWebView != null) {
            m.e(com.taobao.browser.g.TAG, "browserWebView != null");
            this.browserWebView.setOuterContext(getActivity());
            if (!z5) {
                this.browserWebView.init();
                com.taobao.browser.g.a().clear();
            }
        } else {
            m.e(com.taobao.browser.g.TAG, "new BrowserHybridWebView");
            this.browserWebView = new BrowserHybridWebView(getActivity());
        }
        FragmentWVUserTrack fragmentWVUserTrack = new FragmentWVUserTrack();
        fragmentWVUserTrack.initialize(getActivityOrContext(), this.browserWebView);
        this.browserWebView.addJsObject("WVTBUserTrack", fragmentWVUserTrack);
        b.e("webviewInit", null);
        b.a("jsBridgeInit");
        e.a(RVLLevel.Error, "BrowserFragment").a("H5_initJsBridge", getID()).a(System.currentTimeMillis()).a();
        if (getActivity() != null) {
            this.mActivityHashCode = BrowserUtil.a((Activity) getActivity());
        }
        this.browserWebView.setStatusBarImmersive(this.statusImmersive);
        this.browserWebView.pageTracker.creatActivity(this.creatActivityTimeStamp);
        kfc.a("exchain.FullTrace", "init webveiw end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis6));
        long currentTimeMillis7 = System.currentTimeMillis();
        if (getActivity() != null) {
            if (WVCore.getInstance().isUCSupport()) {
                getActivity().getWindow().setSoftInputMode(34);
            } else {
                getActivity().getWindow().setSoftInputMode(18);
            }
        }
        this.browserWebView.setOutHandler(this.mHandle);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("url", trim);
        if (!originIntent.hasCategory(mbn.BROWSER_ONLY_CATEGORY) && com.taobao.browser.utils.e.a(getActivity(), parse2)) {
            alj.a().a("afc", hashMap);
            finishSelf();
            kfc.a("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
            kez.a();
            return null;
        }
        l.a(getActivity(), this.className, trim, originIntent);
        kfc.a("exchain.FullTrace", "BrowserActivity.[webview-initjsapi] cost time: " + (System.currentTimeMillis() - currentTimeMillis7));
        long currentTimeMillis8 = System.currentTimeMillis();
        JsApiManager.initJsApi(getActivity(), this.browserWebView);
        kfc.a("exchain.FullTrace", "BrowserActivity.InitJsApi cost time: " + (System.currentTimeMillis() - currentTimeMillis8));
        long currentTimeMillis9 = System.currentTimeMillis();
        b.e("jsBridgeInit", null);
        b.a("filtrate");
        e.a(RVLLevel.Error, "BrowserFragment").a("H5_filtrate", getID()).a(System.currentTimeMillis()).a();
        this.filter = new BrowserUrlFilter(getActivity(), this.mHandle, this.browserWebView);
        this.browserWebView.setFilter(this.filter);
        if (z4) {
            String string = bundle3.getString("postdata");
            try {
                new String(string.getBytes(), "UTF-8");
                this.browserWebView.postUrl(trim, string.getBytes());
            } catch (Exception unused3) {
            }
            String str2 = TAG;
            m.d(str2, "post Url originalurl is  " + trim + MspWebActivity.POSTDATA + string);
            return null;
        }
        if (parse2.isHierarchical() && (queryParameter = parse2.getQueryParameter("forceAllH5")) != null && "true".equals(queryParameter.trim())) {
            this.forceWebView = true;
        }
        this.filter.setForceWebView(this.forceWebView);
        kfc.a("exchain.FullTrace", "BrowserActivity.[wopc-preloadurl] cost time: " + (System.currentTimeMillis() - currentTimeMillis9));
        long currentTimeMillis10 = System.currentTimeMillis();
        UrlpreLoadFilter urlpreLoadFilter = new UrlpreLoadFilter(getContext(), getOriginIntent(), this.mHandle, this.browserWebView);
        String preloadURL = urlpreLoadFilter.preloadURL(trim, originIntent);
        kfc.a("exchain.FullTrace", "BrowserActivity.UrlpreLoadFilter.preloadURL cost time: " + (System.currentTimeMillis() - currentTimeMillis10));
        String str3 = TAG;
        TLog.loge(str3, "preloadUrl before_url=[" + trim + "], new_url = [" + preloadURL + riy.ARRAY_END_STR);
        if (preloadURL == null) {
            this.browserWebView.loadUrl(trim);
            if (o.getWvPerformanceMonitorInterface() != null) {
                o.getWvPerformanceMonitorInterface().recordDeviceCreateTime(trim, System.currentTimeMillis() - j);
            }
            m.d(TAG, "UrlpreLoadFilter result is null, and call superLoadUrl.");
            return null;
        }
        long currentTimeMillis11 = System.currentTimeMillis();
        if (urlpreLoadFilter.basefiltrate(preloadURL)) {
            alj.a().a("afc", hashMap);
            if (!preloadURL.contains("hybrid=true")) {
                finishSelf();
            }
            kfc.a("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
            kez.a();
            return null;
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.UrlpreLoadFilter.baseFilterate cost time: " + (System.currentTimeMillis() - currentTimeMillis11));
        long currentTimeMillis12 = System.currentTimeMillis();
        if (urlpreLoadFilter.filtrate(preloadURL)) {
            alj.a().a("afc", hashMap);
            finishSelf();
            kfc.a("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
            kez.a();
            return null;
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.UrlpreLoadFilter.filtrate cost time: " + (System.currentTimeMillis() - currentTimeMillis12));
        long currentTimeMillis13 = System.currentTimeMillis();
        Uri.parse(preloadURL);
        new Bundle().putBoolean("from_browser", true);
        if (!StringUtil.isEmpty(preloadURL) && (parse = Uri.parse(preloadURL)) != null && parse.isHierarchical()) {
            String queryParameter3 = parse.getQueryParameter("clickid");
            if (!StringUtil.isEmpty(queryParameter3)) {
                this.filter.setFilterClickId(queryParameter3);
            }
        }
        h.a().a(new String[]{"WV.Meta.Share.Title", "WV.Meta.Share.Url", "WV.Meta.Share.Image", "WV.Meta.Share.Text", "WV.Meta.Share.Disabled", "WV.Meta.Share.Targets", "WV.Meta.Share.BizId", "WV.Meta.Nav.HideMoreItem", "WV.Meta.Nav.HideNavBar", "WV.Meta.DisableRefresh", "WV.Meta.Favorite.BizId", "WV.Meta.Favorite.FeedId", "WV.Meta.Favorite.Title", "WV.Meta.Favorite.Image", "WV.Meta.Favorite.Summary", "WV.Meta.Favorite.Url", "WV.Meta.StopSaveImage"});
        try {
            kev.wv_currentStatus = "2";
        } catch (Throwable unused4) {
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.[urlfilter-loadurl] cost time: " + (System.currentTimeMillis() - currentTimeMillis13));
        String str4 = TAG;
        TLog.loge(str4, "load url = [" + preloadURL + riy.ARRAY_END_STR);
        System.currentTimeMillis();
        b.e("filtrate", null);
        if (!z5) {
            e.a(RVLLevel.Error, "BrowserFragment").a("H5_loadUrl", getID()).a("url", (Object) trim).a(System.currentTimeMillis()).a();
            this.browserWebView.loadUrl(preloadURL);
            this.browserWebView.wpData.timeLoadurl = System.currentTimeMillis();
        }
        long currentTimeMillis14 = System.currentTimeMillis();
        if (o.getWvPerformanceMonitorInterface() != null) {
            o.getWvPerformanceMonitorInterface().recordDeviceCreateTime(preloadURL, currentTimeMillis14 - j);
        }
        this.browserWebView.setSafeFormatData(this.saveFormatData);
        if (!guc.a(getActivityOrContext(), "enableMultiExecutor")) {
            BrowserUtil.a(getActivityOrContext(), this.browserWebView);
            LoginBroadcastReceiver.a(getActivity(), this.browserWebView, null, 101);
        } else {
            com.taobao.browser.a.a().a(new Runnable() { // from class: com.taobao.browser.fragment.BrowserFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BrowserUtil.a(BrowserFragment.this.getActivityOrContext(), BrowserFragment.access$000(BrowserFragment.this));
                    LoginBroadcastReceiver.a(BrowserFragment.this.getActivity(), BrowserFragment.access$000(BrowserFragment.this), null, 101);
                }
            });
        }
        if (getActivity() != null) {
            Intent intent = getActivity().getIntent();
            intent.putExtra("ActivityName", "BrowserActivity:" + p.d(preloadURL));
        }
        this.useDounble11Style = f.a("android_windvane_config", "defaultFestivalStyle", "festivalWithRainbowLine");
        kfc.a("exchain.FullTrace", "BrowserActivity.[loadurl-end] cost time: " + (System.currentTimeMillis() - currentTimeMillis14));
        kfc.a("exchain.FullTrace", "BrowserActivity.onCreate end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - j));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stageName", "onCreage");
            jSONObject.put("beginTime", j);
            jSONObject.put("endTime", System.currentTimeMillis());
            jSONObject.put("thread", Thread.currentThread().getName());
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        a.a().a(jSONObject);
        kez.a();
        long j2 = 0;
        long longValue = (originIntent == null || originIntent.getExtras() == null || !originIntent.getExtras().containsKey("NAV_START_ACTIVITY_TIME")) ? 0L : ((Long) originIntent.getExtras().get("NAV_START_ACTIVITY_TIME")).longValue();
        if (longValue > 0) {
            j2 = System.currentTimeMillis() - longValue;
        }
        try {
            b.a("H5_BrowserFragment", (Object) true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str5 = TAG;
        Log.e(str5, "Create cost time : " + j2);
        return this.browserWebView;
    }

    public void doOnResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5514b59e", new Object[]{this});
            return;
        }
        this.enableUCVisibility = TextUtils.equals("true", OrangeConfig.getInstance().getConfig("group_common_browser", com.taobao.browser.utils.i.KEY_ORANGE_CONFIG_ENABLE_UC_VISIBILITY, "false"));
        long currentTimeMillis = System.currentTimeMillis();
        super.onResume();
        m.b(TAG, "onResume.");
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !TextUtils.isEmpty(browserHybridWebView.getCurrentUrl())) {
            Properties properties = new Properties();
            properties.put("url", this.browserWebView.getCurrentUrl());
            TBS.EasyTrace.updateEasyTraceActivityProperties(getActivity(), properties);
        }
        kfc.a("exchain.FullTrace", "BrowserActivity.onResume after supper: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        i iVar = this.mHandle;
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
        BrowserUtil.a(getActivityOrContext(), this.browserWebView);
        kfc.a("exchain.FullTrace", "BrowserActivity.onResume end: " + System.currentTimeMillis() + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        BrowserHybridWebView browserHybridWebView3 = this.browserWebView;
        if (browserHybridWebView3 != null && browserHybridWebView3.getUTPageName() != null) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), this.browserWebView.getUTPageName());
        }
        BrowserHybridWebView browserHybridWebView4 = this.browserWebView;
        if (browserHybridWebView4 == null || browserHybridWebView4.getUTParamMap() == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), this.browserWebView.getUTParamMap());
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
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

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
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
        LoginBroadcastReceiver.a(getActivity());
        m.b(TAG, "onDestroy.");
        if (this.mSurfaceView != null) {
            this.mSurfaceView = null;
        }
        TBProgressBar tBProgressBar = this.progressbar;
        if (tBProgressBar != null) {
            if (tBProgressBar.getParent() != null && (this.progressbar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.progressbar.getParent()).removeView(this.progressbar);
            }
            this.progressbar = null;
        }
        i iVar = this.mHandle;
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
            browserHybridWebView2.hideErrorPage();
            this.browserWebView.setFilter(null);
            this.browserWebView.setOutHandler(null);
            this.browserWebView.setVisibility(8);
            this.browserWebView.removeAllViews();
            this.browserWebView.coreDestroy();
            this.browserWebView = null;
        }
        this.isHookNativeBack = false;
        try {
            kev.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        b.b();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!shouldDoOnResume()) {
            m.e(TAG, "into not shouldDoOnResume");
            super.onResume();
        } else {
            m.e(TAG, "into onResume");
            doOnResume();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (!shouldDoOnPause()) {
            m.e(TAG, "into not shouldDoOnPause");
            super.onPause();
        } else {
            m.e(TAG, "into onPause");
            doOnPause();
        }
    }

    public void doOnPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1426e2d3", new Object[]{this});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null) {
            browserHybridWebView.pause();
            i iVar = this.mHandle;
            if (iVar == null) {
                return;
            }
            iVar.postDelayed(new Runnable() { // from class: com.taobao.browser.fragment.BrowserFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BrowserFragment.access$000(BrowserFragment.this).evaluateJavascript("(function() { return (!!document.body.innerHTML);})()", new ValueCallback<String>() { // from class: com.taobao.browser.fragment.BrowserFragment.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("138ac29e", new Object[]{this, str});
                                } else if (BrowserFragment.this.mHandle == null) {
                                } else {
                                    if (BrowserFragment.this.mHandle.hasMessages(1105)) {
                                        BrowserFragment.this.mHandle.removeMessages(1105);
                                    }
                                    if (!"false".equalsIgnoreCase(str)) {
                                        return;
                                    }
                                    Message obtain = Message.obtain();
                                    obtain.what = 1105;
                                    BrowserFragment.this.mHandle.dispatchMessage(obtain);
                                }
                            }
                        });
                    } catch (Exception unused) {
                    }
                }
            }, 3000L);
        }
        m.b(TAG, "onPause.");
        kfb.a().a(this.mActivityHashCode, this.browserWebView.getOriginalUrl(), false);
        try {
            kev.wv_currentStatus = "1";
        } catch (Throwable unused) {
        }
        super.onPause();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 59:
                AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.HANDLER_WHAT_FILTERURLSID", 1.0d);
                this.browserWebView.loadUrl((String) message.obj);
                break;
            case 88:
                getOriginIntent().putExtra("data", (String) message.obj);
                if (!this.browserWebView.back()) {
                    finishSelf();
                    break;
                }
                break;
            case 136:
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj)));
                    break;
                } catch (ActivityNotFoundException unused) {
                    Toast makeText = Toast.makeText(getActivityOrContext(), "对不起，您的设备找不到相应程序", 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                    break;
                }
            case 400:
                kfc.a("exchain.FullTrace", "BrowserActivity.NOTIFY_PAGE_START: " + System.currentTimeMillis());
                TBProgressBar tBProgressBar = this.progressbar;
                if (tBProgressBar != null) {
                    tBProgressBar.resetProgress();
                }
                h.a().c();
                break;
            case 401:
                this.mYyzUrl = (String) message.obj;
                FragmentActivity activity = getActivity();
                String str = this.className;
                String str2 = this.mYyzUrl;
                l.a(activity, str, str2, str2);
                TBProgressBar tBProgressBar2 = this.progressbar;
                if (tBProgressBar2 != null) {
                    tBProgressBar2.setCurrentProgress(100);
                }
                getMetaInfo(this.mYyzUrl);
                Intent originIntent = getOriginIntent();
                originIntent.putExtra("ActivityName", "BrowserActivity:" + p.d(this.mYyzUrl));
                break;
            case 402:
                TBProgressBar tBProgressBar3 = this.progressbar;
                if (tBProgressBar3 != null) {
                    tBProgressBar3.setCurrentProgress(100);
                    break;
                }
                break;
            case 900:
                finishSelf();
                break;
            case 1001:
                AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOBAO_BIND_CARD", 1.0d);
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.mytaobao.bindcard");
                intent.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
                intent.setPackage("com.taobao.taobao");
                Bundle bundle = new Bundle();
                try {
                    JSONObject jSONObject = new JSONObject(message.getData().getString("data"));
                    bundle.putInt("fromSource", Integer.valueOf(jSONObject.getString("fromSource")).intValue());
                    bundle.putBoolean("bind_card_switch", jSONObject.getBoolean("bind_card_switch"));
                    bundle.putString("user_id", jSONObject.getString("user_id"));
                } catch (Exception unused2) {
                }
                intent.putExtras(bundle);
                try {
                    startActivityForResult(intent, 1001);
                    break;
                } catch (Exception e) {
                    String str3 = TAG;
                    m.c(str3, "start BindCardActivity failed: " + e.toString());
                    break;
                }
            case 1003:
                AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "BrowserActivity.handleMessage.MYTAOIAOPU_BIND_CARD", 1.0d);
                Intent intent2 = new Intent();
                intent2.setAction("com.taobao.tao.mytaobao.bindcard");
                intent2.setData(Uri.parse("http://m.taobao.com/go/goAlipayBindCard.htm"));
                Bundle bundle2 = new Bundle();
                try {
                    JSONObject jSONObject2 = new JSONObject(message.getData().getString("data"));
                    bundle2.putInt("fromSource", Integer.valueOf(jSONObject2.getString("fromSource")).intValue());
                    bundle2.putBoolean("bind_card_switch", jSONObject2.getBoolean("bind_card_switch"));
                    bundle2.putString("user_id", jSONObject2.getString("user_id"));
                    bundle2.putString("tb_user_id", jSONObject2.getString("tb_user_id"));
                } catch (Exception unused3) {
                }
                intent2.putExtras(bundle2);
                try {
                    startActivityForResult(intent2, 1003);
                    break;
                } catch (Exception e2) {
                    String str4 = TAG;
                    m.c(str4, "start BindCardActivity failed: " + e2.toString());
                    break;
                }
            case 1102:
                if (getOriginIntent().hasExtra("isfrompushMsg")) {
                    Nav.from(getActivityOrContext()).toUri("http://m.taobao.com/index.htm");
                    break;
                } else {
                    finishSelf();
                    break;
                }
            case 1103:
                BrowserHybridWebView browserHybridWebView2 = this.browserWebView;
                if (browserHybridWebView2 != null && this.hasCustomButton) {
                    browserHybridWebView2.loadUrl(com.taobao.browser.utils.i.f16846a);
                }
                BrowserUtil.a(getActivityOrContext(), this.browserWebView);
                this.noMetaPageList = getNoMetaPageList();
                if (!TextUtils.isEmpty(this.noMetaPageList) && (browserHybridWebView = this.browserWebView) != null && k.a(this.noMetaPageList, browserHybridWebView.getCurrentUrl())) {
                    this.browserWebView.loadUrl(com.taobao.browser.utils.i.b);
                    break;
                }
                break;
            case 1105:
                if (this.mAppLinkIsNewIntent) {
                    this.mAppLinkIsNewIntent = false;
                    break;
                } else {
                    Bundle data = message.getData();
                    if (data != null && data.getString("result") != null) {
                        String string = data.getString("result");
                        Intent intent3 = new Intent();
                        intent3.setAction("Broadcast_Activity");
                        intent3.putExtra("result", string);
                        intent3.setPackage(getContext().getPackageName());
                        getContext().sendBroadcast(intent3);
                    }
                    finishSelf();
                    break;
                }
                break;
            case 1109:
                new Intent().putExtra("data", (String) message.obj);
                finishSelf();
                break;
            case com.taobao.browser.utils.i.TRADE_SETINFO /* 1114 */:
                new Intent().putExtra("data", (String) message.obj);
                finishSelf();
                break;
            case 1121:
                this.isHookNativeBack = true;
                break;
            case com.taobao.browser.utils.i.TRADE_SELFPICKUP /* 1122 */:
                new Intent().putExtra("data", (String) message.obj);
                finishSelf();
                break;
            case com.taobao.browser.utils.i.WEBVIEW_PROGRESS_CHANGE /* 1126 */:
                TBProgressBar tBProgressBar4 = this.progressbar;
                if (tBProgressBar4 != null) {
                    tBProgressBar4.setCurrentProgress(message.arg1);
                    break;
                }
                break;
            case com.taobao.browser.utils.i.HIDE_LOADING_DIALOG /* 1131 */:
                hideLoadingDialog();
                break;
        }
        return true;
    }

    @Override // android.support.v4.app.Fragment
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004a -> B:16:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getUrlReferer(java.lang.String r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r0 = "weex_original_url"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.browser.fragment.BrowserFragment.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L1e
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            r2 = 1
            r0[r2] = r5
            r5 = 2
            r0[r5] = r6
            java.lang.String r5 = "df2dbde"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L1e:
            r1 = 0
            android.os.Bundle r2 = r6.getExtras()     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L4a
            boolean r2 = r6.hasExtra(r0)     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L36
            android.os.Bundle r6 = r6.getExtras()     // Catch: java.lang.Exception -> L43
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L43
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L43
            goto L4b
        L36:
            android.os.Bundle r6 = r6.getExtras()     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = "URL_REFERER_ORIGIN"
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L43
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L43
            goto L4b
        L43:
            java.lang.String r6 = com.taobao.browser.fragment.BrowserFragment.TAG
            java.lang.String r0 = "error extras"
            com.taobao.tao.log.TLog.loge(r6, r0)
        L4a:
            r6 = r1
        L4b:
            if (r6 != 0) goto L4e
            goto L4f
        L4e:
            r5 = r6
        L4f:
            android.taobao.windvane.webview.k r6 = android.taobao.windvane.webview.j.a()
            if (r6 != 0) goto L5d
            android.taobao.windvane.extra.WVSchemeProcessor r6 = new android.taobao.windvane.extra.WVSchemeProcessor
            r6.<init>()
            android.taobao.windvane.webview.j.a(r6)
        L5d:
            java.lang.String r0 = r6.dealUrlScheme(r5)
            java.lang.String r1 = com.taobao.browser.fragment.BrowserFragment.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "intercepted by ["
            r2.append(r3)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2.append(r6)
            java.lang.String r6 = "],origin_url=["
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = "], new_url=["
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = "]"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.taobao.tao.log.TLog.loge(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.fragment.BrowserFragment.getUrlReferer(java.lang.String, android.content.Intent):java.lang.String");
    }

    private void getMetaInfo(String str) {
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
        this.browserWebView.evaluateJavascript(c, new ValueCallback<String>() { // from class: com.taobao.browser.fragment.BrowserFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                    return;
                }
                h.a().a(str2);
                JSONObject b = h.a().b();
                if (b == null) {
                    return;
                }
                if (b.has("WV.Meta.StopSaveImage") && "true".equalsIgnoreCase(b.optString("WV.Meta.StopSaveImage"))) {
                    if (BrowserFragment.access$000(BrowserFragment.this) == null) {
                        return;
                    }
                    BrowserFragment.access$000(BrowserFragment.this).setOnLongClickListener(null);
                    m.b(BrowserFragment.access$100(), "StopSaveImage");
                    return;
                }
                try {
                    View.OnLongClickListener longClickListener = BrowserFragment.access$000(BrowserFragment.this).getLongClickListener();
                    if (BrowserFragment.access$000(BrowserFragment.this) == null) {
                        return;
                    }
                    BrowserFragment.access$000(BrowserFragment.this).setOnLongClickListener(longClickListener);
                    m.b(BrowserFragment.access$100(), "reset SaveImage");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public String getQuitWebViewDirectlyList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4481f51", new Object[]{this}) : OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_QUIT_WEBVIEW_DIRECTLY_LIST, "");
    }

    public String getNoMetaPageList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a6ac450", new Object[]{this}) : OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_NO_META_PAGE_LIST, "");
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void setUTPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fa6fac", new Object[]{this, str});
        } else {
            mUTPageName = str;
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && !TextUtils.isEmpty(browserHybridWebView.getUTPageName())) {
            return this.browserWebView.getUTPageName();
        }
        String pageNameUrl = getPageNameUrl();
        return !TextUtils.isEmpty(pageNameUrl) ? pageNameUrl : mUTPageName;
    }

    private String preBrowserFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6595bcb2", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            m.e(TAG, "originalurl is null, and finish activity.");
            i iVar = this.mHandle;
            if (iVar != null) {
                iVar.sendEmptyMessage(900);
            }
            return null;
        }
        UrlpreLoadFilter urlpreLoadFilter = new UrlpreLoadFilter(getContext(), getOriginIntent(), this.mHandle, this.browserWebView);
        String preloadURL = urlpreLoadFilter.preloadURL(str, getOriginIntent());
        if (preloadURL == null) {
            this.browserWebView.loadUrl(str);
            m.e(TAG, "UrlpreLoadFilter result is null, and call superLoadUrl.");
            return null;
        } else if (!urlpreLoadFilter.filtrate(preloadURL)) {
            return preloadURL;
        } else {
            return null;
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        TLog.loge(TAG, "onNewIntent.");
        if (intent == null) {
            return;
        }
        try {
            if (intent.getExtras() != null) {
                this.mAppLinkIsNewIntent = intent.getExtras().getBoolean("AppLinkISOnNewIntent");
            }
        } catch (Exception unused) {
        }
        String str2 = null;
        try {
            str2 = intent.getStringExtra("myBrowserUrl");
            if (TextUtils.isEmpty(str2)) {
                str2 = intent.getDataString();
            }
            String urlReferer = getUrlReferer(str2, intent);
            if (urlReferer != null) {
                str2 = urlReferer;
            }
            str = preBrowserFilter(str2);
        } catch (Exception unused2) {
            str = str2;
            TLog.loge(TAG, "fail to get intent extras");
        }
        m.e(android.taobao.util.k.TAOBAO_TAG, "Browser : onNewIntent 2:" + str);
        BrowserHybridWebView browserHybridWebView = this.browserWebView;
        if (browserHybridWebView != null && str != null) {
            browserHybridWebView.resume();
            this.browserWebView.loadUrl(UrlFormator.formatUrl(str));
            this.browserWebView.wpData.timeLoadurl = System.currentTimeMillis();
        }
        i iVar = this.mHandle;
        if (iVar != null && iVar.hasMessages(1105)) {
            this.mHandle.removeMessages(1105);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("url", str);
        Intent originIntent = getOriginIntent();
        originIntent.putExtra("ActivityName", "BrowserActivity:" + p.d(str));
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        BrowserHybridWebView browserHybridWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || (browserHybridWebView = this.browserWebView) == null) {
            return false;
        }
        if (this.isHookNativeBack && !this.isHookNativeBackByJs) {
            browserHybridWebView.evaluateJavascript(RPWebViewActivity.j, new ValueCallback<String>() { // from class: com.taobao.browser.fragment.BrowserFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    } else if (BrowserFragment.access$000(BrowserFragment.this) == null) {
                    } else {
                        if (!TextUtils.isEmpty(str)) {
                            z = !"false".equals(str.replace("\"", "").replace("'", ""));
                        }
                        if (z) {
                            BrowserFragment.access$000(BrowserFragment.this).getWVCallBackContext().fireEvent(RPWebViewActivity.l, "{}");
                            return;
                        }
                        try {
                            Runtime.getRuntime().exec("input keyevent 4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        BrowserFragment.access$202(BrowserFragment.this, true);
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
        if (!TextUtils.isEmpty(url)) {
            try {
                Uri parse = Uri.parse(url);
                if (parse != null && "true".equals(parse.getQueryParameter("disallowback"))) {
                    this.alloweWebViewHistoryBack = false;
                }
                if (!TextUtils.isEmpty(this.quitWebViewDirectlyUrls) && k.a(this.quitWebViewDirectlyUrls, url)) {
                    this.alloweWebViewHistoryBack = false;
                }
            } catch (Exception unused) {
            }
        }
        if (!this.alloweWebViewHistoryBack) {
            finishSelf();
            return true;
        }
        return this.browserWebView.back();
    }

    private String getPageNameUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c813b83a", new Object[]{this});
        }
        String dataString = getOriginIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            int indexOf = dataString.indexOf("?");
            if (indexOf != -1) {
                dataString = dataString.substring(0, indexOf);
            }
            if (!TextUtils.isEmpty(dataString)) {
                return dataString;
            }
        }
        return "";
    }

    public Context getActivityOrContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f42dfd46", new Object[]{this});
        }
        FragmentActivity activity = getActivity();
        return activity != null ? activity : LauncherRuntime.g;
    }

    @Override // android.support.v4.app.Fragment
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = super.getContext();
        return context != null ? context : LauncherRuntime.g;
    }
}
