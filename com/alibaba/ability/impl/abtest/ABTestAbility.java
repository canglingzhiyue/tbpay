package com.alibaba.ability.impl.abtest;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsABTestAbility;
import com.taobao.android.abilityidl.ability.a;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public class ABTestAbility extends AbsABTestAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-671494300);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsABTestAbility
    public g<String, ErrorResult> getVariation(als alsVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ae71145c", new Object[]{this, alsVar, aVar});
        }
        if (aVar == null) {
            return new g<>(null, new ErrorResult("INVALID_PARAM", "Invalid Params"));
        }
        VariationSet variations = UTABTest.getVariations(aVar.f8771a, aVar.b);
        if (variations == null) {
            return new g<>(null, new ErrorResult("EXPERIMENT_NOT_FOUND", "Experiment Not Found"));
        }
        Variation variation = variations.getVariation(aVar.c);
        if (variation == null) {
            return new g<>(null, new ErrorResult("VARIATION_NOT_FOUND", "Variation Not Found"));
        }
        return new g<>(variation.getValueAsString(null));
    }
}
