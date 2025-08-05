package com.taobao.themis.pub_kit.favor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class RemoveFavorClient extends com.taobao.themis.kernel.network.a<RemoveFavorParam, Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(259886723);
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

    public RemoveFavorClient(RemoveFavorParam removeFavorParam, b<Boolean, Boolean> bVar) {
        super(removeFavorParam, bVar);
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
    public static class RemoveFavorParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean onlyOperateNotifyAccount;
        private String spm;

        static {
            kge.a(998147252);
        }

        public RemoveFavorParam(String str, String str2, boolean z) {
            super(str);
            this.version = "1.0";
            this.api = "mtop.taobao.miniapp.user.remove.favorite";
            this.needLogin = true;
            this.spm = str2;
            this.onlyOperateNotifyAccount = z;
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
            if (this.onlyOperateNotifyAccount) {
                hashMap.put("only_operate_notify_account", true);
            }
            hashMap.put("isSubscription", true);
            hashMap.put("relationType", "add");
            return hashMap;
        }
    }
}
