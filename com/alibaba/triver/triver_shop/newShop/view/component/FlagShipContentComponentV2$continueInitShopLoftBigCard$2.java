package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cek;
import tb.ruw;

/* loaded from: classes3.dex */
public final class FlagShipContentComponentV2$continueInitShopLoftBigCard$2 extends Lambda implements ruw<com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a, ViewGroup.LayoutParams, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$continueInitShopLoftBigCard$2(d dVar) {
        super(2);
        this.this$0 = dVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, ViewGroup.LayoutParams layoutParams) {
        invoke2(aVar, layoutParams);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a templateComponent, ViewGroup.LayoutParams templateViewLayoutParams) {
        EmbedShopLoftComponent e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02de195", new Object[]{this, templateComponent, templateViewLayoutParams});
            return;
        }
        q.d(templateComponent, "templateComponent");
        q.d(templateViewLayoutParams, "templateViewLayoutParams");
        int i = templateViewLayoutParams.height;
        if (this.this$0.s()) {
            d dVar = this.this$0;
            com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = d.$ipChange;
            EmbedShopLoftComponent e2 = cVar == null ? null : cVar.e();
            if (e2 != null) {
                d dVar2 = this.this$0;
                e2.a(i + o.c(Integer.valueOf((d.$ipChange << 1) + 50)));
            }
            d dVar3 = this.this$0;
            com.alibaba.triver.triver_shop.newShop.view.embed.c cVar2 = d.$ipChange;
            if (cVar2 != null && (e = cVar2.e()) != null) {
                e.f();
            }
        } else {
            d dVar4 = this.this$0;
            EmbedShopLoftComponent embedShopLoftComponent = d.$ipChange;
            if (embedShopLoftComponent != null) {
                d dVar5 = this.this$0;
                embedShopLoftComponent.a(i + o.c(Integer.valueOf((d.$ipChange << 1) + 50)));
            }
            d dVar6 = this.this$0;
            EmbedShopLoftComponent embedShopLoftComponent2 = d.$ipChange;
            if (embedShopLoftComponent2 != null) {
                embedShopLoftComponent2.f();
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        d dVar7 = this.this$0;
        layoutParams.bottomMargin = d.$ipChange + cek.Companion.a();
        d dVar8 = this.this$0;
        ViewGroup viewGroup = d.$ipChange;
        if (viewGroup != null) {
            viewGroup.addView(templateComponent.f(), layoutParams);
        } else {
            q.b("bigCardContainer");
            throw null;
        }
    }
}
