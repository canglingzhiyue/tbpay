package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;
import com.taobao.android.home.component.utils.n;

/* loaded from: classes7.dex */
public class qnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIXED_SJS_FAST_SWITCH_LIST_VALUE = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
    public static final String KEY_LOW_BATTERY_ND_QUICK_JUMP = "lowBatteryNdQuickJump";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32961a;
    private static volatile Boolean b;
    private static volatile Boolean c;
    private static String d;
    private static String e;

    static {
        kge.a(-1548947487);
        d = null;
        e = null;
        f32961a = false;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        boolean a2 = a();
        ldf.d("InfoFlowGlobalABUtils", "enableUtLogMapOptimize: " + a2);
        return a2;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        boolean a2 = a();
        ldf.d("InfoFlowGlobalABUtils", "enableCardOverlayOptimize: " + a2);
        return a2;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        boolean a2 = lcx.a(null, null, "enable_first_screen_fade_in");
        ldf.d("InfoFlowGlobalABUtils", "enable_first_screen_fade_in: " + a2);
        return a2;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        boolean a2 = lcx.a(null, null, "enable_dx3_engine_auto_release");
        ldf.d("InfoFlowGlobalABUtils", "enable_dx3_engine_auto_release: " + a2);
        return a2;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        boolean a2 = lcx.a(null, null, "enable_reset_auto_wrap_line");
        ldf.d("InfoFlowGlobalABUtils", "enable_reset_auto_wrap_line: " + a2);
        return a2;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        boolean a2 = lcx.a(null, null, "enable_first_screen_clear_img");
        ldf.d("InfoFlowGlobalABUtils", "enable_first_screen_clear_img: " + a2);
        return a2;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (b == null) {
            synchronized (qnl.class) {
                if (b == null) {
                    b = Boolean.valueOf(ldj.a("enableMemoryOptimize", true));
                }
            }
        }
        return b.booleanValue();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (c == null) {
            synchronized (qnl.class) {
                if (c == null) {
                    c = Boolean.valueOf(ldj.a("disableInfoFlowShareThread", false));
                }
            }
        }
        return c.booleanValue();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : StringUtils.equals("l", ldc.a());
    }

    private static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue();
        }
        if (str == null || str2 == null || !str.startsWith("f_ver")) {
            return (str == null || str2 == null || !str.contains(str2)) ? false : true;
        }
        return str.contains(str2 + "_ev2");
    }

    private static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{str, str2})).booleanValue();
        }
        if (str == null || str2 == null || !str.startsWith("f_ver")) {
            return (str == null || str2 == null || !str.contains(str2)) ? false : true;
        }
        return str.contains(str2 + "_ev2");
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        return c(str, "f_home_skip_tran") || d(str2, "f_home_skip_tran");
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue() : c(str, "f_home_simple_v5_jump") || d(str2, "f_home_simple_v5_jump");
    }

    public static boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb83984", new Object[]{str, str2})).booleanValue() : c(str, "f_home_lb_quick_jump") || d(str2, "f_home_lb_quick_jump");
    }

    public static String a(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)});
        }
        if (z || (str = d) == null) {
            try {
                str = (String) m.a().a("ndLowOptimizationThird", String.class);
            } catch (Throwable th) {
                ldf.a("InfoFlowGlobalABUtils", "调用HomeClientABTestTool.getAbTestValue 出错。", th);
                str = "";
            }
            if (StringUtils.isEmpty(str)) {
                str = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
            }
            d = str;
        }
        return str;
    }

    public static String b(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c557ff5", new Object[]{new Boolean(z)});
        }
        if (z || (str = e) == null) {
            try {
                str = n.a();
            } catch (Throwable th) {
                ldf.a("InfoFlowGlobalABUtils", "TPPUtils.getNdLowFeatureList 出错。", th);
                str = "";
            }
            e = str;
        }
        return str;
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue() : (jSONObject == null || str == null || !jSONObject.containsKey(str)) ? z : "true".equals(jSONObject.getString(str));
    }
}
