package com.alibaba.ability.middleware;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.alo;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class g implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final d f1979a;
    private final c b;

    static {
        kge.a(1850833560);
        kge.a(1886473602);
        Companion = new a(null);
    }

    public g(d middleware, c next) {
        q.d(middleware, "middleware");
        q.d(next, "next");
        this.f1979a = middleware;
        this.b = next;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1603995616);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final c a(List<? extends d> middlewares, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("aa3337d", new Object[]{this, middlewares, cVar});
            }
            q.d(middlewares, "middlewares");
            q.d(cVar, "final");
            try {
                com.alibaba.ability.utils.b.INSTANCE.a("MiddlewareChain#makeChain");
                for (d dVar : p.e((Iterable) middlewares)) {
                    cVar = new g(dVar, cVar);
                }
                return cVar;
            } finally {
                com.alibaba.ability.utils.b.INSTANCE.a();
            }
        }
    }

    @Override // com.alibaba.ability.middleware.c
    public ExecuteResult a(String ability, String api, als context, Map<String, ? extends Object> params, alo callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("94fa9e92", new Object[]{this, ability, api, context, params, callback});
        }
        q.d(ability, "ability");
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        try {
            com.alibaba.ability.utils.b.INSTANCE.a("MiddlewareChain#invoke", ability, api, this.f1979a);
            return this.f1979a.invoke(ability, api, context, params, callback, this.b);
        } finally {
            com.alibaba.ability.utils.b.INSTANCE.a();
        }
    }
}
