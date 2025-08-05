package com.alibaba.ut.abtest.track;

import android.net.Uri;
import anet.channel.util.HttpConstant;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.r;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.ado;
import tb.fxb;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(523677462);
    }

    @Deprecated
    public static URI a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URI) ipChange.ipc$dispatch("70c90733", new Object[]{str, str2, new Integer(i), str3, str4, str5}) : new URI(b(str, str2, i, str3, str4, str5));
    }

    public static String b(String str, String str2, int i, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6591399c", new Object[]{str, str2, new Integer(i), str3, str4, str5});
        }
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append(HttpConstant.SCHEME_SPLIT);
            } else {
                sb.append(ado.URL_SEPARATOR);
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(riy.CONDITION_IF_MIDDLE);
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append(fxb.DIR);
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append(riy.CONDITION_IF);
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return sb.toString();
    }

    @Deprecated
    public static LinkedHashMap<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("d6ed36fb", new Object[]{uri});
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (String str : queryParameterNames) {
            linkedHashMap.put(str, uri.getQueryParameter(str));
        }
        return linkedHashMap;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        r a2 = r.a(str);
        Set<String> a3 = a2.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : a3) {
            linkedHashMap.put(str2, a2.b(str2));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap<String, String> a(LinkedHashMap<String, String> linkedHashMap, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("84cc85f", new Object[]{linkedHashMap, uri});
        }
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
        LinkedHashMap<String, String> a2 = a(uri);
        if (a2 != null && !a2.isEmpty()) {
            linkedHashMap2.putAll(a2);
        }
        return linkedHashMap2;
    }

    @Deprecated
    public static String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String a2 = a(entry.getKey(), str);
            String value = entry.getValue();
            String a3 = value != null ? a(value, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a2);
            sb.append("=");
            sb.append(a3);
        }
        return sb.toString();
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(value);
        }
        return sb.toString();
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Uri a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6003b219", new Object[]{str, new Boolean(z)});
        }
        if (z) {
            try {
                str = c(str);
            } catch (Exception e) {
                h.d("UriUtils", "Uri parse fail", e);
                return null;
            }
        }
        return Uri.parse(str);
    }

    public static Uri b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("95fe68aa", new Object[]{str}) : a(str, true);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(":");
        if (str.charAt(indexOf + 1) == '/' && str.charAt(indexOf + 2) == '/') {
            return str;
        }
        return ado.URL_SEPARATOR + str;
    }
}
