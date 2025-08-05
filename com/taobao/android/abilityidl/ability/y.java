package com.taobao.android.abilityidl.ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public String f8900a;
    public String b;
    public String c;
    public String d;
    public List<String> e;
    public v f;
    public fa g;

    static {
        kge.a(425288607);
    }

    public y() {
        this.f8900a = "";
        this.b = "";
        this.c = "web";
    }

    public y(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        fa faVar = null;
        String b = com.alibaba.ability.e.b(map, "pageId", (String) null);
        if (b == null) {
            throw new RuntimeException("pageId 参数必传！");
        }
        this.f8900a = b;
        String b2 = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b2 == null) {
            throw new RuntimeException("url 参数必传！");
        }
        this.b = b2;
        String a2 = ContainerRendererMode.Companion.a(com.alibaba.ability.e.b(map, "renderer", "web"));
        this.c = a2 == null ? "web" : a2;
        this.d = com.alibaba.ability.e.b(map, "pageType", (String) null);
        List<Object> d = com.alibaba.ability.e.d(map, "children");
        if (d != null) {
            List<Object> list = d;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
            for (Object obj : list) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                try {
                    arrayList2.add((String) obj);
                } catch (Exception e) {
                    throw new RuntimeException("children 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                }
                throw new RuntimeException("children 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        this.e = arrayList;
        this.f = (map == null || !map.containsKey("groupConfig")) ? null : new v(com.alibaba.ability.e.c(map, "groupConfig"));
        if (map != null && map.containsKey(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)) {
            faVar = new fa(com.alibaba.ability.e.c(map, com.taobao.android.weex_framework.util.a.ATOM_EXT_window));
        }
        this.g = faVar;
    }
}
