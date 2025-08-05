package com.taobao.android.icart.event;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.bbz;
import tb.bca;
import tb.bdx;
import tb.beb;
import tb.bed;
import tb.bex;
import tb.bga;
import tb.bmz;
import tb.bpp;
import tb.gny;
import tb.gnz;
import tb.goa;
import tb.kge;
import tb.mrm;

/* loaded from: classes5.dex */
public class h extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BUY_METHOD_IN_EVENT = "id_biz_buy_method";
    public static final String KEY_INSTALLMENT_TRANS_IN_EVENT = "key_installment_param";

    static {
        kge.a(-763413030);
    }

    public static /* synthetic */ IDMComponent a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("b435ef61", new Object[]{hVar}) : hVar.h;
    }

    public static /* synthetic */ boolean a(h hVar, com.taobao.android.ultron.common.model.b bVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd459ddd", new Object[]{hVar, bVar, map})).booleanValue() : hVar.a(bVar, map);
    }

    public static /* synthetic */ com.taobao.android.ultron.common.model.b b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("c791f647", new Object[]{hVar}) : hVar.b();
    }

    public static /* synthetic */ IDMComponent c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("408b00e3", new Object[]{hVar}) : hVar.h;
    }

    public static /* synthetic */ bmz d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmz) ipChange.ipc$dispatch("2f943937", new Object[]{hVar}) : hVar.d;
    }

    public static /* synthetic */ bbz e(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("e90b9d8b", new Object[]{hVar}) : hVar.f25791a;
    }

    public static /* synthetic */ bbz f(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("a2832b2a", new Object[]{hVar}) : hVar.f25791a;
    }

    public static /* synthetic */ IDMComponent g(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("593523e7", new Object[]{hVar}) : hVar.h;
    }

    public static /* synthetic */ bbz h(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("15724668", new Object[]{hVar}) : hVar.f25791a;
    }

    public static /* synthetic */ Context i(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("dfd2d1dd", new Object[]{hVar}) : hVar.e;
    }

    public static /* synthetic */ Context j(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d362561e", new Object[]{hVar}) : hVar.e;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(final bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        final JSONObject c = c();
        if (c == null) {
            return;
        }
        String string = c.getString("itemId");
        final String string2 = bmzVar.c().getFields().getString("cartId");
        String string3 = c.getString("skuId");
        String str = null;
        JSONObject jSONObject = bmzVar.c().getFields().getJSONObject("sku");
        if (jSONObject != null) {
            str = jSONObject.getString("isForbidH5");
        }
        String string4 = c.getString(mrm.KEY_AREA_ID);
        if (!c.getBoolean("editable").booleanValue()) {
            String string5 = c.getString("invalidMsg");
            if (TextUtils.isEmpty(string5)) {
                string5 = this.e.getString(R.string.cart_msg_cannot_modify);
            }
            com.alibaba.android.icart.core.widget.d.a(this.e, string5);
            bpp.a().commitFeedback("iCart", string5, UmTypeKey.TOAST, "biz", c != null ? JSONObject.toJSONString(c) : "empty");
            bed.a("skuUneditable", string5);
            return;
        }
        bex.a(this.f25791a, "Page_ShoppingCart_Item_SKU_Select", beb.a(this.h, this.f25791a, new String[0]));
        bex.a(this.f25791a, "Page_ShoppingCart_General-ReselectClick", new String[0]);
        gnz a2 = gnz.a(string, string3, string4, str);
        JSONObject jSONObject2 = c.getJSONObject("skuExtParams");
        if (jSONObject2 != null) {
            a2.d = jSONObject2;
            a2.f = jSONObject2.getJSONObject("installmentUpdateInfo");
        }
        if (c.containsKey("skuTransparent")) {
            if (a2.g == null) {
                a2.g = new JSONObject();
            }
            JSONObject jSONObject3 = c.getJSONObject("skuTransparent");
            a2.i.addAll(jSONObject3.keySet());
            a2.g.putAll(jSONObject3);
        }
        goa.a(a2).a(new gny() { // from class: com.taobao.android.icart.event.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gny
            public void a(gnz gnzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea9ea585", new Object[]{this, gnzVar});
                    return;
                }
                String str2 = gnzVar.b;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject4 = null;
                try {
                    jSONObject4 = JSON.parseObject(gnzVar.e);
                } catch (Exception unused) {
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(h.a(h.this).getKey());
                bmzVar.a("operateItems", arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put("skuId", str2);
                h hVar = h.this;
                h.a(hVar, h.b(hVar), hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(string2, gnzVar.e);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("installmentUpdateInfo", (Object) hashMap2);
                bmzVar.a(h.KEY_INSTALLMENT_TRANS_IN_EVENT, jSONObject5);
                if (jSONObject4 != null) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("cartId", string2);
                    hashMap3.putAll(jSONObject4);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("skuExtParams", (Object) hashMap3);
                    bmzVar.a("skuExtParams", jSONObject6);
                }
                bmzVar.a("_isSupportChangeIDMEvent", true);
                h.e(h.this).a(h.c(h.this), h.d(h.this), true, null, null);
                bex.a(h.f(h.this), "Page_ShoppingCart_Item_SKU_Select", beb.a(h.g(h.this), h.h(h.this), new String[0]));
            }

            @Override // tb.gny
            public void a(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str2});
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = h.i(h.this).getString(R.string.cart_msg_cannot_modify);
                }
                com.alibaba.android.icart.core.widget.d.a(h.j(h.this), str2);
                bpp.a().commitFeedback("iCart", str2, UmTypeKey.TOAST, "skuEditError", JSONObject.toJSONString(c));
                bga.a.b("iCart", "CALL_SKU_WITH_MSOA_FAILURE", "skuEditError", str2);
            }
        });
    }
}
