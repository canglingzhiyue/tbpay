package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class pzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(420939312);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a(OrangeConfig.getInstance(), "is_switch_new_material_api", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a(OrangeConfig.getInstance(), "use_tp_editor_api", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a(OrangeConfig.getInstance(), "use_new_music_api", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a(OrangeConfig.getInstance(), "resource_preload_check_update", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : a(OrangeConfig.getInstance(), "mai_depend_check_open", true) && !d();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        return a(orangeConfig, "vpm_data_monitor_enable_" + str, true);
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : a("material_config_default", "{\n  \"version\": 1,\n  \"filter_type\": \"cloudgame\",\n  \"template_id\": \"102001\",\n  \"material_type\": \"101\",\n  \"device_levels\": {\n    \"enable\": 1,\t\t\n    \"list\":[\"0\",\"1\"] \n  },\n  \"net_strategy_weighted\": \"essential\",\n  \"net_strategies\": [\t\t\t\t\t\t\t\t\n    {\n      \"relation\": \"gt\",\t\t\t\n      \"key\": \"RefNetSpeed.recent_max\",\n      \"threshold\": \"15000000\",\n      \"version\": 1                \n    }\n  ]\n}");
    }

    private static boolean a(OrangeConfig orangeConfig, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55c34bb5", new Object[]{orangeConfig, str, new Boolean(z)})).booleanValue();
        }
        String config = orangeConfig.getConfig("taopai", str, null);
        if (config == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(config);
        } catch (Exception unused) {
            return z;
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("taopai", str, str2);
    }

    public static List<String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[0]) : b(a("preload_resource_list", "[\"algorithm_PixelAIHDRNet\"]"));
    }

    public static List<String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[0]) : b(a("music_category_recommend_list", "[\"guangguang\"]"));
    }

    private static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        try {
            return JSON.parseArray(str, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }
}
