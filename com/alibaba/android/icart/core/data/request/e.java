package com.alibaba.android.icart.core.data.request;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ultronengine.event.s;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.t;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.MtopResponse;
import tb.akg;
import tb.bcb;
import tb.bcq;
import tb.bcs;
import tb.bct;
import tb.bdx;
import tb.beh;
import tb.bei;
import tb.bem;
import tb.ben;
import tb.bex;
import tb.jnv;
import tb.jny;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1262730293);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d318e170", new Object[]{eVar});
        } else {
            eVar.f();
        }
    }

    public static /* synthetic */ void a(e eVar, jny jnyVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492a761d", new Object[]{eVar, jnyVar, context});
        } else {
            eVar.a(jnyVar, context);
        }
    }

    public e(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // com.alibaba.android.icart.core.data.request.b
    public String a(final RequestConfig requestConfig, final jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880760cb", new Object[]{this, requestConfig, jnvVar});
        }
        bex.c(this.d, "Page_ShoppingCart_Query", new String[0]);
        this.f2310a.o().g(true);
        this.f2310a.o().a((Object) bei.h(this.f2310a.w()));
        bcq a2 = a(d());
        a2.a(c(requestConfig));
        a2.b(new bct(jnvVar) { // from class: com.alibaba.android.icart.core.data.request.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bct, tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                jnv jnvVar2 = jnvVar;
                if (jnvVar2 != null) {
                    jnvVar2.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
                }
                if (mtopResponse == null || e.this.a(mtopResponse, (Map<String, ? extends Object>) map)) {
                    return;
                }
                com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) e.this.f2310a.w();
                if ((bVar != null && bVar.e() && e.this.f2310a.o().r() == null) || (map != null && map.containsKey("isCachaData") && "true".equals(map.get("isCachaData")))) {
                    e.this.f2310a.h();
                } else {
                    e.this.d.l().a(1, mtopResponse);
                }
            }

            @Override // tb.bct, tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                jnv jnvVar2 = jnvVar;
                if (jnvVar2 != null) {
                    jnvVar2.a(i, mtopResponse, obj, jnyVar, (Map<String, ? extends Object>) map);
                }
                e.this.d.l().a(mtopResponse);
                if (mtopResponse == null || e.this.a(mtopResponse, (Map<String, ? extends Object>) map)) {
                    return;
                }
                if ((e.this.a() || e.this.b()) && !jnyVar.e()) {
                    e.this.d.h().d();
                }
                if (e.this.f2310a.j()) {
                    e.this.f2310a.a(true);
                }
                beh.a(e.this.f2310a, jnyVar);
                com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) e.this.f2310a.w();
                if ((bVar == null || !bVar.e()) && (!map.containsKey("isCachaData") || !"true".equals(map.get("isCachaData")))) {
                    String u = bem.u(e.this.f2310a);
                    if (!TextUtils.isEmpty(u)) {
                        bdx.a("SendQueryRequest", "netRequest", "WAKEUP_ERROR", u, e.this.d.v().b());
                        e.this.d.v().c();
                        com.alibaba.android.icart.core.widget.d.a(e.this.b, u);
                    }
                }
                e.this.d.r().a();
                e eVar = e.this;
                e.a(eVar, jnyVar, eVar.b);
                e.a(e.this);
                e.this.a(requestConfig);
            }
        }, null, null);
        return a2.b();
    }

    public bcq a(com.alibaba.android.ultron.trade.data.request.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bcq) ipChange.ipc$dispatch("be393ba0", new Object[]{this, cVar});
        }
        bcs bcsVar = new bcs(this.f2310a, this.f2310a.n().m(), cVar, "query");
        bcsVar.d().a(false).b(true);
        return bcsVar;
    }

    public HashMap<String, String> c(RequestConfig requestConfig) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("29be6b9c", new Object[]{this, requestConfig});
        }
        Map<String, String> d = requestConfig.d();
        QueryParamsManager v = this.f2310a.n().v();
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String a2 = ben.a(this.f2310a.n().m());
            String c = c(v.a());
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, requestConfig);
            if (!TextUtils.isEmpty(a2)) {
                jSONObject.put("shopIdInfoStr", (Object) a2);
            }
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put(s.DIVISION_CODE, (Object) c);
            }
            if (v.h()) {
                jSONObject.put(RequestConfig.IS_FULL_DATA_QUERY, "true");
            }
            if (v.i() && !v.k()) {
                if (!CheckHoldManager.a().c().isEmpty()) {
                    jSONObject.put("iCheckedCartIds", (Object) CheckHoldManager.a().d());
                }
                if (!CheckHoldManager.a().e().isEmpty()) {
                    jSONObject.put("iCheckedCartIdsForRepeatBuy", (Object) CheckHoldManager.a().e());
                }
            }
            if (d != null) {
                jSONObject.putAll(RequestConfig.a(d));
            }
            if (this.f2310a.d()) {
                jSONObject.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
            }
            if (bem.c(this.f2310a)) {
                if (this.f2310a.o().n() && !"repeatBuy".equals(this.f2310a.b())) {
                    jSONObject.put("isSubmitChecked", "true");
                }
            } else {
                IDMComponent e = this.f2310a.e("submit");
                if (e != null && (fields = e.getFields()) != null && "true".equals(fields.getString("isChecked"))) {
                    jSONObject.put("isSubmitChecked", "true");
                }
            }
            if (requestConfig.g()) {
                jSONObject.put("onceCustomExParams", (Object) this.d.v().m());
            }
            if (akg.b() && !this.f2310a.g()) {
                jSONObject.put(RequestConfig.NO_CACHE_OF_FIRST_PAGE, "true");
            }
            hashMap.put("exParams", jSONObject.toJSONString());
        } catch (Throwable th) {
            UnifyLog.a(this.f2310a.n().s(), "SendQueryRequest", "getOtherParams exception: ", th.getMessage());
        }
        return hashMap;
    }

    public com.alibaba.android.ultron.trade.data.request.c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.trade.data.request.c) ipChange.ipc$dispatch("4bddddd9", new Object[]{this}) : com.alibaba.android.icart.core.data.config.a.a(this.d);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (!QueryParamsManager.TMALL_MARKET_CART_FROM.equalsIgnoreCase(str) && !jqi.a("iCart", "extractDivisionCode", false)) {
            return null;
        }
        return e();
    }

    public static String e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        try {
            str = CookieManager.getInstance().getCookie(".tmall.com");
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(?:^|;)\\s*sm4=([^;]*)").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private void a(jny jnyVar, Context context) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b62a25", new Object[]{this, jnyVar, context});
            return;
        }
        JSONObject c = jnyVar.c();
        if (c == null || (jSONObject = c.getJSONObject("feature")) == null || (jSONObject2 = jSONObject.getJSONObject("otherParams")) == null) {
            return;
        }
        String string = jSONObject2.getString("dataTracks");
        if (TextUtils.isEmpty(string) || context == null) {
            return;
        }
        UTABTest.activateServer(string, context);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            JSONObject popWindow = this.f2310a.m().getControlParas().getPopWindow();
            if (popWindow == null) {
                return;
            }
            String string = popWindow.getString("url");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            t.a().a(this.b).a(string);
        } catch (Throwable unused) {
        }
    }
}
