package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class au {

    /* renamed from: a  reason: collision with root package name */
    public String f8792a;
    public String b;

    static {
        kge.a(101470360);
    }

    public au() {
        this.f8792a = "";
        this.b = "";
    }

    public au(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "zipFilePath", (String) null);
        if (b == null) {
            throw new RuntimeException("zipFilePath 参数必传！");
        }
        this.f8792a = b;
        String b2 = com.alibaba.ability.e.b(map, "targetPath", (String) null);
        if (b2 == null) {
            throw new RuntimeException("targetPath 参数必传！");
        }
        this.b = b2;
    }
}
