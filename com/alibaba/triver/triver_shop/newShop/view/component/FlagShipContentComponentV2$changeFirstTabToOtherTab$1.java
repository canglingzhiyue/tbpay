package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class FlagShipContentComponentV2$changeFirstTabToOtherTab$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$changeFirstTabToOtherTab$1(d dVar) {
        super(0);
        this.this$0 = dVar;
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
        EmbedShopLoftComponent e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        d dVar = this.this$0;
        EmbedShopLoftComponent embedShopLoftComponent = d.$ipChange;
        if (embedShopLoftComponent != null) {
            embedShopLoftComponent.j();
        }
        d dVar2 = this.this$0;
        com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = d.$ipChange;
        if (cVar != null && (e = cVar.e()) != null) {
            e.j();
        }
        d dVar3 = this.this$0;
        com.alibaba.triver.triver_shop.newShop.view.embed.c cVar2 = d.$ipChange;
        if (cVar2 != null) {
            cVar2.j();
        }
        d dVar4 = this.this$0;
        ViewGroup viewGroup = d.$ipChange;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.d(viewGroup);
        d dVar5 = this.this$0;
        View view = d.$ipChange;
        if (view != null) {
            o.e(view);
        } else {
            q.b("bigCardTopBlackShadowBg");
            throw null;
        }
    }
}
