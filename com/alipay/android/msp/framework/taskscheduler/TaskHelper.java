package com.alipay.android.msp.framework.taskscheduler;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class TaskHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile TaskHelper f4879a;
    private static ThreadPoolExecutor c;
    private static ThreadPoolExecutor h;
    private final Handler b = new SafeHandler(Looper.getMainLooper());
    private static final ConcurrentHashMap<String, Handler> d = new ConcurrentHashMap<>();
    private static final Object e = new Object();
    private static final RejectedExecutionHandler f = new RejectedExecutionHandler() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            LogUtil.record(8, "TaskHelper:rejectedExecution", "coreSize=" + threadPoolExecutor.getCorePoolSize() + " activeCnt=" + threadPoolExecutor.getActiveCount() + " poolSize=" + threadPoolExecutor.getPoolSize());
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "ThreadPoolFull", "executorPool");
            synchronized (this) {
                if (TaskHelper.a() == null) {
                    TaskHelper.a(new ThreadPoolExecutor(2, 2, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable2});
                            }
                            return new Thread(runnable2, "MspTaskHelper BP#" + System.currentTimeMillis());
                        }
                    }));
                    TaskHelper.a().allowCoreThreadTimeOut(true);
                }
            }
            TaskHelper.a().execute(runnable);
        }
    };
    public static int MAXIMUM_POOL_SIZE = 32;
    private static final ThreadPoolExecutor g = new ThreadPoolExecutor(2, 2, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f4882a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "MspAIThread #" + this.f4882a.getAndIncrement());
        }
    }, new RejectedExecutionHandler() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            LogUtil.record(8, "MspAIThread:rejectedExecution", "coreSize=" + threadPoolExecutor.getCorePoolSize() + " activeCnt=" + threadPoolExecutor.getActiveCount() + " poolSize=" + threadPoolExecutor.getPoolSize());
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "ThreadPoolFull", "aiPool");
        }
    });
    private static final ScheduledThreadPoolExecutor i = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f4883a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "MspDelayThread #" + this.f4883a.getAndIncrement());
        }
    });
    private static final ThreadPoolExecutor j = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f4884a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "MspFixNumThread #" + this.f4884a.getAndIncrement());
        }
    });

    /* loaded from: classes3.dex */
    public interface ThreadName {
        public static final String EventAction = "eventAction";
        public static final String UI_ACTIVITY = "uiActivity";
        public static final String UI_CONTEXT = "uiMspContext";
        public static final String UI_PAD = "uiPad";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface MspBziThreadName {
        }
    }

    public static /* synthetic */ ThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("26487748", new Object[0]) : c;
    }

    public static /* synthetic */ ThreadPoolExecutor a(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("6d535328", new Object[]{threadPoolExecutor});
        }
        c = threadPoolExecutor;
        return threadPoolExecutor;
    }

    static {
        try {
            if (h != null) {
                h.allowCoreThreadTimeOut(true);
            }
            g.allowCoreThreadTimeOut(true);
            j.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private static ThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c0e939c9", new Object[0]);
        }
        if (h == null) {
            synchronized (TaskHelper.class) {
                if (h == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, MAXIMUM_POOL_SIZE, 2L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        private final AtomicInteger f4881a = new AtomicInteger(1);

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                            }
                            LogUtil.record(8, "TaskHelper:new create", "coreSize=4 kat=2");
                            return new Thread(runnable, "MspTaskHelper NEW #" + this.f4881a.getAndIncrement());
                        }
                    }, f);
                    h = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return h;
    }

    public static TaskHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskHelper) ipChange.ipc$dispatch("9b0b764a", new Object[0]);
        }
        if (f4879a == null) {
            synchronized (TaskHelper.class) {
                if (f4879a == null) {
                    f4879a = new TaskHelper();
                }
            }
        }
        return f4879a;
    }

    private TaskHelper() {
    }

    public static Handler provideMainHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5a4fb6ef", new Object[0]) : getInstance().b;
    }

    public static void runOnUIThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
        } else {
            getInstance().b.post(runnable);
        }
    }

    public static void runOnUIThreadAsFast(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cf02db", new Object[]{runnable});
        } else if (isMainThread()) {
            runnable.run();
        } else {
            getInstance().b.post(runnable);
        }
    }

    public static void runOnUIThread(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afd1d67", new Object[]{runnable, new Boolean(z)});
        } else if (z) {
            if (isMainThread()) {
                runnable.run();
            } else {
                getInstance().b.postAtFrontOfQueue(runnable);
            }
        } else {
            getInstance().b.post(runnable);
        }
    }

    public static void runOnUIThread(Runnable runnable, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afce157", new Object[]{runnable, new Long(j2)});
        } else {
            getInstance().b.postDelayed(runnable, j2);
        }
    }

    public static boolean isMainThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue() : Thread.currentThread() == getInstance().b.getLooper().getThread();
    }

    public static <V> Future<V> submitTask(Callable<V> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("668d79e3", new Object[]{callable}) : b().submit(callable);
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            b().execute(runnable);
        }
    }

    public static void executeForAI(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f4f1c1", new Object[]{runnable});
        } else {
            g.execute(runnable);
        }
    }

    public static void execute(Runnable runnable, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467280a", new Object[]{runnable, new Long(j2)});
        } else if (!(runnable instanceof MonitorRunnable)) {
            i.schedule(new MonitorRunnable(runnable, j2), j2, TimeUnit.MILLISECONDS);
        } else {
            i.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        }
    }

    public void executeDelayed(Runnable runnable, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2603a39c", new Object[]{this, runnable, new Long(j2), str});
            return;
        }
        try {
            getInstance();
            Handler a2 = a(str);
            if (a2 == null) {
                LogUtil.record(8, "TaskHelper:execute", "handler null : ".concat(String.valueOf(str)));
            } else {
                a2.postDelayed(new MonitorRunnable(runnable, j2), j2);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private static Handler a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7cadc154", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Handler handler = d.get(str);
        if (handler != null) {
            return handler;
        }
        synchronized (e) {
            if (!d.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str);
                handlerThread.start();
                d.put(str, new Handler(handlerThread.getLooper()));
            }
        }
        return d.get(str);
    }

    public static void executeCursur(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3f926a", new Object[]{runnable});
        } else {
            j.execute(runnable);
        }
    }
}
