package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class dki implements d, dkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Set<String> c;

    /* renamed from: a  reason: collision with root package name */
    private volatile SharedPreferences f26811a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final Set<String> d = new HashSet();

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "WhiteList";
    }

    @Override // tb.dkf
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        }
    }

    static {
        HashSet hashSet = new HashSet(255);
        c = hashSet;
        hashSet.add("tbsearch_non_video");
        c.add("tbsearch_non_intelligent_end");
        c.add("tbsearch_dynamic_pic_degraded");
        c.add("detail_activity_precreate");
        c.add("detail_ts_prefetch");
        c.add("detail_main_pic_transmit");
        c.add("detail_reuse_component");
        c.add("detail_sku_async");
        c.add("detail_log_optimize");
        c.add("home_openHVideoViewPerformance");
        c.add("home_openRecyclerViewPreload");
        c.add("home_openDXPrefetch");
        c.add("home_openSwipingLoad");
        c.add("image_device_scale");
        c.add("image_post_front_ui");
        c.add("image_cache_fuzzy_match");
        c.add("image_reporter_async");
        c.add("enableMultiExecutor");
        c.add("br_performance");
        c.add("detail_mtop_handler");
        c.add("alivfs_lsm");
        c.add("tbsearch_fps_perf");
        c.add("tbsearch_first_screen_perf");
        c.add("home_openCallbackNotOnMainThread");
        c.add("home_openColdReqOpt");
        c.add("home_openJSONOpt");
        c.add("home_openLoadCacheOpt");
        c.add("home_openDXPreRender");
        c.add("home_openLowDeviceDowngrade");
        c.add("home_openFlingVelocity");
        c.add("link_opt_open");
        c.add("link_opt_open_julang");
        c.add("link_url_rewrite");
        c.add("ApmReceiveOuterEvent");
        c.add("enable_wv_prefetch");
        c.add("consume_wvprefetch");
        c.add("link_opt_src_growth_dhh");
        c.add("sendUtInit");
        c.add("linkInOrder");
        c.add("afc_new_link_info_opt");
        c.add("afc_login_token_opt");
        c.add("mtop_long_param_optimize");
        c.add("launchTurbo");
        c.add("turbotBootBackground");
        c.add("invokedAsFinish");
        c.add("ApmInitPerformanceOpt");
        c.add("BXLaunchOpt");
        c.add("POPCallWeex2InitOpt");
        c.add("POPCallWeexInitOpt");
        c.add("android_poplayer_page_ready_api");
        c.add("apmPingPongUseFront");
        c.add("cmtCommitOpt");
        c.add(nkr.SWITCH_NAME);
        c.add("image_notify_launch_finish");
        c.add("image_opt_init");
        c.add("journal_mode_truncate");
        c.add("key_huawei_content_provider_load_on_demand");
        c.add("key_pre_load_indicator_view");
        c.add("link_launch_opt");
        c.add("mtop_delay_init");
        c.add("navigationOpt");
        c.add("network_launch_optimize");
        c.add("network_launch_optimize_v2");
        c.add("newdetail_enable_weex_init_when_need");
        c.add("orange_load_config_optimize");
        c.add("orange_regexp_optimize");
        c.add("poplayer_launch_task_opt");
        c.add("poplayer_launch_task_opt_v3");
        c.add("start_public_menu_init_delay");
        c.add("use_bcontroller_without_downgrade");
        c.add("version_switch_opt");
        c.add("weexOpt_weex1_delay");
        c.add("weexOpt_weex2_delay");
        c.add("welBreak");
        c.add(jmg.DEFER_INIT_PREFETCH_CONFIG);
        c.add("OptInitWindVane");
        c.add("OptUCSoInject");
        c.add("weex_init_process_opt_v2");
        c.add("poplayer_launch_task_net_intercept_remove");
        c.add("OptInitWvParam");
        c.add("weex_init_process_opt");
    }

    @Override // tb.dkf
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.b.compareAndSet(false, true)) {
        } else {
            this.f26811a = context.getSharedPreferences("ab_watcher_indices_switches", 0);
            Set<String> stringSet = this.f26811a.getStringSet("age_black_list", Collections.emptySet());
            if (stringSet == null) {
                return;
            }
            this.d.addAll(stringSet);
        }
    }

    @Override // tb.dkf
    public Boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("3961d127", new Object[]{this, context, str}) : (!this.d.contains(str) && c.contains(str)) ? true : null;
    }

    @Override // tb.dkf
    public void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        a(context);
        OrangeConfig.getInstance().getConfigs("ab_watcher_indices");
        OrangeConfig.getInstance().registerListener(new String[]{"ab_watcher_indices"}, this, true);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
            djy.a("WhiteListSwitchesImpl", "discard this update because of it is from cache");
        } else {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs == null) {
                djy.a("WhiteListSwitchesImpl", "no config found for " + str + " in orange");
            } else if (this.f26811a == null) {
                djy.a("WhiteListSwitchesImpl", "sp is null, maybe not it, something went wrong");
            } else {
                HashSet hashSet = new HashSet(Arrays.asList(((String) djy.a(configs, "age_black_list", "")).split(",")));
                if (hashSet.isEmpty()) {
                    return;
                }
                djy.a("WhiteListSwitchesImpl", "black list size: " + hashSet);
                this.f26811a.edit().putStringSet("age_black_list", hashSet).commit();
            }
        }
    }

    @Override // tb.dkf
    public c b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("be53a6fd", new Object[]{this, context});
        }
        dkk a2 = dko.a(a(), -1L, -1L, -1L, -1L);
        for (String str : c) {
            if (!this.d.contains(str)) {
                a2.a(dko.a(str, Boolean.TRUE.toString(), a()));
            }
        }
        return a2;
    }

    @Override // tb.dkf
    public Map<String, dkl> c(Context context) throws UnsupportedOperationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }
}
