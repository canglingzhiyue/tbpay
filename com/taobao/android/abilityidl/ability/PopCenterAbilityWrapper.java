package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cj;
import com.taobao.android.abilityidl.ability.ck;
import com.taobao.android.abilityidl.ability.cl;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class PopCenterAbilityWrapper extends AbsAbilityWrapper<AbsPopCenterAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-861665291);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopCenterAbilityWrapper(AbsPopCenterAbility impl) {
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
            case -449670347:
                if (!api.equals("setProperties")) {
                    return null;
                }
                try {
                    getAbilityImpl().setProperties(context, new dv(params), new ify(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -109131914:
                if (!api.equals("checkShouldPop")) {
                    return null;
                }
                try {
                    getAbilityImpl().checkShouldPop(context, new du(params), new a(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case 1092811065:
                if (!api.equals("closePop")) {
                    return null;
                }
                getAbilityImpl().closePop(context, new c(callback));
                return null;
            case 1363503481:
                if (!api.equals("triggerPop")) {
                    return null;
                }
                getAbilityImpl().triggerPop(context, new b(callback));
                return null;
            case 1724078742:
                if (!api.equals("recordPopAction")) {
                    return null;
                }
                try {
                    getAbilityImpl().recordPopAction(context, new dt(params), new ify(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements cj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8726a;

        public a(aln alnVar) {
            this.f8726a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cj
        public void a(PopCenterCheckSuccessResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb1021d5", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8726a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cj.a.a(this, result);
            this.f8726a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements cl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8727a;

        public b(aln alnVar) {
            this.f8727a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cl
        public void a(PopCenterTriggerSuccessResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ab4cd45", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8727a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cl.a.a(this, result);
            this.f8727a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ck {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8728a;

        public c(aln alnVar) {
            this.f8728a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ck
        public void a(PopCenterCloseSuccessResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7623ac5", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8728a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ck.a.a(this, result);
            this.f8728a.a(result);
        }
    }
}
