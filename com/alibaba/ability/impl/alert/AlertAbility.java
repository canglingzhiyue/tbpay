package com.alibaba.ability.impl.alert;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAlertAbility;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import com.taobao.android.abilityidl.ability.be;
import com.taobao.android.abilityidl.ability.i;
import com.taobao.android.abilityidl.ability.j;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.model.d;
import com.taobao.android.tbabilitykit.m;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.alo;
import tb.als;
import tb.alu;
import tb.fhz;
import tb.kge;

/* loaded from: classes2.dex */
public final class AlertAbility extends AbsAlertAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCEL = "cancel";
    public static final String CONFIRM = "confirm";
    public static final a Companion;
    public static final String DATA_KEY_ACTION = "action";
    public static final String OTHER = "other";

    /* loaded from: classes2.dex */
    public static final class b implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ be f1829a;

        public b(be beVar) {
            this.f1829a = beVar;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            if (!q.a((Object) result.f(), (Object) "onClose")) {
                if (result instanceof ErrorResult) {
                    this.f1829a.a((ErrorResult) result);
                    return;
                } else if (result.d() <= 99) {
                    return;
                } else {
                    AppMonitor.Alarm.commitFail("MegaAbility", "AlertAbility", String.valueOf(result.d()), result.c().toString());
                    return;
                }
            }
            Map<String, Object> e = result.e();
            if (e == null || (obj = e.get("action")) == null) {
                return;
            }
            AlertConfirmInfo alertConfirmInfo = new AlertConfirmInfo();
            alertConfirmInfo.confirm = Boolean.valueOf(q.a(obj, (Object) "confirm"));
            Object obj2 = e.get("isChecked");
            alertConfirmInfo.isChecked = Boolean.valueOf(q.a((Object) (obj2 != null ? obj2.toString() : null), (Object) "true"));
            if (q.a(obj, (Object) "confirm")) {
                this.f1829a.a(alertConfirmInfo);
            } else if (q.a(obj, (Object) "other")) {
                this.f1829a.c(alertConfirmInfo);
            } else if (!q.a(obj, (Object) "cancel")) {
            } else {
                this.f1829a.b(alertConfirmInfo);
            }
        }
    }

    static {
        kge.a(375173962);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(AlertAbility alertAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(1141148178);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAlertAbility
    public void show(als context, j params, be callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d0da97", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        alu c = context.f().c();
        if (c == null) {
            callback.a(new ErrorResult("AdapterIsNull", (String) null, (Map) null, 6, (o) null));
        } else {
            c.b("stdPop", m.API_STD_DX, context, a(params), new b(callback));
        }
    }

    private final JSONObject a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a66f329", new Object[]{this, jVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "popId", "alert:" + System.currentTimeMillis());
        jSONObject2.put((JSONObject) "bizId", "megability");
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "title", jVar.f8885a);
        jSONObject4.put((JSONObject) "content", jVar.b);
        jSONObject4.put((JSONObject) com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS, (String) b(jVar));
        if (jVar.c != null) {
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = jSONObject5;
            i iVar = jVar.c;
            String str = null;
            jSONObject6.put((JSONObject) "isChecked", String.valueOf(iVar != null ? iVar.f8884a : null));
            i iVar2 = jVar.c;
            if (iVar2 != null) {
                str = iVar2.b;
            }
            jSONObject6.put((JSONObject) "text", str);
            jSONObject4.put((JSONObject) UiUtil.INPUT_TYPE_VALUE_CHECKBOX, (String) jSONObject5);
        }
        jSONObject4.put((JSONObject) "popId", jSONObject.getString("popId"));
        jSONObject4.put((JSONObject) "bizId", jSONObject.getString("bizId"));
        jSONObject2.put((JSONObject) "content", (String) jSONObject3);
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = jSONObject7;
        jSONObject8.put((JSONObject) "gravity", "center");
        jSONObject8.put((JSONObject) "tapEnable", (String) false);
        jSONObject8.put((JSONObject) "panEnable", (String) false);
        jSONObject8.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.b.TAK_ABILITY_MATCH_CONTENT, (String) true);
        jSONObject8.put((JSONObject) "cornerRadius", (String) 0);
        jSONObject8.put((JSONObject) "animation", d.KEY_FADE_IN_OUT);
        jSONObject2.put((JSONObject) c.KEY_POP_CONFIG, (String) jSONObject7);
        JSONObject jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = jSONObject9;
        jSONObject10.put((JSONObject) "template", (String) fhz.a());
        jSONObject10.put((JSONObject) "refreshType", "renderFirst");
        jSONObject10.put((JSONObject) "sharedEngine", (String) false);
        jSONObject2.put((JSONObject) c.KEY_EXT_CONFIG, (String) jSONObject9);
        return jSONObject;
    }

    private final JSONArray b(j jVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d267ab96", new Object[]{this, jVar});
        }
        JSONArray jSONArray = new JSONArray();
        if (jVar.d != null) {
            String str = jVar.d;
            if (!(str == null || str.length() == 0)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("text", (Object) jVar.d);
                jSONObject.put("highlighted", (Object) true);
                jSONObject.put("action", (Object) "confirm");
                t tVar = t.INSTANCE;
                jSONArray.add(jSONObject);
            }
        }
        if (jVar.f != null) {
            String str2 = jVar.f;
            if (!(str2 == null || str2.length() == 0)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("text", (Object) jVar.f);
                jSONObject2.put("highlighted", (Object) false);
                jSONObject2.put("action", (Object) "other");
                t tVar2 = t.INSTANCE;
                jSONArray.add(jSONObject2);
            }
        }
        if (jVar.e != null) {
            String str3 = jVar.e;
            if (str3 != null && str3.length() != 0) {
                z = false;
            }
            if (!z) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("text", (Object) jVar.e);
                jSONObject3.put("highlighted", (Object) false);
                jSONObject3.put("action", (Object) "cancel");
                t tVar3 = t.INSTANCE;
                jSONArray.add(jSONObject3);
            }
        }
        if (jSONArray.size() == 2) {
            p.g((List) jSONArray);
        }
        return jSONArray;
    }
}
