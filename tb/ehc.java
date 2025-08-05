package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;

/* loaded from: classes4.dex */
public class ehc extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27305a;
    public String b;
    public String c;
    public JSONObject d;
    public int e;
    public int f;
    public int g;
    public String h;

    static {
        kge.a(-621336959);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.container.DetailTTElevatorViewModel";
    }

    public ehc(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        if (iDMComponent == null) {
            i.a(com.taobao.android.detail.core.performance.i.a("DetailTTElevatorViewModel", BTags.TTFloat), "no component data");
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields == null || fields.getJSONObject("template") == null) {
            i.a(com.taobao.android.detail.core.performance.i.a("DetailTTElevatorViewModel", BTags.TTFloat), "no template");
            return;
        }
        JSONObject jSONObject = fields.getJSONObject("template");
        this.f27305a = jSONObject.getString("name");
        this.b = jSONObject.getString("version");
        this.c = jSONObject.getString("url");
        this.d = fields.getJSONObject("data");
        JSONObject jSONObject2 = this.d;
        if (jSONObject2 == null) {
            i.a(com.taobao.android.detail.core.performance.i.a("DetailTTElevatorViewModel", BTags.TTFloat), "no template data");
            return;
        }
        this.e = jSONObject2.getIntValue("marginBottom");
        this.f = this.d.getIntValue("width");
        this.g = this.d.getIntValue("height");
        this.h = this.d.getString(AbsListWidgetInstance.KEY_SECTION_EXPAND);
    }
}
