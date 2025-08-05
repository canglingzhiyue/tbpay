package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.fh;
import com.taobao.android.abilityidl.ability.fi;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class UTAbilityWrapper extends AbsAbilityWrapper<AbsUTAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(753264354);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTAbilityWrapper(AbsUTAbility impl) {
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
            case -1887716704:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_SESSION_PROPERTY)) {
                    try {
                        getAbilityImpl().updateSessionProperties(context, new ft(params), new e(callback));
                        break;
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case -1773402202:
                if (api.equals("updateNextPageUtparamCnt")) {
                    try {
                        getAbilityImpl().updateNextPageUtparamCnt(context, new fm(params), new f(callback));
                        break;
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case -1025553932:
                if (api.equals("pageDisAppear")) {
                    try {
                        getAbilityImpl().pageDisAppear(context, new fu(params), new i(callback));
                        break;
                    } catch (Throwable th3) {
                        return a$a.Companion.b(th3.getMessage());
                    }
                }
                break;
            case -439577013:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGE_PROPERTIES)) {
                    try {
                        getAbilityImpl().updatePageProperties(context, new fp(params), new c(callback));
                        break;
                    } catch (Throwable th4) {
                        return a$a.Companion.b(th4.getMessage());
                    }
                }
                break;
            case 2958602:
                if (api.equals("updatePageStatus")) {
                    try {
                        getAbilityImpl().updatePageStatus(context, new fq(params), new n(callback));
                        break;
                    } catch (Throwable th5) {
                        return a$a.Companion.b(th5.getMessage());
                    }
                }
                break;
            case 199951203:
                if (api.equals("pageAppearDonotSkip")) {
                    try {
                        getAbilityImpl().pageAppearDonotSkip(context, new fk(params), new k(callback));
                        break;
                    } catch (Throwable th6) {
                        return a$a.Companion.b(th6.getMessage());
                    }
                }
                break;
            case 768062724:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.PAGE_APPEAR)) {
                    try {
                        getAbilityImpl().pageAppear(context, new fk(params), new h(callback));
                        break;
                    } catch (Throwable th7) {
                        return a$a.Companion.b(th7.getMessage());
                    }
                }
                break;
            case 985529912:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.GET_PAGE_SPM_PRE)) {
                    try {
                        com.alibaba.ability.result.g<UTPageSpmPreResult, ErrorResult> pageSpmPre = getAbilityImpl().getPageSpmPre(context, new fu(params));
                        ErrorResult b2 = pageSpmPre.b();
                        if (b2 != null) {
                            return b2;
                        }
                        Object json = JSONObject.toJSON(pageSpmPre.a());
                        if (!(json instanceof JSONObject)) {
                            json = null;
                        }
                        return new FinishResult((JSONObject) json, null, 2, null);
                    } catch (Throwable th8) {
                        return a$a.Companion.b(th8.getMessage());
                    }
                }
                break;
            case 985534724:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.GET_PAGE_SPM_URL)) {
                    try {
                        com.alibaba.ability.result.g<UTPageSpmUrlResult, ErrorResult> pageSpmUrl = getAbilityImpl().getPageSpmUrl(context, new fu(params));
                        ErrorResult b3 = pageSpmUrl.b();
                        if (b3 != null) {
                            return b3;
                        }
                        Object json2 = JSONObject.toJSON(pageSpmUrl.a());
                        if (!(json2 instanceof JSONObject)) {
                            json2 = null;
                        }
                        return new FinishResult((JSONObject) json2, null, 2, null);
                    } catch (Throwable th9) {
                        return a$a.Companion.b(th9.getMessage());
                    }
                }
                break;
            case 1152682910:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_NEXT_PAGE_PROPERTIES)) {
                    try {
                        getAbilityImpl().updateNextPageProperties(context, new fl(params), new d(callback));
                        break;
                    } catch (Throwable th10) {
                        return a$a.Companion.b(th10.getMessage());
                    }
                }
                break;
            case 1227135126:
                if (api.equals("requestPageAllProperties")) {
                    try {
                        getAbilityImpl().requestPageAllProperties(context, new fu(params), new g(callback));
                        break;
                    } catch (Throwable th11) {
                        return a$a.Companion.b(th11.getMessage());
                    }
                }
                break;
            case 1421600451:
                if (api.equals("updateNextPageUtparam")) {
                    try {
                        getAbilityImpl().updateNextPageUtparam(context, new fn(params), new b(callback));
                        break;
                    } catch (Throwable th12) {
                        return a$a.Companion.b(th12.getMessage());
                    }
                }
                break;
            case 1487963043:
                if (api.equals("commitEvent")) {
                    try {
                        getAbilityImpl().commitEvent(context, new fj(params), new a(callback));
                        break;
                    } catch (Throwable th13) {
                        return a$a.Companion.b(th13.getMessage());
                    }
                }
                break;
            case 1729443235:
                if (api.equals("updatePageName")) {
                    try {
                        getAbilityImpl().updatePageName(context, new fo(params), new l(callback));
                        break;
                    } catch (Throwable th14) {
                        return a$a.Companion.b(th14.getMessage());
                    }
                }
                break;
            case 1880007478:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGE_UTPARAM)) {
                    try {
                        getAbilityImpl().updatePageUtparam(context, new fs(params), new o(callback));
                        break;
                    } catch (Throwable th15) {
                        return a$a.Companion.b(th15.getMessage());
                    }
                }
                break;
            case 1995458391:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGEURL)) {
                    try {
                        getAbilityImpl().updatePageUrl(context, new fr(params), new m(callback));
                        break;
                    } catch (Throwable th16) {
                        return a$a.Companion.b(th16.getMessage());
                    }
                }
                break;
            case 2145313966:
                if (api.equals(com.alibaba.triver.triver_shop.newShop.ext.m.SKIP_PAGE)) {
                    try {
                        getAbilityImpl().skipPage(context, new fu(params), new j(callback));
                        break;
                    } catch (Throwable th17) {
                        return a$a.Companion.b(th17.getMessage());
                    }
                }
                break;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8750a;

        public a(aln alnVar) {
            this.f8750a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8750a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8750a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8757a;

        public h(aln alnVar) {
            this.f8757a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8757a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8757a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8758a;

        public i(aln alnVar) {
            this.f8758a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8758a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8758a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8759a;

        public j(aln alnVar) {
            this.f8759a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8759a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8759a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8760a;

        public k(aln alnVar) {
            this.f8760a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8760a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8760a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8761a;

        public l(aln alnVar) {
            this.f8761a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8761a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8761a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8762a;

        public m(aln alnVar) {
            this.f8762a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8762a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8762a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8763a;

        public n(aln alnVar) {
            this.f8763a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8763a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8763a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8764a;

        public o(aln alnVar) {
            this.f8764a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8764a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8764a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8751a;

        public b(aln alnVar) {
            this.f8751a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8751a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8751a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8752a;

        public c(aln alnVar) {
            this.f8752a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8752a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8752a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8753a;

        public d(aln alnVar) {
            this.f8753a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8753a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8753a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8754a;

        public e(aln alnVar) {
            this.f8754a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8754a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8754a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements fh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8755a;

        public f(aln alnVar) {
            this.f8755a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fh
        public void a(UTResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25a5961", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8755a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fh.a.a(this, result);
            this.f8755a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements fi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8756a;

        public g(aln alnVar) {
            this.f8756a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.fi
        public void a(UTResultWithData result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78fbecb1", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8756a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            fi.a.a(this, result);
            this.f8756a.a(result);
        }
    }
}
