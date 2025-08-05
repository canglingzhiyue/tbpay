package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class sxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1773370722);
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
            return;
        }
        try {
            SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences(spy.BIZ_GOODS_LIST, 0).edit();
            edit.putLong(str, j);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static long b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253fa5", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return pmd.a().u().c().getSharedPreferences(spy.BIZ_GOODS_LIST, 0).getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            return pmd.a().u().c().getSharedPreferences(spy.BIZ_GOODS_LIST, 0).getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences(spy.BIZ_GOODS_LIST, 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
        }
        long b = b("clientDefaultCategoryIds", -1L);
        ArrayList arrayList = new ArrayList();
        if (!hir.p()) {
            return arrayList;
        }
        long a2 = hir.a(604800000L);
        if (b == -1 || (b > 0 && hiq.a() - b > a2)) {
            arrayList.add("9999");
        }
        return arrayList;
    }

    public static void a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{list, str});
        } else if (!TextUtils.equals(str, "9999") || list == null || list.isEmpty() || !list.contains("9999")) {
        } else {
            a("clientDefaultCategoryIds", hiq.a());
        }
    }
}
