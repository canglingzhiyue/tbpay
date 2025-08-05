package com.alibaba.triver.triver_shop.extension;

import android.content.Context;
import com.alibaba.triver.triver_shop.extension.accs.ShopAccsUpStreamData;
import com.alibaba.triver.triver_shop.extension.accs.a;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopCommonActivityLifeCycle$onResume$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onResume$1(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
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
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle = this.this$0;
        if (!ShopCommonActivityLifeCycle.$ipChange) {
            return;
        }
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle2 = this.this$0;
        if (!ShopCommonActivityLifeCycle.$ipChange) {
            return;
        }
        a aVar = a.INSTANCE;
        ShopAccsUpStreamData.ChannelCode channelCode = ShopAccsUpStreamData.ChannelCode.onShopEnter;
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle3 = this.this$0;
        Context am = ShopCommonActivityLifeCycle.$ipChange.am();
        String str = "";
        if (am == null || (b = l.b(am)) == null) {
            b = str;
        }
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle4 = this.this$0;
        String U = ShopCommonActivityLifeCycle.$ipChange.U();
        if (U == null) {
            U = str;
        }
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle5 = this.this$0;
        String T = ShopCommonActivityLifeCycle.$ipChange.T();
        if (T != null) {
            str = T;
        }
        aVar.a(new ShopAccsUpStreamData(channelCode, b, U, str));
    }
}
