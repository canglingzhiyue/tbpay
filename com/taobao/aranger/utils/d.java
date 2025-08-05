package com.taobao.aranger.utils;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.parameter.WeakRef;
import com.taobao.aranger.annotation.parameter.inout;
import com.taobao.aranger.annotation.parameter.out;
import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.core.handler.invoc.CallbackInvocationHandler;
import com.taobao.aranger.core.ipc.provider.ClientServiceProvider;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(550971674);
    }

    public static ParameterWrapper[] a(Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParameterWrapper[]) ipChange.ipc$dispatch("97ff61cb", new Object[]{method, objArr});
        }
        if (objArr == null) {
            return new ParameterWrapper[0];
        }
        ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[objArr.length];
        Class<?>[] parameterTypes = method.getParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for (int i = 0; i < objArr.length; i++) {
            if (parameterTypes[i] != null && parameterTypes[i].isInterface() && parameterTypes[i].getAnnotation(Callback.class) != null) {
                Object obj = objArr[i];
                String a2 = i.a();
                if (obj != null) {
                    ParameterWrapper clientServiceBinder = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setClientServiceBinder(ClientServiceProvider.getClientService());
                    parameterWrapperArr[i] = clientServiceBinder.setTimeStamp(a2 + ";" + obj.hashCode());
                    CallbackManager.a().a(a2, obj, TypeUtils.a(parameterAnnotations[i], WeakRef.class));
                } else {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName());
                }
            } else if (objArr[i] instanceof Context) {
                parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(Context.class.getName());
            } else {
                boolean a3 = TypeUtils.a(parameterAnnotations[i], out.class);
                boolean a4 = TypeUtils.a(parameterAnnotations[i], inout.class);
                if (!a3 && !a4) {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setData(objArr[i]);
                } else if (a4) {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setFlowFlag(2).setData(objArr[i]);
                } else {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setFlowFlag(1).setData(objArr[i]);
                }
            }
        }
        return parameterWrapperArr;
    }

    public static ParameterWrapper[] a(Pair<Class<?>, Object>[] pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParameterWrapper[]) ipChange.ipc$dispatch("f77e07b7", new Object[]{pairArr});
        }
        if (pairArr == null) {
            return new ParameterWrapper[0];
        }
        ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[pairArr.length];
        for (int i = 0; i < pairArr.length; i++) {
            if (pairArr[i] == null || pairArr[i].first == null) {
                throw new IPCException(34, "the pair and parameter class can't be null!");
            }
            Class cls = (Class) pairArr[i].first;
            Object obj = pairArr[i].second;
            if (obj != null && !cls.isAssignableFrom(obj.getClass())) {
                throw new IPCException(39, "the parameter object " + obj.getClass().getName() + " is not the instance of the " + cls.getName() + ", please check if you pair's value are correct!");
            }
            if (cls.isInterface() && cls.getAnnotation(Callback.class) != null) {
                String a2 = i.a();
                if (obj != null) {
                    ParameterWrapper clientServiceBinder = ParameterWrapper.obtain().setParameterName(cls.getName()).setClientServiceBinder(ClientServiceProvider.getClientService());
                    parameterWrapperArr[i] = clientServiceBinder.setTimeStamp(a2 + ";" + obj.hashCode());
                    CallbackManager.a().a(a2, obj, false);
                } else {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(cls.getName());
                }
            } else if (Context.class.isAssignableFrom(cls)) {
                parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(Context.class.getName());
            } else if (obj != null) {
                parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(cls.getName()).setData(obj);
            } else {
                parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(cls.getName());
            }
        }
        return parameterWrapperArr;
    }

    public static Object[] a(ParameterWrapper[] parameterWrapperArr, List<Integer> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("79b7d624", new Object[]{parameterWrapperArr, list});
        }
        if (parameterWrapperArr == null) {
            return new Object[0];
        }
        int length = parameterWrapperArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            ParameterWrapper parameterWrapper = parameterWrapperArr[i];
            Object obj = null;
            if (parameterWrapper == null) {
                objArr[i] = null;
            } else {
                Class<?> a2 = j.a().a(parameterWrapper);
                if (a2 != null && a2.isInterface() && a2.getAnnotation(Callback.class) != null) {
                    String[] split = parameterWrapper.getTimeStamp().split(";");
                    String str = split[0];
                    objArr[i] = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new CallbackInvocationHandler(parameterWrapper.getClientServiceBinder(), str, Integer.parseInt(split[1])));
                    a.a().a(parameterWrapper.getClientServiceBinder(), str, objArr[i]);
                } else if (a2 != null && Context.class.isAssignableFrom(a2)) {
                    objArr[i] = jzv.a();
                } else {
                    if (parameterWrapper.getFlowFlag() != 0) {
                        list.add(Integer.valueOf(i));
                    }
                    if (a2 != null) {
                        obj = parameterWrapper.getData();
                    }
                    objArr[i] = obj;
                }
            }
        }
        return objArr;
    }
}
