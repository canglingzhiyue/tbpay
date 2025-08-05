package com.taobao.tao.log.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes8.dex */
public enum MainAnrOptThreadPool {
    INSTANCE;
    
    private static final int QUEUE_SIZE = 2000;
    private static final String TAG = "TLog.MainAnrOpt";
    private final ThreadPoolExecutor anrOptMainLogExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(1, 1, 5, TimeUnit.SECONDS, new ArrayBlockingQueue(2000), new h() { // from class: com.taobao.tao.log.utils.MainAnrOptThreadPool.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "tlog-main-thread-anr-opt";
        }
    }, new a());

    MainAnrOptThreadPool() {
        this.anrOptMainLogExecutor.allowCoreThreadTimeOut(true);
    }

    public static void execute(Runnable runnable) {
        INSTANCE.anrOptMainLogExecutor.execute(runnable);
    }

    /* loaded from: classes8.dex */
    public static class a extends ThreadPoolExecutor.CallerRunsPolicy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1827591829);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1083873583) {
                super.rejectedExecution((Runnable) objArr[0], (ThreadPoolExecutor) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy, java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            super.rejectedExecution(runnable, threadPoolExecutor);
            TLogEventHelper.b(com.taobao.tao.log.statistics.d.DP2_TLOG_ERROR_EVENT, com.taobao.tao.log.statistics.d.TLOG_ERROR_THREADPOOL_REJECTED, "totalTask=" + threadPoolExecutor.getTaskCount() + ", completedTask=" + threadPoolExecutor.getCompletedTaskCount());
        }
    }
}
