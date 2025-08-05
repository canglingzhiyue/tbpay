package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.TradeNode;
import com.taobao.android.detail.sdk.model.node.YxgDataNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;
import java.util.List;

/* loaded from: classes4.dex */
public class exi extends exb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TradeNode.HintBanner f27626a;
    public YxgDataNode b;
    public int c;
    public long d;
    public boolean e;
    public List<WidgetViewModel> f;

    static {
        kge.a(-1114577761);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 20002;
    }

    public exi(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.bottombar.BottomBarViewModel");
        if (nodeBundle.tradeNode != null) {
            this.f27626a = nodeBundle.tradeNode.hintBanner;
            this.d = nodeBundle.tradeNode.startTime == null ? 0L : nodeBundle.tradeNode.startTime.longValue();
        }
        this.e = nodeBundle.featureNode != null && nodeBundle.featureNode.secKill;
        this.f = this.children;
        this.b = nodeBundle.yxgDataNode;
        try {
            this.c = this.component.mapping.getInteger("buttonCount").intValue();
            if (this.c > 0 && this.c <= 2) {
                return;
            }
            this.c = 2;
        } catch (Throwable unused) {
            this.c = 0;
        }
    }
}
