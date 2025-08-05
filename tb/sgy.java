package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class sgy extends HandlerThread implements jwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f33574a;
    private final Handler b;

    static {
        kge.a(-416389235);
        kge.a(-1337738858);
    }

    @Override // android.os.HandlerThread
    public int getThreadId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a77e935", new Object[]{this})).intValue() : this.f33574a;
    }

    @Override // tb.jwc
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.b.post(runnable);
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b.removeCallbacksAndMessages(obj);
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else {
            this.b.removeCallbacks(runnable);
        }
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257d7f74", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                return;
            }
            Process.setThreadPriority(-4);
        } catch (Throwable th) {
            spz.c("WeexGuanguangHandlerThreadEx", "onLooperPrepared failed " + th.getMessage());
        }
    }
}
