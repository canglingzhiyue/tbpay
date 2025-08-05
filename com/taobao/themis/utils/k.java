package com.taobao.themis.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static float f22888a;
    private static int b;
    private static int c;

    static {
        kge.a(-170607745);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        c(context);
        return (int) ((f * f22888a) + 0.5f);
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            if (f22888a != 0.0f) {
                return;
            }
            f22888a = context.getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            Log.e("ScreenUtils", "initScale fail", th);
        }
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        c(context);
        return (int) ((i / f22888a) + 0.5f);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        b = i;
        return i;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        int i = context.getResources().getDisplayMetrics().heightPixels;
        c = i;
        return i;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        if (dimensionPixelSize >= 3 || !(context instanceof Activity)) {
            return dimensionPixelSize;
        }
        try {
            Rect rect = new Rect();
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        } catch (Throwable th) {
            Log.e("ScreenUtils", "getStatusBarHeight fail", th);
            return dimensionPixelSize;
        }
    }
}
