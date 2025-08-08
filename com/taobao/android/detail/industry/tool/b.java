package com.taobao.android.detail.industry.tool;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-684422874);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : a("industry_custom_detail_android", "weex2_render_cover_rate", 10);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a("industry_custom_detail_android", "optQuickDeliverCreateView", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a("industry_custom_detail_android", "ar_expend_enable", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a("industry_custom_detail_android", "ar_isv_expend_enable", true);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String a2 = a("industry_custom_detail_android", "industry_custom_bizcodes", "[\"fmcg\",\"common_ofn_card_idle_fish\",\"common_ofn_card_recycle\",\"industry.main.pic.sku\",\"detail.product.perfume-effect\",\"detail.product.beauty-skin-record\",\"appliance\",\"costume\",\"detail.product.isv.ar\",\"detail.product.chima.old\",\"beautyARTrial\"]");
        try {
            List parseArray = JSONArray.parseArray(a2, String.class);
            if (parseArray != null) {
                if (parseArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
            ard a3 = arc.a();
            a3.c("IndustryOrange", "getIndustryBizCodes", "config=" + a2);
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        String a2 = a("industry_custom_detail_android", "industry_downgrade_bizcodes", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        try {
            List parseArray = JSONArray.parseArray(a2, String.class);
            if (parseArray != null) {
                if (parseArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
            ard a3 = arc.a();
            a3.c("IndustryOrange", "isNeedDowngradeIndustryBizCode", "config=" + a2);
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a("industry_custom_detail_android", "ar_camera_preview_set", false);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : a("industry_custom_detail_android", "beauty_ar_bizcode", "beautyARTrial");
    }

    private static int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        String a2 = a(str, str2, String.valueOf(i));
        return !StringUtils.isEmpty(a2) ? Integer.parseInt(a2) : i;
    }

    private static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : "true".equals(a(str, str2, String.valueOf(z)));
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
