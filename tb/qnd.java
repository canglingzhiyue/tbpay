package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes8.dex */
public class qnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Point[] f32951a;

    static {
        kge.a(-2044589786);
        f32951a = new Point[2];
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return b();
        }
        char c = 1;
        if (pmd.a().u().c().getResources().getConfiguration().orientation == 1) {
            c = 0;
        }
        if (f32951a[c] == null) {
            WindowManager windowManager = (WindowManager) pmd.a().u().c().getSystemService(a.ATOM_EXT_window);
            if (windowManager == null) {
                return b();
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f32951a[c] = point;
        }
        return f32951a[c].y;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : pmd.a().u().c().getResources().getDisplayMetrics().heightPixels;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        try {
            if ((context instanceof Activity) && !a((Activity) context)) {
                return 0;
            }
            if ((context instanceof Activity) && !b(context)) {
                return 0;
            }
            if (((context instanceof Activity) && !c(context)) || context == null) {
                return 0;
            }
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(childAt.getId()))) {
                    return childAt.getVisibility() == 0;
                }
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT < 17) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey() && !KeyCharacterMap.deviceHasKey(4);
            }
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            Point point = new Point();
            Point point2 = new Point();
            defaultDisplay.getSize(point);
            defaultDisplay.getRealSize(point2);
            return point2.y != point.y;
        } catch (Exception e) {
            Log.e("AndroidUtils", "isNavigationBarShow exp : " + e.getMessage());
            return false;
        }
    }

    private static boolean c(Context context) {
        int i;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        return b() < i;
    }
}
