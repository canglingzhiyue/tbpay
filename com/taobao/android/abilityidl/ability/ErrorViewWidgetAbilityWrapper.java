package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.gd;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class ErrorViewWidgetAbilityWrapper extends AbsAbilityWrapper<AbsErrorViewWidgetAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(638037920);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorViewWidgetAbilityWrapper(AbsErrorViewWidgetAbility impl) {
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
        if (hashCode == 3529469) {
            if (!api.equals("show")) {
                return null;
            }
            try {
                getAbilityImpl().show(context, new fz(params), new a(callback));
                return null;
            } catch (Throwable th) {
                return a$a.Companion.b(th.getMessage());
            }
        } else if (hashCode != 1671672458 || !api.equals("dismiss")) {
            return null;
        } else {
            getAbilityImpl().dismiss(context, new ify(callback));
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements gd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8653a;

        public a(aln alnVar) {
            this.f8653a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.gd
        public void a(ErrorViewWidgetRequestError result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4acc2409", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8653a.a(new FinishResult((JSONObject) json, "onRefreshButtonPressed"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gd.a.a(this, result);
            this.f8653a.a(result);
        }
    }
}
