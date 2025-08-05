package tb;

import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* loaded from: classes.dex */
public class qol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static qon f32988a;

    public static void a(qon qonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb7bec8", new Object[]{qonVar});
        } else {
            f32988a = qonVar;
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f32988a != null) {
        } else {
            f32988a = new qok();
        }
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            return;
        }
        a();
        f32988a.b(i);
    }

    public static String a(long j) {
        String str;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (j <= 0) {
            return String.valueOf(j);
        }
        float f = (float) j;
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "KB";
        } else {
            str = "B";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "MB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "GB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = RVEnvironmentService.PLATFORM_TB;
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "PB";
        }
        if (f < 1.0f) {
            format = String.format(Locale.getDefault(), "%.2f", Float.valueOf(f));
        } else if (f < 10.0f) {
            format = String.format(Locale.getDefault(), "%.2f", Float.valueOf(f));
        } else if (f < 100.0f) {
            format = String.format(Locale.getDefault(), "%.2f", Float.valueOf(f));
        } else {
            format = String.format(Locale.getDefault(), "%.0f", Float.valueOf(f));
        }
        return format + str;
    }

    public static String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{str, objArr});
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(37, i);
            if (indexOf < 0 || indexOf >= length - 1) {
                break;
            }
            i = indexOf + 1;
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (charAt == 'K' && i2 < objArr.length) {
                    objArr[i2] = a(((Integer) objArr[i2]).intValue());
                    bytes[i] = 115;
                }
                i2++;
            }
        }
        return new String(bytes);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        a();
        return f32988a.a(i);
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f32988a.a(3)) {
            return;
        }
        f32988a.a(str, a(str2, objArr), objArr);
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e02d10", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f32988a.a(4)) {
            return;
        }
        f32988a.b(str, str2, objArr);
    }

    public static void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e3f86f", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f32988a.a(5)) {
            return;
        }
        f32988a.c(str, str2, objArr);
    }

    public static void h(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe7c3ce", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f32988a.a(6)) {
            return;
        }
        f32988a.d(str, str2, objArr);
    }

    public static void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{new Integer(i), str, str2});
            return;
        }
        a();
        if (!f32988a.a(6)) {
            return;
        }
        f32988a.a(6, str, str2);
    }
}
