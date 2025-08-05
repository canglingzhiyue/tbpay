package com.alibaba.triver.triver_shop.newShop.view;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Tab3LiveContentRender$rootView$2 extends Lambda implements ruk<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$rootView$2(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final FrameLayout mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this});
        }
        Tab3LiveContentRender tab3LiveContentRender = this.this$0;
        return Tab3LiveContentRender.$ipChange;
    }
}
