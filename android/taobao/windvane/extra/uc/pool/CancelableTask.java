package android.taobao.windvane.extra.uc.pool;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class CancelableTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsCanceled;

    static {
        kge.a(1389411982);
        kge.a(-1390502639);
    }

    public abstract void doRun();

    public abstract void onCancel();

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.mIsCanceled = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.mIsCanceled) {
            onCancel();
        } else {
            doRun();
        }
    }
}
