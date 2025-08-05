package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ali.user.open.ucc.UccResultCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.navigation.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fkt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean B = false;
    private static String C = null;
    public static final String DEFAULT_GUIDE_PRELOAD_PARAMS_BLACKLIST = "list_param,%22list_param,search_keyword,eurl,targetParams,prefetchImg,prefetchImgRatio,spm,scm,epid,pvid";
    public static final int DELAY_INCREMENT_DEFAULT_TEXT_ANIMATION_TIME = 200;
    public static final int DELAY_INCREMENT_FETCH_RECOMMEND_LIST_FOR_NEXT_PAGE_TIME = 2;
    public static final int DELAY_INCREMENT_NAV_INCREMENT_CONTAINER_SHOW_TIME = 23;
    public static final int DELAY_INCREMENT_NAV_INCREMENT_DELAY_TIME = 1;
    public static final String DETAIL_TAOBAO_GROUP_NAME = "android_detail";
    public static final String FLOAT_PERMISSION_CHECK_INTERVAL = "float_permission_check_interval";
    public static final String GUIDE_PRELOAD_PARAMS_BLACKLIST = "guide_preload_request_params_black_list";
    public static final String NEWDETAIL_TAOBAO_GROUP_NAME = "android_newdetail";
    public static final String NEWDETAIL_WEEX2_SWITCH_DEVICE = "newdetail_weex2_switch_device";
    public static final String VALUE_FALSE = "false";
    public static final String VALUE_TRUE = "true";

    /* renamed from: a  reason: collision with root package name */
    public static String[] f28018a;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    public static boolean au;
    private boolean E;
    private boolean H;
    private boolean I;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private String W;
    private float X;
    private boolean Y;
    private boolean aa;
    private boolean ab;
    private int ac;
    private boolean ad;
    private boolean al;
    private boolean am;
    private boolean an;
    private int ao;
    private int ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    private boolean b;
    private int c;
    private String g;
    private int h;
    private boolean j;
    private int k;
    private boolean l;
    private int d = 3;
    private int e = 12;
    private int f = 2;
    private List<String> i = new ArrayList();
    private List<String> z = new ArrayList();

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            c(map);
        }
    }

    public static /* synthetic */ void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else {
            d(map);
        }
    }

    static {
        kge.a(1576808538);
        f28018a = new String[]{NEWDETAIL_TAOBAO_GROUP_NAME};
    }

    public fkt() {
        ctu.a("NewDetailOrangeConfigInit");
        ak();
        ctu.a();
    }

    private void ak() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7f6bb1", new Object[]{this});
            return;
        }
        this.d = Integer.valueOf(b("scrollRec_fail_maxNum", "3")).intValue();
        this.f = Integer.valueOf(b("scrollRec_preload_page", "2")).intValue();
        if (fjk.a()) {
            this.g = b("newdetail_specifyLiveId", "");
        }
        String b = b("newdetail_openImmediately_channel", "a2141.1.guessitemtab");
        if (!TextUtils.isEmpty(b)) {
            Collections.addAll(this.i, b.split(","));
        }
        this.e = fjs.a(d("new_detail_nav_margin_right_ignore_more", "12"));
        String d = d("stable_pass_params_white_list", "entryBuckets,ndBuckets,newDetailChannel,newType,mtype,appVersion,ndOpenType");
        if (!TextUtils.isEmpty(d)) {
            Collections.addAll(this.z, d.split(","));
        }
        this.E = c("enable_newdetail_realTimeRequest", "true");
        this.H = c("enable_newdetail_baseReqWithBXFeatureV2", "true");
        this.I = c("enable_newdetail_baseReqWithBXFeatureFirstPage", "true");
        this.ao = fjs.a(d("value_newdetail_diff_refresh_nav_data", ""), 2000);
        this.ap = fjs.a(d("value_newdetail_click_area_half_space_dp", ""), 5);
        this.S = c("enable_newdetail_tableViewPinchConflict", "true");
        this.T = c("nd_enable_asac_when_request", "true");
        this.aa = ao();
        this.ab = an();
        this.ac = fjs.a(d("newdetail_nav_root_view_alpha_time", ""));
        this.al = c("newdetail_enable_delay_fetch_next_page", "false");
        this.am = fjs.a(d("newdetail_enable_delay_render_next_page", ""), false);
        this.an = fjs.a(d("newdetail_enable_delay_first_page_second_render", ""), false);
        this.ad = c("newdetail_enable_weex_stop_rendering", "true");
        this.U = c("enable_newdetail_inside_detail_page", "true");
        this.V = c("newdetail_screen_record_switch", "true");
        this.W = d("enable_newdetail_inside_detail_page_test_token", "");
        this.X = fjs.a(d("newdetail_inside_detail_scroll_percent", ""), 0.95f);
        this.Y = c("newdetail_enable_public_menu_report_arg", "true");
        this.aq = c("enable_newdetail_audioRecover", "true");
        this.ar = c("enable_newdetail_new_weex_lifecycle", "true");
        this.as = c("enable_newdetail_mediaView34YCenter", "false");
        this.at = c("enable_newdetail_mediaView11YCenter", "true");
        this.c = fjs.a(d("nd_main_pic_pad_and_fold_size_type", ""), -1);
        this.h = fjs.a(d("nd_last_page_focus_time", ""), 400);
        this.av = c("nd_enable_check_activity_destroy", "true");
        this.aw = c("nd_enable_destroy_force_remove_weex", "false");
        if (!ipa.v() && !c("nd_hit_degrade_apm_token", "false")) {
            z = false;
        }
        this.ay = z;
        this.az = ipa.ad();
        this.ax = c("nd_enable_entry_ut_param_only_once", "true");
        this.b = c("nd_enable_video_id_inconsistent", "true");
        this.j = c("enable_newdetail_send_deliver_to_weex_no_open_immed", "true");
        this.k = fjs.a(d("newdetail_blur_bitmap_processor_radius", ""));
        this.l = c("enable_newdetail_use_hp_height", "true");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (fig.l) {
        } else {
            B = "true".equals(fky.b(a.b(), "enable_newdetail_middleware_blackList", "true"));
            C = fky.b(a.b(), "newdetail_resolverMiddleware_blackList", "shareNDParams,hybrid_nd,xxc,disableHalfScreenGuide,guideExp,newDetailChannel,ndExp,newParams,spm,ndTitle,ndSubTitle,umpChannel,u_channel,multiTabXObjectType,newType,newDetailChannel,id,entryNDNid");
            ai = b(fky.b(a.b(), "newdetail_fold_max_pre_data_size", "90"), 90);
            aj = b(fky.b(a.b(), "newdetail_pad_max_pre_data_size", "90"), 90);
            ak = b(fky.b(a.b(), "newdetail_phone_max_pre_data_size", "30"), 30);
            af = b(fky.b(a.b(), "newdetail_fold_max_pre_request_num", "10"), 10);
            ag = b(fky.b(a.b(), "newdetail_pad_max_pre_request_num", "10"), 10);
            ah = b(fky.b(a.b(), "newdetail_phone_max_pre_request_num", "5"), 5);
            au = "true".equals(fky.b(a.b(), "enable_newdetail_openImmedChannel", "true"));
            al();
            fig.l = true;
        }
    }

    private static void al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8d8332", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(f28018a, new d() { // from class: tb.fkt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                    if (configs != null) {
                        fkt.a(configs);
                        fkt.b(configs);
                    }
                    if (map == null) {
                        return;
                    }
                    fky.i(a.b(), map.get("configVersion"));
                }
            }, false);
        }
    }

    private static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
            return;
        }
        if (map.containsKey("enable_newdetail_middleware_blackList")) {
            B = "true".equals(map.get("enable_newdetail_middleware_blackList"));
        }
        if (map.containsKey("newdetail_resolverMiddleware_blackList")) {
            C = map.get("newdetail_resolverMiddleware_blackList");
        }
        if (map.containsKey("newdetail_fold_max_pre_data_size")) {
            ai = b(map.get("newdetail_fold_max_pre_data_size"), 90);
        }
        if (map.containsKey("newdetail_pad_max_pre_data_size")) {
            aj = b(map.get("newdetail_pad_max_pre_data_size"), 90);
        }
        if (map.containsKey("newdetail_phone_max_pre_data_size")) {
            ak = b(map.get("newdetail_phone_max_pre_data_size"), 30);
        }
        if (map.containsKey("newdetail_fold_max_pre_request_num")) {
            af = b(map.get("newdetail_fold_max_pre_request_num"), 10);
        }
        if (map.containsKey("newdetail_pad_max_pre_request_num")) {
            ag = b(map.get("newdetail_pad_max_pre_request_num"), 10);
        }
        if (!map.containsKey("newdetail_phone_max_pre_request_num")) {
            return;
        }
        ah = b(map.get("newdetail_phone_max_pre_request_num"), 5);
    }

    private static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private static void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{map});
            return;
        }
        if (map.containsKey("newdetail_resolverMiddleware_blackList")) {
            fky.c(a.b(), "newdetail_resolverMiddleware_blackList", map.get("newdetail_resolverMiddleware_blackList"));
        }
        if (map.containsKey("enable_newdetail_middleware_blackList")) {
            fky.c(a.b(), "enable_newdetail_middleware_blackList", map.get("enable_newdetail_middleware_blackList"));
        }
        if (map.containsKey("newdetail_fold_max_pre_data_size")) {
            fky.c(a.b(), "newdetail_fold_max_pre_data_size", map.get("newdetail_fold_max_pre_data_size"));
        }
        if (map.containsKey("newdetail_pad_max_pre_data_size")) {
            fky.c(a.b(), "newdetail_pad_max_pre_data_size", map.get("newdetail_pad_max_pre_data_size"));
        }
        if (map.containsKey("newdetail_phone_max_pre_data_size")) {
            fky.c(a.b(), "newdetail_phone_max_pre_data_size", map.get("newdetail_phone_max_pre_data_size"));
        }
        if (map.containsKey("newdetail_fold_max_pre_request_num")) {
            fky.c(a.b(), "newdetail_fold_max_pre_request_num", map.get("newdetail_fold_max_pre_request_num"));
        }
        if (map.containsKey("newdetail_pad_max_pre_request_num")) {
            fky.c(a.b(), "newdetail_pad_max_pre_request_num", map.get("newdetail_pad_max_pre_request_num"));
        }
        if (map.containsKey("newdetail_phone_max_pre_request_num")) {
            fky.c(a.b(), "newdetail_phone_max_pre_request_num", map.get("newdetail_phone_max_pre_request_num"));
        }
        if (!map.containsKey("enable_newdetail_openImmedChannel")) {
            return;
        }
        fky.c(a.b(), "enable_newdetail_openImmedChannel", map.get("enable_newdetail_openImmedChannel"));
    }

    @Deprecated
    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("android_detail", str, str2);
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue() : "true".equals(d(str, str2));
    }

    private static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7926cac2", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(NEWDETAIL_TAOBAO_GROUP_NAME, str, String.valueOf(i)));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5bded401", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig(NEWDETAIL_TAOBAO_GROUP_NAME, str, str2);
    }

    @Deprecated
    private static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_detail", str, String.valueOf(i)));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 29;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.e;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.g;
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.i;
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : b(NEWDETAIL_WEEX2_SWITCH_DEVICE, "2");
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : fjm.c();
    }

    public int aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9841d80", new Object[]{this})).intValue() : this.ao;
    }

    public int aJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9ae6403", new Object[]{this})).intValue() : this.ap;
    }

    public static int D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[0])).intValue() : a(FLOAT_PERMISSION_CHECK_INTERVAL, hjz.DAY);
    }

    public List<String> H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c3a81998", new Object[]{this}) : this.z;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.E;
    }

    public static List<String> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1914f631", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(C)) {
            Collections.addAll(arrayList, C.split(","));
        }
        return arrayList;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : this.H;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue() : this.I && this.H;
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue() : B;
    }

    public boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue() : this.S;
    }

    public boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[]{this})).booleanValue() : this.T;
    }

    public boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue() : this.V;
    }

    public static boolean ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : c("newdetail_support_higher_atoms", "true");
    }

    public boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[]{this})).booleanValue() : this.ab;
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue();
        }
        if (!ipa.t()) {
            return c("newdetail_open_cloud_render_blur", "false");
        }
        return true;
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : c("newdetail_enable_mask_frame_anim", "true");
    }

    public static boolean aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[0])).booleanValue() : c("newdetail_enable_nav_check_delay_task", "true");
    }

    public static String aM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a4f626d", new Object[0]) : d("newdetail_fast_nd_orange_config_cache", "");
    }

    public static String aN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0d51d0c", new Object[0]) : d("newdetail_fast_nd_optimization_lower_score", "");
    }

    public static String aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("351da0c9", new Object[0]);
        }
        String d = d("newdetail_slow_anim_weex_bg_time", "1800");
        return TextUtils.isEmpty(d) ? "1800" : d;
    }

    public static int aC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a94bbf7c", new Object[0])).intValue() : fjs.a(d("newdetail_main_iv_round_rect_alpha_time", ""), (int) UccResultCode.NO_ACTION_BIND_FAILED);
    }

    public static String aP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dde0924a", new Object[0]) : d("fast_key_nd_weex_switch_list", "nd_best_switch");
    }

    public static boolean aD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a959d70e", new Object[0])).booleanValue() : c("newdetail_enable_slow_bg_for_first_node", "true");
    }

    public static boolean aT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa3b4f1e", new Object[0])).booleanValue() : c("newdetail_enable_activity_destroyed_flag", "true");
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        int i = this.k;
        if (i > 0) {
            return i;
        }
        return 160;
    }

    public static int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[0])).intValue() : c("newdetail_lb_on_create_delay_time", 80);
    }

    public static int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[0])).intValue() : c("newdetail_lb_root_anim_time", 800);
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[0])).intValue() : c("newdetail_lb_process_step_2_time", 80);
    }

    public int as() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abf027ac", new Object[]{this})).intValue();
        }
        int i = this.ac;
        if (i > 0) {
            return i;
        }
        return 500;
    }

    public boolean aE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a967ee8f", new Object[]{this})).booleanValue() : this.al;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.am;
    }

    public boolean at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[]{this})).booleanValue() : this.an;
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        return fjs.a(d(i < 40 ? "newdetail_mask_frame_lt40_anim_duration" : i < 60 ? "newdetail_mask_frame_lt60_anim_duration" : i < 80 ? "newdetail_mask_frame_anim_duration" : "newdetail_mask_frame_gt80_anim_duration", ""), NewDetailMaskFrameLayout.e.a());
    }

    public static int aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a97605ff", new Object[0])).intValue() : fjs.a(d("newdetail_auto_adapter_anim_duration_speed", ""), 1);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        return fjs.a(d(i < 40 ? "newdetail_auto_adapter_anim_duration_lt40_max_value" : i < 60 ? "newdetail_auto_adapter_anim_duration_lt60_max_value" : i < 80 ? "newdetail_auto_adapter_anim_duration_max_value" : "newdetail_auto_adapter_anim_duration_gt80_max_value", ""), NewDetailMaskFrameLayout.e.b());
    }

    public static int aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9923501", new Object[0])).intValue() : fjs.a(d("newdetail_auto_device_duration_multiplier", ""), -2);
    }

    public static int aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9a04c82", new Object[0])).intValue() : fjs.a(d("newdetail_auto_adapter_min_frame_time", ""), 17);
    }

    public static boolean au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : c("newdetail_build_default_abr_model_will_check_item", "true");
    }

    public static boolean av() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue() : c("newdetail_support_high_read_enable_stream_opti", "true");
    }

    public static boolean aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : c("newdetail_force_close_delay_task_and_frozen", "false");
    }

    public static String aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e7d3765", new Object[0]) : d("newdetail_default_degrade_blur_bg_url", "https://gw.alicdn.com/imgextra/i2/O1CN01IJjpaU1hx8tZmWNbP_!!6000000004343-2-tps-750-1000.png_450x10000q100.jpg");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : c("newdetail_degrade_nav_params_process", "false");
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : c("newdetail_degrade_pre_load_home_activity", "false");
    }

    public boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[]{this})).booleanValue() : this.U;
    }

    public String ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f3e45693", new Object[]{this}) : this.W;
    }

    public float ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab55251e", new Object[]{this})).floatValue() : this.X;
    }

    public boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue() : this.Y;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        a();
        boolean b = l.b(context);
        boolean d = l.d(context);
        if (b) {
            return aj;
        }
        if (d) {
            return ai;
        }
        return ak;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        a();
        boolean b = l.b(context);
        boolean d = l.d(context);
        if (b) {
            return ag;
        }
        if (d) {
            return af;
        }
        return ah;
    }

    public static boolean aK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9bc7b95", new Object[0])).booleanValue() : c("newdetail_fold_enable_apm", "true");
    }

    public static boolean aV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa577e20", new Object[0])).booleanValue() : c("newdetail_pad_enable_apm", "true");
    }

    public boolean aL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ca9316", new Object[]{this})).booleanValue() : this.aq;
    }

    public boolean aQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa11089b", new Object[]{this})).booleanValue() : this.ar;
    }

    public boolean aR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa1f201c", new Object[]{this})).booleanValue() : this.as;
    }

    public boolean aS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa2d379d", new Object[]{this})).booleanValue() : this.at;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.c;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.h;
    }

    public boolean aW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[]{this})).booleanValue() : this.av;
    }

    public boolean aX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa73ad22", new Object[]{this})).booleanValue() : this.aw;
    }

    public boolean aO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[]{this})).booleanValue() : this.ay;
    }

    public boolean ba() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[]{this})).booleanValue() : this.az;
    }

    public boolean aZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[]{this})).booleanValue() : this.ax;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b;
    }

    public static ArrayList<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("cc8f744a", new Object[0]);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String d = d("enable_newdetail_prefetchZcacheList", "newdetail-super-pref,newdetail-newguide");
        if (!TextUtils.isEmpty(d)) {
            Collections.addAll(arrayList, d.split(","));
        }
        return arrayList;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.j;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.l;
    }

    public static fkt a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkt) ipChange.ipc$dispatch("b3f202e0", new Object[]{bVar});
        }
        if (bVar == null) {
            return aY();
        }
        if (qxo.a()) {
            return bVar.n();
        }
        try {
            return bVar.n();
        } catch (Exception unused) {
            return aY();
        }
    }

    private static fkt aY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkt) ipChange.ipc$dispatch("311cee98", new Object[0]);
        }
        if (qxo.a()) {
            throw new RuntimeException("newDetailContext 为空");
        }
        return new fkt();
    }
}
