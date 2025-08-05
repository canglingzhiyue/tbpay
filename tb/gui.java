package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class gui implements Handler.Callback, Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f28460a;
    private long b;
    private final HandlerThread c;
    private final Handler d;
    private final Runnable e;
    private volatile boolean f = false;

    public gui(String str, long j, Runnable runnable, long j2) {
        this.f28460a = j;
        this.b = j;
        this.c = new HandlerThread(str + "-smooth-handler");
        this.c.start();
        this.d = new Handler(this.c.getLooper(), this);
        this.d.sendEmptyMessageDelayed(101, j2);
        this.e = runnable;
    }

    private boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : TimeUnit.NANOSECONDS.toMillis(j - this.b) >= orq.FRAME_CHECK_TIMEOUT;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (this.f) {
        } else {
            if (this.f28460a == 0) {
                this.f28460a = j;
                this.b = j;
            }
            if (a(j)) {
                Log.e("IdleFrameCallback", "triggered idle final timeout");
                this.d.sendEmptyMessage(101);
                return;
            }
            long j2 = j - this.f28460a;
            if (j2 >= orq.FRAME_TIME_NANO) {
                long j3 = j2 / orq.FRAME_TIME_NANO;
                if (j3 > 10) {
                    Log.e("IdleFrameCallback", "WARNING, skipped " + j3 + " frames, the application may be doing too much work on its main thread");
                    this.d.removeMessages(101);
                    this.d.removeMessages(100);
                    this.d.sendEmptyMessageDelayed(100, Math.max(j3 * 16, 2000L));
                }
            }
            this.f28460a = j;
            if (this.f) {
                return;
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            Log.e("IdleFrameCallback", "idle reached");
            a();
            b();
            return true;
        } else if (message.what != 101) {
            return false;
        } else {
            Log.e("IdleFrameCallback", "idle timeout");
            a();
            b();
            return true;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f) {
        } else {
            this.e.run();
            this.f = true;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.c.quitSafely();
        } else {
            this.c.quit();
        }
    }
}
