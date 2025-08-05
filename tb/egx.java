package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class egx extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27301a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(1778756590);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.container.DetailDescRecommendViewModel";
    }

    public egx(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27301a = componentModel.mapping.getString("itemId");
        this.b = componentModel.mapping.getString("userId");
        this.d = componentModel.mapping.getString("from");
        this.c = componentModel.mapping.getString("shopId");
    }

    public egx(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        JSONObject jSONObject;
        if (iDMComponent == null || iDMComponent.getFields() == null || (jSONObject = iDMComponent.getFields().getJSONObject("payload")) == null) {
            return;
        }
        this.f27301a = jSONObject.getString("itemId");
        this.b = jSONObject.getString("userId");
        this.d = jSONObject.getString("from");
        this.c = jSONObject.getString("shopId");
    }
}
