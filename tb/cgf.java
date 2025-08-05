package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.Kb;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes.dex */
public class cgf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_mtop_api", null);
        return customConfig == null ? cfz.g(context) : customConfig;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "sync_switch", null);
        return config == null ? cfz.h(context) : config;
    }

    private static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("528b5aca", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "downgrade_without_uid", null);
        return config == null ? cfz.i(context) : config;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        String k = k(context);
        if (!TextUtils.isEmpty(k)) {
            return "1".equals(k);
        }
        return false;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_entrance_name", null);
        return TextUtils.isEmpty(config) ? cfz.j(context) : config;
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_linked_h5_url", null);
        return TextUtils.isEmpty(config) ? cfz.k(context) : config;
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7289b85", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_ttid_list", null);
        return TextUtils.isEmpty(config) ? cfz.l(context) : config;
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ca2c1c6", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_gray_scope", null);
        return TextUtils.isEmpty(config) ? cfz.m(context) : config;
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "log_timeInterval", null);
        return config == null ? cfz.n(context) : config;
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67970e48", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", Kb.k, null);
        return config == null ? cfz.o(context) : config;
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd113489", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "log_cache_count", null);
        return config == null ? cfz.p(context) : config;
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c805810b", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_display_switch", null);
        return config == null ? cfz.q(context) : config;
    }
}
