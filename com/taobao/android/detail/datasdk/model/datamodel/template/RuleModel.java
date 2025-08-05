package com.taobao.android.detail.datasdk.model.datamodel.template;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

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
        kge.a(-895255112);
        kge.a(1028243835);
    }

    public RuleModel(JSONObject jSONObject) {
        this.root = jSONObject;
        this.filter = jSONObject.getString("filter");
        this.mapping = jSONObject.getString("payload");
        if (TextUtils.isEmpty(this.mapping)) {
            this.mapping = jSONObject.getString("model");
        }
        this.locatorId = jSONObject.getString("locatorId");
        this.type = jSONObject.getString("type");
        this.actions = initAction(jSONObject.getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS));
        this.style = epw.a(jSONObject.getString("style"));
        this.children = jSONObject.getJSONArray("children");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel");
    }

    private List<String> initAction(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("919dbb92", new Object[]{this, jSONArray}) : epw.a(jSONArray, new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
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
