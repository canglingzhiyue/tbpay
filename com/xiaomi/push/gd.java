package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.fz;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import java.util.Hashtable;

/* loaded from: classes9.dex */
public class gd {

    /* renamed from: a  reason: collision with root package name */
    private static final int f24494a = ft.PING_RTT.a();

    /* renamed from: a  reason: collision with other field name */
    private static long f400a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static Hashtable<Integer, Long> f24495a = new Hashtable<>();
    }

    public static void a() {
        if (f400a == 0 || SystemClock.elapsedRealtime() - f400a > 7200000) {
            f400a = SystemClock.elapsedRealtime();
            a(0, f24494a);
        }
    }

    public static void a(int i) {
        fu m1956a = gb.m1954a().m1956a();
        m1956a.a(ft.CHANNEL_STATS_COUNTER.a());
        m1956a.c(i);
        gb.m1954a().a(m1956a);
    }

    public static synchronized void a(int i, int i2) {
        synchronized (gd.class) {
            if (i2 >= 16777215) {
                com.xiaomi.channel.commonutils.logger.b.d("stats key should less than 16777215");
                return;
            }
            a.f24495a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void a(int i, int i2, int i3, String str, int i4) {
        fu m1956a = gb.m1954a().m1956a();
        m1956a.a((byte) i);
        m1956a.a(i2);
        m1956a.b(i3);
        m1956a.b(str);
        m1956a.c(i4);
        gb.m1954a().a(m1956a);
    }

    public static synchronized void a(int i, int i2, String str, int i3) {
        synchronized (gd.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (!a.f24495a.containsKey(Integer.valueOf(i4))) {
                com.xiaomi.channel.commonutils.logger.b.d("stats key not found");
                return;
            }
            fu m1956a = gb.m1954a().m1956a();
            m1956a.a(i2);
            m1956a.b((int) (currentTimeMillis - a.f24495a.get(Integer.valueOf(i4)).longValue()));
            m1956a.b(str);
            if (i3 >= 0) {
                m1956a.c(i3);
            }
            gb.m1954a().a(m1956a);
            a.f24495a.remove(Integer.valueOf(i2));
        }
    }

    public static void a(XMPushService xMPushService, bf.b bVar) {
        new fw(xMPushService, bVar).a();
    }

    public static void a(String str, int i, Exception exc) {
        fu m1956a = gb.m1954a().m1956a();
        if (gb.a() != null && gb.a().f392a != null) {
            m1956a.c(bg.c(gb.a().f392a) ? 1 : 0);
        }
        if (i > 0) {
            m1956a.a(ft.GSLB_REQUEST_SUCCESS.a());
            m1956a.b(str);
            m1956a.b(i);
            gb.m1954a().a(m1956a);
            return;
        }
        try {
            fz.a a2 = fz.a(exc);
            m1956a.a(a2.f24487a.a());
            m1956a.c(a2.f387a);
            m1956a.b(str);
            gb.m1954a().a(m1956a);
        } catch (NullPointerException unused) {
        }
    }

    public static void a(String str, Exception exc) {
        try {
            fz.a b = fz.b(exc);
            fu m1956a = gb.m1954a().m1956a();
            m1956a.a(b.f24487a.a());
            m1956a.c(b.f387a);
            m1956a.b(str);
            if (gb.a() != null && gb.a().f392a != null) {
                m1956a.c(bg.c(gb.a().f392a) ? 1 : 0);
            }
            gb.m1954a().a(m1956a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static byte[] m1960a() {
        fv m1957a = gb.m1954a().m1957a();
        if (m1957a != null) {
            return jm.a(m1957a);
        }
        return null;
    }

    public static void b() {
        a(0, f24494a, null, -1);
    }

    public static void b(String str, Exception exc) {
        try {
            fz.a d = fz.d(exc);
            fu m1956a = gb.m1954a().m1956a();
            m1956a.a(d.f24487a.a());
            m1956a.c(d.f387a);
            m1956a.b(str);
            if (gb.a() != null && gb.a().f392a != null) {
                m1956a.c(bg.c(gb.a().f392a) ? 1 : 0);
            }
            gb.m1954a().a(m1956a);
        } catch (NullPointerException unused) {
        }
    }
}
