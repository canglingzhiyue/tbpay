package com.taobao.android.abilityidl.ability;

import com.alipay.birdnest.util.UiUtil;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public String f8885a;
    public String b;
    public i c;
    public String d;
    public String e;
    public String f;

    static {
        kge.a(1204233032);
    }

    public j() {
    }

    public j(Map<String, ? extends Object> map) {
        this();
        this.f8885a = com.alibaba.ability.e.b(map, "title", (String) null);
        this.b = com.alibaba.ability.e.b(map, "content", (String) null);
        this.c = (map == null || !map.containsKey(UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) ? null : new i(com.alibaba.ability.e.c(map, UiUtil.INPUT_TYPE_VALUE_CHECKBOX));
        this.d = com.alibaba.ability.e.b(map, "confirmButtonText", (String) null);
        this.e = com.alibaba.ability.e.b(map, "cancelButtonText", (String) null);
        this.f = com.alibaba.ability.e.b(map, "otherButtonText", (String) null);
    }
}
