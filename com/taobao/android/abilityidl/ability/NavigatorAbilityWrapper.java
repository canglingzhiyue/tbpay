package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cd;
import com.taobao.android.abilityidl.ability.ce;
import com.taobao.android.abilityidl.ability.cf;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class NavigatorAbilityWrapper extends AbsAbilityWrapper<AbsNavigatorAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-97835386);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorAbilityWrapper(AbsNavigatorAbility impl) {
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
            case -1947220185:
                if (!api.equals("removeSystemBackBlockListener")) {
                    return null;
                }
                getAbilityImpl().removeSystemBackBlockListener(context, new ify(callback));
                return null;
            case -1263204667:
                if (!api.equals("openURL")) {
                    return null;
                }
                try {
                    getAbilityImpl().openURL(context, new Cdo(params), new a(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -1062762103:
                if (!api.equals("setSystemBackBlockListener")) {
                    return null;
                }
                getAbilityImpl().setSystemBackBlockListener(context, new e(callback));
                return null;
            case 94756344:
                if (!api.equals("close")) {
                    return null;
                }
                try {
                    getAbilityImpl().close(context, new dn(params), new c(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case 1094496948:
                if (!api.equals("replace")) {
                    return null;
                }
                try {
                    getAbilityImpl().replace(context, new Cdo(params), new d(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            case 1306582266:
                if (!api.equals("openExternalURL")) {
                    return null;
                }
                try {
                    getAbilityImpl().openExternalURL(context, new Cdo(params), new b(callback));
                    return null;
                } catch (Throwable th4) {
                    return a$a.Companion.b(th4.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements cd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8705a;

        public a(aln alnVar) {
            this.f8705a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cd
        public void a(NavigatorActionResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca28d729", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8705a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cd.a.a(this, result);
            this.f8705a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8706a;

        public b(aln alnVar) {
            this.f8706a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ce
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8706a.a(new FinishResult(null, "onSuccess"));
            }
        }

        @Override // com.taobao.android.abilityidl.ability.ce
        public void a(NavigatorFailureResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df19ea6d", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8706a.a(new FinishResult((JSONObject) json, "onFailure"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            ce.a.a(this, result);
            this.f8706a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements cd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8707a;

        public c(aln alnVar) {
            this.f8707a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cd
        public void a(NavigatorActionResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca28d729", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8707a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cd.a.a(this, result);
            this.f8707a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements cd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8708a;

        public d(aln alnVar) {
            this.f8708a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cd
        public void a(NavigatorActionResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca28d729", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8708a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cd.a.a(this, result);
            this.f8708a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements cf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8709a;

        public e(aln alnVar) {
            this.f8709a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cf
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8709a.a(new FinishResult(null, "onSuccess"));
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
            cf.a.a(this, result);
            this.f8709a.a(result);
        }
    }
}
