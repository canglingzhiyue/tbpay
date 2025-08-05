package tb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class cwb {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f26561a;
    private static Handler b;

    static {
        kge.a(-514296062);
        f26561a = Executors.newSingleThreadExecutor();
        b = new Handler(Looper.getMainLooper());
    }

    public static void a(Runnable runnable) {
        f26561a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        b.post(runnable);
    }
}
