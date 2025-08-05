package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ruk;

/* loaded from: classes3.dex */
public /* synthetic */ class NativeShopActivity$initShopView$3 extends FunctionReferenceImpl implements ruk<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NativeShopActivity$initShopView$3(NativeShopActivity nativeShopActivity) {
        super(0, nativeShopActivity, NativeShopActivity.class, "canSwipeDown", "canSwipeDown()Z", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Boolean.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, boolean] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        NativeShopActivity nativeShopActivity = (NativeShopActivity) this.receiver;
        return NativeShopActivity.$ipChange;
    }
}
