package com.vivo.push.util;

import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static int f24270a = -1;

    public static int a() {
        if (Build.VERSION.SDK_INT < 17) {
            return 0;
        }
        int i = f24270a;
        if (i != -1) {
            return i;
        }
        try {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            declaredMethod.setAccessible(true);
            f24270a = ((Integer) declaredMethod.invoke(null, null)).intValue();
            u.d("MultiUserManager", "getMyUserId = " + f24270a);
            return f24270a;
        } catch (Exception e) {
            u.a("MultiUserManager", "getMyUserId error " + e.getMessage());
            return 0;
        }
    }
}
