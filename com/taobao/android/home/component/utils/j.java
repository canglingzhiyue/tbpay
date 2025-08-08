package com.taobao.android.home.component.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.akt;
import tb.kge;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "homepage_switch";

    static {
        kge.a(1787325045);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        return true;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            String a2 = c.a().a(str, str2);
            e.b("HomeSwitchCenter", str + "=" + a2);
            return a2;
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str, z + "");
        return StringUtils.isEmpty(a2) ? z : a2.trim().toLowerCase().equals("true");
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.valueOf(a(str, i + "")).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    public static double a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81239a3a", new Object[]{str, new Double(d)})).doubleValue();
        }
        try {
            return Double.valueOf(a(str, d + "")).doubleValue();
        } catch (Throwable unused) {
            return d;
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        String a2 = a("home_location_interval_switch", "12");
        if (!StringUtils.isEmpty(a2)) {
            try {
                return Integer.valueOf(a2).intValue();
            } catch (Throwable unused) {
                Log.e("HomeSwitchCenter", "time limit NumberFormatException");
            }
        }
        return 12;
    }

    public static double d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2d9", new Object[0])).doubleValue();
        }
        String a2 = a("homeLocationRefreshDistance", "500");
        if (!StringUtils.isEmpty(a2)) {
            try {
                return Double.valueOf(a2).doubleValue();
            } catch (Throwable unused) {
                Log.e("HomeSwitchCenter", "distance NumberFormatException");
            }
        }
        return 500.0d;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        int a2 = a("mediaAutoPlayLimitScore", 20);
        return a2 > 0 ? akt.b() > ((float) a2) : com.taobao.application.common.c.a().a(com.taobao.tbdeviceevaluator.c.KEY_OLD_SCORE, -1) >= 40;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : a("enableHomePageOverlayPageList", "");
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : a("enableWindVanePageList", "");
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : a("needItemIdCountForCardRepeat", 100);
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : a("needClickItemIdCountForAlgorithm", 100);
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : a("enableSecondFloorWhiteList", "coldStart,pullRefresh,hotStart");
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : a("afterBuyPopSceneWhiteList", "Page_OrderList,Page_ShoppingCart,Page_OrderDetail,Page_Logistic,Page_PaySuccess");
    }
}
