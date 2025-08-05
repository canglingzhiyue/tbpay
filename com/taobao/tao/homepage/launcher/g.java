package com.taobao.tao.homepage.launcher;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.TBEditionSwitcherElderHomePopBridge;
import com.taobao.android.editionswitcher.TBEditionSwitcherPopBridge;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.utils.c;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.HomePageLBSWVPlugin;
import com.taobao.tao.homepage.windvane.HomePageWVPlugin;
import com.taobao.tao.linklog.RecommendLinkLogAdapter;
import com.taobao.tao.recommend3.TradeInfoFlowWVPlugin;
import java.util.HashMap;
import tb.ghj;
import tb.gho;
import tb.gmq;
import tb.kge;
import tb.kss;
import tb.lap;
import tb.laq;
import tb.opn;
import tb.opo;
import tb.opp;
import tb.oqc;
import tb.ord;

/* loaded from: classes.dex */
public class g extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEVICE_LEVEL_HIGH = "h";
    public static final String DEVICE_LEVEL_LOW = "l";
    public static final String DEVICE_LEVEL_MID = "m";
    private static Application b;
    private static volatile String c;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == -193894180) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(581850605);
        c = null;
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        this.f20600a.a("HomeLauncher", 4);
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomeLauncher", "HomeLauncher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        b = application;
        if (!com.taobao.homepage.utils.i.a()) {
            com.taobao.tao.linklog.a.a(new RecommendLinkLogAdapter());
        }
        FestivalMgr.a().b();
        d();
        c();
        gmq.a();
        com.ut.mini.module.plugin.d.getInstance().registerPlugin(com.taobao.homepage.utils.g.a());
        com.taobao.tao.navigation.e.a(new com.taobao.tao.homepage.c());
        ord.b();
        gmq.a("launcher");
        com.taobao.android.tschedule.parser.a.a("orderListRecmdPrefetchEnable", new opn());
        com.taobao.android.tschedule.parser.a.a("paySuccessRecmdPrefetchEnable", new opo());
        com.taobao.android.tschedule.parser.a.a("shoppingCartRecmdPrefetchEnable", new opp());
        lap.a("LauncherTask", "HomeLauncher", "HomeLauncher.init; 首页业务初始化");
        this.f20600a.b("HomeLauncher");
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
        }
        Application application = b;
        return application == null ? Globals.getApplication() : application;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (TextUtils.isEmpty(c)) {
            c = c.a.a("home_device", "level", "l");
        }
        return c;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        c = str;
        c.a.b("home_device", "level", str);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            android.taobao.windvane.jsbridge.q.a("TBHomePageWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) HomePageWVPlugin.class, true);
            android.taobao.windvane.jsbridge.q.a("TBTradeInfoflowWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) TradeInfoFlowWVPlugin.class, true);
            android.taobao.windvane.jsbridge.q.a("TBHClientCache", (Class<? extends android.taobao.windvane.jsbridge.e>) HomePageLBSWVPlugin.class, true);
        } catch (Exception e) {
            com.taobao.android.home.component.utils.e.b("WVPluginManager.registerPlugin exception:", e, new String[0]);
            kss.a("Page_Home", 19999, "WVPluginRegister_fail", "");
        }
        String str = "jsBridge register cost: " + (System.currentTimeMillis() - currentTimeMillis);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!com.taobao.homepage.utils.n.n().j()) {
            com.taobao.android.editionswitcher.core.a.a(new com.taobao.android.editionswitcher.core.d() { // from class: com.taobao.tao.homepage.launcher.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.editionswitcher.core.d
                public void a(ghj ghjVar, gho ghoVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("73c26791", new Object[]{this, ghjVar, ghoVar});
                    } else if (ghjVar == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("switchVersionRequest", (Object) ghjVar.b());
                        if (ghjVar.c != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("switcherVersion", (Object) ghjVar.c.c);
                            jSONObject.put("bizParam", (Object) jSONObject2);
                        }
                        laq.a().a("MTopRequest").b("HomeLauncherdoEditionSwitch").a(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, "editionSwitch").a("switchVersionRequest", jSONObject.toString()).b();
                        oqc.a().f(jSONObject);
                    }
                }
            });
            try {
                android.taobao.windvane.jsbridge.q.a("TBEditionSwitcherElderHomePopBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TBEditionSwitcherElderHomePopBridge.class, true);
                android.taobao.windvane.jsbridge.q.a("TBEditionSwitcherPopBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TBEditionSwitcherPopBridge.class, true);
            } catch (Exception e) {
                com.taobao.android.home.component.utils.e.b("WVPluginManager.registerPlugin exception:", e, new String[0]);
                kss.a("Page_Home", 19999, "WVPluginRegister_fail", "");
            }
        } else {
            com.taobao.tao.topmultitab.c.a().c().a();
        }
    }
}
