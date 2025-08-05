package com.alipay.mobile.common.transport.concurrent;

import android.content.Context;
import com.alipay.mobile.common.transport.concurrent.NetThreadPoolExeFactory;
import com.alipay.mobile.common.transport.http.HttpTask;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public class TaskExecutorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaskExecutorManager";
    public static final int TASK_TYPE_AMR = 3;
    public static final int TASK_TYPE_AMR_URGENT = 8;
    public static final int TASK_TYPE_BG_RPC = 1;
    public static final int TASK_TYPE_FG_MULTIMEDIA = 5;
    public static final int TASK_TYPE_FG_RPC = 0;
    public static final int TASK_TYPE_H5 = 6;
    public static final int TASK_TYPE_IMG = 2;
    public static final int TASK_TYPE_LOG = 7;
    public static final int TASK_TYPE_URGENT = 4;

    /* renamed from: a  reason: collision with root package name */
    private static TaskExecutorManager f5523a;
    private ActThreadPoolExecutor b = null;
    private ActThreadPoolExecutor c = null;
    private ActThreadPoolExecutor d = null;
    private ActThreadPoolExecutor e = null;
    private ActThreadPoolExecutor f = null;
    private ActThreadPoolExecutor g = null;
    private ActThreadPoolExecutor h = null;
    private ActThreadPoolExecutor i = null;
    private ActThreadPoolExecutor j = null;
    private FIFOPolicy k = null;
    private Context l;
    private TaskDoneObserver m;

    /* loaded from: classes3.dex */
    public class TaskDoneObserver implements Observer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public TaskDoneObserver() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            }
        }
    }

    private TaskExecutorManager() {
    }

    private TaskExecutorManager(Context context) {
        this.l = context;
    }

    public static TaskExecutorManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskExecutorManager) ipChange.ipc$dispatch("162a0676", new Object[]{context});
        }
        TaskExecutorManager taskExecutorManager = f5523a;
        if (taskExecutorManager != null) {
            return taskExecutorManager;
        }
        synchronized (TaskExecutorManager.class) {
            if (f5523a == null) {
                f5523a = new TaskExecutorManager(context);
            }
        }
        return f5523a;
    }

    public FutureTask execute(ZFutureTask zFutureTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("951b6d18", new Object[]{this, zFutureTask});
        }
        ActThreadPoolExecutor a2 = a(zFutureTask.getTaskType());
        if (zFutureTask instanceof HttpTask) {
            ((HttpTask) zFutureTask).setCurrentThreadPoolExecutor(a2);
        }
        a(zFutureTask, a2);
        zFutureTask.addDoneObserver(b());
        try {
            a2.execute(zFutureTask);
            return zFutureTask;
        } catch (Exception e) {
            LogCatUtil.error(TAG, "execute ex:" + a2.toString(), e);
            throw new RuntimeException(e);
        }
    }

    private void a(ZFutureTask zFutureTask, ActThreadPoolExecutor actThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e899eaff", new Object[]{this, zFutureTask, actThreadPoolExecutor});
            return;
        }
        String a2 = a(actThreadPoolExecutor);
        LogCatUtil.info(TAG, a2 + "  TaskId: " + zFutureTask.getTaskId());
    }

    public ActThreadPoolExecutor getFgExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("259d3f9b", new Object[]{this}) : c(this.l, a());
    }

    public ActThreadPoolExecutor getH5Executor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("ab4d47a7", new Object[]{this}) : d(this.l, a());
    }

    public ActThreadPoolExecutor getBgExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("6ad7971f", new Object[]{this}) : a(this.l, a());
    }

    public ActThreadPoolExecutor getImgExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("ecd65171", new Object[]{this}) : f(this.l, a());
    }

    public ActThreadPoolExecutor getAmrExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("562e3574", new Object[]{this}) : g(this.l, a());
    }

    public ActThreadPoolExecutor getAmrUrgentExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("11465ed5", new Object[]{this}) : h(this.l, a());
    }

    public ActThreadPoolExecutor getUrgentExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("42341b1b", new Object[]{this}) : i(this.l, a());
    }

    public ActThreadPoolExecutor getFgMultimediaExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("4ffecb46", new Object[]{this}) : e(this.l, a());
    }

    public ActThreadPoolExecutor getLogExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActThreadPoolExecutor) ipChange.ipc$dispatch("40acb2f2", new Object[]{this}) : b(this.l, a());
    }

    public synchronized void closeAllSingleThreadPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023ff5e", new Object[]{this});
            return;
        }
        closeThreadPool(this.b);
        this.b = null;
        closeThreadPool(this.c);
        this.c = null;
        closeThreadPool(this.d);
        this.d = null;
        closeThreadPool(this.e);
        this.e = null;
        closeThreadPool(this.g);
        this.g = null;
        closeThreadPool(this.i);
        this.i = null;
        closeThreadPool(this.j);
        this.j = null;
        closeThreadPool(this.f);
        this.f = null;
    }

    public void closeThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceaef66b", new Object[]{this, threadPoolExecutor});
        } else if (threadPoolExecutor == null) {
        } else {
            try {
                threadPoolExecutor.shutdown();
            } catch (Exception e) {
                LogCatUtil.warn(TAG, "closeThreadPool exception : " + e.toString());
            }
        }
    }

    private ActThreadPoolExecutor a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("b32cce05", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 0:
                ActThreadPoolExecutor fgExecutor = getFgExecutor();
                fgExecutor.setTaskTypeName("TASK_TYPE_FG_RPC");
                fgExecutor.setTaskType(i);
                return fgExecutor;
            case 1:
                ActThreadPoolExecutor bgExecutor = getBgExecutor();
                bgExecutor.setTaskTypeName("TASK_TYPE_BG_RPC");
                bgExecutor.setTaskType(i);
                return bgExecutor;
            case 2:
                ActThreadPoolExecutor imgExecutor = getImgExecutor();
                imgExecutor.setTaskTypeName("TASK_TYPE_IMG");
                imgExecutor.setTaskType(i);
                return imgExecutor;
            case 3:
            default:
                ActThreadPoolExecutor amrExecutor = getAmrExecutor();
                amrExecutor.setTaskTypeName("TASK_TYPE_AMR");
                amrExecutor.setTaskType(i);
                return amrExecutor;
            case 4:
                ActThreadPoolExecutor urgentExecutor = getUrgentExecutor();
                urgentExecutor.setTaskTypeName("TASK_TYPE_URGENT");
                urgentExecutor.setTaskType(i);
                return urgentExecutor;
            case 5:
                ActThreadPoolExecutor fgMultimediaExecutor = getFgMultimediaExecutor();
                fgMultimediaExecutor.setTaskTypeName("TASK_TYPE_FG_MULTIMEDIA");
                fgMultimediaExecutor.setTaskType(i);
                return fgMultimediaExecutor;
            case 6:
                ActThreadPoolExecutor h5Executor = getH5Executor();
                h5Executor.setTaskTypeName("TASK_TYPE_H5");
                h5Executor.setTaskType(i);
                return h5Executor;
            case 7:
                ActThreadPoolExecutor logExecutor = getLogExecutor();
                logExecutor.setTaskTypeName("TASK_TYPE_LOG");
                logExecutor.setTaskType(i);
                return logExecutor;
            case 8:
                ActThreadPoolExecutor amrUrgentExecutor = getAmrUrgentExecutor();
                amrUrgentExecutor.setTaskTypeName("TASK_TYPE_AMR_URGENT");
                amrUrgentExecutor.setTaskType(i);
                return amrUrgentExecutor;
        }
    }

    /* loaded from: classes3.dex */
    public static final class FIFOPolicy implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private FIFOPolicy() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
            } else if (threadPoolExecutor.isShutdown()) {
            } else {
                Runnable poll = threadPoolExecutor.getQueue().poll();
                if (poll instanceof ZFutureTask) {
                    ZFutureTask zFutureTask = (ZFutureTask) poll;
                    zFutureTask.fail(new Exception("Time out."));
                    LogCatUtil.debug(TaskExecutorManager.TAG, "FIFOPolicy give up, taskId: " + zFutureTask.getTaskId());
                }
                threadPoolExecutor.execute(runnable);
            }
        }
    }

    private FIFOPolicy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FIFOPolicy) ipChange.ipc$dispatch("fc673eec", new Object[]{this});
        }
        FIFOPolicy fIFOPolicy = this.k;
        if (fIFOPolicy != null) {
            return fIFOPolicy;
        }
        this.k = new FIFOPolicy();
        return this.k;
    }

    private ActThreadPoolExecutor a(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("e63e2523", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.b;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = NetThreadPoolExeFactory.getBgThreadPool(context, rejectedExecutionHandler);
            }
        }
        return this.b;
    }

    private ActThreadPoolExecutor b(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("1ec6f324", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.j;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = NetThreadPoolExeFactory.getBgThreadPool(context, rejectedExecutionHandler);
                this.j.setThreadFactory(new NetThreadPoolExeFactory.NetThreadFactory("log"));
            }
        }
        return this.j;
    }

    private ActThreadPoolExecutor c(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("574fc125", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.c;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = NetThreadPoolExeFactory.getFgThreadPool(context, rejectedExecutionHandler);
            }
        }
        return this.c;
    }

    private ActThreadPoolExecutor d(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("8fd88f26", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.i;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = NetThreadPoolExeFactory.getH5ThreadPool(context, rejectedExecutionHandler);
                this.i.setThreadFactory(new NetThreadPoolExeFactory.NetThreadFactory("h5"));
            }
        }
        return this.i;
    }

    private ActThreadPoolExecutor e(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("c8615d27", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.h;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = NetThreadPoolExeFactory.getFgMultimediaThreadPool(context, rejectedExecutionHandler);
            }
        }
        return this.h;
    }

    private ActThreadPoolExecutor f(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("ea2b28", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.d;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = NetThreadPoolExeFactory.getImgThreadPool(context, rejectedExecutionHandler);
            }
        }
        return this.d;
    }

    private ActThreadPoolExecutor g(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("3972f929", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.e;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = NetThreadPoolExeFactory.getAmrThreadPool(context, rejectedExecutionHandler);
            }
        }
        return this.e;
    }

    private ActThreadPoolExecutor h(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("71fbc72a", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.f;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = NetThreadPoolExeFactory.getAmrUrgentThreadPool(context, rejectedExecutionHandler);
            }
        }
        return this.f;
    }

    private ActThreadPoolExecutor i(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("aa84952b", new Object[]{this, context, rejectedExecutionHandler});
        }
        ActThreadPoolExecutor actThreadPoolExecutor = this.g;
        if (actThreadPoolExecutor != null) {
            return actThreadPoolExecutor;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = NetThreadPoolExeFactory.getUrgentThreadPool(context, rejectedExecutionHandler);
            }
        }
        return this.g;
    }

    private String a(ActThreadPoolExecutor actThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b0f68e", new Object[]{this, actThreadPoolExecutor});
        }
        try {
            return String.format(getClass().getSimpleName() + "#" + hashCode() + ": TaskTypeName = %s, Active Task = %d, Completed Task = %d, All Task = %d, Queue Size = %d", actThreadPoolExecutor.getTaskTypeName(), Integer.valueOf(actThreadPoolExecutor.getActiveCount()), Long.valueOf(actThreadPoolExecutor.getCompletedTaskCount()), Long.valueOf(actThreadPoolExecutor.getTaskCount()), Integer.valueOf(actThreadPoolExecutor.getQueue().size()));
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "dumpPerf log exception : " + e.toString());
            return "";
        }
    }

    private TaskDoneObserver b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskDoneObserver) ipChange.ipc$dispatch("5004d0cc", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new TaskDoneObserver();
        }
        return this.m;
    }
}
