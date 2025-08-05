package com.alibaba.android.icart.core.data.request;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback;
import com.taobao.android.icart.event.h;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.j;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bcb;
import tb.bcp;
import tb.bct;
import tb.bdw;
import tb.bdx;
import tb.bed;
import tb.bei;
import tb.bek;
import tb.bem;
import tb.beo;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2000236258);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(g gVar, MtopResponse mtopResponse, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57b3c62", new Object[]{gVar, mtopResponse, map, new Boolean(z)});
        } else {
            gVar.a(mtopResponse, map, z);
        }
    }

    public static /* synthetic */ boolean a(g gVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5160af9b", new Object[]{gVar, map})).booleanValue() : gVar.b(map);
    }

    public g(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // com.alibaba.android.icart.core.data.request.b
    public String a(final RequestConfig requestConfig, final jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880760cb", new Object[]{this, requestConfig, jnvVar});
        }
        bcp bcpVar = new bcp(this.f2310a, this.b, c());
        b(requestConfig);
        bmz b = requestConfig.b();
        IDMComponent a2 = requestConfig.a();
        jny w = this.f2310a.w();
        if (b == null) {
            return null;
        }
        if (this.f2310a.o().C() && bei.h(w) == this.f2310a.o().E()) {
            this.f2310a.o().a((Object) null);
            bdw.a(w, 1);
        }
        final String b2 = b.b();
        if (a2 != null) {
            ((DMComponent) a2).setTriggerEvent(b.f() + "." + b2);
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) w;
        JSONObject w2 = bVar.w();
        ArrayList<String> a3 = bek.a((List) b.b("operateItems"), bVar, bei.c(this.f2310a.w()));
        a(bcpVar.d().f(), requestConfig);
        this.c.a(a3);
        bcpVar.a(a2);
        w.a(this.c);
        b(b2);
        bcpVar.b(new bct(jnvVar) { // from class: com.alibaba.android.icart.core.data.request.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.bct, tb.jnv
            public void a(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2b3ee389", new Object[]{this, new Integer(i), mtopResponse, obj, map});
                } else {
                    g.a(g.this, mtopResponse, map, true);
                }
            }

            @Override // tb.bct, tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                } else if (!g.a(g.this, map)) {
                } else {
                    jnv jnvVar2 = jnvVar;
                    if (jnvVar2 != null) {
                        jnvVar2.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
                    }
                    if (mtopResponse == null) {
                        return;
                    }
                    bdx.a("SendUpdateRequest", "netRequest", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "");
                    UnifyLog.a(g.this.f2310a.n().s(), "SendUpdateRequest", "sendRespondRequest", "error");
                    if (beo.a(mtopResponse) && "cartSelect".equals(b2)) {
                        return;
                    }
                    com.alibaba.android.icart.core.widget.d.a(g.this.b, mtopResponse.getRetMsg());
                }
            }

            private boolean a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
                }
                if (!(obj instanceof JSONObject)) {
                    bed.a("shouldCallbackMtopResponseError", "protocol is not JSONObject");
                    return false;
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
                return (jSONObject2 != null && !jSONObject2.isEmpty()) || (jSONObject3 != null && !jSONObject3.isEmpty());
            }

            @Override // tb.bct, tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                g.a(g.this, mtopResponse, map, false);
                if (jqi.a("iCart", "enableNewUltronProtocolRefreshRules", true)) {
                    if (!a(map.get(j.STREAM_RESPONSE_ULTRON_PROTOCOL))) {
                        return;
                    }
                } else if (!g.a(g.this, map)) {
                    return;
                }
                jnv jnvVar2 = jnvVar;
                if (jnvVar2 != null) {
                    jnvVar2.a(i, mtopResponse, obj, jnyVar, (Map<String, ? extends Object>) map);
                }
                if (g.this.b() && !jnyVar.e()) {
                    g.this.d.b(false);
                }
                if (g.this.f2310a.j()) {
                    g.this.f2310a.a(true);
                }
                g.this.a(b2);
                g.this.a(requestConfig);
            }
        }, w, requestConfig.c());
        bVar.h(w2);
        return bcpVar.b();
    }

    private void a(Map<String, String> map, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afa36c", new Object[]{this, map, requestConfig});
            return;
        }
        bmz b = requestConfig.b();
        JSONObject a2 = a(map);
        a(a2, requestConfig);
        if (bei.e(this.f2310a.w()) > bem.m(this.f2310a)) {
            a2.put("exceedCheckNum", (Object) Boolean.TRUE.toString());
        } else {
            a2.put("exceedCheckNum", (Object) Boolean.FALSE.toString());
        }
        if (b.b(h.KEY_INSTALLMENT_TRANS_IN_EVENT) != null) {
            a2.putAll((JSONObject) b.b(h.KEY_INSTALLMENT_TRANS_IN_EVENT));
        }
        if (b.b("isCheckInPoplayer") != null) {
            a2.put("isCheckInPoplayer", b.b("isCheckInPoplayer"));
        } else {
            a2.remove("isCheckInPoplayer");
        }
        if (b.b("skuExtParams") instanceof Map) {
            a2.putAll((Map) b.b("skuExtParams"));
        }
        if (this.f2310a.n().n().d()) {
            a2.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        }
        int f = CheckHoldManager.a().f();
        if ("cartSelect".equals(requestConfig.b().b()) && f > bem.m(this.f2310a) && bem.j(this.f2310a) && bem.a(this.f2310a)) {
            a2.put("overMaxCheckCount", "true");
        }
        map.put("exParams", a2.toJSONString());
    }

    private com.alibaba.android.ultron.trade.data.request.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.trade.data.request.c) ipChange.ipc$dispatch("bea32c58", new Object[]{this}) : com.alibaba.android.icart.core.data.config.a.b(this.d);
    }

    private boolean b(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue() : c(map) == 1;
    }

    private int c(Map<String, ?> map) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2985bece", new Object[]{this, map})).intValue();
        }
        if (map != null && map.containsKey(j.STREAM_RESPONSE_NUM) && (num = (Integer) map.get(j.STREAM_RESPONSE_NUM)) != null) {
            return num.intValue();
        }
        return 1;
    }

    private void a(MtopResponse mtopResponse, Map<String, ?> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a61c1c", new Object[]{this, mtopResponse, map, new Boolean(z)});
            return;
        }
        int c = c(map);
        HashMap hashMap = new HashMap();
        hashMap.put(MtopStreamRequestCallback.IS_STREAM, String.valueOf(d(mtopResponse.getHeaderFields())));
        hashMap.put("seqNum", String.valueOf(c));
        hashMap.put(com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE, String.valueOf(z));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.d.v().f(), 19999, "Page_ShoppingCart_IgnoreCheck", "mtop.trade.update.bag", null, hashMap).build());
    }

    private boolean d(Map<String, List<String>> map) {
        List<String> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1127953e", new Object[]{this, map})).booleanValue() : map != null && (list = map.get("x-used-stream")) != null && !list.isEmpty() && "1".equals(list.get(0));
    }
}
