package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class H5ShopContentRender$onViewSelectedByViewPager$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.ObjectRef<ShopWrapWebView> $preloadWebView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5ShopContentRender$onViewSelectedByViewPager$2(Ref.ObjectRef<ShopWrapWebView> objectRef) {
        super(0);
        this.$preloadWebView = objectRef;
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
        ShopWrapWebView shopWrapWebView = this.$preloadWebView.element;
        if (shopWrapWebView == null) {
            return;
        }
        shopWrapWebView.destroy();
    }
}
