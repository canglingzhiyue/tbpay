package com.taobao.android.icart.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class CartLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mChangeMeasureListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-24993919);
    }

    public static /* synthetic */ Object ipc$super(CartLinearLayout cartLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void setChangeMeasureListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd330298", new Object[]{this, aVar});
        } else {
            this.mChangeMeasureListener = aVar;
        }
    }

    public CartLinearLayout(Context context) {
        super(context);
    }

    public CartLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CartLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        a aVar = this.mChangeMeasureListener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
