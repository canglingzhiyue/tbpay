package com.taobao.android.task;

import android.net.TrafficStats;
import android.os.AsyncTask;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.e;
import com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.jqm;
import tb.kge;

/* loaded from: classes.dex */
public class Coordinator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int QUEUE_PRIORITY_DECODE_IMAGE = 27;
    public static final int QUEUE_PRIORITY_EMERGENCY = 10;
    public static final int QUEUE_PRIORITY_IMPORTANT = 20;
    public static final int QUEUE_PRIORITY_LOWER = 50;
    public static final int QUEUE_PRIORITY_NORMAL = 30;
    public static final int QUEUE_PRIORITY_NORMAL_DOWNLOAD = 35;
    public static final int QUEUE_PRIORITY_ON_IDLE = 100;
    public static final int QUEUE_PRIORITY_PATCH_DOWNLOAD = 21;
    public static final int QUEUE_PRIORITY_REQUEST_DATA = 23;
    public static final int QUEUE_PRIORITY_REQUEST_IMAGE = 28;
    public static final int QUEUE_PRIORITY_UNIMPORTANT = 90;
    public static final String TAG = "Coord";
    public static final Queue<TaggedRunnable> mIdleTasks;
    public static final BlockingQueue<Runnable> mPoolWorkQueue;
    public static Field sOuterField;
    public static ThreadInfoListener sThreadInfoListener;
    public static final CoordThreadPoolExecutor sThreadPoolExecutor;

    /* loaded from: classes.dex */
    public interface PriorityQueue {
        int getQueuePriority();
    }

    /* loaded from: classes6.dex */
    public interface ThreadInfoListener {
        void threadInfo(int i, String str, long j, long j2, long j3, String str2, int i2, ThreadPoolExecutor threadPoolExecutor);
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final Handler f15322a;

        static {
            kge.a(-2043738163);
            f15322a = new Handler(d.f15323a.getLooper());
        }
    }

    /* loaded from: classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static final HandlerThread f15323a;

        static {
            kge.a(1801019199);
            HandlerThread handlerThread = new HandlerThread("SKI_Worker");
            f15323a = handlerThread;
            handlerThread.start();
        }
    }

    static {
        kge.a(157734489);
        mIdleTasks = new LinkedList();
        mPoolWorkQueue = new PriorityBlockingQueue(100, new a());
        CoordThreadPoolExecutor coordThreadPoolExecutor = new CoordThreadPoolExecutor(8, 16, 1L, TimeUnit.MINUTES, mPoolWorkQueue, new e() { // from class: com.taobao.android.task.Coordinator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.e
            public VirtualThread a(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (VirtualThread) ipChange.ipc$dispatch("ac603360", new Object[]{this, runnable});
                }
                return new VirtualThread(runnable, "ski_" + runnable.getClass().getName());
            }
        }, new CoordinatorRejectHandler());
        sThreadPoolExecutor = coordThreadPoolExecutor;
        coordThreadPoolExecutor.allowCoreThreadTimeOut(true);
        SaturativeExecutor.installAsDefaultAsyncTaskExecutor(sThreadPoolExecutor);
    }

    /* loaded from: classes.dex */
    public static abstract class TaggedRunnable implements PriorityQueue, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String mName;
        public int mQueuePriority;
        public int mThreadPriority;
        public int mTrafficTag;

        static {
            kge.a(969655924);
            kge.a(-1390502639);
            kge.a(1798432418);
        }

        public TaggedRunnable(String str) {
            this.mTrafficTag = 0;
            this.mQueuePriority = 30;
            this.mThreadPriority = 10;
            this.mName = str;
        }

        public TaggedRunnable(String str, int i) {
            this.mTrafficTag = 0;
            this.mQueuePriority = 30;
            this.mThreadPriority = 10;
            this.mName = str;
            int i2 = 100;
            if (i < 0) {
                i2 = 0;
            } else if (i <= 100) {
                i2 = i;
            }
            this.mQueuePriority = i2;
        }

        @Override // com.taobao.android.task.Coordinator.PriorityQueue
        public int getQueuePriority() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0056f19", new Object[]{this})).intValue() : this.mQueuePriority;
        }

        public void setTrafficTag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8709145d", new Object[]{this, new Integer(i)});
            } else {
                this.mTrafficTag = i;
            }
        }

        public void setThreadPriority(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42d4ca8c", new Object[]{this, new Integer(i)});
                return;
            }
            if (i <= 0) {
                i = 1;
            }
            this.mThreadPriority = i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            String str = this.mName;
            if (str != null) {
                return str;
            }
            return getClass().getName() + '@' + this.mName;
        }
    }

    public static void setThreadInfoListener(ThreadInfoListener threadInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373b608d", new Object[]{threadInfoListener});
        } else if (jqm.a()) {
            sThreadInfoListener = threadInfoListener;
        } else {
            sThreadInfoListener = null;
        }
    }

    /* loaded from: classes.dex */
    public static class a<Runnable> implements Comparator<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-620015131);
            kge.a(-2099169482);
        }

        @Override // java.util.Comparator
        public int compare(Runnable runnable, Runnable runnable2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, runnable, runnable2})).intValue();
            }
            if ((runnable instanceof b) && (runnable2 instanceof b)) {
                b bVar = (b) runnable;
                b bVar2 = (b) runnable2;
                if (bVar.getQueuePriority() > bVar2.getQueuePriority()) {
                    return 1;
                }
                if (bVar.getQueuePriority() < bVar2.getQueuePriority()) {
                    return -1;
                }
            }
            return 0;
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822d4487", new Object[]{taggedRunnable});
        } else {
            postTask(taggedRunnable, Priority.DEFAULT);
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable, Priority priority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87959ebb", new Object[]{taggedRunnable, priority});
        } else {
            sThreadPoolExecutor.execute(new b(taggedRunnable));
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37bbf5c", new Object[]{taggedRunnable, new Integer(i)});
        } else {
            execute(taggedRunnable, 10, i);
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

    public static void execute(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44672449", new Object[]{runnable, new Integer(i)});
        } else {
            sThreadPoolExecutor.execute(runnable, i);
        }
    }

    public static void postTaskToHandler(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe4030f", new Object[]{runnable});
        } else {
            c.f15322a.post(runnable);
        }
    }

    public static void removeTaskFromHandler(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c438dc", new Object[]{runnable});
        } else {
            c.f15322a.removeCallbacks(runnable);
        }
    }

    @Deprecated
    public static void execute(TaggedRunnable taggedRunnable, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ccc857", new Object[]{taggedRunnable, new Integer(i), new Integer(i2)});
            return;
        }
        final b bVar = new b(taggedRunnable);
        if (i <= 0) {
            i = 1;
        }
        taggedRunnable.mQueuePriority = i;
        if (i2 > 0) {
            c.f15322a.postDelayed(new Runnable() { // from class: com.taobao.android.task.Coordinator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Coordinator.sThreadPoolExecutor.execute(b.this);
                    }
                }
            }, i2);
        } else {
            sThreadPoolExecutor.execute(bVar);
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable, Priority priority, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1eaba8", new Object[]{taggedRunnable, priority, new Integer(i)});
        } else {
            execute(taggedRunnable, 10, i);
        }
    }

    @Deprecated
    public static void removeDelayTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756deec6", new Object[]{taggedRunnable});
        } else {
            c.f15322a.removeMessages(taggedRunnable.hashCode());
        }
    }

    @Deprecated
    public static void postIdleTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c1227b", new Object[]{taggedRunnable});
        } else {
            mIdleTasks.add(taggedRunnable);
        }
    }

    @Deprecated
    public static void runTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc253bf2", new Object[]{taggedRunnable});
        } else {
            runWithTiming(taggedRunnable);
        }
    }

    @Deprecated
    public static void scheduleIdleTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af92c24a", new Object[0]);
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.task.Coordinator.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    TaggedRunnable poll = Coordinator.mIdleTasks.poll();
                    if (poll == null) {
                        return false;
                    }
                    Coordinator.postTask(poll);
                    return !Coordinator.mIdleTasks.isEmpty();
                }
            });
        }
    }

    public static String getStandaloneTaskClassName(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87e865c0", new Object[]{bVar});
        }
        if (bVar.f15321a instanceof TaggedRunnable) {
            return ((TaggedRunnable) bVar.f15321a).toString();
        }
        return getNormalTaskClassName(bVar.f15321a);
    }

    public static String getNormalTaskClassName(Runnable runnable) {
        String name = runnable.getClass().getName();
        if (name != null) {
            try {
                if (!name.contains("AsyncTask$")) {
                    return name;
                }
                if (sOuterField == null) {
                    Field declaredField = runnable.getClass().getDeclaredField("this$0");
                    sOuterField = declaredField;
                    declaredField.setAccessible(true);
                }
                return sOuterField.get(runnable).getClass().getName();
            } catch (Exception unused) {
                return name;
            }
        }
        return name;
    }

    /* JADX WARN: Finally extract failed */
    public static void runWithTiming(Runnable runnable) {
        long j;
        String normalTaskClassName;
        String normalTaskClassName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b0a20", new Object[]{runnable});
            return;
        }
        long j2 = 0;
        if (sThreadInfoListener != null) {
            j = System.currentTimeMillis();
            j2 = Debug.threadCpuTimeNanos();
        } else {
            j = 0;
        }
        int myTid = Process.myTid();
        if (Looper.getMainLooper() != Looper.myLooper()) {
            int i = 10;
            if (runnable instanceof TaggedRunnable) {
                i = ((TaggedRunnable) runnable).mThreadPriority;
            }
            try {
                Process.setThreadPriority(i);
            } catch (Throwable unused) {
            }
        }
        try {
            runnable.run();
            if (sThreadInfoListener == null) {
                return;
            }
            long threadCpuTimeNanos = (Debug.threadCpuTimeNanos() - j2) / 1000000;
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (sThreadInfoListener == null) {
                return;
            }
            int queuePriority = runnable instanceof PriorityQueue ? ((PriorityQueue) runnable).getQueuePriority() : 30;
            if (runnable instanceof b) {
                normalTaskClassName2 = getStandaloneTaskClassName((b) runnable);
            } else {
                normalTaskClassName2 = getNormalTaskClassName(runnable);
            }
            sThreadInfoListener.threadInfo(myTid, normalTaskClassName2, j, currentTimeMillis, threadCpuTimeNanos, runnable.getClass().getName(), queuePriority, sThreadPoolExecutor);
        } catch (Throwable th) {
            try {
                String str = "Throwable in " + runnable;
                throw th;
            } catch (Throwable th2) {
                if (sThreadInfoListener != null) {
                    long threadCpuTimeNanos2 = (Debug.threadCpuTimeNanos() - j2) / 1000000;
                    long currentTimeMillis2 = System.currentTimeMillis() - j;
                    if (sThreadInfoListener != null) {
                        int queuePriority2 = runnable instanceof PriorityQueue ? ((PriorityQueue) runnable).getQueuePriority() : 30;
                        if (runnable instanceof b) {
                            normalTaskClassName = getStandaloneTaskClassName((b) runnable);
                        } else {
                            normalTaskClassName = getNormalTaskClassName(runnable);
                        }
                        sThreadInfoListener.threadInfo(myTid, normalTaskClassName, j, currentTimeMillis2, threadCpuTimeNanos2, runnable.getClass().getName(), queuePriority2, sThreadPoolExecutor);
                    }
                }
                throw th2;
            }
        }
    }

    public static Executor getDefaultAsyncTaskExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("a1a4ca56", new Object[0]) : AsyncTask.SERIAL_EXECUTOR;
    }

    public static void dumpTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da75d9a0", new Object[0]);
            return;
        }
        Object[] array = mPoolWorkQueue.toArray();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (Object obj : array) {
            if (obj.getClass().isAnonymousClass()) {
                sb.append(getOuterClass(obj));
                sb.append(android.taobao.windvane.cache.c.DIVISION);
                sb.append(' ');
            } else {
                sb.append(obj);
                sb.append('>');
                sb.append(' ');
            }
        }
        sb.append(']');
        String str = "Task size:" + array.length + " --" + sb.toString();
    }

    /* loaded from: classes.dex */
    public static class CoordinatorRejectHandler implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(907306342);
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
                    sb.append(android.taobao.windvane.cache.c.DIVISION);
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

    public static ThreadPoolExecutor getDefaultThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("3ea91c0b", new Object[0]) : sThreadPoolExecutor;
    }

    public static Looper getWorkerLooper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("ef71e9c1", new Object[0]) : d.f15323a.getLooper();
    }

    /* loaded from: classes.dex */
    public static class CoordThreadPoolExecutor extends StubThreadPoolExecutor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(122899107);
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

        public CoordThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, e eVar, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, eVar, rejectedExecutionHandler);
        }

        public void execute(Runnable runnable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44672449", new Object[]{this, runnable, new Integer(i)});
            } else if (runnable instanceof b) {
                super.execute(runnable);
            } else {
                b bVar = new b(runnable);
                if (i <= 0) {
                    i = 1;
                }
                bVar.b = i;
                super.execute(bVar);
            }
        }

        @Override // com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else if (runnable instanceof b) {
                super.execute(runnable);
            } else {
                super.execute(new b(runnable));
            }
        }

        @Override // com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(Thread thread, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
                return;
            }
            super.beforeExecute(thread, runnable);
            if (runnable instanceof b) {
                b bVar = (b) runnable;
                if (bVar.f15321a instanceof TaggedRunnable) {
                    TaggedRunnable taggedRunnable = (TaggedRunnable) bVar.f15321a;
                    thread.setName("ski_" + taggedRunnable.toString());
                    TrafficStats.setThreadStatsTag(taggedRunnable.mTrafficTag);
                    return;
                }
                thread.setName("ski_" + bVar.f15321a.getClass().getName() + "");
                return;
            }
            thread.setName("ski_" + runnable.getClass().getName() + "");
        }

        @Override // com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
                return;
            }
            super.afterExecute(runnable, th);
            if (!(runnable instanceof b) || !(((b) runnable).f15321a instanceof TaggedRunnable)) {
                return;
            }
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements PriorityQueue, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f15321a;
        public int b = 30;

        static {
            kge.a(-1919145675);
            kge.a(-1390502639);
            kge.a(1798432418);
        }

        public b(Runnable runnable) {
            this.f15321a = runnable;
        }

        @Override // com.taobao.android.task.Coordinator.PriorityQueue
        public int getQueuePriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c0056f19", new Object[]{this})).intValue();
            }
            Runnable runnable = this.f15321a;
            if (runnable instanceof PriorityQueue) {
                return ((PriorityQueue) runnable).getQueuePriority();
            }
            return this.b;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Coordinator.runWithTiming(this.f15321a);
            }
        }
    }
}
