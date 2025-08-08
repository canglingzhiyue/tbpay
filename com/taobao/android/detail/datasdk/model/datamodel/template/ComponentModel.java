package com.taobao.android.detail.datasdk.model.datamodel.template;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.emu;
import tb.enf;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class ComponentModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ID;
    public List<ActionModel> actionModelList;
    public List<ComponentModel> children;
    public String filter;
    public String key;
    public String locatorId;
    private enf mProtocolManager;
    public JSONObject mapping;
    public JSONObject otherMapping;
    public String ruleId;
    public String style;
    public String type;

    static {
        kge.a(-1191159071);
        kge.a(1028243835);
    }

    public static /* synthetic */ enf access$000(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enf) ipChange.ipc$dispatch("d7140b00", new Object[]{componentModel}) : componentModel.mProtocolManager;
    }

    public ComponentModel(JSONObject jSONObject, enf enfVar) {
        if (jSONObject == null || enfVar == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = enfVar;
        this.ID = jSONObject.getString("ID");
        this.key = jSONObject.getString("key");
        this.ruleId = jSONObject.getString(this.mProtocolManager.a());
        this.children = initChildren(jSONObject.getJSONArray("children"), enfVar);
        parseRule(this.ruleId);
        parseOtherMapping(this.ruleId);
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel");
    }

    public ComponentModel() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel");
    }

    public ComponentModel(String str, enf enfVar, JSONObject jSONObject) {
        if (StringUtils.isEmpty(str) || enfVar == null || jSONObject == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = enfVar;
        this.ruleId = str;
        parseRule(str);
        this.children = parseChildren(str, jSONObject);
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel");
    }

    public void refreshRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98de2fc8", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            parseRule(str);
        }
    }

    public void parseRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f19a0", new Object[]{this, str});
            return;
        }
        RuleModel a2 = this.mProtocolManager.a(this.key, str);
        if (a2 == null) {
            return;
        }
        this.mapping = StringUtils.isEmpty(a2.mapping) ? null : JSONObject.parseObject(a2.mapping);
        JSONObject jSONObject = this.mapping;
        if (jSONObject != null) {
            jSONObject.put("componentId", (Object) str);
        }
        this.filter = a2.filter;
        this.type = a2.type;
        this.locatorId = a2.locatorId;
        this.actionModelList = initEvents(a2);
        this.style = a2.style;
        this.children = initChildren(a2.children, this.mProtocolManager);
    }

    public void parseOtherMapping(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e055d9c2", new Object[]{this, str});
            return;
        }
        RuleModel a2 = this.mProtocolManager.a(this.key, str);
        if (a2 == null || a2.root == null || !a2.root.containsKey("styles")) {
            return;
        }
        this.otherMapping = a2.root.getJSONObject("styles");
    }

    public List<ActionModel> initEvents(RuleModel ruleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("20fbb460", new Object[]{this, ruleModel});
        }
        List<String> list = ruleModel.actions;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(this.mProtocolManager.a(str));
        }
        return arrayList;
    }

    public List<ComponentModel> initChildren(JSONArray jSONArray, final enf enfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("648b0e56", new Object[]{this, jSONArray, enfVar}) : epw.a(jSONArray, new epy<ComponentModel>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ ComponentModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ComponentModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ComponentModel) ipChange2.ipc$dispatch("af674334", new Object[]{this, obj});
                }
                if (obj == null) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("ruleId");
                if (ComponentModel.this.key.equals(jSONObject.getString("key")) && ComponentModel.this.ruleId.equals(string)) {
                    return null;
                }
                return new ComponentModel(jSONObject, enfVar);
            }
        });
    }

    public List<ComponentModel> parseChildren(String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1c9a923a", new Object[]{this, str, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray == null) {
            return null;
        }
        return epw.a(jSONArray, new epy<ComponentModel>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ ComponentModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ComponentModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ComponentModel) ipChange2.ipc$dispatch("af674334", new Object[]{this, obj});
                }
                if (obj != null) {
                    return new ComponentModel((String) obj, ComponentModel.access$000(ComponentModel.this), jSONObject);
                }
                return null;
            }
        });
    }

    public enf getProtocolManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enf) ipChange.ipc$dispatch("89e7c1c3", new Object[]{this}) : this.mProtocolManager;
    }
}
