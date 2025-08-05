package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class ohd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ResUtil";

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Integer> f32052a;
    private static Pattern b;
    private static DisplayMetrics c;
    private static float d;

    static {
        kge.a(1695424350);
        f32052a = new HashMap<>();
        b = Pattern.compile("^([-]?[\\d]+[\\.]?[\\d]*).*");
        d = 0.0f;
        if (Build.VERSION.SDK_INT < 24 || !oeb.a("enableStableDensity", true)) {
            return;
        }
        d = (DisplayMetrics.DENSITY_DEVICE_STABLE * 1.0f) / 160.0f;
    }

    @Deprecated
    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{context, str})).intValue() : b(null, context, str, false);
    }

    public static int a(aa aaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a891135", new Object[]{aaVar, context, str})).intValue() : b(aaVar, context, str, false);
    }

    public static int a(aa aaVar, Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("699c9c5", new Object[]{aaVar, context, str, new Boolean(z)})).intValue() : b(aaVar, context, str, z);
    }

    private static int b(aa aaVar, Context context, String str, boolean z) {
        int i;
        int parseFloat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ee00a06", new Object[]{aaVar, context, str, new Boolean(z)})).intValue();
        }
        if (str == null) {
            return 0;
        }
        int j = ad.j(aaVar);
        try {
            i = (int) (Float.parseFloat(str) + 0.5d);
            try {
                if (a(j)) {
                    return e(context, i);
                }
            } catch (Throwable unused) {
                try {
                    String trim = str.trim();
                    if (trim.endsWith("rpx")) {
                        if (a(j)) {
                            return e(context, trim);
                        }
                        i = oec.a((Object) trim.substring(0, trim.length() - 3), 0);
                    } else if (trim.endsWith("px") && !trim.endsWith("rpx")) {
                        return oec.a((Object) trim.substring(0, trim.length() - 2), i);
                    } else {
                        if (trim.endsWith("wx")) {
                            parseFloat = (int) (Float.parseFloat(trim.substring(0, trim.length() - 2)) + 0.5d);
                            try {
                                if (z) {
                                    return d(context, parseFloat);
                                }
                                return f(context, parseFloat);
                            } catch (Throwable unused2) {
                                i = parseFloat;
                                return c(context, i);
                            }
                        } else if (oeb.bY()) {
                            Matcher matcher = b.matcher(trim);
                            if (matcher.matches()) {
                                parseFloat = (int) (Float.parseFloat(matcher.group(1)) + 0.5d);
                            }
                        }
                        i = parseFloat;
                    }
                } catch (Throwable unused3) {
                }
                return c(context, i);
            }
        } catch (Throwable unused4) {
            i = 0;
        }
        return c(context, i);
    }

    @Deprecated
    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        if (a(3)) {
            return e(context, f);
        }
        return c(context, f);
    }

    @Deprecated
    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        if (a(3)) {
            return e(context, i);
        }
        return c(context, i);
    }

    public static int a(aa aaVar, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe79c13b", new Object[]{aaVar, context, new Float(f)})).intValue();
        }
        if (a(ad.j(aaVar))) {
            return e(context, f);
        }
        return c(context, f);
    }

    public static int b(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a7862d7", new Object[]{context, new Integer(i)})).intValue() : (int) ((i * c(context)) + 0.5d);
    }

    public static int f(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e1b83db", new Object[]{context, new Integer(i)})).intValue() : (int) ((i * n(context)) + 0.5d);
    }

    public static int c(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f612b18", new Object[]{context, new Integer(i)})).intValue() : (int) (i * c(context));
    }

    public static int d(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6449f359", new Object[]{context, new Integer(i)})).intValue() : (int) ((i * d(context)) + 0.5d);
    }

    public static int e(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7932bb9a", new Object[]{context, new Integer(i)})).intValue() : (int) ((i / c(context)) + 0.5f);
    }

    public static float a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6450", new Object[]{context})).floatValue() : 750.0f / b(context);
    }

    private static int c(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f611fd5", new Object[]{context, new Float(f)})).intValue();
        }
        float b2 = ((b(context) / 750.0f) * f) + 0.5f;
        if (b2 == 0.0f && f > 0.0f) {
            return 1;
        }
        return (int) b2;
    }

    public static int b(aa aaVar, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff483fbc", new Object[]{aaVar, context, new Float(f)})).intValue();
        }
        if (a(ad.j(aaVar))) {
            return d(context, f);
        }
        int b2 = (int) (((750.0f / b(context)) * f) + 0.5d);
        if (b2 == 0 && f > 0.0f) {
            return 1;
        }
        return b2;
    }

    @Deprecated
    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue();
        }
        if (a(3)) {
            return d(context, f);
        }
        int b2 = (int) (((750.0f / b(context)) * f) + 0.5d);
        if (b2 == 0 && f > 0.0f) {
            return 1;
        }
        return b2;
    }

    public static int d(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6449e816", new Object[]{context, new Float(f)})).intValue() : (int) (((f * 2.0f) / (a.a().w().b(context) * c(context))) + 0.5f);
    }

    public static int b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b80d7fc", new Object[]{context, str})).intValue();
        }
        Context l = l(context);
        Integer num = f32052a.get(str);
        if (num != null) {
            return num.intValue();
        }
        String[] a2 = oec.a(str, (char) fxb.DIR);
        Integer valueOf = Integer.valueOf(l.getResources().getIdentifier(a2[1], a2[0].substring(1), l.getPackageName()));
        if (valueOf.intValue() != 0) {
            f32052a.put(str, valueOf);
        }
        return valueOf.intValue();
    }

    public static int c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d54b79db", new Object[]{context, str})).intValue();
        }
        String[] a2 = oec.a(str, (char) fxb.DIR);
        String str2 = a2[a2.length - 1];
        if (str2.startsWith("res_id_")) {
            return oec.a((Object) oec.a(str2.substring(7), '.')[0], 0);
        }
        int b2 = b(context, rmm.DRAWABLE_RESOURCE + oec.a(str2, '.')[0]);
        if (b2 != 0) {
            return b2;
        }
        return b(context, "@mipmap/" + oec.a(str2, '.')[0]);
    }

    public static int d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f161bba", new Object[]{context, str})).intValue();
        }
        return b(context, "@string/uik_icon_" + str.substring(6));
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        Context l = l(context);
        IDeviceInfo w = a.a().w();
        if (w != null && w.f() && (l instanceof Activity)) {
            return w.a((Activity) l).width();
        }
        return l.getResources().getDisplayMetrics().widthPixels;
    }

    public static float c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9f76bb8e", new Object[]{context})).floatValue() : l(context).getResources().getDisplayMetrics().density;
    }

    public static float n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e21b63", new Object[]{context})).floatValue();
        }
        float c2 = c(context);
        if (d <= 0.0f) {
            return c2;
        }
        if (oeb.a("useMinDensity", true)) {
            return Math.min(d, c2);
        }
        return d;
    }

    public static float d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a023672d", new Object[]{context})).floatValue() : l(context).getResources().getDisplayMetrics().scaledDensity;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : e(ab.a());
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        Context l = l(context);
        IDeviceInfo w = a.a().w();
        if (w != null && w.f() && (l instanceof Activity)) {
            return w.a((Activity) l).height();
        }
        return l.getResources().getDisplayMetrics().heightPixels;
    }

    private static DisplayMetrics m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("ba81d6f7", new Object[]{context});
        }
        DisplayMetrics displayMetrics = c;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                try {
                    ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics2);
                    if (!a.a().w().f()) {
                        c = displayMetrics2;
                    }
                } catch (Exception unused) {
                }
                return displayMetrics2;
            } catch (Exception unused2) {
                return displayMetrics;
            }
        }
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        c = displayMetrics3;
        return displayMetrics3;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        DisplayMetrics m = m(l(context));
        if (m == null) {
            return 1080;
        }
        return m.widthPixels;
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        DisplayMetrics m = m(l(context));
        if (m == null) {
            return 2340;
        }
        return m.heightPixels;
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2d615ac", new Object[]{context})).intValue();
        }
        Context l = l(context);
        int identifier = l.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return l.getResources().getDimensionPixelSize(identifier);
    }

    private static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4dc189a", new Object[]{context})).booleanValue() : (context instanceof Application) || (a.a().b() != null && a.a().b().a() == context);
    }

    public static int i(Context context) {
        View findViewById;
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a382c14b", new Object[]{context})).intValue();
        }
        Context l = l(context);
        if (k(l)) {
            return b(l, 48);
        }
        if (l instanceof Activity) {
            if ((l instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) l).getSupportActionBar()) != null) {
                i = supportActionBar.c();
            }
            if (i <= 0 && (findViewById = ((Activity) l).findViewById(R.id.action_bar)) != null) {
                i = findViewById.getMeasuredHeight();
            }
        }
        return i <= 0 ? b(l, 48) : i;
    }

    public static boolean b() {
        try {
            return ((Boolean) Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Exception unused) {
            if (Build.DEVICE.equals("mx2")) {
                return true;
            }
            if (Build.DEVICE.equals("mx") || Build.DEVICE.equals("m9")) {
            }
            return false;
        }
    }

    public static void a(View view) {
        if (!b()) {
            return;
        }
        try {
            Method method = View.class.getMethod("setSystemUiVisibility", Integer.TYPE);
            Object[] objArr = new Object[1];
            try {
                objArr[0] = View.class.getField("SYSTEM_UI_FLAG_HIDE_NAVIGATION").get(null);
            } catch (Exception unused) {
            }
            method.invoke(view, objArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean a(Activity activity) {
        WindowManager windowManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
        if (findViewById != null && (windowManager = (WindowManager) activity.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)) != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            }
            int bottom = findViewById.getBottom();
            if (bottom != point.y && point.y - bottom != h(activity)) {
                return true;
            }
        }
        return false;
    }

    public static int b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366e", new Object[]{activity})).intValue();
        }
        Resources resources = activity.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static int a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26196deb", new Object[]{new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        int red = Color.red(i);
        int blue = Color.blue(i);
        int green = Color.green(i);
        int red2 = Color.red(i2);
        int blue2 = Color.blue(i2);
        int green2 = Color.green(i2);
        int alpha = Color.alpha(i);
        return Color.argb((int) (alpha + ((Color.alpha(i2) - alpha) * f) + 0.5d), (int) (red + ((red2 - red) * f) + 0.5d), (int) (green + ((green2 - green) * f) + 0.5d), (int) (blue + ((blue2 - blue) * f) + 0.5d));
    }

    public static Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{str});
        }
        try {
            byte[] decode = Base64.decode(str.split(",")[1], 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError e2) {
            ogg.b(e2.getMessage());
            return null;
        }
    }

    public static TBErrorView j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("40368a10", new Object[]{context});
        }
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tBErrorView.setBackgroundColor(Color.parseColor("#eeeeee"));
        return tBErrorView;
    }

    private static Context l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c689142d", new Object[]{context});
        }
        if (context == null) {
            context = ab.a();
        }
        return context == null ? oea.a() : context;
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            window.setStatusBarColor(i);
        }
    }

    public static void a(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca63f6b", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else if (activity == null) {
        } else {
            View decorView = activity.getWindow().getDecorView();
            if (Build.VERSION.SDK_INT >= 23) {
                if (z) {
                    i2 = 8192;
                }
                decorView.setSystemUiVisibility(i2 | 1280);
            }
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            activity.getWindow().setStatusBarColor(i);
        }
    }

    public static void b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0be8", new Object[]{activity, new Integer(i)});
        } else if (activity == null || Build.VERSION.SDK_INT < 21) {
        } else {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    public static int c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("792c472f", new Object[]{activity})).intValue();
        }
        if (activity != null && Build.VERSION.SDK_INT >= 21) {
            return activity.getWindow().getNavigationBarColor();
        }
        return 1;
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        IDeviceInfo w = a.a().w();
        return i >= 3 && w != null && w.f();
    }

    public static int e(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7932b057", new Object[]{context, new Float(f)})).intValue() : (int) ((((f * c(context)) * a.a().w().b(context)) / 2.0f) + 0.5d);
    }

    private static int e(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48e0bd99", new Object[]{context, str})).intValue() : c(context, Integer.parseInt(str.substring(0, str.length() - 3)));
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        try {
            ViewGroup d2 = d();
            if (d2 != null) {
                return d2.getHeight();
            }
            return 0;
        } catch (Throwable th) {
            ogg.a(TAG, "获取底部TabBar父节点的高度，" + th.getMessage());
            return 0;
        }
    }

    public static ViewGroup d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5ee44eca", new Object[0]);
        }
        ViewGroup f = a.a().b().f();
        if (f == null || !(f.getParent() instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) f.getParent();
    }

    public static int o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a78ec705", new Object[]{context})).intValue();
        }
        int g = g(context);
        int c2 = c();
        ogg.a(TAG, "tab2直播测量组件宽高时适配底部虚拟导航栏，tabBarParentHeight：" + c2);
        return c2 > 0 ? c2 : g;
    }
}
