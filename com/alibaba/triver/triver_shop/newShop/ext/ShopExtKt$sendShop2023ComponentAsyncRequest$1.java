package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopExtKt$sendShop2023ComponentAsyncRequest$1 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruk<t> $failed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendShop2023ComponentAsyncRequest$1(ruk<t> rukVar) {
        super(2);
        this.$failed = rukVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("77c951db", new Object[]{this, num, str}) : invoke(num.intValue(), str);
    }

    public final t invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("adb173f1", new Object[]{this, new Integer(i), str});
        }
        ruk<t> rukVar = this.$failed;
        if (rukVar == null) {
            return null;
        }
        rukVar.mo2427invoke();
        return t.INSTANCE;
    }
}
