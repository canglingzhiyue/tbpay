package com.alibaba.triver.triver_shop.jsapi;

import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class WVShopApiBridge$switchTabTo$1$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $direction;
    public final /* synthetic */ d $shopData;
    public final /* synthetic */ String $tabName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$switchTabTo$1$1$1(String str, d dVar, String str2) {
        super(0);
        this.$direction = str;
        this.$shopData = dVar;
        this.$tabName = str2;
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
        a z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.$direction != null) {
            rul<String, t> n = this.$shopData.G().n();
            if (n == null) {
                return;
            }
            String direction = this.$direction;
            q.b(direction, "direction");
            n.mo2421invoke(direction);
        } else if (this.$tabName == null || (z = this.$shopData.z()) == null) {
        } else {
            z.a(this.$tabName, (String) null);
        }
    }
}
