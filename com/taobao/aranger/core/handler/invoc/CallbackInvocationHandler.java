package com.taobao.aranger.core.handler.invoc;

import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.TypeUtils;
import com.taobao.aranger.utils.d;
import java.lang.reflect.Method;
import tb.kac;
import tb.kad;
import tb.kge;

/* loaded from: classes.dex */
public class CallbackInvocationHandler extends BaseInvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f16357a;
    private final int b;
    private final kad c;

    static {
        kge.a(1289247522);
    }

    public static /* synthetic */ Object ipc$super(CallbackInvocationHandler callbackInvocationHandler, String str, Object... objArr) {
        if (str.hashCode() == -1979325148) {
            return super.invoke(objArr[0], (Method) objArr[1], (Object[]) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler, java.lang.reflect.InvocationHandler
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        return super.invoke(obj, method, objArr);
    }

    public CallbackInvocationHandler(IBinder iBinder, String str, int i) {
        this.f16357a = str;
        this.b = i;
        this.c = kac.a(iBinder);
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler
    public Reply a(Method method, Object[] objArr) throws IPCException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("691fab62", new Object[]{this, method, objArr});
        }
        ParameterWrapper[] a2 = d.a(method, objArr);
        MethodWrapper methodWrapper = MethodWrapper.obtain().setMethodName(method.getName()).setVoid(TypeUtils.b(method.getReturnType()));
        if (!methodWrapper.isVoid()) {
            methodWrapper.setReturnType(TypeUtils.a(method.getReturnType()));
        }
        Callback timeStamp = Callback.obtain().setParameterWrappers(a2).setMethodWrapper(methodWrapper).setTimeStamp(this.f16357a);
        if (method.getAnnotation(oneway.class) == null) {
            z = false;
        }
        return this.c.a(timeStamp.setOneWay(z));
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return obj != null && hashCode() == obj.hashCode();
    }
}
