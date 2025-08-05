package com.taobao.android.abilityidl.ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f8899a;
    public List<String> b;

    static {
        kge.a(-1394958990);
    }

    public x() {
    }

    public x(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> d = com.alibaba.ability.e.d(map, android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW);
        ArrayList arrayList2 = null;
        if (d != null) {
            List<Object> list = d;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
            for (Object obj : list) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                try {
                    arrayList3.add((String) obj);
                } catch (Exception e) {
                    throw new RuntimeException("allow 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                }
                throw new RuntimeException("allow 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        this.f8899a = arrayList;
        List<Object> d2 = com.alibaba.ability.e.d(map, com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE);
        if (d2 != null) {
            List<Object> list2 = d2;
            ArrayList arrayList4 = new ArrayList(kotlin.collections.p.a((Iterable) list2, 10));
            for (Object obj2 : list2) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                try {
                    arrayList4.add((String) obj2);
                } catch (Exception e2) {
                    throw new RuntimeException("ignore 参数类型错误，必须是 List<String> 类型！" + e2.getMessage());
                }
                throw new RuntimeException("ignore 参数类型错误，必须是 List<String> 类型！" + e2.getMessage());
            }
            arrayList2 = arrayList4;
        }
        this.b = arrayList2;
    }
}
