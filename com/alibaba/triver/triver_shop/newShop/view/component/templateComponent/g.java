package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class g extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String f = "tb_shop_header_loft_content_2022";

    static {
        kge.a(1217327608);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == -511102794) {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18930b6", new Object[]{this, context, shopData, shopDXEngine, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        super.a(context, shopData, shopDXEngine, jSONObject);
        g gVar = this;
        shopDXEngine.c().a("", new c(context, gVar));
        JSONObject jSONObject3 = null;
        if (shopData.bw() && shopData.ae()) {
            JSONObject ax = shopData.ax();
            if (ax != null && (jSONObject2 = ax.getJSONObject("liveWidgetVO")) != null) {
                jSONObject2.put("url", (Object) jSONObject2.getString("targetUrl"));
                jSONObject3 = jSONObject2;
            }
        } else {
            jSONObject3 = shopData.l(this.f);
        }
        JSONObject a2 = jSONObject3 == null ? com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("url", "https://dinamicx.alibabausercontent.com/pub/tb_shop_header_loft_content_2022/1663556116218/tb_shop_header_loft_content_2022.zip"), j.a("version", "2"), j.a("name", this.f)) : jSONObject3;
        JSONObject a3 = com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("headerData", shopData.V()), j.a("loftInfo", shopData.af().getJSONObject("loftInfo")), j.a("shopInfo", shopData.W()), j.a(com.taobao.android.detail.industry.scene.trwidget.b.DATA_FIELD_KEY, a2.getJSONObject("data")));
        if (shopData.bw()) {
            a3.put("isDisableShopCard", (Object) true);
        }
        t tVar = t.INSTANCE;
        a.a(gVar, a2, a3, false, 4, null);
    }
}
