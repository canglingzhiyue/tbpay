package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopHeaderComponent$createViewCallback$followCallback$1$followResult$1 extends Lambda implements rul<Map<String, String>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopHeaderComponent$createViewCallback$followCallback$1$followResult$1(f fVar) {
        super(1);
        this.this$0 = fVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Map<String, String> map) {
        invoke2(map);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.h.a(this.this$0.b(), map, this.this$0.a());
        }
    }
}
