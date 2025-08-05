package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.alibaba.triver.triver_shop.container.shopLoft.j;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopLoftNewVideoViewWithDW$getWebView$5 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewVideoViewWithDW$getWebView$5(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(0);
        this.this$0 = shopLoftNewVideoViewWithDW;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW$getWebView$5$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
            super(0);
            this.this$0 = shopLoftNewVideoViewWithDW;
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
            ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW = this.this$0;
            j jVar = ShopLoftNewVideoViewWithDW.$ipChange;
            if (jVar == null) {
                q.b("shopLoftFeedsController");
                throw null;
            }
            ruk<t> b = jVar.b();
            if (b == null) {
                return;
            }
            b.mo2427invoke();
        }
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass1(this.this$0));
        }
    }
}
