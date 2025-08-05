package com.taobao.android.abilityidl.ability;

import com.taobao.android.abilityidl.ability.PermissionKeyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dr {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f8823a;
    public String b;
    public String c;
    public int d;

    static {
        kge.a(-2006092884);
    }

    public dr() {
        this.f8823a = kotlin.collections.p.a();
        this.b = "";
        this.c = "";
        this.d = 1;
    }

    public dr(Map<String, ? extends Object> map) {
        this();
        List<Object> d = com.alibaba.ability.e.d(map, "permissions");
        if (d == null) {
            throw new RuntimeException("permissions 参数必传！");
        }
        List<Object> list = d;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
        for (Object obj : list) {
            PermissionKeyType.a aVar = PermissionKeyType.Companion;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            String a2 = aVar.a((String) obj);
            if (a2 == null) {
                throw new RuntimeException("permissions 参数类型错误， 必须是 List<PermissionKeyType> 类型！");
            }
            arrayList.add(a2);
        }
        this.f8823a = arrayList;
        String b = com.alibaba.ability.e.b(map, "privacyID", (String) null);
        if (b == null) {
            throw new RuntimeException("privacyID 参数必传！");
        }
        this.b = b;
        String b2 = com.alibaba.ability.e.b(map, "description", (String) null);
        if (b2 == null) {
            throw new RuntimeException("description 参数必传！");
        }
        this.c = b2;
        int i = 1;
        Integer b3 = com.alibaba.ability.e.b(map, "silenceTime", (Integer) 1);
        this.d = b3 != null ? b3.intValue() : i;
    }
}
