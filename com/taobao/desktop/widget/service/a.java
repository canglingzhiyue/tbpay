package com.taobao.desktop.widget.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.e;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import com.taobao.login4android.api.Login;
import tb.kge;
import tb.khn;
import tb.khp;
import tb.kif;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f16998a;
    private static b l;
    private final Context b;
    private Messenger c;
    private Messenger d;
    private RemoteData h;
    private Messenger k;
    private boolean e = false;
    private boolean f = false;
    private int g = 1;
    private final ServiceConnection i = new ServiceConnection() { // from class: com.taobao.desktop.widget.service.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            kif.a("onServiceConnected " + componentName);
            a.a(a.this, new Messenger(iBinder));
            a.a(a.this, true);
            a aVar = a.this;
            aVar.a(a.a(aVar));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            kif.a("onServiceDisconnected " + componentName);
            a.a(a.this, (Messenger) null);
            a.a(a.this, false);
        }
    };
    private final ServiceConnection j = new ServiceConnection() { // from class: com.taobao.desktop.widget.service.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            kif.a("onServiceConnected " + componentName);
            try {
                a.b(a.this, new Messenger(iBinder));
                a.b(a.this, true);
                a.b(a.this);
            } catch (Throwable th) {
                kif.a("onServiceConnected error" + th);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            kif.a("onServiceDisconnected " + componentName);
            a.b(a.this, (Messenger) null);
            a.b(a.this, false);
        }
    };

    static {
        kge.a(1974228283);
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acf6244a", new Object[]{aVar})).intValue() : aVar.g;
    }

    public static /* synthetic */ Messenger a(a aVar, Messenger messenger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Messenger) ipChange.ipc$dispatch("edb04a3f", new Object[]{aVar, messenger});
        }
        aVar.d = messenger;
        return messenger;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1cf1961", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.f = z;
        return z;
    }

    public static /* synthetic */ Messenger b(a aVar, Messenger messenger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Messenger) ipChange.ipc$dispatch("a59cb7c0", new Object[]{aVar, messenger});
        }
        aVar.c = messenger;
        return messenger;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45b5976", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7108822", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.e = z;
        return z;
    }

    public static /* synthetic */ b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5b2dd1be", new Object[0]) : l;
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ee82d58f", new Object[]{context});
        }
        if (f16998a == null) {
            synchronized (a.class) {
                if (f16998a == null) {
                    f16998a = new a(context);
                }
            }
        }
        return f16998a;
    }

    private a(Context context) {
        if (context.getApplicationContext() != null) {
            this.b = context.getApplicationContext();
        } else {
            this.b = context;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        kif.a("isWidgetServiceConnect " + this.e);
        return this.e;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        kif.a("isMainServiceConnect " + this.f);
        return this.f;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (a()) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(this.b.getPackageName(), WidgetLauncherService.class.getName());
            boolean bindService = this.b.bindService(intent, this.j, 1);
            kif.a("bindWidgetService isBind = " + bindService);
        } catch (Throwable th) {
            kif.a("bindWidgetService error = " + th.getMessage());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (b()) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(this.b.getPackageName(), DesktopMainService.class.getName());
            boolean bindService = this.b.bindService(intent, this.i, 1);
            kif.a("bindMainService isBind = " + bindService);
        } catch (Throwable th) {
            kif.a("bindMainService error = " + th.getMessage());
        }
    }

    public void a(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725aeb5c", new Object[]{this, serviceConnection});
            return;
        }
        try {
            this.b.unbindService(serviceConnection);
            kif.a("unBindService  success");
        } catch (Throwable th) {
            kif.a("unBindService error = " + th.getMessage());
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.g = i;
            if (b()) {
                e();
                a(this.i);
                return;
            }
            d();
        } catch (Exception e) {
            kif.a("workWidgetService error = " + e.getMessage());
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null) {
        } else {
            Message obtain = Message.obtain((Handler) null, this.g);
            obtain.setData(h());
            try {
                this.d.send(obtain);
            } catch (RemoteException e) {
                kif.a("sendWidgetServiceData error = " + e.getMessage());
            }
        }
    }

    public void a(int i, RemoteData remoteData, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f38703", new Object[]{this, new Integer(i), remoteData, bVar});
            return;
        }
        try {
            this.g = i;
            this.h = remoteData;
            l = bVar;
            if (a()) {
                f();
            } else {
                c();
            }
        } catch (Exception e) {
            kif.a("workWidgetService error = " + e.getMessage());
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c == null) {
        } else {
            Message obtain = Message.obtain((Handler) null, this.g);
            obtain.setData(g());
            if (e.l(this.b).booleanValue() && l != null) {
                j();
                obtain.replyTo = this.k;
            }
            try {
                this.c.send(obtain);
            } catch (RemoteException e) {
                kif.a("sendWidgetServiceData error = " + e.getMessage());
            }
        }
    }

    private Bundle g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("8ecd16b2", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putString("login_uid", Login.getUserId() != null ? Login.getUserId() : "");
            bundle.putString("login_encrypt_uid", khn.a(this.b).d());
            bundle.putString("process_share_orange", JSON.toJSONString(khp.f30079a));
            bundle.putString("widget_data", g.a(this.b).a());
            g.a(this.b).b();
            bundle.putString("mockSet", khn.a(this.b).b());
            if (this.h != null) {
                bundle.putString("widget_id", this.h.getChangeWidgetId());
                bundle.putString("widget_type_id", this.h.getTypeId());
            }
        } catch (Exception e) {
            kif.a("buildWidgetData error: " + e);
        }
        kif.b("sendWidgetServiceData ");
        return bundle;
    }

    private Bundle h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d8feaff3", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putString("widget_data", g.a(this.b).a());
        kif.b("sendMainServiceData ");
        return bundle;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.k = new Messenger(new Handler(Looper.getMainLooper()) { // from class: com.taobao.desktop.widget.service.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == 673877017) {
                        super.handleMessage((Message) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    } else if (message.what != 3) {
                        super.handleMessage(message);
                    } else {
                        try {
                            kif.b("MSG_MAIN_PROCESS receiver reply msg widget main process " + message.getData());
                            if (a.i() == null) {
                                return;
                            }
                            a.i().a();
                            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().d("widget_state_default_reply"));
                        } catch (Throwable th) {
                            kif.b("receiver msg from main process error" + th.getMessage());
                        }
                    }
                }
            });
        }
    }
}
