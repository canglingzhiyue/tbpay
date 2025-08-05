package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.k;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopActivity$continueActivityOnCreate$5 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$continueActivityOnCreate$5(ShopActivity shopActivity) {
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
        d dVar = ShopActivity.$ipChange;
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        if (!dVar.t()) {
            ShopActivity shopActivity2 = this.this$0;
            d dVar2 = ShopActivity.$ipChange;
            if (dVar2 == null) {
                q.b("shopDataParser");
                throw null;
            }
            k.e(dVar2);
            ShopActivity shopActivity3 = this.this$0;
            d dVar3 = ShopActivity.$ipChange;
            if (dVar3 == null) {
                q.b("shopDataParser");
                throw null;
            }
            k.h(dVar3);
        }
        ShopActivity shopActivity4 = this.this$0;
        d dVar4 = ShopActivity.$ipChange;
        if (dVar4 != null) {
            k.n(dVar4);
        } else {
            q.b("shopDataParser");
            throw null;
        }
    }
}
