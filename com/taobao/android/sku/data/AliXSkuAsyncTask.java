package com.taobao.android.sku.data;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class AliXSkuAsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Executor SERIAL_EXECUTOR;
    public static final Executor SINGLE_EXECUTOR;
    public static final Executor THREAD_POOL_EXECUTOR;

    /* renamed from: a  reason: collision with root package name */
    private static final int f15155a;
    private static final int b;
    private static final int c;
    private static final ThreadFactory d;
    private static final BlockingQueue<Runnable> e;
    private static volatile Executor f;
    private static b g;
    private final d<Params, Result> h;
    private final FutureTask<Result> i;
    private volatile Status j;
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private final Handler m;

    /* renamed from: com.taobao.android.sku.data.AliXSkuAsyncTask$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15159a = new int[Status.values().length];

        static {
            try {
                f15159a[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15159a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes6.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final AliXSkuAsyncTask f15160a;
        public final Data[] b;

        static {
            kge.a(-1880140040);
        }

        public a(AliXSkuAsyncTask aliXSkuAsyncTask, Data... dataArr) {
            this.f15160a = aliXSkuAsyncTask;
            this.b = dataArr;
        }
    }

    public abstract Result a(Params... paramsArr);

    public void a(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, result});
        }
    }

    public static /* synthetic */ Object a(AliXSkuAsyncTask aliXSkuAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("77c28e3d", new Object[]{aliXSkuAsyncTask, obj}) : aliXSkuAsyncTask.c(obj);
    }

    public static /* synthetic */ AtomicBoolean a(AliXSkuAsyncTask aliXSkuAsyncTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("76beff9", new Object[]{aliXSkuAsyncTask}) : aliXSkuAsyncTask.l;
    }

    public static /* synthetic */ AtomicBoolean b(AliXSkuAsyncTask aliXSkuAsyncTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("ed174c7a", new Object[]{aliXSkuAsyncTask}) : aliXSkuAsyncTask.k;
    }

    public static /* synthetic */ void b(AliXSkuAsyncTask aliXSkuAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d15516", new Object[]{aliXSkuAsyncTask, obj});
        } else {
            aliXSkuAsyncTask.b((AliXSkuAsyncTask) obj);
        }
    }

    public static /* synthetic */ void c(AliXSkuAsyncTask aliXSkuAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b22e497", new Object[]{aliXSkuAsyncTask, obj});
        } else {
            aliXSkuAsyncTask.d(obj);
        }
    }

    static {
        kge.a(-861896162);
        f15155a = Runtime.getRuntime().availableProcessors();
        b = Math.max(2, Math.min(f15155a - 1, 4));
        c = (f15155a << 1) + 1;
        d = new ThreadFactory() { // from class: com.taobao.android.sku.data.AliXSkuAsyncTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f15156a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "AliXSkuAsyncTask #" + this.f15156a.getAndIncrement());
            }
        };
        e = new LinkedBlockingQueue(128);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b, c, 30L, TimeUnit.SECONDS, e, d);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        THREAD_POOL_EXECUTOR = threadPoolExecutor;
        SINGLE_EXECUTOR = new c();
        c cVar = new c();
        SERIAL_EXECUTOR = cVar;
        f = cVar;
    }

    /* loaded from: classes6.dex */
    public static class c implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque<Runnable> f15161a;
        public Runnable b;

        static {
            kge.a(-237755827);
            kge.a(2095468555);
        }

        private c() {
            this.f15161a = new ArrayDeque<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                return;
            }
            this.f15161a.offer(new Runnable() { // from class: com.taobao.android.sku.data.AliXSkuAsyncTask.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        c.this.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }

        public synchronized void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Runnable poll = this.f15161a.poll();
            this.b = poll;
            if (poll != null) {
                AliXSkuAsyncTask.THREAD_POOL_EXECUTOR.execute(this.b);
            }
        }
    }

    private static Handler b() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]);
        }
        synchronized (AliXSkuAsyncTask.class) {
            if (g == null) {
                g = new b(Looper.getMainLooper());
            }
            bVar = g;
        }
        return bVar;
    }

    private Handler c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this}) : this.m;
    }

    public AliXSkuAsyncTask() {
        this(null);
    }

    public AliXSkuAsyncTask(Looper looper) {
        this.j = Status.PENDING;
        this.k = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.m = (looper == null || looper == Looper.getMainLooper()) ? b() : new Handler(looper);
        this.h = new d<Params, Result>() { // from class: com.taobao.android.sku.data.AliXSkuAsyncTask.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Result) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
                }
                AliXSkuAsyncTask.a(AliXSkuAsyncTask.this).set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) AliXSkuAsyncTask.this.a((Object[]) this.b);
                    Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            }
        };
        this.i = new FutureTask<Result>(this.h) { // from class: com.taobao.android.sku.data.AliXSkuAsyncTask.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.FutureTask
            public void done() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("45231709", new Object[]{this});
                    return;
                }
                try {
                    AliXSkuAsyncTask.b(AliXSkuAsyncTask.this, get());
                } catch (InterruptedException unused) {
                } catch (CancellationException unused2) {
                    AliXSkuAsyncTask.b(AliXSkuAsyncTask.this, null);
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                }
            }
        };
    }

    private void b(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, result});
        } else if (this.l.get()) {
        } else {
            c(result);
        }
    }

    private Result c(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("45d4372c", new Object[]{this, result});
        }
        c().obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.k.get();
    }

    public final AliXSkuAsyncTask<Params, Progress, Result> b(Params... paramsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliXSkuAsyncTask) ipChange.ipc$dispatch("feb4e5ff", new Object[]{this, paramsArr}) : a(f, paramsArr);
    }

    public final AliXSkuAsyncTask<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuAsyncTask) ipChange.ipc$dispatch("669892c4", new Object[]{this, executor, paramsArr});
        }
        if (this.j != Status.PENDING) {
            int i = AnonymousClass4.f15159a[this.j.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.j = Status.RUNNING;
        this.h.b = paramsArr;
        executor.execute(this.i);
        return this;
    }

    private void d(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, result});
            return;
        }
        if (!a()) {
            a((AliXSkuAsyncTask<Params, Progress, Result>) result);
        }
        this.j = Status.FINISHED;
    }

    /* loaded from: classes6.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1745749209);
        }

        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            a aVar = (a) message.obj;
            if (message.what != 1) {
                return;
            }
            AliXSkuAsyncTask.c(aVar.f15160a, aVar.b[0]);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class d<Params, Result> implements Callable<Result> {
        public Params[] b;

        static {
            kge.a(-157472735);
            kge.a(-119797776);
        }

        private d() {
        }
    }
}
