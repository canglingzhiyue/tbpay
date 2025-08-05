package anetwork.channel.entity;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.android.weex_framework.util.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class RepeatProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicInteger id;
    private static ExecutorService[] threadPool;

    public static /* synthetic */ AtomicInteger access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]) : id;
    }

    static {
        kge.a(1424135449);
        threadPool = null;
        id = new AtomicInteger(0);
    }

    public static void submitTask(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b404bd", new Object[]{new Integer(i), runnable});
        } else {
            threadPool[Math.abs(i % getThreadPoolSize())].submit(runnable);
        }
    }

    public static synchronized int getThreadPoolSize() {
        synchronized (RepeatProcessor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36dea157", new Object[0])).intValue();
            } else if (threadPool != null) {
                return threadPool.length;
            } else {
                GlobalAppRuntimeInfo.initThreadCountABOpen();
                int waitThreadCount = (!AwcnConfig.isWaitThreadCountEnable() || !AwcnConfig.isWaitThreadCountABEnable()) ? 2 : AwcnConfig.getWaitThreadCount();
                threadPool = new ExecutorService[waitThreadCount];
                if (AwcnConfig.isRepeatThreadUseVirtualThread()) {
                    for (int i = 0; i < waitThreadCount; i++) {
                        threadPool[i] = VExecutors.newSingleThreadExecutor(new h() { // from class: anetwork.channel.entity.RepeatProcessor.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.virtual_thread.face.h
                            public String newThreadName() {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : String.format("RepeaterThread:%d", Integer.valueOf(RepeatProcessor.access$000().getAndIncrement()));
                            }
                        });
                    }
                } else {
                    for (int i2 = 0; i2 < waitThreadCount; i2++) {
                        threadPool[i2] = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: anetwork.channel.entity.RepeatProcessor.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, String.format("RepeaterThread:%d", Integer.valueOf(RepeatProcessor.access$000().getAndIncrement())));
                            }
                        });
                    }
                }
                ALog.e("awcn.RepeatProcessor", "getThreadPoolSize!!", null, a.ATOM_length, Integer.valueOf(threadPool.length), "isRepeatThreadUseVirtualThread", Boolean.valueOf(AwcnConfig.isRepeatThreadUseVirtualThread()));
                return threadPool.length;
            }
        }
    }
}
