package tb;

import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.widget.Toast;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.core.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class epo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_IMG_BIZ_CODE = 15;
    public static final String DETAIL_IMG_BIZ_NAME = "detail";

    /* renamed from: a  reason: collision with root package name */
    public static float f27511a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    private static Application p;
    private static Resources q;
    private static LayoutInflater r;
    private static DisplayMetrics s;

    static {
        kge.a(-198589573);
        f27511a = m().density;
        b = h();
        c = i();
        float f2 = f27511a;
        d = (int) (2.0f * f2);
        e = (int) (4.0f * f2);
        f = (int) (6.0f * f2);
        g = (int) (8.0f * f2);
        h = (int) (10.0f * f2);
        i = (int) (12.0f * f2);
        j = (int) (14.0f * f2);
        k = (int) (16.0f * f2);
        l = (int) (18.0f * f2);
        m = (int) (20.0f * f2);
        n = (int) (28.0f * f2);
        o = (int) (f2 * 42.0f);
        p = null;
        q = null;
        r = null;
        s = null;
        emu.a("com.taobao.android.detail.datasdk.protocol.utils.CommonUtils");
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
        }
        if (p == null) {
            try {
                p = epj.a().getApplication();
            } catch (Exception unused) {
            }
            if (p == null) {
                p = l();
            }
        }
        return p;
    }

    private static Application l() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        f27511a = m().density;
        b = h();
        c = i();
        float f2 = f27511a;
        d = (int) (2.0f * f2);
        e = (int) (4.0f * f2);
        f = (int) (6.0f * f2);
        g = (int) (8.0f * f2);
        h = (int) (10.0f * f2);
        i = (int) (12.0f * f2);
        j = (int) (14.0f * f2);
        k = (int) (16.0f * f2);
        l = (int) (18.0f * f2);
        m = (int) (20.0f * f2);
        n = (int) (28.0f * f2);
        o = (int) (f2 * 42.0f);
    }

    public static Resources c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("dee696fb", new Object[0]);
        }
        if (q == null) {
            q = a().getResources();
        }
        return q;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : epj.a().getAppVersion();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        IAppAdapter a2 = epj.a();
        return a2 == null ? "" : a2.getTTID();
    }

    public static d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("3318899e", new Object[0]);
        }
        if (epj.c() == null) {
            throw new NullPointerException("please inject ILoginAdapter before use");
        }
        return epj.c();
    }

    private static DisplayMetrics m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("39f3bd97", new Object[0]);
        }
        if (s == null) {
            s = c().getDisplayMetrics();
        }
        return s;
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue();
        }
        DisplayMetrics m2 = m();
        int i2 = 1 == c().getConfiguration().orientation ? m2.widthPixels : m2.heightPixels;
        int i3 = m2.widthPixels < m2.heightPixels ? m2.widthPixels : m2.heightPixels;
        if (i2 != i3) {
            epp.a("CommonUtils", "getScreenWidth's old logic error! oldResult = " + String.valueOf(i2) + ", newResult = " + String.valueOf(i3));
        }
        return i3;
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue();
        }
        DisplayMetrics m2 = m();
        int i2 = 1 == c().getConfiguration().orientation ? m2.heightPixels : m2.widthPixels;
        int i3 = m2.widthPixels < m2.heightPixels ? m2.heightPixels : m2.widthPixels;
        if (i2 != i3) {
            epp.a("CommonUtils", "getScreenHeight's old logic error! oldResult = " + String.valueOf(i2) + ", newResult = " + String.valueOf(i3));
        }
        return i3;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        Toast makeText = Toast.makeText(a(), "", 0);
        makeText.setText(str);
        makeText.show();
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else {
            a(c().getString(i2));
        }
    }

    public static int b(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i2)})).intValue() : (int) (i2 * k());
    }

    public static double j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fdf", new Object[0])).doubleValue() : (b * 1.0d) / c;
    }

    public static float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[0])).floatValue() : m().density;
    }
}
