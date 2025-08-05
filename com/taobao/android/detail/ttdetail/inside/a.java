package com.taobao.android.detail.ttdetail.inside;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-516220700);
    }

    public static void a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT != 26 && Build.VERSION.SDK_INT != 27) {
            return;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
            declaredField.setAccessible(false);
        } catch (Exception e) {
            i.a("InsideDetailUtils", "fixScreenOrientationOnSDK_O error : " + e.getMessage());
            activity.setRequestedOrientation(-1);
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else if (Build.VERSION.SDK_INT < 30) {
            d(activity);
        } else {
            e(activity);
        }
    }

    private static void d(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable th) {
            i.a("InsideDetailUtils", "convertActivityFromTranslucent error", th);
        }
    }

    private static void e(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("setTranslucent", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, false);
        } catch (Throwable th) {
            i.a("InsideDetailUtils", "convertActivityFromTranslucent error", th);
        }
    }

    public static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{activity})).booleanValue();
        }
        if (activity == null || activity.getIntent().getData() == null || e.b()) {
            i.a("InsideDetailUtils", "not inside");
            return false;
        }
        Uri data = activity.getIntent().getData();
        if (Boolean.TRUE.toString().equals(data.getQueryParameter("insideDetail"))) {
            i.a("InsideDetailUtils", "is inside , has insideDetail=true");
            return true;
        }
        String uri = data.toString();
        if (uri.startsWith("http://h5.m.taobao.com/awp/core/detail/inside.htm") || uri.startsWith("https://h5.m.taobao.com/awp/core/detail/inside.htm")) {
            z = true;
        }
        i.a("InsideDetailUtils", "is inside pathMatch : " + z);
        return z;
    }
}
