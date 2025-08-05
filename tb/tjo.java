package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class tjo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_CHOOSE_RESULT = "choose_result";
    public static final String ARG1_DX_DOWNLOAD_ERROR = "dx_download_error";
    public static final String ARG1_DX_RENDER_VIEW_NULL = "dx_render_view_null";
    public static final String ARG1_DX_TEMPLATE_VERSION_ERROR = "dx_template_version_error";
    public static final String ARG1_RESOURCE_FAIL = "resource_fail";
    public static final String ARG1_SHOULD_SHOW_RESULT = "should_show_result";
    public static final int EVENT_ID = 2101;
    public static final String S_UT_ARG1 = "arg1";
    public static final String S_UT_ARG2 = "arg2";
    public static final String S_UT_ARG3 = "arg3";
    public static final String S_UT_ARGS = "args";
    public static final String S_UT_EVENT_ID = "eventId";
    public static final String S_UT_PAGE = "Page_Home_Splash_Interact";
    public static final String S_UT_PAGE_NAME = "page";

    static {
        kge.a(1512923093);
    }

    public static void a(String str, BaseMmAdModel baseMmAdModel, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a46d", new Object[]{str, baseMmAdModel, map});
            return;
        }
        try {
            Map<String, String> b = b(baseMmAdModel);
            if (map != null) {
                b.putAll(map);
            }
            a("Page_Home_Splash_Interact", 2101, str, null, null, b);
        } catch (Throwable th) {
            stv.a("UTUtil", "commitCommonClickEvent error ", th);
        }
    }

    public static void a(boolean z, tiq tiqVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f33bc0", new Object[]{new Boolean(z), tiqVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (!z) {
                i = 0;
            }
            hashMap.put("render_status", String.valueOf(i));
            hashMap.put(nfc.PHA_MONITOR_IS_COLD_START, tiqVar.c() ? "1" : "0");
            Map<String, String> b = b(tiqVar.d().b());
            if (b != null) {
                hashMap.putAll(b);
            }
            a("Page_Home_Splash_Interact", 2201, "render_dx_view", null, null, hashMap);
        } catch (Throwable th) {
            stv.a("UTUtil", "commitSplashInteractRender error ", th);
        }
    }

    public static void a(float f, double d, float f2, BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98a8580", new Object[]{new Float(f), new Double(d), new Float(f2), baseMmAdModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("slide_distance", String.valueOf(f));
        hashMap.put("slide_angle", String.valueOf(d));
        hashMap.put("config_slide_distance", String.valueOf(f2));
        Map<String, String> b = b(baseMmAdModel);
        if (b != null) {
            hashMap.putAll(b);
        }
        a("Page_Home_Splash_Interact", 2101, "interact_event_slide", null, null, hashMap);
    }

    public static void a(BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e99414e", new Object[]{baseMmAdModel});
            return;
        }
        try {
            a("Page_Home_Splash_Interact", 2101, "interact_event_dx_click", null, null, b(baseMmAdModel));
        } catch (Throwable th) {
            stv.a("UTUtil", "commitSplashInteractClick error ", th);
        }
    }

    public static void a(int i, String str, String str2, BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21899495", new Object[]{new Integer(i), str, str2, baseMmAdModel});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("success", String.valueOf(i));
            hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
            hashMap.put("error_code", str);
            Map<String, String> b = b(baseMmAdModel);
            if (b != null) {
                hashMap.putAll(b);
            }
            a("Page_Home_Splash_Interact", 2101, "dx_coupon_request", null, null, hashMap);
        } catch (Throwable th) {
            stv.a("UTUtil", "commitSplashInteractCouponRequest error ", th);
        }
    }

    public static void b(int i, String str, String str2, BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8ae634", new Object[]{new Integer(i), str, str2, baseMmAdModel});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("success", String.valueOf(i));
            hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
            hashMap.put("error_code", str);
            Map<String, String> b = b(baseMmAdModel);
            if (b != null) {
                hashMap.putAll(b);
            }
            a("Page_Home_Splash_Interact", 2101, "dx_shopping_request", null, null, hashMap);
        } catch (Throwable th) {
            stv.a("UTUtil", "commitSplashInteractCartRequest error ", th);
        }
    }

    private static Map<String, String> b(BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("34b44844", new Object[]{baseMmAdModel});
        }
        HashMap hashMap = new HashMap();
        if (baseMmAdModel == null) {
            return hashMap;
        }
        try {
            String str = baseMmAdModel.actionResponse;
            if (!TextUtils.isEmpty(str)) {
                if ("2".equals(str)) {
                    hashMap.put("actionResponse", baseMmAdModel.actionResponse);
                    hashMap.put("actionResult", baseMmAdModel.actionResult);
                    hashMap.put("actionText", baseMmAdModel.actionText);
                    hashMap.put("benefitType", baseMmAdModel.benefitType);
                    hashMap.put("benefitId", baseMmAdModel.benefitId);
                    hashMap.put("benefitTitle", baseMmAdModel.benefitTitle);
                    hashMap.put("benefitImageUrl", baseMmAdModel.benefitImageUrl);
                    hashMap.put("benefitAmountCents", baseMmAdModel.benefitAmountCents);
                    hashMap.put("benefitQuerySource", baseMmAdModel.benefitQuerySource);
                    hashMap.put("benefitSource", baseMmAdModel.benefitQuerySource);
                    hashMap.put("advName", baseMmAdModel.advName);
                    hashMap.put("advColor", baseMmAdModel.advColor);
                } else if ("1".equals(str)) {
                    hashMap.put("actionResponse", baseMmAdModel.actionResponse);
                    hashMap.put("actionText", baseMmAdModel.actionText);
                    hashMap.put("cardItemId", baseMmAdModel.cardItemId);
                    hashMap.put("cardSkuId", baseMmAdModel.cardSkuId);
                    hashMap.put("cardImageUrl", baseMmAdModel.cardImageUrl);
                    hashMap.put("cardTitle", baseMmAdModel.cardTitle);
                    hashMap.put("cardDesc", baseMmAdModel.cardDesc);
                    hashMap.put("advName", baseMmAdModel.advName);
                    hashMap.put("advColor", baseMmAdModel.advColor);
                }
                hashMap.put("gestureSwitch", baseMmAdModel.gestureSwitch);
                hashMap.put("interactImage", baseMmAdModel.interactImage);
                hashMap.put("gestureImage", baseMmAdModel.gestureImage);
            } else if (!TextUtils.isEmpty(baseMmAdModel.animationType)) {
                hashMap.put("animationType", baseMmAdModel.animationType);
                hashMap.put("animationLottie", baseMmAdModel.animationLottie);
            }
            hashMap.put("closeTxt", baseMmAdModel.closeTxt);
            hashMap.put("creative_id", baseMmAdModel.getCreativeId());
        } catch (Throwable th) {
            stv.a("UTUtil", "buildBootImageInfoArgs Error ", th);
        }
        return hashMap;
    }

    public static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        JSONObject jSONObject = null;
        try {
            LinkedSplashData b = h.b("").b();
            if (b != null) {
                jSONObject = b.getBizData();
            }
            b(str, i, str2, str3, str4, a(jSONObject, map));
        } catch (Exception e) {
            stv.a("UTUtil", "commitEvent errMsg=" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void b(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113b9bf7", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            map.put("isNewArch", "1");
            String a2 = a(map);
            stv.a("UTUtil", "eventId=" + i + ";arg1=" + str2 + ";args=" + a2);
            TBS.Ext.commitEvent(str, i, str2, str3, str4, a2);
        } catch (Exception e) {
            stv.a("UTUtil", "commitEvent errMsg=" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        return TextUtils.join(",", arrayList);
    }

    public static Map<String, String> a(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f680f272", new Object[]{jSONObject, map});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static void a(JSONObject jSONObject, BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab2c06e", new Object[]{jSONObject, baseMmAdModel});
        } else if (baseMmAdModel == null) {
        } else {
            HashMap hashMap = new HashMap();
            Map<String, String> b = b(baseMmAdModel);
            if (b != null) {
                hashMap.putAll(b);
            }
            b("Page_Home_Splash_Interact", 2101, "splash_pop_lottie_not_ready", null, null, a(jSONObject, hashMap));
        }
    }

    public static void b(JSONObject jSONObject, BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5523b98d", new Object[]{jSONObject, baseMmAdModel});
        } else if (baseMmAdModel == null) {
        } else {
            HashMap hashMap = new HashMap();
            Map<String, String> b = b(baseMmAdModel);
            if (b != null) {
                hashMap.putAll(b);
            }
            b("Page_Home_Splash_Interact", 2101, "splash_pop_video_not_ready", null, null, a(jSONObject, hashMap));
        }
    }
}
