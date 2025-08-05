package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class ehf extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27308a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-155754571);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.navbar.NavBarTabItemViewModel";
    }

    public ehf(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        a(componentModel, bVar);
    }

    private void a(ComponentModel componentModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4b7b32", new Object[]{this, componentModel, bVar});
        } else if (componentModel == null) {
        } else {
            this.f27308a = componentModel.type;
            JSONObject jSONObject = componentModel.mapping;
            this.b = jSONObject.getString("iconUrl");
            this.c = jSONObject.getString("title");
            this.d = jSONObject.getString("titleUrl");
        }
    }

    public ehf(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        a(iDMComponent, bVar);
    }

    private void a(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bc3186", new Object[]{this, iDMComponent, bVar});
        } else if (iDMComponent == null) {
        } else {
            this.f27308a = iDMComponent.getType();
            JSONObject jSONObject = iDMComponent.getFields().getJSONObject("payload");
            this.b = jSONObject.getString("iconUrl");
            this.c = jSONObject.getString("title");
            this.d = jSONObject.getString("titleUrl");
        }
    }
}
