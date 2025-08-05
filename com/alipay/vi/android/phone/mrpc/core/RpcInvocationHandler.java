package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class RpcInvocationHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Class<?> mClazz;
    public Config mConfig;
    public RpcInvoker mRpcInvoker;

    public RpcInvocationHandler(Config config, Class<?> cls, RpcInvoker rpcInvoker) {
        this.mConfig = config;
        this.mClazz = cls;
        this.mRpcInvoker = rpcInvoker;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr}) : this.mRpcInvoker.invoke(obj, this.mClazz, method, objArr);
    }
}
