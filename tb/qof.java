package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbhudong.TBHuDongServiceImp;

/* loaded from: classes9.dex */
public class qof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]);
        }
        if (TBHuDongServiceImp.getApplication() != null) {
            return TBHuDongServiceImp.getApplication().getSharedPreferences("sp_rf_info", 0);
        }
        return null;
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
            qif.a("ReachFlowInfoSharePreference updateLongData error.", th);
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
            qif.a("ReachFlowInfoSharePreference getLongData error.", th);
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
            qif.a("ReachFlowInfoSharePreference updateStringData error.", th);
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
            qif.a("ReachFlowInfoSharePreference getStringgData error.", th);
            return str2;
        }
    }
}
