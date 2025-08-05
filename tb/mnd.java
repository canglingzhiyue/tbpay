package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceInfo;
import com.taobao.monitor.impl.common.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class mnd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31130a = true;
    public static boolean b = false;
    public static boolean c = false;
    public static volatile boolean d = false;
    public static boolean e = false;
    public static String f = "";
    public static String g = "";
    public static String h = "";
    public static String i = "";
    public static int j = 0;
    public static String k = "unknown";
    public static String l = "unknown";
    public static long m = -1;
    public static long n = -1;
    public static long o = -1;
    public static long p = -1;
    public static String q = "false";
    public static long r = -1;
    public static long s = -1;
    public static long t = -1;
    public static String u = null;
    public static String v = "background";
    public static a w = new a();
    public static int x = 0;

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : TBDeviceInfo.a(TBDeviceInfo.a(e.a().b()));
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public HashMap<String, Boolean> f31131a = new HashMap<>();

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            Boolean bool = this.f31131a.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else if (this.f31131a.get(str) == null) {
                this.f31131a.put(str, true);
            } else {
                this.f31131a.put(str, false);
            }
        }
    }
}
