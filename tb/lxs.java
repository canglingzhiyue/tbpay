package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f30975a;
    public Handler b;
    public Handler c;

    /* loaded from: classes7.dex */
    public static class a {
        public static final lxs instance;

        static {
            kge.a(-1612785081);
            instance = new lxs();
        }
    }

    static {
        kge.a(312514932);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f30975a != null) {
        } else {
            try {
                this.f30975a = new HandlerThread("HomePageDataSourceThread");
                this.f30975a.start();
                this.b = new Handler(this.f30975a.getLooper());
                this.c = new Handler(Looper.getMainLooper());
            } catch (Throwable unused) {
                this.f30975a = null;
            }
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == this.f30975a) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        }
    }

    public static lxs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lxs) ipChange.ipc$dispatch("f078d97", new Object[0]) : a.instance;
    }

    private lxs() {
        b();
    }
}
