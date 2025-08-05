package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class ehe extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27307a;
    public double b;
    public String c;
    public String d;
    public String e;
    public String f;

    static {
        kge.a(-1787474760);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.navbar.NavBarItemViewModel";
    }

    public ehe(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        initEvents();
        a(componentModel, bVar);
    }

    public ehe(ComponentModel componentModel) {
        super(componentModel);
    }

    private void a(ComponentModel componentModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4b7b32", new Object[]{this, componentModel, bVar});
        } else if (componentModel == null) {
        } else {
            JSONObject jSONObject = componentModel.mapping;
            this.f27307a = jSONObject.getString("accessHint");
            this.b = jSONObject.getDoubleValue("titleSizeRatio");
            this.c = jSONObject.getString("value");
            this.d = jSONObject.getString("componentId");
            this.e = jSONObject.getString("positionKey");
            this.f = jSONObject.getString("rightIndex");
        }
    }

    public ehe(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        a(iDMComponent, bVar);
    }

    private void a(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bc3186", new Object[]{this, iDMComponent, bVar});
        } else if (iDMComponent == null) {
        } else {
            JSONObject jSONObject = iDMComponent.getFields().getJSONObject("payload");
            this.f27307a = jSONObject.getString("accessHint");
            this.b = jSONObject.getDoubleValue("titleSizeRatio");
            this.c = jSONObject.getString("value");
            this.d = jSONObject.getString("componentId");
            this.e = jSONObject.getString("positionKey");
            this.f = jSONObject.getString("rightIndex");
        }
    }
}
