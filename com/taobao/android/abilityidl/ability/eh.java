package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class eh {

    /* renamed from: a  reason: collision with root package name */
    public String f8840a;
    public String b;

    static {
        kge.a(1571216754);
    }

    public eh() {
        this.f8840a = "";
        this.b = "";
    }

    public eh(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "strongGuidePopTitle", (String) null);
        if (b == null) {
            throw new RuntimeException("strongGuidePopTitle 参数必传！");
        }
        this.f8840a = b;
        String b2 = com.alibaba.ability.e.b(map, "strongGuidePopDesc", (String) null);
        if (b2 == null) {
            throw new RuntimeException("strongGuidePopDesc 参数必传！");
        }
        this.b = b2;
    }
}
