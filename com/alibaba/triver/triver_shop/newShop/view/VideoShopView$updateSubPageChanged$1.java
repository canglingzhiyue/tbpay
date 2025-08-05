package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class VideoShopView$updateSubPageChanged$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isHomePage;
    public final /* synthetic */ VideoShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoShopView$updateSubPageChanged$1(VideoShopView videoShopView, boolean z) {
        super(0);
        this.this$0 = videoShopView;
        this.$isHomePage = z;
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
        if (this.this$0.getBigCardMode()) {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(this.this$0.getVideoShopTabView(), ((com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 1000) - this.this$0.getCommonSecondView().getHeight()) - this.this$0.getFirstHeadContainer().getHeight()) - this.this$0.getStatusBarSize());
        }
        this.this$0.updateContentTopMargin(this.$isHomePage);
    }
}
