package com.taobao.android.weex_framework.platform;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Method f16068a;
    public final boolean b;
    public Type[] c;

    static {
        kge.a(-54991143);
    }

    public b(Method method, boolean z) {
        this.f16068a = method;
        this.c = this.f16068a.getGenericParameterTypes();
        this.b = z;
    }

    public Object a(Object obj, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        return this.f16068a.invoke(obj, objArr);
    }

    public Type[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type[]) ipChange.ipc$dispatch("a4d3009c", new Object[]{this});
        }
        if (this.c == null) {
            this.c = this.f16068a.getGenericParameterTypes();
        }
        return this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f16068a.getName();
    }
}
