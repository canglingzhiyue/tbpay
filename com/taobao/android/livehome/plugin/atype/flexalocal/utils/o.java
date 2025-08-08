package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1952816350);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
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
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
