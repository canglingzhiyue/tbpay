package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean f;

    static {
        kge.a(-113575730);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862045111) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode != -511102794) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ShopComponentModel shopComponentModel, boolean z) {
        super(shopComponentModel);
        q.d(shopComponentModel, "shopComponentModel");
        this.f = z;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
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
        JSONObject a2 = shopData.bc().a(l().getData());
        JSONObject jSONObject2 = a2.getJSONObject("nativeData");
        if (jSONObject2 != null) {
            jSONObject2.put("showHeaderRelation", (Object) Boolean.valueOf(this.f));
        }
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l().getDXJSONConfig(), a2, false, 4, null);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("headerRelationFail", true)));
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        c().c().a((DXRootView) view, new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c(b(), this));
        super.b(view);
    }
}
