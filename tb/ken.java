package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ken {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ID = 2101;
    public static final String S_UT_PAGE = "Page_Home_Splash_Interact";

    static {
        kge.a(-1727577);
    }

    public static void a(int i, int i2, String str, String str2, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586089a", new Object[]{new Integer(i), new Integer(i2), str, str2, bootImageInfo});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("render_status", String.valueOf(i));
            hashMap.put(nfc.PHA_MONITOR_IS_COLD_START, String.valueOf(i2));
            hashMap.put("show_interact_guide_image", str);
            hashMap.put("show_interact_card_image", str2);
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            b("Page_Home_Splash_Interact", 2201, bootImageInfo.isDxTemplate ? "render_dx_view" : "render_view", null, null, hashMap);
        } catch (Throwable th) {
            kej.a("BootImageInteractUTUtils", "commitSplashInteractRender error ", th);
        }
    }

    public static void a(float f, double d, float f2, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980bf89c", new Object[]{new Float(f), new Double(d), new Float(f2), bootImageInfo});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("slide_distance", String.valueOf(f));
        hashMap.put("slide_angle", String.valueOf(d));
        hashMap.put("config_slide_distance", String.valueOf(f2));
        Map<String, String> e = e(bootImageInfo);
        if (e != null) {
            hashMap.putAll(e);
        }
        b("Page_Home_Splash_Interact", 2101, "interact_event_slide", null, null, hashMap);
    }

    public static void a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75806d8e", new Object[]{bootImageInfo});
            return;
        }
        try {
            b("Page_Home_Splash_Interact", 2101, bootImageInfo.isDxTemplate ? "interact_event_dx_click" : "interact_event_click", null, null, e(bootImageInfo));
        } catch (Throwable th) {
            kej.a("BootImageInteractUTUtils", "commitSplashInteractClick error ", th);
        }
    }

    public static void a(int i, String str, String str2, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f40ea7", new Object[]{new Integer(i), str, str2, bootImageInfo});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("success", String.valueOf(i));
            hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
            hashMap.put("error_code", str);
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            b("Page_Home_Splash_Interact", 2101, bootImageInfo.isDxTemplate ? "dx_coupon_request" : "coupon_request", null, null, hashMap);
        } catch (Throwable th) {
            kej.a("BootImageInteractUTUtils", "commitSplashInteractCouponRequest error ", th);
        }
    }

    public static void b(int i, String str, String str2, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6fe868", new Object[]{new Integer(i), str, str2, bootImageInfo});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("success", String.valueOf(i));
            hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
            hashMap.put("error_code", str);
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            b("Page_Home_Splash_Interact", 2101, bootImageInfo.isDxTemplate ? "dx_shopping_request" : "shopping_request", null, null, hashMap);
        } catch (Throwable th) {
            kej.a("BootImageInteractUTUtils", "commitSplashInteractCartRequest error ", th);
        }
    }

    private static Map<String, String> e(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a733dcbf", new Object[]{bootImageInfo});
        }
        if (bootImageInfo == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String str = bootImageInfo.actionResponse;
            if (!TextUtils.isEmpty(str)) {
                if ("2".equals(str)) {
                    hashMap.put("actionResponse", bootImageInfo.actionResponse);
                    hashMap.put("actionResult", bootImageInfo.actionResult);
                    hashMap.put("actionText", bootImageInfo.actionText);
                    hashMap.put("benefitType", bootImageInfo.benefitType);
                    hashMap.put("benefitId", bootImageInfo.benefitId);
                    hashMap.put("benefitTitle", bootImageInfo.benefitTitle);
                    hashMap.put("benefitImageUrl", bootImageInfo.benefitImageUrl);
                    hashMap.put("benefitAmountCents", bootImageInfo.benefitAmountCents);
                    hashMap.put("benefitQuerySource", bootImageInfo.benefitQuerySource);
                    hashMap.put("benefitSource", bootImageInfo.benefitQuerySource);
                    hashMap.put("advName", bootImageInfo.advName);
                    hashMap.put("advColor", bootImageInfo.advColor);
                } else if ("1".equals(str)) {
                    hashMap.put("actionResponse", bootImageInfo.actionResponse);
                    hashMap.put("actionText", bootImageInfo.actionText);
                    hashMap.put("cardItemId", bootImageInfo.cardItemId);
                    hashMap.put("cardSkuId", bootImageInfo.cardSkuId);
                    hashMap.put("cardImageUrl", bootImageInfo.cardImageUrl);
                    hashMap.put("cardTitle", bootImageInfo.cardTitle);
                    hashMap.put("cardDesc", bootImageInfo.cardDesc);
                    hashMap.put("advName", bootImageInfo.advName);
                    hashMap.put("advColor", bootImageInfo.advColor);
                }
                hashMap.put("gestureSwitch", bootImageInfo.gestureSwitch);
                hashMap.put("interactImage", bootImageInfo.interactImage);
                hashMap.put("gestureImage", bootImageInfo.gestureImage);
            } else if (!TextUtils.isEmpty(bootImageInfo.animationType)) {
                hashMap.put("animationType", bootImageInfo.animationType);
                hashMap.put("animationLottie", bootImageInfo.animationLottie);
            }
            hashMap.put("closeTxt", bootImageInfo.closeTxt);
        } catch (Throwable th) {
            kej.a("BootImageInteractUTUtils", "buildBootImageInfoArgs Error ", th);
        }
        return hashMap;
    }

    public static void b(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113b9bf7", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        JSONObject jSONObject = null;
        try {
            LinkedSplashData b = h.b("").b();
            if (b != null) {
                jSONObject = b.getBizData();
            }
            a(str, i, str2, str3, str4, a(jSONObject, map));
        } catch (Exception e) {
            kej.a("BootImageInteractUTUtils", "commitEvent errMsg=" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            String a2 = a(map);
            kej.a("BootImageInteractUTUtils", "eventId=" + i + ";arg1=" + str2 + ";args=" + a2);
            TBS.Ext.commitEvent(str, i, str2, str3, str4, a2);
        } catch (Exception e) {
            kej.a("BootImageInteractUTUtils", "commitEvent errMsg=" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9fe4a1", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
            return;
        }
        try {
            String a2 = a(jSONObject);
            kej.a("BootImageInteractUTUtils", "eventId=" + i + ";arg1=" + str2 + ";args=" + a2);
            TBS.Ext.commitEvent(str, i, str2, str3, str4, a2);
        } catch (Exception e) {
            kej.a("BootImageInteractUTUtils", "commitEvent errMsg=" + e.getMessage());
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

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(jSONObject.size());
        for (String str : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(String.format("%s=%s", str, jSONObject.getString(str)));
            }
        }
        return TextUtils.join(",", arrayList);
    }

    public static JSONObject a(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("38aed61d", new Object[]{jSONObject, map});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                jSONObject2.put(str, (Object) jSONObject.getString(str));
            }
        }
        if (map != null) {
            jSONObject2.putAll(map);
        }
        return jSONObject2;
    }

    public static void b(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7fb2d", new Object[]{bootImageInfo});
        } else {
            b("Page_Home_Splash_Interact", 2101, "login_sdk_not_inited", null, null, e(bootImageInfo));
        }
    }

    public static void c(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86f88cc", new Object[]{bootImageInfo});
        } else {
            b("Page_Home_Splash_Interact", 2101, "login_sdk_inited", null, null, e(bootImageInfo));
        }
    }

    public static void d(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e7166b", new Object[]{bootImageInfo});
        } else {
            b("Page_Home_Splash_Interact", 2101, "pre_login_int_orange_disable", null, null, e(bootImageInfo));
        }
    }

    public static void a(LinkedSplashData linkedSplashData, BootImageInfo bootImageInfo, int i, int i2, int i3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403b9f3", new Object[]{linkedSplashData, bootImageInfo, new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
        } else if (bootImageInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("render_status", str);
            if (!bootImageInfo.isColdStart) {
                str = "0";
            }
            hashMap.put(nfc.PHA_MONITOR_IS_COLD_START, str);
            hashMap.put("pop_time_duration", String.valueOf(i));
            hashMap.put("pop_lottie_size_width", String.valueOf(i2));
            hashMap.put("pop_lottie_size_height", String.valueOf(i3));
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            if (linkedSplashData != null) {
                jSONObject = linkedSplashData.getBizData();
            }
            a("Page_Home_Splash_Interact", 2201, "splash_pop_render_view", (String) null, (String) null, a(jSONObject, hashMap));
        }
    }

    public static void a(LinkedSplashData linkedSplashData, BootImageInfo bootImageInfo, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6e0060", new Object[]{linkedSplashData, bootImageInfo, str, jSONObject});
        } else if (bootImageInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            String str2 = "0";
            hashMap.put("render_status", str2);
            if (bootImageInfo.isColdStart) {
                str2 = "1";
            }
            hashMap.put(nfc.PHA_MONITOR_IS_COLD_START, str2);
            hashMap.put("errMsg", str);
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            if (linkedSplashData != null) {
                jSONObject = linkedSplashData.getBizData();
            }
            a("Page_Home_Splash_Interact", 2201, "splash_pop_render_fail", (String) null, (String) null, a(jSONObject, hashMap));
        }
    }

    public static void b(LinkedSplashData linkedSplashData, BootImageInfo bootImageInfo, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c245aa1", new Object[]{linkedSplashData, bootImageInfo, str, jSONObject});
        } else if (bootImageInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(nfc.PHA_MONITOR_IS_COLD_START, bootImageInfo.isColdStart ? "1" : "0");
            hashMap.put("errMsg", str);
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            if (linkedSplashData != null) {
                jSONObject = linkedSplashData.getBizData();
            }
            a("Page_Home_Splash_Interact", 2101, "splash_pop_play_fail", (String) null, (String) null, a(jSONObject, hashMap));
        }
    }

    public static void a(LinkedSplashData linkedSplashData, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292e2846", new Object[]{linkedSplashData, bootImageInfo});
        } else if (bootImageInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            JSONObject jSONObject = null;
            if (linkedSplashData != null) {
                jSONObject = linkedSplashData.getBizData();
            }
            a("Page_Home_Splash_Interact", 2101, "splash_pop_lottie_not_ready", (String) null, (String) null, a(jSONObject, hashMap));
        }
    }

    public static void b(LinkedSplashData linkedSplashData, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2854b7a5", new Object[]{linkedSplashData, bootImageInfo});
        } else if (bootImageInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            JSONObject jSONObject = null;
            if (linkedSplashData != null) {
                jSONObject = linkedSplashData.getBizData();
            }
            a("Page_Home_Splash_Interact", 2101, "splash_pop_video_not_ready", (String) null, (String) null, a(jSONObject, hashMap));
        }
    }

    public static void a(LinkedSplashData linkedSplashData, BootImageInfo bootImageInfo, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5094b36a", new Object[]{linkedSplashData, bootImageInfo, jSONObject});
        } else if (bootImageInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            Map<String, String> e = e(bootImageInfo);
            if (e != null) {
                hashMap.putAll(e);
            }
            if (linkedSplashData != null) {
                jSONObject = linkedSplashData.getBizData();
            }
            a("Page_Home_Splash_Interact", 2101, "splash_pop_event_click_skip", (String) null, (String) null, a(jSONObject, hashMap));
        }
    }

    public static void c(int i, String str, String str2, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ebc229", new Object[]{new Integer(i), str, str2, bootImageInfo});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", String.valueOf(i));
        hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
        hashMap.put("error_code", str);
        Map<String, String> e = e(bootImageInfo);
        if (e != null) {
            hashMap.putAll(e);
        }
        b("Page_Home_Splash_Interact", 2101, "small_pop_coupon_request", null, null, hashMap);
    }

    public static void d(int i, String str, String str2, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a679bea", new Object[]{new Integer(i), str, str2, bootImageInfo});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", String.valueOf(i));
        hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
        hashMap.put("error_code", str);
        Map<String, String> e = e(bootImageInfo);
        if (e != null) {
            hashMap.putAll(e);
        }
        b("Page_Home_Splash_Interact", 2101, "small_pop_shopping_request", null, null, hashMap);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            a("Page_Home_Splash_Interact", 2101, str, str2, str3, map);
        }
    }
}
