package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public abstract class eei<T extends Event> implements j<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1155755837);
        kge.a(-1453870097);
    }

    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.event.subscriber.basic.BaseEventSubscriber";
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, t});
        }
        emu.a(getFullClassName());
        return a.FAILURE;
    }
}
