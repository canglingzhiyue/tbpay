package com.taobao.android.boutique.reflection;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final g f9225a;

    static {
        kge.a(338661146);
        f9225a = Build.VERSION.SDK_INT < 28 ? new d() : new c();
    }

    public static Field a(Class<?> cls, String str) throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Field) ipChange.ipc$dispatch("4bb5245c", new Object[]{cls, str}) : f9225a.getDeclaredField(cls, str);
    }

    public static Field[] b(Class<?> cls) throws SecurityException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Field[]) ipChange.ipc$dispatch("12f3f0fa", new Object[]{cls}) : f9225a.a(cls);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("35d22677", new Object[]{cls, str, clsArr}) : f9225a.a(cls, str, clsArr);
    }
}
