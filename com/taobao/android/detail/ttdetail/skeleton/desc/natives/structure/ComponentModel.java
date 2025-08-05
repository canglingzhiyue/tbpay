package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class ComponentModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ID;
    public List<ActionModel> actionModelList;
    public List<ComponentModel> children;
    public String filter;
    public String key;
    public String locatorId;
    private l mProtocolManager;
    public JSONObject mapping;
    public JSONObject otherMapping;
    public String ruleId;
    public String style;
    public String type;

    static {
        kge.a(1315620394);
        kge.a(1028243835);
    }

    public static /* synthetic */ l access$000(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("b0cc11b7", new Object[]{componentModel}) : componentModel.mProtocolManager;
    }

    public ComponentModel(JSONObject jSONObject, l lVar) {
        if (jSONObject == null || lVar == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = lVar;
        this.ID = jSONObject.getString("ID");
        this.key = jSONObject.getString("key");
        this.ruleId = jSONObject.getString(this.mProtocolManager.a());
        this.children = initChildren(jSONObject.getJSONArray("children"), lVar);
        parseRule(this.ruleId);
        parseOtherMapping(this.ruleId);
    }

    public ComponentModel() {
    }

    public ComponentModel(String str, l lVar, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || lVar == null || jSONObject == null) {
            throw new IllegalArgumentException();
        }
        this.mProtocolManager = lVar;
        this.ruleId = str;
        parseRule(str);
        this.children = parseChildren(str, jSONObject);
    }

    public void refreshRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98de2fc8", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
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
        this.mapping = TextUtils.isEmpty(a2.mapping) ? null : JSONObject.parseObject(a2.mapping);
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
            return (List) ipChange.ipc$dispatch("713d6eb7", new Object[]{this, ruleModel});
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

    public List<ComponentModel> initChildren(JSONArray jSONArray, final l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("93096ca8", new Object[]{this, jSONArray, lVar}) : i.a(jSONArray, new k<ComponentModel>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel, java.lang.Object] */
            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
            public /* synthetic */ ComponentModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ComponentModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ComponentModel) ipChange2.ipc$dispatch("c531e70b", new Object[]{this, obj});
                }
                if (obj == null) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("ruleId");
                if (ComponentModel.this.key.equals(jSONObject.getString("key")) && ComponentModel.this.ruleId.equals(string)) {
                    return null;
                }
                return new ComponentModel(jSONObject, lVar);
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
        return i.a(jSONArray, new k<ComponentModel>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel, java.lang.Object] */
            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
            public /* synthetic */ ComponentModel b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ComponentModel a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ComponentModel) ipChange2.ipc$dispatch("c531e70b", new Object[]{this, obj});
                }
                if (obj != null) {
                    return new ComponentModel((String) obj, ComponentModel.access$000(ComponentModel.this), jSONObject);
                }
                return null;
            }
        });
    }

    public l getProtocolManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("5d58f8f1", new Object[]{this}) : this.mProtocolManager;
    }
}
