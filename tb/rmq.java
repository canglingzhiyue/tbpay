package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rmq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f33237a;
    public static float b;
    public static int c;
    public static int d;
    public static Context e;
    public static float f;
    public static boolean g;

    static {
        kge.a(1703580925);
        f = 640.0f;
        g = true;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            a(context, true);
        }
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        e = applicationContext;
        if (applicationContext == null) {
            f33237a = 0.0f;
            g = false;
            return;
        }
        DisplayMetrics displayMetrics = e.getResources().getDisplayMetrics();
        f33237a = displayMetrics.density;
        g = z;
        b = displayMetrics.densityDpi;
        c = displayMetrics.widthPixels;
        d = displayMetrics.heightPixels;
    }

    public static int a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f2)})).intValue();
        }
        float f3 = (f2 * f33237a) + 0.5f;
        if (f3 > 0.0f && f3 < 1.0f) {
            return 0;
        }
        return (int) f3;
    }

    public static int b(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{new Float(f2)})).intValue();
        }
        float a2 = (f2 * a()) / f;
        if (a2 > 0.0f && a2 < 1.0f) {
            return 1;
        }
        return (int) a2;
    }

    private static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        int i = e.getResources().getConfiguration().orientation;
        return c;
    }

    public static int c(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b3989", new Object[]{new Float(f2)})).intValue();
        }
        if (g) {
            if (f2 == -2.0f) {
                return -2;
            }
            if (f2 >= 0.0f) {
                return a(f2);
            }
            return -1;
        } else if (f2 == -2.0f) {
            return -2;
        } else {
            if (f2 < 0.0f) {
                return -1;
            }
            float f3 = f33237a;
            return f3 > 0.0f ? a(f2 / f3) : b(f2);
        }
    }
}
