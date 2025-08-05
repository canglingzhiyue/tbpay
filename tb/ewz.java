package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.factory.manager.b;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;
import java.util.ArrayList;
import tb.mto;

/* loaded from: classes4.dex */
public class ewz extends WidgetViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27619a;
    public String b;
    public double c;
    public ArrayList<WidgetViewModel> d;

    static {
        kge.a(503862178);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public int getMiniWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13b808f3", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 20004;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public double getWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue() : mto.a.GEO_NOT_SUPPORT;
    }

    public ewz(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.d = new ArrayList<>();
        tpc.a("com.taobao.android.detail.sdk.vmodel.actionbar.ActionBarItemViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27619a = componentModel.mapping.getString("title");
        this.b = componentModel.mapping.getString("positionKey");
        this.c = componentModel.mapping.getDoubleValue("titleSizeRatio");
        if (componentModel.children == null || componentModel.children.isEmpty()) {
            return;
        }
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b a2 = b.a();
        for (ComponentModel componentModel : this.component.children) {
            try {
                this.d.add(a2.b(componentModel, this.mNodeBundle));
            } catch (Exception unused) {
            }
        }
    }
}
