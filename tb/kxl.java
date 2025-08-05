package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.location.common.TBLocationDTO;

/* loaded from: classes7.dex */
public class kxl implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBLocationDTO f30380a;

    static {
        kge.a(-806913594);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 50015;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public kxl(TBLocationDTO tBLocationDTO) {
        this.f30380a = tBLocationDTO;
    }

    public TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationDTO) ipChange.ipc$dispatch("17ffc33e", new Object[]{this}) : this.f30380a;
    }
}
