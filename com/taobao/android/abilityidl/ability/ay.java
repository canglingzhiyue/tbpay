package com.taobao.android.abilityidl.ability;

import com.taobao.android.abilityidl.ability.GlobalMenuSupportModifyItemType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ay {

    /* renamed from: a  reason: collision with root package name */
    public List<ax> f8796a;
    public List<String> b;

    static {
        kge.a(1368873601);
    }

    public ay() {
    }

    public ay(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> d = com.alibaba.ability.e.d(map, "customItems");
        ArrayList arrayList2 = null;
        if (d != null) {
            List<Object> list = d;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
            for (Object obj : list) {
                try {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.AbilityData /* = kotlin.collections.Map<kotlin.String, kotlin.Any?> */");
                    }
                    arrayList3.add(new ax((Map) obj));
                } catch (Exception e) {
                    throw new RuntimeException("customItems 参数类型错误，必须是 List<GlobalMenuCustomItem> 类型！" + e.getMessage());
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        this.f8796a = arrayList;
        List<Object> d2 = com.alibaba.ability.e.d(map, "deleteItemTypes");
        if (d2 != null) {
            List<Object> list2 = d2;
            ArrayList arrayList4 = new ArrayList(kotlin.collections.p.a((Iterable) list2, 10));
            for (Object obj2 : list2) {
                GlobalMenuSupportModifyItemType.a aVar = GlobalMenuSupportModifyItemType.Companion;
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String a2 = aVar.a((String) obj2);
                if (a2 == null) {
                    throw new RuntimeException("deleteItemTypes 参数类型错误，必须是 List<GlobalMenuSupportModifyItemType> 类型！");
                }
                arrayList4.add(a2);
            }
            arrayList2 = arrayList4;
        }
        this.b = arrayList2;
    }
}
