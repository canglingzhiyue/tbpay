package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cg;
import com.taobao.android.abilityidl.ability.ch;
import com.taobao.android.abilityidl.ability.ci;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class PermissionAbilityWrapper extends AbsAbilityWrapper<AbsPermissionAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1000044594);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionAbilityWrapper(AbsPermissionAbility impl) {
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
        if (hashCode == 94627080) {
            if (!api.equals("check")) {
                return null;
            }
            try {
                getAbilityImpl().check(context, new dq(params), new b(callback));
                return null;
            } catch (Throwable th) {
                return a$a.Companion.b(th.getMessage());
            }
        } else if (hashCode == 746581438) {
            if (!api.equals(TBRunTimePermission.REQUEST_PERMISSION_API_NAME)) {
                return null;
            }
            try {
                getAbilityImpl().requestPermission(context, new ds(params), new a(callback));
                return null;
            } catch (Throwable th2) {
                return a$a.Companion.b(th2.getMessage());
            }
        } else if (hashCode != 1095692943 || !api.equals("request")) {
            return null;
        } else {
            try {
                getAbilityImpl().request(context, new dr(params), new c(callback));
                return null;
            } catch (Throwable th3) {
                return a$a.Companion.b(th3.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements ci {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8718a;

        public a(aln alnVar) {
            this.f8718a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ci
        public void a(PermissionRequestPermissionEvent result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1cb4752", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8718a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ci.a.a(this, result);
            this.f8718a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements cg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8719a;

        public b(aln alnVar) {
            this.f8719a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cg
        public void a(PermissionResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38eb7711", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8719a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cg.a.a(this, result);
            this.f8719a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ch {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8720a;

        public c(aln alnVar) {
            this.f8720a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ch
        public void a(PermissionResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38eb7711", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8720a.a(new FinishResult((JSONObject) json, "onSuccess"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ch.a.a(this, result);
            this.f8720a.a(result);
        }
    }
}
