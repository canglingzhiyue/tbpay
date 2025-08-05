package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class H5ShopContentRender$webViewScrollUpDetector$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5ShopContentRender$webViewScrollUpDetector$1(g gVar) {
        super(0);
        this.this$0 = gVar;
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
        d.C0135d G;
        ruk<t> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = g.c(this.this$0).g();
        if (g == null || (G = g.G()) == null || (e = G.e()) == null) {
            return;
        }
        e.mo2427invoke();
    }
}
