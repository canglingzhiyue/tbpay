package com.taobao.monitor.impl.common;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.util.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Observable;
import tb.mnd;

/* loaded from: classes7.dex */
public class c extends Observable implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f18152a;

    public c(Object obj) {
        this.f18152a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().contains("startActivity") && Build.VERSION.SDK_INT <= 28) {
            mnd.r = h.a();
        }
        try {
            return method.invoke(this.f18152a, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException != null && (targetException instanceof IllegalArgumentException) && method.getName().equals("reportSizeConfigurations")) {
                setChanged();
                notifyObservers(targetException);
                return null;
            } else if (targetException != null && method.getName().equals("isTopOfTask") && (targetException instanceof IllegalArgumentException)) {
                return false;
            } else {
                throw targetException;
            }
        }
    }
}
