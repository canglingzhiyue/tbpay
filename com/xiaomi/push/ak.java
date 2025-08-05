package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class ak {

    /* renamed from: a  reason: collision with root package name */
    private int f24350a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f95a;

    /* renamed from: a  reason: collision with other field name */
    private a f96a;

    /* renamed from: a  reason: collision with other field name */
    private volatile b f97a;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f98a;
    private final boolean b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with other field name */
        private final LinkedBlockingQueue<b> f99a;

        public a() {
            super("PackageProcessor");
            this.f99a = new LinkedBlockingQueue<>();
        }

        private void a(int i, b bVar) {
            try {
                ak.this.f95a.sendMessage(ak.this.f95a.obtainMessage(i, bVar));
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }

        public void a(b bVar) {
            try {
                this.f99a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j = ak.this.f24350a > 0 ? ak.this.f24350a : Long.MAX_VALUE;
            while (!ak.this.f98a) {
                try {
                    b poll = this.f99a.poll(j, TimeUnit.SECONDS);
                    ak.this.f97a = poll;
                    if (poll != null) {
                        a(0, poll);
                        poll.mo1827b();
                        a(1, poll);
                    } else if (ak.this.f24350a > 0) {
                        ak.this.a();
                    }
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class b {
        public void a() {
        }

        /* renamed from: b */
        public abstract void mo1827b();

        /* renamed from: c */
        public void mo1828c() {
        }
    }

    public ak() {
        this(false);
    }

    public ak(boolean z) {
        this(z, 0);
    }

    public ak(boolean z, int i) {
        this.f95a = null;
        this.f98a = false;
        this.f24350a = 0;
        this.f95a = new al(this, Looper.getMainLooper());
        this.b = z;
        this.f24350a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        this.f96a = null;
        this.f98a = true;
    }

    public synchronized void a(b bVar) {
        if (this.f96a == null) {
            this.f96a = new a();
            this.f96a.setDaemon(this.b);
            this.f98a = false;
            this.f96a.start();
        }
        this.f96a.a(bVar);
    }

    public void a(b bVar, long j) {
        this.f95a.postDelayed(new am(this, bVar), j);
    }
}
