package com.taobao.android.detail.sdk.model.template;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class RuleModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> actions;
    public JSONArray children;
    public String filter;
    public String locatorId;
    public String mapping;
    public JSONObject root;
    public String style;
    public String type;

    static {
        kge.a(-71576514);
        kge.a(1028243835);
    }

    public RuleModel(JSONObject jSONObject) {
        tpc.a("com.taobao.android.detail.sdk.model.template.RuleModel");
        this.root = jSONObject;
        this.filter = jSONObject.getString("filter");
        this.mapping = jSONObject.getString("payload");
        if (StringUtils.isEmpty(this.mapping)) {
            this.mapping = jSONObject.getString("model");
        }
        this.locatorId = jSONObject.getString("locatorId");
        this.type = jSONObject.getString("type");
        this.actions = initAction(jSONObject.getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS));
        this.style = c.a(jSONObject.getString("style"));
        this.children = jSONObject.getJSONArray("children");
    }

    private List<String> initAction(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("919dbb92", new Object[]{this, jSONArray}) : c.a(jSONArray, new g<String>() { // from class: com.taobao.android.detail.sdk.model.template.RuleModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
    }
}
