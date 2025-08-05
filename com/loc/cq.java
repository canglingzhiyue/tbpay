package com.loc;

import android.text.TextUtils;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class cq implements ThreadFactory {
    private static final int k = Runtime.getRuntime().availableProcessors();
    private static final int l = Math.max(2, Math.min(k - 1, 4));
    private static final int m = (k << 1) + 1;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f7727a;
    private final ThreadFactory b;
    private final Thread.UncaughtExceptionHandler c;
    private final String d;
    private final Integer e;
    private final Boolean f;
    private final int g;
    private final int h;
    private final BlockingQueue<Runnable> i;
    private final int j;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private ThreadFactory f7729a;
        private Thread.UncaughtExceptionHandler b;
        private String c;
        private Integer d;
        private Boolean e;
        private int f = cq.l;
        private int g = cq.m;
        private int h = 30;
        private BlockingQueue<Runnable> i;

        private void b() {
            this.f7729a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public final a a(String str) {
            this.c = str;
            return this;
        }

        public final cq a() {
            cq cqVar = new cq(this, (byte) 0);
            b();
            return cqVar;
        }
    }

    private cq(a aVar) {
        this.b = aVar.f7729a == null ? Executors.defaultThreadFactory() : aVar.f7729a;
        this.g = aVar.f;
        this.h = m;
        if (this.h >= this.g) {
            this.j = aVar.h;
            this.i = aVar.i == null ? new LinkedBlockingQueue<>(256) : aVar.i;
            this.d = TextUtils.isEmpty(aVar.c) ? "amap-threadpool" : aVar.c;
            this.e = aVar.d;
            this.f = aVar.e;
            this.c = aVar.b;
            this.f7727a = new AtomicLong();
            return;
        }
        throw new NullPointerException("maxPoolSize must > corePoolSize!");
    }

    /* synthetic */ cq(a aVar, byte b) {
        this(aVar);
    }

    private ThreadFactory g() {
        return this.b;
    }

    private String h() {
        return this.d;
    }

    private Boolean i() {
        return this.f;
    }

    private Integer j() {
        return this.e;
    }

    private Thread.UncaughtExceptionHandler k() {
        return this.c;
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.h;
    }

    public final BlockingQueue<Runnable> c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        new Runnable() { // from class: com.loc.cq.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            }
        };
        Thread newThread = g().newThread(runnable);
        if (h() != null) {
            Long valueOf = Long.valueOf(this.f7727a.incrementAndGet());
            newThread.setName(String.format(h() + "-%d", valueOf));
        }
        if (k() != null) {
            newThread.setUncaughtExceptionHandler(k());
        }
        if (j() != null) {
            newThread.setPriority(j().intValue());
        }
        if (i() != null) {
            newThread.setDaemon(i().booleanValue());
        }
        return newThread;
    }
}
