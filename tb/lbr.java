package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.home.component.view.live.b;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.page.weexv2.a;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.RequestTypeEnum;
import com.taobao.homepage.utils.d;
import com.taobao.homepage.view.widgets.HomeSwipeRefreshLayout;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;

/* loaded from: classes7.dex */
public class lbr extends lbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(530478650);
    }

    public static /* synthetic */ Object ipc$super(lbr lbrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -670876635) {
            super.a((Intent) objArr[0]);
            return null;
        } else if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 93762283) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.d();
            return null;
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ddc46abd", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return null;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        }
    }

    public lbr(lbq lbqVar) {
        super(lbqVar);
    }

    @Override // tb.lbm
    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "startUpFlow_onNewIntent", "");
        if (intent == null) {
            return;
        }
        a(intent, RequestTypeEnum.URL_START);
        kue.a(intent);
        kug.a().a(this.f30455a, new kuh(intent), false);
        if (this.f30455a.getCurActivity() == null) {
            return;
        }
        this.f30455a.getHomePageManager().c().b(intent);
        this.f30455a.getCurActivity().setIntent(intent);
        super.a(intent);
    }

    @Override // tb.lbm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        oql.a().m();
        super.a();
    }

    @Override // tb.lbm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        oql.a().d();
        Activity curActivity = this.f30455a.getCurActivity();
        if (curActivity == null || this.f30455a.getHomePageManager() == null) {
            return;
        }
        this.f30455a.getHomePageManager().j().c().a(true);
        Coordinator.scheduleIdleTasks();
        las.b((Context) curActivity);
        if (c.a().D() && !a.d()) {
            las.a((Context) curActivity);
        }
        las.d();
        las.e();
        las.c();
        las.g();
        this.f30455a.getHomePageManager().p().b();
        kxf.a().c(50018);
        Intent intent = curActivity.getIntent();
        Uri data = intent == null ? null : intent.getData();
        if (data == null || !StringUtils.equals("homepage", data.getQueryParameter("target"))) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("isOutpushBacktoHome", "1");
    }

    @Override // tb.lbm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "startUp_onPause", "");
        lar.c("onPause_HomePageLifecycle");
        oql.a().e();
        lar.d("onPause_HomePageLifecycle");
        this.f30455a.getHomePageManager().j().c().a(false);
        lar.c("onPause_stopShake");
        this.f30455a.getHomePageManager().m().b();
        lar.d("onPause_stopShake");
        boolean b = this.f30455a.getHomePageManager().o().b();
        if (c.a().D()) {
            las.a(this.f30455a.getCurActivity(), b);
        }
        lar.c("onPause_removeStartUpIdleHandler");
        this.f30455a.getHomePageManager().p().d();
        lar.d("onPause_removeStartUpIdleHandler");
    }

    @Override // tb.lbm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (j.a("enableStatisticsOptimize", false)) {
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: tb.lbr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ksp.a("StartUpWorkflow", MessageID.onStop);
                    }
                }
            });
        } else {
            ksp.a("StartUpWorkflow", MessageID.onStop);
        }
        oql.a().n();
        super.d();
    }

    @Override // tb.lbm
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ksp.a("StartUpWorkflow", MessageID.onDestroy);
        lap.a("【Homepage_PageLifeCycle】", "startUpFlow_onDestroy", "");
        Constants.exitFlag = true;
        oql.a().f();
        lbo.b().a(i.a());
        kst.a();
        i.b((String) null);
        this.f30455a.getHomePageManager().c().b();
        try {
            kxg.a();
            this.f30455a.getHomePageManager().f().b();
        } catch (Throwable unused) {
        }
        FestivalMgr.a();
        this.f30455a.getHomePageManager().g().d();
        com.taobao.homepage.speed.a.a().c();
        b.a();
        mjx i = this.f30455a.getHomePageManager().i();
        if (i == null) {
            return;
        }
        i.a();
    }

    @Override // tb.lbm
    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        ksp.a("StartUpWorkflow", "onPanelKeyDown");
        if (i != 4) {
            return false;
        }
        if (!this.f30455a.getHomePageManager().j().a().get()) {
            return true;
        }
        try {
            this.f30455a.getHomePageManager().j().b().set(this.f30455a.getHomePageManager().h().a());
        } catch (Throwable th) {
            e.e("StartUpWorkflow", "双击back出现异常：" + th);
        }
        return true;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        View rootView = this.f30455a.getRootView();
        if (!(rootView instanceof ViewGroup)) {
            e.e("StartUpWorkflow", "rootView 不是ViewGroup");
            return;
        }
        Activity curActivity = this.f30455a.getCurActivity();
        lbo homePageManager = this.f30455a.getHomePageManager();
        HomeSwipeRefreshLayout homeSwipeRefreshLayout = (HomeSwipeRefreshLayout) rootView.findViewById(R.id.home_swipe_refresh);
        homeSwipeRefreshLayout.reCalculateHeight(curActivity);
        homeSwipeRefreshLayout.disEnableTargetOffsetAndResetH();
        homePageManager.a(new nnu(homePageManager, homeSwipeRefreshLayout, curActivity, rootView));
    }

    @Override // tb.lbm
    public void a(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6953b2", new Object[]{this, new Integer(i), strArr, iArr});
        } else {
            ksp.a("StartUpWorkflow", "onRequestPermissionsResult");
        }
    }

    public void a(Intent intent, RequestTypeEnum requestTypeEnum) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6874d5e", new Object[]{this, intent, requestTypeEnum});
        } else if (intent == null || this.f30455a.getCurActivity() == null || (data = intent.getData()) == null) {
        } else {
            String queryParameter = data.getQueryParameter(oqn.KEY_PREVIEW_PARAM);
            String queryParameter2 = data.getQueryParameter("fontSize");
            if (!StringUtils.isEmpty(queryParameter) && queryParameter.contains("templateMock=")) {
                Intent intent2 = new Intent(this.f30455a.getCurActivity(), DXTemplatePreviewActivity.class);
                intent2.putExtra(DXTemplatePreviewActivity.PREVIEW_INFO, queryParameter.substring(queryParameter.indexOf("=") + 1));
                if (!StringUtils.isEmpty(queryParameter2)) {
                    intent2.putExtra("fontSize", queryParameter2);
                }
                this.f30455a.getCurActivity().startActivity(intent2);
            } else if (StringUtils.isEmpty(queryParameter)) {
            } else {
                d.b("Preview", oqn.KEY_PREVIEW_PARAM, false, queryParameter);
                oqq.a(queryParameter);
                com.taobao.android.festival.festival.a.a().c();
            }
        }
    }

    public void a(RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b473c38", new Object[]{this, relativeLayout});
            return;
        }
        lbo homePageManager = this.f30455a.getHomePageManager();
        lap.a("SearchBar", "init", "StartUpWorkflow.initSearchBar; 开始执行搜索栏初始化逻辑");
        sfm sfmVar = new sfm(relativeLayout, this.f30455a);
        homePageManager.a(sfmVar);
        if (sfmVar.b() || !j.a("enableFixSearchBar", false)) {
            return;
        }
        lap.a("SearchBar", "init", "StartUpWorkflow搜索栏还没创建，补偿下");
        sfmVar.a(HomePageUtility.d());
    }
}
