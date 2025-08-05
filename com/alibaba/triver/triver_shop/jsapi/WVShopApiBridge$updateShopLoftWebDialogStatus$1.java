package com.alibaba.triver.triver_shop.jsapi;

import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class WVShopApiBridge$updateShopLoftWebDialogStatus$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isDialogOpen;
    public final /* synthetic */ ShopWrapWebView $shopWrapWebView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$updateShopLoftWebDialogStatus$1(ShopWrapWebView shopWrapWebView, boolean z) {
        super(0);
        this.$shopWrapWebView = shopWrapWebView;
        this.$isDialogOpen = z;
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
        this.$shopWrapWebView.getShopLoftWebViewBizAdapter().a(this.$isDialogOpen);
        if (this.$isDialogOpen) {
            b.c e = this.$shopWrapWebView.getShopLoftWebViewBizAdapter().e();
            if (e == null) {
                return;
            }
            e.a(b.c.EVENT_ON_SCROLL_DISABLE, null);
            return;
        }
        b.c e2 = this.$shopWrapWebView.getShopLoftWebViewBizAdapter().e();
        if (e2 == null) {
            return;
        }
        e2.a(b.c.EVENT_ON_SCROLL_ENABLE, null);
    }
}
