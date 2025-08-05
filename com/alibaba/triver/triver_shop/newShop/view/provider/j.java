package com.alibaba.triver.triver_shop.newShop.view.provider;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.dqp;
import tb.kge;

/* loaded from: classes3.dex */
public final class j extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1835694464);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        super(shopDataParser);
        q.d(shopDataParser, "shopDataParser");
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.provider.c
    public a b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3bf6115f", new Object[]{this, new Integer(i)});
        }
        com.alibaba.triver.triver_shop.newShop.data.g gVar = c().get(i);
        q.b(gVar, "tabBarItemDataModelList[position]");
        return new dqp(gVar);
    }
}
