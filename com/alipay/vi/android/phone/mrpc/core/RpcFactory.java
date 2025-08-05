package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class RpcFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6207a;
    private Config b;
    private RpcInvoker c = new RpcInvoker(this);
    private Map<Class<? extends Annotation>, RpcInterceptor> d = new HashMap();

    public RpcFactory(Config config) {
        this.b = config;
    }

    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls}) : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.b, cls, this.c));
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("80da21e5", new Object[]{this}) : this.b;
    }

    public RpcInterceptor findRpcInterceptor(Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcInterceptor) ipChange.ipc$dispatch("d9403d49", new Object[]{this, cls}) : this.d.get(cls);
    }

    public void addRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ce94e5", new Object[]{this, cls, rpcInterceptor});
        } else {
            this.d.put(cls, rpcInterceptor);
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.f6207a;
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f6207a = context;
        }
    }
}
