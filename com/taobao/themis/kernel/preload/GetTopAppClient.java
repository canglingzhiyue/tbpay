package com.taobao.themis.kernel.preload;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.d;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class GetTopAppClient extends d<getTopAppParam, JSONArray, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-469449077);
    }

    public JSONObject b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60988d90", new Object[]{this, bArr});
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
    @Override // com.taobao.themis.kernel.network.d
    /* renamed from: configFailureResponse */
    public /* synthetic */ JSONObject mo1502configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9e7a26fb", new Object[]{this, bArr}) : b(bArr);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.alibaba.fastjson.JSONArray, java.lang.Object] */
    @Override // com.taobao.themis.kernel.network.d
    public /* synthetic */ JSONArray configSuccessResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e02d8962", new Object[]{this, bArr}) : a(bArr);
    }

    public JSONArray a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("abd48d2f", new Object[]{this, bArr});
        }
        try {
            JSONObject jSONObject = ((JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0])).getJSONObject("data");
            if (jSONObject != null && !jSONObject.isEmpty()) {
                return jSONObject.getJSONArray("result");
            }
            return null;
        } catch (Exception e) {
            TMSLogger.b(TLogAdapterImpl.TLOG_MODULE, "configSuccessResponseError", e);
            return null;
        }
    }

    /* loaded from: classes9.dex */
    public static class getTopAppParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1711211876);
        }

        public getTopAppParam(String str) {
            super(str);
            this.api = "mtop.taobao.miniapp.top.get";
            this.version = "1.0";
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("client_code", "taobao");
            return hashMap;
        }
    }
}
