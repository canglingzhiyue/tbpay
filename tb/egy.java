package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* loaded from: classes4.dex */
public class egy extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27302a;
    public String b;
    public String c;
    public Map<String, String> d;
    public String e;
    public String f;
    public boolean g;

    static {
        kge.a(-1452302594);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.container.DetailDescViewModel";
    }

    public egy(ComponentModel componentModel) {
        super(componentModel);
    }

    public egy(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27302a = componentModel.mapping.getString("userId");
        this.b = componentModel.mapping.getString("shopId");
        this.c = componentModel.mapping.getString("itemId");
        this.d = (Map) componentModel.mapping.getObject("moduleDescParams", Map.class);
        this.e = componentModel.mapping.getString("taobaoDescUrl");
        this.f = componentModel.mapping.getString("taobaoPcDescUrl");
        if (bVar == null) {
            return;
        }
        ItemNode c = eqb.c(bVar);
        this.g = c != null && c.openDecoration;
    }

    public egy(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        JSONObject jSONObject;
        if (iDMComponent == null || iDMComponent.getFields() == null || (jSONObject = iDMComponent.getFields().getJSONObject("payload")) == null) {
            return;
        }
        this.f27302a = jSONObject.getString("userId");
        this.b = jSONObject.getString("shopId");
        this.c = jSONObject.getString("itemId");
        this.d = (Map) jSONObject.getObject("moduleDescParams", Map.class);
        this.e = jSONObject.getString("taobaoDescUrl");
        this.f = jSONObject.getString("taobaoPcDescUrl");
        if (bVar == null) {
            return;
        }
        ItemNode c = eqb.c(bVar);
        this.g = c != null && c.openDecoration;
    }
}
