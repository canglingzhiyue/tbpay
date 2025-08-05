package com.taobao.themis.pub_kit.favor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class AddFavorClient extends com.taobao.themis.kernel.network.a<AddFavorParam, Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-930023670);
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

    public AddFavorClient(AddFavorParam addFavorParam, b<Boolean, Boolean> bVar) {
        super(addFavorParam, bVar);
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
    public static class AddFavorParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean onlyOperateNotifyAccount;
        private String spm;

        static {
            kge.a(-761968586);
        }

        public AddFavorParam(String str, String str2, boolean z) {
            super(str);
            this.version = "1.0";
            this.api = "mtop.taobao.miniapp.user.add.favorite";
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
            if (!TextUtils.isEmpty(this.spm)) {
                hashMap.put("pre_spm_id", this.spm);
            }
            hashMap.put("spm_id", "miniapp_page");
            if (this.onlyOperateNotifyAccount) {
                hashMap.put("only_operate_notify_account", true);
            }
            hashMap.put("isSubscription", true);
            hashMap.put("relationType", "add");
            return hashMap;
        }
    }
}
