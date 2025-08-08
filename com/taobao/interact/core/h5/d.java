package com.taobao.interact.core.h5;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-427072340);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringUtils.isEmpty(str)) {
                jSONObject.put("errorCode", (Object) str);
            }
            if (!StringUtils.isEmpty(str2)) {
                jSONObject.put("errorMsg", (Object) str2);
            }
            return jSONObject.toJSONString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str + "|" + str2;
        }
    }
}
