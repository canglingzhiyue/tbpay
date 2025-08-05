package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.az;
import com.taobao.android.abilityidl.ability.ba;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class APMAbilityWrapper extends AbsAbilityWrapper<AbsAPMAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-967772531);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APMAbilityWrapper(AbsAPMAbility impl) {
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
        switch (api.hashCode()) {
            case -1435343664:
                if (api.equals("getCurrentProcedure")) {
                    com.alibaba.ability.result.g<APMProcedureResult, ErrorResult> currentProcedure = getAbilityImpl().getCurrentProcedure(context);
                    ErrorResult b2 = currentProcedure.b();
                    if (b2 != null) {
                        return b2;
                    }
                    Object json = JSONObject.toJSON(currentProcedure.a());
                    if (!(json instanceof JSONObject)) {
                        json = null;
                    }
                    return new FinishResult((JSONObject) json, null, 2, null);
                }
                break;
            case -715880251:
                if (api.equals("addPageProperty")) {
                    try {
                        getAbilityImpl().addPageProperty(context, new com.taobao.android.abilityidl.ability.b(params), new b(callback));
                        break;
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case 105764011:
                if (api.equals("requestSubCurrentProcedure")) {
                    getAbilityImpl().requestSubCurrentProcedure(context, new c(callback));
                    break;
                }
                break;
            case 734887438:
                if (api.equals("addPageStage")) {
                    try {
                        getAbilityImpl().addPageStage(context, new com.taobao.android.abilityidl.ability.c(params), new a(callback));
                        break;
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements ba {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8619a;

        public a(aln alnVar) {
            this.f8619a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ba
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f8619a.a(new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", Boolean.valueOf(z)))), "onResult"));
            }
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ba.a.a(this, result);
            this.f8619a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ba {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8620a;

        public b(aln alnVar) {
            this.f8620a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ba
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f8620a.a(new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", Boolean.valueOf(z)))), "onResult"));
            }
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ba.a.a(this, result);
            this.f8620a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements az {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8621a;

        public c(aln alnVar) {
            this.f8621a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.az
        public void a(APMProcedureResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c9f40b", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8621a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            az.a.a(this, result);
            this.f8621a.a(result);
        }
    }
}
