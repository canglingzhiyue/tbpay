package tb;

import android.app.ActivityThread;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.handler.invoc.MethodInvocationHandler;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ServiceWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IBindService;
import com.taobao.aranger.intf.IUnbindService;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.FakeServiceCenter;
import com.taobao.aranger.utils.ReflectUtils;
import com.taobao.aranger.utils.TypeUtils;
import com.taobao.aranger.utils.a;
import com.taobao.aranger.utils.b;
import com.taobao.aranger.utils.c;
import com.taobao.aranger.utils.d;
import com.taobao.aranger.utils.i;
import com.taobao.aranger.utils.l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class jzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final AtomicBoolean f29901a;
    private static volatile Application b;
    private static final ConcurrentHashMap<String, List<Pair<Uri, WeakReference<ServiceConnection>>>> c;
    public static volatile long d;
    private static boolean e;
    private static final ConcurrentHashMap<String, Uri> f;

    public static /* synthetic */ void lambda$RFLkbCKilfCYIJ83ltAkj1BgLBY(ServiceConnection serviceConnection) {
        b(serviceConnection);
    }

    public static /* synthetic */ void lambda$aeSquAw4AwweG1Xkf06qtouBXxc(ServiceConnection serviceConnection, Uri uri, Intent intent, String str, IBinder iBinder) {
        a(serviceConnection, uri, intent, str, iBinder);
    }

    public static /* synthetic */ void lambda$kuEwG6JMGtc7ZXaEfsqiv8p0MfI(String str, ServiceConnection serviceConnection, Uri uri, Intent intent, IBinder iBinder) {
        a(str, serviceConnection, uri, intent, iBinder);
    }

    public static /* synthetic */ void lambda$od6NgnGkU5ALVblTBzTz5z7hO68(Intent intent, ServiceConnection serviceConnection, int i, xmq xmqVar) {
        b(intent, serviceConnection, i, xmqVar);
    }

    /* renamed from: lambda$wEedYeuR-8SFHMvpY2zc77xNCxo */
    public static /* synthetic */ void m2460lambda$wEedYeuR8SFHMvpY2zc77xNCxo(String str) {
        a(str);
    }

    public static Context a() {
        if (b == null) {
            try {
                b = (Application) kaq.a();
            } catch (Exception e2) {
                kak.a("ARanger", "get context err", e2, new Object[0]);
            }
            synchronized (jzv.class) {
                if (b == null) {
                    try {
                        b = ActivityThread.currentApplication();
                    } catch (Exception e3) {
                        kak.a("ARanger", "[getContext][currentActivityThread]", e3, new Object[0]);
                    }
                    if (b == null) {
                        try {
                            ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                            if (currentActivityThread != null) {
                                b = currentActivityThread.getApplication();
                            }
                        } catch (Exception e4) {
                            kak.a("ARanger", "[getContext][currentActivityThread]", e4, new Object[0]);
                        }
                    }
                    if (b == null) {
                        try {
                            b = (Application) ReflectUtils.getHideMethod(ActivityThread.class, "getApplication", new Class[0]).invoke(ReflectUtils.getHideMethod(ActivityThread.class, ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(ActivityThread.class, new Object[0]), new Object[0]);
                        } catch (Exception e5) {
                            kak.a("ARanger", "[getContext][invoke]", e5, new Object[0]);
                        }
                    }
                    if (b == null) {
                        b = (Application) LauncherRuntime.g;
                    }
                }
            }
        }
        return b;
    }

    static {
        kge.a(1745277258);
        f29901a = new AtomicBoolean();
        e = false;
        c = new ConcurrentHashMap<>();
        f = new ConcurrentHashMap<>();
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        if (b == null) {
            b = application;
        }
        if (f29901a.getAndSet(true)) {
            return;
        }
        d = SystemClock.elapsedRealtime();
        kak.b("ARanger", "aranger init", new Object[0]);
        if (xkf.a()) {
            b.a(false, false, $$Lambda$jzv$ZnbDy6DJEhPr2GNkM9rPeTSko.INSTANCE);
        } else {
            b();
        }
        try {
            if (!kam.c()) {
                return;
            }
            xmr.a().b();
            application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: tb.jzv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
                    } else if (l.a("ARanger_onTrimMemory", 1000L)) {
                        for (FakeServiceCenter.FakeService fakeService : FakeServiceCenter.a().b()) {
                            kak.b("ARanger", "onTrimMemory", "service", fakeService.a(), "level", Integer.valueOf(i));
                            fakeService.onTrimMemory(i);
                        }
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                    } else if (l.a("ARanger_onConfigurationChanged", 1000L)) {
                        for (FakeServiceCenter.FakeService fakeService : FakeServiceCenter.a().b()) {
                            kak.b("ARanger", "onConfigurationChanged", "service", fakeService.a());
                            fakeService.onConfigurationChanged(configuration);
                        }
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bbd23dd", new Object[]{this});
                    } else if (l.a("ARanger_onLowMemory", 1000L)) {
                        for (FakeServiceCenter.FakeService fakeService : FakeServiceCenter.a().b()) {
                            kak.b("ARanger", "onLowMemory", "service", fakeService.a());
                            fakeService.onLowMemory();
                        }
                    }
                }
            });
            if (!application.getPackageName().equals(c.a())) {
                return;
            }
            xlk.setUTService($$Lambda$GvFfVeHaTQulM1PEwwElGyghKs.INSTANCE);
        } catch (Throwable th) {
            kak.a("ARanger", "aranger init err", th, new Object[0]);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!c.a(b, 3)) {
        } else {
            kam.a();
        }
    }

    @SafeVarargs
    public static <T> T a(ComponentName componentName, Class<T> cls, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2a069257", new Object[]{componentName, cls, pairArr}) : (T) a(componentName, "", cls, pairArr);
    }

    @SafeVarargs
    public static <T> T a(ComponentName componentName, String str, Class<T> cls, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ec55fce1", new Object[]{componentName, str, cls, pairArr});
        }
        TypeUtils.a(componentName);
        return (T) b(componentName, TypeUtils.a(str, (Class<?>) cls), cls, null, pairArr);
    }

    @SafeVarargs
    public static <T> T b(ComponentName componentName, Class<T> cls, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("61f76d76", new Object[]{componentName, cls, pairArr}) : (T) a(componentName, "", cls, "getInstance", pairArr);
    }

    public static boolean a(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26bfdd0b", new Object[]{componentName})).booleanValue();
        }
        try {
            TypeUtils.a(componentName);
            return c.b(componentName);
        } catch (IPCException unused) {
            return false;
        }
    }

    public static void a(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89be8b5", new Object[]{processStateListener});
        } else {
            CallbackManager.a().a(processStateListener);
        }
    }

    public static void b(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c270676", new Object[]{processStateListener});
        } else {
            CallbackManager.a().b(processStateListener);
        }
    }

    public static void a(ComponentName componentName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd07311", new Object[]{componentName, str});
        } else {
            c.a(componentName, str);
        }
    }

    @SafeVarargs
    private static <T> T a(ComponentName componentName, String str, Class<T> cls, String str2, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bc122457", new Object[]{componentName, str, cls, str2, pairArr});
        }
        TypeUtils.a(componentName);
        return (T) b(componentName, TypeUtils.a(str, (Class<?>) cls), cls, str2, pairArr);
    }

    @SafeVarargs
    private static <T> T b(ComponentName componentName, String str, Class<T> cls, String str2, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("af441bf6", new Object[]{componentName, str, cls, str2, pairArr});
        }
        Uri a2 = c.a(componentName);
        boolean equals = b.getPackageName().equals(componentName.getPackageName());
        ServiceWrapper serviceName = ServiceWrapper.obtain().setTimeStamp(equals ? i.a() : i.a(c.a())).setServiceInterfaceClass(cls).setServiceName(str);
        if (str2 != null) {
            i = 1;
        }
        Call remoteProviderUri = Call.obtain().setSameApp(equals).setServiceWrapper(serviceName.setType(i)).setMethodWrapper(MethodWrapper.obtain().setMethodName(str2).setVoid(true)).setParameterWrappers(d.a(pairArr)).setRemoteProviderUri(a2);
        kac.a(a2).a(remoteProviderUri);
        return (T) a(remoteProviderUri);
    }

    private static <T> T a(Call call) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("62e97df", new Object[]{call});
        }
        T t = (T) Proxy.newProxyInstance(call.getServiceWrapper().getServiceInterfaceClass().getClassLoader(), new Class[]{call.getServiceWrapper().getServiceInterfaceClass()}, new MethodInvocationHandler(call));
        a.a().a(call.getRemoteProviderUri(), call.getServiceWrapper().getTimeStamp(), t);
        return t;
    }

    public static void a(final Intent intent, final ServiceConnection serviceConnection, final int i, final xmq xmqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45da1938", new Object[]{intent, serviceConnection, new Integer(i), xmqVar});
        } else {
            b.a(false, true, new Runnable() { // from class: tb.-$$Lambda$jzv$od6NgnGkU5ALVblTBzTz5z7hO68
                @Override // java.lang.Runnable
                public final void run() {
                    jzv.lambda$od6NgnGkU5ALVblTBzTz5z7hO68(intent, serviceConnection, i, xmqVar);
                }
            });
        }
    }

    public static /* synthetic */ void b(Intent intent, ServiceConnection serviceConnection, int i, xmq xmqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce60039", new Object[]{intent, serviceConnection, new Integer(i), xmqVar});
            return;
        }
        boolean a2 = a(intent, serviceConnection, i);
        if (xmqVar == null) {
            return;
        }
        xmqVar.onResult(a2);
    }

    public static boolean a(Intent intent, ServiceConnection serviceConnection, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf856868", new Object[]{intent, serviceConnection, new Integer(i)})).booleanValue() : b(intent, serviceConnection, i);
    }

    public static void a(final ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725aeb5c", new Object[]{serviceConnection});
        } else if (!xkf.b()) {
            a().unbindService(serviceConnection);
        } else if (serviceConnection == null) {
            kak.b("ARanger", "ubBindService, conn is null", new Object[0]);
        } else {
            b.a(false, true, new Runnable() { // from class: tb.-$$Lambda$jzv$RFLkbCKilfCYIJ83ltAkj1BgLBY
                @Override // java.lang.Runnable
                public final void run() {
                    jzv.lambda$RFLkbCKilfCYIJ83ltAkj1BgLBY(serviceConnection);
                }
            });
        }
    }

    public static /* synthetic */ void b(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c978dc3b", new Object[]{serviceConnection});
            return;
        }
        kak.b("ARanger", "ubBindService", "map size", Integer.valueOf(c.size()), MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(serviceConnection.hashCode()));
        try {
            boolean z = false;
            for (Map.Entry<String, List<Pair<Uri, WeakReference<ServiceConnection>>>> entry : c.entrySet()) {
                String key = entry.getKey();
                List<Pair<Uri, WeakReference<ServiceConnection>>> value = entry.getValue();
                if (value != null && !value.isEmpty()) {
                    Iterator<Pair<Uri, WeakReference<ServiceConnection>>> it = value.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Pair<Uri, WeakReference<ServiceConnection>> next = it.next();
                            ServiceConnection serviceConnection2 = (ServiceConnection) ((WeakReference) next.second).get();
                            if (serviceConnection2 == serviceConnection) {
                                a(serviceConnection2, (Uri) next.first, key);
                                z = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            kak.b("ARanger", "ubBindService not found", MonitorItemConstants.WS_MONITOR_TITLE_CONN, serviceConnection);
        } catch (Throwable th) {
            kak.a("ARanger", "ubBindService err", th, new Object[0]);
        }
    }

    private static boolean b(final Intent intent, final ServiceConnection serviceConnection, int i) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d44e069", new Object[]{intent, serviceConnection, new Integer(i)})).booleanValue();
        }
        Context a2 = a();
        if (a2 == null) {
            kak.b("ARanger", "bindService, context empty", new Object[0]);
            return false;
        } else if (serviceConnection == null) {
            kak.b("ARanger", "bindService, ServiceConnection is null", new Object[0]);
            return false;
        } else if (!xkf.b()) {
            if (!e) {
                kal.a("bind_service", false, new String[0]);
                e = true;
            }
            return a2.bindService(intent, serviceConnection, i);
        } else {
            if (!e) {
                kal.a("bind_service", true, new String[0]);
                e = true;
            }
            if (intent != null && intent.getComponent() != null) {
                String className = intent.getComponent().getClassName();
                if (!StringUtils.isEmpty(className)) {
                    try {
                        final Uri uri = f.get(className);
                        if (uri == null) {
                            ServiceInfo serviceInfo = a2.getPackageManager().getServiceInfo(intent.getComponent(), 4);
                            if (a2.getPackageName().equals(serviceInfo.processName)) {
                                parse = Uri.parse("content://" + a2.getPackageName() + ".aranger.main");
                            } else {
                                if (!(a2.getPackageName() + ":channel").equals(serviceInfo.processName)) {
                                    kak.b("ARanger", "bindService, process not support", "proc", serviceInfo.processName);
                                    return false;
                                }
                                parse = Uri.parse("content://" + a2.getPackageName() + ":channel");
                            }
                            uri = parse;
                            f.put(className, uri);
                        }
                        String a3 = i.a();
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            kal.a("bind_in_main " + className, false, new String[0]);
                            kak.b("ARanger", "bindService in main", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent, "timeStamp", a3, com.taobao.android.weex_framework.util.a.ATOM_stack, kap.a(Thread.currentThread().getStackTrace()));
                        } else {
                            kak.b("ARanger", "bindService", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent, "timeStamp", a3);
                        }
                        kac.a(uri).a(Call.obtain().setSameApp(true).setOneWay(true).setServiceWrapper(ServiceWrapper.obtain().setTimeStamp(a3).setServiceName(intent.getComponent().getClassName()).setType(4)).setMethodWrapper(MethodWrapper.obtain().setVoid(true)).setParameterWrappers(d.a(new Pair[]{Pair.create(Intent.class, intent), Pair.create(Integer.class, Integer.valueOf(serviceConnection.hashCode())), Pair.create(IBindService.class, new IBindService() { // from class: tb.-$$Lambda$jzv$aeSquAw4AwweG1Xkf06qtouBXxc
                            @Override // com.taobao.aranger.intf.IBindService
                            public final void onBind(String str, IBinder iBinder) {
                                jzv.lambda$aeSquAw4AwweG1Xkf06qtouBXxc(serviceConnection, uri, intent, str, iBinder);
                            }
                        })})).setRemoteProviderUri(uri));
                        return true;
                    } catch (Throwable th) {
                        kak.a("ARanger", "bindService err", th, new Object[0]);
                        intent.putExtra(Constants.INTENT_KEY_SERVICE, true);
                        return a2.bindService(intent, serviceConnection, i);
                    }
                }
            }
            kak.b("ARanger", "bindService, illegal service", "service", intent);
            return false;
        }
    }

    public static /* synthetic */ void a(final ServiceConnection serviceConnection, final Uri uri, final Intent intent, final String str, final IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a02159", new Object[]{serviceConnection, uri, intent, str, iBinder});
        } else {
            b.a(false, true, new Runnable() { // from class: tb.-$$Lambda$jzv$kuEwG6JMGtc7ZXaEfsqiv8p0MfI
                @Override // java.lang.Runnable
                public final void run() {
                    jzv.lambda$kuEwG6JMGtc7ZXaEfsqiv8p0MfI(str, serviceConnection, uri, intent, iBinder);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str, ServiceConnection serviceConnection, Uri uri, Intent intent, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf256259", new Object[]{str, serviceConnection, uri, intent, iBinder});
            return;
        }
        kak.b("ARanger", "onServiceConnected", "timeStamp", str, MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(serviceConnection.hashCode()));
        List<Pair<Uri, WeakReference<ServiceConnection>>> list = c.get(str);
        if (list == null) {
            list = new ArrayList<>();
            c.put(str, list);
        }
        list.add(Pair.create(uri, new WeakReference(serviceConnection)));
        serviceConnection.onServiceConnected(intent.getComponent(), iBinder);
    }

    private static void a(ServiceConnection serviceConnection, Uri uri, final String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26e1275", new Object[]{serviceConnection, uri, str});
            return;
        }
        int hashCode = serviceConnection.hashCode();
        kak.b("ARanger", "unbindServiceImpl", MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(hashCode), "timeStamp", str);
        kac.a(uri).a(Call.obtain().setSameApp(true).setOneWay(true).setServiceWrapper(ServiceWrapper.obtain().setTimeStamp(str).setType(5)).setMethodWrapper(MethodWrapper.obtain().setVoid(true)).setParameterWrappers(d.a(new Pair[]{Pair.create(Integer.class, Integer.valueOf(hashCode)), Pair.create(IUnbindService.class, new IUnbindService() { // from class: tb.-$$Lambda$jzv$wEedYeuR-8SFHMvpY2zc77xNCxo
            @Override // com.taobao.aranger.intf.IUnbindService
            public final void onDestroy() {
                jzv.m2460lambda$wEedYeuR8SFHMvpY2zc77xNCxo(str);
            }
        })})).setRemoteProviderUri(uri));
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        kak.b("ARanger", "unbindServiceImpl onDestroy", new Object[0]);
        c.remove(str);
    }
}
