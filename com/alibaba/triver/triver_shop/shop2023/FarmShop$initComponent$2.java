package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class FarmShop$initComponent$2 extends Lambda implements ruk<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopData;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FarmShop$initComponent$2(d dVar, com.alibaba.triver.triver_shop.newShop.data.d dVar2) {
        super(0);
        this.this$0 = dVar;
        this.$shopData = dVar2;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        d dVar = this.this$0;
        return d.$ipChange ? "live" : this.$shopData.d();
    }
}
