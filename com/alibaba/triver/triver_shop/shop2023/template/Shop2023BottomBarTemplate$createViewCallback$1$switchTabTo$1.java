package com.alibaba.triver.triver_shop.shop2023.template;

import com.alibaba.triver.triver_shop.shop2023.template.b;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $tab;
    public final /* synthetic */ b.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1(b.a aVar, int i) {
        super(0);
        this.this$0 = aVar;
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
        b.a aVar = this.this$0;
        com.alibaba.triver.triver_shop.newShop.ext.k.a(b.a.$ipChange, this.$tab);
    }
}
