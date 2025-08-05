package com.alipay.mobile.common.rpc.impl;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public class RpcInterceptorAdaptor implements RpcInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.rpc.RpcInterceptor
    public boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException, Annotation annotation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("394295f8", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, rpcException, annotation})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInterceptor
    public boolean postHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation annotation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3df5e2e", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, annotation})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInterceptor
    public boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation annotation, ThreadLocal<Map<String, Object>> threadLocal2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba037f8b", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, annotation, threadLocal2})).booleanValue();
        }
        return true;
    }
}
