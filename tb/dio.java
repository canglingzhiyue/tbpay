package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class dio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2119766481);
    }

    public static int c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("919287f0", new Object[]{str, objArr})).intValue();
        }
        return 0;
    }

    public static int a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82c81db2", new Object[]{str, objArr})).intValue() : Log.w(str, a(objArr));
    }

    public static int a(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43281341", new Object[]{str, th, objArr})).intValue() : Log.e(str, a(objArr), th);
    }

    public static int b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a2d52d1", new Object[]{str, objArr})).intValue() : Log.e(str, a(objArr));
    }

    private static String a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{objArr});
        }
        String str = "";
        for (int i = 0; i < objArr.length; i++) {
            str = str + objArr[i] + " ";
        }
        return str;
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (j >= 0 && j < 1024) {
            return j + " B";
        } else if (j >= 1024 && j < 1048576) {
            return (j / 1024) + " KB";
        } else if (j >= 1048576 && j < 1073741824) {
            return (j / 1048576) + " MB";
        } else if (j >= 1073741824 && j < 1099511627776L) {
            return (j / 1073741824) + " GB";
        } else if (j >= 1099511627776L) {
            return (j / 1099511627776L) + " TB";
        } else {
            return j + " Bytes";
        }
    }
}
