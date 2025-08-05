package com.alipay.android.msp.framework.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ovr;

/* loaded from: classes3.dex */
public class PrefUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_ERROR_TIMES_KEY = "biz_error_times_key";
    public static final String BIZ_OP_TYPE = "biz_operation_type_map";
    public static final String BIZ_OP_TYPE_KEY = "biz_operation_type_key";
    private static LruCache<String, SharedPreferences> prefMap;

    private static SharedPreferences getSharedPref(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("e00d543", new Object[]{str});
        }
        if (prefMap == null) {
            prefMap = new LruCache<>(16);
        }
        if (str == null) {
            return null;
        }
        SharedPreferences sharedPreferences = prefMap.get(str);
        if (sharedPreferences != null || (context = GlobalHelper.getInstance().getContext()) == null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        prefMap.put(str, sharedPreferences2);
        return sharedPreferences2;
    }

    public static void putString(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48297325", new Object[]{str, str2, str3});
            return;
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return;
        }
        sharedPref.edit().putString(str2, str3).apply();
    }

    public static String getString(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return null;
        }
        return sharedPref.getString(str2, str3);
    }

    public static void putLong(String str, String str2, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3713585", new Object[]{str, str2, l});
            return;
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return;
        }
        sharedPref.edit().putLong(str2, l.longValue()).apply();
    }

    public static Integer getInt(String str, String str2, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2f2f608a", new Object[]{str, str2, num});
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return null;
        }
        return Integer.valueOf(sharedPref.getInt(str2, num.intValue()));
    }

    public static void putInt(String str, String str2, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63eda1c", new Object[]{str, str2, num});
            return;
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return;
        }
        sharedPref.edit().putInt(str2, num.intValue()).apply();
    }

    public static boolean getBoolean(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f0d246b", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return z;
        }
        try {
            return sharedPref.getBoolean(str2, z);
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ovr.KEY_TAB_BAR_FRAMEWORK, "GetPrefBooleanEx", th);
            return z;
        }
    }

    public static void putBoolean(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98b9220", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return;
        }
        sharedPref.edit().putBoolean(str2, z).apply();
    }

    public static Long getLong(String str, String str2, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("f9f8a249", new Object[]{str, str2, l});
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return null;
        }
        return Long.valueOf(sharedPref.getLong(str2, l.longValue()));
    }

    public static boolean exists(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad38aa7b", new Object[]{str, str2})).booleanValue();
        }
        SharedPreferences sharedPref = getSharedPref(str);
        return sharedPref != null && sharedPref.contains(str2);
    }

    public static void remove(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7310669f", new Object[]{str, str2});
            return;
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return;
        }
        sharedPref.edit().remove(str2).apply();
    }

    public static void clear(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{str});
            return;
        }
        SharedPreferences sharedPref = getSharedPref(str);
        if (sharedPref == null) {
            return;
        }
        sharedPref.edit().clear().apply();
    }
}
