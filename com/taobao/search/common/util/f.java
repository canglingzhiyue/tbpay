package com.taobao.search.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static String f19033a;
    private static String b;
    private static Map<String, String> c;
    private static Map<String, String> d;

    static {
        kge.a(-567968032);
        INSTANCE = new f();
    }

    private f() {
    }

    @JvmStatic
    public static final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("homepage_common", 0);
            if (sharedPreferences == null) {
                q.b("HomepageVersionManager", "home page sp is null");
                return;
            }
            f19033a = sharedPreferences.getString("HomePageLatestVersion", "");
            f fVar = INSTANCE;
            String string = sharedPreferences.getString("homePassParams", "");
            kotlin.jvm.internal.q.a((Object) string, "sp.getString(HOME_PASS_PARAMS, \"\")");
            d = fVar.a(string);
            c = INSTANCE.a(d);
            if (com.taobao.android.searchbaseframe.util.q.a()) {
                b = "";
                return;
            }
            b = sharedPreferences.getString("tb_homepage_clientCache_lbs", "");
            q.a("HomepageVersionManager", "HomePageLbs:" + b);
        }
    }

    private final Map<String, String> a(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject parseObject2 = JSON.parseObject(str);
            if (parseObject2 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (String key : parseObject2.keySet()) {
                String value = parseObject2.getString(key);
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                    kotlin.jvm.internal.q.a((Object) key, "key");
                    kotlin.jvm.internal.q.a((Object) value, "value");
                    hashMap.put(key, value);
                }
            }
            String str2 = (String) hashMap.remove("searchPassParams");
            if (StringUtils.isEmpty(str2) || (parseObject = JSON.parseObject(str2)) == null) {
                return hashMap;
            }
            for (String key2 : parseObject.keySet()) {
                String value2 = parseObject.getString(key2);
                if (!StringUtils.isEmpty(key2) && !StringUtils.isEmpty(value2)) {
                    kotlin.jvm.internal.q.a((Object) key2, "key");
                    kotlin.jvm.internal.q.a((Object) value2, "value");
                    hashMap.put(key2, value2);
                }
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    private final Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        HashMap hashMap = null;
        if (map != null && !map.isEmpty()) {
            List<String> d2 = d();
            if (d2.isEmpty()) {
                return null;
            }
            hashMap = new HashMap();
            for (String str : map.keySet()) {
                if (d2.contains(str)) {
                    String str2 = map.get(str);
                    if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                        hashMap.put(str, str2);
                    }
                }
            }
        }
        return hashMap;
    }

    private final List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        String b2 = com.taobao.android.searchbaseframe.util.q.b();
        String str = b2;
        if (StringUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (b2 == null) {
            kotlin.jvm.internal.q.a();
        }
        Object[] array = kotlin.text.n.b((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            return kotlin.collections.p.b((String[]) Arrays.copyOf(strArr, strArr.length));
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f19033a;
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    @JvmStatic
    public static final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : c;
    }
}
