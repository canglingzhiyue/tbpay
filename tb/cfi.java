package tb;

import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class cfi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f26265a = "Analytics.ut4aplus";
    private static String b = "Analytics.ut4aplus.";
    private static HashMap<String, Integer> c;
    private static boolean d;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        c = hashMap;
        hashMap.put("V", 5);
        c.put(TLogTracker.LEVEL_DEBUG, 4);
        c.put(TLogTracker.LEVEL_INFO, 3);
        c.put("W", 2);
        c.put("E", 1);
        c.put("L", 0);
        d = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d;
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (!a()) {
        } else {
            try {
                String e = e(str, objArr);
                if (!StringUtils.isEmpty(e)) {
                    int i2 = 2048;
                    if (e.length() > 2048) {
                        int length = e.length();
                        while (true) {
                            b();
                            e.substring(i, i2);
                            int i3 = i2 + 2048;
                            if (i3 > length) {
                                i3 = length;
                            }
                            if (i2 == i3) {
                                return;
                            }
                            i = i2;
                            i2 = i3;
                        }
                    }
                }
                b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
        } else if (!a()) {
        } else {
            b();
            e(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919287fd", new Object[]{str, objArr});
        } else if (!a()) {
        } else {
            b();
            e(str, objArr);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4328134e", new Object[]{str, th, objArr});
        } else if (!a()) {
        } else {
            b();
            e(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else if (!a()) {
        } else {
            Log.e(b(), e(str, objArr));
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

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : a(b);
    }

    private static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            str = f26265a;
        }
        StackTraceElement c2 = c();
        if (c2 != null) {
            String className = c2.getClassName();
            if (!StringUtils.isEmpty(className)) {
                str2 = className.substring(className.lastIndexOf(46) + 1);
                return str + str2 + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
            }
        }
        str2 = "";
        return str + str2 + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
    }

    public static String e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21be5fc5", new Object[]{str, objArr});
        }
        String str2 = "";
        if (str == null && objArr == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement c2 = c();
        if (c2 != null) {
            str2 = c2.getMethodName();
        }
        sb.append(String.format("[%s]", str2));
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(",");
                sb.append(a(objArr[i], objArr[i2]));
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(",");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    private static StackTraceElement c() {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement) ipChange.ipc$dispatch("b307fd0", new Object[0]);
        }
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(cfi.class.getName())) {
                return stackTraceElement;
            }
        }
        return null;
    }
}
