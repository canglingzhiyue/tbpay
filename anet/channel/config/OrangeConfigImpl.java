package anet.channel.config;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.OrangeConfigStatistic;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.util.ALog;
import anetwork.channel.config.IRemoteConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.ArrayList;
import org.json.JSONArray;
import tb.kge;

/* loaded from: classes.dex */
public class OrangeConfigImpl implements IRemoteConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AMDC_CONTROL_LIST = "amdc_control_list";
    private static final String AMDC_CONTROL_MODE = "amdc_control_mode";
    private static final String AMDC_GROUP = "amdc";
    private static final String AMDC_UPDATE_MODE_ENABLE_SWITCH = "amdc_update_mode_enable_switch";
    public static final String NETWORK_ACCEPT_ENCODE_WHITE_LIST_SWITCH = "network_accept_encode_domain_write_switch";
    private static final String NETWORK_ACCS_SESSION_BG_SWITCH = "network_accs_session_bg_switch";
    private static final String NETWORK_ALLOW_ADD_AB_HEADER_IN_MTOP = "network_allow_add_ab_header_in_mtop";
    private static final String NETWORK_ALLOW_CONVERT_IPV4_TO_IPV6_ENABLE_SWITCH = "network_allow_convert_ipv4_to_ipv6_enable_switch";
    public static final String NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_SWITCH = "network_allow_no_cookie_white_list_switch";
    private static final String NETWORK_ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_SWITCH = "network_allow_retry_use_long_link_white_list_switch";
    private static final String NETWORK_ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED = "network_allow_spdy_when_bind_service_failed";
    private static final String NETWORK_AMDC_FIRST_REQUEST_OPT_SWITCH = "network_lamdc_first_request_opt_switch";
    private static final String NETWORK_AMDC_LIGHT_TIME_SWITCH = "network_amdc_light_time_switch";
    private static final String NETWORK_AMDC_NOT_USE_IPV6_SWITCH = "network_amdc_not_use_ipv6_switch";
    private static final String NETWORK_AMDC_PRESET_HOSTS = "network_amdc_preset_hosts";
    private static final String NETWORK_AMDC_REDUCE_FREQUENCY_SWITCH = "network_reduce_frequency_switch";
    private static final String NETWORK_AMDC_RETRY_STRATEGY_OPT_SWITCH = "network_amdc_retry_strategy_opt_enable_switch";
    private static final String NETWORK_AMDC_STRATEGY_OPT_SWITCH = "network_amdc_stategy_opt_switch";
    private static final String NETWORK_AMDC_STRATEGY_THRESHOLD_SWITCH = "network_amdc_strategy_threshold_switch";
    private static final String NETWORK_AMDC_STRATEGY_UPDATE_SWITCH = "network_amdc_strategy_update_switch";
    private static final String NETWORK_AMDC_TIMEOUT_SWITCH = "network_amdc_timeout_switch";
    private static final String NETWORK_ANALYSIS_MONITOR = "network_analysis_monitor_switch";
    private static final String NETWORK_BIND_SERVICE_OPTIMISE = "network_bind_service_optimize";
    private static final String NETWORK_BIZ_MONITOR_REQUESTS = "network_biz_monitor_requests";
    private static final String NETWORK_BIZ_WHITE_LIST_BG = "network_biz_white_list_bg";
    private static final String NETWORK_CHANGE_HTTP3_WHITE_LIST_SWITCH = "network_change_http3_white_list_switch";
    private static final String NETWORK_CHANGE_THRESHOLD_TIME = "network_change_threshold_time";
    private static final String NETWORK_CHANNEL_AMDC_TTL_KEY_SWITCH = "network_channel_amdc_ttl_switch";
    private static final String NETWORK_CHANNEL_LOCAL_INSTANCE_ENABLE_SWITCH = "network_channel_local_instance_enable_switch";
    private static final String NETWORK_COMPLEX_CONNECT_ENABLE_SWITCH = "network_complex_connect_enable_switch";
    private static final String NETWORK_COMPLEX_CONNECT_WHITE_LIST = "network_complex_connect_white_list";
    private static final String NETWORK_CONN_RACING_ENABLE_SWITCH = "network_connect_racing_enable_switch";
    private static final String NETWORK_COOKIE_HEADER_REDUNDANT_FIX = "network_cookie_header_redundant_fix";
    public static final String NETWORK_COOKIE_LOG_HOST_WHITE_LIST_SWITCH = "network_cookie_log_domain_write_list_switch";
    private static final String NETWORK_COOKIE_OPT_SWITCH = "network_cookie_opt_switch";
    private static final String NETWORK_CURRENT_PROESS_OPT_ENABLE_SWITCH = "network_current_process_opt_enable_switch";
    private static final String NETWORK_DECOMPRESS_SWITCH = "network_decompress_switch";
    private static final String NETWORK_DELAY_COMPLEX_CONNECT = "network_delay_complex_connect";
    private static final String NETWORK_DELAY_RETRY_REQUEST_NO_NETWORK = "network_delay_retry_request_no_network";
    private static final String NETWORK_DETECT_CENTER_ENABLE_SWITCH = "network_detect_center_enable_switch";
    private static final String NETWORK_DETECT_ENABLE_SWITCH = "network_detect_enable_switch";
    public static final String NETWORK_DETECT_H3_HOST_WHITE_LIST_SWITCH = "network_h3_detect_domain_write_list_switch";
    private static final String NETWORK_DETECT_H3_OPT_ENABLE_SWITCH = "network_h3_detect_opt_switch";
    private static final String NETWORK_DIAGNOSIS_ENABLE_SWITCH = "network_diagnosis_enable";
    private static final String NETWORK_DNS_WHITE_LIST = "network_dns_biz_white_list";
    private static final String NETWORK_EAGAGIN_OPTIMIZE_SWITCH = "network_eagain_enable_switch";
    private static final String NETWORK_EMPTY_SCHEME_HTTPS_SWITCH = "network_empty_scheme_https_switch";
    private static final String NETWORK_EXCEPTION_DETECT_URL = "network_exception_detect_url";
    private static final String NETWORK_FALCO_ID_ENABLE_SWITCH = "network_falco_id_enable_switch";
    private static final String NETWORK_FALCO_ID_WHITE_LIST = "network_falco_id_white_list";
    private static final String NETWORK_FAST_DEGRADE_WHITE_LIST = "network_fast_degrade_white_list";
    private static final String NETWORK_FORBID_NEXT_LUANCH_OPTIMIZE = "network_forbid_next_launch_optimize";
    private static final String NETWORK_GET_SCHEME_OPT_SWITCH = "network_get_scheme_opt_switch";
    private static final String NETWORK_GET_SESSION_ASYNC_SWITCH = "network_get_session_async_switch";
    private static final String NETWORK_GET_SESSION_OPT_SWITCH = "network_get_session_opt_switch";
    private static final String NETWORK_GZIP_DECOMPRESS_SWITCH = "network_gzip_close_decompress_switch";
    private static final String NETWORK_HANDOVER_SIGNAL_SWITCH = "network_handover_signal_switch";
    private static final String NETWORK_HORSE_RACE_SWITCH = "network_horse_race_switch";
    private static final String NETWORK_HTTP3_0RTT_WHITE_LIST_SWITCH = "network_http3_0rtt_white_list_switch";
    private static final String NETWORK_HTTP3_1RTT_WHITE_LIST_SWITCH = "network_http3_1rtt_white_list_switch";
    private static final String NETWORK_HTTP3_BLACK_LIST_SWITCH = "network_http3_black_list_switch";
    private static final String NETWORK_HTTP3_DETECT_VALID_TIME = "network_http3_detect_valid_time";
    private static final String NETWORK_HTTP3_ENABLE_SWITCH = "network_http3_enable_switch";
    private static final String NETWORK_HTTP3_OPT_WHITE_LIST_SWITCH = "network_http3_opt_white_list_switch";
    private static final String NETWORK_HTTP3_PRE_HOST_ENABLE_SWITCH = "network_http3_pre_host_enable_switch";
    private static final String NETWORK_HTTP3_RECONNECT_ENABLE_SWITCH = "network_http3_reconnect_enable_switch";
    private static final String NETWORK_HTTP3_VIP_BLACK_LIST_SWITCH = "network_http3_vip_black_list_switch";
    private static final String NETWORK_HTTP3_WHITE_LIST_SWITCH = "network_http3_white_list_switch";
    private static final String NETWORK_HTTPS_SNI_ENABLE_SWITCH = "network_https_sni_enable_switch";
    private static final String NETWORK_HTTP_CACHE_CONFIG = "network_http_cache_config";
    private static final String NETWORK_HTTP_CACHE_FLAG = "network_http_cache_flag";
    private static final String NETWORK_HTTP_CACHE_SWITCH = "network_http_cache_switch";
    private static final String NETWORK_HTTP_DETECT_WHITE_LIST = "network_http_detect_white_list";
    private static final String NETWORK_HTTP_DNS_NOTIFY_WHITE_LIST = "network_http_dns_notify_white_list";
    private static final String NETWORK_HTTP_SESSION_WAIT_TIME = "network_http_session_wait_time";
    private static final String NETWORK_INTERCEPTOR_OPT_SWITCH = "network_interceptor_opt_switch";
    private static final String NETWORK_IPV6_CELL_DETECT_SWITCH = "network_ipv6_cell_detect_switch";
    private static final String NETWORK_IPV6_DETECT_ENABLE_SWITCH = "network_ipv6_detect_enable_switch";
    private static final String NETWORK_IPV6_DETECT_OPT_SWITCH = "network_ipv6_detect_opt_switch";
    private static final String NETWORK_IPV6_GLOBAL_ENABLE_SWITCH = "network_ipv6_global_enable_swtich";
    private static final String NETWORK_IPV6_ONLY_ENABLE_SWITCH = "network_ipv6_only_enable_switch";
    private static final String NETWORK_IPV6_STACK_RECTIFICATION_ENABLE_SWITCH = "network_ipv6_rectification_enable_switch";
    private static final String NETWORK_IPV6_WIFI_DUAL_STACK_OPT_SWITCH = "network_ipv6_wifi_dual_stack_opt_switch";
    private static final String NETWORK_LAST_STATUS_NONE_SWITCH = "network_last_status_none_opt_switch";
    private static final String NETWORK_LAUNCH_OPT_SWITCH = "network_launsh_opt_switch";
    private static final String NETWORK_LAZY_LOAD_SECURITY_SWITCH = "network_lazy_load_security_switch";
    private static final String NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_SWITCH = "network_lazy_load_tnet_sec_time_switch";
    public static final String NETWORK_LONG_AMDC_WHITE_LIST_SWITCH = "network_long_amdc_white_list_switch";
    private static final String NETWORK_LONG_REQUEST_MONITOR_ENABLE_SWITCH = "network_long_request_monitor_enable_switch";
    private static final String NETWORK_LOW_POWER_ENABLE_SWITCH = "network_low_power_switch";
    public static final String NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_SWITCH = "network_lunch_after_amdc_white_list_switch";
    private static final String NETWORK_MD5_REFER_WHITE_LIST_SWITCH = "network_md5_refer_white_list_switch";
    private static final String NETWORK_MD5_SWITCH = "network_md5_switch";
    private static final String NETWORK_METRICS_TIME_KEY_SWITCH = "network_metrics_time_config_switch";
    private static final String NETWORK_MONITOR_REQUESTS = "network_monitor_requests";
    private static final String NETWORK_MPQUIC_ENABLE_SWITCH = "network_mpquic_enable_switch";
    public static final String NETWORK_MTOP_AMDC_WHITE_LIST_SWITCH = "network_mtop_amdc_white_list_switch";
    private static final String NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_SWITCH = "network_mtop_interceptor_host_white_list_switch";
    private static final String NETWORK_MTU_DETECT_ENABLE_SWITCH = "network_mtu_detect_enable_switch";
    private static final String NETWORK_MULTI_CONNECT_SWITCH = "network_multi_connect_switch";
    private static final String NETWORK_MULTI_CONNECT_WHITE_LIST_SWITCH = "network_multi_connect_white_list_switch";
    private static final String NETWORK_MULTI_PATH_AB_WHITE_LIST = "network_multi_path_ab_white_list";
    private static final String NETWORK_MULTI_PATH_BIZ_WHITE_LIST = "network_multi_path_biz_white_list";
    private static final String NETWORK_MULTI_PATH_HARMONY_WHITE_LIST = "network_multi_path_harmony_white_list";
    private static final String NETWORK_MULTI_PATH_MONITOR_ENABLE_SWITCH = "network_multi_path_monitor_enable_switch";
    private static final String NETWORK_MULTI_PATH_TOAST_TIRE_TIME = "network_multi_path_toast_tire_time";
    private static final String NETWORK_MULTI_PATH_TRIGGER_TIME = "network_multi_path_trigger_time";
    private static final String NETWORK_MULTI_PATH_URL_WHITE_LIST = "network_multi_path_url_white_list";
    private static final String NETWORK_MULTI_PATH_USER_TOAST_TEXT = "network_multi_path_user_toast_text";
    private static final String NETWORK_NAVIGATOR_TASK_GROUP = "network_navigator_task";
    private static final String NETWORK_NORMAL_THREAD_POOL_EXECUTOR_SIZE = "network_normal_thread_pool_executor_size";
    private static final String NETWORK_NOT_ALLOW_COOKIE_OPT_V2_SWITCH = "network_not_allow_cookie_opt_v2_switch";
    private static final String NETWORK_OKHTTP_HOST_WHITE_LIST = "network_okhttp_host_white_list";
    private static final String NETWORK_OKHTTP_PRE_BUILD_LIST = "network_okhttp_pre_build_list";
    private static final String NETWORK_OKHTTP_SWITCH = "network_okhttp_switch";
    private static final String NETWORK_ORANGE_OPT_ENABLE_SWITCH = "network_orange_opt_enable_switch";
    private static final String NETWORK_PARAMS_SWITCH = "network_params_switch";
    public static final String NETWORK_PRE_HOST_HTTP2_WHITE_LIST_SWITCH = "network_pre_host_HTTP2_white_list_switch";
    public static final String NETWORK_PRE_HOST_HTTP3_WHITE_LIST_SWITCH = "network_pre_host_HTTP3_white_list_switch";
    private static final String NETWORK_PRE_HOST_MCC_ENABLE_SWITCH = "network_pre_host_mcc_enable_switch";
    public static final String NETWORK_PRE_HOST_WHITE_LIST_SWITCH = "network_pre_host_white_list_switch";
    private static final String NETWORK_PRE_HOT_OPT_SWITCH = "network_pre_hot_opt_switch";
    private static final String NETWORK_PRE_SESSION_OPT_SWITCH = "network_pre_session_opt_switch";
    private static final String NETWORK_PRE_SESSION_WHITE_LIST_SWITCH = "network_pre_session_white_list_switch";
    private static final String NETWORK_PRIORITY_UPDATE_AMDC_SWITCH = "network_priority_update_amdc_switch";
    private static final String NETWORK_QOS_BIZ_WHITE_LIST = "network_qos_biz_white_list";
    private static final String NETWORK_QOS_HOST_WHITE_LIST = "network_qos_host_white_list";
    private static final String NETWORK_RANGE_BOOST_SWITCH = "network_range_boost_switch";
    private static final String NETWORK_REDUNDANT_SESSION_FIX_ENABLE = "network_redundant_session_fix_switch";
    private static final String NETWORK_REPEAT_THREAD_VIRTUAL_SWITCH = "network_repeat_thread_virtual_switch";
    private static final String NETWORK_REQUEST_FORBIDDEN_BG = "network_request_forbidden_bg";
    private static final String NETWORK_REQUEST_STATISTIC_SAMPLE_RATE = "network_request_statistic_sample_rate";
    private static final String NETWORK_REQ_FEC_SIZE_OPT_SWITCH = "network_req_fec_size_opt_enable_switch";
    public static final String NETWORK_REQ_FEC_SIZE_WHITE_LIST_SWITCH = "network_req_fec_size_white_list_switch";
    public static final String NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_SWITCH = "network_req_fec_up_size_white_list_switch";
    private static final String NETWORK_RESPONSE_BUFFER_SWITCH = "network_response_buffer_switch";
    private static final String NETWORK_RETRY_USE_LONG_LINK_SWITCH = "network_retry_use_long_link_enable_switch";
    private static final String NETWORK_RTT_DETECTOR_ENABLE_SWITCH = "network_rtt_detector_enable_switch";
    private static final String NETWORK_SAVE_POWER_TIME_SWITCH = "network_save_power_time_switch";
    private static final String NETWORK_SDK_GROUP = "networkSdk";
    private static final String NETWORK_SEND_CONNECT_INFO_BY_SERVICE = "network_send_connect_info_by_service";
    private static final String NETWORK_SESSION_PRESET_HOSTS = "network_session_preset_hosts";
    private static final String NETWORK_SESSION_WAIT_TIME = "network_session_wait_time";
    private static final String NETWORK_SMOOTH_RECONNECT_OPT_SWITCH = "network_smooth_reconnect_opt_switch";
    private static final String NETWORK_SMOOTH_RECONNECT_SWITCH = "network_smooth_reconnect_switch";
    private static final String NETWORK_SOCKET_BG_OPT_ENABLE_SWITCH = "network_socket_bg_opt_switch";
    private static final String NETWORK_SOCKET_BOOST_HOST_LIST = "network_socket_boost_host_list";
    private static final String NETWORK_SPDY_ENABLE_SWITCH = "network_spdy_enable_switch";
    private static final String NETWORK_SPDY_OFFLINE_SWITCH = "network_spdy_offline_switch";
    private static final String NETWORK_SSL_SP_OPT_SWITCH = "network_ssl_sp_opt_switch";
    private static final String NETWORK_START_IP_STACK_DETECT_ENABLE_SWITCH = "network_start_ip_stack_detect_switch";
    private static final String NETWORK_STATUS_OPT_SWITCH = "network_status_opt_switch";
    private static final String NETWORK_TNET_FORCE_PUBKEY_SWITCH = "network_tnet_force_pubkey_switch";
    private static final String NETWORK_TUNNEL_ENABLE_SWITCH = "network_tunnel_enable_switch";
    private static final String NETWORK_TUNNEL_OPT_ENABLE_SWITCH = "network_tunnel_opt_switch";
    private static final String NETWORK_UPDATE_AMDC_SWITCH = "network_update_amdc_switch";
    private static final String NETWORK_UPDATE_IP_STACK_SWITCH = "network_update_ip_stack_switch";
    private static final String NETWORK_UPLINK_COMPRESS_HOST_WHITE_LIST_SWITCH = "network_uplink_compress_host_white_list";
    private static final String NETWORK_UPLINK_COMPRESS_URL_WHITE_LIST_SWITCH = "network_uplink_compress_url_white_list";
    private static final String NETWORK_UPLINK_ENCODE_SWITCH = "network_uplink_encode_switch";
    private static final String NETWORK_URL_DEGRADE_LIST = "network_url_degrade_list";
    public static final String NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_SWITCH = "network_url_monitor_request_white_list_switch";
    private static final String NETWORK_URL_WHITE_LIST_BG = "network_url_white_list_bg";
    private static final String NETWORK_USE_CLIENT_IP_SWITCH = "network_use_client_ip_switch";
    private static final String NETWORK_VPN_CHANGE_DETECT_ENABLE_SWITCH = "network_vpn_change_detect_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_BIZID_WHITE_LIST_SWITCH = "network_vpn_fast_degrade_bizid_white_list_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_HOST_WHITE_LIST_SWITCH = "network_vpn_fast_degrade_host_white_list_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_SWITCH = "network_vpn_fast_degrade_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_TIME_SWITCH = "network_vpn_fast_degrade_time_switch";
    private static final String NETWORK_VPN_FG_CHANGE_COUNT_SWITCH = "network_vpn_fg_change_count_switch";
    private static final String NETWORK_VPN_IP_OPT_ENABLE_SWITCH = "network_vpn_ip_opt_enable_switch";
    private static final String NETWORK_VPN_LISTEN_ENABLE_SWITCH = "network_vpn_listen_switch";
    private static final String NETWORK_VPN_LISTEN_TIME_INTERVAL_SWITCH = "network_vpn_listen_time_interval_switch";
    private static final String NETWORK_VPN_OPT_ENABLE_SWITCH = "network_vpn_opt_switch";
    private static final String NETWORK_VPN_PROXY_SESSION_WHITE_LIST_SWITCH = "network_vpn_proxy_session_white_list_switch";
    private static final String NETWORK_WAIT_THREAD_COUNT_CONFIG_SWITCH = "network_wait_thread_count_config_switch";
    private static final String NETWORK_WIDGET_LOCAL_INSTANCE_ENABLE_SWITCH = "network_widget_local_instance_enable_switch";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_SWITCH = "network_wifi_fg_force_cell_config_list_switch";
    private static final String NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE_SWITCH = "network_wifi_fg_force_cell_opt_switch";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_SWITCH = "network_wifi_fg_force_cell_white_list_switch";
    private static final String NETWORK_XQUIC_CONG_CONTROL = "network_xquic_cong_control";
    private static final String NETWORK_XQUIC_REMOTE_SWITCH = "network_xquic_remote_switch";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_SWITCH = "network_zstd_dict_decompress_channel_switch";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_SWITCH = "network_zstd_dict_decompress_mtop_switch";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_SWITCH = "network_zstd_dict_decompress_switch";
    private static final String NETWORK_ZSTD_DICT_WHITE_LIST_SWITCH = "network_zstd_dict_decompress_white_list";
    private static final String NETWORK_ZSTD_STREAM_DECOMPRESS_SWITCH = "network_zstd_stream_decompress_switch";
    private static final String NETWOTK_BG_FORBID_REQUEST_THRESHOLD = "network_bg_forbid_request_threshold";
    private static final String TAG = "awcn.OrangeConfigImpl";
    private static boolean mOrangeValid;

    static {
        kge.a(1828545310);
        kge.a(1536307122);
        mOrangeValid = false;
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            mOrangeValid = true;
        } catch (Exception unused) {
            mOrangeValid = false;
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else if (!mOrangeValid) {
            ALog.w(TAG, "no orange sdk", null, new Object[0]);
        } else {
            try {
                OrangeConfig.getInstance().registerListener(new String[]{NETWORK_SDK_GROUP, "amdc", NETWORK_NAVIGATOR_TASK_GROUP}, new g() { // from class: anet.channel.config.OrangeConfigImpl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.orange.g
                    public void onConfigUpdate(String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        } else {
                            OrangeConfigImpl.this.onConfigUpdate(str);
                        }
                    }
                });
                getConfig(NETWORK_SDK_GROUP, NETWORK_EMPTY_SCHEME_HTTPS_SWITCH, "true");
                getConfig("amdc", AMDC_CONTROL_MODE, null);
            } catch (Exception e) {
                ALog.e(TAG, "register fail", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public void unRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a98eee3", new Object[]{this});
        } else if (!mOrangeValid) {
            ALog.w(TAG, "no orange sdk", null, new Object[0]);
        } else {
            OrangeConfig.getInstance().unregisterListener(new String[]{NETWORK_SDK_GROUP});
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public String getConfig(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81adcca0", new Object[]{this, strArr});
        }
        if (!mOrangeValid) {
            ALog.w(TAG, "no orange sdk", null, new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e) {
            ALog.e(TAG, "get config failed!", null, e, new Object[0]);
            return null;
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public void onConfigUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
            return;
        }
        ALog.i(TAG, "onConfigUpdate", null, "namespace", str);
        try {
            if (NETWORK_SDK_GROUP.equals(str)) {
                updateNetworkConfig(str);
            } else if ("amdc".equals(str)) {
                updateAmdcConfig(str);
            } else if (!NETWORK_NAVIGATOR_TASK_GROUP.equals(str)) {
            } else {
                updateNetworkDnsConfig(str);
            }
        } catch (Throwable th) {
            AppMonitor.getInstance().commitStat(new OrangeConfigStatistic(str, th.getCause().toString()));
            ALog.e(TAG, "onConfigUpdate error=" + th.toString(), null, "namespace", str);
        }
    }

    private void updateNetworkDnsConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7d5037", new Object[]{this, str});
            return;
        }
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config = getConfig(str, NETWORK_DNS_WHITE_LIST, null);
            if (!StringUtils.isEmpty(config)) {
                AwcnConfig.setDnsOptWhiteList(config);
                edit.putString(AwcnConfig.NETWORK_DNS_OPT_WHITE_LIST, config).apply();
                return;
            }
            edit.remove(AwcnConfig.NETWORK_DNS_OPT_WHITE_LIST).apply();
        } catch (Exception e) {
            ALog.e(TAG, "setDnsOptWhiteList fail", null, "e", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1002:0x24df A[Catch: Exception -> 0x24f8, TryCatch #3 {Exception -> 0x24f8, blocks: (B:1000:0x24bd, B:1002:0x24df, B:1003:0x24ed), top: B:1212:0x24bd }] */
    /* JADX WARN: Removed duplicated region for block: B:1003:0x24ed A[Catch: Exception -> 0x24f8, TRY_LEAVE, TryCatch #3 {Exception -> 0x24f8, blocks: (B:1000:0x24bd, B:1002:0x24df, B:1003:0x24ed), top: B:1212:0x24bd }] */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x2529 A[Catch: Exception -> 0x253e, TryCatch #175 {Exception -> 0x253e, blocks: (B:1007:0x2508, B:1009:0x2529, B:1010:0x2535), top: B:1504:0x2508 }] */
    /* JADX WARN: Removed duplicated region for block: B:1010:0x2535 A[Catch: Exception -> 0x253e, TRY_LEAVE, TryCatch #175 {Exception -> 0x253e, blocks: (B:1007:0x2508, B:1009:0x2529, B:1010:0x2535), top: B:1504:0x2508 }] */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x256f A[Catch: Exception -> 0x2586, TryCatch #135 {Exception -> 0x2586, blocks: (B:1014:0x254e, B:1016:0x256f, B:1017:0x257b), top: B:1434:0x254e }] */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x257b A[Catch: Exception -> 0x2586, TRY_LEAVE, TryCatch #135 {Exception -> 0x2586, blocks: (B:1014:0x254e, B:1016:0x256f, B:1017:0x257b), top: B:1434:0x254e }] */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x25ad A[Catch: Exception -> 0x25c6, TRY_LEAVE, TryCatch #89 {Exception -> 0x25c6, blocks: (B:1021:0x2597, B:1023:0x25ad), top: B:1358:0x2597 }] */
    /* JADX WARN: Removed duplicated region for block: B:1029:0x25fa A[Catch: Exception -> 0x2617, TryCatch #29 {Exception -> 0x2617, blocks: (B:1027:0x25d6, B:1029:0x25fa, B:1030:0x2609), top: B:1256:0x25d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x2609 A[Catch: Exception -> 0x2617, TRY_LEAVE, TryCatch #29 {Exception -> 0x2617, blocks: (B:1027:0x25d6, B:1029:0x25fa, B:1030:0x2609), top: B:1256:0x25d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:1036:0x263e A[Catch: Exception -> 0x264d, TRY_LEAVE, TryCatch #162 {Exception -> 0x264d, blocks: (B:1034:0x2628, B:1036:0x263e), top: B:1480:0x2628 }] */
    /* JADX WARN: Removed duplicated region for block: B:1042:0x2674 A[Catch: Exception -> 0x267b, TRY_LEAVE, TryCatch #131 {Exception -> 0x267b, blocks: (B:1040:0x265e, B:1042:0x2674), top: B:1426:0x265e }] */
    /* JADX WARN: Removed duplicated region for block: B:1048:0x26a2 A[Catch: Exception -> 0x26a9, TRY_LEAVE, TryCatch #55 {Exception -> 0x26a9, blocks: (B:1046:0x268c, B:1048:0x26a2), top: B:1297:0x268c }] */
    /* JADX WARN: Removed duplicated region for block: B:1054:0x26dc A[Catch: Exception -> 0x26fa, TryCatch #43 {Exception -> 0x26fa, blocks: (B:1052:0x26ba, B:1054:0x26dc, B:1056:0x26f3, B:1055:0x26ee), top: B:1277:0x26ba }] */
    /* JADX WARN: Removed duplicated region for block: B:1055:0x26ee A[Catch: Exception -> 0x26fa, TryCatch #43 {Exception -> 0x26fa, blocks: (B:1052:0x26ba, B:1054:0x26dc, B:1056:0x26f3, B:1055:0x26ee), top: B:1277:0x26ba }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037b A[Catch: Exception -> 0x0389, TRY_LEAVE, TryCatch #120 {Exception -> 0x0389, blocks: (B:103:0x0365, B:105:0x037b), top: B:1408:0x0365 }] */
    /* JADX WARN: Removed duplicated region for block: B:1062:0x2721 A[Catch: Exception -> 0x2730, TRY_LEAVE, TryCatch #141 {Exception -> 0x2730, blocks: (B:1060:0x270b, B:1062:0x2721), top: B:1443:0x270b }] */
    /* JADX WARN: Removed duplicated region for block: B:1068:0x2757 A[Catch: Exception -> 0x275e, TRY_LEAVE, TryCatch #110 {Exception -> 0x275e, blocks: (B:1066:0x2741, B:1068:0x2757), top: B:1390:0x2741 }] */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x2785 A[Catch: Exception -> 0x2794, TRY_LEAVE, TryCatch #124 {Exception -> 0x2794, blocks: (B:1072:0x276f, B:1074:0x2785), top: B:1414:0x276f }] */
    /* JADX WARN: Removed duplicated region for block: B:1080:0x27bb A[Catch: Exception -> 0x27c2, TRY_LEAVE, TryCatch #93 {Exception -> 0x27c2, blocks: (B:1078:0x27a5, B:1080:0x27bb), top: B:1364:0x27a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:1086:0x27f5 A[Catch: Exception -> 0x2815, TryCatch #31 {Exception -> 0x2815, blocks: (B:1084:0x27d3, B:1086:0x27f5, B:1088:0x280e, B:1087:0x2808), top: B:1258:0x27d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1087:0x2808 A[Catch: Exception -> 0x2815, TryCatch #31 {Exception -> 0x2815, blocks: (B:1084:0x27d3, B:1086:0x27f5, B:1088:0x280e, B:1087:0x2808), top: B:1258:0x27d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1094:0x283c A[Catch: Exception -> 0x284b, TRY_LEAVE, TryCatch #164 {Exception -> 0x284b, blocks: (B:1092:0x2826, B:1094:0x283c), top: B:1483:0x2826 }] */
    /* JADX WARN: Removed duplicated region for block: B:1100:0x287e A[Catch: Exception -> 0x289e, TryCatch #65 {Exception -> 0x289e, blocks: (B:1098:0x285c, B:1100:0x287e, B:1102:0x2897, B:1101:0x2891), top: B:1317:0x285c }] */
    /* JADX WARN: Removed duplicated region for block: B:1101:0x2891 A[Catch: Exception -> 0x289e, TryCatch #65 {Exception -> 0x289e, blocks: (B:1098:0x285c, B:1100:0x287e, B:1102:0x2897, B:1101:0x2891), top: B:1317:0x285c }] */
    /* JADX WARN: Removed duplicated region for block: B:1108:0x28d1 A[Catch: Exception -> 0x28f1, TryCatch #8 {Exception -> 0x28f1, blocks: (B:1106:0x28af, B:1108:0x28d1, B:1110:0x28ea, B:1109:0x28e4), top: B:1220:0x28af }] */
    /* JADX WARN: Removed duplicated region for block: B:1109:0x28e4 A[Catch: Exception -> 0x28f1, TryCatch #8 {Exception -> 0x28f1, blocks: (B:1106:0x28af, B:1108:0x28d1, B:1110:0x28ea, B:1109:0x28e4), top: B:1220:0x28af }] */
    /* JADX WARN: Removed duplicated region for block: B:1116:0x2924 A[Catch: Exception -> 0x2942, TryCatch #188 {Exception -> 0x2942, blocks: (B:1114:0x2902, B:1116:0x2924, B:1118:0x293d, B:1117:0x2937), top: B:1528:0x2902 }] */
    /* JADX WARN: Removed duplicated region for block: B:1117:0x2937 A[Catch: Exception -> 0x2942, TryCatch #188 {Exception -> 0x2942, blocks: (B:1114:0x2902, B:1116:0x2924, B:1118:0x293d, B:1117:0x2937), top: B:1528:0x2902 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b0 A[Catch: Exception -> 0x03b6, TRY_LEAVE, TryCatch #61 {Exception -> 0x03b6, blocks: (B:109:0x039a, B:111:0x03b0), top: B:1309:0x039a }] */
    /* JADX WARN: Removed duplicated region for block: B:1124:0x2976 A[Catch: Exception -> 0x2991, TryCatch #126 {Exception -> 0x2991, blocks: (B:1122:0x2952, B:1124:0x2976, B:1125:0x2985), top: B:1417:0x2952 }] */
    /* JADX WARN: Removed duplicated region for block: B:1125:0x2985 A[Catch: Exception -> 0x2991, TRY_LEAVE, TryCatch #126 {Exception -> 0x2991, blocks: (B:1122:0x2952, B:1124:0x2976, B:1125:0x2985), top: B:1417:0x2952 }] */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x29c2 A[Catch: Exception -> 0x29d9, TryCatch #16 {Exception -> 0x29d9, blocks: (B:1129:0x29a1, B:1131:0x29c2, B:1132:0x29ce), top: B:1235:0x29a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:1132:0x29ce A[Catch: Exception -> 0x29d9, TRY_LEAVE, TryCatch #16 {Exception -> 0x29d9, blocks: (B:1129:0x29a1, B:1131:0x29c2, B:1132:0x29ce), top: B:1235:0x29a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:1138:0x2a00 A[Catch: Exception -> 0x2a0f, TRY_LEAVE, TryCatch #23 {Exception -> 0x2a0f, blocks: (B:1136:0x29ea, B:1138:0x2a00), top: B:1246:0x29ea }] */
    /* JADX WARN: Removed duplicated region for block: B:1144:0x2a36 A[Catch: Exception -> 0x2a45, TRY_LEAVE, TryCatch #185 {Exception -> 0x2a45, blocks: (B:1142:0x2a20, B:1144:0x2a36), top: B:1522:0x2a20 }] */
    /* JADX WARN: Removed duplicated region for block: B:1150:0x2a6c A[Catch: Exception -> 0x2a79, TRY_LEAVE, TryCatch #133 {Exception -> 0x2a79, blocks: (B:1148:0x2a56, B:1150:0x2a6c), top: B:1430:0x2a56 }] */
    /* JADX WARN: Removed duplicated region for block: B:1156:0x2aaa A[Catch: Exception -> 0x2ac1, TryCatch #95 {Exception -> 0x2ac1, blocks: (B:1154:0x2a89, B:1156:0x2aaa, B:1157:0x2ab6), top: B:1367:0x2a89 }] */
    /* JADX WARN: Removed duplicated region for block: B:1157:0x2ab6 A[Catch: Exception -> 0x2ac1, TRY_LEAVE, TryCatch #95 {Exception -> 0x2ac1, blocks: (B:1154:0x2a89, B:1156:0x2aaa, B:1157:0x2ab6), top: B:1367:0x2a89 }] */
    /* JADX WARN: Removed duplicated region for block: B:1163:0x2ae8 A[Catch: Exception -> 0x2af7, TRY_LEAVE, TryCatch #4 {Exception -> 0x2af7, blocks: (B:1161:0x2ad2, B:1163:0x2ae8), top: B:1213:0x2ad2 }] */
    /* JADX WARN: Removed duplicated region for block: B:1169:0x2b1e A[Catch: Exception -> 0x2b2d, TRY_LEAVE, TryCatch #142 {Exception -> 0x2b2d, blocks: (B:1167:0x2b08, B:1169:0x2b1e), top: B:1445:0x2b08 }] */
    /* JADX WARN: Removed duplicated region for block: B:1175:0x2b54 A[Catch: Exception -> 0x2b59, TRY_LEAVE, TryCatch #112 {Exception -> 0x2b59, blocks: (B:1173:0x2b3e, B:1175:0x2b54), top: B:1394:0x2b3e }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03dd A[Catch: Exception -> 0x03e3, TRY_LEAVE, TryCatch #20 {Exception -> 0x03e3, blocks: (B:115:0x03c7, B:117:0x03dd), top: B:1240:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:1181:0x2b8a A[Catch: Exception -> 0x2ba1, TryCatch #75 {Exception -> 0x2ba1, blocks: (B:1179:0x2b69, B:1181:0x2b8a, B:1182:0x2b96), top: B:1335:0x2b69 }] */
    /* JADX WARN: Removed duplicated region for block: B:1182:0x2b96 A[Catch: Exception -> 0x2ba1, TRY_LEAVE, TryCatch #75 {Exception -> 0x2ba1, blocks: (B:1179:0x2b69, B:1181:0x2b8a, B:1182:0x2b96), top: B:1335:0x2b69 }] */
    /* JADX WARN: Removed duplicated region for block: B:1188:0x2bc8 A[Catch: Exception -> 0x2bd7, TRY_LEAVE, TryCatch #81 {Exception -> 0x2bd7, blocks: (B:1186:0x2bb2, B:1188:0x2bc8), top: B:1343:0x2bb2 }] */
    /* JADX WARN: Removed duplicated region for block: B:1194:0x2bfe A[Catch: Exception -> 0x2c0b, TRY_LEAVE, TryCatch #27 {Exception -> 0x2c0b, blocks: (B:1192:0x2be8, B:1194:0x2bfe), top: B:1253:0x2be8 }] */
    /* JADX WARN: Removed duplicated region for block: B:1200:0x2c3f A[Catch: Exception -> 0x2c5e, TryCatch #109 {Exception -> 0x2c5e, blocks: (B:1198:0x2c1b, B:1200:0x2c3f, B:1201:0x2c53), top: B:1389:0x2c1b }] */
    /* JADX WARN: Removed duplicated region for block: B:1201:0x2c53 A[Catch: Exception -> 0x2c5e, TRY_LEAVE, TryCatch #109 {Exception -> 0x2c5e, blocks: (B:1198:0x2c1b, B:1200:0x2c3f, B:1201:0x2c53), top: B:1389:0x2c1b }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x040a A[Catch: Exception -> 0x0410, TRY_LEAVE, TryCatch #22 {Exception -> 0x0410, blocks: (B:121:0x03f4, B:123:0x040a), top: B:1244:0x03f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0437 A[Catch: Exception -> 0x043d, TRY_LEAVE, TryCatch #179 {Exception -> 0x043d, blocks: (B:127:0x0421, B:129:0x0437), top: B:1511:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0464 A[Catch: Exception -> 0x0472, TRY_LEAVE, TryCatch #105 {Exception -> 0x0472, blocks: (B:133:0x044e, B:135:0x0464), top: B:1382:0x044e }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0499 A[Catch: Exception -> 0x04b8, TRY_LEAVE, TryCatch #58 {Exception -> 0x04b8, blocks: (B:139:0x0483, B:141:0x0499), top: B:1303:0x0483 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04df A[Catch: Exception -> 0x04fe, TRY_LEAVE, TryCatch #41 {Exception -> 0x04fe, blocks: (B:145:0x04c9, B:147:0x04df), top: B:1274:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0525 A[Catch: Exception -> 0x0533, TRY_LEAVE, TryCatch #148 {Exception -> 0x0533, blocks: (B:151:0x050f, B:153:0x0525), top: B:1455:0x050f }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x055a A[Catch: Exception -> 0x0568, TRY_LEAVE, TryCatch #114 {Exception -> 0x0568, blocks: (B:157:0x0544, B:159:0x055a), top: B:1398:0x0544 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x058f A[Catch: Exception -> 0x059d, TRY_LEAVE, TryCatch #66 {Exception -> 0x059d, blocks: (B:163:0x0579, B:165:0x058f), top: B:1319:0x0579 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05c4 A[Catch: Exception -> 0x05d2, TRY_LEAVE, TryCatch #84 {Exception -> 0x05d2, blocks: (B:169:0x05ae, B:171:0x05c4), top: B:1349:0x05ae }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05f9 A[Catch: Exception -> 0x0607, TRY_LEAVE, TryCatch #49 {Exception -> 0x0607, blocks: (B:175:0x05e3, B:177:0x05f9), top: B:1288:0x05e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x062e A[Catch: Exception -> 0x063c, TRY_LEAVE, TryCatch #180 {Exception -> 0x063c, blocks: (B:181:0x0618, B:183:0x062e), top: B:1513:0x0618 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0663 A[Catch: Exception -> 0x0671, TRY_LEAVE, TryCatch #106 {Exception -> 0x0671, blocks: (B:187:0x064d, B:189:0x0663), top: B:1384:0x064d }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0698 A[Catch: Exception -> 0x06a6, TRY_LEAVE, TryCatch #71 {Exception -> 0x06a6, blocks: (B:193:0x0682, B:195:0x0698), top: B:1328:0x0682 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06cd A[Catch: Exception -> 0x06db, TRY_LEAVE, TryCatch #15 {Exception -> 0x06db, blocks: (B:199:0x06b7, B:201:0x06cd), top: B:1233:0x06b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0702 A[Catch: Exception -> 0x0708, TRY_LEAVE, TryCatch #47 {Exception -> 0x0708, blocks: (B:205:0x06ec, B:207:0x0702), top: B:1284:0x06ec }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x072f A[Catch: Exception -> 0x073d, TRY_LEAVE, TryCatch #178 {Exception -> 0x073d, blocks: (B:211:0x0719, B:213:0x072f), top: B:1509:0x0719 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0764 A[Catch: Exception -> 0x0772, TRY_LEAVE, TryCatch #104 {Exception -> 0x0772, blocks: (B:217:0x074e, B:219:0x0764), top: B:1380:0x074e }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0799 A[Catch: Exception -> 0x07a7, TRY_LEAVE, TryCatch #70 {Exception -> 0x07a7, blocks: (B:223:0x0783, B:225:0x0799), top: B:1326:0x0783 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07ce A[Catch: Exception -> 0x07dc, TRY_LEAVE, TryCatch #13 {Exception -> 0x07dc, blocks: (B:229:0x07b8, B:231:0x07ce), top: B:1229:0x07b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0803 A[Catch: Exception -> 0x0811, TRY_LEAVE, TryCatch #38 {Exception -> 0x0811, blocks: (B:235:0x07ed, B:237:0x0803), top: B:1270:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0838 A[Catch: Exception -> 0x083e, TRY_LEAVE, TryCatch #176 {Exception -> 0x083e, blocks: (B:241:0x0822, B:243:0x0838), top: B:1505:0x0822 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0865 A[Catch: Exception -> 0x0873, TRY_LEAVE, TryCatch #103 {Exception -> 0x0873, blocks: (B:247:0x084f, B:249:0x0865), top: B:1378:0x084f }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x089a A[Catch: Exception -> 0x08a8, TRY_LEAVE, TryCatch #68 {Exception -> 0x08a8, blocks: (B:253:0x0884, B:255:0x089a), top: B:1323:0x0884 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x08cf A[Catch: Exception -> 0x08dd, TRY_LEAVE, TryCatch #12 {Exception -> 0x08dd, blocks: (B:259:0x08b9, B:261:0x08cf), top: B:1227:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0904 A[Catch: Exception -> 0x0912, TRY_LEAVE, TryCatch #36 {Exception -> 0x0912, blocks: (B:265:0x08ee, B:267:0x0904), top: B:1266:0x08ee }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0939 A[Catch: Exception -> 0x0947, TRY_LEAVE, TryCatch #184 {Exception -> 0x0947, blocks: (B:271:0x0923, B:273:0x0939), top: B:1520:0x0923 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x096e A[Catch: Exception -> 0x097c, TRY_LEAVE, TryCatch #130 {Exception -> 0x097c, blocks: (B:277:0x0958, B:279:0x096e), top: B:1424:0x0958 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x09a3 A[Catch: Exception -> 0x09b1, TRY_LEAVE, TryCatch #64 {Exception -> 0x09b1, blocks: (B:283:0x098d, B:285:0x09a3), top: B:1315:0x098d }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x09d8 A[Catch: Exception -> 0x09e6, TRY_LEAVE, TryCatch #17 {Exception -> 0x09e6, blocks: (B:289:0x09c2, B:291:0x09d8), top: B:1236:0x09c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a0d A[Catch: Exception -> 0x0a1b, TRY_LEAVE, TryCatch #152 {Exception -> 0x0a1b, blocks: (B:295:0x09f7, B:297:0x0a0d), top: B:1462:0x09f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a42 A[Catch: Exception -> 0x0a50, TRY_LEAVE, TryCatch #160 {Exception -> 0x0a50, blocks: (B:301:0x0a2c, B:303:0x0a42), top: B:1476:0x0a2c }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0a77 A[Catch: Exception -> 0x0a85, TRY_LEAVE, TryCatch #136 {Exception -> 0x0a85, blocks: (B:307:0x0a61, B:309:0x0a77), top: B:1435:0x0a61 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0aac A[Catch: Exception -> 0x0aba, TRY_LEAVE, TryCatch #88 {Exception -> 0x0aba, blocks: (B:313:0x0a96, B:315:0x0aac), top: B:1356:0x0a96 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0ae1 A[Catch: Exception -> 0x0aef, TRY_LEAVE, TryCatch #0 {Exception -> 0x0aef, blocks: (B:319:0x0acb, B:321:0x0ae1), top: B:1206:0x0acb }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0b1f A[Catch: Exception -> 0x0b35, TryCatch #146 {Exception -> 0x0b35, blocks: (B:325:0x0b00, B:328:0x0b09, B:330:0x0b1f, B:331:0x0b29), top: B:1453:0x0b00 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0b29 A[Catch: Exception -> 0x0b35, TRY_LEAVE, TryCatch #146 {Exception -> 0x0b35, blocks: (B:325:0x0b00, B:328:0x0b09, B:330:0x0b1f, B:331:0x0b29), top: B:1453:0x0b00 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b68 A[Catch: Exception -> 0x0b81, TryCatch #140 {Exception -> 0x0b81, blocks: (B:338:0x0b46, B:340:0x0b68, B:341:0x0b75), top: B:1442:0x0b46 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0b75 A[Catch: Exception -> 0x0b81, TRY_LEAVE, TryCatch #140 {Exception -> 0x0b81, blocks: (B:338:0x0b46, B:340:0x0b68, B:341:0x0b75), top: B:1442:0x0b46 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0ba8 A[Catch: Exception -> 0x0bb6, TRY_LEAVE, TryCatch #60 {Exception -> 0x0bb6, blocks: (B:345:0x0b92, B:347:0x0ba8), top: B:1307:0x0b92 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0be6 A[Catch: Exception -> 0x0bfc, TryCatch #42 {Exception -> 0x0bfc, blocks: (B:351:0x0bc7, B:354:0x0bd0, B:356:0x0be6, B:357:0x0bf0), top: B:1276:0x0bc7 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0bf0 A[Catch: Exception -> 0x0bfc, TRY_LEAVE, TryCatch #42 {Exception -> 0x0bfc, blocks: (B:351:0x0bc7, B:354:0x0bd0, B:356:0x0be6, B:357:0x0bf0), top: B:1276:0x0bc7 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c2f A[Catch: Exception -> 0x0c48, TryCatch #182 {Exception -> 0x0c48, blocks: (B:364:0x0c0d, B:366:0x0c2f, B:367:0x0c3c), top: B:1517:0x0c0d }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0c3c A[Catch: Exception -> 0x0c48, TRY_LEAVE, TryCatch #182 {Exception -> 0x0c48, blocks: (B:364:0x0c0d, B:366:0x0c2f, B:367:0x0c3c), top: B:1517:0x0c0d }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0c7b A[Catch: Exception -> 0x0c94, TryCatch #125 {Exception -> 0x0c94, blocks: (B:371:0x0c59, B:373:0x0c7b, B:374:0x0c88), top: B:1416:0x0c59 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0c88 A[Catch: Exception -> 0x0c94, TRY_LEAVE, TryCatch #125 {Exception -> 0x0c94, blocks: (B:371:0x0c59, B:373:0x0c7b, B:374:0x0c88), top: B:1416:0x0c59 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0cc7 A[Catch: Exception -> 0x0ce0, TryCatch #9 {Exception -> 0x0ce0, blocks: (B:378:0x0ca5, B:380:0x0cc7, B:381:0x0cd4), top: B:1222:0x0ca5 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0cd4 A[Catch: Exception -> 0x0ce0, TRY_LEAVE, TryCatch #9 {Exception -> 0x0ce0, blocks: (B:378:0x0ca5, B:380:0x0cc7, B:381:0x0cd4), top: B:1222:0x0ca5 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0d07 A[Catch: Exception -> 0x0d15, TRY_LEAVE, TryCatch #33 {Exception -> 0x0d15, blocks: (B:385:0x0cf1, B:387:0x0d07), top: B:1262:0x0cf1 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0d3c A[Catch: Exception -> 0x0d4a, TRY_LEAVE, TryCatch #166 {Exception -> 0x0d4a, blocks: (B:391:0x0d26, B:393:0x0d3c), top: B:1487:0x0d26 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0d71 A[Catch: Exception -> 0x0d7f, TRY_LEAVE, TryCatch #128 {Exception -> 0x0d7f, blocks: (B:397:0x0d5b, B:399:0x0d71), top: B:1420:0x0d5b }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0da6 A[Catch: Exception -> 0x0db4, TRY_LEAVE, TryCatch #62 {Exception -> 0x0db4, blocks: (B:403:0x0d90, B:405:0x0da6), top: B:1311:0x0d90 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0de7 A[Catch: Exception -> 0x0e00, TryCatch #39 {Exception -> 0x0e00, blocks: (B:409:0x0dc5, B:411:0x0de7, B:412:0x0df4), top: B:1272:0x0dc5 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0df4 A[Catch: Exception -> 0x0e00, TRY_LEAVE, TryCatch #39 {Exception -> 0x0e00, blocks: (B:409:0x0dc5, B:411:0x0de7, B:412:0x0df4), top: B:1272:0x0dc5 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0e33 A[Catch: Exception -> 0x0e4c, TryCatch #163 {Exception -> 0x0e4c, blocks: (B:416:0x0e11, B:418:0x0e33, B:419:0x0e40), top: B:1482:0x0e11 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0e40 A[Catch: Exception -> 0x0e4c, TRY_LEAVE, TryCatch #163 {Exception -> 0x0e4c, blocks: (B:416:0x0e11, B:418:0x0e33, B:419:0x0e40), top: B:1482:0x0e11 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0e7f A[Catch: Exception -> 0x0e98, TryCatch #121 {Exception -> 0x0e98, blocks: (B:423:0x0e5d, B:425:0x0e7f, B:426:0x0e8c), top: B:1410:0x0e5d }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0e8c A[Catch: Exception -> 0x0e98, TRY_LEAVE, TryCatch #121 {Exception -> 0x0e98, blocks: (B:423:0x0e5d, B:425:0x0e7f, B:426:0x0e8c), top: B:1410:0x0e5d }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0ecb A[Catch: Exception -> 0x0ee4, TryCatch #19 {Exception -> 0x0ee4, blocks: (B:430:0x0ea9, B:432:0x0ecb, B:433:0x0ed8), top: B:1239:0x0ea9 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0ed8 A[Catch: Exception -> 0x0ee4, TRY_LEAVE, TryCatch #19 {Exception -> 0x0ee4, blocks: (B:430:0x0ea9, B:432:0x0ecb, B:433:0x0ed8), top: B:1239:0x0ea9 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0f0b A[Catch: Exception -> 0x0f19, TRY_LEAVE, TryCatch #155 {Exception -> 0x0f19, blocks: (B:437:0x0ef5, B:439:0x0f0b), top: B:1466:0x0ef5 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0f40 A[Catch: Exception -> 0x0f4e, TRY_LEAVE, TryCatch #161 {Exception -> 0x0f4e, blocks: (B:443:0x0f2a, B:445:0x0f40), top: B:1478:0x0f2a }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0f75 A[Catch: Exception -> 0x0f83, TRY_LEAVE, TryCatch #137 {Exception -> 0x0f83, blocks: (B:449:0x0f5f, B:451:0x0f75), top: B:1437:0x0f5f }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0faa A[Catch: Exception -> 0x0fb8, TRY_LEAVE, TryCatch #57 {Exception -> 0x0fb8, blocks: (B:455:0x0f94, B:457:0x0faa), top: B:1301:0x0f94 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0fdf A[Catch: Exception -> 0x0fed, TRY_LEAVE, TryCatch #2 {Exception -> 0x0fed, blocks: (B:461:0x0fc9, B:463:0x0fdf), top: B:1210:0x0fc9 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1014 A[Catch: Exception -> 0x1022, TRY_LEAVE, TryCatch #159 {Exception -> 0x1022, blocks: (B:467:0x0ffe, B:469:0x1014), top: B:1474:0x0ffe }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x1049 A[Catch: Exception -> 0x1057, TRY_LEAVE, TryCatch #168 {Exception -> 0x1057, blocks: (B:473:0x1033, B:475:0x1049), top: B:1491:0x1033 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x107e A[Catch: Exception -> 0x108c, TRY_LEAVE, TryCatch #118 {Exception -> 0x108c, blocks: (B:479:0x1068, B:481:0x107e), top: B:1404:0x1068 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x10b3 A[Catch: Exception -> 0x10c1, TRY_LEAVE, TryCatch #96 {Exception -> 0x10c1, blocks: (B:485:0x109d, B:487:0x10b3), top: B:1368:0x109d }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x10e8 A[Catch: Exception -> 0x10f6, TRY_LEAVE, TryCatch #5 {Exception -> 0x10f6, blocks: (B:491:0x10d2, B:493:0x10e8), top: B:1215:0x10d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x1129 A[Catch: Exception -> 0x1142, TryCatch #189 {Exception -> 0x1142, blocks: (B:497:0x1107, B:499:0x1129, B:500:0x1136), top: B:1530:0x1107 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1136 A[Catch: Exception -> 0x1142, TRY_LEAVE, TryCatch #189 {Exception -> 0x1142, blocks: (B:497:0x1107, B:499:0x1129, B:500:0x1136), top: B:1530:0x1107 }] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x1175 A[Catch: Exception -> 0x118e, TryCatch #117 {Exception -> 0x118e, blocks: (B:504:0x1153, B:506:0x1175, B:507:0x1182), top: B:1403:0x1153 }] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x1182 A[Catch: Exception -> 0x118e, TRY_LEAVE, TryCatch #117 {Exception -> 0x118e, blocks: (B:504:0x1153, B:506:0x1175, B:507:0x1182), top: B:1403:0x1153 }] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x11b5 A[Catch: Exception -> 0x11c3, TRY_LEAVE, TryCatch #92 {Exception -> 0x11c3, blocks: (B:511:0x119f, B:513:0x11b5), top: B:1362:0x119f }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x11f6 A[Catch: Exception -> 0x120f, TryCatch #25 {Exception -> 0x120f, blocks: (B:517:0x11d4, B:519:0x11f6, B:520:0x1203), top: B:1250:0x11d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x1203 A[Catch: Exception -> 0x120f, TRY_LEAVE, TryCatch #25 {Exception -> 0x120f, blocks: (B:517:0x11d4, B:519:0x11f6, B:520:0x1203), top: B:1250:0x11d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x1236 A[Catch: Exception -> 0x1244, TRY_LEAVE, TryCatch #187 {Exception -> 0x1244, blocks: (B:524:0x1220, B:526:0x1236), top: B:1526:0x1220 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x126b A[Catch: Exception -> 0x1279, TRY_LEAVE, TryCatch #134 {Exception -> 0x1279, blocks: (B:530:0x1255, B:532:0x126b), top: B:1432:0x1255 }] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x12ac A[Catch: Exception -> 0x12c9, TryCatch #80 {Exception -> 0x12c9, blocks: (B:536:0x128a, B:538:0x12ac, B:539:0x12bd), top: B:1342:0x128a }] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x12bd A[Catch: Exception -> 0x12c9, TRY_LEAVE, TryCatch #80 {Exception -> 0x12c9, blocks: (B:536:0x128a, B:538:0x12ac, B:539:0x12bd), top: B:1342:0x128a }] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x12fc A[Catch: Exception -> 0x131a, TryCatch #154 {Exception -> 0x131a, blocks: (B:543:0x12da, B:545:0x12fc, B:546:0x130e), top: B:1465:0x12da }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x130e A[Catch: Exception -> 0x131a, TRY_LEAVE, TryCatch #154 {Exception -> 0x131a, blocks: (B:543:0x12da, B:545:0x12fc, B:546:0x130e), top: B:1465:0x12da }] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x134d A[Catch: Exception -> 0x136a, TryCatch #99 {Exception -> 0x136a, blocks: (B:550:0x132b, B:552:0x134d, B:553:0x135e), top: B:1373:0x132b }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x135e A[Catch: Exception -> 0x136a, TRY_LEAVE, TryCatch #99 {Exception -> 0x136a, blocks: (B:550:0x132b, B:552:0x134d, B:553:0x135e), top: B:1373:0x132b }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x13a0 A[Catch: Exception -> 0x13c2, TryCatch #94 {Exception -> 0x13c2, blocks: (B:557:0x137e, B:559:0x13a0, B:560:0x13b6), top: B:1366:0x137e }] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x13b6 A[Catch: Exception -> 0x13c2, TRY_LEAVE, TryCatch #94 {Exception -> 0x13c2, blocks: (B:557:0x137e, B:559:0x13a0, B:560:0x13b6), top: B:1366:0x137e }] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x13f5 A[Catch: Exception -> 0x1414, TryCatch #34 {Exception -> 0x1414, blocks: (B:564:0x13d3, B:566:0x13f5, B:567:0x1408), top: B:1264:0x13d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:567:0x1408 A[Catch: Exception -> 0x1414, TRY_LEAVE, TryCatch #34 {Exception -> 0x1414, blocks: (B:564:0x13d3, B:566:0x13f5, B:567:0x1408), top: B:1264:0x13d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x143b A[Catch: Exception -> 0x1449, TRY_LEAVE, TryCatch #167 {Exception -> 0x1449, blocks: (B:571:0x1425, B:573:0x143b), top: B:1489:0x1425 }] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x147c A[Catch: Exception -> 0x1497, TryCatch #123 {Exception -> 0x1497, blocks: (B:577:0x145a, B:579:0x147c, B:580:0x148a), top: B:1413:0x145a }] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x148a A[Catch: Exception -> 0x1497, TRY_LEAVE, TryCatch #123 {Exception -> 0x1497, blocks: (B:577:0x145a, B:579:0x147c, B:580:0x148a), top: B:1413:0x145a }] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x14ca A[Catch: Exception -> 0x14e5, TryCatch #18 {Exception -> 0x14e5, blocks: (B:584:0x14a8, B:586:0x14ca, B:587:0x14d8), top: B:1238:0x14a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x14d8 A[Catch: Exception -> 0x14e5, TRY_LEAVE, TryCatch #18 {Exception -> 0x14e5, blocks: (B:584:0x14a8, B:586:0x14ca, B:587:0x14d8), top: B:1238:0x14a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x1518 A[Catch: Exception -> 0x1533, TryCatch #147 {Exception -> 0x1533, blocks: (B:591:0x14f6, B:593:0x1518, B:594:0x1526), top: B:1454:0x14f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:594:0x1526 A[Catch: Exception -> 0x1533, TRY_LEAVE, TryCatch #147 {Exception -> 0x1533, blocks: (B:591:0x14f6, B:593:0x1518, B:594:0x1526), top: B:1454:0x14f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:600:0x1566 A[Catch: Exception -> 0x1581, TryCatch #139 {Exception -> 0x1581, blocks: (B:598:0x1544, B:600:0x1566, B:601:0x1574), top: B:1441:0x1544 }] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1574 A[Catch: Exception -> 0x1581, TRY_LEAVE, TryCatch #139 {Exception -> 0x1581, blocks: (B:598:0x1544, B:600:0x1566, B:601:0x1574), top: B:1441:0x1544 }] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x15b4 A[Catch: Exception -> 0x15cf, TryCatch #76 {Exception -> 0x15cf, blocks: (B:605:0x1592, B:607:0x15b4, B:608:0x15c2), top: B:1336:0x1592 }] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x15c2 A[Catch: Exception -> 0x15cf, TRY_LEAVE, TryCatch #76 {Exception -> 0x15cf, blocks: (B:605:0x1592, B:607:0x15b4, B:608:0x15c2), top: B:1336:0x1592 }] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x1602 A[Catch: Exception -> 0x161d, TryCatch #150 {Exception -> 0x161d, blocks: (B:612:0x15e0, B:614:0x1602, B:615:0x1610), top: B:1459:0x15e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:615:0x1610 A[Catch: Exception -> 0x161d, TRY_LEAVE, TryCatch #150 {Exception -> 0x161d, blocks: (B:612:0x15e0, B:614:0x1602, B:615:0x1610), top: B:1459:0x15e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x1644 A[Catch: Exception -> 0x1653, TRY_LEAVE, TryCatch #173 {Exception -> 0x1653, blocks: (B:619:0x162e, B:621:0x1644), top: B:1500:0x162e }] */
    /* JADX WARN: Removed duplicated region for block: B:627:0x167a A[Catch: Exception -> 0x1689, TRY_LEAVE, TryCatch #119 {Exception -> 0x1689, blocks: (B:625:0x1664, B:627:0x167a), top: B:1406:0x1664 }] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x16b0 A[Catch: Exception -> 0x16bf, TRY_LEAVE, TryCatch #86 {Exception -> 0x16bf, blocks: (B:631:0x169a, B:633:0x16b0), top: B:1353:0x169a }] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x16e6 A[Catch: Exception -> 0x16f5, TRY_LEAVE, TryCatch #7 {Exception -> 0x16f5, blocks: (B:637:0x16d0, B:639:0x16e6), top: B:1218:0x16d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x171c A[Catch: Exception -> 0x172b, TRY_LEAVE, TryCatch #144 {Exception -> 0x172b, blocks: (B:643:0x1706, B:645:0x171c), top: B:1449:0x1706 }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x1752 A[Catch: Exception -> 0x1761, TRY_LEAVE, TryCatch #116 {Exception -> 0x1761, blocks: (B:649:0x173c, B:651:0x1752), top: B:1401:0x173c }] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x1788 A[Catch: Exception -> 0x1797, TRY_LEAVE, TryCatch #122 {Exception -> 0x1797, blocks: (B:655:0x1772, B:657:0x1788), top: B:1411:0x1772 }] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x17be A[Catch: Exception -> 0x17cd, TRY_LEAVE, TryCatch #77 {Exception -> 0x17cd, blocks: (B:661:0x17a8, B:663:0x17be), top: B:1337:0x17a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x17f4 A[Catch: Exception -> 0x1803, TRY_LEAVE, TryCatch #50 {Exception -> 0x1803, blocks: (B:667:0x17de, B:669:0x17f4), top: B:1290:0x17de }] */
    /* JADX WARN: Removed duplicated region for block: B:675:0x182a A[Catch: Exception -> 0x1839, TRY_LEAVE, TryCatch #181 {Exception -> 0x1839, blocks: (B:673:0x1814, B:675:0x182a), top: B:1515:0x1814 }] */
    /* JADX WARN: Removed duplicated region for block: B:681:0x1860 A[Catch: Exception -> 0x186f, TRY_LEAVE, TryCatch #98 {Exception -> 0x186f, blocks: (B:679:0x184a, B:681:0x1860), top: B:1371:0x184a }] */
    /* JADX WARN: Removed duplicated region for block: B:687:0x1896 A[Catch: Exception -> 0x18a5, TRY_LEAVE, TryCatch #73 {Exception -> 0x18a5, blocks: (B:685:0x1880, B:687:0x1896), top: B:1332:0x1880 }] */
    /* JADX WARN: Removed duplicated region for block: B:693:0x18cc A[Catch: Exception -> 0x18db, TRY_LEAVE, TryCatch #14 {Exception -> 0x18db, blocks: (B:691:0x18b6, B:693:0x18cc), top: B:1231:0x18b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:699:0x1902 A[Catch: Exception -> 0x1911, TRY_LEAVE, TryCatch #37 {Exception -> 0x1911, blocks: (B:697:0x18ec, B:699:0x1902), top: B:1268:0x18ec }] */
    /* JADX WARN: Removed duplicated region for block: B:705:0x1938 A[Catch: Exception -> 0x1947, TRY_LEAVE, TryCatch #183 {Exception -> 0x1947, blocks: (B:703:0x1922, B:705:0x1938), top: B:1518:0x1922 }] */
    /* JADX WARN: Removed duplicated region for block: B:711:0x196e A[Catch: Exception -> 0x197d, TRY_LEAVE, TryCatch #129 {Exception -> 0x197d, blocks: (B:709:0x1958, B:711:0x196e), top: B:1422:0x1958 }] */
    /* JADX WARN: Removed duplicated region for block: B:717:0x19a4 A[Catch: Exception -> 0x19b3, TRY_LEAVE, TryCatch #63 {Exception -> 0x19b3, blocks: (B:715:0x198e, B:717:0x19a4), top: B:1313:0x198e }] */
    /* JADX WARN: Removed duplicated region for block: B:723:0x19da A[Catch: Exception -> 0x19e1, TRY_LEAVE, TryCatch #21 {Exception -> 0x19e1, blocks: (B:721:0x19c4, B:723:0x19da), top: B:1242:0x19c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:729:0x1a08 A[Catch: Exception -> 0x1a0f, TRY_LEAVE, TryCatch #24 {Exception -> 0x1a0f, blocks: (B:727:0x19f2, B:729:0x1a08), top: B:1248:0x19f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:735:0x1a36 A[Catch: Exception -> 0x1a45, TRY_LEAVE, TryCatch #186 {Exception -> 0x1a45, blocks: (B:733:0x1a20, B:735:0x1a36), top: B:1524:0x1a20 }] */
    /* JADX WARN: Removed duplicated region for block: B:741:0x1a6c A[Catch: Exception -> 0x1a7b, TRY_LEAVE, TryCatch #132 {Exception -> 0x1a7b, blocks: (B:739:0x1a56, B:741:0x1a6c), top: B:1428:0x1a56 }] */
    /* JADX WARN: Removed duplicated region for block: B:747:0x1aae A[Catch: Exception -> 0x1ac9, TryCatch #79 {Exception -> 0x1ac9, blocks: (B:745:0x1a8c, B:747:0x1aae, B:748:0x1abc), top: B:1341:0x1a8c }] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x1abc A[Catch: Exception -> 0x1ac9, TRY_LEAVE, TryCatch #79 {Exception -> 0x1ac9, blocks: (B:745:0x1a8c, B:747:0x1aae, B:748:0x1abc), top: B:1341:0x1a8c }] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x1afc A[Catch: Exception -> 0x1b17, TryCatch #30 {Exception -> 0x1b17, blocks: (B:752:0x1ada, B:754:0x1afc, B:755:0x1b0a), top: B:1257:0x1ada }] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x1b0a A[Catch: Exception -> 0x1b17, TRY_LEAVE, TryCatch #30 {Exception -> 0x1b17, blocks: (B:752:0x1ada, B:754:0x1afc, B:755:0x1b0a), top: B:1257:0x1ada }] */
    /* JADX WARN: Removed duplicated region for block: B:761:0x1b4a A[Catch: Exception -> 0x1b65, TryCatch #115 {Exception -> 0x1b65, blocks: (B:759:0x1b28, B:761:0x1b4a, B:762:0x1b58), top: B:1400:0x1b28 }] */
    /* JADX WARN: Removed duplicated region for block: B:762:0x1b58 A[Catch: Exception -> 0x1b65, TRY_LEAVE, TryCatch #115 {Exception -> 0x1b65, blocks: (B:759:0x1b28, B:761:0x1b4a, B:762:0x1b58), top: B:1400:0x1b28 }] */
    /* JADX WARN: Removed duplicated region for block: B:768:0x1b8c A[Catch: Exception -> 0x1b9b, TRY_LEAVE, TryCatch #67 {Exception -> 0x1b9b, blocks: (B:766:0x1b76, B:768:0x1b8c), top: B:1321:0x1b76 }] */
    /* JADX WARN: Removed duplicated region for block: B:774:0x1bc2 A[Catch: Exception -> 0x1bd1, TRY_LEAVE, TryCatch #85 {Exception -> 0x1bd1, blocks: (B:772:0x1bac, B:774:0x1bc2), top: B:1351:0x1bac }] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x1bf8 A[Catch: Exception -> 0x1c07, TRY_LEAVE, TryCatch #48 {Exception -> 0x1c07, blocks: (B:778:0x1be2, B:780:0x1bf8), top: B:1286:0x1be2 }] */
    /* JADX WARN: Removed duplicated region for block: B:786:0x1c2e A[Catch: Exception -> 0x1c3d, TRY_LEAVE, TryCatch #177 {Exception -> 0x1c3d, blocks: (B:784:0x1c18, B:786:0x1c2e), top: B:1507:0x1c18 }] */
    /* JADX WARN: Removed duplicated region for block: B:792:0x1c64 A[Catch: Exception -> 0x1c73, TRY_LEAVE, TryCatch #102 {Exception -> 0x1c73, blocks: (B:790:0x1c4e, B:792:0x1c64), top: B:1376:0x1c4e }] */
    /* JADX WARN: Removed duplicated region for block: B:798:0x1c9a A[Catch: Exception -> 0x1ca9, TRY_LEAVE, TryCatch #56 {Exception -> 0x1ca9, blocks: (B:796:0x1c84, B:798:0x1c9a), top: B:1299:0x1c84 }] */
    /* JADX WARN: Removed duplicated region for block: B:804:0x1cd0 A[Catch: Exception -> 0x1cdf, TRY_LEAVE, TryCatch #10 {Exception -> 0x1cdf, blocks: (B:802:0x1cba, B:804:0x1cd0), top: B:1223:0x1cba }] */
    /* JADX WARN: Removed duplicated region for block: B:810:0x1d06 A[Catch: Exception -> 0x1d15, TRY_LEAVE, TryCatch #32 {Exception -> 0x1d15, blocks: (B:808:0x1cf0, B:810:0x1d06), top: B:1260:0x1cf0 }] */
    /* JADX WARN: Removed duplicated region for block: B:816:0x1d3c A[Catch: Exception -> 0x1d4b, TRY_LEAVE, TryCatch #165 {Exception -> 0x1d4b, blocks: (B:814:0x1d26, B:816:0x1d3c), top: B:1485:0x1d26 }] */
    /* JADX WARN: Removed duplicated region for block: B:822:0x1d72 A[Catch: Exception -> 0x1d81, TRY_LEAVE, TryCatch #138 {Exception -> 0x1d81, blocks: (B:820:0x1d5c, B:822:0x1d72), top: B:1439:0x1d5c }] */
    /* JADX WARN: Removed duplicated region for block: B:828:0x1da8 A[Catch: Exception -> 0x1db7, TRY_LEAVE, TryCatch #59 {Exception -> 0x1db7, blocks: (B:826:0x1d92, B:828:0x1da8), top: B:1305:0x1d92 }] */
    /* JADX WARN: Removed duplicated region for block: B:834:0x1dde A[Catch: Exception -> 0x1ded, TRY_LEAVE, TryCatch #1 {Exception -> 0x1ded, blocks: (B:832:0x1dc8, B:834:0x1dde), top: B:1208:0x1dc8 }] */
    /* JADX WARN: Removed duplicated region for block: B:840:0x1e14 A[Catch: Exception -> 0x1e23, TRY_LEAVE, TryCatch #158 {Exception -> 0x1e23, blocks: (B:838:0x1dfe, B:840:0x1e14), top: B:1472:0x1dfe }] */
    /* JADX WARN: Removed duplicated region for block: B:846:0x1e4a A[Catch: Exception -> 0x1e59, TRY_LEAVE, TryCatch #113 {Exception -> 0x1e59, blocks: (B:844:0x1e34, B:846:0x1e4a), top: B:1396:0x1e34 }] */
    /* JADX WARN: Removed duplicated region for block: B:852:0x1e8c A[Catch: Exception -> 0x1ea7, TryCatch #69 {Exception -> 0x1ea7, blocks: (B:850:0x1e6a, B:852:0x1e8c, B:853:0x1e9a), top: B:1325:0x1e6a }] */
    /* JADX WARN: Removed duplicated region for block: B:853:0x1e9a A[Catch: Exception -> 0x1ea7, TRY_LEAVE, TryCatch #69 {Exception -> 0x1ea7, blocks: (B:850:0x1e6a, B:852:0x1e8c, B:853:0x1e9a), top: B:1325:0x1e6a }] */
    /* JADX WARN: Removed duplicated region for block: B:859:0x1eda A[Catch: Exception -> 0x1ef5, TryCatch #6 {Exception -> 0x1ef5, blocks: (B:857:0x1eb8, B:859:0x1eda, B:860:0x1ee8), top: B:1217:0x1eb8 }] */
    /* JADX WARN: Removed duplicated region for block: B:860:0x1ee8 A[Catch: Exception -> 0x1ef5, TRY_LEAVE, TryCatch #6 {Exception -> 0x1ef5, blocks: (B:857:0x1eb8, B:859:0x1eda, B:860:0x1ee8), top: B:1217:0x1eb8 }] */
    /* JADX WARN: Removed duplicated region for block: B:866:0x1f1c A[Catch: Exception -> 0x1f29, TRY_LEAVE, TryCatch #145 {Exception -> 0x1f29, blocks: (B:864:0x1f06, B:866:0x1f1c), top: B:1451:0x1f06 }] */
    /* JADX WARN: Removed duplicated region for block: B:872:0x1f5d A[Catch: Exception -> 0x1f76, TryCatch #101 {Exception -> 0x1f76, blocks: (B:870:0x1f39, B:872:0x1f5d, B:873:0x1f6b), top: B:1375:0x1f39 }] */
    /* JADX WARN: Removed duplicated region for block: B:873:0x1f6b A[Catch: Exception -> 0x1f76, TRY_LEAVE, TryCatch #101 {Exception -> 0x1f76, blocks: (B:870:0x1f39, B:872:0x1f5d, B:873:0x1f6b), top: B:1375:0x1f39 }] */
    /* JADX WARN: Removed duplicated region for block: B:879:0x1faa A[Catch: Exception -> 0x1fc5, TryCatch #90 {Exception -> 0x1fc5, blocks: (B:877:0x1f86, B:879:0x1faa, B:880:0x1fb9), top: B:1360:0x1f86 }] */
    /* JADX WARN: Removed duplicated region for block: B:880:0x1fb9 A[Catch: Exception -> 0x1fc5, TRY_LEAVE, TryCatch #90 {Exception -> 0x1fc5, blocks: (B:877:0x1f86, B:879:0x1faa, B:880:0x1fb9), top: B:1360:0x1f86 }] */
    /* JADX WARN: Removed duplicated region for block: B:886:0x1ff9 A[Catch: Exception -> 0x201a, TryCatch #153 {Exception -> 0x201a, blocks: (B:884:0x1fd5, B:886:0x1ff9, B:887:0x200f), top: B:1464:0x1fd5 }] */
    /* JADX WARN: Removed duplicated region for block: B:887:0x200f A[Catch: Exception -> 0x201a, TRY_LEAVE, TryCatch #153 {Exception -> 0x201a, blocks: (B:884:0x1fd5, B:886:0x1ff9, B:887:0x200f), top: B:1464:0x1fd5 }] */
    /* JADX WARN: Removed duplicated region for block: B:893:0x204e A[Catch: Exception -> 0x206f, TryCatch #97 {Exception -> 0x206f, blocks: (B:891:0x202a, B:893:0x204e, B:894:0x2064), top: B:1370:0x202a }] */
    /* JADX WARN: Removed duplicated region for block: B:894:0x2064 A[Catch: Exception -> 0x206f, TRY_LEAVE, TryCatch #97 {Exception -> 0x206f, blocks: (B:891:0x202a, B:893:0x204e, B:894:0x2064), top: B:1370:0x202a }] */
    /* JADX WARN: Removed duplicated region for block: B:900:0x20a3 A[Catch: Exception -> 0x20bc, TryCatch #87 {Exception -> 0x20bc, blocks: (B:898:0x207f, B:900:0x20a3, B:901:0x20b1), top: B:1355:0x207f }] */
    /* JADX WARN: Removed duplicated region for block: B:901:0x20b1 A[Catch: Exception -> 0x20bc, TRY_LEAVE, TryCatch #87 {Exception -> 0x20bc, blocks: (B:898:0x207f, B:900:0x20a3, B:901:0x20b1), top: B:1355:0x207f }] */
    /* JADX WARN: Removed duplicated region for block: B:907:0x20f0 A[Catch: Exception -> 0x2109, TryCatch #28 {Exception -> 0x2109, blocks: (B:905:0x20cc, B:907:0x20f0, B:908:0x20fe), top: B:1255:0x20cc }] */
    /* JADX WARN: Removed duplicated region for block: B:908:0x20fe A[Catch: Exception -> 0x2109, TRY_LEAVE, TryCatch #28 {Exception -> 0x2109, blocks: (B:905:0x20cc, B:907:0x20f0, B:908:0x20fe), top: B:1255:0x20cc }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fd A[Catch: Exception -> 0x031c, TRY_LEAVE, TryCatch #151 {Exception -> 0x031c, blocks: (B:88:0x02e7, B:90:0x02fd), top: B:1460:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:914:0x213d A[Catch: Exception -> 0x2156, TryCatch #169 {Exception -> 0x2156, blocks: (B:912:0x2119, B:914:0x213d, B:915:0x214b), top: B:1493:0x2119 }] */
    /* JADX WARN: Removed duplicated region for block: B:915:0x214b A[Catch: Exception -> 0x2156, TRY_LEAVE, TryCatch #169 {Exception -> 0x2156, blocks: (B:912:0x2119, B:914:0x213d, B:915:0x214b), top: B:1493:0x2119 }] */
    /* JADX WARN: Removed duplicated region for block: B:921:0x218a A[Catch: Exception -> 0x21ad, TryCatch #52 {Exception -> 0x21ad, blocks: (B:919:0x2166, B:921:0x218a, B:922:0x21a1), top: B:1294:0x2166 }] */
    /* JADX WARN: Removed duplicated region for block: B:922:0x21a1 A[Catch: Exception -> 0x21ad, TRY_LEAVE, TryCatch #52 {Exception -> 0x21ad, blocks: (B:919:0x2166, B:921:0x218a, B:922:0x21a1), top: B:1294:0x2166 }] */
    /* JADX WARN: Removed duplicated region for block: B:928:0x21e1 A[Catch: Exception -> 0x21fe, TryCatch #40 {Exception -> 0x21fe, blocks: (B:926:0x21bd, B:928:0x21e1, B:929:0x21f0), top: B:1273:0x21bd }] */
    /* JADX WARN: Removed duplicated region for block: B:929:0x21f0 A[Catch: Exception -> 0x21fe, TRY_LEAVE, TryCatch #40 {Exception -> 0x21fe, blocks: (B:926:0x21bd, B:928:0x21e1, B:929:0x21f0), top: B:1273:0x21bd }] */
    /* JADX WARN: Removed duplicated region for block: B:935:0x2225 A[Catch: Exception -> 0x222c, TRY_LEAVE, TryCatch #143 {Exception -> 0x222c, blocks: (B:933:0x220f, B:935:0x2225), top: B:1447:0x220f }] */
    /* JADX WARN: Removed duplicated region for block: B:941:0x2253 A[Catch: Exception -> 0x225e, TRY_LEAVE, TryCatch #111 {Exception -> 0x225e, blocks: (B:939:0x223d, B:941:0x2253), top: B:1392:0x223d }] */
    /* JADX WARN: Removed duplicated region for block: B:947:0x2291 A[Catch: Exception -> 0x22ac, TryCatch #54 {Exception -> 0x22ac, blocks: (B:945:0x226f, B:947:0x2291, B:948:0x229f), top: B:1296:0x226f }] */
    /* JADX WARN: Removed duplicated region for block: B:948:0x229f A[Catch: Exception -> 0x22ac, TRY_LEAVE, TryCatch #54 {Exception -> 0x22ac, blocks: (B:945:0x226f, B:947:0x2291, B:948:0x229f), top: B:1296:0x226f }] */
    /* JADX WARN: Removed duplicated region for block: B:954:0x22df A[Catch: Exception -> 0x22fa, TryCatch #44 {Exception -> 0x22fa, blocks: (B:952:0x22bd, B:954:0x22df, B:955:0x22ed), top: B:1279:0x22bd }] */
    /* JADX WARN: Removed duplicated region for block: B:955:0x22ed A[Catch: Exception -> 0x22fa, TRY_LEAVE, TryCatch #44 {Exception -> 0x22fa, blocks: (B:952:0x22bd, B:954:0x22df, B:955:0x22ed), top: B:1279:0x22bd }] */
    /* JADX WARN: Removed duplicated region for block: B:961:0x2321 A[Catch: Exception -> 0x2328, TRY_LEAVE, TryCatch #156 {Exception -> 0x2328, blocks: (B:959:0x230b, B:961:0x2321), top: B:1468:0x230b }] */
    /* JADX WARN: Removed duplicated region for block: B:967:0x235b A[Catch: Exception -> 0x2376, TryCatch #100 {Exception -> 0x2376, blocks: (B:965:0x2339, B:967:0x235b, B:968:0x2369), top: B:1374:0x2339 }] */
    /* JADX WARN: Removed duplicated region for block: B:968:0x2369 A[Catch: Exception -> 0x2376, TRY_LEAVE, TryCatch #100 {Exception -> 0x2376, blocks: (B:965:0x2339, B:967:0x235b, B:968:0x2369), top: B:1374:0x2339 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0343 A[Catch: Exception -> 0x0354, TryCatch #170 {Exception -> 0x0354, blocks: (B:94:0x032d, B:96:0x0343, B:99:0x034e), top: B:1494:0x032d }] */
    /* JADX WARN: Removed duplicated region for block: B:974:0x23a9 A[Catch: Exception -> 0x23c4, TryCatch #91 {Exception -> 0x23c4, blocks: (B:972:0x2387, B:974:0x23a9, B:975:0x23b7), top: B:1361:0x2387 }] */
    /* JADX WARN: Removed duplicated region for block: B:975:0x23b7 A[Catch: Exception -> 0x23c4, TRY_LEAVE, TryCatch #91 {Exception -> 0x23c4, blocks: (B:972:0x2387, B:974:0x23a9, B:975:0x23b7), top: B:1361:0x2387 }] */
    /* JADX WARN: Removed duplicated region for block: B:981:0x23f7 A[Catch: Exception -> 0x2412, TryCatch #35 {Exception -> 0x2412, blocks: (B:979:0x23d5, B:981:0x23f7, B:982:0x2405), top: B:1265:0x23d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:982:0x2405 A[Catch: Exception -> 0x2412, TRY_LEAVE, TryCatch #35 {Exception -> 0x2412, blocks: (B:979:0x23d5, B:981:0x23f7, B:982:0x2405), top: B:1265:0x23d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:988:0x2445 A[Catch: Exception -> 0x2460, TryCatch #108 {Exception -> 0x2460, blocks: (B:986:0x2423, B:988:0x2445, B:989:0x2453), top: B:1388:0x2423 }] */
    /* JADX WARN: Removed duplicated region for block: B:989:0x2453 A[Catch: Exception -> 0x2460, TRY_LEAVE, TryCatch #108 {Exception -> 0x2460, blocks: (B:986:0x2423, B:988:0x2445, B:989:0x2453), top: B:1388:0x2423 }] */
    /* JADX WARN: Removed duplicated region for block: B:995:0x2493 A[Catch: Exception -> 0x24ac, TryCatch #53 {Exception -> 0x24ac, blocks: (B:993:0x2471, B:995:0x2493, B:996:0x24a0), top: B:1295:0x2471 }] */
    /* JADX WARN: Removed duplicated region for block: B:996:0x24a0 A[Catch: Exception -> 0x24ac, TRY_LEAVE, TryCatch #53 {Exception -> 0x24ac, blocks: (B:993:0x2471, B:995:0x2493, B:996:0x24a0), top: B:1295:0x2471 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateNetworkConfig(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 11375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.config.OrangeConfigImpl.updateNetworkConfig(java.lang.String):void");
    }

    private void updateAmdcConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb27cc87", new Object[]{this, str});
            return;
        }
        try {
            String config = getConfig(str, AMDC_CONTROL_MODE, null);
            String config2 = getConfig(str, AMDC_CONTROL_LIST, null);
            if (!StringUtils.isEmpty(config) && !StringUtils.isEmpty(config2)) {
                int intValue = Integer.valueOf(config).intValue();
                JSONArray jSONArray = new JSONArray(config2);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                AmdcRuntimeInfo.setControlMode(intValue, arrayList);
            }
        } catch (Exception e) {
            ALog.e(TAG, "[updateAmdcConfig]", null, e, new Object[0]);
        }
        try {
            String config3 = getConfig(str, AMDC_UPDATE_MODE_ENABLE_SWITCH, null);
            if (StringUtils.isEmpty(config3)) {
                return;
            }
            AmdcRuntimeInfo.setUpdateModeEnable(Boolean.parseBoolean(config3));
        } catch (Exception e2) {
            ALog.e(TAG, "setUpdateModeEnable fail", null, "e", e2);
        }
    }
}
