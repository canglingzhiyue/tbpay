package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class WVShopApiBridge$setCrossStoreHeaderStatus$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ d $shopData;
    public final /* synthetic */ boolean $showCrossStoreHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$setCrossStoreHeaderStatus$1(d dVar, boolean z, WVCallBackContext wVCallBackContext) {
        super(0);
        this.$shopData = dVar;
        this.$showCrossStoreHeader = z;
        this.$callback = wVCallBackContext;
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
        Boolean mo2421invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        rul<Boolean, Boolean> h = this.$shopData.G().h();
        boolean booleanValue = (h == null || (mo2421invoke = h.mo2421invoke(Boolean.valueOf(this.$showCrossStoreHeader))) == null) ? false : mo2421invoke.booleanValue();
        WVCallBackContext wVCallBackContext = this.$callback;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("success", Boolean.valueOf(booleanValue))).toString());
    }
}
