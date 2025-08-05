package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public final class DefaultShopV2$continueInitShopLoftBigCard$1 extends Lambda implements ruw<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a, ViewGroup.LayoutParams, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopV2$continueInitShopLoftBigCard$1(c cVar) {
        super(2);
        this.this$0 = cVar;
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
        int i = templateViewLayoutParams.height;
        c cVar = this.this$0;
        EmbedShopLoftComponent embedShopLoftComponent = c.$ipChange;
        if (embedShopLoftComponent != null) {
            c cVar2 = this.this$0;
            embedShopLoftComponent.a(i + c.$ipChange);
        }
        c cVar3 = this.this$0;
        EmbedShopLoftComponent embedShopLoftComponent2 = c.$ipChange;
        if (embedShopLoftComponent2 != null) {
            embedShopLoftComponent2.f();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        c cVar4 = this.this$0;
        layoutParams.bottomMargin = c.$ipChange;
        c cVar5 = this.this$0;
        ViewGroup viewGroup = c.$ipChange;
        if (viewGroup != null) {
            viewGroup.addView(templateComponent.f(), layoutParams);
        } else {
            q.b("bigCardContainer");
            throw null;
        }
    }
}
