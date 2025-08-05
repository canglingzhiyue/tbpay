package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public String f8898a;
    public Map<String, ? extends Object> b;

    static {
        kge.a(1143320035);
    }

    public w() {
        this.f8898a = "";
    }

    public w(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "pageID", (String) null);
        if (b == null) {
            throw new RuntimeException("pageID 参数必传！");
        }
        this.f8898a = b;
        this.b = com.alibaba.ability.e.c(map, "props");
    }
}
