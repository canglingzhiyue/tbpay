package com.taobao.android.sku.weex;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-38945436);
    }

    public static Object[] a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("10c1abea", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return objArr;
        }
        Object[] objArr2 = new Object[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Map) {
                objArr2[i] = new JSONObject((Map) obj);
            } else if (obj instanceof List) {
                objArr2[i] = new JSONArray((List) obj);
            } else {
                objArr2[i] = objArr[i];
            }
        }
        return objArr2;
    }

    public static void a(int i, Map<String, Object> map, a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c2abea", new Object[]{new Integer(i), map, aVar, aVar2});
        } else if (map == null || !map.containsKey("eventData")) {
            a(aVar2, "errorMsg", "eventData is empty");
        } else {
            JSONObject parseObject = JSONObject.parseObject(String.valueOf(map.get("eventData")));
            if (parseObject == null || parseObject.isEmpty()) {
                a(aVar2, "errorMsg", "eventData is empty");
            } else if (!parseObject.containsKey("_sku_token_")) {
                a(aVar2, "errorMsg", "_sku_token_ is empty");
            } else {
                String valueOf = String.valueOf(parseObject.get("_sku_token_"));
                d b = f.b(valueOf + i);
                if (b == null) {
                    a(aVar2, "errorMsg", "not found _sku_token_ value( " + valueOf + " )'s handler");
                    return;
                }
                b.a(String.valueOf(map.get("eventName")), parseObject, aVar, aVar2);
            }
        }
    }

    private static void a(a aVar, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363fc15", new Object[]{aVar, str, str2});
        } else if (str == null || aVar == null) {
        } else {
            aVar.a(new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexModuleHelper$1
                {
                    put(str, str2);
                }
            });
        }
    }
}
