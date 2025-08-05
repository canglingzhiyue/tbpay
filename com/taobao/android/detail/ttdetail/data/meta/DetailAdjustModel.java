package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@MappingKey(key = "detailAdjustModel")
/* loaded from: classes4.dex */
public class DetailAdjustModel extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONArray adjustModel;

    static {
        kge.a(1726978609);
    }

    public DetailAdjustModel(JSONObject jSONObject) {
        super(jSONObject);
        this.adjustModel = jSONObject.getJSONArray("adjustModel");
    }

    public JSONArray getAdjustModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("da6386b3", new Object[]{this}) : this.adjustModel;
    }
}
