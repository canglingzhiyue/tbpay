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
public final class i extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1669088573);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
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
    public i(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        q.d(shopComponentModel, "shopComponentModel");
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
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l().getDXJSONConfig(), shopData.bc().a(l().getData()), false, 4, null);
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
