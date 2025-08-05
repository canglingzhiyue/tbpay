package com.alipay.mobile.common.rpc;

import android.text.TextUtils;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class RpcInvocationHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5501a;
    private boolean b;
    private InnerRpcInvokeContext c;
    public Class<?> mClazz;
    public Config mConfig;
    public RpcInvoker mRpcInvoker;

    public RpcInvocationHandler(Config config, Class<?> cls, RpcInvoker rpcInvoker) {
        this(config, cls, rpcInvoker, false);
    }

    public RpcInvocationHandler(Config config, Class<?> cls, RpcInvoker rpcInvoker, boolean z) {
        this.b = false;
        this.mConfig = config;
        this.mClazz = cls;
        this.mRpcInvoker = rpcInvoker;
        this.b = z;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr}) : this.mRpcInvoker.invoke(obj, this.mClazz, method, objArr, a(method));
    }

    private InnerRpcInvokeContext a(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerRpcInvokeContext) ipChange.ipc$dispatch("ddbd040b", new Object[]{this, method});
        }
        InnerRpcInvokeContext a2 = a();
        if (a2.resetCookie == null) {
            a2.resetCookie = Boolean.valueOf(isResetCoolie());
        }
        if (a2.bgRpc == null) {
            a2.bgRpc = Boolean.valueOf(this.b);
        }
        if (TextUtils.isEmpty(a2.appKey)) {
            a2.appKey = this.mConfig.getAppKey();
        }
        if (TextUtils.isEmpty(a2.gwUrl)) {
            a2.gwUrl = this.mConfig.getUrl();
        }
        if (a2.compress == null) {
            a2.compress = Boolean.valueOf(this.mConfig.isCompress());
        }
        if (a2.allowRetry == null) {
            if (RpcInvokerUtil.isRetryable(method)) {
                a2.setAllowRetry(true);
            } else {
                a2.setAllowRetry(false);
            }
        }
        return a2;
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("ac319ad6", new Object[]{this}) : this.mConfig;
    }

    public boolean isResetCoolie() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42084c55", new Object[]{this})).booleanValue() : this.f5501a;
    }

    public void setResetCoolie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ee2fdb", new Object[]{this, new Boolean(z)});
        } else {
            this.f5501a = z;
        }
    }

    public RpcInvokeContext getRpcInvokeContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcInvokeContext) ipChange.ipc$dispatch("35782116", new Object[]{this}) : a();
    }

    private InnerRpcInvokeContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerRpcInvokeContext) ipChange.ipc$dispatch("d4b21833", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new InnerRpcInvokeContext();
        }
        return this.c;
    }

    public void setInnerRpcInvokeContext(InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18976b2", new Object[]{this, innerRpcInvokeContext});
        } else {
            this.c = innerRpcInvokeContext;
        }
    }
}
