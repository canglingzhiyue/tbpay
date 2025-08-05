package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class BigCardShopView$updateContentTopMargin$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isHomePage;
    public final /* synthetic */ BigCardShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView$updateContentTopMargin$1(boolean z, BigCardShopView bigCardShopView) {
        super(0);
        this.$isHomePage = z;
        this.this$0 = bigCardShopView;
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
        } else if (this.$isHomePage) {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(this.this$0.getContentTopLine(), 0);
        } else {
            BigCardShopView bigCardShopView = this.this$0;
            bigCardShopView.setContentTopMargin(bigCardShopView.getSecondHeadContainer().getHeight() + this.this$0.getStatusBarSize() + this.this$0.getFirstHeadContainer().getHeight());
            if (this.this$0.getHeaderHide()) {
                com.alibaba.triver.triver_shop.newShop.ext.o.c(this.this$0.getContentTopLine(), this.this$0.getStatusBarSize() + this.this$0.getFirstHeadContainer().getHeight());
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.o.c(this.this$0.getContentTopLine(), this.this$0.getContentTopMargin());
            }
        }
    }
}
