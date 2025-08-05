package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.YxgDataNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes4.dex */
public class egt extends egq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TradeNode.HintBanner b;
    public YxgDataNode c;
    public int d;
    public long e;
    public boolean f;
    public List<epi> g;

    static {
        kge.a(982271545);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.bottombar.BottomBarViewModel";
    }

    public egt(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        TradeNode e = eqb.e(bVar);
        FeatureNode f = eqb.f(bVar);
        if (e != null) {
            this.b = e.hintBanner;
            this.e = e.startTime == null ? 0L : e.startTime.longValue();
        }
        this.f = f != null && f.secKill;
        this.g = this.children;
        this.c = eqb.s(bVar);
        try {
            this.d = this.component.mapping.getInteger("buttonCount").intValue();
            if (this.d > 0 && this.d <= 2) {
                return;
            }
            this.d = 2;
        } catch (Throwable unused) {
            this.d = 0;
        }
    }

    public egt(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        TradeNode e = eqb.e(bVar);
        FeatureNode f = eqb.f(bVar);
        if (e != null) {
            this.b = e.hintBanner;
            this.e = e.startTime == null ? 0L : e.startTime.longValue();
        }
        this.f = f != null && f.secKill;
        this.g = this.children;
        this.c = eqb.s(bVar);
        try {
            this.d = this.dmComponent.getFields().getInteger("buttonCount").intValue();
            if (this.d > 0 && this.d <= 2) {
                return;
            }
            this.d = 2;
        } catch (Throwable unused) {
            this.d = 0;
        }
    }
}
