package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class gkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f28360a;

    /* loaded from: classes.dex */
    public static class b {
        public static final gkb instance;

        static {
            kge.a(-201682137);
            instance = new gkb();
        }
    }

    static {
        kge.a(604639828);
        f28360a = "__NULL__";
    }

    private gkb() {
    }

    public static gkb a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gkb) ipChange.ipc$dispatch("f0514e0", new Object[0]) : b.instance;
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        String a2 = a.a(str, str2, str3);
        return StringUtils.equals(a2, f28360a) ? str3 : a2;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1655915036);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : c(str, str2, str3);
        }

        public static void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            } else {
                d(str, str2, str3);
            }
        }

        private static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
            }
            Context context = gjv.f28356a;
            if (context == null) {
                return null;
            }
            return context.getSharedPreferences(str, 0);
        }

        private static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            return a2 != null ? a2.getString(str2, str3) : str3;
        }

        private static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 == null) {
                return;
            }
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }
}
