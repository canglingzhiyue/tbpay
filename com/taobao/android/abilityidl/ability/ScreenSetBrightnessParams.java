package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.IAbilityResult;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ScreenSetBrightnessParams implements IAbilityResult {
    public Integer brightness;

    static {
        kge.a(-720782221);
        kge.a(1305549738);
    }

    public ScreenSetBrightnessParams() {
    }

    public ScreenSetBrightnessParams(Map<String, ? extends Object> map) {
        this();
        this.brightness = com.alibaba.ability.e.b(map, "brightness", (Integer) null);
    }
}
