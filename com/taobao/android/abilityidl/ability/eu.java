package com.taobao.android.abilityidl.ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class eu {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f8852a;

    static {
        kge.a(-1349896456);
    }

    public eu() {
    }

    public eu(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> d = com.alibaba.ability.e.d(map, "requestIDs");
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
                    throw new RuntimeException("requestIDs 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                }
                throw new RuntimeException("requestIDs 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        this.f8852a = arrayList;
    }
}
