package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import com.taobao.tao.flexbox.layoutmanager.core.y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<Class, HashMap<String, Method>> f20398a;
    private static HashMap<String, Class> b;

    static {
        kge.a(-1370027511);
        f20398a = new WeakHashMap<>();
        HashMap<String, Class> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put("utils", Utils.class);
        b.put("array", ArrayUtils.class);
        b.put("string", StringUtils.class);
        b.put("map", MapUtils.class);
        b.put("math", MathUtils.class);
        b.put("date", DateFilters.class);
        b.put("config", OrangeUtils.class);
        b.put("ab", ABUtils.class);
        b.put("theme", ThemeUtils.class);
        b.put(WXStorageModule.NAME, StorageUtils.class);
    }

    public static Method a(Class cls, String str, int i) {
        Method[] methods;
        Method method;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("299b727a", new Object[]{cls, str, new Integer(i)});
        }
        String str2 = str + i;
        HashMap<String, Method> hashMap = f20398a.get(cls);
        if (hashMap != null && (method = hashMap.get(str2)) != null) {
            return method;
        }
        for (Method method2 : cls.getMethods()) {
            FilterHandler filterHandler = (FilterHandler) method2.getAnnotation(FilterHandler.class);
            if (filterHandler != null && filterHandler.name().equals(str) && method2.getParameterTypes().length == i) {
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    f20398a.put(cls, hashMap);
                }
                hashMap.put(str2, method2);
                return method2;
            }
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
            f20398a.put(cls, hashMap);
        }
        hashMap.put(str2, null);
        return null;
    }

    public static Object a(Class cls, String str, List list) {
        int i;
        boolean z = false;
        if (list != null) {
            i = list.size();
            if (!list.isEmpty() && (list.get(list.size() - 1) instanceof af)) {
                i--;
            }
        } else {
            i = 0;
        }
        Method a2 = a(cls, str, i);
        if (a2 != null) {
            if (list != null) {
                z = true;
            }
            try {
                return a2.invoke(null, (list.isEmpty() ^ true) & z ? list.toArray(new Object[list.size()]) : null);
            } catch (IllegalAccessException e) {
                ogg.b("handleFilter: " + e.getMessage());
                return "";
            } catch (InvocationTargetException e2) {
                ogg.b("handleFilter: " + e2.getMessage());
                return "";
            }
        }
        return "";
    }

    public static void a(Map<String, Class> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map == null) {
        } else {
            map.putAll(b);
        }
    }

    public static Object a(y yVar, String str, ab abVar, String str2, Class cls, String str3, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bc2865dc", new Object[]{yVar, str, abVar, str2, cls, str3, list});
        }
        if (str2.equals("utils")) {
            return Utils.a(yVar, str, str3, list);
        }
        if (str2.equals("array")) {
            return ArrayUtils.a(str3, list);
        }
        if (str2.equals("string")) {
            return StringUtils.a(str3, list);
        }
        if (str2.equals("map")) {
            return MapUtils.a(str3, list);
        }
        if (str2.equals("math")) {
            return MathUtils.a(str3, list);
        }
        if (str2.equals("date")) {
            return DateFilters.a(str3, list);
        }
        if (str2.equals("config")) {
            return OrangeUtils.a(str3, list);
        }
        if (str2.equals("ab")) {
            return ABUtils.a(str3, list);
        }
        if (str2.equals("theme")) {
            return ThemeUtils.a(str3, list);
        }
        if (str2.equals(WXStorageModule.NAME)) {
            return StorageUtils.a(str3, list);
        }
        return a(cls, str3, list);
    }
}
