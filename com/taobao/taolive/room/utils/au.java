package com.taobao.taolive.room.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class au {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2047796321);
    }

    public static Map a(Object obj, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e910a536", new Object[]{obj, map});
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof String) {
            try {
                return JSONObject.parseObject((String) obj);
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str}) : obj != null ? obj.toString() : str;
    }
}
