package com.taobao.android.abilityidl.ability;

import com.taobao.android.abilityidl.ability.SharePannelShareTarget;
import com.taobao.homepage.pop.utils.PopConst;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ee {

    /* renamed from: a  reason: collision with root package name */
    public String f8837a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, ? extends Object> f;
    public Map<String, ? extends Object> g;
    public List<String> h;

    static {
        kge.a(-1103711699);
    }

    public ee() {
        this.f8837a = "";
        this.b = "";
    }

    public ee(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList = null;
        String b = com.alibaba.ability.e.b(map, PopConst.BRIDGE_KEY_BUSINESS_ID, (String) null);
        if (b == null) {
            throw new RuntimeException("businessID 参数必传！");
        }
        this.f8837a = b;
        String b2 = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b2 == null) {
            throw new RuntimeException("url 参数必传！");
        }
        this.b = b2;
        this.c = com.alibaba.ability.e.b(map, "title", (String) null);
        this.d = com.alibaba.ability.e.b(map, "desc", (String) null);
        this.e = com.alibaba.ability.e.b(map, "imageURL", (String) null);
        this.f = com.alibaba.ability.e.c(map, "templateParams");
        this.g = com.alibaba.ability.e.c(map, "extendParams");
        List<Object> d = com.alibaba.ability.e.d(map, "targets");
        if (d != null) {
            List<Object> list = d;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.p.a((Iterable) list, 10));
            for (Object obj : list) {
                SharePannelShareTarget.a aVar = SharePannelShareTarget.Companion;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String a2 = aVar.a((String) obj);
                if (a2 == null) {
                    throw new RuntimeException("targets 参数类型错误，必须是 List<SharePannelShareTarget> 类型！");
                }
                arrayList2.add(a2);
            }
            arrayList = arrayList2;
        }
        this.h = arrayList;
    }
}
