package com.taobao.android.abilityidl.ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class cu {

    /* renamed from: a  reason: collision with root package name */
    public List<cv> f8799a;
    public int b;
    public cw c;
    public String d;

    static {
        kge.a(-379698711);
    }

    public cu() {
        this.f8799a = kotlin.collections.p.a();
        this.d = "PAGE";
    }

    public cu(Map<String, ? extends Object> map) {
        this();
        List<Object> d = com.alibaba.ability.e.d(map, "sources");
        if (d == null) {
            throw new RuntimeException("sources 参数必传！");
        }
        List<Object> list = d;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
        for (Object obj : list) {
            try {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.AbilityData /* = kotlin.collections.Map<kotlin.String, kotlin.Any?> */");
                }
                arrayList.add(new cv((Map) obj));
            } catch (Exception e) {
                throw new RuntimeException("sources 参数类型错误， 必须是 List<ImagePreviewSourceParam> 类型！" + e.getMessage());
            }
        }
        this.f8799a = arrayList;
        int i = 0;
        Integer b = com.alibaba.ability.e.b(map, "index", (Integer) 0);
        this.b = b != null ? b.intValue() : i;
        this.c = (map == null || !map.containsKey("config")) ? null : new cw(com.alibaba.ability.e.c(map, "config"));
        String a2 = ImagePreviewContainerType.Companion.a(com.alibaba.ability.e.b(map, "containerType", "PAGE"));
        this.d = a2 == null ? "PAGE" : a2;
    }
}
