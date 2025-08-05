package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class gpf implements gon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bbz f28418a;

    static {
        kge.a(-2007065663);
        kge.a(89523971);
    }

    public gpf(bbz bbzVar) {
        this.f28418a = bbzVar;
    }

    @Override // tb.gon
    public boolean a(IDMComponent iDMComponent) {
        Map<String, List<b>> eventMap;
        List<b> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue() : iDMComponent != null && iDMComponent.getKey() != null && this.f28418a.n().j() && !this.f28418a.v().k() && this.f28418a.n().a() && (eventMap = iDMComponent.getEventMap()) != null && (list = eventMap.get("reorderGroupLongClick")) != null && !list.isEmpty();
    }

    @Override // tb.gon
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !this.f28418a.n().j();
    }
}
