package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.gc;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class ClientPrerenderAbilityWrapper extends AbsAbilityWrapper<AbsClientPrerenderAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2110772771);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientPrerenderAbilityWrapper(AbsClientPrerenderAbility impl) {
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
            case -1967064655:
                if (!api.equals("addPrerenderAttachEventListener")) {
                    return null;
                }
                getAbilityImpl().addPrerenderAttachEventListener(context, new a(callback));
                return null;
            case -1078094060:
                if (!api.equals("removePrerenderAttachEventListener")) {
                    return null;
                }
                getAbilityImpl().removePrerenderAttachEventListener(context, new ify(callback));
                return null;
            case 109757538:
                if (!api.equals("start")) {
                    return null;
                }
                getAbilityImpl().start(context, new ify(callback));
                return null;
            case 1169596279:
                if (!api.equals("reportPrerenderStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().reportPrerenderStatus(context, new fy(params), new ify(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements gc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8636a;

        public a(aln alnVar) {
            this.f8636a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.gc
        public void a(ClientPrerenderPrerenderAttachDetail result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cf0b7c", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8636a.a(new FinishResult((JSONObject) json, "onPrerenderAttach"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gc.a.a(this, result);
            this.f8636a.a(result);
        }
    }
}
