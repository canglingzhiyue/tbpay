package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ContentShopComponent$initTemplateComponent$4$1 extends Lambda implements ruw<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a, ViewGroup.LayoutParams, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$initTemplateComponent$4$1(b bVar) {
        super(2);
        this.this$0 = bVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        invoke2(aVar, layoutParams);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a noName_0, ViewGroup.LayoutParams noName_1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02de195", new Object[]{this, noName_0, noName_1});
            return;
        }
        q.d(noName_0, "$noName_0");
        q.d(noName_1, "$noName_1");
        if (!this.this$0.r()) {
            return;
        }
        b.l(this.this$0);
    }
}
