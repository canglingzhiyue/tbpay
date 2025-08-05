package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class sdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<Runnable> f33499a;
    private static final AtomicBoolean b;

    static {
        kge.a(-258025613);
        f33499a = new ArrayList();
        b = new AtomicBoolean(false);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (!n.n().n()) {
            runnable.run();
        } else if (!b.get()) {
            f33499a.add(runnable);
        } else {
            runnable.run();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (n.n().n() && b.compareAndSet(false, true)) {
            for (Runnable runnable : f33499a) {
                runnable.run();
            }
            f33499a.clear();
        }
    }
}
