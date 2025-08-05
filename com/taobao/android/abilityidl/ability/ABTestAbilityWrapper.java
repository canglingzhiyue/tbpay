package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class ABTestAbilityWrapper extends AbsAbilityWrapper<AbsABTestAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(685759638);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ABTestAbilityWrapper(AbsABTestAbility impl) {
        super(impl);
        kotlin.jvm.internal.q.d(impl, "impl");
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        if (api.hashCode() != -91548835 || !api.equals("getVariation")) {
            return null;
        }
        try {
            com.alibaba.ability.result.g<String, ErrorResult> variation = getAbilityImpl().getVariation(context, new a(params));
            ErrorResult b = variation.b();
            if (b != null) {
                return b;
            }
            return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", variation.a()))), null, 2, null);
        } catch (Throwable th) {
            return a$a.Companion.b(th.getMessage());
        }
    }
}
