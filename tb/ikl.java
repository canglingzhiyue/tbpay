package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.v4.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ikl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Application application, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcaedf2d", new Object[]{application, str, str2, new Boolean(z)})).booleanValue();
        }
        String string = a(application, str).getString(str2, null);
        return ikw.a((CharSequence) string) ? z : Boolean.parseBoolean(string);
    }

    public static long a(Application application, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcaea30d", new Object[]{application, str, str2, new Long(j)})).longValue();
        }
        String string = a(application, str).getString(str2, null);
        try {
            return ikw.a((CharSequence) string) ? j : Long.parseLong(string);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static boolean a(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f249219", new Object[]{application, str, str2, str3})).booleanValue();
        }
        if (ikw.a((CharSequence) str3)) {
            return false;
        }
        String string = a(application, str).getString(str2, null);
        if (ikw.a((CharSequence) string)) {
            return false;
        }
        for (String str4 : string.split(",")) {
            if (str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public static String b(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("928e7aac", new Object[]{application, str, str2, str3}) : ikw.a((CharSequence) str2) ? str3 : a(application, str).getString(str2, str3);
    }

    public static void c(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f234ed3", new Object[]{application, str, str2, str3});
        } else if (ikw.a((CharSequence) str2)) {
        } else {
            a(application, str).edit().putString(str2, str3).apply();
        }
    }

    public static boolean a(Application application, String str, List<Pair<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb5b476", new Object[]{application, str, list})).booleanValue();
        }
        if (list.isEmpty()) {
            return false;
        }
        SharedPreferences.Editor edit = a(application, str).edit();
        for (Pair<String, String> pair : list) {
            if (pair == null || ikw.a((CharSequence) pair.first)) {
                return false;
            }
            edit.putString(pair.first, pair.second);
        }
        edit.apply();
        return true;
    }

    public static void a(Application application, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3373fe4", new Object[]{application, str, map});
            return;
        }
        SharedPreferences.Editor edit = a(application, str).edit();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (!ikw.a((CharSequence) key)) {
                    edit.putString(key, entry.getValue());
                }
            }
        }
        edit.apply();
    }

    private static SharedPreferences a(Application application, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("71785a15", new Object[]{application, str}) : application.getSharedPreferences(str, 0);
    }
}
