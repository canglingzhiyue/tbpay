package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;

/* loaded from: classes4.dex */
public class exd extends exk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27621a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;

    static {
        kge.a(335919782);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public int getMiniWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13b808f3", new Object[]{this})).intValue();
        }
        return 44;
    }

    public exd(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        JSONArray jSONArray;
        this.d = false;
        tpc.a("com.taobao.android.detail.sdk.vmodel.bottombar.BottomBarIconViewModel");
        if (componentModel.mapping == null) {
            return;
        }
        this.f27621a = componentModel.mapping.getString("icon");
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

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public double getWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue() : this.A;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : (StringUtils.isEmpty(this.e) || StringUtils.isEmpty(this.f)) ? ewy.T_BOTTOM_BAR_ICON : ewy.T_BOTTOM_BAR_GRADIENT;
    }
}
