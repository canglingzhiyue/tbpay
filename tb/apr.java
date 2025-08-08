package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class apr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f25507a;
    private static boolean b;
    private static boolean c;
    private static apo d;

    static {
        kge.a(1604658968);
        f25507a = "Analytics";
        b = false;
        c = true;
        d = null;
    }

    public static void a(apo apoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e078c0b8", new Object[]{apoVar});
        } else {
            d = apoVar;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    private static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        apo apoVar = d;
        return apoVar != null && apoVar.isValid() && i < d.getLogLevel();
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : b;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!c) {
        } else {
            c();
        }
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (!c) {
        } else {
            b(str, objArr);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (a(4)) {
            d.logd(f(), f(null, new Object[0]));
        } else if (!e()) {
        } else {
            f();
            f(null, new Object[0]);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (a(4)) {
            d.logd(f(), b(str, map));
        } else if (!e()) {
        } else {
            f();
            b(str, map);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
        } else if (a(4)) {
            d.logd(f(), f(str, objArr));
        } else if (!e()) {
        } else {
            f();
            f(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919287fd", new Object[]{str, objArr});
        } else if (a(2)) {
            d.logw(f(), f(str, objArr));
        } else if (!e()) {
        } else {
            f();
            f(str, objArr);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4328134e", new Object[]{str, th, objArr});
        } else if (a(2)) {
            d.logw(f(), f(str, objArr), th);
        } else if (!e()) {
        } else {
            f();
            f(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else if (a(3)) {
            d.logi(f(), f(str, objArr));
        } else if (!e()) {
        } else {
            f();
            f(str, objArr);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (a(1)) {
            d.loge(f(), f(null, new Object[0]));
        } else if (!e()) {
        } else {
            Log.e(f(), f(null, new Object[0]));
        }
    }

    public static void e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else if (a(1)) {
            d.loge(f(), f(str, objArr));
        } else if (!e()) {
        } else {
            Log.e(f(), f(str, objArr));
        }
    }

    public static void b(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b7978f", new Object[]{str, th, objArr});
        } else if (a(1)) {
            d.loge(f(), f(str, objArr), th);
        } else if (!e()) {
        } else {
            Log.e(f(), f(str, objArr), th);
        }
    }

    private static String a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("144cdf80", new Object[]{obj, obj2});
        }
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }

    private static String f() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        if (!b) {
            return f25507a;
        }
        StackTraceElement g = g();
        String str2 = "";
        if (g != null) {
            String className = g.getClassName();
            if (!StringUtils.isEmpty(className)) {
                str2 = className.substring(className.lastIndexOf(46) + 1);
            }
            str = g.getMethodName();
        } else {
            str = str2;
        }
        return "Analytics." + str2 + "." + str;
    }

    private static String f(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32742c86", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = "-";
        }
        objArr2[0] = str;
        sb.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(a(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    private static String b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e314d2e", new Object[]{str, map});
        }
        if (str == null && map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "-";
        }
        objArr[0] = str;
        sb.append(String.format("[%s] ", objArr));
        if (map != null) {
            int size = map.size();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey() + " : " + entry.getValue());
                i++;
                if (i < size) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static StackTraceElement g() {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement) ipChange.ipc$dispatch("28f6fd4", new Object[0]);
        }
        if (!b) {
            return null;
        }
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(apr.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
