package com.taobao.bootimage.linked.ext;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1213674815);
    }

    public static void a(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6aa624", new Object[]{linkedSplashData, new Boolean(z)});
        } else if (linkedSplashData == null) {
        } else {
            JSONObject subSection = linkedSplashData.getSubSection();
            JSONObject jSONObject = subSection.getJSONObject("popView");
            if (jSONObject != null) {
                a(jSONObject, z);
            }
            JSONObject jSONObject2 = subSection.getJSONObject("searchText");
            if (jSONObject2 == null) {
                return;
            }
            a(jSONObject2, z);
        }
    }

    private static Map<String, String> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913778a1", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("is_cold", Boolean.toString(z));
        return hashMap;
    }

    private static Map<String, String> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78d94f00", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("is_cold", Boolean.toString(z));
        hashMap.put("scene", PopStrategy.IDENTIFIER_SPLASH);
        return hashMap;
    }

    private static void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{jSONObject, new Boolean(z)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("ext", (Object) jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("monitorArgs", (Object) a(z));
        jSONObject3.put("utArgs", (Object) b(z));
        jSONObject2.put("advClientParam", (Object) jSONObject3);
    }
}
