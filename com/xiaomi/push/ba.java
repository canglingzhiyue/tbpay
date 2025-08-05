package com.xiaomi.push;

import android.content.Context;
import android.os.IBinder;
import com.xiaomi.push.ay;

/* loaded from: classes9.dex */
class ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IBinder f24367a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ay.b f131a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba(ay.b bVar, IBinder iBinder) {
        this.f131a = bVar;
        this.f24367a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Context context;
        String b;
        Object obj5;
        Object obj6;
        try {
            context = ay.this.f124a;
            String packageName = context.getPackageName();
            b = ay.this.b();
            ay.a aVar = new ay.a();
            aVar.b = ay.c.a(this.f24367a, packageName, b, "OUID");
            ay.this.f126a = aVar;
            ay.this.m1713b();
            ay.this.f123a = 2;
            obj5 = ay.this.f127a;
            synchronized (obj5) {
                try {
                    obj6 = ay.this.f127a;
                    obj6.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ay.this.m1713b();
            ay.this.f123a = 2;
            obj3 = ay.this.f127a;
            synchronized (obj3) {
                try {
                    obj4 = ay.this.f127a;
                    obj4.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            ay.this.m1713b();
            ay.this.f123a = 2;
            obj = ay.this.f127a;
            synchronized (obj) {
                try {
                    obj2 = ay.this.f127a;
                    obj2.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}
