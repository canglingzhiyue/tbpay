package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopUTExposeEventKt$shopExposeBottomAllSubTab$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $bottomIndex;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopDataParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopUTExposeEventKt$shopExposeBottomAllSubTab$1(com.alibaba.triver.triver_shop.newShop.data.d dVar, int i) {
        super(0);
        this.$shopDataParser = dVar;
        this.$bottomIndex = i;
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
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        JSONArray k = this.$shopDataParser.k(this.$bottomIndex);
        if (k == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.$shopDataParser;
        int i2 = this.$bottomIndex;
        Iterator<Object> it = k.iterator();
        while (it.hasNext()) {
            it.next();
            int i3 = i + 1;
            if (i < 0) {
                kotlin.collections.p.b();
            }
            k.a(dVar, i2, i);
            i = i3;
        }
    }
}
