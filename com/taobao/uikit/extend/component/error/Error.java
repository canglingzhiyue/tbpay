package com.taobao.uikit.extend.component.error;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.arz;
import tb.kge;

/* loaded from: classes9.dex */
public class Error {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apiName;
    public String errorCode;
    public String errorMsg;
    public Map<String, String> extras;
    public String mappingCode;
    public int responseCode;
    public String url;

    static {
        kge.a(749591674);
    }

    private Error(String str, String str2) {
        this(0, "", str, str2);
    }

    private Error(int i, String str, String str2, String str3) {
        this.responseCode = i;
        this.mappingCode = StringUtils.isEmpty(str) ? "" : str;
        this.errorCode = StringUtils.isEmpty(str2) ? "" : str2;
        this.errorMsg = StringUtils.isEmpty(str3) ? "" : str3;
    }

    private Error(String str, int i, String str2, String str3, String str4) {
        this(i, str2, str3, str4);
        this.apiName = str;
    }

    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.extras;
        if (map != null) {
            for (String str : map.keySet()) {
                hashMap.put(str, this.extras.get(str));
            }
        }
        hashMap.put(ZimMessageChannel.K_RPC_RES_CODE, Integer.valueOf(this.responseCode));
        String str2 = this.mappingCode;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(arz.KEY_MAPPING_CODE, str2);
        String str3 = this.errorCode;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("errorCode", str3);
        String str4 = this.errorMsg;
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("errorMsg", str4);
        String str5 = this.url;
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("url", str5);
        String str6 = this.apiName;
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("apiName", str6);
        return hashMap;
    }

    public String toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.extras;
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) this.extras.get(str));
            }
        }
        jSONObject.put(ZimMessageChannel.K_RPC_RES_CODE, (Object) Integer.valueOf(this.responseCode));
        String str2 = this.mappingCode;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(arz.KEY_MAPPING_CODE, (Object) str2);
        String str3 = this.errorCode;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("errorCode", (Object) str3);
        String str4 = this.errorMsg;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("errorMsg", (Object) str4);
        String str5 = this.url;
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("url", (Object) str5);
        String str6 = this.apiName;
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("apiName", (Object) str6);
        return jSONObject.toJSONString();
    }

    /* loaded from: classes9.dex */
    public static class Factory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1702681280);
        }

        public static Error newError(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("e23f159a", new Object[]{str, str2}) : new Error(str, str2);
        }

        public static Error fromMtopResponse(int i, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("ba2e8d9e", new Object[]{new Integer(i), str, str2, str3}) : new Error(i, str, str2, str3);
        }

        public static Error fromMtopResponse(String str, int i, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("67dd2494", new Object[]{str, new Integer(i), str2, str3, str4}) : new Error(str, i, str2, str3, str4);
        }
    }
}
