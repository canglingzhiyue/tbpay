package com.xiaomi.push;

import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public abstract class gq {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f24508a = new AtomicInteger(0);

    /* renamed from: a  reason: collision with other field name */
    public static boolean f434a;

    /* renamed from: a  reason: collision with other field name */
    protected gr f437a;

    /* renamed from: a  reason: collision with other field name */
    protected XMPushService f439a;

    /* renamed from: a  reason: collision with other field name */
    protected int f435a = 0;

    /* renamed from: a  reason: collision with other field name */
    protected long f436a = -1;

    /* renamed from: b  reason: collision with other field name */
    protected volatile long f444b = 0;

    /* renamed from: c  reason: collision with other field name */
    protected volatile long f447c = 0;

    /* renamed from: a  reason: collision with other field name */
    private LinkedList<Pair<Integer, Long>> f442a = new LinkedList<>();

    /* renamed from: a  reason: collision with other field name */
    private final Collection<gt> f441a = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with other field name */
    protected final Map<gv, a> f443a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with other field name */
    protected final Map<gv, a> f446b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with other field name */
    protected hc f438a = null;

    /* renamed from: a  reason: collision with other field name */
    protected String f440a = "";

    /* renamed from: b  reason: collision with other field name */
    protected String f445b = "";
    private int c = 2;
    protected final int b = f24508a.getAndIncrement();
    private long e = 0;
    protected long d = 0;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private gv f24509a;

        /* renamed from: a  reason: collision with other field name */
        private hd f448a;

        public a(gv gvVar, hd hdVar) {
            this.f24509a = gvVar;
            this.f448a = hdVar;
        }

        public void a(gf gfVar) {
            this.f24509a.a(gfVar);
        }

        public void a(hh hhVar) {
            hd hdVar = this.f448a;
            if (hdVar == null || hdVar.mo1982a(hhVar)) {
                this.f24509a.mo1982a(hhVar);
            }
        }
    }

    static {
        f434a = false;
        try {
            f434a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        gw.m1995a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gq(XMPushService xMPushService, gr grVar) {
        this.f437a = grVar;
        this.f439a = xMPushService;
        m1989b();
    }

    private String a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : "unknown";
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m1983a(int i) {
        synchronized (this.f442a) {
            if (i == 1) {
                this.f442a.clear();
            } else {
                this.f442a.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f442a.size() > 6) {
                    this.f442a.remove(0);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo1998a() {
        return this.f435a;
    }

    public long a() {
        return this.f447c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public gr m1984a() {
        return this.f437a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1985a() {
        return this.f437a.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public Map<gv, a> m1986a() {
        return this.f443a;
    }

    public void a(int i, int i2, Exception exc) {
        int i3 = this.c;
        if (i != i3) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("update the connection status. %1$s -> %2$s : %3$s ", a(i3), a(i), com.xiaomi.push.service.bj.a(i2)));
        }
        if (bg.b(this.f439a)) {
            m1983a(i);
        }
        if (i == 1) {
            this.f439a.a(10);
            if (this.c != 0) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("try set connected while not connecting.");
            }
            this.c = i;
            for (gt gtVar : this.f441a) {
                gtVar.b(this);
            }
        } else if (i == 0) {
            if (this.c != 2) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("try set connecting while not disconnected.");
            }
            this.c = i;
            for (gt gtVar2 : this.f441a) {
                gtVar2.a(this);
            }
        } else if (i == 2) {
            this.f439a.a(10);
            int i4 = this.c;
            if (i4 == 0) {
                for (gt gtVar3 : this.f441a) {
                    gtVar3.a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                for (gt gtVar4 : this.f441a) {
                    gtVar4.a(this, i2, exc);
                }
            }
            this.c = i;
        }
    }

    public void a(gt gtVar) {
        if (gtVar != null && !this.f441a.contains(gtVar)) {
            this.f441a.add(gtVar);
        }
    }

    public void a(gv gvVar) {
        this.f443a.remove(gvVar);
    }

    public void a(gv gvVar, hd hdVar) {
        if (gvVar != null) {
            this.f443a.put(gvVar, new a(gvVar, hdVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    public abstract void a(hh hhVar);

    public abstract void a(bf.b bVar);

    public synchronized void a(String str) {
        if (this.c != 0) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("ignore setChallenge because connection was disconnected");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("setChallenge hash = " + bl.a(str).substring(0, 8));
        this.f440a = str;
        a(1, 0, null);
    }

    public abstract void a(String str, String str2);

    public abstract void a(gf[] gfVarArr);

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1987a() {
        return false;
    }

    public synchronized boolean a(long j) {
        return this.e >= j;
    }

    public int b() {
        return this.c;
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m1988b() {
        return this.f437a.b();
    }

    /* renamed from: b  reason: collision with other method in class */
    protected void m1989b() {
        String str;
        if (!this.f437a.m1993a() || this.f438a != null) {
            return;
        }
        Class<?> cls = null;
        try {
            str = System.getProperty("smack.debuggerClass");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            try {
                cls = Class.forName(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (cls == null) {
            this.f438a = new go(this);
            return;
        }
        try {
            this.f438a = (hc) cls.getConstructor(gq.class, Writer.class, Reader.class).newInstance(this);
        } catch (Exception e2) {
            throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
        }
    }

    public abstract void b(int i, Exception exc);

    public abstract void b(gf gfVar);

    public void b(gt gtVar) {
        this.f441a.remove(gtVar);
    }

    public void b(gv gvVar) {
        this.f446b.remove(gvVar);
    }

    public void b(gv gvVar, hd hdVar) {
        if (gvVar != null) {
            this.f446b.put(gvVar, new a(gvVar, hdVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    public abstract void b(boolean z);

    /* renamed from: b  reason: collision with other method in class */
    public boolean m1990b() {
        return this.c == 0;
    }

    public synchronized void c() {
        this.e = SystemClock.elapsedRealtime();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m1991c() {
        return this.c == 1;
    }

    public void d() {
        synchronized (this.f442a) {
            this.f442a.clear();
        }
    }
}
