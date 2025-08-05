package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cp;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class SharePannelAbilityWrapper extends AbsAbilityWrapper<AbsSharePannelAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1142750394);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePannelAbilityWrapper(AbsSharePannelAbility impl) {
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
        if (api.hashCode() != 3417674 || !api.equals("open")) {
            return null;
        }
        try {
            getAbilityImpl().open(context, new ee(params), new a(callback));
            return null;
        } catch (Throwable th) {
            return a$a.Companion.b(th.getMessage());
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements cp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8736a;

        public a(aln alnVar) {
            this.f8736a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cp
        public void a(String result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            this.f8736a.a(new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", result))), "onSuccess"));
        }

        @Override // com.taobao.android.abilityidl.ability.cp
        public void b(String result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            this.f8736a.a(new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", result))), "onFail"));
        }

        @Override // com.taobao.android.abilityidl.ability.cp
        public void c(String result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            this.f8736a.a(new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", result))), "onCancel"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cp.a.a(this, result);
            this.f8736a.a(result);
        }
    }
}
