package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class VirtualThreadPoolExecutor extends AbstractExecutorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CAPACITY = 536870911;
    private static final int COUNT_BITS = 29;
    private static final boolean ONLY_ONE = true;
    private static final String TAG = "VThreadPool";
    private static final int V_RUNNING = -536870912;
    private static final int V_SHUTDOWN = 0;
    private static final int V_STOP = 536870912;
    private static final int V_TERMINATED = 1610612736;
    private static final int V_TIDYING = 1073741824;
    public static final VRejectedExecutionHandler defaultHandler;
    private volatile boolean allowCoreThreadTimeOut;
    private long completedTaskCount;
    private volatile int corePoolSize;
    private final AtomicInteger ctl;
    private volatile VRejectedExecutionHandler handler;
    private final BlockingQueue<Worker> idleWorkers;
    private volatile long keepAliveTime;
    private int largestPoolSize;
    private final ReentrantLock mainLock;
    private volatile int maximumPoolSize;
    private final Condition termination;
    private volatile ThreadFactory threadFactory;
    private final BlockingQueue<Runnable> workQueue;
    private final AtomicInteger workerCount;
    private final HashSet<Worker> workers;

    private static int ctlOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45a48aec", new Object[]{new Integer(i), new Integer(i2)})).intValue() : i | i2;
    }

    public static /* synthetic */ Object ipc$super(VirtualThreadPoolExecutor virtualThreadPoolExecutor, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private static boolean isRunning(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1de1b4b", new Object[]{new Integer(i)})).booleanValue() : i < 0;
    }

    private static boolean runStateAtLeast(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2ea0317b", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : i >= i2;
    }

    private static boolean runStateLessThan(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("766bb4eb", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : i < i2;
    }

    private static int runStateOf(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6efbd432", new Object[]{new Integer(i)})).intValue() : i & V_RUNNING;
    }

    private static int workerCountOf(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b159a267", new Object[]{new Integer(i)})).intValue() : i & CAPACITY;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
        }
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
        }
    }

    public void onShutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9088fb5c", new Object[]{this});
        }
    }

    public void terminated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c8c92a", new Object[]{this});
        }
    }

    private boolean compareAndIncrementWorkerCount(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39bb88cc", new Object[]{this, new Integer(i)})).booleanValue() : this.ctl.compareAndSet(i, i + 1);
    }

    private boolean compareAndDecrementWorkerCount(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8bc01f0", new Object[]{this, new Integer(i)})).booleanValue() : this.ctl.compareAndSet(i, i - 1);
    }

    private void decrementWorkerCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee406325", new Object[]{this});
        } else {
            do {
            } while (!compareAndDecrementWorkerCount(this.ctl.get()));
        }
    }

    static {
        kge.a(-2015048378);
        defaultHandler = new a();
    }

    /* loaded from: classes6.dex */
    public final class Worker extends AbstractQueuedSynchronizer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 6138294804551838833L;
        public volatile long completedTasks;
        public Runnable firstTask;
        public VThread vThread;
        public final Thread virtualThread;

        static {
            kge.a(1396993212);
            kge.a(-1390502639);
        }

        public Worker(Runnable runnable) {
            setState(-1);
            this.firstTask = runnable;
            this.virtualThread = VirtualThreadPoolExecutor.this.getThreadFactory().newThread(this);
            this.vThread = createVirtual(this.virtualThread);
        }

        public Worker(Runnable runnable, Worker worker) {
            setState(-1);
            this.firstTask = runnable;
            this.virtualThread = worker.virtualThread;
            this.vThread = createVirtual(this.virtualThread);
        }

        private VThread createVirtual(Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VThread) ipChange.ipc$dispatch("ccbcf616", new Object[]{this, thread});
            }
            if (thread == null) {
                return null;
            }
            return thread instanceof VirtualThread ? ((VirtualThread) thread).reVirtual(this) : new VThread(thread, this);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VirtualThreadPoolExecutor.this.runWorker(this);
            }
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean isHeldExclusively() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f849237", new Object[]{this})).booleanValue() : getState() != 0;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryAcquire(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("13289a5", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (!compareAndSetState(0, 1)) {
                return false;
            }
            setExclusiveOwnerThread(VThread.currentCarrierThread());
            return true;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryRelease(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("99ee9914", new Object[]{this, new Integer(i)})).booleanValue();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        public void lock() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71bbbc32", new Object[]{this});
            } else {
                acquire(1);
            }
        }

        public boolean tryLock() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca43f711", new Object[]{this})).booleanValue() : tryAcquire(1);
        }

        public void unlock() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccb421cb", new Object[]{this});
            } else {
                release(1);
            }
        }

        public boolean isLocked() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4521f5f", new Object[]{this})).booleanValue() : isHeldExclusively();
        }

        public void interruptIfStarted() {
            VThread vThread;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aed8d88", new Object[]{this});
            } else if (getState() < 0 || (vThread = this.vThread) == null || vThread.isInterrupted()) {
            } else {
                try {
                    vThread.interrupt();
                } catch (SecurityException unused) {
                }
            }
        }
    }

    private void advanceRunState(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5cfcf4", new Object[]{this, new Integer(i)});
            return;
        }
        do {
            i2 = this.ctl.get();
            if (runStateAtLeast(i2, i)) {
                return;
            }
        } while (!this.ctl.compareAndSet(i2, ctlOf(i, workerCountOf(i2))));
    }

    public final void tryTerminate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e279806d", new Object[]{this});
            return;
        }
        while (true) {
            int i = this.ctl.get();
            if (isRunning(i) || runStateAtLeast(i, 1073741824)) {
                return;
            }
            if (runStateOf(i) == 0 && !this.workQueue.isEmpty()) {
                return;
            }
            if (workerCountOf(i) != 0) {
                interruptIdleWorkers(true);
                return;
            }
            ReentrantLock reentrantLock = this.mainLock;
            reentrantLock.lock();
            try {
                if (this.ctl.compareAndSet(i, ctlOf(1073741824, 0))) {
                    terminated();
                    this.ctl.set(ctlOf(V_TERMINATED, 0));
                    this.termination.signalAll();
                    return;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private void interruptWorkers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7eec59", new Object[]{this});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                it.next().interruptIfStarted();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private void interruptIdleWorkers(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2e0e0f", new Object[]{this, new Boolean(z)});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                Worker next = it.next();
                VThread vThread = next.vThread;
                if (!vThread.isInterrupted() && next.tryLock()) {
                    try {
                        vThread.interrupt();
                    } catch (SecurityException unused) {
                    } catch (Throwable th) {
                        next.unlock();
                        throw th;
                    }
                    next.unlock();
                    continue;
                }
                if (z) {
                    break;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private Worker createWorker(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Worker) ipChange.ipc$dispatch("c0a93ca", new Object[]{this, runnable});
        }
        Worker poll = this.idleWorkers.poll();
        if (poll != null) {
            return new Worker(runnable, poll);
        }
        return new Worker(runnable);
    }

    private void interruptIdleWorkers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6cd165", new Object[]{this});
        } else {
            interruptIdleWorkers(false);
        }
    }

    public final void reject(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77242c24", new Object[]{this, runnable});
        } else {
            this.handler.vRejectedExecution(runnable, this);
        }
    }

    public final boolean isRunningOrShutdown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478df383", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        int runStateOf = runStateOf(this.ctl.get());
        return runStateOf == V_RUNNING || (runStateOf == 0 && z);
    }

    private List<Runnable> drainQueue() {
        Runnable[] runnableArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21b78847", new Object[]{this});
        }
        BlockingQueue<Runnable> blockingQueue = this.workQueue;
        ArrayList arrayList = new ArrayList();
        blockingQueue.drainTo(arrayList);
        if (!blockingQueue.isEmpty()) {
            for (Runnable runnable : (Runnable[]) blockingQueue.toArray(new Runnable[0])) {
                if (blockingQueue.remove(runnable)) {
                    arrayList.add(runnable);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #2 {all -> 0x00b8, blocks: (B:26:0x0065, B:28:0x006d, B:41:0x009d, B:43:0x00a2, B:29:0x0072, B:35:0x0085, B:37:0x008b, B:39:0x009a, B:45:0x00a6, B:46:0x00ab), top: B:58:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean addWorker(java.lang.Runnable r7, boolean r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L24
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r7 = 2
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r8)
            r1[r7] = r2
            java.lang.String r7 = "22101f54"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L24:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.ctl
            int r0 = r0.get()
            int r1 = runStateOf(r0)
            if (r1 < 0) goto L3d
            if (r1 != 0) goto L3c
            if (r7 != 0) goto L3c
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r4 = r6.workQueue
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L3d
        L3c:
            return r3
        L3d:
            int r4 = workerCountOf(r0)
            r5 = 536870911(0x1fffffff, float:1.0842021E-19)
            if (r4 >= r5) goto Lbd
            if (r8 == 0) goto L4b
            int r5 = r6.corePoolSize
            goto L4d
        L4b:
            int r5 = r6.maximumPoolSize
        L4d:
            if (r4 < r5) goto L51
            goto Lbd
        L51:
            boolean r0 = r6.compareAndIncrementWorkerCount(r0)
            if (r0 != 0) goto L64
            java.util.concurrent.atomic.AtomicInteger r0 = r6.ctl
            int r0 = r0.get()
            int r4 = runStateOf(r0)
            if (r4 != r1) goto L24
            goto L3d
        L64:
            r8 = 0
            com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker r8 = r6.createWorker(r7)     // Catch: java.lang.Throwable -> Lb8
            com.taobao.android.virtual_thread.VThread r0 = r8.vThread     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto Lb1
            java.util.concurrent.locks.ReentrantLock r1 = r6.mainLock     // Catch: java.lang.Throwable -> Lb8
            r1.lock()     // Catch: java.lang.Throwable -> Lb8
            java.util.concurrent.atomic.AtomicInteger r4 = r6.ctl     // Catch: java.lang.Throwable -> Lac
            int r4 = r4.get()     // Catch: java.lang.Throwable -> Lac
            int r4 = runStateOf(r4)     // Catch: java.lang.Throwable -> Lac
            if (r4 < 0) goto L85
            if (r4 != 0) goto L83
            if (r7 != 0) goto L83
            goto L85
        L83:
            r7 = 0
            goto L9d
        L85:
            boolean r7 = r0.isAlive()     // Catch: java.lang.Throwable -> Lac
            if (r7 != 0) goto La6
            java.util.HashSet<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r7 = r6.workers     // Catch: java.lang.Throwable -> Lac
            r7.add(r8)     // Catch: java.lang.Throwable -> Lac
            java.util.HashSet<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r7 = r6.workers     // Catch: java.lang.Throwable -> Lac
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lac
            int r4 = r6.largestPoolSize     // Catch: java.lang.Throwable -> Lac
            if (r7 <= r4) goto L9c
            r6.largestPoolSize = r7     // Catch: java.lang.Throwable -> Lac
        L9c:
            r7 = 1
        L9d:
            r1.unlock()     // Catch: java.lang.Throwable -> Lb8
            if (r7 == 0) goto Lb1
            r0.start()     // Catch: java.lang.Throwable -> Lb8
            goto Lb2
        La6:
            java.lang.IllegalThreadStateException r7 = new java.lang.IllegalThreadStateException     // Catch: java.lang.Throwable -> Lac
            r7.<init>()     // Catch: java.lang.Throwable -> Lac
            throw r7     // Catch: java.lang.Throwable -> Lac
        Lac:
            r7 = move-exception
            r1.unlock()     // Catch: java.lang.Throwable -> Lb8
            throw r7     // Catch: java.lang.Throwable -> Lb8
        Lb1:
            r2 = 0
        Lb2:
            if (r2 != 0) goto Lb7
            r6.addWorkerFailed(r8)
        Lb7:
            return r2
        Lb8:
            r7 = move-exception
            r6.addWorkerFailed(r8)
            throw r7
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.addWorker(java.lang.Runnable, boolean):boolean");
    }

    private void addWorkerFailed(Worker worker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("514d0296", new Object[]{this, worker});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        if (worker != null) {
            try {
                this.workers.remove(worker);
            } finally {
                reentrantLock.unlock();
            }
        }
        decrementWorkerCount();
        tryTerminate();
    }

    private void processWorkerExit(Worker worker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2e2aef", new Object[]{this, worker, new Boolean(z)});
            return;
        }
        if (z) {
            decrementWorkerCount();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            this.completedTaskCount += worker.completedTasks;
            this.workers.remove(worker);
            reentrantLock.unlock();
            tryTerminate();
            int i = this.ctl.get();
            if (!runStateLessThan(i, 536870912)) {
                return;
            }
            if (!z && workerCountOf(i) >= (!this.workQueue.isEmpty() ? 1 : 0)) {
                return;
            }
            addWorker(null, false);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        r7.idleWorkers.add(r8);
        decrementWorkerCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Runnable getTask(com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.Worker r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "eb16167f"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            return r8
        L18:
            r0 = 0
        L19:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.ctl
            int r1 = r1.get()
            int r4 = runStateOf(r1)
            r5 = 0
            if (r4 < 0) goto L3b
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 >= r6) goto L32
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r4 = r7.workQueue
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L3b
        L32:
            java.util.concurrent.BlockingQueue<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r0 = r7.idleWorkers
            r0.add(r8)
            r7.decrementWorkerCount()
            return r5
        L3b:
            int r1 = workerCountOf(r1)
            int r4 = r7.maximumPoolSize
            if (r1 > r4) goto L45
            if (r0 == 0) goto L50
        L45:
            if (r1 > r2) goto L72
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r7.workQueue
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
            goto L72
        L50:
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r7.workQueue     // Catch: java.lang.InterruptedException -> L18
            boolean r0 = r0.isEmpty()     // Catch: java.lang.InterruptedException -> L18
            if (r0 == 0) goto L61
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r7.workQueue     // Catch: java.lang.InterruptedException -> L18
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.InterruptedException -> L18
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.InterruptedException -> L18
            goto L6d
        L61:
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r7.workQueue     // Catch: java.lang.InterruptedException -> L18
            long r4 = r7.keepAliveTime     // Catch: java.lang.InterruptedException -> L18
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L18
            java.lang.Object r0 = r0.poll(r4, r1)     // Catch: java.lang.InterruptedException -> L18
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.InterruptedException -> L18
        L6d:
            if (r0 == 0) goto L70
            return r0
        L70:
            r0 = 1
            goto L19
        L72:
            java.util.concurrent.BlockingQueue<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r0 = r7.idleWorkers
            r0.add(r8)
            r7.decrementWorkerCount()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.getTask(com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker):java.lang.Runnable");
    }

    public final void runWorker(Worker worker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5782e3", new Object[]{this, worker});
            return;
        }
        Thread currentCarrierThread = VThread.currentCarrierThread();
        Runnable runnable = worker.firstTask;
        worker.firstTask = null;
        worker.unlock();
        while (true) {
            if (runnable == null) {
                try {
                    runnable = getTask(worker);
                    if (runnable == null) {
                        processWorkerExit(worker, false);
                        return;
                    }
                } catch (Throwable th) {
                    processWorkerExit(worker, true);
                    throw th;
                }
            }
            worker.lock();
            if ((runStateAtLeast(this.ctl.get(), 536870912) || (Thread.interrupted() && runStateAtLeast(this.ctl.get(), 536870912))) && !currentCarrierThread.isInterrupted()) {
                currentCarrierThread.interrupt();
            }
            beforeExecute(VThread.currentVirtualThread(), runnable);
            try {
                runnable.run();
                afterExecute(runnable, null);
                worker.completedTasks++;
                worker.unlock();
                runnable = null;
            } catch (RuntimeException e) {
                throw e;
            } catch (Throwable th2) {
                throw new Error(th2);
            }
        }
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        this(i, i2, j, timeUnit, blockingQueue, VirtualExecutors.defaultThreadFactory(), defaultHandler);
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        this(i, i2, j, timeUnit, blockingQueue, threadFactory, defaultHandler);
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, VRejectedExecutionHandler vRejectedExecutionHandler) {
        this(i, i2, j, timeUnit, blockingQueue, VirtualExecutors.defaultThreadFactory(), vRejectedExecutionHandler);
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, VRejectedExecutionHandler vRejectedExecutionHandler) {
        this.ctl = new AtomicInteger(ctlOf(V_RUNNING, 0));
        this.mainLock = new ReentrantLock();
        this.workers = new HashSet<>();
        this.idleWorkers = new LinkedBlockingQueue();
        this.workerCount = new AtomicInteger(0);
        this.termination = this.mainLock.newCondition();
        if (i < 0 || i2 <= 0 || i2 < i || j < 0) {
            throw new IllegalArgumentException();
        }
        if (blockingQueue == null || threadFactory == null || vRejectedExecutionHandler == null) {
            throw new NullPointerException();
        }
        this.corePoolSize = i;
        this.maximumPoolSize = i2;
        this.workQueue = blockingQueue;
        this.keepAliveTime = timeUnit.toNanos(j);
        this.threadFactory = threadFactory;
        this.handler = vRejectedExecutionHandler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else if (runnable == null) {
            throw new NullPointerException();
        } else {
            int i = this.ctl.get();
            if (workerCountOf(i) < this.corePoolSize) {
                if (addWorker(runnable, true)) {
                    return;
                }
                i = this.ctl.get();
            }
            if (isRunning(i) && this.workQueue.offer(runnable)) {
                int i2 = this.ctl.get();
                int workerCountOf = workerCountOf(i2);
                if (!isRunning(i2) && remove(runnable)) {
                    reject(runnable);
                } else if (workerCountOf != 0) {
                } else {
                    addWorker(null, false);
                }
            } else if (addWorker(runnable, false)) {
            } else {
                reject(runnable);
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            advanceRunState(0);
            interruptIdleWorkers();
            onShutdown();
            reentrantLock.unlock();
            tryTerminate();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this});
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            advanceRunState(536870912);
            interruptWorkers();
            List<Runnable> drainQueue = drainQueue();
            reentrantLock.unlock();
            tryTerminate();
            return drainQueue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue() : !isRunning(this.ctl.get());
    }

    public boolean isTerminating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce51ddf", new Object[]{this})).booleanValue();
        }
        int i = this.ctl.get();
        return !isRunning(i) && runStateLessThan(i, V_TERMINATED);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue() : runStateAtLeast(this.ctl.get(), V_TERMINATED);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue();
        }
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        while (!runStateAtLeast(this.ctl.get(), V_TERMINATED)) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.termination.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        return true;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        if (!isShutdown()) {
            shutdown();
        }
        super.finalize();
    }

    public void setThreadFactory(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bb42c", new Object[]{this, threadFactory});
        } else if (threadFactory == null) {
            throw new NullPointerException();
        } else {
            this.threadFactory = threadFactory;
        }
    }

    public ThreadFactory getThreadFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadFactory) ipChange.ipc$dispatch("2fa31d0c", new Object[]{this}) : this.threadFactory;
    }

    public void setRejectedExecutionHandler(VRejectedExecutionHandler vRejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2817b340", new Object[]{this, vRejectedExecutionHandler});
        } else if (vRejectedExecutionHandler == null) {
            throw new NullPointerException();
        } else {
            this.handler = vRejectedExecutionHandler;
        }
    }

    public VRejectedExecutionHandler getRejectedExecutionHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VRejectedExecutionHandler) ipChange.ipc$dispatch("2c1c3c76", new Object[]{this}) : this.handler;
    }

    public void setCorePoolSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e470d9e", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
            throw new IllegalArgumentException();
        } else {
            int i2 = i - this.corePoolSize;
            this.corePoolSize = i;
            if (workerCountOf(this.ctl.get()) > i) {
                interruptIdleWorkers();
            } else if (i2 <= 0) {
            } else {
                int min = Math.min(i2, this.workQueue.size());
                while (true) {
                    int i3 = min - 1;
                    if (min <= 0 || !addWorker(null, true) || this.workQueue.isEmpty()) {
                        return;
                    }
                    min = i3;
                }
            }
        }
    }

    public int getCorePoolSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d8190ec", new Object[]{this})).intValue() : this.corePoolSize;
    }

    public boolean prestartCoreThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed2b1813", new Object[]{this})).booleanValue() : workerCountOf(this.ctl.get()) < this.corePoolSize && addWorker(null, true);
    }

    public void ensurePrestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2276004", new Object[]{this});
            return;
        }
        int workerCountOf = workerCountOf(this.ctl.get());
        if (workerCountOf < this.corePoolSize) {
            addWorker(null, true);
        } else if (workerCountOf != 0) {
        } else {
            addWorker(null, false);
        }
    }

    public int prestartAllCoreThreads() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("240f24a2", new Object[]{this})).intValue();
        }
        while (addWorker(null, true)) {
            i++;
        }
        return i;
    }

    public boolean allowsCoreThreadTimeOut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39c53ed9", new Object[]{this})).booleanValue() : this.allowCoreThreadTimeOut;
    }

    @Deprecated
    public void allowCoreThreadTimeOut(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cd25e", new Object[]{this, new Boolean(z)});
        } else if (z && this.keepAliveTime <= 0) {
            throw new IllegalArgumentException("Core threads must have nonzero keep alive times");
        } else {
            if (z == this.allowCoreThreadTimeOut) {
                return;
            }
            this.allowCoreThreadTimeOut = z;
        }
    }

    public void setMaximumPoolSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ccb881", new Object[]{this, new Integer(i)});
        } else if (i <= 0 || i < this.corePoolSize) {
            throw new IllegalArgumentException();
        } else {
            this.maximumPoolSize = i;
            if (workerCountOf(this.ctl.get()) <= i) {
                return;
            }
            interruptIdleWorkers();
        }
    }

    public int getMaximumPoolSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69b15341", new Object[]{this})).intValue() : this.maximumPoolSize;
    }

    public void setKeepAliveTime(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8065ee", new Object[]{this, new Long(j), timeUnit});
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i == 0 && allowsCoreThreadTimeOut()) {
            throw new IllegalArgumentException("Core threads must have nonzero keep alive times");
        }
        this.keepAliveTime = timeUnit.toNanos(j);
    }

    public long getKeepAliveTime(TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("400a96e6", new Object[]{this, timeUnit})).longValue() : timeUnit.convert(this.keepAliveTime, TimeUnit.NANOSECONDS);
    }

    public BlockingQueue<Runnable> getQueue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("e2cf35bf", new Object[]{this}) : this.workQueue;
    }

    public boolean remove(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb0e920d", new Object[]{this, runnable})).booleanValue();
        }
        boolean remove = this.workQueue.remove(runnable);
        tryTerminate();
        return remove;
    }

    public void purge() {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc867b2", new Object[]{this});
            return;
        }
        BlockingQueue<Runnable> blockingQueue = this.workQueue;
        try {
            Iterator it = blockingQueue.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if ((runnable instanceof Future) && ((Future) runnable).isCancelled()) {
                    it.remove();
                }
            }
        } catch (ConcurrentModificationException unused) {
            for (Object obj : blockingQueue.toArray()) {
                if ((obj instanceof Future) && ((Future) obj).isCancelled()) {
                    blockingQueue.remove(obj);
                }
            }
        }
        tryTerminate();
    }

    public int getPoolSize() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fccf2ead", new Object[]{this})).intValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            if (!runStateAtLeast(this.ctl.get(), 1073741824)) {
                i = this.workers.size();
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getActiveCount() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4edbaf6d", new Object[]{this})).intValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                if (it.next().isLocked()) {
                    i++;
                }
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getLargestPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7e649fd", new Object[]{this})).intValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            return this.largestPoolSize;
        } finally {
            reentrantLock.unlock();
        }
    }

    public long getTaskCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("806ec24f", new Object[]{this})).longValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            long j = this.completedTaskCount;
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                Worker next = it.next();
                j += next.completedTasks;
                if (next.isLocked()) {
                    j++;
                }
            }
            return j + this.workQueue.size();
        } finally {
            reentrantLock.unlock();
        }
    }

    public long getCompletedTaskCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17d58870", new Object[]{this})).longValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            long j = this.completedTaskCount;
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                j += it.next().completedTasks;
            }
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            long j = this.completedTaskCount;
            int size = this.workers.size();
            Iterator<Worker> it = this.workers.iterator();
            int i = 0;
            while (it.hasNext()) {
                Worker next = it.next();
                j += next.completedTasks;
                if (next.isLocked()) {
                    i++;
                }
            }
            reentrantLock.unlock();
            int i2 = this.ctl.get();
            String str = runStateLessThan(i2, 0) ? "Running" : runStateAtLeast(i2, V_TERMINATED) ? "Terminated" : "Shutting down";
            return super.toString() + riy.ARRAY_START_STR + str + ", pool size = " + size + ", active threads = " + i + ", queued tasks = " + this.workQueue.size() + ", completed tasks = " + j + riy.ARRAY_END_STR;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements VRejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1882099204);
            kge.a(1938406120);
        }

        @Override // com.taobao.android.virtual_thread.VRejectedExecutionHandler
        public void vRejectedExecution(Runnable runnable, ExecutorService executorService) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5354de2e", new Object[]{this, runnable, executorService});
                return;
            }
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + executorService.toString());
        }
    }
}
