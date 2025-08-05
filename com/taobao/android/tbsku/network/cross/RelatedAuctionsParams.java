package com.taobao.android.tbsku.network.cross;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.network.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes6.dex */
public class RelatedAuctionsParams implements a, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> itemIds;
    private String mApiName = "mtop.alibaba.detail.open.sku";
    private String mApiVersion = "1.0";
    private String mUnitStrategy = "UNIT_TRADE";

    static {
        kge.a(319382686);
        kge.a(1028243835);
        kge.a(-1697337541);
    }

    public static /* synthetic */ List access$000(RelatedAuctionsParams relatedAuctionsParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bc628cff", new Object[]{relatedAuctionsParams}) : relatedAuctionsParams.itemIds;
    }

    public RelatedAuctionsParams(List<String> list) {
        this.itemIds = list;
    }

    @Override // com.taobao.android.sku.network.a
    public MtopRequest getMtopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(getData());
        mtopRequest.setApiName(getApiName());
        mtopRequest.setVersion(getApiVersion());
        return mtopRequest;
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : this.mApiName;
    }

    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : this.mApiVersion;
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        if (this.itemIds == null) {
            this.itemIds = new ArrayList();
        }
        return new JSONObject() { // from class: com.taobao.android.tbsku.network.cross.RelatedAuctionsParams.1
            {
                put("itemIds", (Object) JSONObject.toJSONString(RelatedAuctionsParams.access$000(RelatedAuctionsParams.this)));
            }
        }.toJSONString();
    }

    @Override // com.taobao.android.sku.network.a
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : this.mUnitStrategy;
    }
}
