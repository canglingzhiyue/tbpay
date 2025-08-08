package com.taobao.android.behavix;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1845222633);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str == null ? "" : str;
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : jSONObject == null ? "" : jSONObject.toJSONString();
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map}) : map == null ? "" : JSON.toJSONString(map);
    }

    public static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr != null && strArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            boolean z = false;
            for (int i = 0; i < strArr.length; i++) {
                if (!aqc.e(strArr[i])) {
                    if (z) {
                        sb.append(",");
                    }
                    sb.append(strArr[i]);
                    z = true;
                }
            }
        }
        return sb.toString();
    }

    public static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!StringUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50440e27", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            String obj2 = obj instanceof String ? (String) obj : obj == null ? null : obj.toString();
            if (!StringUtils.isEmpty(obj2)) {
                sb.append(str);
                sb.append("=");
                sb.append(obj2);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String[] c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6e23b1ea", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap(map);
        if (hashMap.size() == 0) {
            return null;
        }
        String[] strArr = new String[hashMap.size()];
        int i = 0;
        for (String str : hashMap.keySet()) {
            strArr[i] = String.format("%s=%s", str, (String) hashMap.get(str));
            i++;
        }
        return strArr;
    }

    public static Map<String, String> b(String[] strArr) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da21d24b", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            if (!aqc.e(str) && (indexOf = str.indexOf("=")) >= 0) {
                String substring = str.substring(0, indexOf);
                if (!StringUtils.isEmpty(substring)) {
                    hashMap.put(substring, indexOf < str.length() ? str.substring(indexOf + 1) : "");
                }
            }
        }
        return hashMap;
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
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
            Iterator<String> it = a(str, str2, false).iterator();
            int length = str3.length();
            while (it.hasNext()) {
                String next = it.next();
                int indexOf = next.indexOf(str3);
                if (indexOf > 0) {
                    String substring = next.substring(indexOf + length);
                    if (z) {
                        substring = b(substring);
                    }
                    hashMap.put(b(next.substring(0, indexOf)), substring);
                } else {
                    hashMap.put(b(next), "");
                }
            }
            return hashMap;
        }
        hashMap.put(b(str), "");
        return hashMap;
    }

    public static <K, V> String a(Map<K, V> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2});
        }
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(str2);
            }
            sb.append(entry.getKey() + str + entry.getValue());
        }
        return sb.toString();
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
        if (str2 != null && str2.length() != 0) {
            while (true) {
                int indexOf = str.indexOf(str2, i);
                if (indexOf < 0) {
                    break;
                }
                String substring = str.substring(i, indexOf);
                if (z) {
                    substring = b(substring);
                }
                if (!z || substring.length() > 0) {
                    collection.add(substring);
                }
                i = indexOf + str2.length();
            }
            String substring2 = str.substring(i);
            if (z) {
                substring2 = b(substring2);
            }
            if (!z || substring2.length() > 0) {
                collection.add(substring2);
            }
            return collection;
        }
        collection.add(str);
        return collection;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : a(str, true, true, " \r\n\t\u3000   ");
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

    public static String[] b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1d085036", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        int i = 0;
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = String.format("%s=%s", str, string);
                i++;
            }
        }
        return strArr;
    }

    public static String a(String str, String... strArr) {
        String c;
        int indexOf;
        int indexOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e7f4c93", new Object[]{str, strArr});
        }
        String str2 = "";
        if (strArr != null && strArr.length != 0) {
            if (StringUtils.isEmpty(str)) {
                return str2;
            }
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] != null && (indexOf = (c = c(strArr[i])).indexOf(str)) >= 0 && (indexOf2 = c.indexOf("=", indexOf)) >= 0 && str.length() == indexOf2) {
                    int i2 = indexOf2 + 1;
                    int indexOf3 = c.indexOf(",");
                    if (indexOf3 < 0) {
                        indexOf3 = c.length();
                    }
                    if (indexOf3 < i2) {
                        return str2;
                    }
                    str2 = c.substring(i2, indexOf3);
                }
            }
        }
        return str2;
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : str.replace(" ", "");
    }

    public static Map<String, String> d(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("726f9ef", new Object[]{map});
        }
        if (map == null) {
            return new HashMap(1);
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (str != null && str.length() > 0 && (obj = map.get(str)) != null) {
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else {
                    hashMap.put(str, obj.toString());
                }
            }
        }
        if (hashMap.keySet().size() > 0) {
            return hashMap;
        }
        return null;
    }

    public static Set<String> a(Class<?> cls) {
        HashSet hashSet = new HashSet();
        for (Field field : cls.getDeclaredFields()) {
            try {
                Object obj = field.get(cls);
                if (obj instanceof String) {
                    hashSet.add((String) obj);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return hashSet;
    }
}
