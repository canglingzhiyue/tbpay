package com.taobao.themis.pub_kit.foot;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class AddFootClient extends com.taobao.themis.kernel.network.a<AddFootprintParam, Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1813169226);
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

    public AddFootClient(AddFootprintParam addFootprintParam, b<Boolean, Boolean> bVar) {
        super(addFootprintParam, bVar);
    }

    public Boolean a(byte[] bArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("220eaaec", new Object[]{this, bArr});
        }
        if (bArr != null && bArr.length != 0 && (jSONObject = JSON.parseObject(new String(bArr)).getJSONObject("data")) != null && !jSONObject.isEmpty()) {
            return Boolean.valueOf(jSONObject.getBooleanValue("result"));
        }
        return null;
    }

    public Boolean b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a63ef7ed", new Object[]{this, bArr});
        }
        return false;
    }

    /* loaded from: classes9.dex */
    public static class AddFootprintParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1970856491);
        }

        public AddFootprintParam(String str) {
            super(str);
            this.api = "mtop.taobao.miniapp.user.track.record";
            this.version = "1.0";
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("miniapp_id", getAppId());
            hashMap.put("page_name", "miniapp_client_container");
            hashMap.put("app_name", "miniapp_client_container");
            return hashMap;
        }
    }
}
