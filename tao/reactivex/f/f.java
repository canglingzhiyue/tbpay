package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public final class f extends AtomicLong implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25160a;
    public final int b;
    public final boolean c;

    /* loaded from: classes9.dex */
    public static final class a extends Thread {
        static {
            kge.a(-1469166435);
        }

        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    static {
        kge.a(1964949472);
        kge.a(-1938806936);
    }

    public f(String str) {
        this(str, 5, false);
    }

    public f(String str, int i) {
        this(str, i, false);
    }

    public f(String str, int i, boolean z) {
        this.f25160a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        String str = this.f25160a + '-' + incrementAndGet();
        Thread aVar = this.c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RxThreadFactory[" + this.f25160a + riy.ARRAY_END_STR;
    }
}
