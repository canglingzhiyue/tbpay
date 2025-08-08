package com.taobao.android.dinamicx.eventchain;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import java.util.HashMap;
import java.util.Map;
import tb.alo;
import tb.alq;
import tb.alu;
import tb.dkt;
import tb.dkw;
import tb.dkx;
import tb.dky;
import tb.dle;
import tb.dlg;
import tb.dlk;
import tb.dll;
import tb.dln;
import tb.fqi;
import tb.fuw;
import tb.fuz;
import tb.fxe;
import tb.fxr;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Byte AK;
    public static final Byte MEGA;
    private String f;
    private Long g;
    private String i;
    private JSONObject j;
    private String m;
    private JSONObject n;
    private JSONObject o;
    private Map<String, String> p;
    private DXAtomicFTData q;
    private String u;
    private String v;

    /* renamed from: a  reason: collision with root package name */
    private final String f11845a = "params";
    private final String b = "ftData";
    private final String c = "callback";
    private final String d = "@";
    private final String e = riy.BLOCK_END_STR;
    private final String s = "name";
    private final String t = "api";
    private final int x = 99;
    private final String y = "onError";
    private String h = "";
    private String k = "";
    private String l = "1.0";
    private String r = "";
    private byte w = AK.byteValue();

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a81b2b35", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ void a(a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bf68b", new Object[]{aVar, dVar});
        } else {
            aVar.a(dVar);
        }
    }

    public static /* synthetic */ Map b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("711b0c41", new Object[]{aVar}) : aVar.p;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4dd32f3", new Object[]{aVar}) : aVar.u;
    }

    public static /* synthetic */ String d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("233e36d2", new Object[]{aVar}) : aVar.v;
    }

    static {
        kge.a(1182424136);
        AK = (byte) 1;
        MEGA = (byte) 2;
    }

    public a(String str, Long l) {
        this.f = "";
        this.g = -1L;
        this.f = str;
        this.g = l;
    }

    public void a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b)});
        } else {
            this.w = b;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f;
    }

    public Long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("b158060c", new Object[]{this}) : this.g;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.i = str;
        if (!StringUtils.isEmpty(this.i)) {
            this.j = JSON.parseObject(this.i);
        }
        if (this.w != MEGA.byteValue()) {
            return;
        }
        this.u = this.j.getString("name");
        this.v = this.j.getString("api");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.h;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.o;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.p;
    }

    public j a(d dVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("8a7626a7", new Object[]{this, dVar, cVar});
        }
        if (dVar == null) {
            return j.a(e.EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_CONTEXT_IS_NULL);
        }
        if (this.w == MEGA.byteValue()) {
            dln a2 = dVar.a().D().a(this.u, this.v);
            if (a2 == null) {
                return b(dVar, cVar);
            }
            dlg b = a2.b(null);
            if (b == null) {
                return j.a(e.EVENT_CHAIN_ERROR_ABILITY_IS_NULL);
            }
            return a(dVar, cVar, b);
        }
        dkt f = dVar.f();
        if (f == null) {
            return j.a(e.EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_ABILITY_IS_NULL);
        }
        dlg<dle> a3 = f.a(String.valueOf(this.g));
        if (a3 == null) {
            DXTraceUtil.a(2);
            return j.a(e.EVENT_CHAIN_ERROR_ABILITY_IS_NULL);
        }
        return a(dVar, cVar, a3);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.taobao.android.dinamicx.eventchain.a$1] */
    private j a(final d dVar, final c cVar, final dlg dlgVar) {
        dlk dlkVar;
        DXRuntimeContext a2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        DXAtomicFTData dXAtomicFTData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("8d6c2596", new Object[]{this, dVar, cVar, dlgVar});
        }
        final boolean a3 = fuz.a();
        DXTraceUtil.a(2, "DX-AtomicEvent-Start", " : ", this.f);
        fuw.a("DXFullTrace", "execute ", this.f, this.m, this.p);
        com.taobao.analysis.v3.f fVar = null;
        DXTraceUtil.a(2, "DX-AtomicEvent-构造Node");
        f();
        DXTraceUtil.a(2);
        JSONObject jSONObject3 = this.n;
        DXTraceUtil.a(2, "DX-AtomicEvent-执行表达式");
        a(jSONObject3, dVar);
        this.o = jSONObject3;
        DXTraceUtil.a(2);
        if (!a3) {
            if (dVar.n() != null && dVar.o() != null && (dXAtomicFTData = this.q) != null && !StringUtils.isEmpty(dXAtomicFTData.c())) {
                fuz.b(dVar.u());
                com.taobao.analysis.v3.p a4 = fuz.a(dVar.o(), this.q.d());
                fuz.a(a4);
                dVar.a(a4);
            }
            if (dVar.n() != null && dVar.o() != null) {
                fVar = fuz.b(fuz.a(dVar.o()), "DX", "Atomic");
                fuz.a(fVar, "DXEventChain_AbilityName", this.f);
                DXAtomicFTData dXAtomicFTData2 = this.q;
                if (dXAtomicFTData2 != null && dXAtomicFTData2.e() && (jSONObject2 = this.o) != null) {
                    fuz.a(fVar, JSON.toJSONString(jSONObject2));
                }
                DXAtomicFTData dXAtomicFTData3 = this.q;
                if (dXAtomicFTData3 != null && dXAtomicFTData3.e() && (jSONObject = this.o) != null) {
                    fuz.a(fVar, JSON.toJSONString(jSONObject));
                }
            }
            DXAtomicFTData dXAtomicFTData4 = this.q;
            if (dXAtomicFTData4 != null && !StringUtils.isEmpty(dXAtomicFTData4.a()) && !"none".equals(this.q.a()) && fqi.i() && (a2 = dVar.a()) != null && a2.C().a() != null && a2.C().a().s()) {
                fVar = b(dVar);
            }
            fuw.a("DXFullTrace", "atomic ", this.f, this.p);
            if (dVar.n() != null && dVar.o() != null && this.p != null) {
                dVar.q();
            }
        }
        com.taobao.analysis.v3.f fVar2 = fVar;
        JSONObject parseObject = JSONObject.parseObject(this.i);
        parseObject.put("params", (Object) jSONObject3);
        if (fVar2 != null) {
            fuz.a(fVar2, "DXEventChain_AbilityParams", JSON.toJSONString(a(parseObject.getJSONObject("params"))));
        }
        if (dlgVar == null) {
            DXTraceUtil.a(2);
            return j.a(e.EVENT_CHAIN_ERROR_ABILITY_IS_NULL);
        }
        if (!a3) {
            dlgVar.a(fVar2);
            fuz.a(fVar2, "DXEventChain_AbilityType", dlgVar.getClass().getSimpleName());
        }
        dll a5 = new dll() { // from class: com.taobao.android.dinamicx.eventchain.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public com.taobao.analysis.v3.f f11846a = null;

            @Override // tb.dll
            public void callback(final String str, final dkx dkxVar) {
                com.taobao.analysis.v3.f fVar3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
                } else if (cVar == null || dkxVar == null) {
                    fuw.d("DXAtomicEventNode", "eventchain callback is null or abilityExecuteResult is null [ " + a.a(a.this));
                } else {
                    if (bx.m()) {
                        fuw.h("原子事件  ", a.this.a(), "  call back nextAbilityType", str, " ret ", JSON.toJSONString(dkxVar));
                    }
                    if (a.b(a.this) == null) {
                        return;
                    }
                    if (!a3) {
                        dVar.r();
                        if (dVar.n() != null && dVar.o() != null && (fVar3 = this.f11846a) != null) {
                            if (dkxVar instanceof dkw) {
                                fuz.a(fVar3, "DXEventChain_AbilityResult", JSON.toJSONString(dkxVar));
                            }
                            dlg dlgVar2 = dlgVar;
                            if (dlgVar2 != null && dlgVar2.c()) {
                                fuz.c(this.f11846a);
                            }
                        }
                        if (dVar.n() != null && dVar.o() != null && StringUtils.isEmpty(str) && dVar.p() <= 0) {
                            fuw.d("DXFullTrace", "EvnetChian finish callback ", " ", a.a(a.this));
                            a.a(a.this, dVar);
                        }
                    }
                    if (dVar.e()) {
                        fuw.a("DXAtomicEventNode", "eventchain callback: event cancle");
                    } else if (Looper.getMainLooper() == Looper.myLooper()) {
                        cVar.a(new m(str, (String) a.b(a.this).get(str)), j.a(dkxVar));
                    } else {
                        fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.eventchain.a.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    cVar.a(new m(str, (String) a.b(a.this).get(str)), j.a(dkxVar));
                                }
                            }
                        });
                    }
                }
            }

            public dll a(com.taobao.analysis.v3.f fVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (dll) ipChange2.ipc$dispatch("72b5603f", new Object[]{this, fVar3});
                }
                this.f11846a = fVar3;
                return this;
            }
        }.a(fVar2);
        if (!a3 && dVar.n() != null && dVar.o() != null && fVar2 != null && (dVar.c() instanceof dlk) && (dlkVar = (dlk) dVar.c()) != null) {
            dlkVar.a(fVar2);
        }
        if (bx.m()) {
            fuw.h("开始执行原子事件 type ", a());
        }
        dkx a6 = dlgVar.a(parseObject, (JSONObject) dVar.c(), a5);
        if (bx.m()) {
            fuw.h("执行完毕原子事件  ", a(), "  ret ", JSON.toJSONString(a6));
        }
        if (!a3) {
            if (this.p == null && dVar.n() != null && dVar.o() != null && fVar2 != null) {
                if (a6 instanceof dkw) {
                    fuz.a(fVar2, "DXEventChain_AbilityResult", JSON.toJSONString(a6));
                }
                if (!(a6 instanceof dky)) {
                    fuz.c(fVar2);
                }
            }
            if (StringUtils.isEmpty(this.h) && dVar.p() <= 0 && dVar.n() != null && dVar.o() != null) {
                fuw.d("DXFullTrace", "EvnetChian finish  ", this.f);
                a(dVar);
            }
        }
        DXTraceUtil.a(2);
        return j.a(a6);
    }

    private void f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (StringUtils.isEmpty(this.i)) {
            fuw.d("DXAtomicEventNode", "eventchain parse event info : atom event content is null");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            fxr.a(this.j, jSONObject2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("callback");
            if (jSONObject3 != null) {
                this.p = new HashMap();
                for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                    Map<String, String> map = this.p;
                    String key = entry.getKey();
                    map.put(key, entry.getValue() + "");
                }
            }
            if (jSONObject2.containsKey("params")) {
                this.n = jSONObject2.getJSONObject("params");
                this.m = jSONObject2.getJSONObject("params").toJSONString();
            }
            if (fuz.a() || !jSONObject2.containsKey("ftData") || (jSONObject = jSONObject2.getJSONObject("ftData")) == null) {
                return;
            }
            this.q = new DXAtomicFTData(jSONObject);
        }
    }

    private void a(JSONArray jSONArray, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b95bd10", new Object[]{this, jSONArray, dVar});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, dVar);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, dVar);
            } else {
                jSONArray.set(i, a(obj.toString(), dVar));
            }
        }
    }

    private void a(JSONObject jSONObject, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47871d08", new Object[]{this, jSONObject, dVar});
        } else if (jSONObject != null && jSONObject.entrySet() != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    a((JSONObject) value, dVar);
                } else if (value instanceof JSONArray) {
                    a((JSONArray) value, dVar);
                } else {
                    Object a2 = a(value.toString(), dVar);
                    if (a2 == null) {
                        jSONObject.put(key, "");
                    } else {
                        jSONObject.put(key, a2);
                    }
                }
            }
        }
    }

    private Object a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82706840", new Object[]{this, str, dVar});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@") || !str.endsWith(riy.BLOCK_END_STR)) {
            return str;
        }
        if (dVar != null && dVar.g() != null && dVar.g().b(str) != null) {
            return dVar.g().b(str).a(null, dVar.a());
        }
        return null;
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0175e8", new Object[]{this, dVar});
            return;
        }
        fuw.d("DXFullTrace", "EventChain finish");
        if (dVar != null) {
            fuz.b(dVar.u());
            if (dVar.n() != null) {
                fuz.c(dVar.n());
            }
            if (dVar.o() != null) {
                fuz.c(dVar.o());
            }
            dVar.a((com.taobao.analysis.v3.g) null);
            dVar.a((com.taobao.analysis.v3.h) null);
        }
        dVar.s();
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof JSONObject) && !(value instanceof JSONArray)) {
                jSONObject2.put(key, value);
            }
        }
        return jSONObject2;
    }

    private com.taobao.analysis.v3.f b(d dVar) {
        com.taobao.analysis.v3.p a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.analysis.v3.f) ipChange.ipc$dispatch("994a9628", new Object[]{this, dVar});
        }
        fuw.a("DXFullTrace", "Atomic ftData is not null ", this.q);
        if (dVar == null || dVar.a() == null) {
            return null;
        }
        if (this.q.a() == "start") {
            com.taobao.analysis.v3.g a3 = fuz.a(dVar.a().A(), this.q.b());
            if (a3 == null) {
                return null;
            }
            dVar.a(a3);
            fuz.b(a3);
            fuz.a(a3, "DXEventChain_ChainName", dVar.t());
            com.taobao.analysis.v3.h a4 = fuz.a(a3.h(), "DX", this.q.b());
            dVar.a(a4);
            dVar.a().a(a4);
            fuz.b(a4);
            if (StringUtils.isEmpty(this.q.c())) {
                a2 = fuz.e(a4);
            } else {
                a2 = fuz.a(a4, this.q.d());
            }
            fuz.a(a2);
            dVar.a(a2);
            com.taobao.analysis.v3.f b = fuz.b(a4.h(), "DX", "Atomic");
            fuz.a(b, "DXEventChain_AbilityName", this.f);
            fuz.a(b, "DXEventChain_AbilityType", this.g.longValue());
            return b;
        } else if (this.q.a() != "finish") {
            return null;
        } else {
            fuz.b(dVar.u());
            a(dVar);
            return null;
        }
    }

    public j b(final d dVar, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("1e9536c6", new Object[]{this, dVar, cVar});
        }
        if (dVar.a() == null || dVar.a().D() == null || dVar.a().D().P() == null) {
            return j.b(-1, "executeForMega context null");
        }
        f();
        JSONObject jSONObject = this.n;
        a(jSONObject, dVar);
        DXRuntimeContext a2 = dVar.a();
        alu P = dVar.a().D().P();
        alq alqVar = new alq();
        this.o = jSONObject;
        o.a(alqVar, a2);
        dVar.w();
        alo aloVar = new alo() { // from class: com.taobao.android.dinamicx.eventchain.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                Map b;
                String f;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                    return;
                }
                if (bx.m()) {
                    fuw.h(a.c(a.this), a.d(a.this), " onCallback result ", JSON.toJSONString(executeResult));
                }
                if (cVar == null || executeResult == null) {
                    fuw.h("eventchain callback is null or abilityExecuteResult is null  ", a.a(a.this));
                } else if (a.b(a.this) == null) {
                } else {
                    if (dVar.e()) {
                        fuw.h("eventchain callback: event cancle");
                        return;
                    }
                    if (executeResult.d() > 99) {
                        b = a.b(a.this);
                        f = "onError";
                    } else {
                        b = a.b(a.this);
                        f = executeResult.f();
                    }
                    String str = (String) b.get(f);
                    if (StringUtils.isEmpty(str)) {
                        fuw.h("eventChianName is null ", executeResult.f());
                        return;
                    }
                    if (bx.m()) {
                        fuw.h(a.c(a.this), " ", a.d(a.this), "异步返回结果 ", JSON.toJSONString(executeResult));
                    }
                    cVar.a(new m("-999", str), j.a(new p(executeResult)));
                }
            }
        };
        if (bx.m()) {
            fuw.h("开始执行原子能力 ", this.u, " - ", this.v, " params ", JSON.toJSONString(this.o));
        }
        ExecuteResult a3 = o.a(this.u, a2, this.v, alqVar, this.o, aloVar);
        if (a3 != null) {
            return j.a(new p(a3));
        }
        P.b(this.u, this.v, alqVar, this.o, aloVar);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("msg", (Object) "asyncCall");
        return j.a(new p(new FinishResult(jSONObject2)));
    }
}
