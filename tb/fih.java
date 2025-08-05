package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class fih implements fia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27973a;
    private static BlockingQueue<Runnable> b;
    private static fih c;

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : f27973a;
    }

    public static /* synthetic */ BlockingQueue d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("66b24c96", new Object[0]) : b;
    }

    static {
        kge.a(-2021012605);
        kge.a(-142937811);
        f27973a = false;
        b = new LinkedBlockingQueue();
        c = new fih();
    }

    public static fih b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fih) ipChange.ipc$dispatch("16b63f18", new Object[0]) : c;
    }

    @Override // tb.fia
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (f27973a) {
        } else {
            f27973a = true;
            aqe.a().a(new Runnable() { // from class: tb.fih.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    while (fih.c()) {
                        try {
                            ((Runnable) fih.d().take()).run();
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    @Override // tb.fia
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        if (f27973a && runnable != null) {
            try {
                b.put(runnable);
            } catch (Exception unused) {
            }
        }
    }
}
