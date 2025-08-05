package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class f extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-206101754);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue() : (i3 + ((i4 - i3) / 4)) - i;
    }
}
