package tb;

import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* loaded from: classes4.dex */
public class dpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static dpp f26894a;

    static {
        kge.a(1812049411);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f26894a != null) {
        } else {
            f26894a = new dpp();
        }
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

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f26894a.a(3)) {
            return;
        }
        f26894a.a(str, a(str2, objArr), objArr);
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f26894a.a(4)) {
            return;
        }
        f26894a.b(str, str2, objArr);
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f26894a.a(5)) {
            return;
        }
        f26894a.c(str, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
            return;
        }
        a();
        if (!f26894a.a(6)) {
            return;
        }
        f26894a.d(str, str2, objArr);
    }
}
