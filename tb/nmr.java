package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class nmr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DING_YUE = "30";
    public static final int MAX_RECURSIVE_DEPTH = 10;
    public static final int MIN_RECURSIVE_DEPTH = 2;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31575a = true;
    private static boolean b = false;
    private static boolean c = true;
    private static boolean d = false;
    private static boolean e = false;
    private static String g = null;
    private static boolean i = false;
    private static ArrayList<String> f = new ArrayList<>();
    private static int h = 10;

    static {
        f.add("30");
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f31575a = z;
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c;
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{new Boolean(z)});
        } else {
            i = z;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : i;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : d;
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{new Boolean(z)});
        } else {
            e = z;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : e;
    }

    public static void a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{arrayList});
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            f = arrayList;
        }
    }

    public static void a(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i2)});
        } else if (TextUtils.isEmpty(str) || !f.contains(str)) {
        } else {
            g = str;
            h = Math.min(Math.max(i2, 2), 10);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!TextUtils.equals(str, g)) {
        } else {
            g = null;
            h = 10;
        }
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue();
        }
        if (f.contains("*")) {
            return 2;
        }
        if (!TextUtils.isEmpty(g)) {
            return h;
        }
        return 10;
    }
}
