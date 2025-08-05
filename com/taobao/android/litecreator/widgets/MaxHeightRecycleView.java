package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class MaxHeightRecycleView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mHeightMax;

    static {
        kge.a(315612977);
    }

    public static /* synthetic */ Object ipc$super(MaxHeightRecycleView maxHeightRecycleView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MaxHeightRecycleView(Context context) {
        super(context);
    }

    public MaxHeightRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setHeightMax(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286aabc1", new Object[]{this, new Integer(i)});
        } else {
            this.mHeightMax = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mHeightMax;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
