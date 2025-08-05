package com.taobao.android.ugc.service;

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
import com.taobao.android.ugc.service.IMicroPublishService;
import java.util.Stack;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements com.taobao.android.ugc.service.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_ACTION_NAME = "com.taobao.ugc.mini.service.publish";
    private static final Stack<ServiceConnection> c;

    /* renamed from: a  reason: collision with root package name */
    private Context f15721a;
    private IMicroPublishService b;
    private Application d;
    private Application.ActivityLifecycleCallbacks e = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.ugc.service.c.1
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
            } else if (!c.a(c.this).equals(activity)) {
            } else {
                c.this.b();
            }
        }
    };
    private Intent f;

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ef1e1737", new Object[]{cVar}) : cVar.f15721a;
    }

    public static /* synthetic */ IMicroPublishService a(c cVar, IMicroPublishService iMicroPublishService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMicroPublishService) ipChange.ipc$dispatch("29f1903b", new Object[]{cVar, iMicroPublishService});
        }
        cVar.b = iMicroPublishService;
        return iMicroPublishService;
    }

    public static /* synthetic */ String b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("720bc820", new Object[]{cVar}) : cVar.c();
    }

    public static /* synthetic */ IMicroPublishService c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMicroPublishService) ipChange.ipc$dispatch("fc14cd46", new Object[]{cVar}) : cVar.b;
    }

    static {
        kge.a(-574398623);
        kge.a(-32236599);
        c = new Stack<>();
    }

    public c(Context context) {
        this.f15721a = context;
        com.taobao.android.ugc.service.a.a(c(), context);
        this.f = new Intent(SERVICE_ACTION_NAME);
        this.f.setPackage(this.f15721a.getPackageName());
        a(new b());
        this.d = a(context);
        this.d.registerActivityLifecycleCallbacks(this.e);
    }

    private String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f15721a.toString();
    }

    @Override // com.taobao.android.ugc.service.b
    public void a(final String str, final String str2, final ICallback iCallback) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f80028", new Object[]{this, str, str2, iCallback});
        } else if (d()) {
            this.b.showView(c(), str, str2, iCallback);
        } else {
            a(new a() { // from class: com.taobao.android.ugc.service.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.android.ugc.service.c.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        c.c(c.this).showView(c.b(c.this), str, str2, iCallback);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.ugc.service.b
    public void a(final int i, final int i2, final Intent intent) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (d()) {
            this.b.onActivityResult(c(), i, i2, intent);
        } else {
            a(new a() { // from class: com.taobao.android.ugc.service.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.android.ugc.service.c.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        c.c(c.this).onActivityResult(c.b(c.this), i, i2, intent);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.ugc.service.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!d()) {
        } else {
            try {
                this.b.dismiss(c());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        Application application = this.d;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.e);
        }
        a();
        this.b = null;
    }

    private synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return this.b != null;
    }

    private synchronized void a(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725aeb5c", new Object[]{this, serviceConnection});
            return;
        }
        c.push(serviceConnection);
        this.f15721a.bindService(this.f, serviceConnection, 1);
    }

    private synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        while (!c.isEmpty()) {
            ServiceConnection pop = c.pop();
            if (pop != null) {
                try {
                    this.f15721a.unbindService(pop);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static Application a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("2ae8882f", new Object[]{context});
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
            return a(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Failed to find application from context: " + context);
    }

    /* loaded from: classes6.dex */
    public abstract class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-228549151);
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
            synchronized (c.this) {
                if (c.c(c.this) == null) {
                    c.a(c.this, IMicroPublishService.Stub.asInterface(iBinder));
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
                c.a(c.this, null);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1996338086);
        }

        @Override // com.taobao.android.ugc.service.c.a
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
            }
        }

        public b() {
            super();
        }
    }
}
