package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dg {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8812a;

    static {
        kge.a(1994315735);
    }

    public dg() {
    }

    public dg(Map<String, ? extends Object> map) {
        this();
        Boolean b = com.alibaba.ability.e.b(map, com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, (Boolean) null);
        if (b != null) {
            this.f8812a = b.booleanValue();
            return;
        }
        throw new RuntimeException("immersive 参数必传！");
    }
}
