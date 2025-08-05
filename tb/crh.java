package tb;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.d;
import com.taobao.android.tbabilitykit.m;
import com.taobao.search.common.util.k;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class crh implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABILITY_TYPE = "photoSearch";
    public static final String API_CLOSE_IRP = "closeIrp";
    public static final String API_SHOW_IRP = "showIrp";
    public static final a Companion;
    public static final String IRP_POP_ID = "photoSearch_irp";

    /* loaded from: classes3.dex */
    public static final class b implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f26469a;

        public b(aln alnVar) {
            this.f26469a = alnVar;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            q.c(result, "result");
            this.f26469a.a(result);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f26470a;

        public c(aln alnVar) {
            this.f26470a = alnVar;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            q.c(result, "result");
            this.f26470a.a(result);
        }
    }

    static {
        kge.a(-50931502);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: tb.crh$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C1099a implements alo {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult result) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                } else {
                    q.c(result, "result");
                }
            }
        }

        static {
            kge.a(1500734874);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            als alqVar = new alq(new alr("photoSearch", "photoSearch"));
            alt b = alqVar.b();
            alu c = b != null ? b.c() : null;
            if (c == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "popId", crh.IRP_POP_ID);
            c.a("photoSearch", crh.API_CLOSE_IRP, alqVar, jSONObject, new C1099a());
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.c(api, "api");
        q.c(context, "context");
        q.c(params, "params");
        q.c(callback, "callback");
        if (TextUtils.isEmpty(api)) {
            return a$a.Companion.a("api empty");
        }
        if (q.a((Object) API_SHOW_IRP, (Object) api)) {
            return b(context, params, callback);
        }
        if (q.a((Object) API_CLOSE_IRP, (Object) api)) {
            return a(context, params, callback);
        }
        return a$a.Companion.a("function invalid");
    }

    private final ExecuteResult a(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e3d9aefd", new Object[]{this, alsVar, map, alnVar});
        }
        alt b2 = alsVar.b();
        alu c2 = b2 != null ? b2.c() : null;
        if (c2 == null) {
            return new ErrorResult("EnvError", "hubAdapter is Null", (Map) null, 4, (o) null);
        }
        return c2.a("stdPop", "close", alsVar, map, new b(alnVar));
    }

    private final ExecuteResult b(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e4a82d7e", new Object[]{this, alsVar, map, alnVar});
        }
        alt b2 = alsVar.b();
        alu c2 = b2 != null ? b2.c() : null;
        if (c2 == null) {
            return new ErrorResult("EnvError", "hubAdapter is Null", (Map) null, 4, (o) null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "popId", IRP_POP_ID);
        jSONObject.put((JSONObject) "bizId", "tbsearch");
        jSONObject.put((JSONObject) "url", k.PAILITAO_EDITOR_URL);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject2.put((JSONObject) entry.getKey(), (String) entry.getValue());
        }
        jSONObject2.put((JSONObject) "showPopup", "true");
        jSONObject.put((JSONObject) "queryParams", (String) jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "maxHeight", (String) 1);
        jSONObject4.put((JSONObject) "originHeight", (String) 1);
        jSONObject4.put((JSONObject) "animation", d.KEY_FADE_IN_OUT);
        jSONObject4.put((JSONObject) "attachMode", "activity");
        jSONObject4.put((JSONObject) "backgroundStyle", "#00000000");
        jSONObject4.put((JSONObject) "backgroundMode", "color");
        jSONObject4.put((JSONObject) "cornerRadius", (String) 0);
        jSONObject.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject3);
        return c2.a("stdPop", m.API_NATIVE, alsVar, jSONObject, new c(alnVar));
    }
}
