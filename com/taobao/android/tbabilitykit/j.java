package com.taobao.android.tbabilitykit;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes6.dex */
public final class j implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SHOW = "show";
    public static final a Companion;
    public static final String SHOWPOPLAYER = "-7983307011926955783";

    /* renamed from: a  reason: collision with root package name */
    private final String f15339a = "onClose";
    private final String b = "onDisPlayed";
    private final String c = "onDisPlayFailed";

    static {
        kge.a(1771944456);
        kge.a(-948502777);
        Companion = new a(null);
    }

    public static final /* synthetic */ JSONObject a(j jVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("cea569d9", new Object[]{jVar, str, str2, str3, str4}) : jVar.a(str, str2, str3, str4);
    }

    public static final /* synthetic */ String a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("403cd2f", new Object[]{jVar}) : jVar.b;
    }

    public static final /* synthetic */ String b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2997d630", new Object[]{jVar}) : jVar.f15339a;
    }

    public static final /* synthetic */ String c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f2bdf31", new Object[]{jVar}) : jVar.c;
    }

    private final JSONObject a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78ab1fb0", new Object[]{this, str, str2, str3, str4});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "popIndexId", str);
        jSONObject2.put((JSONObject) "uri", str2);
        jSONObject2.put((JSONObject) "reason", str3);
        jSONObject2.put((JSONObject) "subReason", str4);
        return jSONObject;
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        if (api.hashCode() == 3529469 && api.equals("show")) {
            Object obj = params.get("param");
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            String a2 = com.alibaba.ability.e.a(params, "traceInfo", (String) null);
            String a3 = com.alibaba.ability.e.a(params, "uri", (String) null);
            String str = a3;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                callback.a(a$a.Companion.b("Uri Is Empty"));
                return null;
            }
            com.alibaba.poplayer.trigger.g.a(a3, jSONObject != null ? jSONObject.toString() : null).a(a2).a(new b(jSONObject, a2, callback, a3)).a();
            return null;
        }
        return a$a.Companion.a("Api Not Found");
    }

    /* loaded from: classes6.dex */
    public static final class b implements g.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ aln c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public b(JSONObject jSONObject, String str, aln alnVar, String str2) {
            this.b = jSONObject;
            this.e = str;
            this.c = alnVar;
            this.d = str2;
        }

        @Override // com.alibaba.poplayer.trigger.g.a
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            aln alnVar = this.c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "uri", this.d);
            jSONObject.put((JSONObject) str, str);
            kotlin.t tVar = kotlin.t.INSTANCE;
            alnVar.a(new FinishResult(jSONObject, j.a(j.this)));
        }

        @Override // com.alibaba.poplayer.trigger.g.a
        public void a(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e47be646", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else {
                this.c.a(new FinishResult(j.a(j.this, str, this.d, str2, str3), z2 ? j.b(j.this) : j.c(j.this)));
            }
        }

        @Override // com.alibaba.poplayer.trigger.g.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.c.a(new FinishResult(j.a(j.this, "onTriggerFailed", this.d, str, null), j.c(j.this)));
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(401783632);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
