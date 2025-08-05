package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@MappingKey(key = "fatigue")
/* loaded from: classes4.dex */
public class Fatigue extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject mData;

    static {
        kge.a(-817068241);
    }

    public Fatigue(JSONObject jSONObject) {
        super(jSONObject);
        this.mData = jSONObject.getJSONObject("data");
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.mData;
    }
}
