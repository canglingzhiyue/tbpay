package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class en {

    /* renamed from: a  reason: collision with root package name */
    public String f8846a;
    public String b;
    public String c;

    static {
        kge.a(1445292323);
    }

    public en() {
        this.f8846a = "";
        this.b = "";
        this.c = "";
    }

    public en(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "typeID", (String) null);
        if (b == null) {
            throw new RuntimeException("typeID 参数必传！");
        }
        this.f8846a = b;
        String b2 = com.alibaba.ability.e.b(map, "widgetType", (String) null);
        if (b2 == null) {
            throw new RuntimeException("widgetType 参数必传！");
        }
        this.b = b2;
        String b3 = com.alibaba.ability.e.b(map, "channel", (String) null);
        if (b3 == null) {
            throw new RuntimeException("channel 参数必传！");
        }
        this.c = b3;
    }
}
