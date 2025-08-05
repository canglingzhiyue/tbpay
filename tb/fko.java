package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, fkr> f28013a;
    private static HashMap<String, fhi> b;
    private static HashMap<String, flo> c;

    static {
        kge.a(715380371);
        f28013a = new HashMap<>();
        b = new HashMap<>();
        c = new HashMap<>();
    }

    public static fkr a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("7c6f4b67", new Object[]{str}) : f28013a.remove(str);
    }

    public static fhi b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fhi) ipChange.ipc$dispatch("7d1beaac", new Object[]{str}) : b.remove(str);
    }

    public static flo c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flo) ipChange.ipc$dispatch("7dc8a609", new Object[]{str}) : c.remove(str);
    }

    public static void a(String str, fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a65935", new Object[]{str, fkrVar});
        } else {
            f28013a.put(str, fkrVar);
        }
    }

    public static void a(String str, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2877fb5b", new Object[]{str, fhiVar});
        } else {
            b.put(str, fhiVar);
        }
    }

    public static void a(String str, flo floVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b31399", new Object[]{str, floVar});
        } else {
            c.put(str, floVar);
        }
    }
}
