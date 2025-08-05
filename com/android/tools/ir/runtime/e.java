package com.android.tools.ir.runtime;

import android.os.Looper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Object f6444a;
    private static Object b;

    public static Object a() throws Exception {
        if (f6444a == null) {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                f6444a = declaredMethod.invoke(null, new Object[0]);
            }
        }
        return f6444a;
    }

    public static Object a(Object obj, String str) throws Exception {
        Object obj2 = b;
        if (obj2 != null) {
            return obj2;
        }
        if (d.b().a() != null) {
            Field field = d.b().a().getClass().getField("mLoadedApk");
            field.setAccessible(true);
            b = field.get(d.b().a());
        }
        if (b != null) {
            return b;
        }
        Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mPackages");
        declaredField.setAccessible(true);
        WeakReference weakReference = (WeakReference) ((Map) declaredField.get(obj)).get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        b = weakReference.get();
        return weakReference.get();
    }
}
