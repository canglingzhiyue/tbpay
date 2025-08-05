package com.taobao.trade.common.kit.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AliConfigInterface f22984a;
    private static final Map<String, com.taobao.android.c> b;
    private static final Map<String, Map<String, String>> c;

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : c;
    }

    static {
        kge.a(1811768831);
        f22984a = com.taobao.android.e.a();
        b = new HashMap();
        c = new HashMap();
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (f22984a == null || b.containsKey(str)) {
        } else {
            com.taobao.android.c cVar = new com.taobao.android.c() { // from class: com.taobao.trade.common.kit.utils.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.c
                public void a(String str2, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20476513", new Object[]{this, str2, map});
                        return;
                    }
                    e.a().put(str2, map);
                    if (!b.a()) {
                        return;
                    }
                    f.b("UltronOrange", "接收到Orange配置更新:namespace=", str2, JSONObject.toJSONString(map));
                }
            };
            b.put(str, cVar);
            f22984a.a(new String[]{str}, cVar);
        }
    }

    private static <T> Object a(String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d321fbda", new Object[]{str, str2, t});
        }
        if (f22984a == null) {
            return t;
        }
        a(str);
        String a2 = a(str, str2);
        if (a2 == null) {
            a2 = f22984a.a(str, str2, t == null ? null : String.valueOf(t));
            a(str, str2, a2);
        }
        try {
            if (t instanceof Boolean) {
                return Boolean.valueOf(Boolean.parseBoolean(a2));
            }
            if (t instanceof Float) {
                return Float.valueOf(Float.parseFloat(a2));
            }
            if (t instanceof Integer) {
                return Integer.valueOf(Integer.parseInt(a2));
            }
            return t instanceof Long ? Long.valueOf(Long.parseLong(a2)) : a2;
        } catch (Exception unused) {
            f.a(str, "UltronOrange", "key=" + str2 + ",value=" + a2);
            return t;
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        Map<String, String> map = c.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (str3 == null) {
        } else {
            Map<String, String> map = c.get(str);
            if (map == null) {
                map = new HashMap<>();
                c.put(str, map);
            }
            map.put(str2, str3);
        }
    }

    public static float a(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba89b4", new Object[]{str, str2, new Float(f)})).floatValue() : ((Float) a(str, str2, Float.valueOf(f))).floatValue();
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : ((Boolean) a(str, str2, Boolean.valueOf(z))).booleanValue();
    }
}
