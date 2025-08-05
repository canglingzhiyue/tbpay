package android.taobao.windvane.thread;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class d implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f1700a = new AtomicInteger(1);
    private final String b;

    static {
        kge.a(-1109461568);
        kge.a(-1938806936);
    }

    public d(String str) {
        this.b = str + "-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        Thread thread = new Thread(runnable, this.b + this.f1700a.getAndIncrement());
        thread.setPriority(5);
        return thread;
    }
}
