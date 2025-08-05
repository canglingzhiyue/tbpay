package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rva;

/* loaded from: classes3.dex */
public /* synthetic */ class Shop2023BaseComponent$initShopViewContextFunction$5 extends FunctionReferenceImpl implements rva<Boolean, Integer, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Shop2023BaseComponent$initShopViewContextFunction$5(b bVar) {
        super(3, bVar, b.class, "setAllItemCountIconVisibleFunction", "setAllItemCountIconVisibleFunction(ZII)V", 0);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rva
    public /* synthetic */ t invoke(Boolean bool, Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f7f9d3f", new Object[]{this, bool, num, num2});
        }
        invoke(bool.booleanValue(), num.intValue(), num2.intValue());
        return t.INSTANCE;
    }

    public final void invoke(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7d4cd5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            ((b) this.receiver).b(z, i, i2);
        }
    }
}
