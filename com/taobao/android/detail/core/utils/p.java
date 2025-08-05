package com.taobao.android.detail.core.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(529533701);
        emu.a("com.taobao.android.detail.core.utils.UrlUtils");
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(trim);
            for (String str3 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str3);
                if (!TextUtils.isEmpty(str3) && str3.equals(str2)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return trim;
        }
        String trim2 = str2.trim();
        String trim3 = str3.trim();
        if (TextUtils.isEmpty(trim2) || TextUtils.isEmpty(trim3)) {
            return trim;
        }
        try {
            HashMap hashMap = new HashMap();
            Uri parse = Uri.parse(trim);
            for (String str4 : parse.getQueryParameterNames()) {
                hashMap.put(str4, parse.getQueryParameter(str4));
            }
            hashMap.put(trim2, trim3);
            Uri.Builder clearQuery = Uri.parse(trim).buildUpon().clearQuery();
            for (Map.Entry entry : hashMap.entrySet()) {
                clearQuery = clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return clearQuery.build().toString();
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder(trim);
            try {
                sb.append(b(trim));
                sb.append(URLEncoder.encode(trim2, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(trim3, "UTF-8"));
                return sb.toString();
            } catch (Exception unused2) {
                return trim;
            }
        }
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        char charAt = str.charAt(str.length() - 1);
        return ('?' == charAt || '&' == charAt) ? "" : str.indexOf("?") >= 0 ? "&" : "?";
    }

    public static Map<String, String> a(String str) {
        Uri parse;
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && (queryParameterNames = (parse = Uri.parse(str)).getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str2 : queryParameterNames) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
        }
        return hashMap;
    }
}
