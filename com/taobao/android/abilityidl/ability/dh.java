package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dh {

    /* renamed from: a  reason: collision with root package name */
    public String f8813a;
    public String b;

    static {
        kge.a(152992125);
    }

    public dh() {
        this.f8813a = "";
        this.b = "";
    }

    public dh(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, com.taobao.themis.kernel.entity.a.KEY_RIGHT_ITEM_LIGHT_IMAGE_URL, (String) null);
        if (b == null) {
            throw new RuntimeException("lightImageUrl 参数必传！");
        }
        this.f8813a = b;
        String b2 = com.alibaba.ability.e.b(map, com.taobao.themis.kernel.entity.a.KEY_RIGHT_ITEM_DARK_IMAGE_URL, (String) null);
        if (b2 == null) {
            throw new RuntimeException("darkImageUrl 参数必传！");
        }
        this.b = b2;
    }
}
