package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.b;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopActivity$onResume$4 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.BooleanRef $needProcessUTEventByComponentSelf;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$onResume$4(ShopActivity shopActivity, Ref.BooleanRef booleanRef) {
        super(0);
        this.this$0 = shopActivity;
        this.$needProcessUTEventByComponentSelf = booleanRef;
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
        if (ShopActivity.$ipChange == null || this.$needProcessUTEventByComponentSelf.element) {
            return;
        }
        ShopActivity shopActivity2 = this.this$0;
        b bVar = ShopActivity.$ipChange;
        if (bVar == null) {
            q.b("shopBroadCastDelegate");
            throw null;
        }
        ShopActivity shopActivity3 = this.this$0;
        d dVar = ShopActivity.$ipChange;
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        int o = dVar.o();
        ShopActivity shopActivity4 = this.this$0;
        d dVar2 = ShopActivity.$ipChange;
        if (dVar2 != null) {
            bVar.a(o, dVar2.n());
        } else {
            q.b("shopDataParser");
            throw null;
        }
    }
}
