package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode;
import tb.kge;

@MappingKey(key = SkuBaseNode.TAG)
/* loaded from: classes4.dex */
public class SkuBase extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject data;

    static {
        kge.a(-1878374922);
    }

    public SkuBase(JSONObject jSONObject) {
        super(jSONObject);
        this.data = jSONObject;
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }
}
