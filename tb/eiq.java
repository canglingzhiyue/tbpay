package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes4.dex */
public class eiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27331a;
    public static boolean b;
    public static boolean c;
    public static String d;
    public static String e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;

    static {
        kge.a(-2121178712);
        f27331a = false;
        b = true;
        c = false;
        f = true;
        g = true;
        h = true;
        i = false;
        j = false;
        k = true;
        l = true;
        m = true;
        n = true;
        o = false;
        emu.a("com.taobao.android.detail.core.performance.orange.DetailPreloadOptOrangeConfig");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f27331a = b();
        c = f();
        d = d();
        e = e();
        f = g();
        g = h();
        h = i();
        i = j();
        j = k();
        k = l();
        l = m();
        m = n();
        n = o();
        b = c();
        o = p();
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_detail", str, str2));
        } catch (Exception e2) {
            i.a(l.a("DetailPreloadOptOrangeConfig"), str, e2);
            return false;
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_preload_page_detail", "false");
        String a3 = l.a("DetailPreloadOptOrangeConfig");
        i.c(a3, "预加载优化的总开关:" + a2);
        return a2;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_nav_preload_page_detail_new", "true");
        String a3 = l.a("DetailPreloadOptOrangeConfig");
        i.c(a3, "nav预加载优化的总开关:" + a2);
        return a2;
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("android_detail", "enable_detail_preload_source_list", "");
        } catch (Exception e2) {
            i.a(l.a("DetailPreloadOptOrangeConfig"), "enable_detail_preload_source_list", e2);
            return null;
        }
    }

    private static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("android_detail", "enable_preload_protocol_list", "industry,final");
        } catch (Exception e2) {
            i.a(l.a("DetailPreloadOptOrangeConfig"), "enable_preload_protocol_list", e2);
            return null;
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        String str2 = e;
        if (!StringUtils.isEmpty(str2)) {
            return str2.contains(str);
        }
        return false;
    }

    private static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a("enable_preload_main_request_data_cache", "false");
    }

    private static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : a("enable_ultron_new_parser", "true");
    }

    private static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : a("enable_detail_use_new_parser", "true");
    }

    private static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : a("enable_forbidden_open_rate", "true");
    }

    private static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : a("enable_refresh_check_collect", "false");
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : a("enable_control_to_post_request", "false");
    }

    private static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : a("enable_observe_main_header_layout_change", "true");
    }

    private static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : a("enable_preload_layout_handle", "true");
    }

    private static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : a("enable_final_down_grade_handle", "true");
    }

    private static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : a("enable_ultron_protocol_judge", "true");
    }

    private static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : a("enable_clear_nav_preload_data", "false");
    }
}
