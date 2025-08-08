package com.taobao.tao.util;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public class UriUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1465887713);
    }

    public static Map<String, String> queryUrlParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("371c4c73", new Object[]{str});
        }
        if (str != null) {
            return queryUriParams(Uri.parse(str));
        }
        return null;
    }

    public static Map<String, String> queryUriParams(Uri uri) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de19b76b", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        String query = uri.getQuery();
        String[] split = (fragment == null || !fragment.contains("?")) ? null : fragment.split("\\?");
        if (split != null && split.length > 0) {
            fragment = split[0];
            query = !StringUtils.isEmpty(query) ? query + "&" + split[1] : split[1];
        }
        if (fragment != null && fragment.contains("&") && (indexOf = fragment.indexOf("&")) > 0) {
            if (!StringUtils.isEmpty(query)) {
                String str = query + "&" + fragment.substring(indexOf + 1);
            } else {
                fragment.substring(indexOf + 1);
            }
            fragment.substring(0, indexOf);
        }
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String[] strArr = (String[]) queryParameterNames.toArray(new String[queryParameterNames.size()]);
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    hashMap.put(str2, uri.getQueryParameter(str2));
                }
            }
            return hashMap;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static String getValue(Uri uri, String str) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b262f31", new Object[]{uri, str});
        }
        if (uri != null && !StringUtils.isEmpty(str) && (queryParameterNames = uri.getQueryParameterNames()) != null) {
            for (String str2 : queryParameterNames) {
                if (str2.equals(str)) {
                    return uri.getQueryParameter(str);
                }
            }
        }
        return null;
    }

    public static Uri appendQueryParameter(Uri uri, String str, String str2) {
        Uri.Builder buildUpon;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("303a26d0", new Object[]{uri, str, str2});
        }
        if (uri == null) {
            return null;
        }
        if (str == null || str2 == null || (buildUpon = uri.buildUpon()) == null) {
            return uri;
        }
        buildUpon.clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str3 : queryParameterNames) {
                if (!str.equals(str3)) {
                    buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
        }
        buildUpon.appendQueryParameter(str, str2);
        return buildUpon.build();
    }

    public static Uri appendQueryParameter(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("e535a617", new Object[]{str, str2, str3});
        }
        if (!StringUtils.isEmpty(str)) {
            return appendQueryParameter(Uri.parse(str), str2, str3);
        }
        return null;
    }
}
