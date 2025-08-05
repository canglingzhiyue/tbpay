package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes6.dex */
public class ScheduledVirtualThreadPoolExecutor extends VirtualThreadPoolExecutor implements ScheduledExecutorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicLong sequencer;
    private volatile boolean continueExistingPeriodicTasksAfterShutdown;
    private volatile boolean executeExistingDelayedTasksAfterShutdown;
    private volatile boolean removeOnCancel;

    public static /* synthetic */ Object ipc$super(ScheduledVirtualThreadPoolExecutor scheduledVirtualThreadPoolExecutor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -489736769) {
            if (hashCode == -342309312) {
                return super.shutdownNow();
            }
            if (hashCode != 457600989) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.shutdown();
            return null;
        }
        return super.getQueue();
    }

    public <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RunnableScheduledFuture) ipChange.ipc$dispatch("bf71133f", new Object[]{this, runnable, runnableScheduledFuture}) : runnableScheduledFuture;
    }

    public <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RunnableScheduledFuture) ipChange.ipc$dispatch("eb7f6d1e", new Object[]{this, callable, runnableScheduledFuture}) : runnableScheduledFuture;
    }

    public static /* synthetic */ AtomicLong access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("46b3f4db", new Object[0]) : sequencer;
    }

    public static /* synthetic */ boolean access$100(ScheduledVirtualThreadPoolExecutor scheduledVirtualThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9775ff6", new Object[]{scheduledVirtualThreadPoolExecutor})).booleanValue() : scheduledVirtualThreadPoolExecutor.removeOnCancel;
    }

    static {
        kge.a(-787027435);
        kge.a(1302606125);
        sequencer = new AtomicLong();
    }

    public final long now() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ef9d451", new Object[]{this})).longValue() : System.nanoTime();
    }

    /* loaded from: classes6.dex */
    public class b<V> extends FutureTask<V> implements RunnableScheduledFuture<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public RunnableScheduledFuture<V> f15802a;
        public int b;
        private final long d;
        private long e;
        private final long f;

        static {
            kge.a(145031494);
            kge.a(-702267973);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1619161865) {
                if (hashCode == 91209838) {
                    return new Boolean(super.runAndReset());
                }
                if (hashCode != 1548812690) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.run();
                return null;
            }
            return new Boolean(super.cancel(((Boolean) objArr[0]).booleanValue()));
        }

        public static /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbd291a4", new Object[]{bVar});
            } else {
                super.run();
            }
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fca11029", new Object[]{bVar})).booleanValue() : super.runAndReset();
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(Delayed delayed) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, delayed})).intValue() : a(delayed);
        }

        public b(Runnable runnable, V v, long j) {
            super(runnable, v);
            this.f15802a = this;
            this.e = j;
            this.f = 0L;
            this.d = ScheduledVirtualThreadPoolExecutor.access$000().getAndIncrement();
        }

        public b(Runnable runnable, V v, long j, long j2) {
            super(runnable, v);
            this.f15802a = this;
            this.e = j;
            this.f = j2;
            this.d = ScheduledVirtualThreadPoolExecutor.access$000().getAndIncrement();
        }

        public b(Callable<V> callable, long j) {
            super(callable);
            this.f15802a = this;
            this.e = j;
            this.f = 0L;
            this.d = ScheduledVirtualThreadPoolExecutor.access$000().getAndIncrement();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("12d66bd8", new Object[]{this, timeUnit})).longValue() : timeUnit.convert(this.e - ScheduledVirtualThreadPoolExecutor.this.now(), TimeUnit.NANOSECONDS);
        }

        public int a(Delayed delayed) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("66690360", new Object[]{this, delayed})).intValue();
            }
            if (delayed == this) {
                return 0;
            }
            if (delayed instanceof b) {
                b bVar = (b) delayed;
                int i = ((this.e - bVar.e) > 0L ? 1 : ((this.e - bVar.e) == 0L ? 0 : -1));
                if (i < 0) {
                    return -1;
                }
                return (i <= 0 && this.d < bVar.d) ? -1 : 1;
            }
            int i2 = ((getDelay(TimeUnit.NANOSECONDS) - delayed.getDelay(TimeUnit.NANOSECONDS)) > 0L ? 1 : ((getDelay(TimeUnit.NANOSECONDS) - delayed.getDelay(TimeUnit.NANOSECONDS)) == 0L ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            return i2 > 0 ? 1 : 0;
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f49ec7f0", new Object[]{this})).booleanValue() : this.f != 0;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            long j = this.f;
            if (j > 0) {
                this.e += j;
            } else {
                this.e = ScheduledVirtualThreadPoolExecutor.this.triggerTime(-j);
            }
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            boolean cancel = super.cancel(z);
            if (cancel && ScheduledVirtualThreadPoolExecutor.access$100(ScheduledVirtualThreadPoolExecutor.this) && this.b >= 0) {
                ScheduledVirtualThreadPoolExecutor.this.remove(this);
            }
            return cancel;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean isPeriodic = isPeriodic();
            if (!ScheduledVirtualThreadPoolExecutor.this.canRunInCurrentRunState(isPeriodic)) {
                cancel(false);
            } else if (!isPeriodic) {
                a((b) this);
            } else if (!b(this)) {
            } else {
                a();
                ScheduledVirtualThreadPoolExecutor.this.reExecutePeriodic(this.f15802a);
            }
        }
    }

    public boolean canRunInCurrentRunState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("204bd472", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return isRunningOrShutdown(z ? this.continueExistingPeriodicTasksAfterShutdown : this.executeExistingDelayedTasksAfterShutdown);
    }

    private void delayedExecute(RunnableScheduledFuture<?> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9940b80e", new Object[]{this, runnableScheduledFuture});
        } else if (isShutdown()) {
            reject(runnableScheduledFuture);
        } else {
            super.getQueue().add(runnableScheduledFuture);
            if (isShutdown() && !canRunInCurrentRunState(runnableScheduledFuture.isPeriodic()) && remove(runnableScheduledFuture)) {
                runnableScheduledFuture.cancel(false);
            } else {
                ensurePrestart();
            }
        }
    }

    public void reExecutePeriodic(RunnableScheduledFuture<?> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124bd058", new Object[]{this, runnableScheduledFuture});
        } else if (!canRunInCurrentRunState(true)) {
        } else {
            super.getQueue().add(runnableScheduledFuture);
            if (!canRunInCurrentRunState(true) && remove(runnableScheduledFuture)) {
                runnableScheduledFuture.cancel(false);
            } else {
                ensurePrestart();
            }
        }
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor
    public void onShutdown() {
        Object[] array;
        Object[] array2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9088fb5c", new Object[]{this});
            return;
        }
        BlockingQueue<Runnable> queue = super.getQueue();
        boolean executeExistingDelayedTasksAfterShutdownPolicy = getExecuteExistingDelayedTasksAfterShutdownPolicy();
        boolean continueExistingPeriodicTasksAfterShutdownPolicy = getContinueExistingPeriodicTasksAfterShutdownPolicy();
        if (!executeExistingDelayedTasksAfterShutdownPolicy && !continueExistingPeriodicTasksAfterShutdownPolicy) {
            for (Object obj : queue.toArray()) {
                if (obj instanceof RunnableScheduledFuture) {
                    ((RunnableScheduledFuture) obj).cancel(false);
                }
            }
            queue.clear();
        } else {
            for (Object obj2 : queue.toArray()) {
                if (obj2 instanceof RunnableScheduledFuture) {
                    RunnableScheduledFuture runnableScheduledFuture = (RunnableScheduledFuture) obj2;
                    if (!runnableScheduledFuture.isPeriodic() ? executeExistingDelayedTasksAfterShutdownPolicy : continueExistingPeriodicTasksAfterShutdownPolicy) {
                        if (!runnableScheduledFuture.isCancelled()) {
                        }
                    }
                    if (queue.remove(runnableScheduledFuture)) {
                        runnableScheduledFuture.cancel(false);
                    }
                }
            }
        }
        tryTerminate();
    }

    public ScheduledVirtualThreadPoolExecutor(int i) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a());
        this.executeExistingDelayedTasksAfterShutdown = true;
        this.removeOnCancel = false;
    }

    public ScheduledVirtualThreadPoolExecutor(int i, ThreadFactory threadFactory) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a(), threadFactory);
        this.executeExistingDelayedTasksAfterShutdown = true;
        this.removeOnCancel = false;
    }

    public ScheduledVirtualThreadPoolExecutor(int i, VRejectedExecutionHandler vRejectedExecutionHandler) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a(), vRejectedExecutionHandler);
        this.executeExistingDelayedTasksAfterShutdown = true;
        this.removeOnCancel = false;
    }

    public ScheduledVirtualThreadPoolExecutor(int i, ThreadFactory threadFactory, VRejectedExecutionHandler vRejectedExecutionHandler) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a(), threadFactory, vRejectedExecutionHandler);
        this.executeExistingDelayedTasksAfterShutdown = true;
        this.removeOnCancel = false;
    }

    private long triggerTime(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91ad8794", new Object[]{this, new Long(j), timeUnit})).longValue();
        }
        if (j < 0) {
            j = 0;
        }
        return triggerTime(timeUnit.toNanos(j));
    }

    public long triggerTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eab1a18c", new Object[]{this, new Long(j)})).longValue();
        }
        long now = now();
        if (j >= 4611686018427387903L) {
            j = overflowFree(j);
        }
        return now + j;
    }

    private long overflowFree(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba725e43", new Object[]{this, new Long(j)})).longValue();
        }
        Delayed delayed = (Delayed) super.getQueue().peek();
        if (delayed == null) {
            return j;
        }
        long delay = delayed.getDelay(TimeUnit.NANOSECONDS);
        return (delay >= 0 || j - delay >= 0) ? j : Long.MAX_VALUE + delay;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        if (runnable == null || timeUnit == null) {
            throw new NullPointerException();
        }
        RunnableScheduledFuture<?> decorateTask = decorateTask(runnable, new b(runnable, null, triggerTime(j, timeUnit)));
        delayedExecute(decorateTask);
        return decorateTask;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{this, callable, new Long(j), timeUnit});
        }
        if (callable == null || timeUnit == null) {
            throw new NullPointerException();
        }
        RunnableScheduledFuture<V> decorateTask = decorateTask(callable, new b(callable, triggerTime(j, timeUnit)));
        delayedExecute(decorateTask);
        return decorateTask;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (runnable == null || timeUnit == null) {
            throw new NullPointerException();
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException();
        }
        b bVar = new b(runnable, null, triggerTime(j, timeUnit), timeUnit.toNanos(j2));
        RunnableScheduledFuture<V> decorateTask = decorateTask(runnable, bVar);
        bVar.f15802a = decorateTask;
        delayedExecute(decorateTask);
        return decorateTask;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (runnable == null || timeUnit == null) {
            throw new NullPointerException();
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException();
        }
        b bVar = new b(runnable, null, triggerTime(j, timeUnit), -timeUnit.toNanos(j2));
        RunnableScheduledFuture<V> decorateTask = decorateTask(runnable, bVar);
        bVar.f15802a = decorateTask;
        delayedExecute(decorateTask);
        return decorateTask;
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : schedule(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : schedule(Executors.callable(runnable, t), 0L, TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : schedule(callable, 0L, TimeUnit.NANOSECONDS);
    }

    public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a526e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.continueExistingPeriodicTasksAfterShutdown = z;
        if (z || !isShutdown()) {
            return;
        }
        onShutdown();
    }

    public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55beba64", new Object[]{this})).booleanValue() : this.continueExistingPeriodicTasksAfterShutdown;
    }

    public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cad5173", new Object[]{this, new Boolean(z)});
            return;
        }
        this.executeExistingDelayedTasksAfterShutdown = z;
        if (z || !isShutdown()) {
            return;
        }
        onShutdown();
    }

    public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("95453f79", new Object[]{this})).booleanValue() : this.executeExistingDelayedTasksAfterShutdown;
    }

    public void setRemoveOnCancelPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343d2cdc", new Object[]{this, new Boolean(z)});
        } else {
            this.removeOnCancel = z;
        }
    }

    public boolean getRemoveOnCancelPolicy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4fb5bf0", new Object[]{this})).booleanValue() : this.removeOnCancel;
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            super.shutdown();
        }
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this}) : super.shutdownNow();
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor
    public BlockingQueue<Runnable> getQueue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("e2cf35bf", new Object[]{this}) : super.getQueue();
    }

    /* loaded from: classes6.dex */
    public static class a extends AbstractQueue<Runnable> implements BlockingQueue<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private RunnableScheduledFuture<?>[] f15800a = new RunnableScheduledFuture[16];
        private final ReentrantLock b = new ReentrantLock();
        private int c = 0;
        private Thread d = null;
        private final Condition e = this.b.newCondition();

        static {
            kge.a(457875469);
            kge.a(1577746852);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // java.util.concurrent.BlockingQueue
        public int remainingCapacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("148e6d4a", new Object[]{this})).intValue();
            }
            return Integer.MAX_VALUE;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
        public /* synthetic */ boolean add(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, obj})).booleanValue() : c((Runnable) obj);
        }

        @Override // java.util.Queue, java.util.concurrent.BlockingQueue
        public /* synthetic */ boolean offer(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4209ae03", new Object[]{this, obj})).booleanValue() : a((Runnable) obj);
        }

        @Override // java.util.concurrent.BlockingQueue
        public /* synthetic */ boolean offer(Runnable runnable, long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e208fef7", new Object[]{this, runnable, new Long(j), timeUnit})).booleanValue() : a(runnable, j, timeUnit);
        }

        @Override // java.util.Queue
        public /* synthetic */ Object peek() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("85bdd710", new Object[]{this}) : a();
        }

        @Override // java.util.Queue
        public /* synthetic */ Object poll() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ebae572c", new Object[]{this}) : b();
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Runnable] */
        @Override // java.util.concurrent.BlockingQueue
        public /* synthetic */ Runnable poll(long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dd15e8b8", new Object[]{this, new Long(j), timeUnit}) : a(j, timeUnit);
        }

        @Override // java.util.concurrent.BlockingQueue
        public /* synthetic */ void put(Runnable runnable) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29ab6e72", new Object[]{this, runnable});
            } else {
                b(runnable);
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
        @Override // java.util.concurrent.BlockingQueue
        public /* synthetic */ Runnable take() throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3c800764", new Object[]{this}) : c();
        }

        private void a(RunnableScheduledFuture<?> runnableScheduledFuture, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab925547", new Object[]{this, runnableScheduledFuture, new Integer(i)});
            } else if (!(runnableScheduledFuture instanceof b)) {
            } else {
                ((b) runnableScheduledFuture).b = i;
            }
        }

        private void a(int i, RunnableScheduledFuture<?> runnableScheduledFuture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e654b2f", new Object[]{this, new Integer(i), runnableScheduledFuture});
                return;
            }
            while (i > 0) {
                int i2 = (i - 1) >>> 1;
                RunnableScheduledFuture<?> runnableScheduledFuture2 = this.f15800a[i2];
                if (runnableScheduledFuture.compareTo(runnableScheduledFuture2) >= 0) {
                    break;
                }
                this.f15800a[i] = runnableScheduledFuture2;
                a(runnableScheduledFuture2, i);
                i = i2;
            }
            this.f15800a[i] = runnableScheduledFuture;
            a(runnableScheduledFuture, i);
        }

        private void b(int i, RunnableScheduledFuture<?> runnableScheduledFuture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c3de58e", new Object[]{this, new Integer(i), runnableScheduledFuture});
                return;
            }
            int i2 = this.c >>> 1;
            while (i < i2) {
                int i3 = (i << 1) + 1;
                RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f15800a;
                RunnableScheduledFuture<?> runnableScheduledFuture2 = runnableScheduledFutureArr[i3];
                int i4 = i3 + 1;
                if (i4 < this.c && runnableScheduledFuture2.compareTo(runnableScheduledFutureArr[i4]) > 0) {
                    runnableScheduledFuture2 = this.f15800a[i4];
                    i3 = i4;
                }
                if (runnableScheduledFuture.compareTo(runnableScheduledFuture2) <= 0) {
                    break;
                }
                this.f15800a[i] = runnableScheduledFuture2;
                a(runnableScheduledFuture2, i);
                i = i3;
            }
            this.f15800a[i] = runnableScheduledFuture;
            a(runnableScheduledFuture, i);
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            int length = this.f15800a.length;
            int i = length + (length >> 1);
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
            this.f15800a = (RunnableScheduledFuture[]) Arrays.copyOf(this.f15800a, i);
        }

        private int a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, obj})).intValue();
            }
            if (obj == null) {
                return -1;
            }
            if (obj instanceof b) {
                int i = ((b) obj).b;
                if (i >= 0 && i < this.c && this.f15800a[i] == obj) {
                    return i;
                }
                return -1;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                if (obj.equals(this.f15800a[i2])) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public boolean contains(Object obj) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (a(obj) == -1) {
                    z = false;
                }
                return z;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                int a2 = a(obj);
                if (a2 < 0) {
                    return false;
                }
                a(this.f15800a[a2], -1);
                int i = this.c - 1;
                this.c = i;
                RunnableScheduledFuture<?> runnableScheduledFuture = this.f15800a[i];
                this.f15800a[i] = null;
                if (i != a2) {
                    b(a2, runnableScheduledFuture);
                    if (this.f15800a[a2] == runnableScheduledFuture) {
                        a(a2, runnableScheduledFuture);
                    }
                }
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                return this.c;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : size() == 0;
        }

        public RunnableScheduledFuture<?> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("521c8e42", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                return this.f15800a[0];
            } finally {
                reentrantLock.unlock();
            }
        }

        public boolean a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("39112ea", new Object[]{this, runnable})).booleanValue();
            }
            if (runnable == null) {
                throw new NullPointerException();
            }
            RunnableScheduledFuture<?> runnableScheduledFuture = (RunnableScheduledFuture) runnable;
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                int i = this.c;
                if (i >= this.f15800a.length) {
                    d();
                }
                this.c = i + 1;
                if (i == 0) {
                    this.f15800a[0] = runnableScheduledFuture;
                    a(runnableScheduledFuture, 0);
                } else {
                    a(i, runnableScheduledFuture);
                }
                if (this.f15800a[0] == runnableScheduledFuture) {
                    this.d = null;
                    this.e.signal();
                }
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
            } else {
                a(runnable);
            }
        }

        public boolean c(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf1acec", new Object[]{this, runnable})).booleanValue() : a(runnable);
        }

        public boolean a(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9aab07de", new Object[]{this, runnable, new Long(j), timeUnit})).booleanValue() : a(runnable);
        }

        private RunnableScheduledFuture<?> a(RunnableScheduledFuture<?> runnableScheduledFuture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("4327dee", new Object[]{this, runnableScheduledFuture});
            }
            int i = this.c - 1;
            this.c = i;
            RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f15800a;
            RunnableScheduledFuture<?> runnableScheduledFuture2 = runnableScheduledFutureArr[i];
            runnableScheduledFutureArr[i] = null;
            if (i != 0) {
                b(0, runnableScheduledFuture2);
            }
            a(runnableScheduledFuture, -1);
            return runnableScheduledFuture;
        }

        public RunnableScheduledFuture<?> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("43c63461", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                RunnableScheduledFuture<?> runnableScheduledFuture = this.f15800a[0];
                if (runnableScheduledFuture != null && runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS) <= 0) {
                    return a(runnableScheduledFuture);
                }
                return null;
            } finally {
                reentrantLock.unlock();
            }
        }

        public RunnableScheduledFuture<?> c() throws InterruptedException {
            RunnableScheduledFuture<?> runnableScheduledFuture;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("356fda80", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lockInterruptibly();
            while (true) {
                try {
                    runnableScheduledFuture = this.f15800a[0];
                    if (runnableScheduledFuture == null) {
                        this.e.await();
                    } else {
                        long delay = runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS);
                        if (delay <= 0) {
                            break;
                        } else if (this.d != null) {
                            this.e.await();
                        } else {
                            Thread currentThread = Thread.currentThread();
                            this.d = currentThread;
                            this.e.awaitNanos(delay);
                            if (this.d == currentThread) {
                                this.d = null;
                            }
                        }
                    }
                } finally {
                    if (this.d == null && this.f15800a[0] != null) {
                        this.e.signal();
                    }
                    reentrantLock.unlock();
                }
            }
            return a(runnableScheduledFuture);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
            r9 = a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
            if (r8.d != null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
            if (r8.f15800a[0] == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
            r8.e.signal();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
            r11.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
            return r9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.concurrent.RunnableScheduledFuture<?> a(long r9, java.util.concurrent.TimeUnit r11) throws java.lang.InterruptedException {
            /*
                r8 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.virtual_thread.ScheduledVirtualThreadPoolExecutor.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 0
                if (r1 == 0) goto L20
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r8
                r2 = 1
                java.lang.Long r3 = new java.lang.Long
                r3.<init>(r9)
                r1[r2] = r3
                r9 = 2
                r1[r9] = r11
                java.lang.String r9 = "bdab9dce"
                java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
                java.util.concurrent.RunnableScheduledFuture r9 = (java.util.concurrent.RunnableScheduledFuture) r9
                return r9
            L20:
                long r9 = r11.toNanos(r9)
                java.util.concurrent.locks.ReentrantLock r11 = r8.b
                r11.lockInterruptibly()
            L29:
                java.util.concurrent.RunnableScheduledFuture<?>[] r0 = r8.f15800a     // Catch: java.lang.Throwable -> Lb6
                r0 = r0[r2]     // Catch: java.lang.Throwable -> Lb6
                r3 = 0
                r1 = 0
                if (r0 != 0) goto L50
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 > 0) goto L49
                java.lang.Thread r9 = r8.d
                if (r9 != 0) goto L45
                java.util.concurrent.RunnableScheduledFuture<?>[] r9 = r8.f15800a
                r9 = r9[r2]
                if (r9 == 0) goto L45
                java.util.concurrent.locks.Condition r9 = r8.e
                r9.signal()
            L45:
                r11.unlock()
                return r1
            L49:
                java.util.concurrent.locks.Condition r0 = r8.e     // Catch: java.lang.Throwable -> Lb6
                long r9 = r0.awaitNanos(r9)     // Catch: java.lang.Throwable -> Lb6
                goto L29
            L50:
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> Lb6
                long r5 = r0.getDelay(r5)     // Catch: java.lang.Throwable -> Lb6
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 > 0) goto L71
                java.util.concurrent.RunnableScheduledFuture r9 = r8.a(r0)     // Catch: java.lang.Throwable -> Lb6
                java.lang.Thread r10 = r8.d
                if (r10 != 0) goto L6d
                java.util.concurrent.RunnableScheduledFuture<?>[] r10 = r8.f15800a
                r10 = r10[r2]
                if (r10 == 0) goto L6d
                java.util.concurrent.locks.Condition r10 = r8.e
                r10.signal()
            L6d:
                r11.unlock()
                return r9
            L71:
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 > 0) goto L88
                java.lang.Thread r9 = r8.d
                if (r9 != 0) goto L84
                java.util.concurrent.RunnableScheduledFuture<?>[] r9 = r8.f15800a
                r9 = r9[r2]
                if (r9 == 0) goto L84
                java.util.concurrent.locks.Condition r9 = r8.e
                r9.signal()
            L84:
                r11.unlock()
                return r1
            L88:
                int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r0 < 0) goto Lae
                java.lang.Thread r0 = r8.d     // Catch: java.lang.Throwable -> Lb6
                if (r0 == 0) goto L91
                goto Lae
            L91:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb6
                r8.d = r0     // Catch: java.lang.Throwable -> Lb6
                java.util.concurrent.locks.Condition r3 = r8.e     // Catch: java.lang.Throwable -> La6
                long r3 = r3.awaitNanos(r5)     // Catch: java.lang.Throwable -> La6
                long r5 = r5 - r3
                long r9 = r9 - r5
                java.lang.Thread r3 = r8.d     // Catch: java.lang.Throwable -> Lb6
                if (r3 != r0) goto L29
                r8.d = r1     // Catch: java.lang.Throwable -> Lb6
                goto L29
            La6:
                r9 = move-exception
                java.lang.Thread r10 = r8.d     // Catch: java.lang.Throwable -> Lb6
                if (r10 != r0) goto Lad
                r8.d = r1     // Catch: java.lang.Throwable -> Lb6
            Lad:
                throw r9     // Catch: java.lang.Throwable -> Lb6
            Lae:
                java.util.concurrent.locks.Condition r0 = r8.e     // Catch: java.lang.Throwable -> Lb6
                long r9 = r0.awaitNanos(r9)     // Catch: java.lang.Throwable -> Lb6
                goto L29
            Lb6:
                r9 = move-exception
                java.lang.Thread r10 = r8.d
                if (r10 != 0) goto Lc6
                java.util.concurrent.RunnableScheduledFuture<?>[] r10 = r8.f15800a
                r10 = r10[r2]
                if (r10 == 0) goto Lc6
                java.util.concurrent.locks.Condition r10 = r8.e
                r10.signal()
            Lc6:
                r11.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.virtual_thread.ScheduledVirtualThreadPoolExecutor.a.a(long, java.util.concurrent.TimeUnit):java.util.concurrent.RunnableScheduledFuture");
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            for (int i = 0; i < this.c; i++) {
                try {
                    RunnableScheduledFuture<?> runnableScheduledFuture = this.f15800a[i];
                    if (runnableScheduledFuture != null) {
                        this.f15800a[i] = null;
                        a(runnableScheduledFuture, -1);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            this.c = 0;
        }

        private RunnableScheduledFuture<?> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("18c326be", new Object[]{this});
            }
            RunnableScheduledFuture<?> runnableScheduledFuture = this.f15800a[0];
            if (runnableScheduledFuture != null && runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS) <= 0) {
                return runnableScheduledFuture;
            }
            return null;
        }

        @Override // java.util.concurrent.BlockingQueue
        public int drainTo(Collection<? super Runnable> collection) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("baa627be", new Object[]{this, collection})).intValue();
            }
            if (collection == null) {
                throw new NullPointerException();
            }
            if (collection == this) {
                throw new IllegalArgumentException();
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            while (true) {
                try {
                    RunnableScheduledFuture<?> e = e();
                    if (e == null) {
                        return i;
                    }
                    collection.add(e);
                    a(e);
                    i++;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }

        @Override // java.util.concurrent.BlockingQueue
        public int drainTo(Collection<? super Runnable> collection, int i) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9a1f448b", new Object[]{this, collection, new Integer(i)})).intValue();
            }
            if (collection == null) {
                throw new NullPointerException();
            }
            if (collection == this) {
                throw new IllegalArgumentException();
            }
            if (i <= 0) {
                return 0;
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            while (i2 < i) {
                try {
                    RunnableScheduledFuture<?> e = e();
                    if (e == null) {
                        break;
                    }
                    collection.add(e);
                    a(e);
                    i2++;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                return Arrays.copyOf(this.f15800a, this.c, Object[].class);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (tArr.length < this.c) {
                    return (T[]) Arrays.copyOf(this.f15800a, this.c, tArr.getClass());
                }
                System.arraycopy(this.f15800a, 0, tArr, 0, this.c);
                if (tArr.length > this.c) {
                    tArr[this.c] = null;
                }
                return tArr;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Runnable> iterator() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this}) : new C0611a((RunnableScheduledFuture[]) Arrays.copyOf(this.f15800a, this.c));
        }

        /* renamed from: com.taobao.android.virtual_thread.ScheduledVirtualThreadPoolExecutor$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C0611a implements Iterator<Runnable> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final RunnableScheduledFuture<?>[] f15801a;
            public int b = 0;
            public int c = -1;

            static {
                kge.a(901992304);
                kge.a(-1813181746);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
            @Override // java.util.Iterator
            public /* synthetic */ Runnable next() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b9bf2c78", new Object[]{this}) : a();
            }

            public C0611a(RunnableScheduledFuture<?>[] runnableScheduledFutureArr) {
                this.f15801a = runnableScheduledFutureArr;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue() : this.b < this.f15801a.length;
            }

            public Runnable a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Runnable) ipChange.ipc$dispatch("95a5d02c", new Object[]{this});
                }
                int i = this.b;
                RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f15801a;
                if (i >= runnableScheduledFutureArr.length) {
                    throw new NoSuchElementException();
                }
                this.c = i;
                this.b = i + 1;
                return runnableScheduledFutureArr[i];
            }

            @Override // java.util.Iterator
            public void remove() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("41689b0b", new Object[]{this});
                    return;
                }
                int i = this.c;
                if (i < 0) {
                    throw new IllegalStateException();
                }
                a.this.remove(this.f15801a[i]);
                this.c = -1;
            }
        }
    }
}
