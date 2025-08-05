package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;

/* loaded from: classes7.dex */
public class ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f30672a;
    private HandlerThread b;
    private Handler c;
    private HandlerThread d;
    private Handler e;

    /* loaded from: classes7.dex */
    public static class a {
        public static final ljd INSTANCE;

        static {
            kge.a(-274609561);
            INSTANCE = new ljd();
        }
    }

    static {
        kge.a(562547092);
    }

    public static ljd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljd) ipChange.ipc$dispatch("f075738", new Object[0]) : a.INSTANCE;
    }

    private ljd() {
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

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145246ea", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            this.c.removeCallbacks(runnable);
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
                this.f30672a.post(runnable);
            }
        }
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            this.f30672a.removeCallbacks(runnable);
        }
    }

    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            if (j == 0) {
                this.f30672a.post(runnable);
            } else {
                this.f30672a.postDelayed(runnable, j);
            }
        }
    }

    public void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b13bd", new Object[]{this, runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            if (j == 0) {
                this.c.post(runnable);
            } else {
                this.c.postDelayed(runnable, j);
            }
        }
    }

    public void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (!lcx.a("enablePowerOptimization") && !e()) {
                runnable.run();
                ldf.d("TaskExecutor", "postUserTrackThread ut子线程开关关闭，使用原线程调度");
                return;
            }
            ldf.d("TaskExecutor", "postUserTrackThread ut子线程执行");
            if (Thread.currentThread() == this.d) {
                runnable.run();
            } else {
                this.e.post(runnable);
            }
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) m.a().a("postUTOnUserTrackThread", Boolean.class);
        return bool != null && bool.booleanValue();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (qnl.e()) {
            this.b = new HandlerThread("InfoFlowCoreSubThread");
        } else {
            this.b = jbg.a("InfoFlowCoreSubThread");
        }
        this.b.start();
        this.c = new Handler(this.b.getLooper());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f30672a = new Handler(Looper.getMainLooper());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (qnl.e()) {
            this.d = new HandlerThread("InfoFlowCoreUserTrackThread");
        } else {
            this.d = jbg.a("InfoFlowCoreUserTrackThread");
        }
        this.d.start();
        this.e = new Handler(this.d.getLooper());
    }
}
