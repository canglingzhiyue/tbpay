package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopView$setBottomView$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ View $view;
    public final /* synthetic */ ShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView$setBottomView$1(ShopView shopView, View view) {
        super(0);
        this.this$0 = shopView;
        this.$view = view;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.this$0.updateBottomGuidLineEnd(this.$view.getHeight());
        }
    }
}
