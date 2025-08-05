package tb;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public interface nev {
    Future<?> a(Runnable runnable);

    <T> Future<T> a(Callable<T> callable);
}
