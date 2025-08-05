package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mtz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f31263a;
    public static Looper b;

    static {
        kge.a(1440773760);
        b = Looper.getMainLooper();
        f31263a = new Handler(b);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            f31263a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
