package com.taobao.android.abilitykit.ability;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import kotlin.t;
import tb.alm;
import tb.aln;
import tb.alo;
import tb.als;
import tb.alu;
import tb.dmj;
import tb.dmk;
import tb.dmm;
import tb.dmr;
import tb.dms;
import tb.kge;

/* loaded from: classes4.dex */
public final class ModalAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALERT_KEY = "16887455482557";
    public static final String API_CONFIRM = "confirm";
    public static final String API_SHOW = "show";
    public static final a Companion;

    /* loaded from: classes4.dex */
    public static final class b implements dmk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8902a;

        public b(aln alnVar) {
            this.f8902a = alnVar;
        }

        @Override // tb.dmk
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("confirm", (Object) Boolean.valueOf(z));
            if (z) {
                this.f8902a.a(new FinishResult(jSONObject, "confirm"));
            } else {
                this.f8902a.a(new FinishResult(jSONObject, "cancel"));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ aln c;
        public final /* synthetic */ alu d;
        public final /* synthetic */ als e;

        public c(Map map, aln alnVar, alu aluVar, als alsVar) {
            this.b = map;
            this.c = alnVar;
            this.d = aluVar;
            this.e = alsVar;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            Map<String, Object> e;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            if (!kotlin.jvm.internal.q.a((Object) result.f(), (Object) "onClose") || (e = result.e()) == null || (obj = e.get("action")) == null) {
                return;
            }
            aln alnVar = this.c;
            Map<String, Object> e2 = result.e();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            alnVar.a((ExecuteResult) new FinishResult(e2, (String) obj));
        }
    }

    static {
        kge.a(1193760306);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(ModalAbility modalAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(682535674);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        Activity activity;
        String str;
        String str2;
        String str3;
        boolean z;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        if (kotlin.jvm.internal.q.a((Object) api, (Object) "confirm") || kotlin.jvm.internal.q.a((Object) api, (Object) "show")) {
            alu c2 = context.f().c();
            if (c2 == null) {
                return new ErrorResult("500", "AbilityHubAdapter is null", (Map) null, 4, (kotlin.jvm.internal.o) null);
            }
            Context f = context.f().f();
            if (!(f instanceof Activity)) {
                f = null;
            }
            Activity activity2 = (Activity) f;
            if (activity2 != null) {
                String a2 = com.alibaba.ability.e.a(params, "title", (String) null);
                String a3 = dms.a(params, (String) null, "content", "msg");
                String a4 = dms.a(params, (String) null, "confirmButtonText", "confirmText");
                String a5 = dms.a(params, (String) null, "cancelButtonText", "cancelText");
                JSONObject jSONObject = new JSONObject(params);
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "title", a2);
                jSONObject2.put((JSONObject) "content", a3);
                if (params.get(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS) == null) {
                    JSONArray jSONArray = new JSONArray();
                    String str4 = a5;
                    str3 = a3;
                    if (!(str4 == null || str4.length() == 0)) {
                        str2 = a2;
                        JSONObject jSONObject3 = new JSONObject();
                        activity = activity2;
                        JSONObject jSONObject4 = jSONObject3;
                        jSONObject4.put((JSONObject) "text", a5);
                        str = a5;
                        jSONObject4.put((JSONObject) "action", "cancel");
                        t tVar = t.INSTANCE;
                        jSONArray.add(jSONObject3);
                    } else {
                        activity = activity2;
                        str = a5;
                        str2 = a2;
                    }
                    String str5 = a4;
                    if (!(str5 == null || str5.length() == 0)) {
                        JSONObject jSONObject5 = new JSONObject();
                        JSONObject jSONObject6 = jSONObject5;
                        jSONObject6.put((JSONObject) "text", a4);
                        jSONObject6.put((JSONObject) "action", "confirm");
                        t tVar2 = t.INSTANCE;
                        jSONArray.add(jSONObject5);
                    }
                    t tVar3 = t.INSTANCE;
                    jSONObject2.put((JSONObject) com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS, (String) jSONArray);
                } else {
                    activity = activity2;
                    str = a5;
                    str2 = a2;
                    str3 = a3;
                    jSONObject2.put((JSONObject) com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS, (String) params.get(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS));
                }
                if (!dmr.e()) {
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    jSONObject2.put((JSONObject) "popId", valueOf);
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put((JSONObject) "popId", valueOf);
                    jSONObject7.put((JSONObject) "bizId", "megaability");
                    JSONObject jSONObject8 = new JSONObject();
                    JSONObject jSONObject9 = jSONObject8;
                    jSONObject9.put((JSONObject) "originHeight", (String) 1);
                    jSONObject9.put((JSONObject) "tabEnable", "false");
                    jSONObject9.put((JSONObject) "panEnable", (String) false);
                    jSONObject9.put((JSONObject) "animation", com.taobao.android.abilitykit.ability.pop.model.d.KEY_FADE_IN_OUT);
                    t tVar4 = t.INSTANCE;
                    jSONObject7.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject8);
                    JSONObject jSONObject10 = new JSONObject();
                    JSONObject jSONObject11 = jSONObject10;
                    JSONObject jSONObject12 = new JSONObject();
                    String j = dmr.j();
                    List b2 = j != null ? kotlin.text.n.b((CharSequence) j, new String[]{","}, false, 0, 6, (Object) null) : null;
                    JSONObject jSONObject13 = jSONObject12;
                    jSONObject13.put((JSONObject) "name", "alert_ability_ui");
                    if (b2 == null || b2.size() < 2) {
                        z = true;
                    } else {
                        z = true;
                        i = b2.get(1);
                    }
                    jSONObject13.put((JSONObject) "version", (String) i);
                    List list = b2;
                    if (list != null && !list.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        j = (String) b2.get(0);
                    }
                    jSONObject13.put((JSONObject) "url", j);
                    t tVar5 = t.INSTANCE;
                    jSONObject11.put((JSONObject) "template", (String) jSONObject12);
                    jSONObject11.put((JSONObject) "refreshType", "renderFirst");
                    jSONObject11.put((JSONObject) "sharedEngine", (String) false);
                    jSONObject11.put((JSONObject) "data", (String) jSONObject);
                    t tVar6 = t.INSTANCE;
                    jSONObject7.put((JSONObject) "content", (String) jSONObject10);
                    return c2.a("stdPop", com.taobao.android.tbabilitykit.m.API_STD_DX, context, jSONObject7, new c(params, callback, c2, context));
                }
                return a(activity, str2, str3, str, a4, callback);
            }
            return new ErrorResult("400", "NoActivity", (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
        return new ErrorResult("501", (String) null, (Map) null, 6, (kotlin.jvm.internal.o) null);
    }

    private final ExecuteResult a(Activity activity, String str, String str2, String str3, String str4, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("f096c410", new Object[]{this, activity, str, str2, str3, str4, alnVar});
        }
        try {
            new dmj(activity, new b(alnVar), str, str2, str3, str4).a();
            return new FinishResult(null, null, 3, null);
        } catch (Exception e) {
            return new ErrorResult("500", "AlertExp=" + dmm.a(e), (Map) null, 4, (kotlin.jvm.internal.o) null);
        }
    }
}
