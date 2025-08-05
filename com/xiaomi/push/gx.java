package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes9.dex */
public abstract class gx extends gq {

    /* renamed from: a  reason: collision with root package name */
    protected Exception f24512a;

    /* renamed from: a  reason: collision with other field name */
    protected Socket f454a;
    protected XMPushService b;
    private int c;

    /* renamed from: c  reason: collision with other field name */
    String f455c;
    private String d;
    protected volatile long e;
    protected volatile long f;
    protected volatile long g;
    private long h;

    public gx(XMPushService xMPushService, gr grVar) {
        super(xMPushService, grVar);
        this.f24512a = null;
        this.f455c = null;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.b = xMPushService;
    }

    private void a(gr grVar) {
        a(grVar.c(), grVar.mo1992a());
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gx.a(java.lang.String, int):void");
    }

    @Override // com.xiaomi.push.gq
    /* renamed from: a */
    public Context mo1998a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.xiaomi.push.gq
    public co a(String str) {
        co a2 = cs.a().a(str, false);
        if (!a2.b()) {
            ht.a(new ha(this, str));
        }
        return a2;
    }

    @Override // com.xiaomi.push.gq
    /* renamed from: a  reason: collision with other method in class */
    public String mo1998a() {
        return this.d;
    }

    @Override // com.xiaomi.push.gq
    /* renamed from: a */
    public Socket mo1998a() {
        return new Socket();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.push.gq
    /* renamed from: a  reason: collision with other method in class */
    public synchronized void mo1998a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(int i, Exception exc) {
        if (b() == 2) {
            return;
        }
        a(2, i, exc);
        this.f440a = "";
        try {
            this.f454a.close();
        } catch (Throwable unused) {
        }
        this.e = 0L;
        this.f = 0L;
    }

    protected void a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.g >= 300000) {
            this.c = 0;
        } else if (!bg.b(this.b)) {
        } else {
            this.c++;
            if (this.c < 2) {
                return;
            }
            String mo1998a = mo1998a();
            com.xiaomi.channel.commonutils.logger.b.m1616a("max short conn time reached, sink down current host:" + mo1998a);
            a(mo1998a, 0L, exc);
            this.c = 0;
        }
    }

    protected void a(String str, long j, Exception exc) {
        co a2 = cs.a().a(gr.a(), false);
        if (a2 != null) {
            a2.b(str, j, 0L, exc);
            cs.a().m1798c();
        }
    }

    /* renamed from: a */
    protected abstract void mo1978a(boolean z);

    @Override // com.xiaomi.push.gq
    public void a(gf[] gfVarArr) {
        throw new hb("Don't support send Blob");
    }

    @Override // com.xiaomi.push.gq
    public void b(int i, Exception exc) {
        a(i, exc);
        if ((exc != null || i == 18) && this.g != 0) {
            a(exc);
        }
    }

    @Override // com.xiaomi.push.gq
    public void b(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        mo1978a(z);
        com.xiaomi.push.service.p.a(this.b).m2346c();
        if (!z) {
            this.b.a(new gy(this, 13, elapsedRealtime, currentTimeMillis), 10000L);
        }
    }

    @Override // com.xiaomi.push.gq
    public String c() {
        return this.f440a;
    }

    public void c(int i, Exception exc) {
        this.b.a(new gz(this, 2, i, exc));
    }

    public synchronized void e() {
        try {
            if (!c() && !b()) {
                a(0, 0, (Exception) null);
                a(this.f437a);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new hb(e);
        }
    }

    public void f() {
        this.e = SystemClock.elapsedRealtime();
    }

    public void g() {
        this.f = SystemClock.elapsedRealtime();
    }
}
