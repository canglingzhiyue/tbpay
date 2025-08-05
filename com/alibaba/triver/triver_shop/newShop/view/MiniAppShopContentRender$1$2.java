package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class MiniAppShopContentRender$1$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruk<t> $afterInitAction;
    public final /* synthetic */ MiniAppShopContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender$1$2(MiniAppShopContentRender miniAppShopContentRender, ruk<t> rukVar) {
        super(0);
        this.this$0 = miniAppShopContentRender;
        this.$afterInitAction = rukVar;
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
        MiniAppShopContentRender miniAppShopContentRender = this.this$0;
        com.alibaba.triver.triver_shop.newShop.ext.l.a(MiniAppShopContentRender.$ipChange);
        com.alibaba.triver.triver_shop.newShop.ext.b.b(this.$afterInitAction);
    }
}
