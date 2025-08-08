package org.android.agoo.common;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.l;
import tb.kge;

/* loaded from: classes.dex */
public class Config {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AGOO_CLEAR_TIME = "agoo_clear_time";
    public static final String AGOO_UNREPORT_TIMES = "agoo_UnReport_times";
    private static String DEVICETOKEN = null;
    private static String DEVICETOKENV2 = null;
    public static final String KEY_DEVICE_TOKEN = "deviceId";
    public static final String KEY_DEVICE_TOKEN_V2 = "deviceIdV2";
    public static final String PREFERENCES = "Agoo_AppStore";
    public static final String PROPERTY_APP_KEY = "agoo_app_key";
    public static final String PROPERTY_APP_VERSION = "app_version";
    public static final String PROPERTY_DEVICE_TOKEN = "app_device_token";
    public static final String PROPERTY_PUSH_USER_TOKEN = "app_push_user_token";
    public static final String PROPERTY_TT_ID = "app_tt_id";
    public static final String TAG = "Config";
    public static String mAccsConfigTag;
    private static String mAgooAppkey;

    private static SharedPreferences getAgooPreferences(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("c8b4a9d9", new Object[]{context}) : APreferencesManager.getSharedPreferences(context, PREFERENCES, 4);
    }

    public static void clear(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e05f4", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = getAgooPreferences(context).edit();
            edit.putInt("app_version", Integer.MIN_VALUE);
            edit.remove(PROPERTY_DEVICE_TOKEN);
            edit.remove(PROPERTY_APP_KEY);
            edit.remove(PROPERTY_TT_ID);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void setAgooAppKey(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e058d45", new Object[]{context, str});
            return;
        }
        try {
        } catch (Throwable th) {
            ALog.e(TAG, "setAgooAppKey", th, new Object[0]);
        }
        if (StringUtils.isEmpty(str)) {
            ALog.e(TAG, "setAgooAppKey appkey null", new Object[0]);
            return;
        }
        mAgooAppkey = str;
        SharedPreferences.Editor edit = getAgooPreferences(context).edit();
        edit.putString(PROPERTY_APP_KEY, str);
        edit.apply();
        ALog.d(TAG, "setAgooAppKey", "appkey", str);
    }

    public static String getAgooAppKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c6c1cb9", new Object[]{context});
        }
        String str = mAgooAppkey;
        try {
            str = getAgooPreferences(context).getString(PROPERTY_APP_KEY, mAgooAppkey);
        } catch (Throwable th) {
            ALog.e(TAG, "getAgooAppKey", th, new Object[0]);
        }
        if (StringUtils.isEmpty(str)) {
            ALog.e(TAG, "getAgooAppKey null!!", new Object[0]);
        }
        ALog.d(TAG, "getAgooAppKey", "appkey", str);
        return str;
    }

    public static String getAccsConfigTag(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("224aeef", new Object[]{context});
        }
        if (StringUtils.isEmpty(mAccsConfigTag)) {
            return ACCSManager.getDefaultConfig(context);
        }
        return mAccsConfigTag;
    }

    public static void setReportTimes(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169602b2", new Object[]{context, new Integer(i)});
            return;
        }
        try {
            SharedPreferences agooPreferences = getAgooPreferences(context);
            SharedPreferences.Editor edit = agooPreferences.edit();
            edit.putInt(AGOO_UNREPORT_TIMES, agooPreferences.getInt(AGOO_UNREPORT_TIMES, 0) + i);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static boolean isReportCacheMsg(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace82c88", new Object[]{context})).booleanValue();
        }
        try {
            return getAgooPreferences(context).getInt(AGOO_UNREPORT_TIMES, 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void clearReportTimes(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2730b15c", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = getAgooPreferences(context).edit();
            edit.putInt(AGOO_UNREPORT_TIMES, 0);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static int getReportCacheMsg(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a46b86cb", new Object[]{context})).intValue();
        }
        try {
            return getAgooPreferences(context).getInt(AGOO_UNREPORT_TIMES, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void setClearTimes(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9472e37e", new Object[]{context, new Long(j)});
            return;
        }
        try {
            SharedPreferences.Editor edit = getAgooPreferences(context).edit();
            edit.putLong(AGOO_CLEAR_TIME, j);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static boolean isClearTime(Context context, long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35963a77", new Object[]{context, new Long(j)})).booleanValue();
        }
        try {
            long j2 = getAgooPreferences(context).getLong(AGOO_CLEAR_TIME, 0L);
            StringBuilder sb = new StringBuilder();
            sb.append("now=");
            sb.append(j);
            sb.append(",now - lastTime=");
            long j3 = j - j2;
            sb.append(j3);
            sb.append(",istrue=");
            i = (j3 > 86400000L ? 1 : (j3 == 86400000L ? 0 : -1));
            sb.append(i > 0);
            ALog.d("isClearTime", sb.toString(), new Object[0]);
        } catch (Throwable unused) {
        }
        return j != 0 && i > 0;
    }

    static {
        kge.a(333031400);
        DEVICETOKEN = null;
        DEVICETOKENV2 = null;
    }

    public static void setDeviceToken(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31b270a", new Object[]{context, str});
            return;
        }
        boolean s = l.s(context);
        ALog.i(TAG, "setDeviceToken", "token", str, "isRegIdValid", Boolean.valueOf(s));
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (s) {
            DEVICETOKENV2 = str;
        } else {
            DEVICETOKEN = str;
        }
        try {
            SharedPreferences.Editor edit = getAgooPreferences(context).edit();
            edit.putString(s ? KEY_DEVICE_TOKEN_V2 : KEY_DEVICE_TOKEN, str);
            edit.apply();
        } catch (Throwable th) {
            ALog.e(TAG, "setDeviceToken", th, new Object[0]);
        }
    }

    public static String getDeviceToken(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b61c6ec", new Object[]{context});
        }
        boolean s = l.s(context);
        String str = s ? KEY_DEVICE_TOKEN_V2 : "deviceId";
        String str2 = s ? DEVICETOKENV2 : DEVICETOKEN;
        try {
            str2 = getAgooPreferences(context).getString(str, str2);
        } catch (Throwable th) {
            ALog.e(TAG, "getDeviceToken", th, new Object[0]);
        }
        ALog.i(TAG, "getDeviceToken", "token", str2, "isRegIdValid", Boolean.valueOf(s));
        return str2;
    }

    public static String getPushAliasToken(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df6c8718", new Object[]{context});
        }
        try {
            return getAgooPreferences(context).getString(PROPERTY_PUSH_USER_TOKEN, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void setPushAliasToken(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7114c6", new Object[]{context, str});
            return;
        }
        try {
            SharedPreferences.Editor edit = getAgooPreferences(context).edit();
            if (!StringUtils.isEmpty(str)) {
                edit.putString(PROPERTY_PUSH_USER_TOKEN, str);
            }
            edit.apply();
        } catch (Throwable unused) {
        }
    }
}
