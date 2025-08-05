package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public abstract class enn implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(604999320);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public final int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : eno.a(getClass());
    }
}
