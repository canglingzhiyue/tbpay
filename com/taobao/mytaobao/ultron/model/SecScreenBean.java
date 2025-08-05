package com.taobao.mytaobao.ultron.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.mtp;

/* loaded from: classes7.dex */
public class SecScreenBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apiName;
    public String apiVersion;
    public HashMap<String, String> data;
    public boolean unitTrade;

    static {
        kge.a(1177275534);
        kge.a(1028243835);
    }

    public static SecScreenBean readGlobalSecScreenBean(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecScreenBean) ipChange.ipc$dispatch("c061d762", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(mtp.b.b)) == null) {
            return null;
        }
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(mtp.b.c);
            if (jSONObject3 != null) {
                return (SecScreenBean) JSON.toJavaObject(jSONObject3, SecScreenBean.class);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
