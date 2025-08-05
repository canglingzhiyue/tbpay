package com.taobao.orange.util;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.model.IndexDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.sync.IndexUpdateHandler;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(528353956);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Long.parseLong(str);
            }
            return 0L;
        } catch (Exception e) {
            OLog.e("OrangeUtils", "parseLong", e, new Object[0]);
            return 0L;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b(String.valueOf(System.currentTimeMillis() + (com.taobao.orange.a.P * 1000)));
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static long d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e9", new Object[]{str})).longValue();
        }
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }

    public static List<String> a(Set<String> set) {
        int nextInt;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9ea4410", new Object[]{set});
        }
        ArrayList arrayList = new ArrayList();
        int size = set.size();
        if (size > 2) {
            Random random = new Random();
            int nextInt2 = random.nextInt(size);
            do {
                nextInt = random.nextInt(size);
            } while (nextInt == nextInt2);
            for (String str : set) {
                if (i == nextInt2 || i == nextInt) {
                    arrayList.add(str);
                    if (arrayList.size() == 2) {
                        break;
                    }
                }
                i++;
            }
        } else {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    public static String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append("=");
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str).replace(riy.PLUS, "%20"));
                    sb.append("&");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        } catch (UnsupportedEncodingException unused) {
        }
        return sb.toString();
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append(list.get(i));
            } else {
                sb.append("|");
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }

    public static <T> Map<String, T> a(Map<String, T> map, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d7e5124c", new Object[]{map, new Boolean(z)});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.taobao.orange.util.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, str, str2})).intValue() : a(str, str2);
            }

            public int a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
                }
                if (z) {
                    return str.compareTo(str2);
                }
                return str2.compareTo(str);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }

    public static String a(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87bfa350", new Object[]{indexDO});
        }
        if (indexDO == null) {
            return null;
        }
        SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(IndexDO.class, new String[0]);
        simplePropertyPreFilter.getExcludes().add("mergedNamespaces");
        return JSON.toJSONString(indexDO, simplePropertyPreFilter, SerializerFeature.PrettyFormat);
    }

    public static String a(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fca3579", new Object[]{nameSpaceDO});
        }
        if (nameSpaceDO != null) {
            return JSON.toJSONString(nameSpaceDO, new SimplePropertyPreFilter(NameSpaceDO.class, "name", "version", IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, com.taobao.android.upp.e.KEY_UPP_SCHEME_PARAMS_BIZ_DATA), SerializerFeature.PrettyFormat);
        }
        return null;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) h.d(context, OConstant.SYSKEY_ENABLE_REMOVE_MAIN_SERVICE, true)).booleanValue();
        return b() ? booleanValue : booleanValue && (i.a(OConstant.AB_ANR_SWITCH_1) || i.a(OConstant.AB_ANR_SWITCH_2));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : com.taobao.orange.a.j.split("\\.").length > 3;
    }
}
