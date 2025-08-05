package com.ut.mini.mtop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.aph;
import tb.apm;
import tb.apr;
import tb.aqe;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Map<String, d>> f24139a;
    private static Map<String, String> b;

    static {
        kge.a(-1590863618);
        f24139a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            aqe.a().a(new Runnable() { // from class: com.ut.mini.mtop.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.c(str);
                    }
                }
            });
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (f(str)) {
            return null;
        }
        try {
            return b.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void c(String str) {
        byte[] b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        try {
            apr.b("UTMtopConfigMgr", "parseConfigData", str);
            byte[] a2 = aph.a(str.getBytes("UTF-8"), 2);
            if (a2 == null || (b2 = apm.b(a2)) == null) {
                return;
            }
            d(new String(b2, 0, b2.length));
        } catch (Throwable unused) {
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (!f(str)) {
            try {
                Map map = (Map) JSONObject.parseObject(str, Map.class);
                if (a(map)) {
                    return;
                }
                Object obj = map.get(com.alipay.sdk.m.f.b.c);
                if (!(obj instanceof List)) {
                    return;
                }
                List<JSONObject> list = (List) obj;
                synchronized (b.class) {
                    for (JSONObject jSONObject : list) {
                        UTMtopConfig uTMtopConfig = (UTMtopConfig) JSONObject.toJavaObject(jSONObject, UTMtopConfig.class);
                        List<UTMtopPageValue> list2 = uTMtopConfig.pageValueList;
                        if (!a(list2)) {
                            String str2 = uTMtopConfig.key;
                            String str3 = uTMtopConfig.separator;
                            for (UTMtopPageValue uTMtopPageValue : list2) {
                                String str4 = uTMtopPageValue.page;
                                List<String> list3 = uTMtopPageValue.valueList;
                                if (!f(str4) && !a(list3)) {
                                    d dVar = null;
                                    Map<String, d> map2 = f24139a.containsKey(str4) ? f24139a.get(str4) : null;
                                    if (map2 == null) {
                                        map2 = new ConcurrentHashMap<>();
                                        f24139a.put(str4, map2);
                                    }
                                    if (map2.containsKey(str2)) {
                                        dVar = map2.get(str2);
                                    }
                                    if (dVar == null) {
                                        dVar = new d();
                                        dVar.f24141a = str3;
                                        map2.put(str2, dVar);
                                    }
                                    boolean z = false;
                                    for (String str5 : list3) {
                                        if (a(dVar, str5)) {
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        Map<String, String> e = e(str4);
                                        if (!a(e)) {
                                            String jSONString = JSON.toJSONString(e);
                                            if (!f(str4)) {
                                                b.put(str4, jSONString);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11b67c12", new Object[]{dVar, str})).booleanValue();
        }
        if (dVar.b.contains(str)) {
            return false;
        }
        dVar.b.add(str);
        return true;
    }

    private static Map<String, String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ddd6ceb", new Object[]{str});
        }
        HashMap hashMap = null;
        Map<String, d> map = f24139a.get(str);
        if (map != null) {
            hashMap = new HashMap();
            for (Map.Entry<String, d> entry : map.entrySet()) {
                String key = entry.getKey();
                String a2 = a(entry.getValue());
                if (!f(key) && !f(a2)) {
                    hashMap.put(key, a2);
                }
            }
        }
        return hashMap;
    }

    private static String a(d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c17349dc", new Object[]{dVar});
        }
        if (dVar == null) {
            return null;
        }
        List<String> list = dVar.b;
        if (a(list)) {
            return null;
        }
        String str = dVar.f24141a;
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (z) {
                sb.append(str2);
                z = false;
            } else {
                sb.append(str);
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    private static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : str == null || str.length() == 0;
    }

    private static boolean a(List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue() : list == null || list.size() == 0;
    }

    private static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.size() == 0;
    }
}
