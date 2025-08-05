package com.taobao.android.abilityidl.ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fe {

    /* renamed from: a  reason: collision with root package name */
    public List<fc> f8863a;
    public boolean b;

    static {
        kge.a(179896434);
    }

    public fe() {
        this.f8863a = kotlin.collections.p.a();
    }

    public fe(Map<String, ? extends Object> map) {
        this();
        List<Object> d = com.alibaba.ability.e.d(map, "apis");
        if (d == null) {
            throw new RuntimeException("apis 参数必传！");
        }
        List<Object> list = d;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
        for (Object obj : list) {
            try {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.AbilityData /* = kotlin.collections.Map<kotlin.String, kotlin.Any?> */");
                }
                arrayList.add(new fc((Map) obj));
            } catch (Exception e) {
                throw new RuntimeException("apis 参数类型错误， 必须是 List<ExecutorAPI> 类型！" + e.getMessage());
            }
        }
        this.f8863a = arrayList;
        boolean z = false;
        Boolean b = com.alibaba.ability.e.b(map, "blockOnError", (Boolean) false);
        this.b = b != null ? b.booleanValue() : z;
    }
}
