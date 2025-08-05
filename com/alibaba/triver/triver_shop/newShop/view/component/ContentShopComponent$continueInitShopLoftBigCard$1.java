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
public final class ContentShopComponent$continueInitShopLoftBigCard$1 extends Lambda implements ruw<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a, ViewGroup.LayoutParams, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$continueInitShopLoftBigCard$1(b bVar) {
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
    public final void invoke2(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a templateComponent, ViewGroup.LayoutParams templateViewLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02de195", new Object[]{this, templateComponent, templateViewLayoutParams});
            return;
        }
        q.d(templateComponent, "templateComponent");
        q.d(templateViewLayoutParams, "templateViewLayoutParams");
        int i = templateViewLayoutParams.height;
        b bVar = this.this$0;
        int i2 = b.$ipChange.j().height;
        int i3 = i + i2;
        b bVar2 = this.this$0;
        EmbedShopLoftComponent embedShopLoftComponent = b.$ipChange;
        if (embedShopLoftComponent != null) {
            embedShopLoftComponent.a(i3);
        }
        b bVar3 = this.this$0;
        EmbedShopLoftComponent embedShopLoftComponent2 = b.$ipChange;
        if (embedShopLoftComponent2 != null) {
            embedShopLoftComponent2.f();
        }
        b bVar4 = this.this$0;
        EmbedShopLoftComponent embedShopLoftComponent3 = b.$ipChange;
        if (embedShopLoftComponent3 != null) {
            embedShopLoftComponent3.b(i2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = i2;
        b bVar5 = this.this$0;
        ViewGroup viewGroup = b.$ipChange;
        if (viewGroup != null) {
            viewGroup.addView(templateComponent.f(), layoutParams);
        } else {
            q.b("bigCardContainer");
            throw null;
        }
    }
}
