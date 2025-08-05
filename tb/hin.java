package tb;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taolive.sdk.utils.y;

/* loaded from: classes6.dex */
public class hin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Point[] f28691a;

    static {
        kge.a(1369469094);
        f28691a = new Point[2];
    }

    public static int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{new Boolean(z)})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return b();
        }
        if (f28691a[z ? 1 : 0] == null) {
            WindowManager windowManager = (WindowManager) pmd.a().u().c().getSystemService(a.ATOM_EXT_window);
            if (windowManager == null) {
                return b();
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f28691a[z] = point;
        }
        return f28691a[z].y;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            return b();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : (y.b(context) || y.c(context)) && y.d(context);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : pmd.a().u().c().getResources().getDisplayMetrics().widthPixels;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : pmd.a().u().c().getResources().getDisplayMetrics().heightPixels;
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : Math.round(a() * (f / 375.0f));
    }

    public static int a(DinamicXEngine dinamicXEngine, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534b544", new Object[]{dinamicXEngine, context, new Float(f)})).intValue();
        }
        if (y.a(context)) {
            return gbg.a(dinamicXEngine, context, f);
        }
        return b(f);
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{new Float(f)})).intValue() : Math.round(Math.min(a(), b()) * (f / 375.0f));
    }
}
