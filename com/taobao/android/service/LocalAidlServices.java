package com.taobao.android.service;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.modular.c;
import com.taobao.weex.common.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class LocalAidlServices {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, ServiceRecord> f15060a;
    private static final HashMap<ServiceConnection, String> b;
    private static final Method c;

    /* loaded from: classes6.dex */
    public static class ServiceRecord extends CopyOnWriteArrayList<ServiceConnection> {
        private static final long serialVersionUID = 1;
        public final Application app;
        public final IBinder binder;
        public final Intent intent;
        public final Service service;

        static {
            kge.a(-1189758354);
        }

        public ServiceRecord(Application application, Intent intent, IBinder iBinder, Service service) {
            this.app = application;
            this.intent = intent;
            this.binder = iBinder;
            this.service = service;
        }
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7c078b", new Object[]{context, intent, serviceConnection})).booleanValue();
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null) {
                return false;
            }
            component = new ComponentName(resolveService.serviceInfo.packageName, resolveService.serviceInfo.name.intern());
        }
        ServiceRecord serviceRecord = f15060a.get(component.getClassName());
        if (serviceRecord == null) {
            serviceRecord = a(context, intent, component);
            if (serviceRecord == null) {
                return false;
            }
            f15060a.put(component.getClassName(), serviceRecord);
        }
        serviceRecord.add(serviceConnection);
        b.put(serviceConnection, component.getClassName());
        try {
            serviceConnection.onServiceConnected(component, serviceRecord.binder);
        } catch (RuntimeException e) {
            c.b("LocalSvc", serviceConnection + ".onServiceConnected()", e);
        }
        return true;
    }

    public static boolean a(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("725aeb60", new Object[]{serviceConnection})).booleanValue() : b.get(serviceConnection) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.taobao.android.service.LocalAidlServices.ServiceRecord a(android.content.Context r6, android.content.Intent r7, android.content.ComponentName r8) throws java.lang.ClassNotFoundException {
        /*
            java.lang.String r0 = "LocalSvc"
            java.lang.String r1 = r8.getClassName()
            java.lang.Class r1 = a(r6, r1)
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            java.lang.Class<com.taobao.android.service.AidlService> r3 = com.taobao.android.service.AidlService.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 != 0) goto L17
            return r2
        L17:
            java.lang.Object r3 = r1.newInstance()     // Catch: java.lang.IllegalAccessException -> L95 java.lang.InstantiationException -> Lb4
            android.app.Service r3 = (android.app.Service) r3     // Catch: java.lang.IllegalAccessException -> L95 java.lang.InstantiationException -> Lb4
            android.app.Application r8 = a(r6)
            a(r6, r1, r3, r8)
            r3.onCreate()     // Catch: java.lang.RuntimeException -> L28
            goto L3d
        L28:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r4 = ".onCreate()"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.taobao.android.modular.c.b(r0, r1, r6)
        L3d:
            android.os.IBinder r6 = r3.onBind(r7)     // Catch: java.lang.RuntimeException -> L5a
            if (r6 != 0) goto L70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L58
            r1.<init>()     // Catch: java.lang.RuntimeException -> L58
            r1.append(r3)     // Catch: java.lang.RuntimeException -> L58
            java.lang.String r4 = ".onBind() should never return null."
            r1.append(r4)     // Catch: java.lang.RuntimeException -> L58
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L58
            android.util.Log.e(r0, r1)     // Catch: java.lang.RuntimeException -> L58
            goto L70
        L58:
            r1 = move-exception
            goto L5c
        L5a:
            r1 = move-exception
            r6 = r2
        L5c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = ".onBind()"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.taobao.android.modular.c.b(r0, r4, r1)
        L70:
            if (r6 != 0) goto L8c
            r3.onDestroy()     // Catch: java.lang.RuntimeException -> L76
            goto L8b
        L76:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = ".onDestroy()"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.taobao.android.modular.c.b(r0, r7, r6)
        L8b:
            return r2
        L8c:
            a(r8, r3)
            com.taobao.android.service.LocalAidlServices$ServiceRecord r0 = new com.taobao.android.service.LocalAidlServices$ServiceRecord
            r0.<init>(r8, r7, r6, r3)
            return r0
        L95:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Constructor of "
            r7.append(r1)
            java.lang.String r8 = r8.getClassName()
            r7.append(r8)
            java.lang.String r8 = " is inaccessible"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.taobao.android.modular.c.b(r0, r7, r6)
            return r2
        Lb4:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Failed to instantiate "
            r7.append(r1)
            java.lang.String r8 = r8.getClassName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.taobao.android.modular.c.b(r0, r7, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.service.LocalAidlServices.a(android.content.Context, android.content.Intent, android.content.ComponentName):com.taobao.android.service.LocalAidlServices$ServiceRecord");
    }

    public static boolean a(Context context, ServiceConnection serviceConnection) {
        ServiceRecord serviceRecord;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("384d3068", new Object[]{context, serviceConnection})).booleanValue();
        }
        String remove = b.remove(serviceConnection);
        if (remove == null || (serviceRecord = f15060a.get(remove)) == null) {
            return false;
        }
        if (!serviceRecord.remove(serviceConnection)) {
            c.a("LocalSvc", "Internal inconsistency, please report this to the corresponding dev team: " + serviceConnection + " @ " + remove);
        }
        try {
            serviceConnection.onServiceDisconnected(new ComponentName(context.getPackageName(), serviceRecord.service.getClass().getName()));
        } catch (RuntimeException e) {
            c.b("LocalSvc", serviceConnection + ".onServiceDisconnected()", e);
        }
        if (serviceRecord.isEmpty()) {
            f15060a.remove(remove);
            b(serviceRecord.app, serviceRecord.service);
            try {
                serviceRecord.service.onUnbind(serviceRecord.intent);
            } catch (RuntimeException e2) {
                c.b("LocalSvc", serviceRecord.service + ".onUnbind()", e2);
            }
            try {
                serviceRecord.service.onDestroy();
            } catch (RuntimeException e3) {
                c.b("LocalSvc", serviceRecord.service + ".onDestroy()", e3);
            }
        }
        return true;
    }

    private static void a(Application application, ComponentCallbacks componentCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a35c5f", new Object[]{application, componentCallbacks});
        } else if (Build.VERSION.SDK_INT < 14) {
        } else {
            application.registerComponentCallbacks(componentCallbacks);
        }
    }

    private static void b(Application application, ComponentCallbacks componentCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad2e47e", new Object[]{application, componentCallbacks});
        } else if (application == null || Build.VERSION.SDK_INT < 14) {
        } else {
            application.unregisterComponentCallbacks(componentCallbacks);
        }
    }

    public static Class<? extends Service> a(Context context, String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("87d632d7", new Object[]{context, str});
        }
        try {
            if (Services.class.getClassLoader() != null) {
                return Services.class.getClassLoader().loadClass(str);
            }
            return context.getClassLoader().loadClass(str);
        } catch (ClassCastException unused) {
            c.a("LocalSvc", "Not a Service derived class: " + str);
            return null;
        }
    }

    private static void a(Context context, Class<? extends Service> cls, Service service, Application application) {
        Method method = c;
        if (method == null) {
            return;
        }
        try {
            method.invoke(service, context, null, cls.getName(), null, application, null);
        } catch (IllegalAccessException e) {
            c.a("LocalSvc", "Unexpected exception when attaching service.", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getTargetException());
        }
    }

    private static Application a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("2ae8882f", new Object[]{context});
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return ((Service) context).getApplication();
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        c.b("LocalSvc", "Cannot discover application from context " + context);
        return null;
    }

    static {
        kge.a(-334970420);
        f15060a = new HashMap();
        b = new HashMap<>();
        Method method = null;
        try {
            method = Service.class.getDeclaredMethod(Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class, Class.forName(ProcessUtils.ACTIVITY_THREAD), String.class, IBinder.class, Application.class, Object.class);
            method.setAccessible(true);
        } catch (ClassNotFoundException e) {
            Log.e("LocalSvc", "Incompatible ROM", e);
        } catch (NoSuchMethodException e2) {
            Log.e("LocalSvc", "Incompatible ROM", e2);
        }
        c = method;
    }
}
