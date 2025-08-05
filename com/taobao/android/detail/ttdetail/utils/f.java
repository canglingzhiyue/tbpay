package com.taobao.android.detail.ttdetail.utils;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.emh;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Application f10965a;
    public static float b;
    public static int c;
    public static int d;

    static {
        kge.a(890054579);
        b = -1.0f;
        c = -1;
        d = -1;
        DisplayMetrics displayMetrics = a().getResources().getDisplayMetrics();
        if (a().getResources().getConfiguration().orientation == 2) {
            b = displayMetrics.density;
            c = displayMetrics.heightPixels;
            d = displayMetrics.widthPixels;
            return;
        }
        b = displayMetrics.density;
        c = displayMetrics.widthPixels;
        d = displayMetrics.heightPixels;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : context.getResources().getDisplayMetrics().heightPixels;
    }

    public static boolean a(int i, int i2, float f, int[] iArr) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c5f0a", new Object[]{new Integer(i), new Integer(i2), new Float(f), iArr})).booleanValue();
        }
        if (f < -0.01f) {
            iArr[0] = i;
            iArr[1] = i2;
            return false;
        }
        float f2 = i;
        float f3 = i2;
        if ((1.0f * f2) / f3 > f) {
            i4 = (int) (f3 * f);
            i3 = i2;
        } else {
            i3 = (int) (f2 / f);
            i4 = i;
        }
        try {
            iArr[0] = i4;
            iArr[1] = i3;
            return true;
        } catch (Throwable unused) {
            iArr[0] = i;
            iArr[1] = i2;
            return false;
        }
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue() : a(str, 1.0f);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
        } catch (Throwable th) {
            i.a("DisplayUtil", "parseVideoRatio failed for dimension: " + str, th);
        }
        if (emh.sDefaultDimension.equalsIgnoreCase(str)) {
            return 1.0f;
        }
        if (!TextUtils.isEmpty(str) && str.contains(":")) {
            String[] split = str.split(":", 2);
            return split.length < 2 ? f : Float.parseFloat(split[0]) / Float.parseFloat(split[1]);
        }
        return f;
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
        }
        if (f10965a == null) {
            f10965a = b();
        }
        if (f10965a == null) {
            f10965a = odg.b().a();
        }
        return f10965a;
    }

    private static Application b() {
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

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) (f * a().getResources().getDisplayMetrics().density);
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{new Float(f)})).intValue() : (int) (f / a().getResources().getDisplayMetrics().density);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) (f * context.getResources().getDisplayMetrics().density);
    }
}
