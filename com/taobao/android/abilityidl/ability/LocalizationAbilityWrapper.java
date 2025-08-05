package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bz;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.cjn;
import tb.kge;

/* loaded from: classes4.dex */
public final class LocalizationAbilityWrapper extends AbsAbilityWrapper<AbsLocalizationAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1284695812);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizationAbilityWrapper(AbsLocalizationAbility impl) {
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
            case -2076528074:
                if (api.equals("isI18nEdition")) {
                    com.alibaba.ability.result.g<Boolean, ErrorResult> isI18nEdition = getAbilityImpl().isI18nEdition(context);
                    ErrorResult b = isI18nEdition.b();
                    if (b != null) {
                        return b;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", isI18nEdition.a()))), null, 2, null);
                }
                break;
            case -682482660:
                if (api.equals("isCnSite")) {
                    com.alibaba.ability.result.g<Boolean, ErrorResult> isCnSite = getAbilityImpl().isCnSite(context);
                    ErrorResult b2 = isCnSite.b();
                    if (b2 != null) {
                        return b2;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", isCnSite.a()))), null, 2, null);
                }
                break;
            case -316023509:
                if (api.equals("getLocation")) {
                    com.alibaba.ability.result.g<String, ErrorResult> location = getAbilityImpl().getLocation(context);
                    ErrorResult b3 = location.b();
                    if (b3 != null) {
                        return b3;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", location.a()))), null, 2, null);
                }
                break;
            case 383935836:
                if (api.equals("setLocale")) {
                    try {
                        getAbilityImpl().setLocale(context, new da(params), new a(callback));
                        break;
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case 464310478:
                if (api.equals(cjn.HUMMER_FOUNDATION_GET_LANGUAGE)) {
                    com.alibaba.ability.result.g<String, ErrorResult> language = getAbilityImpl().getLanguage(context);
                    ErrorResult b4 = language.b();
                    if (b4 != null) {
                        return b4;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", language.a()))), null, 2, null);
                }
                break;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements bz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8693a;

        public a(aln alnVar) {
            this.f8693a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bz
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8693a.a(new FinishResult(null, "onSuccess"));
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
            bz.a.a(this, result);
            this.f8693a.a(result);
        }
    }
}
