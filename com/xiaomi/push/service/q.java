package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;
import tb.cew;

/* loaded from: classes9.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static long f24716a;
    private static long b;
    private static long c;

    /* renamed from: a  reason: collision with other field name */
    private final a f1015a;

    /* renamed from: a  reason: collision with other field name */
    private final c f1016a;

    /* loaded from: classes9.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f24717a;

        a(c cVar) {
            this.f24717a = cVar;
        }

        protected void finalize() {
            try {
                synchronized (this.f24717a) {
                    this.f24717a.c = true;
                    this.f24717a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        protected int f24718a;

        public b(int i) {
            this.f24718a = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static final class c extends Thread {

        /* renamed from: b  reason: collision with other field name */
        private boolean f1019b;
        private boolean c;

        /* renamed from: a  reason: collision with root package name */
        private volatile long f24719a = 0;

        /* renamed from: a  reason: collision with other field name */
        private volatile boolean f1018a = false;
        private long b = 50;

        /* renamed from: a  reason: collision with other field name */
        private a f1017a = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes9.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private int f24720a;

            /* renamed from: a  reason: collision with other field name */
            private d[] f1020a;
            private int b;
            private int c;

            private a() {
                this.f24720a = 256;
                this.f1020a = new d[this.f24720a];
                this.b = 0;
                this.c = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int a(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.f1020a;
                    if (i < dVarArr.length) {
                        if (dVarArr[i] == dVar) {
                            return i;
                        }
                        i++;
                    } else {
                        return -1;
                    }
                }
            }

            private void c() {
                int i = this.b - 1;
                int i2 = (i - 1) / 2;
                while (this.f1020a[i].f1021a < this.f1020a[i2].f1021a) {
                    d[] dVarArr = this.f1020a;
                    d dVar = dVarArr[i];
                    dVarArr[i] = dVarArr[i2];
                    dVarArr[i2] = dVar;
                    int i3 = i2;
                    i2 = (i2 - 1) / 2;
                    i = i3;
                }
            }

            private void c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.b;
                    if (i2 >= i3 || i3 <= 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 < i3 && this.f1020a[i4].f1021a < this.f1020a[i2].f1021a) {
                        i2 = i4;
                    }
                    if (this.f1020a[i].f1021a < this.f1020a[i2].f1021a) {
                        return;
                    }
                    d[] dVarArr = this.f1020a;
                    d dVar = dVarArr[i];
                    dVarArr[i] = dVarArr[i2];
                    dVarArr[i2] = dVar;
                    int i5 = i2;
                    i2 = (i2 * 2) + 1;
                    i = i5;
                }
            }

            public d a() {
                return this.f1020a[0];
            }

            /* renamed from: a  reason: collision with other method in class */
            public void m2354a() {
                this.f1020a = new d[this.f24720a];
                this.b = 0;
            }

            public void a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1020a[i2].f24721a == i) {
                        this.f1020a[i2].a();
                    }
                }
                b();
            }

            public void a(int i, b bVar) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1020a[i2].f1022a == bVar) {
                        this.f1020a[i2].a();
                    }
                }
                b();
            }

            /* renamed from: a  reason: collision with other method in class */
            public void m2355a(d dVar) {
                d[] dVarArr = this.f1020a;
                int length = dVarArr.length;
                int i = this.b;
                if (length == i) {
                    d[] dVarArr2 = new d[i << 1];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f1020a = dVarArr2;
                }
                d[] dVarArr3 = this.f1020a;
                int i2 = this.b;
                this.b = i2 + 1;
                dVarArr3[i2] = dVar;
                c();
            }

            /* renamed from: a  reason: collision with other method in class */
            public boolean m2356a() {
                return this.b == 0;
            }

            /* renamed from: a  reason: collision with other method in class */
            public boolean m2357a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1020a[i2].f24721a == i) {
                        return true;
                    }
                }
                return false;
            }

            public void b() {
                int i = 0;
                while (i < this.b) {
                    if (this.f1020a[i].f1024a) {
                        this.c++;
                        b(i);
                        i--;
                    }
                    i++;
                }
            }

            public void b(int i) {
                int i2;
                if (i < 0 || i >= (i2 = this.b)) {
                    return;
                }
                d[] dVarArr = this.f1020a;
                int i3 = i2 - 1;
                this.b = i3;
                dVarArr[i] = dVarArr[i3];
                dVarArr[this.b] = null;
                c(i);
            }
        }

        c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(d dVar) {
            this.f1017a.m2355a(dVar);
            notify();
        }

        public synchronized void a() {
            this.f1019b = true;
            this.f1017a.m2354a();
            notify();
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m2353a() {
            return this.f1018a && SystemClock.uptimeMillis() - this.f24719a > cew.a.CONFIG_TRACK_1022_INTERVAL_TIME;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
            r10.f24719a = android.os.SystemClock.uptimeMillis();
            r10.f1018a = true;
            r2.f1022a.run();
            r10.f1018a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
            r10.f1019b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ab, code lost:
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 184
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.q.c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f24721a;

        /* renamed from: a  reason: collision with other field name */
        long f1021a;

        /* renamed from: a  reason: collision with other field name */
        b f1022a;

        /* renamed from: a  reason: collision with other field name */
        final Object f1023a = new Object();

        /* renamed from: a  reason: collision with other field name */
        boolean f1024a;
        private long b;

        d() {
        }

        void a(long j) {
            synchronized (this.f1023a) {
                this.b = j;
            }
        }

        public boolean a() {
            boolean z;
            synchronized (this.f1023a) {
                z = !this.f1024a && this.f1021a > 0;
                this.f1024a = true;
            }
            return z;
        }
    }

    static {
        long j = 0;
        if (SystemClock.elapsedRealtime() > 0) {
            j = SystemClock.elapsedRealtime();
        }
        f24716a = j;
        b = j;
    }

    public q() {
        this(false);
    }

    public q(String str) {
        this(str, false);
    }

    public q(String str, boolean z) {
        if (str != null) {
            this.f1016a = new c(str, z);
            this.f1015a = new a(this.f1016a);
            return;
        }
        throw new NullPointerException("name == null");
    }

    public q(boolean z) {
        this("Timer-" + b(), z);
    }

    static synchronized long a() {
        long j;
        synchronized (q.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > b) {
                f24716a += elapsedRealtime - b;
            }
            b = elapsedRealtime;
            j = f24716a;
        }
        return j;
    }

    private static synchronized long b() {
        long j;
        synchronized (q.class) {
            j = c;
            c = 1 + j;
        }
        return j;
    }

    private void b(b bVar, long j) {
        synchronized (this.f1016a) {
            if (this.f1016a.f1019b) {
                throw new IllegalStateException("Timer was canceled");
            }
            long a2 = j + a();
            if (a2 < 0) {
                throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a2);
            }
            d dVar = new d();
            dVar.f24721a = bVar.f24718a;
            dVar.f1022a = bVar;
            dVar.f1021a = a2;
            this.f1016a.a(dVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2348a() {
        com.xiaomi.channel.commonutils.logger.b.m1616a("quit. finalizer:" + this.f1015a);
        this.f1016a.a();
    }

    public void a(int i) {
        synchronized (this.f1016a) {
            this.f1016a.f1017a.a(i);
        }
    }

    public void a(int i, b bVar) {
        synchronized (this.f1016a) {
            this.f1016a.f1017a.a(i, bVar);
        }
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.b.a() > 0 || Thread.currentThread() == this.f1016a) {
            bVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public void a(b bVar, long j) {
        if (j >= 0) {
            b(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2349a() {
        return this.f1016a.m2353a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2350a(int i) {
        boolean m2357a;
        synchronized (this.f1016a) {
            m2357a = this.f1016a.f1017a.m2357a(i);
        }
        return m2357a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m2351b() {
        synchronized (this.f1016a) {
            this.f1016a.f1017a.m2354a();
        }
    }
}
