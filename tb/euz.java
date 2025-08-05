package tb;

import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class euz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int SIZE_10;
    public static final int SIZE_12;
    public static final int SIZE_14;
    public static final int SIZE_16;
    public static final int SIZE_18;
    public static final int SIZE_2;
    public static final int SIZE_20;
    public static final int SIZE_28;
    public static final int SIZE_4;
    public static final int SIZE_42;
    public static final int SIZE_6;
    public static final int SIZE_8;

    /* renamed from: a  reason: collision with root package name */
    private static Application f27592a;
    private static Resources b;
    private static LayoutInflater c;
    private static DisplayMetrics d;
    public static final float screen_density = f().density;
    public static final int screen_width = d();
    public static final int screen_height = g();

    static {
        float f = screen_density;
        SIZE_2 = (int) (2.0f * f);
        SIZE_4 = (int) (4.0f * f);
        SIZE_6 = (int) (6.0f * f);
        SIZE_8 = (int) (8.0f * f);
        SIZE_10 = (int) (10.0f * f);
        SIZE_12 = (int) (12.0f * f);
        SIZE_14 = (int) (14.0f * f);
        SIZE_16 = (int) (16.0f * f);
        SIZE_18 = (int) (18.0f * f);
        SIZE_20 = (int) (20.0f * f);
        SIZE_28 = (int) (28.0f * f);
        SIZE_42 = (int) (f * 42.0f);
        f27592a = null;
        b = null;
        c = null;
        d = null;
        tpc.a("com.taobao.android.detail.protocol.utils.CommonUtils");
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
        }
        if (f27592a == null) {
            try {
                f27592a = euy.c().getApplication();
            } catch (Exception unused) {
            }
            if (f27592a == null) {
                f27592a = e();
            }
        }
        return f27592a;
    }

    private static Application e() {
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

    public static Resources b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("780dd73a", new Object[0]);
        }
        if (b == null) {
            b = a().getResources();
        }
        return b;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : euy.c().getTTID();
    }

    private static DisplayMetrics f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("c90d9990", new Object[0]);
        }
        if (d == null) {
            d = b().getDisplayMetrics();
        }
        return d;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        DisplayMetrics f = f();
        int i = 1 == b().getConfiguration().orientation ? f.widthPixels : f.heightPixels;
        int i2 = f.widthPixels < f.heightPixels ? f.widthPixels : f.heightPixels;
        if (i != i2) {
            Log.e("CommonUtils", "getScreenWidth's old logic error! oldResult = " + String.valueOf(i) + ", newResult = " + String.valueOf(i2));
        }
        return i2;
    }

    private static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue();
        }
        DisplayMetrics f = f();
        int i = 1 == b().getConfiguration().orientation ? f.heightPixels : f.widthPixels;
        int i2 = f.widthPixels < f.heightPixels ? f.heightPixels : f.widthPixels;
        if (i != i2) {
            Log.e("CommonUtils", "getScreenHeight's old logic error! oldResult = " + String.valueOf(i) + ", newResult = " + String.valueOf(i2));
        }
        return i2;
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : (int) (i * screen_density);
    }
}
