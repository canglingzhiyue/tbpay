package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ruk;

/* loaded from: classes3.dex */
public /* synthetic */ class Shop2023BaseComponent$initShopViewContextFunction$1 extends FunctionReferenceImpl implements ruk<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Shop2023BaseComponent$initShopViewContextFunction$1(b bVar) {
        super(0, bVar, b.class, "getRootLayoutHeight", "getRootLayoutHeight()I", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue() : ((b) this.receiver).S();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public /* synthetic */ Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Integer.valueOf(mo2427invoke());
    }
}
