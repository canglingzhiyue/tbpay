package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class as {

    /* renamed from: a  reason: collision with root package name */
    public String f8790a;
    public boolean b;

    static {
        kge.a(-654072199);
    }

    public as() {
        this.f8790a = "";
    }

    public as(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "path", (String) null);
        if (b == null) {
            throw new RuntimeException("path 参数必传！");
        }
        this.f8790a = b;
        boolean z = false;
        Boolean b2 = com.alibaba.ability.e.b(map, "recursive", (Boolean) false);
        this.b = b2 != null ? b2.booleanValue() : z;
    }
}
