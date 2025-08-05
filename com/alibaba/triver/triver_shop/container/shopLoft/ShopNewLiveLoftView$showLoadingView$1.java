package com.alibaba.triver.triver_shop.container.shopLoft;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopNewLiveLoftView$showLoadingView$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopNewLiveLoftView$showLoadingView$1(h hVar) {
        super(0);
        this.this$0 = hVar;
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
        View b = h.b(this.this$0);
        if ((b == null ? null : b.getParent()) == null) {
            return;
        }
        View b2 = h.b(this.this$0);
        if (b2 != null) {
            o.j(b2);
        }
        h.d(this.this$0);
    }
}
