package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.k;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopActivity$onResume$5 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$onResume$5(ShopActivity shopActivity) {
        super(0);
        this.this$0 = shopActivity;
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
        if (ShopActivity.$ipChange == null) {
            return;
        }
        ShopActivity shopActivity2 = this.this$0;
        d dVar = ShopActivity.$ipChange;
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        k.a(dVar);
        ShopActivity shopActivity3 = this.this$0;
        d dVar2 = ShopActivity.$ipChange;
        if (dVar2 == null) {
            q.b("shopDataParser");
            throw null;
        } else if (dVar2.t()) {
        } else {
            ShopActivity shopActivity4 = this.this$0;
            d dVar3 = ShopActivity.$ipChange;
            if (dVar3 == null) {
                q.b("shopDataParser");
                throw null;
            }
            k.b(dVar3);
            ShopActivity shopActivity5 = this.this$0;
            d dVar4 = ShopActivity.$ipChange;
            if (dVar4 == null) {
                q.b("shopDataParser");
                throw null;
            }
            k.d(dVar4);
            ShopActivity shopActivity6 = this.this$0;
            d dVar5 = ShopActivity.$ipChange;
            if (dVar5 == null) {
                q.b("shopDataParser");
                throw null;
            }
            k.c(dVar5);
            ShopActivity shopActivity7 = this.this$0;
            d dVar6 = ShopActivity.$ipChange;
            if (dVar6 != null) {
                k.k(dVar6);
            } else {
                q.b("shopDataParser");
                throw null;
            }
        }
    }
}
