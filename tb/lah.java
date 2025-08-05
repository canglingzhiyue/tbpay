package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lah {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String f = "enableInfoFlowUtUseSubThread";

    /* renamed from: a  reason: collision with root package name */
    private Handler f30430a;
    private HandlerThread b;
    private Handler c;
    private HandlerThread d;
    private Handler e;

    /* loaded from: classes7.dex */
    public static class a {
        public static final lah INSTANCE = new lah();
    }

    public static lah a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lah) ipChange.ipc$dispatch("f0735eb", new Object[0]) : a.INSTANCE;
    }

    private lah() {
        b();
        c();
        d();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == this.b) {
                runnable.run();
            } else {
                this.c.post(runnable);
            }
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f30430a.post(runnable);
            }
        }
    }

    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            if (j == 0) {
                this.f30430a.post(runnable);
            } else {
                this.f30430a.postDelayed(runnable, j);
            }
        }
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == this.d) {
                runnable.run();
            } else {
                this.e.post(runnable);
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = new HandlerThread("InfoFlowCoreSubThread");
        this.b.start();
        this.c = new Handler(this.b.getLooper());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f30430a = new Handler(Looper.getMainLooper());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = new HandlerThread("InfoFlowCoreUserTrackThread");
        this.d.start();
        this.e = new Handler(this.d.getLooper());
    }
}
