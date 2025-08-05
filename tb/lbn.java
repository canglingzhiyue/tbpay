package tb;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.speed.TBSpeed;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.view.widgets.bgcontainer.BGContainerView;
import com.taobao.performance.f;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.homepage.launcher.n;
import com.taobao.tao.recommend3.tracelog.b;
import com.taobao.tao.topmultitab.c;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lbn extends lbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b;

    public static /* synthetic */ Object ipc$super(lbn lbnVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -574330179:
                return super.a((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 1265012588:
                super.a((Bundle) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-734133509);
        b = true;
    }

    public lbn(lbq lbqVar) {
        super(lbqVar);
        n.a(lbqVar.getCurActivity());
        lap.a("【Homepage_PageLifeCycle】", "coldStartConstruct", "冷启流程对象构造函数阶段");
    }

    @Override // tb.lbr
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ddc46abd", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        super.a(layoutInflater, viewGroup, bundle);
        lap.a("【Homepage_PageLifeCycle】", "coldStartOnCreateView", "ColdStartWorkflow.onCreateView;冷启流程onCreateView阶段");
        return a(layoutInflater, viewGroup);
    }

    private View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1cc208fb", new Object[]{this, layoutInflater, viewGroup});
        }
        laq c = laq.a().b("coldStartCreate").a("【Homepage_PageLifeCycle】").c("ColdStartWorkflow.create").c("冷启流程初始化各类功能阶段.");
        TBSpeed.updateUTParams();
        TCrashSDK.instance().addJvmUncaughtCrashListener(new a());
        com.taobao.tao.homepage.revision.a.a().a(Globals.getApplication());
        lar.e("eventRegister");
        kxg.a(this.f30455a.getHomePageManager());
        lar.f("eventRegister");
        lbo.b();
        gmq.a("set_layout_coldstart_event", false);
        lar.e("initViewContainer");
        b.a().a("initViewContainer", 1);
        View a2 = HomePageUtility.a(layoutInflater, viewGroup);
        b.a().b("initViewContainer");
        lar.f("initViewContainer");
        c.a("lastTabEnable", oiy.a().j()).a("LastNewFaceEnable", oiy.a().k()).a("LastContainerID", oiy.a().i());
        this.f30455a.setRootView(a2);
        g();
        lar.e("popCenter_init");
        njn.a(this.f30455a.getClass().getName()).c();
        lar.f("popCenter_init");
        c.a("LauncherRuntime.sUseWelcome", LauncherRuntime.m);
        e.e("optimize", "onCreateView 查找 R.id.home_bg_container");
        this.f30455a.getHomePageManager().a(new com.taobao.homepage.view.widgets.bgcontainer.b((BGContainerView) this.f30455a.getRootView().findViewById(R.id.home_bg_container), this.f30455a));
        oiy.a().a(this.f30455a);
        lar.e("initSearchBar");
        a((RelativeLayout) a2.findViewById(R.id.search_bar_container));
        lar.f("initSearchBar");
        lar.e("onContainerSwitch");
        h();
        lar.f("onContainerSwitch");
        com.taobao.homepage.speed.a.a().b();
        c.a("isNewFace", "true");
        lar.i("TriggerProcess");
        f.a();
        lar.j("TriggerProcess");
        this.f30455a.getHomePageManager().c().a(this.f30455a.getCurActivity().getIntent());
        las.f();
        this.f30455a.getHomePageManager().j().a().set(true);
        lar.e("TabBarActionButtonManager");
        this.f30455a.getHomePageManager().g().a(this.f30455a.getHomePageManager());
        lar.f("TabBarActionButtonManager");
        this.f30455a.getHomePageManager().p().a();
        nuv.a(this.f30455a);
        try {
            kug.a().a(this.f30455a, new kuh(this.f30455a.getCurActivity().getIntent()), true);
        } catch (Exception e) {
            c.c("外链处理异常： " + e);
        }
        lar.e("notify_onCreateView");
        oql.a().b();
        lar.f("notify_onCreateView");
        c.b();
        return a2;
    }

    @Override // tb.lbr
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        super.a(bundle);
        if (!b || !com.taobao.homepage.utils.n.n().o()) {
            return;
        }
        b = false;
        f();
    }

    @Override // tb.lbr, tb.lbm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        com.taobao.tao.homepage.a.a(g.a(), "coldStart");
        kxf.a().c(50017);
        c.a().e("coldStart");
        lap.a("【Homepage_PageLifeCycle】", "coldStartOnResume", "");
    }

    @Override // tb.lbr, tb.lbm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        c.a().m();
    }

    /* loaded from: classes7.dex */
    public static class a implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1153374895);
            kge.a(-1747099954);
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("speed_status", TBSpeed.getCurrentSpeedStatus());
            return hashMap;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("newMultiTab", (Object) true);
        jSONObject.put("newNewFace", (Object) true);
        kss.a("Page_Home", 19999, "coldSwitch", "", "", jSONObject);
        lap.a("HomePageInit", "coldStart_switch", "是否是多tab: true 是否是newFace: true");
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        oqc.a().e();
        if (!com.taobao.homepage.utils.n.o()) {
            return;
        }
        com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: tb.lbn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Activity i = lbn.this.i();
                if (i == null) {
                    return;
                }
                new com.taobao.homepage.view.manager.f().a(i.getApplication());
            }
        });
    }
}
