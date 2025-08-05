package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class egr extends egv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27297a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;

    static {
        kge.a(-85803200);
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 44;
    }

    @Override // tb.egv, tb.epi, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.bottombar.BottomBarIconViewModel";
    }

    public egr(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        JSONArray jSONArray;
        this.d = false;
        if (componentModel.mapping == null) {
            return;
        }
        this.f27297a = componentModel.mapping.getString("icon");
        this.b = componentModel.mapping.getString("iconHl");
        this.c = componentModel.mapping.getString("text");
        if (componentModel.mapping.getString("disabled") != null) {
            this.d = componentModel.mapping.getBoolean("disabled").booleanValue();
        }
        JSONObject jSONObject = componentModel.mapping.getJSONObject("colors");
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("colors")) == null || jSONArray.size() < 2) {
            return;
        }
        this.e = jSONArray.getString(0);
        this.f = jSONArray.getString(1);
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.A;
    }

    public egr(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        JSONArray jSONArray;
        this.d = false;
        JSONObject fields = iDMComponent.getFields();
        if (fields == null) {
            return;
        }
        this.f27297a = fields.getString("icon");
        this.b = fields.getString("iconHl");
        this.c = fields.getString("text");
        if (fields.getString("disabled") != null) {
            this.d = fields.getBoolean("disabled").booleanValue();
        }
        JSONObject jSONObject = fields.getJSONObject("colors");
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("colors")) == null || jSONArray.size() < 2) {
            return;
        }
        this.e = jSONArray.getString(0);
        this.f = jSONArray.getString(1);
    }
}
