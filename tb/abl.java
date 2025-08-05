package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class abl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f25204a = new HandlerThread("UltronTradeHybridWorkerThread");
    private Handler b;

    static {
        kge.a(995133649);
    }

    public abl() {
        this.f25204a.start();
        this.b = new Handler(this.f25204a.getLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
            UnifyLog.d("UltronTradeHybridWorkerThread.postTask", "runnable is null");
        } else {
            this.b.post(runnable);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.f25204a == null) {
                UnifyLog.d("UltronTradeHybridWorkerThread.destroy", "mThread is null");
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                this.f25204a.quitSafely();
            } else {
                this.f25204a.quit();
            }
            this.f25204a = null;
        } catch (Throwable th) {
            UnifyLog.d("UltronTradeHybridWorkerThread.destroy", th.toString());
        }
    }
}
