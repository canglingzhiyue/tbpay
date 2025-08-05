package com.taobao.themis.pub_kit.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.a;
import com.taobao.themis.kernel.utils.n;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class PubContainerConfigClient extends a<PubContainerConfigRequestParam, JSONObject, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1174567731);
    }

    public JSONObject b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60988d90", new Object[]{this, bArr});
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.network.d
    /* renamed from: configFailureResponse */
    public /* synthetic */ Object mo1502configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9e7a26fb", new Object[]{this, bArr}) : b(bArr);
    }

    @Override // com.taobao.themis.kernel.network.d
    public /* synthetic */ Object configSuccessResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e02d8962", new Object[]{this, bArr}) : a(bArr);
    }

    public PubContainerConfigClient(PubContainerConfigRequestParam pubContainerConfigRequestParam, com.taobao.themis.kernel.network.b<JSONObject, JSONObject> bVar) {
        super(pubContainerConfigRequestParam, bVar);
    }

    public JSONObject a(byte[] bArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9797964f", new Object[]{this, bArr});
        }
        if (bArr != null && bArr.length != 0 && (jSONObject = JSON.parseObject(new String(bArr)).getJSONObject("data")) != null && !jSONObject.isEmpty() && jSONObject.containsKey("userGuideModule")) {
            return jSONObject.getJSONObject("userGuideModule");
        }
        return null;
    }

    /* loaded from: classes9.dex */
    public static class PubContainerConfigRequestParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String API = "mtop.taobao.homepage.container.config.get";
        private static final String OLD_API = "mtop.taobao.miniapp.container.config.get";
        private JSONObject features;
        private String sourceChannel;

        static {
            kge.a(-60105829);
        }

        public PubContainerConfigRequestParam(String str, JSONObject jSONObject) {
            super(str);
            this.version = "1.0";
            this.api = getAPI();
            this.needLogin = true;
            this.features = jSONObject;
        }

        public PubContainerConfigRequestParam(String str) {
            super(str);
            this.version = "1.0";
            this.api = getAPI();
            this.needLogin = true;
        }

        public PubContainerConfigRequestParam(String str, String str2, JSONObject jSONObject) {
            super(str);
            this.version = "1.0";
            this.api = getAPI();
            this.needLogin = true;
            this.features = jSONObject;
            this.sourceChannel = str2;
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("miniappId", getAppId());
            hashMap.put("pageName", "miniapp_client_container");
            JSONObject jSONObject = this.features;
            if (jSONObject != null) {
                hashMap.put("features", jSONObject.toJSONString());
            }
            String str = this.sourceChannel;
            if (str != null) {
                hashMap.put("sourceChannel", str);
            }
            return hashMap;
        }

        private String getAPI() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : n.bc() ? API : OLD_API;
        }
    }
}
