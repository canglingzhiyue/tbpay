package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class WVShopApiBridge$currentPageStopScroll$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ WVShopApiBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$currentPageStopScroll$1(WVCallBackContext wVCallBackContext, WVShopApiBridge wVShopApiBridge) {
        super(0);
        this.$callback = wVCallBackContext;
        this.this$0 = wVShopApiBridge;
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
        d shopData;
        d.C0135d G;
        ruk<t> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.$callback == null) {
        } else {
            WVShopApiBridge wVShopApiBridge = this.this$0;
            ShopWrapWebView shopWrapWebView = WVShopApiBridge.$ipChange;
            if (shopWrapWebView == null || (shopData = shopWrapWebView.getShopData()) == null || (G = shopData.G()) == null || (f = G.f()) == null) {
                return;
            }
            f.mo2427invoke();
        }
    }
}
