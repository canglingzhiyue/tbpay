package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class bgk implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bgk INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f25874a = new AtomicInteger();

    static {
        kge.a(-130551919);
        kge.a(-1938806936);
        INSTANCE = new bgk();
    }

    private bgk() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        return new Thread(runnable, "#SplitInstallThread-" + this.f25874a.incrementAndGet());
    }
}
