package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopLoftComponentView$onLoadNewData$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftComponentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView$onLoadNewData$1(ShopLoftComponentView shopLoftComponentView) {
        super(0);
        this.this$0 = shopLoftComponentView;
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
        f access$getAdapter$p = ShopLoftComponentView.access$getAdapter$p(this.this$0);
        if (access$getAdapter$p == null) {
            return;
        }
        access$getAdapter$p.f();
    }
}
