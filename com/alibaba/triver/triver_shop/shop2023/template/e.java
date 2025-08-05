package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class e extends com.alibaba.triver.triver_shop.shop2023.template.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-1243138840);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -511102794) {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ShopComponentModel shopComponentModel) {
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
        if (!l().canRenderDXTemplate()) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l().getDXJSONConfig(), new d.c(shopData).a(l().getData()), false, 4, null);
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (!i()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.h.a((DXRootView) e(), jSONObject);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1572331984);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        @JvmStatic
        public final e a(com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine) {
            ShopComponentModel shopComponentModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("bd2eff91", new Object[]{this, shopData, shopDXEngine});
            }
            q.d(shopData, "shopData");
            q.d(shopDXEngine, "shopDXEngine");
            Map<String, ShopComponentModel> g = shopData.bc().g();
            if (g == null || (shopComponentModel = g.get("tb_shop_native_header_follow_button")) == null) {
                return null;
            }
            e eVar = new e(shopComponentModel);
            Context am = shopData.am();
            q.a(am);
            eVar.a(am, shopData, shopDXEngine, null);
            return eVar;
        }
    }
}
