package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bg;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class BroadcastAbilityWrapper extends AbsAbilityWrapper<AbsBroadcastAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(922968944);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastAbilityWrapper(AbsBroadcastAbility impl) {
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
        int hashCode = api.hashCode();
        if (hashCode == -2140931520) {
            if (!api.equals("dispatchEvent")) {
                return null;
            }
            try {
                getAbilityImpl().dispatchEvent(context, new p(params), new ify(callback));
                return null;
            } catch (Throwable th) {
                return a$a.Companion.b(th.getMessage());
            }
        } else if (hashCode == -625809843) {
            if (!api.equals("addEventListener")) {
                return null;
            }
            try {
                getAbilityImpl().addEventListener(context, new o(params), new a(callback));
                return null;
            } catch (Throwable th2) {
                return a$a.Companion.b(th2.getMessage());
            }
        } else if (hashCode != -541487286 || !api.equals("removeEventListener")) {
            return null;
        } else {
            try {
                getAbilityImpl().removeEventListener(context, new q(params), new ify(callback));
                return null;
            } catch (Throwable th3) {
                return a$a.Companion.b(th3.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements bg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8635a;

        public a(aln alnVar) {
            this.f8635a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bg
        public void onEvent(BroadcastEventResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8635a.a(new FinishResult((JSONObject) json, MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT));
        }

        @Override // com.taobao.android.abilityidl.ability.bg
        public void a(BroadcastAddListenerEventResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afb25af0", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8635a.a(new FinishResult((JSONObject) json, "onAdd"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bg.a.a(this, result);
            this.f8635a.a(result);
        }
    }
}
