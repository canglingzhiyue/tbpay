package com.taobao.message.kit.threadpool;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import tb.kge;

@IgnoreVirtualThread
/* loaded from: classes7.dex */
public class SaturativeExecutor extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = true;
    public static final int KEEP_ALIVE = 60;
    public static final int MAX_POOL_SIZE = 8;
    public static final int MIN_POOL_SIZE = 4;
    private static final Pattern PATTERN_CPU_ENTRIES;
    public static final int QUEUE_CAPACITY = 256;
    public static final String TAG = "SaturativeExecutor";
    private static ThreadFactory sThreadFactory;

    public static /* synthetic */ Object ipc$super(SaturativeExecutor saturativeExecutor, String str, Object... objArr) {
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

    public static /* synthetic */ Pattern access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]) : PATTERN_CPU_ENTRIES;
    }

    static {
        kge.a(-766496534);
        PATTERN_CPU_ENTRIES = Pattern.compile("cpu[0-9]+");
        sThreadFactory = new ThreadFactory() { // from class: com.taobao.message.kit.threadpool.SaturativeExecutor.4
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                String str = "AmpSaturativeThread-" + this.mCount.getAndIncrement();
                Thread thread = new Thread(runnable, str);
                if (ApplicationUtil.isDebug()) {
                    TLog.logd(SaturativeExecutor.TAG, "Spawning ", str);
                }
                return thread;
            }
        };
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "add task");
        }
        super.execute(runnable);
    }

    public SaturativeExecutor() {
        this(determineBestMinPoolSize(), 8);
    }

    public SaturativeExecutor(int i, int i2) {
        super(i, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), sThreadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    public SaturativeExecutor(int i, int i2, int i3) {
        super(i, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(i3), sThreadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    public SaturativeExecutor(int i, int i2, final String str) {
        super(i, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), new ThreadFactory() { // from class: com.taobao.message.kit.threadpool.SaturativeExecutor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                String str2 = str + "-" + this.mCount.getAndIncrement();
                Thread thread = new Thread(runnable, str2);
                if (ApplicationUtil.isDebug()) {
                    TLog.logd(SaturativeExecutor.TAG, "Spawning ", str2);
                }
                return thread;
            }
        }, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    public SaturativeExecutor(int i, int i2, final String str, int i3) {
        super(i, i2, i3, TimeUnit.SECONDS, new LinkedBlockingQueue(256), new ThreadFactory() { // from class: com.taobao.message.kit.threadpool.SaturativeExecutor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, str + "-" + this.mCount.getAndIncrement());
            }
        }, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    private static int determineBestMinPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("483515d2", new Object[0])).intValue();
        }
        int countCpuCores = countCpuCores();
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "CPU has " + countCpuCores + "cores.");
        }
        return countCpuCores > 0 ? countCpuCores : Runtime.getRuntime().availableProcessors() * 2;
    }

    private static int countCpuCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18d5d115", new Object[0])).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.taobao.message.kit.threadpool.SaturativeExecutor.3
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

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
            return;
        }
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "beforeExecute|" + thread.getName() + "|" + getQueue().size());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
            return;
        }
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "beforeExecute " + getQueue().size());
        }
        super.afterExecute(runnable, th);
    }
}
