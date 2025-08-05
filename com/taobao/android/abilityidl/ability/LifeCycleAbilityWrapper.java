package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.by;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class LifeCycleAbilityWrapper extends AbsAbilityWrapper<AbsLifeCycleAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(594857529);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeCycleAbilityWrapper(AbsLifeCycleAbility impl) {
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
        if (hashCode == -329066194) {
            if (!api.equals("addPageLifeCycleListener")) {
                return null;
            }
            getAbilityImpl().addPageLifeCycleListener(context, new a(callback));
            return null;
        } else if (hashCode != -68995797 || !api.equals("removePageLifeCycleListener")) {
            return null;
        } else {
            getAbilityImpl().removePageLifeCycleListener(context, new ify(callback));
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements by {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8691a;

        public a(aln alnVar) {
            this.f8691a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.by
        public void a(LifeCyclePageLifeCycleEventParams result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b640c4", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8691a.a(new FinishResult((JSONObject) json, "onPageAppear"));
        }

        @Override // com.taobao.android.abilityidl.ability.by
        public void b(LifeCyclePageLifeCycleEventParams result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21b79263", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8691a.a(new FinishResult((JSONObject) json, "onPageDisappear"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            by.a.a(this, result);
            this.f8691a.a(result);
        }
    }
}
