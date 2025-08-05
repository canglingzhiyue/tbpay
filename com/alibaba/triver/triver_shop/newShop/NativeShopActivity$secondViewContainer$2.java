package com.alibaba.triver.triver_shop.newShop;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class NativeShopActivity$secondViewContainer$2 extends Lambda implements ruk<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$secondViewContainer$2(NativeShopActivity nativeShopActivity) {
        super(0);
        this.this$0 = nativeShopActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final FrameLayout mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this}) : new FrameLayout(this.this$0);
    }
}
