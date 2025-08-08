package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.hash.e;
import com.alibaba.ut.abtest.internal.util.o;
import com.alibaba.ut.abtest.internal.util.s;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.cew;

/* loaded from: classes.dex */
public class cey implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NS_SDK_CONFIG = "yixiu_sdk_config";

    /* renamed from: a  reason: collision with root package name */
    private static cey f26261a;
    private Context b;
    private boolean U = true;
    private Set<Long> c = new HashSet();
    private final Object d = new Object();
    private Set<Long> e = new HashSet();
    private final Object f = new Object();
    private Set<Long> g = new HashSet();
    private final Object h = new Object();
    private long i = cew.a.CONFIG_TRACK_1022_INTERVAL_TIME;
    private long j = cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
    private long k = 60000;
    private boolean l = true;
    private boolean m = true;
    private Set<String> n = new HashSet();
    private final Object o = new Object();
    private boolean p = true;
    private boolean q = true;
    private boolean r = true;
    private boolean s = false;
    private boolean t = true;
    private boolean u = true;
    private boolean v = true;
    private int w = 10;
    private long x = 86400000;
    private boolean y = true;
    private boolean z = false;
    private final Set<String> A = new HashSet();
    private boolean B = true;
    private boolean C = true;
    private boolean D = true;
    private boolean E = true;
    private boolean F = true;
    private boolean G = true;
    private boolean H = true;
    private boolean I = true;
    private boolean J = true;
    private boolean K = true;
    private boolean L = true;
    private boolean M = true;
    private boolean N = true;
    private boolean O = true;
    private boolean P = true;
    private boolean Q = false;
    private boolean R = true;
    private boolean S = true;
    private boolean T = false;
    private boolean V = true;

    static {
        kge.a(-21347395);
        kge.a(-1209827241);
    }

    private cey() {
    }

    public static cey a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cey) ipChange.ipc$dispatch("f032fa7", new Object[0]);
        }
        if (f26261a == null) {
            synchronized (cey.class) {
                if (f26261a == null) {
                    f26261a = new cey();
                }
            }
        }
        return f26261a;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = context;
        OrangeConfig.getInstance().registerListener(new String[]{NS_SDK_CONFIG}, this, true);
    }

    public void b() {
        int size;
        int size2;
        int size3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!h.a()) {
        } else {
            try {
                synchronized (this.o) {
                    if (this.n != null) {
                        i = this.n.size();
                    }
                }
                synchronized (this.f) {
                    size = this.e.size();
                }
                synchronized (this.d) {
                    size2 = this.c.size();
                }
                synchronized (this.h) {
                    size3 = this.g.size();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("【系统配置】全局开启：");
                sb.append(this.l ? "是" : "否");
                sb.append("，触发更新开启：");
                sb.append(this.p ? "是" : "否");
                sb.append("，自动埋点开启：");
                sb.append(this.q ? "是" : "否");
                sb.append("，APP级别埋点开启：");
                sb.append(this.r ? "是" : "否");
                sb.append("，更新实验数据间隔时间：");
                sb.append(this.j);
                sb.append("毫秒，更新实验数据延时范围：");
                sb.append(this.k);
                sb.append("毫秒，稳定性监控开启：");
                sb.append(this.s ? "是" : "否");
                sb.append("，导航拦截开启：");
                sb.append(this.m ? "是" : "否");
                sb.append("，导航拦截忽略数量：");
                sb.append(i);
                sb.append("，1022埋点是否打开：");
                sb.append(this.U ? "是" : "否");
                sb.append("，1022埋点更新间隔时间：");
                sb.append(this.i);
                sb.append("毫秒，1022埋点黑名单分组数量：");
                sb.append(size);
                sb.append("，1022埋点黑名单实验数量：");
                sb.append(size2);
                sb.append("，1022埋点白名单实验数量：");
                sb.append(size3);
                sb.append("，协议完整更新间隔时间");
                sb.append(this.x);
                sb.append("毫秒，导航V2开启：");
                sb.append(this.y ? "是" : "否");
                sb.append("，UT页面生命周期监听开启：");
                sb.append(this.v ? "是" : "否");
                sb.append("，EVO激活客户端实验方法开启：");
                sb.append(this.t ? "是" : "否");
                sb.append("，EVO激活服务端实验方法开启：");
                sb.append(this.u ? "是" : "否");
                sb.append("，需要提前加载启动实验开启：");
                sb.append(this.B ? "是" : "否");
                sb.append("，刷新全局空桶实验前清除缓存：");
                sb.append(this.D ? "是" : "否");
                sb.append("，url 转换异常时候进行 dp2 埋点：");
                sb.append(this.E ? "是" : "否");
                sb.append("，支持实验冷启动生效：");
                sb.append(this.F ? "是" : "否");
                sb.append("，是否支持ACCS下发白名单：");
                sb.append(this.G ? "是" : "否");
                sb.append("，是否支持ACCS下发 beta 配置数据：");
                sb.append(this.H ? "是" : "否");
                sb.append("，是否支持变量中是开关的实验");
                sb.append(this.I ? "是" : "否");
                sb.append("，是否支持懒加载：");
                sb.append(this.J ? "是" : "否");
                sb.append("，是否支持上报异常：");
                sb.append(this.K ? "是" : "否");
                sb.append("，是否支持参数配置说明：");
                sb.append(this.L ? "是" : "否");
                sb.append("，当数据插入失败的时候，是否drop表重新创建");
                sb.append(this.M ? "是" : "否");
                sb.append("，是否支持参数正则匹配：");
                sb.append(this.N ? "是" : "否");
                sb.append("，是否支持ACCS定量灰度：");
                sb.append(this.O ? "是" : "否");
                sb.append("，是否支持URL页面埋点前缀匹配：");
                sb.append(this.P ? "是" : "否");
                sb.append("，是否支持提前分流（懒加载实验）：");
                sb.append(this.Q ? "是" : "否");
                sb.append("，是否支持数据库中记录命中次数：");
                sb.append(this.R ? "是" : "否");
                sb.append("，是否可以取消后台下载实验：");
                sb.append(this.T ? "是" : "否");
                sb.append("，是否可以mtop请求索引：");
                sb.append(this.V ? "是" : "否");
                h.b("OrangeConfigService", sb.toString());
            } catch (Throwable th) {
                h.c("OrangeConfigService", "logConfig Fail", th);
            }
        }
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        h.a("OrangeConfigService", "onConfigUpdate. namespace=" + str + ", map=" + map);
        if (!StringUtils.equals(str, NS_SDK_CONFIG)) {
            return;
        }
        c(this.b);
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ut-ab", 0);
        c(sharedPreferences.getString("cf_track_1022_disabled_experiments", null));
        d(sharedPreferences.getString("cf_track_1022_disabled_groups", null));
        e(sharedPreferences.getString("cf_track_1022_enabled_experiments", null));
        this.l = sharedPreferences.getBoolean("cf_enabled", true);
        this.w = sharedPreferences.getInt("cf_activate_page_track_history_size", 10);
        this.m = sharedPreferences.getBoolean("cf_nav_enabled", true);
        this.p = sharedPreferences.getBoolean("cf_data_trigger_enabled", true);
        this.q = sharedPreferences.getBoolean("cf_track_auto_enabled", true);
        this.r = sharedPreferences.getBoolean("cf_track_app_enabled", true);
        this.j = sharedPreferences.getLong("cf_request_experiment_data_interval_time", cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT);
        this.k = sharedPreferences.getLong("cf_download_experiment_data_delay_time", 60000L);
        this.s = sharedPreferences.getBoolean("cf_stability_monitor_enabled", false);
        this.i = sharedPreferences.getLong("cf_track_1022_interval_time", cew.a.CONFIG_TRACK_1022_INTERVAL_TIME);
        this.t = sharedPreferences.getBoolean("cf_evo_activate_client_enabled", true);
        this.u = sharedPreferences.getBoolean("cf_evo_activate_server_enabled", true);
        this.v = sharedPreferences.getBoolean("cf_ut_page_lifecycle_listener_enabled", true);
        this.x = sharedPreferences.getLong("cf_protocol_complete_interval_time", 86400000L);
        this.y = sharedPreferences.getBoolean("cf_nav_v2_enabled", true);
        this.z = sharedPreferences.getBoolean("cf_rollback_last_fix", false);
        String string = sharedPreferences.getString("cf_undecode_url_experiments", "");
        try {
            this.A.clear();
            if (string != null && string.length() > 0) {
                Collections.addAll(this.A, string.split(","));
            }
        } catch (Exception e) {
            b.a("OrangeConfigService.updateConfigFromSp.unDecodeUrlExps", e);
        }
        this.B = sharedPreferences.getBoolean("cf_preload_launch_experiment", true);
        this.C = sharedPreferences.getBoolean("cf_retain_experiment_enable", true);
        this.D = sharedPreferences.getBoolean("cf_clear_retain_before_refresh", true);
        this.E = sharedPreferences.getBoolean("cf_url_parse_error_to_dp2", true);
        this.F = sharedPreferences.getBoolean("cf_clod_work_enable", true);
        this.G = sharedPreferences.getBoolean("cf_accs_whitelist_enable", true);
        this.H = sharedPreferences.getBoolean("cf_accs_beta_enable", true);
        this.J = sharedPreferences.getBoolean("cf_lazy_load_enable", true);
        this.I = sharedPreferences.getBoolean("cf_switch_variation_enable", true);
        this.K = sharedPreferences.getBoolean("cf_commit_throwable_enable", true);
        this.L = sharedPreferences.getBoolean("cf_support_variation_config", true);
        this.M = sharedPreferences.getBoolean("cf_drop_on_insert_fail", true);
        this.N = sharedPreferences.getBoolean("cf_param_regex_match_enable", true);
        this.O = sharedPreferences.getBoolean("cf_key_accs_grey_enable", true);
        this.P = sharedPreferences.getBoolean("cf_url_prefix_track_enable", true);
        this.Q = sharedPreferences.getBoolean("cf_pre_decision_enable", false);
        this.R = sharedPreferences.getBoolean("cf_db_hit_count", true);
        this.S = sharedPreferences.getBoolean("cf_parse_db_config_when_using", true);
        this.T = sharedPreferences.getBoolean("cf_cancel_bg_download_experiments_enable", false);
        this.V = sharedPreferences.getBoolean("cf_mtop_index_enable", true);
        this.U = sharedPreferences.getBoolean("cf_track_1022_enabled", true);
        b();
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(NS_SDK_CONFIG);
        if (h.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("OrangeConfig: ");
            sb.append(configs == null ? "null" : configs.toString());
            h.f("OrangeConfigService", sb.toString());
        }
        if (configs == null || configs.isEmpty() || context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("ut-ab", 0).edit();
        try {
            String b = o.a().b();
            String str = configs.get("track_1022_disabled_experiments");
            c(str);
            edit.putString("cf_track_1022_disabled_experiments", str);
            String str2 = configs.get("track_1022_disabled_groups");
            d(str2);
            edit.putString("cf_track_1022_disabled_groups", str2);
            String str3 = configs.get("track_1022_enabled_experiments");
            e(str3);
            edit.putString("cf_track_1022_enabled_experiments", str3);
            boolean a2 = a(b + Calendar.getInstance().get(3) + "SDK", configs.get("enabled"), true);
            if (a2 != this.l) {
                this.l = a2;
                edit.putBoolean("cf_enabled", a2);
            }
            boolean a3 = a(b + Calendar.getInstance().get(3) + "SDK", configs.get("nav_enabled"), true);
            if (a3 != this.m) {
                this.m = a3;
                edit.putBoolean("cf_nav_enabled", a3);
            }
            boolean a4 = a(b + Calendar.getInstance().get(3) + "DATA_TRIGGER", configs.get("data_trigger_enabled"), true);
            if (a4 != this.p) {
                this.p = a4;
                edit.putBoolean("cf_data_trigger_enabled", a4);
            }
            boolean a5 = a(b + Calendar.getInstance().get(3) + "TRACK_AUTO", configs.get("track_auto_enabled"), true);
            if (a5 != this.q) {
                this.q = a5;
                edit.putBoolean("cf_track_auto_enabled", a5);
            }
            boolean a6 = a(b + Calendar.getInstance().get(3) + "TRACK_AUTO", configs.get("track_app_enabled"), true);
            if (a6 != this.r) {
                this.r = a6;
                edit.putBoolean("cf_track_app_enabled", a6);
            }
            boolean a7 = a(b + Calendar.getInstance().get(3) + "STABILITY_MONITOR", configs.get("stability_monitor_enabled"), false);
            if (a7 != this.s) {
                this.s = a7;
                edit.putBoolean("cf_stability_monitor_enabled", a7);
            }
            boolean a8 = a(b + "EVO_ACTIVATE", configs.get("evo_activate_client_enabled"), true);
            if (a8 != this.t) {
                this.t = a8;
                edit.putBoolean("cf_evo_activate_client_enabled", a8);
            }
            boolean a9 = a(b + "EVO_ACTIVATE", configs.get("evo_activate_server_enabled"), true);
            if (a9 != this.u) {
                this.u = a9;
                edit.putBoolean("cf_evo_activate_client_enabled", a9);
            }
            boolean a10 = a(b + "SDK", configs.get("ut_page_lifecycle_listener_enabled"), true);
            if (a10 != this.v) {
                this.v = a10;
                edit.putBoolean("cf_ut_page_lifecycle_listener_enabled", a10);
            }
            long j = 86400000;
            long a11 = s.a(configs.get("protocol_complete_interval_time"), 86400000L);
            if (a11 >= 0) {
                j = a11;
            }
            if (this.x != j) {
                this.x = j;
                edit.putLong("cf_protocol_complete_interval_time", j);
            }
            boolean a12 = a(b + "Nav", configs.get("nav_v2_enabled"), true);
            if (a12 != this.y) {
                edit.putBoolean("cf_nav_v2_enabled", a12);
            }
            boolean a13 = a(b + "Fix", configs.get("rollback_last_fix"), false);
            if (a13 != this.z) {
                edit.putBoolean("cf_rollback_last_fix", a13);
            }
            edit.putString("cf_undecode_url_experiments", configs.get("undecode_url_experiments"));
            boolean a14 = a(b + "PRELOAD", configs.get("preload_launch_experiment"), true);
            if (a14 != this.B) {
                edit.putBoolean("cf_preload_launch_experiment", a14);
            }
            boolean a15 = a(b + "RETAIN", configs.get("retain_experiment_enable"), true);
            if (a15 != this.C) {
                edit.putBoolean("cf_retain_experiment_enable", a15);
            }
            boolean a16 = a(b + "CLEAR_RETAIN", configs.get("clear_retain_before_refresh"), true);
            if (a16 != this.D) {
                edit.putBoolean("cf_clear_retain_before_refresh", a16);
            }
            boolean a17 = a(b + "URL_PARSE", configs.get("url_parse_error_to_dp2"), true);
            if (a17 != this.E) {
                edit.putBoolean("cf_url_parse_error_to_dp2", a17);
            }
            boolean a18 = a(b + "CLOD_WORK", configs.get("clod_work_enable"), true);
            if (a18 != this.F) {
                edit.putBoolean("cf_clod_work_enable", a18);
            }
            boolean a19 = a(b + "ACCS_WHITELIST", configs.get("accs_whitelist_enable"), true);
            if (a19 != this.G) {
                edit.putBoolean("cf_accs_whitelist_enable", a19);
            }
            boolean a20 = a(b + "ACCS_BETA", configs.get("accs_beta_enable"), true);
            if (a20 != this.H) {
                edit.putBoolean("cf_accs_beta_enable", a20);
            }
            boolean a21 = a(b + "SWITCH_VARATION", configs.get("switch_variation_enable"), true);
            if (a21 != this.I) {
                edit.putBoolean("cf_switch_variation_enable", a21);
            }
            boolean a22 = a(b + "LAZY_LOAD", configs.get("lazy_load_enable"), true);
            if (a22 != this.J) {
                edit.putBoolean("cf_lazy_load_enable", a22);
            }
            boolean a23 = a(b + "VARIATION_CONFIG", configs.get("support_variation_config"), true);
            if (a23 != this.L) {
                edit.putBoolean("cf_support_variation_config", a23);
            }
        } catch (Throwable th) {
            b.a("OrangeConfigService.updateConfigFromOrange", th);
        }
        try {
            boolean a24 = a(o.a().b() + "COMMIT_THROWABLE", configs.get("commit_throwable_enable"), true);
            if (a24 != this.K) {
                edit.putBoolean("cf_commit_throwable_enable", a24);
            }
        } catch (Throwable unused) {
            h.e("OrangeConfigService", "");
        }
        try {
            if (this.m) {
                String str4 = configs.get("nav_ignores");
                if (StringUtils.isEmpty(str4)) {
                    synchronized (this.o) {
                        this.n.clear();
                    }
                } else {
                    String[] a25 = s.a(str4, ",", true);
                    synchronized (this.o) {
                        this.n.clear();
                        if (a25 != null) {
                            for (String str5 : a25) {
                                this.n.add(str5);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b.a("OrangeConfigService.updateConfigFromOrange", th2);
        }
        try {
            long j2 = cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
            long a26 = s.a(configs.get("request_experiment_data_interval_time"), (long) cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT);
            if (a26 >= 0) {
                j2 = a26;
            }
            if (this.j != j2) {
                this.j = j2;
                edit.putLong("cf_request_experiment_data_interval_time", j2);
            }
        } catch (Throwable th3) {
            b.a("OrangeConfigService.updateConfigFromOrange", th3);
        }
        try {
            long j3 = 60000;
            long a27 = s.a(configs.get("download_experiment_data_delay_time"), 60000L);
            if (a27 >= 0) {
                j3 = a27;
            }
            if (this.k != j3) {
                this.k = j3;
                edit.putLong("cf_download_experiment_data_delay_time", j3);
            }
        } catch (Throwable th4) {
            b.a("OrangeConfigService.updateConfigFromOrange", th4);
        }
        try {
            long j4 = cew.a.CONFIG_TRACK_1022_INTERVAL_TIME;
            long a28 = s.a(configs.get("track_1022_interval_time"), (long) cew.a.CONFIG_TRACK_1022_INTERVAL_TIME);
            if (a28 >= 0) {
                j4 = a28;
            }
            if (this.i != j4) {
                this.i = j4;
                edit.putLong("cf_track_1022_interval_time", j4);
            }
        } catch (Throwable th5) {
            b.a("OrangeConfigService.updateConfigFromOrange", th5);
        }
        try {
            int a29 = s.a(configs.get("activate_page_track_history_size"), 10);
            if (a29 <= 0) {
                a29 = 10;
            }
            if (this.w != a29) {
                this.w = a29;
                edit.putInt("cf_activate_page_track_history_size", a29);
            }
        } catch (Throwable th6) {
            b.a("OrangeConfigService.updateConfigFromOrange", th6);
        }
        try {
            String b2 = o.a().b();
            boolean a30 = a(b2 + "DROP", configs.get("drop_on_insert_fail"), true);
            if (a30 != this.M) {
                edit.putBoolean("cf_drop_on_insert_fail", a30);
                this.M = a30;
            }
            boolean a31 = a(b2 + "PARAM_REGEX", configs.get("param_regex_match_enable"), true);
            if (a31 != this.N) {
                edit.putBoolean("cf_param_regex_match_enable", a31);
                this.N = a31;
            }
            boolean a32 = a(b2 + "ACCS_GREY", configs.get("key_accs_grey_enable"), true);
            if (a32 != this.O) {
                edit.putBoolean("cf_key_accs_grey_enable", a32);
                this.O = a32;
            }
            boolean a33 = a(b2 + "URL_PREFIX_TRACK", configs.get("url_prefix_track_enable"), true);
            if (a33 != this.P) {
                edit.putBoolean("cf_url_prefix_track_enable", a33);
                this.P = a33;
            }
            boolean a34 = a(b2 + "PRE_DECISION", configs.get("pre_decision_enable"), false);
            if (a34 != this.Q) {
                edit.putBoolean("cf_pre_decision_enable", a34);
                this.Q = a34;
            }
            boolean a35 = a(b2 + "HIT_COUNT", configs.get("db_hit_count"), true);
            if (a35 != this.R) {
                edit.putBoolean("cf_db_hit_count", a35);
                this.R = a35;
            }
            boolean a36 = a(b2 + "PARSE_DB_CONFIG", configs.get("parse_db_config_when_using"), true);
            if (a36 != this.S) {
                edit.putBoolean("cf_parse_db_config_when_using", a36);
                this.S = a36;
            }
            boolean a37 = a(b2 + "CACNEL", configs.get("cancel_bg_download_experiments_enable"), false);
            if (a37 != this.T) {
                edit.putBoolean("cf_cancel_bg_download_experiments_enable", a37);
                this.T = a37;
            }
            boolean a38 = a(b2 + "MTOP", configs.get("mtop_index_enable"), true);
            if (a38 != this.V) {
                edit.putBoolean("cf_mtop_index_enable", a38);
                this.V = a38;
            }
            boolean a39 = a(b2 + "1022Enable", configs.get("track_1022_enabled"), true);
            if (a39 != this.U) {
                edit.putBoolean("cf_track_1022_enabled", a39);
                this.U = a39;
            }
        } catch (Throwable th7) {
            b.a("OrangeConfigService.updateConfigFromOrange.immediately", th7);
        }
        edit.apply();
        b();
    }

    private boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        int a2 = s.a(str2, -1);
        return a2 >= 0 ? a(a2, str) : z;
    }

    private boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 0) {
            return false;
        }
        int abs = Math.abs(e.a().hashString(str, cew.a.DEFAULT_CHARSET).asInt()) % 10000;
        h.a("OrangeConfigService", "isInSample, seed=" + str + ", configValue=" + i + ", sample=" + abs);
        return abs < i;
    }

    private void c(String str) {
        long[] b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            h.a("OrangeConfigService", "checkTrack1022DisabledExperimentsUpdate. value=" + str);
            synchronized (this.d) {
                this.c.clear();
                if (!StringUtils.isEmpty(str) && (b = s.b(str)) != null && b.length > 0) {
                    for (long j : b) {
                        this.c.add(Long.valueOf(j));
                    }
                }
            }
        } catch (Throwable th) {
            b.a("OrangeConfigService.processTrack1022DisabledExpStr", th);
        }
    }

    public boolean a(Long l) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed6d4ab", new Object[]{this, l})).booleanValue();
        }
        if (l != null && l.longValue() > 0) {
            try {
                synchronized (this.d) {
                    contains = this.c.contains(Long.valueOf(l.longValue()));
                }
                return contains;
            } catch (Throwable th) {
                b.a("OrangeConfigService.isTrack1022ExperimentDisabled", th);
            }
        }
        return false;
    }

    private void d(String str) {
        long[] b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            h.a("OrangeConfigService", "checkTrack1022DisabledGroupsUpdate. value=" + str);
            synchronized (this.f) {
                this.e.clear();
                if (!StringUtils.isEmpty(str) && (b = s.b(str)) != null && b.length > 0) {
                    for (long j : b) {
                        this.e.add(Long.valueOf(j));
                    }
                }
            }
        } catch (Throwable th) {
            b.a("OrangeConfigService.processTrack1022DisabledGroupsStr", th);
        }
    }

    public boolean b(Long l) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6fca2c", new Object[]{this, l})).booleanValue();
        }
        if (l != null && l.longValue() > 0) {
            try {
                synchronized (this.f) {
                    contains = this.e.contains(l);
                }
                return contains;
            } catch (Throwable th) {
                b.a("OrangeConfigService.isTrack1022GroupDisabled", th);
            }
        }
        return false;
    }

    private void e(String str) {
        long[] b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        try {
            h.a("OrangeConfigService", "checkTrack1022EnabledExperimentsUpdate. value=" + str);
            synchronized (this.h) {
                this.g.clear();
                if (!StringUtils.isEmpty(str) && (b = s.b(str)) != null && b.length > 0) {
                    for (long j : b) {
                        this.g.add(Long.valueOf(j));
                    }
                }
            }
        } catch (Throwable th) {
            b.a("OrangeConfigService.processTrack1022EnabledExpStr", th);
        }
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.U;
    }

    public boolean c(Long l) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7808bfad", new Object[]{this, l})).booleanValue();
        }
        if (l != null && l.longValue() > 0) {
            try {
                synchronized (this.h) {
                    contains = this.g.contains(Long.valueOf(l.longValue()));
                }
                return contains;
            } catch (Throwable th) {
                b.a("OrangeConfigService.isTrack1022ExperimentEnabled", th);
            }
        }
        return false;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.i;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.j;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.k;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.l;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.m;
    }

    public boolean a(String str) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            synchronized (this.o) {
                contains = this.n.contains(str);
            }
            return contains;
        } catch (Throwable th) {
            b.a("OrangeConfigService.isNavIgnored", th);
            return false;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.p;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.q;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.r;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.s;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.t;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.u;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.v;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.w;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.y;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.z;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.A.contains(str);
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.B;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.C;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.D;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.E;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.F;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.G;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.H;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.I;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.J;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.K;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.L;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.M;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.N;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.O;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.P;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.Q;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.R;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.S;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.T;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : this.V;
    }
}
