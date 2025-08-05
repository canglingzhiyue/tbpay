package anet.channel.request;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import tb.kge;

/* loaded from: classes.dex */
public class FutureCancelable implements Cancelable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FutureCancelable NULL;
    private final Future<?> future;
    private final String seq;

    static {
        kge.a(-1983475146);
        kge.a(710597459);
        NULL = new FutureCancelable(null, null);
    }

    public FutureCancelable(Future<?> future, String str) {
        this.future = future;
        this.seq = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.future == null) {
        } else {
            ALog.i("awcn.FutureCancelable", "cancel request", this.seq, new Object[0]);
            this.future.cancel(true);
        }
    }
}
