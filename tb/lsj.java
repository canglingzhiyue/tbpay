package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.tao.util.StringUtil;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class lsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2091230633);
    }

    public static void a(String str, String str2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{str, str2, hashMap});
            return;
        }
        JSONObject jSONObject = null;
        if (hashMap != null) {
            jSONObject = new JSONObject(hashMap);
        }
        kss.a("Page_Home", 19999, "topview_trace_newface", str2, str, jSONObject);
        StringBuilder sb = new StringBuilder();
        sb.append("GatewayUTUtils[topview_trace] ->  , stage=");
        sb.append(str);
        sb.append(", traceId=");
        sb.append(str2);
        sb.append(", args=");
        sb.append(hashMap != null ? hashMap.toString() : "null");
        ksp.a("TopViewReporter", sb.toString());
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "updateSliderData");
        hashMap.put("code", str);
        hashMap.put("errorMsg", str2);
        a("TopViewAnimation", str3, hashMap);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "topViewParse");
        hashMap.put("code", str);
        hashMap.put("error_stage", str2);
        a("TopViewParse", str3, hashMap);
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        try {
            String th2 = th.toString();
            return StringUtil.isEmpty(th2) ? "empty_msg" : th2.substring(0, Math.min(th2.length(), 100));
        } catch (Throwable unused) {
            ldf.a("TopViewReporter", "onUpdateSplashData.commitSplashCustomerEvent():", th);
            return MUSAppMonitor.ERROR_MSG;
        }
    }
}
