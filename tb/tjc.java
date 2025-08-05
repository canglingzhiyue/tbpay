package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes7.dex */
public class tjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1783408917);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"mmAdBiz"}, new g() { // from class: tb.tjc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        return;
                    }
                    stv.a("ConfigCenter", "ConfigCenter#onConfigUpdate: groupName=" + str + "fromCache=" + z);
                    tjm.b("disableLinkedTexiuAd", OrangeConfig.getInstance().getConfig("mmAdBiz", "disableLinkedTexiuAd", "false"));
                    tjm.b("enableCheckDXBeforeShow", OrangeConfig.getInstance().getConfig("mmAdBiz", "enableCheckDXBeforeShow", "false"));
                }
            });
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : tjm.a(str, str2);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Boolean.parseBoolean(a("disableLinkedTexiuAd", "false"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : Boolean.parseBoolean(a("enableCheckDXBeforeShow", "false"));
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()).trim();
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            stv.a("ConfigCenter", "launchCnt isCrossOneDay: spStorageStrVal is null");
            return true;
        }
        try {
            if (!JSONObject.parseObject(str).containsKey(str2)) {
                z = true;
            }
            stv.a("ConfigCenter", " launchCnt isCrossOneDay: isCrossOneDay :" + z);
            return z;
        } catch (Throwable th) {
            stv.a("ConfigCenter", " isCrossOneDay check error" + th.toString());
            return true;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        String a2 = tjm.a("app_launch_count", "");
        String d = d();
        if (b(a2, d)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d, (Object) 1);
            tjm.b("app_launch_count", jSONObject.toString());
            stv.a("ConfigCenter", " launchCnt updateAppLaunchCountTimes init " + jSONObject.toString());
        } else {
            try {
                JSONObject parseObject = JSONObject.parseObject(a2);
                int intValue = parseObject.getIntValue(d) + 1;
                try {
                    parseObject.put(d, (Object) Integer.valueOf(intValue));
                    tjm.b("app_launch_count", parseObject.toString());
                    stv.a("ConfigCenter", " launchCnt updateAppLaunchCountTimes success withOneDay save data : " + parseObject.toString());
                    i = intValue;
                } catch (Throwable th) {
                    th = th;
                    i = intValue;
                    stv.a("ConfigCenter", " updateAppLaunchCountTimes error" + th);
                    HashMap hashMap = new HashMap();
                    hashMap.put("count", String.valueOf(i));
                    hashMap.put("launchCnt_isColdStart", String.valueOf(z));
                    tjo.a("Page_Home_Splash_Interact", 2101, "app_launch_count", "", "", hashMap);
                }
            } catch (Throwable th2) {
                th = th2;
                i = 0;
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("count", String.valueOf(i));
        hashMap2.put("launchCnt_isColdStart", String.valueOf(z));
        tjo.a("Page_Home_Splash_Interact", 2101, "app_launch_count", "", "", hashMap2);
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        int i = 1;
        String a2 = tjm.a("app_launch_count", "");
        if (TextUtils.isEmpty(a2)) {
            stv.a("ConfigCenter", " getLaunchCountNum appLaunchCountJSONObjStr is empty");
            return 1;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(a2);
            String d = d();
            if (!parseObject.containsKey(d)) {
                return 1;
            }
            i = parseObject.getIntValue(d);
            stv.a("ConfigCenter", " getLaunchCountNum success  launchCountResult : " + i);
            return i;
        } catch (Throwable th) {
            stv.a("ConfigCenter", " launchCountNum error" + th.toString());
            return i;
        }
    }
}
