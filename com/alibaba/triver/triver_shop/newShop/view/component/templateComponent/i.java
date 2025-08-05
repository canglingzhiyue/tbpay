package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class i extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String f;

    static {
        kge.a(-1056183855);
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
            l = com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("name", "tb_shop_header_brand_honor_2024"), j.a("version", 1721699937709L), j.a("url", "https://dinamicx.alibabausercontent.com/pre/tb_shop_header_brand_honor_2024/1721699937709/tb_shop_header_brand_honor_2024.zip"));
        }
        JSONObject jSONObject2 = l;
        if (jSONObject2 == null) {
            ceg.Companion.b(q.a("can not find shop template : ", (Object) this.f));
            shopDXEngine.d();
            return;
        }
        i iVar = this;
        if (jSONObject == null) {
            jSONObject = shopData.N();
        }
        a.a(iVar, jSONObject2, jSONObject, false, 4, null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        c().c().a().add(this.f);
        c().c().a((DXRootView) view, new c(b(), this));
        super.b(view);
    }
}
