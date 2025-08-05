package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class imu implements imt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HandlerThread f29163a = new HandlerThread("ace-worker");
    private final Handler b;

    static {
        kge.a(-44711175);
        kge.a(-1886375623);
    }

    public imu() {
        this.f29163a.start();
        this.b = new Handler(this.f29163a.getLooper());
    }

    @Override // tb.imt
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.b.post(runnable);
        }
    }
}
