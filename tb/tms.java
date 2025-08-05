package tb;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class tms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f34224a;

    static {
        boolean d = dis.d();
        f34224a = d;
        if (d) {
            a();
        }
    }

    private static void a() {
        try {
            Method declaredMethod = Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!f34224a || Build.VERSION.SDK_INT < 18) {
        } else {
            String str3 = str + "_" + str2;
            Trace.beginSection(str3.substring(0, Math.min(str3.length(), 127)));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!f34224a || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.endSection();
        }
    }

    public static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i)});
        } else if (!f34224a || Build.VERSION.SDK_INT < 29) {
        } else {
            String str3 = str + "_" + str2;
            Trace.beginAsyncSection(str3.substring(0, Math.min(str3.length(), 127)), i);
        }
    }

    public static void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fca26", new Object[]{str, str2, new Integer(i)});
        } else if (!f34224a || Build.VERSION.SDK_INT < 29) {
        } else {
            String str3 = str + "_" + str2;
            Trace.endAsyncSection(str3.substring(0, Math.min(str3.length(), 127)), i);
        }
    }
}
