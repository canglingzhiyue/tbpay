package com.taobao.themis.inside.adapter;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSExecutorImpl implements IExecutorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f22436a;
    private static int b;
    private static final int c;
    private static final h p;
    private static final h q;
    private ScheduledExecutorService d;
    private volatile Executor g;
    private volatile Executor h;
    private Handler k;
    private HandlerThread l;
    private final BlockingQueue<Runnable> e = new PriorityBlockingQueue(256);
    private final BlockingQueue<Runnable> f = new PriorityBlockingQueue(128);
    private Handler i = new Handler(Looper.getMainLooper());
    private ExecutorService j = VExecutors.newSingleThreadExecutor(new h() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "Themis_JSAPI_Executor";
        }
    });
    private ScheduledExecutorService r = VExecutors.newSingleThreadScheduledExecutor(new h() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "Themis_Manifest_Executor";
        }
    });
    private Executor m = new Executor() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                runnable.run();
            }
        }
    };
    private Executor n = new Executor() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                TMSExecutorImpl.access$000(TMSExecutorImpl.this).post(runnable);
            }
        }
    };
    private Executor o = new Executor() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                return;
            }
            if (TMSExecutorImpl.access$100(TMSExecutorImpl.this) == null) {
                TMSExecutorImpl.access$102(TMSExecutorImpl.this, new HandlerThread("Themis_Audio_Executor"));
                TMSExecutorImpl.access$100(TMSExecutorImpl.this).start();
                TMSExecutorImpl tMSExecutorImpl = TMSExecutorImpl.this;
                TMSExecutorImpl.access$202(tMSExecutorImpl, new Handler(TMSExecutorImpl.access$100(tMSExecutorImpl).getLooper()));
            }
            TMSExecutorImpl.access$200(TMSExecutorImpl.this).post(runnable);
        }
    };

    public static /* synthetic */ Handler access$000(TMSExecutorImpl tMSExecutorImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("d7d252d0", new Object[]{tMSExecutorImpl}) : tMSExecutorImpl.i;
    }

    public static /* synthetic */ HandlerThread access$100(TMSExecutorImpl tMSExecutorImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("fd780445", new Object[]{tMSExecutorImpl}) : tMSExecutorImpl.l;
    }

    public static /* synthetic */ HandlerThread access$102(TMSExecutorImpl tMSExecutorImpl, HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("5813b93d", new Object[]{tMSExecutorImpl, handlerThread});
        }
        tMSExecutorImpl.l = handlerThread;
        return handlerThread;
    }

    public static /* synthetic */ Handler access$200(TMSExecutorImpl tMSExecutorImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5c00ad8e", new Object[]{tMSExecutorImpl}) : tMSExecutorImpl.k;
    }

    public static /* synthetic */ Handler access$202(TMSExecutorImpl tMSExecutorImpl, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cedf439c", new Object[]{tMSExecutorImpl, handler});
        }
        tMSExecutorImpl.k = handler;
        return handler;
    }

    static {
        kge.a(-2034503568);
        kge.a(-364617639);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f22436a = availableProcessors;
        c = (availableProcessors << 1) + 1;
        p = new h() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f22443a = new AtomicInteger(1);

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return "Themis #" + this.f22443a.getAndIncrement();
            }
        };
        q = new h() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f22444a = new AtomicInteger(1);

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return "Themis ##" + this.f22444a.getAndIncrement();
            }
        };
    }

    @Override // com.taobao.themis.kernel.executor.IExecutorService
    public Executor getExecutor(final ExecutorType executorType) {
        final Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("411ccf18", new Object[]{this, executorType});
        }
        b = Math.max(4, f22436a + 4);
        if (executorType == ExecutorType.UI) {
            return this.n;
        }
        if (executorType == ExecutorType.SYNC) {
            return this.m;
        }
        if (executorType == ExecutorType.JSAPI) {
            return this.j;
        }
        if (executorType == ExecutorType.AUDIO) {
            return this.o;
        }
        if (executorType == ExecutorType.MANIFEST) {
            return this.r;
        }
        if (executorType == ExecutorType.SERIAL) {
            return AsyncTask.SERIAL_EXECUTOR;
        }
        if (executorType == ExecutorType.NORMAL || executorType == ExecutorType.IDLE || executorType == ExecutorType.IO || executorType == ExecutorType.NETWORK) {
            if (this.h == null) {
                synchronized (this) {
                    if (this.h == null) {
                        int i = c / 2;
                        this.h = VExecutors.getThreadPoolFactory().a(2, i < 2 ? 2 : i, 30L, TimeUnit.SECONDS, this.f, q, new ThreadPoolExecutor.AbortPolicy());
                    }
                }
            }
            executor = this.h;
        } else {
            if (this.g == null) {
                synchronized (this) {
                    if (this.g == null) {
                        int i2 = b;
                        int i3 = c;
                        this.g = VExecutors.getThreadPoolFactory().a(i2, i3 < i2 ? i2 : i3, 30L, TimeUnit.SECONDS, this.e, p, new ThreadPoolExecutor.AbortPolicy());
                    }
                }
            }
            executor = this.g;
        }
        return new Executor() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                } else {
                    executor.execute(new a(runnable, executorType));
                }
            }
        };
    }

    @Override // com.taobao.themis.kernel.executor.IExecutorService
    public ScheduledExecutorService getScheduledExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("4263fd5", new Object[]{this});
        }
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = VExecutors.newScheduledThreadPool(4, new h() { // from class: com.taobao.themis.inside.adapter.TMSExecutorImpl.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.virtual_thread.face.h
                        public String newThreadName() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : "Themis-Scheduled-Executor";
                        }
                    });
                }
            }
        }
        return this.d;
    }

    /* loaded from: classes9.dex */
    public static class a implements Comparable<a>, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ExecutorType f22445a;
        private Runnable b;

        static {
            kge.a(-1809007179);
            kge.a(-1390502639);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
        }

        public a(Runnable runnable, ExecutorType executorType) {
            this.f22445a = executorType;
            this.b = runnable;
        }

        public int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6cb2553d", new Object[]{this, aVar})).intValue();
            }
            ExecutorType executorType = this.f22445a;
            if (executorType == null) {
                return -1;
            }
            ExecutorType executorType2 = aVar.f22445a;
            if (executorType2 == null) {
                return 1;
            }
            if (!executorType.equals(executorType2)) {
                return this.f22445a.ordinal() - aVar.f22445a.ordinal();
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.run();
            }
        }
    }
}
