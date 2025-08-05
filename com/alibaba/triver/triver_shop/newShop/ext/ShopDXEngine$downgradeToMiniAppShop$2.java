package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopDXEngine$downgradeToMiniAppShop$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruk<t> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDXEngine$downgradeToMiniAppShop$2(ruk<t> rukVar) {
        super(0);
        this.$block = rukVar;
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
        } else {
            this.$block.mo2427invoke();
        }
    }
}
