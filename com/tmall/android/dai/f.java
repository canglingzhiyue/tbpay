package com.tmall.android.dai;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rkq;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(145564526);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        JSONObject parseObject = JSONObject.parseObject(rkq.d().e().getSharedPreferences("WALLE", 0).getString(str, ""));
        if (parseObject != null && parseObject.containsKey(str2)) {
            return parseObject.getString(str2);
        }
        return null;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        SharedPreferences.Editor edit = rkq.d().e().getSharedPreferences("WALLE", 0).edit();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str2, (Object) str3);
        edit.putString(str, jSONObject.toString());
        edit.apply();
    }
}
