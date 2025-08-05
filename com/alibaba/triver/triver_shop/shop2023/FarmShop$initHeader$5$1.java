package com.alibaba.triver.triver_shop.shop2023;

import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public final class FarmShop$initHeader$5$1 extends Lambda implements ruw<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a, ViewGroup.LayoutParams, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023HeaderTagListTemplate $shop2023HeaderTagListTemplate;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FarmShop$initHeader$5$1(d dVar, Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate) {
        super(2);
        this.this$0 = dVar;
        this.$shop2023HeaderTagListTemplate = shop2023HeaderTagListTemplate;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        invoke2(aVar, layoutParams);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a templateComponent, ViewGroup.LayoutParams templateViewLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02de195", new Object[]{this, templateComponent, templateViewLayoutParams});
            return;
        }
        q.d(templateComponent, "templateComponent");
        q.d(templateViewLayoutParams, "templateViewLayoutParams");
        d dVar = this.this$0;
        if (d.$ipChange) {
            return;
        }
        this.$shop2023HeaderTagListTemplate.p();
    }
}
