package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1 extends Lambda implements rul<View, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView) {
        super(1);
        this.this$0 = shopLoftViewNewStyleBaseView;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(View view) {
        invoke2(view);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        this.this$0.b(it);
        this.this$0.f().addView(it);
        c b = this.this$0.i().b();
        View n = this.this$0.n();
        if (n == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dinamicx.DXRootView");
        }
        b.a((DXRootView) n, this.this$0);
    }
}
