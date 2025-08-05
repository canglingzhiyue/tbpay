package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class odd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f31933a;

    static {
        kge.a(-963998750);
        f31933a = new Handler(Looper.getMainLooper());
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            f31933a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
