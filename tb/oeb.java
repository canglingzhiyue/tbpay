package tb;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.c;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.g;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tbpoplayer.nativerender.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class oeb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f31968a;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;
    private static Boolean g;
    private static Map<String, Object> h;
    private static Map<String, Object> i;
    private static String[] j;
    private static String k;
    private static Integer l;
    private static Integer m;
    private static Integer n;
    private static Integer o;
    private static Integer p;
    private static Boolean q;
    private static Boolean r;
    private static Boolean s;
    private static Map<String, Boolean> t;

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean aQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa11089b", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-661362531);
        h = new ConcurrentHashMap();
        i = new ConcurrentHashMap();
        t = new ConcurrentHashMap();
        j = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f31968a == null) {
            f31968a = Boolean.valueOf(!a.a().w().c());
        }
        return f31968a.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a("enable_prepare_component", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a("tnode_enable_bottomsheet_appear", false);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a("tnode_enable_tabbarcontroller_tracker_fix", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : a("tnode_enable_input_fix", true);
    }

    public static boolean ck() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aee91cf3", new Object[0])).booleanValue() : a("tnode_enable_input_fix_compare", true);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (k == null) {
            try {
                boolean parseBoolean = Boolean.parseBoolean(ohg.a().a("ShortVideo", "disableMasklayerDispatchTouch", "true"));
                ogg.a("TestConfig", "禁用masklayer的DispatchTouch：" + parseBoolean);
                if (parseBoolean) {
                    k = "fullscreen";
                } else {
                    k = "no";
                }
                ogg.a("TestConfig", "禁用masklayer的DispatchTouch：ab: " + k);
            } catch (Exception e2) {
                ogg.a("TestConfig", "e:" + e2.getMessage());
            }
        }
        if ("all".equals(k)) {
            return true;
        }
        if (!"fullscreen".equals(k)) {
            return false;
        }
        String simpleName = context.getClass().getSimpleName();
        return "TransparentVideoListActivity".equals(simpleName) || "VideoListActivity2".equals(simpleName);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : a("tnode_enable_masklayer_checkalpha", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : a("tnode_enable_preLayout_forAll3", true);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(Boolean.parseBoolean(ohg.a().a("ShortVideo", "enableSharePlayerView", "false")));
            ogg.a(obw.VIDEO_ACTION_TYPE_SHAREPLAYER, "view 复用orange续播开关：" + c);
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : a("tnode_enable_fix_input_oneditting", true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : a("tnode_enable_scroll_pull_offset_y", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : a("tnode_enable_monitor_card_select", true);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        if (d == null) {
            d = Boolean.valueOf(!"true".equals((String) a.a().u().a("disabledShortPage", "false")));
        }
        return d.booleanValue();
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : a("tnode_enable_preload_node", true);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : a("tnode_enable_get_homepage_height", true);
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : a("ab_dsl_orangekey_enable", true);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        if (e == null) {
            try {
                e = Boolean.valueOf(Boolean.parseBoolean(ohg.a().a("ShortVideo", "enableListVideoBufferExt", "true")));
                ogg.a("TestConfig", "双列流buffer加长：" + e);
            } catch (Exception e2) {
                ogg.a("TestConfig", "e:" + e2.getMessage());
            }
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : a("tnode_enable_mtop_prefetch_fix", true);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : a("tnode_enable_disallow_touch", true);
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : a("tnode_enable_opt_node_component", true);
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : a("tnode_enable_mtop_headers", false);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : a("tnode_enable_layout_mainfragment", true);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : a("tnode_enable_image_retry", true);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : a("tnode_enable_tracker_scroll_state", true);
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : a("tnode_enable_fix_text_ellipsize", true);
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : a("tnode_enable_onscroll_for_grid", true);
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : a("tnode_enable_allpreload", true);
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : a("tnode_enable_send_refresh_state_msg", true);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : a("tnode_enable_fix_trackpage", true);
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : a("tnode_enable_new_orange_sp", false);
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : a("tnode_enable_send_refresh_state_idle_msg", true);
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : a("tnode_enable_double_grid_strategy", true);
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        String a2 = a("tnode_disable_pullrightexit_version", "");
        if (!StringUtils.isEmpty(a2)) {
            for (String str : a2.split(",")) {
                if (oec.a((Object) str, 0) == Build.VERSION.SDK_INT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : !ohd.a(3) && !L();
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : a("tnode_enable_fix_honor_pagetracker", true);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue() : a("enabledBitmapSizeOptimise", true);
    }

    public static int P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("47cdcca", new Object[0])).intValue() : a("bitmapMaxSize", 4000);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        Object obj = h.get(str);
        if (obj == null) {
            try {
                obj = Boolean.valueOf("true".equals(String.valueOf(a.a().u().a(str, Boolean.valueOf(z)))));
                h.put(str, obj);
                ogg.a("getBoolOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                ogg.a("getBoolOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return oec.a(obj, z);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        Object obj = h.get(str);
        if (obj == null) {
            try {
                obj = a.a().u().a(str, str2);
                if (obj != null) {
                    h.put(str, String.valueOf(obj));
                }
                ogg.a("getStringOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                ogg.a("getStringOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return oec.a(obj, str2);
    }

    public static int a(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i2)})).intValue();
        }
        Object obj = h.get(str);
        if (obj == null) {
            try {
                obj = a.a().u().a(str, Integer.valueOf(i2));
                h.put(str, String.valueOf(obj));
                ogg.a("getIntOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                ogg.a("getIntOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return oec.a(obj, i2);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        Object obj = h.get(str);
        if (obj == null) {
            try {
                obj = a.a().u().a(str, Float.valueOf(f));
                h.put(str, String.valueOf(obj));
                ogg.a("getFloatOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                ogg.a("getFloatOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return oec.a(obj, f);
    }

    public static long a(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j2)})).longValue();
        }
        Object obj = h.get(str);
        if (obj == null) {
            try {
                obj = a.a().u().a(str, Long.valueOf(j2));
                h.put(str, String.valueOf(obj));
                ogg.a("getIntOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                ogg.a("getIntOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return oec.a(obj, j2);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        Object obj = i.get(str);
        if (obj == null) {
            try {
                Object a2 = a.a().v().a(str, str2);
                obj = a2 != null ? a2.toString() : str2;
                if (obj != null) {
                    i.put(str, obj);
                }
                ogg.a("getStringABConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                ogg.a("getStringABConfig: " + str + ":" + e2.getMessage());
            }
        }
        return oec.a(obj, str2);
    }

    public static Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{str, obj});
        }
        Object obj2 = i.get(str);
        if (obj2 == null) {
            try {
                obj2 = a.a().v().a(str, obj);
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (obj2 != null) {
                    i.put(str, obj2);
                }
                ogg.a("getObjectABConfig: " + str + ":" + obj2);
            } catch (Exception e2) {
                ogg.a("getObjectABConfig: " + str + ":" + e2.getMessage());
            }
        }
        return obj2;
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue() : a("tnode_enable_recyclerview_dispatchevent", true);
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue() : a("tnode_enable_fix_keypath2", true);
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : a("tnode_enable_fix_notify_serialize", false);
    }

    public static int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{new Boolean(z)})).intValue();
        }
        if (ogs.a()) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        Integer num = n;
        if (num != null) {
            return num.intValue();
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(a("tnode_performance_listPreloadConfig", "1")));
            n = valueOf;
            return valueOf.intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c3524f", new Object[0])).intValue();
        }
        if (!ogs.a()) {
            return 0;
        }
        Integer num = o;
        if (num != null) {
            return num.intValue();
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(a("lazyLoadStartPosition", "1")));
            o = valueOf;
            return valueOf.intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : a("enableCellPreLayout", true);
    }

    public static int a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i2)})).intValue();
        }
        if (!ogs.a()) {
            return i2;
        }
        Integer num = l;
        if (num != null) {
            return num.intValue() > 0 ? l.intValue() : i2;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(a("tnode_performance_velocityUpThresholds", "3000")));
            l = valueOf;
            return valueOf.intValue() > 0 ? l.intValue() : i2;
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static int b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i2)})).intValue();
        }
        if (!ogs.a()) {
            return i2;
        }
        Integer num = m;
        if (num != null) {
            return num.intValue() > 0 ? m.intValue() : i2;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(a("tnode_performance_velocityDownThresholds", "1800")));
            m = valueOf;
            return valueOf.intValue() > 0 ? m.intValue() : i2;
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (i.e()) {
            return bI();
        }
        return a(str, false);
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue();
        }
        if (i.e()) {
            return bI();
        }
        Boolean bool = q;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((int) (System.nanoTime() % 100)) >= a("tnode_image_performance_sample_threshold", 5)) {
            q = false;
            return false;
        }
        q = true;
        return true;
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue();
        }
        if (!a("enablePerformanceTrackSample", false)) {
            return false;
        }
        if (oec.e(ab.a())) {
            return true;
        }
        Boolean bool = r;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((int) (System.nanoTime() % 100)) >= a("tnode_performance_collector_sample_threshold", 1)) {
            r = false;
            return false;
        }
        r = true;
        return true;
    }

    public static int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fbb053", new Object[0])).intValue();
        }
        Integer num = p;
        if (num != null) {
            return num.intValue();
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(a("tnode_performance_shareElementConfig", "0")));
            p = valueOf;
            return valueOf.intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue() : Y() != 2;
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : a("tnode_enable_image_origin_test", true);
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : a("tnode_enable_video_new_strategy_v2", true);
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : a("tnode_enable_video_seek_to_start", true);
    }

    public static boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : a("tnode_enable_list_batch_insert_v2", true);
    }

    public static boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : a("tnode_enable_fixOffsetInCellOrRoot", true);
    }

    public static boolean ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : a("tnode_enable_ignore_first_onscroll", true);
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : a("enableMultiThread", true);
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : ak();
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        return a("tnode_enable_fix_tracker_expose_" + str, true);
    }

    public static boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : a("tnode_enable_fix_localsetting", true);
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : a("tnode_enable_change_keyBoardDismissMode", true);
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : a("tnode_enable_fix_recycler_reuse", true);
    }

    public static boolean ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : a("tnode_enable_fix_text_draw", true);
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : a("tnode_enable_cacheab", true);
    }

    public static boolean at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue() : a("tnode_enable_fixBouncyEdgeEffectAt31", true);
    }

    public static boolean au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : a("tnode_enable_prefetch_download_video", true);
    }

    public static String av() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d5ba45e4", new Object[0]) : b("AB_TNode.20220823prefetchhomelistvideo.config", "");
    }

    public static boolean aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : a("ShortVideo.enableFSVideoPreDownload", true);
    }

    public static boolean a(Context context, Uri uri, Uri uri2) {
        String str;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea344", new Object[]{context, uri, uri2})).booleanValue();
        }
        if (!oec.c(context) || a("tnode_disable_view_container", false)) {
            return false;
        }
        if (a("tnode_enable_view_container", false)) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        if (uri2 == null) {
            uri2 = uri;
        }
        String a2 = a("tnode.changeToNewContainer", "page_detail,page_fullpage,page_profile,page_search,page_guangguangcircle,page_content");
        if (!StringUtils.isEmpty(a2)) {
            String[] split2 = a2.split(",");
            if (g(uri.getPath())) {
                str = "page_fullpage";
            } else {
                str = (uri2.getQueryParameter("tnode") == null || (split = uri2.getQueryParameter("tnode").split("\\?")) == null || split.length <= 0) ? "" : split[0];
            }
            for (String str2 : split2) {
                if (str.equals(str2) || h.a(str)) {
                    return true;
                }
            }
            if (StringUtils.equals(str, g.GUANGGUANG_SHORT_LINK) && co()) {
                return true;
            }
        }
        return false;
    }

    private static boolean g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue() : str != null && (str.equals("/app/tb-source-app/video-fullpage/pages/index2") || str.equals("/video-fullpage/transparent-videolist.html"));
    }

    private static boolean co() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af217af7", new Object[0])).booleanValue() : a("enableGuangViewContainer", true);
    }

    public static boolean ax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue() : a("tnode_enable_change_listFinder", true);
    }

    public static boolean ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : a("tnode_enable_gesture_detector_click", false);
    }

    public static boolean az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue() : a("tnode_enable_fix_cell_appear", true);
    }

    public static boolean aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[0])).booleanValue() : a("tnode_enable_fix_visibility", true);
    }

    public static boolean aB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[0])).booleanValue() : a("tnode_enable_fix_refresh_header", true);
    }

    public static boolean aC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a94bbf8d", new Object[0])).booleanValue() : a("tnode_enable_text_autofit", true);
    }

    public static int aD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a959d6fd", new Object[0])).intValue() : a("refreshTouchSlop", -1);
    }

    public static boolean aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9841d91", new Object[0])).booleanValue() : a("tnode_enable_alphaclip_fix", false);
    }

    public static boolean aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a04c93", new Object[0])).booleanValue() : a("tnode_enable_simulated_click", true);
    }

    public static boolean aJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ae6414", new Object[0])).booleanValue() : a("tnode_check_video_invisible2", true);
    }

    public static int aK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9bc7b84", new Object[0])).intValue() : a("tnode_delay_render_time", 300);
    }

    public static boolean aL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ca9316", new Object[0])).booleanValue() : a("tnode_cell_render_timeout", true);
    }

    public static boolean aN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9e6c218", new Object[0])).booleanValue() : a("enableClickManager", true);
    }

    public static boolean aO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[0])).booleanValue() : a("enableFlick", false);
    }

    public static boolean aR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa1f201c", new Object[0])).booleanValue() : a("asyncTextRender", false);
    }

    public static boolean aS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa2d379d", new Object[0])).booleanValue() : a("tnode_enable_prefetch_guangguang", true);
    }

    public static boolean aT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa3b4f1e", new Object[0])).booleanValue() : a("tnode_enable_prefetch_other", true);
    }

    public static boolean aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa49669f", new Object[0])).booleanValue() : a("tnode_enable_prefetch_at_new_openUrl", true);
    }

    public static boolean aV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa577e20", new Object[0])).booleanValue() : a("ShortVideo.enableNewVideoDownloadCancel", true);
    }

    public static int aY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa81c492", new Object[0])).intValue() : a("globalclickinterval", 500);
    }

    public static boolean aZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[0])).booleanValue();
        }
        if (g == null) {
            g = Boolean.valueOf(a("enableFixRichTextOffset", true));
        }
        return g.booleanValue();
    }

    public static boolean ba() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue() : a("enableOptTransition", true);
    }

    public static boolean bb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue();
        }
        try {
            if (a("enableFullPageOrangeDsl", true)) {
                return "true".equals(b("android_fullscreenvideo.orange_dsl_v2.enable", "false"));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean bc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue();
        }
        try {
            return a("enableFullPageQuickOpen", true);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean bd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[0])).booleanValue() : a("enableFixGlobalAppear", true);
    }

    public static int be() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acdfb73d", new Object[0])).intValue() : a("maxPagesInFragment", 1);
    }

    public static boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d586d8c", new Object[]{fVar})).booleanValue() : a("enableNewTransform", true) && fVar != null && fVar.isSuitableForFragmentTransition();
    }

    public static boolean bf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acedcecf", new Object[0])).booleanValue() : a("enableDelayCommit", true) && ba();
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue();
        }
        if (j == null) {
            j = a("syncModules", "orange,ab").split(",");
        }
        int i2 = 0;
        while (true) {
            String[] strArr = j;
            if (i2 >= strArr.length) {
                return false;
            }
            if (str.equals(strArr[i2])) {
                return true;
            }
            i2++;
        }
    }

    public static boolean bg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[0])).booleanValue() : a("enableFirstFrameUrl", true);
    }

    public static boolean bh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad09fdd1", new Object[0])).booleanValue() : a("enableFixForcePlay", true);
    }

    public static boolean bi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue() : a("enableEnterShareTransitionForCard", true);
    }

    public static boolean bj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue() : a("enableNewInterpolator", true);
    }

    public static boolean bk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue() : a("enableFixTabIndicator", true);
    }

    public static boolean bl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue() : a("enableLowMem", false);
    }

    public static boolean bm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad507356", new Object[0])).booleanValue() : a("enableNonClip", true);
    }

    public static boolean bn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad5e8ad7", new Object[0])).booleanValue() : a("enableSureCategory", true);
    }

    public static boolean bo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[0])).booleanValue() : a("enableFixDiffParent2", true);
    }

    public static boolean bp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : a(d.WIDGET_SWITCH_ENABLE_CORNER_RADIUS, true);
    }

    public static boolean bq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[0])).booleanValue() : a("enableLastedDSL", true);
    }

    public static boolean bs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ada5005c", new Object[0])).booleanValue() : a("fixMemLeak2", false);
    }

    public static boolean bt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adb317dd", new Object[0])).booleanValue() : a("fixDetachFullVideo", true);
    }

    public static boolean bu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adc12f5e", new Object[0])).booleanValue() : a("enableHandleTNodeTransfer", true);
    }

    public static boolean bv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adcf46df", new Object[0])).booleanValue() : a("enableFixBottomSheetBehaviorAnim", true);
    }

    public static boolean bx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[0])).booleanValue() : a("forceResetUtParams", false);
    }

    public static boolean by() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adf98d62", new Object[0])).booleanValue() : a("enableInterceptPageAppear", true);
    }

    public static boolean bB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : a("enableInterceptMtopPrefetch", true);
    }

    public static boolean bC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : a("enableInterceptShortLink", true);
    }

    public static boolean bD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : a("weitao_switch.enableResetItemCache", true);
    }

    public static boolean bE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : a("weitao_switch.enableFilterMultiStyleChange", false);
    }

    public static boolean bG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : a("disablePreloadInColdLaunch", true);
    }

    public static boolean bH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : a("enableTab3LaunchUseNewLoading", true);
    }

    public static boolean bI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : a("enableTNodeUTForColdLaunch", false);
    }

    public static boolean bJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : a("enableGlobalConfigV2", false);
    }

    public static boolean bK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : a("enableFixDetach", false);
    }

    public static int bL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab7f6ba4", new Object[0])).intValue() : a("linkbackExpireTimeout", (int) RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT);
    }

    public static boolean bM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : a("enableFixPageDisappearInUt", true);
    }

    public static boolean bN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : a("enableFixMaxSize", true);
    }

    public static boolean bO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : a("enableFixContentParent", false);
    }

    public static boolean bP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : a("enableFixTextLayout", true);
    }

    public static boolean bQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : a("enableFixTabbarControllerAddNewNode", true);
    }

    public static boolean bR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : a("enableFixTid", true);
    }

    public static boolean bS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : a("enableFixTid2", true);
    }

    public static boolean bT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : a("enableChangeClipPaddingInlist", true);
    }

    public static boolean bU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue() : a("enableInterceptBack", true);
    }

    public static boolean bV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : a("enableFixSaveDSL", true);
    }

    public static boolean bW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue() : a("enableFixPauseDelay", true);
    }

    public static int bX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac2885b0", new Object[0])).intValue() : a("ShortVideo.flushUTDelayTime", 500);
    }

    public static boolean bY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue() : a("enableDefaultTransferTo750", true);
    }

    public static boolean bZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : a("enableFixPreloadViewNPECrash", true);
    }

    public static boolean ca() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae5c31e9", new Object[0])).booleanValue() : a("enableWatchMsgInOwnRenderInstance", true);
    }

    public static int cb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae6a4959", new Object[0])).intValue() : a("ShortVideo.timeoutFinishPointReport", 10000);
    }

    public static boolean cc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae7860eb", new Object[0])).booleanValue() : a("enableFixFragments", true);
    }

    public static boolean cd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae86786c", new Object[0])).booleanValue() : a("enableFixSuperDelete", true);
    }

    public static boolean ce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae948fed", new Object[0])).booleanValue() : a("enableFixAutoSlide", true);
    }

    public static boolean cf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aea2a76e", new Object[0])).booleanValue() : a("enableAnimDefaultStartDelay", true);
    }

    public static boolean cg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeb0beef", new Object[0])).booleanValue() : a("enableNewErrorView", true);
    }

    public static boolean ci() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeccedf1", new Object[0])).booleanValue() : a("enableClearHorizontalScrollView", true);
    }

    public static boolean a(ab.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("971f5baf", new Object[]{hVar})).booleanValue();
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = a.a().b();
        if (b != null && b.a(hVar.e())) {
            return a("enableFixTab2IncorrectPageAppear", true);
        }
        return a("enableFixOtherIncorrectPageAppear", false);
    }

    public static boolean cn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af136376", new Object[0])).booleanValue() : a("enableImageOptOffScreen", true);
    }

    public static boolean cj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aedb0572", new Object[0])).booleanValue() : a("disableTransparentTouch", true);
    }

    public static boolean cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af2f9278", new Object[0])).booleanValue() : a("enableDestroyEngineOnActivityDestroyed", true);
    }

    public static boolean cq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af3da9f9", new Object[0])).booleanValue() : a("enableFixMoveSort", true);
    }

    public static boolean bw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[0])).booleanValue() : a("enableCrossPageUT", true);
    }

    public static boolean cr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af4bc17a", new Object[0])).booleanValue();
        }
        if (s == null) {
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(a("enableAPMCustomProcessor", true));
            s = valueOf;
            if (valueOf.booleanValue()) {
                int a2 = a("apm_sample", 1);
                String str = mnd.l;
                if (!StringUtils.isEmpty(str) && str.split("\\.").length >= 4) {
                    a2 *= 200;
                }
                if (Math.random() * 1000.0d >= a2) {
                    z = false;
                }
                s = Boolean.valueOf(z);
            }
        }
        return s.booleanValue();
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{str})).booleanValue();
        }
        Boolean bool = t.get(str);
        if (bool == null) {
            try {
                bool = Boolean.valueOf(a.a().u().a(str));
                t.put(str, bool);
                ogg.a("getBooleanFeatureConfig: " + str + ":" + bool);
            } catch (Exception e2) {
                ogg.a("getBooleanFeatureConfig: " + str + ":" + e2.getMessage());
            }
        }
        return oec.a((Object) bool, false);
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{str})).booleanValue();
        }
        boolean a2 = a("ShortVideo.enableRecoverAudio", true);
        boolean a3 = c.a(ab.a(), str).b().a("tbGlobalMuteSetting");
        ogg.a("TestConfig", "enableRecoverAudio, bizCode:" + str + " settingsAB: " + a3 + " boolOrangeConfig: " + a2);
        return a2 && a3;
    }

    public static boolean aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9923512", new Object[0])).booleanValue() : a("enableOptSetNodeAttr", true);
    }

    public static boolean cs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af59d8fb", new Object[0])).booleanValue() : a("enableOptBindEvent", true);
    }

    public static boolean ct() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af67f07c", new Object[0])).booleanValue() : a("enableIgnoreSameAttr2", false);
    }

    public static boolean cw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af9236ff", new Object[0])).booleanValue() : a("enableFixInitDataKey", true);
    }

    public static boolean aE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a967ee8f", new Object[0])).booleanValue() : a("enablePreloadEarly", true);
    }

    public static boolean aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9760610", new Object[0])).booleanValue() : a("enableFixTransition", true);
    }

    public static boolean ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : Boolean.parseBoolean(b("AB_tab2_android.tab2GlobalInteract.enableTab2GlobalInteract", "true"));
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : a("enableFluidSupportEngineId", true);
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : a("enableNewNetworkReceiver", true);
    }

    public static boolean cx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afa04e80", new Object[0])).booleanValue() : a("enableTabBarControllerNewIdleStrategy", true);
    }

    public static boolean cy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afae6601", new Object[0])).booleanValue() : a("enableFixDarkMode", true);
    }

    public static boolean cz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afbc7d82", new Object[0])).booleanValue() : a("enableFixNodePageAppear", true);
    }

    public static boolean cB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue() : a("enableLiveRoomMemRelease", false);
    }

    public static boolean cE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[0])).booleanValue();
        }
        String b = b("AB_TNode.LiveRoomMemRelease.enable", "true");
        ogg.a("TestConfig", "enableLiveRoomMemReleaseAB, abConfig: " + b);
        return "true".equals(b);
    }

    public static boolean cC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue() : a("enableFixFlexMinSize", true);
    }

    public static boolean cD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue() : a("enableNewUriMerge", true);
    }

    public static boolean a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{new Boolean(z), str})).booleanValue() : !ohd.a(3) && !StringUtils.equals("outside", str) && !z && a("enableImmersiveLiveRoom", true);
    }

    public static boolean cF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[0])).booleanValue() : a("enableLiveTabTopBar", true);
    }

    public static boolean b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f31b0919", new Object[]{new Boolean(z), str})).booleanValue() : a(z, str) && a("enableRootViewFullScreenInImmersiveModeV2", true);
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue() : a("enableDrawerUsePageAppear", true);
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue() : a("enableLiveSecondRefresh", true);
    }

    public static boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue() : a.a().w().f() && a("forcePushTransition", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a("enableExpandableView", true);
    }

    public static boolean a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691d3054", new Object[]{aaVar})).booleanValue();
        }
        boolean a2 = a("enableTab2AsyncLayoutInPreload3", true);
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = a.a().b();
        String e2 = aaVar.k().A().c().e();
        Context N = aaVar.N();
        return a2 && b.a(e2) && b.i() && ((N instanceof Application) || b.a(N));
    }

    public static boolean bz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae07a4e3", new Object[0])).booleanValue() : !a.a().w().c() && StringUtils.equals("true", b("Tab2.Tab2TaskOpt.enable_layout", "true"));
    }

    public static boolean as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : a("enableAvatar2RelayRedPoint", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : a("enableAvatarInterceptHorizontalDrag", true);
    }

    public static boolean aM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d8aa97", new Object[0])).booleanValue() : a("enableFixSaveImageOOM", true);
    }

    public static String x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5faa981", new Object[0]) : b("AB_ServerGray.ci_flow_env_rounting.bucket", "0");
    }

    public static boolean aP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa02f11a", new Object[0])).booleanValue() : a("enableServerGrayParams", true);
    }

    public static boolean aX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa73ad22", new Object[0])).booleanValue() : a("enablePreloadEngine", true);
    }

    public static boolean aW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[0])).booleanValue() : a("fixFoldDeviceWidthWrong", true);
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : a("weitao_switch.enableWeexNewProfilePage", true);
    }

    public static boolean br() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad96e8db", new Object[0])).booleanValue() : a("enableLiveAvatarBlankCheck", true);
    }
}
