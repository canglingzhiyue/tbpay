package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes2.dex */
public final class bfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;
    private static ExecutorService f;
    private static c g;

    /* renamed from: a */
    private final AtomicInteger f25864a;
    private final LinkedList<d<?>> b;
    private int c;
    private final String d;
    private final int e;

    public final Future<Object> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f9227d7c", new Object[]{this, runnable}) : a(this, runnable, 0L, null, 6, null);
    }

    public bfy(String name, int i) {
        q.d(name, "name");
        this.d = name;
        this.e = i;
        this.f25864a = new AtomicInteger();
        this.b = new LinkedList<>();
    }

    public static final /* synthetic */ ExecutorService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[0]) : f;
    }

    public static final /* synthetic */ AtomicInteger a(bfy bfyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("3ee1092d", new Object[]{bfyVar}) : bfyVar.f25864a;
    }

    public static final /* synthetic */ void a(ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe3b6d", new Object[]{executorService});
        } else {
            f = executorService;
        }
    }

    public static final /* synthetic */ void a(bfy bfyVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be9e25e", new Object[]{bfyVar, dVar});
        } else {
            bfyVar.a(dVar);
        }
    }

    public static final /* synthetic */ boolean a(bfy bfyVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53027964", new Object[]{bfyVar, new Integer(i)})).booleanValue() : bfyVar.a(i);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes2.dex */
        public static final class a implements h {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            @Override // com.taobao.android.virtual_thread.face.h
            public final String newThreadName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "mega-pool";
            }
        }

        static {
            kge.a(1168181402);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public static final /* synthetic */ ExecutorService b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("142dfad5", new Object[]{bVar}) : bVar.a();
        }

        @JvmStatic
        private final ExecutorService a() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[]{this});
            }
            if (bfy.a() == null) {
                try {
                    bfy.a(VExecutors.newCachedThreadPool(a.INSTANCE));
                } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
                    z = false;
                }
                if (!z) {
                    bfy.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 120L, TimeUnit.SECONDS, new SynchronousQueue(), new bfz("mega-pool", 0, 2, null)));
                }
            }
            ExecutorService a2 = bfy.a();
            q.a(a2);
            return a2;
        }
    }

    static {
        kge.a(1950628818);
        Companion = new b(null);
        g = new c();
    }

    public static /* synthetic */ Future a(bfy bfyVar, Runnable runnable, long j, TimeUnit timeUnit, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("599310a0", new Object[]{bfyVar, runnable, new Long(j), timeUnit, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return bfyVar.a(runnable, j, timeUnit);
    }

    public final Future<Object> a(Runnable runnable, long j, TimeUnit unit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("e6ac3c70", new Object[]{this, runnable, new Long(j), unit});
        }
        q.d(runnable, "runnable");
        q.d(unit, "unit");
        try {
            com.alibaba.ability.utils.b.INSTANCE.a("MegaScheduler#submit");
            return a(new a(runnable, null), j, unit);
        } finally {
            com.alibaba.ability.utils.b.INSTANCE.a();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a<T> implements Callable<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final Runnable f25865a;
        private final T b;

        static {
            kge.a(-1480265783);
            kge.a(-119797776);
        }

        public a(Runnable runnable, T t) {
            q.d(runnable, "runnable");
            this.f25865a = runnable;
            this.b = t;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            this.f25865a.run();
            return this.b;
        }
    }

    public final <T> Future<T> a(Callable<T> callable, long j, TimeUnit unit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a3a1c5b3", new Object[]{this, callable, new Long(j), unit});
        }
        q.d(callable, "callable");
        q.d(unit, "unit");
        long j2 = 0;
        if (j > 0) {
            j2 = SystemClock.elapsedRealtimeNanos() + TimeUnit.NANOSECONDS.convert(j, unit);
        }
        d<?> dVar = new d<>(this, j2, callable);
        g.a(dVar);
        return dVar;
    }

    private final void a(d<?> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c151a83", new Object[]{this, dVar});
            return;
        }
        synchronized (this.b) {
            this.b.addLast(dVar);
            int i = this.e;
            int i2 = this.c;
            if (i2 >= 0 && i > i2) {
                this.c++;
                b.b(Companion).submit(new e(this));
            }
            t tVar = t.INSTANCE;
        }
    }

    private final boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                this.c--;
                return false;
            }
            d<?> removeFirst = this.b.removeFirst();
            q.b(removeFirst, "taskQ.removeFirst()");
            d<?> dVar = removeFirst;
            t tVar = t.INSTANCE;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            int priority = currentThread.getPriority();
            currentThread.setName(this.d + '-' + i);
            dVar.a();
            currentThread.setName(name);
            currentThread.setPriority(priority);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final bfy f25868a;

        static {
            kge.a(-1371896534);
            kge.a(-1390502639);
        }

        public e(bfy scheduler) {
            q.d(scheduler, "scheduler");
            this.f25868a = scheduler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                do {
                } while (bfy.a(this.f25868a, bfy.a(this.f25868a).incrementAndGet()));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparable<d<T>>, Future<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final Object f25867a;
        private Thread b;
        private boolean c;
        private boolean d;
        private T e;
        private Throwable f;
        private final bfy g;
        private final long h;
        private final Callable<T> i;

        static {
            kge.a(-1398452425);
            kge.a(415966670);
            kge.a(-1812835589);
        }

        public d(bfy megaScheduler, long j, Callable<T> callable) {
            q.d(megaScheduler, "megaScheduler");
            q.d(callable, "callable");
            this.g = megaScheduler;
            this.h = j;
            this.i = callable;
            this.f25867a = new Object();
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue() : a((d) obj);
        }

        public final bfy b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("16b46468", new Object[]{this}) : this.g;
        }

        public final long c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.h;
        }

        public final void a() {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            synchronized (this.f25867a) {
                if (this.c) {
                    return;
                }
                this.b = Thread.currentThread();
                t tVar = t.INSTANCE;
                Throwable th = null;
                try {
                    t = this.i.call();
                } catch (Throwable th2) {
                    th = th2;
                    t = null;
                }
                synchronized (this.f25867a) {
                    this.f = th;
                    this.e = t;
                    this.b = null;
                    this.d = true;
                    this.f25867a.notifyAll();
                    t tVar2 = t.INSTANCE;
                }
            }
        }

        public int a(d<T> other) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c151a76", new Object[]{this, other})).intValue();
            }
            q.d(other, "other");
            return (this.h > other.h ? 1 : (this.h == other.h ? 0 : -1));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            Thread thread;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            synchronized (this.f25867a) {
                if (this.d) {
                    return false;
                }
                this.c = true;
                if (z && (thread = this.b) != null) {
                    thread.interrupt();
                }
                this.d = true;
                t tVar = t.INSTANCE;
                return true;
            }
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            synchronized (this.f25867a) {
                z = this.c;
            }
            return z;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
            }
            synchronized (this.f25867a) {
                z = this.d;
            }
            return z;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : get(0L, null);
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("122d0181", new Object[]{this, new Long(j), timeUnit});
            }
            synchronized (this.f25867a) {
                if (!this.d) {
                    if (j <= 0) {
                        this.f25867a.wait();
                    } else {
                        if (timeUnit == null) {
                            timeUnit = TimeUnit.MILLISECONDS;
                        }
                        long convert = TimeUnit.NANOSECONDS.convert(j, timeUnit);
                        b bVar = bfy.Companion;
                        this.f25867a.wait(convert / 1000000, (int) (convert % 1000000));
                        if (!this.d) {
                            throw new TimeoutException("MegaFutureGetTimeout");
                        }
                    }
                }
                if (this.f != null) {
                    throw new ExecutionException(this.f);
                }
                t = this.e;
                t tVar = t.INSTANCE;
            }
            return t;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        /* renamed from: a */
        private final Object f25866a = new Object();
        private LinkedList<d<?>> c = new LinkedList<>();
        private final PriorityQueue<d<?>> d = new PriorityQueue<>();

        static {
            kge.a(911627257);
            kge.a(-1390502639);
        }

        public final void a(d<?> task) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c151a83", new Object[]{this, task});
                return;
            }
            q.d(task, "task");
            synchronized (this.f25866a) {
                this.c.add(task);
                if (this.b) {
                    this.f25866a.notifyAll();
                } else {
                    this.b = true;
                    Thread thread = new Thread(this);
                    thread.setName("MegaScheduler");
                    thread.start();
                }
                t tVar = t.INSTANCE;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                LinkedList<d<?>> linkedList = null;
                synchronized (this.f25866a) {
                    if (!this.c.isEmpty()) {
                        linkedList = this.c;
                    }
                    this.c = new LinkedList<>();
                    t tVar = t.INSTANCE;
                }
                if (linkedList != null) {
                    for (d<?> dVar : linkedList) {
                        this.d.add(dVar);
                    }
                }
                d<?> dVar2 = null;
                if (this.d.isEmpty()) {
                    synchronized (this.f25866a) {
                        if (this.c.isEmpty()) {
                            this.f25866a.wait();
                        }
                        t tVar2 = t.INSTANCE;
                    }
                } else {
                    long c = this.d.peek().c() - SystemClock.elapsedRealtimeNanos();
                    if (c > 0) {
                        synchronized (this.f25866a) {
                            if (this.c.isEmpty()) {
                                b bVar = bfy.Companion;
                                this.f25866a.wait(c / 1000000, (int) (c % 1000000));
                            }
                            t tVar3 = t.INSTANCE;
                        }
                    } else {
                        dVar2 = this.d.remove();
                    }
                }
                if (dVar2 != null) {
                    bfy.a(dVar2.b(), dVar2);
                }
            }
        }
    }
}
