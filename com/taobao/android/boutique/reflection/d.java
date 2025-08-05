package com.taobao.android.boutique.reflection;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes4.dex */
public class d implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1460818718);
        kge.a(-1310072873);
    }

    @Override // com.taobao.android.boutique.reflection.g
    public Field getDeclaredField(Class<?> cls, String str) throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Field) ipChange.ipc$dispatch("de131673", new Object[]{this, cls, str}) : cls.getDeclaredField(str);
    }

    @Override // com.taobao.android.boutique.reflection.g
    public Field[] a(Class<?> cls) throws SecurityException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Field[]) ipChange.ipc$dispatch("9d79cab9", new Object[]{this, cls}) : cls.getDeclaredFields();
    }

    @Override // com.taobao.android.boutique.reflection.g
    public Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("35d22677", new Object[]{this, cls, str, clsArr}) : cls.getDeclaredMethod(str, clsArr);
    }
}
