package com.ali.user.open.core.context;

import android.content.Context;
import android.content.res.Resources;
import com.ali.user.open.core.WebViewProxy;
import com.ali.user.open.core.config.AuthOption;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.Environment;
import com.ali.user.open.core.registry.ServiceRegistration;
import com.ali.user.open.core.registry.ServiceRegistry;
import com.ali.user.open.core.registry.impl.DefaultServiceRegistry;
import com.ali.user.open.core.registry.impl.ProxyEnabledServiceRegistryDelegator;
import com.ali.user.open.core.service.MemberExecutorService;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.core.service.StorageService;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.service.impl.ExecutorServiceImpl;
import com.ali.user.open.core.util.SystemUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes2.dex */
public class KernelContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SDK_VERSION = "android_4.7.1";
    private static final String SDK_VERSION_STD = "a_4.7.1-std";
    public static final String TAG = "kernel";
    public static String UUID;
    public static volatile Context applicationContext;
    public static AuthOption authOption;
    public static MemberExecutorService executorService;
    public static final ReentrantLock initLock;
    public static boolean isMini;
    public static WebViewProxy mWebViewProxy;
    public static String packageName;
    public static Resources resources;
    public static AuthOption sOneTimeAuthOption;
    public static volatile Boolean sdkInitialized;
    public static String sdkVersion;
    public static volatile ServiceRegistry serviceRegistry;

    static {
        kge.a(250599170);
        isMini = true;
        sdkVersion = ConfigManager.getInstance().isMiniProgram() ? SDK_VERSION_STD : SDK_VERSION;
        sdkInitialized = Boolean.FALSE;
        authOption = AuthOption.NORMAL;
        sOneTimeAuthOption = null;
        initLock = new ReentrantLock();
        serviceRegistry = new DefaultServiceRegistry();
        executorService = new ExecutorServiceImpl();
    }

    public static String getSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a69c45", new Object[0]) : ConfigManager.getInstance().isMiniProgram() ? SDK_VERSION_STD : SDK_VERSION;
    }

    public static void wrapServiceRegistry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa00f0ef", new Object[0]);
        } else if (serviceRegistry instanceof ProxyEnabledServiceRegistryDelegator) {
        } else {
            serviceRegistry = new ProxyEnabledServiceRegistryDelegator(serviceRegistry);
        }
    }

    public static ServiceRegistration registerService(Class<?>[] clsArr, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceRegistration) ipChange.ipc$dispatch("b40bb38d", new Object[]{clsArr, obj, map});
        }
        return serviceRegistry.registerService(clsArr, obj, map == null ? new HashMap() : new HashMap(map));
    }

    public static <T> T getService(Class<T> cls, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("53e3dec4", new Object[]{cls, map}) : (T) serviceRegistry.getService(cls, map);
    }

    public static Environment getEnvironment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Environment) ipChange.ipc$dispatch("48bd17f", new Object[0]) : ConfigManager.getInstance().getEnvironment();
    }

    public static <T> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{cls}) : (T) serviceRegistry.getService(cls, null);
    }

    public static <T> T[] getServices(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T[]) ((Object[]) ipChange.ipc$dispatch("d1e1a23", new Object[]{cls})) : (T[]) serviceRegistry.getServices(cls, null);
    }

    public static synchronized Context getApplicationContext() {
        synchronized (KernelContext.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[0]);
            } else if (applicationContext != null) {
                return applicationContext;
            } else {
                return SystemUtils.getSystemApp();
            }
        }
    }

    public static boolean checkServiceValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4608e47a", new Object[0])).booleanValue() : (applicationContext == null || serviceRegistry == null || getServices(RpcService.class) == null || getServices(StorageService.class) == null || getServices(UserTrackerService.class) == null || getService(StorageService.class) == null) ? false : true;
    }
}
