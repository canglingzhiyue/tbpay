package tb;

import android.content.SharedPreferences;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class bzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1913126311);
    }

    private static SharedPreferences e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6314e040", new Object[0]);
        }
        if (PopLayer.getReference() != null && PopLayer.getReference().getApp() != null) {
            return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_info_v2", 0);
        }
        return null;
    }

    public static SharedPreferences.Editor f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("14e781a4", new Object[0]);
        }
        try {
            SharedPreferences e = e();
            if (e != null) {
                return e.edit();
            }
            return null;
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference startEdit error.", th);
            return null;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            SharedPreferences e = e();
            return e == null ? "" : e.getString("mock_data", "");
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getPersistentMockData error.", th);
            return "";
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            e.edit().putString("mock_data", str).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference putConfigMockData error.", th);
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        try {
            SharedPreferences e = e();
            if (e != null) {
                return e.getLong("mock_time_travel", 0L);
            }
            return 0L;
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getPersistentTimeTravelSec error.", th);
            return 0L;
        }
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            e.edit().putLong("mock_time_travel", j).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference putPersistentTimeTravelSec error.", th);
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            SharedPreferences e = e();
            return e == null ? "" : e.getString("mock_params", "");
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getMockParamData error.", th);
            return "";
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            e.edit().putString("mock_params", str).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference putMockParamData error.", th);
        }
    }

    public static Set<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7215bcdd", new Object[0]);
        }
        try {
            SharedPreferences e = e();
            if (e != null) {
                return e.getStringSet(g("mock_checked_index_ids"), null);
            }
            return null;
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getMockCheckedIndexIDs error.", th);
            return null;
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
            return;
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            Set<String> g = g();
            if (g == null) {
                g = new HashSet<>();
            }
            g.add(str);
            e.edit().putStringSet(g("mock_checked_index_ids"), g).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference addMockCheckedIndexID error.", th);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            e.edit().remove(g("mock_checked_index_ids")).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference clearMockCheckInfo error.", th);
        }
    }

    public static List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{str});
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return new ArrayList();
            }
            return new ArrayList(e.getStringSet(str, new HashSet()));
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getStringListData error.", th);
            return new ArrayList();
        }
    }

    public static void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
            return;
        }
        if (list == null) {
            try {
                list = new ArrayList<>();
            } catch (Throwable th) {
                c.a("PoplayerInfoSharePreference putStringListData error.", th);
                return;
            }
        }
        SharedPreferences e = e();
        if (e == null) {
            return;
        }
        e.edit().putStringSet(str, new HashSet(list)).apply();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            e.edit().putString(str, str2).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference updateStringData error.", th);
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        try {
            SharedPreferences e = e();
            return e == null ? "" : e.getString(str, "");
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getStringData error.", th);
            return "";
        }
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            e.edit().putBoolean(str, z).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference updateBooleanData error.", th);
        }
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        try {
            SharedPreferences e = e();
            if (e != null) {
                return e.getBoolean(str, false);
            }
            return false;
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getBooleanData error.", th);
            return false;
        }
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            SharedPreferences e = e();
            return e == null ? z : e.getBoolean(str, z);
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getBooleanData with defaultValue error.", th);
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
            SharedPreferences e = e();
            if (e == null) {
                return;
            }
            e.edit().putLong(str, j).apply();
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference updateLongData error.", th);
        }
    }

    public static long b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253fa5", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            SharedPreferences e = e();
            return e == null ? j : e.getLong(str, j);
        } catch (Throwable th) {
            c.a("PoplayerInfoSharePreference getLongData error.", th);
            return j;
        }
    }

    private static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        return "Page_" + str;
    }
}
