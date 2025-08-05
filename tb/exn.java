package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.Map;

/* loaded from: classes4.dex */
public class exn extends exl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27629a;
    public String b;
    public String c;
    public Map<String, String> d;
    public String e;
    public String f;
    public boolean g;

    static {
        kge.a(-2030121640);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 21008;
    }

    public exn(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.container.DetailDescViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27629a = componentModel.mapping.getString("userId");
        this.b = componentModel.mapping.getString("shopId");
        this.c = componentModel.mapping.getString("itemId");
        this.d = (Map) componentModel.mapping.getObject("moduleDescParams", Map.class);
        this.e = componentModel.mapping.getString("taobaoDescUrl");
        this.f = componentModel.mapping.getString("taobaoPcDescUrl");
        if (nodeBundle == null || nodeBundle.itemNode == null) {
            return;
        }
        this.g = nodeBundle.itemNode.openDecoration;
    }
}
