package com.taobao.taobaoavsdk.cache.library;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final q f21334a;
    public e b;
    public i c;
    private final com.taobao.taobaoavsdk.cache.library.a d;
    private volatile ExecutorService i;
    private volatile boolean j;
    private final Object e = new Object();
    private final Object f = new Object();
    private volatile Thread h = null;
    private volatile int k = -1;
    private AtomicBoolean l = new AtomicBoolean(true);
    private AtomicBoolean m = new AtomicBoolean(false);
    private long n = 0;
    private long o = 0;
    private final AtomicInteger g = new AtomicInteger();

    static {
        kge.a(1585588128);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b45814", new Object[]{oVar});
        } else {
            oVar.e();
        }
    }

    public static /* synthetic */ AtomicBoolean b(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c5a18595", new Object[]{oVar}) : oVar.l;
    }

    public static /* synthetic */ AtomicBoolean c(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("342896d6", new Object[]{oVar}) : oVar.m;
    }

    public o(q qVar, com.taobao.taobaoavsdk.cache.library.a aVar, i iVar) {
        this.f21334a = (q) n.a(qVar);
        this.d = (com.taobao.taobaoavsdk.cache.library.a) n.a(aVar);
        this.c = iVar;
    }

    public int a(byte[] bArr, long j, int i, boolean z) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1fb0c59", new Object[]{this, bArr, new Long(j), new Integer(i), new Boolean(z)})).intValue();
        }
        p.a(bArr, j, i);
        this.n = System.currentTimeMillis();
        while (!this.d.d() && !this.j && this.d.a() < i + j) {
            if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "newCacheWrite", "false"))) {
                if (z && this.m.get() && i()) {
                    break;
                }
                c();
                d();
                b();
            } else if (z && this.m.get()) {
                break;
            } else {
                c();
                d();
                b();
            }
        }
        int a2 = this.d.a(bArr, j, i);
        this.o = System.currentTimeMillis();
        if (this.o - this.n > 100) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "cache read time is " + (this.o - this.n) + " mBeginWriteCacheTimeStamp is " + this.n + " mEndWriteCacheTimeStamp is " + this.o);
        }
        if (this.d.d() && this.k != 100) {
            this.k = 100;
            a(100);
        }
        return a2;
    }

    private void b() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        int i = this.g.get();
        if (i <= 0) {
            return;
        }
        this.g.set(0);
        throw new ProxyCacheException("Error reading source " + i + " times");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            try {
                this.j = true;
                if (this.h != null) {
                    this.h.interrupt();
                }
                this.d.b();
            } catch (ProxyCacheException unused) {
            }
        }
    }

    private synchronized void c() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_CONTROL_USE_COMMON_THREADPOOL, "false"))) {
            this.i = com.taobao.taobaoavsdk.util.a.a();
            if (!this.j && !this.d.d() && this.l.compareAndSet(true, false)) {
                this.i.submit(new a());
            }
        } else {
            if (this.h != null && this.h.getState() != Thread.State.TERMINATED) {
                z = true;
            }
            if (!this.j && !this.d.d() && !z) {
                a aVar = new a();
                this.h = new Thread(aVar, "Source reader for " + this.f21334a);
                this.h.start();
            }
        }
    }

    private void d() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this.e) {
            try {
                try {
                    this.e.wait(500L);
                } catch (InterruptedException e) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f80629", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        a(j, j2);
        synchronized (this.e) {
            this.e.notifyAll();
        }
    }

    public void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        int i2 = i == 0 ? 100 : (int) ((j * 100) / j2);
        boolean z2 = i2 != this.k;
        if (i < 0) {
            z = false;
        }
        if (z && z2) {
            a(i2);
        }
        this.k = i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void e() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.cache.library.o.e():void");
    }

    private void f() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            if (!g() && this.d.a() == this.f21334a.a()) {
                this.d.c();
            }
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : VExecutors.currentThread().isInterrupted() || this.j;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            this.f21334a.c();
        } catch (ProxyCacheException e) {
            new ProxyCacheException("Error closing source " + this.f21334a, e);
        } catch (Exception e2) {
            new Exception("close source unknown exception " + this.f21334a, e2);
        }
    }

    /* loaded from: classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(973479071);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            o.a(o.this);
            o.b(o.this).set(true);
            o.c(o.this).set(true);
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return (this.h != null && this.h.getState() != Thread.State.TERMINATED) || !this.l.get();
    }
}
