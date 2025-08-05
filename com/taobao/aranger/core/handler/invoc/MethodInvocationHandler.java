package com.taobao.aranger.core.handler.invoc;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.method.AutoRecover;
import com.taobao.aranger.annotation.method.MethodName;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.core.wrapper.ServiceWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.TypeUtils;
import com.taobao.aranger.utils.a;
import com.taobao.aranger.utils.c;
import com.taobao.aranger.utils.d;
import com.taobao.aranger.utils.i;
import java.lang.reflect.Method;
import tb.kac;
import tb.kae;
import tb.kge;

/* loaded from: classes6.dex */
public class MethodInvocationHandler extends BaseInvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Call f16358a;
    private final ServiceWrapper b;
    private final Uri c;
    private final kae d;

    static {
        kge.a(260908358);
    }

    public static /* synthetic */ Object ipc$super(MethodInvocationHandler methodInvocationHandler, String str, Object... objArr) {
        if (str.hashCode() == -1979325148) {
            return super.invoke(objArr[0], (Method) objArr[1], (Object[]) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler, java.lang.reflect.InvocationHandler
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        return super.invoke(obj, method, objArr);
    }

    public MethodInvocationHandler(Call call) {
        this.f16358a = call;
        this.c = call.getRemoteProviderUri();
        this.b = ServiceWrapper.obtain().setTimeStamp(call.getServiceWrapper().getTimeStamp()).setServiceInterfaceClass(call.getServiceWrapper().getServiceInterfaceClass()).setServiceName(call.getServiceWrapper().getName()).setType(3);
        this.d = kac.a(this.c);
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler
    public Reply a(Method method, Object[] objArr) throws IPCException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("691fab62", new Object[]{this, method, objArr});
        }
        ParameterWrapper[] a2 = d.a(method, objArr);
        MethodName methodName = (MethodName) method.getAnnotation(MethodName.class);
        AutoRecover autoRecover = (AutoRecover) method.getAnnotation(AutoRecover.class);
        oneway onewayVar = (oneway) method.getAnnotation(oneway.class);
        MethodWrapper methodWrapper = MethodWrapper.obtain().setMethodName(methodName == null ? method.getName() : methodName.value()).setVoid(TypeUtils.b(method.getReturnType()));
        if (!methodWrapper.isVoid()) {
            methodWrapper.setReturnType(TypeUtils.a(method.getReturnType()));
        }
        Call autoRecover2 = Call.obtain().setServiceWrapper(this.b).setParameterWrappers(a2).setMethodWrapper(methodWrapper).setRemoteProviderUri(this.c).setAutoRecover(autoRecover != null);
        if (onewayVar == null) {
            z = false;
        }
        Call oneWay = autoRecover2.setOneWay(z);
        try {
            return this.d.a(oneWay);
        } catch (IPCException e) {
            if (autoRecover != null && e.getErrorCode() == 22) {
                synchronized (this) {
                    String a3 = this.f16358a.isSameApp() ? i.a() : i.a(c.a());
                    this.f16358a.getServiceWrapper().setTimeStamp(a3);
                    this.d.a(this.f16358a);
                    a.a().a(this.f16358a.getRemoteProviderUri(), a3, this);
                    this.b.setTimeStamp(a3);
                    oneWay.setAutoRecover(false);
                    return this.d.a(oneWay);
                }
            }
            throw e;
        }
    }
}
