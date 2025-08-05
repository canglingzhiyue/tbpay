package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;

/* loaded from: classes4.dex */
public class exo extends exl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27630a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;

    static {
        kge.a(1562640444);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30020;
    }

    public exo(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.container.DetailDivisionViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27630a = componentModel.mapping.getString("displayType");
        this.b = componentModel.mapping.getString("iconUrl");
        this.c = componentModel.mapping.getString("title");
        this.d = componentModel.mapping.getString("fgcolor");
        this.e = componentModel.mapping.getIntValue("height");
        this.f = componentModel.mapping.getString("bgcolor");
    }
}
