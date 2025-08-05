package anet.channel.request;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;
import tb.kge;

/* loaded from: classes.dex */
public class TnetCancelable implements Cancelable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TnetCancelable NULL;
    private final String seq;
    private final SpdySession spdySession;
    private final int streamId;

    static {
        kge.a(-644102820);
        kge.a(710597459);
        NULL = new TnetCancelable(null, 0, null);
    }

    public TnetCancelable(SpdySession spdySession, int i, String str) {
        this.spdySession = spdySession;
        this.streamId = i;
        this.seq = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        try {
            if (this.spdySession == null || this.streamId == 0) {
                return;
            }
            ALog.i("awcn.TnetCancelable", "cancel tnet request", this.seq, "streamId", Integer.valueOf(this.streamId));
            this.spdySession.streamReset(this.streamId, 5);
        } catch (SpdyErrorException e) {
            ALog.e("awcn.TnetCancelable", "request cancel failed.", this.seq, e, "errorCode", Integer.valueOf(e.SpdyErrorGetCode()));
        }
    }
}
