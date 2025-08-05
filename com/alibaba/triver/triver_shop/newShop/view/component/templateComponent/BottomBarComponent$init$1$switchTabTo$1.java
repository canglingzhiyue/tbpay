package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import com.alibaba.triver.triver_shop.newShop.ext.j;
import com.alibaba.triver.triver_shop.newShop.ext.k;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class BottomBarComponent$init$1$switchTabTo$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopData;
    public final /* synthetic */ int $tab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomBarComponent$init$1$switchTabTo$1(com.alibaba.triver.triver_shop.newShop.data.d dVar, int i) {
        super(0);
        this.$shopData = dVar;
        this.$tab = i;
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
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.$shopData;
        j.a(dVar, dVar.o());
        k.a(this.$shopData, this.$tab);
    }
}
