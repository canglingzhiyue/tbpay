package com.alipay.mobile.verifyidentity.utils.task.pool;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.alipay.mobile.verifyidentity.log.VITraceLogger;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.task.pool.Pool;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.riy;

/* loaded from: classes3.dex */
public class NamedRunnable implements Pool.Poolable, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AsyncTaskExecutor";
    public static final NamedRunnablePool TASK_POOL = new NamedRunnablePool(9, 17);
    public Runnable mTask;
    public String mThreadName;
    public int mWeight;

    /* loaded from: classes3.dex */
    public static final class NamedRunnablePool extends Pool<NamedRunnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f6105a;

        public static /* synthetic */ Object ipc$super(NamedRunnablePool namedRunnablePool, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1272099756) {
                super.clear();
                return null;
            } else if (hashCode == -710787569) {
                super.free((NamedRunnablePool) objArr[0]);
                return null;
            } else if (hashCode != 626641549) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.freeAll((List) objArr[0]);
                return null;
            }
        }

        public NamedRunnablePool(int i, int i2) {
            super(i, i2);
            this.f6105a = new AtomicInteger(1);
        }

        public final synchronized NamedRunnable obtain(Runnable runnable, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NamedRunnable) ipChange.ipc$dispatch("bed5da4", new Object[]{this, runnable, str});
            }
            return obtain(runnable, str, 0);
        }

        public final synchronized NamedRunnable obtain(Runnable runnable, String str, int i) {
            NamedRunnable namedRunnable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NamedRunnable) ipChange.ipc$dispatch("5775a9a9", new Object[]{this, runnable, str, new Integer(i)});
            }
            if (this.freeObjects.size() == 0) {
                LoggerFactory.getTraceLogger().info("AsyncTaskExecutor", "NamedRunnablePool.obtain(): create a new NamedRunnable obj.");
                namedRunnable = newObject(runnable, str, i);
            } else {
                LoggerFactory.getTraceLogger().info("AsyncTaskExecutor", "NamedRunnablePool.obtain(): hit a cache NamedRunnable obj.");
                NamedRunnable namedRunnable2 = (NamedRunnable) this.freeObjects.pop();
                namedRunnable2.setTask(runnable);
                namedRunnable2.setThreadName(str);
                namedRunnable2.setWeight(i);
                namedRunnable = namedRunnable2;
            }
            return namedRunnable;
        }

        public final NamedRunnable newObject(Runnable runnable, String str, int i) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NamedRunnable) ipChange.ipc$dispatch("a1b72983", new Object[]{this, runnable, str, new Integer(i)});
            }
            if (StringUtils.isEmpty(str)) {
                str2 = "NamedRunable_" + this.f6105a.getAndIncrement();
            } else {
                str2 = "NamedRunable_" + this.f6105a.getAndIncrement() + "_" + str;
            }
            return new NamedRunnable(runnable, str2, i);
        }

        @Override // com.alipay.mobile.verifyidentity.utils.task.pool.Pool
        public final synchronized void free(NamedRunnable namedRunnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d09bbff5", new Object[]{this, namedRunnable});
            } else {
                super.free((NamedRunnablePool) namedRunnable);
            }
        }

        @Override // com.alipay.mobile.verifyidentity.utils.task.pool.Pool
        public final synchronized void freeAll(List<NamedRunnable> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2559ca8d", new Object[]{this, list});
            } else {
                super.freeAll(list);
            }
        }

        @Override // com.alipay.mobile.verifyidentity.utils.task.pool.Pool
        public final synchronized void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                super.clear();
            }
        }
    }

    public NamedRunnable(Runnable runnable, String str, int i) {
        this.mWeight = 0;
        this.mTask = runnable;
        this.mThreadName = str;
        this.mWeight = i;
    }

    public void setThreadName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f0f508", new Object[]{this, str});
        } else {
            this.mThreadName = str;
        }
    }

    public void setTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f47658c", new Object[]{this, runnable});
        } else {
            this.mTask = runnable;
        }
    }

    public void setWeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e944c222", new Object[]{this, new Integer(i)});
        } else {
            this.mWeight = i;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        String str = null;
        if (!StringUtils.isEmpty(this.mThreadName)) {
            str = Thread.currentThread().getName();
            VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("AsyncTaskExecutor", "NamedRunable.run(set ThreadName to:" + this.mThreadName + riy.BRACKET_END_STR);
            Thread currentThread = Thread.currentThread();
            currentThread.setName(str + "_" + this.mThreadName);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.mTask.run();
                long currentTimeMillis2 = System.currentTimeMillis();
                VITraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                traceLogger2.error("AsyncTaskExecutor", riy.ARRAY_START_STR + this.mThreadName + "] cost " + (currentTimeMillis2 - currentTimeMillis) + " ms");
                if (!StringUtils.isEmpty(this.mThreadName)) {
                    VITraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                    traceLogger3.info("AsyncTaskExecutor", "NamedRunable.run(set ThreadName back to:" + str + riy.BRACKET_END_STR);
                    Thread.currentThread().setName(str);
                }
                TASK_POOL.free(this);
                VITraceLogger traceLogger4 = LoggerFactory.getTraceLogger();
                traceLogger4.debug("AsyncTaskExecutor", "NamedRunnable.run()->finish(TASK_POOL.free(this)): pool.size=" + TASK_POOL.freeObjects.size());
            } catch (RpcException e) {
                LoggerFactory.getTraceLogger().error("AsyncTaskExecutor", this.mThreadName, e);
                if (!isInExport()) {
                    throw e;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                VITraceLogger traceLogger5 = LoggerFactory.getTraceLogger();
                traceLogger5.error("AsyncTaskExecutor", riy.ARRAY_START_STR + this.mThreadName + "] cost " + (currentTimeMillis3 - currentTimeMillis) + " ms");
                if (!StringUtils.isEmpty(this.mThreadName)) {
                    VITraceLogger traceLogger6 = LoggerFactory.getTraceLogger();
                    traceLogger6.info("AsyncTaskExecutor", "NamedRunable.run(set ThreadName back to:" + str + riy.BRACKET_END_STR);
                    Thread.currentThread().setName(str);
                }
                TASK_POOL.free(this);
                VITraceLogger traceLogger7 = LoggerFactory.getTraceLogger();
                traceLogger7.debug("AsyncTaskExecutor", "NamedRunnable.run()->finish(TASK_POOL.free(this)): pool.size=" + TASK_POOL.freeObjects.size());
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("AsyncTaskExecutor", this.mThreadName, th);
                long currentTimeMillis4 = System.currentTimeMillis();
                VITraceLogger traceLogger8 = LoggerFactory.getTraceLogger();
                traceLogger8.error("AsyncTaskExecutor", riy.ARRAY_START_STR + this.mThreadName + "] cost " + (currentTimeMillis4 - currentTimeMillis) + " ms");
                if (!StringUtils.isEmpty(this.mThreadName)) {
                    VITraceLogger traceLogger9 = LoggerFactory.getTraceLogger();
                    traceLogger9.info("AsyncTaskExecutor", "NamedRunable.run(set ThreadName back to:" + str + riy.BRACKET_END_STR);
                    Thread.currentThread().setName(str);
                }
                TASK_POOL.free(this);
                VITraceLogger traceLogger10 = LoggerFactory.getTraceLogger();
                traceLogger10.debug("AsyncTaskExecutor", "NamedRunnable.run()->finish(TASK_POOL.free(this)): pool.size=" + TASK_POOL.freeObjects.size());
            }
        } catch (Throwable th2) {
            long currentTimeMillis5 = System.currentTimeMillis();
            VITraceLogger traceLogger11 = LoggerFactory.getTraceLogger();
            traceLogger11.error("AsyncTaskExecutor", riy.ARRAY_START_STR + this.mThreadName + "] cost " + (currentTimeMillis5 - currentTimeMillis) + " ms");
            if (!StringUtils.isEmpty(this.mThreadName)) {
                VITraceLogger traceLogger12 = LoggerFactory.getTraceLogger();
                traceLogger12.info("AsyncTaskExecutor", "NamedRunable.run(set ThreadName back to:" + str + riy.BRACKET_END_STR);
                Thread.currentThread().setName(str);
            }
            TASK_POOL.free(this);
            VITraceLogger traceLogger13 = LoggerFactory.getTraceLogger();
            traceLogger13.debug("AsyncTaskExecutor", "NamedRunnable.run()->finish(TASK_POOL.free(this)): pool.size=" + TASK_POOL.freeObjects.size());
            throw th2;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.utils.task.pool.Pool.Poolable
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mTask = null;
        this.mThreadName = null;
        this.mWeight = 0;
    }

    public static boolean isInExport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77f80f8e", new Object[0])).booleanValue();
        }
        try {
            Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.common.ExportBeacon", "gotThis", null, null);
            if (invokeStaticMethod == null) {
                return false;
            }
            return Boolean.valueOf(String.valueOf(invokeStaticMethod)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}
