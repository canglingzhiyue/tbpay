package tb;

import android.app.Application;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes7.dex */
public class lww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f30961a;
    private static boolean b;
    private static boolean c;

    /* loaded from: classes7.dex */
    public static class b {
        public static final lww instance;

        static {
            kge.a(419381449);
            instance = new lww();
        }
    }

    static {
        kge.a(-904772618);
        f30961a = "__NULL__";
        c = true;
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
        } catch (Throwable unused) {
            c = false;
        }
    }

    private lww() {
    }

    public static lww a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lww) ipChange.ipc$dispatch("f078a52", new Object[0]) : b.instance;
    }

    public static synchronized void a(String str) {
        synchronized (lww.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else if (!c) {
            } else {
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                if (b) {
                    return;
                }
                b = true;
                OrangeConfig.getInstance().getConfigs(str);
                OrangeConfig.getInstance().registerListener(new String[]{str}, new lwy(), true);
            }
        }
    }

    public synchronized void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        if (!StringUtils.isEmpty(str) && map != null) {
            a.a(str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a.b(str, entry.getKey(), entry.getValue());
            }
        }
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        String a2 = a.a(str, str2, str3);
        return StringUtils.equals(a2, f30961a) ? str3 : a2;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(633189527);
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

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                c(str);
            }
        }

        private static SharedPreferences b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("7aae7987", new Object[]{str});
            }
            Application c = lxm.c();
            if (c == null) {
                return null;
            }
            return c.getSharedPreferences(str, 0);
        }

        private static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{str, str2, str3});
            }
            SharedPreferences b = b(str);
            return b != null ? b.getString(str2, str3) : str3;
        }

        private static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences b = b(str);
            if (b == null) {
                return;
            }
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str2, str3);
            edit.apply();
        }

        private static void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
                return;
            }
            SharedPreferences b = b(str);
            if (b == null) {
                return;
            }
            SharedPreferences.Editor edit = b.edit();
            edit.clear();
            edit.apply();
        }
    }
}
