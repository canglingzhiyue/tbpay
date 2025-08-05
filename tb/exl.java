package tb;

import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;

/* loaded from: classes4.dex */
public abstract class exl extends MainViewModel {
    static {
        kge.a(-177606210);
    }

    public exl(ComponentModel componentModel) {
        this(componentModel, null);
    }

    public exl(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.container.DetailContainerViewModel");
    }
}
