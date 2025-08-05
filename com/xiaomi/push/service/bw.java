package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.push.ak;
import com.xiaomi.push.el;
import com.xiaomi.push.em;
import com.xiaomi.push.ht;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class bw {

    /* renamed from: a  reason: collision with root package name */
    private static bw f24682a = new bw();

    /* renamed from: a  reason: collision with other field name */
    private static String f974a;

    /* renamed from: a  reason: collision with other field name */
    private ak.b f975a;

    /* renamed from: a  reason: collision with other field name */
    private el.a f976a;

    /* renamed from: a  reason: collision with other field name */
    private List<a> f977a = new ArrayList();

    /* loaded from: classes9.dex */
    public static abstract class a {
        public void a(el.a aVar) {
        }

        public void a(em.b bVar) {
        }
    }

    private bw() {
    }

    public static bw a() {
        return f24682a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized String m2320a() {
        String str;
        synchronized (bw.class) {
            if (f974a == null) {
                SharedPreferences sharedPreferences = com.xiaomi.push.r.m2212a().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", null);
                f974a = string;
                if (string == null) {
                    String a2 = com.xiaomi.push.i.a(com.xiaomi.push.r.m2212a(), false);
                    f974a = a2;
                    if (a2 != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f974a).commit();
                    }
                }
            }
            str = f974a;
        }
        return str;
    }

    private void b() {
        if (this.f976a == null) {
            d();
        }
    }

    private void c() {
        if (this.f975a != null) {
            return;
        }
        this.f975a = new bx(this);
        ht.a(this.f975a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.r.m2212a()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            com.xiaomi.push.b r0 = com.xiaomi.push.b.a(r2)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            com.xiaomi.push.el$a r0 = com.xiaomi.push.el.a.b(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            r4.f976a = r0     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            r2.close()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            com.xiaomi.push.x.a(r2)
            goto L47
        L21:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L53
        L25:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L2c
        L29:
            r1 = move-exception
            goto L53
        L2b:
            r1 = move-exception
        L2c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "load config failure: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L29
            r2.append(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L29
            com.xiaomi.channel.commonutils.logger.b.m1616a(r1)     // Catch: java.lang.Throwable -> L29
            com.xiaomi.push.x.a(r0)
        L47:
            com.xiaomi.push.el$a r0 = r4.f976a
            if (r0 != 0) goto L52
            com.xiaomi.push.el$a r0 = new com.xiaomi.push.el$a
            r0.<init>()
            r4.f976a = r0
        L52:
            return
        L53:
            com.xiaomi.push.x.a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bw.d():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.f976a == null) {
                return;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(com.xiaomi.push.r.m2212a().openFileOutput("XMCloudCfg", 0));
            com.xiaomi.push.c a2 = com.xiaomi.push.c.a(bufferedOutputStream);
            this.f976a.a(a2);
            a2.m1753a();
            bufferedOutputStream.close();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("save config failure: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public int m2323a() {
        b();
        el.a aVar = this.f976a;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public el.a m2324a() {
        b();
        return this.f976a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m2325a() {
        this.f977a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(em.b bVar) {
        a[] aVarArr;
        if (bVar.m1865d() && bVar.d() > m2323a()) {
            c();
        }
        synchronized (this) {
            aVarArr = (a[]) this.f977a.toArray(new a[this.f977a.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.a(bVar);
        }
    }

    public synchronized void a(a aVar) {
        this.f977a.add(aVar);
    }
}
