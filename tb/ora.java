package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class ora {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Set<String> b;

    static {
        kge.a(-1807114083);
        b = new HashSet();
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject != null && !StringUtils.isEmpty(jSONObject.getString("monitorCard"))) {
            b = new HashSet(Arrays.asList(jSONObject.getString("monitorCard").split(",")));
        } else {
            HashSet hashSet = new HashSet(1);
            hashSet.add("home_0_guess_0");
            b = hashSet;
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject2 != null && StringUtils.equals(jSONObject2.getString("brandAd"), "1") && StringUtils.isEmpty(jSONObject2.getString("ifs"))) {
            TLog.loge("AdMonitorHelper", "brandAd card do not contain ifs url.");
            a(jSONObject, "BizBrandAd", "BrandAdNoIfs", "");
        } else if (jSONObject2 == null || StringUtils.isEmpty(jSONObject2.getString("ifs")) || StringUtils.equals(jSONObject2.getString("brandAd"), "1")) {
        } else {
            TLog.loge("AdMonitorHelper", "ifs card is not brandAd");
            a(jSONObject, "BizBrandAd", "IfsNotBrandAdV2", "");
        }
    }

    public static void a(JSONObject jSONObject, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c22de79", new Object[]{jSONObject, sVar});
        } else if (!b(jSONObject)) {
        } else {
            TLog.loge("AdMonitorHelper", "lunbo card rend error.");
            StringBuilder sb = new StringBuilder();
            sb.append("lunbo card rend error. ");
            sb.append(sVar == null ? "null" : sVar.toString());
            a(jSONObject, "DxErrorMonitor", "DxErrorMonitor", sb.toString());
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{jSONObject, str});
        } else if (!b(jSONObject)) {
        } else {
            TLog.loge("AdMonitorHelper", "this target url are not nav to right page. url is " + str);
            a(jSONObject, "errorTargetUrl", "errorTargetUrl", "this target url are not nav to right page. url is " + str);
        }
    }

    private static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue() : jSONObject != null && b.contains(jSONObject.getString("sectionBizCode")) && jSONObject.getJSONObject("ext") != null && jSONObject.getJSONObject("ext").getBooleanValue("isBannerCard");
    }

    private static void a(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163ec766", new Object[]{jSONObject, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(AbsListWidgetInstance.SLOT_SECTION, jSONObject.toJSONString());
        ksr.a("AdMonitorHelper", str, "1.0", str2, hashMap, str2, str3);
    }
}
