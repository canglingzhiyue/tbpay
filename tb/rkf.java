package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class rkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static rkf f33202a;
    public Handler b;

    static {
        kge.a(-1808832042);
        f33202a = new rkf();
    }

    private rkf() {
        HandlerThread handlerThread = new HandlerThread("LinkCommonNonUIThread");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.b.post(runnable);
        }
    }
}
