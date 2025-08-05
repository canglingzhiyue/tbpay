package com.taobao.aranger.core.handler.invoc;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.parameter.inout;
import com.taobao.aranger.annotation.parameter.out;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IDataFlow;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.kak;
import tb.kge;

/* loaded from: classes.dex */
public abstract class BaseInvocationHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f16356a;

    public abstract Reply a(Method method, Object[] objArr) throws IPCException;

    static {
        kge.a(23006358);
        kge.a(16938580);
        f16356a = BaseInvocationHandler.class.getName();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        if (method.getDeclaringClass() == Object.class) {
            try {
                return method.invoke(this, objArr);
            } catch (Exception e) {
                kak.a(f16356a, "[BaseInvocationHandler][invoke]", e, new Object[0]);
                throw new IPCException(18, e);
            }
        }
        Reply a2 = a(method, objArr);
        if (!TypeUtils.b(method.getReturnType())) {
            return a(a2, method, objArr);
        }
        return null;
    }

    private Object a(Reply reply, Method method, Object[] objArr) throws IPCException {
        if (reply.getFlowParameterWrappers() != null && reply.getFlowParameterWrappers().length != 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int i = 0;
            for (int i2 = 0; i2 < objArr.length; i2++) {
                try {
                    if (TypeUtils.a(parameterAnnotations[i2], out.class) || TypeUtils.a(parameterAnnotations[i2], inout.class)) {
                        int i3 = i + 1;
                        Object data = reply.getFlowParameterWrappers()[i].getData();
                        if (objArr[i2] == null) {
                            objArr[i2] = data;
                        } else if (parameterTypes[i2].isArray()) {
                            TypeUtils.a(parameterTypes[i2].getName(), objArr[i2], data);
                        } else if (List.class.isAssignableFrom(parameterTypes[i2])) {
                            Collections.copy((List) objArr[i2], (List) data);
                        } else if (Map.class.isAssignableFrom(parameterTypes[i2])) {
                            Map map = (Map) data;
                            Map map2 = (Map) objArr[i2];
                            map2.clear();
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    map2.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else if (IDataFlow.class.isAssignableFrom(parameterTypes[i2])) {
                            ((IDataFlow) objArr[i2]).readFromObject(data);
                        } else if (Parcelable.class.isAssignableFrom(parameterTypes[i2])) {
                            Method declaredMethod = parameterTypes[i2].getDeclaredMethod("readFromParcel", Parcel.class);
                            declaredMethod.setAccessible(true);
                            Parcel obtain = Parcel.obtain();
                            ((Parcelable) data).writeToParcel(obtain, 0);
                            obtain.setDataPosition(0);
                            declaredMethod.invoke(objArr[i2], obtain);
                            obtain.recycle();
                        }
                        i = i3;
                    }
                } catch (Exception e) {
                    kak.a(f16356a, "[processReply]", e, new Object[0]);
                    throw new IPCException(26, e);
                }
            }
        }
        if (reply.getResult() == null && method.getReturnType().isPrimitive()) {
            kak.b(f16356a, "[processReply] the primitive result is null!", new Object[0]);
            throw new IPCException(31, "the primitive result is null!");
        } else if (reply.getResult() != null && !TypeUtils.a(method.getReturnType(), reply.getResult().getClass()) && !method.getReturnType().isAssignableFrom(reply.getResult().getClass())) {
            throw new IPCException(32, reply.getResult().getClass().getName() + " can't cast to " + method.getReturnType());
        } else {
            return reply.getResult();
        }
    }
}
