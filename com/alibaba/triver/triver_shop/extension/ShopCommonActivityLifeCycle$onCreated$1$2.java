package com.alibaba.triver.triver_shop.extension;

import com.alibaba.triver.triver_shop.extension.accs.a;
import com.alibaba.triver.triver_shop.extension.accs.b;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.event.ucp.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopCommonActivityLifeCycle$onCreated$1$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onCreated$1$2(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
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
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle = this.this$0;
        if (ShopCommonActivityLifeCycle.$ipChange.B()) {
            ShopCommonActivityLifeCycle shopCommonActivityLifeCycle2 = this.this$0;
            UCPManager.a(ShopCommonActivityLifeCycle.$ipChange.A(), a.GROUP_NAME);
        }
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle3 = this.this$0;
        if (ShopCommonActivityLifeCycle.$ipChange) {
            ShopCommonActivityLifeCycle shopCommonActivityLifeCycle4 = this.this$0;
            d dVar = ShopCommonActivityLifeCycle.$ipChange;
            ShopCommonActivityLifeCycle shopCommonActivityLifeCycle5 = this.this$0;
            dVar.a((a.InterfaceC0131a) new b(ShopCommonActivityLifeCycle.$ipChange));
            com.alibaba.triver.triver_shop.extension.accs.a aVar = com.alibaba.triver.triver_shop.extension.accs.a.INSTANCE;
            ShopCommonActivityLifeCycle shopCommonActivityLifeCycle6 = this.this$0;
            a.InterfaceC0131a C = ShopCommonActivityLifeCycle.$ipChange.C();
            if (C == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.extension.accs.ShopAccsDataListener");
            }
            aVar.a((b) C);
        }
        ShopCommonActivityLifeCycle.a(this.this$0, ShopCommonActivityLifeCycle.$ipChange);
    }
}
