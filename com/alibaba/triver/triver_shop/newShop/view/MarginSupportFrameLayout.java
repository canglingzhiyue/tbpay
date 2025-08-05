package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class MarginSupportFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(842446015);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.q.d(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.q.d(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.q.d(context, "context");
    }

    public final void setMarginTop(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b9d0b4", new Object[]{this, new Float(f)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(this, (int) f);
        }
    }

    public final void setMarginBottom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41af79fe", new Object[]{this, new Float(f)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.d(this, (int) f);
        }
    }
}
