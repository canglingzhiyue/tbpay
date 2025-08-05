package com.taobao.login4android.api;

import android.os.Looper;
import android.os.Process;
import android.taobao.windvane.cache.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes7.dex */
public class Coordinator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CORE_POOL_SIZE = 4;
    private static final int KEEP_ALIVE = 4;
    private static final int MAXIMUM_POOL_SIZE = 32;
    public static final int QUEUE_PRIORITY_NORMAL = 30;
    public static final String TAG = "Coordinator";
    public static final BlockingQueue<Runnable> mPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    public static CoordThreadPoolExecutor sThreadPoolExecutor;

    /* loaded from: classes7.dex */
    public interface PriorityQueue {
        int getQueuePriority();
    }

    static {
        kge.a(1252048733);
        mPoolWorkQueue = new PriorityBlockingQueue(100, new PriorityComparator());
        sThreadFactory = new ThreadFactory() { // from class: com.taobao.login4android.api.Coordinator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "login#" + runnable.getClass().getName());
            }
        };
        sThreadPoolExecutor = new CoordThreadPoolExecutor(4, 32, 4L, TimeUnit.SECONDS, mPoolWorkQueue, sThreadFactory, new CoordinatorRejectHandler());
    }

    /* loaded from: classes7.dex */
    public static class PriorityComparator<Runnable> implements Comparator<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1613356447);
            kge.a(-2099169482);
        }

        @Override // java.util.Comparator
        public int compare(Runnable runnable, Runnable runnable2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, runnable, runnable2})).intValue();
            }
            if ((runnable instanceof StandaloneTask) && (runnable2 instanceof StandaloneTask)) {
                StandaloneTask standaloneTask = (StandaloneTask) runnable;
                StandaloneTask standaloneTask2 = (StandaloneTask) runnable2;
                if (standaloneTask.getQueuePriority() > standaloneTask2.getQueuePriority()) {
                    return 1;
                }
                if (standaloneTask.getQueuePriority() < standaloneTask2.getQueuePriority()) {
                    return -1;
                }
            }
            return 0;
        }
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            sThreadPoolExecutor.execute(runnable, 30);
        }
    }

    public static void runWithTiming(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b0a20", new Object[]{runnable});
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            Process.setThreadPriority(10);
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes7.dex */
    public static class CoordinatorRejectHandler implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1795680482);
            kge.a(211959016);
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            Object[] array = Coordinator.mPoolWorkQueue.toArray();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (Object obj : array) {
                if (obj.getClass().isAnonymousClass()) {
                    sb.append(Coordinator.getOuterClass(obj));
                    sb.append(c.DIVISION);
                    sb.append(' ');
                } else {
                    sb.append(obj);
                    sb.append('>');
                    sb.append(' ');
                }
            }
            sb.append(']');
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString() + " in " + sb.toString());
        }
    }

    public static Object getOuterClass(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("this$0");
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return obj;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return obj;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return obj;
        }
    }

    /* loaded from: classes7.dex */
    public static class CoordThreadPoolExecutor extends ThreadPoolExecutor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1952671655);
        }

        public static /* synthetic */ Object ipc$super(CoordThreadPoolExecutor coordThreadPoolExecutor, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 452660730) {
                super.execute((Runnable) objArr[0]);
                return null;
            } else if (hashCode == 1173060588) {
                super.beforeExecute((Thread) objArr[0], (Runnable) objArr[1]);
                return null;
            } else if (hashCode != 1179322935) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.afterExecute((Runnable) objArr[0], (Throwable) objArr[1]);
                return null;
            }
        }

        public CoordThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
            try {
                allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void execute(Runnable runnable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44672449", new Object[]{this, runnable, new Integer(i)});
                return;
            }
            try {
                if (runnable instanceof StandaloneTask) {
                    super.execute(runnable);
                    return;
                }
                StandaloneTask standaloneTask = new StandaloneTask(runnable);
                if (i <= 0) {
                    i = 1;
                }
                standaloneTask.mPriorityQueue = i;
                super.execute(standaloneTask);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(Thread thread, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
                return;
            }
            super.beforeExecute(thread, runnable);
            if (runnable instanceof StandaloneTask) {
                thread.setName(((StandaloneTask) runnable).mRunnable + "");
                return;
            }
            thread.setName(runnable + "");
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
            } else {
                super.afterExecute(runnable, th);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class StandaloneTask implements PriorityQueue, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mPriorityQueue = 30;
        public final Runnable mRunnable;

        static {
            kge.a(-595945551);
            kge.a(-1390502639);
            kge.a(-1345472346);
        }

        public StandaloneTask(Runnable runnable) {
            this.mRunnable = runnable;
        }

        @Override // com.taobao.login4android.api.Coordinator.PriorityQueue
        public int getQueuePriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c0056f19", new Object[]{this})).intValue();
            }
            Runnable runnable = this.mRunnable;
            if (runnable instanceof PriorityQueue) {
                return ((PriorityQueue) runnable).getQueuePriority();
            }
            return this.mPriorityQueue;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Coordinator.runWithTiming(this.mRunnable);
            }
        }
    }
}
