package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.taobao.windvane.cache.d;
import mtopsdk.common.util.StringUtils;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.session.dns.DnsNavConfigTask;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ABSwitchUtils;
import anet.channel.util.ALog;
import anet.channel.util.SharePreferencesUtils;
import anet.channel.util.Utils;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class AwcnConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final CopyOnWriteArrayList<String> ALLOW_ALL_PATH;
    public static final String ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY = "ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY";
    private static final int AMDC_LIGHT_TIME = 15000;
    private static final int AMDC_TIMEOUT = 3000;
    private static final int CHANNEL_AMDC_TTL = 2;
    private static final int DEFAULT_MULTI_PATH_TOAST_TIRE_TIME = 168;
    private static final boolean DEFAULT_NETWORK_AMDC_FIRST_REQUEST_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_AMDC_NOT_USE_IPV6_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_AMDC_REDUCE_FREQUENCY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_AMDC_RETRY_STRATEGY_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_AMDC_STRATEGY_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_AMDC_STRATEGY_UPDATE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_CONN_RACING_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_COOKIE_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_COOKIE_OPT_V2_OPENED = true;
    private static final boolean DEFAULT_NETWORK_CURRENT_PROESS_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_DECOMPRESS_OPENED = false;
    private static final boolean DEFAULT_NETWORK_DETECT_H3_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_GET_SCHEME_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_GET_SESSION_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_HANDOVER_SIGNAL_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_HTTP3_PRE_HOST_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_HTTP3_RECONNECT_ENABLE = true;
    private static final long DEFAULT_NETWORK_INTERCEPTOR_OPT_TYPE = 0;
    private static final boolean DEFAULT_NETWORK_IPV6_CELL_DETECT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_IPV6_DETECT_OPT_OPENED = false;
    private static final boolean DEFAULT_NETWORK_IPV6_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_IPV6_WIFI_DUAL_STACK_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_LAST_STATUS_NONE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_OPENED = true;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_V1_OPENED = true;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_V2_OPENED = true;
    private static final boolean DEFAULT_NETWORK_LAZY_LOAD_SECURITY_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_LOW_POWER_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_MD5_OPENED = true;
    private static final boolean DEFAULT_NETWORK_ORANGE_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_PARAMS_OPENED = true;
    private static final boolean DEFAULT_NETWORK_PRE_HOST_MCC_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_PRE_SESSION_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_PRIORITY_UPDATE_AMDC_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_REQ_FEC_SIZE_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_RETRY_USE_LONG_LINK_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_SMOOTH_RECONNECT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_SMOOTH_RECONNECT_OPT_OPENED = false;
    private static final boolean DEFAULT_NETWORK_SOCKET_BG_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_SPDY_OFFLINE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_SSL_SP_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_START_IP_STACK_DETECT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_STATUS_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_TNET_FORCE_PUBKEY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_TUNNEL_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_UPDATE_AMDC_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_UPDATE_IP_STACK_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_UPLINK_ENCODE_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_USE_CLIENT_IP_OPENED = false;
    private static final boolean DEFAULT_NETWORK_VPN_CHANGE_DETECT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_VPN_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_VPN_IP_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_VPN_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_XQUIC_REMOTE_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE = false;
    private static final boolean DEFAULT_VPN_FAST_DEGRADE_ENABLE = true;
    public static final String DETECT_CENTER_ENABLE = "DETECT_CENTER_ENABLE";
    public static final String FRAGMENT_FILE_LENGTH_THRESHOLD_KEY = "fragment_file_length_threshold";
    public static final String FRAGMENT_SIZE_KEY = "fragment_size";
    public static final String HTTP3_0RTT_WHITE_LIST_KEY = "network_http3_0rtt_write_list";
    public static final String HTTP3_1RTT_WHITE_LIST_KEY = "network_http3_1rtt_write_list";
    public static final String HTTP3_BLACK_LIST_KEY = "network_http3_black_list";
    public static final String HTTP3_ENABLE = "HTTP3_ENABLE";
    public static final String HTTP3_NETWORK_CHANGE_WHITE_LIST_KEY = "network_change_http3_white_list";
    public static final String HTTP3_OPT_WHITE_LIST_KEY = "network_http3_opt_white_list";
    public static final String HTTP3_VIP_BLACK_LIST_KEY = "network_http3_vip_black_list";
    public static final String IPV6_DETECT_KEY = "network_ipv6_detect";
    public static final String IPV6_RECTIFICATION_KEY = "network_ipv6_rectification";
    private static final long LAZY_LOAD_TNET_SECURITY_TIME = 15000;
    private static final int MAX_ACCS_RECONNECT_PERIOD = 600000;
    public static final String MD5_REFER_WHITE_LIST_KEY = "network_md5_refer_white_list";
    public static final String MULTI_PATH_HARMONY_WHITE_LIST = "multi_path_harmony_white_list";
    public static final String MULTI_PATH_MONITOR_KEY = "multi_path_monitor";
    public static final String NETWORK_ACCEPT_ENCODE_WHITE_LIST_KEY = "network_accept_encode_domain_write_list";
    public static final String NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_KEY = "network_url_allow_no_cookie_white_list";
    private static final String NETWORK_AMDC_FIRST_REQUEST_OPT_ENABLE = "NETWORK_AMDC_FIRST_REQUEST_OPT_ENABLE";
    public static final String NETWORK_AMDC_LIGHT_TIME_KEY = "network_amdc_light_time_key";
    private static final String NETWORK_AMDC_NOT_USE_IPV6_ENABLE = "NETWORK_AMDC_NOT_USE_IPV6_ENABLE";
    private static final String NETWORK_AMDC_REDUCE_FREQUENCY_ENABLE = "NETWORK_AMDC_REDUCE_FREQUENCY_ENABLE";
    private static final String NETWORK_AMDC_RETRY_STRATEGY_OPT_ENABLE = "NETWORK_AMDC_RETRY_STRATEGY_OPT_ENABLE";
    private static final String NETWORK_AMDC_STRATEGY_OPT_ENABLE = "NETWORK_AMDC_STRATEGY_OPT_ENABLE";
    public static final String NETWORK_AMDC_STRATEGY_THRESHOLD_KEY = "network_amdc_strategy_threshold_list";
    private static final String NETWORK_AMDC_STRATEGY_UPDATE_ENABLE = "NETWORK_AMDC_STRATEGY_UPDATE_ENABLE";
    public static final String NETWORK_AMDC_TIMEOUT_KEY = "network_amdc_timeout_key";
    public static final String NETWORK_CHANNEL_AMDC_TTL_KEY = "network_channel_amdc_ttl_key";
    private static final String NETWORK_CONN_RACING_ENABLE = "NETWORK_CONN_RACING_ENABLE";
    public static final String NETWORK_COOKIE_LOG_HOST_WHITE_LIST_KEY = "network_cookie_log_domain_write_list";
    private static final String NETWORK_COOKIE_OPT_ENABLE = "NETWORK_COOKIE_OPT_ENABLE";
    private static final String NETWORK_COOKIE_OPT_V2_OPENED = "NETWORK_COOKIE_OPT_V2_OPENED";
    private static final String NETWORK_CURRENT_PROESS_OPT_ENABLE = "NETWORK_CURRENT_PROESS_OPT_ENABLE";
    private static final String NETWORK_DECOMPRESS_ENABLE = "NETWORK_DECOMPRESS_ENABLE";
    public static final String NETWORK_DETECT_H3_HOST_WHITE_LIST_KEY = "network_h3_detect_domain_write_list";
    private static final String NETWORK_DETECT_H3_OPT_ENABLE = "NETWORK_DETECT_H3_OPT_ENABLE";
    public static final String NETWORK_DNS_OPT_WHITE_LIST = "network_dns_opt_white_list";
    public static final String NETWORK_DOWNLOAD_ASYNC_RATIO = "network_download_async_ratio";
    private static final String NETWORK_GET_SCHEME_OPT_ENABLE = "NETWORK_GET_SCHEME_OPT_ENABLE";
    private static final String NETWORK_GET_SESSION_OPT_ENABLE = "NETWORK_GET_SESSION_OPT_ENABLE";
    private static final String NETWORK_GZIP_DECOMPRESS_ENABLE = "NETWORK_GZIP_CLOSE_DECOMPRESS_ENABLE";
    private static final String NETWORK_HANDOVER_SIGNAL_ENABLE = "NETWORK_HANDOVER_SIGNAL_ENABLE";
    private static final String NETWORK_HTTP3_PRE_HOST_ENABLE = "NETWORK_HTTP3_PRE_HOST_ENABLE";
    private static final String NETWORK_HTTP3_RECONNECT_ENABLE = "NETWORK_HTTP3_RECONNECT_ENABLE";
    private static final String NETWORK_INTERCEPTOR_OPT_TYPE = "NETWORK_INTERCEPTOR_OPT_TYPE";
    private static final String NETWORK_IPV6_CELL_DETECT_ENABLE = "NETWORK_IPV6_CELL_DETECT_ENABLE";
    private static final String NETWORK_IPV6_DETECT_OPT_OPENED = "NETWORK_IPV6_DETECT_OPT_OPENED";
    private static final String NETWORK_IPV6_ENABLE = "NETWORK_IPV6_ENABLE";
    private static final String NETWORK_IPV6_WIFI_DUAL_STACK_OPT_ENABLE = "NETWORK_IPV6_WIFI_DUAL_STACK_OPT_ENABLE";
    private static final String NETWORK_LAST_STATUS_NONE_ENABLE = "NETWORK_LAST_STATUS_NONE_ENABLE";
    private static final String NETWORK_LAUNCH_OPT_ENABLE = "NETWORK_LAUNCH_OPT_ENABLE";
    private static final String NETWORK_LAUNCH_OPT_OPENED = "network_launch_opt_open";
    private static final String NETWORK_LAUNCH_OPT_V1_OPENED = "network_launch_opt_v1_open";
    private static final String NETWORK_LAUNCH_OPT_V2_OPENED = "network_launch_opt_v2_open";
    private static final String NETWORK_LAZY_LOAD_SECURITY_ENABLE = "NETWORK_LAZY_LOAD_SECURITY_ENABLE";
    public static final String NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_KEY = "network_amdc_lazy_load_tnet_sec_key";
    public static final String NETWORK_LONG_AMDC_WHITE_LIST_KEY = "network_long_amdc_white_list";
    private static final String NETWORK_LOW_POWER_ENABLE = "NETWORK_LOW_POWER_ENABLE";
    public static final String NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_KEY = "network_lunch_after_amdc_white_list";
    private static final String NETWORK_MD5_ENABLE = "NETWORK_MD5_ENABLE";
    public static final String NETWORK_METRICS_TIME_KEY = "metrics_time_config_key";
    public static final String NETWORK_MTOP_AMDC_WHITE_LIST_KEY = "network_mtop_amdc_white_list";
    public static final String NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY = "network_mtop_interceptor_host_white_list";
    private static final String NETWORK_MULTI_CONNECT_ENABLE = "NETWORK_MULTI_CONNECT_ENABLE";
    public static final String NETWORK_MULTI_CONNECT_WHITE_LIST_KEY = "network_multi_connect_white_list";
    public static final String NETWORK_OKHTTP_KEY = "network_okhttp_key";
    private static final String NETWORK_ORANGE_OPT_ENABLE = "NETWORK_ORANGE_OPT_ENABLE";
    private static final String NETWORK_PARAMS_OPENED = "NETWORK_PARAMS_OPENED";
    public static final String NETWORK_PRE_HOST_HTTP2_WHITE_LIST_KEY = "network_pre_host_http2_white_list";
    public static final String NETWORK_PRE_HOST_HTTP3_WHITE_LIST_KEY = "network_pre_host_http3_white_list";
    private static final String NETWORK_PRE_HOST_MCC_ENABLE = "NETWORK_PRE_HOST_MCC_ENABLE";
    public static final String NETWORK_PRE_HOST_WHITE_LIST_KEY = "network_pre_host_white_list";
    private static final String NETWORK_PRE_HOT_STR = "network_pre_hot_str";
    private static final String NETWORK_PRE_SESSION_OPT_ENABLE = "NETWORK_PRE_SESSION_OPT_ENABLE";
    public static final String NETWORK_PRE_SESSION_WHITE_LIST_KEY = "network_pre_session_white_list_key";
    private static final String NETWORK_PRIORITY_UPDATE_AMDC_ENABLE = "NETWORK_PRIORITY_UPDATE_AMDC_ENABLE";
    public static final String NETWORK_QOS_SMOOTH_WINDOW_SIZE_KEY = "network_qos_smooth_window_size";
    private static final String NETWORK_RANGE_BOOST_OPEN = "NETWORK_RANGE_BOOST_OPEN";
    public static final String NETWORK_RECENT_WIN_TIME_KEY = "network_recent_win_time_key";
    public static final String NETWORK_REDUNDANT_SESSION_FIX = "network_redundant_session_fix";
    private static final String NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE = "NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE";
    private static final String NETWORK_REQ_FEC_SIZE_OPT_ENABLE = "NETWORK_REQ_FEC_SIZE_OPT_ENABLE";
    public static final String NETWORK_REQ_FEC_SIZE_WHITE_LIST_KEY = "network_req_fec_size_white_list";
    public static final String NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_KEY = "network_req_fec_up_size_white_list";
    private static final String NETWORK_RETRY_USE_LONG_LINK_ENABLE = "NETWORK_RETRY_USE_LONG_LINK_ENABLE";
    public static final String NETWORK_SAVE_POWER_TIME_KEY = "network_save_power_time_key";
    private static final String NETWORK_SMOOTH_RECONNECT_ENABLE = "NETWORK_SMOOTH_RECONNECT_ENABLE";
    private static final String NETWORK_SMOOTH_RECONNECT_OPT_OPENED = "NETWORK_SMOOTH_RECONNECT_OPT_OPENED";
    private static final String NETWORK_SOCKET_BG_OPT_ENABLE = "NETWORK_SOCKET_BG_OPT_ENABLE";
    private static final String NETWORK_SPDY_OFFLINE_ENABLE = "NETWORK_SPDY_OFFLINE_ENABLE";
    private static final String NETWORK_SSL_SP_OPT_ENABLE = "NETWORK_SSL_SP_OPT_ENABLE";
    private static final String NETWORK_START_IP_STACK_DETECT_ENABLE = "NETWORK_START_IP_STACK_DETECT_ENABLE";
    private static final String NETWORK_STATUS_OPT_ENABLE = "NETWORK_STATUS_OPT_ENABLE";
    private static final String NETWORK_TNET_FORCE_PUBKEY_ENABLE = "NETWORK_TNET_FORCE_PUBKEY_ENABLE";
    public static final String NETWORK_TUNNEL_KEY = "network_tunnel_enable";
    private static final String NETWORK_TUNNEL_OPT_ENABLE = "NETWORK_TUNNEL_OPT_ENABLE";
    private static final String NETWORK_UPDATE_AMDC_ENABLE = "NETWORK_UPDATE_AMDC_ENABLE";
    private static final String NETWORK_UPDATE_IP_STACK_ENABLE = "NETWORK_UPDATE_IP_STACK_ENABLE";
    public static final String NETWORK_UPLINK_COMPRESS_HOST_WHITE_LIST_KEY = "network_uplink_compress_host_white_list";
    public static final String NETWORK_UPLINK_COMPRESS_URL_WHITE_LIST_KEY = "network_uplink_compress_url_white_list";
    private static final String NETWORK_UPLINK_ENCODE_ENABLE = "NETWORK_UPLINK_ENCODE_ENABLE";
    public static final String NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_KEY = "network_url_monitor_request_white_list";
    private static final String NETWORK_USE_CLIENT_IP_OPENED = "NETWORK_USE_CLIENT_IP_OPENED";
    private static final String NETWORK_VPN_CHANGE_DETECT_ENABLE = "NETWORK_VPN_CHANGE_DETECT_ENABLE";
    private static final String NETWORK_VPN_ENABLE = "NETWORK_VPN_ENABLE";
    private static final String NETWORK_VPN_FAST_DEGRADE_ENABLE = "NETWORK_VPN_FAST_DEGRADE_ENABLE";
    private static final String NETWORK_VPN_IP_OPT_ENABLE = "NETWORK_VPN_IP_OPT_ENABLE";
    private static final String NETWORK_VPN_OPT_ENABLE = "NETWORK_VPN_OPT_ENABLE";
    public static final String NETWORK_WAIT_THREAD_COUNT_KEY = "NETWORK_WAIT_THREAD_COUNT_KEY";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_KEY = "network_wifi_fg_force_cell_config_list";
    private static final String NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE = "NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_KEY = "network_wifi_fg_force_cell_white_list";
    private static final String NETWORK_XQUIC_REMOTE_ENABLE = "NETWORK_XQUIC_REMOTE_ENABLE";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE = "NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE = "NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE = "NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE";
    public static final String NETWORK_ZSTD_DICT_WHITE_LIST_KEY = "network_zstd_dict_white_list";
    private static final String NETWORK_ZSTD_STREAM_DECOMPRESS_ENABLE = "NETWORK_ZSTD_STREAM_DECOMPRESS_ENABLE";
    public static final String NEXT_LAUNCH_FORBID = "NEXT_LAUNCH_FORBID";
    public static final String OKHTTP_H2_PRE_BUILD_LIST_KEY = "network_okhttp_pre_build_list";
    public static final String OKHTTP_H2_WHITE_LIST_KEY = "network_okhttp_white_list";
    public static final String QOS_BIZ_WHITE_LIST_KEY = "network_qos_biz_white_list";
    public static final String QOS_HOST_WHITE_LIST_KEY = "network_qos_host_white_list";
    private static final int SAVE_POWER_TIME = 60000;
    private static final String TAG = "awcn.AwcnConfig";
    public static final String VPN_FAST_DEGRADE_BIZID_WHITE_LIST_KEY = "network_vpn_fast_degrade_biz_id_write_list";
    public static final String VPN_FAST_DEGRADE_HOST_WHITE_LIST_KEY = "network_vpn_fast_degrade_host_write_list";
    public static final String VPN_PROXY_SESSION_WHITE_LIST_KEY = "network_vpn_proxy_session_write_list";
    public static final String ZSTD_DICT_FAIL_CONFIG = "zstd_dict_fail_config";
    public static final String ZSTD_DICT_FAIL_CONFIG_KEY = "zstd_dict_fail_config_key";
    public static final String ZSTD_DICT_THRESHOLD = "zstd_dict_threshold_key";
    public static final String ZSTD_DICT_THRESHOLD_KEY = "zstd_dict_threshold";
    private static volatile CopyOnWriteArrayList<String> acceptEncodeWhiteList;
    private static volatile ConcurrentHashMap<String, List<String>> accessPointWhiteList;
    private static volatile int accsReconnectionDelayPeriod;
    private static volatile CopyOnWriteArrayList<String> allowNoCookieList;
    private static CopyOnWriteArrayList<String> allowRetryUseLongLinkWhiteList;
    private static volatile long allowUseCellFlowSize;
    private static long amdcClearThreshold;
    private static long amdcLightTime;
    private static int amdcTimeout;
    private static double cell4GBandwidthQualityCoeff;
    private static double cell5GBandwidthQualityCoeff;
    private static volatile long channelAmdcTtl;
    private static volatile long complexConnectDelayTime;
    private static volatile CopyOnWriteArrayList<String> complexConnectWhiteList;
    private static volatile int continueTimeoutCount;
    private static volatile CopyOnWriteArrayList<String> cookiePrintLogWhiteList;
    private static volatile CopyOnWriteArrayList<String> detectHostWhiteList;
    private static volatile long detectIntervalTime;
    private static volatile int detectReadTimeOut;
    private static volatile ArrayList<DnsNavConfigTask> dnsNavTasksList;
    private static double doublePathsSlipdownCoeff;
    private static volatile CopyOnWriteArrayList<String> exceptionDetectUrlList;
    private static long fragmentFileLengthThreshold;
    private static long fragmentSize;
    private static CopyOnWriteArrayList<String> http3BlackList;
    private static CopyOnWriteArrayList<String> http3DefaultWhiteList;
    private static CopyOnWriteArrayList<String> http3NetworkChangeWhiteList;
    private static CopyOnWriteArrayList<String> http3VipBlackList;
    private static CopyOnWriteArrayList<String> http3WhiteList;
    private static CopyOnWriteArrayList<String> http3_0RttWhiteList;
    private static CopyOnWriteArrayList<String> http3_1RttWhiteList;
    private static volatile CopyOnWriteArrayList<String> httpDetectWhiteList;
    private static volatile CopyOnWriteArrayList<String> httpDnsNotifyWhiteList;
    private static AtomicBoolean initialized;
    private static AtomicBoolean initializedAsync;
    private static long interceptorOptType;
    private static volatile boolean ipv6Enable;
    private static boolean isAccessPointStatus;
    private static volatile boolean isAccsSessionCreateForbiddenInBg;
    private static volatile boolean isAllowConvertIPv4ToIPv6;
    private static boolean isAllowRetryUseLongLinkEnable;
    private static boolean isAmdcFirstRequestOptEnable;
    private static boolean isAmdcNotUseIpv6;
    private static boolean isAmdcPriorityUpdateEnable;
    private static volatile boolean isAmdcReduceFrequencyEnable;
    private static boolean isAmdcRetryStrategySwitchOpened;
    private static boolean isAmdcStrategyOptEnable;
    private static boolean isAmdcStrategyUpdateEnable;
    private static boolean isAmdcUpdateEnable;
    private static boolean isAsyncIpStackDetect;
    private static boolean isAsyncLoadStrategyEnable;
    private static volatile boolean isComplexConnectEnable;
    private static boolean isConnRacingEnable;
    private static volatile boolean isCookieHeaderRedundantFix;
    private static boolean isCookieOptEnable;
    private static boolean isCurrentProcessOpt;
    private static boolean isDecompressOpened;
    private static volatile boolean isDetectCenterEnable;
    private static boolean isDetectH3OptOpened;
    private static boolean isDownloadAsyncSwitch;
    private static volatile boolean isEagainOptimizeEnable;
    private static volatile boolean isGetSchemeOptEnable;
    private static boolean isGetSessionOptEnable;
    private static boolean isGzipDecompressOpend;
    private static boolean isHandoverSignalOpened;
    private static volatile boolean isHorseRaceEnable;
    private static volatile boolean isHttp3DefaultEnable;
    private static volatile boolean isHttp3Enable;
    private static volatile boolean isHttp3PreHostEnable;
    private static volatile boolean isHttp3ReconnectEnable;
    private static volatile boolean isHttpDetectEnable;
    private static volatile boolean isHttpsSniEnable;
    private static boolean isIpv6CellDetectEnable;
    private static volatile boolean isIpv6DetectEnable;
    private static boolean isIpv6DetectOptEnable;
    private static volatile boolean isIpv6OnlyEnable;
    private static volatile boolean isIpv6RectificationEnable;
    private static boolean isIpv6WifiDualStackOptEnable;
    private static boolean isLastStatusNoneOpt;
    private static boolean isLaunchOptEnable;
    private static boolean isLaunchOptOpened;
    private static boolean isLaunchOptV1Opened;
    private static boolean isLaunchOptV2Opened;
    private static volatile boolean isLazyLoadSecurityEnable;
    private static boolean isLowPowerOpened;
    private static volatile boolean isMPQuicConfigSwitch;
    private static volatile boolean isMPQuicUserSwitch;
    private static volatile boolean isMTUConnectOptimize;
    private static volatile boolean isMTUDetectEnable;
    private static boolean isMd5Opened;
    private static boolean isMultiConnectOpened;
    private static volatile boolean isMultiPathMonitorEnable;
    private static volatile boolean isNetworkDetectEnable;
    private static boolean isNetworkStatusOpt;
    private static boolean isNotAllowCookieOpened;
    private static volatile boolean isOkHttpEnable;
    private static boolean isOrangeOptEnable;
    private static boolean isParamsOpened;
    private static volatile boolean isPreHostMccNotUseEnable;
    private static boolean isPreSessionOptEnable;
    public static boolean isQoSPacingABSwitch;
    public static boolean isQoSQueueABSwitch;
    public static boolean isQoSRecvWndABSwitch;
    private static volatile boolean isRTTDetectEnable;
    private static boolean isRepeatThreadUseVirtualThread;
    private static volatile boolean isReqFecSizeOptEnable;
    private static volatile boolean isSecondRefreshABEnable;
    private static volatile boolean isSendConnectInfoByService;
    private static volatile boolean isSessionReuseOptimized;
    private static volatile boolean isSmoothReconnectEnable;
    private static volatile boolean isSmoothReconnectOptOpened;
    private static boolean isSocketBgOptEnable;
    private static volatile boolean isSpdyOfflineEnable;
    private static boolean isSslSpOptEnable;
    private static boolean isStartIpStackDetectOpened;
    private static volatile boolean isTbNextLaunch;
    private static volatile boolean isTicketStoreUpgrade;
    private static boolean isTnetForcePubKey;
    private static volatile boolean isTunnelEnable;
    private static boolean isTunnelOptEnable;
    private static boolean isUpdateIpStackEnable;
    private static boolean isUplinkEncodeOpened;
    private static boolean isUseClientIpOpened;
    private static boolean isUseVirtualThread;
    private static boolean isVpnChangeDetectOpened;
    private static volatile boolean isVpnFastDegradeABEnable;
    private static volatile boolean isVpnFastDegradeEnable;
    private static boolean isVpnIpSwitchOpened;
    private static boolean isVpnListenOpened;
    private static boolean isVpnOptOpened;
    private static volatile boolean isWaitThreadCountABEnable;
    private static volatile boolean isWaitThreadCountEnable;
    private static boolean isWifiUnavailableUseCellOptOpened;
    private static boolean isXquicRemoteEnable;
    private static volatile boolean isZstdDictABEnable;
    private static boolean isZstdDictDecompressChannelEnable;
    private static boolean isZstdDictDecompressMtopEnable;
    private static boolean isZstdDictDecompressOpened;
    private static boolean isZstdStreamDecompressOpened;
    private static long lazyLoadTnetSecTime;
    private static long longAmdcThreshold;
    private static volatile CopyOnWriteArrayList<String> longAmdcWhiteList;
    private static CopyOnWriteArraySet<String> lunchAfterAmdcList;
    private static CopyOnWriteArrayList<String> md5ReferWhiteList;
    private static long mtopAmdcThreshold;
    private static volatile CopyOnWriteArrayList<String> mtopAmdcWhiteList;
    private static volatile ConcurrentHashMap<String, Integer> mtopInterceptorWhiteList;
    private static volatile CopyOnWriteArrayList<String> multiConnectWhiteList;
    private static CopyOnWriteArrayList<String> multiPathHarmonyWhiteList;
    private static volatile int multiPathToastTireTime;
    private static volatile String multiPathUserToastText;
    private static int networkQosSmoothWindowSize;
    private static CopyOnWriteArrayList<String> okhttpHostWhiteList;
    private static CopyOnWriteArrayList<String> okhttpPreBuildList;
    private static long otherAmdcThreshold;
    private static volatile long periodTime;
    private static volatile int periodTimeoutCount;
    private static double poorSpeedThreshold;
    private static String preHotStr;
    private static CopyOnWriteArrayList<String> preSessionWhiteList;
    private static volatile ConcurrentHashMap<String, List<String>> presetHostHttp2WhiteList;
    private static volatile ConcurrentHashMap<String, List<String>> presetHostHttp3WhiteList;
    private static volatile ConcurrentHashMap<String, List<String>> presetHostWhiteList;
    private static CopyOnWriteArrayList<String> qosBizWhiteList;
    private static int qosDelayUnit;
    private static CopyOnWriteArrayList<String> qosHostWhiteList;
    private static CopyOnWriteArrayList<String> qosReferList;
    private static long qualityNotifyMinInterval;
    private static boolean rangeBoostOpen;
    private static volatile long recentWinTime;
    private static int recvBpsLimitation;
    private static ConcurrentHashMap<String, List<String>> reqFecSizeWhiteList;
    private static ConcurrentHashMap<String, List<String>> reqFecUpSizeWhiteList;
    private static double robustSpeedThreshold;
    private static long savePowerTimeInterval;
    private static CopyOnWriteArrayList<String> socketBoostHostWhiteList;
    private static volatile long updateMetricsTime;
    private static volatile CopyOnWriteArrayList<String> uplinkEncodeHostWhiteList;
    private static volatile ConcurrentHashMap<String, List<String>> uplinkEncodeUrlWhiteList;
    private static volatile CopyOnWriteArrayList<String> urlMonitorRequestList;
    private static ConcurrentHashMap<String, Integer> usePreSessionMap;
    private static volatile CopyOnWriteArrayList<String> vpnFastDegradBizIdWhiteList;
    private static long vpnFastDegradTime;
    private static volatile ConcurrentHashMap<String, List<String>> vpnFastDegradeHostWhiteList;
    private static long vpnFgChangeCount;
    private static long vpnListenTimeInterval;
    private static volatile CopyOnWriteArrayList<String> vpnProxySessionWhiteList;
    private static volatile int waitThreadCount;
    private static CopyOnWriteArrayList<String> wifiFgForceCellWhiteList;
    private static volatile int xquicCongControl;
    private static ConcurrentHashMap<String, List<String>> zstdDictDecompressWhiteList;
    private static long zstdDictFailCount;
    private static long zstdDictFailIntervalTime;
    private static int zstdDictMaxCount;
    private static long zstdDictMaxLength;
    private static long zstdDictProtectUpdateTime;
    private static int zstdFileMaxCount;
    private static long zstdLinkDictIntervalTime;
    private static long zstdPerDictMaxLength;

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            doInitTask(context);
        }
    }

    static {
        kge.a(-2043090494);
        ALLOW_ALL_PATH = new CopyOnWriteArrayList<>();
        isAccsSessionCreateForbiddenInBg = false;
        isHttpsSniEnable = true;
        isHorseRaceEnable = true;
        ipv6Enable = true;
        isIpv6OnlyEnable = true;
        isAllowConvertIPv4ToIPv6 = false;
        isIpv6RectificationEnable = true;
        isAsyncLoadStrategyEnable = false;
        isAsyncIpStackDetect = false;
        isTbNextLaunch = false;
        isNetworkDetectEnable = false;
        isMTUDetectEnable = false;
        isMTUConnectOptimize = false;
        accsReconnectionDelayPeriod = 10000;
        isHttp3Enable = true;
        xquicCongControl = -1;
        isCookieHeaderRedundantFix = true;
        isSendConnectInfoByService = true;
        httpDnsNotifyWhiteList = null;
        http3BlackList = null;
        http3WhiteList = null;
        http3VipBlackList = null;
        lunchAfterAmdcList = null;
        isHttp3DefaultEnable = true;
        http3DefaultWhiteList = null;
        http3_1RttWhiteList = null;
        http3_0RttWhiteList = null;
        allowRetryUseLongLinkWhiteList = null;
        md5ReferWhiteList = null;
        qosBizWhiteList = null;
        qosHostWhiteList = null;
        isLastStatusNoneOpt = false;
        isNetworkStatusOpt = true;
        http3NetworkChangeWhiteList = null;
        isPreSessionOptEnable = true;
        preSessionWhiteList = null;
        usePreSessionMap = null;
        isVpnIpSwitchOpened = true;
        isAmdcRetryStrategySwitchOpened = true;
        isOrangeOptEnable = true;
        isAllowRetryUseLongLinkEnable = false;
        isCurrentProcessOpt = true;
        isHttp3PreHostEnable = true;
        isPreHostMccNotUseEnable = false;
        isHttp3ReconnectEnable = true;
        isReqFecSizeOptEnable = false;
        reqFecUpSizeWhiteList = null;
        reqFecSizeWhiteList = null;
        isGetSchemeOptEnable = true;
        lazyLoadTnetSecTime = 15000L;
        isLazyLoadSecurityEnable = true;
        isLaunchOptEnable = false;
        isAmdcUpdateEnable = true;
        isParamsOpened = true;
        isAmdcStrategyOptEnable = true;
        mtopAmdcThreshold = 604800000L;
        otherAmdcThreshold = AuthenticatorCache.MAX_CACHE_TIME;
        amdcClearThreshold = AmdcPriorityHelper.AMDC_PRIORITY_MAX_TIME;
        longAmdcThreshold = d.DEFAULT_MAX_AGE;
        mtopAmdcWhiteList = null;
        longAmdcWhiteList = null;
        isAmdcStrategyUpdateEnable = false;
        multiPathUserToastText = null;
        multiPathToastTireTime = DEFAULT_MULTI_PATH_TOAST_TIRE_TIME;
        isZstdDictDecompressMtopEnable = false;
        preHotStr = null;
        isLaunchOptOpened = true;
        isLaunchOptV1Opened = true;
        isLaunchOptV2Opened = true;
        isNotAllowCookieOpened = true;
        isSecondRefreshABEnable = false;
        isZstdDictABEnable = false;
        isAmdcPriorityUpdateEnable = false;
        isCookieOptEnable = false;
        isAmdcReduceFrequencyEnable = false;
        waitThreadCount = 8;
        isWaitThreadCountEnable = false;
        isWaitThreadCountABEnable = false;
        recentWinTime = 15000L;
        updateMetricsTime = 5000L;
        exceptionDetectUrlList = null;
        httpDetectWhiteList = null;
        isHttpDetectEnable = true;
        isDetectCenterEnable = true;
        isMultiPathMonitorEnable = true;
        multiPathHarmonyWhiteList = null;
        initialized = new AtomicBoolean(false);
        initializedAsync = new AtomicBoolean(false);
        isIpv6DetectEnable = true;
        isTicketStoreUpgrade = true;
        isTunnelEnable = true;
        isOkHttpEnable = true;
        okhttpHostWhiteList = null;
        okhttpPreBuildList = null;
        socketBoostHostWhiteList = null;
        isRTTDetectEnable = true;
        isSessionReuseOptimized = false;
        isMPQuicConfigSwitch = true;
        isMPQuicUserSwitch = false;
        isComplexConnectEnable = true;
        complexConnectWhiteList = null;
        complexConnectDelayTime = 250L;
        isEagainOptimizeEnable = true;
        channelAmdcTtl = 2L;
        isDecompressOpened = false;
        isConnRacingEnable = true;
        isIpv6CellDetectEnable = false;
        isUseClientIpOpened = false;
        isIpv6DetectOptEnable = false;
        isGetSessionOptEnable = true;
        isIpv6WifiDualStackOptEnable = true;
        isUpdateIpStackEnable = false;
        isStartIpStackDetectOpened = true;
        isUplinkEncodeOpened = true;
        isSmoothReconnectEnable = true;
        isSmoothReconnectOptOpened = false;
        isDetectH3OptOpened = true;
        isWifiUnavailableUseCellOptOpened = false;
        wifiFgForceCellWhiteList = null;
        continueTimeoutCount = 6;
        periodTimeoutCount = 3;
        periodTime = 5L;
        detectIntervalTime = 60L;
        detectReadTimeOut = 2000;
        allowUseCellFlowSize = 50L;
        urlMonitorRequestList = null;
        allowNoCookieList = null;
        interceptorOptType = 0L;
        isGzipDecompressOpend = false;
        isZstdStreamDecompressOpened = true;
        isMultiConnectOpened = true;
        isAccessPointStatus = false;
        accessPointWhiteList = null;
        isVpnChangeDetectOpened = true;
        isXquicRemoteEnable = true;
        isHandoverSignalOpened = false;
        isZstdDictDecompressOpened = false;
        zstdDictDecompressWhiteList = null;
        isZstdDictDecompressChannelEnable = true;
        isAmdcFirstRequestOptEnable = true;
        zstdFileMaxCount = 10;
        zstdDictMaxCount = 10;
        zstdDictMaxLength = 4194304L;
        zstdPerDictMaxLength = 256000L;
        zstdDictProtectUpdateTime = 3600000L;
        zstdLinkDictIntervalTime = 300000L;
        zstdDictFailIntervalTime = 300000L;
        zstdDictFailCount = 5L;
        isSocketBgOptEnable = true;
        isLowPowerOpened = true;
        isAmdcNotUseIpv6 = false;
        isTunnelOptEnable = true;
        isTnetForcePubKey = false;
        isSslSpOptEnable = false;
        isVpnListenOpened = true;
        isVpnOptOpened = true;
        isVpnFastDegradeEnable = true;
        isVpnFastDegradeABEnable = true;
        vpnFastDegradeHostWhiteList = null;
        vpnFastDegradBizIdWhiteList = null;
        vpnListenTimeInterval = 1500L;
        vpnFastDegradTime = 1200L;
        amdcTimeout = 3000;
        amdcLightTime = 15000L;
        vpnFgChangeCount = 5L;
        vpnProxySessionWhiteList = null;
        multiConnectWhiteList = null;
        uplinkEncodeHostWhiteList = null;
        uplinkEncodeUrlWhiteList = null;
        presetHostHttp3WhiteList = null;
        presetHostHttp2WhiteList = null;
        presetHostWhiteList = null;
        mtopInterceptorWhiteList = null;
        savePowerTimeInterval = 60000L;
        detectHostWhiteList = null;
        cookiePrintLogWhiteList = null;
        acceptEncodeWhiteList = null;
        isMd5Opened = true;
        isDownloadAsyncSwitch = false;
        isQoSQueueABSwitch = false;
        isQoSPacingABSwitch = true;
        isQoSRecvWndABSwitch = false;
        qosReferList = null;
        qosDelayUnit = 100;
        rangeBoostOpen = true;
        fragmentFileLengthThreshold = 3145728L;
        fragmentSize = 1048576L;
        networkQosSmoothWindowSize = 32;
        cell5GBandwidthQualityCoeff = 1.0d;
        cell4GBandwidthQualityCoeff = 1.0d;
        doublePathsSlipdownCoeff = 0.20000000298023224d;
        recvBpsLimitation = 1048576;
        robustSpeedThreshold = 1250.0d;
        poorSpeedThreshold = 100.0d;
        qualityNotifyMinInterval = 5000L;
        isSpdyOfflineEnable = false;
        isUseVirtualThread = false;
        isRepeatThreadUseVirtualThread = false;
        dnsNavTasksList = null;
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (!initialized.compareAndSet(false, true)) {
        } else {
            Boolean isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context, "Home_Page_SecondRefreshOpt");
            if (isABGlobalFeatureOpened != null) {
                setSecondRefreshABEnable(isABGlobalFeatureOpened.booleanValue());
            }
            Boolean isABGlobalFeatureOpened2 = ABSwitchUtils.isABGlobalFeatureOpened(context, "Home_Page_ZstdDictOpt");
            if (isABGlobalFeatureOpened2 != null) {
                setZstdDictABEnable(isABGlobalFeatureOpened2.booleanValue());
            }
            SharedPreferences corePreferences = SharePreferencesUtils.getCorePreferences(context);
            preHotStr = corePreferences.getString(NETWORK_PRE_HOT_STR, null);
            initPreHotStr();
            initCoreSp(corePreferences, context);
            boolean z = isLaunchOptV1Opened;
            isAsyncIpStackDetect = z;
            isAsyncLoadStrategyEnable = z;
            Boolean isABGlobalFeatureOpened3 = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_use_virtual_thread");
            if (isABGlobalFeatureOpened3 == null) {
                return;
            }
            setUseVirtualThread(isABGlobalFeatureOpened3.booleanValue());
        }
    }

    public static void initAsync(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac695955", new Object[]{context});
        } else if (!initializedAsync.compareAndSet(false, true)) {
        } else {
            if (isLaunchOptV1Opened()) {
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.AwcnConfig.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AwcnConfig.access$000(context);
                        }
                    }
                });
            } else {
                doInitTask(context);
            }
        }
    }

    private static void initPreHotStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6f28fe", new Object[0]);
            return;
        }
        try {
            if (preHotStr == null || preHotStr.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(preHotStr);
            isLaunchOptOpened = jSONObject.optBoolean(NETWORK_LAUNCH_OPT_OPENED);
            isLaunchOptV1Opened = jSONObject.optBoolean(NETWORK_LAUNCH_OPT_V1_OPENED);
            isLaunchOptV2Opened = jSONObject.optBoolean(NETWORK_LAUNCH_OPT_V2_OPENED);
        } catch (Throwable th) {
            isLaunchOptOpened = true;
            isLaunchOptV1Opened = true;
            isLaunchOptV2Opened = true;
            ALog.e(TAG, "AwcnConfig initPreHotStr fail! ", null, "t", th);
        }
    }

    private static void initCoreSp(SharedPreferences sharedPreferences, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d4a0f7", new Object[]{sharedPreferences, context});
            return;
        }
        if (sharedPreferences == null) {
            try {
                sharedPreferences = SharePreferencesUtils.getCorePreferences(context);
            } catch (Throwable th) {
                isLaunchOptEnable = false;
                isOrangeOptEnable = true;
                isCookieOptEnable = false;
                isRepeatThreadUseVirtualThread = false;
                isCurrentProcessOpt = true;
                isAmdcStrategyOptEnable = true;
                isGetSchemeOptEnable = true;
                isNotAllowCookieOpened = true;
                isSslSpOptEnable = false;
                isAmdcStrategyUpdateEnable = false;
                ALog.e(TAG, "AwcnConfig initCoreSp fail! ", null, "t", th);
                return;
            }
        }
        isLaunchOptEnable = sharedPreferences.getBoolean(NETWORK_LAUNCH_OPT_ENABLE, false);
        isCookieOptEnable = sharedPreferences.getBoolean(NETWORK_COOKIE_OPT_ENABLE, false);
        isOrangeOptEnable = sharedPreferences.getBoolean(NETWORK_ORANGE_OPT_ENABLE, true);
        isRepeatThreadUseVirtualThread = sharedPreferences.getBoolean(NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE, false);
        isCurrentProcessOpt = sharedPreferences.getBoolean(NETWORK_CURRENT_PROESS_OPT_ENABLE, true);
        isAmdcStrategyOptEnable = sharedPreferences.getBoolean(NETWORK_AMDC_STRATEGY_OPT_ENABLE, true);
        isGetSchemeOptEnable = sharedPreferences.getBoolean(NETWORK_GET_SCHEME_OPT_ENABLE, true);
        isNotAllowCookieOpened = sharedPreferences.getBoolean(NETWORK_COOKIE_OPT_V2_OPENED, true);
        isSslSpOptEnable = sharedPreferences.getBoolean(NETWORK_SSL_SP_OPT_ENABLE, false);
        setAllowRetryUseLongLinkWhiteList(sharedPreferences.getString(ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY, null));
        isAmdcStrategyUpdateEnable = sharedPreferences.getBoolean(NETWORK_AMDC_STRATEGY_UPDATE_ENABLE, false);
        set0RttHttp3WhiteList(sharedPreferences.getString(HTTP3_0RTT_WHITE_LIST_KEY, null));
    }

    private static void doInitTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15037cc1", new Object[]{context});
            return;
        }
        setHarmonyWhiteList(SharePreferencesUtils.getCorePreferences(context).getString(MULTI_PATH_HARMONY_WHITE_LIST, "[\"2.0.0\",\"3.0.0\"]"));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        isMultiPathMonitorEnable = defaultSharedPreferences.getBoolean(MULTI_PATH_MONITOR_KEY, true);
        setOkhttpHostWhiteList(defaultSharedPreferences.getString(OKHTTP_H2_WHITE_LIST_KEY, null));
        setOkhttpPreBuildList(defaultSharedPreferences.getString(OKHTTP_H2_PRE_BUILD_LIST_KEY, null));
        isIpv6RectificationEnable = defaultSharedPreferences.getBoolean(IPV6_RECTIFICATION_KEY, true);
        isTunnelEnable = defaultSharedPreferences.getBoolean(NETWORK_TUNNEL_KEY, true);
        isOkHttpEnable = defaultSharedPreferences.getBoolean(NETWORK_OKHTTP_KEY, true);
        isDecompressOpened = defaultSharedPreferences.getBoolean(NETWORK_DECOMPRESS_ENABLE, false);
        isConnRacingEnable = defaultSharedPreferences.getBoolean(NETWORK_CONN_RACING_ENABLE, true);
        isIpv6CellDetectEnable = defaultSharedPreferences.getBoolean(NETWORK_IPV6_CELL_DETECT_ENABLE, false);
        isUseClientIpOpened = defaultSharedPreferences.getBoolean(NETWORK_USE_CLIENT_IP_OPENED, false);
        isIpv6DetectOptEnable = defaultSharedPreferences.getBoolean(NETWORK_IPV6_DETECT_OPT_OPENED, false);
        isGetSessionOptEnable = defaultSharedPreferences.getBoolean(NETWORK_GET_SESSION_OPT_ENABLE, true);
        isIpv6WifiDualStackOptEnable = defaultSharedPreferences.getBoolean(NETWORK_IPV6_WIFI_DUAL_STACK_OPT_ENABLE, true);
        isUpdateIpStackEnable = defaultSharedPreferences.getBoolean(NETWORK_UPDATE_IP_STACK_ENABLE, false);
        isStartIpStackDetectOpened = defaultSharedPreferences.getBoolean(NETWORK_START_IP_STACK_DETECT_ENABLE, true);
        isUplinkEncodeOpened = defaultSharedPreferences.getBoolean(NETWORK_UPLINK_ENCODE_ENABLE, true);
        isSmoothReconnectEnable = defaultSharedPreferences.getBoolean(NETWORK_SMOOTH_RECONNECT_ENABLE, true);
        isSmoothReconnectOptOpened = defaultSharedPreferences.getBoolean(NETWORK_SMOOTH_RECONNECT_OPT_OPENED, false);
        isDetectH3OptOpened = defaultSharedPreferences.getBoolean(NETWORK_DETECT_H3_OPT_ENABLE, true);
        isWifiUnavailableUseCellOptOpened = defaultSharedPreferences.getBoolean(NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE, false);
        interceptorOptType = defaultSharedPreferences.getLong(NETWORK_INTERCEPTOR_OPT_TYPE, 0L);
        isSpdyOfflineEnable = defaultSharedPreferences.getBoolean(NETWORK_SPDY_OFFLINE_ENABLE, false);
        isLastStatusNoneOpt = defaultSharedPreferences.getBoolean(NETWORK_LAST_STATUS_NONE_ENABLE, false);
        isNetworkStatusOpt = defaultSharedPreferences.getBoolean(NETWORK_STATUS_OPT_ENABLE, true);
        isPreSessionOptEnable = defaultSharedPreferences.getBoolean(NETWORK_PRE_SESSION_OPT_ENABLE, true);
        isHttp3PreHostEnable = defaultSharedPreferences.getBoolean(NETWORK_HTTP3_PRE_HOST_ENABLE, true);
        isVpnIpSwitchOpened = defaultSharedPreferences.getBoolean(NETWORK_VPN_IP_OPT_ENABLE, true);
        isAmdcRetryStrategySwitchOpened = defaultSharedPreferences.getBoolean(NETWORK_AMDC_RETRY_STRATEGY_OPT_ENABLE, true);
        isAllowRetryUseLongLinkEnable = defaultSharedPreferences.getBoolean(NETWORK_RETRY_USE_LONG_LINK_ENABLE, false);
        isHttp3ReconnectEnable = defaultSharedPreferences.getBoolean(NETWORK_HTTP3_RECONNECT_ENABLE, true);
        isReqFecSizeOptEnable = defaultSharedPreferences.getBoolean(NETWORK_REQ_FEC_SIZE_OPT_ENABLE, false);
        isLazyLoadSecurityEnable = defaultSharedPreferences.getBoolean(NETWORK_LAZY_LOAD_SECURITY_ENABLE, true);
        isAmdcReduceFrequencyEnable = defaultSharedPreferences.getBoolean(NETWORK_AMDC_REDUCE_FREQUENCY_ENABLE, false);
        isMd5Opened = defaultSharedPreferences.getBoolean(NETWORK_MD5_ENABLE, true);
        isLowPowerOpened = defaultSharedPreferences.getBoolean(NETWORK_LOW_POWER_ENABLE, true);
        isAmdcNotUseIpv6 = defaultSharedPreferences.getBoolean(NETWORK_AMDC_NOT_USE_IPV6_ENABLE, false);
        isTunnelOptEnable = defaultSharedPreferences.getBoolean(NETWORK_TUNNEL_OPT_ENABLE, true);
        rangeBoostOpen = defaultSharedPreferences.getBoolean(NETWORK_RANGE_BOOST_OPEN, true);
        isSocketBgOptEnable = defaultSharedPreferences.getBoolean(NETWORK_SOCKET_BG_OPT_ENABLE, true);
        isVpnListenOpened = defaultSharedPreferences.getBoolean(NETWORK_VPN_ENABLE, true);
        isTnetForcePubKey = defaultSharedPreferences.getBoolean(NETWORK_TNET_FORCE_PUBKEY_ENABLE, false);
        ipv6Enable = defaultSharedPreferences.getBoolean(NETWORK_IPV6_ENABLE, true);
        isVpnOptOpened = defaultSharedPreferences.getBoolean(NETWORK_VPN_OPT_ENABLE, true);
        isVpnFastDegradeEnable = defaultSharedPreferences.getBoolean(NETWORK_VPN_FAST_DEGRADE_ENABLE, true);
        isVpnChangeDetectOpened = defaultSharedPreferences.getBoolean(NETWORK_VPN_CHANGE_DETECT_ENABLE, true);
        isHandoverSignalOpened = defaultSharedPreferences.getBoolean(NETWORK_HANDOVER_SIGNAL_ENABLE, false);
        isZstdDictDecompressOpened = defaultSharedPreferences.getBoolean(NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE, false);
        isParamsOpened = defaultSharedPreferences.getBoolean(NETWORK_PARAMS_OPENED, true);
        isAmdcUpdateEnable = defaultSharedPreferences.getBoolean(NETWORK_UPDATE_AMDC_ENABLE, true);
        isAmdcPriorityUpdateEnable = defaultSharedPreferences.getBoolean(NETWORK_PRIORITY_UPDATE_AMDC_ENABLE, false);
        isZstdDictDecompressMtopEnable = defaultSharedPreferences.getBoolean(NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE, false);
        isZstdDictDecompressChannelEnable = defaultSharedPreferences.getBoolean(NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE, true);
        isAmdcFirstRequestOptEnable = defaultSharedPreferences.getBoolean(NETWORK_AMDC_FIRST_REQUEST_OPT_ENABLE, true);
        isXquicRemoteEnable = defaultSharedPreferences.getBoolean(NETWORK_XQUIC_REMOTE_ENABLE, true);
        isPreHostMccNotUseEnable = defaultSharedPreferences.getBoolean(NETWORK_PRE_HOST_MCC_ENABLE, false);
        set1RttHttp3WhiteList(defaultSharedPreferences.getString(HTTP3_1RTT_WHITE_LIST_KEY, null));
        setDetectHostWhiteList(defaultSharedPreferences.getString(NETWORK_DETECT_H3_HOST_WHITE_LIST_KEY, null));
        setCookiePrintLogHostWhiteList(defaultSharedPreferences.getString(NETWORK_COOKIE_LOG_HOST_WHITE_LIST_KEY, null));
        setAcceptEncodeHostWhiteList(defaultSharedPreferences.getString(NETWORK_ACCEPT_ENCODE_WHITE_LIST_KEY, null));
        setMultiConnectWhiteList(defaultSharedPreferences.getString(NETWORK_MULTI_CONNECT_WHITE_LIST_KEY, null));
        setMtopAmdcWhiteList(defaultSharedPreferences.getString(NETWORK_MTOP_AMDC_WHITE_LIST_KEY, null));
        setLongAmdcWhiteList(defaultSharedPreferences.getString(NETWORK_LONG_AMDC_WHITE_LIST_KEY, null));
        setMtopInterceptorWhiteList(defaultSharedPreferences.getString(NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY, null));
        setMtopInterceptorWhiteList(defaultSharedPreferences.getString(NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY, null));
        setUplinkEncodeHostWhiteList(defaultSharedPreferences.getString(NETWORK_UPLINK_COMPRESS_HOST_WHITE_LIST_KEY, null));
        setUplinkEncodeUrlWhiteList(defaultSharedPreferences.getString(NETWORK_UPLINK_COMPRESS_URL_WHITE_LIST_KEY, null));
        setPresetHostHttp3WhiteList(defaultSharedPreferences.getString(NETWORK_PRE_HOST_HTTP3_WHITE_LIST_KEY, null));
        setPresetHostWhiteList(defaultSharedPreferences.getString(NETWORK_PRE_HOST_WHITE_LIST_KEY, null));
        setPresetHostHttp2WhiteList(defaultSharedPreferences.getString(NETWORK_PRE_HOST_HTTP2_WHITE_LIST_KEY, null));
        setVpnProxySessionWhiteList(defaultSharedPreferences.getString(VPN_PROXY_SESSION_WHITE_LIST_KEY, null));
        setVpnFastDegradeHostWhiteList(defaultSharedPreferences.getString(VPN_FAST_DEGRADE_HOST_WHITE_LIST_KEY, null));
        setReqFecSizeWhiteList(defaultSharedPreferences.getString(NETWORK_REQ_FEC_SIZE_WHITE_LIST_KEY, null));
        setReqFecUpSizeWhiteList(defaultSharedPreferences.getString(NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_KEY, null));
        setVpnFastDegradBizIdWhiteList(defaultSharedPreferences.getString(VPN_FAST_DEGRADE_BIZID_WHITE_LIST_KEY, null));
        setZstdDictDecompressWhiteList(defaultSharedPreferences.getString(NETWORK_ZSTD_DICT_WHITE_LIST_KEY, null));
        setLunchAfterAmdcList(defaultSharedPreferences.getString(NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_KEY, null));
        setAmdcStrategyThreshold(defaultSharedPreferences.getString(NETWORK_AMDC_STRATEGY_THRESHOLD_KEY, null));
        setZstdDictThreshold(defaultSharedPreferences.getString(ZSTD_DICT_THRESHOLD, null));
        setZstdDictFailConfig(defaultSharedPreferences.getString(ZSTD_DICT_FAIL_CONFIG_KEY, null));
        setWifiFgForceCellWhiteList(defaultSharedPreferences.getString(NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_KEY, null));
        setUrlMonitorRequestList(defaultSharedPreferences.getString(NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_KEY, null));
        setAllowNoCookieList(defaultSharedPreferences.getString(NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_KEY, null));
        setWifiFgForceCellConfigList(defaultSharedPreferences.getString(NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_KEY, null));
        setMd5ReferWhiteList(defaultSharedPreferences.getString(MD5_REFER_WHITE_LIST_KEY, null));
        setHttp3NetworkChangeWhiteList(defaultSharedPreferences.getString(HTTP3_NETWORK_CHANGE_WHITE_LIST_KEY, null));
        setPreSessionWhiteList(defaultSharedPreferences.getString(NETWORK_PRE_SESSION_WHITE_LIST_KEY, null));
        setAmdcTimeout(defaultSharedPreferences.getInt(NETWORK_AMDC_TIMEOUT_KEY, 3000));
        setAmdcLightTime(defaultSharedPreferences.getInt(NETWORK_AMDC_LIGHT_TIME_KEY, 15000));
        setLazyLoadTnetSecTime(defaultSharedPreferences.getLong(NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_KEY, 15000L));
        setSavePowerTimeInterval(defaultSharedPreferences.getInt(NETWORK_SAVE_POWER_TIME_KEY, 60000));
        setChannelAmdcTtl(defaultSharedPreferences.getInt(NETWORK_CHANNEL_AMDC_TTL_KEY, 2));
        setHttp3OptWhiteList(defaultSharedPreferences.getString(HTTP3_OPT_WHITE_LIST_KEY, null));
        setWaitThreadCountConfig(defaultSharedPreferences.getString(NETWORK_WAIT_THREAD_COUNT_KEY, null));
        setNetworkMetricsTimeConfig(defaultSharedPreferences.getString(NETWORK_RECENT_WIN_TIME_KEY, null));
        String string = defaultSharedPreferences.getString(NETWORK_DOWNLOAD_ASYNC_RATIO, null);
        if (string == null) {
            setDownloadAsyncRatio(1, null, context);
        } else {
            try {
                setDownloadAsyncRatio(Integer.parseInt(string), null, context);
            } catch (Exception e) {
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig exception :" + e, null, new Object[0]);
            }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("download_remoteso");
        copyOnWriteArrayList.add("download_splitdownload");
        copyOnWriteArrayList.add("download_featurepreload");
        copyOnWriteArrayList.add("download_remoteso_preload");
        qosReferList = copyOnWriteArrayList;
        CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList2.add("guangguang.cloudvideocdn.taobao.com");
        copyOnWriteArrayList2.add("tbm-auth.alicdn.com");
        copyOnWriteArrayList2.add("pingjia.alicdn.com");
        copyOnWriteArrayList2.add("daren-auth.alicdn.com");
        copyOnWriteArrayList2.add("tbsvideo.cloudvideocdn.taobao.com");
        copyOnWriteArrayList2.add("bizsec-auth.alicdn.com");
        qosHostWhiteList = copyOnWriteArrayList2;
        CopyOnWriteArrayList<String> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList3.add("ggpick_preload");
        qosBizWhiteList = copyOnWriteArrayList3;
    }

    public static void setDownloadAsync(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9268db", new Object[]{new Boolean(z)});
            return;
        }
        ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync： " + z, null, new Object[0]);
        isDownloadAsyncSwitch = z;
    }

    public static void setDownloadAsyncRatio(int i, SharedPreferences.Editor editor, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9336e10a", new Object[]{new Integer(i), editor, context});
            return;
        }
        if (editor != null) {
            try {
                String valueOf = String.valueOf(i);
                if (valueOf != null) {
                    editor.putString(NETWORK_DOWNLOAD_ASYNC_RATIO, valueOf).apply();
                }
            } catch (Exception e) {
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsyncRatio exp1 :" + e, null, new Object[0]);
            }
        }
        if (i <= 0) {
            ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsyncRatio( 0 )", null, new Object[0]);
            isDownloadAsyncSwitch = false;
        } else if (context != null) {
            try {
                String deviceId = Utils.getDeviceId(context);
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync get utdid: " + deviceId, null, new Object[0]);
                if (deviceId == null) {
                    return;
                }
                int abs = Math.abs(deviceId.hashCode());
                if (abs % i != 0) {
                    return;
                }
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync(true), deviceHash=" + abs, null, new Object[0]);
                isDownloadAsyncSwitch = true;
            } catch (Exception e2) {
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsyncRatio exp2 :" + e2, null, new Object[0]);
            }
        } else {
            ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync( false ) with context null", null, new Object[0]);
            isDownloadAsyncSwitch = false;
        }
    }

    private static String setCoreConfigSpOpenString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81b1a5aa", new Object[]{str, str2});
        }
        try {
            SharedPreferences.Editor edit = SharePreferencesUtils.getCorePreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putString(str2, str);
            edit.apply();
            return str;
        } catch (Exception e) {
            ALog.e(TAG, "setCoreConfigSpOpenString error " + e.toString(), null, new Object[0]);
            return str;
        }
    }

    private static boolean setCoreConfigSpOpenBool(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8774947", new Object[]{new Boolean(z), str})).booleanValue();
        }
        try {
            SharedPreferences.Editor edit = SharePreferencesUtils.getCorePreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putBoolean(str, z);
            edit.apply();
            return z;
        } catch (Throwable th) {
            ALog.e(TAG, "setCoreConfigSpOpenBool error " + th.toString(), null, new Object[0]);
            return z;
        }
    }

    private static boolean setConfigSpOpenBool(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3749f4e6", new Object[]{new Boolean(z), str})).booleanValue();
        }
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putBoolean(str, z);
            edit.apply();
            return z;
        } catch (Exception e) {
            ALog.e(TAG, "setConfigSpOpenBool error " + e.toString(), null, new Object[0]);
            return z;
        }
    }

    private static long setConfigSpOpenLong(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3aad2cf4", new Object[]{new Long(j), str})).longValue();
        }
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putLong(str, j);
            edit.apply();
            return j;
        } catch (Exception e) {
            ALog.e(TAG, "setConfigSpOpenLong error " + e.toString(), null, new Object[0]);
            return j;
        }
    }

    public static void setRangeBoostOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a98d9b", new Object[]{new Boolean(z)});
        } else {
            rangeBoostOpen = setConfigSpOpenBool(z, NETWORK_RANGE_BOOST_OPEN);
        }
    }

    public static void setFragmentFileLengthThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648a08a6", new Object[]{new Long(j)});
        } else {
            fragmentFileLengthThreshold = j;
        }
    }

    public static void setNetworkQosSmoothWindowSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975c6d4", new Object[]{new Integer(i)});
        } else {
            networkQosSmoothWindowSize = i;
        }
    }

    public static void setMultiPathUserToastText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433d5de", new Object[]{str});
        } else {
            multiPathUserToastText = str;
        }
    }

    public static String getMultiPathUserToastText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee60d298", new Object[0]) : multiPathUserToastText;
    }

    public static void setMultiPathToastTireTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8eb71c", new Object[]{new Integer(i)});
        } else if (i < 0) {
        } else {
            multiPathToastTireTime = i;
        }
    }

    public static int getMultiPathToastTireTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b33d9eae", new Object[0])).intValue() : multiPathToastTireTime;
    }

    public static void setFragmentSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8671e70a", new Object[]{new Long(j)});
        } else {
            fragmentSize = j;
        }
    }

    public static int getQosDelayUnit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("70e21202", new Object[0])).intValue() : qosDelayUnit;
    }

    public static int getQoSRecvSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d19897c", new Object[0])).intValue() : recvBpsLimitation;
    }

    public static void setQosDelayUnit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f6af48", new Object[]{new Integer(i)});
        } else {
            qosDelayUnit = i;
        }
    }

    public static void setQosRecvSpeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1b6f2e", new Object[]{new Integer(i)});
        } else {
            recvBpsLimitation = i;
        }
    }

    public static void setQoSQueueABSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5d87ba", new Object[]{new Boolean(z)});
        } else {
            isQoSQueueABSwitch = z;
        }
    }

    public static void setQoSPacingABSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb039c55", new Object[]{new Boolean(z)});
        } else {
            isQoSPacingABSwitch = z;
        }
    }

    public static void setQoSRecvWndABSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827ca324", new Object[]{new Boolean(z)});
        } else {
            isQoSRecvWndABSwitch = z;
        }
    }

    public static boolean isSupportQoS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7292bb05", new Object[]{str})).booleanValue();
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = qosReferList;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty() && str != null) {
            return qosReferList.contains(str);
        }
        return false;
    }

    public static void setQosConf(CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c1241f", new Object[]{copyOnWriteArrayList});
        } else {
            qosReferList = copyOnWriteArrayList;
        }
    }

    public static void setRobustSpeedThreshold(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86243380", new Object[]{new Double(d)});
        } else {
            robustSpeedThreshold = d;
        }
    }

    public static void setPoorSpeedThreshold(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bfccef", new Object[]{new Double(d)});
        } else {
            poorSpeedThreshold = d;
        }
    }

    public static void setQualityNotifyMinInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67ed44c", new Object[]{new Long(j)});
        } else {
            qualityNotifyMinInterval = j;
        }
    }

    public static double getRobustSpeedThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5486f360", new Object[0])).doubleValue() : robustSpeedThreshold;
    }

    public static double getPoorSpeedThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fff41d11", new Object[0])).doubleValue() : poorSpeedThreshold;
    }

    public static long getQualityNotifyMinInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e126e60", new Object[0])).longValue() : qualityNotifyMinInterval;
    }

    public static boolean getRangeBoostOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("91d1ae51", new Object[0])).booleanValue() : rangeBoostOpen;
    }

    public static long getFragmentFileLengthThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db6e785e", new Object[0])).longValue() : fragmentFileLengthThreshold;
    }

    public static long getFragmentSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("791fd9e2", new Object[0])).longValue() : fragmentSize;
    }

    public static int getNetworkQosSmoothWindowSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("437b9df6", new Object[0])).intValue() : networkQosSmoothWindowSize;
    }

    public static boolean isDownloaderAsync() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51e1c7c8", new Object[0])).booleanValue() : isDownloadAsyncSwitch;
    }

    public static void setUseVirtualThread(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5437dfd", new Object[]{new Boolean(z)});
        } else {
            isUseVirtualThread = z;
        }
    }

    public static void setRepeatThreadUseVirtualThread(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d7ae78", new Object[]{new Boolean(z)});
        } else {
            isRepeatThreadUseVirtualThread = setCoreConfigSpOpenBool(z, NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE);
        }
    }

    public static boolean isUseVirtualThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9648c883", new Object[0])).booleanValue();
        }
        boolean z = ("HUAWEI".equalsIgnoreCase(Build.BRAND) || "HONOR".equalsIgnoreCase(Build.BRAND)) && (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27);
        boolean is32Bit = GlobalAppRuntimeInfo.is32Bit();
        ALog.e(TAG, "[is32Bit] bitRet= " + is32Bit, null, new Object[0]);
        return isUseVirtualThread && (z || is32Bit);
    }

    public static boolean isRepeatThreadUseVirtualThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb9230a8", new Object[0])).booleanValue();
        }
        boolean z = ("HUAWEI".equalsIgnoreCase(Build.BRAND) || "HONOR".equalsIgnoreCase(Build.BRAND)) && (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27);
        boolean is32Bit = GlobalAppRuntimeInfo.is32Bit();
        ALog.e(TAG, "[is32Bit] bitRet= " + is32Bit, null, new Object[0]);
        return isRepeatThreadUseVirtualThread && (z || is32Bit);
    }

    public static synchronized void initSetAccessPointStatus(boolean z) {
        synchronized (AwcnConfig.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fc1e021", new Object[]{new Boolean(z)});
                return;
            }
            isAccessPointStatus = z;
            accessPointWhiteList = setArrayListAllMatch("{\"guide-acs.m.taobao.com\":[\"0\"], \"trade-acs.m.taobao.com\":[\"0\"], \"g.alicdn.com\":[\"0\"], \"gw.alicdn.com\":[\"0\"],\"market.m.taobao.com\":[\"0\"],\"msgacs.m.taobao.com\":[\"0\"],\"video-zb.cloudvideocdn.taobao.com\":[\"0\"],\"video-sh.cloudvideocdn.taobao.com\":[\"0\"],\"guangguang.cloudvideocdn.taobao.com\":[\"0\"],\"img.alicdn.com\":[\"0\"],\"umsgacs.m.taobao.com\":[\"0\"],\"mtlexternal.alibabausercontent.com\":[\"0\"],\"mtop-dict.m.taobao.com\":[\"0\"],\"wh-ssr-base-biz5-guide.taobao.com\":[\"0\"],\"pages-fast.m.taobao.com\":[\"0\"],\"pages-g.m.taobao.com\":[\"0\"],\"wh-ssr-base-trade1.taobao.com\":[\"0\"]}");
        }
    }

    public static boolean isAllowAccessPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f20ced8", new Object[0])).booleanValue();
        }
        if (isAccessPointStatus && accessPointWhiteList != null) {
            for (Map.Entry<String, List<String>> entry : accessPointWhiteList.entrySet()) {
                List<String> value = entry.getValue();
                if (value == null || value.isEmpty()) {
                    new ArrayList().add("0");
                    return true;
                } else if ("0".equalsIgnoreCase(value.get(0))) {
                    return true;
                }
            }
            isAccessPointStatus = false;
        }
        return false;
    }

    public static synchronized void updateAccessPointStatus(String str) {
        synchronized (AwcnConfig.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ab20a6", new Object[]{str});
                return;
            }
            if (str != null && !StringUtils.isEmpty(str) && accessPointWhiteList != null) {
                for (Map.Entry<String, List<String>> entry : accessPointWhiteList.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    if (value == null || value.isEmpty()) {
                        value = new ArrayList<>();
                        value.add("0");
                    }
                    String str2 = value.get(0);
                    if (str.equalsIgnoreCase(key) && "0".equalsIgnoreCase(str2)) {
                        value.set(0, "1");
                        accessPointWhiteList.put(key, value);
                        ALog.e(TAG, "[handleSession] updateAccessPointStatus: 0->1", null, "host", key);
                        return;
                    }
                }
            }
        }
    }

    public static void setIpv6CellDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5d65bc", new Object[]{new Boolean(z)});
        } else {
            isIpv6CellDetectEnable = setConfigSpOpenBool(z, NETWORK_IPV6_CELL_DETECT_ENABLE);
        }
    }

    public static boolean isIpv6CellDetectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("217c8e4", new Object[0])).booleanValue() : isIpv6CellDetectEnable;
    }

    public static void setDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310bfa3f", new Object[]{new Boolean(z)});
        } else {
            isDecompressOpened = setConfigSpOpenBool(z, NETWORK_DECOMPRESS_ENABLE);
        }
    }

    public static void setConnRacingEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a71a4e", new Object[]{new Boolean(z)});
        } else {
            isConnRacingEnable = setConfigSpOpenBool(z, NETWORK_CONN_RACING_ENABLE);
        }
    }

    public static boolean isConnRacingEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("58c7de12", new Object[0])).booleanValue() : isConnRacingEnable;
    }

    public static boolean isLaunchOptOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27a6a50a", new Object[0])).booleanValue() : isLaunchOptOpened;
    }

    public static boolean isLaunchOptV1Opened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6862465", new Object[0])).booleanValue() : isLaunchOptV1Opened;
    }

    public static boolean isLaunchOptV2Opened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b6ad726", new Object[0])).booleanValue() : isLaunchOptV2Opened;
    }

    public static void setPreHotOptOpened(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9b8f41", new Object[]{str});
            return;
        }
        preHotStr = setCoreConfigSpOpenString(str, NETWORK_PRE_HOT_STR);
        initPreHotStr();
    }

    public static boolean isStartIpStackDetectOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45766ec0", new Object[0])).booleanValue() : isStartIpStackDetectOpened;
    }

    public static void setStartIpStackDetectOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440e5760", new Object[]{new Boolean(z)});
        } else {
            isStartIpStackDetectOpened = setConfigSpOpenBool(z, NETWORK_START_IP_STACK_DETECT_ENABLE);
        }
    }

    public static boolean isDecompressOpend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d90f9b8", new Object[0])).booleanValue() : isDecompressOpened;
    }

    public static boolean isUseClientIpOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf0d9343", new Object[0])).booleanValue() : isUseClientIpOpened;
    }

    public static void setUseClientIpOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce837cad", new Object[]{new Boolean(z)});
        } else {
            isUseClientIpOpened = setConfigSpOpenBool(z, NETWORK_USE_CLIENT_IP_OPENED);
        }
    }

    public static boolean isIpv6DetectOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43dca7cd", new Object[0])).booleanValue() : isIpv6DetectOptEnable;
    }

    public static void setIpv6DetectOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ee8b63", new Object[]{new Boolean(z)});
        } else {
            isIpv6DetectOptEnable = setConfigSpOpenBool(z, NETWORK_IPV6_DETECT_OPT_OPENED);
        }
    }

    public static boolean isAmdcStrategyOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1cf927f9", new Object[0])).booleanValue() : isAmdcStrategyOptEnable;
    }

    public static void setAmdcStrategyOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871d22b7", new Object[]{new Boolean(z)});
        } else {
            isAmdcStrategyOptEnable = setCoreConfigSpOpenBool(z, NETWORK_AMDC_STRATEGY_OPT_ENABLE);
        }
    }

    public static boolean isGetSessionOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f82a097", new Object[0])).booleanValue() : isGetSessionOptEnable;
    }

    public static void setGetSessionOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd07abd9", new Object[]{new Boolean(z)});
        } else {
            isGetSessionOptEnable = setConfigSpOpenBool(z, NETWORK_GET_SESSION_OPT_ENABLE);
        }
    }

    public static boolean isNotAllowCookieOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a442e998", new Object[0])).booleanValue() : isNotAllowCookieOpened;
    }

    public static void setNotAllowCookieOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e965b88", new Object[]{new Boolean(z)});
        } else {
            isNotAllowCookieOpened = setCoreConfigSpOpenBool(z, NETWORK_COOKIE_OPT_V2_OPENED);
        }
    }

    public static void setSslSpOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662768fe", new Object[]{new Boolean(z)});
        } else {
            isSslSpOptEnable = setCoreConfigSpOpenBool(z, NETWORK_SSL_SP_OPT_ENABLE);
        }
    }

    public static boolean isSslSpOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d09b8b62", new Object[0])).booleanValue() : isSslSpOptEnable;
    }

    public static void setAmdcStrategyUpdateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb601b21", new Object[]{new Boolean(z)});
        } else {
            isAmdcStrategyUpdateEnable = setCoreConfigSpOpenBool(z, NETWORK_AMDC_STRATEGY_UPDATE_ENABLE);
        }
    }

    public static boolean isAmdcStrategyUpdateEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cecaedf", new Object[0])).booleanValue() : isAmdcStrategyUpdateEnable;
    }

    public static boolean isLaunchOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65efe524", new Object[0])).booleanValue() : isLaunchOptEnable;
    }

    public static void setLaunchOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed754ec", new Object[]{new Boolean(z)});
        } else {
            isLaunchOptEnable = setCoreConfigSpOpenBool(z, NETWORK_LAUNCH_OPT_ENABLE);
        }
    }

    public static boolean isCookieOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7c72613", new Object[0])).booleanValue() : isCookieOptEnable;
    }

    public static void setCookieOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e831dd", new Object[]{new Boolean(z)});
        } else {
            isCookieOptEnable = setCoreConfigSpOpenBool(z, NETWORK_COOKIE_OPT_ENABLE);
        }
    }

    public static void setOrangeOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5ce427", new Object[]{new Boolean(z)});
        } else {
            isOrangeOptEnable = setCoreConfigSpOpenBool(z, NETWORK_ORANGE_OPT_ENABLE);
        }
    }

    public static boolean isOrangeOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("512e0289", new Object[0])).booleanValue();
        }
        ALog.e(TAG, "isOrangeOptEnable=" + isOrangeOptEnable, null, "isSecondRefreshABEnable", Boolean.valueOf(isSecondRefreshABEnable));
        return isOrangeOptEnable && isSecondRefreshABEnable;
    }

    public static void setCurrentProcessOpt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd93832", new Object[]{new Boolean(z)});
        } else {
            isCurrentProcessOpt = setCoreConfigSpOpenBool(z, NETWORK_CURRENT_PROESS_OPT_ENABLE);
        }
    }

    public static boolean isCurrentProcessOpt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fffd31e", new Object[0])).booleanValue() : isCurrentProcessOpt;
    }

    public static boolean isSecondRefreshABEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c1cfecc", new Object[0])).booleanValue() : isSecondRefreshABEnable;
    }

    public static void setSecondRefreshABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec742644", new Object[]{new Boolean(z)});
        } else {
            isSecondRefreshABEnable = z;
        }
    }

    public static boolean isGetSchemeOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a344090", new Object[0])).booleanValue() : isGetSchemeOptEnable;
    }

    public static void setGetSchemeOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec353590", new Object[]{new Boolean(z)});
        } else {
            isGetSchemeOptEnable = setCoreConfigSpOpenBool(z, NETWORK_GET_SCHEME_OPT_ENABLE);
        }
    }

    public static int isZstdDictABEnable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4d1", new Object[]{str})).intValue();
        }
        if (str == null || str.isEmpty()) {
            return -1;
        }
        if (!str.contains("mtop.taobao.wireless.home.newface.awesome.get") && !str.contains("mtop.taobao.wireless.home.newface.awesome.newget")) {
            return -1;
        }
        return isZstdDictABEnable ? 1 : 0;
    }

    public static void setZstdDictABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854f6108", new Object[]{new Boolean(z)});
        } else {
            isZstdDictABEnable = z;
        }
    }

    public static void setAmdcPresetHosts(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70dd1e10", new Object[]{str});
        } else if (!GlobalAppRuntimeInfo.isTargetProcess() || StringUtils.isEmpty(str)) {
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str);
                HttpDispatcher.getInstance().clearInitHost();
                HttpDispatcher.getInstance().addHosts(setArrayListCheckIp(jSONArray));
            } catch (JSONException e) {
                ALog.e(TAG, "setAmdcPresetHosts failed", null, e, new Object[0]);
            }
        }
    }

    private static CopyOnWriteArrayList<String> setArrayListCheckIp(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("489db548", new Object[]{jSONArray});
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (anet.channel.strategy.utils.Utils.checkHostValidAndNotIp(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            return copyOnWriteArrayList;
        } catch (Exception e) {
            ALog.e(TAG, "[setArrayListCheckIp] error", null, e, new Object[0]);
            return null;
        }
    }

    public static boolean isIpv6WifiDualStackOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90ba981b", new Object[0])).booleanValue() : isIpv6WifiDualStackOptEnable;
    }

    public static void setIpv6WifiDualStackOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8caf8765", new Object[]{new Boolean(z)});
        } else {
            isIpv6WifiDualStackOptEnable = setConfigSpOpenBool(z, NETWORK_IPV6_WIFI_DUAL_STACK_OPT_ENABLE);
        }
    }

    public static boolean isUpdateIpStackEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ffbc4abc", new Object[0])).booleanValue() : isUpdateIpStackEnable;
    }

    public static void setUpdateIpStackEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34034654", new Object[]{new Boolean(z)});
        } else {
            isUpdateIpStackEnable = setConfigSpOpenBool(z, NETWORK_UPDATE_IP_STACK_ENABLE);
        }
    }

    public static void setUplinkEncodeOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bff117", new Object[]{new Boolean(z)});
        } else {
            isUplinkEncodeOpened = setConfigSpOpenBool(z, NETWORK_UPLINK_ENCODE_ENABLE);
        }
    }

    public static boolean isUplinkEncodeOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4307829", new Object[0])).booleanValue() : isUplinkEncodeOpened;
    }

    public static void setGzipDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e874e05", new Object[]{new Boolean(z)});
        } else {
            isGzipDecompressOpend = setConfigSpOpenBool(z, NETWORK_GZIP_DECOMPRESS_ENABLE);
        }
    }

    public static boolean isGzipDecompressOpend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92aaaafe", new Object[0])).booleanValue() : isGzipDecompressOpend;
    }

    public static void setSocketBgOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b1b11", new Object[]{new Boolean(z)});
        } else {
            isSocketBgOptEnable = setConfigSpOpenBool(z, NETWORK_SOCKET_BG_OPT_ENABLE);
        }
    }

    public static boolean isSocketBgOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e56985f", new Object[0])).booleanValue() : isSocketBgOptEnable;
    }

    public static void setLowPowerOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db6e5d1", new Object[]{new Boolean(z)});
        } else {
            isLowPowerOpened = setConfigSpOpenBool(z, NETWORK_LOW_POWER_ENABLE);
        }
    }

    public static boolean isLowPowerOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("778fa82f", new Object[0])).booleanValue() : isLowPowerOpened;
    }

    public static void setAmdcNotUseIpv6Opened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a9407c", new Object[]{new Boolean(z)});
        } else {
            isAmdcNotUseIpv6 = setConfigSpOpenBool(z, NETWORK_AMDC_NOT_USE_IPV6_ENABLE);
        }
    }

    public static boolean isAmdcNotUseIpv6Opened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4859624", new Object[0])).booleanValue() : isAmdcNotUseIpv6;
    }

    public static void setTunnelOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c9e0e1", new Object[]{new Boolean(z)});
        } else {
            isTunnelOptEnable = setConfigSpOpenBool(z, NETWORK_TUNNEL_OPT_ENABLE);
        }
    }

    public static boolean isTunnelOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3531868f", new Object[0])).booleanValue() : isTunnelOptEnable;
    }

    public static void setLazyLoadSecurityEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166ef98e", new Object[]{new Boolean(z)});
        } else {
            isLazyLoadSecurityEnable = setConfigSpOpenBool(z, NETWORK_LAZY_LOAD_SECURITY_ENABLE);
        }
    }

    public static boolean isLazyLoadSecurityEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dac060d2", new Object[0])).booleanValue() : isLazyLoadSecurityEnable;
    }

    public static void setWaitThreadCountConfig(String str) {
        CopyOnWriteArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694ae321", new Object[]{str});
        } else if (str == null) {
        } else {
            try {
                if (!str.isEmpty() && (arrayList = setArrayList(str)) != null && arrayList.size() == 2) {
                    isWaitThreadCountEnable = Boolean.parseBoolean(arrayList.get(0));
                    waitThreadCount = Integer.parseInt(arrayList.get(1));
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[setZstdDictThreshold] error", null, th, new Object[0]);
                isWaitThreadCountEnable = false;
                waitThreadCount = 2;
            }
        }
    }

    public static boolean isWaitThreadCountEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("528e6b14", new Object[0])).booleanValue() : isWaitThreadCountEnable;
    }

    public static int getWaitThreadCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6403db4", new Object[0])).intValue() : waitThreadCount;
    }

    public static void setWaitThreadCountABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ddefbb", new Object[]{new Boolean(z)});
        } else {
            isWaitThreadCountABEnable = z;
        }
    }

    public static boolean isWaitThreadCountABEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5817c75", new Object[0])).booleanValue() : isWaitThreadCountABEnable;
    }

    public static void setNetworkMetricsTimeConfig(String str) {
        CopyOnWriteArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98aecd97", new Object[]{str});
        } else if (str == null) {
        } else {
            try {
                if (!str.isEmpty() && (arrayList = setArrayList(str)) != null && arrayList.size() == 2) {
                    recentWinTime = Long.parseLong(arrayList.get(0));
                    updateMetricsTime = Long.parseLong(arrayList.get(1));
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[setNetworkMetricsTimeConfig] error", null, th, new Object[0]);
                recentWinTime = 5000L;
                updateMetricsTime = 5000L;
            }
        }
    }

    public static long getRecentWinTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1bc22eb3", new Object[0])).longValue() : recentWinTime;
    }

    public static long getUpdateMetricsTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d29de0ec", new Object[0])).longValue() : updateMetricsTime;
    }

    public static void setLazyLoadTnetSecTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47eaf784", new Object[]{new Long(j)});
        } else {
            lazyLoadTnetSecTime = j;
        }
    }

    public static boolean isTnetLazyLoadSecEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("887e2032", new Object[0])).booleanValue();
        }
        if (lazyLoadTnetSecTime > 0 && "com.taobao.taobao".equalsIgnoreCase(GlobalAppRuntimeInfo.getCurrentProcess()) && GlobalAppRuntimeInfo.getInitTime() != -1) {
            long currentTimeMillis = System.currentTimeMillis() - GlobalAppRuntimeInfo.getInitTime();
            ALog.e(TAG, "[LazyLoadTnetSec] isLazyLoadTnetSecTime, intervalTime=" + currentTimeMillis, null, "lazyLoadTnetSecTime", Long.valueOf(lazyLoadTnetSecTime));
            if (currentTimeMillis <= lazyLoadTnetSecTime) {
                return true;
            }
        }
        return false;
    }

    public static void setTnetForcePubKey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dadcab", new Object[]{new Boolean(z)});
        } else {
            isTnetForcePubKey = setConfigSpOpenBool(z, NETWORK_TNET_FORCE_PUBKEY_ENABLE);
        }
    }

    public static boolean isTnetForcePubKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b48ce985", new Object[0])).booleanValue() : isTnetForcePubKey;
    }

    public static void setVpnListenOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d5c10b", new Object[]{new Boolean(z)});
        } else {
            isVpnListenOpened = setConfigSpOpenBool(z, NETWORK_VPN_ENABLE);
        }
    }

    public static boolean isVpnListenOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("173f925", new Object[0])).booleanValue() : isVpnListenOpened;
    }

    public static void setVpnOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2fe1983", new Object[]{new Boolean(z)});
        } else {
            isVpnOptOpened = setConfigSpOpenBool(z, NETWORK_VPN_OPT_ENABLE);
        }
    }

    public static boolean isVpnOptOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1987483d", new Object[0])).booleanValue() : isVpnOptOpened;
    }

    public static void setVpnFastDegradeEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c037c14", new Object[]{new Boolean(z)});
        } else {
            isVpnFastDegradeEnable = setConfigSpOpenBool(z, NETWORK_VPN_FAST_DEGRADE_ENABLE);
        }
    }

    public static boolean isVpnFastDegradeEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9e252de", new Object[0])).booleanValue() : isVpnFastDegradeEnable;
    }

    public static void setVpnFastDegradeABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fbde41", new Object[]{new Boolean(z)});
        } else {
            isVpnFastDegradeABEnable = z;
        }
    }

    public static boolean isVpnFastDegradeABEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d77a99bf", new Object[0])).booleanValue() : isVpnFastDegradeABEnable;
    }

    public static void setVpnFastDegradeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed28468", new Object[]{str});
        } else {
            vpnFastDegradeHostWhiteList = setArrayListAllMatch(str);
        }
    }

    public static boolean inVpnFastDegradeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ab7be09", new Object[]{str})).booleanValue() : isPrefixInArrayList(str, vpnFastDegradeHostWhiteList);
    }

    public static void setVpnFastDegradBizIdWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84131e87", new Object[]{str});
        } else {
            vpnFastDegradBizIdWhiteList = setArrayList(str);
        }
    }

    public static boolean inVpnFastDegradBizIdWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ff85828", new Object[]{str})).booleanValue() : isHostInArrayList(str, vpnFastDegradBizIdWhiteList);
    }

    public static void setVpnFastDegradTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f304453", new Object[]{new Long(j)});
        } else {
            vpnFastDegradTime = j;
        }
    }

    public static long getVpnFastDegradTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6dd61211", new Object[0])).longValue() : vpnFastDegradTime;
    }

    public static void setVpnListenTimeInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79dfb12", new Object[]{new Long(j)});
        } else {
            vpnListenTimeInterval = j;
        }
    }

    public static long getVpnListenTimeInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41cd6172", new Object[0])).longValue() : vpnListenTimeInterval;
    }

    public static void setVpnFgChangeCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d237af1", new Object[]{new Long(j)});
        } else {
            vpnFgChangeCount = j;
        }
    }

    public static long getVpnFgChangeCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b932131b", new Object[0])).longValue() : vpnFgChangeCount;
    }

    public static void setAmdcTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989a4c68", new Object[]{new Integer(i)});
        } else {
            amdcTimeout = i;
        }
    }

    public static int getAmdcTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28ec4c7a", new Object[0])).intValue() : amdcTimeout;
    }

    public static void setAmdcLightTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa01d287", new Object[]{new Long(j)});
        } else {
            amdcLightTime = j;
        }
    }

    public static long getAmdcLightTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34bc935d", new Object[0])).longValue() : amdcLightTime;
    }

    public static void setSavePowerTimeInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5dbe905", new Object[]{new Long(j)});
        } else {
            savePowerTimeInterval = j;
        }
    }

    public static long getSavePowerTimeInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37f0691f", new Object[0])).longValue() : savePowerTimeInterval;
    }

    public static void setDetectHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff67a50b", new Object[]{str});
        } else {
            detectHostWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInDetectHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33ac1e5a", new Object[]{str})).booleanValue() : isHostInArrayList(str, detectHostWhiteList);
    }

    public static void setCookiePrintLogHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe93ad3", new Object[]{str});
        } else {
            cookiePrintLogWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInCookiePrintLogWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c36d32ea", new Object[]{str})).booleanValue() : isHostInArrayList(str, cookiePrintLogWhiteList);
    }

    public static void setAcceptEncodeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecfee10", new Object[]{str});
        } else {
            acceptEncodeWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInAcceptEncodeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d0b8367", new Object[]{str})).booleanValue() : isHostInArrayList(str, acceptEncodeWhiteList);
    }

    public static void setDetectH3OptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d239d21", new Object[]{new Boolean(z)});
        } else {
            isDetectH3OptOpened = setConfigSpOpenBool(z, NETWORK_DETECT_H3_OPT_ENABLE);
        }
    }

    public static boolean isDetectH3OptOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6d944f", new Object[0])).booleanValue() : isDetectH3OptOpened;
    }

    public static void setWifiUnavailableUseCellOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6e4be1", new Object[]{new Boolean(z)});
        } else {
            isWifiUnavailableUseCellOptOpened = setConfigSpOpenBool(z, NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE);
        }
    }

    public static boolean isWifiUnavailableUseCellOptOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b684b8f", new Object[0])).booleanValue() : isWifiUnavailableUseCellOptOpened && "com.taobao.taobao".equalsIgnoreCase(GlobalAppRuntimeInfo.getCurrentProcess());
    }

    public static void setWifiFgForceCellWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac5c0e3", new Object[]{str});
        } else {
            wifiFgForceCellWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInWifiFgForceCellWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b605e7c", new Object[]{str})).booleanValue() : isHostInArrayList(str, wifiFgForceCellWhiteList);
    }

    public static void setAllowNoCookieList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26681e7b", new Object[]{str});
        } else {
            allowNoCookieList = setArrayList(str);
        }
    }

    public static boolean isAllowNoCookieList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af53fcb7", new Object[]{str})).booleanValue() : isUrlInArrayList(str, allowNoCookieList);
    }

    public static void setUrlMonitorRequestList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9177d131", new Object[]{str});
        } else {
            urlMonitorRequestList = setArrayList(str);
        }
    }

    public static boolean isUrlInMonitorRequestList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13984e72", new Object[]{str})).booleanValue() : isUrlInArrayList(str, urlMonitorRequestList);
    }

    public static void setWifiFgForceCellConfigList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a22dc6", new Object[]{str});
        } else if (str == null || StringUtils.isEmpty(str)) {
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() != 6) {
                    return;
                }
                String string = jSONArray.getString(0);
                if (string != null || !string.isEmpty()) {
                    continueTimeoutCount = Integer.parseInt(string);
                }
                String string2 = jSONArray.getString(1);
                if (string2 != null || !string2.isEmpty()) {
                    periodTimeoutCount = Integer.parseInt(string2);
                }
                String string3 = jSONArray.getString(2);
                if (string3 != null || !string3.isEmpty()) {
                    periodTime = Long.parseLong(string3);
                }
                String string4 = jSONArray.getString(3);
                if (string4 != null || !string4.isEmpty()) {
                    detectIntervalTime = Long.parseLong(string4);
                }
                String string5 = jSONArray.getString(4);
                if (string5 != null || !string5.isEmpty()) {
                    allowUseCellFlowSize = Long.parseLong(string5);
                }
                String string6 = jSONArray.getString(5);
                if (string6 == null && string6.isEmpty()) {
                    return;
                }
                detectReadTimeOut = Integer.parseInt(string6);
            } catch (Throwable th) {
                ALog.e(TAG, "[setWifiFgForceCellConfigList] error", null, th, new Object[0]);
            }
        }
    }

    public static int getContinueTimeoutCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf6d9e5", new Object[0])).intValue() : continueTimeoutCount;
    }

    public static int getPeriodTimeoutCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7af9947f", new Object[0])).intValue() : periodTimeoutCount;
    }

    public static long getPeriodTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b6c3fe9f", new Object[0])).longValue() : periodTime;
    }

    public static long getDetectIntervalTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad949866", new Object[0])).longValue() : detectIntervalTime;
    }

    public static long getAllowUseCellFlowSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a537c0e0", new Object[0])).longValue() : allowUseCellFlowSize;
    }

    public static int getDetectReadTimeOut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("11f34eec", new Object[0])).intValue() : detectReadTimeOut;
    }

    public static void setVpnProxySessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8caa9be", new Object[]{str});
        } else {
            vpnProxySessionWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInVpnProxySessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79654757", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, vpnProxySessionWhiteList) || isHostInArrayList(str, new CopyOnWriteArrayList(HttpDispatcher.getInstance().getInitHosts()));
    }

    public static void setMultiConnectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57524a45", new Object[]{str});
        } else {
            multiConnectWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInMultiConnectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c5d9cd4", new Object[]{str})).booleanValue() : isHostInArrayList(str, multiConnectWhiteList);
    }

    public static void setMtopAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf292e3", new Object[]{str});
        } else {
            mtopAmdcWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInMtopAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c40ae2f2", new Object[]{str})).booleanValue() : isHostInArrayList(str, mtopAmdcWhiteList);
    }

    public static void setLongAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d173bdaf", new Object[]{str});
        } else {
            longAmdcWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInLongAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea8c0dbe", new Object[]{str})).booleanValue() : isHostInArrayList(str, longAmdcWhiteList);
    }

    public static long getInterceptorOptType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30bbd619", new Object[0])).longValue() : interceptorOptType;
    }

    public static void setInterceptorOptType(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcef4ab3", new Object[]{new Long(j)});
        } else {
            interceptorOptType = setConfigSpOpenLong(j, NETWORK_INTERCEPTOR_OPT_TYPE);
        }
    }

    public static void setMtopInterceptorWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa3a1bd", new Object[]{str});
        } else {
            mtopInterceptorWhiteList = setHashMap(str);
        }
    }

    public static boolean isHostInMtopInterceptorWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d03e3f56", new Object[]{str})).booleanValue() : (str == null || StringUtils.isEmpty(str) || mtopInterceptorWhiteList == null || mtopInterceptorWhiteList.get(str) == null) ? false : true;
    }

    public static void setMultiConnectOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42c8b71", new Object[]{new Boolean(z)});
        } else {
            isMultiConnectOpened = setConfigSpOpenBool(z, NETWORK_MULTI_CONNECT_ENABLE);
        }
    }

    public static boolean isMultiConnectOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3afa2a8f", new Object[0])).booleanValue() : isMultiConnectOpened;
    }

    public static void setUplinkEncodeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b3dca3", new Object[]{str});
        } else {
            uplinkEncodeHostWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInUplinkEncodeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b86cf1b2", new Object[]{str})).booleanValue() : isHostInArrayList(str, uplinkEncodeHostWhiteList);
    }

    public static void setUplinkEncodeUrlWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9ba236", new Object[]{str});
        } else {
            uplinkEncodeUrlWhiteList = setArrayListAllMatch(str);
        }
    }

    public static String getUplinkEncodeByUrlWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5e4021f", new Object[]{str});
        }
        String keyInArrayList = getKeyInArrayList(str, uplinkEncodeUrlWhiteList);
        return (keyInArrayList == null || keyInArrayList.isEmpty()) ? "gzip" : keyInArrayList;
    }

    public static void setPresetHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6349f4f", new Object[]{str});
        } else {
            presetHostWhiteList = setArrayListAllMatch(str);
        }
    }

    public static ConcurrentHashMap<String, List<String>> getPresetHostWhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("ed59ef75", new Object[0]) : presetHostWhiteList;
    }

    public static void setPresetHostHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb15056", new Object[]{str});
        } else {
            presetHostHttp3WhiteList = setArrayListAllMatch(str);
        }
    }

    public static ConcurrentHashMap<String, List<String>> getPresetHostHttp3WhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("8831166", new Object[0]) : presetHostHttp3WhiteList;
    }

    public static void setPresetHostHttp2WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96811077", new Object[]{str});
        } else {
            presetHostHttp2WhiteList = setArrayListAllMatch(str);
        }
    }

    public static ConcurrentHashMap<String, List<String>> getPresetHostHttp2WhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("7b485fe5", new Object[0]) : presetHostHttp2WhiteList;
    }

    public static void setZstdStreamDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e4d2ff6", new Object[]{new Boolean(z)});
        } else {
            isZstdStreamDecompressOpened = setConfigSpOpenBool(z, NETWORK_ZSTD_STREAM_DECOMPRESS_ENABLE);
        }
    }

    public static boolean isZstdStreamDecompressOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("956d196a", new Object[0])).booleanValue() : isZstdStreamDecompressOpened;
    }

    public static void setVpnChangeDetectOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1dde5f", new Object[]{new Boolean(z)});
        } else {
            isVpnChangeDetectOpened = setConfigSpOpenBool(z, NETWORK_VPN_CHANGE_DETECT_ENABLE);
        }
    }

    public static boolean isVpnChangeDetectOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c9e5751", new Object[0])).booleanValue() : isVpnChangeDetectOpened;
    }

    public static void setXquicRemoteEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f52a50", new Object[]{new Boolean(z)});
        } else {
            isXquicRemoteEnable = setConfigSpOpenBool(z, NETWORK_XQUIC_REMOTE_ENABLE);
        }
    }

    public static boolean isXquicRemoteEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acae2540", new Object[0])).booleanValue() : isXquicRemoteEnable;
    }

    public static void setHandoverSignalOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cdb6d7", new Object[]{new Boolean(z)});
        } else {
            isHandoverSignalOpened = setConfigSpOpenBool(z, NETWORK_HANDOVER_SIGNAL_ENABLE);
        }
    }

    public static boolean isHandoverSignalOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d1b6869", new Object[0])).booleanValue() : isHandoverSignalOpened;
    }

    public static void setZstdDictDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbd2c0", new Object[]{new Boolean(z)});
        } else {
            isZstdDictDecompressOpened = setConfigSpOpenBool(z, NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE);
        }
    }

    public static boolean isZstdDictDecompressOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("856c0760", new Object[0])).booleanValue() : isZstdDictDecompressOpened;
    }

    public static void setParamsOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4202bc", new Object[]{new Boolean(z)});
        } else {
            isParamsOpened = setConfigSpOpenBool(z, NETWORK_PARAMS_OPENED);
        }
    }

    public static boolean isParamsOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cf4d3e4", new Object[0])).booleanValue() : isParamsOpened;
    }

    public static void setAmdcUpdateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6a8d54", new Object[]{new Boolean(z)});
        } else {
            isAmdcUpdateEnable = setConfigSpOpenBool(z, NETWORK_UPDATE_AMDC_ENABLE);
        }
    }

    public static boolean isAmdcUpdateEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23e6f24c", new Object[0])).booleanValue();
        }
        ALog.e(TAG, "[Launcher] key" + GlobalAppRuntimeInfo.getAppkey(), null, "isAmdcUpdateEnable", Boolean.valueOf(isAmdcUpdateEnable));
        return isAmdcUpdateEnable && "21646297".equalsIgnoreCase(GlobalAppRuntimeInfo.getAppkey());
    }

    public static void setAmdcPriorityUpdateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5a4d10", new Object[]{new Boolean(z)});
        } else {
            isAmdcPriorityUpdateEnable = setConfigSpOpenBool(z, NETWORK_PRIORITY_UPDATE_AMDC_ENABLE);
        }
    }

    public static boolean isAmdcPriorityUpdateEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4cfd0310", new Object[0])).booleanValue() : isAmdcPriorityUpdateEnable;
    }

    public static void setZstdDictDecompressMtopEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c774fe", new Object[]{new Boolean(z)});
        } else {
            isZstdDictDecompressMtopEnable = setConfigSpOpenBool(z, NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE);
        }
    }

    public static boolean isZstdDictDecompressMtopEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26ec8162", new Object[0])).booleanValue() : isZstdDictDecompressMtopEnable;
    }

    public static void setZstdDictDecompressChannelEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaf6cab", new Object[]{new Boolean(z)});
        } else {
            isZstdDictDecompressChannelEnable = setConfigSpOpenBool(z, NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE);
        }
    }

    public static boolean isZstdDictDecompressChannelEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7ae985", new Object[0])).booleanValue();
        }
        if (!GlobalAppRuntimeInfo.isChannelProcess(GlobalAppRuntimeInfo.getContext())) {
            return true;
        }
        return isZstdDictDecompressChannelEnable;
    }

    public static void setAmdcFirstRequestOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74764d83", new Object[]{new Boolean(z)});
        } else {
            isAmdcFirstRequestOptEnable = setConfigSpOpenBool(z, NETWORK_AMDC_FIRST_REQUEST_OPT_ENABLE);
        }
    }

    public static boolean isAmdcFirstRequestOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b56e97ad", new Object[0])).booleanValue() : isAmdcFirstRequestOptEnable;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f838a158", new Object[0])).booleanValue() : isAccsSessionCreateForbiddenInBg;
    }

    public static void setMd5Open(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b314cc7", new Object[]{new Boolean(z)});
        } else {
            isMd5Opened = setConfigSpOpenBool(z, NETWORK_MD5_ENABLE);
        }
    }

    public static boolean isMd5Open(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed0ca47d", new Object[]{str, str2})).booleanValue() : str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && isMd5Opened && !str.contains("??") && isMd5ReferWhiteList(str2);
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9881c8", new Object[]{new Boolean(z)});
        } else {
            isAccsSessionCreateForbiddenInBg = z;
        }
    }

    public static void setHttpsSniEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9d6745", new Object[]{new Boolean(z)});
        } else {
            isHttpsSniEnable = z;
        }
    }

    public static boolean isHttpsSniEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3d9283b", new Object[0])).booleanValue() : isHttpsSniEnable;
    }

    public static boolean isHorseRaceEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("578e8df2", new Object[0])).booleanValue() : isHorseRaceEnable;
    }

    public static void setHorseRaceEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10dc5de", new Object[]{new Boolean(z)});
        } else {
            isHorseRaceEnable = z;
        }
    }

    public static void registerPresetSessions(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37aa3370", new Object[]{str});
        } else if (GlobalAppRuntimeInfo.isTargetProcess() && !StringUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("host");
                    if (!anet.channel.strategy.utils.Utils.checkHostValidAndNotIp(string)) {
                        return;
                    }
                    StrategyTemplate.getInstance().registerConnProtocol(GlobalAppRuntimeInfo.getContext(), string, ConnProtocol.valueOf(jSONObject.getString("protocol"), jSONObject.getString("rtt"), jSONObject.getString("publicKey")));
                    if (jSONObject.getBoolean("isKeepAlive")) {
                        SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, (IAuth) null, (IHeartbeat) null, (CustomDataFrameCb) null));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean isIpv6Enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fae0d9f", new Object[0])).booleanValue() : ipv6Enable;
    }

    public static void setIpv6Enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62875261", new Object[]{new Boolean(z)});
        } else {
            ipv6Enable = setConfigSpOpenBool(z, NETWORK_IPV6_ENABLE);
        }
    }

    public static boolean isAsyncLoadStrategyEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("112ce9f9", new Object[0])).booleanValue() : isAsyncLoadStrategyEnable;
    }

    public static void setAsyncLoadStrategyEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa032b7", new Object[]{new Boolean(z)});
        } else {
            isAsyncLoadStrategyEnable = z;
        }
    }

    public static boolean isAsyncIpStackDetect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("234fb0dd", new Object[0])).booleanValue() : isAsyncIpStackDetect;
    }

    public static boolean isTbNextLaunch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db7ce969", new Object[0])).booleanValue() : isTbNextLaunch;
    }

    public static void setTbNextLaunch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbc9dd7", new Object[]{new Boolean(z)});
        } else {
            isTbNextLaunch = z;
        }
    }

    public static boolean isNetworkDetectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("122fa155", new Object[0])).booleanValue() : isNetworkDetectEnable;
    }

    public static void setNetworkDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffac2db", new Object[]{new Boolean(z)});
        } else {
            isNetworkDetectEnable = z;
        }
    }

    public static int getAccsReconnectionDelayPeriod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8bb1f465", new Object[0])).intValue() : accsReconnectionDelayPeriod;
    }

    public static void setAccsReconnectionDelayPeriod(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb609dd", new Object[]{new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > 600000) {
            i = 600000;
        }
        accsReconnectionDelayPeriod = i;
    }

    public static void setHttp3Enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec23a661", new Object[]{new Boolean(z)});
        } else {
            isHttp3Enable = z;
        }
    }

    public static boolean isHttp3Enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6ed0f", new Object[0])).booleanValue() : isHttp3Enable;
    }

    public static boolean isLastStatusNoneOpt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1fafb514", new Object[0])).booleanValue() : isLastStatusNoneOpt;
    }

    public static void setLastStatusNoneOpt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922594fc", new Object[]{new Boolean(z)});
        } else {
            isLastStatusNoneOpt = setConfigSpOpenBool(z, NETWORK_LAST_STATUS_NONE_ENABLE);
        }
    }

    public static boolean isNetworkStatusOpt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("caca4e28", new Object[0])).booleanValue() : isNetworkStatusOpt;
    }

    public static void setNetworkStatusOpt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f2acf8", new Object[]{new Boolean(z)});
        } else {
            isNetworkStatusOpt = setConfigSpOpenBool(z, NETWORK_STATUS_OPT_ENABLE);
        }
    }

    public static boolean isPreSessionOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23151b64", new Object[0])).booleanValue() : isPreSessionOptEnable;
    }

    public static void setPreSessionOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc48aac", new Object[]{new Boolean(z)});
        } else {
            isPreSessionOptEnable = setConfigSpOpenBool(z, NETWORK_PRE_SESSION_OPT_ENABLE);
        }
    }

    public static boolean isSpdyOfflineEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2bbebe35", new Object[0])).booleanValue() : isSpdyOfflineEnable;
    }

    public static void setSpdyOfflineEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7affb", new Object[]{new Boolean(z)});
        } else {
            isSpdyOfflineEnable = setConfigSpOpenBool(z, NETWORK_SPDY_OFFLINE_ENABLE);
        }
    }

    public static void setHttp3DefaultEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b90ffd2", new Object[]{new Boolean(z)});
        } else {
            isHttp3DefaultEnable = z;
        }
    }

    public static boolean isHttp3DefaultEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2f5260e", new Object[0])).booleanValue() : isHttp3DefaultEnable;
    }

    public static void setXquicCongControl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd42378", new Object[]{new Integer(i)});
        } else if (i < 0) {
        } else {
            xquicCongControl = i;
        }
    }

    public static int getXquicCongControl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3716bdd2", new Object[0])).intValue() : xquicCongControl;
    }

    public static void setCookieHeaderRedundantFix(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1b5cf2", new Object[]{new Boolean(z)});
        } else {
            isCookieHeaderRedundantFix = z;
        }
    }

    public static boolean isCookieHeaderRedundantFix() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8c96eee", new Object[0])).booleanValue() : isCookieHeaderRedundantFix;
    }

    public static void setCell5GBandwidthQualityCoeff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df87122", new Object[]{new Double(d)});
        } else {
            cell5GBandwidthQualityCoeff = d;
        }
    }

    public static void setCell4GBandwidthQualityCoeff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2769c3", new Object[]{new Double(d)});
        } else {
            cell4GBandwidthQualityCoeff = d;
        }
    }

    public static void setDoublePathsSlipdownCoeff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d108fb", new Object[]{new Double(d)});
        } else {
            doublePathsSlipdownCoeff = d;
        }
    }

    public static double getCell5GBandwidthQualityCoeff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46931116", new Object[0])).doubleValue() : cell5GBandwidthQualityCoeff;
    }

    public static double getCell4GBandwidthQualityCoeff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d420055", new Object[0])).doubleValue() : cell4GBandwidthQualityCoeff;
    }

    public static double getDoublePathsSlipdownCoeff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f75f6885", new Object[0])).doubleValue() : doublePathsSlipdownCoeff;
    }

    public static void setSendConnectInfoByService(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6674ee7d", new Object[]{new Boolean(z)});
        } else {
            isSendConnectInfoByService = z;
        }
    }

    public static boolean isSendConnectInfoByService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4820003", new Object[0])).booleanValue() : isSendConnectInfoByService;
    }

    public static CopyOnWriteArrayList<String> setArrayList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("e991e4d3", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return getArrayList(new JSONArray(str));
        } catch (Exception e) {
            ALog.e(TAG, "[seArraytList] error", null, e, new Object[0]);
            return null;
        }
    }

    public static void setDnsOptWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6828a4c", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "setDnsOptWhiteBiz", null, "White List", str);
        }
        dnsNavTasksList = setArrayListMatchUrl(str);
    }

    private static ArrayList<DnsNavConfigTask> setArrayListMatchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("666f3a0a", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList<DnsNavConfigTask> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!StringUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    arrayList.add(new DnsNavConfigTask(jSONObject.get(DnsNavConfigTask.MatchKey).toString(), jSONObject.get(DnsNavConfigTask.MatchType).toString(), setArrayList(jSONObject.get(DnsNavConfigTask.PreCONN).toString()), setArrayList(jSONObject.get(DnsNavConfigTask.PreDNS).toString())));
                }
            }
            return arrayList;
        } catch (Exception e) {
            ALog.e(TAG, "[setArrayListMatchUrl] error", null, e, new Object[0]);
            return null;
        }
    }

    private static boolean isMatchUrl(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176cb771", new Object[]{str, str2, str3, str4, str5})).booleanValue();
        }
        try {
        } catch (Exception e) {
            ALog.e(TAG, "[isMatchUrl] error", null, e, new Object[0]);
        }
        if ("domain".equalsIgnoreCase(str5) && str3 != null && !str3.isEmpty()) {
            return str4.equalsIgnoreCase(str3);
        }
        if (DnsNavConfigTask.PathPrefix.equalsIgnoreCase(str5) && str2 != null && !str2.isEmpty()) {
            return str2.startsWith(str4);
        }
        if (DnsNavConfigTask.PathComplete.equalsIgnoreCase(str5) && str2 != null && !str2.isEmpty()) {
            return str2.equalsIgnoreCase(str4);
        }
        if (DnsNavConfigTask.URLPrefix.equalsIgnoreCase(str5) && str != null && !str.isEmpty()) {
            return str.startsWith(str4);
        }
        if (DnsNavConfigTask.URLComplete.equalsIgnoreCase(str5) && str != null && !str.isEmpty()) {
            return str.equalsIgnoreCase(str4);
        }
        return false;
    }

    public static boolean isDnsOptWhiteList(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43cca951", new Object[]{uri})).booleanValue();
        }
        ArrayList<DnsNavConfigTask> arrayList = dnsNavTasksList;
        if (arrayList != null && !arrayList.isEmpty() && uri != null) {
            Iterator<DnsNavConfigTask> it = arrayList.iterator();
            while (it.hasNext()) {
                DnsNavConfigTask next = it.next();
                if (isMatchUrl(uri.toString(), uri.getPath(), uri.getHost(), next.getMatchKey(), next.getMatchType())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> getMatchHostListByOption(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10dd1b3e", new Object[]{uri, str});
        }
        ArrayList<DnsNavConfigTask> arrayList = dnsNavTasksList;
        if (arrayList != null && !arrayList.isEmpty() && uri != null) {
            try {
                String path = uri.getPath();
                String host = uri.getHost();
                String uri2 = uri.toString();
                if (path != null && !path.isEmpty() && host != null && !host.isEmpty() && uri2 != null && !uri2.isEmpty()) {
                    Iterator<DnsNavConfigTask> it = arrayList.iterator();
                    while (it.hasNext()) {
                        DnsNavConfigTask next = it.next();
                        String matchKey = next.getMatchKey();
                        String matchType = next.getMatchType();
                        if (next.getMatchKey() == null || matchKey == null || matchKey.isEmpty() || matchType == null || matchType.isEmpty()) {
                            break;
                        } else if ("domain".equalsIgnoreCase(matchType) && matchKey.equalsIgnoreCase(host)) {
                            return next.getHostListByOption(str);
                        } else {
                            if (DnsNavConfigTask.PathPrefix.equalsIgnoreCase(matchType) && path.startsWith(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                            if (DnsNavConfigTask.PathComplete.equalsIgnoreCase(matchType) && path.equalsIgnoreCase(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                            if (DnsNavConfigTask.URLPrefix.equalsIgnoreCase(matchType) && uri2.startsWith(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                            if (DnsNavConfigTask.URLComplete.equalsIgnoreCase(matchType) && uri2.equalsIgnoreCase(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                        }
                    }
                }
                return null;
            } catch (Exception e) {
                ALog.e(TAG, "[getMatchHostListByOption] error", null, e, new Object[0]);
            }
        }
        return null;
    }

    private static ConcurrentHashMap<String, List<String>> setArrayListAllMatch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("d7dc4abc", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, ALLOW_ALL_PATH);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i = 0; i < length; i++) {
                            Object obj2 = jSONArray.get(i);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e) {
            ALog.e(TAG, "setArrayListAllMatch failed", null, e, new Object[0]);
        }
        return concurrentHashMap;
    }

    private static CopyOnWriteArrayList<String> getArrayList(JSONArray jSONArray) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("b0938d2f", new Object[]{jSONArray});
        }
        try {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!StringUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                } catch (Exception e) {
                    e = e;
                    ALog.e(TAG, "[getArrayList] error", null, e, new Object[0]);
                    return copyOnWriteArrayList;
                }
            }
        } catch (Exception e2) {
            e = e2;
            copyOnWriteArrayList = null;
        }
        return copyOnWriteArrayList;
    }

    private static ConcurrentHashMap<String, Integer> setHashMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("1c497109", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!StringUtils.isEmpty(string)) {
                    concurrentHashMap.put(string, Integer.valueOf(i));
                }
            }
            return concurrentHashMap;
        } catch (Exception e) {
            ALog.e(TAG, "[setHashMap] error", null, e, new Object[0]);
            return null;
        }
    }

    public static boolean isHostInArrayList(String str, CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70496b30", new Object[]{str, copyOnWriteArrayList})).booleanValue();
        }
        if (str != null && !StringUtils.isEmpty(str) && copyOnWriteArrayList != null) {
            return copyOnWriteArrayList.contains(str);
        }
        return false;
    }

    public static boolean isUrlInArrayList(String str, CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f30d64a3", new Object[]{str, copyOnWriteArrayList})).booleanValue();
        }
        if (str != null && !StringUtils.isEmpty(str) && copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<String> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrefixInArrayList(String str, ConcurrentHashMap<String, List<String>> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32f4e3db", new Object[]{str, concurrentHashMap})).booleanValue();
        }
        if (str != null && !StringUtils.isEmpty(str) && concurrentHashMap != null) {
            for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                if (str.startsWith(entry.getKey())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getKeyInArrayList(String str, ConcurrentHashMap<String, List<String>> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f20636", new Object[]{str, concurrentHashMap});
        }
        if (str != null && !StringUtils.isEmpty(str) && concurrentHashMap != null) {
            for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                for (String str2 : entry.getValue()) {
                    if ("*".equalsIgnoreCase(str2)) {
                        return entry.getKey();
                    }
                    if (str.startsWith(str2)) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public static boolean isHostInArrayListAllMatch(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ce104ea", new Object[]{str, list})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || list == null) {
            return false;
        }
        return list.contains("*") || list.contains(str);
    }

    public static void setHttpDnsNotifyWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21259b0", new Object[]{str});
        } else {
            httpDnsNotifyWhiteList = setArrayList(str);
        }
    }

    public static boolean isAllowHttpDnsNotify(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7a86c80", new Object[]{str})).booleanValue() : isHostInArrayList(str, httpDnsNotifyWhiteList);
    }

    public static void setIpv6OnlyEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e55395", new Object[]{new Boolean(z)});
        } else {
            isIpv6OnlyEnable = z;
        }
    }

    public static boolean isIpv6OnlyEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60ba71eb", new Object[0])).booleanValue() : isIpv6OnlyEnable;
    }

    public static boolean isHttp3ReconnectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9c46be4", new Object[0])).booleanValue() : isHttp3ReconnectEnable;
    }

    public static void setHttp3ReconnectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94522bc", new Object[]{new Boolean(z)});
        } else {
            isHttp3ReconnectEnable = setConfigSpOpenBool(z, NETWORK_HTTP3_RECONNECT_ENABLE);
        }
    }

    public static boolean isReqFecSizeOptEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43e90b30", new Object[0])).booleanValue() : isReqFecSizeOptEnable;
    }

    public static void setReqFecSizeOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756e9460", new Object[]{new Boolean(z)});
        } else {
            isReqFecSizeOptEnable = setConfigSpOpenBool(z, NETWORK_REQ_FEC_SIZE_OPT_ENABLE);
        }
    }

    public static void setReqFecUpSizeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f95ab4", new Object[]{str});
        } else {
            reqFecUpSizeWhiteList = setArrayListAllMatch(str);
        }
    }

    public static int getReqUpFecSize(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f309d610", new Object[]{str, str2})).intValue() : getReqFecSize(reqFecUpSizeWhiteList, str, str2);
    }

    public static void setReqFecSizeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de7154f", new Object[]{str});
        } else {
            reqFecSizeWhiteList = setArrayListAllMatch(str);
        }
    }

    public static int getReqDownFecSize(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e07f6f29", new Object[]{str, str2})).intValue() : getReqFecSize(reqFecSizeWhiteList, str, str2);
    }

    private static int getReqFecSize(ConcurrentHashMap<String, List<String>> concurrentHashMap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cefbc3fb", new Object[]{concurrentHashMap, str, str2})).intValue();
        }
        if (str != null) {
            try {
                if (!StringUtils.isEmpty(str)) {
                    if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                        for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                            List<String> value = entry.getValue();
                            if (value != null && !value.isEmpty()) {
                                int parseInt = Integer.parseInt(entry.getKey());
                                for (String str3 : value) {
                                    if (str.contains(str3)) {
                                        return parseInt << 10;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    return 1;
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[getReqFecSize] error", str2, th, new Object[0]);
            }
        }
        return -1;
    }

    public static void setIsAllowConvertIPv4ToIPv6(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36810630", new Object[]{new Boolean(z)});
        } else {
            isAllowConvertIPv4ToIPv6 = z;
        }
    }

    public static boolean isAllowConvertIPv4ToIPv6() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99f587a6", new Object[0])).booleanValue() : isAllowConvertIPv4ToIPv6;
    }

    public static void setHttp3PreHostEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6b14e8", new Object[]{new Boolean(z)});
        } else {
            isHttp3PreHostEnable = setConfigSpOpenBool(z, NETWORK_HTTP3_PRE_HOST_ENABLE);
        }
    }

    public static boolean isHttp3PreHostEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35991638", new Object[0])).booleanValue() : isHttp3PreHostEnable;
    }

    public static void setVpnIpSwitchOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6055a397", new Object[]{new Boolean(z)});
        } else {
            isVpnIpSwitchOpened = setConfigSpOpenBool(z, NETWORK_VPN_IP_OPT_ENABLE);
        }
    }

    public static boolean isVpnIpSwitchOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e445e719", new Object[0])).booleanValue() : isVpnIpSwitchOpened;
    }

    public static void setAmdcRetryStrategySwitchOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993e8022", new Object[]{new Boolean(z)});
        } else {
            isAmdcRetryStrategySwitchOpened = setConfigSpOpenBool(z, NETWORK_AMDC_RETRY_STRATEGY_OPT_ENABLE);
        }
    }

    public static boolean isAmdcRetryStrategySwitchOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9629392e", new Object[0])).booleanValue() : isAmdcRetryStrategySwitchOpened;
    }

    public static void setAllowRetryUseLongLinkEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a20b5c4e", new Object[]{new Boolean(z)});
        } else {
            isAllowRetryUseLongLinkEnable = setConfigSpOpenBool(z, NETWORK_RETRY_USE_LONG_LINK_ENABLE);
        }
    }

    public static boolean isAllowRetryUseLongLinkEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b86d582", new Object[0])).booleanValue() : isAllowRetryUseLongLinkEnable;
    }

    public static void setPreHostMccNotUseEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b4fcf2", new Object[]{new Boolean(z)});
        } else {
            isPreHostMccNotUseEnable = setConfigSpOpenBool(z, NETWORK_PRE_HOST_MCC_ENABLE);
        }
    }

    public static boolean isPreHostMccNotUseEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9aba60ee", new Object[0])).booleanValue() : isPreHostMccNotUseEnable;
    }

    public static void setHttp3VipBlackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd49b37a", new Object[]{str});
        } else {
            http3VipBlackList = setArrayList(str);
        }
    }

    public static boolean isHttp3VipBlackList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("463591b6", new Object[]{str})).booleanValue() : isHostInArrayList(str, http3VipBlackList);
    }

    public static void setHttp3BlackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faadd65", new Object[]{str});
        } else {
            http3BlackList = setArrayList(str);
        }
    }

    public static boolean isHostInHttp3BlackList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d6c813e", new Object[]{str})).booleanValue() : isHostInArrayList(str, http3BlackList);
    }

    public static void setHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448ad90f", new Object[]{str});
        } else {
            http3WhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("124c7ce8", new Object[]{str})).booleanValue() : isHostInArrayList(str, http3WhiteList);
    }

    public static void setLunchAfterAmdcList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ac6eae", new Object[]{str});
        } else if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                lunchAfterAmdcList = new CopyOnWriteArraySet<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (!StringUtils.isEmpty(string)) {
                        lunchAfterAmdcList.add(string);
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "[setLunchAfterAmdcList] error", null, e, new Object[0]);
            }
        }
    }

    public static CopyOnWriteArraySet<String> getLunchAfterAmdcList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("2cf16f71", new Object[0]) : lunchAfterAmdcList;
    }

    public static void setZstdDictDecompressWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbbd414", new Object[]{str});
        } else {
            zstdDictDecompressWhiteList = setArrayListAllMatch(str);
        }
    }

    public static boolean isZstdDictDecompressWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3f14c50", new Object[]{str})).booleanValue() : isPrefixInArrayList(str, zstdDictDecompressWhiteList);
    }

    public static void setZstdDictFailConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7067f2", new Object[]{str});
            return;
        }
        try {
            CopyOnWriteArrayList<String> arrayList = setArrayList(str);
            if (arrayList != null && arrayList.size() == 2) {
                zstdDictFailIntervalTime = Integer.parseInt(arrayList.get(0));
                zstdDictFailCount = Integer.parseInt(arrayList.get(1));
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[setZstdDictFailConfig] error", null, th, new Object[0]);
            zstdDictFailIntervalTime = 300000L;
            zstdDictFailCount = 5L;
        }
    }

    public static long getZstdDictFailIntervalTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("619197c0", new Object[0])).longValue() : zstdDictFailIntervalTime;
    }

    public static long getZstdDictFailCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("299f7a57", new Object[0])).longValue() : zstdDictFailCount;
    }

    public static void setZstdDictThreshold(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6b473b", new Object[]{str});
            return;
        }
        try {
            CopyOnWriteArrayList<String> arrayList = setArrayList(str);
            if (arrayList != null && arrayList.size() == 6) {
                zstdFileMaxCount = Integer.parseInt(arrayList.get(0));
                zstdDictMaxCount = Integer.parseInt(arrayList.get(1));
                zstdDictMaxLength = Long.parseLong(arrayList.get(2));
                zstdPerDictMaxLength = Long.parseLong(arrayList.get(3));
                zstdDictProtectUpdateTime = Long.parseLong(arrayList.get(4));
                zstdLinkDictIntervalTime = Long.parseLong(arrayList.get(5));
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[setZstdDictThreshold] error", null, th, new Object[0]);
            zstdFileMaxCount = 10;
            zstdDictMaxCount = 10;
            zstdDictMaxLength = 4194304L;
            zstdPerDictMaxLength = 256000L;
            zstdDictProtectUpdateTime = 3600000L;
            zstdLinkDictIntervalTime = 300000L;
        }
    }

    public static long getZstdTtl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73711052", new Object[]{str})).longValue() : getZstdDictAttributes(str, 0);
    }

    public static int getZstdFileMaxCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa8432a0", new Object[0])).intValue() : zstdFileMaxCount;
    }

    public static int getZstdDictMaxCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4041c1da", new Object[0])).intValue() : zstdDictMaxCount;
    }

    public static long getZstdDictMaxLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d9f4ab0", new Object[0])).longValue() : zstdDictMaxLength;
    }

    public static long getZstdPerDictMaxLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c657c3b1", new Object[0])).longValue() : zstdPerDictMaxLength;
    }

    public static long getZstdDictProtectUpdateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("754cd82b", new Object[0])).longValue() : zstdDictProtectUpdateTime;
    }

    public static long getZstdLinkDictIntervalTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1fef769c", new Object[0])).longValue() : zstdLinkDictIntervalTime;
    }

    private static long getZstdDictAttributes(String str, int i) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e9cd59a", new Object[]{str, new Integer(i)})).longValue();
        }
        try {
            concurrentHashMap = zstdDictDecompressWhiteList;
        } catch (Throwable th) {
            ALog.e(TAG, "[getZstdDictAttributes] error", null, th, new Object[0]);
        }
        if (str != null && !StringUtils.isEmpty(str) && concurrentHashMap != null && i >= 0) {
            Iterator<Map.Entry<String, List<String>>> it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    list = null;
                    break;
                }
                Map.Entry<String, List<String>> next = it.next();
                if (str.startsWith(next.getKey())) {
                    list = concurrentHashMap.get(next.getKey());
                    break;
                }
            }
            if (list != null && !list.isEmpty() && list.size() > 0 && list.size() > i && (str2 = list.get(i)) != null && !str2.isEmpty()) {
                return Long.parseLong(str2);
            }
            return -1L;
        }
        return -1L;
    }

    public static void setAmdcStrategyThreshold(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e800b4dc", new Object[]{str});
        } else if (str == null || StringUtils.isEmpty(str)) {
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() != 4) {
                    return;
                }
                String string = jSONArray.getString(0);
                if (string != null || !string.isEmpty()) {
                    mtopAmdcThreshold = Integer.parseInt(string);
                }
                String string2 = jSONArray.getString(1);
                if (string2 != null || !string2.isEmpty()) {
                    otherAmdcThreshold = Integer.parseInt(string2);
                }
                String string3 = jSONArray.getString(2);
                if (string3 != null || !string3.isEmpty()) {
                    longAmdcThreshold = Integer.parseInt(string3);
                }
                String string4 = jSONArray.getString(3);
                if (string4 == null && string4.isEmpty()) {
                    return;
                }
                amdcClearThreshold = Integer.parseInt(string4);
            } catch (Throwable th) {
                ALog.e(TAG, "[setAmdcStrategyThreshold] error", null, th, new Object[0]);
            }
        }
    }

    public static long getMtopAmdcThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("117488dd", new Object[0])).longValue() : mtopAmdcThreshold;
    }

    public static long getOtherAmdcThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0a7b541", new Object[0])).longValue() : otherAmdcThreshold;
    }

    public static long getLongAmdcThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7e70ea9", new Object[0])).longValue() : longAmdcThreshold;
    }

    public static long getAmdcClearThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6aea161a", new Object[0])).longValue() : amdcClearThreshold;
    }

    public static boolean isHttp3NetworkChangeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("78defc9f", new Object[]{str})).booleanValue() : isHostInArrayList(str, http3NetworkChangeWhiteList);
    }

    public static void setHttp3NetworkChangeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a98463", new Object[]{str});
        } else {
            http3NetworkChangeWhiteList = setArrayList(str);
        }
    }

    public static boolean isPreSessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c43830bf", new Object[]{str})).booleanValue() : isHostInArrayList(str, preSessionWhiteList);
    }

    public static void setPreSessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cb0083", new Object[]{str});
        } else {
            preSessionWhiteList = setArrayList(str);
        }
    }

    public static boolean isAllowUsePreSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51c2d1b0", new Object[]{str})).booleanValue();
        }
        if (str != null && !str.isEmpty()) {
            if (usePreSessionMap == null) {
                usePreSessionMap = new ConcurrentHashMap<>();
            }
            if (!usePreSessionMap.containsKey(str)) {
                usePreSessionMap.put(str, -1);
                return true;
            } else if (usePreSessionMap.get(str).intValue() == -1) {
                return true;
            }
        }
        return false;
    }

    public static void updateUsePreSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20404ce2", new Object[]{str});
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = usePreSessionMap;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        usePreSessionMap.remove(str);
        usePreSessionMap.put(str, 1);
    }

    public static boolean isHostIn1RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65d52569", new Object[]{str})).booleanValue() : isHostInArrayList(str, http3_1RttWhiteList);
    }

    public static void set1RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be37410", new Object[]{str});
        } else {
            http3_1RttWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostIn0RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb7348a", new Object[]{str})).booleanValue() : isHostInArrayList(str, http3_0RttWhiteList);
    }

    public static void set0RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c58331", new Object[]{str});
        } else {
            http3_0RttWhiteList = setArrayList(str);
        }
    }

    public static boolean isHostInAllowRetryUseLongLinkWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4192b055", new Object[]{str})).booleanValue() : isHostInArrayList(str, allowRetryUseLongLinkWhiteList);
    }

    public static void setAllowRetryUseLongLinkWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d021567c", new Object[]{str});
        } else {
            allowRetryUseLongLinkWhiteList = setArrayList(str);
        }
    }

    public static boolean isMd5ReferWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e8e3530", new Object[]{str})).booleanValue() : isHostInArrayList(str, md5ReferWhiteList);
    }

    public static void setMd5ReferWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a256f4", new Object[]{str});
        } else {
            md5ReferWhiteList = setArrayList(str);
        }
    }

    public static void setQosBizWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe5e5d8", new Object[]{str});
        } else {
            qosBizWhiteList = setArrayList(str);
        }
    }

    public static boolean isQosBizWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c023f214", new Object[]{str})).booleanValue() : isHostInArrayList(str, qosBizWhiteList);
    }

    public static void setQosHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5119e59d", new Object[]{str});
        } else {
            qosHostWhiteList = setArrayList(str);
        }
    }

    public static boolean isQosHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b89d6069", new Object[]{str})).booleanValue() : isHostInArrayList(str, qosHostWhiteList);
    }

    public static boolean isHostInHttp3DefaultWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad61628f", new Object[]{str})).booleanValue() : isHostInArrayList(str, http3DefaultWhiteList);
    }

    public static void setHttp3OptWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f275ce", new Object[]{str});
        } else {
            http3DefaultWhiteList = setArrayList(str);
        }
    }

    public static CopyOnWriteArrayList<String> getExceptionDetectUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("9691c7e7", new Object[0]);
        }
        if (exceptionDetectUrlList == null) {
            exceptionDetectUrlList = new CopyOnWriteArrayList<>();
        }
        return exceptionDetectUrlList;
    }

    public static void setExceptionDetectUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b88d90", new Object[]{str});
        } else {
            exceptionDetectUrlList = setArrayList(str);
        }
    }

    public static boolean isAllowHttpDetect(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39808dff", new Object[]{str})).booleanValue() : isHostInArrayList(str, httpDetectWhiteList);
    }

    public static void setHttpDetectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b6caab", new Object[]{str});
        } else {
            httpDetectWhiteList = setArrayList(str);
        }
    }

    public static void setHttpDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246b7dfd", new Object[]{new Boolean(z)});
        } else {
            isHttpDetectEnable = z;
        }
    }

    public static boolean isHttpDetectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b220c883", new Object[0])).booleanValue() : isHttpDetectEnable;
    }

    public static boolean isAmdcReduceFrequencyEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("940c1f4f", new Object[0])).booleanValue() : isAmdcReduceFrequencyEnable;
    }

    public static void setAmdcReduceFrequencyEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6989ba21", new Object[]{new Boolean(z)});
        } else {
            isAmdcReduceFrequencyEnable = setConfigSpOpenBool(z, NETWORK_AMDC_REDUCE_FREQUENCY_ENABLE);
        }
    }

    public static void setDetectCenterEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4979f8d0", new Object[]{new Boolean(z)});
        } else {
            isDetectCenterEnable = z;
        }
    }

    public static boolean isDetectCenterEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebaa1550", new Object[0])).booleanValue() : isDetectCenterEnable;
    }

    public static void setMultiNetworkMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8a4667", new Object[]{new Boolean(z)});
        } else {
            isMultiPathMonitorEnable = z;
        }
    }

    public static boolean isMultiPathMonitorEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a95bcf4", new Object[0])).booleanValue() : isMultiPathMonitorEnable;
    }

    public static void setHarmonyWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed3e4d4", new Object[]{str});
        } else {
            multiPathHarmonyWhiteList = setArrayList(str);
        }
    }

    public static boolean isInHarmonyWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a0a8aa5", new Object[]{str})).booleanValue() : isHostInArrayListAllMatch(str, multiPathHarmonyWhiteList);
    }

    public static boolean isComplexConnectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15628d92", new Object[0])).booleanValue() : isComplexConnectEnable;
    }

    public static void setComplexConnectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16b36ce", new Object[]{new Boolean(z)});
        } else {
            isComplexConnectEnable = z;
        }
    }

    public static void setComplexConnectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378af0fc", new Object[]{str});
        } else {
            complexConnectWhiteList = setArrayList(str);
        }
    }

    public static boolean isAllowComplexConnect(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c828a20e", new Object[]{str})).booleanValue() : isHostInArrayListAllMatch(str, complexConnectWhiteList);
    }

    public static void setComplexConnectDelayTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bfdb869", new Object[]{new Long(j)});
        } else {
            complexConnectDelayTime = j;
        }
    }

    public static long getComplexConnectDelayTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2196a3b", new Object[0])).longValue() : complexConnectDelayTime;
    }

    public static void setChannelAmdcTtl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5745c5d", new Object[]{new Long(j)});
        } else {
            channelAmdcTtl = j;
        }
    }

    public static long getChannelAmdcTtl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66f1012f", new Object[0])).longValue() : channelAmdcTtl;
    }

    public static boolean isIpv6DetectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5c08fe2", new Object[0])).booleanValue() : isIpv6DetectEnable;
    }

    public static void setIpv6DetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c4a27e", new Object[]{new Boolean(z)});
        } else {
            isIpv6DetectEnable = z;
        }
    }

    public static boolean isTicketStoreUpgrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a192edfc", new Object[0])).booleanValue() : isTicketStoreUpgrade;
    }

    public static void setTicketStoreUpgrade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ac35a4", new Object[]{new Boolean(z)});
        } else {
            isTicketStoreUpgrade = z;
        }
    }

    public static void setMTUDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8c3a5b", new Object[]{new Boolean(z)});
        } else {
            isMTUDetectEnable = z;
        }
    }

    public static boolean isMTUDetectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("866115d5", new Object[0])).booleanValue() : isMTUDetectEnable;
    }

    public static void setMTUConnectOptimize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15db33b2", new Object[]{new Boolean(z)});
        } else {
            isMTUConnectOptimize = z;
        }
    }

    public static boolean isMTUConnectOptimize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ea4f62e", new Object[0])).booleanValue() : isMTUConnectOptimize;
    }

    public static boolean isTunnelEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c0bf860", new Object[0])).booleanValue() : isTunnelEnable;
    }

    public static void setTunnelEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f6dc0", new Object[]{new Boolean(z)});
        } else {
            isTunnelEnable = z;
        }
    }

    public static void setIpv6RectificationEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26e54b9", new Object[]{new Boolean(z)});
        } else {
            isIpv6RectificationEnable = z;
        }
    }

    public static boolean isIpv6RectificationEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("76f17fb7", new Object[0])).booleanValue() : isIpv6RectificationEnable;
    }

    public static boolean isOkHttpEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28c2317c", new Object[0])).booleanValue() : isOkHttpEnable;
    }

    public static void setOkHttpEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b205824", new Object[]{new Boolean(z)});
        } else {
            isOkHttpEnable = z;
        }
    }

    public static void setOkhttpHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f0e3aa", new Object[]{str});
        } else {
            okhttpHostWhiteList = setArrayList(str);
        }
    }

    public static boolean isInOkhttpWhiteList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c86f009", new Object[]{str})).booleanValue() : isHostInArrayListAllMatch(str, okhttpHostWhiteList);
    }

    public static void setOkhttpPreBuildList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909088a0", new Object[]{str});
        } else {
            okhttpPreBuildList = setArrayList(str);
        }
    }

    public static List<String> getOkhttpPreBuildList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("15d88bd", new Object[0]) : okhttpPreBuildList;
    }

    public static boolean isRTTDetectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a0b2099", new Object[0])).booleanValue() : isRTTDetectEnable;
    }

    public static void setRTTDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e238817", new Object[]{new Boolean(z)});
        } else {
            isRTTDetectEnable = z;
        }
    }

    public static boolean isSmoothReconnectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("580224ad", new Object[0])).booleanValue() : isSmoothReconnectEnable;
    }

    public static void setSmoothReconnectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad33bc83", new Object[]{new Boolean(z)});
        } else {
            isSmoothReconnectEnable = setConfigSpOpenBool(z, NETWORK_SMOOTH_RECONNECT_ENABLE);
        }
    }

    public static boolean isSmoothReconnectOptOpened() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3559b08", new Object[0])).booleanValue() : isSmoothReconnectOptOpened;
    }

    public static void setSmoothReconnectOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6214b418", new Object[]{new Boolean(z)});
        } else {
            isSmoothReconnectOptOpened = setConfigSpOpenBool(z, NETWORK_SMOOTH_RECONNECT_OPT_OPENED);
        }
    }

    public static boolean isSessionReuseOptimized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc29634a", new Object[0])).booleanValue() : isSessionReuseOptimized;
    }

    public static void setSessionReuseOptimized(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df45186", new Object[]{new Boolean(z)});
        } else {
            isSessionReuseOptimized = z;
        }
    }

    public static void setSocketBoostHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6a9f07", new Object[]{str});
        } else {
            socketBoostHostWhiteList = setArrayList(str);
        }
    }

    public static boolean isSocketBoostHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dda8ab43", new Object[]{str})).booleanValue() : isHostInArrayList(str, socketBoostHostWhiteList);
    }

    public static void setMPQuicConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d3a0b4", new Object[]{new Boolean(z)});
        } else {
            isMPQuicConfigSwitch = z;
        }
    }

    public static void setMPQuicUserSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e54bcb", new Object[]{new Boolean(z)});
        } else {
            isMPQuicUserSwitch = z;
        }
    }

    public static boolean isMPQuicUserSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f76f08f5", new Object[0])).booleanValue() : isMPQuicUserSwitch;
    }

    public static boolean isMPQuicEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e68a2f19", new Object[0])).booleanValue() : isMPQuicConfigSwitch && isMPQuicUserSwitch;
    }

    public static boolean isEagainOptimizeEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c77b3810", new Object[0])).booleanValue() : isEagainOptimizeEnable;
    }

    public static void setEagainOptimizeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7267dc10", new Object[]{new Boolean(z)});
        } else {
            isEagainOptimizeEnable = z;
        }
    }
}
