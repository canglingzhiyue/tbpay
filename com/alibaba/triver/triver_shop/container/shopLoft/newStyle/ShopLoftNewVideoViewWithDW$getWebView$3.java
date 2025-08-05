package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.bl;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopLoftNewVideoViewWithDW$getWebView$3 extends Lambda implements rul<Float, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewVideoViewWithDW$getWebView$3(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(1);
        this.this$0 = shopLoftNewVideoViewWithDW;
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW$getWebView$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float $rate;
        public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW, float f) {
            super(0);
            this.this$0 = shopLoftNewVideoViewWithDW;
            this.$rate = f;
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
            bl c = ShopLoftNewVideoViewWithDW.c(this.this$0);
            if (c == null) {
                return;
            }
            c.a(this.$rate);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, f});
        }
        invoke(f.floatValue());
        return t.INSTANCE;
    }

    public final void invoke(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b93aa1", new Object[]{this, new Float(f)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass1(this.this$0, f));
        }
    }
}
