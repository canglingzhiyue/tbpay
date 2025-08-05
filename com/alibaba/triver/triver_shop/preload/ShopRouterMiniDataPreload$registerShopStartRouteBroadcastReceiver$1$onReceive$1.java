package com.alibaba.triver.triver_shop.preload;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.cen;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1 INSTANCE = new ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1();

    public ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1() {
        super(0);
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
        e eVar = e.INSTANCE;
        e.a(cen.Companion.I());
    }
}
