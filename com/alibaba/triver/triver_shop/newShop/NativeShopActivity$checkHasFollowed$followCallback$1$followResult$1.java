package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1 extends Lambda implements rul<Map<String, String>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
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
            return;
        }
        NativeShopActivity nativeShopActivity = this.this$0;
        NativeShopActivity nativeShopActivity2 = nativeShopActivity;
        d b = NativeShopActivity.b(nativeShopActivity);
        if (b != null) {
            h.a(nativeShopActivity2, map, b);
        } else {
            q.b("shopDataParser");
            throw null;
        }
    }
}
