package tb;

import android.media.MediaMetadataRetriever;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class hbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MediaMetadataRetriever f28570a;
    public static final Map<String, String> sDurationCache;
    private static ThreadPoolExecutor sThreadPool;

    static {
        kge.a(-1304755773);
        sDurationCache = new HashMap();
    }

    public static ThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("26487748", new Object[0]);
        }
        if (sThreadPool == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100), new ThreadFactory() { // from class: tb.hbh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "VideoDurationLoaderThread");
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            sThreadPool = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return sThreadPool;
    }
}
