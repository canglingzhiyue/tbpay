package com.alibaba.triver.triver_shop.newShop.data;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopDataParser$ShopViewContext$allItemCountIconContainer$2 extends Lambda implements ruk<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDataParser$ShopViewContext$allItemCountIconContainer$2(d dVar) {
        super(0);
        this.this$0 = dVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final FrameLayout mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this});
        }
        d dVar = this.this$0;
        Context context = d.$ipChange;
        q.a(context);
        return new FrameLayout(context);
    }
}
