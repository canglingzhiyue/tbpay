package anet.channel.session.okhttp;

import anet.channel.request.Cancelable;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.okhttp.Call;
import tb.kge;

/* loaded from: classes2.dex */
public class OkHttpCancelable implements Cancelable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final OkHttpCancelable NULL;
    private static final String TAG = "awcn.OkHttpCancelable";
    private final Call call;
    private final String seq;

    static {
        kge.a(-1670168085);
        kge.a(710597459);
        NULL = new OkHttpCancelable(null, null);
    }

    public OkHttpCancelable(Call call, String str) {
        this.call = call;
        this.seq = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        if (this.call != null) {
            ALog.i(TAG, "cancel request", this.seq, new Object[0]);
            try {
                OkHttpConnector.call_cancel.invoke(this.call, new Object[0]);
            } catch (Exception unused) {
                ALog.e(TAG, "cancel request", this.seq, new Object[0]);
            }
        }
    }
}
