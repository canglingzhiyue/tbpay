package com.taobao.tao.homepage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.application.common.a;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.j;
import com.taobao.homepage.utils.m;
import com.taobao.homepage.utils.n;
import com.taobao.search.common.util.i;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.linklog.RecommendLinkLogAdapter;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmainfragment.SuppportBaseFragment;
import com.uc.webview.export.media.MessageID;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.alj;
import tb.gmq;
import tb.kge;
import tb.ksp;
import tb.ksr;
import tb.kss;
import tb.kum;
import tb.kyt;
import tb.lap;
import tb.laq;
import tb.lar;
import tb.lat;
import tb.lav;
import tb.lbn;
import tb.lbo;
import tb.lbp;
import tb.lbq;
import tb.lbr;
import tb.lbs;
import tb.ljd;
import tb.onq;
import tb.oql;
import tb.sdy;
import tb.seb;

/* loaded from: classes8.dex */
public class HomepageFragment extends SuppportBaseFragment implements lbq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String H_ON_PAUSE = "honPause";
    private static final String TAG = "HomePageFragment";
    private static a.c gAppLaunchListener;
    private static AtomicBoolean isColdStartFinish;
    private static boolean isNeedReCreateView;
    private static int mCurrentActivityHashCode;
    private lbr coldStartUpWorkflow;
    public lbo homePageManager;
    private boolean isTemplateDataDebugged;
    private k pageListener;
    private long start = 0;
    private lbr startUpWorkflow;

    public static /* synthetic */ Object ipc$super(HomepageFragment homepageFragment, String str, Object... objArr) {
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
            case -872444662:
                super.onViewStateRestored((Bundle) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(233181951);
        kge.a(752209127);
        isColdStartFinish = new AtomicBoolean(false);
        mCurrentActivityHashCode = -1;
    }

    public HomepageFragment() {
        if (!isColdStartFinish.get()) {
            com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentBefore");
            com.taobao.tao.recommend3.tracelog.b.a().d("launcherTotal");
            com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentInit", 1);
            com.taobao.tao.recommend3.tracelog.b.a().a("homeTotal", 1);
        }
        com.taobao.homepage.utils.h.a();
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        createLifeCycleLog("onNewIntent").b();
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnNewIntent", 1);
        if (this.startUpWorkflow == null || this.mRootView == null) {
            com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnNewIntent");
            return;
        }
        try {
            this.startUpWorkflow.a(intent);
        } catch (Exception unused) {
            ksp.a(TAG, "startUpWorkflow.onNewIntent wrong");
        }
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnNewIntent");
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        createLifeCycleLog("onAttach").b();
        com.taobao.tao.topmultitab.c.a();
        com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_NAVI);
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_VISIBLE_ONLY);
        if (!isColdStartFinish.compareAndSet(false, true) || !n.n().a()) {
            return;
        }
        sdy.a(new Runnable() { // from class: com.taobao.tao.homepage.HomepageFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    m.b(HomepageFragment.this.getCurActivity());
                }
            }
        });
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_CREATE);
        createLifeCycleLog(i.b.MEASURE_ONCREATE).b();
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnCreate", 1);
        m.a(getActivity());
        f.a().b().a((Activity) getActivity());
        lar.c(lar.OnCreate);
        lav.a(com.alibaba.android.umbrella.performance.d.LIFECYCLE, i.b.MEASURE_ONCREATE, "");
        lav.a(com.alibaba.android.umbrella.performance.d.LIFECYCLE);
        this.start = SystemClock.elapsedRealtime();
        gmq.a(i.b.MEASURE_ONCREATE, true);
        alj.a().b("homepage", com.taobao.android.home.component.utils.i.a());
        com.taobao.homepage.utils.g.a().a(getCurActivity());
        super.onCreate(bundle);
        if (com.taobao.android.home.component.utils.j.a("compensateRegisterOverSeaController", true)) {
            com.taobao.tao.topmultitab.c.a().f();
            com.taobao.android.home.component.utils.e.e(TAG, "补偿注册海外controller");
        }
        this.homePageManager = new lbo(this);
        this.startUpWorkflow = new lbn(this);
        this.coldStartUpWorkflow = this.startUpWorkflow;
        this.isTemplateDataDebugged = getApplicationContext().getSharedPreferences("template_data_debug", 0).getBoolean("template_data_debug", false);
        gmq.a(i.b.MEASURE_ONCREATE);
        lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE, i.b.MEASURE_ONCREATE, "");
        kum.a("PageTaoHome", null);
        a.c cVar = gAppLaunchListener;
        if (cVar != null) {
            com.taobao.application.common.c.b(cVar);
        }
        e eVar = new e(this);
        gAppLaunchListener = eVar;
        com.taobao.application.common.c.a(eVar);
        if (com.taobao.android.home.component.utils.j.a("enableHomePageImageLoadMonitor", true)) {
            this.pageListener = new k(this);
            com.taobao.application.common.c.a(this.pageListener);
        }
        lar.d(lar.OnCreate);
        kyt.a((Activity) getActivity());
        oql.a().a(getActivity());
        com.taobao.tao.topmultitab.c.a().j();
        com.taobao.runtimepermission.f.a(new g());
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnCreate");
        com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_CREATE);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnCreateView", 1);
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_CREATE_VIEW);
        laq createLifeCycleLog = createLifeCycleLog("onCreateView");
        lar.c(lar.OnCreaeView);
        com.taobao.homepage.utils.e.a();
        lav.a(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onCreateView", "");
        if (this.mRootView == null || isNeedReCreateView) {
            isNeedReCreateView = false;
            View a2 = this.coldStartUpWorkflow.a(layoutInflater, viewGroup, bundle);
            ViewParent parent = a2.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                viewGroup2.endViewTransition(a2);
                viewGroup2.removeView(a2);
            }
            lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onCreateView", "");
            lar.d(lar.OnCreaeView);
            createLifeCycleLog.a("mRootView", "null").b();
            com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnCreateView");
            return a2;
        }
        ViewParent parent2 = this.mRootView.getParent();
        if (parent2 instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) parent2;
            viewGroup3.endViewTransition(this.mRootView);
            viewGroup3.removeView(this.mRootView);
            createLifeCycleLog.c("清除动画并且移除mRootView");
        }
        lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onCreateView", "");
        lar.d(lar.OnCreaeView);
        createLifeCycleLog.b();
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnCreateView");
        com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_CREATE_VIEW);
        return this.mRootView;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        laq createLifeCycleLog = createLifeCycleLog("onActivityCreated");
        this.startUpWorkflow.a(bundle);
        Activity curActivity = getCurActivity();
        int hashCode = curActivity != null ? curActivity.hashCode() : -1;
        View rootView = getRootView();
        int hashCode2 = rootView != null ? rootView.hashCode() : -1;
        lap.a("【Homepage_PageLifeCycle】", "onActivityCreated", "activityHashCode: " + hashCode + " rootViewHashCode: " + hashCode2);
        int i = mCurrentActivityHashCode;
        if (hashCode != i && i != -1) {
            ksr.a("pageRender", "homepage", "1.0", (String) null, (Map<String, String>) null, "onActivityCreated", "rootViewHashCode: " + hashCode2 + "activityHashCode: " + hashCode);
        }
        mCurrentActivityHashCode = hashCode;
        if (n.a(getCurActivity())) {
            setViewChangeWhenVisiableChange(true);
            createLifeCycleLog.a("开关enablePerformanceOptimization", "true").a("开关home_openMiniPreload", "true");
        }
        createLifeCycleLog.b();
        TBFragmentTabHost fragmentTabHost = TBMainHost.a().getFragmentTabHost();
        if (fragmentTabHost == null) {
            return;
        }
        fragmentTabHost.setTBLauncherTaskNotPreparedCallback(new com.taobao.tao.navigation.b() { // from class: com.taobao.tao.homepage.HomepageFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.navigation.b
            public void a(final int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                } else {
                    com.taobao.homepage.utils.j.a(HomepageFragment.this.getCurActivity(), new j.a() { // from class: com.taobao.tao.homepage.HomepageFragment.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.homepage.utils.j.a
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            TBFragmentTabHost fragmentTabHost2 = TBMainHost.a().getFragmentTabHost();
                            if (fragmentTabHost2 == null) {
                                return;
                            }
                            fragmentTabHost2.setCurrentTab(i2);
                        }
                    });
                }
            }

            @Override // com.taobao.tao.navigation.b
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : LauncherRuntime.b();
            }
        });
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_START);
        if (n.a(getCurActivity()) && !shouldDoOnStart()) {
            lap.a("【Homepage_PageLifeCycle】", "HomePageFragmentOnStart", "开关home_openMiniPreload:true; shouldDoOnStart:false,不执行onStart生命周期");
            super.onStart();
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnStart", 1);
        lav.a(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onStart", "");
        super.onStart();
        this.startUpWorkflow.a();
        lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onStart", "");
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnStart");
        createLifeCycleLog("onStart").b();
        com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_START);
    }

    @Override // com.taobao.tao.TBBaseFragment, android.support.v4.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbff8d0a", new Object[]{this, bundle});
        } else {
            super.onViewStateRestored(bundle);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_RESUME);
        laq createLifeCycleLog = createLifeCycleLog("onResume");
        if (n.a(getCurActivity()) && !shouldDoOnResume()) {
            createLifeCycleLog.c("不执行生命周期.").c("开关home_openMiniPreload:true").c("开关shouldDoOnResume:false").b();
            super.onResume();
            return;
        }
        lat.a("Page_Home");
        kyt.a(true);
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnResume", 1);
        lav.a(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onResume", "");
        if (com.taobao.tao.topmultitab.c.a().w()) {
            seb.a("Page_Home", (String) null, this, new String[0]);
        }
        gmq.a("onResume", true);
        RecommendLinkLogAdapter.checkEnableUmbrella2();
        ksp.a();
        super.onResume();
        this.startUpWorkflow.b();
        kss.a("Page_Home", 19999, "pageEnter", "");
        gmq.a("onResume");
        lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onResume", "");
        lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE);
        HomePageUtility.a(getActivity());
        onq.b(false);
        createLifeCycleLog.b();
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnResume");
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentInit");
        com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_RESUME);
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        lar.c(H_ON_PAUSE);
        laq createLifeCycleLog = createLifeCycleLog("onPause");
        if (n.a(getCurActivity()) && !shouldDoOnPause()) {
            createLifeCycleLog.c("home_openMiniPreload开关打开，shouldDoOnPause() = false").b();
            super.onPause();
            lar.d(H_ON_PAUSE);
            return;
        }
        onq.b(true);
        kyt.a(false);
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnPause", 1);
        lav.a(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onPause", "");
        if (com.taobao.tao.topmultitab.c.a().w()) {
            ljd.a().a(new Runnable() { // from class: com.taobao.tao.homepage.HomepageFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        seb.a("Page_Home", null, null, this, new String[0]);
                    }
                }
            });
        }
        gmq.a("Page_Home", "track_center_action", "page_hidden_count");
        super.onPause();
        this.startUpWorkflow.c();
        if (this.homePageManager.j().b().compareAndSet(true, false)) {
            if (!(this.startUpWorkflow instanceof lbp)) {
                this.startUpWorkflow = new lbp(this);
            }
            com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnPause");
            createLifeCycleLog.c("热启动触发了onPause方法").b();
            lar.d(H_ON_PAUSE);
        } else if (this.startUpWorkflow instanceof lbs) {
            com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnPause");
            createLifeCycleLog.c("前后台工作流触发的onPause方法").b();
            lar.d(H_ON_PAUSE);
        } else {
            this.startUpWorkflow = new lbs(this);
            lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onPause", "");
            com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnPause");
            com.taobao.tao.recommend3.tracelog.b.a().d("homeFirstTouch");
            com.taobao.tao.recommend3.tracelog.b.a().d("homeLeavePage");
            createLifeCycleLog.b();
            lar.d(H_ON_PAUSE);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        laq createLifeCycleLog = createLifeCycleLog(MessageID.onStop);
        if (n.a(getCurActivity()) && !shouldDoOnStop()) {
            createLifeCycleLog.c("home_openMiniPreload开关打开,shouldDoOnStop == false").b();
            super.onStop();
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnStop", 1);
        lav.a(com.alibaba.android.umbrella.performance.d.LIFECYCLE, MessageID.onStop, "");
        gmq.e();
        super.onStop();
        this.startUpWorkflow.d();
        try {
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent(com.taobao.android.home.component.utils.h.ACTION_ACTIVITY_STOP));
        } catch (Throwable unused) {
        }
        lav.b(com.alibaba.android.umbrella.performance.d.LIFECYCLE, MessageID.onStop, "");
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnStop");
        createLifeCycleLog.b();
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.startUpWorkflow == null) {
            return false;
        }
        ksp.c(TAG, "onPanelKeyDown");
        return this.startUpWorkflow.a(i, keyEvent);
    }

    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        createLifeCycleLog("onTrimMemory").b();
        com.taobao.prefork.b.a().b();
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        createLifeCycleLog("onLowMemory").b();
        com.taobao.prefork.b.a().b();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().a("homeFragmentOnDestroy", 1);
        lbr lbrVar = this.startUpWorkflow;
        if (lbrVar != null) {
            lbrVar.e();
        }
        super.onDestroy();
        if (this.mRootView != null) {
            ViewGroup viewGroup = (ViewGroup) this.mRootView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.mRootView);
            }
            isNeedReCreateView = true;
        }
        com.taobao.tao.topmultitab.c.a().o();
        com.taobao.prefork.b.a().d();
        kum.a("PageTaoHome");
        lbo lboVar = this.homePageManager;
        if (lboVar != null) {
            lboVar.z();
        }
        k kVar = this.pageListener;
        if (kVar != null) {
            kVar.a();
            com.taobao.application.common.c.b(this.pageListener);
        }
        com.taobao.tao.recommend3.tracelog.b.a().b("homeFragmentOnDestroy");
        createLifeCycleLog(MessageID.onDestroy).b();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        createLifeCycleLog("onActivityResult").b();
        super.onActivityResult(i, i2, intent);
        com.taobao.tao.topmultitab.c.a().a(i, i2, intent);
    }

    @Override // com.taobao.tao.TBBaseFragment, android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        createLifeCycleLog("onRequestPermissionsResult").b();
        this.startUpWorkflow.a(i, strArr, iArr);
    }

    @Override // tb.lbq
    public lbr getStartUpWorkflow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbr) ipChange.ipc$dispatch("a86c0add", new Object[]{this}) : this.startUpWorkflow;
    }

    @Override // tb.lbq
    public lbo getHomePageManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbo) ipChange.ipc$dispatch("5d89485d", new Object[]{this}) : this.homePageManager;
    }

    public Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this}) : Globals.getApplication();
    }

    @Override // tb.lbq
    public View getRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("17b33166", new Object[]{this}) : this.mRootView;
    }

    @Override // tb.lbq
    public Activity getCurActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4891e268", new Object[]{this}) : getActivity();
    }

    @Override // tb.lbq
    public void setRootView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9a75a2", new Object[]{this, view});
        } else {
            this.mRootView = view;
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : kss.f30292a;
    }

    public static boolean isColdStartFinish() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6544892", new Object[0])).booleanValue() : isColdStartFinish.get();
    }

    public long getPageStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42753258", new Object[]{this})).longValue() : this.start;
    }

    private laq createLifeCycleLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (laq) ipChange.ipc$dispatch("f1c149c3", new Object[]{this, str});
        }
        laq b = laq.a().a("【Homepage_PageLifeCycle】").b(str);
        try {
            laq c = b.c("Fragment实例：" + this);
            c.c("Activity实例：" + getCurActivity());
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.b("createLifeCycleLog", th, "获取实例异常");
        }
        return b;
    }
}
