package com.alibaba.triver.triver_shop.jsapi;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023ImageViewer;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class WVShopApiBridge$contentContainerBrowser$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ String $it;
    public final /* synthetic */ WVShopApiBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$contentContainerBrowser$1$1(WVShopApiBridge wVShopApiBridge, WVCallBackContext wVCallBackContext, String str) {
        super(0);
        this.this$0 = wVShopApiBridge;
        this.$callback = wVCallBackContext;
        this.$it = str;
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
        WVShopApiBridge wVShopApiBridge = this.this$0;
        WVCallBackContext wVCallBackContext = this.$callback;
        d dVar = WVShopApiBridge.$ipChange;
        Context am = dVar == null ? null : dVar.am();
        if (am == null) {
            return;
        }
        Shop2023ImageViewer shop2023ImageViewer = new Shop2023ImageViewer();
        WVShopApiBridge wVShopApiBridge2 = this.this$0;
        WVCallBackContext wVCallBackContext2 = this.$callback;
        shop2023ImageViewer.setShopData(WVShopApiBridge.$ipChange).show(am, this.$it);
        WVCallBackContext wVCallBackContext3 = this.$callback;
        if (wVCallBackContext3 == null) {
            return;
        }
        wVCallBackContext3.success(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("success", true)).toJSONString());
    }
}
