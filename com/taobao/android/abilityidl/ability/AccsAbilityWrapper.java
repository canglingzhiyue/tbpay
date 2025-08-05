package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bc;
import com.taobao.android.abilityidl.ability.bd;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class AccsAbilityWrapper extends AbsAbilityWrapper<AbsAccsAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-477430603);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccsAbilityWrapper(AbsAccsAbility impl) {
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
            case -775651618:
                if (api.equals("connection")) {
                    try {
                        com.alibaba.ability.result.g<AccsConnectionResult, ErrorResult> connection = getAbilityImpl().connection(context, new e(params));
                        ErrorResult b2 = connection.b();
                        if (b2 != null) {
                            return b2;
                        }
                        Object json = JSONObject.toJSON(connection.a());
                        if (!(json instanceof JSONObject)) {
                            json = null;
                        }
                        return new FinishResult((JSONObject) json, null, 2, null);
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case -168753834:
                if (api.equals("removeConnectionListener")) {
                    try {
                        ErrorResult b3 = getAbilityImpl().removeConnectionListener(context, new f(params)).b();
                        if (b3 != null) {
                            return b3;
                        }
                        return new FinishResult(null, null, 3, null);
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case 3526536:
                if (api.equals("send")) {
                    try {
                        ErrorResult b4 = getAbilityImpl().send(context, new g(params)).b();
                        if (b4 != null) {
                            return b4;
                        }
                        return new FinishResult(null, null, 3, null);
                    } catch (Throwable th3) {
                        return a$a.Companion.b(th3.getMessage());
                    }
                }
                break;
            case 136715103:
                if (api.equals("unBindService")) {
                    try {
                        ErrorResult b5 = getAbilityImpl().unBindService(context, new h(params)).b();
                        if (b5 != null) {
                            return b5;
                        }
                        return new FinishResult(null, null, 3, null);
                    } catch (Throwable th4) {
                        return a$a.Companion.b(th4.getMessage());
                    }
                }
                break;
            case 1418030008:
                if (api.equals("bindService")) {
                    try {
                        getAbilityImpl().bindService(context, new h(params), new b(callback));
                        break;
                    } catch (Throwable th5) {
                        return a$a.Companion.b(th5.getMessage());
                    }
                }
                break;
            case 1767151667:
                if (api.equals("addConnectionListener")) {
                    try {
                        getAbilityImpl().addConnectionListener(context, new e(params), new a(callback));
                        break;
                    } catch (Throwable th6) {
                        return a$a.Companion.b(th6.getMessage());
                    }
                }
                break;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements bd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8625a;

        public a(aln alnVar) {
            this.f8625a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bd
        public void a(AccsConnectCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9527413", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8625a.a(new FinishResult((JSONObject) json, "onConnected"));
        }

        @Override // com.taobao.android.abilityidl.ability.bd
        public void b(AccsConnectCommonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65c07072", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8625a.a(new FinishResult((JSONObject) json, "onDisconnected"));
        }

        @Override // com.taobao.android.abilityidl.ability.bd
        public void a(AccsConnectFailResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d06d6100", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8625a.a(new FinishResult((JSONObject) json, "onConnectFail"));
        }

        @Override // com.taobao.android.abilityidl.ability.bd
        public void a(AccsListenerKeyResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7cbda7d", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8625a.a(new FinishResult((JSONObject) json, "onListenerKey"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bd.a.a(this, result);
            this.f8625a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements bc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8626a;

        public b(aln alnVar) {
            this.f8626a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bc
        public void a(AccsReceivedResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ecf040d", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8626a.a(new FinishResult((JSONObject) json, "onReceiveData"));
        }

        @Override // com.taobao.android.abilityidl.ability.bc
        public void a(AccsBindResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d143dab1", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8626a.a(new FinishResult((JSONObject) json, "onBind"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bc.a.a(this, result);
            this.f8626a.a(result);
        }
    }
}
