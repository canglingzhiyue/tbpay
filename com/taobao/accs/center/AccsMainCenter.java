package com.taobao.accs.center;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.IGlobalClientInfoService;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.center.IAccsMainBinder;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.m;
import com.taobao.aranger.intf.ProcessStateListener;
import java.util.concurrent.ConcurrentHashMap;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class AccsMainCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String e;

    /* renamed from: a */
    private AccsMainBinderImpl f8196a;
    private Context b;
    private volatile boolean c;
    private ConcurrentHashMap<String, Service> d;
    private volatile boolean f;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final AccsMainCenter f8198a;

        static {
            kge.a(-101411517);
            f8198a = new AccsMainCenter();
        }

        public static /* synthetic */ AccsMainCenter a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AccsMainCenter) ipChange.ipc$dispatch("516bf7a9", new Object[0]) : f8198a;
        }
    }

    public static /* synthetic */ void lambda$uAApIu3DpmqURqhNjr6nvHM9cGE(AccsMainCenter accsMainCenter) {
        accsMainCenter.b();
    }

    public static /* synthetic */ void a(AccsMainCenter accsMainCenter, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3841e6", new Object[]{accsMainCenter, intent});
        } else {
            accsMainCenter.a(intent);
        }
    }

    public static /* synthetic */ boolean a(AccsMainCenter accsMainCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c9f652d", new Object[]{accsMainCenter})).booleanValue() : accsMainCenter.c;
    }

    public static /* synthetic */ boolean a(AccsMainCenter accsMainCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("574df2cf", new Object[]{accsMainCenter, new Boolean(z)})).booleanValue();
        }
        accsMainCenter.c = z;
        return z;
    }

    public static /* synthetic */ void b(AccsMainCenter accsMainCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8bce88", new Object[]{accsMainCenter});
        } else {
            accsMainCenter.e();
        }
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : e;
    }

    static {
        kge.a(1042533488);
        e = AccsMainCenter.class.getSimpleName();
    }

    private AccsMainCenter() {
        this.d = new ConcurrentHashMap<>();
        this.f8196a = new AccsMainBinderImpl();
        this.b = GlobalClientInfo.getContext();
        if (m.t()) {
            GlobalClientInfo.getInstance(this.b).setMainBinder(this.f8196a);
        }
    }

    public static AccsMainCenter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccsMainCenter) ipChange.ipc$dispatch("516bf7a9", new Object[0]) : a.a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.f) {
        } else {
            this.f = true;
            b(z);
        }
    }

    /* loaded from: classes.dex */
    public final class AccsMainBinderImpl extends IAccsMainBinder.Stub {
        static {
            kge.a(2050599689);
        }

        private AccsMainBinderImpl() {
            AccsMainCenter.this = r1;
        }

        @Override // com.taobao.accs.center.IAccsMainBinder
        public void onMessage(final Intent intent) throws RemoteException {
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.center.-$$Lambda$AccsMainCenter$AccsMainBinderImpl$_CPU-ojGoDLQSej_CkkRufLW28I
                {
                    AccsMainCenter.AccsMainBinderImpl.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AccsMainCenter.AccsMainBinderImpl.this.lambda$onMessage$15$AccsMainCenter$AccsMainBinderImpl(intent);
                }
            });
        }

        public /* synthetic */ void lambda$onMessage$15$AccsMainCenter$AccsMainBinderImpl(Intent intent) {
            ALog.e(AccsMainCenter.c(), "AccsMainBinderImpl onMessage called", new Object[0]);
            if (intent != null) {
                AccsMainCenter.a(AccsMainCenter.this, intent);
            }
        }
    }

    private void a(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                String className = component.getClassName();
                if (this.d.containsKey(className)) {
                    ALog.e(e, "use cached", className);
                    this.d.get(className).onStartCommand(intent, 0, 0);
                    return;
                }
                ALog.e(e, "reflect", "className", className);
                Service service = (Service) Class.forName(className).newInstance();
                this.d.put(className, service);
                service.onStartCommand(intent, 0, 0);
            } catch (Throwable th) {
                ALog.e(e, "dispatchByClassName err:", th, new Object[0]);
            }
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        ALog.e(e, "publishMainBinder", "force", Boolean.valueOf(z));
        if (!m.t()) {
            GlobalClientInfo.getInstance(this.b).setMainBinder(this.f8196a);
        }
        jzv.a(new ProcessStateListener() { // from class: com.taobao.accs.center.AccsMainCenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                AccsMainCenter.this = this;
            }

            @Override // com.taobao.aranger.intf.ProcessStateListener
            public void onProcessStart(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("107b37c3", new Object[]{this, str});
                } else if (!"com.taobao.taobao:channel".equals(str)) {
                } else {
                    ALog.e(AccsMainCenter.c(), "on channel process start", "mHasPublish", Boolean.valueOf(AccsMainCenter.a(AccsMainCenter.this)));
                    AccsMainCenter.b(AccsMainCenter.this);
                }
            }

            @Override // com.taobao.aranger.intf.ProcessStateListener
            public void onProcessStop(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("72a7dcc3", new Object[]{this, str});
                } else if (!"com.taobao.taobao:channel".equals(str)) {
                } else {
                    ALog.e(AccsMainCenter.c(), "on channel process stop", new Object[0]);
                    AccsMainCenter.a(AccsMainCenter.this, false);
                }
            }
        });
        if (!z && !UtilityImpl.isChannelProcessAlive(this.b)) {
            return;
        }
        ALog.e(e, "channel alive, publish now", new Object[0]);
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.center.-$$Lambda$AccsMainCenter$uAApIu3DpmqURqhNjr6nvHM9cGE
                {
                    AccsMainCenter.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AccsMainCenter.lambda$uAApIu3DpmqURqhNjr6nvHM9cGE(AccsMainCenter.this);
                }
            });
        }
    }

    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ALog.e(e, "publishMainBinderAsync", "mHasPublish", Boolean.valueOf(this.c));
        if (this.c) {
            return;
        }
        try {
            ((IGlobalClientInfoService) jzv.b(new ComponentName(this.b, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, this.b))).registerRemoteMainBinder(this.f8196a);
            this.c = true;
        } catch (Throwable th) {
            d.a("accs", BaseMonitor.ALARM_PUBLISH_FAIL, "", "-1", th.toString());
            ALog.e(e, "publishMainBinderAsync exception", th, new Object[0]);
        }
    }

    public void a(IGlobalClientInfoService iGlobalClientInfoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d4769d", new Object[]{this, iGlobalClientInfoService});
        } else if (this.c || iGlobalClientInfoService == null) {
        } else {
            ALog.e(e, "publishMainBinderNow", new Object[0]);
            try {
                iGlobalClientInfoService.registerRemoteMainBinder(this.f8196a);
                this.c = true;
            } catch (Throwable th) {
                d.a("accs", BaseMonitor.ALARM_PUBLISH_FAIL, "", "-1", th.toString());
                ALog.e(e, "publishMainBinderNow exception", th, new Object[0]);
            }
        }
    }
}
