package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;
import com.taobao.android.weex_framework.util.a;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class eme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Point[] f27426a;

    static {
        kge.a(278813071);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailInsideUtil");
        f27426a = new Point[2];
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context instanceof c) {
            return ((c) context).J_();
        }
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : a(context) && ((c) context).c() == 1;
    }

    public static boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8972fadf", new Object[]{cVar})).booleanValue() : cVar.a(1.0f);
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (a(context)) {
            return bay.b();
        }
        return 0;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        if (a(context)) {
            return ((c) context).d();
        }
        return 0;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue() : ((int) (f(context) * 0.25d)) - g(context);
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return i(context);
        }
        if (context.getResources().getConfiguration().orientation != 1) {
            c = 1;
        }
        if (f27426a[c] == null) {
            WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService(a.ATOM_EXT_window);
            if (windowManager == null) {
                return i(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f27426a[c] = point;
        }
        return f27426a[c].y;
    }

    public static int g(Context context) {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        if (h(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier == 0) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        boolean z = resources.getBoolean(identifier);
        String a2 = a();
        if ("1".equals(a2)) {
            return false;
        }
        if (!"0".equals(a2)) {
            return z;
        }
        return true;
    }

    private static String a() {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static int i(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a382c14b", new Object[]{context})).intValue() : context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }
}
