package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ct;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class WidgetServiceAbilityWrapper extends AbsAbilityWrapper<AbsWidgetServiceAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1725823872);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetServiceAbilityWrapper(AbsWidgetServiceAbility impl) {
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
            case 104792645:
                if (api.equals("addWidget")) {
                    try {
                        com.alibaba.ability.result.g<Boolean, ErrorResult> addWidget = getAbilityImpl().addWidget(context, new en(params));
                        ErrorResult b2 = addWidget.b();
                        if (b2 != null) {
                            return b2;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", addWidget.a()))), null, 2, null);
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case 1158616740:
                if (api.equals("isSupported")) {
                    try {
                        com.alibaba.ability.result.g<Boolean, ErrorResult> isSupported = getAbilityImpl().isSupported(context, new eq(params));
                        ErrorResult b3 = isSupported.b();
                        if (b3 != null) {
                            return b3;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", isSupported.a()))), null, 2, null);
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case 1207466352:
                if (api.equals("isInstalled")) {
                    try {
                        getAbilityImpl().isInstalled(context, new ep(params), new a(callback));
                        break;
                    } catch (Throwable th3) {
                        return a$a.Companion.b(th3.getMessage());
                    }
                }
                break;
            case 2043643118:
                if (api.equals("editWidget")) {
                    try {
                        getAbilityImpl().editWidget(context, new eo(params), new b(callback));
                        break;
                    } catch (Throwable th4) {
                        return a$a.Companion.b(th4.getMessage());
                    }
                }
                break;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements ct {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8768a;

        public a(aln alnVar) {
            this.f8768a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ct
        public void a(WidgetServiceEditSuccessResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68d5be38", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8768a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ct.a.a(this, result);
            this.f8768a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ct {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8769a;

        public b(aln alnVar) {
            this.f8769a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ct
        public void a(WidgetServiceEditSuccessResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68d5be38", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8769a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ct.a.a(this, result);
            this.f8769a.a(result);
        }
    }
}
