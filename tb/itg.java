package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class itg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f29308a = new Handler(Looper.getMainLooper());
    private final SparseArray<ThreadPoolExecutor> b = new SparseArray<>();

    static {
        kge.a(-317277889);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.valueAt(i).shutdownNow();
        }
        this.b.clear();
    }

    public ThreadPoolExecutor a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("9a732f7b", new Object[]{this, new Integer(i)});
        }
        ThreadPoolExecutor threadPoolExecutor = this.b.get(i);
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.itg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "MetaRequestManagerThread");
            }
        });
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.b.put(i, threadPoolExecutor2);
        return threadPoolExecutor2;
    }
}
