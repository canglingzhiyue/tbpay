package com.taobao.android.searchbaseframe.util;

import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1628149578);
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

    public static String a(String str, ArrayMap<String, String> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b272507e", new Object[]{str, arrayMap});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (arrayMap != null && arrayMap.size() != 0) {
                Uri parse = Uri.parse(str);
                Map<String, String> a2 = a(str);
                a2.putAll(arrayMap);
                int size = arrayMap.size();
                for (int i = 0; i < size; i++) {
                    String keyAt = arrayMap.keyAt(i);
                    String valueAt = arrayMap.valueAt(i);
                    if (!TextUtils.isEmpty(keyAt) && !TextUtils.isEmpty(valueAt)) {
                        a2.put(keyAt, valueAt);
                    }
                }
                return a(parse.buildUpon(), a2).toString();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str);
                Map<String, String> a2 = a(str);
                a2.put(str2, str3);
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

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                return Uri.parse(str).getQueryParameter(str2);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Uri.parse(str).getPath();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (str == null) {
            str = null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }
}
