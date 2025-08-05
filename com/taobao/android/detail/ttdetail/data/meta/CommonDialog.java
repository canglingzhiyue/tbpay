package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@MappingKey(key = "commonDialog")
/* loaded from: classes4.dex */
public class CommonDialog extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject bizData;

    static {
        kge.a(-645704789);
    }

    public CommonDialog(JSONObject jSONObject) {
        super(jSONObject);
        this.bizData = jSONObject;
    }

    public JSONObject getBizData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this}) : this.bizData;
    }
}
