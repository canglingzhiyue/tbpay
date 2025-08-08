package tb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.Globals;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class knk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int d;
    public static int e;
    public static int f;
    private static final String g = "family_pop:" + knk.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public static float f30187a = -1.0f;
    public static int b = -1;
    public static int c = -1;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = Globals.getApplication().getResources().getDisplayMetrics();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            d = 96;
        }
        Configuration configuration = Globals.getApplication().getResources().getConfiguration();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            d = 96;
        }
        if (configuration.orientation == 2) {
            e = displayMetrics.heightPixels / 2;
            f30187a = displayMetrics.density;
            b = displayMetrics.heightPixels;
            c = displayMetrics.widthPixels - d;
            f = b << 1;
            return;
        }
        e = displayMetrics.widthPixels / 2;
        f30187a = displayMetrics.density;
        b = displayMetrics.widthPixels;
        c = displayMetrics.heightPixels - d;
        f = b << 1;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        if (b < 0) {
            a();
        }
        return b;
    }

    public static float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[0])).floatValue();
        }
        if (f30187a < 0.0f) {
            a();
        }
        return f30187a;
    }

    public static int a(float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f2)})).intValue() : (int) ((f2 * e()) + 0.5f);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (b <= 0) {
            a();
        }
        return (int) (i * (b / 750.0f));
    }

    public static int b() {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (a(Globals.getApplication()) && (identifier = (resources = Globals.getApplication().getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        String str = Build.BRAND;
        if (!StringUtils.isEmpty(str) && "huawei".equals(str.toLowerCase())) {
            return b(context);
        }
        return c(context);
    }

    private static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier == 0) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        boolean z = resources.getBoolean(identifier);
        String c2 = c();
        if ("1".equals(c2)) {
            return false;
        }
        if (!"0".equals(c2)) {
            return z;
        }
        return true;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey() && !KeyCharacterMap.deviceHasKey(4);
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return point2.y != point.y;
    }

    private static String c() {
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
}
