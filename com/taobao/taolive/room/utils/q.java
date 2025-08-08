package com.taobao.taolive.room.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(16594699);
    }

    public static List<String> a(JSONArray jSONArray) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{jSONArray});
        }
        try {
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    arrayList.add(jSONArray.getString(i));
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    return arrayList;
                }
            }
        } catch (Exception e2) {
            e = e2;
            arrayList = null;
        }
        return arrayList;
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject.keySet().size() > 0) {
                    for (String str2 : parseObject.keySet()) {
                        String valueOf = String.valueOf(str2);
                        hashMap.put(valueOf, parseObject.getString(valueOf));
                    }
                }
            } catch (Exception e) {
                pmd.a().m().a(com.alibaba.security.realidentity.b.f3363a, e.getMessage());
            }
        }
        return hashMap;
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

    public static String[] b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1d085036", new Object[]{jSONObject});
        }
        String[] strArr = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.keySet().size() > 0) {
                    strArr = new String[jSONObject.keySet().size()];
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        int i2 = i + 1;
                        strArr[i] = valueOf + "=" + jSONObject.getString(valueOf);
                        i = i2;
                    }
                }
            } catch (Exception e) {
                pmd.a().m().a(com.alibaba.security.realidentity.b.f3363a, e.getMessage());
            }
        }
        return strArr;
    }
}
