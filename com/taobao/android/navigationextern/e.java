package com.taobao.android.navigationextern;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.launcher.common.h;
import com.taobao.android.navigationextern.e;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.speed.TBSpeed;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.hur;
import tb.hut;
import tb.huw;
import tb.ilw;
import tb.jqm;

/* loaded from: classes.dex */
public class e extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final AtomicBoolean f14468a = new AtomicBoolean(false);
    private static boolean b = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(Context context, Intent intent, boolean z, boolean z2);
    }

    public static /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : m();
    }

    public static /* synthetic */ AtomicBoolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("56318473", new Object[0]) : f14468a;
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        return new File("/data/local/tmp/.navigation_" + str).exists();
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (jqm.a() && b("local_switch")) {
            hut.b("NavigationExternSwitch", "use local switch: key " + str);
            return b(str);
        }
        return Boolean.parseBoolean(huw.b().b(str, str2));
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : TBRevisionSwitchManager.i().a(ilw.KEY_NEW_DISCOVERY_ENABLE);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "1".equals(TBRevisionSwitchManager.i().c("elderHome"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if ((!"false".equals(OrangeConfig.getInstance().getConfig("TBAppUISkeletonConfig", "elderAdaptation", "true"))) && !c() && a()) {
            TLog.loge("NavigationExternSwitch", "isTabBarElderHomeStyle: true");
            return true;
        }
        TLog.loge("NavigationExternSwitch", "isTabBarElderHomeStyle: false");
        return false;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : b.c() && !c();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : FestivalMgr.a().h() && FestivalMgr.a().g();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (!jqm.a()) {
            return TBRevisionSwitchManager.i().g();
        }
        return h.a(".newTBMain") || TBRevisionSwitchManager.i().g();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : TBRevisionSwitchManager.i().d();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : e();
    }

    public static void a(Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e226d2c7", new Object[]{context, aVar});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("taobao.action.ACTION_REVISION_SWITCH_CHANGE");
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.navigationextern.NavigationExternSwitch$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else {
                    e.a.this.a(context2, intent, e.l().get(), e.e());
                }
            }
        }, intentFilter);
    }

    private static String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : huw.b().b("orange_config_version", "-1");
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else if (b) {
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"uikit_sp_group"}, new com.taobao.orange.d() { // from class: com.taobao.android.navigationextern.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else if (!"uikit_sp_group".equals(str) || map == null) {
                    } else {
                        String k = e.k();
                        String str2 = map.get("configVersion");
                        if (StringUtils.equals(str2, k)) {
                            hut.b("NavigationExternSwitch", "configVersion not change for version equals. version: " + str2);
                            return;
                        }
                        huw.b().c().putString("key_cache_tab", OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_cache_tab", "true")).putString("key_change_message_view_color", OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_change_message_view_color", null)).putString("guardian_v2_switch_on", OrangeConfig.getInstance().getConfig("uikit_sp_group", "guardian_v2_switch_on", "false")).putString("load_icon_form_old_cache_offline", OrangeConfig.getInstance().getConfig("uikit_sp_group", "load_icon_form_old_cache_offline", "true")).putString("guardian_v2_clear_by_setting_switch_on", OrangeConfig.getInstance().getConfig("uikit_sp_group", "guardian_v2_clear_by_setting_switch_on", "true")).putString("orange_config_version", str2).commit();
                        String config = OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_clean_cache_tab", "-1");
                        if (!StringUtils.equals("-1", config)) {
                            hur.a().a(config);
                        }
                        hut.b("NavigationExternSwitch", "orange config updated; isCacheTabSwitchOpen:" + e.h() + " isCleanCacheSwitchOpen? " + config);
                    }
                }
            }, false);
            b = true;
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : !b.c() && b("key_cache_tab", "true");
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : huw.b().b("key_change_message_view_color", null);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : TBSpeed.isSpeedEdition(context, "navigation_external_key_init_async_v1");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : b("guardian_v2_switch_on", "false");
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : b("load_icon_form_old_cache_offline", "true");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : b("guardian_v2_clear_by_setting_switch_on", "true");
    }
}
