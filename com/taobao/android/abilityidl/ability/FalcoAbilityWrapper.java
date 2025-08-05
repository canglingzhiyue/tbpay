package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class FalcoAbilityWrapper extends AbsAbilityWrapper<AbsFalcoAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-552952852);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FalcoAbilityWrapper(AbsFalcoAbility impl) {
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
        if (api.hashCode() != 409380017 || !api.equals("updateScreenshotMonitorParams")) {
            return null;
        }
        try {
            getAbilityImpl().updateScreenshotMonitorParams(context, new ga(params), new ify(callback));
            return null;
        } catch (Throwable th) {
            return a$a.Companion.b(th.getMessage());
        }
    }
}
