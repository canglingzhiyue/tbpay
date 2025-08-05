package com.alibaba.triver.triver_shop.preload;

import android.util.Log;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopRouterMiniDataPreload$startShopMiniDataPreload$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $shopId;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopRouterMiniDataPreload$startShopMiniDataPreload$1(String str, String str2) {
        super(0);
        this.$url = str;
        this.$shopId = str2;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ceg.Companion.b(q.a("shop route mini data url : ", (Object) this.$url));
        com.alibaba.triver.triver_shop.newShop.ext.c a2 = com.alibaba.triver.triver_shop.newShop.ext.a.a(this.$url, null, 2, null);
        String str = a2.b() == null ? "" : new String(a2.b(), kotlin.text.d.UTF_8);
        if (a2.a() == 200) {
            if (str.length() > 0) {
                e.INSTANCE.a(new a(this.$shopId, System.currentTimeMillis(), com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("status", 200), j.a("data", str)).toJSONString()));
                ceg.Companion.b("shop route request miniData success");
                Log.e(ShopView.SP_NAMESPACE, "shop route request miniData success");
                e eVar = e.INSTANCE;
                e.b(false);
            }
        }
        ceg.Companion.b(q.a("shop route request miniData failed : ", (Object) str));
        e eVar2 = e.INSTANCE;
        e.b(false);
    }
}
