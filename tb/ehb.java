package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class ehb extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2064763265);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.container.DetailInfoViewModel";
    }

    public ehb(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
    }

    public ehb(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
    }
}
