package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Proxy;

/* loaded from: classes3.dex */
public class RpcFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Config f5298a;
    private RpcInvoker b = new RpcInvoker(this);

    public RpcFactory(Config config) {
        this.f5298a = config;
    }

    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls}) : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.f5298a, cls, this.b));
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("e9d3ca65", new Object[]{this}) : this.f5298a;
    }
}
