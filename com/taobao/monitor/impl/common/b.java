package com.taobao.monitor.impl.common;

import android.app.ActivityManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Observer;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(List<Observer> list) {
        try {
            Object a2 = com.taobao.monitor.impl.util.c.a(null, Build.VERSION.SDK_INT >= 26 ? ActivityManager.class.getDeclaredField("IActivityManagerSingleton") : Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault"));
            Class<?> cls = Class.forName("android.util.Singleton");
            try {
                Method declaredMethod = cls.getDeclaredMethod("get", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(a2, new Object[0]);
            } catch (Exception unused) {
            }
            Field declaredField = cls.getDeclaredField("mInstance");
            Object a3 = com.taobao.monitor.impl.util.c.a(a2, declaredField);
            if (a3 == null) {
                return;
            }
            Class<?> cls2 = Class.forName("android.app.IActivityManager");
            c cVar = new c(a3);
            for (Observer observer : list) {
                cVar.addObserver(observer);
            }
            com.taobao.monitor.impl.util.c.a(a2, declaredField, a3, Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls2}, cVar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
