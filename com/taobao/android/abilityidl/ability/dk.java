package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dk {

    /* renamed from: a  reason: collision with root package name */
    public String f8816a;

    static {
        kge.a(46312846);
    }

    public dk() {
        this.f8816a = "";
    }

    public dk(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "title", (String) null);
        if (b != null) {
            this.f8816a = b;
            return;
        }
        throw new RuntimeException("title 参数必传！");
    }
}
