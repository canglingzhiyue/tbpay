package tb;

import android.os.Handler;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.log.TLog;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class orq implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FRAME_CHECK_DURATION = 2000;
    public static final long FRAME_CHECK_TIMEOUT = 20000;
    public static final long FRAME_TIME_MILLIS;
    public static final long FRAME_TIME_NANO = 16666666;

    /* renamed from: a  reason: collision with root package name */
    private static final long f32329a;
    private static Handler g;
    private static Runnable h;
    private long b;
    private long d;
    private a f;
    private long c = System.nanoTime();
    private boolean e = false;

    /* loaded from: classes8.dex */
    public interface a {
        void a(boolean z);
    }

    static {
        kge.a(-581324740);
        kge.a(-569788179);
        FRAME_TIME_MILLIS = TimeUnit.NANOSECONDS.toMillis(FRAME_TIME_NANO);
        f32329a = n.l();
    }

    public orq() {
        long j = this.c;
        this.b = j;
        this.d = j;
        TLog.loge("home", "GlobalTrace", "=============，start smooth check. JITTER_COUNT=" + f32329a);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = true;
        Handler handler = g;
        if (handler != null) {
            handler.removeCallbacks(h);
        }
        Choreographer.getInstance().removeFrameCallback(this);
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : TimeUnit.NANOSECONDS.toMillis(this.d);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa706cd", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (this.e) {
        } else {
            if (TimeUnit.NANOSECONDS.toMillis(j - this.b) > FRAME_CHECK_TIMEOUT) {
                TLog.loge("home", "GlobalTrace", "=================，idle check timeout.");
                this.e = true;
                a aVar = this.f;
                if (aVar == null) {
                    return;
                }
                aVar.a(false);
                return;
            }
            long j2 = j - this.c;
            if (j2 > f32329a * FRAME_TIME_NANO) {
                TLog.logw("home", "GlobalTrace", "block happened. duration=" + TimeUnit.NANOSECONDS.toMillis(j2));
                this.d = j;
            }
            if (TimeUnit.NANOSECONDS.toMillis(j - this.d) > 2000) {
                TLog.loge("home", "GlobalTrace", "=============， smooth checked.");
                this.e = true;
                a aVar2 = this.f;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(true);
                return;
            }
            this.c = j;
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
