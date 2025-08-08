package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import org.android.netutil.UtilTool;
import org.android.spdy.spduLog;

/* loaded from: classes.dex */
public class sac {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CORE_SP_NAME = "network_core_init_config";
    public static final String SP_NAME = "tnet_android_config";
    public static final String TNET_TRUSTED_ROOT_CERT = "trusted_root_cert";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33452a = false;
    private static SharedPreferences b;
    private static SharedPreferences c;
    private static Context d;

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f33452a = true;
        } catch (Exception unused) {
            f33452a = false;
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!f33452a || context == null) {
            spduLog.Logi("tnetsdk.RemoteConfigImp", "RemoteConfigImp register fail");
        } else {
            d = context;
            try {
                OrangeConfig.getInstance().registerListener(new String[]{"tnet4Android_sdk"}, new g() { // from class: tb.sac.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.orange.g
                    public void onConfigUpdate(String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        } else {
                            sac.a(str);
                        }
                    }
                });
            } catch (Exception unused) {
            }
            try {
                b = context.getSharedPreferences(SP_NAME, 0);
                c = c(context);
                sad.a(a("tlog_enable_switch", true));
                sad.b(a("jni_tlog_enable_switch", true));
                sad.a(a("jni_tlog_xquic_level", 2L));
                sad.b(a("quic_connect_timeout_ms", 5000L));
                sad.c(a("tcp_connect_timeout_ms", (long) sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS));
                sad.f(a("tunnel_proxy_enable_switch", true));
                sad.g(a("request_read_idle_timeout_switch", true));
                sad.i(a("http3_opt_dev_enable", true));
                sad.o(a("http_zstd_enable", true));
                sad.l(a("agent_free_enable", false));
                sad.z(b("common_switch_config", ""));
                sad.f(b("connect_fast_timeout_host_white_list", ""));
                sad.b(b("multi_network_harmony_white_list", ""));
                sad.d(b("weak_network_force_cellular_host_white_list", ""));
                sad.k(b("mpquic_connect_compensate_host_white_list", ""));
                sad.h(b("request_idle_timeout_parameter_config", ""));
                sad.i(b("mpquic_parameter_config", ""));
                sad.a(b("multi_network_background_brand_block_list", ""));
                sad.t(b("cdn_connect_option", ""));
                if ("com.taobao.taobao".equals(UtilTool.a())) {
                    sad.r(b("request_limit_speed_host_white_list", "[\"mtlexternal.alibabausercontent.com\"]"));
                    sad.x(b("multi_session_host_white_list", "[\"heic.alicdn.com\",\"gw.alicdn.com\"]"));
                    sad.A(b("request_timeout_block_list", "{\"guide-acs.m.taobao.com\":[\"/gw/mtop.relationrecommend.mtoprecommend.recommendstream/1.0\"]}\n"));
                    sad.B(b("quic_0rtt_connect_fast_timeout_host_white", "[\"pages-fast.m.taobao.com\"]"));
                }
                Boolean isABGlobalFeatureOpened = UtilTool.isABGlobalFeatureOpened(context, "tnet_connect_fast_timeout_ab_enable");
                if (isABGlobalFeatureOpened != null) {
                    sad.s(isABGlobalFeatureOpened.booleanValue());
                }
                Boolean isABGlobalFeatureOpened2 = UtilTool.isABGlobalFeatureOpened(context, "tnet_tunnel_closed");
                if (isABGlobalFeatureOpened2 != null) {
                    sad.u(isABGlobalFeatureOpened2.booleanValue());
                }
                Boolean isABGlobalFeatureOpened3 = UtilTool.isABGlobalFeatureOpened(context, "tnet_request_read_idle_timeout_ab_enable");
                if (isABGlobalFeatureOpened3 != null) {
                    sad.z(isABGlobalFeatureOpened3.booleanValue());
                }
                Boolean isABGlobalFeatureOpened4 = UtilTool.isABGlobalFeatureOpened(context, "tnet_body_read_idle_timeout_ab_exp");
                if (isABGlobalFeatureOpened4 != null) {
                    sad.A(isABGlobalFeatureOpened4.booleanValue());
                }
                Boolean isABGlobalFeatureOpened5 = UtilTool.isABGlobalFeatureOpened(context, "tnet_mpquic_compensate_enable");
                if (isABGlobalFeatureOpened5 != null) {
                    sad.w(isABGlobalFeatureOpened5.booleanValue());
                }
                Boolean isABGlobalFeatureOpened6 = UtilTool.isABGlobalFeatureOpened(context, "tnet_amdc_mp_disable");
                if (isABGlobalFeatureOpened6 != null) {
                    sad.y(isABGlobalFeatureOpened6.booleanValue());
                }
                Boolean isABGlobalFeatureOpened7 = UtilTool.isABGlobalFeatureOpened(context, "quic_connect_option_picture_enable");
                if (isABGlobalFeatureOpened7 != null) {
                    sad.C(isABGlobalFeatureOpened7.booleanValue());
                }
                Boolean isABGlobalFeatureOpened8 = UtilTool.isABGlobalFeatureOpened(context, "tnet_fec_enable");
                if (isABGlobalFeatureOpened8 != null) {
                    sad.x(isABGlobalFeatureOpened8.booleanValue());
                }
                Boolean isABGlobalFeatureOpened9 = UtilTool.isABGlobalFeatureOpened(context, "tnet_fec_mask_enable");
                if (isABGlobalFeatureOpened9 == null) {
                    return;
                }
                sad.E(isABGlobalFeatureOpened9.booleanValue());
            } catch (Exception e) {
                spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "register fail", e);
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x007d -> B:178:0x007d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x02ff -> B:181:0x02ff). Please submit an issue!!! */
    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!"tnet4Android_sdk".equals(str)) {
        } else {
            try {
                String a2 = a("multi_thread_opt_enable", (String) null);
                if (!StringUtils.isEmpty(a2)) {
                    c(d).edit().putBoolean("multi_thread_opt_enable", Boolean.valueOf(a2).booleanValue()).apply();
                } else {
                    c(d).edit().remove("multi_thread_opt_enable").apply();
                }
            } catch (Exception unused) {
            }
            try {
                String a3 = a("allow_launch_time_pass_enable", (String) null);
                if (!StringUtils.isEmpty(a3)) {
                    boolean booleanValue = Boolean.valueOf(a3).booleanValue();
                    sad.j(booleanValue);
                    c(d).edit().putBoolean("allow_launch_time_pass_enable", booleanValue).apply();
                } else {
                    c(d).edit().remove("allow_launch_time_pass_enable").apply();
                }
            } catch (Exception unused2) {
            }
            try {
                String a4 = a("cdn_pubkey_to_plain_enable", (String) null);
                if (!StringUtils.isEmpty(a4)) {
                    boolean booleanValue2 = Boolean.valueOf(a4).booleanValue();
                    sad.D(booleanValue2);
                    c(d).edit().putBoolean("cdn_pubkey_to_plain_enable", booleanValue2).apply();
                } else {
                    c(d).edit().remove("cdn_pubkey_to_plain_enable").apply();
                }
            } catch (Exception unused3) {
            }
            try {
                String a5 = a("quic_0rtt_rate_opt_enable", (String) null);
                if (!StringUtils.isEmpty(a5)) {
                    boolean booleanValue3 = Boolean.valueOf(a5).booleanValue();
                    sad.v(booleanValue3);
                    c(d).edit().putBoolean("quic_0rtt_rate_opt_enable", booleanValue3).apply();
                } else {
                    c(d).edit().remove("quic_0rtt_rate_opt_enable").apply();
                }
            } catch (Exception unused4) {
            }
            try {
                String a6 = a("quic_so_plugin_load_enable", (String) null);
                if (!StringUtils.isEmpty(a6)) {
                    boolean booleanValue4 = Boolean.valueOf(a6).booleanValue();
                    sad.n(booleanValue4);
                    c(d).edit().putBoolean("quic_so_plugin_load_enable", booleanValue4).apply();
                } else {
                    c(d).edit().remove("quic_so_plugin_load_enable").apply();
                }
            } catch (Exception unused5) {
            }
            try {
                String a7 = a("recv_body_opt_config", (String) null);
                if (!StringUtils.isEmpty(a7)) {
                    sad.w(a7);
                    c(d).edit().putString("recv_body_opt_config", a7).apply();
                } else {
                    c(d).edit().remove("recv_body_opt_config").apply();
                }
            } catch (Exception unused6) {
            }
            try {
                String a8 = a("tlog_enable_switch", (String) null);
                if (!StringUtils.isEmpty(a8)) {
                    boolean booleanValue5 = Boolean.valueOf(a8).booleanValue();
                    sad.a(booleanValue5);
                    b("tlog_enable_switch", booleanValue5);
                }
            } catch (Exception unused7) {
            }
            try {
                String a9 = a("jni_tlog_enable_switch", (String) null);
                if (!StringUtils.isEmpty(a9)) {
                    boolean booleanValue6 = Boolean.valueOf(a9).booleanValue();
                    sad.b(booleanValue6);
                    b("jni_tlog_enable_switch", booleanValue6);
                }
            } catch (Exception unused8) {
            }
            try {
                String a10 = a("jni_tlog_xquic_level", (String) null);
                if (!StringUtils.isEmpty(a10)) {
                    long longValue = Long.valueOf(a10).longValue();
                    sad.a(longValue);
                    a("jni_tlog_xquic_level", Long.valueOf(longValue));
                }
            } catch (Exception unused9) {
            }
            try {
                String a11 = a("tunnel_proxy_enable_switch", (String) null);
                if (!StringUtils.isEmpty(a11)) {
                    boolean booleanValue7 = Boolean.valueOf(a11).booleanValue();
                    sad.f(booleanValue7);
                    b("tunnel_proxy_enable_switch", booleanValue7);
                }
            } catch (Exception unused10) {
            }
            try {
                String a12 = a("quic_connect_timeout_ms", (String) null);
                if (!StringUtils.isEmpty(a12)) {
                    long longValue2 = Long.valueOf(a12).longValue();
                    sad.b(longValue2);
                    a("quic_connect_timeout_ms", Long.valueOf(longValue2));
                }
            } catch (Exception unused11) {
            }
            try {
                String a13 = a("tcp_connect_timeout_ms", (String) null);
                if (!StringUtils.isEmpty(a13)) {
                    long longValue3 = Long.valueOf(a13).longValue();
                    sad.c(longValue3);
                    a("tcp_connect_timeout_ms", Long.valueOf(longValue3));
                }
            } catch (Exception unused12) {
            }
            try {
                String a14 = a("connect_fast_timeout_host_white_list", (String) null);
                if (!StringUtils.isEmpty(a14)) {
                    sad.f(a14);
                    c("connect_fast_timeout_host_white_list", a14);
                } else {
                    c("connect_fast_timeout_host_white_list");
                }
            } catch (Exception unused13) {
            }
            try {
                String a15 = a("quic_0rtt_connect_fast_timeout_host_white", (String) null);
                if (!StringUtils.isEmpty(a15)) {
                    sad.B(a15);
                    c("quic_0rtt_connect_fast_timeout_host_white", a15);
                } else {
                    c("quic_0rtt_connect_fast_timeout_host_white");
                }
            } catch (Exception unused14) {
            }
            try {
                String a16 = a("multi_network_harmony_white_list", (String) null);
                if (!StringUtils.isEmpty(a16)) {
                    sad.b(a16);
                    c("multi_network_harmony_white_list", a16);
                } else {
                    c("multi_network_harmony_white_list");
                }
            } catch (Exception unused15) {
            }
            try {
                String a17 = a("weak_network_force_cellular_host_white_list", (String) null);
                if (!StringUtils.isEmpty(a17)) {
                    sad.d(a17);
                    c("weak_network_force_cellular_host_white_list", a17);
                } else {
                    c("weak_network_force_cellular_host_white_list");
                }
            } catch (Exception unused16) {
            }
            try {
                String a18 = a("http3_opt_dev_enable", (String) null);
                if (!StringUtils.isEmpty(a18)) {
                    boolean booleanValue8 = Boolean.valueOf(a18).booleanValue();
                    sad.i(booleanValue8);
                    b("http3_opt_dev_enable", booleanValue8);
                } else {
                    c("http3_opt_dev_enable");
                }
            } catch (Exception unused17) {
            }
            try {
                String a19 = a("mpquic_parameter_config", (String) null);
                if (!StringUtils.isEmpty(a19)) {
                    sad.i(a19);
                    c("mpquic_parameter_config", a19);
                } else {
                    c("mpquic_parameter_config");
                }
            } catch (Exception unused18) {
            }
            try {
                String a20 = a("mpquic_connect_compensate_host_white_list", (String) null);
                if (!StringUtils.isEmpty(a20)) {
                    sad.k(a20);
                    c("mpquic_connect_compensate_host_white_list", a20);
                } else {
                    c("mpquic_connect_compensate_host_white_list");
                }
            } catch (Exception unused19) {
            }
            try {
                String a21 = a("request_read_idle_timeout_switch", (String) null);
                if (!StringUtils.isEmpty(a21)) {
                    boolean booleanValue9 = Boolean.valueOf(a21).booleanValue();
                    sad.g(booleanValue9);
                    b("request_read_idle_timeout_switch", booleanValue9);
                } else {
                    c("request_read_idle_timeout_switch");
                }
            } catch (Exception unused20) {
            }
            try {
                String a22 = a("request_idle_timeout_parameter_config", (String) null);
                if (!StringUtils.isEmpty(a22)) {
                    sad.h(a22);
                    c("request_idle_timeout_parameter_config", a22);
                } else {
                    c("request_idle_timeout_parameter_config");
                }
            } catch (Exception unused21) {
            }
            try {
                String a23 = a("request_timeout_block_list", (String) null);
                if (!StringUtils.isEmpty(a23)) {
                    sad.A(a23);
                    c("request_timeout_block_list", a23);
                } else {
                    c("request_timeout_block_list");
                }
            } catch (Exception unused22) {
            }
            try {
                String a24 = a("multi_network_background_brand_block_list", (String) null);
                if (!StringUtils.isEmpty(a24)) {
                    sad.a(a24);
                    c("multi_network_background_brand_block_list", a24);
                } else {
                    c("multi_network_background_brand_block_list");
                }
            } catch (Exception unused23) {
            }
            try {
                String a25 = a("quic_0rtt_cache_expired_time_ms", (String) null);
                if (!StringUtils.isEmpty(a25)) {
                    sad.d(Long.valueOf(a25).longValue());
                }
            } catch (Exception unused24) {
            }
            try {
                String a26 = a("http_zstd_enable", (String) null);
                if (!StringUtils.isEmpty(a26)) {
                    boolean booleanValue10 = Boolean.valueOf(a26).booleanValue();
                    sad.o(booleanValue10);
                    b("http_zstd_enable", booleanValue10);
                } else {
                    c("http_zstd_enable");
                }
            } catch (Exception unused25) {
            }
            try {
                String a27 = a("agent_free_enable", (String) null);
                if (!StringUtils.isEmpty(a27)) {
                    boolean booleanValue11 = Boolean.valueOf(a27).booleanValue();
                    sad.l(booleanValue11);
                    b("agent_free_enable", booleanValue11);
                } else {
                    c("agent_free_enable");
                }
            } catch (Exception unused26) {
            }
            try {
                String a28 = a("common_switch_config", (String) null);
                if (!StringUtils.isEmpty(a28)) {
                    sad.z(a28);
                    c("common_switch_config", a28);
                } else {
                    c("common_switch_config");
                }
            } catch (Exception unused27) {
            }
            try {
                String a29 = a("request_limit_speed_host_white_list", (String) null);
                if (!StringUtils.isEmpty(a29)) {
                    sad.r(a29);
                    c("request_limit_speed_host_white_list", a29);
                } else {
                    c("request_limit_speed_host_white_list");
                }
            } catch (Exception unused28) {
            }
            try {
                String a30 = a("cdn_connect_option", (String) null);
                if (!StringUtils.isEmpty(a30)) {
                    sad.t(a30);
                    c("cdn_connect_option", a30);
                } else {
                    c("cdn_connect_option");
                }
            } catch (Exception unused29) {
            }
            try {
                String a31 = a("quic_init_and_min_cwnd", (String) null);
                if (!StringUtils.isEmpty(a31)) {
                    long longValue4 = Long.valueOf(a31).longValue();
                    sad.e(longValue4);
                    a("quic_init_and_min_cwnd", Long.valueOf(longValue4));
                } else {
                    c("quic_init_and_min_cwnd");
                }
            } catch (Exception unused30) {
            }
            try {
                String a32 = a("multi_session_host_white_list", (String) null);
                if (!StringUtils.isEmpty(a32)) {
                    sad.x(a32);
                    c("multi_session_host_white_list", a32);
                } else {
                    c("multi_session_host_white_list");
                }
            } catch (Exception unused31) {
            }
            try {
                String a33 = a(TNET_TRUSTED_ROOT_CERT, (String) null);
                if (!StringUtils.isEmpty(a33)) {
                    c(TNET_TRUSTED_ROOT_CERT, a33);
                } else {
                    c(TNET_TRUSTED_ROOT_CERT);
                }
            } catch (Exception unused32) {
            }
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!f33452a) {
            spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "no orange sdk", new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig("tnet4Android_sdk", str, str2);
        } catch (Exception unused) {
            spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "can not get config", new Object[0]);
            return null;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        try {
            SharedPreferences c2 = c(context);
            if (c2 == null) {
                spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "init core config, sp is null", new Object[0]);
                return;
            }
            if ("com.taobao.taobao".equals(UtilTool.a())) {
                sad.c(c2.getBoolean("multi_thread_opt_enable", true));
                sad.j(c2.getBoolean("multi_thread_opt_enable", true));
                sad.D(c2.getBoolean("cdn_pubkey_to_plain_enable", true));
                sad.w(c2.getString("recv_body_opt_config", "{\"direct_enable\": \"true\", \"resize_host\": [\"img.alicdn.com\", \"heic.alicdn.com\",\"gw.alicdn.com\",\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"guangguang.cloudvideocdn.taobao.com\",\"mtlexternal.alibabausercontent.com\"]}\n"));
            }
            sad.n(c2.getBoolean("quic_so_plugin_load_enable", true));
            sad.v(c2.getBoolean("quic_0rtt_rate_opt_enable", false));
        } catch (Exception unused) {
        }
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        try {
            if (b != null) {
                return b.getString(str, str2);
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    private static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        try {
            if (b == null) {
                return;
            }
            b.edit().putString(str, str2).apply();
        } catch (Exception unused) {
        }
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            if (b != null) {
                return b.getBoolean(str, z);
            }
        } catch (Exception unused) {
        }
        return z;
    }

    private static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            if (b == null) {
                return;
            }
            b.edit().putBoolean(str, z).apply();
        } catch (Exception unused) {
        }
    }

    private static void a(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597be071", new Object[]{str, l});
            return;
        }
        try {
            if (b == null) {
                return;
            }
            b.edit().putLong(str, l.longValue()).apply();
        } catch (Exception unused) {
        }
    }

    private static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            if (b != null) {
                return b.getLong(str, j);
            }
        } catch (Exception unused) {
        }
        return j;
    }

    private static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        try {
            if (b == null) {
                return;
            }
            b.edit().remove(str).apply();
        } catch (Exception unused) {
        }
    }

    public static SharedPreferences c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6b8004f2", new Object[]{context});
        }
        if (c == null && context != null) {
            c = context.getSharedPreferences(CORE_SP_NAME, 0);
        }
        return c;
    }
}
