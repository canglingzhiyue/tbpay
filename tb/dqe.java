package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dqe extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile dqe f26904a;

    static {
        kge.a(-1681909286);
    }

    public static dqe a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqe) ipChange.ipc$dispatch("f03cea6", new Object[0]);
        }
        if (f26904a == null) {
            synchronized (dqe.class) {
                if (f26904a == null) {
                    f26904a = new dqe();
                }
            }
        }
        return f26904a;
    }

    private dqe() {
        super(Looper.getMainLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            f26904a.removeCallbacksAndMessages(null);
        }
    }
}
