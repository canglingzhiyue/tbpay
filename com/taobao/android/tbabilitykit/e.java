package com.taobao.android.tbabilitykit;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ai;
import kotlin.collections.p;
import tb.aln;
import tb.als;
import tb.bfy;
import tb.dle;
import tb.dll;
import tb.jal;
import tb.kge;

/* loaded from: classes6.dex */
public final class e implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_BATCH_COMP_EXPOSURE = "batchCompExposure";
    public static final String BATCH_COMP_EXPOSURE = "7860200037355951613";
    public static final a Companion;
    public static final String ERROR_API = "errorApi";
    public static final String ERROR_PARAM = "errorParams";

    /* renamed from: a  reason: collision with root package name */
    private static final kotlin.d f15335a;

    /* loaded from: classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f15336a;
        public final /* synthetic */ Map b;

        public b(List list, Map map) {
            this.f15336a = list;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Object obj : this.f15336a) {
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    String string = jSONObject.getString("pageName");
                    JSONObject jsonObject = jSONObject.getJSONObject("data");
                    JSONObject jSONObject2 = jsonObject.getJSONObject("args");
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        kotlin.jvm.internal.q.b(jsonObject, "jsonObject");
                        jsonObject.put((JSONObject) "args", (String) jSONObject2);
                    }
                    if (!this.b.isEmpty()) {
                        for (Map.Entry entry : this.b.entrySet()) {
                            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && entry.getValue() != null && !jSONObject2.containsKey(entry.getKey())) {
                                jSONObject2.put((JSONObject) entry.getKey(), (Object) String.valueOf(entry.getValue()));
                            }
                        }
                    }
                    jal.a(2201, string, jsonObject);
                }
            }
        }
    }

    public static final /* synthetic */ kotlin.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : f15335a;
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
        if (!kotlin.jvm.internal.q.a((Object) api, (Object) API_BATCH_COMP_EXPOSURE)) {
            return new ErrorResult(ERROR_API, "The ability api name is error, please check it.", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        com.alibaba.ability.e eVar = com.alibaba.ability.e.INSTANCE;
        Map<String, Object> a2 = com.alibaba.ability.e.a(params, "engineStorageExposureIdentify");
        if (a2 == null) {
            a2 = ai.a();
        }
        Map<String, Object> a3 = com.alibaba.ability.e.a(params, "commonArgs");
        if (a3 == null) {
            a3 = ai.a();
        }
        List<Object> b2 = com.alibaba.ability.e.b(params, "pairs");
        if (b2 == null) {
            b2 = p.a();
        }
        if (a2.isEmpty() || b2.isEmpty()) {
            return new ErrorResult(ERROR_PARAM, "The params is miss, please check it.", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        Object d = context.d();
        if (d instanceof dle) {
            Object obj = a2.get("key");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str == null) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                dle dleVar = (dle) d;
                dleVar.e().a(a(str, a2.get("value")), dleVar, (dll) null);
            }
        }
        bfy.a(Companion.a(), new b(b2, a3), 0L, null, 4, null);
        return new FinishResult(null, null, 3, null);
    }

    private final JSONObject a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("eb9346ae", new Object[]{this, str, obj}) : new JSONObject(ai.b(kotlin.j.a("type", "engineStorageSet"), kotlin.j.a("params", ai.b(kotlin.j.a("key", str), kotlin.j.a("value", obj)))));
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1294976764);
        }

        public final bfy a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("f02bf09", new Object[]{this});
            } else {
                kotlin.d a2 = e.a();
                a aVar = e.Companion;
                value = a2.getValue();
            }
            return (bfy) value;
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    static {
        kge.a(-1602811716);
        kge.a(-948502777);
        Companion = new a(null);
        f15335a = kotlin.e.a(LazyThreadSafetyMode.NONE, BatchCompExposureAbility$Companion$exposureScheduler$2.INSTANCE);
    }
}
