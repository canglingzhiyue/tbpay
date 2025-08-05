package tb;

import android.content.SharedPreferences;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.a;

/* loaded from: classes7.dex */
public class mrh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_IGNORE_NEXT_MTOP_TIME = "ignore_next_mtop_time";
    public static final String SP_KEY_LAST_DOWNLOAD_CONTEXT_PRE = "last_download_context_pre";
    public static final String SP_KEY_POP_EXPOSE_TIME = "last_pop_expose_time";
    public static final String SP_KEY_UPDATE_MODEL = "update_model";

    static {
        kge.a(1362812421);
    }

    private static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]);
        }
        if (a.a().b() != null) {
            return a.a().b().getSharedPreferences("update_sp", 0);
        }
        return null;
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences a2 = a();
            if (a2 == null) {
                return;
            }
            a2.edit().putBoolean(str, z).apply();
        } catch (Throwable th) {
            c.a("UpdateSharePreference updateBooleanData error.", th);
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            SharedPreferences a2 = a();
            if (a2 != null) {
                return a2.getBoolean(str, false);
            }
            return false;
        } catch (Throwable th) {
            c.a("UpdateSharePreference getBooleanData error.", th);
            return false;
        }
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            SharedPreferences a2 = a();
            return a2 == null ? z : a2.getBoolean(str, z);
        } catch (Throwable th) {
            c.a("UpdateSharePreference getBooleanData with defaultValue error.", th);
            return z;
        }
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
            return;
        }
        try {
            SharedPreferences a2 = a();
            if (a2 == null) {
                return;
            }
            a2.edit().putLong(str, j).apply();
        } catch (Throwable th) {
            c.a("UpdateSharePreference updateLongData error.", th);
        }
    }

    public static long b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253fa5", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            SharedPreferences a2 = a();
            return a2 == null ? j : a2.getLong(str, j);
        } catch (Throwable th) {
            c.a("UpdateSharePreference getLongData error.", th);
            return j;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            SharedPreferences a2 = a();
            if (a2 == null) {
                return;
            }
            a2.edit().putString(str, str2).apply();
        } catch (Throwable th) {
            c.a("UpdateSharePreference updateStringData error.", th);
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        try {
            SharedPreferences a2 = a();
            return a2 == null ? str2 : a2.getString(str, str2);
        } catch (Throwable th) {
            c.a("UpdateSharePreference getStringData error.", th);
            return str2;
        }
    }
}
