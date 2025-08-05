package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class DefaultShopV2$shopHeaderComponent$1 extends Lambda implements rul<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopV2$shopHeaderComponent$1(c cVar) {
        super(1);
        this.this$0 = cVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f fVar) {
        invoke2(fVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.f shopHeaderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d44cbe3", new Object[]{this, shopHeaderComponent});
            return;
        }
        q.d(shopHeaderComponent, "shopHeaderComponent");
        if (this.this$0.q()) {
            if (this.this$0.r()) {
                shopHeaderComponent.b(true);
                return;
            } else {
                shopHeaderComponent.c(true);
                return;
            }
        }
        shopHeaderComponent.c(false);
    }
}
