package com.alibaba.android.icart.core.event;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.uc.webview.export.extension.UCClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.bbz;
import tb.bca;
import tb.bdx;
import tb.bdy;
import tb.bed;
import tb.bei;
import tb.bem;
import tb.bex;
import tb.bmz;
import tb.bqf;
import tb.jqh;
import tb.kge;
import tb.xib;

/* loaded from: classes2.dex */
public class ad extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_PARAM = "buyParam";
    public static final String CARTIDS = "cartIds";
    public static final String NAV_URL_PURCHASE = "http://h5.m.taobao.com/awp/base/buy.htm";
    public static final String PURCHASE_FROM = "purchase_from";
    public static final int PURCHASE_FROM_CART = 1;
    public static final int REQUEST_CODE_TO_ORDER;
    public static final int REQUEST_CODE_TO_ORDER_H5;
    public static int c;
    private static boolean l;
    private static long m;
    private boolean k;
    private String n;

    public static /* synthetic */ Object ipc$super(ad adVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ bbz a(ad adVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("795b1114", new Object[]{adVar}) : adVar.f25791a;
    }

    public static /* synthetic */ void a(ad adVar, bmz bmzVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f48d83", new Object[]{adVar, bmzVar, str});
        } else {
            adVar.a(bmzVar, str);
        }
    }

    static {
        kge.a(-1106693986);
        c = 100;
        c = 101;
        REQUEST_CODE_TO_ORDER = 101;
        int i = c + 1;
        c = i;
        REQUEST_CODE_TO_ORDER_H5 = i;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(final bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<IDMComponent> list = (List) bmzVar.e();
        this.k = xib.a(list, this.b);
        if (a(bmzVar, list)) {
            m = currentTimeMillis;
            return;
        }
        bqf.a(m, currentTimeMillis, l);
        bed.a(bed.a.b("settlementClick").a("结算按钮点击").a(0.001f));
        this.f25791a.x().a(true);
        this.n = c(bmzVar);
        String str = "";
        String str2 = str;
        for (IDMComponent iDMComponent : list) {
            str = str + a(iDMComponent) + ",";
            str2 = str2 + b(iDMComponent) + ",";
        }
        String substring = str.substring(0, str.length() - 1);
        final String substring2 = str2.substring(0, str2.length() - 1);
        String a2 = am.a(bmzVar.c(), list);
        a a3 = a(list);
        bdy bdyVar = new bdy(this.f25791a);
        if (a3.a()) {
            String b = a3.b();
            if (b != null) {
                a(substring, substring2, b, bdyVar, a2, currentTimeMillis);
                return;
            }
            String c2 = a3.c();
            if (c2 == null || c2.length() <= 0) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("isPostUrl", true);
            String str3 = "cartId=" + substring2;
            String str4 = "{\"items\":[";
            for (IDMComponent iDMComponent2 : list) {
                String str5 = (String) bei.a(iDMComponent2, (Class<Object>) String.class, "h5CartParam");
                if (!TextUtils.isEmpty(str5)) {
                    str4 = str4 + str5 + ",";
                }
            }
            bundle.putString("postdata", str3 + "&cart_param=" + str4.substring(0, str4.length() - 1) + "]}");
            bdyVar.a(this.h, c2, REQUEST_CODE_TO_ORDER_H5, bundle, true);
            UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
            return;
        }
        a(substring, substring2, null, bdyVar, a2, currentTimeMillis);
        jqh.a(new Runnable() { // from class: com.alibaba.android.icart.core.event.ad.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    bdx.a(bmzVar);
                    ad.a(ad.this, bmzVar, substring2);
                    TBS.Adv.ctrlClickedOnPage(ad.a(ad.this).v().f(), CT.Button, "Pay");
                } catch (Throwable th) {
                    bed.a("AsyncChargeTrackException", th.toString());
                }
            }
        });
    }

    private String c(bmz bmzVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cc00815", new Object[]{this, bmzVar});
        }
        JSONObject jSONObject2 = (JSONObject) bmzVar.b("eventFields");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG)) != null) {
            return jSONObject.toJSONString();
        }
        return null;
    }

    private boolean a(bmz bmzVar, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50adedde", new Object[]{this, bmzVar, list})).booleanValue();
        }
        if (!"onActionDown".equals(bmzVar.b(UCClient.UI_PARAMS_KEY_GESTURE))) {
            return false;
        }
        String b = b(list);
        boolean equals = "true".equals(b);
        l = equals;
        bqf.a(equals, b);
        return true;
    }

    private String b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2162506", new Object[]{this, list});
        }
        if (list == null) {
            return "toChargeList_is_null";
        }
        String str = "";
        String str2 = str;
        for (IDMComponent iDMComponent : list) {
            str2 = str2 + b(iDMComponent) + ",";
            str = str + a(iDMComponent) + ",";
        }
        String substring = str.substring(0, str.length() - 1);
        String substring2 = str2.substring(0, str2.length() - 1);
        a a2 = a(list);
        String b = a2.b();
        return (!a2.a() || b != null) ? a(substring, substring2, b, new bdy(this.f25791a)) : "order_buy_h5";
    }

    private void a(bmz bmzVar, String str) {
        List<IDMComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62ff473", new Object[]{this, bmzVar, str});
        } else if (bmzVar != null && (list = (List) bmzVar.e()) != null && list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent.getFields() != null) {
                    String string = iDMComponent.getFields().getString("bizCode");
                    if (!TextUtils.isEmpty(string) && !arrayList.contains(string)) {
                        arrayList.add(string);
                        sb.append(string);
                        sb.append(",");
                    }
                }
            }
            String string2 = (bmzVar.c() == null || bmzVar.c().getFields() == null) ? "" : bmzVar.c().getFields().getString("isChecked");
            bbz bbzVar = this.f25791a;
            bex.a(bbzVar, "Page_ShoppingCart_Button-Pay", "selectedBizCode=" + sb.toString(), "isSelectAll=" + string2, "item=" + str);
        }
    }

    private a a(List<IDMComponent> list) {
        CartGlobal.ControlParas controlParas;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("451c0bcc", new Object[]{this, list});
        }
        a aVar = new a();
        aVar.a(false);
        CartGlobal m2 = this.b.m();
        if (m2 != null && (controlParas = m2.getControlParas()) != null && (controlParas.getOrderByH5Urls() != null || controlParas.getOrderByNative() != null)) {
            HashSet hashSet = new HashSet();
            if (list == null) {
                return aVar;
            }
            Iterator<IDMComponent> it = list.iterator();
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IDMComponent next = it.next();
                if (next != null) {
                    String str = (String) bei.a(next, (Class<Object>) String.class, "exclude");
                    if (!TextUtils.isEmpty(str)) {
                        String a2 = a(str, controlParas);
                        String a3 = xib.a(str, controlParas);
                        a aVar3 = new a();
                        aVar3.a(false);
                        if (a2 != null || a3 != null) {
                            aVar3.a(true);
                            aVar3.a(a3);
                            aVar3.b(a2);
                            aVar2 = aVar3;
                        }
                        if (hashSet.size() > 0 && !hashSet.contains(aVar3)) {
                            z = false;
                            break;
                        }
                        hashSet.add(aVar3);
                    } else {
                        continue;
                    }
                }
            }
            return (!z || aVar2 == null) ? aVar : aVar2;
        }
        return aVar;
    }

    private String a(String str, CartGlobal.ControlParas controlParas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa764e06", new Object[]{this, str, controlParas});
        }
        JSONObject orderByH5Urls = controlParas.getOrderByH5Urls();
        if (orderByH5Urls == null) {
            return null;
        }
        return orderByH5Urls.getString(str);
    }

    private String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent}) : (iDMComponent == null || iDMComponent.getFields() == null) ? "" : iDMComponent.getFields().getString("settlement");
    }

    private String b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("759a0cf5", new Object[]{this, iDMComponent}) : (iDMComponent == null || iDMComponent.getFields() == null) ? "" : iDMComponent.getFields().getString("cartId");
    }

    private HashMap<String, Object> a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d9b8c029", new Object[]{this, str, str2, str3});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (xib.a(this.g)) {
            hashMap.put("buyParam", str);
            hashMap.put("isSettlementAlone", "true");
        } else {
            hashMap.put("cartIds", str2);
        }
        if (str3 != null) {
            hashMap.put("exParams", "{\"novad\":\"" + str3 + "\"}");
        }
        a(hashMap);
        return hashMap;
    }

    private String a(String str, String str2, String str3, bdy bdyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c473da1", new Object[]{this, str, str2, str3, bdyVar}) : this.e == null ? "context_is_null" : bdyVar.a(this.h, a(str, str2, str3, null, -1L));
    }

    private void a(String str, String str2, String str3, bdy bdyVar, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abf92fb", new Object[]{this, str, str2, str3, bdyVar, str4, new Long(j)});
        } else if (this.e == null) {
        } else {
            bdyVar.a(this.h, this.k ? "http://h5.m.taobao.com/awp/base/buy.htm?pageType=float&openFrom=carts" : "http://h5.m.taobao.com/awp/base/buy.htm", REQUEST_CODE_TO_ORDER, a(str, str2, str3, str4, j), false);
            UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
        }
    }

    private Bundle a(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("e7e58bf8", new Object[]{this, str, str2, str3, str4, new Long(j)});
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("buildOrderParams", a(str, str2, str3));
        bundle.putInt("purchase_from", 1);
        if (j != -1) {
            bundle.putLong("START_CLICK_TIME", j);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("PRELOAD", str4);
        }
        if (this.k) {
            bundle.putString("pageType", PopStrategy.IDENTIFIER_FLOAT);
            bundle.putString("openFrom", "carts");
        }
        if (!TextUtils.isEmpty(this.n)) {
            bundle.putString(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, this.n);
        }
        return bundle;
    }

    private void a(HashMap<String, Object> hashMap) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else if (hashMap == null) {
        } else {
            Object obj = hashMap.get("exParams");
            if (obj instanceof String) {
                jSONObject = JSONObject.parseObject((String) obj);
            } else {
                jSONObject = new JSONObject();
            }
            boolean a2 = this.f25791a.l().a();
            if (this.h == null || this.h.getFields() == null || !this.h.getFields().getBooleanValue("isHideCalculateBtn")) {
                z = false;
            }
            JSONObject o = bem.o(this.b);
            if (a2) {
                jSONObject.put("cartIsLoading", (Object) Boolean.valueOf(a2));
            }
            if (z) {
                jSONObject.put("cartIsLocalCalculate", (Object) Boolean.valueOf(z));
            }
            if (o != null && o.getString("traceId") != null) {
                jSONObject.put("cartTraceId", (Object) o.getString("traceId"));
            }
            JSONObject C = bem.C(this.b);
            if (C != null) {
                jSONObject.putAll(C);
            }
            hashMap.put("exParams", jSONObject.toJSONString());
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f2325a;
        private String b;
        private String c;

        static {
            kge.a(983054147);
        }

        private a() {
            this.f2325a = true;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2325a;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f2325a = z;
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.f2325a ? 0 : 1;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a() != aVar.a()) {
                return false;
            }
            if (b() != null || aVar.b() != null) {
                if (b() != null && aVar.b() != null) {
                    return b().equals(aVar.b());
                }
                return false;
            } else if (c() == null && aVar.c() == null) {
                return true;
            } else {
                if (c() != null && aVar.c() != null) {
                    return c().equals(aVar.c());
                }
                return false;
            }
        }
    }
}
