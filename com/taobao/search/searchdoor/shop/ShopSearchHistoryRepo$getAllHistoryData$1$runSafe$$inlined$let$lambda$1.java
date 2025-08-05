package com.taobao.search.searchdoor.shop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.shop.a;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes7.dex */
public final class ShopSearchHistoryRepo$getAllHistoryData$1$runSafe$$inlined$let$lambda$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ List $list;
    public final /* synthetic */ a.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSearchHistoryRepo$getAllHistoryData$1$runSafe$$inlined$let$lambda$1(List list, a.b bVar) {
        super(0);
        this.$list = list;
        this.this$0 = bVar;
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
        a aVar = a.this;
        if (!a.$ipChange.isEmpty()) {
            a aVar2 = a.this;
            a.$ipChange.clear();
        }
        a aVar3 = a.this;
        a.$ipChange.addAll(this.$list);
        a.c(a.this);
    }
}
