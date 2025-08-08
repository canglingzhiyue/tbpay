package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.StringUtil;

/* loaded from: classes7.dex */
public class mxj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_NAME = "mytaobao_switch";

    static {
        kge.a(390696367);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue() : a("mpm_data_switch", str, z);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : a(GROUP_NAME, str, z);
    }

    private static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String config = orangeConfig.getConfig(str, str2, "" + z);
        if (!StringUtil.isEmpty(config)) {
            TLog.loge("mytaobao.ConfigUtil", "key = " + str2 + ", value=" + config);
            return "true".equals(config.trim().toLowerCase());
        }
        TLog.loge("mytaobao.ConfigUtil", "key = " + str2 + ", value is empty!");
        return false;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig(GROUP_NAME, str, str2);
        TLog.logd("mytaobao.ConfigUtil", "key = " + str + ", value=" + config);
        return config;
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue() : a(GROUP_NAME, str, j);
    }

    public static long a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba98bc", new Object[]{str, str2, new Long(j)})).longValue();
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String config = orangeConfig.getConfig(str, str2, "" + j);
        TLog.logd("mytaobao.ConfigUtil", "key = " + str2 + ", value=" + config);
        try {
            return Long.parseLong(config);
        } catch (Exception unused) {
            return j;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String config = orangeConfig.getConfig(GROUP_NAME, str, "" + i);
        TLog.logd("mytaobao.ConfigUtil", "key = " + str + ", value=" + config);
        try {
            return Integer.parseInt(config);
        } catch (Exception unused) {
            return i;
        }
    }

    public static JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9490f01e", new Object[]{str, jSONObject});
        }
        String config = OrangeConfig.getInstance().getConfig(GROUP_NAME, str, "");
        TLog.loge("mytaobao.ConfigUtil", "key = " + str + ", value=" + config);
        try {
            return StringUtils.isEmpty(config) ? jSONObject : JSONObject.parseObject(config);
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(a(str, String.valueOf(f)));
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
