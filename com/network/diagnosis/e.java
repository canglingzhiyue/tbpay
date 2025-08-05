package com.network.diagnosis;

import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f8025a = null;
    private static boolean b = true;
    private static volatile Context c;

    public static b a() {
        if (!b) {
            return null;
        }
        if (f8025a != null) {
            return f8025a;
        }
        synchronized (e.class) {
            if (f8025a != null) {
                return f8025a;
            }
            Constructor<?> declaredConstructor = Class.forName("com.network.diagnosis.NetworkDiagnosisCenter").getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            b bVar = (b) declaredConstructor.newInstance(new Object[0]);
            f8025a = bVar;
            bVar.a(b());
            return f8025a;
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            c = context;
        }
    }

    public static Context b() {
        if (c != null) {
            return c;
        }
        synchronized (e.class) {
            if (c != null) {
                return c;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                c = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return c;
        }
    }
}
