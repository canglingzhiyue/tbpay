package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rva;

/* loaded from: classes3.dex */
public final class WVShopApiBridge$showAllItemCountIcon$1$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ float $iconBottomPadding;
    public final /* synthetic */ float $iconRightPadding;
    public final /* synthetic */ String $visible;
    public final /* synthetic */ WVShopApiBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$showAllItemCountIcon$1$1$1(WVShopApiBridge wVShopApiBridge, WVCallBackContext wVCallBackContext, String str, float f, float f2) {
        super(0);
        this.this$0 = wVShopApiBridge;
        this.$callback = wVCallBackContext;
        this.$visible = str;
        this.$iconBottomPadding = f;
        this.$iconRightPadding = f2;
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
        d.C0135d G;
        rva<Boolean, Integer, Integer, t> k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        WVShopApiBridge wVShopApiBridge = this.this$0;
        WVCallBackContext wVCallBackContext = this.$callback;
        d dVar = WVShopApiBridge.$ipChange;
        if (dVar != null && (G = dVar.G()) != null && (k = G.k()) != null) {
            k.invoke(Boolean.valueOf(q.a((Object) this.$visible, (Object) "true")), Integer.valueOf(o.c(Float.valueOf(this.$iconBottomPadding))), Integer.valueOf(o.c(Float.valueOf(this.$iconRightPadding))));
        }
        this.$callback.success();
    }
}
