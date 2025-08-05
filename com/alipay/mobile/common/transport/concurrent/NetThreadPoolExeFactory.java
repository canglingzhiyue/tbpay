package com.alipay.mobile.common.transport.concurrent;

import android.content.Context;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.fjp;
import tb.riy;

/* loaded from: classes3.dex */
public final class NetThreadPoolExeFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX_THREAD_NAME = "HttpManager.HttpWorker";

    /* loaded from: classes3.dex */
    public static class ThreadPoolConfig {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int corePoolSize;
        public RejectedExecutionHandler handler;
        public long keepAliveTime;
        public int maximumPoolSize;
        public ThreadFactory threadFactory;
        public BlockingQueue<Runnable> workQueue;
        public String netType = "";
        public TimeUnit timeunit = TimeUnit.SECONDS;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ThreadPoolConfig{netType=");
            sb.append(this.netType);
            sb.append(", corePoolSize=");
            sb.append(this.corePoolSize);
            sb.append(", maximumPoolSize=");
            sb.append(this.maximumPoolSize);
            sb.append(", keepAliveTime=");
            sb.append(this.keepAliveTime);
            sb.append("s , workQueueSize=");
            BlockingQueue<Runnable> blockingQueue = this.workQueue;
            sb.append(blockingQueue != null ? Integer.valueOf(blockingQueue.size()) : "0");
            sb.append(", threadFactory=");
            ThreadFactory threadFactory = this.threadFactory;
            sb.append(threadFactory != null ? threadFactory.getClass().getName() : " is null ");
            sb.append(", handler=");
            RejectedExecutionHandler rejectedExecutionHandler = this.handler;
            sb.append(rejectedExecutionHandler != null ? rejectedExecutionHandler.getClass().getName() : "is null");
            sb.append('}');
            return sb.toString();
        }
    }

    public static ActThreadPoolExecutor getBgThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("9d01d2a3", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig bgThreadPoolConfig = getBgThreadPoolConfig(context);
        if (rejectedExecutionHandler == null) {
            bgThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            bgThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(bgThreadPoolConfig);
    }

    public static ActThreadPoolExecutor getImgThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("6259be75", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig imgThreadPoolConfig = getImgThreadPoolConfig(context);
        if (rejectedExecutionHandler == null) {
            imgThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            imgThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(imgThreadPoolConfig);
    }

    public static ActThreadPoolExecutor getAmrThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("cc0f22b8", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig amrThreadPoolConfig = getAmrThreadPoolConfig(context);
        if (rejectedExecutionHandler == null) {
            amrThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            amrThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(amrThreadPoolConfig);
    }

    public static ActThreadPoolExecutor getAmrUrgentThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("42fe3ed9", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig amrUrgentThreadPoolConfig = getAmrUrgentThreadPoolConfig(context);
        if (rejectedExecutionHandler == null) {
            amrUrgentThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            amrUrgentThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(amrUrgentThreadPoolConfig);
    }

    public static ActThreadPoolExecutor getFgThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("11f2301f", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig fgThreadPoolConfig = getFgThreadPoolConfig();
        if (rejectedExecutionHandler == null) {
            fgThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            fgThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(fgThreadPoolConfig);
    }

    public static ActThreadPoolExecutor getH5ThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("9922392b", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig h5ThreadPoolConfig = getH5ThreadPoolConfig();
        if (rejectedExecutionHandler == null) {
            h5ThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            h5ThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(h5ThreadPoolConfig);
    }

    public static ActThreadPoolExecutor getUrgentThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("10b0ab9f", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig urgentThreadPoolConfig = getUrgentThreadPoolConfig();
        if (rejectedExecutionHandler == null) {
            urgentThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            urgentThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(urgentThreadPoolConfig);
    }

    public static ActThreadPoolExecutor getFgMultimediaThreadPool(Context context, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("5a08a0a", new Object[]{context, rejectedExecutionHandler});
        }
        ThreadPoolConfig fgMultimediaThreadPoolConfig = getFgMultimediaThreadPoolConfig();
        if (rejectedExecutionHandler == null) {
            fgMultimediaThreadPoolConfig.handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        } else {
            fgMultimediaThreadPoolConfig.handler = rejectedExecutionHandler;
        }
        return e(fgMultimediaThreadPoolConfig);
    }

    public static final ThreadPoolConfig getFgThreadPoolConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("44ecd08a", new Object[0]);
        }
        ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig();
        threadPoolConfig.netType = "all";
        threadPoolConfig.threadFactory = new NetThreadFactory("fg");
        setPoolSize(threadPoolConfig, 10);
        threadPoolConfig.keepAliveTime = 30L;
        threadPoolConfig.timeunit = TimeUnit.SECONDS;
        threadPoolConfig.workQueue = new ArrayBlockingQueue(30);
        return threadPoolConfig;
    }

    public static final ThreadPoolConfig getH5ThreadPoolConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("834420fe", new Object[0]);
        }
        ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig();
        threadPoolConfig.netType = "all";
        threadPoolConfig.threadFactory = new NetThreadFactory("h5");
        setPoolSize(threadPoolConfig, 10);
        threadPoolConfig.keepAliveTime = 30L;
        threadPoolConfig.timeunit = TimeUnit.SECONDS;
        threadPoolConfig.workQueue = new LinkedBlockingDeque();
        return threadPoolConfig;
    }

    public static final ThreadPoolConfig getBgThreadPoolConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("700a9012", new Object[]{context});
        }
        int networkType = NetworkUtils.getNetworkType(context);
        ThreadPoolConfig a2 = a(networkType);
        a2.threadFactory = new NetThreadFactory("bg");
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        if (networkType == 1) {
            int intValue = transportConfigureManager.getIntValue(TransportConfigureItem.BG_2G_THREAD_COUNT);
            LogCatUtil.debug("NetThreadPoolExeFactory", "bg 2g threadCount=[" + intValue + riy.ARRAY_END_STR);
            setPoolSize(a2, intValue);
        } else if (networkType == 2) {
            int intValue2 = transportConfigureManager.getIntValue(TransportConfigureItem.BG_3G_THREAD_COUNT);
            LogCatUtil.debug("NetThreadPoolExeFactory", "bg 3g threadCount=[" + intValue2 + riy.ARRAY_END_STR);
            setPoolSize(a2, intValue2);
        } else {
            LogCatUtil.info("NetThreadPoolExeFactory", "No default case!");
        }
        return a2;
    }

    public static final ThreadPoolConfig getImgThreadPoolConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("70cd2564", new Object[]{context});
        }
        int networkType = NetworkUtils.getNetworkType(context);
        ThreadPoolConfig a2 = a(networkType);
        a2.threadFactory = new NetThreadFactory("img");
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        if (networkType == 1) {
            int intValue = transportConfigureManager.getIntValue(TransportConfigureItem.IMG_2G_THREAD_COUNT);
            LogCatUtil.debug("NetThreadPoolExeFactory", "img 2g threadCount=[" + intValue + riy.ARRAY_END_STR);
            setPoolSize(a2, intValue);
        } else if (networkType == 2) {
            int intValue2 = transportConfigureManager.getIntValue(TransportConfigureItem.IMG_2G_THREAD_COUNT);
            LogCatUtil.debug("NetThreadPoolExeFactory", "img 3g threadCount=[" + intValue2 + riy.ARRAY_END_STR);
            setPoolSize(a2, intValue2);
        } else if (networkType != 3 && networkType != 4) {
            return a2;
        } else {
            int intValue3 = transportConfigureManager.getIntValue(TransportConfigureItem.IMG_4G_THREAD_COUNT);
            LogCatUtil.debug("NetThreadPoolExeFactory", "img 4g/wifi threadCount=[" + intValue3 + riy.ARRAY_END_STR);
            setPoolSize(a2, intValue3);
        }
        return a2;
    }

    public static void setPoolSize(ThreadPoolConfig threadPoolConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c54683", new Object[]{threadPoolConfig, new Integer(i)});
            return;
        }
        threadPoolConfig.corePoolSize = i;
        threadPoolConfig.maximumPoolSize = i;
    }

    public static final ThreadPoolConfig getAmrThreadPoolConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("9a6b1de7", new Object[]{context});
        }
        int networkType = NetworkUtils.getNetworkType(context);
        ThreadPoolConfig a2 = a(networkType);
        a2.threadFactory = new NetThreadFactory("amr");
        if (networkType == 1) {
            LogCatUtil.debug("NetThreadPoolExeFactory", "amr 2g threadCount=[1]");
            setPoolSize(a2, 1);
        } else if (networkType == 2) {
            LogCatUtil.debug("NetThreadPoolExeFactory", "amr 3g threadCount=[1]");
            a2.corePoolSize = 1;
            a2.maximumPoolSize = 2;
        } else if (networkType != 3 && networkType != 4) {
            return a2;
        } else {
            LogCatUtil.debug("NetThreadPoolExeFactory", "amr 4g/WI-FI threadCount=[2]");
            setPoolSize(a2, 2);
        }
        return a2;
    }

    public static final ThreadPoolConfig getAmrUrgentThreadPoolConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("632e08c8", new Object[]{context});
        }
        ThreadPoolConfig amrThreadPoolConfig = getAmrThreadPoolConfig(context);
        amrThreadPoolConfig.threadFactory = new NetThreadFactory("amr-urgent");
        return amrThreadPoolConfig;
    }

    public static final ThreadPoolConfig getUrgentThreadPoolConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("3468c50a", new Object[0]);
        }
        ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig();
        threadPoolConfig.netType = "all";
        threadPoolConfig.threadFactory = new NetThreadFactory("urgent");
        setPoolSize(threadPoolConfig, 3);
        threadPoolConfig.keepAliveTime = 20L;
        threadPoolConfig.timeunit = TimeUnit.SECONDS;
        threadPoolConfig.workQueue = new ArrayBlockingQueue(30);
        return threadPoolConfig;
    }

    public static final ThreadPoolConfig getFgMultimediaThreadPoolConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("8c51ff", new Object[0]);
        }
        ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig();
        threadPoolConfig.netType = "all";
        threadPoolConfig.threadFactory = new NetThreadFactory(fjp.SCENE_MEDIA_PLAYER);
        setPoolSize(threadPoolConfig, 10);
        threadPoolConfig.keepAliveTime = 5L;
        threadPoolConfig.timeunit = TimeUnit.SECONDS;
        threadPoolConfig.workQueue = new ArrayBlockingQueue(30);
        return threadPoolConfig;
    }

    private static ThreadPoolConfig a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolConfig) ipChange.ipc$dispatch("223ed355", new Object[]{new Integer(i)});
        }
        ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig();
        if (i == 1) {
            d(threadPoolConfig);
        } else if (i == 2) {
            c(threadPoolConfig);
        } else if (i == 3) {
            a(threadPoolConfig);
        } else if (i == 4) {
            b(threadPoolConfig);
        } else {
            c(threadPoolConfig);
        }
        return threadPoolConfig;
    }

    private static void a(ThreadPoolConfig threadPoolConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9ba922", new Object[]{threadPoolConfig});
            return;
        }
        threadPoolConfig.netType = "wifi";
        setPoolSize(threadPoolConfig, 5);
        threadPoolConfig.keepAliveTime = 5L;
        threadPoolConfig.workQueue = new LinkedBlockingDeque();
    }

    private static void b(ThreadPoolConfig threadPoolConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504705a3", new Object[]{threadPoolConfig});
            return;
        }
        threadPoolConfig.netType = "4g";
        setPoolSize(threadPoolConfig, 3);
        threadPoolConfig.keepAliveTime = 5L;
        threadPoolConfig.workQueue = new LinkedBlockingDeque();
    }

    private static void c(ThreadPoolConfig threadPoolConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f26224", new Object[]{threadPoolConfig});
            return;
        }
        threadPoolConfig.netType = "3g";
        threadPoolConfig.corePoolSize = 1;
        threadPoolConfig.maximumPoolSize = 2;
        threadPoolConfig.keepAliveTime = 30L;
        threadPoolConfig.workQueue = new LinkedBlockingDeque();
    }

    private static void d(ThreadPoolConfig threadPoolConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9dbea5", new Object[]{threadPoolConfig});
            return;
        }
        threadPoolConfig.netType = "2g";
        setPoolSize(threadPoolConfig, 1);
        threadPoolConfig.keepAliveTime = 60L;
        threadPoolConfig.workQueue = new LinkedBlockingDeque();
    }

    private static ActThreadPoolExecutor e(ThreadPoolConfig threadPoolConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("72c9c010", new Object[]{threadPoolConfig});
        }
        LogCatUtil.debug("NetThreadPoolExeFactory", "createThreadPoolExeByConfig.   " + threadPoolConfig.toString());
        ActThreadPoolExecutor actThreadPoolExecutor = new ActThreadPoolExecutor(threadPoolConfig.corePoolSize, threadPoolConfig.maximumPoolSize, threadPoolConfig.keepAliveTime, threadPoolConfig.timeunit, threadPoolConfig.workQueue, threadPoolConfig.threadFactory, threadPoolConfig.handler);
        actThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return actThreadPoolExecutor;
    }

    /* loaded from: classes3.dex */
    public static class NetThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5522a = new AtomicInteger(1);
        private String b;

        public NetThreadFactory(String str) {
            this.b = "HttpManager.HttpWorker#" + str + "#";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.b + this.f5522a.getAndIncrement());
            setThreadPriority(thread);
            return thread;
        }

        public void setThreadPriority(Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("368618c8", new Object[]{this, thread});
            } else {
                thread.setPriority(1);
            }
        }
    }
}
