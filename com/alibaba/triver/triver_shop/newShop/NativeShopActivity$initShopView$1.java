package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public /* synthetic */ class NativeShopActivity$initShopView$1 extends FunctionReferenceImpl implements ruw<Boolean, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NativeShopActivity$initShopView$1(NativeShopActivity nativeShopActivity) {
        super(2, nativeShopActivity, NativeShopActivity.class, "headCollapsedCallback", "headCollapsedCallback(ZI)V", 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Boolean bool, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, bool, num});
        }
        invoke(bool.booleanValue(), num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a077a3ee", new Object[]{this, new Boolean(z), new Integer(i)});
        } else {
            NativeShopActivity.a((NativeShopActivity) this.receiver, z, i);
        }
    }
}
