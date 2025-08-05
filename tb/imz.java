package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public class imz<RESPONSE> implements Callable<RESPONSE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile RESPONSE f29166a;
    private final CountDownLatch b = new CountDownLatch(1);

    static {
        kge.a(-1636528421);
        kge.a(-119797776);
    }

    @Override // java.util.concurrent.Callable
    public RESPONSE call() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RESPONSE) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        if (this.f29166a == null) {
            this.b.await();
        }
        return this.f29166a;
    }

    public void a(RESPONSE response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, response});
            return;
        }
        this.f29166a = response;
        this.b.countDown();
    }
}
