package com.taobao.android.msoa;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class e implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f14425a;
    private String b;
    private String c;
    private String d;

    public e(Object obj, String str, String str2, String str3) {
        this.f14425a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String str = "msoa.interface." + this.b + "." + method.getName();
        String str2 = this.c;
        if (!TextUtils.isEmpty(this.d)) {
            str2 = this.c + "@" + this.d;
        }
        if (!m.a(str, str2)) {
            com.taobao.android.msoa.util.d.a(str, "1.0", this.c, this.d, com.taobao.android.msoa.util.d.a(str), null, null, null, "MSOA_InvokeFailure");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object invoke = method.invoke(this.f14425a, objArr);
        com.taobao.android.msoa.util.d.a(str, "1.0", this.c, this.d, com.taobao.android.msoa.util.d.a(str), String.valueOf(System.currentTimeMillis() - currentTimeMillis), null, null, "MSOA_InvokeSuccess");
        return invoke;
    }
}
