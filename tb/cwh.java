package tb;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class cwh implements cwi {
    public static final int CORE_POOL_SIZE;
    public static final int KEEP_ALIVE_TIME = 60;
    public static final int MAX_POOL_SIZE = Integer.MAX_VALUE;
    public static final TimeUnit TIME_UNIT;
    public static final BlockingQueue<Runnable> WORK_QUEUE;

    /* renamed from: a  reason: collision with root package name */
    public static cwi f26567a;
    public Executor b = new ThreadPoolExecutor(CORE_POOL_SIZE, Integer.MAX_VALUE, 60, TIME_UNIT, WORK_QUEUE, a("MSP-ThreadPool", false));

    /* loaded from: classes4.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26568a;
        public final /* synthetic */ boolean b;

        static {
            kge.a(-673116431);
            kge.a(-1938806936);
        }

        public a(cwh cwhVar, String str, boolean z) {
            this.f26568a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f26568a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        kge.a(289802036);
        kge.a(466676970);
        CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors() << 1;
        TIME_UNIT = TimeUnit.SECONDS;
        WORK_QUEUE = new LinkedBlockingQueue();
    }

    private ThreadFactory a(String str, boolean z) {
        return new a(this, str, z);
    }

    public static cwi a() {
        if (f26567a == null) {
            f26567a = new cwh();
        }
        return f26567a;
    }

    @Override // tb.cwi
    public void a(Runnable runnable) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(runnable);
        }
    }
}
