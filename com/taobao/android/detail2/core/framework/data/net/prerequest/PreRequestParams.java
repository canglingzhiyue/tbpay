package com.taobao.android.detail2.core.framework.data.net.prerequest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopRequest;
import tb.fla;
import tb.ipa;
import tb.kge;
import tb.tbt;

/* loaded from: classes5.dex */
public class PreRequestParams implements Serializable, fla {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mApiName = "mtop.relationrecommend.WirelessRecommend.recommend";
    private String mApiVersion = "2.0";
    private JSONArray mBatchParams;
    private boolean mIsNavRequest;
    private String mNewDetailChannel;

    static {
        kge.a(1787712158);
        kge.a(1028243835);
        kge.a(1579116182);
    }

    @Override // tb.fla
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : "UNIT_GUIDE";
    }

    @Override // tb.fla
    public MtopRequest getMtopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(getData());
        mtopRequest.setApiName(this.mApiName);
        mtopRequest.setVersion(this.mApiVersion);
        return mtopRequest;
    }

    public PreRequestParams setBatchParams(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("8c8cbcba", new Object[]{this, jSONArray});
        }
        this.mBatchParams = jSONArray;
        return this;
    }

    public PreRequestParams setNewDetailChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("1ea41a42", new Object[]{this, str});
        }
        this.mNewDetailChannel = str;
        return this;
    }

    public PreRequestParams setNavRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("ab486c8", new Object[]{this, new Boolean(z)});
        }
        this.mIsNavRequest = z;
        return this;
    }

    private String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", com.taobao.android.detail2.core.framework.data.net.recommend.a.REC_APP_ID);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("batchParams", JSONArray.toJSONString(this.mBatchParams));
        ipa.h(tbt.PRE_REQUEST);
        ipa.i(tbt.PRE_REQUEST);
        if (ipa.s()) {
            hashMap2.put("ndWeexUrlReplace", "v1Performance");
        }
        hashMap2.put("newType", "ndPreLoad");
        hashMap2.put("newDetailChannel", this.mNewDetailChannel);
        hashMap2.put("navRequest", String.valueOf(this.mIsNavRequest));
        hashMap.put("params", JSONObject.toJSONString(hashMap2));
        return JSONObject.toJSONString(hashMap);
    }
}
