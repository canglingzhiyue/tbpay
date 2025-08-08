package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
public class ga implements gt {

    /* renamed from: a  reason: collision with root package name */
    private int f24490a;

    /* renamed from: a  reason: collision with other field name */
    gq f391a;

    /* renamed from: a  reason: collision with other field name */
    XMPushService f392a;

    /* renamed from: a  reason: collision with other field name */
    private Exception f393a;
    private long e;
    private long f;

    /* renamed from: a  reason: collision with other field name */
    private long f390a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;

    /* renamed from: a  reason: collision with other field name */
    private String f394a = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    public ga(XMPushService xMPushService) {
        this.e = 0L;
        this.f = 0L;
        this.f392a = xMPushService;
        b();
        int myUid = Process.myUid();
        try {
            this.f = TrafficStats.getUidRxBytes(myUid);
            this.e = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Failed to obtain traffic data during initialization: " + e);
            this.f = -1L;
            this.e = -1L;
        }
    }

    private void b() {
        this.b = 0L;
        this.d = 0L;
        this.f390a = 0L;
        this.c = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bg.b(this.f392a)) {
            this.f390a = elapsedRealtime;
        }
        if (this.f392a.m2244c()) {
            this.c = elapsedRealtime;
        }
    }

    private synchronized void c() {
        com.xiaomi.channel.commonutils.logger.b.c("stat connpt = " + this.f394a + " netDuration = " + this.b + " ChannelDuration = " + this.d + " channelConnectedTime = " + this.c);
        fu fuVar = new fu();
        fuVar.f367a = (byte) 0;
        fuVar.a(ft.CHANNEL_ONLINE_RATE.a());
        fuVar.a(this.f394a);
        fuVar.d((int) (System.currentTimeMillis() / 1000));
        fuVar.b((int) (this.b / 1000));
        fuVar.c((int) (this.d / 1000));
        gb.m1954a().a(fuVar);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Exception a() {
        return this.f393a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1953a() {
        if (this.f392a == null) {
            return;
        }
        String m1732a = bg.m1732a((Context) this.f392a);
        boolean c = bg.c(this.f392a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f390a > 0) {
            this.b += elapsedRealtime - this.f390a;
            this.f390a = 0L;
        }
        if (this.c != 0) {
            this.d += elapsedRealtime - this.c;
            this.c = 0L;
        }
        if (c) {
            if ((!StringUtils.equals(this.f394a, m1732a) && this.b > 30000) || this.b > 5400000) {
                c();
            }
            this.f394a = m1732a;
            if (this.f390a == 0) {
                this.f390a = elapsedRealtime;
            }
            if (this.f392a.m2244c()) {
                this.c = elapsedRealtime;
            }
        }
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar) {
        this.f24490a = 0;
        this.f393a = null;
        this.f391a = gqVar;
        this.f394a = bg.m1732a((Context) this.f392a);
        gd.a(0, ft.CONN_SUCCESS.a());
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, int i, Exception exc) {
        long j;
        if (this.f24490a == 0 && this.f393a == null) {
            this.f24490a = i;
            this.f393a = exc;
            gd.b(gqVar.m1985a(), exc);
        }
        if (i == 22 && this.c != 0) {
            long a2 = gqVar.a() - this.c;
            if (a2 < 0) {
                a2 = 0;
            }
            this.d += a2 + (gw.b() / 2);
            this.c = 0L;
        }
        m1953a();
        int myUid = Process.myUid();
        long j2 = -1;
        try {
            j2 = TrafficStats.getUidRxBytes(myUid);
            j = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Failed to obtain traffic data: " + e);
            j = -1L;
        }
        com.xiaomi.channel.commonutils.logger.b.c("Stats rx=" + (j2 - this.f) + ", tx=" + (j - this.e));
        this.f = j2;
        this.e = j;
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, Exception exc) {
        gd.a(0, ft.CHANNEL_CON_FAIL.a(), 1, gqVar.m1985a(), bg.c(this.f392a) ? 1 : 0);
        m1953a();
    }

    @Override // com.xiaomi.push.gt
    public void b(gq gqVar) {
        m1953a();
        this.c = SystemClock.elapsedRealtime();
        gd.a(0, ft.CONN_SUCCESS.a(), gqVar.m1985a(), gqVar.mo1998a());
    }
}
