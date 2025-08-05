package com.taobao.android.detail.ttdetail.floatview.lowprice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceRequestParams;", "Lcom/taobao/android/detail/ttdetail/request/params/MtopRequestParams;", "data", "Lcom/alibaba/fastjson/JSONObject;", "apiName", "", "apiVersion", "(Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "mApiName", "getMApiName", "()Ljava/lang/String;", "mApiVersion", "getMApiVersion", "mData", "getMData", "()Lcom/alibaba/fastjson/JSONObject;", "toData", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class LowPriceRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mApiName;
    private final String mApiVersion;
    private final JSONObject mData;

    static {
        kge.a(407823943);
        kge.a(395113271);
    }

    public LowPriceRequestParams(JSONObject data, String apiName, String apiVersion) {
        q.c(data, "data");
        q.c(apiName, "apiName");
        q.c(apiVersion, "apiVersion");
        this.mData = data;
        this.mApiName = apiName;
        this.mApiVersion = apiVersion;
    }

    public final JSONObject getMData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5d583328", new Object[]{this}) : this.mData;
    }

    public final String getMApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5ae27ab", new Object[]{this}) : this.mApiName;
    }

    public final String getMApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc00b1a4", new Object[]{this}) : this.mApiVersion;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        String jSONString = JSONObject.toJSONString(this.mData);
        q.a((Object) jSONString, "JSONObject.toJSONString(mData)");
        return jSONString;
    }
}
