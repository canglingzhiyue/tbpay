package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class jvk implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f29816a = Executors.defaultThreadFactory();
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c;

    static {
        kge.a(-263251467);
        kge.a(-1938806936);
    }

    public jvk(String str) {
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        Thread newThread = this.f29816a.newThread(runnable);
        newThread.setName(this.c + "-" + this.b);
        return newThread;
    }
}
