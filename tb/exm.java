package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;

/* loaded from: classes4.dex */
public class exm extends exl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27628a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(1903952596);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 21009;
    }

    public exm(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.container.DetailDescRecommendViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27628a = componentModel.mapping.getString("itemId");
        this.b = componentModel.mapping.getString("userId");
        this.d = componentModel.mapping.getString("from");
        this.c = componentModel.mapping.getString("shopId");
    }
}
