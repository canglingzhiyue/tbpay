package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class eg {

    /* renamed from: a  reason: collision with root package name */
    public String f8839a;

    static {
        kge.a(137176699);
    }

    public eg() {
        this.f8839a = "";
    }

    public eg(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b != null) {
            this.f8839a = b;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
