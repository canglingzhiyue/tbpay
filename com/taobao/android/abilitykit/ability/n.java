package com.taobao.android.abilitykit.ability;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.t;
import tb.aln;
import tb.alr;
import tb.als;
import tb.alt;
import tb.dkt;
import tb.dmp;
import tb.kge;

/* loaded from: classes4.dex */
public final class n implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET = "get";
    public static final String API_REMOVE = "remove";
    public static final String API_SET = "set";
    public static final a Companion;

    static {
        kge.a(823701638);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(1531063374);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        dkt dktVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        alt f = context.f();
        if (!(f instanceof alr)) {
            f = null;
        }
        alr alrVar = (alr) f;
        if (alrVar == null || (dktVar = (dkt) alrVar.g()) == null) {
            return new ErrorResult("400", "NoAkEngine", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        String a2 = com.alibaba.ability.e.a(params, "key", (String) null);
        if (a2 == null) {
            return new ErrorResult("400", "NoKey", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        int hashCode = api.hashCode();
        if (hashCode != -934610812) {
            if (hashCode == 102230) {
                if (api.equals("get")) {
                    JSONObject jSONObject = new JSONObject(1);
                    jSONObject.put("result", dktVar.c().get(a2));
                    t tVar = t.INSTANCE;
                    return new FinishResult(jSONObject, null, 2, null);
                }
            } else if (hashCode == 113762 && api.equals("set")) {
                Object obj = params.get("value");
                if (!dmp.a(a2, dktVar.c(), obj)) {
                    return new ErrorResult("KeyPathSetFail", "Please check input: key=" + a2 + ", value=" + obj, (Map) null, 4, (kotlin.jvm.internal.o) null);
                }
                return new FinishResult(null, null, 3, null);
            }
        } else if (api.equals("remove")) {
            dktVar.c().remove(a2);
            return new FinishResult(null, null, 3, null);
        }
        return new ErrorResult("501", (String) null, (Map) null, 6, (kotlin.jvm.internal.o) null);
    }
}
