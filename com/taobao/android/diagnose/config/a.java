package com.taobao.android.diagnose.config;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.scene.engine.config.TLogUploadActionConfig;
import com.taobao.android.diagnose.v;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.rfx;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_ABNORMAL_CONFIG = "abnormal_config";
    public static final String CONFIG_ACTION_TLOG_UPLOAD = "scene_action_tlog_upload";
    public static final String CONFIG_APM_ENABLE = "apm_enable";
    public static final String CONFIG_CHANNEL_ENABLE = "channel_enable";
    public static final String CONFIG_COLLECT_INTERVAL = "apm_collect_interval";
    public static final String CONFIG_EXCEPTION_MONITOR_ENABLE = "exception_monitor_enable";
    public static final String CONFIG_IS_DIAGNOSE_ENABLE = "diagnose_is_enable";
    public static final String CONFIG_IS_SCENE_ENABLE = "scene_enable";
    public static final String CONFIG_MONITOR_SAMPLE = "diagnose_monitor_sample";
    public static final String CONFIG_NEW_FEATURE = "new_feature_202307";
    public static final String CONFIG_RUNTIME_MONITOR_CONFIG = "runtime_monitor_config";
    public static final String CONFIG_SCENE_AVAILABLE_LIST = "scene_available_list";
    public static final String CONFIG_SCENE_CHECK_RULE_INTERVAL = "scene_check_rule_interval";
    public static final String CONFIG_SNAPSHOT_EXPIRE_DAY = "snapshot_expire_day";
    public static final String CONFIG_SNAPSHOT_UPLOAD_ENABLE = "snapshot_upload_enable";
    public static final String CONFIG_UT_COLLECT_CONFIG = "ut_collect_config";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11705a;
    public static boolean b;
    public static boolean c;
    public static long d;
    public static boolean e;
    public static int f;
    public static boolean g;
    public static UTCollectConfig h;
    public static int i;
    public static TLogUploadActionConfig j;
    public static List<String> k;
    public static boolean l;
    public static AbnormalConfig m;
    public static RuntimeMonitorConfig n;
    public static boolean o;

    static {
        kge.a(-868829393);
        f11705a = true;
        b = true;
        c = true;
        d = 5L;
        e = true;
        f = 7;
        g = true;
        h = new UTCollectConfig();
        i = 10000;
        j = new TLogUploadActionConfig();
        k = new ArrayList();
        l = true;
        m = new AbnormalConfig();
        n = new RuntimeMonitorConfig();
        o = true;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            SharedPreferences b2 = b(context);
            if (b2 != null) {
                f11705a = b2.getBoolean(CONFIG_IS_DIAGNOSE_ENABLE, true);
                b = b2.getBoolean(CONFIG_IS_SCENE_ENABLE, true);
                c = b2.getBoolean(CONFIG_APM_ENABLE, true);
                e = b2.getBoolean(CONFIG_SNAPSHOT_UPLOAD_ENABLE, true);
                d = b2.getLong(CONFIG_COLLECT_INTERVAL, 5L);
                f = b2.getInt(CONFIG_SNAPSHOT_EXPIRE_DAY, 7);
                g = b2.getBoolean(CONFIG_EXCEPTION_MONITOR_ENABLE, true);
                String string = b2.getString(CONFIG_UT_COLLECT_CONFIG, "");
                if (!StringUtils.isEmpty(string)) {
                    h = (UTCollectConfig) JSON.parseObject(string, UTCollectConfig.class);
                }
                i = b2.getInt(CONFIG_MONITOR_SAMPLE, 10000);
                String string2 = b2.getString(CONFIG_ACTION_TLOG_UPLOAD, "");
                if (!StringUtils.isEmpty(string2)) {
                    j = (TLogUploadActionConfig) JSON.parseObject(string2, TLogUploadActionConfig.class);
                }
                String string3 = b2.getString(CONFIG_SCENE_AVAILABLE_LIST, "");
                if (!StringUtils.isEmpty(string3)) {
                    k = (List) JSON.parseObject(string3, new TypeReference<List<String>>() { // from class: com.taobao.android.diagnose.config.a.1
                    }, new Feature[0]);
                }
                com.taobao.android.diagnose.scene.engine.config.a.a(b2.getLong(CONFIG_SCENE_CHECK_RULE_INTERVAL, 0L));
                l = b2.getBoolean(CONFIG_CHANNEL_ENABLE, true);
                String string4 = b2.getString(CONFIG_ABNORMAL_CONFIG, "");
                if (!StringUtils.isEmpty(string4)) {
                    m = (AbnormalConfig) JSON.parseObject(string4, AbnormalConfig.class);
                }
                String string5 = b2.getString(CONFIG_RUNTIME_MONITOR_CONFIG, "");
                if (!StringUtils.isEmpty(string5)) {
                    n = (RuntimeMonitorConfig) JSON.parseObject(string5, RuntimeMonitorConfig.class);
                }
                o = b2.getBoolean(CONFIG_NEW_FEATURE, true);
            }
            b.a(context);
        } catch (Exception e2) {
            v.a(rfx.INNER_USER_CONFIG, "init failed: ", e2);
        }
    }

    public static SharedPreferences b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("ed1f0113", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(rfx.INNER_USER_CONFIG, 0);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f11705a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : e;
    }

    public static long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : d;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue() : f;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : g;
    }

    public static UTCollectConfig h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTCollectConfig) ipChange.ipc$dispatch("e57688d8", new Object[0]) : h;
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue() : i;
    }

    public static TLogUploadActionConfig j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TLogUploadActionConfig) ipChange.ipc$dispatch("3b6a624a", new Object[0]) : j;
    }

    public static List<String> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ec86895", new Object[0]) : k;
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        SharedPreferences b2 = b(context);
        if (b2 == null) {
            v.d(rfx.INNER_USER_CONFIG, "The sharedPreferences is null");
        } else {
            b2.edit().putString("snapshotid", str).apply();
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        SharedPreferences b2 = b(context);
        if (b2 == null) {
            v.d(rfx.INNER_USER_CONFIG, "The sharedPreferences is null");
        } else {
            b2.edit().putLong("osTypeTime", System.currentTimeMillis()).apply();
        }
    }

    public static long d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236731", new Object[]{context})).longValue();
        }
        SharedPreferences b2 = b(context);
        if (b2 == null) {
            v.d(rfx.INNER_USER_CONFIG, "The sharedPreferences is null");
            return Long.MAX_VALUE;
        }
        return b2.getLong("osTypeTime", 0L);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : l;
    }

    public static String a(Context context, String str, AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("665b6f54", new Object[]{context, str, appInfo});
        }
        SharedPreferences b2 = b(context);
        if (b2 == null) {
            v.d(rfx.INNER_USER_CONFIG, "The sharedPreferences is null");
            return "";
        }
        String string = b2.getString("info_last_launch", "");
        SharedPreferences.Editor edit = b2.edit();
        edit.putString("info_last_launch", str);
        edit.putBoolean("is_inner_user", appInfo.isInner);
        edit.putInt("user_type", appInfo.userType);
        edit.apply();
        return string;
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        SharedPreferences b2 = b(context);
        if (b2 == null) {
            return;
        }
        SharedPreferences.Editor edit = b2.edit();
        edit.putString("info_last_crash", str);
        if (StringUtils.isEmpty(str)) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        SharedPreferences b2 = b(context);
        if (b2 != null) {
            return b2.getString("info_last_crash", null);
        }
        return null;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        SharedPreferences b2 = b(context);
        if (b2 != null) {
            return b2.getInt("user_type", 0);
        }
        return 0;
    }
}
