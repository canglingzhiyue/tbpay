package com.taobao.android.abilityidl.ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class du {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f8826a;

    static {
        kge.a(-935434174);
    }

    public du() {
        this.f8826a = kotlin.collections.p.a();
    }

    public du(Map<String, ? extends Object> map) {
        this();
        List<Object> d = com.alibaba.ability.e.d(map, "codes");
        if (d != null) {
            List<Object> list = d;
            ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
            for (Object obj : list) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                try {
                    arrayList.add((String) obj);
                } catch (Exception e) {
                    throw new RuntimeException("codes 参数类型错误， 必须是 List<String> 类型！" + e.getMessage());
                }
                throw new RuntimeException("codes 参数类型错误， 必须是 List<String> 类型！" + e.getMessage());
            }
            this.f8826a = arrayList;
            return;
        }
        throw new RuntimeException("codes 参数必传！");
    }
}
