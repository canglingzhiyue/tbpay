package com.alibaba.ability.impl.orange;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsOrangeAbility;
import com.taobao.android.abilityidl.ability.dp;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.internal.q;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class OrangeAbility extends AbsOrangeAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1597087684);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeAbility
    public g<String, ErrorResult> get(als context, dp params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("dd93fb9c", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        return new g<>(OrangeConfig.getInstance().getConfig(params.f8821a, params.b, ""), null, 2, null);
    }
}
