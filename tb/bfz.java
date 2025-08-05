package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public final class bfz implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f25869a;
    private final String b;
    private final int c;

    static {
        kge.a(1960805537);
        kge.a(-1938806936);
    }

    public bfz(String prefix, int i) {
        q.d(prefix, "prefix");
        this.b = prefix;
        this.c = i;
        this.f25869a = new AtomicInteger(0);
    }

    public /* synthetic */ bfz(String str, int i, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? 5 : i);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, r});
        }
        q.d(r, "r");
        Thread thread = new Thread(r);
        thread.setPriority(this.c);
        thread.setName(this.b + '-' + this.f25869a.incrementAndGet());
        return thread;
    }
}
