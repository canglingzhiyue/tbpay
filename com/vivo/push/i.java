package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.vivo.push.util.ag;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class i implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f24206a = new Object();
    private static Map<String, i> b = new HashMap();
    private boolean c;
    private String d;
    private Context e;
    private volatile IPCInvoke g;
    private String i;
    private Handler j;
    private Object h = new Object();
    private AtomicInteger f = new AtomicInteger(1);

    private i(Context context, String str) {
        this.d = null;
        this.j = null;
        this.e = context;
        this.i = str;
        boolean z = true;
        this.j = new Handler(Looper.getMainLooper(), new j(this));
        this.d = com.vivo.push.util.aa.a(context);
        if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.i)) {
            this.c = ag.a(context, this.d) < 1260 ? false : z;
            b();
            return;
        }
        Context context2 = this.e;
        com.vivo.push.util.u.c(context2, "init error : push pkgname is " + this.d + " ; action is " + this.i);
        this.c = false;
    }

    public static i a(Context context, String str) {
        i iVar = b.get(str);
        if (iVar == null) {
            synchronized (f24206a) {
                iVar = b.get(str);
                if (iVar == null) {
                    iVar = new i(context, str);
                    b.put(str, iVar);
                }
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.f.set(i);
    }

    private void b() {
        int i = this.f.get();
        com.vivo.push.util.u.d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i)));
        if (i == 4 || i == 2 || i == 3 || i == 5 || !this.c) {
            return;
        }
        a(2);
        if (c()) {
            d();
            return;
        }
        a(1);
        com.vivo.push.util.u.a("AidlManager", "bind core service fail");
    }

    private boolean c() {
        Intent intent = new Intent(this.i);
        intent.setPackage(this.d);
        try {
            return this.e.bindService(intent, this, 1);
        } catch (Exception e) {
            com.vivo.push.util.u.a("AidlManager", "bind core error", e);
            return false;
        }
    }

    private void d() {
        this.j.removeMessages(1);
        this.j.sendEmptyMessageDelayed(1, 3000L);
    }

    private void e() {
        this.j.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            this.e.unbindService(this);
        } catch (Exception e) {
            com.vivo.push.util.u.a("AidlManager", "On unBindServiceException:" + e.getMessage());
        }
    }

    public final boolean a() {
        this.d = com.vivo.push.util.aa.a(this.e);
        boolean z = false;
        if (TextUtils.isEmpty(this.d)) {
            com.vivo.push.util.u.c(this.e, "push pkgname is null");
            return false;
        }
        if (ag.a(this.e, this.d) >= 1260) {
            z = true;
        }
        this.c = z;
        return this.c;
    }

    public final boolean a(Bundle bundle) {
        b();
        if (this.f.get() == 2) {
            synchronized (this.h) {
                try {
                    this.h.wait(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            int i = this.f.get();
            if (i != 4) {
                com.vivo.push.util.u.d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i)));
                return false;
            }
            this.j.removeMessages(2);
            this.j.sendEmptyMessageDelayed(2, 30000L);
            this.g.asyncCall(bundle, null);
            return true;
        } catch (Exception e2) {
            com.vivo.push.util.u.a("AidlManager", "invoke error ", e2);
            int i2 = this.f.get();
            com.vivo.push.util.u.d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i2)));
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                e();
            } else if (i2 != 3) {
                if (i2 != 4) {
                    return false;
                }
                a(1);
                f();
                return false;
            }
            a(1);
            return false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.vivo.push.util.u.b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e();
        this.g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.g == null) {
            com.vivo.push.util.u.d("AidlManager", "onServiceConnected error : aidl must not be null.");
            f();
            this.f.set(1);
            return;
        }
        if (this.f.get() == 2) {
            a(4);
        } else if (this.f.get() != 4) {
            f();
        }
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.g = null;
        a(1);
    }
}
