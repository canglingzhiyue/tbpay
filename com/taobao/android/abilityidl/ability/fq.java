package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fq {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8871a;
    public String b;

    static {
        kge.a(1705342217);
    }

    public fq() {
    }

    public fq(Map<String, ? extends Object> map) {
        this();
        this.f8871a = com.alibaba.ability.e.b(map, "useTopVisiblePage", (Boolean) null);
        this.b = UTStatus.Companion.a(com.alibaba.ability.e.b(map, "utStatus", (String) null));
    }
}
