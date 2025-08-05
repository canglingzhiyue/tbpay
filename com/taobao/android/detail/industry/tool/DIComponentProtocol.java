package com.taobao.android.detail.industry.tool;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIConstants;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DIComponentProtocol implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INDUSTRY_BIZ_TYPE = "industry_custom";
    public String bizCode;
    public JSONObject bizData;
    public String bizType;
    public String componentKey;
    public String containType;
    public String industryCode;

    static {
        kge.a(661475935);
        kge.a(1028243835);
    }

    public DIComponentProtocol(AURARenderComponent aURARenderComponent) {
        parseComponent(aURARenderComponent);
        emu.a("com.taobao.android.detail.industry.tool.DIComponentProtocol");
    }

    public void parseComponent(AURARenderComponent aURARenderComponent) {
        JSONObject fields;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade340a", new Object[]{this, aURARenderComponent});
        } else if (aURARenderComponent != null) {
            try {
                if (aURARenderComponent.data == null) {
                    return;
                }
                this.componentKey = aURARenderComponent.key;
                this.containType = aURARenderComponent.getContainerType();
                Map<String, Object> map = aURARenderComponent.data.fields;
                if (map == null) {
                    return;
                }
                if (aURARenderComponent.getContainerType().equals(DIConstants.RenderType.WEEX2.getValue())) {
                    parseWeex2Data(map);
                }
                if (!TextUtils.isEmpty(this.bizCode) || aURARenderComponent.data.events == null) {
                    return;
                }
                for (Map.Entry<String, List<Event>> entry : aURARenderComponent.data.events.entrySet()) {
                    for (Event event : entry.getValue()) {
                        if ("userTrack".equals(event.type) && (fields = event.getFields()) != null && (jSONObject = fields.getJSONObject("args")) != null) {
                            parseUtArgs(jSONObject);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private void parseWeex2Data(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8884f6", new Object[]{this, map});
            return;
        }
        Object obj = map.get("params");
        if (!(obj instanceof JSONObject)) {
            return;
        }
        Object obj2 = ((JSONObject) obj).get("bridgeData");
        if (!(obj2 instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject = (JSONObject) obj2;
        this.bizType = (String) jSONObject.get("bizType");
        this.industryCode = (String) jSONObject.get("industryCode");
        this.bizCode = (String) jSONObject.get("bizCode");
        if (TextUtils.isEmpty(this.bizCode) && jSONObject.getJSONObject("data") != null) {
            this.bizCode = (String) jSONObject.getJSONObject("data").get("bizCode");
        }
        if (TextUtils.isEmpty(this.bizCode)) {
            this.bizCode = (String) jSONObject.get("subBizCode");
        }
        this.bizData = jSONObject;
    }

    private void parseUtArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d8d3fa", new Object[]{this, jSONObject});
            return;
        }
        this.bizType = (String) jSONObject.get("bizType");
        this.industryCode = (String) jSONObject.get("industryCode");
        this.bizCode = (String) jSONObject.get("bizCode");
        if (TextUtils.isEmpty(this.bizCode)) {
            this.bizCode = (String) jSONObject.get("subBizCode");
        }
        if (!TextUtils.isEmpty(this.bizCode) || !TextUtils.isEmpty(this.bizCode)) {
            return;
        }
        this.bizCode = jSONObject.getString("itemKey");
    }

    public boolean isIndustryComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f60142c0", new Object[]{this})).booleanValue() : INDUSTRY_BIZ_TYPE.equals(this.bizType) || b.a(this.bizCode);
    }
}
