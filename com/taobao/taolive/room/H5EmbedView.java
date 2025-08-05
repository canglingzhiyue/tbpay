package com.taobao.taolive.room;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.controller2.e;
import com.taobao.taolive.room.controller2.h;
import com.taobao.taolive.room.controller2.k;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedViewContainer;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cgl;
import tb.kge;
import tb.pau;
import tb.pla;
import tb.pmd;
import tb.pnj;
import tb.poz;
import tb.pqj;
import tb.psm;

/* loaded from: classes8.dex */
public class H5EmbedView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int H5EmbedVersion = 1;
    private static final String PARAM_KEY_ACTIVITY = "activity";
    private static final String PARAM_KEY_CUSTOMPLAYCTRLPARAMS = "customPlayCtrlParams";
    private static final String PARAM_KEY_DRAWDELAYED = "drawDelayed";
    private static final String PARAM_KEY_ENABLEHORIZONTALSCROLL = "enableHorizontalScroll";
    private static final String PARAM_KEY_ENABLEVERTICALSCROLL = "enableVerticalScroll";
    private static final String PARAM_KEY_H5UTPAGENAME = "h5UTPageForLive";
    private static final String PARAM_KEY_H5UTPARAMS = "h5UTParamsForLive";
    private static final String PARAM_KEY_HIDECLOSE = "isHideClose";
    private static final String PARAM_KEY_HIDEFULLSCREENBTN = "isHideFullScreenBtn";
    private static final String PARAM_KEY_ISSHOWPRELIVESHAREBTN = "isShowPreLiveShareBtn";
    private static final String PARAM_KEY_LIVEID = "liveId";
    private static final String PARAM_KEY_LIVESOURCE = "livesource";
    private static final String PARAM_KEY_LIVEURL = "liveUrlAndroid";
    private static final String PARAM_KEY_RECOMMENDSOURCE = "recommendSource";
    private static final String PARAM_KEY_SPM = "spmForLive";
    private static final String PARAM_KEY_TOPOFFSET = "topOffSet";
    private static final String TAG;
    public static final String VIEW_TYPE = "taoliveroom";
    private static int lastActivityHashCode;
    private String customPlayCtrlParams;
    private int drawDelayed;
    private boolean enableH5EmbedViewH5UT;
    private boolean enableH5EmbedViewUT;
    private boolean isHideClose;
    private boolean isHideFullScreenBtn;
    private boolean isHidePreLiveShareBtn;
    private Activity mActivity;
    private String mBackActivityUrl;
    private boolean mDisableHorizontalScroll;
    private boolean mDisableVerticalScroll;
    private String mH5PageUrl;
    private String mH5UTParams;
    private String mLiveId;
    private String mLiveUrl;
    private String mLivesource;
    private String mRecommendSource;
    private ViewGroup mRootView;
    private String mSpm;
    private com.taobao.taolive.room.controller2.d mTaoLiveController;
    private int topOffSet;
    private List<WeakReference<Activity>> mActivities = new ArrayList();
    private Application.ActivityLifecycleCallbacks mLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.taolive.room.H5EmbedView.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityCreated " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            H5EmbedView.access$200(H5EmbedView.this).add(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityStarted " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) == null || !H5EmbedView.access$000(H5EmbedView.this).equals(activity) || H5EmbedView.access$300(H5EmbedView.this) == null || !H5EmbedView.access$300(H5EmbedView.this).e() || H5EmbedView.access$400(H5EmbedView.this) == null) {
                return;
            }
            H5EmbedView.access$400(H5EmbedView.this).removeAllViews();
            H5EmbedView.access$500(H5EmbedView.this);
            H5EmbedView.access$400(H5EmbedView.this).addView(H5EmbedView.access$300(H5EmbedView.this).a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityResumed " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) == null || !H5EmbedView.access$000(H5EmbedView.this).equals(activity)) {
                return;
            }
            if (H5EmbedView.access$300(H5EmbedView.this) != null) {
                H5EmbedView.access$300(H5EmbedView.this).onResume();
                H5EmbedView.access$600(H5EmbedView.this);
            }
            pmd.a().r().a(H5EmbedView.access$700(H5EmbedView.this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityPaused " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) == null || !H5EmbedView.access$000(H5EmbedView.this).equals(activity)) {
                return;
            }
            if (H5EmbedView.access$300(H5EmbedView.this) != null) {
                H5EmbedView.access$300(H5EmbedView.this).onPause();
                H5EmbedView.access$800(H5EmbedView.this);
            }
            pmd.a().r().b(H5EmbedView.access$700(H5EmbedView.this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityStopped " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) == null || !H5EmbedView.access$000(H5EmbedView.this).equals(activity) || H5EmbedView.access$300(H5EmbedView.this) == null) {
                return;
            }
            H5EmbedView.access$300(H5EmbedView.this).onStop();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityDestroyed " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            for (int i = 0; i < H5EmbedView.access$200(H5EmbedView.this).size(); i++) {
                WeakReference weakReference = (WeakReference) H5EmbedView.access$200(H5EmbedView.this).get(i);
                if (weakReference != null && weakReference.get() != null && weakReference.get() == activity) {
                    H5EmbedView.access$200(H5EmbedView.this).remove(weakReference);
                }
            }
        }
    };
    private INavInterceptor mInterceptor = new INavInterceptor() { // from class: com.taobao.taolive.room.H5EmbedView.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.adapter.nav.INavInterceptor
        public boolean a(Context context, String str, Bundle bundle, int i, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5844084e", new Object[]{this, context, str, bundle, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (!TextUtils.isEmpty(str)) {
                if (aa.l() && ((str.contains("market.m.taobao.com/app/mtb/app-live-h5-room/home/index.html") || str.contains("h5.m.taobao.com/taolive/video.html") || str.contains("huodong.m.taobao.com/act/talent/live.html")) && H5EmbedView.access$300(H5EmbedView.this) != null)) {
                    Uri parse = Uri.parse(str);
                    if (parse != null) {
                        z = parse.getBooleanQueryParameter(aw.PARAM_FORCE_REFRESH, false);
                    }
                    H5EmbedView.access$300(H5EmbedView.this).a(parse, z, true);
                    return true;
                }
                Intent intentForUri = Nav.from(context).intentForUri(str);
                if (intentForUri != null && intentForUri.getComponent() != null) {
                    Log.e("H5EmbedView", "onNavIntercept  className = " + intentForUri.getComponent().getClassName());
                    if (H5EmbedView.access$000(H5EmbedView.this) != null && H5EmbedView.access$000(H5EmbedView.this).getComponentName() != null && H5EmbedView.access$000(H5EmbedView.this).getComponentName().getClassName() != null && H5EmbedView.access$000(H5EmbedView.this).getComponentName().getClassName().equals(intentForUri.getComponent().getClassName())) {
                        Intent intent = new Intent();
                        intent.setClass(context, TaoLiveRouterActivity.class);
                        intent.putExtra("targetUrl", str);
                        context.startActivity(intent);
                        return true;
                    }
                }
            }
            return false;
        }
    };

    public static /* synthetic */ Object ipc$super(H5EmbedView h5EmbedView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1164236040:
                return new Boolean(super.init((String) objArr[0], (String) objArr[1], (IWVWebView) objArr[2], (EmbedViewConfig) objArr[3]));
            case -348346713:
                return new Boolean(super.init((String) objArr[0], (String) objArr[1], (IWVWebView) objArr[2], (EmbedViewConfig) objArr[3], (IEmbedViewContainer) objArr[4]));
            case -239223102:
                super.onAttachedToWebView();
                return null;
            case 259963749:
                super.onDetachedFromWebView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1980158489:
                super.onVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 2111529549:
                super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ Activity access$000(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("c1332ccf", new Object[]{h5EmbedView}) : h5EmbedView.mActivity;
    }

    public static /* synthetic */ void access$100(H5EmbedView h5EmbedView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcad0a2", new Object[]{h5EmbedView, str});
        } else {
            h5EmbedView.logd(str);
        }
    }

    public static /* synthetic */ boolean access$1000(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79fb7ae", new Object[]{h5EmbedView})).booleanValue() : h5EmbedView.enableH5EmbedViewH5UT;
    }

    public static /* synthetic */ List access$200(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2dbb2730", new Object[]{h5EmbedView}) : h5EmbedView.mActivities;
    }

    public static /* synthetic */ com.taobao.taolive.room.controller2.d access$300(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.room.controller2.d) ipChange.ipc$dispatch("9ad0b11c", new Object[]{h5EmbedView}) : h5EmbedView.mTaoLiveController;
    }

    public static /* synthetic */ ViewGroup access$400(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e8e26d80", new Object[]{h5EmbedView}) : h5EmbedView.mRootView;
    }

    public static /* synthetic */ void access$500(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a7d254", new Object[]{h5EmbedView});
        } else {
            h5EmbedView.initController();
        }
    }

    public static /* synthetic */ void access$600(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec943bb3", new Object[]{h5EmbedView});
        } else {
            h5EmbedView.trackResume();
        }
    }

    public static /* synthetic */ INavInterceptor access$700(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INavInterceptor) ipChange.ipc$dispatch("e8b98f5d", new Object[]{h5EmbedView}) : h5EmbedView.mInterceptor;
    }

    public static /* synthetic */ void access$800(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726d0e71", new Object[]{h5EmbedView});
        } else {
            h5EmbedView.trackPause();
        }
    }

    public static /* synthetic */ boolean access$900(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("355977d4", new Object[]{h5EmbedView})).booleanValue() : h5EmbedView.enableH5EmbedViewUT;
    }

    static {
        kge.a(2114162961);
        TAG = H5EmbedView.class.getSimpleName();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public boolean init(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig) {
        String str3;
        String str4 = "";
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9b2af8", new Object[]{this, str, str2, iWVWebView, embedViewConfig})).booleanValue();
        }
        if (n.a() != null) {
            poz.T(null, n.b(n.a()));
        }
        if (!psm.l()) {
            return super.init(str, str2, iWVWebView, embedViewConfig);
        }
        try {
            str3 = JSON.toJSONString(embedViewConfig.mObjectParam);
        } catch (Exception unused) {
            str3 = str4;
        }
        trackEmbedViewInit(String.valueOf(embedViewConfig.mEmbedViewID), str3);
        this.enableH5EmbedViewUT = aa.j();
        this.enableH5EmbedViewH5UT = aa.k();
        this.mActivity = (Activity) iWVWebView.getContext();
        this.mLiveUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_LIVEURL) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_LIVEURL)) : str4;
        this.mLiveId = embedViewConfig.mObjectParam.containsKey("liveId") ? String.valueOf(embedViewConfig.mObjectParam.get("liveId")) : str4;
        this.mLivesource = embedViewConfig.mObjectParam.containsKey("livesource") ? String.valueOf(embedViewConfig.mObjectParam.get("livesource")) : str4;
        this.mBackActivityUrl = embedViewConfig.mObjectParam.containsKey("activity") ? String.valueOf(embedViewConfig.mObjectParam.get("activity")) : str4;
        this.mDisableHorizontalScroll = true;
        this.mDisableVerticalScroll = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ENABLEVERTICALSCROLL));
        this.topOffSet = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_TOPOFFSET) ? (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_TOPOFFSET))) : 0;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_DRAWDELAYED)) {
            i = (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_DRAWDELAYED)));
        }
        this.drawDelayed = i;
        this.mRecommendSource = embedViewConfig.mObjectParam.containsKey("recommendSource") ? String.valueOf(embedViewConfig.mObjectParam.get("recommendSource")) : str4;
        this.customPlayCtrlParams = embedViewConfig.mObjectParam.containsKey("customPlayCtrlParams") ? String.valueOf(embedViewConfig.mObjectParam.get("customPlayCtrlParams")) : str4;
        this.isHideClose = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDECLOSE));
        this.isHideFullScreenBtn = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDEFULLSCREENBTN));
        this.isHidePreLiveShareBtn = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ISSHOWPRELIVESHAREBTN));
        this.mH5PageUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPAGENAME) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPAGENAME)) : str4;
        this.mH5UTParams = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPARAMS) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPARAMS)) : str4;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_SPM)) {
            str4 = String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_SPM));
        }
        this.mSpm = str4;
        this.topOffSet = com.taobao.taolive.room.utils.d.a(this.topOffSet);
        cgl.g().a().registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        pmd.a().r().a(this.mInterceptor);
        initController();
        return super.init(str, str2, iWVWebView, embedViewConfig);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public boolean init(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        String str3;
        String str4 = "";
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3ca6a7", new Object[]{this, str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer})).booleanValue();
        }
        if (n.a() != null) {
            poz.T(null, n.b(n.a()));
        }
        if (!psm.l()) {
            return super.init(str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer);
        }
        try {
            str3 = JSON.toJSONString(embedViewConfig.mObjectParam);
        } catch (Exception unused) {
            str3 = str4;
        }
        trackEmbedViewInit(String.valueOf(embedViewConfig.mEmbedViewID), str3);
        this.enableH5EmbedViewUT = aa.j();
        this.enableH5EmbedViewH5UT = aa.k();
        this.mActivity = (Activity) iWVWebView.getContext();
        this.mLiveUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_LIVEURL) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_LIVEURL)) : str4;
        this.mLiveId = embedViewConfig.mObjectParam.containsKey("liveId") ? String.valueOf(embedViewConfig.mObjectParam.get("liveId")) : str4;
        this.mLivesource = embedViewConfig.mObjectParam.containsKey("livesource") ? String.valueOf(embedViewConfig.mObjectParam.get("livesource")) : str4;
        this.mBackActivityUrl = embedViewConfig.mObjectParam.containsKey("activity") ? String.valueOf(embedViewConfig.mObjectParam.get("activity")) : str4;
        this.mDisableHorizontalScroll = true;
        this.mDisableVerticalScroll = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ENABLEVERTICALSCROLL));
        this.topOffSet = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_TOPOFFSET) ? (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_TOPOFFSET))) : 0;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_DRAWDELAYED)) {
            i = (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_DRAWDELAYED)));
        }
        this.drawDelayed = i;
        this.mRecommendSource = embedViewConfig.mObjectParam.containsKey("recommendSource") ? String.valueOf(embedViewConfig.mObjectParam.get("recommendSource")) : str4;
        this.customPlayCtrlParams = embedViewConfig.mObjectParam.containsKey("customPlayCtrlParams") ? String.valueOf(embedViewConfig.mObjectParam.get("customPlayCtrlParams")) : str4;
        this.isHideClose = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDECLOSE));
        this.isHideFullScreenBtn = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDEFULLSCREENBTN));
        this.isHidePreLiveShareBtn = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ISSHOWPRELIVESHAREBTN));
        this.mH5PageUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPAGENAME) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPAGENAME)) : str4;
        this.mH5UTParams = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPARAMS) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPARAMS)) : str4;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_SPM)) {
            str4 = String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_SPM));
        }
        this.mSpm = str4;
        this.topOffSet = com.taobao.taolive.room.utils.d.a(this.topOffSet);
        cgl.g().a().registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        pmd.a().r().a(this.mInterceptor);
        initController();
        return super.init(str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer);
    }

    private void initController() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1acf53", new Object[]{this});
            return;
        }
        String a2 = TextUtils.isEmpty(this.mLiveUrl) ? com.taobao.taolive.room.utils.c.a(this.mLiveId) : com.taobao.taolive.room.utils.c.a(this.mLiveUrl, "id", this.mLiveId);
        if (!TextUtils.isEmpty(this.mLivesource)) {
            a2 = com.taobao.taolive.room.utils.c.d(a2, this.mLivesource);
        }
        if (!TextUtils.isEmpty(this.mRecommendSource)) {
            a2 = com.taobao.taolive.room.utils.c.a(a2, "recommendSource", this.mRecommendSource);
        }
        if (!TextUtils.isEmpty(this.customPlayCtrlParams)) {
            a2 = com.taobao.taolive.room.utils.c.a(a2, "customPlayCtrlParams", Uri.encode(this.customPlayCtrlParams));
        }
        if (!TextUtils.isEmpty(this.mSpm)) {
            a2 = com.taobao.taolive.room.utils.c.a(a2, "spm", this.mSpm);
        }
        pla a3 = new pla.a().a(this.topOffSet).c(this.mDisableHorizontalScroll).a(this.mDisableHorizontalScroll).b(this.mDisableHorizontalScroll).d(this.mDisableVerticalScroll).f(this.isHideClose).h(this.isHideFullScreenBtn).b(this.drawDelayed).k(this.isHidePreLiveShareBtn).a(this.mH5PageUrl).g(this.enableH5EmbedViewUT).l(true).a();
        this.mTaoLiveController = new h(this.mActivity, a2, a3);
        this.mTaoLiveController.a(new e() { // from class: com.taobao.taolive.room.H5EmbedView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.controller2.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    WVStandardEventCenter.postNotificationToJS(H5EmbedView.this.webView, "onLiveRoomError", "");
                }
            }
        });
        this.mTaoLiveController.a(new ISmallWindowStrategy() { // from class: com.taobao.taolive.room.H5EmbedView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
            public void a(View view, String str2, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str2, str3, str4});
                    return;
                }
                for (WeakReference weakReference : H5EmbedView.access$200(H5EmbedView.this)) {
                    if (weakReference != null && weakReference.get() != null && !((Activity) weakReference.get()).isFinishing()) {
                        ((Activity) weakReference.get()).finish();
                    }
                }
            }
        });
        this.mTaoLiveController.a(new k() { // from class: com.taobao.taolive.room.H5EmbedView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.controller2.k
            public void a(Map map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                } else if (!H5EmbedView.access$900(H5EmbedView.this)) {
                } else {
                    if (H5EmbedView.access$1000(H5EmbedView.this)) {
                        WVStandardEventCenter.postNotificationToJS(H5EmbedView.this.webView, "onUpdateUTProperties", JSON.toJSONString(map));
                        return;
                    }
                    ai.a((a) null, (Object) H5EmbedView.access$000(H5EmbedView.this), "Page_TaobaoLiveWatch");
                    ai.a(H5EmbedView.access$000(H5EmbedView.this), map);
                }
            }
        });
        try {
            str = JSON.toJSONString(a3);
        } catch (Exception unused) {
            str = "";
        }
        trackControllerInit(a2, str);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        logd("onResume " + System.currentTimeMillis());
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        logd("onPause " + System.currentTimeMillis());
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        super.onAttachedToWebView();
        logd("onAttachedToWebView " + System.currentTimeMillis());
        if (this.mTaoLiveController == null) {
            return;
        }
        trackAttachedToWebView();
        this.mTaoLiveController.onResume();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
            return;
        }
        super.onDetachedFromWebView();
        logd("onDetachedFromWebView " + System.currentTimeMillis());
        com.taobao.taolive.room.controller2.d dVar = this.mTaoLiveController;
        if (dVar == null) {
            return;
        }
        dVar.onPause();
        this.mTaoLiveController.onStop();
        trackDetachedFromWebView();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        super.onParamChanged(strArr, strArr2);
        logd("onParamChanged " + Arrays.toString(strArr) + " " + Arrays.toString(strArr2));
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(i);
        logd("onVisibilityChanged " + i);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        logd("onDestroy " + System.currentTimeMillis());
        com.taobao.taolive.room.controller2.d dVar = this.mTaoLiveController;
        if (dVar != null) {
            dVar.onDestroy();
            this.mTaoLiveController = null;
        }
        cgl.g().a().unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        pmd.a().r().b(this.mInterceptor);
        this.mActivities.clear();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        logd("getViewType " + System.currentTimeMillis());
        return VIEW_TYPE;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        logd("onActivityResult " + i + " " + i2);
        com.taobao.taolive.room.controller2.d dVar = this.mTaoLiveController;
        if (dVar == null) {
            return;
        }
        if (i == 20000) {
            dVar.f();
        } else if (i == 20001) {
            dVar.g();
        } else if (i != 10000) {
        } else {
            if (i2 == 8) {
                dVar.a(false);
            } else if (i2 != 1) {
            } else {
                dVar.a(true);
            }
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        logd("generateView " + System.currentTimeMillis());
        com.taobao.taolive.room.controller2.d dVar = this.mTaoLiveController;
        if (dVar == null) {
            TextView textView = new TextView(context);
            textView.setBackgroundColor(-1);
            textView.setText("");
            textView.setTextColor(-65536);
            textView.setTextSize(30.0f);
            textView.setGravity(17);
            WVStandardEventCenter.postNotificationToJS(this.webView, "onLiveRoomError", "");
            return textView;
        }
        if (dVar.a() instanceof ViewGroup) {
            this.mRootView = this.mTaoLiveController.a();
        }
        return this.mTaoLiveController.a();
    }

    private void logd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7c0831", new Object[]{this, str});
            return;
        }
        pnj m = pmd.a().m();
        if (m == null) {
            return;
        }
        m.c(TAG, str);
    }

    private void trackEmbedViewInit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3cf6de", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("viewId", str);
        hashMap.put("param", str2);
        ai.a(19999, "EmbedView-Init", hashMap);
    }

    private void trackControllerInit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2fec12", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("TLiveRoomConfig", str2);
        ai.a(19999, "LiveRoomController-Init", hashMap);
    }

    private void trackResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36aa59df", new Object[]{this});
        } else if (!this.enableH5EmbedViewUT || this.enableH5EmbedViewH5UT || TextUtils.isEmpty(this.mH5PageUrl)) {
        } else {
            ai.c((a) null, this.mActivity);
            this.mTaoLiveController.h();
        }
    }

    private void trackPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11b3272", new Object[]{this});
        } else if (!this.enableH5EmbedViewUT || this.enableH5EmbedViewH5UT || TextUtils.isEmpty(this.mH5PageUrl)) {
        } else {
            ai.b((a) null, this.mActivity);
        }
    }

    private void trackAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146c76d6", new Object[]{this});
        } else if (!this.enableH5EmbedViewUT || this.enableH5EmbedViewH5UT || TextUtils.isEmpty(this.mH5PageUrl)) {
        } else {
            pau.a();
            UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(this.mActivity, null);
            ai.a(this.mActivity);
            if (lastActivityHashCode != this.mActivity.hashCode()) {
                lastActivityHashCode = this.mActivity.hashCode();
            } else {
                ai.b((a) null, this.mActivity);
            }
            a aVar = null;
            ai.c(aVar, this.mActivity);
            ai.a(aVar, (Object) this.mActivity, "Page_TaobaoLiveWatch");
        }
    }

    private void trackDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415fbe79", new Object[]{this});
        } else if (!this.enableH5EmbedViewUT || this.enableH5EmbedViewH5UT || TextUtils.isEmpty(this.mH5PageUrl)) {
        } else {
            Map map = null;
            a aVar = null;
            ai.b(aVar, this.mActivity);
            ai.c(aVar, this.mActivity);
            if (!TextUtils.isEmpty(this.mH5UTParams)) {
                map = (Map) pqj.a(this.mH5UTParams, Map.class);
            }
            if (map == null) {
                map = new HashMap();
            }
            map.put("spm-url", "a2141.8001249");
            ai.a(aVar, (Object) this.mActivity, this.mH5PageUrl);
            ai.a(this.mActivity, map);
            pau.a(this.mActivity, this.mH5PageUrl, this.mH5UTParams);
        }
    }
}
