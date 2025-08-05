package com.taobao.android.abilityidl.ability;

import com.taobao.android.fluid.core.exception.FluidException;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class et {

    /* renamed from: a  reason: collision with root package name */
    public String f8851a;

    static {
        kge.a(1588020347);
    }

    public et() {
        this.f8851a = "";
    }

    public et(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, FluidException.SERVICE_NAME, (String) null);
        if (b != null) {
            this.f8851a = b;
            return;
        }
        throw new RuntimeException("serviceName 参数必传！");
    }
}
