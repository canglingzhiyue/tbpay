package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class VideoShopView$initBigCardIfNeeded$3 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ VideoShopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoShopView$initBigCardIfNeeded$3(VideoShopView videoShopView) {
        super(0);
        this.this$0 = videoShopView;
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
            return;
        }
        VideoShopView videoShopView = this.this$0;
        View view = VideoShopView.$ipChange;
        if (view == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(view, this.this$0.getVideoShopTabView().getHeight() - com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 18));
    }
}
