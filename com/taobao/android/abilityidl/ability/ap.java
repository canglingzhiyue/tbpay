package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public String f8787a;
    public String b;

    static {
        kge.a(-979058838);
    }

    public ap() {
        this.f8787a = "";
    }

    public ap(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "path", (String) null);
        if (b == null) {
            throw new RuntimeException("path 参数必传！");
        }
        this.f8787a = b;
        this.b = FileAlgorithmType.Companion.a(com.alibaba.ability.e.b(map, "digestAlgorithm", (String) null));
    }
}
