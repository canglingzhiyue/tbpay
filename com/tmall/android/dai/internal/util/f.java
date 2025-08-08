package com.tmall.android.dai.internal.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WHITE_SPACES = " \r\n\t\u3000   ";

    static {
        kge.a(-2014295066);
    }

    public static HashMap<String, String> a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e402931", new Object[]{str, str2, str3, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            hashMap.put(a(str), "");
            return hashMap;
        }
        Iterator<String> it = a(str, str2, false).iterator();
        int length = str3.length();
        while (it.hasNext()) {
            String next = it.next();
            int indexOf = next.indexOf(str3);
            if (indexOf > 0) {
                String substring = next.substring(indexOf + length);
                if (z) {
                    substring = a(substring);
                }
                hashMap.put(a(next.substring(0, indexOf)), substring);
            } else {
                hashMap.put(a(next), "");
            }
        }
        return hashMap;
    }

    public static LinkedList<String> a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("babee56", new Object[]{str, str2, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        a(str, str2, z, linkedList);
        return linkedList;
    }

    public static Collection<String> a(String str, String str2, boolean z, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("d5e92bde", new Object[]{str, str2, new Boolean(z), collection});
        }
        if (str == null) {
            return null;
        }
        if (collection == null) {
            collection = new ArrayList<>();
        }
        if (str2 == null || str2.length() == 0) {
            collection.add(str);
            return collection;
        }
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                break;
            }
            String substring = str.substring(i, indexOf);
            if (z) {
                substring = a(substring);
            }
            if (!z || substring.length() > 0) {
                collection.add(substring);
            }
            i = indexOf + str2.length();
        }
        String substring2 = str.substring(i);
        if (z) {
            substring2 = a(substring2);
        }
        if (!z || substring2.length() > 0) {
            collection.add(substring2);
        }
        return collection;
    }

    public static <K, V> String a(Map<K, V> map, String str, String str2, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81a88472", new Object[]{map, str, str2, set});
        }
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (set == null || set.size() == 0 || (set.size() > 0 && set.contains(entry.getKey()))) {
                if (sb.length() > 0) {
                    sb.append(str2);
                }
                sb.append(entry.getKey());
                sb.append(str);
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    public static String a(String str, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7bbb8a4", new Object[]{str, new Boolean(z), new Boolean(z2), str2});
        }
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        while (z && i <= length && str2.indexOf(str.charAt(i)) >= 0) {
            i++;
        }
        while (z2 && length >= i && str2.indexOf(str.charAt(length)) >= 0) {
            length--;
        }
        return str.substring(i, length + 1);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(str, true, true, " \r\n\t\u3000   ");
    }
}
