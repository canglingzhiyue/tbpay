package com.taobao.android.abilityidl.ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fd {

    /* renamed from: a  reason: collision with root package name */
    public List<fe> f8862a;

    static {
        kge.a(1474728136);
    }

    public fd() {
        this.f8862a = kotlin.collections.p.a();
    }

    public fd(Map<String, ? extends Object> map) {
        this();
        List<Object> d = com.alibaba.ability.e.d(map, "tasks");
        if (d != null) {
            List<Object> list = d;
            ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
            for (Object obj : list) {
                try {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.AbilityData /* = kotlin.collections.Map<kotlin.String, kotlin.Any?> */");
                    }
                    arrayList.add(new fe((Map) obj));
                } catch (Exception e) {
                    throw new RuntimeException("tasks 参数类型错误， 必须是 List<ExecutorTask> 类型！" + e.getMessage());
                }
            }
            this.f8862a = arrayList;
            return;
        }
        throw new RuntimeException("tasks 参数必传！");
    }
}
