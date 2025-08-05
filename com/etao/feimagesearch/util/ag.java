package com.etao.feimagesearch.util;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class ag {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1387480045);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (map != null && map.size() != 0) {
                Uri parse = Uri.parse(str);
                Map<String, String> a2 = a(str);
                a2.putAll(map);
                return a(parse.buildUpon(), a2).toString();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private static Uri.Builder a(Uri.Builder builder, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri.Builder) ipChange.ipc$dispatch("3610dc1d", new Object[]{builder, map});
        }
        builder.clearQuery();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder = builder.appendQueryParameter(key, value);
            }
        }
        return builder;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                return hashMap;
            }
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return new HashMap();
        }
    }
}
