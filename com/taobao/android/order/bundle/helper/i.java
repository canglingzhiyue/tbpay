package com.taobao.android.order.bundle.helper;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2085599063);
    }

    public static <T> T a(JSONObject jSONObject, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("38839b1d", new Object[]{jSONObject, cls});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return (T) JSONObject.parseObject(jSONObject.toString(), cls);
        } catch (Throwable th) {
            hyn.a("ResponseHelper", "getResult", "parseError ,error info =", th.toString(), jSONObject.toJSONString());
            return null;
        }
    }
}
