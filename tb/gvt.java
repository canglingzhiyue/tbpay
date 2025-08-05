package tb;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.h;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class gvt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f28524a;

    static {
        boolean a2 = h.a(".dag_systrace_x_open");
        f28524a = a2;
        if (a2) {
            b();
        }
    }

    private static void b() {
        try {
            Method declaredMethod = Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!f28524a || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.beginSection(str.substring(0, Math.min(str.length(), 127)));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f28524a || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.endSection();
        }
    }
}
