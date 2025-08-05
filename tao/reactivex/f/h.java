package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import tb.kge;

/* loaded from: classes9.dex */
public final class h extends a implements Callable<Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1964949474);
        kge.a(-119797776);
    }

    public h(Runnable runnable) {
        super(runnable);
    }

    public Void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("9986b453", new Object[]{this});
        }
        this.b = Thread.currentThread();
        try {
            this.f25151a.run();
            return null;
        } finally {
            lazySet(c);
            this.b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public /* synthetic */ Void call() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : c();
    }
}
