package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.poplayer.utils.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class hfe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAMESPACE = "lite_effect";

    static {
        kge.a(2089248797);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig(NAMESPACE, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a(a(b.MONITOR_BLACKLIST, ""), 21);
    }

    public static boolean a(String str, int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Build.VERSION.SDK_INT < i;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.equals(jSONObject.optString("disable"), "true") || Build.VERSION.SDK_INT < jSONObject.optInt("min_os_ver", i) || a(String.valueOf(Build.VERSION.SDK_INT), jSONObject.optJSONArray("blk_os_ver")) || a(Build.MODEL, jSONObject.optJSONArray("blk_model")) || a(Build.BRAND, jSONObject.optJSONArray("blk_brand"))) {
            return true;
        }
        return a(Build.HARDWARE, jSONObject.optJSONArray("blk_hardware"));
    }

    private static boolean a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d300fd0", new Object[]{str, jSONArray})).booleanValue();
        }
        if (jSONArray != null && jSONArray.length() != 0 && !TextUtils.isEmpty(str)) {
            String trim = str.trim();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (TextUtils.equals(trim, optString) || b(trim, optString)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        try {
            return str.matches(str2);
        } catch (Throwable unused) {
            return false;
        }
    }
}
