package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jvz extends HandlerThread implements jwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f29823a;
    private final Handler b;

    static {
        kge.a(276459449);
        kge.a(-1337738858);
    }

    public jvz(String str) {
        super(str);
        start();
        this.b = new Handler(getLooper());
    }

    @Override // android.os.HandlerThread
    public int getThreadId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a77e935", new Object[]{this})).intValue() : this.f29823a;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f29823a = i;
        }
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
        } catch (Throwable unused) {
        }
    }
}
