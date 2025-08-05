package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class g extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean f;
    private final boolean g;

    static {
        kge.a(-119547294);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
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

    public /* synthetic */ g(ShopComponentModel shopComponentModel, boolean z, boolean z2, int i, o oVar) {
        this(shopComponentModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.f;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ShopComponentModel shopComponentModel, boolean z, boolean z2) {
        super(shopComponentModel);
        q.d(shopComponentModel, "shopComponentModel");
        this.f = z;
        this.g = z2;
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
        if (!l().canRenderDXTemplate()) {
            return;
        }
        g gVar = this;
        JSONObject dXJSONConfig = l().getDXJSONConfig();
        JSONObject a2 = shopData.bc().a(l().getData());
        if (o()) {
            a2.getJSONObject("nativeData").put("contentListUrl", (Object) com.alibaba.triver.triver_shop.newShop.ext.h.a(shopData, (String) null, (JSONObject) null));
        }
        if (!p()) {
            a2.getJSONObject("nativeData").put("isDisableShopCard", (Object) Boolean.valueOf(!p()));
        }
        t tVar = t.INSTANCE;
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(gVar, dXJSONConfig, a2, false, 4, null);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        String name = l().getName();
        if (name != null) {
            c().c().a().add(name);
        }
        c().c().a((DXRootView) view, new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c(b(), this));
        super.b(view);
    }
}
