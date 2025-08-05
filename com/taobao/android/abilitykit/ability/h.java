package com.taobao.android.abilitykit.ability;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.t;
import tb.aln;
import tb.alr;
import tb.als;
import tb.alt;
import tb.dkt;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dky;
import tb.dla;
import tb.dle;
import tb.dll;
import tb.dlr;
import tb.dmm;
import tb.fhu;
import tb.kge;

/* loaded from: classes4.dex */
public final class h implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private dkt f8909a;

    static {
        kge.a(1707431604);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.taobao.android.abilitykit.ability.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0341a implements dll {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ aln f8910a;

            public C0341a(aln alnVar) {
                this.f8910a = alnVar;
            }

            @Override // tb.dll
            public final void callback(String str, dkx<Object> dkxVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
                    return;
                }
                ExecuteResult a2 = h.Companion.a(dkxVar, str);
                if (a2 instanceof ErrorResult) {
                    this.f8910a.a((ErrorResult) a2);
                } else if (!(a2 instanceof FinishResult)) {
                } else {
                    this.f8910a.a((FinishResult) a2);
                }
            }
        }

        static {
            kge.a(-1242599172);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final dle a(als megaCtx) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dle) ipChange.ipc$dispatch("7c5b2319", new Object[]{this, megaCtx});
            }
            kotlin.jvm.internal.q.d(megaCtx, "megaCtx");
            Object d = megaCtx.d();
            if (!(d instanceof dle)) {
                d = null;
            }
            dle dleVar = (dle) d;
            if (dleVar != null) {
                return dleVar;
            }
            dlr dlrVar = new dlr();
            dlrVar.a(megaCtx.f().f());
            dlrVar.a(megaCtx.g());
            fhu fhuVar = new fhu();
            fhuVar.a(megaCtx.d());
            t tVar = t.INSTANCE;
            dlrVar.a(fhuVar);
            return dlrVar;
        }

        public static /* synthetic */ ExecuteResult a(a aVar, dkx dkxVar, String str, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecuteResult) ipChange.ipc$dispatch("ecbacf72", new Object[]{aVar, dkxVar, str, new Integer(i), obj});
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return aVar.a(dkxVar, str);
        }

        @JvmStatic
        public final ExecuteResult a(dkx<?> akRet, String str) {
            FinishResult finishResult;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecuteResult) ipChange.ipc$dispatch("911f8bae", new Object[]{this, akRet, str});
            }
            if (akRet instanceof dkw) {
                kotlin.jvm.internal.q.b(akRet, "akRet");
                dkw dkwVar = (dkw) akRet;
                dkv c = dkwVar.c();
                kotlin.jvm.internal.q.b(c, "akRet.result");
                String valueOf = String.valueOf(c.a());
                dkv c2 = dkwVar.c();
                kotlin.jvm.internal.q.b(c2, "akRet.result");
                String b = c2.b();
                kotlin.jvm.internal.q.b(b, "akRet.result.errorMsg");
                return new ErrorResult(valueOf, b, (Map) null, 4, (kotlin.jvm.internal.o) null);
            } else if (akRet instanceof dky) {
                kotlin.jvm.internal.q.b(akRet, "akRet");
                return new ExecutingResult(((dky) akRet).c(), null, 2, null);
            } else if (akRet instanceof dla) {
                if (str == null) {
                    kotlin.jvm.internal.q.b(akRet, "akRet");
                    finishResult = new FinishResult(((dla) akRet).c(), null, 2, null);
                } else {
                    kotlin.jvm.internal.q.b(akRet, "akRet");
                    finishResult = new FinishResult(((dla) akRet).c(), str);
                }
                return finishResult;
            } else {
                return new ExecutingResult(null, null, 3, null);
            }
        }

        @JvmStatic
        public final dll a(aln callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dll) ipChange.ipc$dispatch("93e3a62d", new Object[]{this, callback});
            }
            kotlin.jvm.internal.q.d(callback, "callback");
            return new C0341a(callback);
        }
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
        if (this.f8909a == null) {
            alt f = context.f();
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.env.AbilityEnv");
            }
            this.f8909a = new dkt((alr) f, null);
        }
        a aVar = Companion;
        JSONObject jSONObject = new JSONObject(params);
        dle a2 = Companion.a(context);
        if (a2.e() == null) {
            a2.a(this.f8909a);
        }
        t tVar = t.INSTANCE;
        return a.a(aVar, dmm.a(api, jSONObject, a2, Companion.a(callback), false, 16, null), null, 2, null);
    }
}
