package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.ruw;

/* loaded from: classes3.dex */
public final class CarShopView$onContainerSwipeDown$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CarShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView$onContainerSwipeDown$1(CarShopView carShopView) {
        super(0);
        this.this$0 = carShopView;
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
        ruw<Boolean, Integer, t> headCollapsedCallback = this.this$0.getHeadCollapsedCallback();
        if (headCollapsedCallback != null) {
            headCollapsedCallback.mo2423invoke(true, 0);
        }
        this.this$0.setLastAnimationTime(System.currentTimeMillis());
    }
}
