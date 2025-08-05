package com.alipay.mobile.common.rpc;

import android.content.Context;
import com.alipay.mobile.common.rpc.impl.RpcLifeManagerImpl;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.framework.service.common.impl.RpcInterceptorManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import tb.riy;

/* loaded from: classes3.dex */
public class RpcFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<Class<? extends Annotation>, RpcInterceptor> GLOBLE_INTERCEPTORS = new HashMap(5);
    private static final List<RpcHeaderListener> c = new ArrayList(2);

    /* renamed from: a  reason: collision with root package name */
    private Map<Class<? extends Annotation>, RpcInterceptor> f5500a;
    private List<RpcHeaderListener> b;
    public Config mConfig;
    public Context mContext;
    public RpcInvoker mRpcInvoker;

    public RpcFactory(Config config) {
        this.b = new ArrayList(2);
        this.mConfig = config;
        this.mRpcInvoker = new RpcInvoker(this);
        this.f5500a = new HashMap(5);
    }

    public RpcFactory(Config config, Context context) {
        this.b = new ArrayList(2);
        this.mContext = context;
        this.mConfig = config;
        this.mRpcInvoker = new RpcInvoker(this);
        this.f5500a = new HashMap(5);
    }

    public RpcFactory(Config config, Context context, boolean z) {
        this.b = new ArrayList(2);
        this.mContext = context;
        this.mConfig = config;
        if (!z) {
            this.mRpcInvoker = new RpcInvoker(this);
        }
        this.f5500a = new HashMap(5);
    }

    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls});
        }
        LogCatUtil.info("RpcFactory", "clazz=[" + cls.getName() + riy.ARRAY_END_STR);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.mConfig, cls, this.mRpcInvoker));
    }

    public <T> T getBgRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8c9d7440", new Object[]{this, cls});
        }
        LogCatUtil.info("RpcFactory", "clazz=[" + cls.getName() + riy.ARRAY_END_STR);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.mConfig, cls, this.mRpcInvoker, true));
    }

    public <T> T getPBRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb0ac70d", new Object[]{this, cls}) : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.mConfig, cls, this.mRpcInvoker));
    }

    public void prepareResetCookie(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196c0caf", new Object[]{this, obj});
        } else if (!Proxy.isProxyClass(obj.getClass())) {
        } else {
            ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).setResetCoolie(true);
        }
    }

    public RpcInvokeContext getRpcInvokeContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcInvokeContext) ipChange.ipc$dispatch("a105b232", new Object[]{this, obj});
        }
        try {
            return ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext();
        } catch (Throwable th) {
            LogCatUtil.warn("RpcFactory", "[getRpcInvokeContext] Class name = " + obj.getClass().getName() + ", Exception = " + th.toString(), th);
            return EmptyRpcInvokeContext.getInstance();
        }
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.mRpcInvoker.setScene(str);
        }
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this}) : this.mRpcInvoker.getScene();
    }

    public void batchBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc04a96", new Object[]{this});
        } else {
            this.mRpcInvoker.batchBegin();
        }
    }

    public FutureTask<?> batchCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FutureTask) ipChange.ipc$dispatch("a1ad229", new Object[]{this}) : this.mRpcInvoker.batchCommit();
    }

    public void addProtocolArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7049def1", new Object[]{this, str, str2});
        } else {
            RpcInvoker.addProtocolArgs(str, str2);
        }
    }

    public void addRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5d9a1", new Object[]{this, rpcInterceptor});
        } else {
            RpcInterceptorManager.getInstance().addRpcInterceptor(rpcInterceptor);
        }
    }

    public void addRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896e0294", new Object[]{this, cls, rpcInterceptor});
            return;
        }
        this.f5500a.put(cls, rpcInterceptor);
        addGlobelRpcInterceptor(cls, rpcInterceptor);
    }

    public RpcInterceptor findRpcInterceptor(Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcInterceptor) ipChange.ipc$dispatch("57c86036", new Object[]{this, cls});
        }
        RpcInterceptor rpcInterceptor = this.f5500a.get(cls);
        return rpcInterceptor != null ? rpcInterceptor : GLOBLE_INTERCEPTORS.get(cls);
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        try {
            if (this.mContext == null) {
                this.mContext = TransportEnvUtil.getContext();
            }
        } catch (Throwable th) {
            LogCatUtil.error("RpcFactory", "getContext fail", th);
        }
        return this.mContext;
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("ac319ad6", new Object[]{this}) : this.mConfig;
    }

    public void setConfig(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ea3c", new Object[]{this, config});
        } else {
            this.mConfig = config;
        }
    }

    public void addRpcHeaderListener(RpcHeaderListener rpcHeaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4fcded", new Object[]{this, rpcHeaderListener});
            return;
        }
        this.b.add(rpcHeaderListener);
        c.add(rpcHeaderListener);
    }

    public void notifyRpcHeaderUpdateEvent(RpcHeader rpcHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d91ec4", new Object[]{this, rpcHeader});
            return;
        }
        List<RpcHeaderListener> list = this.b;
        if (list.isEmpty()) {
            list = c;
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                RpcHeaderListener rpcHeaderListener = list.get(i);
                if (rpcHeaderListener != null) {
                    rpcHeaderListener.onRpcHeaderUpdateEvent(rpcHeader);
                    LogCatUtil.info("RpcFactory", "onRpcHeaderUpdateEvent. class=[" + rpcHeaderListener.getClass().getSimpleName() + riy.ARRAY_END_STR);
                }
            } catch (Throwable th) {
                LogCatUtil.warn("RpcFactory", "notifyRpcHeaderUpdateEvent exception. " + th.toString());
            }
        }
    }

    public static final void addGlobelRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e0e013", new Object[]{cls, rpcInterceptor});
        } else {
            GLOBLE_INTERCEPTORS.put(cls, rpcInterceptor);
        }
    }

    public void cancelAllRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ffb525", new Object[]{this});
        } else {
            RpcLifeManagerImpl.getInstance().cancelAllRpc();
        }
    }
}
