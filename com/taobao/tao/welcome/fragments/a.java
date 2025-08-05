package com.taobao.tao.welcome.fragments;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ha.bizerrorreporter.e;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1395927397);
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
        } else {
            a(context, str, str2, str3, null, null);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79908c52", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
        aVar.b = AggregationType.CONTENT;
        aVar.f3119a = "TEMP_USER_GROWTH_AUTHORIZE_EVENT";
        HashMap hashMap = new HashMap();
        hashMap.put("PageName", str);
        hashMap.put("Dialog", str2);
        hashMap.put("Action", str3);
        if (str4 != null) {
            hashMap.put("Property", str4);
        }
        if (str5 != null) {
            hashMap.put("Plan", str5);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(hashMap);
        aVar.d = jSONObject.toJSONString();
        e.a().a(context.getApplicationContext(), aVar);
    }
}
