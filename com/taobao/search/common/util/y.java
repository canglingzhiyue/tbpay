package com.taobao.search.common.util;

import android.net.Uri;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.ado;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-578062580);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (map == null || map.size() == 0) {
            return str;
        }
        if (c(str)) {
            str = "http:" + str;
            q.d("SearchUrlUtil", "url no scheme:" + str);
        } else {
            z = false;
        }
        Uri parse = Uri.parse(str);
        Map<String, String> a2 = a(str);
        a2.putAll(map);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        String builder = buildUpon.toString();
        return z ? builder.substring(5) : builder;
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : str.startsWith(ado.URL_SEPARATOR);
    }

    public static String a(String str, ArrayMap<String, String> arrayMap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b272507e", new Object[]{str, arrayMap});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (arrayMap == null || arrayMap.size() == 0) {
            return str;
        }
        if (c(str)) {
            str = "http:" + str;
            q.d("SearchUrlUtil", "url no scheme:" + str);
        } else {
            z = false;
        }
        Uri parse = Uri.parse(str);
        Map<String, String> a2 = a(str);
        a2.putAll(arrayMap);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            String keyAt = arrayMap.keyAt(i);
            String valueAt = arrayMap.valueAt(i);
            if (!StringUtils.isEmpty(keyAt) && !StringUtils.isEmpty(valueAt)) {
                a2.put(keyAt, valueAt);
            }
        }
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        String builder = buildUpon.toString();
        return z ? builder.substring(5) : builder;
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (c(str)) {
            str = "http:" + str;
            q.d("SearchUrlUtil", "url no scheme:" + str);
        } else {
            z = false;
        }
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Map<String, String> a2 = a(str);
        a2.put(str2, str3);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        String builder = buildUpon.toString();
        return z ? builder.substring(5) : builder;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            return hashMap;
        }
        Uri parse = Uri.parse(d(str));
        for (String str2 : parse.getQueryParameterNames()) {
            hashMap.put(str2, parse.getQueryParameter(str2));
        }
        return hashMap;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!StringUtils.isEmpty(str)) {
            return Uri.parse(d(str)).getQueryParameter(str2);
        }
        return null;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                return Uri.parse(d(str)).getQueryParameter(str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    private static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (!c(str)) {
            return str;
        }
        String str2 = "http:" + str;
        q.d("SearchUrlUtil", "url no scheme:" + str2);
        return str2;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (str == null) {
            str = "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }
}
