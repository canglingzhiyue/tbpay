package com.taobao.android.sku;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.sku.c;
import com.taobao.android.sku.hybrid.SkuWebView;
import com.taobao.android.sku.hybrid.a;
import com.taobao.android.sku.hybrid.b;
import com.taobao.android.sku.hybrid.c;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.p;
import com.taobao.android.sku.utils.q;
import com.taobao.android.sku.utils.r;
import com.taobao.android.t;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ixt;
import tb.kge;
import tb.mrm;
import tb.tfu;

/* loaded from: classes6.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TOKEN_FROM_DOWNGRADE_SKUH5URL = "isFromDowngradeSkuH5Url";

    /* renamed from: a */
    private Context f15153a;
    private f b;
    private c c;
    private com.taobao.android.sku.data.a d;
    private com.taobao.android.sku.presenter.c e;
    private String h;
    private volatile SkuWebView i;
    private ViewGroup j;
    private b k;
    private volatile boolean l;
    private boolean n;
    private boolean o;
    private String p;
    private String f = "";
    private String g = "ADDCART_AND_BUYNOW";
    private List<c.a> m = new ArrayList();

    static {
        kge.a(-361504143);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ c a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f4577dcf", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ void a(d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8774e0c", new Object[]{dVar, str, str2});
        } else {
            dVar.a(str, str2);
        }
    }

    public static /* synthetic */ void a(d dVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39418cd6", new Object[]{dVar, str, str2, str3});
        } else {
            dVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ String b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5cf087", new Object[]{dVar}) : dVar.g;
    }

    public static /* synthetic */ String c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48279266", new Object[]{dVar}) : dVar.f;
    }

    public d(f fVar, c cVar, Context context, com.taobao.android.sku.data.a aVar, com.taobao.android.sku.presenter.c cVar2) {
        this.b = fVar;
        this.c = cVar;
        this.f15153a = context;
        if (this.f15153a == null) {
            this.f15153a = q.a();
        }
        this.e = cVar2;
        this.d = aVar;
        this.k = new b();
    }

    public void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
        } else if (linearLayout == null) {
        } else {
            this.j = linearLayout;
            this.j.setClickable(true);
            this.j.setBackgroundColor(-1);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        Log.e("H5 SKU", "H5 SKU Container Clicked");
                    }
                }
            });
        }
    }

    private synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.i == null) {
            this.i = new SkuWebView(this.f15153a);
            if (this.j != null) {
                this.j.removeAllViews();
                View view = new View(this.f15153a);
                view.setBackgroundColor(-45055);
                this.j.addView(view, -1, 2);
                this.j.addView(this.i, -1, -1);
            }
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.l) {
        } else {
            com.taobao.android.sku.hybrid.f fVar = new com.taobao.android.sku.hybrid.f();
            fVar.a(this);
            c.a aVar = new c.a(fVar);
            this.m.add(aVar);
            com.taobao.android.sku.hybrid.c.a(aVar);
            this.l = true;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            i();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            i();
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        boolean b = b(str);
        boolean c = c(str);
        if ((b && !c) || this.i == null) {
            return;
        }
        this.i.loadUrl(str);
        this.p = str;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(Uri.parse(str).getQueryParameter("sku_keep_alive"));
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : str == null || !str.equals(this.p);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a((c.b) null);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void a(String str, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68017a5", new Object[]{this, str, bVar});
            return;
        }
        i();
        g();
        h();
        a(str);
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void a(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b06adb", new Object[]{this, bVar});
        } else {
            a(this.h, bVar);
        }
    }

    private void i() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.f = this.d.b();
        this.h = this.d.a(this.c.r());
        JSONObject g = this.d.g();
        if (g == null || (jSONObject = g.getJSONObject("id_biz_bottom")) == null) {
            return;
        }
        String string = jSONObject.getString("bottomMode");
        if (StringUtils.isEmpty(string)) {
            string = "ADDCART_AND_BUYNOW";
        }
        this.g = string;
    }

    private void j() {
        ixt q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (!this.o && (q = this.c.q()) != null) {
            q.a(a("CLOSE_BTN", null, null, null, null, null, null, null, null));
        }
        this.e.c();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (c.a aVar : this.m) {
            com.taobao.android.sku.hybrid.c.b(aVar);
        }
        if (this.i == null) {
            return;
        }
        this.i.destroy();
        this.p = null;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.n;
    }

    @Override // com.taobao.android.sku.hybrid.a
    public String a(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ff85b56", new Object[]{this, new Integer(i), map});
        }
        if (i == 7) {
            return new JSONObject() { // from class: com.taobao.android.sku.H5Core$2
                {
                    put("extInput", (Object) d.a(d.this).g().g());
                }
            }.toJSONString();
        }
        if (i != 10) {
            return null;
        }
        JSONObject h = this.c.g().h();
        if (h == null || h.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mtopStr", (Object) h.toJSONString());
        return jSONObject.toJSONString();
    }

    @Override // com.taobao.android.sku.hybrid.d
    public boolean b(int i, Map<String, String> map) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c62340f", new Object[]{this, new Integer(i), map})).booleanValue();
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                if (!StringUtils.isEmpty(this.g)) {
                    z = "ADDCART".equals(this.g);
                    z2 = "BUYNOW".equals(this.g);
                    if ("CONFIRM".equals(this.g)) {
                        z3 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                Map<String, String> map2 = this.k.d;
                if (map2.containsKey("forceBuyNow")) {
                    try {
                        if (Boolean.parseBoolean(map2.get("forceBuyNow"))) {
                            z2 = true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (z2) {
                    l();
                } else if (z) {
                    k();
                } else if (z3) {
                    m();
                }
                j();
                break;
            case 4:
                j();
                return true;
            case 5:
            case 6:
                if (map != null) {
                    this.k.a(map);
                    break;
                } else {
                    return false;
                }
            case 8:
                this.k.a();
                break;
            case 9:
                n();
                return true;
        }
        return true;
    }

    private String a(Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        JSONObject g = this.d.g();
        if (g != null && (jSONObject = g.getJSONObject("storedData")) != null && (jSONObject2 = jSONObject.getJSONObject("transparent_map")) != null && !jSONObject2.isEmpty()) {
            hashMap.putAll(jSONObject2);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        hashMap.put("serviceId", this.k.c);
        JSONObject h = this.d.h();
        if (h != null) {
            try {
                JSONObject jSONObject3 = h.getJSONObject("trade").getJSONObject("cartParam");
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    hashMap.putAll(jSONObject3);
                }
            } catch (Throwable unused) {
            }
            try {
                String string = h.getJSONObject(ShippingNode.TAG).getString(mrm.KEY_AREA_ID);
                if (!StringUtils.isEmpty(string)) {
                    hashMap.put("divisionId", string);
                }
            } catch (Throwable unused2) {
            }
        }
        return JSONObject.toJSONString(hashMap);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        String str = this.f;
        final String valueOf = String.valueOf(this.k.b);
        final String str2 = this.k.f15179a;
        com.taobao.android.sku.network.c cVar = new com.taobao.android.sku.network.c(this.f15153a, new com.taobao.android.sku.network.b(str, str2, valueOf, a(this.k.d), this.c.b()));
        cVar.a(new IRemoteBaseListener() { // from class: com.taobao.android.sku.H5Core$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    d.a(d.this, str2, valueOf, mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    d.a(d.this, str2, valueOf);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    d.a(d.this, str2, valueOf, mtopResponse.getRetMsg());
                }
            }
        });
        cVar.a();
    }

    private JSONObject a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6a97a3a2", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9}) : new JSONObject() { // from class: com.taobao.android.sku.H5Core$4
            {
                put("actionFrom", (Object) (!StringUtils.isEmpty(str) ? str : "NULL"));
                put("inputMode", (Object) d.b(d.this));
                put("buyNow", (Object) new JSONObject() { // from class: com.taobao.android.sku.H5Core$4.1
                    {
                        put("itemId", (Object) d.c(d.this));
                        put("skuId", (Object) str2);
                        put("quantity", (Object) str3);
                        String str10 = "";
                        put("serviceId", (Object) (!StringUtils.isEmpty(str4) ? str4 : str10));
                        put("tgKey", (Object) (!StringUtils.isEmpty(str5) ? str5 : str10));
                        put(com.taobao.android.detail.core.event.subscriber.trade.b.K_BOOKING_DATE, (Object) (!StringUtils.isEmpty(str6) ? str6 : str10));
                        put(com.taobao.android.detail.core.event.subscriber.trade.b.K_ENTRANCE_DATE, (Object) (!StringUtils.isEmpty(str7) ? str7 : str10));
                        put("exParams", (Object) (!StringUtils.isEmpty(str8) ? str8 : str10));
                    }
                });
                put(tfu.ADD_CART, (Object) new JSONObject() { // from class: com.taobao.android.sku.H5Core$4.2
                    {
                        put("itemId", (Object) d.c(d.this));
                        put("skuId", (Object) str2);
                        put("quantity", (Object) str3);
                        put("exParams", (Object) (!StringUtils.isEmpty(str9) ? str9 : ""));
                    }
                });
            }
        };
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.o = true;
        if (StringUtils.isEmpty(str3)) {
            str3 = "小二很忙，系统很累，请稍后重试!";
        }
        p.a(this.f15153a, 3, str3, "");
        ixt q = this.c.q();
        if (q == null) {
            return;
        }
        q.a(a("ADD_CART_FAILED", str, str2, null, null, null, null, null, null));
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.o = true;
        p.a(this.f15153a, 2, "添加成功，在购物车等亲~", "");
        ixt q = this.c.q();
        if (q == null) {
            return;
        }
        q.a(a("ADD_CART_SUCCESS", str, str2, null, null, null, null, null, null));
    }

    private String b(Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        JSONObject g = this.d.g();
        if (g != null && (jSONObject = g.getJSONObject("storedData")) != null && (jSONObject2 = jSONObject.getJSONObject("transparent_map")) != null && !jSONObject2.isEmpty()) {
            hashMap.putAll(jSONObject2);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        JSONObject h = this.d.h();
        if (h != null) {
            try {
                JSONObject jSONObject3 = h.getJSONObject("trade").getJSONObject("buyParam");
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    hashMap.putAll(jSONObject3);
                }
            } catch (Throwable unused) {
            }
            try {
                String string = h.getJSONObject(ShippingNode.TAG).getString("addressId");
                if (!StringUtils.isEmpty(string)) {
                    hashMap.put("addressId", string);
                }
            } catch (Throwable unused2) {
            }
        }
        return JSONObject.toJSONString(hashMap);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        String str = this.f;
        String valueOf = String.valueOf(this.k.b);
        String str2 = this.k.f15179a;
        String str3 = this.k.c;
        String b = b(this.k.d);
        String str4 = this.k.d.get("tgKey");
        String str5 = this.k.d.get(com.taobao.android.detail.core.event.subscriber.trade.b.K_BOOKING_DATE);
        String str6 = this.k.d.get(com.taobao.android.detail.core.event.subscriber.trade.b.K_ENTRANCE_DATE);
        HashMap hashMap = new HashMap();
        hashMap.put("buyNow", "true");
        hashMap.put("itemId", str);
        hashMap.put("skuId", str2);
        hashMap.put("quantity", valueOf);
        hashMap.put("serviceId", str3);
        hashMap.put("tgKey", str4);
        hashMap.put(com.taobao.android.detail.core.event.subscriber.trade.b.K_BOOKING_DATE, str5);
        hashMap.put(com.taobao.android.detail.core.event.subscriber.trade.b.K_ENTRANCE_DATE, str6);
        hashMap.put("exParams", b);
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_from", 2);
        bundle.putSerializable("buildOrderParams", hashMap);
        AliNavServiceInterface a2 = t.a();
        if (a2 != null) {
            a2.a(this.f15153a).a(bundle).a("https://h5.m.taobao.com/awp/base/buy.htm?preBizName=taobao_sku");
        }
        this.o = true;
        ixt q = this.c.q();
        if (q == null) {
            return;
        }
        q.a(a("CONFIRM".equals(this.g) ? "CONFIRM_DISMISS" : "BUY_NOW", str2, valueOf, str3, str4, str5, str6, b, null));
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        String str = this.f;
        String valueOf = String.valueOf(this.k.b);
        String str2 = this.k.f15179a;
        String str3 = this.k.c;
        String b = b(this.k.d);
        String a2 = a(this.k.d);
        String str4 = this.k.d.get("tgKey");
        String str5 = this.k.d.get(com.taobao.android.detail.core.event.subscriber.trade.b.K_BOOKING_DATE);
        String str6 = this.k.d.get(com.taobao.android.detail.core.event.subscriber.trade.b.K_ENTRANCE_DATE);
        HashMap hashMap = new HashMap();
        hashMap.put("buyNow", "true");
        hashMap.put("itemId", str);
        hashMap.put("skuId", str2);
        hashMap.put("quantity", valueOf);
        hashMap.put("serviceId", str3);
        hashMap.put("tgKey", str4);
        hashMap.put(com.taobao.android.detail.core.event.subscriber.trade.b.K_BOOKING_DATE, str5);
        hashMap.put(com.taobao.android.detail.core.event.subscriber.trade.b.K_ENTRANCE_DATE, str6);
        hashMap.put("exParams", b);
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_from", 2);
        bundle.putSerializable("buildOrderParams", hashMap);
        this.o = true;
        ixt q = this.c.q();
        if (q == null) {
            return;
        }
        q.a(a("CONFIRM_DISMISS", str2, valueOf, str3, str4, str5, str6, b, a2));
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.b.b(TOKEN_FROM_DOWNGRADE_SKUH5URL);
        r.a(this.c.o(), "degradeSkuH5Url 降级至 native");
        o.d("nativeMode", "degradeSkuH5Url 降级至 native");
        this.c.a(2, 1);
        this.c.a(-700008, "");
    }
}
