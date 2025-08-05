package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.ab;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.x;
import tb.cwp;

/* loaded from: classes4.dex */
public class ah implements ServiceConnection {
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final cwp f7265a;
    public a b;
    public Handler c = null;
    public boolean d = false;

    /* loaded from: classes4.dex */
    public interface a {
    }

    public ah(cwp cwpVar) {
        this.f7265a = cwpVar;
    }

    public void a() {
        String str;
        try {
            r0 = "trying to unbind service from " + this;
            k.e.a().unbindService(this);
        } catch (Exception e2) {
            str = "on unBind service exception:" + e2.getMessage();
        }
    }

    public final void a(int i) {
        a aVar = this.b;
        if (aVar != null) {
            ad adVar = (ad) aVar;
            adVar.f7262a.f7263a.set(i == HonorPushErrorEnum.ERROR_SERVICE_TIME_OUT.statusCode ? 2 : 1);
            adVar.f7262a.a(i);
            adVar.f7262a.b = null;
        }
    }

    public final void b() {
        synchronized (e) {
            Handler handler = this.c;
            if (handler != null) {
                handler.removeMessages(1001);
                this.c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        if (this.d) {
            this.d = false;
            return;
        }
        a();
        b();
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        ad adVar = (ad) aVar;
        adVar.f7262a.f7263a.set(1);
        adVar.f7262a.a(8002005);
        adVar.f7262a.b = null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b();
        a aVar = this.b;
        if (aVar != null) {
            ad adVar = (ad) aVar;
            adVar.f7262a.b = IPushInvoke.Stub.asInterface(iBinder);
            if (adVar.f7262a.b == null) {
                adVar.f7262a.d.a();
                adVar.f7262a.f7263a.set(1);
                adVar.f7262a.a(8002001);
                return;
            }
            adVar.f7262a.f7263a.set(3);
            ab.a aVar2 = adVar.f7262a.c;
            if (aVar2 == null) {
                return;
            }
            x.a aVar3 = (x.a) aVar2;
            if (Looper.myLooper() == x.this.f7292a.getLooper()) {
                aVar3.b();
            } else {
                x.this.f7292a.post(new t(aVar3));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.b;
        if (aVar != null) {
            ad adVar = (ad) aVar;
            adVar.f7262a.f7263a.set(1);
            adVar.f7262a.a(8002002);
            adVar.f7262a.b = null;
        }
    }
}
