package com.xiaomi.push;

import android.os.IBinder;
import com.xiaomi.push.ao;

/* loaded from: classes9.dex */
class aq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IBinder f24356a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ao.a f107a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(ao.a aVar, IBinder iBinder) {
        this.f107a = aVar;
        this.f24356a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        try {
            ao.this.f105a = ao.b.a(this.f24356a);
            ao.this.f106b = ao.b.m1705a(this.f24356a);
            ao.this.b();
            ao.this.f101a = 2;
            obj5 = ao.this.f104a;
            synchronized (obj5) {
                try {
                    obj6 = ao.this.f104a;
                    obj6.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ao.this.b();
            ao.this.f101a = 2;
            obj3 = ao.this.f104a;
            synchronized (obj3) {
                try {
                    obj4 = ao.this.f104a;
                    obj4.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            ao.this.b();
            ao.this.f101a = 2;
            obj = ao.this.f104a;
            synchronized (obj) {
                try {
                    obj2 = ao.this.f104a;
                    obj2.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}
