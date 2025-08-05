package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fcg extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27791a;
    public int b;
    public String c;
    public String d;

    static {
        kge.a(1592996627);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.component.main.viewmodel.WeexVesselViewModel";
    }

    public fcg(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.WeexVesselViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        this.b = jSONObject.getIntValue("height");
        this.f27791a = jSONObject.getString("url");
        this.c = eqb.c(bVar).itemId;
        this.d = eqb.d(bVar).userId;
    }

    public fcg(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.WeexVesselViewModel");
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        this.b = fields.getIntValue("height");
        this.f27791a = fields.getString("url");
        this.c = eqb.c(bVar).itemId;
        this.d = eqb.d(bVar).userId;
    }
}
