package com.taobao.android.launcher.bootstrap.tao.biz.touch;

import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.sxs;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f13078a;

    static {
        try {
            f13078a = Class.forName("com.android.internal.policy.DecorView");
        } catch (ClassNotFoundException unused) {
        }
    }

    private static void b(View view, sxs sxsVar) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cls = f13078a;
        if (cls == null) {
            return;
        }
        Field declaredField = cls.getDeclaredField("mWindow");
        declaredField.setAccessible(true);
        Window window = (Window) declaredField.get(view);
        window.setCallback(new f(window.getCallback(), new c(view.getContext(), new d(sxsVar))));
    }

    public static boolean a(View view, sxs sxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2259de70", new Object[]{view, sxsVar})).booleanValue();
        }
        if (!f13078a.isInstance(view)) {
            return false;
        }
        try {
            b(view, sxsVar);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
