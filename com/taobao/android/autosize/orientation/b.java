package com.taobao.android.autosize.orientation;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBAutoSize.Orientation";

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else {
            a(activity, i, false);
        }
    }

    public static void b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0be8", new Object[]{activity, new Integer(i)});
        } else {
            a(activity, i, true);
        }
    }

    private static void a(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca63f6b", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else if (activity == null) {
        } else {
            if (Build.VERSION.SDK_INT == 26) {
                if (a(activity)) {
                    TLog.loge(TAG, "isTranslucentOrFloating is true, No orientation set");
                    return;
                }
                TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(0, new int[]{16842840});
                if (obtainStyledAttributes != null && obtainStyledAttributes.getBoolean(0, false)) {
                    TLog.loge(TAG, "windowIsTranslucent is true, No orientation set");
                    return;
                } else if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
            }
            int requestedOrientation = activity.getRequestedOrientation();
            if (!z && i == requestedOrientation) {
                return;
            }
            activity.setRequestedOrientation(i);
        }
    }

    private static boolean a(Activity activity) {
        try {
            Field declaredField = Class.forName("com.android.internal.R$styleable").getDeclaredField("Window");
            declaredField.setAccessible(true);
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes((int[]) declaredField.get(null));
            Method declaredMethod = ActivityInfo.class.getDeclaredMethod("isTranslucentOrFloating", TypedArray.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, obtainStyledAttributes)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
