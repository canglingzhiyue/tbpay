package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class h extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String f = "tb_video_shop_content_info_2022";

    static {
        kge.a(-1887215721);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
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
            l = com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("url", "https://dinamicx.alibabausercontent.com/pub/tb_video_shop_content_info_2022/1661764815100/tb_video_shop_content_info_2022.zip"), j.a("version", "4"), j.a("name", this.f));
        }
        JSONObject jSONObject2 = l;
        h hVar = this;
        a.a(hVar, jSONObject2, com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("headerData", shopData.V())), false, 4, null);
        shopDXEngine.c().a(com.alibaba.triver.triver_shop.newShop.data.h.videoShopInfoArea, new c(context, hVar));
    }
}
