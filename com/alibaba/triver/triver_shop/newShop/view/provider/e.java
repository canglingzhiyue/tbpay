package com.alibaba.triver.triver_shop.newShop.view.provider;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1727769462);
    }

    private static final com.alibaba.triver.triver_shop.newShop.view.b b(com.alibaba.triver.triver_shop.newShop.view.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.view.b) ipChange.ipc$dispatch("b5e631f1", new Object[]{hVar});
        }
        if (!(hVar instanceof com.alibaba.triver.triver_shop.newShop.view.b)) {
            return null;
        }
        return (com.alibaba.triver.triver_shop.newShop.view.b) hVar;
    }
}
