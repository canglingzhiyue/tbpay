package com.taobao.android.task;

import android.os.AsyncTask;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes.dex */
public class SaturativeExecutor extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final int KEEP_ALIVE = 1;
    private static final int MAX_POOL_SIZE = 128;
    private static final int MIN_THREADS_BEFORE_SATURATION = 3;
    private static final Pattern PATTERN_CPU_ENTRIES;
    private static final int QUEUE_CAPACITY = 1024;
    public static final String TAG = "SatuExec";
    private static SaturationAwareBlockingQueue<Runnable> mQueue;
    private static final HashSet<Thread> mThreads;
    private static final ThreadFactory sThreadFactory;

    public static /* synthetic */ Object ipc$super(SaturativeExecutor saturativeExecutor, String str, Object... objArr) {
        if (str.hashCode() == 452660730) {
            super.execute((Runnable) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Pattern access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]) : PATTERN_CPU_ENTRIES;
    }

    static {
        kge.a(2055064652);
        PATTERN_CPU_ENTRIES = Pattern.compile("cpu[0-9]+");
        sThreadFactory = new ThreadFactory() { // from class: com.taobao.android.task.SaturativeExecutor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f15324a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, "SaturativeThread #" + this.f15324a.getAndIncrement());
                SaturativeExecutor.collectThread(thread);
                return thread;
            }
        };
        mThreads = new HashSet<>();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            super.execute(new CountedTask(runnable));
        }
    }

    public static final boolean installAsDefaultAsyncTaskExecutor(ThreadPoolExecutor threadPoolExecutor) {
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                Field declaredField = AsyncTask.class.getDeclaredField("THREAD_POOL_EXECUTOR");
                declaredField.setAccessible(true);
                declaredField.set(null, threadPoolExecutor);
            } catch (Exception unused) {
            }
        }
        try {
            try {
                try {
                    Method method = AsyncTask.class.getMethod("setDefaultExecutor", Executor.class);
                    method.setAccessible(true);
                    method.invoke(null, threadPoolExecutor);
                    return true;
                } catch (Exception unused2) {
                    Field declaredField2 = AsyncTask.class.getDeclaredField("sDefaultExecutor");
                    declaredField2.setAccessible(true);
                    declaredField2.set(null, threadPoolExecutor);
                    return true;
                }
            } catch (Exception unused3) {
                Field declaredField3 = AsyncTask.class.getDeclaredField("sExecutor");
                declaredField3.setAccessible(true);
                declaredField3.set(null, threadPoolExecutor);
                return true;
            }
        } catch (Exception unused4) {
            return false;
        }
    }

    public SaturativeExecutor() {
        this(determineBestMinPoolSize());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SaturativeExecutor(int r10) {
        /*
            r9 = this;
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            com.taobao.android.task.SaturativeExecutor$SaturationAwareBlockingQueue r6 = new com.taobao.android.task.SaturativeExecutor$SaturationAwareBlockingQueue
            r0 = 1024(0x400, float:1.435E-42)
            r6.<init>(r0)
            com.taobao.android.task.SaturativeExecutor.mQueue = r6
            java.util.concurrent.ThreadFactory r7 = com.taobao.android.task.SaturativeExecutor.sThreadFactory
            java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy r8 = new java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy
            r8.<init>()
            r2 = 128(0x80, float:1.794E-43)
            r3 = 1
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            java.util.concurrent.BlockingQueue r10 = r9.getQueue()
            com.taobao.android.task.SaturativeExecutor$SaturationAwareBlockingQueue r10 = (com.taobao.android.task.SaturativeExecutor.SaturationAwareBlockingQueue) r10
            r10.setExecutor(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.task.SaturativeExecutor.<init>(int):void");
    }

    public boolean isReallyUnsaturated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e58b8172", new Object[]{this})).booleanValue();
        }
        if (isSaturated()) {
            return false;
        }
        LockSupport.parkNanos(10L);
        return !isSaturated();
    }

    public boolean isSaturated() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baab1096", new Object[]{this})).booleanValue();
        }
        if (getPoolSize() <= 3) {
            return false;
        }
        int corePoolSize = getCorePoolSize();
        int i2 = CountedTask.mNumRunning.get();
        int size = mThreads.size();
        if (i2 < corePoolSize || i2 < size) {
            return true;
        }
        synchronized (mThreads) {
            Iterator<Thread> it = mThreads.iterator();
            i = 0;
            while (it.hasNext()) {
                Thread.State state = it.next().getState();
                if (state != Thread.State.RUNNABLE && state != Thread.State.NEW) {
                    if (state == Thread.State.TERMINATED) {
                        it.remove();
                    }
                }
                i++;
            }
        }
        return i >= corePoolSize;
    }

    public static void collectThread(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511e9acc", new Object[]{thread});
            return;
        }
        synchronized (mThreads) {
            mThreads.add(thread);
        }
    }

    private static int determineBestMinPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("483515d2", new Object[0])).intValue();
        }
        int countCpuCores = countCpuCores();
        return countCpuCores > 0 ? countCpuCores : Runtime.getRuntime().availableProcessors() * 2;
    }

    private static int countCpuCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18d5d115", new Object[0])).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.taobao.android.task.SaturativeExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : SaturativeExecutor.access$000().matcher(file.getName()).matches();
                }
            }).length;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* loaded from: classes6.dex */
    public static class SaturationAwareBlockingQueue<T> extends LinkedBlockingQueue<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 1;
        private SaturativeExecutor mExecutor;

        static {
            kge.a(1161435400);
        }

        public static /* synthetic */ Object ipc$super(SaturationAwareBlockingQueue saturationAwareBlockingQueue, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != 195222152) {
                if (hashCode != 1107930627) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.offer(objArr[0]));
            }
            return new Boolean(super.add(objArr[0]));
        }

        public SaturationAwareBlockingQueue(int i) {
            super(i);
        }

        public void setExecutor(SaturativeExecutor saturativeExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("251df7bf", new Object[]{this, saturativeExecutor});
            } else {
                this.mExecutor = saturativeExecutor;
            }
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean add(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, t})).booleanValue();
            }
            if (this.mExecutor.isReallyUnsaturated()) {
                throw new IllegalStateException("Unsaturated");
            }
            return super.add(t);
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4209ae03", new Object[]{this, t})).booleanValue();
            }
            if (!this.mExecutor.isReallyUnsaturated()) {
                return super.offer(t);
            }
            return false;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
        public void put(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29ab6e72", new Object[]{this, t});
                return;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
        public boolean offer(T t, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e208fef7", new Object[]{this, t, new Long(j), timeUnit})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes6.dex */
    public static class CountedTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger mNumRunning;
        public Runnable mRunnable;

        public CountedTask(Runnable runnable) {
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mNumRunning.incrementAndGet();
            try {
                this.mRunnable.run();
            } finally {
                mNumRunning.decrementAndGet();
            }
        }

        static {
            kge.a(-400753637);
            kge.a(-1390502639);
            mNumRunning = new AtomicInteger();
        }
    }
}
