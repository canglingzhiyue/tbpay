package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public abstract class evl implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-403819375);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public evl() {
        tpc.a("com.taobao.android.detail.sdk.event.misc.BaseOpenEntryEvent");
    }
}
