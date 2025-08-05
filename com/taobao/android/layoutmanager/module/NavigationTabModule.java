package com.taobao.android.layoutmanager.module;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamic.f;
import com.taobao.android.layoutmanager.adapter.impl.s;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.r;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import com.taobao.tao.flexbox.layoutmanager.module.Priority;
import com.taobao.tao.navigation.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ilw;
import tb.kge;
import tb.lyu;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ohd;
import tb.ohg;

/* loaded from: classes5.dex */
public class NavigationTabModule implements lyu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Integer DEFAULT_NAVIGATION_COLOR = null;
    private static final String TAG = "NavigationTabModule";
    private static g.c context;
    private static String currentIconData;
    private static boolean getIconInfoCalled;
    private static boolean inResetTab;
    private static JSON lastTabBarColor;
    private static int sBeforeHideNavigationBarColor;
    private static List<a> sShowHideStatusListeners;

    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    private static String getNavigationStatusDesc(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94228451", new Object[]{new Integer(i)}) : i == 14 ? "appear" : i == 15 ? "disappear" : i == 13 ? "click" : "unknown";
    }

    public String getTabBiz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e9d345", new Object[]{this}) : "tab2";
    }

    public static /* synthetic */ g.c access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g.c) ipChange.ipc$dispatch("2b5c1de6", new Object[0]) : context;
    }

    static {
        kge.a(-386244983);
        kge.a(-818961104);
        kge.a(-908668014);
        DEFAULT_NAVIGATION_COLOR = null;
        sShowHideStatusListeners = null;
        context = null;
        initDefaultNavigationColor();
        registerPadScreenChanged();
    }

    public static int getDefaultNavigationColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c98e229e", new Object[0])).intValue();
        }
        Integer num = DEFAULT_NAVIGATION_COLOR;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private static void initDefaultNavigationColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d3e3e5", new Object[0]);
            return;
        }
        d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        if (DEFAULT_NAVIGATION_COLOR != null || b == null || b.a() == null) {
            return;
        }
        DEFAULT_NAVIGATION_COLOR = Integer.valueOf(ohd.c(b.a()));
    }

    public static void resetTab(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd776c52", new Object[]{cVar});
            return;
        }
        context = null;
        inResetTab = true;
        NavigationTabHelper.a(cVar);
        inResetTab = false;
    }

    public static void setTabAnimationIcon(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5838f8e", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            setTabAnimationIcon((String) ((Map) cVar.b).get("icon"));
        }
    }

    public static void setTabAnimationIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fc081b", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            final ImageView imageView = new ImageView(e.c().getContext());
            b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.layoutmanager.module.NavigationTabModule.1
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
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                        e.a(1, imageView);
                    }
                    return false;
                }
            }).fetch();
        }
    }

    public static void isInTab(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc02b2f2", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            int a2 = oec.a(((Map) cVar.b).get("index"), 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) Boolean.valueOf(com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(a2)));
            cVar.c.a(cVar, jSONObject);
        }
    }

    public static void isInHomeLiveTab(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23302afd", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("inLiveTab", (Object) false);
        cVar.c.a(cVar, jSONObject);
    }

    public static void closeLargeIconPop(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af83e83", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) true);
        cVar.c.a(cVar, jSONObject);
    }

    public static void queryPop(g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb71a0f", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            String str = (String) ((Map) cVar.b).get("layerType");
            JSONObject jSONObject2 = new JSONObject();
            if (PopLayer.isSetup()) {
                JSONObject queryNowPopCount = PopLayer.queryNowPopCount();
                if (queryNowPopCount.containsKey("completeLayerType") && (jSONObject = queryNowPopCount.getJSONObject("completeLayerType")) != null && jSONObject.containsKey(str)) {
                    jSONObject2.put("completeCount", (Object) Integer.valueOf(queryNowPopCount.getJSONObject("completeLayerType").getIntValue(str)));
                }
            }
            jSONObject2.put("largeIconPopIsShowing", (Object) false);
            cVar.c.a(cVar, jSONObject2);
        }
    }

    public static void queryLargeIconStatus(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812b6d9a", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("largeIconMode", (Object) false);
        jSONObject.put("largeIconPopIsShowing", (Object) false);
        jSONObject.put("homeLiveTabStatus", (Object) true);
        jSONObject.put("poplayerStatus", (Object) true);
        d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        if (b != null) {
            jSONObject.put("mainTabStatus", (Object) Integer.valueOf(b.b()));
        }
        jSONObject.put("festivalStatus", (Object) false);
        cVar.c.a(cVar, jSONObject);
    }

    public static void setCustomIcon(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7465b4c", new Object[]{cVar});
            return;
        }
        context = cVar;
        NavigationTabHelper.setCustomIcon(cVar);
    }

    private static void registerPadScreenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5726341f", new Object[0]);
        } else if (!ohd.a(3)) {
        } else {
            h.a().c(new OnScreenChangedListener() { // from class: com.taobao.android.layoutmanager.module.NavigationTabModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    } else {
                        oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.module.NavigationTabModule.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ogg.a(NavigationTabModule.TAG, "--发生了横竖屏切换" + NavigationTabModule.access$000());
                                if (NavigationTabModule.access$000() == null) {
                                    return;
                                }
                                NavigationTabModule.setCustomIcon(NavigationTabModule.access$000());
                            }
                        }, 100L);
                    }
                }
            });
        }
    }

    @Priority(name = "high")
    public static void changeTabBarColor(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9436403", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map) || hasForbiddenFestival() || !enableChangeTabColor()) {
        } else {
            Object obj = ((Map) cVar.b).get(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR);
            Object obj2 = ((Map) cVar.b).get("iconColor");
            boolean a2 = oec.a(((Map) cVar.b).get(DMComponent.RESET), false);
            initDefaultNavigationColor();
            d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (b == null || !b.a(1)) {
                return;
            }
            b.a(obj2, obj, a2, DEFAULT_NAVIGATION_COLOR);
            lastTabBarColor = cVar.b;
        }
    }

    private static boolean enableChangeTabColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9dd2690c", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_change_tab_color", "true").equals("true");
    }

    private static boolean hasTabFestival() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d2e7c3e", new Object[0])).booleanValue() : s.e();
    }

    private static boolean hasForbiddenFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f536c622", new Object[0])).booleanValue();
        }
        if (checkTabbarFestival()) {
            return hasTabFestival();
        }
        return s.d() != 0;
    }

    private static boolean checkTabbarFestival() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2f100a9", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_check_tabbar_festival", "true").equals("true");
    }

    private static boolean enableQuickSetTabColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3aecc451", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_quick_set_tab_color", "false").equals("true");
    }

    public static void onTabChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d6597e", new Object[]{new Integer(i)});
        } else if (i == 1) {
            if (lastTabBarColor != null && enableQuickSetTabColor()) {
                changeTabBarColor(new g.c(null, lastTabBarColor, null));
            }
            NavigationTabHelper.b();
        } else if (!enableHideNavigation()) {
        } else {
            d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (b != null) {
                b.a(false, false);
            }
            if (!oeb.a("fixNavigationBarHide", true)) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.module.NavigationTabModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().b() == 1) {
                            return;
                        }
                        e.b(false);
                    } catch (Throwable unused) {
                    }
                }
            }, 300L);
        }
    }

    public static void onReset() {
        JSON json;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[0]);
            return;
        }
        d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        if (b == null || !b.a(1) || (json = lastTabBarColor) == null) {
            return;
        }
        changeTabBarColor(new g.c(null, json, null));
    }

    public static void setTabbarItem(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262f925", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            int a2 = oec.a(((Map) cVar.b).get("index"), 1);
            String a3 = oec.a(((Map) cVar.b).get("selectedImage"), "");
            String a4 = oec.a(((Map) cVar.b).get("unselectedImage"), "");
            String a5 = oec.a(((Map) cVar.b).get("title"), "");
            d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (b == null) {
                return;
            }
            b.a(a2, a3, a4, a5);
        }
    }

    public static void clearTabbarItemCache(g.c cVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d18074", new Object[]{cVar});
            return;
        }
        if (cVar.b instanceof Map) {
            i = oec.a(((Map) cVar.b).get("index"), 1);
        }
        d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        if (b == null) {
            return;
        }
        b.b(i);
    }

    public static void isForeignSelected(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f62cf3", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            boolean c = LocationHelper.c(cVar.a());
            boolean a2 = TBRevisionSwitchManager.i().a(ilw.KEY_NEW_DISCOVERY_ENABLE);
            if (c && a2) {
                z = true;
            }
            jSONObject.put("result", (Object) Boolean.valueOf(z));
            cVar.c.a(cVar, jSONObject);
        }
    }

    public static void envForTabIcon(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6fd826", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            boolean c = LocationHelper.c(cVar.a());
            boolean a2 = TBRevisionSwitchManager.i().a(ilw.KEY_NEW_DISCOVERY_ENABLE);
            IFestival.FestivalInfo a3 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().d().a();
            jSONObject.put("isFestivalOn", (Object) Boolean.valueOf(a3.isFestivalOn));
            jSONObject.put("hasTabbarFestival", (Object) Boolean.valueOf(a3.hasTabbarFestival));
            jSONObject.put("isTabbarTitleSplit", (Object) Boolean.valueOf(a3.isTabbarTitleSplit));
            if (c && a2) {
                z = true;
            }
            jSONObject.put("isForeignSelected", (Object) Boolean.valueOf(z));
            jSONObject.put(f.IS_ELDER, (Object) Boolean.valueOf(com.taobao.tao.flexbox.layoutmanager.adapter.a.a().z().a()));
            cVar.c.a(cVar, jSONObject);
        }
    }

    public static void setTabbarHidden(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989f36e", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            boolean a2 = oec.a(((Map) cVar.b).get("hidden"), false);
            boolean a3 = oec.a(((Map) cVar.b).get("animate"), true);
            d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (!enableHideNavigation() || b == null || !b.a(cVar.a())) {
                return;
            }
            if (a2 && b.a(1)) {
                z = true;
            }
            b.a(z, a3);
            if (!enableChangeNavigationColor() || b.a() == null) {
                return;
            }
            Activity a4 = b.a();
            if (z) {
                sBeforeHideNavigationBarColor = ohd.c(a4);
                ohd.b(a4, -16777216);
                return;
            }
            ohd.b(a4, sBeforeHideNavigationBarColor);
        }
    }

    public static void isTabbarHidden(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df4d7a6", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (b != null && b.g()) {
                z = true;
            }
            if (cVar.c == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("result", Boolean.valueOf(!z));
            cVar.c.a(cVar, hashMap);
        }
    }

    public static void getIconInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61236abb", new Object[]{cVar});
            return;
        }
        getIconInfoCalled = true;
        if (cVar.c == null) {
            return;
        }
        JSONObject jSONObject = null;
        String str = currentIconData;
        if (str != null) {
            try {
                jSONObject = JSONObject.parseObject(str);
            } catch (Throwable unused) {
                ogg.a(TAG, "getIconInfo, iconstream invalid: " + currentIconData);
            }
        }
        cVar.c.a(cVar, jSONObject);
    }

    public static void currentTbVersionInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6580b7d9", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            r z = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().z();
            if (cVar.c == null || z == null) {
                return;
            }
            cVar.c.a(cVar, z.c());
        }
    }

    private static boolean enableHideNavigation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b34c5964", new Object[0])).booleanValue() : ohg.a().a("weitao_switch", "enableHideNavigation", "true").equals("true");
    }

    private static boolean enableChangeNavigationColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e63810a7", new Object[0])).booleanValue() : ohg.a().a("weitao_switch", "enableChangeNavigationColor", "false").equals("true");
    }

    public static void notifyNavigationShowHideStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5971ad9f", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (sShowHideStatusListeners != null) {
                for (a aVar : sShowHideStatusListeners) {
                    if (aVar != null) {
                        aVar.a(z);
                    }
                }
            }
        } catch (Throwable th) {
            ogg.a("notifyNavigationShowHideStatus", th.getMessage());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "GuangguangBottomTabbarHiddenChanged");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("hidden", (Object) Boolean.valueOf(z));
        jSONObject2.put("realHidden", (Object) Boolean.valueOf(!e.j()));
        jSONObject.put("args", (Object) jSONObject2);
        NotifyModule.postNotify(new g.c(null, jSONObject, null));
    }

    public static void registerNavigationShowHideStatusListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a77bd8", new Object[]{aVar});
            return;
        }
        if (sShowHideStatusListeners == null) {
            sShowHideStatusListeners = new ArrayList();
        }
        if (aVar == null || sShowHideStatusListeners.contains(aVar)) {
            return;
        }
        sShowHideStatusListeners.add(aVar);
    }

    public static void unregisterNavigationShowHideStatusListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb3ef9f", new Object[]{aVar});
            return;
        }
        List<a> list = sShowHideStatusListeners;
        if (list == null || aVar == null) {
            return;
        }
        list.remove(aVar);
    }

    @Override // tb.lyu
    public void onIntroductoryStateChanged(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539cca12", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        ogg.a(TAG, "onIntroductoryStateChanged, materialType: " + str + " status: " + i + " data:" + str2);
        if (inResetTab && oeb.a("ignoreSelfResetTab", true)) {
            ogg.a(TAG, "onIntroductoryStateChanged for inResetTab, ignore");
        } else if (i != 14 && i != 15 && i != 13) {
        } else {
            if (i == 14) {
                currentIconData = str2;
            } else if (i == 15 && (getIconInfoCalled || !oeb.a("checkIconInfoCalled", true))) {
                currentIconData = null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "TNodeTabIconChanged");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) getNavigationStatusDesc(i));
            if (i == 14) {
                try {
                    jSONObject2.put("data", (Object) JSONObject.parseObject(str2));
                } catch (Throwable unused) {
                    ogg.a(TAG, "onIntroductoryStateChanged data invalid");
                }
            }
            jSONObject.put("args", (Object) jSONObject2);
            NotifyModule.postNotify(new g.c(null, jSONObject, null));
        }
    }
}
