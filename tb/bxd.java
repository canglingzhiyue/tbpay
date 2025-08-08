package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes6.dex */
public class bxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-732894964);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "isOptimizeRecommend", "true"));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : OrangeConfig.getInstance().getConfig("babelorder", "oList_black_list_brand", "v2133a,");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_dowgradeH5_ultrondegrade", "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_enable_jstracker", "true"));
    }

    public static float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[0])).floatValue() : a("order_pv_sampling_of_jstracker");
    }

    public static float g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[0])).floatValue() : a("order_mtop_sampling_of_jstracker");
    }

    public static float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[0])).floatValue() : a("order_custom_sampling_of_jstracker");
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue();
        }
        try {
            return Math.min(1.0f, Math.max(0.0f, Float.parseFloat(OrangeConfig.getInstance().getConfig("babelorder", str, "-1"))));
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(z)));
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(i));
        if (StringUtils.isEmpty(config)) {
            return i;
        }
        try {
            return Integer.parseInt(config);
        } catch (Exception unused) {
            return i;
        }
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(f));
        if (StringUtils.isEmpty(config)) {
            return f;
        }
        try {
            return Float.parseFloat(config);
        } catch (Exception unused) {
            return f;
        }
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(j));
        if (StringUtils.isEmpty(config)) {
            return j;
        }
        try {
            return Long.parseLong(config);
        } catch (Exception unused) {
            return j;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, str2);
        return StringUtils.isEmpty(config) ? str2 : config;
    }
}
