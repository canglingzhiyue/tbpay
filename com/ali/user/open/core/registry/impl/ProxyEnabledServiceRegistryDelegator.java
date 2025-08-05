package com.ali.user.open.core.registry.impl;

import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.registry.ServiceRegistration;
import com.ali.user.open.core.registry.ServiceRegistry;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class ProxyEnabledServiceRegistryDelegator implements ServiceRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ServiceRegistry delegator;

    static {
        kge.a(-1962502287);
        kge.a(1845564752);
    }

    public static /* synthetic */ ServiceRegistry access$000(ProxyEnabledServiceRegistryDelegator proxyEnabledServiceRegistryDelegator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceRegistry) ipChange.ipc$dispatch("f026a27a", new Object[]{proxyEnabledServiceRegistryDelegator}) : proxyEnabledServiceRegistryDelegator.delegator;
    }

    public ProxyEnabledServiceRegistryDelegator(ServiceRegistry serviceRegistry) {
        this.delegator = serviceRegistry;
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public ServiceRegistration registerService(Class<?>[] clsArr, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceRegistration) ipChange.ipc$dispatch("b40bb38d", new Object[]{this, clsArr, obj, map}) : this.delegator.registerService(clsArr, obj, map);
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public <T> T getService(final Class<T> cls, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("53e3dec4", new Object[]{this, cls, map});
        }
        T t = (T) this.delegator.getService(cls, map);
        return (t != null || map == null || !cls.isInterface()) ? t : cls.cast(Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.ali.user.open.core.registry.impl.ProxyEnabledServiceRegistryDelegator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                Object service = ProxyEnabledServiceRegistryDelegator.access$000(ProxyEnabledServiceRegistryDelegator.this).getService(cls, map);
                if (service == null) {
                    SDKLogger.e(KernelContext.TAG, "SERVICE_NOT_AVAILABLE_ERROR");
                    return null;
                }
                return method.invoke(service, objArr);
            }
        }));
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public <T> T[] getServices(Class<T> cls, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T[]) ((Object[]) ipChange.ipc$dispatch("71717aa4", new Object[]{this, cls, map})) : (T[]) this.delegator.getServices(cls, map);
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public Object unregisterService(ServiceRegistration serviceRegistration) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dd33253d", new Object[]{this, serviceRegistration}) : this.delegator.unregisterService(serviceRegistration);
    }
}
