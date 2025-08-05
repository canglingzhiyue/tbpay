package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.avplayer.DWContext;

/* loaded from: classes6.dex */
public class kcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f29960a;

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (kck.f29959a != null) {
            return ((WindowManager) kck.f29959a.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
        }
        return 600;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (kck.f29959a != null) {
            return ((WindowManager) kck.f29959a.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        }
        return 600;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        int a2 = a();
        int b = b();
        return a2 < b ? a2 : b;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        int a2 = a();
        int b = b();
        return a2 > b ? a2 : b;
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static int b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366e", new Object[]{activity})).intValue();
        }
        if (Build.VERSION.SDK_INT == 18) {
            return b();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return c((Context) activity);
        }
        return activity.getRequestedOrientation() == 1 ? b() - a((Context) activity) : b();
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue();
        }
        if (Float.isNaN(f)) {
            return 0;
        }
        float a2 = (f * a()) / 750.0f;
        double d = a2;
        if (d > 0.005d && a2 < 1.0f) {
            return 1;
        }
        return (int) Math.rint(d);
    }

    public static int b(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int c(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void a(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d90664", new Object[]{window, new Integer(i)});
        } else if (Build.VERSION.SDK_INT <= 18) {
        } else {
            ((ViewGroup) window.getDecorView()).setSystemUiVisibility(i);
        }
    }

    public static int a(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af06fc72", new Object[]{window})).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int systemUiVisibility = viewGroup.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT > 18 && systemUiVisibility != 4102) {
            viewGroup.setSystemUiVisibility(4102);
        }
        return systemUiVisibility;
    }

    public static int a(DWContext dWContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42df6736", new Object[]{dWContext})).intValue();
        }
        if (dWContext.isActivityToggleForLandscape() && dWContext.getActivity() != null && (dWContext.getActivity().getRequestedOrientation() == 0 || dWContext.getActivity().getRequestedOrientation() == 8)) {
            if (Build.VERSION.SDK_INT == 18) {
                return a();
            }
            if (Build.VERSION.SDK_INT < 18) {
                return a() - a((Context) dWContext.getActivity());
            }
            return b((Context) dWContext.getActivity());
        }
        return b(dWContext.getActivity());
    }

    public static int b(DWContext dWContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b71e9f95", new Object[]{dWContext})).intValue();
        }
        if (dWContext.isActivityToggleForLandscape() && dWContext.getActivity() != null && (dWContext.getActivity().getRequestedOrientation() == 0 || dWContext.getActivity().getRequestedOrientation() == 8)) {
            if (Build.VERSION.SDK_INT == 18) {
                return b();
            }
            if (Build.VERSION.SDK_INT < 18) {
                return b() - a((Context) dWContext.getActivity());
            }
            return c((Context) dWContext.getActivity());
        }
        return b((Context) dWContext.getActivity());
    }

    static {
        kge.a(2102341854);
        f29960a = -1;
    }

    public static int c(Activity activity) {
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("792c472f", new Object[]{activity})).intValue();
        }
        int i = f29960a;
        if (i != -1) {
            return i;
        }
        if (activity == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 28 && (decorView = activity.getWindow().getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            int safeInsetTop = displayCutout.getSafeInsetTop();
            f29960a = safeInsetTop;
            return safeInsetTop;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
                f29960a = 80;
                return 80;
            } else if (d(activity)) {
                int a2 = a(activity, 27.0f);
                f29960a = a2;
                return a2;
            } else if (e(activity)) {
                int i2 = g(activity)[1];
                f29960a = i2;
                return i2;
            } else if (f(activity)) {
                int identifier = activity.getResources().getIdentifier("notch_height", "dimen", "android");
                if (identifier > 0) {
                    f29960a = activity.getResources().getDimensionPixelSize(identifier);
                }
                return f29960a;
            }
        }
        f29960a = 0;
        return 0;
    }

    private static boolean d(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean e(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean f(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int[] g(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return (int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (Throwable unused) {
            return iArr;
        }
    }
}
