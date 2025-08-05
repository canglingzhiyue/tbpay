package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Shop2023HeaderInfoTemplate extends com.alibaba.triver.triver_shop.shop2023.template.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String STYLE_KEY = "currentStyle";
    private final ruk<Boolean> f;
    private final String g;

    /* loaded from: classes3.dex */
    public enum HeaderStyle {
        DEFAULT("default"),
        INDEX_PAGE_FOLDED("indexPageFoldedStyle"),
        OTHER_PAGE("otherPageStyle");
        
        private final String styleName;

        HeaderStyle(String str) {
            this.styleName = str;
        }

        public final String getStyleName() {
            return this.styleName;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Context context) {
            super(context, Shop2023HeaderInfoTemplate.this);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 982009030) {
                super.c(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c, com.alibaba.triver.triver_shop.newShop.data.h.b
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            } else if (!Shop2023HeaderInfoTemplate.this.o().mo2427invoke().booleanValue()) {
            } else {
                super.c(obj);
            }
        }
    }

    static {
        kge.a(-682478099);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate, String str, Object... objArr) {
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

    public final ruk<Boolean> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("7ac146c8", new Object[]{this}) : this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023HeaderInfoTemplate(ShopComponentModel shopComponentModel, ruk<Boolean> canGoBackChecker) {
        super(shopComponentModel);
        q.d(shopComponentModel, "shopComponentModel");
        q.d(canGoBackChecker, "canGoBackChecker");
        this.f = canGoBackChecker;
        this.g = "tb_shop_header_shop_info_2023";
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(119364853);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine, JSONObject jSONObject) {
        String styleName;
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
        JSONObject a2 = new d.c(shopData).a(l().getData());
        JSONObject jSONObject2 = a2.getJSONObject("nativeData");
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "isLivingStatus", (String) Boolean.valueOf(shopData.bq()));
            jSONObject3.put((JSONObject) "hideMenuBtn", (String) true);
            if (shopData.p() == 0 && shopData.bc().b()) {
                jSONObject3.put((JSONObject) "forceRenderStyle", "dark");
            }
            if (shopData.bc().b()) {
                styleName = HeaderStyle.INDEX_PAGE_FOLDED.getStyleName();
            } else {
                styleName = HeaderStyle.DEFAULT.getStyleName();
            }
            jSONObject3.put((JSONObject) "currentStyle", styleName);
        }
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l().getDXJSONConfig(), a2, false, 4, null);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("isLivePage", Boolean.valueOf(z))));
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("isLivingStatus", Boolean.valueOf(z))));
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("clearScreenStatus", Boolean.valueOf(z))));
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (z) {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("forceRenderStyle", "dark")));
        } else {
            a("forceRenderStyle");
        }
    }

    public final void a(HeaderStyle headerStyle) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a2036c", new Object[]{this, headerStyle});
            return;
        }
        q.d(headerStyle, "headerStyle");
        if (!h() || (jSONObject = com.alibaba.triver.triver_shop.newShop.ext.h.a(e()).getJSONObject("nativeData")) == null) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
        jSONObject2.put((JSONObject) "currentStyle", headerStyle.getStyleName());
        a("nativeData", jSONObject2);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        c().c().a((DXRootView) view, new b(b()));
        super.b(view);
    }

    public final void a(boolean z, JSONObject jSONObject) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            View e = e();
            com.alibaba.triver.triver_shop.newShop.ext.h.a(e instanceof DXRootView ? (DXRootView) e : null, jSONObject);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }
}
