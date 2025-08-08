package com.taobao.tao.content.business;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f19904a;
        public String b;

        static {
            kge.a(129073574);
        }
    }

    static {
        kge.a(1275104379);
    }

    public static Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        a b = b(uri);
        if (b == null) {
            return null;
        }
        return b.f19904a;
    }

    private static a b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e4c3ea8", new Object[]{uri});
        }
        a aVar = new a();
        String[] strArr = null;
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        String str = "";
        String[] split = (fragment == null || !fragment.contains("?")) ? null : fragment.split("\\?");
        if (split != null && split.length > 0) {
            fragment = split[0];
            str = !StringUtils.isEmpty(str) ? str + "&" + split[1] : split[1];
        }
        if (fragment != null && fragment.contains("&")) {
            int indexOf = fragment.indexOf("&");
            if (indexOf > 0) {
                str = !StringUtils.isEmpty(str) ? str + "&" + fragment.substring(indexOf + 1) : fragment.substring(indexOf + 1);
                fragment = fragment.substring(0, indexOf);
            }
            aVar.b = fragment;
        }
        if (!StringUtils.isEmpty(str)) {
            strArr = str.split("&");
        }
        if (strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                String[] split2 = str2.split("=");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        for (String str3 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str3);
            if (!StringUtils.isEmpty(str3) && !StringUtils.isEmpty(queryParameter)) {
                hashMap.put(str3, queryParameter);
            }
        }
        aVar.f19904a = hashMap;
        return aVar;
    }

    public static String a(Map<String, ? extends Serializable> map) {
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                if (map.get(next) != null) {
                    String str = (String) map.get(next);
                    if (next.equals("track_params")) {
                        try {
                            str = URLEncoder.encode(str, "UTF-8");
                        } catch (Exception unused) {
                        }
                    }
                    sb.append(next);
                    sb.append("=");
                    sb.append(str);
                    sb.append("&");
                }
            }
            if (sb.length() >= 0) {
                return sb.substring(0, sb.length() - 1);
            }
        }
        return "";
    }
}
