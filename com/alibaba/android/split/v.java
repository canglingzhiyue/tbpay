package com.alibaba.android.split;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BundleSplitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.mqt;
import tb.rfx;

/* loaded from: classes.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAN_USE_HISTORY_FEATURES = "can_use_history_features";
    public static final String CAN_USE_PRELOAD_FEATURES = "can_use_preload_features";
    public static final String DISABLED_HIS_PATCH_VERSIONS = "disabled_his_patch_versions";
    public static final String DISABLED_USE_HISTORY_FEATURES = "disabled_use_history_features";
    public static final String DISABLED_USE_PRELOAD_FEATURES = "disabled_use_preload_features";
    public static final String FLEX_INSTALL_FEATURE_FROM_CHANNEL = "flexa_install_feature_from_channel";

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f2516a;
    private static String b;
    private static final List<String> c;
    private static final List d;
    public static Map<String, y> e;

    static {
        kge.a(1082555479);
        e = new HashMap();
        d = new ArrayList();
        f2516a = null;
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        arrayList.add("taobao_wangxin");
        c.add("messagesdkwrapper");
        c.add(com.taobao.appbundle.c.TAOPAI_SDK_FEATURE);
        c.add("triver_taobao");
        c.add("rxandroid");
        c.add(com.taobao.android.live.plugin.proxy.e.ATYPE);
        c.add("taobao_weex_adapter");
        c.add(com.taobao.android.live.plugin.proxy.e.BTYPE);
        c.add(com.taobao.taolive.sdk.morelive.e.MORE_FEATURE);
        c.add("fluid_framework");
        c.add(com.taobao.android.live.plugin.proxy.e.TAOLIVE_HOMEPAGE);
        c.add(com.taobao.android.live.plugin.proxy.e.TBLIVE_GIFT);
        e.put("com.taobao.android.detail.wrapper.activity.DetailActivity", z.a("com.taobao.android.detail.wrapper.activity.DetailActivity").a(true).a());
        e.put("com.taobao.search.searchdoor.SearchDoorActivity", z.a("com.taobao.search.searchdoor.SearchDoorActivity").a(true).a());
        e.put("com.taobao.search.sf.MainSearchResultActivity", z.a("com.taobao.search.sf.MainSearchResultActivity").a(true).a());
        e.put("com.taobao.android.order.bundle.TBOrderListActivity", z.a("com.taobao.android.order.bundle.TBOrderListActivity").a(true).a());
        e.put("com.taobao.android.order.bundle.TBOrderDetailActivity", z.a("com.taobao.android.order.bundle.TBOrderDetailActivity").a(true).a());
        e.put("com.taobao.bootimage.activity.BootImageActivity", z.a("com.taobao.bootimage.activity.BootImageActivity").a(true).a());
        e.put("com.taobao.browser.BrowserActivity", z.a("com.taobao.browser.BrowserActivity").a(true).a());
        e.put("com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity", z.a("com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity").a(true).a());
        e.put("com.taobao.themis.container.app.TMSActivity", z.a("com.taobao.themis.container.app.TMSActivity").a("umipublish").a(false).a());
        e.put("com.taobao.android.layoutmanager.container.CommonContainerActivity", z.a("com.taobao.android.layoutmanager.container.CommonContainerActivity").a(true).a());
        e.put("com.taobao.detail.rate.RateViewPagerActivity", z.a("com.taobao.detail.rate.RateViewPagerActivity").a("ratefeature").a(false).a());
        e.put("com.taobao.android.detail.alittdetail.TTDetailActivity", z.a("com.taobao.android.detail.alittdetail.TTDetailActivity").a("dtao_liveshop_ttdetail").a(false).a());
        e.put(BundleSplitUtil.ACTIVITY_NAME, z.a(BundleSplitUtil.ACTIVITY_NAME).a(true).a());
        e.put("com.taobao.message.activity.ChatActivityV2", z.a("com.taobao.message.activity.ChatActivityV2").a(true).a());
        e.put(com.taobao.android.live.plugin.proxy.e.TAO_LIVE_HOME_ACTIVITY, z.a(com.taobao.android.live.plugin.proxy.e.TAO_LIVE_HOME_ACTIVITY).a(com.taobao.android.live.plugin.proxy.e.TAOLIVE_HOMEPAGE, com.taobao.android.live.plugin.proxy.e.BTYPE, com.taobao.android.live.plugin.proxy.e.ATYPE, com.taobao.android.live.plugin.proxy.e.TBLIVE_GIFT).a(false).a());
        e.put("com.alibaba.triver.triver_shop.newShop.ShopActivity", z.a("com.alibaba.triver.triver_shop.newShop.ShopActivity").a("tbsearch_remote", "triver_taobao", com.taobao.android.live.plugin.proxy.e.ATYPE).a(false).a());
        e.put(com.taobao.android.live.plugin.proxy.e.TAO_LIVE_VIDEO_ACTIVITY, z.a(com.taobao.android.live.plugin.proxy.e.TAO_LIVE_VIDEO_ACTIVITY).a(com.taobao.android.live.plugin.proxy.e.TAOLIVE_HOMEPAGE, com.taobao.android.live.plugin.proxy.e.BTYPE, com.taobao.android.live.plugin.proxy.e.ATYPE, com.taobao.android.live.plugin.proxy.e.TBLIVE_GIFT).a(false).a());
        e.put("com.taobao.pha.tb.tabcontainer.TabFrameActivity", z.a("com.taobao.pha.tb.tabcontainer.TabFrameActivity").a(false).a("umipublish").a());
        e.put("com.taobao.weex.weexv2.page.WeexV2Activity", z.a("com.taobao.weex.weexv2.page.WeexV2Activity").a(true).a());
        e.put("com.taobao.android.detail.ttdetail.TTDetailBaseActivity", z.a("com.taobao.android.detail.ttdetail.TTDetailBaseActivity").a(true).a());
        e.put("com.taobao.android.tucaoba.ondemand.EntryActivity", z.a("com.taobao.android.tucaoba.ondemand.EntryActivity").a(false).a("tucaobafeature").a());
        e.put("com.taobao.android.detail.alittdetail.TTDetailActivity", z.a("com.taobao.android.detail.alittdetail.TTDetailActivity").a(true).a());
        e.put("com.etao.feimagesearch.IrpActivity", z.a("com.etao.feimagesearch.IrpActivity").a(true).a());
        e.put("com.etao.feimagesearch.capture.CaptureActivity", z.a("com.etao.feimagesearch.capture.CaptureActivity").a(true).a());
        e.put("com.taobao.android.layoutmanager.container.MultiPageContainerActivity", z.a("com.taobao.android.layoutmanager.container.MultiPageContainerActivity").a(true).a());
        e.put("com.taobao.login4android.membercenter.security.SecurityEntranceActivity", z.a("com.taobao.login4android.membercenter.security.SecurityEntranceActivity").a(true).a());
        e.put("com.taobao.android.auth.AuthEntranceActivity", z.a("com.taobao.android.auth.AuthEntranceActivity").a(true).a());
        e.put("com.taobao.android.address.WeexPopContainer", z.a("com.taobao.android.address.WeexPopContainer").a(true).a());
        e.put("com.taobao.android.address.H5PopActivity", z.a("com.taobao.android.address.H5PopActivity").a(true).a());
        e.put("com.taobao.message.chatv2.aura.AuraContainerActivity", z.a("com.taobao.message.chatv2.aura.AuraContainerActivity").a(true).a());
        e.put("com.taobao.message.chatv2.aura.MyExpressActivity", z.a("com.taobao.message.chatv2.aura.MyExpressActivity").a(true).a());
        e.put("com.taobao.android.address.wrapper.AddressEntranceActivity", z.a("com.taobao.android.address.wrapper.AddressEntranceActivity").a(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC).a(false).a());
        e.put("com.taobao.login4android.membercenter.security.SecurityEntranceActivity", z.a("com.taobao.login4android.membercenter.security.SecurityEntranceActivity").a(true).a());
        e.put("com.taobao.android.auth.AuthEntranceActivity", z.a("com.taobao.android.auth.AuthEntranceActivity").a(true).a());
        e.put("com.taobao.android.address.WeexPopContainer", z.a("com.taobao.android.address.WeexPopContainer").a(true).a());
        e.put("com.taobao.android.address.H5PopActivity", z.a("com.taobao.android.address.H5PopActivity").a(true).a());
        e.put("com.alipay.android.app.pay.MiniLaucherActivity", z.a("com.alipay.android.app.pay.MiniLaucherActivity").a(true).a());
        e.put("com.taobao.tao.alipay.cashdesk.CashDeskActivity", z.a("com.taobao.tao.alipay.cashdesk.CashDeskActivity").a(true).a());
        e.put("com.alipay.android.msp.ui.views.MspContainerActivity", z.a("com.alipay.android.msp.ui.views.MspContainerActivity").a(true).a());
        e.put("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity", z.a("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity").a(true).a());
        e.put("com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity", z.a("com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity").a("umipublish").a(false).a());
        e.put("com.taobao.browser.exbrowser.BrowserUpperActivity", z.a("com.taobao.browser.exbrowser.BrowserUpperActivity").a(true).a());
        e.put("com.taobao.android.tbabilitykit.pop.StdPopActivityGroup", z.a("com.taobao.android.tbabilitykit.pop.StdPopActivityGroup").a(true).a());
        e.put("com.taobao.android.tbabilitykit.pop.StdPopContainerActivity", z.a("com.taobao.android.tbabilitykit.pop.StdPopContainerActivity").a(true).a());
        e.put("com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity", z.a("com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity").a("taobao_favorite_aar").a(false).a());
        e.put("com.taobao.login4android.membercenter.account.MultiAccountActivity", z.a("com.taobao.login4android.membercenter.account.MultiAccountActivity").a(true).a());
        e.put("com.alibaba.triver.container.TriverMainActivity", z.a("com.alibaba.triver.container.TriverMainActivity").a("triver_taobao").a(false).a());
        e.put("com.alibaba.triver.kit.pub.impl.TBAppInterceptBackProxyImpl", z.a("com.alibaba.triver.kit.pub.impl.TBAppInterceptBackProxyImpl").a("triver_taobao").a(false).a());
        e.put("com.alibaba.triver.kit.pub.impl.PubAppLoadProxyImpl", z.a("com.alibaba.triver.kit.pub.impl.PubAppLoadProxyImpl").a("triver_taobao").a(false).a());
        e.put("com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity", z.a("com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity").a(true).a());
        e.put("com.taobao.weex.WXActivity", z.a("com.taobao.weex.WXActivity").a("taobao_weex_adapter").a("triver_taobao").a(false).a());
        e.put("com.taobao.search.common.SearchInShopRouteActivity", z.a("com.taobao.search.common.SearchInShopRouteActivity").a(true).a());
        e.put("com.taobao.search.sf.InshopResultActivity", z.a("com.taobao.search.sf.InshopResultActivity").a(true).a());
        e.put("com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity", z.a("com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity").a("taobao_wangxin").a(false).a());
        e.put("com.taobao.message.chat.interactive.InteractiveDetailActivity", z.a("com.taobao.message.chat.interactive.InteractiveDetailActivity").a("taobao_wangxin").a(false).a());
        e.put("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity", z.a("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity").a(true).a());
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue() : a(context).contains(str);
    }

    public static Set<String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("4db184f", new Object[]{context});
        }
        HashSet hashSet = new HashSet();
        SharedPreferences i = i(context);
        String string = i.getString("disableFeatures_" + h(context), "");
        if (!StringUtils.isEmpty(string)) {
            hashSet.addAll(Arrays.asList(string.split(",")));
        }
        return hashSet;
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences i = i(context);
        String string = i.getString("disableUpdateFeatures_" + h(context), "");
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        return Arrays.asList(string.split(",")).contains(str);
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a994c9f3", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("open_flexa_scene_" + h(context), true);
    }

    private static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context});
        }
        try {
            if (!StringUtils.isEmpty(b)) {
                return b;
            }
            b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return b;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "1.0.0";
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("download_feature_enabled_" + h(context), true);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_enabled_" + h(context), true);
    }

    private static SharedPreferences i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("61c61c2c", new Object[]{context});
        }
        if (f2516a == null) {
            f2516a = context.getSharedPreferences("dynamic_features_config", 0);
        }
        return f2516a;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("deffered_download_feature_enabled_" + h(context), true);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("can_use_history_features_" + h(context), true);
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("can_use_preload_features_" + h(context), false);
    }

    public static boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54b79ec", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getStringSet("disabled_use_history_features_" + h(context), new HashSet()).contains(str);
    }

    public static boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f161bcb", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getStringSet("disabled_use_preload_features_" + h(context), new HashSet()).contains(str);
    }

    public static boolean a(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("450e8f59", new Object[]{context, str, set})).booleanValue() : i(context).edit().putStringSet(str, set).commit();
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a588c439", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_install_feature_from_channel_" + h(context), true);
    }

    public static boolean b(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("389e139a", new Object[]{context, str, set})).booleanValue() : i(context).edit().putStringSet(str, set).commit();
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else {
            i(context).edit().putBoolean(str, z).commit();
        }
    }

    public static void b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49adbeb", new Object[]{context, str, new Boolean(z)});
        } else {
            i(context).edit().putBoolean(str, z).commit();
        }
    }

    public static Set<String> o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("adc8db81", new Object[]{context});
        }
        SharedPreferences i = i(context);
        return i.getStringSet("disabled_his_patch_versions_" + h(context), new HashSet());
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_force_enabled_" + h(context), true);
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_delegate_resources_enabled_" + h(context), false);
    }

    public static boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e0bdaa", new Object[]{context, str})).booleanValue();
        }
        if (c.contains(str)) {
            return true;
        }
        SharedPreferences i = i(context);
        return i.getStringSet("flexa_pre_compile_features_" + h(context), new HashSet()).contains(str);
    }

    public static boolean f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ab5f89", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        if (str.endsWith("$ipReplace")) {
            str = str.substring(0, str.length() - 10);
        }
        try {
            if (e.containsKey(str)) {
                e.get(str).a(context);
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return i(context).getStringSet(rfx.FLEXA_CLOSE_ACTIVITY_INSTALL_RESOURCES, new HashSet()).contains(str);
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6356fd8", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_clean_hisfeatures_features_" + h(context), true);
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6e21b77", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_add_split_to_loadedapk_" + h(context), true);
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83b72b5", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_opt_service_" + h(context), true);
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e81e54", new Object[]{context})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_disabled_verify_" + h(context), true);
    }

    public static boolean c(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d42475f0", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences i = i(context);
        return i.getBoolean("flexa_feature_diff_opened_" + h(context) + "_" + str, z);
    }
}
