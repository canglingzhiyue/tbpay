package com.taobao.message.kit.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class SharedPreferencesUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SharedPreferencesUtil";
    private static ILocalFileReader sLocalFileReader;

    /* loaded from: classes7.dex */
    public interface ILocalFileReader {
        boolean getBooleanSharedPreference(String str);

        boolean getBooleanSharedPreference(String str, String str2);

        boolean getBooleanSharedPreference(String str, String str2, boolean z);

        boolean getBooleanSharedPreference(String str, boolean z);

        int getIntSharedPreference(String str, int i);

        int getIntSharedPreference(String str, String str2, int i);

        long getLongSharedPreference(String str);

        long getLongSharedPreference(String str, long j);

        long getLongSharedPreference(String str, String str2, long j);

        String getStringSharedPreference(String str);

        String getStringSharedPreference(String str, String str2, String str3);
    }

    static {
        kge.a(1044694876);
    }

    public static void setLocalFileReader(ILocalFileReader iLocalFileReader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32945215", new Object[]{iLocalFileReader});
        } else {
            sLocalFileReader = iLocalFileReader;
        }
    }

    public static void addBooleanSharedPreference(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64051cfc", new Object[]{str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).edit();
            edit.putBoolean(str, z);
            edit.apply();
        }
    }

    public static void addBooleanSharedPreference(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffdf272", new Object[]{str, str2, new Boolean(z)});
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
        } else {
            SharedPreferences.Editor edit = ApplicationUtil.getApplication().getSharedPreferences(str, 0).edit();
            edit.putBoolean(str2, z);
            edit.apply();
        }
    }

    public static boolean getBooleanSharedPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f69a3b51", new Object[]{str, str2})).booleanValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getBooleanSharedPreference(str, str2);
        }
        return ApplicationUtil.getApplication().getSharedPreferences(str, 0).getBoolean(str2, true);
    }

    public static boolean getBooleanSharedPreference(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcade12b", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getBooleanSharedPreference(str, str2, z);
        }
        return ApplicationUtil.getApplication().getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    public static boolean getBooleanSharedPreference(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49e47c47", new Object[]{str})).booleanValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getBooleanSharedPreference(str);
        }
        return PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).getBoolean(str, true);
    }

    public static boolean getBooleanSharedPreference(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2abbef5", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getBooleanSharedPreference(str, z);
        }
        return PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).getBoolean(str, z);
    }

    public static void addStringSharedPreference(String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed7c3f7", new Object[]{str, str2, str3});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (TextUtils.isEmpty(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication());
            } else {
                sharedPreferences = ApplicationUtil.getApplication().getSharedPreferences(str, 0);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }

    public static void addLongSharedPreference(String str, String str2, long j) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66968ac", new Object[]{str, str2, new Long(j)});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (TextUtils.isEmpty(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication());
            } else {
                sharedPreferences = ApplicationUtil.getApplication().getSharedPreferences(str, 0);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str2, j);
            edit.apply();
        }
    }

    public static void addStringSharedPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6edfbb6d", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public static String getStringSharedPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae5d117e", new Object[]{str, str2}) : getStringSharedPreference(str, str2, "");
    }

    public static String getStringSharedPreference(String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d3974", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "key is null: " + str + str3);
            return str3;
        } else if (ApplicationUtil.getApplication() == null) {
            TLog.loge(TAG, "application is null: " + str + str2 + str3);
            return str3;
        } else {
            if (TextUtils.isEmpty(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication());
            } else {
                sharedPreferences = ApplicationUtil.getApplication().getSharedPreferences(str, 0);
            }
            return sharedPreferences.getString(str2, str3);
        }
    }

    public static String getStringSharedPreference(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3441b808", new Object[]{str}) : PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).getString(str, "");
    }

    public static void addLongSharedPreference(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8371b6", new Object[]{str, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).edit();
            edit.putLong(str, j);
            edit.apply();
        }
    }

    public static long getLongSharedPreference(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10b81bd5", new Object[]{str, new Long(j)})).longValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getLongSharedPreference(str, j);
        }
        return PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).getLong(str, j);
    }

    public static long getLongSharedPreference(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b60c337", new Object[]{str})).longValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getLongSharedPreference(str);
        }
        return PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).getLong(str, 0L);
    }

    public static long getLongSharedPreference(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e425fe0b", new Object[]{str, str2, new Long(j)})).longValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getLongSharedPreference(str, str2, j);
        }
        return ApplicationUtil.getApplication().getSharedPreferences(str, 0).getLong(str2, j);
    }

    public static void addIntSharedPreference(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b779693a", new Object[]{str, str2, new Integer(i)});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            SharedPreferences.Editor edit = ApplicationUtil.getApplication().getSharedPreferences(str, 0).edit();
            edit.putInt(str2, i);
            edit.apply();
        }
    }

    public static void addIntSharedPreference(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f63804", new Object[]{str, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).edit();
            edit.putInt(str, i);
            edit.apply();
        }
    }

    public static int getIntSharedPreference(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d20b37a4", new Object[]{context, str, new Integer(i)})).intValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getIntSharedPreference(str, i);
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, i);
    }

    public static int getIntSharedPreference(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60be1c6c", new Object[]{str, new Integer(i)})).intValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getIntSharedPreference(str, i);
        }
        return PreferenceManager.getDefaultSharedPreferences(ApplicationUtil.getApplication()).getInt(str, i);
    }

    public static int getIntSharedPreference(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a86efa62", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        ILocalFileReader iLocalFileReader = sLocalFileReader;
        if (iLocalFileReader != null) {
            return iLocalFileReader.getIntSharedPreference(str, str2, i);
        }
        return ApplicationUtil.getApplication().getSharedPreferences(str, 0).getInt(str2, i);
    }

    public static void clearFileSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6d0b35", new Object[]{str});
        } else {
            ApplicationUtil.getApplication().getSharedPreferences(str, 0).edit().clear().commit();
        }
    }

    public static void clearFileAsync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60b14e4", new Object[]{str});
        } else {
            ApplicationUtil.getApplication().getSharedPreferences(str, 0).edit().clear().apply();
        }
    }

    public static String getGlobalSPName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("565f80ae", new Object[]{str});
        }
        return str + "_msg_kv_sp";
    }
}
