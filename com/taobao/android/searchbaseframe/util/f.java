package com.taobao.android.searchbaseframe.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1876587673);
    }

    public static Map<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{intent}) : a(intent, new HashMap());
    }

    public static Map<String, String> a(Intent intent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b31f2f5", new Object[]{intent, map});
        }
        if (intent == null) {
            return map;
        }
        map.putAll(a(intent.getData()));
        map.putAll(a(intent.getExtras()));
        return map;
    }

    public static Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri == null) {
            return hashMap;
        }
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public static Map<String, String> a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4f8334a1", new Object[]{bundle});
        }
        HashMap hashMap = new HashMap();
        if (bundle == null) {
            return hashMap;
        }
        try {
            Set<String> keySet = bundle.keySet();
            if (keySet == null) {
                k.a("ParamParseUtil", "bundle keyset is null");
                return hashMap;
            }
            for (String str : keySet) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                }
            }
            return hashMap;
        } catch (Exception unused) {
            k.a("ParamParseUtil", "get bundle keyset exception");
            return hashMap;
        }
    }

    public static Map<String, String> a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            for (String str2 : str.split("&")) {
                if (str2.contains("=")) {
                    hashMap.put(str2.substring(0, str2.indexOf("=")), str2.substring(str2.indexOf("=") + 1, str2.length()));
                }
            }
        } catch (Exception unused) {
            k.a("ParamParseUtil", "parse params from url query error");
        }
        return hashMap;
    }
}
