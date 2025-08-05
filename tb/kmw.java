package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kmw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840caf86", new Object[]{context, str, obj});
        } else if (context == null) {
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("DL_Downloader", 0).edit();
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str, ((Long) obj).longValue());
                } else {
                    edit.putString(str, obj.toString());
                }
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.commit();
                } else {
                    edit.commit();
                }
            } catch (Throwable th) {
                kmv.d("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }

    public static Object b(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("31567e2d", new Object[]{context, str, obj});
        }
        if (context == null) {
            return obj;
        }
        try {
            sharedPreferences = context.getSharedPreferences("DL_Downloader", 0);
        } catch (Throwable th) {
            kmv.d("SPUtil", "get from share preference failed", th.toString());
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null) {
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("DL_Downloader", 0).edit();
                edit.remove(str);
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.commit();
                } else {
                    edit.commit();
                }
            } catch (Throwable th) {
                kmv.d("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }
}
