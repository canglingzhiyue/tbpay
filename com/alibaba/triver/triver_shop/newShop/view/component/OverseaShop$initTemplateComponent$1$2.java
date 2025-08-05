package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public /* synthetic */ class OverseaShop$initTemplateComponent$1$2 extends FunctionReferenceImpl implements ruw<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a, ViewGroup.LayoutParams, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OverseaShop$initTemplateComponent$1$2(e eVar) {
        super(2, eVar, e.class, "templateCreateViewCallback", "templateCreateViewCallback(Lcom/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BaseTemplateComponent;Landroid/view/ViewGroup$LayoutParams;)V", 0);
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        invoke2(aVar, layoutParams);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02de195", new Object[]{this, aVar, layoutParams});
        } else {
            e.a((e) this.receiver, aVar, layoutParams);
        }
    }
}
