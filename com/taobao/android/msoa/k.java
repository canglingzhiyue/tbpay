package com.taobao.android.msoa;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class k implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f14437a;
    private String b;

    public k(Object obj, String str) {
        this.f14437a = obj;
        this.b = str;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String str;
        if (method.getName().equals("onSuccess")) {
            c.a().a(this.b);
        } else if (method.getName().equals("onFail")) {
            String str2 = null;
            if (objArr == null || objArr.length < 2) {
                str = null;
            } else {
                str2 = (String) objArr[0];
                str = (String) objArr[1];
            }
            c.a().a(this.b, str2, str);
        }
        return method.invoke(this.f14437a, objArr);
    }
}
