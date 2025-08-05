package com.taobao.aranger.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.StaticHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes6.dex */
public class ReflectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ReflectUtils";

    static {
        kge.a(-482370210);
    }

    public static Method getHideMethod(Class<?> cls, String str, Class<?>... clsArr) throws IllegalAccessException, InvocationTargetException, NullPointerException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("eafcd8cf", new Object[]{cls, str, clsArr}) : StaticHook.a(cls, str, clsArr);
    }
}
