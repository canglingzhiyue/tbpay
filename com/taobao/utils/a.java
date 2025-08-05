package com.taobao.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1986122035);
    }

    public static String a(String str, String str2) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str3 = null;
        if (str.indexOf("?") > 0) {
            String[] split = str.split("\\?");
            if (split.length > 1 && split[1] != null) {
                str3 = split[1];
            }
        }
        if (str3 != null && (a2 = a(str3)) != null && !a2.isNull(str2)) {
            try {
                return a2.get(str2).toString().trim();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    private static JSONObject a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2f58b020", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        for (String str2 : str.split("&")) {
            if (!TextUtils.isEmpty(str2)) {
                String[] split2 = str2.split("=", 2);
                if (split2.length > 1) {
                    try {
                        jSONObject.put(split2[0], split2[1]);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }
}
