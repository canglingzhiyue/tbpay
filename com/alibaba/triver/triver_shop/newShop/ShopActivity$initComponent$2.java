package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rvb;

/* loaded from: classes3.dex */
public /* synthetic */ class ShopActivity$initComponent$2 extends FunctionReferenceImpl implements rvb<Integer, Integer, Integer, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopActivity$initComponent$2(ShopActivity shopActivity) {
        super(4, shopActivity, ShopActivity.class, "onPageChanged", "onPageChanged(IIII)V", 0);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rvb
    public /* synthetic */ t invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c6e757a3", new Object[]{this, num, num2, num3, num4});
        }
        invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442a5e3f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ShopActivity.a((ShopActivity) this.receiver, i, i2, i3, i4);
        }
    }
}
