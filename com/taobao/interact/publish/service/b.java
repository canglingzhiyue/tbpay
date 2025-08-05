package com.taobao.interact.publish.service;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.publish.service.IPublishService;
import com.taobao.interact.publish.service.IServiceCallBack;
import java.util.Stack;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements com.taobao.interact.publish.service.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Stack<ServiceConnection> d;

    /* renamed from: a  reason: collision with root package name */
    private Context f17612a;
    private PublishConfig b;
    private IPublishService c;
    private Application e;
    private Application.ActivityLifecycleCallbacks f = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.interact.publish.service.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (!b.a(b.this).equals(activity)) {
            } else {
                b.this.d();
            }
        }
    };
    private Intent g;

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("499f2eef", new Object[]{bVar}) : bVar.f17612a;
    }

    public static /* synthetic */ IPublishService a(b bVar, IPublishService iPublishService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPublishService) ipChange.ipc$dispatch("799a13d", new Object[]{bVar, iPublishService});
        }
        bVar.c = iPublishService;
        return iPublishService;
    }

    public static /* synthetic */ IPublishService b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPublishService) ipChange.ipc$dispatch("c88de018", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ PublishConfig c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PublishConfig) ipChange.ipc$dispatch("2a701535", new Object[]{bVar}) : bVar.b;
    }

    static {
        kge.a(-56208230);
        kge.a(1665839494);
        d = new Stack<>();
    }

    public b(Context context, PublishConfig publishConfig) {
        this.f17612a = context;
        this.b = publishConfig;
        f();
        this.g = a(this.f17612a);
        this.f17612a.startService(this.g);
        a(new C0675b());
        this.e = b(context);
        this.e.registerActivityLifecycleCallbacks(this.f);
    }

    private Intent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("41646cb3", new Object[]{this, context});
        }
        Intent intent = new Intent("com.taobao.interact.publish.service.IPublishService");
        intent.setPackage(context.getPackageName());
        return intent;
    }

    private static Application b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("450406ce", new Object[]{context});
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
            return b(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Failed to find application from context: " + context);
    }

    @Override // com.taobao.interact.publish.service.a
    public void a(final IServiceCallBack.Stub stub) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db68d398", new Object[]{this, stub});
        } else if (e()) {
            this.c.registerCallback(stub);
        } else {
            a(new a() { // from class: com.taobao.interact.publish.service.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.interact.publish.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.b(b.this).registerCallback(stub);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.interact.publish.service.a
    public void a(PublishConfig publishConfig) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46106c68", new Object[]{this, publishConfig});
            return;
        }
        this.b = publishConfig;
        if (!e()) {
            return;
        }
        this.c.initConfig(publishConfig);
    }

    @Override // com.taobao.interact.publish.service.a
    public void a() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (e()) {
            this.c.showChoiceDialog();
        } else {
            a(new a() { // from class: com.taobao.interact.publish.service.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.interact.publish.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.b(b.this).showChoiceDialog();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.interact.publish.service.a
    public void b() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (e()) {
            this.c.callGallery();
        } else {
            a(new a() { // from class: com.taobao.interact.publish.service.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.interact.publish.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.b(b.this).callGallery();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.interact.publish.service.a
    public void c() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (e()) {
            this.c.callCamera();
        } else {
            a(new a() { // from class: com.taobao.interact.publish.service.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.interact.publish.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.b(b.this).callCamera();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c != null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        f();
        this.c = null;
        Application application = this.e;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.f);
        }
        this.f17612a.stopService(this.g);
    }

    private synchronized void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        while (!d.isEmpty()) {
            ServiceConnection pop = d.pop();
            if (pop != null) {
                try {
                    this.f17612a.unbindService(pop);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private synchronized void a(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725aeb5c", new Object[]{this, serviceConnection});
            return;
        }
        d.push(serviceConnection);
        this.f17612a.bindService(this.g, serviceConnection, 1);
    }

    /* loaded from: classes7.dex */
    public abstract class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-663162278);
            kge.a(808545181);
        }

        public abstract void a(ComponentName componentName, IBinder iBinder);

        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            synchronized (b.this) {
                if (b.b(b.this) == null) {
                    b.a(b.this, IPublishService.Stub.asInterface(iBinder));
                    try {
                        b.b(b.this).initConfig(b.c(b.this));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
            a(componentName, iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                b.a(b.this, null);
            }
        }
    }

    /* renamed from: com.taobao.interact.publish.service.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0675b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1232714835);
        }

        @Override // com.taobao.interact.publish.service.b.a
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
            }
        }

        public C0675b() {
            super();
        }
    }
}
