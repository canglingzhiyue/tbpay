package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bv;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class GeneralSettingAbilityWrapper extends AbsAbilityWrapper<AbsGeneralSettingAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1199629803);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSettingAbilityWrapper(AbsGeneralSettingAbility impl) {
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
        if (hashCode != -171589242) {
            if (hashCode == 102230) {
                if (api.equals("get")) {
                    try {
                        com.alibaba.ability.result.g<String, ErrorResult> gVar = getAbilityImpl().get(context, new aw(params));
                        ErrorResult b = gVar.b();
                        if (b != null) {
                            return b;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", gVar.a()))), null, 2, null);
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
            } else if (hashCode == 1800640525 && api.equals("unsetChangeListener")) {
                try {
                    ErrorResult b2 = getAbilityImpl().unsetChangeListener(context, new aw(params)).b();
                    if (b2 != null) {
                        return b2;
                    }
                    return new FinishResult(null, null, 3, null);
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            }
        } else if (api.equals("setChangeListener")) {
            try {
                getAbilityImpl().setChangeListener(context, new aw(params), new a(callback));
            } catch (Throwable th3) {
                return a$a.Companion.b(th3.getMessage());
            }
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements bv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8683a;

        public a(aln alnVar) {
            this.f8683a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bv
        public void a(GeneralSettingOnChangeData result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7381d85c", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8683a.a(new FinishResult((JSONObject) json, "onChange"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bv.a.a(this, result);
            this.f8683a.a(result);
        }
    }
}
