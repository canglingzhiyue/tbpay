package tb;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class dah implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f26637a;
    private Thread b;

    public dah(final String str) {
        this.f26637a = new ThreadPoolExecutor(1, 1, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.dah.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                dah.this.b = new Thread(runnable, str);
                return dah.this.b;
            }
        });
        this.f26637a.allowCoreThreadTimeOut(true);
    }

    private boolean a() {
        Thread thread = this.b;
        return thread != null && thread.getId() == Thread.currentThread().getId();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            this.f26637a.execute(runnable);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        try {
            this.f26637a.shutdownNow();
        } catch (Exception unused) {
        }
    }
}
