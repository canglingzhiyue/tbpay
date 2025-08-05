package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.Globals;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class sdt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEVICELEVEL_SP = "taoLiveHomeDeviceLevel";

    /* renamed from: a  reason: collision with root package name */
    private static String f33496a = "";
    private static boolean b = false;
    private static volatile boolean c;
    private static volatile boolean d;
    private static volatile Point[] e = new Point[2];
    public static int f;

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : (Globals.getApplication().getApplicationInfo().flags & 2) != 0;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : Globals.getVersionName();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return l.d(context);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            return l.b(context);
        }
        return false;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            return sdu.a().a(context);
        }
        return false;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : b(context) || (a(context) && c(context));
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (!g(context)) {
            return f(context);
        }
        return j(context);
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static boolean g(Context context) {
        float f2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        if (c) {
            return d;
        }
        c = true;
        d = false;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (point.x < point.y) {
                f2 = point.x;
                i = point.y;
            } else {
                f2 = point.y;
                i = point.x;
            }
            if (i / f2 >= 1.97f) {
                d = true;
            }
        }
        return d;
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2d615ac", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static int a(Context context, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f2)})).intValue() : (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue() : h(context) + f(context) < j(context);
    }

    public static int j(Context context) {
        IpChange ipChange = $ipChange;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a42f6cea", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return f(context);
        }
        if (context.getResources().getConfiguration().orientation != 1) {
            c2 = 1;
        }
        if (e[c2] == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
            if (windowManager == null) {
                return f(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            e[c2] = point;
        }
        return e[c2].y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (a() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r4, android.view.WindowInsets r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.sdt.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r3] = r5
            java.lang.String r4 = "f1725575"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L1c:
            boolean r0 = tb.sdt.b
            if (r0 == 0) goto L21
            return r3
        L21:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L58
            r1 = 27
            if (r0 < r1) goto L2f
            java.lang.Object r5 = a(r5)     // Catch: java.lang.Exception -> L58
            if (r5 == 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 != 0) goto L59
            boolean r0 = k(r4)     // Catch: java.lang.Exception -> L59
            if (r0 != 0) goto L4a
            boolean r4 = l(r4)     // Catch: java.lang.Exception -> L59
            if (r4 != 0) goto L4a
            boolean r4 = c()     // Catch: java.lang.Exception -> L59
            if (r4 != 0) goto L4a
            boolean r4 = a()     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L4b
        L4a:
            r2 = 1
        L4b:
            if (r2 != 0) goto L56
            java.lang.String r4 = tb.mfm.u()     // Catch: java.lang.Exception -> L56
            boolean r5 = a(r4)     // Catch: java.lang.Exception -> L56
            goto L59
        L56:
            r5 = r2
            goto L59
        L58:
            r5 = 0
        L59:
            tb.sdt.b = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sdt.a(android.content.Context, android.view.WindowInsets):boolean");
    }

    private static Object a(WindowInsets windowInsets) {
        if (windowInsets != null) {
            try {
                return windowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(windowInsets, new Object[0]);
            } catch (NoSuchMethodException | Exception unused) {
                return null;
            }
        }
        return null;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optString("model").equals(b())) {
                return true;
            }
        }
        return false;
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (TextUtils.isEmpty(f33496a)) {
            f33496a = Build.MODEL;
        }
        return f33496a;
    }

    private static boolean k(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception unused) {
            return false;
        }
    }

    private static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a588c439", new Object[]{context})).booleanValue();
        }
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() == 1;
        } catch (ClassNotFoundException | Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        try {
            Method method = Class.forName("android.util.FtFeature").getMethod("isFeatureSupport", Integer.TYPE);
            if (method == null) {
                return false;
            }
            return ((Boolean) method.invoke(null, 32)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6356fd4", new Object[]{context});
            return;
        }
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
            Activity activity = (Activity) context;
            if (activity.getWindow().getDecorView() != null && activity.getWindow().getDecorView().getRootWindowInsets() != null && !"EVA-AL00".equals(b())) {
                if (Build.VERSION.SDK_INT >= 28 && activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout() != null) {
                    f = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout().getSafeInsetBottom();
                    return;
                } else {
                    f = activity.getWindow().getDecorView().getRootWindowInsets().getSystemWindowInsetBottom();
                    return;
                }
            }
        }
        f = 0;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : 2 == h();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        int h = h();
        return (h == 1 || h == 2) ? false : true;
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue();
        }
        String a2 = mfi.a(Globals.getApplication(), "taoLiveHomeDeviceLevel");
        if (tio.a(a2) || a2.equals("-1")) {
            int a3 = akt.a();
            mfi.a(Globals.getApplication(), "taoLiveHomeDeviceLevel", String.valueOf(a3));
            return a3;
        }
        return Integer.parseInt(a2);
    }
}
