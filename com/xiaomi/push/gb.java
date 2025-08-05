package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.bi;
import com.xiaomi.push.ke;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public class gb {

    /* renamed from: a  reason: collision with root package name */
    private int f24491a;

    /* renamed from: a  reason: collision with other field name */
    private long f395a;

    /* renamed from: a  reason: collision with other field name */
    private ga f397a;

    /* renamed from: a  reason: collision with other field name */
    private String f398a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f399a = false;

    /* renamed from: a  reason: collision with other field name */
    private bi f396a = bi.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final gb f24492a = new gb();
    }

    private fu a(bi.a aVar) {
        if (aVar.f137a == 0) {
            if (!(aVar.f138a instanceof fu)) {
                return null;
            }
            return (fu) aVar.f138a;
        }
        fu m1956a = m1956a();
        m1956a.a(ft.CHANNEL_STATS_COUNTER.a());
        m1956a.c(aVar.f137a);
        m1956a.c(aVar.f139a);
        return m1956a;
    }

    private fv a(int i) {
        ArrayList arrayList = new ArrayList();
        fv fvVar = new fv(this.f398a, arrayList);
        if (!bg.e(this.f397a.f392a)) {
            fvVar.a(i.i(this.f397a.f392a));
        }
        kg kgVar = new kg(i);
        jy a2 = new ke.a().a(kgVar);
        try {
            fvVar.b(a2);
        } catch (js unused) {
        }
        LinkedList<bi.a> m1739a = this.f396a.m1739a();
        while (m1739a.size() > 0) {
            try {
                fu a3 = a(m1739a.getLast());
                if (a3 != null) {
                    a3.b(a2);
                }
                if (kgVar.a_() > i) {
                    break;
                }
                if (a3 != null) {
                    arrayList.add(a3);
                }
                m1739a.removeLast();
            } catch (js | NoSuchElementException unused2) {
            }
        }
        return fvVar;
    }

    public static ga a() {
        ga gaVar;
        synchronized (a.f24492a) {
            gaVar = a.f24492a.f397a;
        }
        return gaVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static gb m1954a() {
        return a.f24492a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m1955a() {
        if (!this.f399a || System.currentTimeMillis() - this.f395a <= this.f24491a) {
            return;
        }
        this.f399a = false;
        this.f395a = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public synchronized fu m1956a() {
        fu fuVar;
        fuVar = new fu();
        fuVar.a(bg.m1732a((Context) this.f397a.f392a));
        fuVar.f367a = (byte) 0;
        fuVar.f371b = 1;
        fuVar.d((int) (System.currentTimeMillis() / 1000));
        return fuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public synchronized fv m1957a() {
        fv fvVar;
        fvVar = null;
        if (b()) {
            int i = 750;
            if (!bg.e(this.f397a.f392a)) {
                i = 375;
            }
            fvVar = a(i);
        }
        return fvVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1958a(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f24491a == i2 && this.f399a) {
                return;
            }
            this.f399a = true;
            this.f395a = System.currentTimeMillis();
            this.f24491a = i2;
            com.xiaomi.channel.commonutils.logger.b.c("enable dot duration = " + i2 + " start = " + this.f395a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(fu fuVar) {
        this.f396a.a(fuVar);
    }

    public synchronized void a(XMPushService xMPushService) {
        this.f397a = new ga(xMPushService);
        this.f398a = "";
        com.xiaomi.push.service.bw.a().a(new gc(this));
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1959a() {
        return this.f399a;
    }

    boolean b() {
        m1955a();
        return this.f399a && this.f396a.m1738a() > 0;
    }
}
