package com.taobao.android.abilityidl.ability;

import com.alipay.android.msp.utils.UserLocation;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class db {

    /* renamed from: a  reason: collision with root package name */
    public String f8807a;
    public String b;
    public String c;
    public boolean d;

    static {
        kge.a(288123163);
    }

    public db() {
        this.f8807a = "";
        this.b = "TWO_HOUR";
        this.c = "LOW_MODE";
        this.d = true;
    }

    public db(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizName", (String) null);
        if (b == null) {
            throw new RuntimeException("bizName 参数必传！");
        }
        this.f8807a = b;
        String a2 = LocationExpires.Companion.a(com.alibaba.ability.e.b(map, "expires", "TWO_HOUR"));
        this.b = a2 == null ? "TWO_HOUR" : a2;
        String a3 = LocationAccuracy.Companion.a(com.alibaba.ability.e.b(map, UserLocation.KEY_DOUBLE_ACCURACY, "LOW_MODE"));
        this.c = a3 == null ? "LOW_MODE" : a3;
        boolean z = true;
        Boolean b2 = com.alibaba.ability.e.b(map, "needAddress", (Boolean) true);
        this.d = b2 != null ? b2.booleanValue() : z;
    }
}
