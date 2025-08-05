package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.rul;

/* loaded from: classes3.dex */
public final class AllItemsContentRender$initAllItemsComponent$2 extends Lambda implements rul<Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender$initAllItemsComponent$2(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2421invoke(Boolean bool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9923577", new Object[]{this, bool}) : Boolean.valueOf(invoke(bool.booleanValue()));
    }

    public final boolean invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b985b9", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        a aVar = this.this$0;
        com.alibaba.triver.triver_shop.shop2023.nativeview.e eVar = a.$ipChange;
        if (eVar != null) {
            return eVar.a(z);
        }
        return false;
    }
}
