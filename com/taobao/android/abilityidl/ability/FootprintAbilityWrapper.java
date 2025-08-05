package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ge;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class FootprintAbilityWrapper extends AbsAbilityWrapper<AbsFootprintAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1127870766);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FootprintAbilityWrapper(AbsFootprintAbility impl) {
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
        if (api.hashCode() != 68806126 || !api.equals("requestFootprintList")) {
            return null;
        }
        try {
            getAbilityImpl().requestFootprintList(context, new gb(params), new a(callback));
            return null;
        } catch (Throwable th) {
            return a$a.Companion.b(th.getMessage());
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements ge {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8681a;

        public a(aln alnVar) {
            this.f8681a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ge
        public void a(FootprintResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed3a3c17", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8681a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ge.a.a(this, result);
            this.f8681a.a(result);
        }
    }
}
