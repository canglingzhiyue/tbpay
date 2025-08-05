package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.mux;
import tb.muz;

/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471011209);
    }

    public static <T> void a(muz<? super T> muzVar, T t, AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b10c235", new Object[]{muzVar, t, atomicInteger, cVar});
        } else if (atomicInteger.get() != 0 || !atomicInteger.compareAndSet(0, 1)) {
        } else {
            muzVar.onNext(t);
            if (atomicInteger.decrementAndGet() == 0) {
                return;
            }
            Throwable a2 = cVar.a();
            if (a2 != null) {
                muzVar.onError(a2);
            } else {
                muzVar.onComplete();
            }
        }
    }

    public static void a(muz<?> muzVar, Throwable th, AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a34002", new Object[]{muzVar, th, atomicInteger, cVar});
        } else if (!cVar.a(th)) {
            mux.a(th);
        } else if (atomicInteger.getAndIncrement() != 0) {
        } else {
            muzVar.onError(cVar.a());
        }
    }

    public static void a(muz<?> muzVar, AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88357d9", new Object[]{muzVar, atomicInteger, cVar});
        } else if (atomicInteger.getAndIncrement() != 0) {
        } else {
            Throwable a2 = cVar.a();
            if (a2 != null) {
                muzVar.onError(a2);
            } else {
                muzVar.onComplete();
            }
        }
    }
}
