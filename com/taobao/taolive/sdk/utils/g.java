package com.taobao.taolive.sdk.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2087486750);
    }

    public static HashMap<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("12dd5eeb", new Object[]{jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (jSONObject.keySet().size() > 0) {
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        hashMap.put(valueOf, jSONObject.getString(valueOf));
                    }
                }
            } catch (Exception e) {
                pmd.a().m().a(com.alibaba.security.realidentity.b.f3363a, e.getMessage());
            }
        }
        return hashMap;
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e389e4", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return jSONObject.getInteger(str).intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i;
    }

    public static long a(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e38da6", new Object[]{jSONObject, str, new Long(j)})).longValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return jSONObject.getLongValue(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return j;
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return jSONObject.getBooleanValue(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return z;
    }
}
