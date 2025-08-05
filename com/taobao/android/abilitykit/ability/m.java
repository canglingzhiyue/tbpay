package com.taobao.android.abilitykit.ability;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.dkt;
import tb.dle;
import tb.kge;

/* loaded from: classes4.dex */
public final class m implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String UNSUBSCRIBE = "unsubscribeMsg";

    static {
        kge.a(587299904);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-1827465336);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        dkt e;
        g b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        if (!kotlin.jvm.internal.q.a((Object) api, (Object) UNSUBSCRIBE)) {
            return new ErrorResult("501", (String) null, (Map) null, 6, (kotlin.jvm.internal.o) null);
        }
        String a2 = com.alibaba.ability.e.a(params, "action", (String) null);
        if (a2 == null) {
            return new ErrorResult("400", "no action", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        Object d = context.d();
        if (!(d instanceof dle)) {
            d = null;
        }
        dle dleVar = (dle) d;
        if (dleVar == null || (e = dleVar.e()) == null || (b = e.b()) == null) {
            return new ErrorResult("400", "can not find ak engine", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        b.a(a2);
        return new FinishResult(null, null, 3, null);
    }
}
