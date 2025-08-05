package com.taobao.android.shop.activity;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.Pair;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.taobao.TBActionBar;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.aliweex.bundle.m;
import com.alibaba.aliweex.utils.MemoryMonitor;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.shop.application.ShopApplication;
import com.taobao.android.shop.utils.i;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.a;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.pha.core.controller.FeatureStatistics;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.module.NavPrefetchShopFetchManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.ContainerMonitor;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXViewUtils;
import com.ut.mini.UTAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ept;
import tb.ixe;
import tb.kge;
import tb.nwt;
import tb.pqe;
import tb.riu;
import tb.riy;

/* loaded from: classes6.dex */
public class ShopRenderActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_DEGRADE_TO_WINDVANE = "degradeToWindVane";
    private static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";
    private static final String DEGRADE_MSG = "degrade_msg";
    private static final String DEGRADE_TYPE = "degrade_type";
    private static final String DEGRADE_TYPE_INIT_ERROR = "DEGRADE_TYPE_INIT_ERROR";
    private static final String DEGRADE_TYPE_JS_ERROR = "DEGRADE_TYPE_JS_ERROR";
    private static final String DEGRADE_TYPE_PARAMS_ERROR = "DEGRADE_TYPE_PARAMS_ERROR";
    private static final String FROM = "_wx_f_";
    private static final String FROM_WEEX_DEGRADE_H5 = "2";
    private static final String HIDDEN_STATUS_BAR_WITH_DARK_TEXT = "hidden_dark_text";
    private static final String HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT = "hidden_light_text";
    private static final int MAX_PRELOAD_IMAGE_EACH_COUNT = 3;
    private static final String NAV_HIDDEN = "wx_navbar_hidden";
    private static final String NAV_OVERLAY = "wx_navbar_transparent";
    public static final String SHOP_BIZ_MODULE = "Shop";
    public static final String SHOP_COST = "ShopCost";
    public static final String SHOP_NAVI = "shop_navi";
    public static final String SHOP_RENDER = "Page_ShopRender";
    public static final String SHOP_RENDER_ERROR = "Page_ShopRender_Error";
    public static final String STATUSBAR_HEIGHT = "statusbarHeight";
    private static final String TAG = "ShopRender";
    private static final String WX_STATUSBAR_HIDDEN = "_wx_statusbar_hidden";
    public static boolean mShowPerfPanel;
    public static boolean sDebugDisableWeexSDKBackThread;
    public static boolean sDebugEndableJSReport;
    public static boolean sDebugUseOnlineJS;
    private ViewGroup embedView;
    private View innerView;
    public String mBundleUrl;
    private Runnable mErrorParallalRenderFailover;
    private NavPrefetchShopFetchManager.FetchDataResultListener mFetchDataListener;
    private Runnable mFrameRenderAlarm;
    private Runnable mFrameTemplateAlarm;
    private WeexPageFragment mInnerPageFragment;
    private Runnable mInnerTemplateAlarm;
    private Runnable mOverTimeFailover;
    private WeexPageFragment mPageFragment;
    private String mPageName;
    private String mSellerId;
    private String mShopId;
    private String mShopNavi;
    private String mShopNaviForLog;
    private f mShopPageListener;
    public TBPublicMenu mTBPublicMenu;
    public String mTargetInnerUrl;
    private String mWeexUrl;
    private Map<String, String> mQueryMap = null;
    private String mParamForLog = "";
    private String mParamUUIDForLog = "";
    private Handler mHandler = new Handler();
    private long mCheckTime = 3000;
    private com.taobao.search.sf.datasource.c mAllItemsDatasource = null;
    private boolean mUseParallelRender = true;
    private boolean mUseLocalJS = true;
    private boolean mUseBackgroundJSThread = true;
    private boolean mUseImagePreload = true;
    private boolean mUseFestivalActionbar = false;
    private boolean mIsWapa = false;
    private String mDeviceLevel = "medium";
    private boolean enabledParallelRender = false;
    private boolean mIsDegrade = false;
    private com.taobao.android.shop.utils.h mAnalyzerDelegate = null;
    private boolean actionBarOverlay = false;
    public boolean mActionBarShow = true;
    public boolean mHookBackPress = false;
    private Map<String, Long> startTimeForLog = new HashMap();
    private Map<String, List<Long>> eachTimeForLog = new HashMap();
    private com.taobao.android.shop.utils.c mTracker = new com.taobao.android.shop.utils.c();
    private long mCurrentClickTime = System.currentTimeMillis();
    public long mTotalCost = 0;
    public long mActivityInitTime = System.currentTimeMillis();
    public long mFirstLineOfOnCreate = System.currentTimeMillis();
    public long mRouterCost = 0;
    public long mActivityPrepareCost = 0;
    public long mDataPrefetchCost = 0;
    public long mFrameJSLoadCost = 0;
    public long mFrameJSRenderCost = 0;
    public long mFrameJSRenderCostStart = 0;
    public long mInnerJSLoadCost = 0;
    public long mInnerJSRenderCost = 0;
    public long mInnerJSRenderCostStart = 0;
    public long mPagedataCost = 0;
    public long mFetchImageCost = 0;
    public long mPagedataImageCost = 0;
    public long mApmInteractiveCost = 0;
    public long mActivityPrepareCostBegin = 0;
    public long mDataPrefetchCostBegin = 0;
    public long mFrameJSLoadCostBegin = 0;
    public long mFrameJSRenderCostBegin = 0;
    public long mInnerJSLoadCostBegin = 0;
    public long mInnerJSRenderCostBegin = 0;
    public long mPagedataCostBegin = 0;
    public long mFetchImageCostBegin = 0;
    public long mPagedataImageCostBegin = 0;
    private long mTimeNavStart = -1;
    private boolean mHasCommitPageTime = false;
    private ComponentCallbacks2 mLowMemoryTrim = new ComponentCallbacks2() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
                return;
            }
            com.taobao.android.shop.utils.a.a("main-cost", "receiver ComponentCallbacks2.onTrimMemory ", Integer.valueOf(i));
            if (i > 40) {
                return;
            }
            i.a().b();
            ShopRenderActivity.access$000(ShopRenderActivity.this).clear();
            ShopRenderActivity.access$100(ShopRenderActivity.this).clear();
            ShopRenderActivity.access$200(ShopRenderActivity.this).clear();
            ShopRenderActivity.access$302(ShopRenderActivity.this, null);
            if (!"true".equals(OrangeConfig.getInstance().getConfig("shop_render", "log_when_ComponentCallbacks2", "false"))) {
                return;
            }
            com.taobao.android.shop.utils.a.b("Release WeexCacheHelper by ComponentCallbacks2", ShopRenderActivity.access$400(ShopRenderActivity.this), ShopRenderActivity.access$500(ShopRenderActivity.this), String.valueOf(i));
        }
    };
    private BroadcastReceiver mDegradeReceive = new BroadcastReceiver() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!TextUtils.equals(intent.getAction(), ShopRenderActivity.ACTION_DEGRADE_TO_WINDVANE)) {
            } else {
                ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
                ShopRenderActivity.access$2000(shopRenderActivity, shopRenderActivity.getIntent());
                ShopRenderActivity.this.finish();
            }
        }
    };
    private boolean mIsProcessedFetchDataResult = false;
    public ImageStrategyConfig mImageStrategyConfig = null;
    private Map<String, Object> mDataResponseMap = new HashMap();
    private SoftReference<JSCallback> mFetchCallback = null;
    private SoftReference<JSCallback> mPagedataCallback = null;
    private JSCallback mJsCallback = null;
    private boolean hasCanceledMerge = false;
    private Runnable mergeRunnable = new Runnable() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ShopRenderActivity.access$3700(ShopRenderActivity.this) != null && ShopRenderActivity.access$3700(ShopRenderActivity.this).getParent() != null) {
                ((ViewGroup) ShopRenderActivity.access$3700(ShopRenderActivity.this).getParent()).removeAllViews();
            }
            if (ShopRenderActivity.access$3800(ShopRenderActivity.this) == null || ShopRenderActivity.access$3700(ShopRenderActivity.this) == null) {
                return;
            }
            ShopRenderActivity.access$3800(ShopRenderActivity.this).addView(ShopRenderActivity.access$3700(ShopRenderActivity.this));
            if (ShopRenderActivity.access$1000(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$1000(ShopRenderActivity.this).invoke("success");
            }
            ShopRenderActivity.this.showCostTime("main-cost", "merge-cost mergeView 完成合并. ");
            com.taobao.android.shop.utils.a.b("mergeView", ShopRenderActivity.access$400(ShopRenderActivity.this), ShopRenderActivity.access$500(ShopRenderActivity.this));
            ShopRenderActivity.access$1300(ShopRenderActivity.this).b("mergeView", "pageRender");
            ShopRenderActivity.access$4200(ShopRenderActivity.this);
        }
    };
    private boolean mReadyToShowPerfPanel = false;
    public PerfPanelFragment mPerfPanel = null;

    /* renamed from: com.taobao.android.shop.activity.ShopRenderActivity$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15085a = new int[StatusBarTextColor.values().length];

        static {
            try {
                f15085a[StatusBarTextColor.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15085a[StatusBarTextColor.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum StatusBarTextColor {
        Dark,
        Light,
        Undefine
    }

    /* loaded from: classes6.dex */
    public static class WeexInnerPageFragment extends WeexPageFragment {
        static {
            kge.a(-1466976347);
        }
    }

    /* loaded from: classes6.dex */
    public interface c {
    }

    public static /* synthetic */ Object ipc$super(ShopRenderActivity shopRenderActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -663187577:
                return new Boolean(super.onSupportNavigateUp());
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
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
            case 1270686685:
                super.onLowMemory();
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

    public static /* synthetic */ Map access$000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5668a5ca", new Object[]{shopRenderActivity}) : shopRenderActivity.mDataResponseMap;
    }

    public static /* synthetic */ Map access$100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("70d99ee9", new Object[]{shopRenderActivity}) : shopRenderActivity.startTimeForLog;
    }

    public static /* synthetic */ JSCallback access$1000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSCallback) ipChange.ipc$dispatch("3672087e", new Object[]{shopRenderActivity}) : shopRenderActivity.mJsCallback;
    }

    public static /* synthetic */ boolean access$1100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9c689e9", new Object[]{shopRenderActivity})).booleanValue() : shopRenderActivity.hasCanceledMerge;
    }

    public static /* synthetic */ boolean access$1102(ShopRenderActivity shopRenderActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8076ff15", new Object[]{shopRenderActivity, new Boolean(z)})).booleanValue();
        }
        shopRenderActivity.hasCanceledMerge = z;
        return z;
    }

    public static /* synthetic */ String access$1200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d844fdc", new Object[]{shopRenderActivity}) : shopRenderActivity.mParamForLog;
    }

    public static /* synthetic */ com.taobao.android.shop.utils.c access$1300(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.shop.utils.c) ipChange.ipc$dispatch("e43181f5", new Object[]{shopRenderActivity}) : shopRenderActivity.mTracker;
    }

    public static /* synthetic */ long access$1400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ebd1ebf6", new Object[]{shopRenderActivity})).longValue() : shopRenderActivity.mCheckTime;
    }

    public static /* synthetic */ String access$1500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5fefcb5f", new Object[]{shopRenderActivity}) : shopRenderActivity.mDeviceLevel;
    }

    public static /* synthetic */ void access$1600(ShopRenderActivity shopRenderActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70257d4", new Object[]{shopRenderActivity, str, str2});
        } else {
            shopRenderActivity.sendDegradeBoradcast(str, str2);
        }
    }

    public static /* synthetic */ String access$1800(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("625b46e2", new Object[]{shopRenderActivity}) : shopRenderActivity.mShopNavi;
    }

    public static /* synthetic */ WeexPageFragment access$1900(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment) ipChange.ipc$dispatch("cffc4e12", new Object[]{shopRenderActivity}) : shopRenderActivity.mInnerPageFragment;
    }

    public static /* synthetic */ Map access$200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8b4a9808", new Object[]{shopRenderActivity}) : shopRenderActivity.eachTimeForLog;
    }

    public static /* synthetic */ void access$2000(ShopRenderActivity shopRenderActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329901c4", new Object[]{shopRenderActivity, intent});
        } else {
            shopRenderActivity.degradeToWindVane(intent);
        }
    }

    public static /* synthetic */ com.taobao.android.shop.utils.h access$2100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.shop.utils.h) ipChange.ipc$dispatch("cb8fc053", new Object[]{shopRenderActivity}) : shopRenderActivity.mAnalyzerDelegate;
    }

    public static /* synthetic */ void access$2200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3ff5c5", new Object[]{shopRenderActivity});
        } else {
            shopRenderActivity.cancelReportAlarmFrameRenderNoResponse();
        }
    }

    public static /* synthetic */ WeexPageFragment access$2300(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment) ipChange.ipc$dispatch("db171bd9", new Object[]{shopRenderActivity}) : shopRenderActivity.mPageFragment;
    }

    public static /* synthetic */ String access$2400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78229e7d", new Object[]{shopRenderActivity}) : shopRenderActivity.generateAppMonitorArgs();
    }

    public static /* synthetic */ long access$2500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac4b57d6", new Object[]{shopRenderActivity})).longValue() : shopRenderActivity.mCurrentClickTime;
    }

    public static /* synthetic */ boolean access$2600(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b24f2345", new Object[]{shopRenderActivity})).booleanValue() : shopRenderActivity.mIsWapa;
    }

    public static /* synthetic */ void access$2700(ShopRenderActivity shopRenderActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b53b4", new Object[]{shopRenderActivity, str, str2});
        } else {
            shopRenderActivity.preVistCdn(str, str2);
        }
    }

    public static /* synthetic */ String access$2800(ShopRenderActivity shopRenderActivity, Map map, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a67202b0", new Object[]{shopRenderActivity, map, str}) : shopRenderActivity.findInnerUrlFromFetchResponse(map, str);
    }

    public static /* synthetic */ String access$2900(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c2b1702", new Object[]{shopRenderActivity}) : shopRenderActivity.mSellerId;
    }

    public static /* synthetic */ boolean access$3000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48adff8c", new Object[]{shopRenderActivity})).booleanValue() : shopRenderActivity.mUseParallelRender;
    }

    public static /* synthetic */ com.taobao.search.sf.datasource.c access$302(ShopRenderActivity shopRenderActivity, com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.sf.datasource.c) ipChange.ipc$dispatch("c4184840", new Object[]{shopRenderActivity, cVar});
        }
        shopRenderActivity.mAllItemsDatasource = cVar;
        return cVar;
    }

    public static /* synthetic */ void access$3100(ShopRenderActivity shopRenderActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed16a8f1", new Object[]{shopRenderActivity, str});
        } else {
            shopRenderActivity.processParallelRender(str);
        }
    }

    public static /* synthetic */ void access$3200(ShopRenderActivity shopRenderActivity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2edbd260", new Object[]{shopRenderActivity, str, jSONObject});
        } else {
            shopRenderActivity.preloadFetchImage(str, jSONObject);
        }
    }

    public static /* synthetic */ Map access$3400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("40ca2839", new Object[]{shopRenderActivity}) : shopRenderActivity.mQueryMap;
    }

    public static /* synthetic */ SoftReference access$3500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoftReference) ipChange.ipc$dispatch("828360e3", new Object[]{shopRenderActivity}) : shopRenderActivity.mPagedataCallback;
    }

    public static /* synthetic */ void access$3600(ShopRenderActivity shopRenderActivity, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9833ea34", new Object[]{shopRenderActivity, str, jSONArray});
        } else {
            shopRenderActivity.preloadPagedataImage(str, jSONArray);
        }
    }

    public static /* synthetic */ View access$3700(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a8d80123", new Object[]{shopRenderActivity}) : shopRenderActivity.innerView;
    }

    public static /* synthetic */ View access$3702(ShopRenderActivity shopRenderActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("36ab0295", new Object[]{shopRenderActivity, view});
        }
        shopRenderActivity.innerView = view;
        return view;
    }

    public static /* synthetic */ ViewGroup access$3800(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("d12aef95", new Object[]{shopRenderActivity}) : shopRenderActivity.embedView;
    }

    public static /* synthetic */ ViewGroup access$3802(ShopRenderActivity shopRenderActivity, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7b41b278", new Object[]{shopRenderActivity, viewGroup});
        }
        shopRenderActivity.embedView = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ void access$3900(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed025df", new Object[]{shopRenderActivity});
        } else {
            shopRenderActivity.mergeView();
        }
    }

    public static /* synthetic */ String access$400(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b1436ef", new Object[]{shopRenderActivity}) : shopRenderActivity.mShopNaviForLog;
    }

    public static /* synthetic */ Runnable access$4000(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("a10b8eeb", new Object[]{shopRenderActivity}) : shopRenderActivity.mErrorParallalRenderFailover;
    }

    public static /* synthetic */ Runnable access$4002(ShopRenderActivity shopRenderActivity, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a2533e2f", new Object[]{shopRenderActivity, runnable});
        }
        shopRenderActivity.mErrorParallalRenderFailover = runnable;
        return runnable;
    }

    public static /* synthetic */ Handler access$4100(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("c2a57a5e", new Object[]{shopRenderActivity}) : shopRenderActivity.mHandler;
    }

    public static /* synthetic */ void access$4200(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b36c7", new Object[]{shopRenderActivity});
        } else {
            shopRenderActivity.clearCallback();
        }
    }

    public static /* synthetic */ String access$500(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6be2b570", new Object[]{shopRenderActivity}) : shopRenderActivity.mParamUUIDForLog;
    }

    public static /* synthetic */ String access$700(ShopRenderActivity shopRenderActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d7fb272", new Object[]{shopRenderActivity}) : shopRenderActivity.mShopId;
    }

    public static /* synthetic */ void access$800(ShopRenderActivity shopRenderActivity, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a430f5fb", new Object[]{shopRenderActivity, obj, new Long(j)});
        } else {
            shopRenderActivity.processFetchDataResult(obj, j);
        }
    }

    public void pageFinishCommit(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3959ca5a", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !this.mHasCommitPageTime) {
                this.mHasCommitPageTime = true;
                ContainerMonitor monitor = ContainerMonitor.monitor();
                if (TextUtils.isEmpty(str) || this.mTimeNavStart <= 0 || j <= 0 || j - this.mTimeNavStart <= 0) {
                    return;
                }
                monitor.fsTime(str, j - this.mTimeNavStart);
                monitor.commitData(str);
                Log.e("ShopPageFinished", "" + (j - this.mTimeNavStart));
            }
        } catch (Throwable unused) {
        }
    }

    static {
        kge.a(-297823819);
        kge.a(-661194691);
        sDebugEndableJSReport = false;
        sDebugDisableWeexSDKBackThread = false;
        sDebugUseOnlineJS = false;
        mShowPerfPanel = false;
    }

    public void recordCostTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0d6648", new Object[]{this, str, new Long(j)});
        } else if (!com.taobao.android.shop.utils.a.a().booleanValue()) {
        } else {
            if (this.startTimeForLog.containsKey(str)) {
                com.taobao.android.shop.utils.a.a("shop", "ShopCost", " warning 重复的耗时记录key " + str + " delta time is " + (j - this.startTimeForLog.get(str).longValue()) + " ms");
            }
            this.startTimeForLog.put(str, Long.valueOf(j));
        }
    }

    public void recordCostTimeDetail(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96366f7", new Object[]{this, str, new Long(j)});
        } else if (!com.taobao.android.shop.utils.a.a().booleanValue()) {
        } else {
            recordCostTime(str, j);
            this.eachTimeForLog.put(str, new ArrayList());
            this.eachTimeForLog.get(str).add(Long.valueOf(j));
        }
    }

    public void showCostTime(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d659089", new Object[]{this, str, objArr});
        } else {
            showCostTime(str, Long.valueOf(System.currentTimeMillis()), objArr);
        }
    }

    public void showCostTime(String str, Long l, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371869ea", new Object[]{this, str, l, objArr});
        } else if (com.taobao.android.shop.utils.a.a().booleanValue()) {
            StringBuilder sb = new StringBuilder("shopperf_cost ");
            if (this.startTimeForLog.get(str) != null) {
                sb.append(str);
                sb.append(" cost ");
                sb.append(l.longValue() - this.startTimeForLog.get(str).longValue());
                sb.append(" ms.");
            } else {
                sb.append("new cost key. ");
                sb.append(str);
                sb.append(l);
            }
            if (this.eachTimeForLog.get(str) != null) {
                long longValue = this.eachTimeForLog.get(str).get(this.eachTimeForLog.get(str).size() - 1).longValue();
                sb.append(" | last detla is ");
                sb.append(l.longValue() - longValue);
            } else {
                sb.append("[done].");
            }
            if (objArr != null) {
                sb.append(" |");
                for (Object obj : objArr) {
                    if (obj != null) {
                        sb.append(" ");
                        sb.append(obj);
                    }
                }
            }
            sb.append(" | [");
            sb.append(Thread.currentThread().getName());
            sb.append(riy.ARRAY_END_STR);
            if (this.eachTimeForLog.get(str) != null) {
                this.eachTimeForLog.get(str).add(l);
            }
            if ("main-cost".equals(str)) {
                com.taobao.android.shop.utils.a.a("shop", "ShopCost", sb.toString());
            } else {
                com.taobao.android.shop.utils.a.b("shop", "ShopCost", sb.toString());
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        if (!processOnSupportNavigateUp()) {
            return super.onSupportNavigateUp();
        }
        return true;
    }

    public boolean processOnSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29837c18", new Object[]{this})).booleanValue();
        }
        WeexPageFragment weexPageFragment = this.mPageFragment;
        return weexPageFragment != null && !weexPageFragment.isDetached() && this.mPageFragment.onSupportNavigateUp();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ShopApplication.a();
        try {
            Intent intent = getIntent();
            if (intent != null) {
                this.mTimeNavStart = intent.getLongExtra("WEEX_NAV_PROCESSOR_TIME", -1L);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mFirstLineOfOnCreate = System.currentTimeMillis();
        this.mParamUUIDForLog = UUID.randomUUID().toString();
        this.mTracker.a();
        this.mTracker.d(this.mParamUUIDForLog);
        com.taobao.android.shop.utils.a.b("startActivity", "", this.mParamUUIDForLog);
        recordCostTimeDetail("main-cost", System.currentTimeMillis());
        showCostTime("main-cost", "after initUmbrellaPerformanceTracker");
        this.mTracker.f("activityOnCreate");
        ixe.a().a(this);
        if (com.taobao.android.shop.utils.a.a().booleanValue()) {
            showToast("店铺私有窗体");
            com.taobao.android.shop.utils.a.a("精彩从这里开始，店铺私有窗体 ");
        }
        showCostTime("main-cost", "after showToast");
        if (!isEnvironmentReady()) {
            if (WXEnvironment.isApkDebugable()) {
                Toast.makeText(this, "WEEX_SDK 初始化失败!", 0).show();
            }
            super.onCreate(bundle);
            Intent intent2 = getIntent();
            intent2.putExtra(DEGRADE_TYPE, DEGRADE_TYPE_INIT_ERROR);
            intent2.putExtra(DEGRADE_MSG, "WEEX_SDK 初始化失败!降级到h5");
            degradeToWindVane(intent2);
            AppMonitor.Alarm.commitFail("weex", "renderResult", generateAppMonitorArgs(), "99302", "weex framework init failed");
            finish();
        } else if (!isParamValid(getIntent())) {
            if (WXEnvironment.isApkDebugable()) {
                Toast.makeText(this, "参数非法!", 0).show();
            }
            super.onCreate(bundle);
            Intent intent3 = getIntent();
            intent3.putExtra(DEGRADE_TYPE, DEGRADE_TYPE_PARAMS_ERROR);
            StringBuilder sb = new StringBuilder();
            sb.append("参数非法 ! 降级到h5! params==\n");
            sb.append(getIntent().getData() != null ? getIntent().getData().toString() : "");
            intent3.putExtra(DEGRADE_MSG, sb.toString());
            degradeToWindVane(intent3);
            AppMonitor.Alarm.commitFail("weex", "renderResult", generateAppMonitorArgs(), "99303", "error params");
            finish();
        } else {
            this.mTracker.a("url", this.mBundleUrl);
            showCostTime("main-cost", "after param valid");
            com.taobao.android.shop.utils.a.b("totalCount", this.mShopNaviForLog, this.mParamUUIDForLog);
            this.mTracker.b("totalCount", "pageRender");
            chooseAppBarMode(bundle);
            UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
            String prepareShopId = prepareShopId();
            this.mFetchDataListener = new b();
            NavPrefetchShopFetchManager.getInstance().setFetchDataListener(prepareShopId, this.mFetchDataListener);
            showCostTime("main-cost", "after navFetchData setFetchDataListener");
            processPreVisitCdnDowngrade();
            showCostTime("main-cost", "after processPreVisitCdnDowngrade async");
            if (TextUtils.isEmpty(this.mShopNavi)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, ShopConstants.PAGE_SHOP);
            } else if ("allitems".equals(this.mShopNavi) && "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "data_prefetch_page_allitems", "true"))) {
                try {
                    this.mAllItemsDatasource = nwt.a().a(this.mQueryMap);
                } catch (Throwable th) {
                    com.taobao.android.shop.utils.a.a("-52026", "error in allitems prefetch data.", th, this.mParamForLog, this.mBundleUrl);
                    this.mTracker.a("-52026", "error in allitems prefetch data.", "dataProcess", th, new Object[0]);
                }
            }
            showCostTime("main-cost", "after chooseAppBarMode (include super.onCreate() )");
            setContentView(R.layout.shop_render_activity_root_layout);
            prepareStatusBar();
            hideAppBar();
            if (WXEnvironment.isApkDebugable()) {
                com.taobao.android.shop.utils.h.f15116a = !com.taobao.android.shop.utils.a.c();
                this.mAnalyzerDelegate = new com.taobao.android.shop.utils.h(this);
                this.mAnalyzerDelegate.a();
            }
            HashMap<String, Object> extraOption = getExtraOption();
            showCostTime("main-cost", "after setContentView + prepareStatusBar + WXAnalyzerDelegate + getExtraOption");
            recordCostTimeDetail("main-cost-render-frame", System.currentTimeMillis());
            com.taobao.android.shop.utils.a.c("main-cost frame mBundleUrl is ", this.mBundleUrl);
            this.mTracker.g("activityOnCreate");
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.mFirstLineOfOnCreate;
            this.mActivityPrepareCost = currentTimeMillis - j;
            this.mActivityPrepareCostBegin = j - this.mCurrentClickTime;
            if (!this.mUseLocalJS || sDebugUseOnlineJS) {
                str = null;
            } else {
                reportAlarmFrameTemplateOverSeconds(this.mBundleUrl);
                long currentTimeMillis2 = System.currentTimeMillis();
                this.mTracker.f("frameJSLoad");
                str = i.a().a(this.mBundleUrl);
                this.mTracker.g("frameJSLoad");
                this.mFrameJSLoadCost = System.currentTimeMillis() - currentTimeMillis2;
                this.mFrameJSLoadCostBegin = currentTimeMillis2 - this.mCurrentClickTime;
                cancelReportAlarmFrameTemplateOverSeconds();
            }
            this.mFrameJSRenderCostStart = System.currentTimeMillis();
            this.mTracker.f("frameJSRender");
            if (!TextUtils.isEmpty(str)) {
                extraOption.put("bundleUrl", this.mBundleUrl);
                synchronized (ShopRenderActivity.class) {
                    this.mPageFragment = (WeexPageFragment) WeexPageFragment.newInstanceWithTemplate(this, WeexPageFragment.class, str, this.mBundleUrl, extraOption, (String) null, R.id.shop_render_root_layout);
                }
                String str3 = this.mShopNaviForLog;
                Object[] objArr = new Object[3];
                objArr[0] = this.mParamUUIDForLog;
                objArr[1] = Long.valueOf(this.mFrameJSLoadCost);
                if (str != null) {
                    str2 = "frameTemplateLength=" + str.length();
                } else {
                    str2 = "frameTemplate is null";
                }
                objArr[2] = str2;
                com.taobao.android.shop.utils.a.b("renderFrameByTemplate", str3, objArr);
            } else {
                synchronized (ShopRenderActivity.class) {
                    this.mPageFragment = (WeexPageFragment) WeexPageFragment.newInstanceWithUrl(this, WeexPageFragment.class, this.mWeexUrl, this.mBundleUrl, extraOption, null, R.id.shop_render_root_layout);
                }
                com.taobao.android.shop.utils.a.b("renderFrameByUrl", this.mShopNaviForLog, this.mParamUUIDForLog, i.a().a(this, this.mBundleUrl));
                com.taobao.android.shop.utils.a.a("main-cost", "renderFrameByUrl 注意。从网络加载了 JS-BUNDLE，理论上只会新装第一次出现。");
            }
            if (com.taobao.android.shop.utils.a.a().booleanValue()) {
                com.taobao.android.shop.utils.a.a("main-cost report WeexCacheHelper status after", i.a().a(this, this.mBundleUrl));
            }
            this.mPageFragment.getArguments().putString(WeexPageFragment.FRAGMENT_ARG_RENDER_URL, this.mBundleUrl);
            this.mPageFragment.setRenderListener(new h());
            this.mPageFragment.setUserTrackEnable(false);
            this.mPageFragment.setNavBarAdapter(new com.taobao.android.shop.weex.a(this, this.mQueryMap));
            reportAlarmFrameRenderNoResponse();
            Object[] objArr2 = new Object[2];
            objArr2[0] = "after frame newInstanceWithXXX + setRenderListener";
            objArr2[1] = str != null ? Integer.valueOf(str.hashCode()) : "frameTemplate is null";
            showCostTime("main-cost", objArr2);
            showCostTime("main-cost-render-frame", "frame fired");
            registerComponentCallbacks(this.mLowMemoryTrim);
            showCostTime("main-cost", "activity onCreate end.");
        }
    }

    private HashMap<String, Object> getExtraOption() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("74b07c59", new Object[]{this});
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        try {
            if (getIntent() != null && (hashMap = (HashMap) getIntent().getSerializableExtra("wx_options")) != null) {
                hashMap2.putAll(hashMap);
            }
        } catch (Exception e2) {
            com.taobao.android.shop.utils.a.a("-52027", "error in getExtraOption.", e2, this.mParamForLog, this.mBundleUrl);
            this.mTracker.a("-52027", "error in getExtraOption.", "pageRender", e2, new Object[0]);
        }
        return hashMap2;
    }

    public com.taobao.search.sf.datasource.c getShopDatasource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.datasource.c) ipChange.ipc$dispatch("715eaec8", new Object[]{this}) : this.mAllItemsDatasource;
    }

    /* loaded from: classes6.dex */
    public class b implements NavPrefetchShopFetchManager.FetchDataResultListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-887978295);
            kge.a(-1736500);
        }

        private b() {
        }

        @Override // com.taobao.weex.module.NavPrefetchShopFetchManager.FetchDataResultListener
        public void onReceiveFetchData(String str, JSONObject jSONObject, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0b13e05", new Object[]{this, str, jSONObject, new Long(j)});
            } else if (!str.equals(ShopRenderActivity.access$700(ShopRenderActivity.this))) {
            } else {
                ShopRenderActivity.access$800(ShopRenderActivity.this, jSONObject, j);
            }
        }

        @Override // com.taobao.weex.module.NavPrefetchShopFetchManager.FetchDataResultListener
        public void onReceiveFetchDataString(String str, String str2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75bc6d18", new Object[]{this, str, str2, new Long(j)});
            } else if (!str.equals(ShopRenderActivity.access$700(ShopRenderActivity.this))) {
            } else {
                ShopRenderActivity.access$800(ShopRenderActivity.this, str2, j);
            }
        }
    }

    private void processParallelRender(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c282d05d", new Object[]{this, str});
            return;
        }
        this.enabledParallelRender = true;
        com.taobao.android.shop.utils.a.b("parallelRender", this.mShopNaviForLog, this.mParamUUIDForLog);
        this.mTracker.b("parallelRender", "pageRender");
        com.taobao.android.shop.utils.c.a(this.mQueryMap).put("innerUrl", str);
        recordCostTimeDetail("main-cost-render-inner", System.currentTimeMillis());
        HashMap<String, Object> extraOption = getExtraOption();
        StringBuilder sb = new StringBuilder(str);
        String config = OrangeConfig.getInstance().getConfig("shop_render", "blackListParam", "|wh_weex|_wx_tpl|wx_navbar_transparent|wx_navbar_hidden|wx_recycle_uuid|wx_recycle_biz|wx_recycle_max|data_prefetch|wh_prefetch|shopId|sellerId|pathInfo|pageId|");
        Map<String, String> map = this.mQueryMap;
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (!TextUtils.isEmpty(str3)) {
                    if (!config.contains("|" + str3 + "|")) {
                        sb.append("&");
                        sb.append(str3);
                        sb.append("=");
                        if (getQuery(str3) != null) {
                            sb.append(Uri.encode(getQuery(str3)));
                        }
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.mShopNavi)) {
            sb.append("&_useless2=2&parallelEmbed=true&_inNestedEmbed=true&inWeexShop=true&weexShopTabId=0.0&weexShopTransparentBG=true");
        } else if ("allitems".equals(this.mShopNavi)) {
            sb.append("&_useless3=3&parallelEmbed=true&_inNestedEmbed=true&inWeexShop=true&weexShopTabId=0.1");
        }
        String sb2 = sb.toString();
        this.mTargetInnerUrl = sb2;
        com.taobao.android.shop.utils.a.c("main-cost inner targetInnerUrl is ", sb2);
        if (!Uri.parse(sb2).isHierarchical()) {
            com.taobao.android.shop.utils.a.a("-60001", "url not Hierarchical.", sb2, this.mParamForLog, this.mBundleUrl);
            this.mTracker.a("-60001", "url not Hierarchical.", "pageRender", sb2);
            this.enabledParallelRender = false;
            return;
        }
        if (!this.mUseLocalJS || sDebugUseOnlineJS) {
            str2 = null;
        } else {
            reportAlarmInnerTemplateOverSeconds(sb2);
            long currentTimeMillis = System.currentTimeMillis();
            this.mTracker.f("innerJSLoad");
            str2 = i.a().a(sb2);
            this.mTracker.g("innerJSLoad");
            this.mInnerJSLoadCost = System.currentTimeMillis() - currentTimeMillis;
            this.mInnerJSLoadCostBegin = currentTimeMillis - this.mCurrentClickTime;
            cancelReportAlarmInnerTemplateOverSeconds();
        }
        this.mTracker.f("innerJSRender");
        this.mInnerJSRenderCostStart = System.currentTimeMillis();
        if (!this.mUseBackgroundJSThread || sDebugDisableWeexSDKBackThread) {
            com.taobao.android.shop.utils.a.b("main-cost", "NOT using js back thread. No use_back_thread in extraOption ");
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("use_back_thread", "true");
            if (com.taobao.android.shop.utils.a.a().booleanValue()) {
                hashMap.put("release_log", "true");
            }
            extraOption.put("extraOption", hashMap);
        }
        if (!TextUtils.isEmpty(str2)) {
            extraOption.put("bundleUrl", sb2);
            synchronized (ShopRenderActivity.class) {
                WeexPageFragment weexPageFragment = (WeexPageFragment) prepareFragment(this, str2, sb2, extraOption, "weex_page_shop_home", null);
                if (weexPageFragment != null) {
                    weexPageFragment.setRenderListener(new g());
                    initFragment(this, R.id.shop_homepage_virtual, weexPageFragment, "weex_page_shop_home");
                    this.mInnerPageFragment = weexPageFragment;
                }
            }
            String str4 = this.mShopNaviForLog;
            Object[] objArr = new Object[2];
            objArr[0] = this.mParamUUIDForLog;
            objArr[1] = str2 != null ? "innerTemplateLength=" + str2.length() : "innerTemplate is null";
            com.taobao.android.shop.utils.a.b("renderInnerByTemplate", str4, objArr);
        } else {
            synchronized (ShopRenderActivity.class) {
                WeexPageFragment weexPageFragment2 = (WeexPageFragment) prepareFragment(this, null, sb2, extraOption, "weex_page_shop_home", null);
                if (weexPageFragment2 != null) {
                    weexPageFragment2.setRenderListener(new g());
                    initFragment(this, R.id.shop_homepage_virtual, weexPageFragment2, "weex_page_shop_home");
                    this.mInnerPageFragment = weexPageFragment2;
                }
            }
            com.taobao.android.shop.utils.a.b("renderInnerByUrl", this.mShopNaviForLog, this.mParamUUIDForLog, i.a().a(this, sb2));
            com.taobao.android.shop.utils.a.a("main-cost", "renderInnerByUrl  注意。从网络加载了 JS-BUNDLE，理论上只会新装第一次出现。");
        }
        this.mInnerPageFragment.setProgressBarView(new a());
        Object[] objArr2 = new Object[2];
        objArr2[0] = "after inner newInstanceWithXXX + setRenderListener ";
        objArr2[1] = str2 != null ? Integer.valueOf(str2.hashCode()) : "innerTemplate is null";
        showCostTime("main-cost", objArr2);
        showCostTime("main-cost-render-inner", "inner fired");
        if (com.taobao.android.shop.utils.a.a().booleanValue()) {
            com.taobao.android.shop.utils.a.a("main-cost report WeexCacheHelper status after", i.a().a(this, sb2));
        }
        this.mErrorParallalRenderFailover = new Runnable() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ShopRenderActivity.access$1000(ShopRenderActivity.this) == null || ShopRenderActivity.access$1100(ShopRenderActivity.this)) {
                } else {
                    ShopRenderActivity.access$1000(ShopRenderActivity.this).invoke("error. failover mode. no inner onRenderSuccess called");
                    ShopRenderActivity.access$1102(ShopRenderActivity.this, true);
                    com.taobao.android.shop.utils.a.a("-60021", "inner onRenderSuccess not called.", ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                    ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-60021", "inner onRenderSuccess not called.", "pageRender", new Object[0]);
                    ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
                    Object[] objArr3 = new Object[1];
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("merge-cost mergeView 合并失败。no inner onRenderSuccess called. hasCanceledMerge: ");
                    sb3.append(ShopRenderActivity.access$1100(ShopRenderActivity.this));
                    sb3.append(" jscallback: ");
                    sb3.append(ShopRenderActivity.access$1000(ShopRenderActivity.this) != null ? " not null" : "null");
                    objArr3[0] = sb3.toString();
                    shopRenderActivity.showCostTime("main-cost", objArr3);
                }
            }
        };
        this.mHandler.postDelayed(this.mErrorParallalRenderFailover, this.mCheckTime + 1500);
    }

    private void reportAlarmFrameRenderNoResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94af0def", new Object[]{this});
            return;
        }
        this.mFrameRenderAlarm = new Runnable() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.android.shop.utils.a.a("-60022", "frame render no response. over " + ShopRenderActivity.access$1400(ShopRenderActivity.this) + " ms.", ShopRenderActivity.access$1200(ShopRenderActivity.this));
                com.taobao.android.shop.utils.c access$1300 = ShopRenderActivity.access$1300(ShopRenderActivity.this);
                access$1300.a("-60022", "frame render no response. over " + ShopRenderActivity.access$1400(ShopRenderActivity.this) + " ms.", ShopRenderActivity.access$1500(ShopRenderActivity.this), "pageRender", new Object[0]);
                if (!"true".equals(OrangeConfig.getInstance().getConfig("shop_render", "degrade_to_windvane_when_frame_render_no_response", "false"))) {
                    return;
                }
                ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
                ShopRenderActivity.access$1600(shopRenderActivity, "-60022", "shop frame render no response. over" + ShopRenderActivity.access$1400(ShopRenderActivity.this) + " ms");
            }
        };
        this.mHandler.postDelayed(this.mFrameRenderAlarm, this.mCheckTime);
    }

    private void cancelReportAlarmFrameRenderNoResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3dfb89", new Object[]{this});
            return;
        }
        Runnable runnable = this.mFrameRenderAlarm;
        if (runnable == null) {
            return;
        }
        this.mHandler.removeCallbacks(runnable);
        this.mFrameRenderAlarm = null;
    }

    private void reportAlarmFrameTemplateOverSeconds(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cccdf2", new Object[]{this, str});
            return;
        }
        this.mFrameTemplateAlarm = new Runnable() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.android.shop.utils.a.a("-60031", "frame template seconds no get from cache.", ShopRenderActivity.access$1200(ShopRenderActivity.this), str);
                ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-60031", "frame template seconds no get from cache.", "pageRender", str);
                if (!"true".equals(OrangeConfig.getInstance().getConfig("shop_render", "degrade_to_windvane_when_frame_template_over_seconds", "false"))) {
                    return;
                }
                ShopRenderActivity.access$1600(ShopRenderActivity.this, "-60031", "shop frame template seconds no get from cache.");
            }
        };
        this.mHandler.postDelayed(this.mFrameTemplateAlarm, Long.valueOf(Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "frame_template_alarm_delay", "3000"))).longValue());
    }

    private void cancelReportAlarmFrameTemplateOverSeconds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4517d24e", new Object[]{this});
            return;
        }
        Runnable runnable = this.mFrameTemplateAlarm;
        if (runnable == null) {
            return;
        }
        this.mHandler.removeCallbacks(runnable);
        this.mFrameTemplateAlarm = null;
    }

    private void reportAlarmInnerTemplateOverSeconds(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ca0329", new Object[]{this, str});
            return;
        }
        this.mInnerTemplateAlarm = new Runnable() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.android.shop.utils.a.a("-60032", "inner template seconds no get from cache.", ShopRenderActivity.access$1200(ShopRenderActivity.this), str);
                ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-60032", "inner template seconds no get from cache.", "pageRender", str);
                if (ShopRenderActivity.access$1000(ShopRenderActivity.this) == null || ShopRenderActivity.access$1100(ShopRenderActivity.this)) {
                    return;
                }
                ShopRenderActivity.access$1000(ShopRenderActivity.this).invoke("error. inner template load over seconds");
                ShopRenderActivity.access$1102(ShopRenderActivity.this, true);
                com.taobao.android.shop.utils.a.a("-60033", "error. inner template load over seconds.", ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-60033", "error. inner template load over seconds.", "pageRender", str);
            }
        };
        this.mHandler.postDelayed(this.mInnerTemplateAlarm, Long.valueOf(Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "inner_template_alarm_delay", "3000"))).longValue());
    }

    private void cancelReportAlarmInnerTemplateOverSeconds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e1b745", new Object[]{this});
            return;
        }
        Runnable runnable = this.mInnerTemplateAlarm;
        if (runnable == null) {
            return;
        }
        this.mHandler.removeCallbacks(runnable);
        this.mInnerTemplateAlarm = null;
    }

    private Fragment prepareFragment(FragmentActivity fragmentActivity, String str, String str2, HashMap<String, Object> hashMap, String str3, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("5fe63eda", new Object[]{this, fragmentActivity, str, str2, hashMap, str3, serializable});
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (TextUtils.isEmpty(str3)) {
            str3 = WeexPageFragment.FRAGMENT_TAG;
        }
        if (supportFragmentManager.findFragmentByTag(str3) != null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(WeexPageFragment.FRAGMENT_ARG_TAG, str3);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_TEMPLATE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_BUNDLE_URL, str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_RENDER_URL, str2);
        } else {
            com.taobao.android.shop.utils.a.a("-60002", "inner bundle url empty.", this.mParamForLog, this.mBundleUrl);
            this.mTracker.a("-60002", "inner bundle url empty.", "pageRender", new Object[0]);
        }
        if (hashMap != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_CUSTOM_OPT, hashMap);
        }
        if (serializable != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_FROM_ACTIVITY, serializable);
        }
        return Fragment.instantiate(fragmentActivity, WeexInnerPageFragment.class.getName(), bundle);
    }

    private void initFragment(FragmentActivity fragmentActivity, int i, WeexPageFragment weexPageFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6b4ee8", new Object[]{this, fragmentActivity, new Integer(i), weexPageFragment, str});
            return;
        }
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        if (TextUtils.isEmpty(str)) {
            str = WeexPageFragment.FRAGMENT_TAG;
        }
        beginTransaction.add(i, weexPageFragment, str);
        beginTransaction.commitAllowingStateLoss();
    }

    private void prepareStatusBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bd901", new Object[]{this});
            return;
        }
        WXEnvironment.addCustomOptions(STATUSBAR_HEIGHT, Integer.toString(0));
        Pair<Boolean, StatusBarTextColor> hideStatusBar = hideStatusBar();
        if (!hideStatusBar.first.booleanValue()) {
            return;
        }
        View findViewById = findViewById(R.id.shop_render_root_layout);
        findViewById.setFitsSystemWindows(true);
        WXEnvironment.addCustomOptions(STATUSBAR_HEIGHT, Integer.toString(SystemBarDecorator.getStatusBarHeight(this)));
        int i = AnonymousClass5.f15085a[hideStatusBar.second.ordinal()];
        if (i == 1) {
            new SystemBarDecorator(this).enableImmersiveStatusBar(true);
        } else if (i == 2) {
            new SystemBarDecorator(this).enableImmersiveStatusBar(false);
        } else {
            new SystemBarDecorator(this).enableImmersiveStatusBar(false);
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (WindowInsetsCompat) ipChange2.ipc$dispatch("eac8c0", new Object[]{this, view, windowInsetsCompat});
                }
                if (TextUtils.equals(WXEnvironment.getCustomOptions().get(ShopRenderActivity.STATUSBAR_HEIGHT), "-1")) {
                    WXEnvironment.addCustomOptions(ShopRenderActivity.STATUSBAR_HEIGHT, Integer.toString(windowInsetsCompat.getSystemWindowInsetTop()));
                }
                return windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WeexPageFragment weexPageFragment = this.mPageFragment;
        if (weexPageFragment == null) {
            return;
        }
        weexPageFragment.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : hideStatusBar().first.booleanValue();
    }

    private boolean isParamValid(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a85c01", new Object[]{this, intent})).booleanValue();
        }
        this.mBundleUrl = intent.getStringExtra(riu.c);
        this.mWeexUrl = intent.getStringExtra(riu.e);
        if (TextUtils.isEmpty(this.mBundleUrl) || TextUtils.isEmpty(this.mWeexUrl)) {
            return false;
        }
        try {
            if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "use_string_way_generate_param_map", "true"))) {
                this.mQueryMap = queryMap(this.mBundleUrl);
            } else {
                this.mQueryMap = queryMap2(this.mBundleUrl);
            }
            this.mUseLocalJS = isParamTrue("_enable_local_js", true);
            this.mUseParallelRender = isParamTrue("_parallel_render", true);
            if (this.mUseParallelRender && TextUtils.isEmpty(this.mShopNavi)) {
                this.mUseParallelRender = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "parallelrender_page_home", "true"));
            } else if (this.mUseParallelRender && "allitems".equals(this.mShopNavi)) {
                this.mUseParallelRender = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "parallelrender_page_allitems", "true"));
            }
            this.mUseBackgroundJSThread = isParamTrue("_enable_background_js_thread", true);
            if (this.mUseBackgroundJSThread) {
                this.mUseBackgroundJSThread = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_background_js_thread", "true"));
            }
            this.mUseImagePreload = isParamTrue("_enable_image_preload", true);
            if (this.mUseImagePreload) {
                this.mUseImagePreload = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_image_preload", "true"));
            }
            this.mUseFestivalActionbar = isParamTrue("_enable_navbar_festival", false);
            if (!this.mUseFestivalActionbar) {
                this.mUseFestivalActionbar = "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_navbar_festival", "false"));
            }
            this.mPageName = assemblePageName(this.mBundleUrl);
            com.alibaba.aliweex.d.a(this.mPageName);
            if (this.mQueryMap != null) {
                this.mShopId = getQuery("shopId");
                this.mTracker.e(this.mShopId);
                this.mSellerId = getQuery("sellerId");
                this.mShopNavi = getQuery(SHOP_NAVI);
                if (TextUtils.isEmpty(this.mShopNavi)) {
                    this.mShopNavi = getQuery("shopNavi");
                }
                if (!TextUtils.isEmpty(this.mShopNavi)) {
                    this.mShopNaviForLog = this.mShopNavi;
                } else if (this.mBundleUrl.contains("/apps/market/shop/weex_2.html?")) {
                    this.mShopNaviForLog = "home";
                } else {
                    this.mShopNaviForLog = this.mPageName;
                }
                this.mTracker.c(this.mShopNaviForLog);
                this.mIsWapa = this.mBundleUrl.contains("market.wapa.taobao.com/");
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(this.mShopId)) {
                    sb.append("Shop:");
                    sb.append(this.mShopId);
                } else if (!TextUtils.isEmpty(this.mShopId)) {
                    sb.append("Seller:");
                    sb.append(this.mSellerId);
                } else if (!TextUtils.isEmpty(this.mShopId)) {
                    sb.append("Navi:");
                    sb.append(this.mShopNavi);
                } else {
                    sb.append("No_id");
                }
                sb.append("UUID:");
                sb.append(this.mParamUUIDForLog);
                this.mParamForLog = sb.toString();
                this.mTracker.a(this.mParamForLog);
            }
            String query = getQuery("currentClickTime");
            if (!TextUtils.isEmpty(query)) {
                try {
                    long parseLong = Long.parseLong(query);
                    this.mCurrentClickTime = parseLong;
                    this.mRouterCost = this.mFirstLineOfOnCreate - parseLong;
                    if (com.taobao.android.shop.utils.a.a().booleanValue()) {
                        com.taobao.android.shop.utils.a.b("main-cost shopperf_currentClickTime. currentClickTime - firstLineOfOnCreate cost", Long.valueOf(this.mRouterCost), "ms.", "currentClickTime - activiyInit = ", Long.valueOf(this.mActivityInitTime - parseLong));
                    }
                    this.mTracker.a("router", this.mRouterCost);
                } catch (Throwable unused) {
                }
            }
            StringBuilder sb2 = new StringBuilder(this.mBundleUrl.replace("data_prefetch=true", "data_prefetch=false"));
            this.mDeviceLevel = MemoryMonitor.c();
            if ("high_end".equals(this.mDeviceLevel)) {
                this.mCheckTime = getCheckTime(this.mDeviceLevel, 1500L);
            } else if ("low_end".equals(this.mDeviceLevel)) {
                this.mCheckTime = getCheckTime(this.mDeviceLevel, 5000L);
            } else {
                this.mCheckTime = getCheckTime(this.mDeviceLevel, 3000L);
            }
            if (WXEnvironment.isApkDebugable()) {
                this.mCheckTime <<= 1;
            }
            long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
            long currentTimeMillis = currentTimeStamp - System.currentTimeMillis();
            sb2.append("&shopRenderDeltaTime=");
            sb2.append(currentTimeMillis);
            sb2.append("&shopRenderWeexShopToken=");
            sb2.append(currentTimeStamp);
            sb2.append("&shopRenderDeviceLevel=");
            sb2.append(this.mDeviceLevel);
            sb2.append("&shopRenderIsLogin=");
            sb2.append(Login.checkSessionValid());
            boolean z = this.mUseBackgroundJSThread && !sDebugDisableWeexSDKBackThread && "true".equals(OrangeConfig.getInstance().getConfig("android_weex_ext_config", "enableBackUpThread", "true"));
            sb2.append("&shopRenderJSBackThread=");
            sb2.append(z);
            if (sDebugEndableJSReport) {
                sb2.append("&enableShopReport=true");
            }
            sb2.append("&_useless1=1");
            if (this.mQueryMap != null) {
                this.mQueryMap.put("shopRenderDeltaTime", String.valueOf(currentTimeMillis));
                this.mQueryMap.put("shopRenderDeviceLevel", this.mDeviceLevel);
                this.mQueryMap.put("shopRenderWeexShopToken", String.valueOf(currentTimeStamp));
                this.mQueryMap.put("shopRenderIsLogin", String.valueOf(Login.checkSessionValid()));
                this.mQueryMap.put("shopRenderJSBackThread", String.valueOf(z));
                if (sDebugEndableJSReport) {
                    this.mQueryMap.put("enableShopReport", "true");
                }
            }
            this.mBundleUrl = sb2.toString();
            this.mTracker.b(this.mBundleUrl);
            this.mWeexUrl = this.mBundleUrl;
        } catch (Throwable th) {
            com.taobao.android.shop.utils.a.a("-52005", "error in isParamValid.", th, this.mParamForLog, this.mBundleUrl);
            this.mTracker.a("-52005", "error in isParamValid.", "pageRender", th, new Object[0]);
        }
        WXLogUtils.d(TAG, "bundleUrl:" + this.mBundleUrl);
        WXLogUtils.d(TAG, "weexUrl:" + this.mWeexUrl);
        return true;
    }

    private long getCheckTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d78b3e28", new Object[]{this, str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "checkTime_" + str, String.valueOf(j)));
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    private Map<String, String> queryMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c455507a", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null || !str.contains("?")) {
            return hashMap;
        }
        int indexOf = str.indexOf("?") + 1;
        do {
            int indexOf2 = str.indexOf(38, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 > indexOf2 || indexOf3 == -1) {
                indexOf3 = indexOf2;
            }
            if (indexOf3 > indexOf) {
                String substring = str.substring(indexOf, indexOf3);
                int i = indexOf3 + 1;
                hashMap.put(Uri.decode(substring), Uri.decode(i <= indexOf2 ? str.substring(i, indexOf2) : ""));
            }
            indexOf = indexOf2 + 1;
        } while (indexOf < str.length());
        return hashMap;
    }

    private Map<String, String> queryMap2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a18aa344", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        Uri parse = Uri.parse(str);
        if (parse != null && parse.isHierarchical()) {
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put(str2, parse.getQueryParameter(str2));
                }
            }
        }
        return hashMap;
    }

    private boolean isParamTrue(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f00bd96", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Map<String, String> map = this.mQueryMap;
        if (map == null || !map.containsKey(str) || (str2 = this.mQueryMap.get(str)) == null) {
            return z;
        }
        String lowerCase = str2.toLowerCase();
        return !"false".equals(lowerCase) && !"0".equals(lowerCase);
    }

    private String getQuery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3e05edd", new Object[]{this, str});
        }
        Map<String, String> map = this.mQueryMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private boolean isEnvironmentReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43817025", new Object[]{this})).booleanValue();
        }
        boolean isDegrade = TBWXConfigManger.getInstance().isDegrade();
        boolean isCPUSupport = WXEnvironment.isCPUSupport();
        if (WXEnvironment.isApkDebugable()) {
            WXLogUtils.d(TAG, "Debug 模式下强制开启support=true,原始的WXEnvironment.isCPUSupport()为" + isCPUSupport);
            isCPUSupport = true;
        }
        boolean isInitialized = WXSDKEngine.isInitialized();
        WXLogUtils.d(TAG, "degrade:" + isDegrade + " support:" + isCPUSupport + " init:" + isInitialized);
        return !isDegrade && isCPUSupport && isInitialized;
    }

    private void chooseAppBarMode(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b854301", new Object[]{this, bundle});
            return;
        }
        try {
            try {
                this.actionBarOverlay = isParamTrue("wx_navbar_transparent", false);
                if (this.actionBarOverlay) {
                    supportRequestWindowFeature(109);
                } else {
                    supportRequestWindowFeature(8);
                }
            } finally {
                getWindow().setFormat(-3);
                super.onCreate(bundle);
            }
        } catch (Throwable unused) {
            supportRequestWindowFeature(8);
        }
    }

    private void hideAppBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcdf49b", new Object[]{this});
            return;
        }
        try {
            boolean isParamTrue = isParamTrue("wx_navbar_hidden", false);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null || !isParamTrue) {
                return;
            }
            supportActionBar.e();
            this.mActionBarShow = false;
        } catch (Exception e2) {
            WXLogUtils.e(TAG, e2);
        }
    }

    private Pair<Boolean, StatusBarTextColor> hideStatusBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("348d4b69", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                String queryParameter = Uri.parse(this.mWeexUrl).getQueryParameter(WX_STATUSBAR_HIDDEN);
                if (TextUtils.equals(queryParameter, Boolean.toString(true))) {
                    return new Pair<>(true, StatusBarTextColor.Undefine);
                }
                if (TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_DARK_TEXT)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        return new Pair<>(true, StatusBarTextColor.Dark);
                    }
                    return new Pair<>(false, StatusBarTextColor.Dark);
                } else if (TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        return new Pair<>(true, StatusBarTextColor.Light);
                    }
                    return new Pair<>(false, StatusBarTextColor.Light);
                }
            } catch (Exception e2) {
                WXLogUtils.e(TAG, e2);
            }
        }
        return new Pair<>(false, StatusBarTextColor.Undefine);
    }

    public void setNaviTransparent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15858463", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.fake_title);
        if (imageView != null) {
            View findViewById = findViewById(R.id.action_bar);
            if (z) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (findViewById != null) {
                    layoutParams.height = findViewById.getHeight() > 0 ? findViewById.getHeight() : findViewById.getMeasuredHeight();
                    imageView.setLayoutParams(layoutParams);
                }
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        View findViewById2 = findViewById(R.id.action_bar_container);
        int i = z ? 17170443 : 17170445;
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(getResources().getColor(i));
        }
        View findViewById3 = findViewById(R.id.action_bar);
        if (findViewById3 == null) {
            return;
        }
        findViewById3.setBackgroundColor(getResources().getColor(i));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:38|(10:93|42|43|(1:(6:46|47|48|49|(10:51|(1:53)(1:75)|54|(1:56)(1:74)|57|(1:59)(1:73)|60|61|62|63)(1:76)|64)(4:79|80|81|82))(1:88)|83|47|48|49|(0)(0)|64)|41|42|43|(0)(0)|83|47|48|49|(0)(0)|64) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0185, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
        r11 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6 A[Catch: Throwable -> 0x01a9, TRY_LEAVE, TryCatch #7 {Throwable -> 0x01a9, blocks: (B:38:0x00ba, B:42:0x00c6), top: B:109:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6 A[Catch: Throwable -> 0x0185, TryCatch #4 {Throwable -> 0x0185, blocks: (B:44:0x00f0, B:46:0x00f6, B:48:0x010d, B:50:0x011a, B:52:0x0127, B:54:0x0134, B:56:0x0142, B:58:0x0153, B:57:0x0151, B:53:0x0132, B:49:0x0118), top: B:103:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fc  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void degradeToWindVane(android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.degradeToWindVane(android.content.Intent):void");
    }

    private String assemblePageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d39fa303", new Object[]{this, str});
        }
        try {
            return !TextUtils.isEmpty(str) ? Uri.parse(str).buildUpon().clearQuery().build().toString() : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (this.mAnalyzerDelegate != null) {
                this.mAnalyzerDelegate.a(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        com.taobao.android.shop.utils.h hVar = this.mAnalyzerDelegate;
        if (hVar == null) {
            return;
        }
        hVar.b();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.mTracker.f("activityOnResume");
        super.onResume();
        com.taobao.android.shop.utils.h hVar = this.mAnalyzerDelegate;
        if (hVar != null) {
            hVar.c();
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(this.mDegradeReceive, new IntentFilter(ACTION_DEGRADE_TO_WINDVANE));
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(com.taobao.android.miniLive.sdk.d.PAGE_SHOP_RESUME_ACTION));
        if (this.actionBarOverlay) {
            View findViewById = findViewById(R.id.action_bar_container);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(17170445));
            }
            View findViewById2 = findViewById(R.id.action_bar);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(17170445));
            }
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "enable_apm_page_change", "true"))) {
            this.mShopPageListener = new f();
            com.taobao.application.common.c.a(this.mShopPageListener);
        }
        this.mTracker.g("activityOnResume");
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        try {
            updateFirstScreenTime();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.taobao.android.shop.utils.h hVar = this.mAnalyzerDelegate;
        if (hVar != null) {
            hVar.d();
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.mDegradeReceive);
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(com.taobao.android.miniLive.sdk.d.PAGE_SHOP_PAUSE_ACTION));
        if (this.mFetchDataListener != null) {
            NavPrefetchShopFetchManager.getInstance().removeFetchDataListener(this.mFetchDataListener);
        }
        f fVar = this.mShopPageListener;
        if (fVar == null) {
            return;
        }
        com.taobao.application.common.c.b(fVar);
    }

    /* loaded from: classes6.dex */
    public class f implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f15095a;
        public long b;
        public long c;
        public AtomicBoolean d;
        public AtomicBoolean e;

        static {
            kge.a(1182197160);
            kge.a(-697716806);
        }

        private f() {
            this.f15095a = 0L;
            this.b = 0L;
            this.c = 0L;
            this.d = new AtomicBoolean(false);
            this.e = new AtomicBoolean(false);
        }

        @Override // com.taobao.application.common.IPageListener
        public void a(String str, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
            } else if ("com.taobao.android.shop.activity.PerfPanelFragment".equals(str)) {
            } else {
                if (this.f15095a == 0) {
                    this.f15095a = j;
                }
                if (2 == i) {
                    this.b = j;
                } else if (3 != i) {
                } else {
                    try {
                        this.c = j;
                        ShopRenderActivity.this.mApmInteractiveCost = this.c - this.f15095a;
                        HashMap hashMap = new HashMap();
                        if (this.b > 0 && this.f15095a > 0) {
                            hashMap.put("visible", Long.valueOf(this.b - this.f15095a));
                        }
                        if (this.f15095a > 0) {
                            hashMap.put(pqe.STAGE_INTERACTIVE, Long.valueOf(this.c - this.f15095a));
                        }
                        hashMap.put("page", TextUtils.isEmpty(ShopRenderActivity.access$1800(ShopRenderActivity.this)) ? "home" : ShopRenderActivity.access$1800(ShopRenderActivity.this));
                        if (str != null && "com.taobao.android.shop.activity.ShopRenderActivity$WeexInnerPageFragment".equals(str)) {
                            ShopRenderActivity.this.showTotalCostLog("apm_render_finish", ShopRenderActivity.this.mApmInteractiveCost, null);
                            this.e.set(true);
                        } else if (str != null && "allitems".equals(ShopRenderActivity.access$1800(ShopRenderActivity.this)) && !this.e.get()) {
                            ShopRenderActivity.this.showTotalCostLog("apm_render_finish", ShopRenderActivity.this.mApmInteractiveCost, hashMap);
                            this.e.set(true);
                        }
                        if (ShopRenderActivity.access$1900(ShopRenderActivity.this) == null || TextUtils.isEmpty(ShopRenderActivity.access$1900(ShopRenderActivity.this).getRenderUrl()) || ShopRenderActivity.access$1900(ShopRenderActivity.this).getWXSDKInstance() == null || !this.d.compareAndSet(false, true)) {
                            return;
                        }
                        ShopRenderActivity.access$1900(ShopRenderActivity.this).getWXSDKInstance().a("native_apm", (Map<String, Object>) hashMap);
                    } catch (Throwable th) {
                        com.taobao.android.shop.utils.a.a("-52014", "error in Apm onPageChanged.", th, str, Integer.valueOf(i), ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                        ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-52014", "error in Apm onPageChanged.", "eventProcess", th, str, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.android.shop.utils.h hVar = this.mAnalyzerDelegate;
        if (hVar == null) {
            return;
        }
        hVar.e();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (!this.mIsDegrade) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ixe.a().b(this);
        com.taobao.android.shop.utils.h hVar = this.mAnalyzerDelegate;
        if (hVar != null) {
            hVar.f();
        }
        try {
            unregisterComponentCallbacks(this.mLowMemoryTrim);
            NavPrefetchShopFetchManager.getInstance().clear();
            clearCallback();
            this.mJsCallback = null;
            if (this.mPageFragment != null && this.mPageFragment.getActivity() != null) {
                this.mPageFragment.onDestroy();
            }
            if (this.mInnerPageFragment == null || this.mInnerPageFragment.getActivity() == null) {
                return;
            }
            this.mInnerPageFragment.onDestroy();
        } catch (Throwable th) {
            com.taobao.android.shop.utils.a.a("-52001", "error in onDestroy.", th, this.mParamForLog, this.mBundleUrl);
            this.mTracker.a("-52001", "error in onDestroy.", "pageRender", th, new Object[0]);
        }
    }

    private void updateFirstScreenTime() {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3baca7", new Object[]{this});
        } else if (!com.taobao.android.shop.utils.g.c(this.mWeexUrl) || (weexPageFragment = this.mInnerPageFragment) == null) {
        } else {
            WXSDKInstance wXSDKInstance = weexPageFragment.getWXSDKInstance();
            try {
                if (!wXSDKInstance.ar().f23517a.containsKey("wxInteraction")) {
                    return;
                }
                long longValue = wXSDKInstance.ar().f23517a.get("wxInteraction").longValue();
                if (longValue <= 0) {
                    return;
                }
                pageFinishCommit("https://market.m.taobao.com/apps/market/shop/weex_v2.html", longValue);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (this.mHookBackPress && (weexPageFragment = this.mPageFragment) != null && weexPageFragment.getWXSDKInstance() != null) {
            this.mPageFragment.getWXSDKInstance().a("backPressed", (Map<String, Object>) new HashMap());
        } else if (processOnBackPressed()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        if (this.mUseFestivalActionbar) {
            FestivalMgr.a().a(this, TBActionBar.ActionBarStyle.NORMAL);
        }
        this.mTBPublicMenu = getPublicMenu();
        TBPublicMenu tBPublicMenu = this.mTBPublicMenu;
        if (tBPublicMenu != null) {
            tBPublicMenu.onCreateOptionsMenu(getMenuInflater(), menu);
        }
        return onCreateOptionsMenu;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        return processOnBackPressed() || super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public boolean processOnBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8522e9b8", new Object[]{this})).booleanValue();
        }
        WeexPageFragment weexPageFragment = this.mPageFragment;
        return weexPageFragment != null && !weexPageFragment.isDetached() && this.mPageFragment.onBackPressed();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    /* loaded from: classes6.dex */
    public class h extends WeexPageFragment.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-746039118);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            if (str.hashCode() == 578309873) {
                super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }

        public h() {
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a
        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view});
            }
            View view2 = null;
            if (ShopRenderActivity.access$2100(ShopRenderActivity.this) != null) {
                view2 = ShopRenderActivity.access$2100(ShopRenderActivity.this).a(wXSDKInstance, view);
            }
            if (view2 == null) {
                return view;
            }
            ShopRenderActivity.this.showCostTime("main-cost-render-frame", "after frame onCreateView");
            return view2;
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            if (ShopRenderActivity.access$2100(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$2100(ShopRenderActivity.this).a(wXSDKInstance);
            }
            ShopRenderActivity.access$2200(ShopRenderActivity.this);
            if (ShopRenderActivity.access$2300(ShopRenderActivity.this) != null && ShopRenderActivity.access$2300(ShopRenderActivity.this).getArguments() != null) {
                ShopRenderActivity.access$2300(ShopRenderActivity.this).getArguments().remove(WeexPageFragment.FRAGMENT_ARG_TEMPLATE);
            }
            AppMonitor.Alarm.commitSuccess("weex", "renderResult", ShopRenderActivity.access$2400(ShopRenderActivity.this));
            ShopRenderActivity.this.showCostTime("main-cost-render-frame", "after frame onRenderSuccess. just log");
            ShopRenderActivity.access$1300(ShopRenderActivity.this).g("frameJSRender");
            if (ShopRenderActivity.this.mFrameJSRenderCostStart <= 0) {
                return;
            }
            ShopRenderActivity.this.mFrameJSRenderCost = System.currentTimeMillis() - ShopRenderActivity.this.mFrameJSRenderCostStart;
            ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
            shopRenderActivity.mFrameJSRenderCostBegin = shopRenderActivity.mFrameJSRenderCostStart - ShopRenderActivity.access$2500(ShopRenderActivity.this);
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
            shopRenderActivity.showCostTime("main-cost", "frame render exception !!!!!", wXSDKInstance.N() + " " + str2 + " errorCode " + str);
            super.onException(wXSDKInstance, z, str, str2);
            if (ShopRenderActivity.access$2100(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$2100(ShopRenderActivity.this).a(wXSDKInstance, str, str2);
            }
            com.taobao.android.shop.utils.a.a("-60025", "WXRenderListenerImp onException.", Boolean.valueOf(z), str, str2, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
            ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-60025", "WXRenderListenerImp onException.", "downgrade", Boolean.valueOf(z), str, str2);
            if (z) {
                ShopRenderActivity.access$1600(ShopRenderActivity.this, str, str2);
            }
            if (!TextUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
                return;
            }
            try {
                TBErrorView tBErrorView = new TBErrorView(wXSDKInstance.O());
                Error newError = Error.Factory.newError("ANDROID_SYS_NETWORK_ERROR", "网络错误,请稍后再试");
                newError.url = wXSDKInstance.ak();
                tBErrorView.setError(newError);
                tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.h.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (ShopRenderActivity.access$2300(ShopRenderActivity.this) == null || TextUtils.isEmpty(ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalRenderUrl()) || TextUtils.isEmpty(ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalUrl())) {
                        } else {
                            ShopRenderActivity.access$2300(ShopRenderActivity.this).replace(ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalUrl(), ShopRenderActivity.access$2300(ShopRenderActivity.this).getOriginalRenderUrl());
                        }
                    }
                });
                tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                if (ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() != null && (ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() instanceof ViewGroup)) {
                    ((ViewGroup) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).addView(tBErrorView);
                }
                if (ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() == null) {
                    return;
                }
                View findViewById = ShopRenderActivity.access$2300(ShopRenderActivity.this).getView().findViewById(R.id.wa_content_error_root);
                if (findViewById != null) {
                    findViewById.setVisibility(4);
                } else if ((ShopRenderActivity.access$2300(ShopRenderActivity.this).getView() instanceof FrameLayout) && ((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildCount() > 0) {
                    for (int i = 0; i < ((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildCount(); i++) {
                        if (((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildAt(i) instanceof RelativeLayout) {
                            ((FrameLayout) ShopRenderActivity.access$2300(ShopRenderActivity.this).getView()).getChildAt(i).setVisibility(4);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                com.taobao.android.shop.utils.a.a("-52002", "error in render TBErrorView.", th, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
                ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-52002", "error in render TBErrorView.", "downgrade", th, new Object[0]);
            }
        }
    }

    private void sendDegradeBoradcast(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efdc554", new Object[]{this, str, str2});
            return;
        }
        WeexPageFragment weexPageFragment = this.mPageFragment;
        if (weexPageFragment != null) {
            weexPageFragment.destroyWeex();
        }
        WeexPageFragment weexPageFragment2 = this.mInnerPageFragment;
        if (weexPageFragment2 != null) {
            weexPageFragment2.destroyWeex();
        }
        Intent intent = new Intent(ACTION_DEGRADE_TO_WINDVANE);
        intent.putExtra(riu.c, this.mBundleUrl);
        intent.putExtra(DEGRADE_TYPE, DEGRADE_TYPE_JS_ERROR);
        intent.putExtra(DEGRADE_MSG, "降级到h5 Instance创建失败或者网络错误ErrorCode= " + str + "详细错误信息\n" + str2);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        AppMonitor.Alarm.commitFail("weex", "renderResult", generateAppMonitorArgs(), "99301", str2);
    }

    private Map<String, String> generateAppMonitorArgsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("605b8c4d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", TextUtils.isEmpty(this.mBundleUrl) ? getIntent().getStringExtra(riu.c) : this.mBundleUrl);
        hashMap.put("bundleUrl", TextUtils.isEmpty(this.mBundleUrl) ? getIntent().getStringExtra(riu.c) : this.mBundleUrl);
        hashMap.put("pageName", TextUtils.isEmpty(this.mPageName) ? assemblePageName(getIntent().getStringExtra(riu.c)) : this.mPageName);
        return hashMap;
    }

    private String generateAppMonitorArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc42468e", new Object[]{this}) : JSON.toJSONString(generateAppMonitorArgsMap());
    }

    private void processPreVisitCdnDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2b8566", new Object[]{this});
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("shopRender-preVisitCdn-downgrade") { // from class: com.taobao.android.shop.activity.ShopRenderActivity.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str = ShopRenderActivity.access$2600(ShopRenderActivity.this) ? "//campaign.wapa.taobao.com" : "//campaigncdn.m.taobao.com";
                    ShopRenderActivity.access$2700(ShopRenderActivity.this, OrangeConfig.getInstance().getConfig("shop_render", "shop_downgrade_prerequest_url", str + "/moduledata/downgrade.htm?dataId=taobao"), "downgrade");
                }
            }, 35);
        }
    }

    private String prepareShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a52fe761", new Object[]{this});
        }
        String str = this.mShopId;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(getIntent().getStringExtra(riu.c));
        if (!parse.isHierarchical()) {
            return str;
        }
        String queryParameter = parse.getQueryParameter("shopId");
        this.mShopId = queryParameter;
        return queryParameter;
    }

    private void processFetchDataResult(final Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a4c1ef", new Object[]{this, obj, new Long(j)});
        } else if (this.mIsProcessedFetchDataResult) {
            com.taobao.android.shop.utils.a.a("main-cost", "navFetchData has been processed");
        } else {
            this.mIsProcessedFetchDataResult = true;
            SoftReference<JSCallback> softReference = this.mFetchCallback;
            if (softReference != null && softReference.get() != null) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("result", "success");
                hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, obj);
                this.mFetchCallback.get().invoke(hashMap);
                this.mFetchCallback.clear();
            } else {
                this.mDataResponseMap.put("fetch", obj);
            }
            this.mTracker.a(FeatureStatistics.FeatureNames.DATA_PREFETCH, System.currentTimeMillis() - j);
            this.mDataPrefetchCost = System.currentTimeMillis() - j;
            this.mDataPrefetchCostBegin = j - this.mCurrentClickTime;
            Coordinator.execute(new Coordinator.TaggedRunnable("prefetchx-onComplete-shopRender") { // from class: com.taobao.android.shop.activity.ShopRenderActivity.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't wrap try/catch for region: R(17:6|7|8|(1:10)(2:81|(1:83)(13:84|12|13|14|15|(1:17)|18|(1:20)|22|23|(2:27|(1:29)(1:30))|31|(2:33|34)(4:35|(8:39|(1:45)|46|(12:48|(1:50)|51|(1:53)|54|55|(1:68)|59|(1:67)|63|(1:65)|66)|69|(1:71)|72|73)|74|75)))|11|12|13|14|15|(0)|18|(0)|22|23|(3:25|27|(0)(0))|31|(0)(0)) */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
                    r12 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
                    com.taobao.android.shop.utils.a.a("-52003", "error in findInnerUrlFromFetchResponse.", r0, com.taobao.android.shop.activity.ShopRenderActivity.access$1200(r19.b), r19.b.mBundleUrl);
                    com.taobao.android.shop.activity.ShopRenderActivity.access$1300(r19.b).a("-52003", "error in findInnerUrlFromFetchResponse.", "dataProcess", r0, new java.lang.Object[0]);
                    r7 = 2;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: Throwable -> 0x007d, TryCatch #0 {Throwable -> 0x007d, blocks: (B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0057), top: B:86:0x0045 }] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: Throwable -> 0x007d, TRY_LEAVE, TryCatch #0 {Throwable -> 0x007d, blocks: (B:17:0x0045, B:19:0x004b, B:20:0x004f, B:22:0x0057), top: B:86:0x0045 }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[Catch: Throwable -> 0x0295, TRY_ENTER, TryCatch #2 {Throwable -> 0x0295, blocks: (B:7:0x001f, B:9:0x0026, B:29:0x00ae, B:32:0x00db, B:34:0x00f0, B:36:0x00f8, B:37:0x0112, B:38:0x012b, B:40:0x0137, B:42:0x0143, B:46:0x014e, B:48:0x0156, B:50:0x0162, B:52:0x016e, B:53:0x0179, B:55:0x0185, B:57:0x018f, B:58:0x019e, B:61:0x01aa, B:64:0x01d5, B:67:0x01e2, B:69:0x01e8, B:72:0x01f5, B:75:0x01fd, B:71:0x01ee, B:66:0x01db, B:76:0x022a, B:78:0x0234, B:79:0x0243, B:81:0x025c, B:28:0x0081, B:11:0x002c, B:13:0x0032), top: B:90:0x001f }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00f8 A[Catch: Throwable -> 0x0295, TryCatch #2 {Throwable -> 0x0295, blocks: (B:7:0x001f, B:9:0x0026, B:29:0x00ae, B:32:0x00db, B:34:0x00f0, B:36:0x00f8, B:37:0x0112, B:38:0x012b, B:40:0x0137, B:42:0x0143, B:46:0x014e, B:48:0x0156, B:50:0x0162, B:52:0x016e, B:53:0x0179, B:55:0x0185, B:57:0x018f, B:58:0x019e, B:61:0x01aa, B:64:0x01d5, B:67:0x01e2, B:69:0x01e8, B:72:0x01f5, B:75:0x01fd, B:71:0x01ee, B:66:0x01db, B:76:0x022a, B:78:0x0234, B:79:0x0243, B:81:0x025c, B:28:0x0081, B:11:0x002c, B:13:0x0032), top: B:90:0x001f }] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0112 A[Catch: Throwable -> 0x0295, TryCatch #2 {Throwable -> 0x0295, blocks: (B:7:0x001f, B:9:0x0026, B:29:0x00ae, B:32:0x00db, B:34:0x00f0, B:36:0x00f8, B:37:0x0112, B:38:0x012b, B:40:0x0137, B:42:0x0143, B:46:0x014e, B:48:0x0156, B:50:0x0162, B:52:0x016e, B:53:0x0179, B:55:0x0185, B:57:0x018f, B:58:0x019e, B:61:0x01aa, B:64:0x01d5, B:67:0x01e2, B:69:0x01e8, B:72:0x01f5, B:75:0x01fd, B:71:0x01ee, B:66:0x01db, B:76:0x022a, B:78:0x0234, B:79:0x0243, B:81:0x025c, B:28:0x0081, B:11:0x002c, B:13:0x0032), top: B:90:0x001f }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0137 A[Catch: Throwable -> 0x0295, TryCatch #2 {Throwable -> 0x0295, blocks: (B:7:0x001f, B:9:0x0026, B:29:0x00ae, B:32:0x00db, B:34:0x00f0, B:36:0x00f8, B:37:0x0112, B:38:0x012b, B:40:0x0137, B:42:0x0143, B:46:0x014e, B:48:0x0156, B:50:0x0162, B:52:0x016e, B:53:0x0179, B:55:0x0185, B:57:0x018f, B:58:0x019e, B:61:0x01aa, B:64:0x01d5, B:67:0x01e2, B:69:0x01e8, B:72:0x01f5, B:75:0x01fd, B:71:0x01ee, B:66:0x01db, B:76:0x022a, B:78:0x0234, B:79:0x0243, B:81:0x025c, B:28:0x0081, B:11:0x002c, B:13:0x0032), top: B:90:0x001f }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0143 A[Catch: Throwable -> 0x0295, TryCatch #2 {Throwable -> 0x0295, blocks: (B:7:0x001f, B:9:0x0026, B:29:0x00ae, B:32:0x00db, B:34:0x00f0, B:36:0x00f8, B:37:0x0112, B:38:0x012b, B:40:0x0137, B:42:0x0143, B:46:0x014e, B:48:0x0156, B:50:0x0162, B:52:0x016e, B:53:0x0179, B:55:0x0185, B:57:0x018f, B:58:0x019e, B:61:0x01aa, B:64:0x01d5, B:67:0x01e2, B:69:0x01e8, B:72:0x01f5, B:75:0x01fd, B:71:0x01ee, B:66:0x01db, B:76:0x022a, B:78:0x0234, B:79:0x0243, B:81:0x025c, B:28:0x0081, B:11:0x002c, B:13:0x0032), top: B:90:0x001f }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 706
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.AnonymousClass13.run():void");
                }
            }, 20);
        }
    }

    private void preloadFetchImage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2e5595", new Object[]{this, str, jSONObject});
            return;
        }
        this.mTracker.f("preloadFetchImage");
        if (jSONObject == null || !this.mUseImagePreload) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        findImageUrlInJson(jSONObject, arrayList, new HashMap());
        if (arrayList.size() > 0) {
            doPreloadImage(arrayList);
        }
        if (com.taobao.android.shop.utils.a.a().booleanValue()) {
            this.mFetchImageCost = (System.currentTimeMillis() - this.mCurrentClickTime) - this.mFetchImageCostBegin;
        }
        this.mTracker.g("preloadFetchImage");
    }

    private void preloadPagedataImage(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cedad92", new Object[]{this, str, jSONArray});
            return;
        }
        this.mTracker.f("preloadPagedataImage");
        if (jSONArray == null || !this.mUseImagePreload) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                findImageUrlInJson((JSONObject) next, arrayList, new HashMap());
            }
        }
        if (arrayList.size() > 0) {
            doPreloadImage(arrayList);
        }
        if (com.taobao.android.shop.utils.a.a().booleanValue()) {
            this.mPagedataImageCost = (System.currentTimeMillis() - this.mCurrentClickTime) - this.mPagedataImageCostBegin;
        }
        this.mTracker.g("preloadPagedataImage");
    }

    private void doPreloadImage(List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113453f5", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (e eVar : list) {
                if (!TextUtils.isEmpty(eVar.b)) {
                    arrayList.add(eVar.f15094a + eVar.b);
                } else if (eVar.d) {
                    arrayList.add(eVar.f15094a);
                } else if (eVar.c) {
                    arrayList.add(TaobaoImageUrlStrategy.getInstance().decideUrl(eVar.f15094a, 360, getImageStrategyConfig()));
                }
            }
        }
        if (arrayList.size() > 0) {
            com.taobao.phenix.intf.b.h().a("common", arrayList).a();
        }
        showCostTime("main-cost", "preload image ", arrayList);
    }

    private ImageStrategyConfig getImageStrategyConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("3cbb9008", new Object[]{this});
        }
        if (this.mImageStrategyConfig == null) {
            synchronized (this) {
                if (this.mImageStrategyConfig == null) {
                    ImageStrategyConfig.a a2 = ImageStrategyConfig.a("shop", 0);
                    a2.a(TaobaoImageUrlStrategy.ImageQuality.q90);
                    a2.f(false);
                    this.mImageStrategyConfig = a2.a();
                }
            }
        }
        return this.mImageStrategyConfig;
    }

    private void findImageUrlInJson(JSONObject jSONObject, List<e> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5879205", new Object[]{this, jSONObject, list, map});
        } else if (list.size() < 3) {
            try {
                if (jSONObject.containsKey("width")) {
                    map.put("width", jSONObject.getFloat("width"));
                }
                if (jSONObject.containsKey(AliFestivalWVPlugin.PARAMS_MODULE_NAME)) {
                    map.put(AliFestivalWVPlugin.PARAMS_MODULE_NAME, jSONObject.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME));
                }
            } catch (Throwable unused) {
            }
            for (String str : jSONObject.keySet()) {
                if (!"defaultImage".equals(str) && !"designer_image_url".equals(str)) {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!TextUtils.isEmpty(str2) && (str2.contains(".png") || str2.contains(".jpg"))) {
                            if (str2.contains("gw.alicdn.com") || str2.contains("img.alicdn.com")) {
                                try {
                                    Float f2 = null;
                                    if ("bgImageUrl".equals(str)) {
                                        e eVar = new e();
                                        eVar.f15094a = str2;
                                        eVar.b = "_640x640q90.jpg";
                                        list.add(eVar);
                                    } else if ("shopLogo".equals(str)) {
                                        e eVar2 = new e();
                                        eVar2.f15094a = str2;
                                        eVar2.b = "_200x200q90.jpg";
                                        list.add(eVar2);
                                    } else if (jSONObject.containsKey("height") && !TextUtils.isEmpty(jSONObject.getString("height")) && jSONObject.getFloat("height").floatValue() >= 200.0f) {
                                        e eVar3 = new e();
                                        eVar3.f15094a = str2;
                                        if (jSONObject.containsKey("width")) {
                                            f2 = jSONObject.getFloat("width");
                                        }
                                        if (f2 == null && map.get("width") != null) {
                                            f2 = Float.valueOf(Float.parseFloat(String.valueOf(map.get("width"))));
                                        }
                                        if (f2 != null && (f2.floatValue() == 640.0f || f2.floatValue() == 750.0f)) {
                                            eVar3.c = true;
                                        }
                                        if (map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME) != null && "11ace51f080ed1dac402cc6ed3c883db".equals(map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME))) {
                                            eVar3.d = true;
                                        }
                                        list.add(eVar3);
                                        if (list.size() >= 3) {
                                            return;
                                        }
                                    }
                                } catch (Throwable th) {
                                    com.taobao.android.shop.utils.a.a("-52004", "error in process preload image.", th, this.mParamForLog, this.mBundleUrl);
                                    this.mTracker.a("-52004", "error in process preload image.", "pageRender", th, new Object[0]);
                                }
                            }
                        }
                    } else if (obj instanceof JSONObject) {
                        findImageUrlInJson((JSONObject) obj, list, map);
                    } else if (obj instanceof JSONArray) {
                        Iterator<Object> it = ((JSONArray) obj).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof JSONObject) {
                                findImageUrlInJson((JSONObject) next, list, map);
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f15094a;
        public String b;
        public boolean c;
        public boolean d;

        static {
            kge.a(-777211956);
        }

        private e() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15094a);
            String str = this.b;
            if (str != null) {
                sb.append(str);
                sb.append(" ");
            }
            if (this.c) {
                sb.append("fullWidth");
            }
            if (this.d) {
                sb.append("orignalSize");
            }
            return sb.toString();
        }
    }

    private void preVistCdn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dca731", new Object[]{this, str, str2});
            return;
        }
        recordCostTime("main-cost preVistCdn " + str.hashCode(), System.currentTimeMillis());
        if ("downgrade".equals(str2)) {
            this.mTracker.f("preVistCdn-downgrade");
        } else if ("pagedata".equals(str2)) {
            this.mTracker.f("preVistCdn-pagedata");
        }
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setBizId("shop");
        requestImpl.addHeader("f-refer", "weex");
        requestImpl.setMethod("GET");
        requestImpl.setCharset("UTF-8");
        requestImpl.setRetryTime(1);
        requestImpl.setConnectTimeout(3000);
        requestImpl.addHeader(HttpConstant.USER_AGENT, com.taobao.weex.http.b.a(WXEnvironment.getApplication(), WXEnvironment.getConfig()));
        try {
            new DegradableNetwork(getApplication()).asyncSend(requestImpl, requestImpl, null, new d(str, str2));
        } catch (Throwable th) {
            com.taobao.android.shop.utils.a.a("-52041", "error in preVistCdn.", th, this.mParamForLog, this.mBundleUrl);
            this.mTracker.a("-52041", "error in preVistCdn.", "dataProcess", th, new Object[0]);
        }
    }

    /* loaded from: classes6.dex */
    public class d implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private String c;
        private ByteArrayOutputStream d = new ByteArrayOutputStream();

        static {
            kge.a(-287982358);
            kge.a(-324998464);
            kge.a(-501869850);
        }

        public d(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (progressEvent == null) {
            } else {
                this.d.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0277 A[Catch: Throwable -> 0x0337, TryCatch #1 {Throwable -> 0x0337, blocks: (B:13:0x006b, B:16:0x0076, B:19:0x0095, B:21:0x009f, B:42:0x0277, B:44:0x027f, B:46:0x0287, B:48:0x0293, B:51:0x02cd, B:53:0x02d5, B:55:0x02df, B:56:0x02f3, B:58:0x02fd, B:59:0x030c, B:62:0x0316, B:64:0x0329, B:50:0x02c2, B:23:0x00dd, B:24:0x00e5, B:26:0x00ef, B:27:0x0156, B:28:0x015c, B:32:0x0164, B:34:0x0171, B:36:0x0179, B:39:0x0213), top: B:71:0x006b, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x02c2 A[Catch: Throwable -> 0x0337, TryCatch #1 {Throwable -> 0x0337, blocks: (B:13:0x006b, B:16:0x0076, B:19:0x0095, B:21:0x009f, B:42:0x0277, B:44:0x027f, B:46:0x0287, B:48:0x0293, B:51:0x02cd, B:53:0x02d5, B:55:0x02df, B:56:0x02f3, B:58:0x02fd, B:59:0x030c, B:62:0x0316, B:64:0x0329, B:50:0x02c2, B:23:0x00dd, B:24:0x00e5, B:26:0x00ef, B:27:0x0156, B:28:0x015c, B:32:0x0164, B:34:0x0171, B:36:0x0179, B:39:0x0213), top: B:71:0x006b, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x02d5 A[Catch: Throwable -> 0x0337, TryCatch #1 {Throwable -> 0x0337, blocks: (B:13:0x006b, B:16:0x0076, B:19:0x0095, B:21:0x009f, B:42:0x0277, B:44:0x027f, B:46:0x0287, B:48:0x0293, B:51:0x02cd, B:53:0x02d5, B:55:0x02df, B:56:0x02f3, B:58:0x02fd, B:59:0x030c, B:62:0x0316, B:64:0x0329, B:50:0x02c2, B:23:0x00dd, B:24:0x00e5, B:26:0x00ef, B:27:0x0156, B:28:0x015c, B:32:0x0164, B:34:0x0171, B:36:0x0179, B:39:0x0213), top: B:71:0x006b, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x02fd A[Catch: Throwable -> 0x0337, TryCatch #1 {Throwable -> 0x0337, blocks: (B:13:0x006b, B:16:0x0076, B:19:0x0095, B:21:0x009f, B:42:0x0277, B:44:0x027f, B:46:0x0287, B:48:0x0293, B:51:0x02cd, B:53:0x02d5, B:55:0x02df, B:56:0x02f3, B:58:0x02fd, B:59:0x030c, B:62:0x0316, B:64:0x0329, B:50:0x02c2, B:23:0x00dd, B:24:0x00e5, B:26:0x00ef, B:27:0x0156, B:28:0x015c, B:32:0x0164, B:34:0x0171, B:36:0x0179, B:39:0x0213), top: B:71:0x006b, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0314 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:73:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v61, types: [com.alibaba.fastjson.JSONObject] */
        /* JADX WARN: Type inference failed for: r21v1, types: [com.alibaba.fastjson.JSONObject] */
        @Override // anetwork.channel.NetworkCallBack.FinishListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFinished(anetwork.channel.NetworkEvent.FinishEvent r25, java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 882
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.d.onFinished(anetwork.channel.NetworkEvent$FinishEvent, java.lang.Object):void");
        }
    }

    private String findInnerUrlFromFetchResponse(Map<String, Object> map, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONArray jSONArray;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e96a8d97", new Object[]{this, map, str});
        }
        if (map != null && (map.get("data") instanceof JSONObject) && !TextUtils.isEmpty(((JSONObject) map.get("data")).getString("parallelRenderUrl"))) {
            return ((JSONObject) map.get("data")).getString("parallelRenderUrl");
        }
        if (map == null || !(map.get("data") instanceof JSONObject)) {
            jSONObject = null;
            jSONObject2 = null;
            jSONObject3 = null;
        } else {
            JSONObject jSONObject6 = (JSONObject) map.get("data");
            jSONObject2 = jSONObject6.getJSONObject("components");
            jSONObject = jSONObject6.getJSONObject("hierarchy");
            jSONObject3 = jSONObject != null ? jSONObject.getJSONObject("structure") : null;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject3 == null) {
            return null;
        }
        String str2 = null;
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            if (entry != null && (entry.getValue() instanceof JSONObject) && (jSONObject5 = ((JSONObject) entry.getValue()).getJSONObject("payload")) != null && str.equals(jSONObject5.getString("name"))) {
                str2 = entry.getKey();
            }
        }
        String string = (str2 == null || (jSONArray = jSONObject3.getJSONArray(str2)) == null || jSONArray.size() <= 0) ? null : jSONArray.getString(0);
        if (string != null && (jSONObject4 = jSONObject2.getJSONObject(string)) != null && jSONObject4.getJSONObject("payload") != null && jSONObject4.getJSONObject("payload").getJSONObject("source") != null) {
            return jSONObject4.getJSONObject("payload").getJSONObject("source").getString("url");
        }
        return null;
    }

    public Object getShopData(String str, Map<String, String> map) {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("87571994", new Object[]{this, str, map});
        }
        recordCostTime("getData " + str, System.currentTimeMillis());
        Object obj = null;
        if ("pagedata".equals(str) || "downgrade".equals(str) || "fetch".equals(str)) {
            obj = this.mDataResponseMap.get(str);
            if (obj == null) {
                com.taobao.android.shop.utils.a.b("main-cost", str, "数据未准备完成 同步。 getting ", str, " sync. but native has NOT got value.");
            }
        } else if ("viewport".equals(str) && (weexPageFragment = this.mPageFragment) != null && weexPageFragment.getWXSDKInstance() != null) {
            float webPxByWidth = WXViewUtils.getWebPxByWidth(this.mPageFragment.getWXSDKInstance().am().getHeight(), this.mPageFragment.getWXSDKInstance().y());
            HashMap hashMap = new HashMap(2);
            hashMap.put("height", Float.valueOf(webPxByWidth));
            obj = hashMap;
        }
        String str2 = "getData " + str;
        Object[] objArr = new Object[1];
        objArr[0] = obj == null ? "null" : "has return value";
        showCostTime(str2, objArr);
        return obj;
    }

    public void getShopData(String str, Map<String, String> map, JSCallback jSCallback) {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9d9e6a", new Object[]{this, str, map, jSCallback});
            return;
        }
        recordCostTime("getData " + str, System.currentTimeMillis());
        Object obj = null;
        if ("fetch".equals(str)) {
            obj = this.mDataResponseMap.get(str);
            if (obj == null) {
                com.taobao.android.shop.utils.a.b("main-cost", "fetch 数据未准备完成 异步。 getting fetch async. but native has NOT got value.");
                this.mFetchCallback = new SoftReference<>(jSCallback);
            }
        } else if ("pagedata".equals(str)) {
            obj = this.mDataResponseMap.get(str);
            if (obj == null) {
                com.taobao.android.shop.utils.a.a("main-cost", "pagedata 数据未准备完成 异步。 getting pagedata async. but native has NOT got value.");
                this.mPagedataCallback = new SoftReference<>(jSCallback);
            }
        } else if ("downgrade".equals(str)) {
            obj = this.mDataResponseMap.get(str);
        } else if ("viewport".equals(str) && (weexPageFragment = this.mPageFragment) != null && weexPageFragment.getWXSDKInstance() != null) {
            float webPxByWidth = WXViewUtils.getWebPxByWidth(this.mPageFragment.getWXSDKInstance().am().getHeight(), this.mPageFragment.getWXSDKInstance().y());
            HashMap hashMap = new HashMap(2);
            hashMap.put("height", Float.valueOf(webPxByWidth));
            obj = hashMap;
        }
        if (obj != null) {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("result", "success");
            hashMap2.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, obj);
            com.taobao.android.shop.utils.a.a("main-cost", "invoke callback, action is", str);
            jSCallback.invoke(hashMap2);
        }
        String str2 = "getData async " + str;
        Object[] objArr = new Object[1];
        objArr[0] = obj == null ? "null" : "has return value";
        showCostTime(str2, objArr);
    }

    public void sendGlobalEvent(String str, Map<String, Object> map, String str2, JSCallback jSCallback) {
        WeexPageFragment weexPageFragment;
        WeexPageFragment weexPageFragment2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cc5579", new Object[]{this, str, map, str2, jSCallback});
            return;
        }
        if ("frame".equals(str2) || "main".equals(str2) || com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT.equals(str2)) {
            z = true;
            z2 = false;
        } else if (!"inner".equals(str2) && !"back".equals(str2) && !"child".equals(str2)) {
            z = true;
        }
        if (z2 && (weexPageFragment2 = this.mInnerPageFragment) != null && weexPageFragment2.getWXSDKInstance() != null) {
            this.mInnerPageFragment.getWXSDKInstance().a(str, map);
        }
        if (z && (weexPageFragment = this.mPageFragment) != null && weexPageFragment.getWXSDKInstance() != null) {
            this.mPageFragment.getWXSDKInstance().a(str, map);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("result", "success");
        jSCallback.invoke(hashMap);
    }

    /* loaded from: classes6.dex */
    public class g extends h implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1243091868);
            kge.a(-1230056088);
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.h, com.alibaba.aliweex.bundle.WeexPageFragment.a
        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view}) : view;
        }

        public g() {
            super();
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.h, com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            ShopRenderActivity.access$3702(ShopRenderActivity.this, view);
            ShopRenderActivity.this.showCostTime("main-cost", "after inner onViewCreated. got innerView");
            ShopRenderActivity.this.showCostTime("main-cost-render-inner", "after inner onViewCreated. got innerView");
            if (ShopRenderActivity.access$1900(ShopRenderActivity.this) != null && ShopRenderActivity.access$1900(ShopRenderActivity.this).getArguments() != null) {
                ShopRenderActivity.access$1900(ShopRenderActivity.this).getArguments().remove(WeexPageFragment.FRAGMENT_ARG_TEMPLATE);
            }
            if (ShopRenderActivity.access$3800(ShopRenderActivity.this) != null && ShopRenderActivity.access$3700(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$3900(ShopRenderActivity.this);
            } else {
                ShopRenderActivity.this.showCostTime("main-cost", "merge-cost inner or embedView = null, 等待前端调用 merge() ");
            }
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.h, com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            if (ShopRenderActivity.access$4000(ShopRenderActivity.this) != null) {
                ShopRenderActivity.access$4100(ShopRenderActivity.this).removeCallbacks(ShopRenderActivity.access$4000(ShopRenderActivity.this));
                ShopRenderActivity.access$4002(ShopRenderActivity.this, null);
            }
            ShopRenderActivity.this.showCostTime("main-cost-render-inner", "after inner onRenderSuccess. just log");
            ShopRenderActivity.access$1300(ShopRenderActivity.this).g("innerJSRender");
            if (ShopRenderActivity.this.mInnerJSRenderCostStart <= 0) {
                return;
            }
            ShopRenderActivity.this.mInnerJSRenderCost = System.currentTimeMillis() - ShopRenderActivity.this.mInnerJSRenderCostStart;
            ShopRenderActivity shopRenderActivity = ShopRenderActivity.this;
            shopRenderActivity.mInnerJSRenderCostBegin = shopRenderActivity.mInnerJSRenderCostStart - ShopRenderActivity.access$2500(ShopRenderActivity.this);
        }

        @Override // com.taobao.android.shop.activity.ShopRenderActivity.h, com.alibaba.aliweex.bundle.WeexPageFragment.a
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            com.taobao.android.shop.utils.a.a("-60026", "WXInnerRenderListenerImp onException", str, str2, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
            ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-60026", "WXInnerRenderListenerImp onException.", "downgrade", str, str2);
            if (ShopRenderActivity.access$1000(ShopRenderActivity.this) == null) {
                return;
            }
            JSCallback access$1000 = ShopRenderActivity.access$1000(ShopRenderActivity.this);
            access$1000.invoke("error. inner render exception. " + str);
            ShopRenderActivity.access$1102(ShopRenderActivity.this, true);
            com.taobao.android.shop.utils.a.a("-60027", "inner render exception.", str, str2, ShopRenderActivity.access$1200(ShopRenderActivity.this), ShopRenderActivity.this.mBundleUrl);
            ShopRenderActivity.access$1300(ShopRenderActivity.this).a("-60027", "inner render exception.", "downgrade", str, str2);
        }
    }

    public void addToParent(final String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43f2051", new Object[]{this, str, jSCallback});
        } else if (this.enabledParallelRender) {
            this.mJsCallback = jSCallback;
            showCostTime("main-cost", "before ComponentObserver.onViewCreated got embedView. ");
            this.mPageFragment.getWXSDKInstance().a(new com.taobao.weex.c() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.c
                public void onCreate(WXComponent wXComponent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dcbed927", new Object[]{this, wXComponent});
                    }
                }

                @Override // com.taobao.weex.c
                public void onPreDestory(WXComponent wXComponent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebb808dc", new Object[]{this, wXComponent});
                    }
                }

                @Override // com.taobao.weex.c
                public void onViewCreated(WXComponent wXComponent, View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9884402", new Object[]{this, wXComponent, view});
                    } else if (wXComponent == null || !wXComponent.getRef().equals(str)) {
                    } else {
                        ShopRenderActivity.this.showCostTime("main-cost", "ComponentObserver.onViewCreated got embedView. will merge() ");
                        ShopRenderActivity.access$3802(ShopRenderActivity.this, (ViewGroup) wXComponent.mo1286getHostView());
                        ShopRenderActivity.access$3900(ShopRenderActivity.this);
                    }
                }
            });
            WXComponent wXComponent = WXSDKManager.getInstance().getWXRenderManager().getWXComponent(this.mPageFragment.getWXSDKInstance().N(), str);
            if (wXComponent != null) {
                this.embedView = (ViewGroup) wXComponent.mo1286getHostView();
            }
            if (this.embedView != null) {
                mergeView();
            }
            this.mOverTimeFailover = new Runnable() { // from class: com.taobao.android.shop.activity.ShopRenderActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|5|6|(1:8)(1:76)|(4:10|(1:12)(1:74)|13|(16:15|(1:17)(1:73)|18|(1:20)(3:60|(2:65|(1:67)(1:(2:69|70)))|72)|21|22|(1:24)(1:55)|25|(1:27)|28|(3:30|(1:32)|33)|(1:35)(3:43|(2:48|(1:50)(0))|54)|36|(1:38)(1:42)|39|40))|75|70|21|22|(0)(0)|25|(0)|28|(0)|(0)(0)|36|(0)(0)|39|40) */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x0157, code lost:
                    if (r9 != null) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x015c, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0169, code lost:
                    if ("true".equals(com.taobao.orange.OrangeConfig.getInstance().getConfig("shop_render", "report_error_of_exception", "true")) != false) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:
                    com.taobao.android.shop.utils.a.a("-52032", "error in checking mRenderListener is null ByWeexSDKInstance.", r0, com.taobao.android.shop.activity.ShopRenderActivity.access$1200(r20.f15083a), r20.f15083a.mBundleUrl);
                    com.taobao.android.shop.activity.ShopRenderActivity.access$1300(r20.f15083a).a("-52032", "error in checking mRenderListener is null ByWeexSDKInstance.", "pageRender", r0, new java.lang.Object[0]);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
                    r8 = -2;
                 */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x011c A[Catch: Throwable -> 0x015c, TryCatch #0 {Throwable -> 0x015c, blocks: (B:42:0x00f9, B:46:0x0105, B:48:0x011c, B:49:0x012a, B:51:0x012e, B:54:0x0139, B:57:0x0148, B:59:0x014c, B:62:0x0151), top: B:79:0x00f9 }] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[Catch: Throwable -> 0x015c, TryCatch #0 {Throwable -> 0x015c, blocks: (B:42:0x00f9, B:46:0x0105, B:48:0x011c, B:49:0x012a, B:51:0x012e, B:54:0x0139, B:57:0x0148, B:59:0x014c, B:62:0x0151), top: B:79:0x00f9 }] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0148 A[Catch: Throwable -> 0x015c, TryCatch #0 {Throwable -> 0x015c, blocks: (B:42:0x00f9, B:46:0x0105, B:48:0x011c, B:49:0x012a, B:51:0x012e, B:54:0x0139, B:57:0x0148, B:59:0x014c, B:62:0x0151), top: B:79:0x00f9 }] */
                /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x01e9  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 582
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.activity.ShopRenderActivity.AnonymousClass3.run():void");
                }
            };
            this.mHandler.postDelayed(this.mOverTimeFailover, this.mCheckTime);
        } else {
            jSCallback.invoke("failed. parallelRender is NOT works (mtop prefetch not return)");
        }
    }

    private void mergeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8533504", new Object[]{this});
        } else if (this.hasCanceledMerge) {
        } else {
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                this.mergeRunnable.run();
            } else {
                runOnUiThread(this.mergeRunnable);
            }
        }
    }

    private void clearCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2286f939", new Object[]{this});
            return;
        }
        Runnable runnable = this.mOverTimeFailover;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mOverTimeFailover = null;
        }
        Runnable runnable2 = this.mErrorParallalRenderFailover;
        if (runnable2 == null) {
            return;
        }
        this.mHandler.removeCallbacks(runnable2);
        this.mErrorParallalRenderFailover = null;
    }

    /* loaded from: classes6.dex */
    public class a implements m.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1466973603);
            kge.a(-1275428669);
        }

        @Override // com.alibaba.aliweex.bundle.m.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            }
        }

        private a() {
        }

        @Override // com.alibaba.aliweex.bundle.m.c
        public View a(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context}) : new FrameLayout(ShopRenderActivity.this);
        }
    }

    public void showTotalCostLog(String str, long j, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380938c2", new Object[]{this, str, new Long(j), map});
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if ("allitems".equals(this.mShopNavi) && map != null && map.containsKey("visible")) {
            valueOf = (Long) map.get("visible");
        }
        long longValue = valueOf.longValue();
        long j2 = this.mCurrentClickTime;
        if (j2 <= 0) {
            j2 = this.mActivityInitTime;
        }
        this.mTotalCost = longValue - j2;
        if (j > 0) {
            this.mTotalCost = j;
        }
        String str2 = com.taobao.android.shop.utils.a.d("main-cost", "totalCost is ", Long.valueOf(this.mTotalCost), "ms", "[ activityInitTime to", str, riy.ARRAY_END_STR) + com.taobao.android.shop.utils.a.d("Detail: ", "interactive=", Long.valueOf(this.mApmInteractiveCost), "router=", Long.valueOf(this.mRouterCost), "activityPrepare=", Long.valueOf(this.mActivityPrepareCost), "dataPrefetch=", Long.valueOf(this.mDataPrefetchCost), "frameJSLoad=", Long.valueOf(this.mFrameJSLoadCost), "frameJSRender=", Long.valueOf(this.mFrameJSRenderCost), "innerJSLoad=", Long.valueOf(this.mInnerJSLoadCost), "innerJSRender=", Long.valueOf(this.mInnerJSRenderCost), "totalUmbrellaCost=", Long.valueOf(this.mTracker.b()), "deviceLevel=", this.mDeviceLevel);
        if (map != null && map.size() > 0) {
            str2 = str2 + " extra arg is " + map.toString();
        }
        Log.e(TAG, str2);
        this.mTracker.a(ept.PAGELOAD, j);
        this.mReadyToShowPerfPanel = true;
        if (!mShowPerfPanel) {
            return;
        }
        showPerfPanel();
        com.taobao.android.shop.utils.a.b("auto_showPerfPanel", this.mShopNaviForLog, this.mParamUUIDForLog);
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        WeexPageFragment weexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            if (!this.mHookBackPress || (weexPageFragment = this.mPageFragment) == null || weexPageFragment.getWXSDKInstance() == null) {
                return processOnBackPressed() || super.onKeyDown(i, keyEvent);
            }
            this.mPageFragment.getWXSDKInstance().a("backPressed", (Map<String, Object>) new HashMap());
            return true;
        } else if (i == 24 && com.taobao.android.shop.utils.a.b() && this.mReadyToShowPerfPanel) {
            if (!mShowPerfPanel) {
                showPerfPanel();
                com.taobao.android.shop.utils.a.b("showPerfPanel", this.mShopNaviForLog, this.mParamUUIDForLog);
            } else {
                hidePerfPanel();
                com.taobao.android.shop.utils.a.b("hidePerfPanel", this.mShopNaviForLog, this.mParamUUIDForLog);
            }
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public synchronized void showPerfPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f2a7a5", new Object[]{this});
            return;
        }
        if (this.mPerfPanel == null) {
            this.mPerfPanel = new PerfPanelFragment();
            getSupportFragmentManager().beginTransaction().add(16908290, this.mPerfPanel, "PerfPanel").addToBackStack("").commit();
        } else {
            getSupportFragmentManager().beginTransaction().show(this.mPerfPanel).commit();
        }
        mShowPerfPanel = true;
    }

    public void hidePerfPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4323d80", new Object[]{this});
        } else if (this.mPerfPanel == null) {
        } else {
            getSupportFragmentManager().beginTransaction().hide(this.mPerfPanel).commit();
            mShowPerfPanel = false;
        }
    }
}
