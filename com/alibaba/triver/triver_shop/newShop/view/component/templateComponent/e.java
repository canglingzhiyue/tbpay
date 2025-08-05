package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.k;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String f = "tb_shop_header_four_tab_2022";

    static {
        kge.a(-564139668);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -511102794) {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18930b6", new Object[]{this, context, shopData, shopDXEngine, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        super.a(context, shopData, shopDXEngine, jSONObject);
        JSONObject l = shopData.l(this.f);
        if (l == null) {
            l = com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("name", "tb_shop_header_four_tab_2022"), j.a("version", 3), j.a("url", "https://dinamicx.alibabausercontent.com/pub/tb_shop_header_four_tab_2022/1660015391189/tb_shop_header_four_tab_2022.zip"));
        }
        JSONObject jSONObject2 = l;
        e eVar = this;
        a.a(eVar, jSONObject2, com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("headerData", shopData.V()), j.a("shopInfo", shopData.W())), false, 4, null);
        shopDXEngine.c().a(com.alibaba.triver.triver_shop.newShop.data.h.fourTabArea, new c(context, eVar));
        if (shopData.p() != 0) {
            return;
        }
        k.j(shopData);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_HAS_BIG_CARD_STYLE, Boolean.valueOf(z));
        }
    }
}
