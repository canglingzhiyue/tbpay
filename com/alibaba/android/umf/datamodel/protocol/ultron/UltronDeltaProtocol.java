package com.alibaba.android.umf.datamodel.protocol.ultron;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronDeltaProtocol implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    public Map<String, Component> data;
    @Deprecated
    public Hierarchy hierarchy;
    private JSONObject mOriginData;

    static {
        kge.a(-1916093306);
        kge.a(1028243835);
    }

    public UltronDeltaProtocol() {
    }

    public UltronDeltaProtocol(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }

    public Map<String, Component> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        if (this.data == null) {
            JSONObject jSONObject = this.mOriginData.getJSONObject("data");
            if (jSONObject == null) {
                return null;
            }
            this.data = new HashMap();
            for (String str : jSONObject.keySet()) {
                if (!StringUtils.isEmpty(str)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    if (jSONObject2 instanceof JSONObject) {
                        this.data.put(str, new Component(jSONObject2));
                    }
                }
            }
        }
        return this.data;
    }

    public Hierarchy getHierarchy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Hierarchy) ipChange.ipc$dispatch("6545d238", new Object[]{this});
        }
        if (this.hierarchy == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.hierarchy = new Hierarchy(jSONObject.getJSONObject("hierarchy"));
        }
        return this.hierarchy;
    }
}
