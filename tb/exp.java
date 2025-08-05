package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.factory.manager.b;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class exp extends exl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<exl> f27631a;

    static {
        kge.a(-114159926);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 21010;
    }

    public exp(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.container.DetailHomeViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public void buildChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdb094", new Object[]{this});
        } else if (this.component != null && this.component.children != null) {
            this.f27631a = new ArrayList();
            for (ComponentModel componentModel : this.component.children) {
                exl exlVar = null;
                try {
                    exlVar = b.a().d(componentModel, this.mNodeBundle);
                } catch (Exception unused) {
                }
                if (exlVar != null) {
                    this.f27631a.add(exlVar);
                }
            }
        }
    }
}
