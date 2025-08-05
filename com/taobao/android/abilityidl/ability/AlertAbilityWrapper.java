package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.be;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class AlertAbilityWrapper extends AbsAbilityWrapper<AbsAlertAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(288058315);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertAbilityWrapper(AbsAlertAbility impl) {
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
        if (api.hashCode() != 3529469 || !api.equals("show")) {
            return null;
        }
        try {
            getAbilityImpl().show(context, new j(params), new a(callback));
            return null;
        } catch (Throwable th) {
            return a$a.Companion.b(th.getMessage());
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements be {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8628a;

        public a(aln alnVar) {
            this.f8628a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.be
        public void a(AlertConfirmInfo result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6792f8b", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8628a.a(new FinishResult((JSONObject) json, "onConfirm"));
        }

        @Override // com.taobao.android.abilityidl.ability.be
        public void b(AlertConfirmInfo result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90eed00c", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8628a.a(new FinishResult((JSONObject) json, "onCancel"));
        }

        @Override // com.taobao.android.abilityidl.ability.be
        public void c(AlertConfirmInfo result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b64708d", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8628a.a(new FinishResult((JSONObject) json, "onOther"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            be.a.a(this, result);
            this.f8628a.a(result);
        }
    }
}
