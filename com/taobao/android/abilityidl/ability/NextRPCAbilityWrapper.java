package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.es;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class NextRPCAbilityWrapper extends AbsAbilityWrapper<AbsNextRPCAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(999183457);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextRPCAbilityWrapper(AbsNextRPCAbility impl) {
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
            case -1367724422:
                if (!api.equals("cancel")) {
                    return null;
                }
                try {
                    getAbilityImpl().cancel(context, new eu(params), new ify(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -840745386:
                if (!api.equals("unbind")) {
                    return null;
                }
                try {
                    getAbilityImpl().unbind(context, new et(params), new ify(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case 3023933:
                if (!api.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_bind)) {
                    return null;
                }
                try {
                    getAbilityImpl().bind(context, new et(params), new ify(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            case 1095692943:
                if (!api.equals("request")) {
                    return null;
                }
                try {
                    getAbilityImpl().request(context, new ew(params), new a(callback));
                    return null;
                } catch (Throwable th4) {
                    return a$a.Companion.b(th4.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements es {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8711a;

        public a(aln alnVar) {
            this.f8711a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.es
        public void a(NextRPCRequest result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14ac8d40", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8711a.a(new FinishResult((JSONObject) json, "onCreateRequest"));
        }

        @Override // com.taobao.android.abilityidl.ability.es
        public void a(NextRPCReceiveDataResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a54585", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8711a.a(new FinishResult((JSONObject) json, "onReceiveData"));
        }

        @Override // com.taobao.android.abilityidl.ability.es
        public void b(NextRPCReceiveDataResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf6d506", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8711a.a(new FinishResult((JSONObject) json, "onReceiveAttachedResponse"));
        }

        @Override // com.taobao.android.abilityidl.ability.es
        public void c(NextRPCReceiveDataResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec486487", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8711a.a(new FinishResult((JSONObject) json, "onFailure"));
        }

        @Override // com.taobao.android.abilityidl.ability.es
        public void a(NextRPCFinishResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad7a7f31", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8711a.a(new FinishResult((JSONObject) json, "onFinish"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            es.a.a(this, result);
            this.f8711a.a(result);
        }
    }
}
