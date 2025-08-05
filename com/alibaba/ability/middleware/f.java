package com.alibaba.ability.middleware;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.alo;
import tb.als;
import tb.alt;
import tb.bfy;
import tb.kge;

/* loaded from: classes2.dex */
public final class f implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final bfy f1976a;
    private static final kotlin.d b;

    public static final /* synthetic */ bfy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("f02bf09", new Object[0]) : f1976a;
    }

    public static final /* synthetic */ kotlin.d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("9e77df26", new Object[0]) : b;
    }

    @Override // com.alibaba.ability.middleware.d
    public ExecuteResult invoke(String ability, String api, als context, Map<String, ? extends Object> params, alo callback, com.alibaba.ability.middleware.c next) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a1d6a6a6", new Object[]{this, ability, api, context, params, callback, next});
        }
        q.d(ability, "ability");
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        q.d(next, "next");
        long currentTimeMillis = System.currentTimeMillis();
        ExecuteResult a2 = next.a(ability, api, context, params, new b(callback, new c(ability, api, context, params, currentTimeMillis, -1L)));
        long currentTimeMillis2 = System.currentTimeMillis();
        bfy bfyVar = f1976a;
        c cVar = new c(ability, api, context, params, currentTimeMillis, currentTimeMillis2);
        cVar.a(a2);
        t tVar = t.INSTANCE;
        bfy.a(bfyVar, cVar, 0L, null, 6, null);
        return a2;
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f1978a;
        private ExecuteResult b;
        private final String c;
        private final String d;
        private final als e;
        private final Map<String, Object> f;
        private long g;
        private long h;

        static {
            kge.a(-1583666464);
            kge.a(-1390502639);
        }

        public c(String ability, String api, als context, Map<String, ? extends Object> params, long j, long j2) {
            q.d(ability, "ability");
            q.d(api, "api");
            q.d(context, "context");
            q.d(params, "params");
            this.c = ability;
            this.d = api;
            this.e = context;
            this.f = params;
            this.g = j;
            this.h = j2;
        }

        public final void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.h = j;
            }
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f1978a = z;
            }
        }

        public final void a(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34013fd1", new Object[]{this, executeResult});
            } else {
                this.b = executeResult;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            Object obj2;
            String str;
            Object obj3;
            String str2;
            Object obj4;
            char c;
            Object obj5;
            com.alibaba.ability.inject.b c2;
            com.alibaba.ability.inject.b c3;
            Object obj6;
            com.alibaba.ability.inject.c a2;
            Map<String, Object> a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ExecuteResult executeResult = this.b;
            String str3 = (String) this.e.c("pageId");
            String str4 = str3 == null ? "" : str3;
            Map<String, Object> e = this.e.e();
            String str5 = "unknown";
            if (e == null || (obj = e.get("url")) == null) {
                obj = str5;
            }
            alt f = this.e.f();
            String e2 = TextUtils.isEmpty(f.e()) ? str5 : f.e();
            if (!TextUtils.isEmpty(f.d())) {
                str5 = f.d();
            }
            String str6 = str5;
            String str7 = this.c + '.' + this.d;
            com.alibaba.ability.inject.c a4 = com.alibaba.ability.f.INSTANCE.a();
            if (a4 == null || !a4.a()) {
                obj2 = "businessId";
                str = str4;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("url", obj);
                linkedHashMap.put("pageId", str4);
                String str8 = (String) this.e.c("callType");
                if (str8 == null) {
                    str8 = "";
                }
                linkedHashMap.put("callType", str8);
                linkedHashMap.put("namespace", e2);
                linkedHashMap.put("businessId", str6);
                if (executeResult == null || (a3 = executeResult.c()) == null) {
                    a3 = ai.a();
                }
                obj2 = "businessId";
                str = str4;
                JSONObject jSONObject = new JSONObject(ai.b(j.a("api", str7), j.a("startTime", Long.valueOf(this.g)), j.a("endTime", Long.valueOf(this.h)), j.a("params", this.f), j.a("result", a3), j.a("extraInfo", linkedHashMap)));
                com.alibaba.ability.inject.a b = com.alibaba.ability.f.INSTANCE.b();
                if (b != null) {
                    b.a(5, "AppDevTools/Megability", this.c + '.' + this.d, String.valueOf(this.g), null, jSONObject);
                }
            }
            if (executeResult != null) {
                Object obj7 = obj2;
                JSONObject jSONObject2 = new JSONObject(ai.b(j.a("statusCode", Integer.valueOf(executeResult.d())), j.a("namespace", e2), j.a(obj7, str6), j.a("uuid", String.valueOf(this.g)), j.a("type", executeResult.f())));
                if (executeResult instanceof ErrorResult) {
                    JSONObject jSONObject3 = jSONObject2;
                    ErrorResult errorResult = (ErrorResult) executeResult;
                    jSONObject3.put((JSONObject) "errorCode", errorResult.a());
                    jSONObject3.put((JSONObject) "errorMessage", errorResult.b());
                    jSONObject3.put((JSONObject) "params", (String) this.f);
                }
                if (!this.f1978a && (a2 = com.alibaba.ability.f.INSTANCE.a()) != null && a2.d()) {
                    jSONObject2.put((JSONObject) "params", (String) this.f);
                }
                int i = executeResult.d() <= 99 ? 3 : 1;
                JSONObject jSONObject4 = new JSONObject(ai.b(j.a("event", str7), j.a("level", Integer.valueOf(i)), j.a("ext", jSONObject2)));
                com.alibaba.ability.inject.a b2 = com.alibaba.ability.f.INSTANCE.b();
                if (b2 != null) {
                    obj4 = obj7;
                    obj3 = "namespace";
                    String str9 = str;
                    str2 = str6;
                    b2.a(i, "Megability/Trace", "", null, str9, jSONObject4);
                } else {
                    obj4 = obj7;
                    obj3 = "namespace";
                    str2 = str6;
                }
            } else {
                obj3 = "namespace";
                str2 = str6;
                obj4 = obj2;
            }
            if (executeResult == null) {
                return;
            }
            Map<String, Object> e3 = this.e.e();
            if (e3 == null || (obj6 = e3.get("syncCallForceMain")) == null) {
                c = 0;
                obj5 = false;
            } else {
                obj5 = obj6;
                c = 0;
            }
            Pair[] pairArr = new Pair[6];
            pairArr[c] = j.a(obj3, e2);
            pairArr[1] = j.a(obj4, str2);
            pairArr[2] = j.a(MUSMonitor.MODULE_DIM_ABILITY, this.c);
            pairArr[3] = j.a("api", this.d);
            pairArr[4] = j.a("url", obj);
            pairArr[5] = j.a("syncCallForceMain", obj5);
            JSONObject jSONObject5 = new JSONObject(ai.b(pairArr));
            int d = executeResult.d();
            JSONObject jSONObject6 = jSONObject5;
            jSONObject6.put((JSONObject) "statusCode", (String) Integer.valueOf(d));
            if (executeResult instanceof ErrorResult) {
                ErrorResult errorResult2 = (ErrorResult) executeResult;
                jSONObject6.put((JSONObject) "errorCode", errorResult2.a());
                jSONObject6.put((JSONObject) "errorMessage", errorResult2.b());
            }
            jSONObject6.put((JSONObject) "isBetaVersion", (String) Boolean.valueOf(a.a(f.Companion)));
            JSONObject jSONObject7 = new JSONObject(ai.b(j.a("status", Integer.valueOf(d > 99 ? 0 : 1))));
            if (this.f1978a) {
                if (d <= 99 || (c3 = com.alibaba.ability.f.INSTANCE.c()) == null) {
                    return;
                }
                c3.a("Megability", "AbilityCallbackException", jSONObject5, jSONObject7);
            } else if (a.a(f.Companion)) {
                com.alibaba.ability.inject.b c4 = com.alibaba.ability.f.INSTANCE.c();
                if (c4 == null) {
                    return;
                }
                c4.a("Megability", "AbilityTraceBeta", jSONObject5, jSONObject7);
            } else {
                if (d > 99 && (c2 = com.alibaba.ability.f.INSTANCE.c()) != null) {
                    c2.a("Megability", "AbilityTraceException", jSONObject5, jSONObject7);
                }
                com.alibaba.ability.inject.b c5 = com.alibaba.ability.f.INSTANCE.c();
                if (c5 == null) {
                    return;
                }
                c5.a("Megability", "AbilityTrace", jSONObject5, jSONObject7);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final alo f1977a;
        private final c b;

        static {
            kge.a(727054580);
            kge.a(955769565);
        }

        public b(alo callback, c profileExtractor) {
            q.d(callback, "callback");
            q.d(profileExtractor, "profileExtractor");
            this.f1977a = callback;
            this.b = profileExtractor;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            this.f1977a.onCallback(result);
            bfy a2 = f.Companion.a();
            c cVar = this.b;
            cVar.a(result);
            cVar.a(true);
            cVar.a(System.currentTimeMillis());
            t tVar = t.INSTANCE;
            bfy.a(a2, cVar, 0L, null, 6, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-224262452);
        }

        private final boolean b() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("57a83ed", new Object[]{this});
            } else {
                kotlin.d b = f.b();
                a aVar = f.Companion;
                value = b.getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5298f88f", new Object[]{aVar})).booleanValue() : aVar.b();
        }

        public final bfy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("f02bf09", new Object[]{this}) : f.a();
        }
    }

    static {
        kge.a(1490153604);
        kge.a(1794714122);
        Companion = new a(null);
        f1976a = new bfy("profileExtractor", 1);
        b = kotlin.e.a(ProfileExtractorMiddleware$Companion$isGrayVersion$2.INSTANCE);
    }
}
