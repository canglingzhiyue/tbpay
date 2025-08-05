package com.taobao.android.detail.ttdetail.skeleton.desc.web;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-756778253);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : new c(str).a(str2, str3).toString();
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (map == null) {
            return str;
        }
        String str2 = map.get("id");
        if (str2 != null) {
            str = a(str, "id", str2);
        }
        String jSONString = JSON.toJSONString(map);
        return jSONString.length() < 512 ? a(str, "exParams", jSONString) : str;
    }
}
