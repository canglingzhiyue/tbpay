package com.taobao.android.sku.network;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.sdk.request.sku.SkuRequestClient;
import com.taobao.android.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;
import tb.noa;

/* loaded from: classes6.dex */
public class SkuRequestParams implements a, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mItemId;
    private String mApiName = SkuRequestClient.API_NAME;
    private String mApiVersion = "6.0";
    private String mUnitStrategy = "UNIT_TRADE";
    private String mDetail_V = "3.3.2";
    private Map<String, String> mExParams = new HashMap();

    static {
        kge.a(394311102);
        kge.a(1028243835);
        kge.a(-1697337541);
    }

    public SkuRequestParams(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            this.mItemId = str;
        }
        if (map != null) {
            this.mExParams.putAll(map);
        }
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
        Map<String, String> map = this.mExParams;
        if (map != null && !map.isEmpty()) {
            try {
                this.mExParams.put(noa.KEY_LOC_TYPE, JSONObject.parseObject(String.valueOf(this.mExParams.get("params"))).getString(noa.KEY_LOC_TYPE));
            } catch (Throwable unused) {
            }
            try {
                this.mExParams.put("pvStr", JSONObject.parseObject(String.valueOf(this.mExParams.get("params"))).getString("pvStr"));
            } catch (Throwable unused2) {
            }
        }
        HashMap hashMap = new HashMap();
        AliConfigInterface a2 = e.a();
        if (a2 != null && "true".equalsIgnoreCase(a2.a("android_detail", "sku_enable_v7", "true"))) {
            hashMap.put("supportV7", "true");
        }
        hashMap.put("container_type", "sku");
        hashMap.put("ultron2", "true");
        hashMap.put("detail_v", this.mDetail_V);
        hashMap.put("itemNumId", this.mItemId);
        hashMap.put("exParams", JSONObject.toJSONString(this.mExParams));
        return JSONObject.toJSONString(hashMap);
    }

    @Override // com.taobao.android.sku.network.a
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : this.mUnitStrategy;
    }
}
