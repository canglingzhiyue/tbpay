package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* loaded from: classes.dex */
public class gsl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    private gsl() {
    }

    private static String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{str, objArr}) : (objArr == null || objArr.length == 0) ? str : String.format(Locale.US, str, objArr);
    }

    private static String b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef9cf982", new Object[]{str, objArr});
        }
        return riy.ARRAY_START_STR + a() + "] " + a(str, objArr);
    }

    public static boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue() : Log.isLoggable(str, i);
    }

    private static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{str, str2, objArr});
        } else if (!a(str, 2)) {
        } else {
            String b = b(str2, objArr);
            Throwable a2 = a(objArr);
            if (a2 != null) {
                Log.e(str, b, a2);
            } else {
                Log.e(str, b);
            }
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            c(str, str2, new Object[0]);
        }
    }

    public static void a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{str, str2, obj});
        } else {
            c(str, str2, obj);
        }
    }

    public static void a(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df5a034", new Object[]{str, str2, obj, obj2});
        } else {
            c(str, str2, obj, obj2);
        }
    }

    public static void a(String str, String str2, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ad6b10", new Object[]{str, str2, obj, obj2, obj3});
        } else {
            c(str, str2, obj, obj2, obj3);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else {
            a(str2, objArr);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else {
            a(str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
            return;
        }
        String a2 = a(str2, objArr);
        Throwable a3 = a(objArr);
        if (a3 != null) {
            Log.e(str, a2, a3);
        } else {
            Log.e(str, a2);
        }
    }

    private static Throwable a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("ff8bcc2e", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = gsl.class.getName();
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (stackTrace[i].getClassName().equals(name)) {
                i += 4;
                break;
            } else {
                i++;
            }
        }
        return stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber();
    }
}
