package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.List;

/* loaded from: classes3.dex */
public class Kb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3254a = "lrc_sdk";
    public static final String b = "wukong_support_low_device";
    public static final String c = "global_switch";
    public static final String d = "key_bitmap_check_limit_size";
    public static final String e = "key_config_disk_cache_switch";
    public static final String f = "key_mrt_start_switch";
    public static final String g = "_switch";
    public static final String h = "log_upload_size";
    public static final String i = "log_interval";
    public static final String j = "bootstrap_log_interval";
    public static final String k = "log_switch";
    public static final String l = "log_init_upload_size";
    public static final String m = "ccrc_event_report_ut_switch";
    public static final String n = "ccrc_behavior_switch";
    public static final String o = "behavior_domain_config";
    public static final String p = "configVersion";
    public static final String q = "behaviorConfigVersion";
    public static final String r = "event_result_upload_interval";
    public static final String s = "%s_heartbeat_switch";
    public static final String t = "%s_bh_detect_frequency";
    public static final String u = "ccrc_bh_async_detect_switch";
    public static final String v = "ccrc_mnn_detect_latch_time";
    public static final String w = "ccrc_cache_valid_time";
    public static final String x = "ccrc_sg_pip_switch";
    public Lb y;
    public final com.taobao.orange.d z = new Jb(this);

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Kb f3255a = new Kb();
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        String str2 = "0";
        Lb lb = this.y;
        if (lb != null) {
            str2 = (String) lb.a(String.format(s, str), str2);
        }
        return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, String.format(s, str), str2));
    }

    public boolean c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        Lb lb = this.y;
        if (lb != null) {
            str2 = (String) lb.a(str + g, "1");
        } else {
            str2 = "1";
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        return "1".equals(orangeConfig.getConfig(f3254a, str + g, str2));
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : p() && c(str);
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        String str = "43200";
        try {
            if (this.y != null) {
                str = (String) this.y.a(w, str);
            }
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(f3254a, w, str)) * 60 * 1000;
        } catch (Throwable unused) {
            return android.taobao.windvane.cache.d.DEFAULT_MAX_AGE;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        Lb lb = this.y;
        return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, e, lb != null ? (String) lb.a(e, "1") : "1"));
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        String str = "10";
        try {
            if (this.y != null) {
                str = (String) this.y.a(r, str);
            }
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(f3254a, r, str)) * 1000;
        } catch (Throwable unused) {
            return 10000L;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        try {
            String bool = Boolean.TRUE.toString();
            if (this.y != null) {
                bool = (String) this.y.a(k, bool);
            }
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f3254a, k, bool));
        } catch (Throwable unused) {
            return true;
        }
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue();
        }
        String str = "60";
        try {
            if (this.y != null) {
                str = (String) this.y.a(i, str);
            }
            return Long.parseLong(OrangeConfig.getInstance().getConfig(f3254a, i, str));
        } catch (Throwable unused) {
            return 60L;
        }
    }

    public List<Float> j() {
        List<Float> parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[]{this});
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(f3254a, d, this.y != null ? (String) this.y.a(d, "") : null);
            if (!StringUtils.isEmpty(config) && (parseArray = JSON.parseArray(config, Float.class)) != null) {
                if (parseArray.size() == 4) {
                    return parseArray;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        String str = "10";
        try {
            if (this.y != null) {
                str = (String) this.y.a(v, str);
            }
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(f3254a, v, str));
        } catch (Throwable unused) {
            return 10;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        Lb lb = this.y;
        return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, f, lb != null ? (String) lb.a(f, "1") : "1"));
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        try {
            return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, m, this.y != null ? (String) this.y.a(m, "1") : "1"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        String str = "100";
        try {
            if (this.y != null) {
                str = (String) this.y.a(h, str);
            }
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(f3254a, h, str));
        } catch (Throwable unused) {
            return 100;
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        String str = "50";
        try {
            if (this.y != null) {
                str = (String) this.y.a(l, str);
            }
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(f3254a, l, str));
        } catch (Throwable unused) {
            return 50;
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        Lb lb = this.y;
        return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, c, lb != null ? (String) lb.a(c, "1") : "1"));
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        String str = "0";
        Lb lb = this.y;
        if (lb != null) {
            str = (String) lb.a(b, str);
        }
        return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, b, str));
    }

    public synchronized void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        if (this.y == null) {
            this.y = new Lb(context);
            OrangeConfig.getInstance().registerListener(new String[]{f3254a}, this.z, true);
        }
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        String str = "60";
        try {
            if (this.y != null) {
                str = (String) this.y.a(j, str);
            }
            return Long.parseLong(OrangeConfig.getInstance().getConfig(f3254a, j, str));
        } catch (Throwable unused) {
            return 60L;
        }
    }

    public static Kb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Kb) ipChange.ipc$dispatch("1d39ccda", new Object[0]) : a.f3255a;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        String str2 = "1";
        String format = String.format(t, str);
        Lb lb = this.y;
        if (lb != null) {
            str2 = (String) lb.a(format, str2);
        }
        try {
            return Math.max(Integer.parseInt(OrangeConfig.getInstance().getConfig(f3254a, format, str2)), 1);
        } catch (Throwable unused) {
            return 1;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, u, this.y != null ? (String) this.y.a(u, "1") : "1"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            return "1".equals(OrangeConfig.getInstance().getConfig(f3254a, x, this.y != null ? (String) this.y.a(x, "1") : "1"));
        } catch (Throwable unused) {
            return false;
        }
    }
}
