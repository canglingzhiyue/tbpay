package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.shop2023.b f4124a;
    private h b;

    static {
        kge.a(1162830621);
    }

    public i(com.alibaba.triver.triver_shop.shop2023.b shop) {
        q.d(shop, "shop");
        this.f4124a = shop;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.data.d shopData, ViewGroup rootLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce9d438", new Object[]{this, shopData, rootLayout});
            return;
        }
        q.d(shopData, "shopData");
        q.d(rootLayout, "rootLayout");
        if (this.f4124a instanceof com.alibaba.triver.triver_shop.shop2023.d) {
            this.b = new h(o.d((Number) 45));
        } else {
            this.b = new h(0, 1, null);
        }
        h hVar = this.b;
        if (hVar == null) {
            return;
        }
        hVar.a(shopData.bn(), rootLayout);
    }

    public final void a(boolean z) {
        View a2;
        View a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            h hVar = this.b;
            if (hVar == null || (a3 = hVar.a()) == null) {
                return;
            }
            o.d(a3);
        } else {
            h hVar2 = this.b;
            if (hVar2 == null || (a2 = hVar2.a()) == null) {
                return;
            }
            o.b(a2);
        }
    }
}
