package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes8.dex */
public class drd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Choreographer.FrameCallback b;
    private long d;

    /* renamed from: a  reason: collision with root package name */
    private Handler f26916a = new Handler(Looper.getMainLooper());
    private Queue<Runnable> c = new ArrayDeque();

    /* loaded from: classes8.dex */
    public static abstract class a implements Runnable {
        static {
            kge.a(569238694);
            kge.a(-1390502639);
        }
    }

    static {
        kge.a(-857952574);
    }

    public static /* synthetic */ long a(drd drdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5ae7976", new Object[]{drdVar})).longValue() : drdVar.d;
    }

    public static /* synthetic */ void a(drd drdVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0212d82", new Object[]{drdVar, new Long(j)});
        } else {
            drdVar.a(j);
        }
    }

    public static /* synthetic */ Handler b(drd drdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5b17b1e3", new Object[]{drdVar}) : drdVar.f26916a;
    }

    public static /* synthetic */ void c(drd drdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b48684", new Object[]{drdVar});
        } else {
            drdVar.c();
        }
    }

    public drd(Activity activity) {
        this.d = a(activity);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b != null || Build.VERSION.SDK_INT < 16) {
        } else {
            this.b = new Choreographer.FrameCallback() { // from class: tb.drd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(final long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                        return;
                    }
                    drd.b(drd.this).post(new Runnable() { // from class: tb.drd.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            long a2 = (drd.a(drd.this) - (System.nanoTime() - j)) / 2;
                            long j2 = a2 / 1000000;
                            ogg.c("FrameIdleScheduler", "doFrame, remain ms:" + j2 + " nano:" + a2);
                            if (j2 <= 0) {
                                return;
                            }
                            drd.a(drd.this, a2);
                        }
                    });
                    drd.c(drd.this);
                }
            };
            Choreographer.getInstance().postFrameCallback(this.b);
            ogg.c("FrameIdleScheduler", "start");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b != null && Build.VERSION.SDK_INT >= 16) {
            Choreographer.getInstance().removeFrameCallback(this.b);
            this.b = null;
        }
        this.f26916a.removeCallbacksAndMessages(null);
        int i2 = 0;
        while (true) {
            Runnable poll = this.c.poll();
            if (poll != null) {
                if (poll instanceof a) {
                    poll.run();
                    i++;
                } else {
                    i2++;
                }
            } else {
                ogg.c("FrameIdleScheduler", "stop, IdleTask clear, remainForceTaskCount:" + i + " remainNormalTaskCount:" + i2);
                return;
            }
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.c.add(runnable);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b == null || Build.VERSION.SDK_INT < 16) {
        } else {
            Choreographer.getInstance().postFrameCallback(this.b);
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = 0;
        while (!this.c.isEmpty()) {
            long nanoTime = System.nanoTime();
            Runnable poll = this.c.poll();
            if (poll != null) {
                i++;
                poll.run();
            }
            j2 += System.nanoTime() - nanoTime;
            if (j2 >= j) {
                break;
            }
        }
        ogg.c("FrameIdleScheduler", "executeIdleTasks, count:" + i);
    }

    private long a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68a25ae", new Object[]{this, activity})).longValue() : 1.0E9f / b(activity);
    }

    private float b(Activity activity) {
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366b", new Object[]{this, activity})).floatValue();
        }
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            return defaultDisplay.getRefreshRate();
        }
        return 60.0f;
    }
}
