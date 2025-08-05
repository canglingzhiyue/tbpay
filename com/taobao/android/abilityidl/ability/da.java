package com.taobao.android.abilityidl.ability;

import com.alipay.mobile.common.logging.util.LoggingSPCache;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class da {

    /* renamed from: a  reason: collision with root package name */
    public String f8806a;
    public String b;

    static {
        kge.a(279805807);
    }

    public da() {
        this.f8806a = "";
        this.b = "";
    }

    public da(Map<String, ? extends Object> map) {
        this();
        String a2 = LocalizationLanguage.Companion.a(com.alibaba.ability.e.b(map, LoggingSPCache.STORAGE_LANGUAGE, (String) null));
        if (a2 == null) {
            throw new RuntimeException("language 参数必传！");
        }
        this.f8806a = a2;
        String a3 = LocalizationLocation.Companion.a(com.alibaba.ability.e.b(map, "location", (String) null));
        if (a3 == null) {
            throw new RuntimeException("location 参数必传！");
        }
        this.b = a3;
    }
}
