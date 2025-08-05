package tb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class aax extends aay {

    /* renamed from: a  reason: collision with root package name */
    private final Object f25197a = new Object();
    private ExecutorService b = Executors.newFixedThreadPool(2);
    private volatile Handler c;

    @Override // tb.aay
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // tb.aay
    public void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.f25197a) {
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    @Override // tb.aay
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
