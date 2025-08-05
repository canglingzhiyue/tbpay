package com.taobao.android.detail2.core.framework.data.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.g;
import java.io.Serializable;
import java.util.HashMap;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public class CardInnerCommonNode implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String containerName;
    public JSONObject data;
    public JSONObject dataContext;
    public d dataContextNode;
    public String locator;
    public String nid;
    public String position;
    public String type;
    public g containerInfo = new g();
    public HashMap<String, String> extraData = new HashMap<>();

    static {
        kge.a(-1561614264);
        kge.a(1028243835);
    }

    public CardInnerCommonNode(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.type = jSONObject.getString("type");
        this.position = jSONObject.getString("position");
        this.data = jSONObject.getJSONObject("data");
        this.containerName = jSONObject.getString("containerName");
        JSONObject jSONObject2 = jSONObject.getJSONObject("containerInfo");
        if (jSONObject2 != null) {
            this.containerInfo.a(jSONObject2.getString("weexUrl"));
            processContainerQueryParams(jSONObject2.getJSONObject("weexParams"));
        }
        this.locator = jSONObject.getString("locator");
    }

    private void processContainerQueryParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662ada8d", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                for (String str : jSONObject.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        this.containerInfo.b.put(str, jSONObject.getString(str));
                    }
                }
            } catch (Exception e) {
                fjt.a("new_detail异常", "processContainerQueryParams异常", e);
            }
        }
    }

    public boolean isUrlValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8d6b022", new Object[]{this})).booleanValue();
        }
        g gVar = this.containerInfo;
        return gVar != null && !TextUtils.isEmpty(gVar.a());
    }
}
