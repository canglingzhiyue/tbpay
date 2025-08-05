package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.k;
import tb.iqv;
import tb.irs;
import tb.jdz;
import tb.kge;

/* loaded from: classes9.dex */
public final class b extends tao.reactivex.k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final C1083b f25152a;
    public static final f b;
    public static final int c;
    public static final c d;
    public final ThreadFactory e;
    public final AtomicReference<C1083b> f;

    /* loaded from: classes9.dex */
    public static final class a extends k.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f25153a;
        private final tao.reactivex.d.a.c b = new tao.reactivex.d.a.c();
        private final irs c = new irs();
        private final tao.reactivex.d.a.c d = new tao.reactivex.d.a.c();
        private final c e;

        static {
            kge.a(-1469170279);
        }

        public a(c cVar) {
            this.e = cVar;
            this.d.a(this.b);
            this.d.a(this.c);
        }

        @Override // tao.reactivex.k.c
        public jdz a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("c44f0a60", new Object[]{this, runnable}) : this.f25153a ? tao.reactivex.d.a.b.INSTANCE : this.e.a(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
        }

        @Override // tao.reactivex.k.c
        public jdz a(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("50795aec", new Object[]{this, runnable, new Long(j), timeUnit}) : this.f25153a ? tao.reactivex.d.a.b.INSTANCE : this.e.a(runnable, j, timeUnit, this.c);
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f25153a;
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (this.f25153a) {
            } else {
                this.f25153a = true;
                this.d.b_();
            }
        }
    }

    /* renamed from: tao.reactivex.f.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C1083b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f25154a;
        public final c[] b;
        public long c;

        static {
            kge.a(-1469170278);
        }

        public C1083b(int i, ThreadFactory threadFactory) {
            this.f25154a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a482075e", new Object[]{this});
            }
            int i = this.f25154a;
            if (i == 0) {
                return b.d;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            for (c cVar : this.b) {
                cVar.b_();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class c extends e {
        static {
            kge.a(-1469170277);
        }

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        kge.a(1964949468);
        c = a(Runtime.getRuntime().availableProcessors(), iqv.a().c());
        c cVar = new c(new f("PmComputationShutdown"));
        d = cVar;
        cVar.b_();
        b = new f("PmComputationThreadPool", 5, true);
        C1083b c1083b = new C1083b(0, b);
        f25152a = c1083b;
        c1083b.b();
    }

    public b() {
        this(b);
    }

    public b(ThreadFactory threadFactory) {
        this.e = threadFactory;
        this.f = new AtomicReference<>(f25152a);
        b();
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // tao.reactivex.k
    public k.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k.c) ipChange.ipc$dispatch("96f4a96c", new Object[]{this}) : new a(this.f.get().a());
    }

    @Override // tao.reactivex.k
    public jdz a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("5ec52e34", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit}) : this.f.get().a().a(runnable, j, j2, timeUnit);
    }

    @Override // tao.reactivex.k
    public jdz a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("50795aec", new Object[]{this, runnable, new Long(j), timeUnit}) : this.f.get().a().b(runnable, j, timeUnit);
    }

    @Override // tao.reactivex.k
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        C1083b c1083b = new C1083b(c, this.e);
        if (this.f.compareAndSet(f25152a, c1083b)) {
            return;
        }
        c1083b.b();
    }
}
