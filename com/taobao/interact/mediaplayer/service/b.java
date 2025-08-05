package com.taobao.interact.mediaplayer.service;

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
import com.taobao.interact.mediaplayer.service.IMediaPlayerService;
import java.util.Stack;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements com.taobao.interact.mediaplayer.service.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Stack<ServiceConnection> e;

    /* renamed from: a  reason: collision with root package name */
    private Context f17600a;
    private IMediaPlayerService b;
    private String d;
    private Application f;
    private Application.ActivityLifecycleCallbacks g = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.interact.mediaplayer.service.b.1
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
                b.b(b.this);
            }
        }
    };
    private Intent c = new Intent("com.taobao.interact.mediaplayer.service.IMediaPlayerService");

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f475a279", new Object[]{bVar}) : bVar.f17600a;
    }

    public static /* synthetic */ IMediaPlayerService a(b bVar, IMediaPlayerService iMediaPlayerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayerService) ipChange.ipc$dispatch("8a83f2b3", new Object[]{bVar, iMediaPlayerService});
        }
        bVar.b = iMediaPlayerService;
        return iMediaPlayerService;
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5f1860", new Object[]{bVar});
        } else {
            bVar.f();
        }
    }

    public static /* synthetic */ String c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3a622041", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ IMediaPlayerService d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayerService) ipChange.ipc$dispatch("9e3aa940", new Object[]{bVar}) : bVar.b;
    }

    static {
        kge.a(-650172122);
        kge.a(-2085579546);
        e = new Stack<>();
    }

    public b(Context context, String str) {
        this.d = str;
        this.f17600a = context;
        this.c.setPackage(context.getPackageName());
        this.c.putExtra("id", str);
        h();
        a(new C0674b());
        this.f = a(context);
        this.f.registerActivityLifecycleCallbacks(this.g);
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

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h();
        Application application = this.f;
        if (application == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this.g);
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void a(final String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (g()) {
            this.b.play(str, this.d);
        } else {
            a(new a() { // from class: com.taobao.interact.mediaplayer.service.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.interact.mediaplayer.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.d(b.this).play(str, b.c(b.this));
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void b(final String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (g()) {
            this.b.playWithUrl(str, this.d);
        } else {
            a(new a() { // from class: com.taobao.interact.mediaplayer.service.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.interact.mediaplayer.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.d(b.this).playWithUrl(str, b.c(b.this));
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void a() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!g()) {
        } else {
            this.b.resume(this.d);
        }
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void b() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!g() || !e()) {
        } else {
            this.b.pause(this.d);
        }
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void c() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!g()) {
        } else {
            this.b.stop(this.d);
        }
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void d() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!g()) {
        } else {
            this.b.release(this.d);
        }
    }

    public boolean e() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!g()) {
            return false;
        }
        return this.b.isPlaying(this.d);
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void a(final boolean z) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (g()) {
            this.b.setLooping(z, this.d);
        } else {
            a(new a() { // from class: com.taobao.interact.mediaplayer.service.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.interact.mediaplayer.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.d(b.this).setLooping(z, b.c(b.this));
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.interact.mediaplayer.service.a
    public void a(final float f, final float f2) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else if (g()) {
            this.b.setVolume(f, f2, this.d);
        } else {
            a(new a() { // from class: com.taobao.interact.mediaplayer.service.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.interact.mediaplayer.service.b.a
                public void a(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    try {
                        b.d(b.this).setVolume(f, f2, b.c(b.this));
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    private synchronized boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return this.b != null;
    }

    private void a(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725aeb5c", new Object[]{this, serviceConnection});
            return;
        }
        e.push(serviceConnection);
        this.f17600a.bindService(this.c, serviceConnection, 1);
    }

    private synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        while (!e.isEmpty()) {
            ServiceConnection pop = e.pop();
            if (pop != null) {
                try {
                    this.f17600a.unbindService(pop);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public abstract class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(967940944);
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
                if (b.d(b.this) == null) {
                    b.a(b.this, IMediaPlayerService.Stub.asInterface(iBinder));
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
                b.a(b.this, (IMediaPlayerService) null);
            }
        }
    }

    /* renamed from: com.taobao.interact.mediaplayer.service.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0674b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(725552693);
        }

        @Override // com.taobao.interact.mediaplayer.service.b.a
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a122dee", new Object[]{this, componentName, iBinder});
            }
        }

        public C0674b() {
            super();
        }
    }
}
