package com.taobao.search.common.util;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.kge;
import tb.qtd;

/* loaded from: classes7.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f19045a;
    private static boolean b;

    static {
        kge.a(1897060947);
        b = false;
        f19045a = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = com.taobao.search.rainbow.a.a(str);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        com.taobao.android.searchbaseframe.util.k.e("moyutest", "call rainbow cost " + currentTimeMillis2);
        if (!b) {
            AppMonitor.register("tbsearch", "rainbowCost", new String[]{"callCost"}, new String[]{"deviceLevel"}, false);
            b = true;
        }
        AppMonitor.Stat.commit("tbsearch", "rainbowCost", new String[]{"deviceLevel"}, new String[]{com.etao.feimagesearch.config.c.a()}, new String[]{"callCost"}, new String[]{String.valueOf(currentTimeMillis2)});
        return a2;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String a2 = com.taobao.search.rainbow.a.a(str);
        qtd qtdVar = new qtd();
        qtdVar.a("testName", str);
        qtdVar.a("testConfigValue", a2);
        TLogTracker.a("RainbowConfig", qtdVar);
        return a2;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidSRPSearchBarTagStyle"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : !StringUtils.isEmpty(a("tbAndroidMetaSearchEnabledV3"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        l();
        Boolean bool = f19045a;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return StringUtils.equals("enable", a("tbAndroidLoadMoreWhenAttached"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidSrpHeaderResuse"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidTrimMemory"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 23) {
            return StringUtils.equals("enable", a("tbAndroidRecycleNodeWhenPageLeave"));
        }
        return false;
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[0]);
        }
        String a2 = a("tbAndroidDynamicCardScene");
        return StringUtils.isEmpty(a2) ? com.taobao.search.sf.realtimetag.data.b.APP_ID_VALUE : a2;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidNewSubscribe"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidEventBusReset"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidReplaceM3"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : StringUtils.equals("enable", b("tbAndroidKeepColdLaunchLink"));
    }

    private static void l() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
        } else if (f19045a != null) {
        } else {
            DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
            if (downgradeStrategy != null && StringUtils.equals("degrade", downgradeStrategy.getTacticsPerformance())) {
                z = true;
            }
            f19045a = Boolean.valueOf(z);
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : r.e("searchDoorAsync");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidSrpAsyncLoadV2"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : StringUtils.equals("enable", b("tbAndroidFeedbackHideCard"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidNewVoiceSearchEnabled"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidTB2024StyleV2"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        if (SearchSdk.sRainbowInited) {
            return StringUtils.equals("enable", a("tbAndroidSearchDoorFirstScreen"));
        }
        return StringUtils.equals(w(), "enable");
    }

    private static String w() {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[0]);
        }
        VariationSet activate = UTABTest.activate("AB_SEARCH_DOOR", "202410091250_2417");
        return (activate == null || (variation = activate.getVariation("bucketId")) == null) ? "" : variation.getValueAsString("baseline");
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[0]);
        }
        if (SearchSdk.sRainbowInited) {
            return a("tbAndroidSearchDoorFirstScreen");
        }
        return w();
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidi18Preload"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : StringUtils.equals("enable", a("tbAndroidWeakNetworkPerf"));
    }
}
