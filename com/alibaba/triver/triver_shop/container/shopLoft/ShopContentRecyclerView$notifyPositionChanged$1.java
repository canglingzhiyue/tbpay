package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopContentRecyclerView$notifyPositionChanged$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopContentRecyclerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopContentRecyclerView$notifyPositionChanged$1(ShopContentRecyclerView shopContentRecyclerView) {
        super(0);
        this.this$0 = shopContentRecyclerView;
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
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopContentRecyclerView shopContentRecyclerView = this.this$0;
        try {
            Result.a aVar = Result.Companion;
            ShopContentRecyclerView.b bVar = ShopContentRecyclerView.$ipChange;
            if (bVar == null) {
                tVar = null;
            } else {
                bVar.a();
                tVar = t.INSTANCE;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }
}
