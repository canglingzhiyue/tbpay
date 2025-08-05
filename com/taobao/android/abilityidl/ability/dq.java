package com.taobao.android.abilityidl.ability;

import com.taobao.android.abilityidl.ability.PermissionKeyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dq {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f8822a;
    public String b;

    static {
        kge.a(496380197);
    }

    public dq() {
        this.f8822a = kotlin.collections.p.a();
        this.b = "";
    }

    public dq(Map<String, ? extends Object> map) {
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
        this.f8822a = arrayList;
        String b = com.alibaba.ability.e.b(map, "privacyID", (String) null);
        if (b == null) {
            throw new RuntimeException("privacyID 参数必传！");
        }
        this.b = b;
    }
}
