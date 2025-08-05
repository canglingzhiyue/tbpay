package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import tb.kge;
import tb.mrm;

@MappingKey(key = ShippingNode.TAG)
/* loaded from: classes4.dex */
public class Delivery extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String addressWeexUrl;
    private final String areaId;
    private final String completedTo;
    private final String to;

    static {
        kge.a(276481164);
    }

    public Delivery(JSONObject jSONObject) {
        super(jSONObject);
        this.areaId = jSONObject.getString(mrm.KEY_AREA_ID);
        this.completedTo = jSONObject.getString("completedTo");
        this.to = jSONObject.getString("to");
        this.addressWeexUrl = jSONObject.getString("addressWeexUrl");
    }

    public String getAreaId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("20641c3b", new Object[]{this}) : this.areaId;
    }

    public String getCompletedTo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d634409", new Object[]{this}) : this.completedTo;
    }

    public String getTo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79c0f328", new Object[]{this}) : this.to;
    }

    public String getAddressWeexUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d14f88e9", new Object[]{this}) : this.addressWeexUrl;
    }
}
