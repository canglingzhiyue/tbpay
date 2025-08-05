package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.e;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class jrp extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29740a;
    public final int b;
    private final AtomicLong c;

    static {
        kge.a(1823048905);
    }

    public jrp(String str) {
        this(str, 5);
    }

    public jrp(String str, int i) {
        this.c = new AtomicLong(0L);
        this.f29740a = str;
        this.b = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RxThreadFactory[" + this.f29740a + riy.ARRAY_END_STR;
    }

    @Override // com.taobao.android.virtual_thread.e
    public VirtualThread a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VirtualThread) ipChange.ipc$dispatch("ac603360", new Object[]{this, runnable});
        }
        VirtualThread virtualThread = new VirtualThread(runnable, this.f29740a + '-' + this.c.incrementAndGet());
        virtualThread.setPriority(this.b);
        virtualThread.setDaemon(true);
        return virtualThread;
    }
}
