package anet.channel.assist;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class WorkExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ThreadPoolExecutor singleExecutor;

    /* loaded from: classes.dex */
    public static class Factory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public AtomicInteger seq = new AtomicInteger(0);

        public Factory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.name + this.seq.incrementAndGet());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Factory("NetworkAssist"));
        singleExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static Future<?> submitTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("558be4d8", new Object[]{runnable}) : singleExecutor.submit(runnable);
    }
}
