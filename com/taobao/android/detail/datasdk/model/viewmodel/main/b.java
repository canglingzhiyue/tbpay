package com.taobao.android.detail.datasdk.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.biy;
import tb.emu;
import tb.emx;
import tb.eox;
import tb.eoy;
import tb.eoz;
import tb.epi;
import tb.epz;
import tb.eqb;
import tb.jjv;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b extends eoz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<epi> children;
    public ComponentModel component;
    public IDMComponent dmComponent;
    public List<Event> events;
    private boolean isNeedRedraw;
    public String mLocatorId;
    public com.taobao.android.detail.datasdk.model.datamodel.node.b mNodeBundle;
    public boolean needOpenGradient;
    public String stayType;
    public String themeGroup;
    public JSONObject ultronStyleNode;

    static {
        kge.a(1911972208);
    }

    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.datasdk.model.viewmodel.main.MainViewModel";
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.eoz
    public void postMessage(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1b0074", new Object[]{this, str, obj});
        }
    }

    public b(ComponentModel componentModel) {
        this.themeGroup = null;
        this.needOpenGradient = false;
        this.events = new ArrayList();
        emu.a(getFullClassName());
        this.component = componentModel;
        this.children = new ArrayList();
        if (componentModel != null) {
            this.mLocatorId = componentModel.locatorId;
        }
    }

    public b(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        this(componentModel);
        if (componentModel == null || bVar == null) {
            return;
        }
        this.mNodeBundle = bVar;
        ItemNode c = eqb.c(bVar);
        FeatureNode f = eqb.f(bVar);
        this.themeGroup = c.themeType;
        this.needOpenGradient = f.needOpenGradient;
        buildChildren();
        parseMapping();
        initStyle();
    }

    public void initStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c821ce88", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || StringUtils.isEmpty(componentModel.style)) {
            return;
        }
        if (biy.a()) {
            this.component.style = biy.a(this.mNodeBundle.a(), null, this.component.style).toString();
        } else {
            this.component.style = jjv.a((Object) this.mNodeBundle.a(), this.component.style).toString();
        }
    }

    public void initEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72395e50", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || componentModel.actionModelList == null || this.component.actionModelList.isEmpty()) {
            return;
        }
        for (ActionModel actionModel : this.component.actionModelList) {
            JSONObject jSONObject = actionModel.params;
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    entry.setValue(epz.a(this.mNodeBundle.a(), entry.getValue()));
                }
            }
        }
    }

    public void parseMapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba075a2", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || componentModel.mapping == null || this.component.mapping.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : this.component.mapping.entrySet()) {
            entry.setValue(epz.a(this.mNodeBundle.a(), entry.getValue()));
        }
    }

    public void buildChildren() {
        com.taobao.android.detail.datasdk.factory.manager.b l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdb094", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || componentModel.children == null) {
            return;
        }
        for (ComponentModel componentModel2 : this.component.children) {
            epi epiVar = null;
            try {
                l = emx.a(this.mNodeBundle.h()).b().l();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (l == null) {
                return;
            }
            epiVar = l.b(componentModel2, this.mNodeBundle);
            if (epiVar != null) {
                this.children.add(epiVar);
            }
        }
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        ComponentModel componentModel = this.component;
        if (componentModel != null) {
            return componentModel.key;
        }
        IDMComponent iDMComponent = this.dmComponent;
        return iDMComponent != null ? eoy.a(iDMComponent) : "";
    }

    public boolean isNeedRedraw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d404402", new Object[]{this})).booleanValue() : this.isNeedRedraw;
    }

    public void setNeedRedraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d22f136", new Object[]{this});
        } else {
            this.isNeedRedraw = true;
        }
    }

    public void resetRedraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f37dad", new Object[]{this});
        } else {
            this.isNeedRedraw = false;
        }
    }

    public b(IDMComponent iDMComponent) {
        this.themeGroup = null;
        this.needOpenGradient = false;
        this.events = new ArrayList();
        emu.a(getFullClassName());
        this.dmComponent = iDMComponent;
        this.children = new ArrayList();
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        this.mLocatorId = iDMComponent.getFields().getString("locatorId");
        this.stayType = iDMComponent.getFields().getString("stayType");
    }

    public b(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        this(iDMComponent);
        if (iDMComponent == null || bVar == null) {
            return;
        }
        this.mNodeBundle = bVar;
        ItemNode c = eqb.c(bVar);
        FeatureNode f = eqb.f(bVar);
        this.themeGroup = c.themeType;
        this.needOpenGradient = f.needOpenGradient;
        ultronBuildChildren();
        ultronParseMapping();
        ultronInitStyle();
    }

    public void ultronBuildChildren() {
        eox m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f97f700", new Object[]{this});
            return;
        }
        IDMComponent iDMComponent = this.dmComponent;
        if (iDMComponent == null || iDMComponent.getChildren() == null) {
            return;
        }
        for (IDMComponent iDMComponent2 : this.dmComponent.getChildren()) {
            epi epiVar = null;
            try {
                m = emx.a(this.mNodeBundle.h()).b().m();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (m == null) {
                return;
            }
            epiVar = m.b(iDMComponent2, this.mNodeBundle);
            if (epiVar != null) {
                this.children.add(epiVar);
            }
        }
    }

    public void ultronParseMapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47db1b6", new Object[]{this});
            return;
        }
        IDMComponent iDMComponent = this.dmComponent;
        if (iDMComponent == null || iDMComponent.getFields() == null || this.dmComponent.getFields().isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : this.dmComponent.getFields().entrySet()) {
            entry.setValue(epz.a(this.mNodeBundle.a(), entry.getValue()));
        }
    }

    public void ultronInitStyle() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7882af4", new Object[]{this});
            return;
        }
        try {
            if (this.dmComponent != null && this.dmComponent.getFields() != null && (jSONObject = this.dmComponent.getFields().getJSONObject("style")) != null) {
                this.ultronStyleNode = eoy.a(jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.eoz
    public String getkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96f6ff50", new Object[]{this});
        }
        if (this.component != null) {
            return this.component.key + "$" + this.component.ruleId;
        } else if (this.dmComponent == null) {
            return "";
        } else {
            return eoy.a(this.dmComponent) + "$" + eoy.b(this.dmComponent);
        }
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        ComponentModel componentModel = this.component;
        if (componentModel != null) {
            return componentModel.ruleId;
        }
        IDMComponent iDMComponent = this.dmComponent;
        return iDMComponent != null ? iDMComponent.getId() : "";
    }

    public String getComponentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        ComponentModel componentModel = this.component;
        if (componentModel != null) {
            return componentModel.key;
        }
        IDMComponent iDMComponent = this.dmComponent;
        return iDMComponent != null ? eoy.a(iDMComponent) : "";
    }

    public String getCompontName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cf3065e", new Object[]{this});
        }
        ComponentModel componentModel = this.component;
        if (componentModel != null) {
            return componentModel.ruleId;
        }
        IDMComponent iDMComponent = this.dmComponent;
        return iDMComponent != null ? eoy.b(iDMComponent) : "";
    }

    public String getContainerKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e9b82e5", new Object[]{this});
        }
        IDMComponent iDMComponent = this.dmComponent;
        return (iDMComponent == null || iDMComponent.getParent() == null) ? "" : eoy.b(this.dmComponent.getParent());
    }

    public String getTemplateId() {
        com.taobao.android.detail.datasdk.model.datamodel.node.a j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a67390ae", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.mNodeBundle;
        return (bVar == null || (j = bVar.j()) == null || j.e == null || j.e.f10048a == null) ? "" : j.e.f10048a.f10049a;
    }

    public String getShopTypeOriginal() {
        SellerNode d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ce1ea2", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.mNodeBundle;
        return (bVar == null || (d = eqb.d(bVar)) == null) ? "C" : d.shopTypeOriginal;
    }

    public String getItemId() {
        ItemNode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.mNodeBundle;
        return (bVar == null || (c = eqb.c(bVar)) == null) ? "" : c.itemId;
    }

    public String getBizName() {
        Map<String, String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.mNodeBundle;
        return (bVar == null || (e = bVar.e()) == null) ? "" : e.get("aliBizName");
    }

    public String getAsyncRequest() {
        JSONObject jSONObject;
        IDMComponent iDMComponent;
        IDMComponent iDMComponent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baa333b0", new Object[]{this});
        }
        ComponentModel componentModel = this.component;
        String str = null;
        JSONObject jSONObject2 = (componentModel == null || componentModel.mapping == null) ? null : this.component.mapping.getJSONObject("request");
        if (jSONObject2 == null && (iDMComponent2 = this.dmComponent) != null && iDMComponent2.getFields() != null) {
            jSONObject2 = this.dmComponent.getFields().getJSONObject("request");
        }
        if (jSONObject2 != null) {
            HashMap hashMap = new HashMap();
            String string = jSONObject2.getString("api");
            String string2 = jSONObject2.getString("version");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("params");
            hashMap.put("api", string);
            hashMap.put("version", string2);
            hashMap.put("params", jSONObject3);
            return hashMap.toString();
        }
        ComponentModel componentModel2 = this.component;
        if (componentModel2 == null || componentModel2.mapping == null) {
            jSONObject = null;
        } else {
            str = this.component.mapping.getString("url");
            jSONObject = this.component.mapping.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        if (StringUtils.isEmpty(str) && (iDMComponent = this.dmComponent) != null && iDMComponent.getFields() != null) {
            str = this.dmComponent.getFields().getString("url");
            jSONObject = this.dmComponent.getFields().getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        hashMap2.put(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, jSONObject);
        return hashMap2.toString();
    }

    public String getTemplateInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39b086fb", new Object[]{this});
        }
        JSONObject jSONObject = null;
        ComponentModel componentModel = this.component;
        if (componentModel != null && componentModel.mapping != null) {
            jSONObject = this.component.mapping.getJSONObject("template");
        }
        try {
            if ("dinamic".equals(this.dmComponent.getContainerType())) {
                jSONObject = this.dmComponent.getContainerInfo();
            } else {
                jSONObject = this.dmComponent.getFields().getJSONObject("template");
            }
        } catch (Throwable unused) {
        }
        if (jSONObject == null) {
            return "";
        }
        String string = jSONObject.getString("name");
        String string2 = jSONObject.getString("version");
        String string3 = jSONObject.getString("url");
        if (StringUtils.isEmpty(string3)) {
            string3 = jSONObject.getString("android");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", string);
        hashMap.put("version", string2);
        hashMap.put("url", string3);
        return hashMap.toString();
    }

    public String getEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("314c9a4a", new Object[]{this});
        }
        ComponentModel componentModel = this.component;
        if (componentModel != null && componentModel.actionModelList != null && !this.component.actionModelList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ActionModel actionModel : this.component.actionModelList) {
                if (actionModel != null && !StringUtils.isEmpty(actionModel.type)) {
                    arrayList.add(actionModel.type);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList.toString();
            }
        }
        IDMComponent iDMComponent = this.dmComponent;
        if (iDMComponent == null || iDMComponent.getEventMap() == null) {
            return "";
        }
        ArrayList arrayList2 = new ArrayList();
        Set<String> keySet = this.dmComponent.getEventMap().keySet();
        if (keySet != null) {
            for (String str : keySet) {
                List<com.taobao.android.ultron.common.model.b> list = this.dmComponent.getEventMap().get(str);
                if (list == null) {
                    for (com.taobao.android.ultron.common.model.b bVar : list) {
                        if (bVar != null && !StringUtils.isEmpty(bVar.getType())) {
                            arrayList2.add(bVar.getType());
                        }
                    }
                }
            }
        }
        return !arrayList2.isEmpty() ? arrayList2.toString() : "";
    }
}
