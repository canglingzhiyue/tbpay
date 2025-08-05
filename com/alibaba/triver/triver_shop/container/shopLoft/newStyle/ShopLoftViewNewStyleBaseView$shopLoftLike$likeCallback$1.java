package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1 extends Lambda implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $ifLike;
    public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView, boolean z) {
        super(1);
        this.this$0 = shopLoftViewNewStyleBaseView;
        this.$ifLike = z;
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean $ifLike;
        public final /* synthetic */ String $likeCountStr;
        public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView, boolean z, String str) {
            super(0);
            this.this$0 = shopLoftViewNewStyleBaseView;
            this.$ifLike = z;
            this.$likeCountStr = str;
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
            DinamicXEngine a2 = this.this$0.i().a();
            View n = this.this$0.n();
            if (n == null) {
                return;
            }
            h.a(a2, n, com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("ifLike", String.valueOf(!this.$ifLike)), j.a("likeCountStr", this.$likeCountStr)));
        }
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String likeCountStr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, likeCountStr});
            return;
        }
        q.d(likeCountStr, "likeCountStr");
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass1(this.this$0, this.$ifLike, likeCountStr));
    }
}
