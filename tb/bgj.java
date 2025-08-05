package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class bgj extends bgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bgj f25873a;
    private final Object b = new Object();
    private ThreadPoolExecutor c = new ThreadPoolExecutor(1, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), bgk.INSTANCE);

    static {
        kge.a(1779501868);
        f25873a = new bgj();
    }

    public static bgj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgj) ipChange.ipc$dispatch("f02c0f9", new Object[0]) : f25873a;
    }

    private bgj() {
        this.c.allowCoreThreadTimeOut(true);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.c.execute(runnable);
        }
    }
}
