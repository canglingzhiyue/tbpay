package com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class OutLinkWithReqModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OutLinkWithReqModel";
    private JSONObject bizParams;

    static {
        kge.a(-1694088288);
        kge.a(1028243835);
    }

    public Map<String, String> getBizParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("79854d7f", new Object[]{this}) : parseBizParams(this.bizParams);
    }

    public void setBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779e4f72", new Object[]{this, jSONObject});
        } else {
            this.bizParams = jSONObject;
        }
    }

    private HashMap<String, String> parseBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c1bea2a6", new Object[]{this, jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>(4);
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() instanceof String) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Exception unused) {
            ldf.d(TAG, "解析bizParams出错 ");
        }
        return hashMap;
    }
}
