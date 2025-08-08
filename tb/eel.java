package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.basic.GetCommonTrackArgsEvent;
import com.taobao.android.detail.core.event.basic.f;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class eel implements k<GetCommonTrackArgsEvent, f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27236a;

    static {
        kge.a(-1060033603);
        kge.a(-2120299997);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((GetCommonTrackArgsEvent) event);
    }

    public eel(DetailCoreActivity detailCoreActivity) {
        this.f27236a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.GetCommonTrackArgsSubscriber");
    }

    public f a(GetCommonTrackArgsEvent getCommonTrackArgsEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("651aeadb", new Object[]{this, getCommonTrackArgsEvent});
        }
        f fVar = new f();
        c cVar = this.f27236a.y().t;
        if (cVar == null) {
            return fVar;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("item_id", cVar.i());
        hashMap.put("shop_id", cVar.o());
        hashMap.put("seller_id", cVar.h());
        if (!StringUtils.isEmpty(this.f27236a.f9411a.u)) {
            hashMap.put("fromtorelation", this.f27236a.f9411a.u);
        }
        Map<String, String> g = cVar.g();
        if (g != null) {
            hashMap.putAll(g);
        }
        fVar.f9701a = hashMap;
        return fVar;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.CurrentThread;
    }
}
