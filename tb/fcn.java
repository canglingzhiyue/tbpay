package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;

/* loaded from: classes5.dex */
public class fcn extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f27805a;

    static {
        kge.a(-1810152767);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "国际尺码对照表";
    }

    public fcn() {
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenInterSizingChartEvent");
    }

    public fcn(b bVar) {
        this.f27805a = bVar;
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenInterSizingChartEvent");
    }

    public String b() {
        VerticalNode g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        b bVar = this.f27805a;
        return (bVar == null || (g = eqb.g(bVar)) == null || g.hkNode == null) ? "" : g.hkNode.sizingChartUrl;
    }
}
