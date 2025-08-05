package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bb;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class AccelerometerAbilityWrapper extends AbsAbilityWrapper<AbsAccelerometerAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1669941118);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccelerometerAbilityWrapper(AbsAccelerometerAbility impl) {
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
        if (hashCode == -307350376) {
            if (!api.equals("setShakeListener")) {
                return null;
            }
            try {
                getAbilityImpl().setShakeListener(context, new d(params), new a(callback));
                return null;
            } catch (Throwable th) {
                return a$a.Companion.b(th.getMessage());
            }
        } else if (hashCode != 1834479921 || !api.equals("unsetShakeListener")) {
            return null;
        } else {
            getAbilityImpl().unsetShakeListener(context, new ify(callback));
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements bb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8622a;

        public a(aln alnVar) {
            this.f8622a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bb
        public void a(AccelerometerShakeRet result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19fd53e9", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8622a.a(new FinishResult((JSONObject) json, "onShake"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bb.a.a(this, result);
            this.f8622a.a(result);
        }
    }
}
