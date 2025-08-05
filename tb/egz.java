package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class egz extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27303a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;

    static {
        kge.a(1374129890);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.container.DetailDivisionViewModel";
    }

    public egz(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27303a = componentModel.mapping.getString("displayType");
        this.b = componentModel.mapping.getString("iconUrl");
        this.c = componentModel.mapping.getString("title");
        this.d = componentModel.mapping.getString("fgcolor");
        this.e = componentModel.mapping.getIntValue("height");
        this.f = componentModel.mapping.getString("bgcolor");
    }

    public egz(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        JSONObject jSONObject;
        if (iDMComponent == null || iDMComponent.getFields() == null || (jSONObject = iDMComponent.getFields().getJSONObject("payload")) == null) {
            return;
        }
        this.f27303a = jSONObject.getString("displayType");
        this.b = jSONObject.getString("iconUrl");
        this.c = jSONObject.getString("title");
        this.d = jSONObject.getString("fgcolor");
        this.e = jSONObject.getIntValue("height");
        this.f = jSONObject.getString("bgcolor");
    }
}
