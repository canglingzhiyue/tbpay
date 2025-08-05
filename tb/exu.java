package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;

/* loaded from: classes4.dex */
public class exu extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a d;
    public JSONObject e;
    public JSONObject f;
    public String g;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27636a;
        public String b;
        public String c;

        static {
            kge.a(-1430231793);
        }

        public a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f27636a = c.a(jSONObject.getString("name"));
                this.b = c.a(jSONObject.getString("android"));
                this.c = c.a(jSONObject.getString("version"));
            }
        }
    }

    static {
        kge.a(1694317169);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_DINAMIC;
    }

    public exu(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.dinamic.DinamicViewModel");
        if (componentModel == null || nodeBundle == null) {
            return;
        }
        this.mNodeBundle = nodeBundle;
        this.themeGroup = nodeBundle.itemNode.themeType;
        this.needOpenGradient = nodeBundle.featureNode.needOpenGradient;
        a(componentModel);
        buildChildren();
        parseMapping();
        initEvents();
        initStyle();
    }

    private void a(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b302de", new Object[]{this, componentModel});
            return;
        }
        this.d = new a(componentModel.mapping.getJSONObject("template"));
        this.e = componentModel.mapping.getJSONObject("event");
        this.f = componentModel.mapping.getJSONObject("track");
        this.g = componentModel.mapping.getString("subfilter");
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            this.e = JSONObject.parseObject(jSONObject.toJSONString());
        }
        JSONObject jSONObject2 = this.f;
        if (jSONObject2 == null) {
            return;
        }
        this.f = JSONObject.parseObject(jSONObject2.toJSONString());
    }
}
