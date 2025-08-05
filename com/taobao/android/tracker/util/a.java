package com.taobao.android.tracker.util;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.tracker.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0602a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15583a;
        public String b;
        public String c;

        static {
            kge.a(-1733905783);
        }
    }

    static {
        kge.a(660616822);
    }

    public static <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{str, cls});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return (T) JSON.parseObject(str, cls);
            } catch (Exception e) {
                f.a("BaseUtil:stringToObject Exception message" + e.getMessage());
                return null;
            }
        }
        f.a("BaseUtil:stringToObject data empty");
        return null;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return (Map) JSON.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.android.tracker.util.a.1
                }, new Feature[0]);
            } catch (Exception e) {
                f.a("BaseUtil:stringToMap Exception message" + e.getMessage());
            }
        }
        return null;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : System.currentTimeMillis();
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        long a2 = a();
        if (a2 <= 0) {
            return 0L;
        }
        return a2 - j;
    }

    public static String b(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String str2 = "";
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return str2;
        }
        String authority = parse.getAuthority();
        String path = parse.getPath();
        if (!TextUtils.isEmpty(authority)) {
            str2 = authority;
        }
        if (TextUtils.isEmpty(path)) {
            return str2;
        }
        return str2 + path;
    }

    public static C0602a a(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0602a) ipChange.ipc$dispatch("850488f2", new Object[]{str, str2});
        }
        C0602a c0602a = new C0602a();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (indexOf = str.indexOf(str2)) != -1) {
            c0602a.b = str.substring(0, indexOf);
            c0602a.c = str.substring(indexOf + 1, str.length());
            c0602a.f15583a = true;
        }
        return c0602a;
    }

    public static Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc57ffd", new Object[]{map, map2});
        }
        if (map == null || map.isEmpty()) {
            return map2;
        }
        if (map2 == null || map2.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            if (map.containsKey(key)) {
                String str = map.get(key);
                String str2 = map2.get(key);
                StringBuilder sb = new StringBuilder();
                sb.append(TextUtils.isEmpty(str) ? "" : str + "&");
                sb.append(str2);
                hashMap.put(key, sb.toString());
            } else {
                hashMap.put(key, entry.getValue());
            }
        }
        return hashMap;
    }
}
