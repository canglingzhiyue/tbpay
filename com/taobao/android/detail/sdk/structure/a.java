package com.taobao.android.detail.sdk.structure;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.model.template.ContainerModel;
import com.taobao.android.detail.sdk.model.template.RuleModel;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import tb.ewu;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a implements IProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_TAOBAO_GROUP_NAME = "android_detail";

    /* renamed from: a  reason: collision with root package name */
    public static String f10327a;
    private static final JSONObject d;
    private static JSONObject e;
    public HashMap<String, RuleModel> b;
    public HashMap<String, ActionModel> c;

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public String getRuleIdKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4ab3347", new Object[]{this});
        }
        return null;
    }

    static {
        kge.a(1825897968);
        kge.a(1168839397);
        f10327a = "HierarchyForDetail.json";
        JSONObject parseObject = JSON.parseObject("{\"root\": \"detail\",\"structure\": {\"detail\": [\"navibar\",\"detailHome\"],\"navibar\": [\"naviItemLeft\",\"naviItemCenter\",\"naviItemCustom\",\"naviItemRight\",\"naviTabs\"],\"naviTabs\": [\"naviTabInfo\",\"naviTabDesc\"],\"detailHome\": [\"detailInfo\",\"divisionDesc\",\"detailDesc\"]}}");
        d = parseObject;
        e = parseObject;
        OrangeConfig.getInstance().registerListener(new String[]{"android_detail"}, new com.taobao.orange.f() { // from class: com.taobao.android.detail.sdk.structure.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.f
            public void onConfigUpdate(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                } else if (!"android_detail".equals(str)) {
                } else {
                    a.a();
                }
            }
        });
        tpc.a("com.taobao.android.detail.sdk.structure.ContainerProtocolManager");
    }

    public a() {
        tpc.a("com.taobao.android.detail.sdk.structure.ContainerProtocolManager");
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0623ebc", new Object[]{jSONArray, jSONArray2})).booleanValue();
        }
        int size = jSONArray.size();
        int size2 = jSONArray2.size();
        if (size == 0 || size2 == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String string = jSONArray.getString(i2);
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            while (true) {
                if (i >= size2) {
                    z = false;
                    break;
                } else if (string.equals(jSONArray2.getString(i))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.b = com.taobao.android.detail.sdk.utils.c.a(jSONObject, new com.taobao.android.detail.sdk.utils.g<RuleModel>() { // from class: com.taobao.android.detail.sdk.structure.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.template.RuleModel] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ RuleModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RuleModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RuleModel) ipChange2.ipc$dispatch("281c2843", new Object[]{this, obj}) : new RuleModel((JSONObject) obj);
                }
            });
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.c = com.taobao.android.detail.sdk.utils.c.a(jSONObject, new com.taobao.android.detail.sdk.utils.g<ActionModel>() { // from class: com.taobao.android.detail.sdk.structure.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.template.ActionModel] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ ActionModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ActionModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("fa7c12bd", new Object[]{this, obj}) : new ActionModel((JSONObject) obj);
                }
            });
        }
    }

    public ContainerModel c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerModel) ipChange.ipc$dispatch("559f6ac0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS);
        if (jSONObject2 != null) {
            b(jSONObject2);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("components");
        if (jSONObject3 != null) {
            a(jSONObject3);
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("hierarchy");
        if (jSONObject4 == null) {
            return null;
        }
        String string = jSONObject4.getString("root");
        JSONObject jSONObject5 = jSONObject4.getJSONObject("structure");
        if (TextUtils.isEmpty(string) || jSONObject5 == null || jSONObject5.getJSONArray(string) == null) {
            return null;
        }
        ComponentModel componentModel = new ComponentModel(string, this, jSONObject5);
        ContainerModel containerModel = new ContainerModel();
        containerModel.rootComponent = componentModel;
        try {
            for (ComponentModel componentModel2 : componentModel.children) {
                if (componentModel2.ruleId.equals("navibar")) {
                    containerModel.navBarComponent = componentModel2;
                } else if (componentModel2.ruleId.equals("detailHome")) {
                    containerModel.detailHomeComponent = componentModel2;
                }
            }
            return containerModel;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public RuleModel findRuleById(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleModel) ipChange.ipc$dispatch("c224d7e5", new Object[]{this, str, str2});
        }
        if (ewu.a(this.b) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return this.b.get(str2);
    }

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public ActionModel findActionByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionModel) ipChange.ipc$dispatch("ff1c0777", new Object[]{this, str});
        }
        if (ewu.a(this.c) || TextUtils.isEmpty(str)) {
            return null;
        }
        return new ActionModel(this.c.get(str));
    }

    public static boolean d(JSONObject jSONObject) {
        String key;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = e;
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject2.getString("root")) && jSONObject2.getString("root").equals(jSONObject.getString("root")) && jSONObject2.containsKey("structure") && jSONObject.containsKey("structure")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("structure");
            JSONObject jSONObject4 = jSONObject.getJSONObject("structure");
            if (jSONObject4 != null && jSONObject3 != null) {
                for (Map.Entry<String, Object> entry : jSONObject2.getJSONObject("structure").entrySet()) {
                    try {
                        key = entry.getKey();
                        jSONArray = (JSONArray) entry.getValue();
                    } catch (Throwable unused) {
                    }
                    if (jSONObject4.get(key) == null) {
                        return false;
                    }
                    if (!a(jSONArray, (JSONArray) jSONObject4.get(key))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            e = JSON.parseObject(OrangeConfig.getInstance().getConfig("android_detail", "detail_hierarchy_baseline", "{\"root\": \"detail\",\"structure\": {\"detail\": [\"navibar\",\"detailHome\"],\"navibar\": [\"naviItemLeft\",\"naviItemCenter\",\"naviItemCustom\",\"naviItemRight\",\"naviTabs\"],\"naviTabs\": [\"naviTabInfo\",\"naviTabDesc\"],\"detailHome\": [\"detailInfo\",\"divisionDesc\",\"detailDesc\"]}}"));
        }
    }
}
