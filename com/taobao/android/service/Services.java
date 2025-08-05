package com.taobao.android.service;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.StrictMode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.modular.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import tb.kge;

/* loaded from: classes6.dex */
public class Services {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final ComponentName KNullCompName;
    private static final long KServiceConnectionTimeout = 10000;
    private static final String TAG = "Services";
    private static final Map<String, ComponentName> mResolvedServiceCache;
    private static final Thread sMainThread;
    private static final Map<Activity, List<ServiceConnection>> sManagedServiceConnections;
    private static volatile boolean sRecyclerSetup;
    private static final Object sRecyclerSetupLock;

    public static void setSystemClassloader(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89cdc29", new Object[]{classLoader});
        }
    }

    static {
        kge.a(1548962667);
        sMainThread = Looper.getMainLooper().getThread();
        mResolvedServiceCache = new ConcurrentHashMap();
        sManagedServiceConnections = new HashMap();
        sRecyclerSetupLock = new Object();
        KNullCompName = new ComponentName("", "");
    }

    public static <T extends IInterface> T get(Activity activity, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("369d6e4", new Object[]{activity, cls}) : (T) get((Context) activity, (Class<IInterface>) cls);
    }

    public static <T extends IInterface> T get(Context context, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d5427648", new Object[]{context, cls});
        }
        if (context == null) {
            throw new IllegalArgumentException("Context is null");
        }
        if (cls == null) {
            throw new IllegalArgumentException("Service interface is null");
        }
        Intent buildServiceIntent = buildServiceIntent(context, cls);
        if (buildServiceIntent == null) {
            c.b(TAG, "No matched service for " + cls.getName());
            return null;
        }
        ensureRecyclerSetup(context);
        a aVar = new a();
        try {
            if (!LocalAidlServices.a(context, buildServiceIntent, aVar)) {
                if (Thread.currentThread() == sMainThread) {
                    throw new IllegalArgumentException("InvocationOnMainThreadException");
                }
                if (!context.bindService(buildServiceIntent, aVar, 1)) {
                    c.b(TAG, "Failed to bind service: " + cls.getName());
                    try {
                        context.unbindService(aVar);
                    } catch (RuntimeException e) {
                        String str = "Unnecessary unbinding due to " + e;
                    }
                    return null;
                }
            }
            Activity findActivity = findActivity(context);
            if (findActivity != null) {
                List<ServiceConnection> list = sManagedServiceConnections.get(findActivity);
                if (list == null) {
                    list = new ArrayList<>();
                    sManagedServiceConnections.put(findActivity, list);
                }
                list.add(aVar);
            }
            try {
                try {
                    return (T) asInterface(aVar.a(10000L), cls);
                } catch (ClassNotFoundException e2) {
                    c.b(TAG, "Failed to cast binder to interface, ClassNotFoundException: " + cls.getName());
                    throw new RuntimeException(e2);
                } catch (IllegalAccessException e3) {
                    c.b(TAG, "Failed to cast binder to interface, IllegalAccessException: " + cls.getName());
                    throw new RuntimeException(e3);
                } catch (NoSuchMethodException e4) {
                    c.b(TAG, "Failed to cast binder to interface, NoSuchMethodException: " + cls.getName());
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e5) {
                    Throwable targetException = e5.getTargetException();
                    if (!(targetException instanceof RuntimeException)) {
                        throw new RuntimeException(e5);
                    }
                    throw ((RuntimeException) targetException);
                }
            } catch (InterruptedException unused) {
                c.b(TAG, "Service connection interrupted.");
                return null;
            } catch (TimeoutException unused2) {
                c.b(TAG, "Service connection timeout: " + cls.getName());
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Deprecated
    public static <T extends IInterface> void unget(Context context, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9c1822", new Object[]{context, t});
        } else if (Build.VERSION.SDK_INT < 11) {
        } else {
            StrictMode.noteSlowCall("deprecation");
        }
    }

    public static <T extends IInterface> boolean bind(Context context, Class<T> cls, ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e2d0c6f", new Object[]{context, cls, serviceConnection})).booleanValue();
        }
        Intent buildServiceIntent = buildServiceIntent(context, cls);
        if (buildServiceIntent == null) {
            c.b(TAG, "No matched service for " + cls.getName());
            return false;
        } else if (LocalAidlServices.a(serviceConnection)) {
            throw new RuntimeException("Call bind() with same ServiceConnection instance");
        } else {
            try {
                if (!LocalAidlServices.a(context, buildServiceIntent, serviceConnection)) {
                    if (!context.bindService(buildServiceIntent, serviceConnection, 1)) {
                        return false;
                    }
                }
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
    }

    public static void unbind(Context context, ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76064659", new Object[]{context, serviceConnection});
        } else if (context == null || LocalAidlServices.a(context, serviceConnection)) {
        } else {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException unused) {
                String str = "Already unbound: " + serviceConnection.toString();
            }
        }
    }

    private static void ensureRecyclerSetup(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a748741", new Object[]{context});
        } else if (Build.VERSION.SDK_INT <= 14 || sRecyclerSetup) {
        } else {
            synchronized (sRecyclerSetupLock) {
                if (sRecyclerSetup) {
                    return;
                }
                findApplication(context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.service.Services.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                        } else {
                            Services.cleanupOnActivityDestroyed(activity);
                        }
                    }
                });
                sRecyclerSetup = true;
            }
        }
    }

    private static Activity findActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b8aa660f", new Object[]{context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return findActivity(((ContextWrapper) context).getBaseContext());
    }

    private static Application findApplication(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("e3af6c79", new Object[]{context});
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return ((Service) context).getApplication();
        }
        if (context instanceof ContextWrapper) {
            return findApplication(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Failed to find application from context: " + context);
    }

    private static Intent buildServiceIntent(Context context, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("23efad54", new Object[]{context, cls});
        }
        String intern = cls.getName().intern();
        Intent intent = new Intent(intern);
        if (context == null) {
            c.b(TAG, "Context shouldn't null");
            return null;
        }
        intent.setPackage(context.getPackageName());
        ComponentName componentName = mResolvedServiceCache.get(intern);
        if (componentName == KNullCompName) {
            return null;
        }
        if (componentName == null) {
            ComponentName resolveServiceIntent = resolveServiceIntent(context, intent);
            if (resolveServiceIntent == null) {
                resolveServiceIntent = KNullCompName;
            }
            componentName = resolveServiceIntent;
            mResolvedServiceCache.put(intern, componentName);
        }
        intent.setComponent(componentName);
        return intent;
    }

    private static ComponentName resolveServiceIntent(Context context, Intent intent) {
        List<ResolveInfo> queryIntentServices;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("31ba27b8", new Object[]{context, intent});
        }
        if (context == null || (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) == null || queryIntentServices.isEmpty()) {
            return null;
        }
        if (queryIntentServices.size() > 1) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str = "Find one more, use >> " + serviceInfo.packageName + "/" + serviceInfo.name;
                    return new ComponentName(serviceInfo.packageName, serviceInfo.name.intern());
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Resolve more than one service for ");
            sb.append(intent.getAction());
            sb.append(" [p:");
            sb.append(context.getPackageName());
            sb.append("] ");
            for (ResolveInfo resolveInfo2 : queryIntentServices) {
                if (resolveInfo2.serviceInfo != null) {
                    sb.append(">> ");
                    sb.append(resolveInfo2.serviceInfo.packageName);
                    sb.append("/");
                    sb.append(resolveInfo2.serviceInfo.name);
                }
            }
            throw new IllegalStateException(sb.toString());
        }
        ServiceInfo serviceInfo2 = queryIntentServices.get(0).serviceInfo;
        String str2 = ">> " + serviceInfo2.packageName + "/" + serviceInfo2.name;
        return new ComponentName(serviceInfo2.packageName, serviceInfo2.name.intern());
    }

    private static boolean equal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84216553", new Object[]{str, str2})).booleanValue();
        }
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public static void cleanupOnActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe9a040", new Object[]{activity});
            return;
        }
        List<ServiceConnection> remove = sManagedServiceConnections.remove(activity);
        if (remove == null || remove.isEmpty()) {
            return;
        }
        for (ServiceConnection serviceConnection : remove) {
            try {
                unbind(activity, serviceConnection);
            } catch (RuntimeException e) {
                c.b(TAG, "Failed to unbind service: " + serviceConnection, e);
            }
        }
    }

    private static <T extends IInterface> T asInterface(IBinder iBinder, Class<T> cls) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (iBinder == null) {
            return null;
        }
        T t = (T) iBinder.queryLocalInterface(cls.getName());
        if (t != null) {
            return t;
        }
        return (T) Class.forName(cls.getName() + "$Stub", false, cls.getClassLoader()).getMethod("asInterface", IBinder.class).invoke(null, iBinder);
    }
}
