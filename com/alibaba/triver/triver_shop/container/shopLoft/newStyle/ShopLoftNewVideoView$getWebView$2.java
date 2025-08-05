package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopLoftNewVideoView$getWebView$2 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftNewVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftNewVideoView$getWebView$2(ShopLoftNewVideoView shopLoftNewVideoView) {
        super(1);
        this.this$0 = shopLoftNewVideoView;
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoView$getWebView$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int $position;
        public final /* synthetic */ ShopLoftNewVideoView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftNewVideoView shopLoftNewVideoView, int i) {
            super(0);
            this.this$0 = shopLoftNewVideoView;
            this.$position = i;
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
            } else if (ShopLoftNewVideoView.c(this.this$0) == null) {
            } else {
                MediaPlayCenter c = ShopLoftNewVideoView.c(this.this$0);
                if (c != null) {
                    c.seekTo(this.$position);
                } else {
                    q.b("mediaPlayCenter");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, num});
        }
        invoke(num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass1(this.this$0, i));
        }
    }
}
