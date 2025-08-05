package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.a;
import com.taobao.android.detail.core.performance.d;
import com.taobao.android.detail.core.performance.p;
import com.taobao.android.detail.core.utils.i;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes4.dex */
public class god {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28406a;
    public static boolean b;
    public static float c;
    public static boolean d;
    public static boolean e;
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
    public static boolean p;
    public static String q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static boolean w;
    public static boolean x;

    static {
        kge.a(-35490274);
        f28406a = true;
        b = true;
        c = 0.5f;
        d = true;
        e = true;
        f = true;
        g = true;
        h = false;
        i = false;
        j = true;
        k = true;
        l = false;
        m = true;
        n = true;
        o = true;
        v = true;
        p = true;
        w = true;
        q = "https://pages-fast.m.taobao.com/wow/z/app/detail-next/item/index?x-ssr=true&id=";
        r = false;
        s = true;
        t = false;
        u = true;
        x = true;
        emu.a("com.taobao.android.detail.core.performance.orange.DetailOrangeConfig");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b();
        c();
        f = d();
        e = e();
        d = i();
        h = k();
        i = l();
        k = n();
        l = o();
        g = j();
        v = z();
        p = s();
        w = A();
        q = t();
        r = u();
        s = v();
        t = w();
        u = x();
        x = y();
    }

    private static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_fliggy_fix_mimi_late", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "允许飞猪修复mini接口数据解析比主屏晚的开关: " + a2);
        return a2;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        f28406a = f();
        b = g();
        c = h();
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        o = p();
        n = q();
        m = r();
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_webview_idle_init", "true");
        String a3 = p.a("DetailOrangeConfig");
        i.c(a3, "webview闲时初始化的orange开关: " + a2);
        return a2;
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        boolean a2 = a("not_auto_play_video_low_device", "true");
        String a3 = a.a("DetailOrangeConfig");
        i.c(a3, "低端机头图不自动播放的orange开关: " + a2);
        return a2;
    }

    private static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_actionbar_v3_style", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "允许详情3.0导航栏适配氛围的orange开关: " + a2);
        return a2;
    }

    private static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_actionbar_style", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "允许行业化/2.0的导航栏适配氛围的orange开关: " + a2);
        return a2;
    }

    private static float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10df", new Object[0])).floatValue();
        }
        float b2 = b("actionbar_fix_alpha", "0.5");
        String a2 = d.a("DetailOrangeConfig");
        i.c(a2, "详情3.0导航栏透明度变化基准值: " + b2);
        return b2;
    }

    private static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_global_barrage", "true");
        i.c("DetailOrangeConfig", "允许全局弹幕的orange开关: " + a2);
        return a2;
    }

    private static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_detail_bottom_bar_down_grade", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "开启底部bar渲染失败降级开关: " + a2);
        return a2;
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_bugfix_p2r_add_feature", "true");
        String a3 = a.a("DetailOrangeConfig");
        i.c(a3, "【Bugfix】是否开启修复下拉刷新AddFeature的orange开关: " + a2);
        return a2;
    }

    private static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_bugfix_fix_locator_alpha", "true");
        String a3 = a.a("DetailOrangeConfig");
        i.c(a3, "【Bugfix】是否开启修复下拉刷新锚点tab alpha的orange开关: " + a2);
        return a2;
    }

    private static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_atmosphere_pic_fetch", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "是否预取腰带图片的开关: " + a2);
        return a2;
    }

    private static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_detail_request_degrade", "false");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "详情网络接口降级开关: " + a2);
        return a2;
    }

    private static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_simplify_preload_render", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "简化预加载流程的开关: " + a2);
        return a2;
    }

    private static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_delete_shop_section", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "关闭店铺卡片显示的开关: " + a2);
        return a2;
    }

    private static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_forbid_desc_show", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "关闭图文详情等模块显示的开关: " + a2);
        return a2;
    }

    private static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_ccrc_activate", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "反爬注册激活的开关: " + a2);
        return a2;
    }

    private static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_liftup_newbuy", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "自动拉起newbuy的开关: " + a2);
        return a2;
    }

    private static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_collect_use_new_favorite", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "使用新收藏sdk的开关: " + a2);
        return a2;
    }

    private static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_remove_stream_data", "false");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "不允许remove流式数据的开关: " + a2);
        return a2;
    }

    private static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_net_error_to_error_page", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "允许420错误展示错误页的开关: " + a2);
        return a2;
    }

    private static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_redirect_use_ssr", "false");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "允许切换h5兜底链接为ssr的开关: " + a2);
        return a2;
    }

    private static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        boolean a2 = a("enable_ignore_error_receive_data", "true");
        String a3 = d.a("DetailOrangeConfig");
        i.c(a3, "允许流式忽略onReceiveData错误数据的开关: " + a2);
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
            i.a("DetailOrangeConfig", str, e2);
            return false;
        }
    }

    private static float b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b86d", new Object[]{str, str2})).floatValue();
        }
        try {
            return Float.parseFloat(OrangeConfig.getInstance().getConfig("android_detail", str, str2));
        } catch (Exception e2) {
            i.a("DetailOrangeConfig", str, e2);
            return 0.0f;
        }
    }

    private static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("android_detail", "redirect_base_h5_url", q);
        } catch (Exception e2) {
            i.a("DetailOrangeConfig", "redirect_base_h5_url", e2);
            return q;
        }
    }
}
