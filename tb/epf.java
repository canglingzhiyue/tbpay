package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class epf extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<epf> A;
    public int r;
    public int s;
    public String t;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public String y;
    public String z;

    static {
        kge.a(-860587408);
    }

    public static /* synthetic */ Object ipc$super(epf epfVar, String str, Object... objArr) {
        if (str.hashCode() == 333833545) {
            return super.getType();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(JSONObject jSONObject);

    public abstract boolean a();

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public void parseMapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba075a2", new Object[]{this});
        }
    }

    public epf(ComponentModel componentModel) {
        super(componentModel);
        this.v = null;
        this.w = null;
        this.x = false;
        this.A = new ArrayList<>();
        if (componentModel == null) {
            return;
        }
        this.t = componentModel.ruleId;
        this.u = componentModel.key;
        buildChildren();
        parseMapping();
        initEvents();
        initStyle();
        if (componentModel.mapping != null) {
            this.y = componentModel.mapping.getString("spm");
            this.z = componentModel.mapping.getString("scm");
            try {
                a(componentModel.mapping);
            } catch (JSONException e) {
                epp.a("DescViewModel", this.t + ":onViewModelCreate", e);
            }
        }
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.desc.DescViewModel");
    }

    public epf(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.v = null;
        this.w = null;
        this.x = false;
        JSONObject fields = iDMComponent.getFields();
        if (fields != null) {
            a(fields);
        }
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.desc.DescViewModel");
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public void initEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72395e50", new Object[]{this});
        } else if (this.component != null && this.component.actionModelList != null && !this.component.actionModelList.isEmpty()) {
            if (this.component.mapping == null) {
                this.component.mapping = new JSONObject();
            }
            this.component.mapping.put("componentId", (Object) this.t);
            for (ActionModel actionModel : this.component.actionModelList) {
                JSONObject jSONObject = actionModel.params;
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        entry.setValue(epz.a(this.component.mapping, entry.getValue()));
                    }
                }
                this.events.add(emx.a(this.component.getProtocolManager().b()).b().n().a(actionModel, null, this.component.mapping, null));
            }
        }
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public void initStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c821ce88", new Object[]{this});
        } else if (this.component.mapping == null || this.component.otherMapping == null || this.component.otherMapping.isEmpty()) {
        } else {
            this.component.mapping.putAll(this.component.otherMapping);
        }
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public void buildChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdb094", new Object[]{this});
        } else if (this.component != null && this.component.children != null) {
            com.taobao.android.detail.datasdk.factory.manager.b l = emx.a(this.component.getProtocolManager().b()).b().l();
            for (ComponentModel componentModel : this.component.children) {
                epf a2 = l.a(componentModel);
                if (a2 != null && !a2.a()) {
                    this.A.add(a2);
                }
            }
        }
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.u) && this.dmComponent != null) {
            return super.getType();
        }
        return this.u;
    }

    public ArrayList<epf> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this}) : this.A;
    }

    public eph b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eph) ipChange.ipc$dispatch("16b5e500", new Object[]{this});
        }
        if (this.component.mapping == null || !this.component.mapping.containsKey("componentTitle")) {
            return null;
        }
        JSONObject jSONObject = this.component.mapping.getJSONObject("componentTitle");
        if (StringUtils.isEmpty(jSONObject.getString("text"))) {
            return null;
        }
        eph ephVar = new eph(this.component);
        ephVar.t = ephVar.hashCode() + "";
        ephVar.u = "desc_division_title";
        ephVar.c = jSONObject.getString("text");
        ephVar.e = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        ephVar.g = jSONObject.getString("linkUrl");
        ephVar.f = jSONObject.getString("linkText");
        ephVar.d = this.component.mapping.getString("backgroundColor");
        ephVar.f27506a = this.component.mapping.getString("titleColor");
        ephVar.b = this.component.mapping.getString("lineColor");
        ephVar.h = this.component.mapping.getString("paddingBottom");
        ephVar.i = this.component.mapping.getBooleanValue("isHLine");
        return ephVar;
    }

    public String E_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this});
        }
        return this.s + "";
    }
}
