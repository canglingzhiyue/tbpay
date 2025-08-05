package com.taobao.android.abilityidl.ability;

import com.taobao.android.abilityidl.ability.PermissionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ds {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f8824a;
    public String b;
    public String c;
    public int d;

    static {
        kge.a(-1046718757);
    }

    public ds() {
        this.f8824a = kotlin.collections.p.a();
        this.b = "";
        this.d = 1;
    }

    public ds(Map<String, ? extends Object> map) {
        this();
        List<Object> d = com.alibaba.ability.e.d(map, "permissions");
        if (d == null) {
            throw new RuntimeException("permissions 参数必传！");
        }
        List<Object> list = d;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
        for (Object obj : list) {
            PermissionType.a aVar = PermissionType.Companion;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            String a2 = aVar.a((String) obj);
            if (a2 == null) {
                throw new RuntimeException("permissions 参数类型错误， 必须是 List<PermissionType> 类型！");
            }
            arrayList.add(a2);
        }
        this.f8824a = arrayList;
        String b = com.alibaba.ability.e.b(map, "bizName", (String) null);
        if (b == null) {
            throw new RuntimeException("bizName 参数必传！");
        }
        this.b = b;
        this.c = com.alibaba.ability.e.b(map, "message", (String) null);
        int i = 1;
        Integer b2 = com.alibaba.ability.e.b(map, "timeInterval", (Integer) 1);
        this.d = b2 != null ? b2.intValue() : i;
    }
}
