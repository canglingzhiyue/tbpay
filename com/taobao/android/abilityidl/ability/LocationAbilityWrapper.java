package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ca;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class LocationAbilityWrapper extends AbsAbilityWrapper<AbsLocationAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-476652008);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationAbilityWrapper(AbsLocationAbility impl) {
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
        if (hashCode == 1095692943) {
            if (api.equals("request")) {
                try {
                    getAbilityImpl().request(context, new db(params), new a(callback));
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            }
        } else if (hashCode == 1950242252 && api.equals(WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE)) {
            com.alibaba.ability.result.g<LocationData, ErrorResult> cache = getAbilityImpl().getCache(context);
            ErrorResult b = cache.b();
            if (b != null) {
                return b;
            }
            Object json = JSONObject.toJSON(cache.a());
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            return new FinishResult((JSONObject) json, null, 2, null);
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements ca {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8696a;

        public a(aln alnVar) {
            this.f8696a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ca
        public void a(LocationData result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eebfa7e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8696a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ca.a.a(this, result);
            this.f8696a.a(result);
        }
    }
}
