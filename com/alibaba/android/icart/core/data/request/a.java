package com.alibaba.android.icart.core.data.request;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bcb;
import tb.bcd;
import tb.bdm;
import tb.bdw;
import tb.bea;
import tb.bed;
import tb.beg;
import tb.bei;
import tb.bem;
import tb.bgd;
import tb.bmz;
import tb.jny;
import tb.jpo;
import tb.jqg;
import tb.jqi;
import tb.kge;
import tb.khz;

/* loaded from: classes2.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bcb f2310a;
    public Context b;
    public com.alibaba.android.icart.core.data.a c;
    public bbz d;

    static {
        kge.a(-1019879279);
        kge.a(1201665850);
    }

    public a(bcb bcbVar) {
        this.f2310a = bcbVar;
        this.d = bcbVar.n();
        this.b = bcbVar.n().m();
        this.c = new com.alibaba.android.icart.core.data.a(this.d);
    }

    public void a(JSONObject jSONObject, RequestConfig requestConfig) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2be117", new Object[]{this, jSONObject, requestConfig});
            return;
        }
        QueryParamsManager v = this.f2310a.n().v();
        jSONObject.put("globalSell", "1");
        jSONObject.put("mergeCombo", "true");
        jSONObject.put("version", "1.1.1");
        if (bgd.a()) {
            jSONObject.put(com.taobao.tao.log.statistics.d.PARAM_IS_INNER, (Object) String.valueOf(bgd.a()));
        }
        if (!StringUtils.isEmpty(bcd.a().c())) {
            jSONObject.put("addressId", (Object) bcd.a().c());
        }
        if (v.b() != null) {
            jSONObject.put("cartSortParams", (Object) v.b());
        }
        String d = this.f2310a.n().v().d();
        if (!StringUtils.isEmpty(d)) {
            jSONObject.put("cartCustomExParam", (Object) d);
        }
        String h = this.f2310a.o().h();
        if (!StringUtils.isEmpty(h)) {
            jSONObject.put("tabFilterItem", (Object) h);
        }
        if (!StringUtils.isEmpty(this.f2310a.b())) {
            jSONObject.put("filterItem", (Object) this.f2310a.b());
        }
        if (this.f2310a.o().b()) {
            jSONObject.put("isPromotionChecked", "true");
        }
        String u = this.f2310a.o().u();
        if (!StringUtils.isEmpty(u)) {
            jSONObject.put("transparentState", (Object) u);
        }
        if (!requestConfig.g() && bem.t(this.f2310a)) {
            jSONObject.put("mixCart", "true");
        }
        String n = this.d.v().n();
        if (!StringUtils.isEmpty(n)) {
            jSONObject.put("holdCustomExParams", (Object) n);
        }
        jSONObject.put("instanceId", (Object) this.f2310a.o().c());
        if (!requestConfig.f2303a && bdw.a(requestConfig, this.f2310a.w())) {
            jSONObject.put("hasDeleteQueryParam", "true");
            jpo.b(this.b).b("hasDeleteQueryParam", "true");
            this.f2310a.o().f(true);
            jqg.a("iCart", requestConfig.e().name(), "#删除上行queryParams");
            bed.a("deleteQueryParamStatus", "不上行QueryParams", true, 0.001f);
        } else {
            this.f2310a.o().f(false);
        }
        jSONObject.put("requestTimeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
        try {
            z = false;
            for (String str : bea.p()) {
                try {
                    if (!z2) {
                        z2 = khz.b(str);
                    }
                    if (!z) {
                        z = khz.a(str);
                    }
                } catch (Exception e) {
                    e = e;
                    bed.a("widgetGetInstalledError", e.getMessage());
                    jSONObject.put(RequestConfig.IS_SUPPORT_WIDGET, (Object) String.valueOf(z2));
                    jSONObject.put(RequestConfig.IS_WIDGET_INSTALLED, (Object) String.valueOf(z));
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        jSONObject.put(RequestConfig.IS_SUPPORT_WIDGET, (Object) String.valueOf(z2));
        jSONObject.put(RequestConfig.IS_WIDGET_INSTALLED, (Object) String.valueOf(z));
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if ((!"cartAdjustOperate".equals(str) && !"changeQuantity".equals(str) && !"cartShowSku".equals(str)) || this.f2310a.m().getControlParas() == null) {
        } else {
            this.f2310a.h();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!"reorderDrag".equals(str) && !"cartAdjustOperate".equals(str) && !"changeQuantity".equals(str) && !"closeBanner".equals(str) && !"cartShowSku".equals(str) && !"reorderClick".equals(str) && !"cartSelect".equals(str)) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putBoolean(beg.c, false);
            bundle.putString(beg.e, beg.h);
            bundle.putBoolean(beg.f, "cartSelect".equals(str));
            beg.a(this.b, bundle);
        }
    }

    public void a(RequestConfig requestConfig) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599879f7", new Object[]{this, requestConfig});
        } else if (requestConfig.m() == null || (headerFields = requestConfig.m().getHeaderFields()) == null || headerFields.get(HttpConstant.EAGLE_EYE_ID_2) == null || headerFields.get(HttpConstant.EAGLE_EYE_ID_2).isEmpty()) {
        } else {
            UnifyLog.b("AbsSendRequest", "requestType=" + requestConfig.e() + ",traceId=" + headerFields.get(HttpConstant.EAGLE_EYE_ID_2).get(0));
        }
    }

    public JSONObject a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3729093d", new Object[]{this, map});
        }
        String str = map.get("exParams");
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        return parseObject == null ? new JSONObject() : parseObject;
    }

    public boolean a(MtopResponse mtopResponse, Map<String, ? extends Object> map) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e44dbc", new Object[]{this, mtopResponse, map})).booleanValue();
        }
        bdm bdmVar = new bdm();
        if (mtopResponse != null && !mtopResponse.isApiSuccess()) {
            return false;
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) this.f2310a.w();
        if ((bVar != null && bVar.e() && this.f2310a.o().r() == null) || (map.containsKey("isCachaData") && "true".equals(map.get("isCachaData")))) {
            return false;
        }
        if (map != null) {
            Object obj = map.get("protocolVersion");
            if (obj instanceof String) {
                z = bdmVar.a((String) obj);
                if (z) {
                    jqg.b(this.d.s(), "购物车降级#奥创版本小于3.0");
                }
            } else {
                z = true;
            }
            if (z || bVar == null || !bVar.L()) {
                z2 = z;
            } else {
                jqg.b(this.d.s(), "购物车降级#奥创协议标记让降级");
            }
            if (z2) {
                bdmVar.a(this.d, mtopResponse, bdm.TYPE_PROTOCOL_DOWNGRADE);
            } else {
                bdmVar.a(this.d);
            }
        }
        return z2;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.f2310a.a() || !this.f2310a.l()) {
            return false;
        }
        if (bei.g(this.f2310a.w()) > 5) {
            return bem.k(this.f2310a);
        }
        return true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f2310a.l() && this.f2310a.a() && bei.g(this.f2310a.w()) <= 5;
    }

    public void b(RequestConfig requestConfig) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d27fe38", new Object[]{this, requestConfig});
        } else if (!jqi.a("iCart", "cartChangeIDMEvent", true)) {
        } else {
            jny w = this.f2310a.w();
            bmz b = requestConfig.b();
            if (w == null) {
                jqg.a("updateTriggerEventConfig", "idmContext is null");
            } else if (b == null || !"true".equals(String.valueOf(b.b("_isSupportChangeIDMEvent")))) {
            } else {
                IDMComponent b2 = w.b(requestConfig.a().getKey());
                if (b2 == null) {
                    jqg.a("updateTriggerEventConfig", "component is null");
                    return;
                }
                requestConfig.a(b2);
                if (b2.getEventMap() == null) {
                    jqg.a("updateTriggerEventConfig", "component.getEventMap is null");
                    return;
                }
                List<com.taobao.android.ultron.common.model.b> list = b2.getEventMap().get(b.f());
                com.taobao.android.ultron.common.model.b bVar = null;
                if (list != null) {
                    Iterator<com.taobao.android.ultron.common.model.b> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.taobao.android.ultron.common.model.b next = it.next();
                        if (StringUtils.equals(b.b(), next.getType())) {
                            bVar = next;
                            break;
                        }
                    }
                }
                if (bVar == null || bVar == b.e()) {
                    return;
                }
                if ((b.e() instanceof com.taobao.android.ultron.common.model.b) && (fields = ((com.taobao.android.ultron.common.model.b) b.e()).getFields()) != null && fields.getInnerMap() != null) {
                    bVar.getFields().putAll(fields.getInnerMap());
                }
                b.a(bVar);
            }
        }
    }
}
