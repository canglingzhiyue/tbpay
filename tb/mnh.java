package tb;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.monitor.impl.common.e;

/* loaded from: classes7.dex */
public class mnh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static int f31134a = -1;
    public static final int screenHeight;
    public static final int screenWidth;

    static {
        Display defaultDisplay = ((WindowManager) e.a().b().getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
        screenHeight = defaultDisplay.getHeight();
        screenWidth = defaultDisplay.getWidth();
    }

    public static View[] a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View[]) ipChange.ipc$dispatch("4fc316ec", new Object[]{viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = viewGroup.getChildAt(i);
        }
        return viewArr;
    }

    public static boolean a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7536b92c", new Object[]{view, view2})).booleanValue();
        }
        int[] b = b(view, view2);
        int i = b[1];
        int height = b[1] + view.getHeight();
        return i < screenHeight && height > 0 && b[0] + view.getWidth() > 0 && b[0] < screenWidth && height - i > 0;
    }

    public static int[] b(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f48cd61b", new Object[]{view, view2});
        }
        int[] iArr = {0, 0};
        while (view != view2) {
            iArr[1] = iArr[1] + view.getTop();
            iArr[0] = iArr[0] + view.getLeft();
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return iArr;
    }

    public static boolean a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628634dc", new Object[]{activity, view})).booleanValue();
        }
        if (activity == null || view == null) {
            return false;
        }
        View decorView = (activity.getWindow() == null || activity.getWindow().getDecorView() == null) ? null : activity.getWindow().getDecorView();
        while (decorView != view) {
            if (view.getParent() == null || !(view.getParent() instanceof View)) {
                view = null;
                continue;
            } else {
                view = (View) view.getParent();
                continue;
            }
            if (view == null) {
                return false;
            }
        }
        return true;
    }
}
