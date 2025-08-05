package com.taobao.keepalive;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.c;
import tb.kaq;
import tb.kge;
import tb.rty;

/* loaded from: classes7.dex */
public class SupportService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Messenger f17644a;

    /* loaded from: classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f17645a;

        /* renamed from: com.taobao.keepalive.SupportService$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public class C0677a implements IBinder.DeathRecipient {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Messenger f17646a;

            /* renamed from: com.taobao.keepalive.SupportService$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public class ServiceConnectionC0678a implements ServiceConnection {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                static {
                    kge.a(616621623);
                    kge.a(808545181);
                }

                public ServiceConnectionC0678a() {
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    rty.f33380a.d("SupportService", "ChannelService.onServiceConnected", new Object[0]);
                    try {
                        a.this.f17645a.unbindService(this);
                    } catch (Throwable unused) {
                    }
                    Process.killProcess(Process.myPid());
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    }
                }
            }

            static {
                kge.a(-794888198);
                kge.a(1219188865);
            }

            public C0677a(Messenger messenger) {
                this.f17646a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                    return;
                }
                rty.f33380a.d("SupportService", "binderDied", new Object[0]);
                try {
                    Intent intent = new Intent();
                    intent.setClassName("com.taobao.taobao", c.channelService);
                    a.this.f17645a.bindService(intent, new ServiceConnectionC0678a(), 1);
                    this.f17646a.getBinder().unlinkToDeath(this, 0);
                } catch (Throwable th) {
                    rty.f33380a.b("SupportService", "binderDied err", th, new Object[0]);
                }
            }
        }

        static {
            kge.a(-246636931);
        }

        public a(Context context) {
            this.f17645a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null && message.replyTo != null) {
                rty.f33380a.d("SupportService", "handleMessage", new Object[0]);
                Messenger messenger = message.replyTo;
                try {
                    messenger.getBinder().linkToDeath(new C0677a(messenger), 0);
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    messenger.send(obtain);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                rty.f33380a.d("SupportService", "handleMessage empty", new Object[0]);
            }
        }
    }

    static {
        kge.a(455608768);
    }

    public static /* synthetic */ Object ipc$super(SupportService supportService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        rty.f33380a.d("SupportService", "onBind", new Object[0]);
        if (this.f17644a == null) {
            this.f17644a = new Messenger(new a(getApplicationContext()));
        }
        return this.f17644a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        kaq.a(getApplicationContext());
    }
}
