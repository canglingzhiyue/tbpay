package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public String f8888a;

    static {
        kge.a(1645854650);
    }

    public m() {
        this.f8888a = "";
    }

    public m(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "src", (String) null);
        if (b != null) {
            this.f8888a = b;
            return;
        }
        throw new RuntimeException("src 参数必传！");
    }
}
