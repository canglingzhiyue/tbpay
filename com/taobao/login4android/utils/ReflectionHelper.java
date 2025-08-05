package com.taobao.login4android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes.dex */
public class ReflectionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2039656843);
    }

    public static <T> T invokeMethod(Class cls, Method method, Object... objArr) {
        if (method != null) {
            try {
                return (T) method.invoke(cls, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
