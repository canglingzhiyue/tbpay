package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.dlu;
import tb.kge;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f8805a;
    public double b;
    public int c;
    public int d;
    public boolean e;

    static {
        kge.a(667773355);
    }

    public d() {
        this.f8805a = "ANY";
        this.b = 2.0d;
        this.c = 1000;
        this.d = 3;
        this.e = true;
    }

    public d(Map<String, ? extends Object> map) {
        this();
        String a2 = AccelerometerShakeAxis.Companion.a(com.alibaba.ability.e.b(map, "axis", "ANY"));
        this.f8805a = a2 == null ? "ANY" : a2;
        double d = 2.0d;
        Double b = com.alibaba.ability.e.b(map, "intensity", Double.valueOf(2.0d));
        this.b = b != null ? b.doubleValue() : d;
        int i = 1000;
        Integer b2 = com.alibaba.ability.e.b(map, "duration", (Integer) 1000);
        this.c = b2 != null ? b2.intValue() : i;
        int i2 = 3;
        Integer b3 = com.alibaba.ability.e.b(map, "count", (Integer) 3);
        this.d = b3 != null ? b3.intValue() : i2;
        boolean z = true;
        Boolean b4 = com.alibaba.ability.e.b(map, dlu.API_VIBRATE, (Boolean) true);
        this.e = b4 != null ? b4.booleanValue() : z;
    }
}
