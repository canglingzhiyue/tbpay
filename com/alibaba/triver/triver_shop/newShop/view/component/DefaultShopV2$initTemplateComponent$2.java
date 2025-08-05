package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public /* synthetic */ class DefaultShopV2$initTemplateComponent$2 extends FunctionReferenceImpl implements ruw<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a, ViewGroup.LayoutParams, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DefaultShopV2$initTemplateComponent$2(c cVar) {
        super(2, cVar, c.class, "templateCreateViewCallback", "templateCreateViewCallback(Lcom/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BaseTemplateComponent;Landroid/view/ViewGroup$LayoutParams;)V", 0);
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        invoke2(aVar, layoutParams);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a p0, ViewGroup.LayoutParams p1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02de195", new Object[]{this, p0, p1});
            return;
        }
        q.d(p0, "p0");
        q.d(p1, "p1");
        c.a((c) this.receiver, p0, p1);
    }
}
