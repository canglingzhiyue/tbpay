package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dl {

    /* renamed from: a  reason: collision with root package name */
    public String f8817a;

    static {
        kge.a(-1821813651);
    }

    public dl() {
        this.f8817a = "";
    }

    public dl(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b != null) {
            this.f8817a = b;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
