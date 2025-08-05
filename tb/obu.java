package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.p;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class obu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f31900a;
    private static volatile Application d;
    private static String e;
    public static final JSONObject processMap;

    static {
        kge.a(1020533306);
        processMap = new JSONObject();
        f31900a = -1;
    }

    private obu() {
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (f31900a == -1) {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    f31900a = 1;
                } else {
                    f31900a = 0;
                }
            } catch (Exception unused) {
                f31900a = 0;
            }
        }
        return f31900a == 1;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a(e());
    }

    public static ViewGroup g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[0]) : a.a().b().f();
    }

    public static int b() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        int b = ohd.b((Context) e(), 48);
        try {
            ViewGroup d2 = d();
            if (d2 == null || (childAt = d2.getChildAt(0)) == null) {
                return b;
            }
            int[] iArr = new int[2];
            d2.getLocationOnScreen(iArr);
            int height = iArr[1] + d2.getHeight();
            int[] iArr2 = new int[2];
            childAt.getLocationOnScreen(iArr2);
            int height2 = height - (iArr2[1] + childAt.getHeight());
            return height2 > 0 ? height2 : b;
        } catch (Throwable th) {
            spz.c("AppUtils", "获取底部TabBar的高度，" + th.getMessage());
            return b;
        }
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
            spz.c("AppUtils", "获取底部TabBar父节点的高度，" + th.getMessage());
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

    public static int a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fda67", new Object[]{context, new Boolean(z)})).intValue();
        }
        int c = c();
        spz.c("AppUtils", "[画幅]getAvailableHeight PickPreloadControllerNew,测量组件宽高时适配底部虚拟导航栏，tabBarParentHeight：" + c);
        if (c <= 0) {
            c = ohd.g(context);
        }
        int h = c - ohd.h(context);
        spz.c("AppUtils", "[画幅]availableHeight=" + h);
        if (!sjt.u() || !spj.a(context, z)) {
            return h;
        }
        int b = b();
        int i = h - b;
        spz.c("AppUtils", "[画幅]，减去手淘底bar高度 bottomTabBarHeight：" + b + ";availableHeight=" + i);
        return i;
    }

    public static Application e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("9e618a3b", new Object[0]);
        }
        if (d == null) {
            synchronized (obu.class) {
                if (d == null) {
                    d = h();
                }
            }
        }
        return d;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        if (TextUtils.isEmpty(e) && e() != null) {
            e = e().getPackageName();
        }
        return e;
    }

    private static Application h() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e2) {
            spz.a("AppUtils", "getSystemApp error", e2);
            return null;
        }
    }

    public static boolean b(Context context) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : (context instanceof Activity) && (f = a.a().b().f()) != null && f.getContext() == context;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : p.a();
    }
}
