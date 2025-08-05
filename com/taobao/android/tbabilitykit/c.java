package com.taobao.android.tbabilitykit;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import tb.aln;
import tb.alo;
import tb.als;
import tb.alu;
import tb.dmr;
import tb.kge;

/* loaded from: classes6.dex */
public final class c implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_HIDE = "hide";
    public static final String API_SHOW = "show";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final JSONObject f15331a;

    /* loaded from: classes6.dex */
    public static final class b implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f15332a;

        public b(aln alnVar) {
            this.f15332a = alnVar;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            if (!kotlin.jvm.internal.q.a((Object) result.f(), (Object) "onClose")) {
                this.f15332a.a(result);
                return;
            }
            Map<String, Object> e = result.e();
            if (e == null) {
                return;
            }
            Object obj = e.get("action");
            if (kotlin.jvm.internal.q.a(obj, (Object) "confirm")) {
                this.f15332a.a((ExecuteResult) new FinishResult(new JSONObject(ai.b(kotlin.j.a("tabIndex", e.get("tabIndex")), kotlin.j.a("data", e.get("data")))), "onAction"));
            } else if (kotlin.jvm.internal.q.a(obj, (Object) "cancel")) {
                this.f15332a.a((ExecuteResult) new FinishResult(new JSONObject(), "onCancel"));
            } else {
                aln alnVar = this.f15332a;
                JSONObject jSONObject = new JSONObject();
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                alnVar.a((ExecuteResult) new FinishResult(jSONObject, (String) obj));
            }
        }
    }

    /* renamed from: com.taobao.android.tbabilitykit.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0588c implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f15333a;

        public C0588c(aln alnVar) {
            this.f15333a = alnVar;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            this.f15333a.a(result);
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(2047410283);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    static {
        kge.a(1863816419);
        kge.a(-948502777);
        Companion = new a(null);
        f15331a = new JSONObject(ai.b(kotlin.j.a("name", "menu_select_pop"), kotlin.j.a("version", "9"), kotlin.j.a("url", "https://dinamicx.alibabausercontent.com/pub/menu_select_pop/1706178855808/menu_select_pop.zip")));
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
        if (context.f().f() == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        alu c = context.f().c();
        if (c == null) {
            return new ErrorResult("500", "AbilityHubAdapter is null", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        int hashCode = api.hashCode();
        if (hashCode != 3202370) {
            if (hashCode == 3529469 && api.equals("show")) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                JSONObject jSONObject = f15331a;
                String a2 = dmr.INSTANCE.a("actionSheetTemplate", "non");
                if (!kotlin.jvm.internal.q.a((Object) a2, (Object) "non")) {
                    jSONObject = JSONObject.parseObject(a2);
                    kotlin.jvm.internal.q.b(jSONObject, "JSONObject.parseObject(remoteTemplate)");
                }
                Map b2 = ai.b(kotlin.j.a("popId", valueOf));
                b2.putAll(params);
                kotlin.t tVar = kotlin.t.INSTANCE;
                return c.a("stdPop", m.API_STD_DX, context, new JSONObject(ai.b(kotlin.j.a("popId", valueOf), kotlin.j.a("bizId", "megaability"), kotlin.j.a("content", new JSONObject(b2)), kotlin.j.a(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, new JSONObject(ai.b(kotlin.j.a(com.taobao.android.abilitykit.ability.pop.model.b.TAK_ABILITY_MATCH_CONTENT, true)))), kotlin.j.a(com.taobao.android.abilitykit.ability.pop.model.c.KEY_EXT_CONFIG, new JSONObject(ai.b(kotlin.j.a("template", jSONObject), kotlin.j.a("sharedEngine", false)))))), new b(callback));
            }
        } else if (api.equals("hide")) {
            return c.a("stdPop", "close", context, params, new C0588c(callback));
        }
        a$a.a aVar = a$a.Companion;
        return aVar.a("api " + api + " not found");
    }
}
