package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dj {

    /* renamed from: a  reason: collision with root package name */
    public String f8815a;

    static {
        kge.a(46268671);
    }

    public dj() {
        this.f8815a = "";
    }

    public dj(Map<String, ? extends Object> map) {
        this();
        String a2 = NavBarThemeEnum.Companion.a(com.alibaba.ability.e.b(map, "theme", (String) null));
        if (a2 != null) {
            this.f8815a = a2;
            return;
        }
        throw new RuntimeException("theme 参数必传！");
    }
}
