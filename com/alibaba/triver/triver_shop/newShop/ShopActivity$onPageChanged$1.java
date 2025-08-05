package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.event.broadcast.b;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopActivity$onPageChanged$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $newBottomIndex;
    public final /* synthetic */ int $newSubIndex;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$onPageChanged$1(ShopActivity shopActivity, int i, int i2) {
        super(0);
        this.this$0 = shopActivity;
        this.$newBottomIndex = i;
        this.$newSubIndex = i2;
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
        ShopActivity shopActivity = this.this$0;
        b bVar = ShopActivity.$ipChange;
        if (bVar != null) {
            bVar.a(this.$newBottomIndex, this.$newSubIndex);
        } else {
            q.b("shopBroadCastDelegate");
            throw null;
        }
    }
}
