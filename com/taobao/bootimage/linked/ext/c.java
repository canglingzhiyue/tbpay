package com.taobao.bootimage.linked.ext;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1850544489);
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31c0dbb7", new Object[]{jSONObject, strArr});
        }
        for (String str : strArr) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.getJSONObject(str);
        }
        return jSONObject;
    }
}
