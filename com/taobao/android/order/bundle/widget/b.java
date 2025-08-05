package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f14594a;

    static {
        kge.a(2134666064);
    }

    public b(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue() : ("end".equals(this.f14594a) || "right".equals(this.f14594a)) ? i4 - i2 : ("start".equals(this.f14594a) || "left".equals(this.f14594a)) ? i3 - i : (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
