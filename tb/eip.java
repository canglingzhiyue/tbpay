package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.performance.a;
import com.taobao.android.detail.core.performance.b;
import com.taobao.android.detail.core.performance.d;
import com.taobao.android.detail.core.performance.k;
import com.taobao.android.detail.core.performance.n;
import com.taobao.android.detail.core.performance.q;
import com.taobao.android.detail.core.utils.i;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class eip {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean B;
    public static boolean C;
    public static boolean D;
    public static boolean E;
    public static boolean F;
    public static boolean G;
    public static boolean J;
    public static boolean K;
    public static boolean L;
    public static boolean R;
    public static boolean T;
    public static boolean U;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27330a;
    public static boolean b;
    public static boolean c;
    public static List<String> d;
    public static int e;
    public static boolean f;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean s;
    public static boolean u;
    public static boolean x;

    static {
        kge.a(1067021002);
        f27330a = true;
        T = true;
        c = true;
        d = new ArrayList();
        e = 100;
        f = false;
        h = true;
        i = true;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = true;
        s = false;
        u = true;
        L = true;
        B = true;
        C = true;
        D = true;
        E = true;
        F = true;
        G = true;
        b = false;
        J = true;
        R = true;
        U = true;
        x = true;
        K = false;
        emu.a("com.taobao.android.detail.core.performance.orange.DetailClientOptOrangeConfig");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f();
        h();
        i();
        D();
        j();
        g();
        aa();
        an();
        ab();
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        f27330a = k();
        T = as();
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        if (N() && O()) {
            z = true;
        }
        j = z;
        s = P();
        u = Q();
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        c = m();
        d = q();
        e = r();
        f = n();
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        h = f.a();
        i = f.i();
    }

    private static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
        } else {
            q = o();
        }
    }

    private static void an() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba9b234", new Object[0]);
            return;
        }
        R = ap();
        U = az();
        x = l();
        if (p() && W()) {
            z = true;
        }
        K = z;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a("enable_nav_init_adapter", "false");
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            c = false;
        }
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_nav_process", "true");
        String a3 = d.a("DetailClientOptOrangeConfig");
        i.c(a3, "允许上游业务点击进入nav阶段的orange开关: " + a2);
        return a2;
    }

    private static boolean as() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_inside_append_param", "true");
        String a3 = d.a("DetailClientOptOrangeConfig");
        i.c(a3, "允许inside场景在uri中追加架构组容器参数的orange开关: " + a2);
        return a2;
    }

    private static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_prefetch_request", "true");
        String a3 = k.a("DetailClientOptOrangeConfig");
        i.c(a3, "预请求优化的orange总开关: " + a2);
        return a2;
    }

    private static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_compare_mainRequestExParams", "false");
        String a3 = k.a("DetailClientOptOrangeConfig");
        i.c(a3, "允许现有的主请求参数和新构建参数对比的orange开关: " + a2);
        return a2;
    }

    private static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_async_handle_mtop_callback", "true");
        String a3 = b.a("DetailClientOptOrangeConfig");
        i.c(a3, "允许异步线程处理mtop回调的orange开关: " + a2);
        return a2;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_detail", str, str2));
        } catch (Exception e2) {
            i.a("DetailClientOptOrangeConfig", str, e2);
            return false;
        }
    }

    private static List<String> q() {
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc936ecf", new Object[0]);
        }
        try {
            str = OrangeConfig.getInstance().getConfig("android_detail", "prefetch_request_whiteList", str);
        } catch (Exception e2) {
            i.a(k.a("DetailClientOptOrangeConfig"), "prefetch_request_whiteList", e2);
        }
        if (StringUtils.isEmpty(str)) {
            str = "NAV_START_ACTIVITY_TIME,NAV_START_ACTIVITY_UPTIME,prefetch_v,cpuCore,cpuMaxHz,wx_options,clientCachedTemplateKeys,longitude,latitude,NAV_TO_URL_START_TIME,screenWidth,screenHeight,supportV7,stdPopModal,stdPopShowWithCode,stdPopRecreateOnSysChanged,largescreenstyle,URL_REFERER_ORIGIN";
        }
        List<String> asList = Arrays.asList(str.split(","));
        String a2 = k.a("DetailClientOptOrangeConfig");
        i.c(a2, "白名单参数: " + asList);
        return asList;
    }

    private static int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[0])).intValue();
        }
        int i2 = 100;
        try {
            i2 = Integer.parseInt(OrangeConfig.getInstance().getConfig("android_detail", "max_hit_prefetch_fail", String.valueOf(100)));
        } catch (Exception e2) {
            i.a(k.a("DetailClientOptOrangeConfig"), "max_hit_prefetch_fail", e2);
        }
        String a2 = k.a("DetailClientOptOrangeConfig");
        i.c(a2, "orange开关下发的允许预请求命中失败的最大次数: " + i2);
        return i2;
    }

    private static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue();
        }
        boolean k2 = eik.k();
        String a2 = a.a("DetailClientOptOrangeConfig");
        i.c(a2, "异步组件的预加载实验: " + k2);
        return k2;
    }

    private static void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[0]);
            return;
        }
        k = H();
        l = I();
        m = J();
        n = K();
        o = L();
        p = M();
    }

    private static void aa() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[0]);
            return;
        }
        if (X() && ak()) {
            z = true;
        }
        J = z;
    }

    private static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_preload_layout", "false");
        String a3 = a.a("DetailClientOptOrangeConfig");
        i.c(a3, "异步Layout优化的orange总开关: " + a2);
        return a2;
    }

    private static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pre_async_aura_config", "false");
        String a3 = a.a("DetailClientOptOrangeConfig");
        i.c(a3, "异步Layout优化中预加载AURA配置的orange开关: " + a2);
        return a2;
    }

    private static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_main_pic_on_create_opt", "false");
        String a3 = a.a("DetailClientOptOrangeConfig");
        i.c(a3, "异步Layout优化中头图create的优化的orange开关: " + a2);
        return a2;
    }

    private static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_xml_to_code", "false");
        String a3 = a.a("DetailClientOptOrangeConfig");
        i.c(a3, "异步Layout优化中X2C的优化的orange开关: " + a2);
        return a2;
    }

    private static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_async_search_info", "false");
        String a3 = a.a("DetailClientOptOrangeConfig");
        i.c(a3, "异步Layout优化中搜索底纹异步的orange开关: " + a2);
        return a2;
    }

    private static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_async_user_track", "false");
        String a3 = a.a("DetailClientOptOrangeConfig");
        i.c(a3, "异步Layout优化中埋点异步的orange开关: " + a2);
        return a2;
    }

    private static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_detail_stream_request_opt", "false");
        String a3 = n.a("DetailClientOptOrangeConfig");
        i.c(a3, "分段流式返回优化的orange开关: " + a2);
        return a2;
    }

    private static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue();
        }
        boolean g = eik.g();
        String a2 = n.a("DetailClientOptOrangeConfig");
        i.c(a2, "命中分段流式返回优化的实验: " + g);
        return g;
    }

    private static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_stream_debug", "false");
        String a3 = n.a("DetailClientOptOrangeConfig");
        i.c(a3, "分段流式返回优化调式的orange开关: " + a2);
        return a2;
    }

    private static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_sku_load_delay", "true");
        String a3 = n.a("DetailClientOptOrangeConfig");
        i.c(a3, "拉起sku时加载流式数据是否delay的orange开关: " + a2);
        return a2;
    }

    public static void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[0]);
            return;
        }
        boolean ac = ac();
        B = ac;
        boolean z = true;
        D = ac && ad();
        C = B && ae();
        E = B && af();
        F = B && ag();
        G = B && ah();
        b = B && d();
        if (!B || !u()) {
            z = false;
        }
        L = z;
    }

    private static boolean ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pad_adapter", "true");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启pad适配总控的orange开关: " + a2);
        return a2;
    }

    private static boolean ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pad_adapter_inside", "true");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启pad适配Inside的orange开关: " + a2);
        return a2;
    }

    private static boolean ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pad_adapter_native_desc", "true");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启pad适配Native图文详情的orange开关: " + a2);
        return a2;
    }

    private static boolean af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pad_adapter_dx_zoom", "true");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启pad适配DX缩放的orange开关: " + a2);
        return a2;
    }

    private static boolean ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pad_adapter_full_screen_layer", "true");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启pad适配全屏浮层的orange开关: " + a2);
        return a2;
    }

    private static boolean ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pad_adapter_half_screen_layer", "true");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启pad适配半屏浮层的orange开关: " + a2);
        return a2;
    }

    private static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_pad_fullscreen_layout5", "true");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启pad大屏版本详情的orange开关: " + a2);
        return a2;
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_fold_device_single_column", "false");
        String a3 = q.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否允许折叠屏横屏的双列流改为单列的orange开关: " + a2);
        return a2;
    }

    private static boolean ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_async_module_preload", "true");
        String a3 = d.a("DetailClientOptOrangeConfig");
        i.c(a3, "异步组件的预加载优化开关: " + a2);
        return a2;
    }

    private static boolean ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_cold_launch_opt", "true");
        String a3 = d.a("DetailClientOptOrangeConfig");
        i.c(a3, "开启冷启优化开关: " + a2);
        return a2;
    }

    private static boolean az() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_prefetch_main_pic", "true");
        String a3 = d.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否预取头图的开关: " + a2);
        return a2;
    }

    private static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_preload_json_opt", "true");
        String a3 = d.a("DetailClientOptOrangeConfig");
        i.c(a3, "预加载是否使用jsonObject的开关: " + a2);
        return a2;
    }

    private static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_parser_json_opt", "false");
        String a3 = d.a("DetailClientOptOrangeConfig");
        i.c(a3, "是否开启json重复解析优化的开关: " + a2);
        return a2;
    }

    private static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue();
        }
        boolean c2 = eik.c();
        String a2 = n.a("DetailClientOptOrangeConfig");
        i.c(a2, "命中json拍平的实验: " + c2);
        return c2;
    }
}
