package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.b;

/* loaded from: classes.dex */
public class niw extends qol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-77703447);
    }

    private static void a(StringBuilder sb, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0071ca7", new Object[]{sb, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (z && str.startsWith(ado.URL_SEPARATOR)) {
                sb.append("http:");
                sb.append(str.replace(riy.MOD, "%%"));
                sb.append("?complete=prefix");
                return;
            }
            sb.append(str.replace(riy.MOD, "%%"));
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : b(str, -1, null, null, str2, false);
    }

    private static String a(String str, b bVar, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d058e14f", new Object[]{str, bVar, str2, new Boolean(z)});
        }
        if (bVar != null) {
            return b(str, bVar.H(), bVar.a(), bVar.p(), str2, z);
        }
        return b(str, -1, null, null, str2, false);
    }

    private static int a(String str, int i, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 5;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84bd6078", new Object[]{str, new Integer(i), str2, str3, str4, new Boolean(z)})).intValue();
        }
        if (str != null) {
            i2 = 5 + str.length();
        }
        if (str4 != null) {
            i2 += str4.length() + 2;
        }
        if (i > 0) {
            i2 += 11;
        }
        if (str2 != null) {
            i2 += str2.length() + 8;
        }
        if (str3 == null) {
            return i2;
        }
        int length = i2 + str3.length() + 7;
        return z ? length + 21 : length;
    }

    private static String b(String str, int i, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb34d69a", new Object[]{str, new Integer(i), str2, str3, str4, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(a(str, i, str2, str3, str4, z));
        sb.append('[');
        sb.append(str4);
        sb.append(']');
        if (i > 0) {
            sb.append(" ID=");
            sb.append(i);
        }
        if (str2 != null) {
            sb.append(" MODULE=");
            sb.append(str2);
        }
        if (i > 0 || str2 != null) {
            sb.append(", ");
        } else {
            sb.append(' ');
        }
        sb.append(str);
        if (str3 != null) {
            sb.append(", PATH=");
            a(sb, str3, z);
        }
        return sb.substring(0);
    }

    private static String a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d604f12", new Object[]{str, str2, str3, new Boolean(z)}) : b(str2, -1, null, str3, str, z);
    }

    public static void a(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281d92b", new Object[]{str, str2, str3, objArr});
        } else if (!a(3)) {
        } else {
            qol.e("RxPhenix", a(str, str3, str2, true), objArr);
        }
    }

    public static void a(String str, b bVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9b8e8e", new Object[]{str, bVar, str2, objArr});
        } else if (!a(3)) {
        } else {
            qol.e("RxPhenix", a(str2, bVar, str, true), objArr);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else if (!a(3)) {
        } else {
            qol.e("RxPhenix", a(str2, str), objArr);
        }
    }

    public static void b(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b832aca", new Object[]{str, str2, str3, objArr});
        } else if (!a(4)) {
        } else {
            qol.f("RxPhenix", a(str, str3, str2, true), objArr);
        }
    }

    public static void b(String str, b bVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a3538f", new Object[]{str, bVar, str2, objArr});
        } else if (!a(4)) {
        } else {
            qol.f("RxPhenix", a(str2, bVar, str, true), objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else if (!a(4)) {
        } else {
            qol.f("RxPhenix", a(str2, str), objArr);
        }
    }

    public static void c(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34847c69", new Object[]{str, str2, str3, objArr});
        } else if (!a(5)) {
        } else {
            qol.g("RxPhenix", a(str, str3, str2, false), objArr);
        }
    }

    public static void c(String str, b bVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ab1890", new Object[]{str, bVar, str2, objArr});
        } else if (!a(5)) {
        } else {
            qol.g("RxPhenix", a(str2, bVar, str, false), objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{str, str2, objArr});
        } else if (!a(5)) {
        } else {
            qol.g("RxPhenix", a(str2, str), objArr);
        }
    }

    public static void d(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85ce08", new Object[]{str, str2, str3, objArr});
        } else if (!a(6)) {
        } else {
            qol.h("RxPhenix", a(str, str3, str2, false), objArr);
        }
    }

    public static void d(String str, b bVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b2dd91", new Object[]{str, bVar, str2, objArr});
        } else if (!a(6)) {
        } else {
            qol.h("RxPhenix", a(str2, bVar, str, false), objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (!a(6)) {
        } else {
            qol.h("RxPhenix", a(str2, str), objArr);
        }
    }

    public static void a(String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51af52f", new Object[]{str, str2, bVar});
        } else {
            a(str, str2, bVar, false);
        }
    }

    public static void a(String str, String str2, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be446385", new Object[]{str, str2, bVar, new Boolean(z)});
        } else if (!a(6)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[falcoId:");
            sb.append(bVar.b().f18937a);
            sb.append("] | ");
            sb.append("[requestId:");
            sb.append(bVar.H());
            sb.append("] |");
            sb.append(str2);
            if (z) {
                sb.append("| ");
                sb.append(bVar.p());
            }
            qol.a(6, str, sb.toString());
        }
    }
}
