package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dy {

    /* renamed from: a  reason: collision with root package name */
    public String f8830a;
    public String b;

    static {
        kge.a(-876752889);
    }

    public dy() {
        this.f8830a = "";
    }

    public dy(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "pssource", (String) null);
        if (b == null) {
            throw new RuntimeException("pssource 参数必传！");
        }
        this.f8830a = b;
        this.b = ScanCodeScanType.Companion.a(com.alibaba.ability.e.b(map, "type", (String) null));
    }
}
