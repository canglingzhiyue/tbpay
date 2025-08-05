package com.alibaba.android.ultron.engine.protocol;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class Event extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject fields;
    public int option;
    public String type;

    static {
        kge.a(-1084912618);
    }

    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this}) : this.fields;
    }

    public void setFields(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f811566e", new Object[]{this, jSONObject});
        } else {
            this.fields = jSONObject;
        }
    }
}
