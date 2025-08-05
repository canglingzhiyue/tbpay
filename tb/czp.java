package tb;

import android.os.Handler;
import android.os.Looper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class czp {
    private static volatile czp d;
    private Handler b;
    private HashMap<String, Object> c = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f26622a = new ScheduledThreadPoolExecutor(4, new ThreadFactory() { // from class: tb.czp.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "nirvana_base_executor_queue_" + System.currentTimeMillis());
        }
    }, new ThreadPoolExecutor.CallerRunsPolicy());

    /* loaded from: classes4.dex */
    public static abstract class a implements Runnable {
        protected void onException(Throwable th) {
        }

        protected void onFinal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                safeRun();
            } catch (Throwable th) {
                try {
                    onException(th);
                } finally {
                    onFinal();
                }
            }
        }

        protected abstract void safeRun();
    }

    public czp() {
        this.f26622a.setKeepAliveTime(2L, TimeUnit.SECONDS);
        this.f26622a.setMaximumPoolSize(4);
        this.f26622a.allowCoreThreadTimeOut(true);
        this.b = new Handler(Looper.getMainLooper());
    }

    public static String a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            String stringWriter2 = stringWriter.toString();
            stringWriter.close();
            printWriter.close();
            return stringWriter2;
        } catch (Exception unused) {
            return "ErrorInfoFromException";
        }
    }

    public static czp a() {
        if (d == null) {
            synchronized (ThreadPoolExecutor.class) {
                if (d == null) {
                    d = new czp();
                }
            }
        }
        return d;
    }

    public RunnableScheduledFuture<?> a(Runnable runnable) {
        return a(runnable, 0L);
    }

    public RunnableScheduledFuture<?> a(Runnable runnable, long j) {
        if (j < 0) {
            j = 0;
        }
        return (RunnableScheduledFuture) this.f26622a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public void b() {
        if (d != null) {
            synchronized (ThreadPoolExecutor.class) {
                if (d != null) {
                    d.f26622a.shutdown();
                }
            }
        }
    }

    public void b(Runnable runnable) {
        this.b.post(runnable);
    }

    public void b(Runnable runnable, long j) {
        this.b.postDelayed(runnable, j);
    }

    public void c(Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    public void d(Runnable runnable) {
        this.f26622a.remove(runnable);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        b();
    }
}
