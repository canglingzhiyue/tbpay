package com.taobao.adaemon;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.service.build.Kb;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.jzv;
import tb.kap;
import tb.kge;
import tb.suq;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    /* renamed from: a  reason: collision with root package name */
    private Context f8362a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f8364a;

        static {
            kge.a(818652587);
            f8364a = new j();
        }
    }

    static {
        kge.a(-1843612251);
    }

    public static /* synthetic */ void a(j jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b181789e", new Object[]{jVar, str, str2});
        } else {
            jVar.a(str, str2);
        }
    }

    public static /* synthetic */ void a(j jVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8301180", new Object[]{jVar, str, new Boolean(z)});
        } else {
            jVar.a(str, z);
        }
    }

    private j() {
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("90874e10", new Object[0]) : a.f8364a;
    }

    public void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{this, context});
        } else if (this.f8362a != null || context == null) {
        } else {
            this.f8362a = context;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        h(context);
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            Class.forName("com.taobao.orange.d");
            OrangeConfig.getInstance().registerListener(new String[]{"adaemon"}, new com.taobao.orange.d() { // from class: com.taobao.adaemon.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        j.a(j.this, Kb.c, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", Kb.c, String.valueOf(false))));
                        j.a(j.this, "home_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "home_switch", String.valueOf(false))));
                        j.a(j.this, "home_page_to_bg", OrangeConfig.getInstance().getConfig("adaemon", "home_page_to_bg", null));
                        j.a(j.this, "memory_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "memory_switch", String.valueOf(false))));
                        j.this.a("work_background_delay", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "work_background_delay", String.valueOf(480000))));
                        j.this.a("act_launch_tb_interval", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "act_launch_tb_interval", "10")));
                        j.this.a("boost_cpu_freq_limit", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "boost_cpu_freq_limit", "10")));
                        j.this.a("link_launch_predict", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "link_launch_predict", "7")));
                        j.this.a("work_interval", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "work_interval", String.valueOf(120000))));
                        j.this.a("work_max_time", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "work_max_time", String.valueOf(30))));
                        String config = OrangeConfig.getInstance().getConfig("adaemon", "start_process_switch", String.valueOf(false));
                        j.a(j.this, "start_process_switch", Boolean.parseBoolean(config));
                        j.a(j.this, "start_process_switch_oppo", Boolean.parseBoolean(config));
                        j.a(j.this, "kill_app_proc_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "kill_app_proc_switch", String.valueOf(false))));
                        j.a(j.this, "kill_self", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "kill_self", String.valueOf(false))));
                        j.a(j.this, "main_proc_trigger_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "main_proc_trigger_switch", String.valueOf(false))));
                        j.a(j.this, "clear_all_stack", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "clear_all_stack", String.valueOf(true))));
                        j.this.a("screen_off_delay", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "screen_off_delay", String.valueOf(60000))));
                        j.a(j.this, "channel_tp_trigger", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "channel_tp_trigger", String.valueOf(false))));
                        j.this.a("mem_monitor_interval", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "mem_monitor_interval", String.valueOf(30))));
                        j.this.a("ac_svc_times", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "ac_svc_times", "5")));
                        j.this.a("push_svc_times", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "push_svc_times", "2")));
                        j.a(j.this, "normal_update", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "normal_update", String.valueOf(true))));
                        j.a(j.this, "fix_bg_state", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "fix_bg_state", String.valueOf(true))));
                        j.a(j.this, "main_proc_start_strategy", OrangeConfig.getInstance().getConfig("adaemon", "main_proc_start_strategy", ""));
                        j.a(j.this, "clear_activity_block", OrangeConfig.getInstance().getConfig("adaemon", "clear_activity_block", BundleSplitUtil.ACTIVITY_NAME));
                        j.a(j.this, "service_proc_switch", OrangeConfig.getInstance().getConfig("adaemon", "service_proc_switch", ""));
                        j.a(j.this, "provider_prewarm_switch", OrangeConfig.getInstance().getConfig("adaemon", "provider_prewarm_switch", "39-39"));
                        j.a(j.this, "limit_prewarm_switch", OrangeConfig.getInstance().getConfig("adaemon", "limit_prewarm_switch", "19-19"));
                        j.a(j.this, "forbid_clear_link_activity_switch", OrangeConfig.getInstance().getConfig("adaemon", "forbid_clear_link_activity_switch", ""));
                        j.a(j.this, "act_launch_tb_switch", OrangeConfig.getInstance().getConfig("adaemon", "act_launch_tb_switch", ""));
                        j.a(j.this, "link_predict_switch", OrangeConfig.getInstance().getConfig("adaemon", "link_predict_switch", "51-51"));
                        j.a(j.this, "install_predict_switch", OrangeConfig.getInstance().getConfig("adaemon", "install_predict_switch", "50-50"));
                        j.a(j.this, "predict_interval", OrangeConfig.getInstance().getConfig("adaemon", "predict_interval", ""));
                        j.a(j.this, "app_list", OrangeConfig.getInstance().getConfig("adaemon", "app_list", ""));
                        j.a(j.this, "channel_mem_art", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "channel_mem_art", String.valueOf(true))));
                        j.a(j.this, "clear_link_back_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "clear_link_back_switch", "true")));
                        j.a(j.this, "patch_restart_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "patch_restart_switch", "false")));
                        j.a(j.this, "power_collect_brand", OrangeConfig.getInstance().getConfig("adaemon", "power_collect_brand", "OPPO"));
                        j.a(j.this, "boost_cpu_brand", OrangeConfig.getInstance().getConfig("adaemon", "boost_cpu_brand", "vivo,Xiaomi,Redmi,OPPO"));
                        j.a(j.this, "lock_frame_rate", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "lock_frame_rate", "true")));
                        j.a(j.this, "boost_frame_rate", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "boost_frame_rate", "true")));
                        j.a(j.this, "all_mem_record", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "all_mem_record", String.valueOf(false))));
                        j.this.a("cpu_dump_level", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "cpu_dump_level", String.valueOf(20000))));
                    } catch (Exception e) {
                        e.a("RemoteConfig", "[onConfigUpdate] error.", null, e);
                    }
                }
            }, true);
        } catch (Exception e) {
            e.a("RemoteConfig", "[init]error.", null, e);
        }
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        try {
            return a(context, Kb.c, false);
        } catch (Throwable th) {
            e.a("RemoteConfig", "[getGlobalSwitchState] error.", null, th);
            return false;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a(this.f8362a, "home_switch", false);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a(this.f8362a, "patch_restart_switch", false);
    }

    public boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        boolean equalsIgnoreCase = "OPPO".equalsIgnoreCase(Build.BRAND);
        boolean d2 = equalsIgnoreCase ? d(context) : a(context, "main_proc_trigger_switch", false);
        e.a("RemoteConfig", "getMainProcTriggerSwitchState", null, "isOppo", Boolean.valueOf(equalsIgnoreCase), "start", Boolean.valueOf(d2));
        return d2;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a(this.f8362a, "memory_switch", false);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        boolean equalsIgnoreCase = "OPPO".equalsIgnoreCase(Build.BRAND);
        boolean d2 = equalsIgnoreCase ? d(this.f8362a) : a(this.f8362a, "start_process_switch", false);
        e.a("RemoteConfig", "getStartProcessSwitchState", null, "isOppo", Boolean.valueOf(equalsIgnoreCase), "start", Boolean.valueOf(d2));
        return d2;
    }

    public boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            context = this.f8362a;
        }
        return a(context, "start_process_switch_oppo", false);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : a(this.f8362a, "kill_app_proc_switch", false);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : a(this.f8362a, "kill_self", false);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : a(this.f8362a, "clear_all_stack", true);
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : a(B(), "normal_update", true);
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : a(B(), "fix_bg_state", true);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : a(this.f8362a, "main_proc_start_strategy", "");
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[]{this});
        }
        try {
            String a2 = a(this.f8362a, "clear_activity_block", BundleSplitUtil.ACTIVITY_NAME);
            if (!StringUtils.isEmpty(a2)) {
                return Arrays.asList(a2.split(","));
            }
        } catch (Throwable th) {
            e.a("RemoteConfig", "getClearActivityBlockList err", th, new Object[0]);
        }
        return Collections.emptyList();
    }

    public int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue() : a(this.f8362a, "cpu_dump_level", 20000);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : a(a(this.f8362a, "service_proc_switch", ""));
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : a(a(B(), "provider_prewarm_switch", "39-39")) || o.a(o.KEY_PROVIDER_PREWARM);
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : a(a(B(), "limit_prewarm_switch", "19-19")) || o.a(o.KEY_LIMIT_PREWARM);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : a(a(this.f8362a, "forbid_clear_link_activity_switch", ""));
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : a(a(this.f8362a, "act_launch_tb_switch", ""));
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : l.c();
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        if (!kap.a()) {
            return a(a(this.f8362a, "link_predict_switch", "51-51"));
        }
        return true;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        if (!kap.a()) {
            return a(a(this.f8362a, "install_predict_switch", "3-96"));
        }
        return true;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        try {
            String b2 = b("predict_interval");
            if (!StringUtils.isEmpty(b2)) {
                return Integer.parseInt(b2);
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            String a2 = a(this.f8362a, str, "");
            if (!StringUtils.isEmpty(a2)) {
                String[] split = a2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                if (split.length > 0) {
                    for (String str2 : split) {
                        if (a(str2.split(",")[0])) {
                            return str2.substring(str2.indexOf(",") + 1);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            e.a("RemoteConfig", "parseMultiRange err-" + str, th, new Object[0]);
        }
        return "";
    }

    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : a(this.f8362a, "act_launch_tb_interval", 10) * 1000;
    }

    public int K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4366745", new Object[]{this})).intValue() : a(B(), "boost_cpu_freq_limit", 10);
    }

    public int I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41a3843", new Object[]{this})).intValue() : a(this.f8362a, "link_launch_predict", 7);
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(a(this.f8362a, "power_collect_brand", "OPPO").contains(Build.BRAND));
        b = valueOf;
        return valueOf.booleanValue();
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(a(this.f8362a, "boost_cpu_brand", "vivo,Xiaomi,Redmi,OPPO").contains(Build.BRAND));
        c = valueOf;
        return valueOf.booleanValue();
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : a(this.f8362a, "boost_frame_rate", true);
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(a(this.f8362a, "lock_frame_rate", true));
        d = valueOf;
        return valueOf.booleanValue();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(a(this.f8362a, "app_list", ""));
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : a(this.f8362a, "clear_link_back_switch", true);
    }

    private boolean a(String str) {
        int parseInt;
        int parseInt2;
        int appKeepAliveBucketId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !l.c()) {
            return false;
        }
        try {
            String[] split = str.split("-");
            parseInt = Integer.parseInt(split[0]);
            parseInt2 = Integer.parseInt(split[1]);
            appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(B());
        } catch (Exception unused) {
        }
        return appKeepAliveBucketId >= parseInt && appKeepAliveBucketId <= parseInt2;
    }

    public boolean g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{this, context})).booleanValue() : a(context, "channel_tp_trigger", false);
    }

    public int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue() : a(this.f8362a, "mem_monitor_interval", 30);
    }

    public int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : a(this.f8362a, "ac_svc_times", 5);
    }

    public int x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue() : a(this.f8362a, "push_svc_times", 2);
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : a(this.f8362a, "channel_mem_art", true);
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : a(this.f8362a, "all_mem_record", false);
    }

    private Context B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("74e767c1", new Object[]{this});
        }
        Context context = this.f8362a;
        return context == null ? l.e() : context;
    }

    public void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("adaemon", 4).edit();
            edit.putInt(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, i);
            edit.apply();
            e.a("RemoteConfig", "saveTriggerType", null, suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, Integer.valueOf(i));
        } catch (Throwable th) {
            e.a("RemoteConfig", "saveTriggerType", th, new Object[0]);
        }
    }

    public void b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7862e4", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).edit();
            edit.putInt("version", i);
            edit.apply();
            e.a("RemoteConfig", "saveAccsVersionCode", null, "version", Integer.valueOf(i));
        } catch (Throwable th) {
            e.a("RemoteConfig", "saveAccsVerionCode", th, new Object[0]);
        }
    }

    public String A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this}) : a(this.f8362a, "home_page_to_bg", (String) null);
    }

    private boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51141ee", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        try {
            return context.getSharedPreferences("adaemon", 4).getBoolean(str, z);
        } catch (Exception e) {
            e.a("RemoteConfig", "getConfigFromSP fail:", e, "key", str);
            return z;
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
        } catch (Exception e) {
            e.a("RemoteConfig", "saveConfigToSP fail:", null, e, "key", str, "value", Boolean.valueOf(z));
        }
        if (this.f8362a == null) {
            e.a("RemoteConfig", "saveConfigToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = this.f8362a.getSharedPreferences("adaemon", 4).edit();
        edit.putBoolean(str, z);
        edit.apply();
        e.a("RemoteConfig", "saveConfigToSP", "key", str, "value", Boolean.valueOf(z));
    }

    public int a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d511020c", new Object[]{this, context, str, new Integer(i)})).intValue();
        }
        try {
            return context.getSharedPreferences("adaemon", 4).getInt(str, i);
        } catch (Exception e) {
            e.a("RemoteConfig", "getConfigFromSP fail:", null, e, "key", str);
            return i;
        }
    }

    public String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{this, context, str, str2});
        }
        try {
            return context.getSharedPreferences("adaemon", 4).getString(str, str2);
        } catch (Exception e) {
            e.a("RemoteConfig", "getConfigFromSP fail:", e, "key", str);
            return str2;
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        try {
            if (this.f8362a == null) {
                e.a("RemoteConfig", "saveConfigToSP context null", new Object[0]);
                this.f8362a = jzv.a();
            }
            SharedPreferences.Editor edit = this.f8362a.getSharedPreferences("adaemon", 4).edit();
            edit.putInt(str, i);
            edit.apply();
        } catch (Exception e) {
            e.a("RemoteConfig", "saveConfigToSP fail:", null, e, "key", str, "value", Integer.valueOf(i));
        }
        e.a("RemoteConfig", "saveConfigToSP", "key", str, "value", Integer.valueOf(i));
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            if (this.f8362a == null) {
                e.a("RemoteConfig", "saveTLogOffToSP context null", new Object[0]);
                this.f8362a = jzv.a();
            }
            SharedPreferences.Editor edit = this.f8362a.getSharedPreferences("adaemon", 4).edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e) {
            e.a("RemoteConfig", "saveConfigToSP fail:", e, "key", str, "value", str2);
        }
        e.a("RemoteConfig", "saveConfigToSP", "key", str, "value", str2);
    }
}
