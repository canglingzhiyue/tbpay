package com.taobao.interact.upload.service;

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
import com.taobao.interact.upload.service.FileUploadBaseListener;
import com.taobao.interact.upload.service.IUploadService;
import com.taobao.interact.upload.service.UploadCallBack;
import java.util.List;
import java.util.Stack;
import tb.kge;

/* loaded from: classes7.dex */
public class d implements com.taobao.interact.upload.service.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Stack<ServiceConnection> c;

    /* renamed from: a  reason: collision with root package name */
    private Context f17628a;
    private IUploadService b;
    private Application d;
    private Application.ActivityLifecycleCallbacks e = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.interact.upload.service.d.1
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
            } else if (!d.a(d.this).equals(activity)) {
            } else {
                d.this.a();
            }
        }
    };
    private Intent f;

    public static /* synthetic */ Context a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("284017ad", new Object[]{dVar}) : dVar.f17628a;
    }

    public static /* synthetic */ IUploadService a(d dVar, IUploadService iUploadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUploadService) ipChange.ipc$dispatch("7720cd43", new Object[]{dVar, iUploadService});
        }
        dVar.b = iUploadService;
        return iUploadService;
    }

    public static /* synthetic */ IUploadService b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUploadService) ipChange.ipc$dispatch("6439ad5a", new Object[]{dVar}) : dVar.b;
    }

    static {
        kge.a(244600334);
        kge.a(-249324120);
        c = new Stack<>();
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

    public d(Context context) {
        this.f17628a = context;
        b();
        this.f = new Intent("com.taobao.interact.upload.service.IUploadService");
        this.f.setPackage(this.f17628a.getPackageName());
        a(new b());
        this.d = a(context);
        this.d.registerActivityLifecycleCallbacks(this.e);
    }

    @Override // com.taobao.interact.upload.service.b
    public void a(final List<String> list, final MtopInfo mtopInfo, final UploadCallBack.Stub stub) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9647f175", new Object[]{this, list, mtopInfo, stub});
        } else if (c()) {
            this.b.uploadNewFiles(list, mtopInfo, stub);
        } else {
            a(new a() { // from class: com.taobao.interact.upload.service.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.interact.upload.service.d.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        d.b(d.this).uploadNewFiles(list, mtopInfo, stub);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        Application application = this.d;
        if (application == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this.e);
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        while (!c.isEmpty()) {
            ServiceConnection pop = c.pop();
            if (pop != null) {
                try {
                    this.f17628a.unbindService(pop);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.taobao.interact.upload.service.b
    public void a(final String str, final MtopInfo mtopInfo, final FileUploadBaseListener.Stub stub) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3eb6a98", new Object[]{this, str, mtopInfo, stub});
        } else if (c()) {
            this.b.uploadFile(str, mtopInfo, stub);
        } else {
            a(new a() { // from class: com.taobao.interact.upload.service.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.interact.upload.service.d.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        d.b(d.this).uploadFile(str, mtopInfo, stub);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void a(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725aeb5c", new Object[]{this, serviceConnection});
            return;
        }
        c.push(serviceConnection);
        this.f17628a.bindService(this.f, serviceConnection, 1);
    }

    private synchronized boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return this.b != null;
    }

    /* loaded from: classes7.dex */
    public abstract class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-270343836);
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
            synchronized (d.this) {
                if (d.b(d.this) == null) {
                    d.a(d.this, IUploadService.Stub.asInterface(iBinder));
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
                d.a(d.this, null);
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-865791387);
        }

        @Override // com.taobao.interact.upload.service.d.a
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
