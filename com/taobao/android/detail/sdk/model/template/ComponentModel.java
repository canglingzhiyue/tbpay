package com.taobao.android.detail.sdk.model.template;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.structure.IProtocol;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ComponentModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ID;
    public List<ActionModel> actionModelList;
    public List<ComponentModel> children;
    public String filter;
    public String key;
    public String locatorId;
    private IProtocol mProtocolManager;
    public JSONObject mapping;
    public JSONObject otherMapping;
    public String ruleId;
    public String style;
    public String type;

    static {
        kge.a(475473947);
        kge.a(1028243835);
    }

    public static /* synthetic */ IProtocol access$000(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IProtocol) ipChange.ipc$dispatch("4ca1e8db", new Object[]{componentModel}) : componentModel.mProtocolManager;
    }

    public ComponentModel(JSONObject jSONObject, IProtocol iProtocol) {
        tpc.a("com.taobao.android.detail.sdk.model.template.ComponentModel");
        if (jSONObject == null || iProtocol == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = iProtocol;
        this.ID = jSONObject.getString("ID");
        this.key = jSONObject.getString("key");
        this.ruleId = jSONObject.getString(this.mProtocolManager.getRuleIdKey());
        this.children = initChildren(jSONObject.getJSONArray("children"), iProtocol);
        parseRule(this.ruleId);
        parseOtherMapping(this.ruleId);
    }

    public ComponentModel() {
        tpc.a("com.taobao.android.detail.sdk.model.template.ComponentModel");
    }

    public ComponentModel(String str, IProtocol iProtocol, JSONObject jSONObject) {
        tpc.a("com.taobao.android.detail.sdk.model.template.ComponentModel");
        if (StringUtils.isEmpty(str) || iProtocol == null || jSONObject == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = iProtocol;
        this.ruleId = str;
        parseRule(str);
        this.children = parseChildren(str, jSONObject);
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
        RuleModel findRuleById = this.mProtocolManager.findRuleById(this.key, str);
        if (findRuleById == null) {
            return;
        }
        this.mapping = StringUtils.isEmpty(findRuleById.mapping) ? null : JSONObject.parseObject(findRuleById.mapping);
        JSONObject jSONObject = this.mapping;
        if (jSONObject != null) {
            jSONObject.put("componentId", (Object) str);
        }
        this.filter = findRuleById.filter;
        this.type = findRuleById.type;
        this.locatorId = findRuleById.locatorId;
        this.actionModelList = initEvents(findRuleById);
        this.style = findRuleById.style;
        this.children = initChildren(findRuleById.children, this.mProtocolManager);
    }

    public void parseOtherMapping(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e055d9c2", new Object[]{this, str});
            return;
        }
        RuleModel findRuleById = this.mProtocolManager.findRuleById(this.key, str);
        if (findRuleById == null || findRuleById.root == null || !findRuleById.root.containsKey("styles")) {
            return;
        }
        this.otherMapping = findRuleById.root.getJSONObject("styles");
    }

    public List<ActionModel> initEvents(RuleModel ruleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f67dc126", new Object[]{this, ruleModel});
        }
        List<String> list = ruleModel.actions;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(this.mProtocolManager.findActionByKey(str));
        }
        return arrayList;
    }

    public List<ComponentModel> initChildren(JSONArray jSONArray, final IProtocol iProtocol) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("23541629", new Object[]{this, jSONArray, iProtocol}) : c.a(jSONArray, new g<ComponentModel>() { // from class: com.taobao.android.detail.sdk.model.template.ComponentModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.template.ComponentModel, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ComponentModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ComponentModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ComponentModel) ipChange2.ipc$dispatch("cb224aba", new Object[]{this, obj});
                }
                if (obj == null) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("ruleId");
                if (ComponentModel.this.key.equals(jSONObject.getString("key")) && ComponentModel.this.ruleId.equals(string)) {
                    return null;
                }
                return new ComponentModel(jSONObject, iProtocol);
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
        return c.a(jSONArray, new g<ComponentModel>() { // from class: com.taobao.android.detail.sdk.model.template.ComponentModel.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.template.ComponentModel, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ComponentModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ComponentModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ComponentModel) ipChange2.ipc$dispatch("cb224aba", new Object[]{this, obj});
                }
                if (obj != null) {
                    return new ComponentModel((String) obj, ComponentModel.access$000(ComponentModel.this), jSONObject);
                }
                return null;
            }
        });
    }

    public IProtocol getProtocolManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IProtocol) ipChange.ipc$dispatch("8e1b7fb2", new Object[]{this}) : this.mProtocolManager;
    }
}
