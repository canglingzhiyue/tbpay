package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftNewDetailView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.cen;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopLoftNewDetailView$rootView$2 extends Lambda implements ruk<ShopLoftNewDetailView.HorizontalSwipeLayoutV2> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewDetailView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewDetailView$rootView$2(ShopLoftNewDetailView shopLoftNewDetailView) {
        super(0);
        this.this$0 = shopLoftNewDetailView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final ShopLoftNewDetailView.HorizontalSwipeLayoutV2 mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftNewDetailView.HorizontalSwipeLayoutV2) ipChange.ipc$dispatch("2750fb1b", new Object[]{this});
        }
        ShopLoftNewDetailView shopLoftNewDetailView = this.this$0;
        Context context = ShopLoftNewDetailView.$ipChange;
        if (context != null) {
            ShopLoftNewDetailView.HorizontalSwipeLayoutV2 horizontalSwipeLayoutV2 = new ShopLoftNewDetailView.HorizontalSwipeLayoutV2(shopLoftNewDetailView, context);
            horizontalSwipeLayoutV2.setSwipeThreshold(cen.Companion.J());
            return horizontalSwipeLayoutV2;
        }
        q.b("context");
        throw null;
    }
}
