package com.taobao.desktop.channel.desktoplinktask.trigger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kgz;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16947a;
    private Messenger b;
    private int d;
    private Bundle e;
    private Handler f;
    private Class h;
    private boolean c = false;
    private final ServiceConnection g = new ServiceConnection() { // from class: com.taobao.desktop.channel.desktoplinktask.trigger.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            kgz.a("ChannelServiceManager.onServiceConnected.", new Object[0]);
            b.a(b.this, new Messenger(iBinder));
            b.a(b.this, true);
            b bVar = b.this;
            bVar.a(b.a(bVar), b.b(b.this), b.c(b.this));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            kgz.a("ChannelServiceManager.onServiceDisconnected.", new Object[0]);
            b.a(b.this, (Messenger) null);
            b.a(b.this, false);
        }
    };

    static {
        kge.a(-1843556722);
    }

    public static /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c09b4665", new Object[]{bVar})).intValue() : bVar.d;
    }

    public static /* synthetic */ Messenger a(b bVar, Messenger messenger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Messenger) ipChange.ipc$dispatch("d9d90544", new Object[]{bVar, messenger});
        }
        bVar.b = messenger;
        return messenger;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ce3aa6", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.c = z;
        return z;
    }

    public static /* synthetic */ Bundle b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("7e062937", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ Handler c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a90ac252", new Object[]{bVar}) : bVar.f;
    }

    public b(Context context, Class cls) {
        if (context.getApplicationContext() != null) {
            this.f16947a = context.getApplicationContext();
        } else {
            this.f16947a = context;
        }
        this.h = cls;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        kgz.a("isWidgetServiceConnect " + this.c);
        return this.c;
    }

    public void a(int i, Bundle bundle, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d270609", new Object[]{this, new Integer(i), bundle, handler});
            return;
        }
        try {
            this.d = i;
            this.e = bundle;
            this.f = handler;
            if (a()) {
                c();
                a(this.g);
                return;
            }
            b();
        } catch (Exception e) {
            kgz.a("ChannelServiceManager.workWidgetService error", e);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (a()) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(this.f16947a.getPackageName(), this.h.getName());
            kgz.a("ChannelServiceManager.bindWidgetService.isBind=%s", Boolean.valueOf(this.f16947a.bindService(intent, this.g, 1)));
        } catch (Throwable th) {
            kgz.a("ChannelServiceManager.bindWidgetService error", th);
        }
    }

    public void a(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725aeb5c", new Object[]{this, serviceConnection});
            return;
        }
        try {
            this.f16947a.unbindService(serviceConnection);
            this.c = false;
            kgz.a("ChannelServiceManager.unBindService.", new Object[0]);
        } catch (Throwable th) {
            kgz.a("ChannelServiceManager.unBindService.error", th);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = this.d;
            Handler handler = this.f;
            if (handler != null) {
                obtain.replyTo = new Messenger(handler);
            }
            obtain.setData(this.e);
            try {
                this.b.send(obtain);
            } catch (Throwable th) {
                kgz.a("ChannelServiceManager.sendWidgetServiceData.error", th);
            }
            this.e = null;
            this.f = null;
        }
    }
}
