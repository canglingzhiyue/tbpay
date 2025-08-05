package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bo;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class FavoriteAbilityWrapper extends AbsAbilityWrapper<AbsFavoriteAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(845817791);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteAbilityWrapper(AbsFavoriteAbility impl) {
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
            case -1256843383:
                if (!api.equals("markFavorite")) {
                    return null;
                }
                try {
                    getAbilityImpl().markFavorite(context, new am(params), new d(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -671319779:
                if (!api.equals("requestFavoriteStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestFavoriteStatus(context, new am(params), new a(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case -543661504:
                if (!api.equals("removeFavorite")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeFavorite(context, new am(params), new c(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            case 76510557:
                if (!api.equals("addFavorite")) {
                    return null;
                }
                try {
                    getAbilityImpl().addFavorite(context, new am(params), new b(callback));
                    return null;
                } catch (Throwable th4) {
                    return a$a.Companion.b(th4.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements bo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8660a;

        public a(aln alnVar) {
            this.f8660a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bo
        public void a(FavoriteResultData result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cf30d1a", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8660a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bo.a.a(this, result);
            this.f8660a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements bo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8661a;

        public b(aln alnVar) {
            this.f8661a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bo
        public void a(FavoriteResultData result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cf30d1a", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8661a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bo.a.a(this, result);
            this.f8661a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements bo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8662a;

        public c(aln alnVar) {
            this.f8662a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bo
        public void a(FavoriteResultData result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cf30d1a", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8662a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bo.a.a(this, result);
            this.f8662a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements bo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8663a;

        public d(aln alnVar) {
            this.f8663a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bo
        public void a(FavoriteResultData result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cf30d1a", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8663a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bo.a.a(this, result);
            this.f8663a.a(result);
        }
    }
}
